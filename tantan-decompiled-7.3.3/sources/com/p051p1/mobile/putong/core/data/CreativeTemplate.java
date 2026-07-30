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
public class CreativeTemplate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creativetemplate";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21125id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;
    public static ProtobufAdapter<CreativeTemplate> PROTOBUF_ADAPTER = new MessageNanoAdapter<CreativeTemplate>() { // from class: com.p1.mobile.putong.core.data.CreativeTemplate.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CreativeTemplate creativeTemplate) {
            String str = creativeTemplate.f21125id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = creativeTemplate.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = creativeTemplate.category;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = creativeTemplate.url;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            creativeTemplate.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CreativeTemplate parse(nc5 nc5Var) throws IOException {
            CreativeTemplate creativeTemplate = new CreativeTemplate();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (creativeTemplate.f21125id == null) {
                        creativeTemplate.f21125id = "";
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
                if (iM162497u == 10) {
                    creativeTemplate.f21125id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    creativeTemplate.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    creativeTemplate.category = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (creativeTemplate.f21125id == null) {
                            creativeTemplate.f21125id = "";
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
                    creativeTemplate.url = nc5Var.m162495s();
                }
            }
            return creativeTemplate;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CreativeTemplate creativeTemplate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = creativeTemplate.f21125id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = creativeTemplate.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = creativeTemplate.category;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = creativeTemplate.url;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<CreativeTemplate> JSON_ADAPTER = new ObjectJsonAdapter<CreativeTemplate>() { // from class: com.p1.mobile.putong.core.data.CreativeTemplate.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CreativeTemplate.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CreativeTemplate newInstance() {
            return new CreativeTemplate();
        }

        public boolean parseField(CreativeTemplate creativeTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    creativeTemplate.f21125id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CreativeTemplate creativeTemplate, JsonGenerator jsonGenerator) throws IOException {
            String str = creativeTemplate.f21125id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CreativeTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CreativeTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CreativeTemplate new_() {
        CreativeTemplate creativeTemplate = new CreativeTemplate();
        creativeTemplate.nullCheck();
        return creativeTemplate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CreativeTemplate mo225055clone() {
        CreativeTemplate creativeTemplate = new CreativeTemplate();
        creativeTemplate.f21125id = this.f21125id;
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
        return ValueObject.util_equals(this.f21125id, creativeTemplate.f21125id) && ValueObject.util_equals(this.type, creativeTemplate.type) && ValueObject.util_equals(this.category, creativeTemplate.category) && ValueObject.util_equals(this.url, creativeTemplate.url);
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
        String str = this.f21125id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21125id == null) {
            this.f21125id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
