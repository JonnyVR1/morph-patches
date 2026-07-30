package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.OOFQuestion;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class OOFQuestion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "oofquestion";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String questionID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String questionText;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> userIds;
    public static ProtobufAdapter<OOFQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<OOFQuestion>() { // from class: com.p1.mobile.putong.core.data.OOFQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OOFQuestion oOFQuestion) {
            String str = oOFQuestion.questionText;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = oOFQuestion.questionID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<String> list = oOFQuestion.userIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) oOFQuestion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OOFQuestion m14629parse(nb5 nb5Var) throws IOException {
            OOFQuestion oOFQuestion = new OOFQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oOFQuestion.questionText == null) {
                        oOFQuestion.questionText = "";
                    }
                    if (oOFQuestion.questionID == null) {
                        oOFQuestion.questionID = "";
                    }
                    if (oOFQuestion.userIds != null) {
                        break;
                    }
                    oOFQuestion.userIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    oOFQuestion.questionText = nb5Var.s();
                } else if (iU == 18) {
                    oOFQuestion.questionID = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (oOFQuestion.questionText == null) {
                            oOFQuestion.questionText = "";
                        }
                        if (oOFQuestion.questionID == null) {
                            oOFQuestion.questionID = "";
                        }
                        if (oOFQuestion.userIds != null) {
                            break;
                        }
                        oOFQuestion.userIds = new ArrayList();
                        return oOFQuestion;
                    }
                    oOFQuestion.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oOFQuestion;
        }

        public void serialize(OOFQuestion oOFQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oOFQuestion.questionText;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = oOFQuestion.questionID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<String> list = oOFQuestion.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OOFQuestion> JSON_ADAPTER = new ObjectJsonAdapter<OOFQuestion>() { // from class: com.p1.mobile.putong.core.data.OOFQuestion.2
        public Class getDataClass() {
            return OOFQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OOFQuestion m14630newInstance() {
            return new OOFQuestion();
        }

        public boolean parseField(OOFQuestion oOFQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "questionText":
                    oOFQuestion.questionText = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    oOFQuestion.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "questionID":
                    oOFQuestion.questionID = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OOFQuestion oOFQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "questionText":
                case "userIds":
                case "questionID":
                    return true;
                default:
                    return super.parseFieldCheck(oOFQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(OOFQuestion oOFQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = oOFQuestion.questionText;
            if (str != null) {
                jsonGenerator.writeStringField("questionText", str);
            }
            String str2 = oOFQuestion.questionID;
            if (str2 != null) {
                jsonGenerator.writeStringField("questionID", str2);
            }
            if (oOFQuestion.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(oOFQuestion.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OOFQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OOFQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m536a(String str) {
        return str;
    }

    public static OOFQuestion new_() {
        OOFQuestion oOFQuestion = new OOFQuestion();
        oOFQuestion.nullCheck();
        return oOFQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OOFQuestion m14628clone() {
        OOFQuestion oOFQuestion = new OOFQuestion();
        oOFQuestion.questionText = this.questionText;
        oOFQuestion.questionID = this.questionID;
        List<String> list = this.userIds;
        if (list != null) {
            oOFQuestion.userIds = ValueObject.util_map(list, new w9j() { // from class: l.vz40
                public final Object call(Object obj) {
                    return OOFQuestion.m536a((String) obj);
                }
            });
        }
        return oOFQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OOFQuestion)) {
            return false;
        }
        OOFQuestion oOFQuestion = (OOFQuestion) obj;
        return ValueObject.util_equals(this.questionText, oOFQuestion.questionText) && ValueObject.util_equals(this.questionID, oOFQuestion.questionID) && ValueObject.util_equals(this.userIds, oOFQuestion.userIds);
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
        String str = this.questionText;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.questionID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.questionText == null) {
            this.questionText = "";
        }
        if (this.questionID == null) {
            this.questionID = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
