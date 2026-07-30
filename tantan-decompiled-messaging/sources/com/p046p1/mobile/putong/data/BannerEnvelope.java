package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class BannerEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannerenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public BannerData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<BannerEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerEnvelope>() { // from class: com.p1.mobile.putong.data.BannerEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BannerEnvelope bannerEnvelope) {
            Meta meta = bannerEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            BannerData bannerData = bannerEnvelope.data;
            if (bannerData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, bannerData, BannerData.PROTOBUF_ADAPTER);
            }
            bannerEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BannerEnvelope parse(nb5 nb5Var) throws IOException {
            BannerEnvelope bannerEnvelope = new BannerEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bannerEnvelope.meta == null) {
                        bannerEnvelope.meta = Meta.new_();
                    }
                    if (bannerEnvelope.data != null) {
                        break;
                    }
                    bannerEnvelope.data = BannerData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    bannerEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (bannerEnvelope.meta == null) {
                            bannerEnvelope.meta = Meta.new_();
                        }
                        if (bannerEnvelope.data != null) {
                            break;
                        }
                        bannerEnvelope.data = BannerData.new_();
                        return bannerEnvelope;
                    }
                    bannerEnvelope.data = (BannerData) nb5Var.m158743l(BannerData.PROTOBUF_ADAPTER);
                }
            }
            return bannerEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BannerEnvelope bannerEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = bannerEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            BannerData bannerData = bannerEnvelope.data;
            if (bannerData != null) {
                codedOutputByteBufferNano.m17254K(2, bannerData, BannerData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BannerEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<BannerEnvelope>() { // from class: com.p1.mobile.putong.data.BannerEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BannerEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BannerEnvelope newInstance() {
            return new BannerEnvelope();
        }

        public boolean parseField(BannerEnvelope bannerEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                bannerEnvelope.data = BannerData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            bannerEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BannerEnvelope bannerEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(bannerEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerEnvelope bannerEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (bannerEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(bannerEnvelope.meta, jsonGenerator, true);
            }
            if (bannerEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                BannerData.JSON_ADAPTER.serialize(bannerEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerEnvelope new_() {
        BannerEnvelope bannerEnvelope = new BannerEnvelope();
        bannerEnvelope.nullCheck();
        return bannerEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BannerEnvelope mo223809clone() {
        BannerEnvelope bannerEnvelope = new BannerEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            bannerEnvelope.meta = meta.mo223809clone();
        }
        BannerData bannerData = this.data;
        if (bannerData != null) {
            bannerEnvelope.data = bannerData.mo223809clone();
        }
        return bannerEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerEnvelope)) {
            return false;
        }
        BannerEnvelope bannerEnvelope = (BannerEnvelope) obj;
        return ValueObject.util_equals(this.meta, bannerEnvelope.meta) && ValueObject.util_equals(this.data, bannerEnvelope.data);
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
        BannerData bannerData = this.data;
        int iHashCode2 = iHashCode + (bannerData != null ? bannerData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = BannerData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
