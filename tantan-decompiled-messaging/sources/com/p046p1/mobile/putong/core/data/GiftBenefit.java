package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.GiftBenefit;
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
public class GiftBenefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftbenefit";

    @NonNull
    @ProtobufIndex(index = 1)
    public Discount discount;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> giveItemIDs;
    public static ProtobufAdapter<GiftBenefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftBenefit>() { // from class: com.p1.mobile.putong.core.data.GiftBenefit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftBenefit giftBenefit) {
            Discount discount = giftBenefit.discount;
            int iM17230l = discount != null ? CodedOutputByteBufferNano.m17230l(1, discount, Discount.PROTOBUF_ADAPTER) : 0;
            List<Integer> list = giftBenefit.giveItemIDs;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            giftBenefit.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftBenefit parse(nb5 nb5Var) throws IOException {
            GiftBenefit giftBenefit = new GiftBenefit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (giftBenefit.discount == null) {
                        giftBenefit.discount = Discount.new_();
                    }
                    if (giftBenefit.giveItemIDs != null) {
                        break;
                    }
                    giftBenefit.giveItemIDs = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    giftBenefit.discount = (Discount) nb5Var.m158743l(Discount.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (giftBenefit.discount == null) {
                            giftBenefit.discount = Discount.new_();
                        }
                        if (giftBenefit.giveItemIDs != null) {
                            break;
                        }
                        giftBenefit.giveItemIDs = new ArrayList();
                        return giftBenefit;
                    }
                    giftBenefit.giveItemIDs = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return giftBenefit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftBenefit giftBenefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Discount discount = giftBenefit.discount;
            if (discount != null) {
                codedOutputByteBufferNano.m17254K(1, discount, Discount.PROTOBUF_ADAPTER);
            }
            List<Integer> list = giftBenefit.giveItemIDs;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GiftBenefit> JSON_ADAPTER = new ObjectJsonAdapter<GiftBenefit>() { // from class: com.p1.mobile.putong.core.data.GiftBenefit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftBenefit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftBenefit newInstance() {
            return new GiftBenefit();
        }

        public boolean parseField(GiftBenefit giftBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("discount")) {
                giftBenefit.discount = Discount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("giveItemIDs")) {
                return false;
            }
            giftBenefit.giveItemIDs = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GiftBenefit giftBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("discount") || str.equals("giveItemIDs")) {
                return true;
            }
            return super.parseFieldCheck(giftBenefit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftBenefit giftBenefit, JsonGenerator jsonGenerator) throws IOException {
            if (giftBenefit.discount != null) {
                jsonGenerator.writeFieldName("discount");
                Discount.JSON_ADAPTER.serialize(giftBenefit.discount, jsonGenerator, true);
            }
            if (giftBenefit.giveItemIDs != null) {
                jsonGenerator.writeFieldName("giveItemIDs");
                JsonAdapter.serializeArray(giftBenefit.giveItemIDs, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m35551a(Integer num) {
        return num;
    }

    public static GiftBenefit new_() {
        GiftBenefit giftBenefit = new GiftBenefit();
        giftBenefit.nullCheck();
        return giftBenefit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftBenefit mo223809clone() {
        GiftBenefit giftBenefit = new GiftBenefit();
        Discount discount = this.discount;
        if (discount != null) {
            giftBenefit.discount = discount.mo223809clone();
        }
        List<Integer> list = this.giveItemIDs;
        if (list != null) {
            giftBenefit.giveItemIDs = ValueObject.util_map(list, new w9j() { // from class: l.dlj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return GiftBenefit.m35551a((Integer) obj);
                }
            });
        }
        return giftBenefit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftBenefit)) {
            return false;
        }
        GiftBenefit giftBenefit = (GiftBenefit) obj;
        return ValueObject.util_equals(this.discount, giftBenefit.discount) && ValueObject.util_equals(this.giveItemIDs, giftBenefit.giveItemIDs);
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
        Discount discount = this.discount;
        int iHashCode = (i2 + (discount != null ? discount.hashCode() : 0)) * 41;
        List<Integer> list = this.giveItemIDs;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.discount == null) {
            this.discount = Discount.new_();
        }
        if (this.giveItemIDs == null) {
            this.giveItemIDs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
