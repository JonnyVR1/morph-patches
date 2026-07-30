package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class PremiumWeeklyGuideEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "premiumweeklyguideenvelope";

    @Nullable
    @ProtobufIndex(index = 2)
    public PremiumWeeklyGuideData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<PremiumWeeklyGuideEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<PremiumWeeklyGuideEnvelope>() { // from class: com.p1.mobile.putong.core.data.PremiumWeeklyGuideEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope) {
            Meta meta = premiumWeeklyGuideEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            PremiumWeeklyGuideData premiumWeeklyGuideData = premiumWeeklyGuideEnvelope.data;
            if (premiumWeeklyGuideData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, premiumWeeklyGuideData, PremiumWeeklyGuideData.PROTOBUF_ADAPTER);
            }
            premiumWeeklyGuideEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PremiumWeeklyGuideEnvelope parse(nb5 nb5Var) throws IOException {
            PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope = new PremiumWeeklyGuideEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (premiumWeeklyGuideEnvelope.meta != null) {
                        break;
                    }
                    premiumWeeklyGuideEnvelope.meta = Meta.new_();
                    break;
                }
                if (iM158752u == 10) {
                    premiumWeeklyGuideEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (premiumWeeklyGuideEnvelope.meta != null) {
                            break;
                        }
                        premiumWeeklyGuideEnvelope.meta = Meta.new_();
                        return premiumWeeklyGuideEnvelope;
                    }
                    premiumWeeklyGuideEnvelope.data = (PremiumWeeklyGuideData) nb5Var.m158743l(PremiumWeeklyGuideData.PROTOBUF_ADAPTER);
                }
            }
            return premiumWeeklyGuideEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = premiumWeeklyGuideEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            PremiumWeeklyGuideData premiumWeeklyGuideData = premiumWeeklyGuideEnvelope.data;
            if (premiumWeeklyGuideData != null) {
                codedOutputByteBufferNano.m17254K(2, premiumWeeklyGuideData, PremiumWeeklyGuideData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PremiumWeeklyGuideEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<PremiumWeeklyGuideEnvelope>() { // from class: com.p1.mobile.putong.core.data.PremiumWeeklyGuideEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PremiumWeeklyGuideEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PremiumWeeklyGuideEnvelope newInstance() {
            return new PremiumWeeklyGuideEnvelope();
        }

        public boolean parseField(PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                premiumWeeklyGuideEnvelope.data = PremiumWeeklyGuideData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            premiumWeeklyGuideEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(premiumWeeklyGuideEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (premiumWeeklyGuideEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(premiumWeeklyGuideEnvelope.meta, jsonGenerator, true);
            }
            if (premiumWeeklyGuideEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                PremiumWeeklyGuideData.JSON_ADAPTER.serialize(premiumWeeklyGuideEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PremiumWeeklyGuideEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PremiumWeeklyGuideEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PremiumWeeklyGuideEnvelope new_() {
        PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope = new PremiumWeeklyGuideEnvelope();
        premiumWeeklyGuideEnvelope.nullCheck();
        return premiumWeeklyGuideEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PremiumWeeklyGuideEnvelope mo223809clone() {
        PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope = new PremiumWeeklyGuideEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            premiumWeeklyGuideEnvelope.meta = meta.mo223809clone();
        }
        PremiumWeeklyGuideData premiumWeeklyGuideData = this.data;
        if (premiumWeeklyGuideData != null) {
            premiumWeeklyGuideEnvelope.data = premiumWeeklyGuideData.mo223809clone();
        }
        return premiumWeeklyGuideEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PremiumWeeklyGuideEnvelope)) {
            return false;
        }
        PremiumWeeklyGuideEnvelope premiumWeeklyGuideEnvelope = (PremiumWeeklyGuideEnvelope) obj;
        return ValueObject.util_equals(this.meta, premiumWeeklyGuideEnvelope.meta) && ValueObject.util_equals(this.data, premiumWeeklyGuideEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        PremiumWeeklyGuideData premiumWeeklyGuideData = this.data;
        int iHashCode2 = iHashCode + (premiumWeeklyGuideData != null ? premiumWeeklyGuideData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
