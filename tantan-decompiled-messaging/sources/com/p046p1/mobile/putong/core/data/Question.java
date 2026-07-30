package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class Question extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "question";

    @Nullable
    @ProtobufIndex(index = 51)
    public List<Answer> answers;

    @NonNull
    @ProtobufIndex(index = 52)
    public QuestionCategory category;

    @NonNull
    @ProtobufIndex(index = 55)
    public QuestionEditable editable;

    @NonNull
    @ProtobufIndex(index = 57)
    public String source;

    @NonNull
    @ProtobufIndex(index = 53)
    public String text;

    @NonNull
    @ProtobufIndex(index = 54)
    public String title;
    public static ProtobufAdapter<Question> PROTOBUF_ADAPTER = new MessageNanoAdapter<Question>() { // from class: com.p1.mobile.putong.core.data.Question.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Question question) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, question._id);
            String str = question.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            List<Answer> list = question.answers;
            if (list != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(51, list, Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            QuestionCategory questionCategory = question.category;
            if (questionCategory != null) {
                iM17228j += CodedOutputByteBufferNano.m17226h(52, questionCategory.ordinal());
            }
            String str2 = question.text;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(53, str2);
            }
            String str3 = question.title;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(54, str3);
            }
            QuestionEditable questionEditable = question.editable;
            if (questionEditable != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(55, questionEditable, QuestionEditable.PROTOBUF_ADAPTER);
            }
            QuestionCategory questionCategory2 = question.category;
            if (questionCategory2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(56, questionCategory2, QuestionCategory.PROTOBUF_ADAPTER);
            }
            String str4 = question.source;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(57, str4);
            }
            question.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Question parse(nb5 nb5Var) throws IOException {
            Question question = new Question();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (question.category == null && numValueOf != null) {
                        question.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (question.category == null) {
                        question.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.defaultEnum();
                    }
                    if (question.text == null) {
                        question.text = "";
                    }
                    if (question.title == null) {
                        question.title = "";
                    }
                    if (question.editable == null) {
                        question.editable = QuestionEditable.new_();
                    }
                    if (question.source != null) {
                        break;
                    }
                    question.source = "";
                    break;
                }
                if (iM158752u == 8) {
                    question._id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    question.f56011id = nb5Var.m158750s();
                } else if (iM158752u == 410) {
                    question.answers = (List) nb5Var.m158743l(Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 416) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 426) {
                    question.text = nb5Var.m158750s();
                } else if (iM158752u == 434) {
                    question.title = nb5Var.m158750s();
                } else if (iM158752u == 442) {
                    question.editable = (QuestionEditable) nb5Var.m158743l(QuestionEditable.PROTOBUF_ADAPTER);
                } else if (iM158752u == 450) {
                    question.category = (QuestionCategory) nb5Var.m158743l(QuestionCategory.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 458) {
                        if (question.category == null && numValueOf != null) {
                            question.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (question.category == null) {
                            question.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (question.text == null) {
                            question.text = "";
                        }
                        if (question.title == null) {
                            question.title = "";
                        }
                        if (question.editable == null) {
                            question.editable = QuestionEditable.new_();
                        }
                        if (question.source != null) {
                            break;
                        }
                        question.source = "";
                        return question;
                    }
                    question.source = nb5Var.m158750s();
                }
            }
            return question;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Question question, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, question._id);
            String str = question.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            List<Answer> list = question.answers;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(51, list, Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            QuestionCategory questionCategory = question.category;
            if (questionCategory != null) {
                codedOutputByteBufferNano.m17250G(52, questionCategory.ordinal());
            }
            String str2 = question.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(53, str2);
            }
            String str3 = question.title;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(54, str3);
            }
            QuestionEditable questionEditable = question.editable;
            if (questionEditable != null) {
                codedOutputByteBufferNano.m17254K(55, questionEditable, QuestionEditable.PROTOBUF_ADAPTER);
            }
            QuestionCategory questionCategory2 = question.category;
            if (questionCategory2 != null) {
                codedOutputByteBufferNano.m17254K(56, questionCategory2, QuestionCategory.PROTOBUF_ADAPTER);
            }
            String str4 = question.source;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(57, str4);
            }
        }
    };
    public static JsonAdapter<Question> JSON_ADAPTER = new ObjectJsonAdapter<Question>() { // from class: com.p1.mobile.putong.core.data.Question.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Question.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Question newInstance() {
            return new Question();
        }

        public boolean parseField(Question question, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    question.source = jsonParser.getValueAsString();
                    return true;
                case "answers":
                    question.answers = JsonAdapter.parseArray(jsonParser, Answer.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    question.f56011id = jsonParser.getValueAsString();
                    return false;
                case "text":
                    question.text = jsonParser.getValueAsString();
                    return true;
                case "category":
                    question.category = QuestionCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "title":
                    question.title = jsonParser.getValueAsString();
                    return true;
                case "editable":
                    question.editable = QuestionEditable.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Question question, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "source":
                case "answers":
                    return true;
                case "id":
                    return false;
                case "text":
                case "category":
                case "title":
                case "editable":
                    return true;
                default:
                    return super.parseFieldCheck(question, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Question question, JsonGenerator jsonGenerator) throws IOException {
            String str = question.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (question.answers != null) {
                jsonGenerator.writeFieldName("answers");
                JsonAdapter.serializeArray(question.answers, jsonGenerator, Answer.JSON_ADAPTER);
            }
            if (question.category != null) {
                jsonGenerator.writeFieldName("category");
                QuestionCategory.JSON_ADAPTER.serialize(question.category, jsonGenerator, true);
            }
            String str2 = question.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = question.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            if (question.editable != null) {
                jsonGenerator.writeFieldName("editable");
                QuestionEditable.JSON_ADAPTER.serialize(question.editable, jsonGenerator, true);
            }
            String str4 = question.source;
            if (str4 != null) {
                jsonGenerator.writeStringField("source", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Question) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Question) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Question> _ID = new LongColumn<Question>("_id") { // from class: com.p1.mobile.putong.core.data.Question.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Question question) {
            return Long.valueOf(question._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Question question, Long l2) {
            question._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Question> f20479ID = new StringColumn<Question>("id_c") { // from class: com.p1.mobile.putong.core.data.Question.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Question question) {
            return question.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Question question, String str) {
            question.f56011id = str;
        }
    };
    public static final Column<Question, List<Answer>> ANSWERS = new Column<Question, List<Answer>>("answers_c") { // from class: com.p1.mobile.putong.core.data.Question.5
        @Override // com.tantanapp.common.data.orm.Column
        public List<Answer> get(Question question) {
            return question.answers;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Question question, List<Answer> list) {
            question.answers = list;
        }
    };
    public static final TEnumColumn<Question, QuestionCategory> CATEGORY = new TEnumColumn<Question, QuestionCategory>("str_category_c", "category_c", QuestionCategory.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.Question.6
        @Override // com.tantanapp.common.data.orm.Column
        public QuestionCategory get(Question question) {
            return question.category;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(Question question, QuestionCategory questionCategory) {
            question.category = questionCategory;
        }
    };
    public static final StringColumn<Question> TEXT = new StringColumn<Question>("text_c") { // from class: com.p1.mobile.putong.core.data.Question.7
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Question question) {
            return question.text;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Question question, String str) {
            question.text = str;
        }
    };
    public static final StringColumn<Question> TITLE = new StringColumn<Question>("title_c") { // from class: com.p1.mobile.putong.core.data.Question.8
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Question question) {
            return question.title;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Question question, String str) {
            question.title = str;
        }
    };
    public static final Column<Question, List<String>> EDITABLE_LANGUAGES = new Column<Question, List<String>>("editable_languages_c") { // from class: com.p1.mobile.putong.core.data.Question.9
        @Override // com.tantanapp.common.data.orm.Column
        public List<String> get(Question question) {
            return question.editable.languages;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Question question, List<String> list) {
            question.editable.languages = list;
        }
    };
    public static final StringColumn<Question> SOURCE = new StringColumn<Question>("source_c") { // from class: com.p1.mobile.putong.core.data.Question.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Question question) {
            return question.source;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Question question, String str) {
            question.source = str;
        }
    };
    public static mrf0<Question> DB_ADAPTER = new mrf0<Question>() { // from class: com.p1.mobile.putong.core.data.Question.11
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,answers_c BLOB,category_c INTEGER,text_c TEXT,title_c TEXT,editable_languages_c BLOB,str_category_c TEXT,source_c TEXT)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return Question.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public Question init() {
            Question question = new Question();
            if (question.category == null) {
                question.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.defaultEnum();
            }
            if (question.text == null) {
                question.text = "";
            }
            if (question.title == null) {
                question.title = "";
            }
            if (question.editable == null) {
                question.editable = QuestionEditable.new_();
            }
            if (question.source == null) {
                question.source = "";
            }
            return question;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public Question read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            Question question = new Question();
            String string = "unknown_";
            int i2 = -1;
            try {
                question.editable = new QuestionEditable();
                question._id = cursor.getLong(i);
                int i3 = i + 1;
                String string2 = null;
                question.f56011id = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 2;
                question.answers = cursor.isNull(i4) ? null : Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i4));
                int i5 = i + 3;
                if (!cursor.isNull(i5)) {
                    i2 = cursor.getInt(i5);
                }
                int i6 = i + 4;
                question.text = cursor.isNull(i6) ? null : cursor.getString(i6);
                int i7 = i + 5;
                question.title = cursor.isNull(i7) ? null : cursor.getString(i7);
                int i8 = i + 6;
                question.editable.languages = cursor.isNull(i8) ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i8));
                int i9 = i + 7;
                string = cursor.isNull(i9) ? null : cursor.getString(i9);
                int i10 = i + 8;
                if (!cursor.isNull(i10)) {
                    string2 = cursor.getString(i10);
                }
                question.source = string2;
                this.readIndex = i + 9;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            TEnumJsonAdapter<QuestionCategory> tEnumJsonAdapter = QuestionCategory.JSON_ADAPTER;
            QuestionCategory questionCategory = (QuestionCategory) tEnumJsonAdapter.newTEnum(string, i2);
            question.category = questionCategory;
            if (questionCategory == null) {
                question.category = (QuestionCategory) tEnumJsonAdapter.defaultEnum();
            }
            if (question.text == null) {
                question.text = "";
            }
            if (question.title == null) {
                question.title = "";
            }
            if (question.editable == null) {
                question.editable = QuestionEditable.new_();
            }
            if (question.source == null) {
                question.source = "";
            }
            return question;
        }

        @Override // p149l.mrf0
        public void write(Question question, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", question.f56011id);
                DbObject.cvPut(contentValues, "answers_c", question.answers == null ? null : Answer.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(question.answers));
                QuestionCategory questionCategory = question.category;
                DbObject.cvPut(contentValues, "str_category_c", questionCategory == null ? null : questionCategory.toString());
                QuestionCategory questionCategory2 = question.category;
                DbObject.cvPut(contentValues, "category_c", questionCategory2 == null ? null : Integer.valueOf(questionCategory2.ordinal()));
                DbObject.cvPut(contentValues, "text_c", question.text);
                DbObject.cvPut(contentValues, "title_c", question.title);
                DbObject.cvPut(contentValues, "editable_languages_c", question.editable.languages == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(question.editable.languages));
                DbObject.cvPut(contentValues, "source_c", question.source);
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static Question new_() {
        Question question = new Question();
        question.nullCheck();
        return question;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Question mo223809clone() {
        Question question = new Question();
        question._id = this._id;
        question.f56011id = this.f56011id;
        List<Answer> list = this.answers;
        if (list != null) {
            question.answers = ValueObject.util_map(list, new w9j() { // from class: l.wnb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Answer) obj).mo223809clone();
                }
            });
        }
        question.category = this.category;
        question.text = this.text;
        question.title = this.title;
        QuestionEditable questionEditable = this.editable;
        if (questionEditable != null) {
            question.editable = questionEditable.mo223809clone();
        }
        question.source = this.source;
        return question;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Question)) {
            return false;
        }
        Question question = (Question) obj;
        return super.equals(obj) && ValueObject.util_equals(this.answers, question.answers) && ValueObject.util_equals(this.category, question.category) && ValueObject.util_equals(this.text, question.text) && ValueObject.util_equals(this.title, question.title) && ValueObject.util_equals(this.editable, question.editable) && ValueObject.util_equals(this.source, question.source);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "question";
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<Answer> list = this.answers;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        QuestionCategory questionCategory = this.category;
        int iHashCode3 = (iHashCode2 + (questionCategory != null ? questionCategory.hashCode() : 0)) * 41;
        String str = this.text;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        QuestionEditable questionEditable = this.editable;
        int iHashCode6 = (iHashCode5 + (questionEditable != null ? questionEditable.hashCode() : 0)) * 41;
        String str3 = this.source;
        int iHashCode7 = iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.category == null) {
            this.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.editable == null) {
            this.editable = QuestionEditable.new_();
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
