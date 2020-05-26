/**
 * Copyright 2015-2019 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import sample.mybatis.domain.City;

/**
 * @author Kazuki Shimizu
 */
@Mapper
public interface CityMapper {

    @Select("select id, name, state, country from city where id = <@p name='id'/>")
    City findById(@Param("id") Long id);

    @Select("/mappers/CityMapper-findByState.ftl")
    City findByState(@Param("state") String state);

    City findByName(@Param("name") String name);

}
