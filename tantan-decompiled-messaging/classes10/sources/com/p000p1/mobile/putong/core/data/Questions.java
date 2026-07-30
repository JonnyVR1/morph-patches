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
public class Questions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "questions";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public Content content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f143id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String index;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String type;
    public static ProtobufAdapter<Questions> PROTOBUF_ADAPTER = new MessageNanoAdapter<Questions>() { // from class: com.p1.mobile.putong.core.data.Questions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Questions questions) {
            String str = questions.f143id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = questions.index;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = questions.type;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = questions.title;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            Content content = questions.content;
            if (content != null) {
                iO += CodedOutputByteBufferNano.l(5, content, Content.PROTOBUF_ADAPTER);
            }
            ((MessageNano) questions).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Questions m15145parse(nb5 nb5Var) throws IOException {
            Questions questions = new Questions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (questions.f143id == null) {
                        questions.f143id = "";
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
                if (iU == 10) {
                    questions.f143id = nb5Var.s();
                } else if (iU == 18) {
                    questions.index = nb5Var.s();
                } else if (iU == 26) {
                    questions.type = nb5Var.s();
                } else if (iU == 34) {
                    questions.title = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (questions.f143id == null) {
                            questions.f143id = "";
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
                    questions.content = (Content) nb5Var.l(Content.PROTOBUF_ADAPTER);
                }
            }
            return questions;
        }

        public void serialize(Questions questions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = questions.f143id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = questions.index;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = questions.type;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = questions.title;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            Content content = questions.content;
            if (content != null) {
                codedOutputByteBufferNano.K(5, content, Content.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Questions> JSON_ADAPTER = new ObjectJsonAdapter<Questions>() { // from class: com.p1.mobile.putong.core.data.Questions.2
        public Class getDataClass() {
            return Questions.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Questions m15146newInstance() {
            return new Questions();
        }

        public boolean parseField(Questions questions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    questions.f143id = jsonParser.getValueAsString();
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
                    questions.content = (Content) Content.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(Questions questions, JsonGenerator jsonGenerator) throws IOException {
            String str = questions.f143id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = questions.index;
            if (str2 != null) {
                jsonGenerator.writeStringField("index", str2);
            }
            String str3 = questions.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = questions.title;
            if (str4 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str4);
            }
            if (questions.content != null) {
                jsonGenerator.writeFieldName(Content.TYPE);
                Content.JSON_ADAPTER.serialize(questions.content, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Questions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Questions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Questions new_() {
        Questions questions = new Questions();
        questions.nullCheck();
        return questions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Questions m15144clone() {
        Questions questions = new Questions();
        questions.f143id = this.f143id;
        questions.index = this.index;
        questions.type = this.type;
        questions.title = this.title;
        Content content = this.content;
        if (content != null) {
            questions.content = content.m12260clone();
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
        return ValueObject.util_equals(this.f143id, questions.f143id) && ValueObject.util_equals(this.index, questions.index) && ValueObject.util_equals(this.type, questions.type) && ValueObject.util_equals(this.title, questions.title) && ValueObject.util_equals(this.content, questions.content);
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
        String str = this.f143id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.index;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        Content content = this.content;
        int iHashCode5 = iHashCode4 + (content != null ? content.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f143id == null) {
            this.f143id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
