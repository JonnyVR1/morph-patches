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
public class IceBreakingQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakingquestion";

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21162id;
    public static ProtobufAdapter<IceBreakingQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakingQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakingQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakingQuestion iceBreakingQuestion) {
            String str = iceBreakingQuestion.f21162id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            iceBreakingQuestion.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakingQuestion parse(nc5 nc5Var) throws IOException {
            IceBreakingQuestion iceBreakingQuestion = new IceBreakingQuestion();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (iceBreakingQuestion.f21162id == null) {
                        iceBreakingQuestion.f21162id = "";
                    }
                    if (iceBreakingQuestion.content != null) {
                        break;
                    }
                    iceBreakingQuestion.content = "";
                    break;
                }
                if (iM162497u == 10) {
                    iceBreakingQuestion.f21162id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (iceBreakingQuestion.f21162id == null) {
                            iceBreakingQuestion.f21162id = "";
                        }
                        if (iceBreakingQuestion.content != null) {
                            break;
                        }
                        iceBreakingQuestion.content = "";
                        return iceBreakingQuestion;
                    }
                    iceBreakingQuestion.content = nc5Var.m162495s();
                }
            }
            return iceBreakingQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakingQuestion iceBreakingQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakingQuestion.f21162id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<IceBreakingQuestion> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakingQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakingQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakingQuestion.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakingQuestion newInstance() {
            return new IceBreakingQuestion();
        }

        public boolean parseField(IceBreakingQuestion iceBreakingQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                iceBreakingQuestion.f21162id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakingQuestion iceBreakingQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakingQuestion.f21162id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = iceBreakingQuestion.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakingQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public IceBreakingQuestion mo225055clone() {
        IceBreakingQuestion iceBreakingQuestion = new IceBreakingQuestion();
        iceBreakingQuestion.f21162id = this.f21162id;
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
        return ValueObject.util_equals(this.f21162id, iceBreakingQuestion.f21162id) && ValueObject.util_equals(this.content, iceBreakingQuestion.content);
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
        String str = this.f21162id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21162id == null) {
            this.f21162id = "";
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
