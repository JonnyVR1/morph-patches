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
public class TriggersActionResourceData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "triggersactionresourcedata";

    @ProtobufIndex(index = 1)
    public int code;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ResourceData data;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String message;
    public static ProtobufAdapter<TriggersActionResourceData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TriggersActionResourceData>() { // from class: com.p1.mobile.putong.core.data.TriggersActionResourceData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TriggersActionResourceData triggersActionResourceData) {
            int iH = CodedOutputByteBufferNano.h(1, triggersActionResourceData.code);
            String str = triggersActionResourceData.message;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ResourceData resourceData = triggersActionResourceData.data;
            if (resourceData != null) {
                iH += CodedOutputByteBufferNano.l(3, resourceData, ResourceData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) triggersActionResourceData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TriggersActionResourceData m16052parse(nb5 nb5Var) throws IOException {
            TriggersActionResourceData triggersActionResourceData = new TriggersActionResourceData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (triggersActionResourceData.message == null) {
                        triggersActionResourceData.message = "";
                    }
                    if (triggersActionResourceData.data != null) {
                        break;
                    }
                    triggersActionResourceData.data = ResourceData.new_();
                    break;
                }
                if (iU == 8) {
                    triggersActionResourceData.code = nb5Var.j();
                } else if (iU == 18) {
                    triggersActionResourceData.message = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (triggersActionResourceData.message == null) {
                            triggersActionResourceData.message = "";
                        }
                        if (triggersActionResourceData.data != null) {
                            break;
                        }
                        triggersActionResourceData.data = ResourceData.new_();
                        return triggersActionResourceData;
                    }
                    triggersActionResourceData.data = (ResourceData) nb5Var.l(ResourceData.PROTOBUF_ADAPTER);
                }
            }
            return triggersActionResourceData;
        }

        public void serialize(TriggersActionResourceData triggersActionResourceData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, triggersActionResourceData.code);
            String str = triggersActionResourceData.message;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            ResourceData resourceData = triggersActionResourceData.data;
            if (resourceData != null) {
                codedOutputByteBufferNano.K(3, resourceData, ResourceData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TriggersActionResourceData> JSON_ADAPTER = new ObjectJsonAdapter<TriggersActionResourceData>() { // from class: com.p1.mobile.putong.core.data.TriggersActionResourceData.2
        public Class getDataClass() {
            return TriggersActionResourceData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TriggersActionResourceData m16053newInstance() {
            return new TriggersActionResourceData();
        }

        public boolean parseField(TriggersActionResourceData triggersActionResourceData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "code":
                    triggersActionResourceData.code = jsonParser.getValueAsInt();
                    return true;
                case "data":
                    triggersActionResourceData.data = (ResourceData) ResourceData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "message":
                    triggersActionResourceData.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TriggersActionResourceData triggersActionResourceData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "code":
                case "data":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(triggersActionResourceData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TriggersActionResourceData triggersActionResourceData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", triggersActionResourceData.code);
            String str = triggersActionResourceData.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            if (triggersActionResourceData.data != null) {
                jsonGenerator.writeFieldName("data");
                ResourceData.JSON_ADAPTER.serialize(triggersActionResourceData.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggersActionResourceData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggersActionResourceData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TriggersActionResourceData new_() {
        TriggersActionResourceData triggersActionResourceData = new TriggersActionResourceData();
        triggersActionResourceData.nullCheck();
        return triggersActionResourceData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TriggersActionResourceData m16051clone() {
        TriggersActionResourceData triggersActionResourceData = new TriggersActionResourceData();
        triggersActionResourceData.code = this.code;
        triggersActionResourceData.message = this.message;
        ResourceData resourceData = this.data;
        if (resourceData != null) {
            triggersActionResourceData.data = resourceData.m15418clone();
        }
        return triggersActionResourceData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggersActionResourceData)) {
            return false;
        }
        TriggersActionResourceData triggersActionResourceData = (TriggersActionResourceData) obj;
        return this.code == triggersActionResourceData.code && ValueObject.util_equals(this.message, triggersActionResourceData.message) && ValueObject.util_equals(this.data, triggersActionResourceData.data);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.code) * 41;
        String str = this.message;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        ResourceData resourceData = this.data;
        int iHashCode2 = iHashCode + (resourceData != null ? resourceData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
        if (this.data == null) {
            this.data = ResourceData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
