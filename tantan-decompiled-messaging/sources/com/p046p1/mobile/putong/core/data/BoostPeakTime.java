package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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
public class BoostPeakTime extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "boostpeaktime";

    @ProtobufIndex(index = 2)
    public boolean data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<BoostPeakTime> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostPeakTime>() { // from class: com.p1.mobile.putong.core.data.BoostPeakTime.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostPeakTime boostPeakTime) {
            Meta meta = boostPeakTime.meta;
            int iM17230l = (meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17220b(2, boostPeakTime.data);
            boostPeakTime.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostPeakTime parse(nb5 nb5Var) throws IOException {
            BoostPeakTime boostPeakTime = new BoostPeakTime();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (boostPeakTime.meta != null) {
                        break;
                    }
                    boostPeakTime.meta = Meta.new_();
                    break;
                }
                if (iM158752u == 10) {
                    boostPeakTime.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 16) {
                        if (boostPeakTime.meta != null) {
                            break;
                        }
                        boostPeakTime.meta = Meta.new_();
                        return boostPeakTime;
                    }
                    boostPeakTime.data = nb5Var.m158738g();
                }
            }
            return boostPeakTime;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostPeakTime boostPeakTime, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = boostPeakTime.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(2, boostPeakTime.data);
        }
    };
    public static JsonAdapter<BoostPeakTime> JSON_ADAPTER = new ObjectJsonAdapter<BoostPeakTime>() { // from class: com.p1.mobile.putong.core.data.BoostPeakTime.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostPeakTime.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostPeakTime newInstance() {
            return new BoostPeakTime();
        }

        public boolean parseField(BoostPeakTime boostPeakTime, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                boostPeakTime.data = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            boostPeakTime.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BoostPeakTime boostPeakTime, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(boostPeakTime, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostPeakTime boostPeakTime, JsonGenerator jsonGenerator) throws IOException {
            if (boostPeakTime.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(boostPeakTime.meta, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("data", boostPeakTime.data);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostPeakTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostPeakTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostPeakTime new_() {
        BoostPeakTime boostPeakTime = new BoostPeakTime();
        boostPeakTime.nullCheck();
        return boostPeakTime;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostPeakTime mo223809clone() {
        BoostPeakTime boostPeakTime = new BoostPeakTime();
        Meta meta = this.meta;
        if (meta != null) {
            boostPeakTime.meta = meta.mo223809clone();
        }
        boostPeakTime.data = this.data;
        return boostPeakTime;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostPeakTime)) {
            return false;
        }
        BoostPeakTime boostPeakTime = (BoostPeakTime) obj;
        return this == obj && ValueObject.util_equals(this.meta, boostPeakTime.meta) && this.data == boostPeakTime.data;
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
        int iHashCode = super.hashCode() * 41;
        Meta meta = this.meta;
        int iHashCode2 = ((iHashCode + (meta != null ? meta.hashCode() : 0)) * 41) + (this.data ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
