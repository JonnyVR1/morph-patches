package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Coupon;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Couponbag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "couponbag";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Coupon> coupons;
    public static ProtobufAdapter<Couponbag> PROTOBUF_ADAPTER = new MessageNanoAdapter<Couponbag>() { // from class: com.p1.mobile.putong.core.data.Couponbag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Couponbag couponbag) {
            List<Coupon> list = couponbag.coupons;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) couponbag).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Couponbag m12543parse(nb5 nb5Var) throws IOException {
            Couponbag couponbag = new Couponbag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (couponbag.coupons != null) {
                        break;
                    }
                    couponbag.coupons = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (couponbag.coupons != null) {
                        break;
                    }
                    couponbag.coupons = new ArrayList();
                    return couponbag;
                }
                couponbag.coupons = (List) nb5Var.l(Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return couponbag;
        }

        public void serialize(Couponbag couponbag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Coupon> list = couponbag.coupons;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Coupon.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Couponbag> JSON_ADAPTER = new ObjectJsonAdapter<Couponbag>() { // from class: com.p1.mobile.putong.core.data.Couponbag.2
        public Class getDataClass() {
            return Couponbag.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Couponbag m12544newInstance() {
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

        public void serializeFields(Couponbag couponbag, JsonGenerator jsonGenerator) throws IOException {
            if (couponbag.coupons != null) {
                jsonGenerator.writeFieldName("coupons");
                JsonAdapter.serializeArray(couponbag.coupons, jsonGenerator, Coupon.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Couponbag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Couponbag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Couponbag new_() {
        Couponbag couponbag = new Couponbag();
        couponbag.nullCheck();
        return couponbag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Couponbag m12542clone() {
        Couponbag couponbag = new Couponbag();
        List<Coupon> list = this.coupons;
        if (list != null) {
            couponbag.coupons = ValueObject.util_map(list, new w9j() { // from class: l.erb
                public final Object call(Object obj) {
                    return ((Coupon) obj).m12536clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Coupon> list = this.coupons;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.coupons == null) {
            this.coupons = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
