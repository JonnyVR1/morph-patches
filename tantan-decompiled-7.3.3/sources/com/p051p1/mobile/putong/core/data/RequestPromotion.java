package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class RequestPromotion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "requestpromotion";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;

    @NonNull
    @ProtobufIndex(index = 2)
    public String privilegeType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String promotionType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String selectedID;
    public static ProtobufAdapter<RequestPromotion> PROTOBUF_ADAPTER = new MessageNanoAdapter<RequestPromotion>() { // from class: com.p1.mobile.putong.core.data.RequestPromotion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RequestPromotion requestPromotion) {
            String str = requestPromotion.action;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = requestPromotion.privilegeType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = requestPromotion.selectedID;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = requestPromotion.promotionType;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            requestPromotion.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RequestPromotion parse(nc5 nc5Var) throws IOException {
            RequestPromotion requestPromotion = new RequestPromotion();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    requestPromotion.action = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    requestPromotion.privilegeType = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    requestPromotion.selectedID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
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
                    requestPromotion.promotionType = nc5Var.m162495s();
                }
            }
            return requestPromotion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RequestPromotion requestPromotion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = requestPromotion.action;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = requestPromotion.privilegeType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = requestPromotion.selectedID;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = requestPromotion.promotionType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<RequestPromotion> JSON_ADAPTER = new ObjectJsonAdapter<RequestPromotion>() { // from class: com.p1.mobile.putong.core.data.RequestPromotion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RequestPromotion.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RequestPromotion newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RequestPromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RequestPromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RequestPromotion new_() {
        RequestPromotion requestPromotion = new RequestPromotion();
        requestPromotion.nullCheck();
        return requestPromotion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RequestPromotion mo225055clone() {
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
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.privilegeType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.selectedID;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.promotionType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
