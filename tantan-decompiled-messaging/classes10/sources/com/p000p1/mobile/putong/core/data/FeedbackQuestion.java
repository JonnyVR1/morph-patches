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
public class FeedbackQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedbackquestion";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String data;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<FeedbackQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedbackQuestion>() { // from class: com.p1.mobile.putong.core.data.FeedbackQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FeedbackQuestion feedbackQuestion) {
            String str = feedbackQuestion.text;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = feedbackQuestion.data;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) feedbackQuestion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FeedbackQuestion m12759parse(nb5 nb5Var) throws IOException {
            FeedbackQuestion feedbackQuestion = new FeedbackQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (feedbackQuestion.text == null) {
                        feedbackQuestion.text = "";
                    }
                    if (feedbackQuestion.data != null) {
                        break;
                    }
                    feedbackQuestion.data = "";
                    break;
                }
                if (iU == 10) {
                    feedbackQuestion.text = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (feedbackQuestion.text == null) {
                            feedbackQuestion.text = "";
                        }
                        if (feedbackQuestion.data != null) {
                            break;
                        }
                        feedbackQuestion.data = "";
                        return feedbackQuestion;
                    }
                    feedbackQuestion.data = nb5Var.s();
                }
            }
            return feedbackQuestion;
        }

        public void serialize(FeedbackQuestion feedbackQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedbackQuestion.text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = feedbackQuestion.data;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<FeedbackQuestion> JSON_ADAPTER = new ObjectJsonAdapter<FeedbackQuestion>() { // from class: com.p1.mobile.putong.core.data.FeedbackQuestion.2
        public Class getDataClass() {
            return FeedbackQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FeedbackQuestion m12760newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedbackQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedbackQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FeedbackQuestion new_() {
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion();
        feedbackQuestion.nullCheck();
        return feedbackQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FeedbackQuestion m12758clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.data;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.data == null) {
            this.data = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
