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
public class VerifyReason extends TEnum {
    public static final TEnumJsonAdapter<VerifyReason> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VerifyReason> PROTOBUF_ADAPTER;
    private static final Map<String, VerifyReason> _VerifyReason;
    public static final String ban_appeal = "ban-appeal";
    public static final String bind_email = "bind-email";
    public static final String bind_mobile = "bind_mobile";
    public static final String bind_mobile_force_login = "bind_mobile_force_login";
    public static final String bind_mobile_oneclick = "bind_mobile_oneclick";
    public static final String bind_mobile_precheck = "bind_mobile_precheck";
    public static final String change_email = "change-email";
    public static final String change_phone = "change-phone";
    public static final String fix_verify_code_hack = "fix_verify_code_hack";
    public static final String forgot_password = "forgot-password";
    private static final int int_ban_appeal = 7;
    private static final int int_bind_mobile = 4;
    private static final int int_bind_mobile_oneclick = 6;
    private static final int int_bind_mobile_precheck = 5;
    private static final int int_change_phone = 2;
    private static final int int_fix_verify_code_hack = 8;
    private static final int int_forgot_password = 1;
    private static final int int_signin = 3;
    private static final int int_signup = 0;
    private static final int int_signup_signin = 9;
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    public static final String signin = "signin";
    public static final String signup = "signup";
    public static final String signup_signin = "signup_signin";
    protected static HashSet<String> supportEnum = null;
    public static final String ttt_signup = "ttt-signup";
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<VerifyReason> tEnumJsonAdapter = new TEnumJsonAdapter<VerifyReason>() { // from class: com.p1.mobile.putong.data.VerifyReason.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public VerifyReason newTEnum(String str, int i) {
                return VerifyReason.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<VerifyReason>() { // from class: com.p1.mobile.putong.data.VerifyReason.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public VerifyReason newTEnum(String str, int i) {
                return VerifyReason.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(signup, 0);
        tEnumJsonAdapter.addExtJsonValue(forgot_password, 1);
        tEnumJsonAdapter.addExtJsonValue(change_phone, 2);
        tEnumJsonAdapter.addExtJsonValue(signin, 3);
        tEnumJsonAdapter.addExtJsonValue(bind_mobile, 4);
        tEnumJsonAdapter.addExtJsonValue(bind_mobile_precheck, 5);
        tEnumJsonAdapter.addExtJsonValue(bind_mobile_oneclick, 6);
        tEnumJsonAdapter.addExtJsonValue(ban_appeal, 7);
        tEnumJsonAdapter.addExtJsonValue(fix_verify_code_hack, 8);
        tEnumJsonAdapter.addExtJsonValue(signup_signin, 9);
        supportEnum.add(signup);
        supportEnum.add(forgot_password);
        supportEnum.add(change_phone);
        supportEnum.add(signin);
        supportEnum.add(bind_mobile);
        supportEnum.add(bind_mobile_precheck);
        supportEnum.add(bind_mobile_oneclick);
        supportEnum.add(ban_appeal);
        supportEnum.add(fix_verify_code_hack);
        supportEnum.add(signup_signin);
        supportEnum.add(ttt_signup);
        supportEnum.add("pending");
        supportEnum.add(bind_mobile_force_login);
        supportEnum.add(change_email);
        supportEnum.add(bind_email);
        _VerifyReason = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private VerifyReason(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VerifyReason> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VerifyReason> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VerifyReason> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, VerifyReason> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static VerifyReason get(String str) {
        Map<String, VerifyReason> map = _VerifyReason;
        VerifyReason verifyReason = map.get(str);
        if (verifyReason == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            verifyReason = integer == null ? new VerifyReason(str, -1) : new VerifyReason(str, integer.intValue());
            map.put(str, verifyReason);
        }
        return verifyReason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VerifyReason getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VerifyReason> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VerifyReason> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VerifyReason get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
