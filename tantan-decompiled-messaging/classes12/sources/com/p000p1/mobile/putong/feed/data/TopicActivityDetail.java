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
public class TopicActivityDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topicactivitydetail";

    @NonNull
    @ProtobufIndex(index = 1)
    public String tips;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<TopicActivityDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicActivityDetail>() { // from class: com.p1.mobile.putong.feed.data.TopicActivityDetail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TopicActivityDetail topicActivityDetail) {
            String str = topicActivityDetail.tips;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = topicActivityDetail.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) topicActivityDetail).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TopicActivityDetail m19789parse(nb5 nb5Var) throws IOException {
            TopicActivityDetail topicActivityDetail = new TopicActivityDetail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (topicActivityDetail.tips == null) {
                        topicActivityDetail.tips = "";
                    }
                    if (topicActivityDetail.url != null) {
                        break;
                    }
                    topicActivityDetail.url = "";
                    break;
                }
                if (iU == 10) {
                    topicActivityDetail.tips = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (topicActivityDetail.tips == null) {
                            topicActivityDetail.tips = "";
                        }
                        if (topicActivityDetail.url != null) {
                            break;
                        }
                        topicActivityDetail.url = "";
                        return topicActivityDetail;
                    }
                    topicActivityDetail.url = nb5Var.s();
                }
            }
            return topicActivityDetail;
        }

        public void serialize(TopicActivityDetail topicActivityDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicActivityDetail.tips;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = topicActivityDetail.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<TopicActivityDetail> JSON_ADAPTER = new ObjectJsonAdapter<TopicActivityDetail>() { // from class: com.p1.mobile.putong.feed.data.TopicActivityDetail.2
        public Class getDataClass() {
            return TopicActivityDetail.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TopicActivityDetail mo17830newInstance() {
            return new TopicActivityDetail();
        }

        public boolean parseField(TopicActivityDetail topicActivityDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("url")) {
                topicActivityDetail.url = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("tips")) {
                return false;
            }
            topicActivityDetail.tips = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TopicActivityDetail topicActivityDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url") || str.equals("tips")) {
                return true;
            }
            return super.parseFieldCheck(topicActivityDetail, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicActivityDetail topicActivityDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = topicActivityDetail.tips;
            if (str != null) {
                jsonGenerator.writeStringField("tips", str);
            }
            String str2 = topicActivityDetail.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicActivityDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicActivityDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TopicActivityDetail new_() {
        TopicActivityDetail topicActivityDetail = new TopicActivityDetail();
        topicActivityDetail.nullCheck();
        return topicActivityDetail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TopicActivityDetail m19788clone() {
        TopicActivityDetail topicActivityDetail = new TopicActivityDetail();
        topicActivityDetail.tips = this.tips;
        topicActivityDetail.url = this.url;
        return topicActivityDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicActivityDetail)) {
            return false;
        }
        TopicActivityDetail topicActivityDetail = (TopicActivityDetail) obj;
        return ValueObject.util_equals(this.tips, topicActivityDetail.tips) && ValueObject.util_equals(this.url, topicActivityDetail.url);
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
        String str = this.tips;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tips == null) {
            this.tips = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
