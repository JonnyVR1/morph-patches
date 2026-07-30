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
public class ResourceDataCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "resourcedatacard";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cardType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String data;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String userID;
    public static ProtobufAdapter<ResourceDataCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<ResourceDataCard>() { // from class: com.p1.mobile.putong.core.data.ResourceDataCard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ResourceDataCard resourceDataCard) {
            String str = resourceDataCard.cardType;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = resourceDataCard.data;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = resourceDataCard.userID;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = resourceDataCard.url;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) resourceDataCard).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ResourceDataCard m15423parse(nb5 nb5Var) throws IOException {
            ResourceDataCard resourceDataCard = new ResourceDataCard();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    resourceDataCard.cardType = nb5Var.s();
                } else if (iU == 18) {
                    resourceDataCard.data = nb5Var.s();
                } else if (iU == 26) {
                    resourceDataCard.userID = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    resourceDataCard.url = nb5Var.s();
                }
            }
            return resourceDataCard;
        }

        public void serialize(ResourceDataCard resourceDataCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = resourceDataCard.cardType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = resourceDataCard.data;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = resourceDataCard.userID;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = resourceDataCard.url;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<ResourceDataCard> JSON_ADAPTER = new ObjectJsonAdapter<ResourceDataCard>() { // from class: com.p1.mobile.putong.core.data.ResourceDataCard.2
        public Class getDataClass() {
            return ResourceDataCard.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ResourceDataCard m15424newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ResourceDataCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ResourceDataCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ResourceDataCard new_() {
        ResourceDataCard resourceDataCard = new ResourceDataCard();
        resourceDataCard.nullCheck();
        return resourceDataCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ResourceDataCard m15422clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
