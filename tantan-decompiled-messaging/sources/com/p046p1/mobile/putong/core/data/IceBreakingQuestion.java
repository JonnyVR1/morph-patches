package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class IceBreakingQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakingquestion";

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20420id;
    public static ProtobufAdapter<IceBreakingQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakingQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakingQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakingQuestion iceBreakingQuestion) {
            String str = iceBreakingQuestion.f20420id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            iceBreakingQuestion.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakingQuestion parse(nb5 nb5Var) throws IOException {
            IceBreakingQuestion iceBreakingQuestion = new IceBreakingQuestion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (iceBreakingQuestion.f20420id == null) {
                        iceBreakingQuestion.f20420id = "";
                    }
                    if (iceBreakingQuestion.content != null) {
                        break;
                    }
                    iceBreakingQuestion.content = "";
                    break;
                }
                if (iM158752u == 10) {
                    iceBreakingQuestion.f20420id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (iceBreakingQuestion.f20420id == null) {
                            iceBreakingQuestion.f20420id = "";
                        }
                        if (iceBreakingQuestion.content != null) {
                            break;
                        }
                        iceBreakingQuestion.content = "";
                        return iceBreakingQuestion;
                    }
                    iceBreakingQuestion.content = nb5Var.m158750s();
                }
            }
            return iceBreakingQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakingQuestion iceBreakingQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakingQuestion.f20420id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<IceBreakingQuestion> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakingQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakingQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakingQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakingQuestion newInstance() {
            return new IceBreakingQuestion();
        }

        public boolean parseField(IceBreakingQuestion iceBreakingQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                iceBreakingQuestion.f20420id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("content")) {
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
            if (str.equals("content")) {
                return true;
            }
            return super.parseFieldCheck(iceBreakingQuestion, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakingQuestion iceBreakingQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakingQuestion.f20420id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakingQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakingQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakingQuestion new_() {
        IceBreakingQuestion iceBreakingQuestion = new IceBreakingQuestion();
        iceBreakingQuestion.nullCheck();
        return iceBreakingQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreakingQuestion mo223809clone() {
        IceBreakingQuestion iceBreakingQuestion = new IceBreakingQuestion();
        iceBreakingQuestion.f20420id = this.f20420id;
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
        return ValueObject.util_equals(this.f20420id, iceBreakingQuestion.f20420id) && ValueObject.util_equals(this.content, iceBreakingQuestion.content);
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
        String str = this.f20420id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20420id == null) {
            this.f20420id = "";
        }
        if (this.content == null) {
            this.content = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
