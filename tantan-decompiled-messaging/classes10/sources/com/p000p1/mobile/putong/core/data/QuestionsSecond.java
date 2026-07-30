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
public class QuestionsSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionssecond";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public ContentSecond content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f144id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String index;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String type;
    public static ProtobufAdapter<QuestionsSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionsSecond>() { // from class: com.p1.mobile.putong.core.data.QuestionsSecond.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuestionsSecond questionsSecond) {
            String str = questionsSecond.f144id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = questionsSecond.index;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = questionsSecond.type;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = questionsSecond.title;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ContentSecond contentSecond = questionsSecond.content;
            if (contentSecond != null) {
                iO += CodedOutputByteBufferNano.l(5, contentSecond, ContentSecond.PROTOBUF_ADAPTER);
            }
            ((MessageNano) questionsSecond).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuestionsSecond m15149parse(nb5 nb5Var) throws IOException {
            QuestionsSecond questionsSecond = new QuestionsSecond();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (questionsSecond.f144id == null) {
                        questionsSecond.f144id = "";
                    }
                    if (questionsSecond.index == null) {
                        questionsSecond.index = "";
                    }
                    if (questionsSecond.type == null) {
                        questionsSecond.type = "";
                    }
                    if (questionsSecond.title == null) {
                        questionsSecond.title = "";
                    }
                    if (questionsSecond.content != null) {
                        break;
                    }
                    questionsSecond.content = ContentSecond.new_();
                    break;
                }
                if (iU == 10) {
                    questionsSecond.f144id = nb5Var.s();
                } else if (iU == 18) {
                    questionsSecond.index = nb5Var.s();
                } else if (iU == 26) {
                    questionsSecond.type = nb5Var.s();
                } else if (iU == 34) {
                    questionsSecond.title = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (questionsSecond.f144id == null) {
                            questionsSecond.f144id = "";
                        }
                        if (questionsSecond.index == null) {
                            questionsSecond.index = "";
                        }
                        if (questionsSecond.type == null) {
                            questionsSecond.type = "";
                        }
                        if (questionsSecond.title == null) {
                            questionsSecond.title = "";
                        }
                        if (questionsSecond.content != null) {
                            break;
                        }
                        questionsSecond.content = ContentSecond.new_();
                        return questionsSecond;
                    }
                    questionsSecond.content = (ContentSecond) nb5Var.l(ContentSecond.PROTOBUF_ADAPTER);
                }
            }
            return questionsSecond;
        }

        public void serialize(QuestionsSecond questionsSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questionsSecond.f144id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = questionsSecond.index;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = questionsSecond.type;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = questionsSecond.title;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            ContentSecond contentSecond = questionsSecond.content;
            if (contentSecond != null) {
                codedOutputByteBufferNano.K(5, contentSecond, ContentSecond.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<QuestionsSecond> JSON_ADAPTER = new ObjectJsonAdapter<QuestionsSecond>() { // from class: com.p1.mobile.putong.core.data.QuestionsSecond.2
        public Class getDataClass() {
            return QuestionsSecond.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuestionsSecond m15150newInstance() {
            return new QuestionsSecond();
        }

        public boolean parseField(QuestionsSecond questionsSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    questionsSecond.f144id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    questionsSecond.type = jsonParser.getValueAsString();
                    return true;
                case "index":
                    questionsSecond.index = jsonParser.getValueAsString();
                    return true;
                case "title":
                    questionsSecond.title = jsonParser.getValueAsString();
                    return true;
                case "content":
                    questionsSecond.content = (ContentSecond) ContentSecond.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuestionsSecond questionsSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "index":
                case "title":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(questionsSecond, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(QuestionsSecond questionsSecond, JsonGenerator jsonGenerator) throws IOException {
            String str = questionsSecond.f144id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = questionsSecond.index;
            if (str2 != null) {
                jsonGenerator.writeStringField("index", str2);
            }
            String str3 = questionsSecond.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = questionsSecond.title;
            if (str4 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str4);
            }
            if (questionsSecond.content != null) {
                jsonGenerator.writeFieldName(Content.TYPE);
                ContentSecond.JSON_ADAPTER.serialize(questionsSecond.content, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionsSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionsSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuestionsSecond new_() {
        QuestionsSecond questionsSecond = new QuestionsSecond();
        questionsSecond.nullCheck();
        return questionsSecond;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuestionsSecond m15148clone() {
        QuestionsSecond questionsSecond = new QuestionsSecond();
        questionsSecond.f144id = this.f144id;
        questionsSecond.index = this.index;
        questionsSecond.type = this.type;
        questionsSecond.title = this.title;
        ContentSecond contentSecond = this.content;
        if (contentSecond != null) {
            questionsSecond.content = contentSecond.m12264clone();
        }
        return questionsSecond;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuestionsSecond)) {
            return false;
        }
        QuestionsSecond questionsSecond = (QuestionsSecond) obj;
        return ValueObject.util_equals(this.f144id, questionsSecond.f144id) && ValueObject.util_equals(this.index, questionsSecond.index) && ValueObject.util_equals(this.type, questionsSecond.type) && ValueObject.util_equals(this.title, questionsSecond.title) && ValueObject.util_equals(this.content, questionsSecond.content);
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
        String str = this.f144id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.index;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        ContentSecond contentSecond = this.content;
        int iHashCode5 = iHashCode4 + (contentSecond != null ? contentSecond.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f144id == null) {
            this.f144id = "";
        }
        if (this.index == null) {
            this.index = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = ContentSecond.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
