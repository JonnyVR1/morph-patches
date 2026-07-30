package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class Tag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tag";

    @NonNull
    @ProtobufIndex(index = 2)
    public String category;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<Tag> PROTOBUF_ADAPTER = new MessageNanoAdapter<Tag>() { // from class: com.p1.mobile.putong.data.Tag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Tag tag) {
            String str = tag.value;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = tag.category;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            tag.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Tag parse(nc5 nc5Var) throws IOException {
            Tag tag = new Tag();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tag.value == null) {
                        tag.value = "";
                    }
                    if (tag.category != null) {
                        break;
                    }
                    tag.category = "";
                    break;
                }
                if (iM162497u == 10) {
                    tag.value = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (tag.value == null) {
                            tag.value = "";
                        }
                        if (tag.category != null) {
                            break;
                        }
                        tag.category = "";
                        return tag;
                    }
                    tag.category = nc5Var.m162495s();
                }
            }
            return tag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Tag tag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tag.value;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = tag.category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<Tag> JSON_ADAPTER = new ObjectJsonAdapter<Tag>() { // from class: com.p1.mobile.putong.data.Tag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Tag.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Tag newInstance() {
            return new Tag();
        }

        public boolean parseField(Tag tag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("category")) {
                tag.category = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            tag.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Tag tag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("category") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(tag, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Tag tag, JsonGenerator jsonGenerator) throws IOException {
            String str = tag.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = tag.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Tag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Tag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public Tag(String str, String str2) {
        this.category = str;
        this.value = str2;
    }

    public static Tag new_() {
        Tag tag = new Tag();
        tag.nullCheck();
        return tag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Tag mo225055clone() {
        Tag tag = new Tag();
        tag.value = this.value;
        tag.category = this.category;
        return tag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return ValueObject.util_equals(this.value, tag.value) && ValueObject.util_equals(this.category, tag.category);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "tag";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public Tag() {
    }
}
