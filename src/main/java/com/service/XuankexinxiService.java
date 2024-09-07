package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuankexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuankexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuankexinxiView;


/**
 * 选课信息
 *
 * @author 
 * @email 
 * @date 2023-02-24 21:32:40
 */
public interface XuankexinxiService extends IService<XuankexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuankexinxiVO> selectListVO(Wrapper<XuankexinxiEntity> wrapper);
   	
   	XuankexinxiVO selectVO(@Param("ew") Wrapper<XuankexinxiEntity> wrapper);
   	
   	List<XuankexinxiView> selectListView(Wrapper<XuankexinxiEntity> wrapper);
   	
   	XuankexinxiView selectView(@Param("ew") Wrapper<XuankexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XuankexinxiEntity> wrapper);



}

