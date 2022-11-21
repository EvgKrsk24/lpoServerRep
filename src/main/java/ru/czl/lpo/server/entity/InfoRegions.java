package ru.czl.lpo.server.entity;

import javax.persistence.*;

@Entity
@Table(name = "info_regions", schema = "public", catalog = "LpoGis")
public class InfoRegions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = true, length = -1)
    private String name;
    @Basic
    @Column(name = "name_genitive", nullable = true, length = -1)
    private String nameGenitive;
    @Basic
    @Column(name = "filial_id", nullable = true)
    private Integer filialId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameGenitive() {
        return nameGenitive;
    }

    public void setNameGenitive(String nameGenitive) {
        this.nameGenitive = nameGenitive;
    }

    public Integer getFilialId() {
        return filialId;
    }

    public void setFilialId(Integer filialId) {
        this.filialId = filialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InfoRegions that = (InfoRegions) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nameGenitive != null ? !nameGenitive.equals(that.nameGenitive) : that.nameGenitive != null) return false;
        if (filialId != null ? !filialId.equals(that.filialId) : that.filialId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nameGenitive != null ? nameGenitive.hashCode() : 0);
        result = 31 * result + (filialId != null ? filialId.hashCode() : 0);
        return result;
    }
}
