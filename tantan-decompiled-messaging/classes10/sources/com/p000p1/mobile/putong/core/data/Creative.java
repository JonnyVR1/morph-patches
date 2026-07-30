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
public class Creative extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creative";

    @NonNull
    @ProtobufIndex(index = 4)
    public CreativeData data;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f43id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public CreativePosition position;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public CreativeTemplate template;
    public static ProtobufAdapter<Creative> PROTOBUF_ADAPTER = new MessageNanoAdapter<Creative>() { // from class: com.p1.mobile.putong.core.data.Creative.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Creative creative) {
            String str = creative.f43id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            CreativePosition creativePosition = creative.position;
            if (creativePosition != null) {
                iO += CodedOutputByteBufferNano.l(2, creativePosition, CreativePosition.PROTOBUF_ADAPTER);
            }
            CreativeTemplate creativeTemplate = creative.template;
            if (creativeTemplate != null) {
                iO += CodedOutputByteBufferNano.l(3, creativeTemplate, CreativeTemplate.PROTOBUF_ADAPTER);
            }
            CreativeData creativeData = creative.data;
            if (creativeData != null) {
                iO += CodedOutputByteBufferNano.l(4, creativeData, CreativeData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) creative).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Creative m12547parse(nb5 nb5Var) throws IOException {
            Creative creative = new Creative();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (creative.f43id == null) {
                        creative.f43id = "";
                    }
                    if (creative.position == null) {
                        creative.position = CreativePosition.new_();
                    }
                    if (creative.template == null) {
                        creative.template = CreativeTemplate.new_();
                    }
                    if (creative.data != null) {
                        break;
                    }
                    creative.data = CreativeData.new_();
                    break;
                }
                if (iU == 10) {
                    creative.f43id = nb5Var.s();
                } else if (iU == 18) {
                    creative.position = (CreativePosition) nb5Var.l(CreativePosition.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    creative.template = (CreativeTemplate) nb5Var.l(CreativeTemplate.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (creative.f43id == null) {
                            creative.f43id = "";
                        }
                        if (creative.position == null) {
                            creative.position = CreativePosition.new_();
                        }
                        if (creative.template == null) {
                            creative.template = CreativeTemplate.new_();
                        }
                        if (creative.data != null) {
                            break;
                        }
                        creative.data = CreativeData.new_();
                        return creative;
                    }
                    creative.data = (CreativeData) nb5Var.l(CreativeData.PROTOBUF_ADAPTER);
                }
            }
            return creative;
        }

        public void serialize(Creative creative, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = creative.f43id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            CreativePosition creativePosition = creative.position;
            if (creativePosition != null) {
                codedOutputByteBufferNano.K(2, creativePosition, CreativePosition.PROTOBUF_ADAPTER);
            }
            CreativeTemplate creativeTemplate = creative.template;
            if (creativeTemplate != null) {
                codedOutputByteBufferNano.K(3, creativeTemplate, CreativeTemplate.PROTOBUF_ADAPTER);
            }
            CreativeData creativeData = creative.data;
            if (creativeData != null) {
                codedOutputByteBufferNano.K(4, creativeData, CreativeData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Creative> JSON_ADAPTER = new ObjectJsonAdapter<Creative>() { // from class: com.p1.mobile.putong.core.data.Creative.2
        public Class getDataClass() {
            return Creative.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Creative m12548newInstance() {
            return new Creative();
        }

        public boolean parseField(Creative creative, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "template":
                    creative.template = (CreativeTemplate) CreativeTemplate.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    creative.f43id = jsonParser.getValueAsString();
                    return false;
                case "data":
                    creative.data = (CreativeData) CreativeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "position":
                    creative.position = (CreativePosition) CreativePosition.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Creative creative, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "template":
                    return true;
                case "id":
                    return false;
                case "data":
                case "position":
                    return true;
                default:
                    return super.parseFieldCheck(creative, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Creative creative, JsonGenerator jsonGenerator) throws IOException {
            String str = creative.f43id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (creative.position != null) {
                jsonGenerator.writeFieldName("position");
                CreativePosition.JSON_ADAPTER.serialize(creative.position, jsonGenerator, true);
            }
            if (creative.template != null) {
                jsonGenerator.writeFieldName("template");
                CreativeTemplate.JSON_ADAPTER.serialize(creative.template, jsonGenerator, true);
            }
            if (creative.data != null) {
                jsonGenerator.writeFieldName("data");
                CreativeData.JSON_ADAPTER.serialize(creative.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Creative) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Creative) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Creative new_() {
        Creative creative = new Creative();
        creative.nullCheck();
        return creative;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Creative m12546clone() {
        Creative creative = new Creative();
        creative.f43id = this.f43id;
        CreativePosition creativePosition = this.position;
        if (creativePosition != null) {
            creative.position = creativePosition.m12554clone();
        }
        CreativeTemplate creativeTemplate = this.template;
        if (creativeTemplate != null) {
            creative.template = creativeTemplate.m12558clone();
        }
        CreativeData creativeData = this.data;
        if (creativeData != null) {
            creative.data = creativeData.m12550clone();
        }
        return creative;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Creative)) {
            return false;
        }
        Creative creative = (Creative) obj;
        return ValueObject.util_equals(this.f43id, creative.f43id) && ValueObject.util_equals(this.position, creative.position) && ValueObject.util_equals(this.template, creative.template) && ValueObject.util_equals(this.data, creative.data);
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
        String str = this.f43id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CreativePosition creativePosition = this.position;
        int iHashCode2 = (iHashCode + (creativePosition != null ? creativePosition.hashCode() : 0)) * 41;
        CreativeTemplate creativeTemplate = this.template;
        int iHashCode3 = (iHashCode2 + (creativeTemplate != null ? creativeTemplate.hashCode() : 0)) * 41;
        CreativeData creativeData = this.data;
        int iHashCode4 = iHashCode3 + (creativeData != null ? creativeData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f43id == null) {
            this.f43id = "";
        }
        if (this.position == null) {
            this.position = CreativePosition.new_();
        }
        if (this.template == null) {
            this.template = CreativeTemplate.new_();
        }
        if (this.data == null) {
            this.data = CreativeData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
