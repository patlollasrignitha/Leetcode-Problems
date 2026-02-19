# Write your MySQL query statement below
select 
round(
    count(distinct player_id) *1.0 /
    (select count(distinct player_id) from Activity)
    ,2
    ) as fraction 
from
(select player_id,event_date,min(event_date) over(partition by player_id)
as first_date from Activity
) t 
where datediff(event_date,first_date)=1;
