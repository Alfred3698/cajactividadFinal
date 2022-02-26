/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.repositories;

import net.codejava.entity.Imc;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jajimenez
 */
public interface ImcRepository extends JpaRepository<Imc, Long> {

}
