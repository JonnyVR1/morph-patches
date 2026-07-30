package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BannerFrequency extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannerfrequency";

    @ProtobufIndex(index = 2)
    public int count;

    @NonNull
    @ProtobufIndex(index = 1)
    public BannerFrequencyType type;
    public static ProtobufAdapter<BannerFrequency> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerFrequency>() { // from class: com.p1.mobile.putong.data.BannerFrequency.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BannerFrequency bannerFrequency) {
            BannerFrequencyType bannerFrequencyType = bannerFrequency.type;
            int iH = (bannerFrequencyType != null ? CodedOutputByteBufferNano.h(1, bannerFrequencyType.ordinal()) : 0) + CodedOutputByteBufferNano.h(2, bannerFrequency.count);
            BannerFrequencyType bannerFrequencyType2 = bannerFrequency.type;
            if (bannerFrequencyType2 != null) {
                iH += CodedOutputByteBufferNano.l(3, bannerFrequencyType2, BannerFrequencyType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) bannerFrequency).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BannerFrequency m17757parse(nb5 nb5Var) throws IOException {
            BannerFrequency bannerFrequency = new BannerFrequency();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bannerFrequency.type == null && numValueOf != null) {
                        bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (bannerFrequency.type != null) {
                        break;
                    }
                    bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    bannerFrequency.count = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (bannerFrequency.type == null && numValueOf != null) {
                            bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (bannerFrequency.type != null) {
                            break;
                        }
                        bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.defaultEnum();
                        return bannerFrequency;
                    }
                    bannerFrequency.type = (BannerFrequencyType) nb5Var.l(BannerFrequencyType.PROTOBUF_ADAPTER);
                }
            }
            return bannerFrequency;
        }

        public void serialize(BannerFrequency bannerFrequency, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            BannerFrequencyType bannerFrequencyType = bannerFrequency.type;
            if (bannerFrequencyType != null) {
                codedOutputByteBufferNano.G(1, bannerFrequencyType.ordinal());
            }
            codedOutputByteBufferNano.G(2, bannerFrequency.count);
            BannerFrequencyType bannerFrequencyType2 = bannerFrequency.type;
            if (bannerFrequencyType2 != null) {
                codedOutputByteBufferNano.K(3, bannerFrequencyType2, BannerFrequencyType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BannerFrequency> JSON_ADAPTER = new ObjectJsonAdapter<BannerFrequency>() { // from class: com.p1.mobile.putong.data.BannerFrequency.2
        public Class getDataClass() {
            return BannerFrequency.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BannerFrequency mo17830newInstance() {
            return new BannerFrequency();
        }

        public boolean parseField(BannerFrequency bannerFrequency, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            bannerFrequency.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BannerFrequency bannerFrequency, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(bannerFrequency, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerFrequency bannerFrequency, JsonGenerator jsonGenerator) throws IOException {
            if (bannerFrequency.type != null) {
                jsonGenerator.writeFieldName("type");
                BannerFrequencyType.JSON_ADAPTER.serialize(bannerFrequency.type, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("count", bannerFrequency.count);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerFrequency) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerFrequency) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerFrequency new_() {
        BannerFrequency bannerFrequency = new BannerFrequency();
        bannerFrequency.nullCheck();
        return bannerFrequency;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BannerFrequency m17756clone() {
        BannerFrequency bannerFrequency = new BannerFrequency();
        bannerFrequency.type = this.type;
        bannerFrequency.count = this.count;
        return bannerFrequency;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerFrequency)) {
            return false;
        }
        BannerFrequency bannerFrequency = (BannerFrequency) obj;
        return ValueObject.util_equals(this.type, bannerFrequency.type) && this.count == bannerFrequency.count;
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
        BannerFrequencyType bannerFrequencyType = this.type;
        int iHashCode = ((i2 + (bannerFrequencyType != null ? bannerFrequencyType.hashCode() : 0)) * 41) + this.count;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
