package com.p046p1.mobile.putong.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes12.dex */
public class LinkAction extends TEnum {
    public static final TEnumJsonAdapter<LinkAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LinkAction> PROTOBUF_ADAPTER;
    private static final Map<String, LinkAction> _LinkAction;
    public static final String browser = "browser";
    public static final String deeplink = "deeplink";
    private static final int int_browser = 0;
    private static final int int_deeplink = 2;
    private static final int int_tantanWebview = 3;
    private static final int int_unknown_ = -1;
    private static final int int_webview = 1;
    protected static HashSet<String> supportEnum = null;
    public static final String tantanDeepLink = "tantanDeepLink";
    public static final String tantanWebview = "tantanWebview";
    public static final String unknown_ = "unknown_";
    public static final String webview = "webview";
    public static final String wechatMiniProgram = "wechatMiniProgram";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LinkAction> tEnumJsonAdapter = new TEnumJsonAdapter<LinkAction>() { // from class: com.p1.mobile.putong.data.LinkAction.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public LinkAction newTEnum(String str, int i) {
                return LinkAction.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LinkAction>() { // from class: com.p1.mobile.putong.data.LinkAction.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public LinkAction newTEnum(String str, int i) {
                return LinkAction.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("browser", 0);
        tEnumJsonAdapter.addExtJsonValue("webview", 1);
        tEnumJsonAdapter.addExtJsonValue(deeplink, 2);
        tEnumJsonAdapter.addExtJsonValue(tantanWebview, 3);
        supportEnum.add("browser");
        supportEnum.add("webview");
        supportEnum.add(deeplink);
        supportEnum.add(tantanWebview);
        supportEnum.add(tantanDeepLink);
        supportEnum.add(wechatMiniProgram);
        _LinkAction = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LinkAction(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LinkAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LinkAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LinkAction> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LinkAction> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LinkAction get(String str) {
        Map<String, LinkAction> map = _LinkAction;
        LinkAction linkAction = map.get(str);
        if (linkAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            linkAction = integer == null ? new LinkAction(str, -1) : new LinkAction(str, integer.intValue());
            map.put(str, linkAction);
        }
        return linkAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LinkAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LinkAction> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            e01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return e01Var;
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

    private static LinkAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
