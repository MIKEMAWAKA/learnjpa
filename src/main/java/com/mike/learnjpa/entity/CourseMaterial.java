package com.mike.learnjpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {

    @Id
    @SequenceGenerator(
        name = "course_material_sequece",
        sequenceName = "course_material_sequece",
        allocationSize = 1

    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "course_material_sequece"
    )
    private Long courseMaterialId;
    private String url;

    @OneToOne(cascade = CascadeType.ALL,
               fetch = FetchType.EAGER
    )
    @JoinColumn(
        name = "course_id",
        referencedColumnName = "courseId"
    )
    private Course course;
    
}
