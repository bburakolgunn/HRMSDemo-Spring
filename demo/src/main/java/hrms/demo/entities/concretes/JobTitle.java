package hrms.demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_titles")
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private int id;
	
	@Column(name = "job_name")
	@NotBlank(message = "Job Alanı Boş Bırakılamaz")
	private String jobname;
}
