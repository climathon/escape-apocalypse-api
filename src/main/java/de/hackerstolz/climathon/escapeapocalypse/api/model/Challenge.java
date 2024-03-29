package de.hackerstolz.climathon.escapeapocalypse.api.model;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Challenge {
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty
	private String name;

	@NotEmpty
	@URL
	private String iconUrl;

	@NotEmpty
	private String category;

	private LocalDate startDate;

	private LocalDate endDate;

	@Column(length = 2000)
	private String description;

	private Long durationInSeconds;

	private Integer lifePoints;
	private Long collectionId;

//	@OneToOne
//	@JoinColumn(name = "locationId")
	private Long locationId;

	public Challenge() {
		// jpa
	}

	public Challenge(@NotEmpty String name, @NotEmpty @URL String iconUrl, @NotEmpty String category, LocalDate startDate, LocalDate endDate, String description, Long durationInSeconds, Integer lifePoints, Long collectionId, Long locationId) {
		this.name = name;
		this.iconUrl = iconUrl;
		this.category = category;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.durationInSeconds = durationInSeconds;
		this.lifePoints = lifePoints;
		this.collectionId = collectionId;
		this.locationId = locationId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(Long durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}

	public Integer getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(Integer lifePoints) {
		this.lifePoints = lifePoints;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Long getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(Long collectionId) {
		this.collectionId = collectionId;
	}
}
