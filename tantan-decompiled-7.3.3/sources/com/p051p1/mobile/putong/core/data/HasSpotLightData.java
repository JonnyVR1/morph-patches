package com.p051p1.mobile.putong.core.data;

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
public class HasSpotLightData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hasspotlightdata";

    @ProtobufIndex(index = 2)
    public boolean live;

    @ProtobufIndex(index = 4)
    public boolean see;

    @ProtobufIndex(index = 1)
    public boolean spotLight;

    @ProtobufIndex(index = 5)
    public boolean success;

    @ProtobufIndex(index = 3)
    public boolean voice;
    public static ProtobufAdapter<HasSpotLightData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HasSpotLightData>() { // from class: com.p1.mobile.putong.core.data.HasSpotLightData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HasSpotLightData hasSpotLightData) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, hasSpotLightData.spotLight) + CodedOutputByteBufferNano.m17275b(2, hasSpotLightData.live) + CodedOutputByteBufferNano.m17275b(3, hasSpotLightData.voice) + CodedOutputByteBufferNano.m17275b(4, hasSpotLightData.see) + CodedOutputByteBufferNano.m17275b(5, hasSpotLightData.success);
            hasSpotLightData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HasSpotLightData parse(nc5 nc5Var) throws IOException {
            HasSpotLightData hasSpotLightData = new HasSpotLightData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    hasSpotLightData.spotLight = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    hasSpotLightData.live = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    hasSpotLightData.voice = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    hasSpotLightData.see = nc5Var.m162483g();
                } else {
                    if (iM162497u != 40) {
                        return hasSpotLightData;
                    }
                    hasSpotLightData.success = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HasSpotLightData hasSpotLightData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, hasSpotLightData.spotLight);
            codedOutputByteBufferNano.m17299A(2, hasSpotLightData.live);
            codedOutputByteBufferNano.m17299A(3, hasSpotLightData.voice);
            codedOutputByteBufferNano.m17299A(4, hasSpotLightData.see);
            codedOutputByteBufferNano.m17299A(5, hasSpotLightData.success);
        }
    };
    public static JsonAdapter<HasSpotLightData> JSON_ADAPTER = new ObjectJsonAdapter<HasSpotLightData>() { // from class: com.p1.mobile.putong.core.data.HasSpotLightData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HasSpotLightData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HasSpotLightData newInstance() {
            return new HasSpotLightData();
        }

        public boolean parseField(HasSpotLightData hasSpotLightData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "success":
                    hasSpotLightData.success = jsonParser.getValueAsBoolean();
                    return true;
                case "spotLight":
                    hasSpotLightData.spotLight = jsonParser.getValueAsBoolean();
                    return true;
                case "see":
                    hasSpotLightData.see = jsonParser.getValueAsBoolean();
                    return true;
                case "live":
                    hasSpotLightData.live = jsonParser.getValueAsBoolean();
                    return true;
                case "voice":
                    hasSpotLightData.voice = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HasSpotLightData hasSpotLightData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "success":
                case "spotLight":
                case "see":
                case "live":
                case "voice":
                    return true;
                default:
                    return super.parseFieldCheck(hasSpotLightData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HasSpotLightData hasSpotLightData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(SummarizedPrivilegesId.spotLight, hasSpotLightData.spotLight);
            jsonGenerator.writeBooleanField("live", hasSpotLightData.live);
            jsonGenerator.writeBooleanField("voice", hasSpotLightData.voice);
            jsonGenerator.writeBooleanField("see", hasSpotLightData.see);
            jsonGenerator.writeBooleanField("success", hasSpotLightData.success);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HasSpotLightData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HasSpotLightData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HasSpotLightData new_() {
        HasSpotLightData hasSpotLightData = new HasSpotLightData();
        hasSpotLightData.nullCheck();
        return hasSpotLightData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HasSpotLightData mo225055clone() {
        HasSpotLightData hasSpotLightData = new HasSpotLightData();
        hasSpotLightData.spotLight = this.spotLight;
        hasSpotLightData.live = this.live;
        hasSpotLightData.voice = this.voice;
        hasSpotLightData.see = this.see;
        hasSpotLightData.success = this.success;
        return hasSpotLightData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HasSpotLightData)) {
            return false;
        }
        HasSpotLightData hasSpotLightData = (HasSpotLightData) obj;
        return this.spotLight == hasSpotLightData.spotLight && this.live == hasSpotLightData.live && this.voice == hasSpotLightData.voice && this.see == hasSpotLightData.see && this.success == hasSpotLightData.success;
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
        int i2 = (((((((((i * 41) + (this.spotLight ? 1231 : 1237)) * 41) + (this.live ? 1231 : 1237)) * 41) + (this.voice ? 1231 : 1237)) * 41) + (this.see ? 1231 : 1237)) * 41) + (this.success ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
