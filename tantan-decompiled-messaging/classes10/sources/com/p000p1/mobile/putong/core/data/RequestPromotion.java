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
public class RequestPromotion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "requestpromotion";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String privilegeType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String promotionType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String selectedID;
    public static ProtobufAdapter<RequestPromotion> PROTOBUF_ADAPTER = new MessageNanoAdapter<RequestPromotion>() { // from class: com.p1.mobile.putong.core.data.RequestPromotion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RequestPromotion requestPromotion) {
            String str = requestPromotion.action;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = requestPromotion.privilegeType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = requestPromotion.selectedID;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = requestPromotion.promotionType;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) requestPromotion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RequestPromotion m15411parse(nb5 nb5Var) throws IOException {
            RequestPromotion requestPromotion = new RequestPromotion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (requestPromotion.action == null) {
                        requestPromotion.action = "";
                    }
                    if (requestPromotion.privilegeType == null) {
                        requestPromotion.privilegeType = "";
                    }
                    if (requestPromotion.selectedID == null) {
                        requestPromotion.selectedID = "";
                    }
                    if (requestPromotion.promotionType != null) {
                        break;
                    }
                    requestPromotion.promotionType = "";
                    break;
                }
                if (iU == 10) {
                    requestPromotion.action = nb5Var.s();
                } else if (iU == 18) {
                    requestPromotion.privilegeType = nb5Var.s();
                } else if (iU == 26) {
                    requestPromotion.selectedID = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (requestPromotion.action == null) {
                            requestPromotion.action = "";
                        }
                        if (requestPromotion.privilegeType == null) {
                            requestPromotion.privilegeType = "";
                        }
                        if (requestPromotion.selectedID == null) {
                            requestPromotion.selectedID = "";
                        }
                        if (requestPromotion.promotionType != null) {
                            break;
                        }
                        requestPromotion.promotionType = "";
                        return requestPromotion;
                    }
                    requestPromotion.promotionType = nb5Var.s();
                }
            }
            return requestPromotion;
        }

        public void serialize(RequestPromotion requestPromotion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = requestPromotion.action;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = requestPromotion.privilegeType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = requestPromotion.selectedID;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = requestPromotion.promotionType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<RequestPromotion> JSON_ADAPTER = new ObjectJsonAdapter<RequestPromotion>() { // from class: com.p1.mobile.putong.core.data.RequestPromotion.2
        public Class getDataClass() {
            return RequestPromotion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RequestPromotion m15412newInstance() {
            return new RequestPromotion();
        }

        public boolean parseField(RequestPromotion requestPromotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "selectedID":
                    requestPromotion.selectedID = jsonParser.getValueAsString();
                    return true;
                case "privilegeType":
                    requestPromotion.privilegeType = jsonParser.getValueAsString();
                    return true;
                case "action":
                    requestPromotion.action = jsonParser.getValueAsString();
                    return true;
                case "promotionType":
                    requestPromotion.promotionType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RequestPromotion requestPromotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "selectedID":
                case "privilegeType":
                case "action":
                case "promotionType":
                    return true;
                default:
                    return super.parseFieldCheck(requestPromotion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RequestPromotion requestPromotion, JsonGenerator jsonGenerator) throws IOException {
            String str = requestPromotion.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
            String str2 = requestPromotion.privilegeType;
            if (str2 != null) {
                jsonGenerator.writeStringField("privilegeType", str2);
            }
            String str3 = requestPromotion.selectedID;
            if (str3 != null) {
                jsonGenerator.writeStringField("selectedID", str3);
            }
            String str4 = requestPromotion.promotionType;
            if (str4 != null) {
                jsonGenerator.writeStringField("promotionType", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RequestPromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RequestPromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RequestPromotion new_() {
        RequestPromotion requestPromotion = new RequestPromotion();
        requestPromotion.nullCheck();
        return requestPromotion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RequestPromotion m15410clone() {
        RequestPromotion requestPromotion = new RequestPromotion();
        requestPromotion.action = this.action;
        requestPromotion.privilegeType = this.privilegeType;
        requestPromotion.selectedID = this.selectedID;
        requestPromotion.promotionType = this.promotionType;
        return requestPromotion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestPromotion)) {
            return false;
        }
        RequestPromotion requestPromotion = (RequestPromotion) obj;
        return ValueObject.util_equals(this.action, requestPromotion.action) && ValueObject.util_equals(this.privilegeType, requestPromotion.privilegeType) && ValueObject.util_equals(this.selectedID, requestPromotion.selectedID) && ValueObject.util_equals(this.promotionType, requestPromotion.promotionType);
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
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.privilegeType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.selectedID;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.promotionType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
        if (this.privilegeType == null) {
            this.privilegeType = "";
        }
        if (this.selectedID == null) {
            this.selectedID = "";
        }
        if (this.promotionType == null) {
            this.promotionType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
