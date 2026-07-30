package com.p046p1.mobile.putong.core.data;

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
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, hasSpotLightData.spotLight) + CodedOutputByteBufferNano.m17220b(2, hasSpotLightData.live) + CodedOutputByteBufferNano.m17220b(3, hasSpotLightData.voice) + CodedOutputByteBufferNano.m17220b(4, hasSpotLightData.see) + CodedOutputByteBufferNano.m17220b(5, hasSpotLightData.success);
            hasSpotLightData.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HasSpotLightData parse(nb5 nb5Var) throws IOException {
            HasSpotLightData hasSpotLightData = new HasSpotLightData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    hasSpotLightData.spotLight = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    hasSpotLightData.live = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    hasSpotLightData.voice = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    hasSpotLightData.see = nb5Var.m158738g();
                } else {
                    if (iM158752u != 40) {
                        return hasSpotLightData;
                    }
                    hasSpotLightData.success = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HasSpotLightData hasSpotLightData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, hasSpotLightData.spotLight);
            codedOutputByteBufferNano.m17244A(2, hasSpotLightData.live);
            codedOutputByteBufferNano.m17244A(3, hasSpotLightData.voice);
            codedOutputByteBufferNano.m17244A(4, hasSpotLightData.see);
            codedOutputByteBufferNano.m17244A(5, hasSpotLightData.success);
        }
    };
    public static JsonAdapter<HasSpotLightData> JSON_ADAPTER = new ObjectJsonAdapter<HasSpotLightData>() { // from class: com.p1.mobile.putong.core.data.HasSpotLightData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HasSpotLightData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HasSpotLightData hasSpotLightData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(SummarizedPrivilegesId.spotLight, hasSpotLightData.spotLight);
            jsonGenerator.writeBooleanField("live", hasSpotLightData.live);
            jsonGenerator.writeBooleanField("voice", hasSpotLightData.voice);
            jsonGenerator.writeBooleanField("see", hasSpotLightData.see);
            jsonGenerator.writeBooleanField("success", hasSpotLightData.success);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HasSpotLightData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public HasSpotLightData mo223809clone() {
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
