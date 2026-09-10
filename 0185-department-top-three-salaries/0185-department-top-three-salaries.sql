# Write your MySQL query statement below
WITH employee_rank_cte AS (
    SELECT
        *,
        DENSE_RANK() OVER (
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) AS rnk
    FROM Employee
)

SELECT
    d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary
FROM employee_rank_cte e
LEFT JOIN Department d
    ON e.departmentId = d.id
WHERE e.rnk <= 3;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna