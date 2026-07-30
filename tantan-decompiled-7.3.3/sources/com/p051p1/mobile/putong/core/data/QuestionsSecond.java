package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class QuestionsSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questionssecond";

    @NonNull
    @ProtobufIndex(index = 5)
    public ContentSecond content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21224id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String index;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<QuestionsSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuestionsSecond>() { // from class: com.p1.mobile.putong.core.data.QuestionsSecond.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(QuestionsSecond questionsSecond) {
            String str = questionsSecond.f21224id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = questionsSecond.index;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = questionsSecond.type;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = questionsSecond.title;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            ContentSecond contentSecond = questionsSecond.content;
            if (contentSecond != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, contentSecond, ContentSecond.PROTOBUF_ADAPTER);
            }
            questionsSecond.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public QuestionsSecond parse(nc5 nc5Var) throws IOException {
            QuestionsSecond questionsSecond = new QuestionsSecond();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (questionsSecond.f21224id == null) {
                        questionsSecond.f21224id = "";
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
                if (iM162497u == 10) {
                    questionsSecond.f21224id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    questionsSecond.index = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    questionsSecond.type = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    questionsSecond.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (questionsSecond.f21224id == null) {
                            questionsSecond.f21224id = "";
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
                    questionsSecond.content = (ContentSecond) nc5Var.m162488l(ContentSecond.PROTOBUF_ADAPTER);
                }
            }
            return questionsSecond;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(QuestionsSecond questionsSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questionsSecond.f21224id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = questionsSecond.index;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = questionsSecond.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = questionsSecond.title;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            ContentSecond contentSecond = questionsSecond.content;
            if (contentSecond != null) {
                codedOutputByteBufferNano.m17309K(5, contentSecond, ContentSecond.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<QuestionsSecond> JSON_ADAPTER = new ObjectJsonAdapter<QuestionsSecond>() { // from class: com.p1.mobile.putong.core.data.QuestionsSecond.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return QuestionsSecond.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public QuestionsSecond newInstance() {
            return new QuestionsSecond();
        }

        public boolean parseField(QuestionsSecond questionsSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    questionsSecond.f21224id = jsonParser.getValueAsString();
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
                    questionsSecond.content = ContentSecond.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(QuestionsSecond questionsSecond, JsonGenerator jsonGenerator) throws IOException {
            String str = questionsSecond.f21224id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = questionsSecond.index;
            if (str2 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.INDEX, str2);
            }
            String str3 = questionsSecond.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = questionsSecond.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            if (questionsSecond.content != null) {
                jsonGenerator.writeFieldName("content");
                ContentSecond.JSON_ADAPTER.serialize(questionsSecond.content, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuestionsSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuestionsSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuestionsSecond new_() {
        QuestionsSecond questionsSecond = new QuestionsSecond();
        questionsSecond.nullCheck();
        return questionsSecond;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public QuestionsSecond mo225055clone() {
        QuestionsSecond questionsSecond = new QuestionsSecond();
        questionsSecond.f21224id = this.f21224id;
        questionsSecond.index = this.index;
        questionsSecond.type = this.type;
        questionsSecond.title = this.title;
        ContentSecond contentSecond = this.content;
        if (contentSecond != null) {
            questionsSecond.content = contentSecond.mo225055clone();
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
        return ValueObject.util_equals(this.f21224id, questionsSecond.f21224id) && ValueObject.util_equals(this.index, questionsSecond.index) && ValueObject.util_equals(this.type, questionsSecond.type) && ValueObject.util_equals(this.title, questionsSecond.title) && ValueObject.util_equals(this.content, questionsSecond.content);
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
        String str = this.f21224id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.index;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        ContentSecond contentSecond = this.content;
        int iHashCode5 = iHashCode4 + (contentSecond != null ? contentSecond.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21224id == null) {
            this.f21224id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
