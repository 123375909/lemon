package com.mossle.internal.mail.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MailConfig .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "MAIL_CONFIG")
public class MailConfig implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String name;

    /** null. */
    private String host;

    /** null. */
    private String username;

    /** null. */
    private String password;

    /** null. */
    private Integer smtpAuth;

    /** null. */
    private Integer smtpStarttls;

    /** null. */
    private String status;

    /** null. */
    private String defaultFrom;

    /** null. */
    private String testMail;

    /** null. */
    private String scopeId;

    /** . */
    private Set<MailQueue> mailQueues = new HashSet<MailQueue>(0);

    /** . */
    private Set<MailHistory> mailHistories = new HashSet<MailHistory>(0);

    public MailConfig() {
    }

    public MailConfig(String name, String host, String username,
            String password, Integer smtpAuth, Integer smtpStarttls,
            String status, String defaultFrom, String testMail, String scopeId,
            Set<MailQueue> mailQueues, Set<MailHistory> mailHistories) {
        this.name = name;
        this.host = host;
        this.username = username;
        this.password = password;
        this.smtpAuth = smtpAuth;
        this.smtpStarttls = smtpStarttls;
        this.status = status;
        this.defaultFrom = defaultFrom;
        this.testMail = testMail;
        this.scopeId = scopeId;
        this.mailQueues = mailQueues;
        this.mailHistories = mailHistories;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "HOST", length = 200)
    public String getHost() {
        return this.host;
    }

    /**
     * @param host
     *            null.
     */
    public void setHost(String host) {
        this.host = host;
    }

    /** @return null. */
    @Column(name = "USERNAME", length = 200)
    public String getUsername() {
        return this.username;
    }

    /**
     * @param username
     *            null.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /** @return null. */
    @Column(name = "PASSWORD", length = 200)
    public String getPassword() {
        return this.password;
    }

    /**
     * @param password
     *            null.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** @return null. */
    @Column(name = "SMTP_AUTH")
    public Integer getSmtpAuth() {
        return this.smtpAuth;
    }

    /**
     * @param smtpAuth
     *            null.
     */
    public void setSmtpAuth(Integer smtpAuth) {
        this.smtpAuth = smtpAuth;
    }

    /** @return null. */
    @Column(name = "SMTP_STARTTLS")
    public Integer getSmtpStarttls() {
        return this.smtpStarttls;
    }

    /**
     * @param smtpStarttls
     *            null.
     */
    public void setSmtpStarttls(Integer smtpStarttls) {
        this.smtpStarttls = smtpStarttls;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "DEFAULT_FROM", length = 200)
    public String getDefaultFrom() {
        return this.defaultFrom;
    }

    /**
     * @param defaultFrom
     *            null.
     */
    public void setDefaultFrom(String defaultFrom) {
        this.defaultFrom = defaultFrom;
    }

    /** @return null. */
    @Column(name = "TEST_MAIL", length = 200)
    public String getTestMail() {
        return this.testMail;
    }

    /**
     * @param testMail
     *            null.
     */
    public void setTestMail(String testMail) {
        this.testMail = testMail;
    }

    /** @return null. */
    @Column(name = "SCOPE_ID", length = 50)
    public String getScopeId() {
        return this.scopeId;
    }

    /**
     * @param scopeId
     *            null.
     */
    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mailConfig")
    public Set<MailQueue> getMailQueues() {
        return this.mailQueues;
    }

    /**
     * @param mailQueues
     *            .
     */
    public void setMailQueues(Set<MailQueue> mailQueues) {
        this.mailQueues = mailQueues;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mailConfig")
    public Set<MailHistory> getMailHistories() {
        return this.mailHistories;
    }

    /**
     * @param mailHistories
     *            .
     */
    public void setMailHistories(Set<MailHistory> mailHistories) {
        this.mailHistories = mailHistories;
    }
}
