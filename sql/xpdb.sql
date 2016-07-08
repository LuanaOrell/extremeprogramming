/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     7/7/2016 9:29:16 PM                          */
/*==============================================================*/


drop table if exists STATUS;

drop table if exists TASK;

drop table if exists TASK_STATUS;

drop table if exists USERSTORY;

drop table if exists USERSTORY_STATUS;

drop table if exists USERSTORY_TASK;

/*==============================================================*/
/* Table: STATUS                                                */
/*==============================================================*/
create table STATUS
(
   ID_STATUS            int not null,
   NAME_STATUS          varchar(30) not null,
   primary key (ID_STATUS)
);

/*==============================================================*/
/* Table: TASK                                                  */
/*==============================================================*/
create table TASK
(
   ID_TASK              int not null,
   TITLE_TASK           varchar(50),
   DESCRIPTION_TASK     varchar(500),
   primary key (ID_TASK)
);

/*==============================================================*/
/* Table: TASK_STATUS                                           */
/*==============================================================*/
create table TASK_STATUS
(
   ID_TASK              int not null,
   ID_STATUS            int not null,
   primary key (ID_TASK, ID_STATUS)
);

/*==============================================================*/
/* Table: USERSTORY                                             */
/*==============================================================*/
create table USERSTORY
(
   ID_STORY             int not null,
   TITLE                varchar(100) not null,
   DESCRIPTION          varchar(1000),
   SATISFACTION         varchar(1000),
   PRIORITY             int,
   COMPLEXITY           int,
   primary key (ID_STORY)
);

/*==============================================================*/
/* Table: USERSTORY_STATUS                                      */
/*==============================================================*/
create table USERSTORY_STATUS
(
   ID_STORY             int not null,
   ID_STATUS            int not null,
   primary key (ID_STORY, ID_STATUS)
);

/*==============================================================*/
/* Table: USERSTORY_TASK                                        */
/*==============================================================*/
create table USERSTORY_TASK
(
   ID_STORY             int not null,
   ID_TASK              int not null,
   primary key (ID_STORY, ID_TASK)
);

alter table TASK_STATUS add constraint FK_RELATIONSHIP_3 foreign key (ID_TASK)
      references TASK (ID_TASK) on delete restrict on update restrict;

alter table TASK_STATUS add constraint FK_RELATIONSHIP_4 foreign key (ID_STATUS)
      references STATUS (ID_STATUS) on delete restrict on update restrict;

alter table USERSTORY_STATUS add constraint FK_ES_ASIGNADO foreign key (ID_STATUS)
      references STATUS (ID_STATUS) on delete restrict on update restrict;

alter table USERSTORY_STATUS add constraint FK_SE_LE_ASIGNA foreign key (ID_STORY)
      references USERSTORY (ID_STORY) on delete restrict on update restrict;

alter table USERSTORY_TASK add constraint FK_RELATIONSHIP_5 foreign key (ID_STORY)
      references USERSTORY (ID_STORY) on delete restrict on update restrict;

alter table USERSTORY_TASK add constraint FK_RELATIONSHIP_6 foreign key (ID_TASK)
      references TASK (ID_TASK) on delete restrict on update restrict;

