package com.miaosha.dataobject;

public class UserPasswordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.id
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.encrept_password
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    private String encreptPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.user_id
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.id
     *
     * @return the value of user_password.id
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.id
     *
     * @param id the value for user_password.id
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.encrept_password
     *
     * @return the value of user_password.encrept_password
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    public String getEncreptPassword() {
        return encreptPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.encrept_password
     *
     * @param encreptPassword the value for user_password.encrept_password
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    public void setEncreptPassword(String encreptPassword) {
        this.encreptPassword = encreptPassword == null ? null : encreptPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.user_id
     *
     * @return the value of user_password.user_id
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.user_id
     *
     * @param userId the value for user_password.user_id
     *
     * @mbg.generated Sat Aug 07 00:45:53 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}