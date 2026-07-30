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
public class Creative extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creative";

    @NonNull
    @ProtobufIndex(index = 4)
    public CreativeData data;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21123id;

    @NonNull
    @ProtobufIndex(index = 2)
    public CreativePosition position;

    @NonNull
    @ProtobufIndex(index = 3)
    public CreativeTemplate template;
    public static ProtobufAdapter<Creative> PROTOBUF_ADAPTER = new MessageNanoAdapter<Creative>() { // from class: com.p1.mobile.putong.core.data.Creative.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Creative creative) {
            String str = creative.f21123id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            CreativePosition creativePosition = creative.position;
            if (creativePosition != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, creativePosition, CreativePosition.PROTOBUF_ADAPTER);
            }
            CreativeTemplate creativeTemplate = creative.template;
            if (creativeTemplate != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, creativeTemplate, CreativeTemplate.PROTOBUF_ADAPTER);
            }
            CreativeData creativeData = creative.data;
            if (creativeData != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, creativeData, CreativeData.PROTOBUF_ADAPTER);
            }
            creative.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Creative parse(nc5 nc5Var) throws IOException {
            Creative creative = new Creative();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (creative.f21123id == null) {
                        creative.f21123id = "";
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
                if (iM162497u == 10) {
                    creative.f21123id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    creative.position = (CreativePosition) nc5Var.m162488l(CreativePosition.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    creative.template = (CreativeTemplate) nc5Var.m162488l(CreativeTemplate.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (creative.f21123id == null) {
                            creative.f21123id = "";
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
                    creative.data = (CreativeData) nc5Var.m162488l(CreativeData.PROTOBUF_ADAPTER);
                }
            }
            return creative;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Creative creative, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = creative.f21123id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            CreativePosition creativePosition = creative.position;
            if (creativePosition != null) {
                codedOutputByteBufferNano.m17309K(2, creativePosition, CreativePosition.PROTOBUF_ADAPTER);
            }
            CreativeTemplate creativeTemplate = creative.template;
            if (creativeTemplate != null) {
                codedOutputByteBufferNano.m17309K(3, creativeTemplate, CreativeTemplate.PROTOBUF_ADAPTER);
            }
            CreativeData creativeData = creative.data;
            if (creativeData != null) {
                codedOutputByteBufferNano.m17309K(4, creativeData, CreativeData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Creative> JSON_ADAPTER = new ObjectJsonAdapter<Creative>() { // from class: com.p1.mobile.putong.core.data.Creative.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Creative.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Creative newInstance() {
            return new Creative();
        }

        public boolean parseField(Creative creative, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "template":
                    creative.template = CreativeTemplate.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    creative.f21123id = jsonParser.getValueAsString();
                    return false;
                case "data":
                    creative.data = CreativeData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "position":
                    creative.position = CreativePosition.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Creative creative, JsonGenerator jsonGenerator) throws IOException {
            String str = creative.f21123id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Creative) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Creative) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Creative new_() {
        Creative creative = new Creative();
        creative.nullCheck();
        return creative;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Creative mo225055clone() {
        Creative creative = new Creative();
        creative.f21123id = this.f21123id;
        CreativePosition creativePosition = this.position;
        if (creativePosition != null) {
            creative.position = creativePosition.mo225055clone();
        }
        CreativeTemplate creativeTemplate = this.template;
        if (creativeTemplate != null) {
            creative.template = creativeTemplate.mo225055clone();
        }
        CreativeData creativeData = this.data;
        if (creativeData != null) {
            creative.data = creativeData.mo225055clone();
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
        return ValueObject.util_equals(this.f21123id, creative.f21123id) && ValueObject.util_equals(this.position, creative.position) && ValueObject.util_equals(this.template, creative.template) && ValueObject.util_equals(this.data, creative.data);
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
        String str = this.f21123id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CreativePosition creativePosition = this.position;
        int iHashCode2 = (iHashCode + (creativePosition != null ? creativePosition.hashCode() : 0)) * 41;
        CreativeTemplate creativeTemplate = this.template;
        int iHashCode3 = (iHashCode2 + (creativeTemplate != null ? creativeTemplate.hashCode() : 0)) * 41;
        CreativeData creativeData = this.data;
        int iHashCode4 = iHashCode3 + (creativeData != null ? creativeData.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21123id == null) {
            this.f21123id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
