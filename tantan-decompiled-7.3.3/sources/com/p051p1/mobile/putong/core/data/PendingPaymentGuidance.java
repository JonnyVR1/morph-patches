package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes10.dex */
public class PendingPaymentGuidance extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pendingpaymentguidance";

    @NonNull
    @ProtobufIndex(index = 7)
    public String discountToken;

    @ProtobufIndex(index = 10)
    public long endTime;

    @NonNull
    @ProtobufIndex(index = 9)
    public String guideType;

    @NonNull
    @ProtobufIndex(index = 8)
    public String identifier;

    @NonNull
    @ProtobufIndex(index = 6)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String method;

    @NonNull
    @ProtobufIndex(index = 4)
    public String paymentFailMsg;

    @NonNull
    @ProtobufIndex(index = 1)
    public String platform;

    @NonNull
    @ProtobufIndex(index = 3)
    public String productType;

    @ProtobufIndex(index = 5)
    public long remainingTime;
    public static ProtobufAdapter<PendingPaymentGuidance> PROTOBUF_ADAPTER = new MessageNanoAdapter<PendingPaymentGuidance>() { // from class: com.p1.mobile.putong.core.data.PendingPaymentGuidance.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PendingPaymentGuidance pendingPaymentGuidance) {
            String str = pendingPaymentGuidance.platform;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = pendingPaymentGuidance.method;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = pendingPaymentGuidance.productType;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = pendingPaymentGuidance.paymentFailMsg;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(5, pendingPaymentGuidance.remainingTime);
            String str5 = pendingPaymentGuidance.itemId;
            if (str5 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            String str6 = pendingPaymentGuidance.discountToken;
            if (str6 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            String str7 = pendingPaymentGuidance.identifier;
            if (str7 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(8, str7);
            }
            String str8 = pendingPaymentGuidance.guideType;
            if (str8 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(9, str8);
            }
            int iM17283j2 = iM17283j + CodedOutputByteBufferNano.m17283j(10, pendingPaymentGuidance.endTime);
            pendingPaymentGuidance.cachedSize = iM17283j2;
            return iM17283j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PendingPaymentGuidance parse(nc5 nc5Var) throws IOException {
            PendingPaymentGuidance pendingPaymentGuidance = new PendingPaymentGuidance();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (pendingPaymentGuidance.platform == null) {
                            pendingPaymentGuidance.platform = "";
                        }
                        if (pendingPaymentGuidance.method == null) {
                            pendingPaymentGuidance.method = "";
                        }
                        if (pendingPaymentGuidance.productType == null) {
                            pendingPaymentGuidance.productType = "";
                        }
                        if (pendingPaymentGuidance.paymentFailMsg == null) {
                            pendingPaymentGuidance.paymentFailMsg = "";
                        }
                        if (pendingPaymentGuidance.itemId == null) {
                            pendingPaymentGuidance.itemId = "";
                        }
                        if (pendingPaymentGuidance.discountToken == null) {
                            pendingPaymentGuidance.discountToken = "";
                        }
                        if (pendingPaymentGuidance.identifier == null) {
                            pendingPaymentGuidance.identifier = "";
                        }
                        if (pendingPaymentGuidance.guideType == null) {
                            pendingPaymentGuidance.guideType = "";
                        }
                        break;
                    case 10:
                        pendingPaymentGuidance.platform = nc5Var.m162495s();
                        continue;
                    case 18:
                        pendingPaymentGuidance.method = nc5Var.m162495s();
                        continue;
                    case 26:
                        pendingPaymentGuidance.productType = nc5Var.m162495s();
                        continue;
                    case 34:
                        pendingPaymentGuidance.paymentFailMsg = nc5Var.m162495s();
                        continue;
                    case 40:
                        pendingPaymentGuidance.remainingTime = nc5Var.m162487k();
                        continue;
                    case 50:
                        pendingPaymentGuidance.itemId = nc5Var.m162495s();
                        continue;
                    case 58:
                        pendingPaymentGuidance.discountToken = nc5Var.m162495s();
                        continue;
                    case 66:
                        pendingPaymentGuidance.identifier = nc5Var.m162495s();
                        continue;
                    case 74:
                        pendingPaymentGuidance.guideType = nc5Var.m162495s();
                        continue;
                    case 80:
                        pendingPaymentGuidance.endTime = nc5Var.m162487k();
                        continue;
                    default:
                        if (pendingPaymentGuidance.platform == null) {
                            pendingPaymentGuidance.platform = "";
                        }
                        if (pendingPaymentGuidance.method == null) {
                            pendingPaymentGuidance.method = "";
                        }
                        if (pendingPaymentGuidance.productType == null) {
                            pendingPaymentGuidance.productType = "";
                        }
                        if (pendingPaymentGuidance.paymentFailMsg == null) {
                            pendingPaymentGuidance.paymentFailMsg = "";
                        }
                        if (pendingPaymentGuidance.itemId == null) {
                            pendingPaymentGuidance.itemId = "";
                        }
                        if (pendingPaymentGuidance.discountToken == null) {
                            pendingPaymentGuidance.discountToken = "";
                        }
                        if (pendingPaymentGuidance.identifier == null) {
                            pendingPaymentGuidance.identifier = "";
                        }
                        if (pendingPaymentGuidance.guideType == null) {
                            pendingPaymentGuidance.guideType = "";
                            return pendingPaymentGuidance;
                        }
                        break;
                }
            }
            return pendingPaymentGuidance;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PendingPaymentGuidance pendingPaymentGuidance, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pendingPaymentGuidance.platform;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = pendingPaymentGuidance.method;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = pendingPaymentGuidance.productType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = pendingPaymentGuidance.paymentFailMsg;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17307I(5, pendingPaymentGuidance.remainingTime);
            String str5 = pendingPaymentGuidance.itemId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            String str6 = pendingPaymentGuidance.discountToken;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
            String str7 = pendingPaymentGuidance.identifier;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(8, str7);
            }
            String str8 = pendingPaymentGuidance.guideType;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(9, str8);
            }
            codedOutputByteBufferNano.m17307I(10, pendingPaymentGuidance.endTime);
        }
    };
    public static JsonAdapter<PendingPaymentGuidance> JSON_ADAPTER = new ObjectJsonAdapter<PendingPaymentGuidance>() { // from class: com.p1.mobile.putong.core.data.PendingPaymentGuidance.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PendingPaymentGuidance.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PendingPaymentGuidance newInstance() {
            return new PendingPaymentGuidance();
        }

        public boolean parseField(PendingPaymentGuidance pendingPaymentGuidance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "paymentFailMsg":
                    pendingPaymentGuidance.paymentFailMsg = jsonParser.getValueAsString();
                    return true;
                case "guideType":
                    pendingPaymentGuidance.guideType = jsonParser.getValueAsString();
                    return true;
                case "identifier":
                    pendingPaymentGuidance.identifier = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    pendingPaymentGuidance.endTime = jsonParser.getValueAsLong();
                    return true;
                case "productType":
                    pendingPaymentGuidance.productType = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    pendingPaymentGuidance.itemId = jsonParser.getValueAsString();
                    return true;
                case "method":
                    pendingPaymentGuidance.method = jsonParser.getValueAsString();
                    return true;
                case "discountToken":
                    pendingPaymentGuidance.discountToken = jsonParser.getValueAsString();
                    return true;
                case "remainingTime":
                    pendingPaymentGuidance.remainingTime = jsonParser.getValueAsLong();
                    return true;
                case "platform":
                    pendingPaymentGuidance.platform = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PendingPaymentGuidance pendingPaymentGuidance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "paymentFailMsg":
                case "guideType":
                case "identifier":
                case "endTime":
                case "productType":
                case "itemId":
                case "method":
                case "discountToken":
                case "remainingTime":
                case "platform":
                    return true;
                default:
                    return super.parseFieldCheck(pendingPaymentGuidance, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PendingPaymentGuidance pendingPaymentGuidance, JsonGenerator jsonGenerator) throws IOException {
            String str = pendingPaymentGuidance.platform;
            if (str != null) {
                jsonGenerator.writeStringField("platform", str);
            }
            String str2 = pendingPaymentGuidance.method;
            if (str2 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.METHOD, str2);
            }
            String str3 = pendingPaymentGuidance.productType;
            if (str3 != null) {
                jsonGenerator.writeStringField("productType", str3);
            }
            String str4 = pendingPaymentGuidance.paymentFailMsg;
            if (str4 != null) {
                jsonGenerator.writeStringField("paymentFailMsg", str4);
            }
            jsonGenerator.writeNumberField("remainingTime", pendingPaymentGuidance.remainingTime);
            String str5 = pendingPaymentGuidance.itemId;
            if (str5 != null) {
                jsonGenerator.writeStringField("itemId", str5);
            }
            String str6 = pendingPaymentGuidance.discountToken;
            if (str6 != null) {
                jsonGenerator.writeStringField("discountToken", str6);
            }
            String str7 = pendingPaymentGuidance.identifier;
            if (str7 != null) {
                jsonGenerator.writeStringField("identifier", str7);
            }
            String str8 = pendingPaymentGuidance.guideType;
            if (str8 != null) {
                jsonGenerator.writeStringField("guideType", str8);
            }
            jsonGenerator.writeNumberField("endTime", pendingPaymentGuidance.endTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PendingPaymentGuidance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PendingPaymentGuidance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PendingPaymentGuidance new_() {
        PendingPaymentGuidance pendingPaymentGuidance = new PendingPaymentGuidance();
        pendingPaymentGuidance.nullCheck();
        return pendingPaymentGuidance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PendingPaymentGuidance mo225055clone() {
        PendingPaymentGuidance pendingPaymentGuidance = new PendingPaymentGuidance();
        pendingPaymentGuidance.platform = this.platform;
        pendingPaymentGuidance.method = this.method;
        pendingPaymentGuidance.productType = this.productType;
        pendingPaymentGuidance.paymentFailMsg = this.paymentFailMsg;
        pendingPaymentGuidance.remainingTime = this.remainingTime;
        pendingPaymentGuidance.itemId = this.itemId;
        pendingPaymentGuidance.discountToken = this.discountToken;
        pendingPaymentGuidance.identifier = this.identifier;
        pendingPaymentGuidance.guideType = this.guideType;
        pendingPaymentGuidance.endTime = this.endTime;
        return pendingPaymentGuidance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PendingPaymentGuidance)) {
            return false;
        }
        PendingPaymentGuidance pendingPaymentGuidance = (PendingPaymentGuidance) obj;
        return ValueObject.util_equals(this.platform, pendingPaymentGuidance.platform) && ValueObject.util_equals(this.method, pendingPaymentGuidance.method) && ValueObject.util_equals(this.productType, pendingPaymentGuidance.productType) && ValueObject.util_equals(this.paymentFailMsg, pendingPaymentGuidance.paymentFailMsg) && this.remainingTime == pendingPaymentGuidance.remainingTime && ValueObject.util_equals(this.itemId, pendingPaymentGuidance.itemId) && ValueObject.util_equals(this.discountToken, pendingPaymentGuidance.discountToken) && ValueObject.util_equals(this.identifier, pendingPaymentGuidance.identifier) && ValueObject.util_equals(this.guideType, pendingPaymentGuidance.guideType) && this.endTime == pendingPaymentGuidance.endTime;
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
        String str = this.platform;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.method;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.productType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.paymentFailMsg;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long j = this.remainingTime;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str5 = this.itemId;
        int iHashCode5 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.discountToken;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.identifier;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.guideType;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        long j2 = this.endTime;
        int i4 = iHashCode8 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.method == null) {
            this.method = "";
        }
        if (this.productType == null) {
            this.productType = "";
        }
        if (this.paymentFailMsg == null) {
            this.paymentFailMsg = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.discountToken == null) {
            this.discountToken = "";
        }
        if (this.identifier == null) {
            this.identifier = "";
        }
        if (this.guideType == null) {
            this.guideType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
