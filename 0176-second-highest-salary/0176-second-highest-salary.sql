SELECT (
    SELECT DISTINCT salary
    FROM (
        SELECT 
            salary,
            DENSE_RANK() OVER (ORDER BY salary DESC) as rnk
        FROM Employee
    ) AS RankedSalaries
    WHERE rnk = 2
) AS SecondHighestSalary;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna