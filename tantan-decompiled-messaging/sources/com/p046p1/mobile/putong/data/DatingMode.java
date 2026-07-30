package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class DatingMode extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingmode";

    @ProtobufIndex(index = 3)
    public boolean datingMode;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38736id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<DatingMode> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingMode>() { // from class: com.p1.mobile.putong.data.DatingMode.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DatingMode datingMode) {
            String str = datingMode.f38736id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = datingMode.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, datingMode.datingMode);
            datingMode.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DatingMode parse(nb5 nb5Var) throws IOException {
            DatingMode datingMode = new DatingMode();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (datingMode.f38736id == null) {
                        datingMode.f38736id = "";
                    }
                    if (datingMode.type != null) {
                        break;
                    }
                    datingMode.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    datingMode.f38736id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    datingMode.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (datingMode.f38736id == null) {
                            datingMode.f38736id = "";
                        }
                        if (datingMode.type != null) {
                            break;
                        }
                        datingMode.type = "";
                        return datingMode;
                    }
                    datingMode.datingMode = nb5Var.m158738g();
                }
            }
            return datingMode;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DatingMode datingMode, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = datingMode.f38736id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = datingMode.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, datingMode.datingMode);
        }
    };
    public static JsonAdapter<DatingMode> JSON_ADAPTER = new ObjectJsonAdapter<DatingMode>() { // from class: com.p1.mobile.putong.data.DatingMode.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DatingMode.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DatingMode newInstance() {
            return new DatingMode();
        }

        public boolean parseField(DatingMode datingMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    datingMode.f38736id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    datingMode.type = jsonParser.getValueAsString();
                    return true;
                case "datingMode":
                    datingMode.datingMode = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DatingMode datingMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "datingMode":
                    return true;
                default:
                    return super.parseFieldCheck(datingMode, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DatingMode datingMode, JsonGenerator jsonGenerator) throws IOException {
            String str = datingMode.f38736id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = datingMode.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("datingMode", datingMode.datingMode);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DatingMode new_() {
        DatingMode datingMode = new DatingMode();
        datingMode.nullCheck();
        return datingMode;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DatingMode mo223809clone() {
        DatingMode datingMode = new DatingMode();
        datingMode.f38736id = this.f38736id;
        datingMode.type = this.type;
        datingMode.datingMode = this.datingMode;
        return datingMode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatingMode)) {
            return false;
        }
        DatingMode datingMode = (DatingMode) obj;
        return ValueObject.util_equals(this.f38736id, datingMode.f38736id) && ValueObject.util_equals(this.type, datingMode.type) && this.datingMode == datingMode.datingMode;
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
        String str = this.f38736id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.datingMode ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38736id == null) {
            this.f38736id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
