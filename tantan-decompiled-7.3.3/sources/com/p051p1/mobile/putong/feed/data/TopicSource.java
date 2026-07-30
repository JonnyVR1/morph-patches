package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class TopicSource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topicsource";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40097id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sourceType;
    public static ProtobufAdapter<TopicSource> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicSource>() { // from class: com.p1.mobile.putong.feed.data.TopicSource.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TopicSource topicSource) {
            String str = topicSource.f40097id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = topicSource.sourceType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            topicSource.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TopicSource parse(nc5 nc5Var) throws IOException {
            TopicSource topicSource = new TopicSource();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (topicSource.f40097id == null) {
                        topicSource.f40097id = "";
                    }
                    if (topicSource.sourceType != null) {
                        break;
                    }
                    topicSource.sourceType = "";
                    break;
                }
                if (iM162497u == 10) {
                    topicSource.f40097id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (topicSource.f40097id == null) {
                            topicSource.f40097id = "";
                        }
                        if (topicSource.sourceType != null) {
                            break;
                        }
                        topicSource.sourceType = "";
                        return topicSource;
                    }
                    topicSource.sourceType = nc5Var.m162495s();
                }
            }
            return topicSource;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TopicSource topicSource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicSource.f40097id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = topicSource.sourceType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<TopicSource> JSON_ADAPTER = new ObjectJsonAdapter<TopicSource>() { // from class: com.p1.mobile.putong.feed.data.TopicSource.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TopicSource.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TopicSource newInstance() {
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
            topicSource.f40097id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicSource topicSource, JsonGenerator jsonGenerator) throws IOException {
            String str = topicSource.f40097id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = topicSource.sourceType;
            if (str2 != null) {
                jsonGenerator.writeStringField("sourceType", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TopicSource new_() {
        TopicSource topicSource = new TopicSource();
        topicSource.nullCheck();
        return topicSource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TopicSource mo225055clone() {
        TopicSource topicSource = new TopicSource();
        topicSource.f40097id = this.f40097id;
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
        return ValueObject.util_equals(this.f40097id, topicSource.f40097id) && ValueObject.util_equals(this.sourceType, topicSource.sourceType);
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
        String str = this.f40097id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.sourceType;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40097id == null) {
            this.f40097id = "";
        }
        if (this.sourceType == null) {
            this.sourceType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
