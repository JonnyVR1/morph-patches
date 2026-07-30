package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ResourceData;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ResourceData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "resourcedata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String business;

    @NonNull
    @ProtobufIndex(index = 4)
    public ResourceDataCard card;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String gid;

    @ProtobufIndex(index = 6)
    public int insertOffsetPosition;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> pendingDelete;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceKey;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String ruleKey;
    public static ProtobufAdapter<ResourceData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ResourceData>() { // from class: com.p1.mobile.putong.core.data.ResourceData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ResourceData resourceData) {
            String str = resourceData.resourceKey;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = resourceData.business;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = resourceData.ruleKey;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ResourceDataCard resourceDataCard = resourceData.card;
            if (resourceDataCard != null) {
                iO += CodedOutputByteBufferNano.l(4, resourceDataCard, ResourceDataCard.PROTOBUF_ADAPTER);
            }
            String str4 = resourceData.gid;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            int iH = iO + CodedOutputByteBufferNano.h(6, resourceData.insertOffsetPosition);
            List<String> list = resourceData.pendingDelete;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(7, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) resourceData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ResourceData m15419parse(nb5 nb5Var) throws IOException {
            ResourceData resourceData = new ResourceData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (resourceData.resourceKey == null) {
                        resourceData.resourceKey = "";
                    }
                    if (resourceData.business == null) {
                        resourceData.business = "";
                    }
                    if (resourceData.ruleKey == null) {
                        resourceData.ruleKey = "";
                    }
                    if (resourceData.card == null) {
                        resourceData.card = ResourceDataCard.new_();
                    }
                    if (resourceData.gid == null) {
                        resourceData.gid = "";
                    }
                    if (resourceData.pendingDelete != null) {
                        break;
                    }
                    resourceData.pendingDelete = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    resourceData.resourceKey = nb5Var.s();
                } else if (iU == 18) {
                    resourceData.business = nb5Var.s();
                } else if (iU == 26) {
                    resourceData.ruleKey = nb5Var.s();
                } else if (iU == 34) {
                    resourceData.card = (ResourceDataCard) nb5Var.l(ResourceDataCard.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    resourceData.gid = nb5Var.s();
                } else if (iU == 48) {
                    resourceData.insertOffsetPosition = nb5Var.j();
                } else {
                    if (iU != 58) {
                        if (resourceData.resourceKey == null) {
                            resourceData.resourceKey = "";
                        }
                        if (resourceData.business == null) {
                            resourceData.business = "";
                        }
                        if (resourceData.ruleKey == null) {
                            resourceData.ruleKey = "";
                        }
                        if (resourceData.card == null) {
                            resourceData.card = ResourceDataCard.new_();
                        }
                        if (resourceData.gid == null) {
                            resourceData.gid = "";
                        }
                        if (resourceData.pendingDelete != null) {
                            break;
                        }
                        resourceData.pendingDelete = new ArrayList();
                        return resourceData;
                    }
                    resourceData.pendingDelete = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return resourceData;
        }

        public void serialize(ResourceData resourceData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = resourceData.resourceKey;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = resourceData.business;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = resourceData.ruleKey;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            ResourceDataCard resourceDataCard = resourceData.card;
            if (resourceDataCard != null) {
                codedOutputByteBufferNano.K(4, resourceDataCard, ResourceDataCard.PROTOBUF_ADAPTER);
            }
            String str4 = resourceData.gid;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            codedOutputByteBufferNano.G(6, resourceData.insertOffsetPosition);
            List<String> list = resourceData.pendingDelete;
            if (list != null) {
                codedOutputByteBufferNano.K(7, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ResourceData> JSON_ADAPTER = new ObjectJsonAdapter<ResourceData>() { // from class: com.p1.mobile.putong.core.data.ResourceData.2
        public Class getDataClass() {
            return ResourceData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ResourceData m15420newInstance() {
            return new ResourceData();
        }

        public boolean parseField(ResourceData resourceData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "business":
                    resourceData.business = jsonParser.getValueAsString();
                    return true;
                case "pendingDelete":
                    resourceData.pendingDelete = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gid":
                    resourceData.gid = jsonParser.getValueAsString();
                    return true;
                case "card":
                    resourceData.card = (ResourceDataCard) ResourceDataCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "insertOffsetPosition":
                    resourceData.insertOffsetPosition = jsonParser.getValueAsInt();
                    return true;
                case "resourceKey":
                    resourceData.resourceKey = jsonParser.getValueAsString();
                    return true;
                case "ruleKey":
                    resourceData.ruleKey = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ResourceData resourceData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "business":
                case "pendingDelete":
                case "gid":
                case "card":
                case "insertOffsetPosition":
                case "resourceKey":
                case "ruleKey":
                    return true;
                default:
                    return super.parseFieldCheck(resourceData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ResourceData resourceData, JsonGenerator jsonGenerator) throws IOException {
            String str = resourceData.resourceKey;
            if (str != null) {
                jsonGenerator.writeStringField("resourceKey", str);
            }
            String str2 = resourceData.business;
            if (str2 != null) {
                jsonGenerator.writeStringField("business", str2);
            }
            String str3 = resourceData.ruleKey;
            if (str3 != null) {
                jsonGenerator.writeStringField("ruleKey", str3);
            }
            if (resourceData.card != null) {
                jsonGenerator.writeFieldName("card");
                ResourceDataCard.JSON_ADAPTER.serialize(resourceData.card, jsonGenerator, true);
            }
            String str4 = resourceData.gid;
            if (str4 != null) {
                jsonGenerator.writeStringField("gid", str4);
            }
            jsonGenerator.writeNumberField("insertOffsetPosition", resourceData.insertOffsetPosition);
            if (resourceData.pendingDelete != null) {
                jsonGenerator.writeFieldName("pendingDelete");
                JsonAdapter.serializeArray(resourceData.pendingDelete, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ResourceData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ResourceData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m624a(String str) {
        return str;
    }

    public static ResourceData new_() {
        ResourceData resourceData = new ResourceData();
        resourceData.nullCheck();
        return resourceData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ResourceData m15418clone() {
        ResourceData resourceData = new ResourceData();
        resourceData.resourceKey = this.resourceKey;
        resourceData.business = this.business;
        resourceData.ruleKey = this.ruleKey;
        ResourceDataCard resourceDataCard = this.card;
        if (resourceDataCard != null) {
            resourceData.card = resourceDataCard.m15422clone();
        }
        resourceData.gid = this.gid;
        resourceData.insertOffsetPosition = this.insertOffsetPosition;
        List<String> list = this.pendingDelete;
        if (list != null) {
            resourceData.pendingDelete = ValueObject.util_map(list, new w9j() { // from class: l.vvc0
                public final Object call(Object obj) {
                    return ResourceData.m624a((String) obj);
                }
            });
        }
        return resourceData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceData)) {
            return false;
        }
        ResourceData resourceData = (ResourceData) obj;
        return ValueObject.util_equals(this.resourceKey, resourceData.resourceKey) && ValueObject.util_equals(this.business, resourceData.business) && ValueObject.util_equals(this.ruleKey, resourceData.ruleKey) && ValueObject.util_equals(this.card, resourceData.card) && ValueObject.util_equals(this.gid, resourceData.gid) && this.insertOffsetPosition == resourceData.insertOffsetPosition && ValueObject.util_equals(this.pendingDelete, resourceData.pendingDelete);
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
        String str = this.resourceKey;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.business;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.ruleKey;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        ResourceDataCard resourceDataCard = this.card;
        int iHashCode4 = (iHashCode3 + (resourceDataCard != null ? resourceDataCard.hashCode() : 0)) * 41;
        String str4 = this.gid;
        int iHashCode5 = (((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.insertOffsetPosition) * 41;
        List<String> list = this.pendingDelete;
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.resourceKey == null) {
            this.resourceKey = "";
        }
        if (this.business == null) {
            this.business = "";
        }
        if (this.ruleKey == null) {
            this.ruleKey = "";
        }
        if (this.card == null) {
            this.card = ResourceDataCard.new_();
        }
        if (this.gid == null) {
            this.gid = "";
        }
        if (this.pendingDelete == null) {
            this.pendingDelete = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
