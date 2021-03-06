/**
 * @Project Name :  base
 * @Package Name :  com.orient.system.repository
 * @Description :  TODO
 * @author :  panduanduan
 * @Creation Date:  2018-01-23 5:17 PM
 * @ModificationHistory Who    When    What
 * --------  ---------  --------------------------
 */
package com.orient.system.repository;

import com.orient.persistent.system.OrientSmDeptPO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author :  panduanduan
 * @Description :  部门数据库操作层
 * @Creation Date:  2018-01-23 5:17 PM
 */
@Repository
public interface DeptRepository extends CrudRepository<OrientSmDeptPO, Long> {

}