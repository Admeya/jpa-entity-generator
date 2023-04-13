package com.example.entity3.jpa1;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.*;
import lombok.Data;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 */
@Data
@ToString
@Entity(name = "com.example.entity3.jpa1.BlogArticle")
@Table(name = "article")
public class BlogArticle implements Serializable {

  public Integer getId() { return this.id; }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "`id`", nullable = false)
  private Integer id;
  /**
   * database comment for blog_id
   */
  @Column(name = "`blog_id`", nullable = true)
  private Integer blogId;
  @Column(name = "`name`", nullable = true)
  private String name;
  @Deprecated
  @Column(name = "`tags`", nullable = true)
  private Clob tags;
  @Column(name = "`created_at`", nullable = false)
  private Timestamp createdAt;

  @lombok.Setter(lombok.AccessLevel.NONE)
  @ManyToOne
  @JoinColumn(name = "\"blog_id\"", referencedColumnName = "\"id\"", insertable = false, updatable = false)
  private Blog blog;
}