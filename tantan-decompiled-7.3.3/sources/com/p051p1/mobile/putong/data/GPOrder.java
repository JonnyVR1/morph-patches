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
public class GPOrder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gporder";

    @ProtobufIndex(index = 7)
    public boolean consumed;

    @NonNull
    @ProtobufIndex(index = 4)
    public String googlePlayOrderId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = 3)
    public BundleStatus orderStatus;

    @NonNull
    @ProtobufIndex(index = 6)
    public String purchaseToken;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;
    public static ProtobufAdapter<GPOrder> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPOrder>() { // from class: com.p1.mobile.putong.data.GPOrder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPOrder gPOrder) {
            String str = gPOrder.orderId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = gPOrder.itemId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            BundleStatus bundleStatus = gPOrder.orderStatus;
            if (bundleStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(3, bundleStatus.ordinal());
            }
            String str3 = gPOrder.googlePlayOrderId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = gPOrder.type;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = gPOrder.purchaseToken;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(7, gPOrder.consumed);
            BundleStatus bundleStatus2 = gPOrder.orderStatus;
            if (bundleStatus2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(8, bundleStatus2, BundleStatus.PROTOBUF_ADAPTER);
            }
            gPOrder.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPOrder parse(nc5 nc5Var) throws IOException {
            GPOrder gPOrder = new GPOrder();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPOrder.orderStatus == null && numValueOf != null) {
                        gPOrder.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (gPOrder.orderId == null) {
                        gPOrder.orderId = "";
                    }
                    if (gPOrder.itemId == null) {
                        gPOrder.itemId = "";
                    }
                    if (gPOrder.orderStatus == null) {
                        gPOrder.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (gPOrder.googlePlayOrderId == null) {
                        gPOrder.googlePlayOrderId = "";
                    }
                    if (gPOrder.type == null) {
                        gPOrder.type = "";
                    }
                    if (gPOrder.purchaseToken != null) {
                        break;
                    }
                    gPOrder.purchaseToken = "";
                    break;
                }
                if (iM162497u == 10) {
                    gPOrder.orderId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    gPOrder.itemId = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 34) {
                    gPOrder.googlePlayOrderId = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    gPOrder.type = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    gPOrder.purchaseToken = nc5Var.m162495s();
                } else if (iM162497u == 56) {
                    gPOrder.consumed = nc5Var.m162483g();
                } else {
                    if (iM162497u != 66) {
                        if (gPOrder.orderStatus == null && numValueOf != null) {
                            gPOrder.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (gPOrder.orderId == null) {
                            gPOrder.orderId = "";
                        }
                        if (gPOrder.itemId == null) {
                            gPOrder.itemId = "";
                        }
                        if (gPOrder.orderStatus == null) {
                            gPOrder.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (gPOrder.googlePlayOrderId == null) {
                            gPOrder.googlePlayOrderId = "";
                        }
                        if (gPOrder.type == null) {
                            gPOrder.type = "";
                        }
                        if (gPOrder.purchaseToken != null) {
                            break;
                        }
                        gPOrder.purchaseToken = "";
                        return gPOrder;
                    }
                    gPOrder.orderStatus = (BundleStatus) nc5Var.m162488l(BundleStatus.PROTOBUF_ADAPTER);
                }
            }
            return gPOrder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPOrder gPOrder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPOrder.orderId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = gPOrder.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            BundleStatus bundleStatus = gPOrder.orderStatus;
            if (bundleStatus != null) {
                codedOutputByteBufferNano.m17305G(3, bundleStatus.ordinal());
            }
            String str3 = gPOrder.googlePlayOrderId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = gPOrder.type;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = gPOrder.purchaseToken;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            codedOutputByteBufferNano.m17299A(7, gPOrder.consumed);
            BundleStatus bundleStatus2 = gPOrder.orderStatus;
            if (bundleStatus2 != null) {
                codedOutputByteBufferNano.m17309K(8, bundleStatus2, BundleStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPOrder> JSON_ADAPTER = new ObjectJsonAdapter<GPOrder>() { // from class: com.p1.mobile.putong.data.GPOrder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPOrder.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPOrder newInstance() {
            return new GPOrder();
        }

        public boolean parseField(GPOrder gPOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "purchaseToken":
                    gPOrder.purchaseToken = jsonParser.getValueAsString();
                    return true;
                case "orderId":
                    gPOrder.orderId = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    gPOrder.itemId = jsonParser.getValueAsString();
                    return true;
                case "googlePlayOrderId":
                    gPOrder.googlePlayOrderId = jsonParser.getValueAsString();
                    return true;
                case "consumed":
                    gPOrder.consumed = jsonParser.getValueAsBoolean();
                    return true;
                case "type":
                    gPOrder.type = jsonParser.getValueAsString();
                    return true;
                case "orderStatus":
                    gPOrder.orderStatus = BundleStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GPOrder gPOrder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "purchaseToken":
                case "orderId":
                case "itemId":
                case "googlePlayOrderId":
                case "consumed":
                case "type":
                case "orderStatus":
                    return true;
                default:
                    return super.parseFieldCheck(gPOrder, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPOrder gPOrder, JsonGenerator jsonGenerator) throws IOException {
            String str = gPOrder.orderId;
            if (str != null) {
                jsonGenerator.writeStringField("orderId", str);
            }
            String str2 = gPOrder.itemId;
            if (str2 != null) {
                jsonGenerator.writeStringField("itemId", str2);
            }
            if (gPOrder.orderStatus != null) {
                jsonGenerator.writeFieldName("orderStatus");
                BundleStatus.JSON_ADAPTER.serialize(gPOrder.orderStatus, jsonGenerator, true);
            }
            String str3 = gPOrder.googlePlayOrderId;
            if (str3 != null) {
                jsonGenerator.writeStringField("googlePlayOrderId", str3);
            }
            String str4 = gPOrder.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = gPOrder.purchaseToken;
            if (str5 != null) {
                jsonGenerator.writeStringField("purchaseToken", str5);
            }
            jsonGenerator.writeBooleanField("consumed", gPOrder.consumed);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPOrder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPOrder new_() {
        GPOrder gPOrder = new GPOrder();
        gPOrder.nullCheck();
        return gPOrder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPOrder mo225055clone() {
        GPOrder gPOrder = new GPOrder();
        gPOrder.orderId = this.orderId;
        gPOrder.itemId = this.itemId;
        gPOrder.orderStatus = this.orderStatus;
        gPOrder.googlePlayOrderId = this.googlePlayOrderId;
        gPOrder.type = this.type;
        gPOrder.purchaseToken = this.purchaseToken;
        gPOrder.consumed = this.consumed;
        return gPOrder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPOrder)) {
            return false;
        }
        GPOrder gPOrder = (GPOrder) obj;
        return ValueObject.util_equals(this.orderId, gPOrder.orderId) && ValueObject.util_equals(this.itemId, gPOrder.itemId) && ValueObject.util_equals(this.orderStatus, gPOrder.orderStatus) && ValueObject.util_equals(this.googlePlayOrderId, gPOrder.googlePlayOrderId) && ValueObject.util_equals(this.type, gPOrder.type) && ValueObject.util_equals(this.purchaseToken, gPOrder.purchaseToken) && this.consumed == gPOrder.consumed;
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
        String str = this.orderId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.itemId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BundleStatus bundleStatus = this.orderStatus;
        int iHashCode3 = (iHashCode2 + (bundleStatus != null ? bundleStatus.hashCode() : 0)) * 41;
        String str3 = this.googlePlayOrderId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.purchaseToken;
        int iHashCode6 = ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.consumed ? 1231 : 1237);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.orderId == null) {
            this.orderId = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.orderStatus == null) {
            this.orderStatus = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.googlePlayOrderId == null) {
            this.googlePlayOrderId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.purchaseToken == null) {
            this.purchaseToken = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
