alter table pacientes add column ativo boolean not null default true;
update pacientes set ativo = true;