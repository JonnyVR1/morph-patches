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
public class SignInGrantType extends TEnum {
    public static final TEnumJsonAdapter<SignInGrantType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<SignInGrantType> PROTOBUF_ADAPTER;
    private static final Map<String, SignInGrantType> _SignInGrantType;
    public static final String china_mobile = "china-mobile";
    public static final String china_unicom = "china-unicom";
    public static final String china_unicom_online = "china-unicom-online";
    public static final String client_credentials = "client_credentials";
    public static final String confirmation_code = "confirmation_code";
    public static final String cosmos = "cosmos";
    public static final String email = "email";
    public static final String facebook = "facebook";
    public static final String google = "google";
    private static final int int_china_mobile = 6;
    private static final int int_china_unicom = 7;
    private static final int int_client_credentials = 3;
    private static final int int_confirmation_code = 1;
    private static final int int_facebook = 2;
    private static final int int_nopassword = 5;
    private static final int int_password = 0;
    private static final int int_qq = 8;
    private static final int int_unknown_ = -1;
    private static final int int_wechat = 4;
    public static final String nopassword = "nopassword";
    public static final String password = "password";

    /* JADX INFO: renamed from: qq */
    public static final String f39663qq = "qq";
    protected static HashSet<String> supportEnum = null;
    public static final String tantan_token = "tantan-token";
    public static final String unknown_ = "unknown_";
    public static final String wechat = "wechat";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<SignInGrantType> tEnumJsonAdapter = new TEnumJsonAdapter<SignInGrantType>() { // from class: com.p1.mobile.putong.data.SignInGrantType.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public SignInGrantType newTEnum(String str, int i) {
                return SignInGrantType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<SignInGrantType>() { // from class: com.p1.mobile.putong.data.SignInGrantType.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public SignInGrantType newTEnum(String str, int i) {
                return SignInGrantType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(password, 0);
        tEnumJsonAdapter.addExtJsonValue(confirmation_code, 1);
        tEnumJsonAdapter.addExtJsonValue("facebook", 2);
        tEnumJsonAdapter.addExtJsonValue(client_credentials, 3);
        tEnumJsonAdapter.addExtJsonValue("wechat", 4);
        tEnumJsonAdapter.addExtJsonValue(nopassword, 5);
        tEnumJsonAdapter.addExtJsonValue("china-mobile", 6);
        tEnumJsonAdapter.addExtJsonValue(china_unicom, 7);
        tEnumJsonAdapter.addExtJsonValue("qq", 8);
        supportEnum.add(password);
        supportEnum.add(confirmation_code);
        supportEnum.add("facebook");
        supportEnum.add(client_credentials);
        supportEnum.add("wechat");
        supportEnum.add(nopassword);
        supportEnum.add("china-mobile");
        supportEnum.add(china_unicom);
        supportEnum.add("qq");
        supportEnum.add("google");
        supportEnum.add(china_unicom_online);
        supportEnum.add(cosmos);
        supportEnum.add("email");
        supportEnum.add(tantan_token);
        _SignInGrantType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private SignInGrantType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<SignInGrantType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SignInGrantType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, SignInGrantType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, SignInGrantType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static SignInGrantType get(String str) {
        Map<String, SignInGrantType> map = _SignInGrantType;
        SignInGrantType signInGrantType = map.get(str);
        if (signInGrantType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            signInGrantType = integer == null ? new SignInGrantType(str, -1) : new SignInGrantType(str, integer.intValue());
            map.put(str, signInGrantType);
        }
        return signInGrantType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SignInGrantType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<SignInGrantType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, SignInGrantType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static SignInGrantType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
