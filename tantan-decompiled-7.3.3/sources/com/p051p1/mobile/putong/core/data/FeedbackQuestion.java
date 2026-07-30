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
public class FeedbackQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedbackquestion";

    @NonNull
    @ProtobufIndex(index = 2)
    public String data;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<FeedbackQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedbackQuestion>() { // from class: com.p1.mobile.putong.core.data.FeedbackQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FeedbackQuestion feedbackQuestion) {
            String str = feedbackQuestion.text;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = feedbackQuestion.data;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            feedbackQuestion.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FeedbackQuestion parse(nc5 nc5Var) throws IOException {
            FeedbackQuestion feedbackQuestion = new FeedbackQuestion();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (feedbackQuestion.text == null) {
                        feedbackQuestion.text = "";
                    }
                    if (feedbackQuestion.data != null) {
                        break;
                    }
                    feedbackQuestion.data = "";
                    break;
                }
                if (iM162497u == 10) {
                    feedbackQuestion.text = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (feedbackQuestion.text == null) {
                            feedbackQuestion.text = "";
                        }
                        if (feedbackQuestion.data != null) {
                            break;
                        }
                        feedbackQuestion.data = "";
                        return feedbackQuestion;
                    }
                    feedbackQuestion.data = nc5Var.m162495s();
                }
            }
            return feedbackQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FeedbackQuestion feedbackQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedbackQuestion.text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = feedbackQuestion.data;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<FeedbackQuestion> JSON_ADAPTER = new ObjectJsonAdapter<FeedbackQuestion>() { // from class: com.p1.mobile.putong.core.data.FeedbackQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FeedbackQuestion.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FeedbackQuestion newInstance() {
            return new FeedbackQuestion();
        }

        public boolean parseField(FeedbackQuestion feedbackQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                feedbackQuestion.data = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            feedbackQuestion.text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FeedbackQuestion feedbackQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(feedbackQuestion, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedbackQuestion feedbackQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = feedbackQuestion.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = feedbackQuestion.data;
            if (str2 != null) {
                jsonGenerator.writeStringField("data", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedbackQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedbackQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FeedbackQuestion new_() {
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion();
        feedbackQuestion.nullCheck();
        return feedbackQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FeedbackQuestion mo225055clone() {
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion();
        feedbackQuestion.text = this.text;
        feedbackQuestion.data = this.data;
        return feedbackQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedbackQuestion)) {
            return false;
        }
        FeedbackQuestion feedbackQuestion = (FeedbackQuestion) obj;
        return ValueObject.util_equals(this.text, feedbackQuestion.text) && ValueObject.util_equals(this.data, feedbackQuestion.data);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.data;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.data == null) {
            this.data = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
