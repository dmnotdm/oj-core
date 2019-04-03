package com.zzz.oj.core.entity;

import com.zzz.util.jpa.entity.JpaEntity;

import lombok.Data;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by zhizhao.zhang on 2019/04/04 03:39.
 * Description:
 */
@Data
public class OJEntity implements JpaEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long createTime;
    private Long updateTime;

    @Override
    public Long primaryKey() {
        return id;
    }
}
