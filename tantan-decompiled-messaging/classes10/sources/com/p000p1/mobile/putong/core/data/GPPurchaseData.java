package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GPPurchaseData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gppurchasedata";

    @NonNull
    @ProtobufIndex(index = 6)
    public String developerPayload;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String packageName;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String productId;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int purchaseState;

    @ProtobufIndex(index = 4)
    public long purchaseTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String purchaseToken;
    public static ProtobufAdapter<GPPurchaseData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPPurchaseData>() { // from class: com.p1.mobile.putong.core.data.GPPurchaseData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPPurchaseData gPPurchaseData) {
            String str = gPPurchaseData.orderId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = gPPurchaseData.packageName;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = gPPurchaseData.productId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(4, gPPurchaseData.purchaseTime) + CodedOutputByteBufferNano.h(5, gPPurchaseData.purchaseState);
            String str4 = gPPurchaseData.developerPayload;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = gPPurchaseData.purchaseToken;
            if (str5 != null) {
                iJ += CodedOutputByteBufferNano.o(7, str5);
            }
            ((MessageNano) gPPurchaseData).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPPurchaseData m12879parse(nb5 nb5Var) throws IOException {
            GPPurchaseData gPPurchaseData = new GPPurchaseData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    gPPurchaseData.orderId = nb5Var.s();
                } else if (iU == 18) {
                    gPPurchaseData.packageName = nb5Var.s();
                } else if (iU == 26) {
                    gPPurchaseData.productId = nb5Var.s();
                } else if (iU == 32) {
                    gPPurchaseData.purchaseTime = nb5Var.k();
                } else if (iU == 40) {
                    gPPurchaseData.purchaseState = nb5Var.j();
                } else if (iU == 50) {
                    gPPurchaseData.developerPayload = nb5Var.s();
                } else {
                    if (iU != 58) {
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
                    gPPurchaseData.purchaseToken = nb5Var.s();
                }
            }
            return gPPurchaseData;
        }

        public void serialize(GPPurchaseData gPPurchaseData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPPurchaseData.orderId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = gPPurchaseData.packageName;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = gPPurchaseData.productId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.I(4, gPPurchaseData.purchaseTime);
            codedOutputByteBufferNano.G(5, gPPurchaseData.purchaseState);
            String str4 = gPPurchaseData.developerPayload;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = gPPurchaseData.purchaseToken;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
        }
    };
    public static JsonAdapter<GPPurchaseData> JSON_ADAPTER = new ObjectJsonAdapter<GPPurchaseData>() { // from class: com.p1.mobile.putong.core.data.GPPurchaseData.2
        public Class getDataClass() {
            return GPPurchaseData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GPPurchaseData m12880newInstance() {
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

        public void serializeFields(GPPurchaseData gPPurchaseData, JsonGenerator jsonGenerator) throws IOException {
            String str = gPPurchaseData.orderId;
            if (str != null) {
                jsonGenerator.writeStringField("orderId", str);
            }
            String str2 = gPPurchaseData.packageName;
            if (str2 != null) {
                jsonGenerator.writeStringField("packageName", str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPPurchaseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPPurchaseData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPPurchaseData new_() {
        GPPurchaseData gPPurchaseData = new GPPurchaseData();
        gPPurchaseData.nullCheck();
        return gPPurchaseData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPPurchaseData m12878clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
