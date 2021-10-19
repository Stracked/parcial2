package atletas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Información del Atleta")
@Entity
@Table(name = "atleta")
public class Atleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_atleta;

	@ApiModelProperty(notes = "Nombre de atleta debe tener al menos 8")
	@Size(min = 8, max = 50, message = "nombres minimo 8 caracteres")
	@Column(name = "nombre", nullable = false, length = 50)
	String nombre;
	
	@ApiModelProperty(notes = "Es el código de atleta olímpico")
	@Column(name = "codigo", nullable = false, unique=true)
	String codigo;

	@ApiModelProperty(notes = "Es la edad del atleta")
	@Column(name = "edad", nullable = false)
	Integer edad;


	public Integer getId() {
		return id_atleta;
	}

	public void setId(Integer id_atleta) {
		this.id_atleta = id_atleta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}	

}