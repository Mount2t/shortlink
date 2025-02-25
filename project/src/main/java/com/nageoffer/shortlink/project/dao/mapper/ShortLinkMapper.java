package com.nageoffer.shortlink.project.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nageoffer.shortlink.project.dao.entity.ShortLinkDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 短链接持久层
 */
public interface ShortLinkMapper extends BaseMapper<ShortLinkDO> {

    /**
     * 访问统计自增
     */
    @Update("""
            UPDATE t_link
            SET
                total_pv = total_pv + #{totalPv},
                total_uv = total_uv + #{totalUv},
                total_uip = total_uip + #{totalUip}
            WHERE
                gid = #{gid}
                AND full_short_url = #{fullShortUrl};
            """)
    void incrementStats(@Param("gid") String gid ,
                        @Param("fullShortUrl") String full_short_url,
                        @Param("totalPv") Integer totalPv,
                        @Param("totalUv") Integer totalUv,
                        @Param("totalUip") Integer totalUip);
}
