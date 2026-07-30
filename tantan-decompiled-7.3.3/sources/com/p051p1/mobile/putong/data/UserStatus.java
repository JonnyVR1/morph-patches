package com.p051p1.mobile.putong.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes12.dex */
public class UserStatus extends TEnum {
    public static final TEnumJsonAdapter<UserStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<UserStatus> PROTOBUF_ADAPTER;
    public static final String RISK_TAG_AVATAR_IN_AUDIT = "RISK_TAG_AVATAR_IN_AUDIT";
    public static final String RISK_TAG_CHAT_BUTTON_SAFETY_REMINDER = "RISK_TAG_CHAT_BUTTON_SAFETY_REMINDER";
    public static final String RISK_TAG_CHAT_MESSAGE_SAFETY_REMINDER = "RISK_TAG_CHAT_MESSAGE_SAFETY_REMINDER";
    public static final String RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN = "RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN";
    public static final String RISK_TAG_CHAT_SENSITIVE_WORD_SAFETY_REMINDER = "RISK_TAG_CHAT_SENSITIVE_WORD_SAFETY_REMINDER";
    public static final String RISK_TAG_COMMENT_EXPOSE = "RISK_TAG_COMMENT_EXPOSE";
    public static final String RISK_TAG_DANGEROUS_USER_SAFETY_REMINDER = "RISK_TAG_DANGEROUS_USER_SAFETY_REMINDER";
    public static final String RISK_TAG_FAKE_BATCH_STATUS = "RISK_TAG_FAKE_BATCH_STATUS";
    public static final String RISK_TAG_FAKE_GENDER = "RISK_TAG_FAKE_GENDER";
    public static final String RISK_TAG_FAKE_YOUNGER_AGE = "RISK_TAG_FAKE_YOUNGER_AGE";
    public static final String RISK_TAG_GOOD_FACELESS_STATUS_2 = "RISK_TAG_GOOD_FACELESS_STATUS_2";
    public static final String RISK_TAG_GOOD_FACELESS_STATUS_3 = "RISK_TAG_GOOD_FACELESS_STATUS_3";
    public static final String RISK_TAG_GOOD_FACELESS_STATUS_3_1 = "RISK_TAG_GOOD_FACELESS_STATUS_3_1";
    public static final String RISK_TAG_GOOD_FACELESS_STATUS_3_2 = "RISK_TAG_GOOD_FACELESS_STATUS_3_2";
    public static final String RISK_TAG_GOOD_FACELESS_STATUS_3_3 = "RISK_TAG_GOOD_FACELESS_STATUS_3_3";
    public static final String RISK_TAG_GOOD_FACELESS_STATUS_3_4 = "RISK_TAG_GOOD_FACELESS_STATUS_3_4";
    public static final String RISK_TAG_GOOD_FACELESS_STATUS_3_5 = "RISK_TAG_GOOD_FACELESS_STATUS_3_5";
    public static final String RISK_TAG_GOOD_FACELESS_STATUS_3_6 = "RISK_TAG_GOOD_FACELESS_STATUS_3_6";
    public static final String RISK_TAG_GREETING_DISABLED = "RISK_TAG_GREETING_DISABLED";
    public static final String RISK_TAG_GROUP_CHAT_EXPOSE = "RISK_TAG_GROUP_CHAT_EXPOSE";
    public static final String RISK_TAG_GUIDE_CHANGE_AVATAR = "RISK_TAG_GUIDE_CHANGE_AVATAR";
    public static final String RISK_TAG_INTL_ALLOW_VERIFICATION_APPEAL = "RISK_TAG_INTL_ALLOW_VERIFICATION_APPEAL";
    public static final String RISK_TAG_INTL_SUSPECT = "RISK_TAG_INTL_SUSPECT";
    public static final String RISK_TAG_LIKE_EXPOSE = "RISK_TAG_LIKE_EXPOSE";
    public static final String RISK_TAG_MANDATORY_IDENTITY_VERIFICATION_UNDERAGE = "RISK_TAG_MANDATORY_IDENTITY_VERIFICATION_UNDERAGE";
    public static final String RISK_TAG_MANDATORY_PICTURE_VERIFICATION = "RISK_TAG_MANDATORY_PICTURE_VERIFICATION";
    public static final String RISK_TAG_MANDATORY_PICTURE_VERIFICATION_NEW = "RISK_TAG_MANDATORY_PICTURE_VERIFICATION_NEW";
    public static final String RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS = "RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS";
    public static final String RISK_TAG_MOMENT_EXPOSE = "RISK_TAG_MOMENT_EXPOSE";
    public static final String RISK_TAG_NAME_IN_AUDIT = "RISK_TAG_NAME_IN_AUDIT";
    public static final String RISK_TAG_UNREAL = "RISK_TAG_UNREAL";
    public static final String RISK_TAG_VIOLATION = "RISK_TAG_VIOLATION";
    private static final Map<String, UserStatus> _UserStatus;
    public static final String audit = "audit";
    public static final String boosted = "boosted";
    public static final String brand = "brand";
    public static final String customer_service_account = "customer_service_account";
    public static final String hidden = "hidden";
    private static final int int_RISK_TAG_CHAT_BUTTON_SAFETY_REMINDER = 9;
    private static final int int_RISK_TAG_CHAT_MESSAGE_SAFETY_REMINDER = 10;
    private static final int int_RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN = 18;
    private static final int int_RISK_TAG_CHAT_SENSITIVE_WORD_SAFETY_REMINDER = 11;
    private static final int int_RISK_TAG_DANGEROUS_USER_SAFETY_REMINDER = 12;
    private static final int int_RISK_TAG_FAKE_GENDER = 16;
    private static final int int_RISK_TAG_FAKE_YOUNGER_AGE = 17;
    private static final int int_RISK_TAG_MANDATORY_PICTURE_VERIFICATION = 8;
    private static final int int_RISK_TAG_UNREAL = 14;
    private static final int int_RISK_TAG_VIOLATION = 15;
    private static final int int_audit = 6;
    private static final int int_boosted = 3;
    private static final int int_brand = 2;
    private static final int int_customer_service_account = 13;
    private static final int int_hidden = 0;
    private static final int int_lowPopularity = 4;
    private static final int int_mediumPopularity = 5;
    private static final int int_teamaccount = 1;
    private static final int int_unknown_ = -1;
    private static final int int_violation = 7;
    public static final String lowPopularity = "lowPopularity";
    public static final String mediumPopularity = "mediumPopularity";
    protected static HashSet<String> supportEnum = null;
    public static final String teamaccount = "teamaccount";
    public static final String unknown_ = "unknown_";
    public static final String violation = "violation";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<UserStatus> tEnumJsonAdapter = new TEnumJsonAdapter<UserStatus>() { // from class: com.p1.mobile.putong.data.UserStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public UserStatus newTEnum(String str, int i) {
                return UserStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<UserStatus>() { // from class: com.p1.mobile.putong.data.UserStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public UserStatus newTEnum(String str, int i) {
                return UserStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("hidden", 0);
        tEnumJsonAdapter.addExtJsonValue("teamaccount", 1);
        tEnumJsonAdapter.addExtJsonValue("brand", 2);
        tEnumJsonAdapter.addExtJsonValue("boosted", 3);
        tEnumJsonAdapter.addExtJsonValue(lowPopularity, 4);
        tEnumJsonAdapter.addExtJsonValue(mediumPopularity, 5);
        tEnumJsonAdapter.addExtJsonValue(audit, 6);
        tEnumJsonAdapter.addExtJsonValue(violation, 7);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_MANDATORY_PICTURE_VERIFICATION, 8);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_CHAT_BUTTON_SAFETY_REMINDER, 9);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_CHAT_MESSAGE_SAFETY_REMINDER, 10);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_CHAT_SENSITIVE_WORD_SAFETY_REMINDER, 11);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_DANGEROUS_USER_SAFETY_REMINDER, 12);
        tEnumJsonAdapter.addExtJsonValue(customer_service_account, 13);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_UNREAL, 14);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_VIOLATION, 15);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_FAKE_GENDER, 16);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_FAKE_YOUNGER_AGE, 17);
        tEnumJsonAdapter.addExtJsonValue(RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN, 18);
        supportEnum.add("hidden");
        supportEnum.add("teamaccount");
        supportEnum.add("brand");
        supportEnum.add("boosted");
        supportEnum.add(lowPopularity);
        supportEnum.add(mediumPopularity);
        supportEnum.add(audit);
        supportEnum.add(violation);
        supportEnum.add(RISK_TAG_MANDATORY_PICTURE_VERIFICATION);
        supportEnum.add(RISK_TAG_CHAT_BUTTON_SAFETY_REMINDER);
        supportEnum.add(RISK_TAG_CHAT_MESSAGE_SAFETY_REMINDER);
        supportEnum.add(RISK_TAG_CHAT_SENSITIVE_WORD_SAFETY_REMINDER);
        supportEnum.add(RISK_TAG_DANGEROUS_USER_SAFETY_REMINDER);
        supportEnum.add(customer_service_account);
        supportEnum.add(RISK_TAG_UNREAL);
        supportEnum.add(RISK_TAG_VIOLATION);
        supportEnum.add(RISK_TAG_FAKE_GENDER);
        supportEnum.add(RISK_TAG_FAKE_YOUNGER_AGE);
        supportEnum.add(RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN);
        supportEnum.add(RISK_TAG_AVATAR_IN_AUDIT);
        supportEnum.add(RISK_TAG_NAME_IN_AUDIT);
        supportEnum.add(RISK_TAG_GOOD_FACELESS_STATUS_3);
        supportEnum.add(RISK_TAG_GOOD_FACELESS_STATUS_3_1);
        supportEnum.add(RISK_TAG_GOOD_FACELESS_STATUS_3_2);
        supportEnum.add(RISK_TAG_GOOD_FACELESS_STATUS_3_3);
        supportEnum.add(RISK_TAG_GOOD_FACELESS_STATUS_3_4);
        supportEnum.add(RISK_TAG_GOOD_FACELESS_STATUS_3_5);
        supportEnum.add(RISK_TAG_GOOD_FACELESS_STATUS_3_6);
        supportEnum.add(RISK_TAG_FAKE_BATCH_STATUS);
        supportEnum.add(RISK_TAG_INTL_SUSPECT);
        supportEnum.add(RISK_TAG_GOOD_FACELESS_STATUS_2);
        supportEnum.add(RISK_TAG_LIKE_EXPOSE);
        supportEnum.add(RISK_TAG_MOMENT_EXPOSE);
        supportEnum.add(RISK_TAG_COMMENT_EXPOSE);
        supportEnum.add(RISK_TAG_GREETING_DISABLED);
        supportEnum.add(RISK_TAG_GROUP_CHAT_EXPOSE);
        supportEnum.add(RISK_TAG_MANDATORY_PICTURE_VERIFICATION_NEW);
        supportEnum.add(RISK_TAG_MANDATORY_PICTURE_VERIFICATION_PROCESS);
        supportEnum.add(RISK_TAG_INTL_ALLOW_VERIFICATION_APPEAL);
        supportEnum.add(RISK_TAG_MANDATORY_IDENTITY_VERIFICATION_UNDERAGE);
        supportEnum.add(RISK_TAG_GUIDE_CHANGE_AVATAR);
        _UserStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private UserStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<UserStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<UserStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, UserStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, UserStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static UserStatus get(String str) {
        Map<String, UserStatus> map = _UserStatus;
        UserStatus userStatus = map.get(str);
        if (userStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            userStatus = integer == null ? new UserStatus(str, -1) : new UserStatus(str, integer.intValue());
            map.put(str, userStatus);
        }
        return userStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UserStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<UserStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, UserStatus> oldEnumCovertMap(Map<String, Integer> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            l01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return l01Var;
    }

    public boolean equals(String str) {
        return name().equals(str);
    }

    public boolean isUnknownType() {
        if (equals("unknown_")) {
            return true;
        }
        return !supportEnum.contains(this.name);
    }

    private static UserStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
