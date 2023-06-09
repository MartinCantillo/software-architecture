/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Software2.Package.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "orden")
public class Orden {

    @Id
    private long idO;

    private long horas;

    private String estados;

    private String materiales;

    private String precio;

    @ManyToOne
    @JoinColumn(name = "id_funcionarioFK")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "id_BacheFK")
    private Bache bache;

    public Orden(long idO) {
        this.idO = idO;
    }

}
