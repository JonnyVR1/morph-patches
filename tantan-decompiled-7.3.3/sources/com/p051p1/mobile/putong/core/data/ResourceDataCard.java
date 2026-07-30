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
public class ResourceDataCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "resourcedatacard";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cardType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String data;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userID;
    public static ProtobufAdapter<ResourceDataCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<ResourceDataCard>() { // from class: com.p1.mobile.putong.core.data.ResourceDataCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ResourceDataCard resourceDataCard) {
            String str = resourceDataCard.cardType;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = resourceDataCard.data;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = resourceDataCard.userID;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = resourceDataCard.url;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            resourceDataCard.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ResourceDataCard parse(nc5 nc5Var) throws IOException {
            ResourceDataCard resourceDataCard = new ResourceDataCard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (resourceDataCard.cardType == null) {
                        resourceDataCard.cardType = "";
                    }
                    if (resourceDataCard.data == null) {
                        resourceDataCard.data = "";
                    }
                    if (resourceDataCard.userID == null) {
                        resourceDataCard.userID = "";
                    }
                    if (resourceDataCard.url != null) {
                        break;
                    }
                    resourceDataCard.url = "";
                    break;
                }
                if (iM162497u == 10) {
                    resourceDataCard.cardType = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    resourceDataCard.data = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    resourceDataCard.userID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (resourceDataCard.cardType == null) {
                            resourceDataCard.cardType = "";
                        }
                        if (resourceDataCard.data == null) {
                            resourceDataCard.data = "";
                        }
                        if (resourceDataCard.userID == null) {
                            resourceDataCard.userID = "";
                        }
                        if (resourceDataCard.url != null) {
                            break;
                        }
                        resourceDataCard.url = "";
                        return resourceDataCard;
                    }
                    resourceDataCard.url = nc5Var.m162495s();
                }
            }
            return resourceDataCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ResourceDataCard resourceDataCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = resourceDataCard.cardType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = resourceDataCard.data;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = resourceDataCard.userID;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = resourceDataCard.url;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<ResourceDataCard> JSON_ADAPTER = new ObjectJsonAdapter<ResourceDataCard>() { // from class: com.p1.mobile.putong.core.data.ResourceDataCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ResourceDataCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ResourceDataCard newInstance() {
            return new ResourceDataCard();
        }

        public boolean parseField(ResourceDataCard resourceDataCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userID":
                    resourceDataCard.userID = jsonParser.getValueAsString();
                    return true;
                case "cardType":
                    resourceDataCard.cardType = jsonParser.getValueAsString();
                    return true;
                case "url":
                    resourceDataCard.url = jsonParser.getValueAsString();
                    return true;
                case "data":
                    resourceDataCard.data = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ResourceDataCard resourceDataCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userID":
                case "cardType":
                case "url":
                case "data":
                    return true;
                default:
                    return super.parseFieldCheck(resourceDataCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ResourceDataCard resourceDataCard, JsonGenerator jsonGenerator) throws IOException {
            String str = resourceDataCard.cardType;
            if (str != null) {
                jsonGenerator.writeStringField("cardType", str);
            }
            String str2 = resourceDataCard.data;
            if (str2 != null) {
                jsonGenerator.writeStringField("data", str2);
            }
            String str3 = resourceDataCard.userID;
            if (str3 != null) {
                jsonGenerator.writeStringField("userID", str3);
            }
            String str4 = resourceDataCard.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ResourceDataCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ResourceDataCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ResourceDataCard new_() {
        ResourceDataCard resourceDataCard = new ResourceDataCard();
        resourceDataCard.nullCheck();
        return resourceDataCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ResourceDataCard mo225055clone() {
        ResourceDataCard resourceDataCard = new ResourceDataCard();
        resourceDataCard.cardType = this.cardType;
        resourceDataCard.data = this.data;
        resourceDataCard.userID = this.userID;
        resourceDataCard.url = this.url;
        return resourceDataCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceDataCard)) {
            return false;
        }
        ResourceDataCard resourceDataCard = (ResourceDataCard) obj;
        return ValueObject.util_equals(this.cardType, resourceDataCard.cardType) && ValueObject.util_equals(this.data, resourceDataCard.data) && ValueObject.util_equals(this.userID, resourceDataCard.userID) && ValueObject.util_equals(this.url, resourceDataCard.url);
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
        String str = this.cardType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.data;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userID;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cardType == null) {
            this.cardType = "";
        }
        if (this.data == null) {
            this.data = "";
        }
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
