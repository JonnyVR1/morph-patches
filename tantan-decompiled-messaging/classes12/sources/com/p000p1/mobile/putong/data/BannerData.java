package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Banners;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BannerData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannerdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Banners> banners;
    public static ProtobufAdapter<BannerData> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerData>() { // from class: com.p1.mobile.putong.data.BannerData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BannerData bannerData) {
            List<Banners> list = bannerData.banners;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Banners.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) bannerData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BannerData m17751parse(nb5 nb5Var) throws IOException {
            BannerData bannerData = new BannerData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bannerData.banners != null) {
                        break;
                    }
                    bannerData.banners = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (bannerData.banners != null) {
                        break;
                    }
                    bannerData.banners = new ArrayList();
                    return bannerData;
                }
                bannerData.banners = (List) nb5Var.l(Banners.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return bannerData;
        }

        public void serialize(BannerData bannerData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Banners> list = bannerData.banners;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Banners.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BannerData> JSON_ADAPTER = new ObjectJsonAdapter<BannerData>() { // from class: com.p1.mobile.putong.data.BannerData.2
        public Class getDataClass() {
            return BannerData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BannerData mo17830newInstance() {
            return new BannerData();
        }

        public boolean parseField(BannerData bannerData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Banners.TYPE)) {
                return false;
            }
            bannerData.banners = JsonAdapter.parseArray(jsonParser, Banners.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BannerData bannerData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Banners.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(bannerData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerData bannerData, JsonGenerator jsonGenerator) throws IOException {
            if (bannerData.banners != null) {
                jsonGenerator.writeFieldName(Banners.TYPE);
                JsonAdapter.serializeArray(bannerData.banners, jsonGenerator, Banners.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerData new_() {
        BannerData bannerData = new BannerData();
        bannerData.nullCheck();
        return bannerData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BannerData m17750clone() {
        BannerData bannerData = new BannerData();
        List<Banners> list = this.banners;
        if (list != null) {
            bannerData.banners = ValueObject.util_map(list, new w9j() { // from class: l.jd2
                public final Object call(Object obj) {
                    return ((Banners) obj).m17768clone();
                }
            });
        }
        return bannerData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerData) {
            return ValueObject.util_equals(this.banners, ((BannerData) obj).banners);
        }
        return false;
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
        List<Banners> list = this.banners;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.banners == null) {
            this.banners = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
