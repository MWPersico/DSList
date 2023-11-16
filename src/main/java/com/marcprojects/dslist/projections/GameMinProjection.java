package com.marcprojects.dslist.projections;

public interface GameMinProjection {
	public Long getId();
	public String getTitle();
	public Integer getYear();
	public String getImgUrl();
	public String getShortDescription();
	public Integer getPosition();
}
//Interface 'Projection', consultas SQL na JPA retornam objetos Projection, são como as DTOs, mas apenas declarados (são implementados pela JPA)