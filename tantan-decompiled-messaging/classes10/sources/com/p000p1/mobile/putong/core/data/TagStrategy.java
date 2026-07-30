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
public class TagStrategy extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tagstrategy";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String md5;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String strategy;

    @ProtobufIndex(index = 1)
    public int version;
    public static ProtobufAdapter<TagStrategy> PROTOBUF_ADAPTER = new MessageNanoAdapter<TagStrategy>() { // from class: com.p1.mobile.putong.core.data.TagStrategy.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TagStrategy tagStrategy) {
            int iH = CodedOutputByteBufferNano.h(1, tagStrategy.version);
            String str = tagStrategy.strategy;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = tagStrategy.md5;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) tagStrategy).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TagStrategy m15906parse(nb5 nb5Var) throws IOException {
            TagStrategy tagStrategy = new TagStrategy();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tagStrategy.strategy == null) {
                        tagStrategy.strategy = "";
                    }
                    if (tagStrategy.md5 != null) {
                        break;
                    }
                    tagStrategy.md5 = "";
                    break;
                }
                if (iU == 8) {
                    tagStrategy.version = nb5Var.j();
                } else if (iU == 18) {
                    tagStrategy.strategy = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (tagStrategy.strategy == null) {
                            tagStrategy.strategy = "";
                        }
                        if (tagStrategy.md5 != null) {
                            break;
                        }
                        tagStrategy.md5 = "";
                        return tagStrategy;
                    }
                    tagStrategy.md5 = nb5Var.s();
                }
            }
            return tagStrategy;
        }

        public void serialize(TagStrategy tagStrategy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, tagStrategy.version);
            String str = tagStrategy.strategy;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = tagStrategy.md5;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<TagStrategy> JSON_ADAPTER = new ObjectJsonAdapter<TagStrategy>() { // from class: com.p1.mobile.putong.core.data.TagStrategy.2
        public Class getDataClass() {
            return TagStrategy.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TagStrategy m15907newInstance() {
            return new TagStrategy();
        }

        public boolean parseField(TagStrategy tagStrategy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "md5":
                    tagStrategy.md5 = jsonParser.getValueAsString();
                    return true;
                case "version":
                    tagStrategy.version = jsonParser.getValueAsInt();
                    return true;
                case "strategy":
                    tagStrategy.strategy = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TagStrategy tagStrategy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "md5":
                case "version":
                case "strategy":
                    return true;
                default:
                    return super.parseFieldCheck(tagStrategy, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TagStrategy tagStrategy, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("version", tagStrategy.version);
            String str = tagStrategy.strategy;
            if (str != null) {
                jsonGenerator.writeStringField("strategy", str);
            }
            String str2 = tagStrategy.md5;
            if (str2 != null) {
                jsonGenerator.writeStringField("md5", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TagStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TagStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TagStrategy new_() {
        TagStrategy tagStrategy = new TagStrategy();
        tagStrategy.nullCheck();
        return tagStrategy;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TagStrategy m15905clone() {
        TagStrategy tagStrategy = new TagStrategy();
        tagStrategy.version = this.version;
        tagStrategy.strategy = this.strategy;
        tagStrategy.md5 = this.md5;
        return tagStrategy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TagStrategy)) {
            return false;
        }
        TagStrategy tagStrategy = (TagStrategy) obj;
        return this.version == tagStrategy.version && ValueObject.util_equals(this.strategy, tagStrategy.strategy) && ValueObject.util_equals(this.md5, tagStrategy.md5);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.version) * 41;
        String str = this.strategy;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.md5;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.strategy == null) {
            this.strategy = "";
        }
        if (this.md5 == null) {
            this.md5 = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
