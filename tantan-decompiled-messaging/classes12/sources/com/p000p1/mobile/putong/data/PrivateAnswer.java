package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
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
public class PrivateAnswer extends ValueObject implements Cloneable, Serializable {
    public static final String REAL_TYPE = "privateQuestion";
    public static final String TYPE = "privateanswer";

    @NonNull
    @ProtobufIndex(index = 2)
    public String question;

    @NonNull
    @ProtobufIndex(index = 1)
    public String selection;
    public static ProtobufAdapter<PrivateAnswer> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateAnswer>() { // from class: com.p1.mobile.putong.data.PrivateAnswer.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivateAnswer privateAnswer) {
            String str = privateAnswer.selection;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = privateAnswer.question;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) privateAnswer).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivateAnswer m18826parse(nb5 nb5Var) throws IOException {
            PrivateAnswer privateAnswer = new PrivateAnswer();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privateAnswer.selection == null) {
                        privateAnswer.selection = "";
                    }
                    if (privateAnswer.question != null) {
                        break;
                    }
                    privateAnswer.question = "";
                    break;
                }
                if (iU == 10) {
                    privateAnswer.selection = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (privateAnswer.selection == null) {
                            privateAnswer.selection = "";
                        }
                        if (privateAnswer.question != null) {
                            break;
                        }
                        privateAnswer.question = "";
                        return privateAnswer;
                    }
                    privateAnswer.question = nb5Var.s();
                }
            }
            return privateAnswer;
        }

        public void serialize(PrivateAnswer privateAnswer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privateAnswer.selection;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = privateAnswer.question;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<PrivateAnswer> JSON_ADAPTER = new ObjectJsonAdapter<PrivateAnswer>() { // from class: com.p1.mobile.putong.data.PrivateAnswer.2
        public Class getDataClass() {
            return PrivateAnswer.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PrivateAnswer mo17830newInstance() {
            return new PrivateAnswer();
        }

        public boolean parseField(PrivateAnswer privateAnswer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(MatchFrom.selection)) {
                privateAnswer.selection = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(MomentMessageType.question)) {
                return false;
            }
            privateAnswer.question = (String) Converter.MPQ_ID.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(PrivateAnswer privateAnswer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(MatchFrom.selection) || str.equals(MomentMessageType.question)) {
                return true;
            }
            return super.parseFieldCheck(privateAnswer, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateAnswer privateAnswer, JsonGenerator jsonGenerator) throws IOException {
            String str = privateAnswer.selection;
            if (str != null) {
                jsonGenerator.writeStringField(MatchFrom.selection, str);
            }
            if (privateAnswer.question != null) {
                jsonGenerator.writeFieldName(MomentMessageType.question);
                Converter.MPQ_ID.serialize(privateAnswer.question, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateAnswer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateAnswer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivateAnswer new_() {
        PrivateAnswer privateAnswer = new PrivateAnswer();
        privateAnswer.nullCheck();
        return privateAnswer;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivateAnswer m18825clone() {
        PrivateAnswer privateAnswer = new PrivateAnswer();
        privateAnswer.selection = this.selection;
        privateAnswer.question = this.question;
        return privateAnswer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateAnswer)) {
            return false;
        }
        PrivateAnswer privateAnswer = (PrivateAnswer) obj;
        return ValueObject.util_equals(this.selection, privateAnswer.selection) && ValueObject.util_equals(this.question, privateAnswer.question);
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
        String str = this.selection;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.question;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.selection == null) {
            this.selection = "";
        }
        if (this.question == null) {
            this.question = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
