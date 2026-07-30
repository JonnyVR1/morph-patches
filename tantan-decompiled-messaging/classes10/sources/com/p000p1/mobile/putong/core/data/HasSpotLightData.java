package com.p000p1.mobile.putong.core.data;

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
public class HasSpotLightData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hasspotlightdata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean live;

    @ProtobufIndex(index = 4)
    public boolean see;

    @ProtobufIndex(index = 1)
    public boolean spotLight;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean success;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean voice;
    public static ProtobufAdapter<HasSpotLightData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HasSpotLightData>() { // from class: com.p1.mobile.putong.core.data.HasSpotLightData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HasSpotLightData hasSpotLightData) {
            int iB = CodedOutputByteBufferNano.b(1, hasSpotLightData.spotLight) + CodedOutputByteBufferNano.b(2, hasSpotLightData.live) + CodedOutputByteBufferNano.b(3, hasSpotLightData.voice) + CodedOutputByteBufferNano.b(4, hasSpotLightData.see) + CodedOutputByteBufferNano.b(5, hasSpotLightData.success);
            ((MessageNano) hasSpotLightData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HasSpotLightData m13227parse(nb5 nb5Var) throws IOException {
            HasSpotLightData hasSpotLightData = new HasSpotLightData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    hasSpotLightData.spotLight = nb5Var.g();
                } else if (iU == 16) {
                    hasSpotLightData.live = nb5Var.g();
                } else if (iU == 24) {
                    hasSpotLightData.voice = nb5Var.g();
                } else if (iU == 32) {
                    hasSpotLightData.see = nb5Var.g();
                } else {
                    if (iU != 40) {
                        return hasSpotLightData;
                    }
                    hasSpotLightData.success = nb5Var.g();
                }
            }
        }

        public void serialize(HasSpotLightData hasSpotLightData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, hasSpotLightData.spotLight);
            codedOutputByteBufferNano.A(2, hasSpotLightData.live);
            codedOutputByteBufferNano.A(3, hasSpotLightData.voice);
            codedOutputByteBufferNano.A(4, hasSpotLightData.see);
            codedOutputByteBufferNano.A(5, hasSpotLightData.success);
        }
    };
    public static JsonAdapter<HasSpotLightData> JSON_ADAPTER = new ObjectJsonAdapter<HasSpotLightData>() { // from class: com.p1.mobile.putong.core.data.HasSpotLightData.2
        public Class getDataClass() {
            return HasSpotLightData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HasSpotLightData m13228newInstance() {
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

        public void serializeFields(HasSpotLightData hasSpotLightData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(SummarizedPrivilegesId.spotLight, hasSpotLightData.spotLight);
            jsonGenerator.writeBooleanField("live", hasSpotLightData.live);
            jsonGenerator.writeBooleanField("voice", hasSpotLightData.voice);
            jsonGenerator.writeBooleanField("see", hasSpotLightData.see);
            jsonGenerator.writeBooleanField("success", hasSpotLightData.success);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HasSpotLightData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HasSpotLightData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HasSpotLightData new_() {
        HasSpotLightData hasSpotLightData = new HasSpotLightData();
        hasSpotLightData.nullCheck();
        return hasSpotLightData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HasSpotLightData m13226clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((i * 41) + (this.spotLight ? 1231 : 1237)) * 41) + (this.live ? 1231 : 1237)) * 41) + (this.voice ? 1231 : 1237)) * 41) + (this.see ? 1231 : 1237)) * 41) + (this.success ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
