package com.heytap.mcssdk.mode;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Message {
    public static final String APP_ID = "appID";
    public static final String APP_PACKAGE = "appPackage";
    public static final String BALANCE_TIME = "balanceTime";
    public static final String CONTENT = "content";
    public static final int CONTENT_DISTINCT = 1;
    public static final int CONTENT__NOT_DISTINCT = 0;
    public static final int DELIVERY_FORCED = 1;
    public static final int DELIVERY_NOT_FORCED = 0;
    public static final String DESCRIPTION = "description";
    public static final String DISTINCT_CONTENT = "distinctBycontent";
    public static final String END_DATE = "endDate";
    public static final String FORCED_DELIVERY = "forcedDelivery";
    public static final String GLOBAL_ID = "globalID";
    public static final String MESSAGE = "message";
    public static final int MESSAGE_ALARM = 4100;
    public static final int MESSAGE_APP = 4098;
    public static final int MESSAGE_BASE = 4096;
    public static final int MESSAGE_CMD_DATA = 4105;
    public static final int MESSAGE_FIND_PHONE = 4101;
    public static final String MESSAGE_ID = "messageID";
    public static final int MESSAGE_LAUNCH_ALARM = 4102;
    public static final int MESSAGE_NOTIFICATION = 4097;
    public static final int MESSAGE_P2P = 4099;
    public static final int MESSAGE_SMS_DATA = 4106;
    public static final int MESSAGE_SPT_DATA = 4103;
    public static final int MESSAGE_STAT = 4196;
    public static final String PRIORITY = "priority";
    public static final String RULE = "rule";
    public static final String SHOW_MODE = "showMode";
    public static final String START_DATE = "startDate";
    public static final String TASK_ID = "taskID";
    public static final String TIME_RANGES = "timeRanges";
    public static final String TITLE = "title";
    public static final String TYPE = "type";
    private String mAppPackage;
    private int mMessageID;
    private String mTaskID = "";

    public String getAppPackage() {
        return this.mAppPackage;
    }

    public int getMessageID() {
        return this.mMessageID;
    }

    public String getTaskID() {
        return this.mTaskID;
    }

    public abstract int getType();

    public void setAppPackage(String str) {
        this.mAppPackage = str;
    }

    public void setMessageID(int i) {
        this.mMessageID = i;
    }

    public void setTaskID(int i) {
        this.mTaskID = String.valueOf(i);
    }

    public void setTaskID(String str) {
        this.mTaskID = str;
    }
}
