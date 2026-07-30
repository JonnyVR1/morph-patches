package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class GPSubscription extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpsubscription";

    @ProtobufIndex(index = 6)
    public long expiryTimeMillis;

    @NonNull
    @ProtobufIndex(index = 2)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String productId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String productType;

    @NonNull
    @ProtobufIndex(index = 5)
    public String subscriptionStatus;
    public static ProtobufAdapter<GPSubscription> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPSubscription>() { // from class: com.p1.mobile.putong.core.data.GPSubscription.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPSubscription gPSubscription) {
            String str = gPSubscription.orderId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = gPSubscription.itemId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = gPSubscription.productId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = gPSubscription.productType;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = gPSubscription.subscriptionStatus;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(6, gPSubscription.expiryTimeMillis);
            gPSubscription.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPSubscription parse(nb5 nb5Var) throws IOException {
            GPSubscription gPSubscription = new GPSubscription();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    gPSubscription.orderId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    gPSubscription.itemId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    gPSubscription.productId = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    gPSubscription.productType = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    gPSubscription.subscriptionStatus = nb5Var.m158750s();
                } else {
                    if (iM158752u != 48) {
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
                    gPSubscription.expiryTimeMillis = nb5Var.m158742k();
                }
            }
            return gPSubscription;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPSubscription gPSubscription, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPSubscription.orderId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = gPSubscription.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = gPSubscription.productId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = gPSubscription.productType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = gPSubscription.subscriptionStatus;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            codedOutputByteBufferNano.m17252I(6, gPSubscription.expiryTimeMillis);
        }
    };
    public static JsonAdapter<GPSubscription> JSON_ADAPTER = new ObjectJsonAdapter<GPSubscription>() { // from class: com.p1.mobile.putong.core.data.GPSubscription.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPSubscription.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPSubscription newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPSubscription) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPSubscription) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPSubscription new_() {
        GPSubscription gPSubscription = new GPSubscription();
        gPSubscription.nullCheck();
        return gPSubscription;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPSubscription mo223809clone() {
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
        String str3 = this.productId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.productType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subscriptionStatus;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        long j = this.expiryTimeMillis;
        int i3 = ((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
