package com.woniuxy.mapper;

import com.woniuxy.pojo.MultipleChoice;
import com.woniuxy.pojo.MultipleChoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MultipleChoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    long countByExample(MultipleChoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    int deleteByExample(MultipleChoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    int deleteByPrimaryKey(Integer titleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    int insert(MultipleChoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    int insertSelective(MultipleChoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    List<MultipleChoice> selectByExample(Integer typeid, RowBounds rb);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    MultipleChoice selectByPrimaryKey(Integer titleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") MultipleChoice record, @Param("example") MultipleChoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    int updateByExample(@Param("record") MultipleChoice record, @Param("example") MultipleChoiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    int updateByPrimaryKeySelective(MultipleChoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table multiple_choice
     *
     * @mbg.generated Fri Aug 23 14:56:06 CST 2019
     */
    int updateByPrimaryKey(MultipleChoice record);
}