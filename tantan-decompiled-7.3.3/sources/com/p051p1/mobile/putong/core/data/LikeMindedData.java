package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class LikeMindedData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeddata";

    @ProtobufIndex(index = 2)
    public boolean active;

    @ProtobufIndex(index = 4)
    public long duration;

    @ProtobufIndex(index = 3)
    public long remain;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<LikeMindedData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedData likeMindedData) {
            String str = likeMindedData.type;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, likeMindedData.active) + CodedOutputByteBufferNano.m17283j(3, likeMindedData.remain) + CodedOutputByteBufferNano.m17283j(4, likeMindedData.duration);
            likeMindedData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedData parse(nc5 nc5Var) throws IOException {
            LikeMindedData likeMindedData = new LikeMindedData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (likeMindedData.type != null) {
                        break;
                    }
                    likeMindedData.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    likeMindedData.type = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    likeMindedData.active = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    likeMindedData.remain = nc5Var.m162487k();
                } else {
                    if (iM162497u != 32) {
                        if (likeMindedData.type != null) {
                            break;
                        }
                        likeMindedData.type = "";
                        return likeMindedData;
                    }
                    likeMindedData.duration = nc5Var.m162487k();
                }
            }
            return likeMindedData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedData likeMindedData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, likeMindedData.active);
            codedOutputByteBufferNano.m17307I(3, likeMindedData.remain);
            codedOutputByteBufferNano.m17307I(4, likeMindedData.duration);
        }
    };
    public static JsonAdapter<LikeMindedData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedData newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeMindedData likeMindedData, JsonGenerator jsonGenerator) throws IOException {
            String str = likeMindedData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, likeMindedData.active);
            jsonGenerator.writeNumberField("remain", likeMindedData.remain);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, likeMindedData.duration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedData new_() {
        LikeMindedData likeMindedData = new LikeMindedData();
        likeMindedData.nullCheck();
        return likeMindedData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedData mo225055clone() {
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
        String str = this.type;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.active ? 1231 : 1237)) * 41;
        long j = this.remain;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.duration;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
