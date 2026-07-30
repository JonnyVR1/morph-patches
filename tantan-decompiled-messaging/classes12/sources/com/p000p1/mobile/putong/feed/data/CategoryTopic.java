package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.CategoryTopic;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CategoryTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "categorytopic";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> topicIds;
    public static ProtobufAdapter<CategoryTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<CategoryTopic>() { // from class: com.p1.mobile.putong.feed.data.CategoryTopic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CategoryTopic categoryTopic) {
            String str = categoryTopic.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = categoryTopic.topicIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) categoryTopic).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CategoryTopic m19458parse(nb5 nb5Var) throws IOException {
            CategoryTopic categoryTopic = new CategoryTopic();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (categoryTopic.name == null) {
                        categoryTopic.name = "";
                    }
                    if (categoryTopic.topicIds != null) {
                        break;
                    }
                    categoryTopic.topicIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    categoryTopic.name = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (categoryTopic.name == null) {
                            categoryTopic.name = "";
                        }
                        if (categoryTopic.topicIds != null) {
                            break;
                        }
                        categoryTopic.topicIds = new ArrayList();
                        return categoryTopic;
                    }
                    categoryTopic.topicIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return categoryTopic;
        }

        public void serialize(CategoryTopic categoryTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = categoryTopic.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = categoryTopic.topicIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CategoryTopic> JSON_ADAPTER = new ObjectJsonAdapter<CategoryTopic>() { // from class: com.p1.mobile.putong.feed.data.CategoryTopic.2
        public Class getDataClass() {
            return CategoryTopic.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CategoryTopic mo17830newInstance() {
            return new CategoryTopic();
        }

        public boolean parseField(CategoryTopic categoryTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("topicIds")) {
                categoryTopic.topicIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("name")) {
                return false;
            }
            categoryTopic.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CategoryTopic categoryTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("topicIds") || str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(categoryTopic, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CategoryTopic categoryTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = categoryTopic.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            if (categoryTopic.topicIds != null) {
                jsonGenerator.writeFieldName("topicIds");
                JsonAdapter.serializeArray(categoryTopic.topicIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CategoryTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CategoryTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1709a(String str) {
        return str;
    }

    public static CategoryTopic new_() {
        CategoryTopic categoryTopic = new CategoryTopic();
        categoryTopic.nullCheck();
        return categoryTopic;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CategoryTopic m19457clone() {
        CategoryTopic categoryTopic = new CategoryTopic();
        categoryTopic.name = this.name;
        List<String> list = this.topicIds;
        if (list != null) {
            categoryTopic.topicIds = ValueObject.util_map(list, new w9j() { // from class: l.fn4
                public final Object call(Object obj) {
                    return CategoryTopic.m1709a((String) obj);
                }
            });
        }
        return categoryTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryTopic)) {
            return false;
        }
        CategoryTopic categoryTopic = (CategoryTopic) obj;
        return ValueObject.util_equals(this.name, categoryTopic.name) && ValueObject.util_equals(this.topicIds, categoryTopic.topicIds);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.topicIds;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.topicIds == null) {
            this.topicIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
