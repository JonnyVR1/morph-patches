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
public class ClientAction extends TEnum {
    public static final TEnumJsonAdapter<ClientAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ClientAction> PROTOBUF_ADAPTER;
    private static final Map<String, ClientAction> _ClientAction;
    public static final String backgroundChange = "backgroundChange";
    private static final int int_backgroundChange = 0;
    private static final int int_other = 1;
    private static final int int_unknown_ = -1;
    public static final String other = "other";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ClientAction> tEnumJsonAdapter = new TEnumJsonAdapter<ClientAction>() { // from class: com.p1.mobile.putong.data.ClientAction.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ClientAction newTEnum(String str, int i) {
                return ClientAction.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ClientAction>() { // from class: com.p1.mobile.putong.data.ClientAction.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ClientAction newTEnum(String str, int i) {
                return ClientAction.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(backgroundChange, 0);
        tEnumJsonAdapter.addExtJsonValue("other", 1);
        supportEnum.add(backgroundChange);
        supportEnum.add("other");
        _ClientAction = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ClientAction(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ClientAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ClientAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ClientAction> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ClientAction> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ClientAction get(String str) {
        Map<String, ClientAction> map = _ClientAction;
        ClientAction clientAction = map.get(str);
        if (clientAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            clientAction = integer == null ? new ClientAction(str, -1) : new ClientAction(str, integer.intValue());
            map.put(str, clientAction);
        }
        return clientAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ClientAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ClientAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ClientAction> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ClientAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
