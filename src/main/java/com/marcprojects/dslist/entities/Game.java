package com.marcprojects.dslist.entities;

import java.util.Objects;
import jakarta.persistence.Column; //Utilizado para configurar coluna da tabela
import jakarta.persistence.Entity; //Identifica classe como entidade do banco relacional
import jakarta.persistence.GeneratedValue; // Estabelece a geração de valores automática para o atributo (auto_increment)
import jakarta.persistence.GenerationType; // Indicador para geração da chave primária
import jakarta.persistence.Id; //Identifica o atributo como chave primária
import jakarta.persistence.Table; //Identifica classe como sendo uma tabela

@Entity //Identificado como entidade (para persistência)
@Table(name = "tb_game") // Identifica a entidade como tabela do banco relacional
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	@Column(name = "game_year") //Altera o nome da coluna no banco de dados
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	@Column(columnDefinition = "TEXT") //Altera a definição da coluna (evita sobrecarga de tipos)
	private String shortDescription;
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
	
	//Constructors
	public Game() {}

	public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	//Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlataforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	//Métodos para compação de objetos do tipo 'Game' apartir do atributo 'id'
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
}
//classe 'Game', entidade do sistema, mapeamento objeto-relacional incluso