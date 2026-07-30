package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Coupon;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

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
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            couponbag.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Couponbag parse(nb5 nb5Var) throws IOException {
            Couponbag couponbag = new Couponbag();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (couponbag.coupons != null) {
                        break;
                    }
                    couponbag.coupons = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (couponbag.coupons != null) {
                        break;
                    }
                    couponbag.coupons = new ArrayList();
                    return couponbag;
                }
                couponbag.coupons = (List) nb5Var.m158743l(Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return couponbag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Couponbag couponbag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Coupon> list = couponbag.coupons;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Couponbag> JSON_ADAPTER = new ObjectJsonAdapter<Couponbag>() { // from class: com.p1.mobile.putong.core.data.Couponbag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Couponbag.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Couponbag couponbag, JsonGenerator jsonGenerator) throws IOException {
            if (couponbag.coupons != null) {
                jsonGenerator.writeFieldName("coupons");
                JsonAdapter.serializeArray(couponbag.coupons, jsonGenerator, Coupon.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Couponbag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public Couponbag mo223809clone() {
        Couponbag couponbag = new Couponbag();
        List<Coupon> list = this.coupons;
        if (list != null) {
            couponbag.coupons = ValueObject.util_map(list, new w9j() { // from class: l.erb
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Coupon) obj).mo223809clone();
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
