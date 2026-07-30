package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveRandomMatchCouponNotice;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveRandomMatchCouponDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRandomMatchCouponDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRandomMatchCouponDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRandomMatchCouponDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRandomMatchCouponDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRandomMatchCouponDetail newInstance() {
            return new BLiveRandomMatchCouponDetail();
        }

        public boolean parseField(BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("remainCoupons")) {
                bLiveRandomMatchCouponDetail.remainCoupons = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("notices")) {
                return false;
            }
            bLiveRandomMatchCouponDetail.notices = JsonAdapter.parseArray(jsonParser, BLiveRandomMatchCouponNotice.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remainCoupons", bLiveRandomMatchCouponDetail.remainCoupons);
            if (bLiveRandomMatchCouponDetail.notices != null) {
                jsonGenerator.writeFieldName("notices");
                JsonAdapter.serializeArray(bLiveRandomMatchCouponDetail.notices, jsonGenerator, BLiveRandomMatchCouponNotice.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRandomMatchCouponDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverandommatchcoupondetail";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveRandomMatchCouponNotice> notices;

    @ProtobufIndex(index = 1)
    public int remainCoupons;

    public static BLiveRandomMatchCouponDetail new_() {
        BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail = new BLiveRandomMatchCouponDetail();
        bLiveRandomMatchCouponDetail.nullCheck();
        return bLiveRandomMatchCouponDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRandomMatchCouponDetail mo225055clone() {
        BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail = new BLiveRandomMatchCouponDetail();
        bLiveRandomMatchCouponDetail.remainCoupons = this.remainCoupons;
        List<BLiveRandomMatchCouponNotice> list = this.notices;
        if (list != null) {
            bLiveRandomMatchCouponDetail.notices = ValueObject.util_map(list, new qcj() { // from class: l.z42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveRandomMatchCouponNotice) obj).mo225055clone();
                }
            });
        }
        return bLiveRandomMatchCouponDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRandomMatchCouponDetail)) {
            return false;
        }
        BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail = (BLiveRandomMatchCouponDetail) obj;
        return this.remainCoupons == bLiveRandomMatchCouponDetail.remainCoupons && ValueObject.util_equals(this.notices, bLiveRandomMatchCouponDetail.notices);
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
        int i2 = ((i * 41) + this.remainCoupons) * 41;
        List<BLiveRandomMatchCouponNotice> list = this.notices;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.notices == null) {
            this.notices = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
