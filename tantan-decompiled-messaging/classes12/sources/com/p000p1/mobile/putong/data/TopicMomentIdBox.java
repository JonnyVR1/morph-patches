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
public class TopicMomentIdBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topicmomentidbox";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f285id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<TopicMomentIdBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicMomentIdBox>() { // from class: com.p1.mobile.putong.data.TopicMomentIdBox.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TopicMomentIdBox topicMomentIdBox) {
            String str = topicMomentIdBox.f285id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = topicMomentIdBox.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) topicMomentIdBox).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TopicMomentIdBox m19109parse(nb5 nb5Var) throws IOException {
            TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (topicMomentIdBox.f285id == null) {
                        topicMomentIdBox.f285id = "";
                    }
                    if (topicMomentIdBox.name != null) {
                        break;
                    }
                    topicMomentIdBox.name = "";
                    break;
                }
                if (iU == 10) {
                    topicMomentIdBox.f285id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (topicMomentIdBox.f285id == null) {
                            topicMomentIdBox.f285id = "";
                        }
                        if (topicMomentIdBox.name != null) {
                            break;
                        }
                        topicMomentIdBox.name = "";
                        return topicMomentIdBox;
                    }
                    topicMomentIdBox.name = nb5Var.s();
                }
            }
            return topicMomentIdBox;
        }

        public void serialize(TopicMomentIdBox topicMomentIdBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicMomentIdBox.f285id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = topicMomentIdBox.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<TopicMomentIdBox> JSON_ADAPTER = new ObjectJsonAdapter<TopicMomentIdBox>() { // from class: com.p1.mobile.putong.data.TopicMomentIdBox.2
        public Class getDataClass() {
            return TopicMomentIdBox.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TopicMomentIdBox mo17830newInstance() {
            return new TopicMomentIdBox();
        }

        public boolean parseField(TopicMomentIdBox topicMomentIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                topicMomentIdBox.f285id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("name")) {
                return false;
            }
            topicMomentIdBox.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TopicMomentIdBox topicMomentIdBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(topicMomentIdBox, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicMomentIdBox topicMomentIdBox, JsonGenerator jsonGenerator) throws IOException {
            String str = topicMomentIdBox.f285id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = topicMomentIdBox.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicMomentIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicMomentIdBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TopicMomentIdBox new_() {
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        topicMomentIdBox.nullCheck();
        return topicMomentIdBox;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TopicMomentIdBox m19108clone() {
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        topicMomentIdBox.f285id = this.f285id;
        topicMomentIdBox.name = this.name;
        return topicMomentIdBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicMomentIdBox)) {
            return false;
        }
        TopicMomentIdBox topicMomentIdBox = (TopicMomentIdBox) obj;
        return ValueObject.util_equals(this.f285id, topicMomentIdBox.f285id) && ValueObject.util_equals(this.name, topicMomentIdBox.name);
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
        String str = this.f285id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f285id == null) {
            this.f285id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
