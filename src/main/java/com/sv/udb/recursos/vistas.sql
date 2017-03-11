alter view Datos as 
select p.Id_partido, e.nomb_equi 
from partidos p, equipos e where p.codi_equi = e.codi_equi ;

alter view Datos2 as
select  p.Id_partido, e.nomb_equi,p.marcador,p.marcador2,Date(p.Fecha) as"Fecha",TIME(p.Fecha)as "Hora",p.Lugar 
from partidos p, equipos e where p.codi_equi2 = e.codi_equi;

  select  d.Id_partido, d.nomb_equi,dd.nomb_equi,dd.marcador,dd.marcador2, dd.Fecha,dd.Hora,dd.Lugar
  from Datos d, Datos2 dd where dd.Id_partido = d.Id_partido  group by dd.Id_partido;
 
