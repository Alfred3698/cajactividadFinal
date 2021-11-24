/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

/**
 *
 * @author jose.jimenez07
 */
@Service
public class UserService {

    @PersistenceContext
    private EntityManager em;

}
