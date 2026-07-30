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
public class TagUserCounts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tagusercounts";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f177id;
    public static ProtobufAdapter<TagUserCounts> PROTOBUF_ADAPTER = new MessageNanoAdapter<TagUserCounts>() { // from class: com.p1.mobile.putong.core.data.TagUserCounts.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TagUserCounts tagUserCounts) {
            String str = tagUserCounts.f177id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, tagUserCounts.count);
            ((MessageNano) tagUserCounts).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TagUserCounts m15910parse(nb5 nb5Var) throws IOException {
            TagUserCounts tagUserCounts = new TagUserCounts();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tagUserCounts.f177id != null) {
                        break;
                    }
                    tagUserCounts.f177id = "";
                    break;
                }
                if (iU == 10) {
                    tagUserCounts.f177id = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (tagUserCounts.f177id != null) {
                            break;
                        }
                        tagUserCounts.f177id = "";
                        return tagUserCounts;
                    }
                    tagUserCounts.count = nb5Var.k();
                }
            }
            return tagUserCounts;
        }

        public void serialize(TagUserCounts tagUserCounts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tagUserCounts.f177id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, tagUserCounts.count);
        }
    };
    public static JsonAdapter<TagUserCounts> JSON_ADAPTER = new ObjectJsonAdapter<TagUserCounts>() { // from class: com.p1.mobile.putong.core.data.TagUserCounts.2
        public Class getDataClass() {
            return TagUserCounts.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TagUserCounts m15911newInstance() {
            return new TagUserCounts();
        }

        public boolean parseField(TagUserCounts tagUserCounts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                tagUserCounts.f177id = jsonParser.getValueAsString();
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

        public void serializeFields(TagUserCounts tagUserCounts, JsonGenerator jsonGenerator) throws IOException {
            String str = tagUserCounts.f177id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("count", tagUserCounts.count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TagUserCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TagUserCounts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TagUserCounts new_() {
        TagUserCounts tagUserCounts = new TagUserCounts();
        tagUserCounts.nullCheck();
        return tagUserCounts;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TagUserCounts m15909clone() {
        TagUserCounts tagUserCounts = new TagUserCounts();
        tagUserCounts.f177id = this.f177id;
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
        return ValueObject.util_equals(this.f177id, tagUserCounts.f177id) && this.count == tagUserCounts.count;
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
        String str = this.f177id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.count;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f177id == null) {
            this.f177id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
