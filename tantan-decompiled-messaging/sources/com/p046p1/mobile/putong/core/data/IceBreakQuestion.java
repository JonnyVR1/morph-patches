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
public class IceBreakQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakquestion";

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20419id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String source;
    public static ProtobufAdapter<IceBreakQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakQuestion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakQuestion iceBreakQuestion) {
            String str = iceBreakQuestion.f20419id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = iceBreakQuestion.content;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = iceBreakQuestion.source;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            iceBreakQuestion.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakQuestion parse(nb5 nb5Var) throws IOException {
            IceBreakQuestion iceBreakQuestion = new IceBreakQuestion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (iceBreakQuestion.f20419id == null) {
                        iceBreakQuestion.f20419id = "";
                    }
                    if (iceBreakQuestion.content == null) {
                        iceBreakQuestion.content = "";
                    }
                    if (iceBreakQuestion.source != null) {
                        break;
                    }
                    iceBreakQuestion.source = "";
                    break;
                }
                if (iM158752u == 10) {
                    iceBreakQuestion.f20419id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    iceBreakQuestion.content = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (iceBreakQuestion.f20419id == null) {
                            iceBreakQuestion.f20419id = "";
                        }
                        if (iceBreakQuestion.content == null) {
                            iceBreakQuestion.content = "";
                        }
                        if (iceBreakQuestion.source != null) {
                            break;
                        }
                        iceBreakQuestion.source = "";
                        return iceBreakQuestion;
                    }
                    iceBreakQuestion.source = nb5Var.m158750s();
                }
            }
            return iceBreakQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakQuestion iceBreakQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakQuestion.f20419id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = iceBreakQuestion.content;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = iceBreakQuestion.source;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<IceBreakQuestion> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakQuestion newInstance() {
            return new IceBreakQuestion();
        }

        public boolean parseField(IceBreakQuestion iceBreakQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    iceBreakQuestion.source = jsonParser.getValueAsString();
                    return true;
                case "id":
                    iceBreakQuestion.f20419id = jsonParser.getValueAsString();
                    return false;
                case "content":
                    iceBreakQuestion.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IceBreakQuestion iceBreakQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "source":
                    return true;
                case "id":
                    return false;
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(iceBreakQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakQuestion iceBreakQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakQuestion.f20419id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = iceBreakQuestion.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
            String str3 = iceBreakQuestion.source;
            if (str3 != null) {
                jsonGenerator.writeStringField("source", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakQuestion new_() {
        IceBreakQuestion iceBreakQuestion = new IceBreakQuestion();
        iceBreakQuestion.nullCheck();
        return iceBreakQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreakQuestion mo223809clone() {
        IceBreakQuestion iceBreakQuestion = new IceBreakQuestion();
        iceBreakQuestion.f20419id = this.f20419id;
        iceBreakQuestion.content = this.content;
        iceBreakQuestion.source = this.source;
        return iceBreakQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IceBreakQuestion)) {
            return false;
        }
        IceBreakQuestion iceBreakQuestion = (IceBreakQuestion) obj;
        return ValueObject.util_equals(this.f20419id, iceBreakQuestion.f20419id) && ValueObject.util_equals(this.content, iceBreakQuestion.content) && ValueObject.util_equals(this.source, iceBreakQuestion.source);
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
        String str = this.f20419id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.source;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20419id == null) {
            this.f20419id = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
