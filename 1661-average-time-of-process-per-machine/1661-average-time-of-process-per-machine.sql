 # Write your MySQ
select machine_id,round(avg(end_time-start_time),3) as processing_time
from (
    select machine_id,process_id,
    max(case when activity_type='start' then timestamp END) as start_time,
    max(case when activity_type='end' then timestamp END) as end_time
    from Activity
    group by process_id,machine_id
)as t
group by machine_id;