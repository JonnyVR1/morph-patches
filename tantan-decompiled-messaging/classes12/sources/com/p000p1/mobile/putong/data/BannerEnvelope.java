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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BannerEnvelope bannerEnvelope) {
            Meta meta = bannerEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            BannerData bannerData = bannerEnvelope.data;
            if (bannerData != null) {
                iL += CodedOutputByteBufferNano.l(2, bannerData, BannerData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) bannerEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BannerEnvelope m17754parse(nb5 nb5Var) throws IOException {
            BannerEnvelope bannerEnvelope = new BannerEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bannerEnvelope.meta == null) {
                        bannerEnvelope.meta = Meta.new_();
                    }
                    if (bannerEnvelope.data != null) {
                        break;
                    }
                    bannerEnvelope.data = BannerData.new_();
                    break;
                }
                if (iU == 10) {
                    bannerEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (bannerEnvelope.meta == null) {
                            bannerEnvelope.meta = Meta.new_();
                        }
                        if (bannerEnvelope.data != null) {
                            break;
                        }
                        bannerEnvelope.data = BannerData.new_();
                        return bannerEnvelope;
                    }
                    bannerEnvelope.data = (BannerData) nb5Var.l(BannerData.PROTOBUF_ADAPTER);
                }
            }
            return bannerEnvelope;
        }

        public void serialize(BannerEnvelope bannerEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = bannerEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            BannerData bannerData = bannerEnvelope.data;
            if (bannerData != null) {
                codedOutputByteBufferNano.K(2, bannerData, BannerData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BannerEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<BannerEnvelope>() { // from class: com.p1.mobile.putong.data.BannerEnvelope.2
        public Class getDataClass() {
            return BannerEnvelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BannerEnvelope mo17830newInstance() {
            return new BannerEnvelope();
        }

        public boolean parseField(BannerEnvelope bannerEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                bannerEnvelope.data = (BannerData) BannerData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            bannerEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BannerEnvelope bannerEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(bannerEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerEnvelope bannerEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (bannerEnvelope.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(bannerEnvelope.meta, jsonGenerator, true);
            }
            if (bannerEnvelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                BannerData.JSON_ADAPTER.serialize(bannerEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerEnvelope new_() {
        BannerEnvelope bannerEnvelope = new BannerEnvelope();
        bannerEnvelope.nullCheck();
        return bannerEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BannerEnvelope m17753clone() {
        BannerEnvelope bannerEnvelope = new BannerEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            bannerEnvelope.meta = meta.m18461clone();
        }
        BannerData bannerData = this.data;
        if (bannerData != null) {
            bannerEnvelope.data = bannerData.m17750clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        BannerData bannerData = this.data;
        int iHashCode2 = iHashCode + (bannerData != null ? bannerData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = BannerData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
