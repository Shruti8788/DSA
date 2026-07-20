# Write your MySQL query statement below
select max(salary)
 SecondHighestSalary from Employee
  WHERE salary < (SELECT MAX(salary) FROM Employee);