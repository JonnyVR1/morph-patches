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
public class IceBreakingQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakingquestion";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f82id;
    public static ProtobufAdapter<IceBreakingQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakingQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakingQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IceBreakingQuestion iceBreakingQuestion) {
            String str = iceBreakingQuestion.f82id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) iceBreakingQuestion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IceBreakingQuestion m13401parse(nb5 nb5Var) throws IOException {
            IceBreakingQuestion iceBreakingQuestion = new IceBreakingQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (iceBreakingQuestion.f82id == null) {
                        iceBreakingQuestion.f82id = "";
                    }
                    if (iceBreakingQuestion.content != null) {
                        break;
                    }
                    iceBreakingQuestion.content = "";
                    break;
                }
                if (iU == 10) {
                    iceBreakingQuestion.f82id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (iceBreakingQuestion.f82id == null) {
                            iceBreakingQuestion.f82id = "";
                        }
                        if (iceBreakingQuestion.content != null) {
                            break;
                        }
                        iceBreakingQuestion.content = "";
                        return iceBreakingQuestion;
                    }
                    iceBreakingQuestion.content = nb5Var.s();
                }
            }
            return iceBreakingQuestion;
        }

        public void serialize(IceBreakingQuestion iceBreakingQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakingQuestion.f82id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<IceBreakingQuestion> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakingQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakingQuestion.2
        public Class getDataClass() {
            return IceBreakingQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IceBreakingQuestion m13402newInstance() {
            return new IceBreakingQuestion();
        }

        public boolean parseField(IceBreakingQuestion iceBreakingQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                iceBreakingQuestion.f82id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals(Content.TYPE)) {
                return false;
            }
            iceBreakingQuestion.content = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IceBreakingQuestion iceBreakingQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals(Content.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(iceBreakingQuestion, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IceBreakingQuestion iceBreakingQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakingQuestion.f82id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                jsonGenerator.writeStringField(Content.TYPE, str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakingQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakingQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakingQuestion new_() {
        IceBreakingQuestion iceBreakingQuestion = new IceBreakingQuestion();
        iceBreakingQuestion.nullCheck();
        return iceBreakingQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IceBreakingQuestion m13400clone() {
        IceBreakingQuestion iceBreakingQuestion = new IceBreakingQuestion();
        iceBreakingQuestion.f82id = this.f82id;
        iceBreakingQuestion.content = this.content;
        return iceBreakingQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IceBreakingQuestion)) {
            return false;
        }
        IceBreakingQuestion iceBreakingQuestion = (IceBreakingQuestion) obj;
        return ValueObject.util_equals(this.f82id, iceBreakingQuestion.f82id) && ValueObject.util_equals(this.content, iceBreakingQuestion.content);
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
        String str = this.f82id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f82id == null) {
            this.f82id = "";
        }
        if (this.content == null) {
            this.content = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
