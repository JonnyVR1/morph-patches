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
public class IceBreakQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakquestion";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f81id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String source;
    public static ProtobufAdapter<IceBreakQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IceBreakQuestion iceBreakQuestion) {
            String str = iceBreakQuestion.f81id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = iceBreakQuestion.content;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = iceBreakQuestion.source;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) iceBreakQuestion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IceBreakQuestion m13385parse(nb5 nb5Var) throws IOException {
            IceBreakQuestion iceBreakQuestion = new IceBreakQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (iceBreakQuestion.f81id == null) {
                        iceBreakQuestion.f81id = "";
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
                if (iU == 10) {
                    iceBreakQuestion.f81id = nb5Var.s();
                } else if (iU == 18) {
                    iceBreakQuestion.content = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (iceBreakQuestion.f81id == null) {
                            iceBreakQuestion.f81id = "";
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
                    iceBreakQuestion.source = nb5Var.s();
                }
            }
            return iceBreakQuestion;
        }

        public void serialize(IceBreakQuestion iceBreakQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iceBreakQuestion.f81id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = iceBreakQuestion.content;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = iceBreakQuestion.source;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<IceBreakQuestion> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakQuestion>() { // from class: com.p1.mobile.putong.core.data.IceBreakQuestion.2
        public Class getDataClass() {
            return IceBreakQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IceBreakQuestion m13386newInstance() {
            return new IceBreakQuestion();
        }

        public boolean parseField(IceBreakQuestion iceBreakQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    iceBreakQuestion.source = jsonParser.getValueAsString();
                    return true;
                case "id":
                    iceBreakQuestion.f81id = jsonParser.getValueAsString();
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

        public void serializeFields(IceBreakQuestion iceBreakQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = iceBreakQuestion.f81id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = iceBreakQuestion.content;
            if (str2 != null) {
                jsonGenerator.writeStringField(Content.TYPE, str2);
            }
            String str3 = iceBreakQuestion.source;
            if (str3 != null) {
                jsonGenerator.writeStringField("source", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakQuestion new_() {
        IceBreakQuestion iceBreakQuestion = new IceBreakQuestion();
        iceBreakQuestion.nullCheck();
        return iceBreakQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IceBreakQuestion m13384clone() {
        IceBreakQuestion iceBreakQuestion = new IceBreakQuestion();
        iceBreakQuestion.f81id = this.f81id;
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
        return ValueObject.util_equals(this.f81id, iceBreakQuestion.f81id) && ValueObject.util_equals(this.content, iceBreakQuestion.content) && ValueObject.util_equals(this.source, iceBreakQuestion.source);
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
        String str = this.f81id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.source;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f81id == null) {
            this.f81id = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
