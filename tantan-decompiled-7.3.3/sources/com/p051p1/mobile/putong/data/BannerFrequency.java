package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class BannerFrequency extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannerfrequency";

    @ProtobufIndex(index = 2)
    public int count;

    @NonNull
    @ProtobufIndex(index = 1)
    public BannerFrequencyType type;
    public static ProtobufAdapter<BannerFrequency> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerFrequency>() { // from class: com.p1.mobile.putong.data.BannerFrequency.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BannerFrequency bannerFrequency) {
            BannerFrequencyType bannerFrequencyType = bannerFrequency.type;
            int iM17281h = (bannerFrequencyType != null ? CodedOutputByteBufferNano.m17281h(1, bannerFrequencyType.ordinal()) : 0) + CodedOutputByteBufferNano.m17281h(2, bannerFrequency.count);
            BannerFrequencyType bannerFrequencyType2 = bannerFrequency.type;
            if (bannerFrequencyType2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, bannerFrequencyType2, BannerFrequencyType.PROTOBUF_ADAPTER);
            }
            bannerFrequency.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BannerFrequency parse(nc5 nc5Var) throws IOException {
            BannerFrequency bannerFrequency = new BannerFrequency();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bannerFrequency.type == null && numValueOf != null) {
                        bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (bannerFrequency.type != null) {
                        break;
                    }
                    bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 16) {
                    bannerFrequency.count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (bannerFrequency.type == null && numValueOf != null) {
                            bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (bannerFrequency.type != null) {
                            break;
                        }
                        bannerFrequency.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.defaultEnum();
                        return bannerFrequency;
                    }
                    bannerFrequency.type = (BannerFrequencyType) nc5Var.m162488l(BannerFrequencyType.PROTOBUF_ADAPTER);
                }
            }
            return bannerFrequency;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BannerFrequency bannerFrequency, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            BannerFrequencyType bannerFrequencyType = bannerFrequency.type;
            if (bannerFrequencyType != null) {
                codedOutputByteBufferNano.m17305G(1, bannerFrequencyType.ordinal());
            }
            codedOutputByteBufferNano.m17305G(2, bannerFrequency.count);
            BannerFrequencyType bannerFrequencyType2 = bannerFrequency.type;
            if (bannerFrequencyType2 != null) {
                codedOutputByteBufferNano.m17309K(3, bannerFrequencyType2, BannerFrequencyType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BannerFrequency> JSON_ADAPTER = new ObjectJsonAdapter<BannerFrequency>() { // from class: com.p1.mobile.putong.data.BannerFrequency.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BannerFrequency.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BannerFrequency newInstance() {
            return new BannerFrequency();
        }

        public boolean parseField(BannerFrequency bannerFrequency, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                bannerFrequency.type = BannerFrequencyType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerFrequency bannerFrequency, JsonGenerator jsonGenerator) throws IOException {
            if (bannerFrequency.type != null) {
                jsonGenerator.writeFieldName("type");
                BannerFrequencyType.JSON_ADAPTER.serialize(bannerFrequency.type, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("count", bannerFrequency.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerFrequency) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerFrequency) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerFrequency new_() {
        BannerFrequency bannerFrequency = new BannerFrequency();
        bannerFrequency.nullCheck();
        return bannerFrequency;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BannerFrequency mo225055clone() {
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
        BannerFrequencyType bannerFrequencyType = this.type;
        int iHashCode = ((i2 + (bannerFrequencyType != null ? bannerFrequencyType.hashCode() : 0)) * 41) + this.count;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (BannerFrequencyType) BannerFrequencyType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
