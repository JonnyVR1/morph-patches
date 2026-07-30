package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class BoostPeakTime extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "boostpeaktime";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<BoostPeakTime> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostPeakTime>() { // from class: com.p1.mobile.putong.core.data.BoostPeakTime.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostPeakTime boostPeakTime) {
            Meta meta = boostPeakTime.meta;
            int iL = (meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.b(2, boostPeakTime.data);
            ((MessageNano) boostPeakTime).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostPeakTime m11787parse(nb5 nb5Var) throws IOException {
            BoostPeakTime boostPeakTime = new BoostPeakTime();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (boostPeakTime.meta != null) {
                        break;
                    }
                    boostPeakTime.meta = Meta.new_();
                    break;
                }
                if (iU == 10) {
                    boostPeakTime.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 16) {
                        if (boostPeakTime.meta != null) {
                            break;
                        }
                        boostPeakTime.meta = Meta.new_();
                        return boostPeakTime;
                    }
                    boostPeakTime.data = nb5Var.g();
                }
            }
            return boostPeakTime;
        }

        public void serialize(BoostPeakTime boostPeakTime, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = boostPeakTime.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(2, boostPeakTime.data);
        }
    };
    public static JsonAdapter<BoostPeakTime> JSON_ADAPTER = new ObjectJsonAdapter<BoostPeakTime>() { // from class: com.p1.mobile.putong.core.data.BoostPeakTime.2
        public Class getDataClass() {
            return BoostPeakTime.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BoostPeakTime m11788newInstance() {
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
            boostPeakTime.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BoostPeakTime boostPeakTime, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(boostPeakTime, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BoostPeakTime boostPeakTime, JsonGenerator jsonGenerator) throws IOException {
            if (boostPeakTime.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(boostPeakTime.meta, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("data", boostPeakTime.data);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostPeakTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostPeakTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostPeakTime new_() {
        BoostPeakTime boostPeakTime = new BoostPeakTime();
        boostPeakTime.nullCheck();
        return boostPeakTime;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostPeakTime m11786clone() {
        BoostPeakTime boostPeakTime = new BoostPeakTime();
        Meta meta = this.meta;
        if (meta != null) {
            boostPeakTime.meta = meta.clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        Meta meta = this.meta;
        int iHashCode2 = ((iHashCode + (meta != null ? meta.hashCode() : 0)) * 41) + (this.data ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
