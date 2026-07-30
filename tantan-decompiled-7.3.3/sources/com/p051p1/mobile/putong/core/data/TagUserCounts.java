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
public class TagUserCounts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tagusercounts";

    @ProtobufIndex(index = 2)
    public long count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21257id;
    public static ProtobufAdapter<TagUserCounts> PROTOBUF_ADAPTER = new MessageNanoAdapter<TagUserCounts>() { // from class: com.p1.mobile.putong.core.data.TagUserCounts.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TagUserCounts tagUserCounts) {
            String str = tagUserCounts.f21257id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, tagUserCounts.count);
            tagUserCounts.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TagUserCounts parse(nc5 nc5Var) throws IOException {
            TagUserCounts tagUserCounts = new TagUserCounts();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tagUserCounts.f21257id != null) {
                        break;
                    }
                    tagUserCounts.f21257id = "";
                    break;
                }
                if (iM162497u == 10) {
                    tagUserCounts.f21257id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (tagUserCounts.f21257id != null) {
                            break;
                        }
                        tagUserCounts.f21257id = "";
                        return tagUserCounts;
                    }
                    tagUserCounts.count = nc5Var.m162487k();
                }
            }
            return tagUserCounts;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TagUserCounts tagUserCounts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tagUserCounts.f21257id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, tagUserCounts.count);
        }
    };
    public static JsonAdapter<TagUserCounts> JSON_ADAPTER = new ObjectJsonAdapter<TagUserCounts>() { // from class: com.p1.mobile.putong.core.data.TagUserCounts.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TagUserCounts.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TagUserCounts newInstance() {
            return new TagUserCounts();
        }

        public boolean parseField(TagUserCounts tagUserCounts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                tagUserCounts.f21257id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("count")) {
                return false;
            }
            tagUserCounts.count = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(TagUserCounts tagUserCounts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(tagUserCounts, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TagUserCounts tagUserCounts, JsonGenerator jsonGenerator) throws IOException {
            String str = tagUserCounts.f21257id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("count", tagUserCounts.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TagUserCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TagUserCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TagUserCounts new_() {
        TagUserCounts tagUserCounts = new TagUserCounts();
        tagUserCounts.nullCheck();
        return tagUserCounts;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TagUserCounts mo225055clone() {
        TagUserCounts tagUserCounts = new TagUserCounts();
        tagUserCounts.f21257id = this.f21257id;
        tagUserCounts.count = this.count;
        return tagUserCounts;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TagUserCounts)) {
            return false;
        }
        TagUserCounts tagUserCounts = (TagUserCounts) obj;
        return ValueObject.util_equals(this.f21257id, tagUserCounts.f21257id) && this.count == tagUserCounts.count;
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
        String str = this.f21257id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.count;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21257id == null) {
            this.f21257id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
