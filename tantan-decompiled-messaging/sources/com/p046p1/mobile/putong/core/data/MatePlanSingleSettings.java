package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class MatePlanSingleSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mateplansinglesettings";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20438id;

    @ProtobufIndex(index = 3)
    public boolean single;

    @ProtobufIndex(index = 2)
    public long type;
    public static ProtobufAdapter<MatePlanSingleSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatePlanSingleSettings>() { // from class: com.p1.mobile.putong.core.data.MatePlanSingleSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatePlanSingleSettings matePlanSingleSettings) {
            String str = matePlanSingleSettings.f20438id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, matePlanSingleSettings.type) + CodedOutputByteBufferNano.m17220b(3, matePlanSingleSettings.single);
            matePlanSingleSettings.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatePlanSingleSettings parse(nb5 nb5Var) throws IOException {
            MatePlanSingleSettings matePlanSingleSettings = new MatePlanSingleSettings();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (matePlanSingleSettings.f20438id != null) {
                        break;
                    }
                    matePlanSingleSettings.f20438id = "";
                    break;
                }
                if (iM158752u == 10) {
                    matePlanSingleSettings.f20438id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    matePlanSingleSettings.type = nb5Var.m158742k();
                } else {
                    if (iM158752u != 24) {
                        if (matePlanSingleSettings.f20438id != null) {
                            break;
                        }
                        matePlanSingleSettings.f20438id = "";
                        return matePlanSingleSettings;
                    }
                    matePlanSingleSettings.single = nb5Var.m158738g();
                }
            }
            return matePlanSingleSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatePlanSingleSettings matePlanSingleSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = matePlanSingleSettings.f20438id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, matePlanSingleSettings.type);
            codedOutputByteBufferNano.m17244A(3, matePlanSingleSettings.single);
        }
    };
    public static JsonAdapter<MatePlanSingleSettings> JSON_ADAPTER = new ObjectJsonAdapter<MatePlanSingleSettings>() { // from class: com.p1.mobile.putong.core.data.MatePlanSingleSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatePlanSingleSettings.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatePlanSingleSettings newInstance() {
            return new MatePlanSingleSettings();
        }

        public boolean parseField(MatePlanSingleSettings matePlanSingleSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "single":
                    matePlanSingleSettings.single = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    matePlanSingleSettings.f20438id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    matePlanSingleSettings.type = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MatePlanSingleSettings matePlanSingleSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "single":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(matePlanSingleSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatePlanSingleSettings matePlanSingleSettings, JsonGenerator jsonGenerator) throws IOException {
            String str = matePlanSingleSettings.f20438id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("type", matePlanSingleSettings.type);
            jsonGenerator.writeBooleanField("single", matePlanSingleSettings.single);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatePlanSingleSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatePlanSingleSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatePlanSingleSettings new_() {
        MatePlanSingleSettings matePlanSingleSettings = new MatePlanSingleSettings();
        matePlanSingleSettings.nullCheck();
        return matePlanSingleSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatePlanSingleSettings mo223809clone() {
        MatePlanSingleSettings matePlanSingleSettings = new MatePlanSingleSettings();
        matePlanSingleSettings.f20438id = this.f20438id;
        matePlanSingleSettings.type = this.type;
        matePlanSingleSettings.single = this.single;
        return matePlanSingleSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatePlanSingleSettings)) {
            return false;
        }
        MatePlanSingleSettings matePlanSingleSettings = (MatePlanSingleSettings) obj;
        return ValueObject.util_equals(this.f20438id, matePlanSingleSettings.f20438id) && this.type == matePlanSingleSettings.type && this.single == matePlanSingleSettings.single;
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
        String str = this.f20438id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.type;
        int i3 = ((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + (this.single ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20438id == null) {
            this.f20438id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
