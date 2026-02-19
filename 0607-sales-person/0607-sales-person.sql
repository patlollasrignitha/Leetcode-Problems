# Write your MySQL query statement below
select S.name 
from SalesPerson S
where not exists(
    select 1
    from Orders O
    join Company C
    on O.com_id=C.com_id
    where O.sales_id=S.sales_id and C.name='RED'
);