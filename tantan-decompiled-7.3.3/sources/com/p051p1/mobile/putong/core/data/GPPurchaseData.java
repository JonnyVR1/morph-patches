package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
public class GPPurchaseData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gppurchasedata";

    @NonNull
    @ProtobufIndex(index = 6)
    public String developerPayload;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String packageName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String productId;

    @ProtobufIndex(index = 5)
    public int purchaseState;

    @ProtobufIndex(index = 4)
    public long purchaseTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String purchaseToken;
    public static ProtobufAdapter<GPPurchaseData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPPurchaseData>() { // from class: com.p1.mobile.putong.core.data.GPPurchaseData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPPurchaseData gPPurchaseData) {
            String str = gPPurchaseData.orderId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = gPPurchaseData.packageName;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = gPPurchaseData.productId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(4, gPPurchaseData.purchaseTime) + CodedOutputByteBufferNano.m17281h(5, gPPurchaseData.purchaseState);
            String str4 = gPPurchaseData.developerPayload;
            if (str4 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = gPPurchaseData.purchaseToken;
            if (str5 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            gPPurchaseData.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPPurchaseData parse(nc5 nc5Var) throws IOException {
            GPPurchaseData gPPurchaseData = new GPPurchaseData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPPurchaseData.orderId == null) {
                        gPPurchaseData.orderId = "";
                    }
                    if (gPPurchaseData.packageName == null) {
                        gPPurchaseData.packageName = "";
                    }
                    if (gPPurchaseData.productId == null) {
                        gPPurchaseData.productId = "";
                    }
                    if (gPPurchaseData.developerPayload == null) {
                        gPPurchaseData.developerPayload = "";
                    }
                    if (gPPurchaseData.purchaseToken != null) {
                        break;
                    }
                    gPPurchaseData.purchaseToken = "";
                    break;
                }
                if (iM162497u == 10) {
                    gPPurchaseData.orderId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    gPPurchaseData.packageName = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    gPPurchaseData.productId = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    gPPurchaseData.purchaseTime = nc5Var.m162487k();
                } else if (iM162497u == 40) {
                    gPPurchaseData.purchaseState = nc5Var.m162486j();
                } else if (iM162497u == 50) {
                    gPPurchaseData.developerPayload = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
                        if (gPPurchaseData.orderId == null) {
                            gPPurchaseData.orderId = "";
                        }
                        if (gPPurchaseData.packageName == null) {
                            gPPurchaseData.packageName = "";
                        }
                        if (gPPurchaseData.productId == null) {
                            gPPurchaseData.productId = "";
                        }
                        if (gPPurchaseData.developerPayload == null) {
                            gPPurchaseData.developerPayload = "";
                        }
                        if (gPPurchaseData.purchaseToken != null) {
                            break;
                        }
                        gPPurchaseData.purchaseToken = "";
                        return gPPurchaseData;
                    }
                    gPPurchaseData.purchaseToken = nc5Var.m162495s();
                }
            }
            return gPPurchaseData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPPurchaseData gPPurchaseData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPPurchaseData.orderId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = gPPurchaseData.packageName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = gPPurchaseData.productId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17307I(4, gPPurchaseData.purchaseTime);
            codedOutputByteBufferNano.m17305G(5, gPPurchaseData.purchaseState);
            String str4 = gPPurchaseData.developerPayload;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = gPPurchaseData.purchaseToken;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
        }
    };
    public static JsonAdapter<GPPurchaseData> JSON_ADAPTER = new ObjectJsonAdapter<GPPurchaseData>() { // from class: com.p1.mobile.putong.core.data.GPPurchaseData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPPurchaseData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPPurchaseData newInstance() {
            return new GPPurchaseData();
        }

        public boolean parseField(GPPurchaseData gPPurchaseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "purchaseTime":
                    gPPurchaseData.purchaseTime = jsonParser.getValueAsLong();
                    return true;
                case "purchaseState":
                    gPPurchaseData.purchaseState = jsonParser.getValueAsInt();
                    return true;
                case "purchaseToken":
                    gPPurchaseData.purchaseToken = jsonParser.getValueAsString();
                    return true;
                case "orderId":
                    gPPurchaseData.orderId = jsonParser.getValueAsString();
                    return true;
                case "productId":
                    gPPurchaseData.productId = jsonParser.getValueAsString();
                    return true;
                case "packageName":
                    gPPurchaseData.packageName = jsonParser.getValueAsString();
                    return true;
                case "developerPayload":
                    gPPurchaseData.developerPayload = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GPPurchaseData gPPurchaseData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "purchaseTime":
                case "purchaseState":
                case "purchaseToken":
                case "orderId":
                case "productId":
                case "packageName":
                case "developerPayload":
                    return true;
                default:
                    return super.parseFieldCheck(gPPurchaseData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPPurchaseData gPPurchaseData, JsonGenerator jsonGenerator) throws IOException {
            String str = gPPurchaseData.orderId;
            if (str != null) {
                jsonGenerator.writeStringField("orderId", str);
            }
            String str2 = gPPurchaseData.packageName;
            if (str2 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, str2);
            }
            String str3 = gPPurchaseData.productId;
            if (str3 != null) {
                jsonGenerator.writeStringField("productId", str3);
            }
            jsonGenerator.writeNumberField("purchaseTime", gPPurchaseData.purchaseTime);
            jsonGenerator.writeNumberField("purchaseState", gPPurchaseData.purchaseState);
            String str4 = gPPurchaseData.developerPayload;
            if (str4 != null) {
                jsonGenerator.writeStringField("developerPayload", str4);
            }
            String str5 = gPPurchaseData.purchaseToken;
            if (str5 != null) {
                jsonGenerator.writeStringField("purchaseToken", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPPurchaseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPPurchaseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPPurchaseData new_() {
        GPPurchaseData gPPurchaseData = new GPPurchaseData();
        gPPurchaseData.nullCheck();
        return gPPurchaseData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPPurchaseData mo225055clone() {
        GPPurchaseData gPPurchaseData = new GPPurchaseData();
        gPPurchaseData.orderId = this.orderId;
        gPPurchaseData.packageName = this.packageName;
        gPPurchaseData.productId = this.productId;
        gPPurchaseData.purchaseTime = this.purchaseTime;
        gPPurchaseData.purchaseState = this.purchaseState;
        gPPurchaseData.developerPayload = this.developerPayload;
        gPPurchaseData.purchaseToken = this.purchaseToken;
        return gPPurchaseData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPPurchaseData)) {
            return false;
        }
        GPPurchaseData gPPurchaseData = (GPPurchaseData) obj;
        return ValueObject.util_equals(this.orderId, gPPurchaseData.orderId) && ValueObject.util_equals(this.packageName, gPPurchaseData.packageName) && ValueObject.util_equals(this.productId, gPPurchaseData.productId) && this.purchaseTime == gPPurchaseData.purchaseTime && this.purchaseState == gPPurchaseData.purchaseState && ValueObject.util_equals(this.developerPayload, gPPurchaseData.developerPayload) && ValueObject.util_equals(this.purchaseToken, gPPurchaseData.purchaseToken);
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
        String str2 = this.packageName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.productId;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.purchaseTime;
        int i3 = (((((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.purchaseState) * 41;
        String str4 = this.developerPayload;
        int iHashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.purchaseToken;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.orderId == null) {
            this.orderId = "";
        }
        if (this.packageName == null) {
            this.packageName = "";
        }
        if (this.productId == null) {
            this.productId = "";
        }
        if (this.developerPayload == null) {
            this.developerPayload = "";
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
