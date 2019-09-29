package club.dafty.gshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
@Accessors(chain = true)//set方法返回的是当前对象，所以支持链式调用，如dept.setDeptno("xx").setDname("xx");
public class Order {
    /**
     * 主键
     */
    private Long deptno;

    /**
     * 部门名称
     */
    private String dname;

    /**
     * 来自哪个数据库（一个微服务可以对应多个数据库）
     */
    private String db_source;
}
