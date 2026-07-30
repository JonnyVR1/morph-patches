package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
public class TagStrategy extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tagstrategy";

    @NonNull
    @ProtobufIndex(index = 3)
    public String md5;

    @NonNull
    @ProtobufIndex(index = 2)
    public String strategy;

    @ProtobufIndex(index = 1)
    public int version;
    public static ProtobufAdapter<TagStrategy> PROTOBUF_ADAPTER = new MessageNanoAdapter<TagStrategy>() { // from class: com.p1.mobile.putong.core.data.TagStrategy.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TagStrategy tagStrategy) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, tagStrategy.version);
            String str = tagStrategy.strategy;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = tagStrategy.md5;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            tagStrategy.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TagStrategy parse(nc5 nc5Var) throws IOException {
            TagStrategy tagStrategy = new TagStrategy();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tagStrategy.strategy == null) {
                        tagStrategy.strategy = "";
                    }
                    if (tagStrategy.md5 != null) {
                        break;
                    }
                    tagStrategy.md5 = "";
                    break;
                }
                if (iM162497u == 8) {
                    tagStrategy.version = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    tagStrategy.strategy = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (tagStrategy.strategy == null) {
                            tagStrategy.strategy = "";
                        }
                        if (tagStrategy.md5 != null) {
                            break;
                        }
                        tagStrategy.md5 = "";
                        return tagStrategy;
                    }
                    tagStrategy.md5 = nc5Var.m162495s();
                }
            }
            return tagStrategy;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TagStrategy tagStrategy, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, tagStrategy.version);
            String str = tagStrategy.strategy;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = tagStrategy.md5;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<TagStrategy> JSON_ADAPTER = new ObjectJsonAdapter<TagStrategy>() { // from class: com.p1.mobile.putong.core.data.TagStrategy.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TagStrategy.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TagStrategy newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TagStrategy tagStrategy, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, tagStrategy.version);
            String str = tagStrategy.strategy;
            if (str != null) {
                jsonGenerator.writeStringField("strategy", str);
            }
            String str2 = tagStrategy.md5;
            if (str2 != null) {
                jsonGenerator.writeStringField("md5", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TagStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TagStrategy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TagStrategy new_() {
        TagStrategy tagStrategy = new TagStrategy();
        tagStrategy.nullCheck();
        return tagStrategy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TagStrategy mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.version) * 41;
        String str = this.strategy;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.md5;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.strategy == null) {
            this.strategy = "";
        }
        if (this.md5 == null) {
            this.md5 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
