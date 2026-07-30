package com.p000p1.mobile.putong.feed.data;

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
public class TopicSource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topicsource";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f710id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sourceType;
    public static ProtobufAdapter<TopicSource> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicSource>() { // from class: com.p1.mobile.putong.feed.data.TopicSource.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TopicSource topicSource) {
            String str = topicSource.f710id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = topicSource.sourceType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) topicSource).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TopicSource m19804parse(nb5 nb5Var) throws IOException {
            TopicSource topicSource = new TopicSource();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (topicSource.f710id == null) {
                        topicSource.f710id = "";
                    }
                    if (topicSource.sourceType != null) {
                        break;
                    }
                    topicSource.sourceType = "";
                    break;
                }
                if (iU == 10) {
                    topicSource.f710id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (topicSource.f710id == null) {
                            topicSource.f710id = "";
                        }
                        if (topicSource.sourceType != null) {
                            break;
                        }
                        topicSource.sourceType = "";
                        return topicSource;
                    }
                    topicSource.sourceType = nb5Var.s();
                }
            }
            return topicSource;
        }

        public void serialize(TopicSource topicSource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicSource.f710id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = topicSource.sourceType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<TopicSource> JSON_ADAPTER = new ObjectJsonAdapter<TopicSource>() { // from class: com.p1.mobile.putong.feed.data.TopicSource.2
        public Class getDataClass() {
            return TopicSource.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TopicSource mo17830newInstance() {
            return new TopicSource();
        }

        public boolean parseField(TopicSource topicSource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("sourceType")) {
                topicSource.sourceType = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            topicSource.f710id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(TopicSource topicSource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("sourceType")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(topicSource, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicSource topicSource, JsonGenerator jsonGenerator) throws IOException {
            String str = topicSource.f710id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = topicSource.sourceType;
            if (str2 != null) {
                jsonGenerator.writeStringField("sourceType", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TopicSource new_() {
        TopicSource topicSource = new TopicSource();
        topicSource.nullCheck();
        return topicSource;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TopicSource m19803clone() {
        TopicSource topicSource = new TopicSource();
        topicSource.f710id = this.f710id;
        topicSource.sourceType = this.sourceType;
        return topicSource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicSource)) {
            return false;
        }
        TopicSource topicSource = (TopicSource) obj;
        return ValueObject.util_equals(this.f710id, topicSource.f710id) && ValueObject.util_equals(this.sourceType, topicSource.sourceType);
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
        String str = this.f710id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.sourceType;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f710id == null) {
            this.f710id = "";
        }
        if (this.sourceType == null) {
            this.sourceType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
