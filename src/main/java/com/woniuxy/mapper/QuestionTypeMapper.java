package com.woniuxy.mapper;

import com.woniuxy.pojo.QuestionType;
import com.woniuxy.pojo.QuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    long countByExample(QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int deleteByExample(QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int deleteByPrimaryKey(Integer typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int insert(QuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int insertSelective(QuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    List<QuestionType> selectByExample(QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    QuestionType selectByPrimaryKey(Integer typeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") QuestionType record, @Param("example") QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByExample(@Param("record") QuestionType record, @Param("example") QuestionTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByPrimaryKeySelective(QuestionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_type
     *
     * @mbg.generated Sat Aug 24 13:08:25 CST 2019
     */
    int updateByPrimaryKey(QuestionType record);
}