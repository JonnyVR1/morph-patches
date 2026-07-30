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
public class GPSubscription extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpsubscription";

    @ProtobufIndex(index = 6)
    public long expiryTimeMillis;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String productId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String productType;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String subscriptionStatus;
    public static ProtobufAdapter<GPSubscription> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPSubscription>() { // from class: com.p1.mobile.putong.core.data.GPSubscription.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPSubscription gPSubscription) {
            String str = gPSubscription.orderId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = gPSubscription.itemId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = gPSubscription.productId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = gPSubscription.productType;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = gPSubscription.subscriptionStatus;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(6, gPSubscription.expiryTimeMillis);
            ((MessageNano) gPSubscription).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPSubscription m12883parse(nb5 nb5Var) throws IOException {
            GPSubscription gPSubscription = new GPSubscription();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPSubscription.orderId == null) {
                        gPSubscription.orderId = "";
                    }
                    if (gPSubscription.itemId == null) {
                        gPSubscription.itemId = "";
                    }
                    if (gPSubscription.productId == null) {
                        gPSubscription.productId = "";
                    }
                    if (gPSubscription.productType == null) {
                        gPSubscription.productType = "";
                    }
                    if (gPSubscription.subscriptionStatus != null) {
                        break;
                    }
                    gPSubscription.subscriptionStatus = "";
                    break;
                }
                if (iU == 10) {
                    gPSubscription.orderId = nb5Var.s();
                } else if (iU == 18) {
                    gPSubscription.itemId = nb5Var.s();
                } else if (iU == 26) {
                    gPSubscription.productId = nb5Var.s();
                } else if (iU == 34) {
                    gPSubscription.productType = nb5Var.s();
                } else if (iU == 42) {
                    gPSubscription.subscriptionStatus = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (gPSubscription.orderId == null) {
                            gPSubscription.orderId = "";
                        }
                        if (gPSubscription.itemId == null) {
                            gPSubscription.itemId = "";
                        }
                        if (gPSubscription.productId == null) {
                            gPSubscription.productId = "";
                        }
                        if (gPSubscription.productType == null) {
                            gPSubscription.productType = "";
                        }
                        if (gPSubscription.subscriptionStatus != null) {
                            break;
                        }
                        gPSubscription.subscriptionStatus = "";
                        return gPSubscription;
                    }
                    gPSubscription.expiryTimeMillis = nb5Var.k();
                }
            }
            return gPSubscription;
        }

        public void serialize(GPSubscription gPSubscription, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPSubscription.orderId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = gPSubscription.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = gPSubscription.productId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = gPSubscription.productType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = gPSubscription.subscriptionStatus;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.I(6, gPSubscription.expiryTimeMillis);
        }
    };
    public static JsonAdapter<GPSubscription> JSON_ADAPTER = new ObjectJsonAdapter<GPSubscription>() { // from class: com.p1.mobile.putong.core.data.GPSubscription.2
        public Class getDataClass() {
            return GPSubscription.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GPSubscription m12884newInstance() {
            return new GPSubscription();
        }

        public boolean parseField(GPSubscription gPSubscription, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subscriptionStatus":
                    gPSubscription.subscriptionStatus = jsonParser.getValueAsString();
                    return true;
                case "productType":
                    gPSubscription.productType = jsonParser.getValueAsString();
                    return true;
                case "orderId":
                    gPSubscription.orderId = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    gPSubscription.itemId = jsonParser.getValueAsString();
                    return true;
                case "productId":
                    gPSubscription.productId = jsonParser.getValueAsString();
                    return true;
                case "expiryTimeMillis":
                    gPSubscription.expiryTimeMillis = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GPSubscription gPSubscription, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subscriptionStatus":
                case "productType":
                case "orderId":
                case "itemId":
                case "productId":
                case "expiryTimeMillis":
                    return true;
                default:
                    return super.parseFieldCheck(gPSubscription, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GPSubscription gPSubscription, JsonGenerator jsonGenerator) throws IOException {
            String str = gPSubscription.orderId;
            if (str != null) {
                jsonGenerator.writeStringField("orderId", str);
            }
            String str2 = gPSubscription.itemId;
            if (str2 != null) {
                jsonGenerator.writeStringField("itemId", str2);
            }
            String str3 = gPSubscription.productId;
            if (str3 != null) {
                jsonGenerator.writeStringField("productId", str3);
            }
            String str4 = gPSubscription.productType;
            if (str4 != null) {
                jsonGenerator.writeStringField("productType", str4);
            }
            String str5 = gPSubscription.subscriptionStatus;
            if (str5 != null) {
                jsonGenerator.writeStringField("subscriptionStatus", str5);
            }
            jsonGenerator.writeNumberField("expiryTimeMillis", gPSubscription.expiryTimeMillis);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPSubscription) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPSubscription) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPSubscription new_() {
        GPSubscription gPSubscription = new GPSubscription();
        gPSubscription.nullCheck();
        return gPSubscription;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPSubscription m12882clone() {
        GPSubscription gPSubscription = new GPSubscription();
        gPSubscription.orderId = this.orderId;
        gPSubscription.itemId = this.itemId;
        gPSubscription.productId = this.productId;
        gPSubscription.productType = this.productType;
        gPSubscription.subscriptionStatus = this.subscriptionStatus;
        gPSubscription.expiryTimeMillis = this.expiryTimeMillis;
        return gPSubscription;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPSubscription)) {
            return false;
        }
        GPSubscription gPSubscription = (GPSubscription) obj;
        return ValueObject.util_equals(this.orderId, gPSubscription.orderId) && ValueObject.util_equals(this.itemId, gPSubscription.itemId) && ValueObject.util_equals(this.productId, gPSubscription.productId) && ValueObject.util_equals(this.productType, gPSubscription.productType) && ValueObject.util_equals(this.subscriptionStatus, gPSubscription.subscriptionStatus) && this.expiryTimeMillis == gPSubscription.expiryTimeMillis;
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
        String str2 = this.itemId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.productId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.productType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subscriptionStatus;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        long j = this.expiryTimeMillis;
        int i3 = ((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.orderId == null) {
            this.orderId = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.productId == null) {
            this.productId = "";
        }
        if (this.productType == null) {
            this.productType = "";
        }
        if (this.subscriptionStatus == null) {
            this.subscriptionStatus = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
