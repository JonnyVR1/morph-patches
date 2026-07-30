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
public class Questions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questions";

    @NonNull
    @ProtobufIndex(index = 5)
    public Content content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21223id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String index;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<Questions> PROTOBUF_ADAPTER = new MessageNanoAdapter<Questions>() { // from class: com.p1.mobile.putong.core.data.Questions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Questions questions) {
            String str = questions.f21223id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = questions.index;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = questions.type;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = questions.title;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            Content content = questions.content;
            if (content != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, content, Content.PROTOBUF_ADAPTER);
            }
            questions.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Questions parse(nc5 nc5Var) throws IOException {
            Questions questions = new Questions();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (questions.f21223id == null) {
                        questions.f21223id = "";
                    }
                    if (questions.index == null) {
                        questions.index = "";
                    }
                    if (questions.type == null) {
                        questions.type = "";
                    }
                    if (questions.title == null) {
                        questions.title = "";
                    }
                    if (questions.content != null) {
                        break;
                    }
                    questions.content = Content.new_();
                    break;
                }
                if (iM162497u == 10) {
                    questions.f21223id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    questions.index = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    questions.type = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    questions.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (questions.f21223id == null) {
                            questions.f21223id = "";
                        }
                        if (questions.index == null) {
                            questions.index = "";
                        }
                        if (questions.type == null) {
                            questions.type = "";
                        }
                        if (questions.title == null) {
                            questions.title = "";
                        }
                        if (questions.content != null) {
                            break;
                        }
                        questions.content = Content.new_();
                        return questions;
                    }
                    questions.content = (Content) nc5Var.m162488l(Content.PROTOBUF_ADAPTER);
                }
            }
            return questions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Questions questions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questions.f21223id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = questions.index;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = questions.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = questions.title;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            Content content = questions.content;
            if (content != null) {
                codedOutputByteBufferNano.m17309K(5, content, Content.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Questions> JSON_ADAPTER = new ObjectJsonAdapter<Questions>() { // from class: com.p1.mobile.putong.core.data.Questions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Questions.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Questions newInstance() {
            return new Questions();
        }

        public boolean parseField(Questions questions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    questions.f21223id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    questions.type = jsonParser.getValueAsString();
                    return true;
                case "index":
                    questions.index = jsonParser.getValueAsString();
                    return true;
                case "title":
                    questions.title = jsonParser.getValueAsString();
                    return true;
                case "content":
                    questions.content = Content.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Questions questions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
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
                    return super.parseFieldCheck(questions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Questions questions, JsonGenerator jsonGenerator) throws IOException {
            String str = questions.f21223id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = questions.index;
            if (str2 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.INDEX, str2);
            }
            String str3 = questions.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = questions.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            if (questions.content != null) {
                jsonGenerator.writeFieldName("content");
                Content.JSON_ADAPTER.serialize(questions.content, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Questions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Questions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Questions new_() {
        Questions questions = new Questions();
        questions.nullCheck();
        return questions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Questions mo225055clone() {
        Questions questions = new Questions();
        questions.f21223id = this.f21223id;
        questions.index = this.index;
        questions.type = this.type;
        questions.title = this.title;
        Content content = this.content;
        if (content != null) {
            questions.content = content.mo225055clone();
        }
        return questions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Questions)) {
            return false;
        }
        Questions questions = (Questions) obj;
        return ValueObject.util_equals(this.f21223id, questions.f21223id) && ValueObject.util_equals(this.index, questions.index) && ValueObject.util_equals(this.type, questions.type) && ValueObject.util_equals(this.title, questions.title) && ValueObject.util_equals(this.content, questions.content);
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
        String str = this.f21223id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.index;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        Content content = this.content;
        int iHashCode5 = iHashCode4 + (content != null ? content.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21223id == null) {
            this.f21223id = "";
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
            this.content = Content.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
