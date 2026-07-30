package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Coupon;
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

/* JADX INFO: loaded from: classes10.dex */
public class Couponbag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "couponbag";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Coupon> coupons;
    public static ProtobufAdapter<Couponbag> PROTOBUF_ADAPTER = new MessageNanoAdapter<Couponbag>() { // from class: com.p1.mobile.putong.core.data.Couponbag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Couponbag couponbag) {
            List<Coupon> list = couponbag.coupons;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            couponbag.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Couponbag parse(nc5 nc5Var) throws IOException {
            Couponbag couponbag = new Couponbag();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (couponbag.coupons != null) {
                        break;
                    }
                    couponbag.coupons = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (couponbag.coupons != null) {
                        break;
                    }
                    couponbag.coupons = new ArrayList();
                    return couponbag;
                }
                couponbag.coupons = (List) nc5Var.m162488l(Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return couponbag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Couponbag couponbag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Coupon> list = couponbag.coupons;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Couponbag> JSON_ADAPTER = new ObjectJsonAdapter<Couponbag>() { // from class: com.p1.mobile.putong.core.data.Couponbag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Couponbag.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Couponbag newInstance() {
            return new Couponbag();
        }

        public boolean parseField(Couponbag couponbag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("coupons")) {
                return false;
            }
            couponbag.coupons = JsonAdapter.parseArray(jsonParser, Coupon.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Couponbag couponbag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("coupons")) {
                return true;
            }
            return super.parseFieldCheck(couponbag, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Couponbag couponbag, JsonGenerator jsonGenerator) throws IOException {
            if (couponbag.coupons != null) {
                jsonGenerator.writeFieldName("coupons");
                JsonAdapter.serializeArray(couponbag.coupons, jsonGenerator, Coupon.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Couponbag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Couponbag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Couponbag new_() {
        Couponbag couponbag = new Couponbag();
        couponbag.nullCheck();
        return couponbag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Couponbag mo225055clone() {
        Couponbag couponbag = new Couponbag();
        List<Coupon> list = this.coupons;
        if (list != null) {
            couponbag.coupons = ValueObject.util_map(list, new qcj() { // from class: l.ssb
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Coupon) obj).mo225055clone();
                }
            });
        }
        return couponbag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Couponbag) {
            return ValueObject.util_equals(this.coupons, ((Couponbag) obj).coupons);
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
        List<Coupon> list = this.coupons;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.coupons == null) {
            this.coupons = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
