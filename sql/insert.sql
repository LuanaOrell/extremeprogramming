insert into userstory(id_story,title,description,priority,complexity) values (1,'Registrar Tarea','Se guarden los siguientes datos:
            ID_Tarea,Nombre,Descripcion,Historia a la que pertenece',300,3);
insert into userstory(id_story,title,description,priority,complexity) values (2,'Crear Proyecto',
	        'Puedo identificar a un equipo que trabajara en un determinado proyecto',500,4);
insert into userstory(id_story,title) values (3,'Crear Iteración');

insert into task(id_task,title_task,description_task) values (1,'Crear Tabla Tarea','Crear la tabla para la base de base');
insert into task(id_task,title_task,description_task) values (2,'Relacionar Tarea','Crear la relacion entre una tarea e Historia');

insert into task(id_task,title_task,description_task) values (3,'Crear Tabla Proyecto','Crear la tabla correspondiente al proyecto');

insert into status(id_status,name_status)values(1,'To Do');
insert into status(id_status,name_status)values(2,'In Progress');
insert into status(id_status,name_status)values(3,'Done');

insert into userstory_task(id_story,id_task)values(1,1);
insert into userstory_task(id_story,id_task)values(1,2);
insert into userstory_task(id_story,id_task)values(2,3);

insert into task_status(id_task,id_status)values(1,3);
insert into task_status(id_task,id_status)values(2,1);
insert into tas_status(id_task,id_status)values(3,3);