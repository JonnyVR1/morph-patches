package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SystemReminder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "systemreminder";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String icon;

    @ProtobufIndex(index = 1)
    public boolean showOnce;
    public static ProtobufAdapter<SystemReminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<SystemReminder>() { // from class: com.p1.mobile.putong.core.data.SystemReminder.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SystemReminder systemReminder) {
            int iB = CodedOutputByteBufferNano.b(1, systemReminder.showOnce);
            String str = systemReminder.icon;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) systemReminder).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SystemReminder m15878parse(nb5 nb5Var) throws IOException {
            SystemReminder systemReminder = new SystemReminder();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (systemReminder.icon != null) {
                        break;
                    }
                    systemReminder.icon = "";
                    break;
                }
                if (iU == 8) {
                    systemReminder.showOnce = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (systemReminder.icon != null) {
                            break;
                        }
                        systemReminder.icon = "";
                        return systemReminder;
                    }
                    systemReminder.icon = nb5Var.s();
                }
            }
            return systemReminder;
        }

        public void serialize(SystemReminder systemReminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, systemReminder.showOnce);
            String str = systemReminder.icon;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<SystemReminder> JSON_ADAPTER = new ObjectJsonAdapter<SystemReminder>() { // from class: com.p1.mobile.putong.core.data.SystemReminder.2
        public Class getDataClass() {
            return SystemReminder.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SystemReminder m15879newInstance() {
            return new SystemReminder();
        }

        public boolean parseField(SystemReminder systemReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showOnce")) {
                systemReminder.showOnce = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals(HomeTabModuleTopicShowType.icon)) {
                return false;
            }
            systemReminder.icon = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SystemReminder systemReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showOnce") || str.equals(HomeTabModuleTopicShowType.icon)) {
                return true;
            }
            return super.parseFieldCheck(systemReminder, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SystemReminder systemReminder, JsonGenerator jsonGenerator) throws IOException {
            String str = systemReminder.icon;
            if (str != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str);
            }
            jsonGenerator.writeBooleanField("showOnce", systemReminder.showOnce);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SystemReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SystemReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SystemReminder new_() {
        SystemReminder systemReminder = new SystemReminder();
        systemReminder.nullCheck();
        return systemReminder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SystemReminder m15877clone() {
        SystemReminder systemReminder = new SystemReminder();
        systemReminder.icon = this.icon;
        systemReminder.showOnce = this.showOnce;
        return systemReminder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SystemReminder)) {
            return false;
        }
        SystemReminder systemReminder = (SystemReminder) obj;
        return ValueObject.util_equals(this.icon, systemReminder.icon) && this.showOnce == systemReminder.showOnce;
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
        String str = this.icon;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.showOnce ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
