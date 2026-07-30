package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class SystemReminder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "systemreminder";

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @ProtobufIndex(index = 1)
    public boolean showOnce;
    public static ProtobufAdapter<SystemReminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<SystemReminder>() { // from class: com.p1.mobile.putong.core.data.SystemReminder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SystemReminder systemReminder) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, systemReminder.showOnce);
            String str = systemReminder.icon;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            systemReminder.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SystemReminder parse(nc5 nc5Var) throws IOException {
            SystemReminder systemReminder = new SystemReminder();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (systemReminder.icon != null) {
                        break;
                    }
                    systemReminder.icon = "";
                    break;
                }
                if (iM162497u == 8) {
                    systemReminder.showOnce = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (systemReminder.icon != null) {
                            break;
                        }
                        systemReminder.icon = "";
                        return systemReminder;
                    }
                    systemReminder.icon = nc5Var.m162495s();
                }
            }
            return systemReminder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SystemReminder systemReminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, systemReminder.showOnce);
            String str = systemReminder.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<SystemReminder> JSON_ADAPTER = new ObjectJsonAdapter<SystemReminder>() { // from class: com.p1.mobile.putong.core.data.SystemReminder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SystemReminder.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SystemReminder newInstance() {
            return new SystemReminder();
        }

        public boolean parseField(SystemReminder systemReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showOnce")) {
                systemReminder.showOnce = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("icon")) {
                return false;
            }
            systemReminder.icon = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SystemReminder systemReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showOnce") || str.equals("icon")) {
                return true;
            }
            return super.parseFieldCheck(systemReminder, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SystemReminder systemReminder, JsonGenerator jsonGenerator) throws IOException {
            String str = systemReminder.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            jsonGenerator.writeBooleanField("showOnce", systemReminder.showOnce);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SystemReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SystemReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SystemReminder new_() {
        SystemReminder systemReminder = new SystemReminder();
        systemReminder.nullCheck();
        return systemReminder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SystemReminder mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.icon;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.showOnce ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
