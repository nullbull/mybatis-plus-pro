package com.github.mybatisplusplus.condition.single;

/**
 * @author niuzhenhao
 * @date 2020/9/9 14:47
 * @desc
 */

public class Eq extends SingleCondition {

    public Eq(String column, String table, Object value, int param) {
        super(column, table, value, param);
        this.condition = EQ;
    }
}
