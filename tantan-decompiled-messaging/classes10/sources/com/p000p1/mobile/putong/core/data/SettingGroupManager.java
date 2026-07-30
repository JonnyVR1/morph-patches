package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.SettingGroupManager;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SettingGroupManager extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "settinggroupmanager";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Action action;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> adminUserIds;
    public static ProtobufAdapter<SettingGroupManager> PROTOBUF_ADAPTER = new MessageNanoAdapter<SettingGroupManager>() { // from class: com.p1.mobile.putong.core.data.SettingGroupManager.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SettingGroupManager settingGroupManager) {
            List<String> list = settingGroupManager.adminUserIds;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            Action action = settingGroupManager.action;
            if (action != null) {
                iL += CodedOutputByteBufferNano.l(2, action, Action.PROTOBUF_ADAPTER);
            }
            ((MessageNano) settingGroupManager).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SettingGroupManager m15593parse(nb5 nb5Var) throws IOException {
            SettingGroupManager settingGroupManager = new SettingGroupManager();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (settingGroupManager.adminUserIds == null) {
                        settingGroupManager.adminUserIds = new ArrayList();
                    }
                    if (settingGroupManager.action != null) {
                        break;
                    }
                    settingGroupManager.action = (Action) Action.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    settingGroupManager.adminUserIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (settingGroupManager.adminUserIds == null) {
                            settingGroupManager.adminUserIds = new ArrayList();
                        }
                        if (settingGroupManager.action != null) {
                            break;
                        }
                        settingGroupManager.action = (Action) Action.JSON_ADAPTER.defaultEnum();
                        return settingGroupManager;
                    }
                    settingGroupManager.action = (Action) nb5Var.l(Action.PROTOBUF_ADAPTER);
                }
            }
            return settingGroupManager;
        }

        public void serialize(SettingGroupManager settingGroupManager, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = settingGroupManager.adminUserIds;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            Action action = settingGroupManager.action;
            if (action != null) {
                codedOutputByteBufferNano.K(2, action, Action.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SettingGroupManager> JSON_ADAPTER = new ObjectJsonAdapter<SettingGroupManager>() { // from class: com.p1.mobile.putong.core.data.SettingGroupManager.2
        public Class getDataClass() {
            return SettingGroupManager.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SettingGroupManager m15594newInstance() {
            return new SettingGroupManager();
        }

        public boolean parseField(SettingGroupManager settingGroupManager, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("action")) {
                settingGroupManager.action = (Action) Action.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("adminUserIds")) {
                return false;
            }
            settingGroupManager.adminUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SettingGroupManager settingGroupManager, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("action") || str.equals("adminUserIds")) {
                return true;
            }
            return super.parseFieldCheck(settingGroupManager, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SettingGroupManager settingGroupManager, JsonGenerator jsonGenerator) throws IOException {
            if (settingGroupManager.adminUserIds != null) {
                jsonGenerator.writeFieldName("adminUserIds");
                JsonAdapter.serializeArray(settingGroupManager.adminUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (settingGroupManager.action != null) {
                jsonGenerator.writeFieldName("action");
                Action.JSON_ADAPTER.serialize(settingGroupManager.action, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SettingGroupManager) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SettingGroupManager) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m640a(String str) {
        return str;
    }

    public static SettingGroupManager new_() {
        SettingGroupManager settingGroupManager = new SettingGroupManager();
        settingGroupManager.nullCheck();
        return settingGroupManager;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SettingGroupManager m15592clone() {
        SettingGroupManager settingGroupManager = new SettingGroupManager();
        List<String> list = this.adminUserIds;
        if (list != null) {
            settingGroupManager.adminUserIds = ValueObject.util_map(list, new w9j() { // from class: l.dne0
                public final Object call(Object obj) {
                    return SettingGroupManager.m640a((String) obj);
                }
            });
        }
        settingGroupManager.action = this.action;
        return settingGroupManager;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SettingGroupManager)) {
            return false;
        }
        SettingGroupManager settingGroupManager = (SettingGroupManager) obj;
        return ValueObject.util_equals(this.adminUserIds, settingGroupManager.adminUserIds) && ValueObject.util_equals(this.action, settingGroupManager.action);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.adminUserIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Action action = this.action;
        int iHashCode2 = iHashCode + (action != null ? action.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.adminUserIds == null) {
            this.adminUserIds = new ArrayList();
        }
        if (this.action == null) {
            this.action = (Action) Action.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
