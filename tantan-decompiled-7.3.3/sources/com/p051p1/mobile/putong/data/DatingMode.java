package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class DatingMode extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingmode";

    @ProtobufIndex(index = 3)
    public boolean datingMode;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39584id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<DatingMode> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingMode>() { // from class: com.p1.mobile.putong.data.DatingMode.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DatingMode datingMode) {
            String str = datingMode.f39584id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = datingMode.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, datingMode.datingMode);
            datingMode.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DatingMode parse(nc5 nc5Var) throws IOException {
            DatingMode datingMode = new DatingMode();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (datingMode.f39584id == null) {
                        datingMode.f39584id = "";
                    }
                    if (datingMode.type != null) {
                        break;
                    }
                    datingMode.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    datingMode.f39584id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    datingMode.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 24) {
                        if (datingMode.f39584id == null) {
                            datingMode.f39584id = "";
                        }
                        if (datingMode.type != null) {
                            break;
                        }
                        datingMode.type = "";
                        return datingMode;
                    }
                    datingMode.datingMode = nc5Var.m162483g();
                }
            }
            return datingMode;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DatingMode datingMode, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = datingMode.f39584id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = datingMode.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, datingMode.datingMode);
        }
    };
    public static JsonAdapter<DatingMode> JSON_ADAPTER = new ObjectJsonAdapter<DatingMode>() { // from class: com.p1.mobile.putong.data.DatingMode.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DatingMode.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DatingMode newInstance() {
            return new DatingMode();
        }

        public boolean parseField(DatingMode datingMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    datingMode.f39584id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DatingMode datingMode, JsonGenerator jsonGenerator) throws IOException {
            String str = datingMode.f39584id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = datingMode.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("datingMode", datingMode.datingMode);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public DatingMode mo225055clone() {
        DatingMode datingMode = new DatingMode();
        datingMode.f39584id = this.f39584id;
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
        return ValueObject.util_equals(this.f39584id, datingMode.f39584id) && ValueObject.util_equals(this.type, datingMode.type) && this.datingMode == datingMode.datingMode;
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
        String str = this.f39584id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.datingMode ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39584id == null) {
            this.f39584id = "";
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
