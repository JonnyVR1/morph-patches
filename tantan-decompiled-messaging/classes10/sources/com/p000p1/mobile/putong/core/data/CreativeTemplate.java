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
public class CreativeTemplate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creativetemplate";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;
    public static ProtobufAdapter<CreativeTemplate> PROTOBUF_ADAPTER = new MessageNanoAdapter<CreativeTemplate>() { // from class: com.p1.mobile.putong.core.data.CreativeTemplate.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CreativeTemplate creativeTemplate) {
            String str = creativeTemplate.f45id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = creativeTemplate.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = creativeTemplate.category;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = creativeTemplate.url;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) creativeTemplate).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CreativeTemplate m12559parse(nb5 nb5Var) throws IOException {
            CreativeTemplate creativeTemplate = new CreativeTemplate();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (creativeTemplate.f45id == null) {
                        creativeTemplate.f45id = "";
                    }
                    if (creativeTemplate.type == null) {
                        creativeTemplate.type = "";
                    }
                    if (creativeTemplate.category == null) {
                        creativeTemplate.category = "";
                    }
                    if (creativeTemplate.url != null) {
                        break;
                    }
                    creativeTemplate.url = "";
                    break;
                }
                if (iU == 10) {
                    creativeTemplate.f45id = nb5Var.s();
                } else if (iU == 18) {
                    creativeTemplate.type = nb5Var.s();
                } else if (iU == 26) {
                    creativeTemplate.category = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (creativeTemplate.f45id == null) {
                            creativeTemplate.f45id = "";
                        }
                        if (creativeTemplate.type == null) {
                            creativeTemplate.type = "";
                        }
                        if (creativeTemplate.category == null) {
                            creativeTemplate.category = "";
                        }
                        if (creativeTemplate.url != null) {
                            break;
                        }
                        creativeTemplate.url = "";
                        return creativeTemplate;
                    }
                    creativeTemplate.url = nb5Var.s();
                }
            }
            return creativeTemplate;
        }

        public void serialize(CreativeTemplate creativeTemplate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = creativeTemplate.f45id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = creativeTemplate.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = creativeTemplate.category;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = creativeTemplate.url;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<CreativeTemplate> JSON_ADAPTER = new ObjectJsonAdapter<CreativeTemplate>() { // from class: com.p1.mobile.putong.core.data.CreativeTemplate.2
        public Class getDataClass() {
            return CreativeTemplate.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CreativeTemplate m12560newInstance() {
            return new CreativeTemplate();
        }

        public boolean parseField(CreativeTemplate creativeTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    creativeTemplate.f45id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    creativeTemplate.url = jsonParser.getValueAsString();
                    return true;
                case "type":
                    creativeTemplate.type = jsonParser.getValueAsString();
                    return true;
                case "category":
                    creativeTemplate.category = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CreativeTemplate creativeTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "url":
                case "type":
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(creativeTemplate, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CreativeTemplate creativeTemplate, JsonGenerator jsonGenerator) throws IOException {
            String str = creativeTemplate.f45id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = creativeTemplate.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = creativeTemplate.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
            String str4 = creativeTemplate.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CreativeTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CreativeTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CreativeTemplate new_() {
        CreativeTemplate creativeTemplate = new CreativeTemplate();
        creativeTemplate.nullCheck();
        return creativeTemplate;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CreativeTemplate m12558clone() {
        CreativeTemplate creativeTemplate = new CreativeTemplate();
        creativeTemplate.f45id = this.f45id;
        creativeTemplate.type = this.type;
        creativeTemplate.category = this.category;
        creativeTemplate.url = this.url;
        return creativeTemplate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeTemplate)) {
            return false;
        }
        CreativeTemplate creativeTemplate = (CreativeTemplate) obj;
        return ValueObject.util_equals(this.f45id, creativeTemplate.f45id) && ValueObject.util_equals(this.type, creativeTemplate.type) && ValueObject.util_equals(this.category, creativeTemplate.category) && ValueObject.util_equals(this.url, creativeTemplate.url);
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
        String str = this.f45id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f45id == null) {
            this.f45id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
