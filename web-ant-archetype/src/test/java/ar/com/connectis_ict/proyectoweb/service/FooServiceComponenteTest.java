/*
 * Copyright 2013 Connectis ICT Services S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */
package ar.com.connectis_ict.proyectoweb.service;

import ar.com.connectis_ict.proyectoweb.domain.Foo;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test de componente para FooService
 * @author Fernando Martinez
 * @author Franco Morinigo
 * @author Gerardo Matsui
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context-componenteTest.xml"})
public class FooServiceComponenteTest {

    @Autowired
    private FooService fooService;
    
    
    @Test
    public void nombreMetodo_conParametros_retornaResultado() {
        Long idFoo = 1L;
        
        Foo foo = fooService.obtener(idFoo);
        
        Assert.assertNotNull(foo);
        Assert.assertEquals(idFoo, foo.getId());
    }
}
