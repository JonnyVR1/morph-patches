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
public class LikeMindedData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeddata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean active;

    @ProtobufIndex(index = 4)
    public long duration;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long remain;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<LikeMindedData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeMindedData likeMindedData) {
            String str = likeMindedData.type;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, likeMindedData.active) + CodedOutputByteBufferNano.j(3, likeMindedData.remain) + CodedOutputByteBufferNano.j(4, likeMindedData.duration);
            ((MessageNano) likeMindedData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeMindedData m13843parse(nb5 nb5Var) throws IOException {
            LikeMindedData likeMindedData = new LikeMindedData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeMindedData.type != null) {
                        break;
                    }
                    likeMindedData.type = "";
                    break;
                }
                if (iU == 10) {
                    likeMindedData.type = nb5Var.s();
                } else if (iU == 16) {
                    likeMindedData.active = nb5Var.g();
                } else if (iU == 24) {
                    likeMindedData.remain = nb5Var.k();
                } else {
                    if (iU != 32) {
                        if (likeMindedData.type != null) {
                            break;
                        }
                        likeMindedData.type = "";
                        return likeMindedData;
                    }
                    likeMindedData.duration = nb5Var.k();
                }
            }
            return likeMindedData;
        }

        public void serialize(LikeMindedData likeMindedData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedData.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, likeMindedData.active);
            codedOutputByteBufferNano.I(3, likeMindedData.remain);
            codedOutputByteBufferNano.I(4, likeMindedData.duration);
        }
    };
    public static JsonAdapter<LikeMindedData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedData.2
        public Class getDataClass() {
            return LikeMindedData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikeMindedData m13844newInstance() {
            return new LikeMindedData();
        }

        public boolean parseField(LikeMindedData likeMindedData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    likeMindedData.duration = jsonParser.getValueAsLong();
                    return true;
                case "active":
                    likeMindedData.active = jsonParser.getValueAsBoolean();
                    return true;
                case "remain":
                    likeMindedData.remain = jsonParser.getValueAsLong();
                    return true;
                case "type":
                    likeMindedData.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikeMindedData likeMindedData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "active":
                case "remain":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(likeMindedData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LikeMindedData likeMindedData, JsonGenerator jsonGenerator) throws IOException {
            String str = likeMindedData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, likeMindedData.active);
            jsonGenerator.writeNumberField("remain", likeMindedData.remain);
            jsonGenerator.writeNumberField("duration", likeMindedData.duration);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedData new_() {
        LikeMindedData likeMindedData = new LikeMindedData();
        likeMindedData.nullCheck();
        return likeMindedData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeMindedData m13842clone() {
        LikeMindedData likeMindedData = new LikeMindedData();
        likeMindedData.type = this.type;
        likeMindedData.active = this.active;
        likeMindedData.remain = this.remain;
        likeMindedData.duration = this.duration;
        return likeMindedData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedData)) {
            return false;
        }
        LikeMindedData likeMindedData = (LikeMindedData) obj;
        return ValueObject.util_equals(this.type, likeMindedData.type) && this.active == likeMindedData.active && this.remain == likeMindedData.remain && this.duration == likeMindedData.duration;
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
        String str = this.type;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.active ? 1231 : 1237)) * 41;
        long j = this.remain;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.duration;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
