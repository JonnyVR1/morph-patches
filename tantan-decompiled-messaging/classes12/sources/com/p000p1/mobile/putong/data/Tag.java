package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Tag tag) {
            String str = tag.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = tag.category;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) tag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Tag m19079parse(nb5 nb5Var) throws IOException {
            Tag tag = new Tag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tag.value == null) {
                        tag.value = "";
                    }
                    if (tag.category != null) {
                        break;
                    }
                    tag.category = "";
                    break;
                }
                if (iU == 10) {
                    tag.value = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (tag.value == null) {
                            tag.value = "";
                        }
                        if (tag.category != null) {
                            break;
                        }
                        tag.category = "";
                        return tag;
                    }
                    tag.category = nb5Var.s();
                }
            }
            return tag;
        }

        public void serialize(Tag tag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tag.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = tag.category;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<Tag> JSON_ADAPTER = new ObjectJsonAdapter<Tag>() { // from class: com.p1.mobile.putong.data.Tag.2
        public Class getDataClass() {
            return Tag.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Tag mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Tag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Tag m19078clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public Tag() {
    }
}
