-- Function: public.get_status_task(integer)

-- DROP FUNCTION public.get_status_task(integer);

CREATE OR REPLACE FUNCTION public.get_status_task(id integer)
  RETURNS character varying AS
$BODY$DECLARE 
_name varchar ;
BEGIN
	select into _name name_status 
	from status 
	where id_status = (select id_status 
			   from task_status 
			   where id_task = id);
return _name;
END$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
ALTER FUNCTION public.get_status_task(integer)
  OWNER TO postgres;