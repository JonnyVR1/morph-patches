package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Banners;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class BannerData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannerdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Banners> banners;
    public static ProtobufAdapter<BannerData> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerData>() { // from class: com.p1.mobile.putong.data.BannerData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BannerData bannerData) {
            List<Banners> list = bannerData.banners;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, Banners.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            bannerData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BannerData parse(nc5 nc5Var) throws IOException {
            BannerData bannerData = new BannerData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bannerData.banners != null) {
                        break;
                    }
                    bannerData.banners = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (bannerData.banners != null) {
                        break;
                    }
                    bannerData.banners = new ArrayList();
                    return bannerData;
                }
                bannerData.banners = (List) nc5Var.m162488l(Banners.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return bannerData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BannerData bannerData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Banners> list = bannerData.banners;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, Banners.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BannerData> JSON_ADAPTER = new ObjectJsonAdapter<BannerData>() { // from class: com.p1.mobile.putong.data.BannerData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BannerData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BannerData newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerData bannerData, JsonGenerator jsonGenerator) throws IOException {
            if (bannerData.banners != null) {
                jsonGenerator.writeFieldName(Banners.TYPE);
                JsonAdapter.serializeArray(bannerData.banners, jsonGenerator, Banners.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerData new_() {
        BannerData bannerData = new BannerData();
        bannerData.nullCheck();
        return bannerData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BannerData mo225055clone() {
        BannerData bannerData = new BannerData();
        List<Banners> list = this.banners;
        if (list != null) {
            bannerData.banners = ValueObject.util_map(list, new qcj() { // from class: l.qd2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Banners) obj).mo225055clone();
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
        List<Banners> list = this.banners;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.banners == null) {
            this.banners = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
