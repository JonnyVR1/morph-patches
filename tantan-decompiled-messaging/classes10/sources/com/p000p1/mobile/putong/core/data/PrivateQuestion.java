package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Option;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.mrf0;
import l.nb5;
import l.orh0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PrivateQuestion extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "privatequestion";

    @NonNull
    @ProtobufIndex(index = 52)
    public String category;

    @NonNull
    @ProtobufIndex(index = 53)
    public List<Option> options;

    @NonNull
    @ProtobufIndex(index = 51)
    public String title;
    public static ProtobufAdapter<PrivateQuestion> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateQuestion>() { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivateQuestion privateQuestion) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) privateQuestion)._id);
            String str = ((DbObject) privateQuestion).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = privateQuestion.title;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = privateQuestion.category;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            List<Option> list = privateQuestion.options;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(53, list, Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) privateQuestion).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivateQuestion m14873parse(nb5 nb5Var) throws IOException {
            PrivateQuestion privateQuestion = new PrivateQuestion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privateQuestion.title == null) {
                        privateQuestion.title = "";
                    }
                    if (privateQuestion.category == null) {
                        privateQuestion.category = "";
                    }
                    if (privateQuestion.options != null) {
                        break;
                    }
                    privateQuestion.options = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    ((DbObject) privateQuestion)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) privateQuestion).id = nb5Var.s();
                } else if (iU == 410) {
                    privateQuestion.title = nb5Var.s();
                } else if (iU == 418) {
                    privateQuestion.category = nb5Var.s();
                } else {
                    if (iU != 426) {
                        if (privateQuestion.title == null) {
                            privateQuestion.title = "";
                        }
                        if (privateQuestion.category == null) {
                            privateQuestion.category = "";
                        }
                        if (privateQuestion.options != null) {
                            break;
                        }
                        privateQuestion.options = new ArrayList();
                        return privateQuestion;
                    }
                    privateQuestion.options = (List) nb5Var.l(Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return privateQuestion;
        }

        public void serialize(PrivateQuestion privateQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) privateQuestion)._id);
            String str = ((DbObject) privateQuestion).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = privateQuestion.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = privateQuestion.category;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            List<Option> list = privateQuestion.options;
            if (list != null) {
                codedOutputByteBufferNano.K(53, list, Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PrivateQuestion> JSON_ADAPTER = new ObjectJsonAdapter<PrivateQuestion>() { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.2
        public Class getDataClass() {
            return PrivateQuestion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivateQuestion m14874newInstance() {
            return new PrivateQuestion();
        }

        public boolean parseField(PrivateQuestion privateQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "options":
                    privateQuestion.options = JsonAdapter.parseArray(jsonParser, Option.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    ((DbObject) privateQuestion).id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    privateQuestion.category = jsonParser.getValueAsString();
                    return true;
                case "title":
                    privateQuestion.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivateQuestion privateQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "options":
                    return true;
                case "id":
                    return false;
                case "category":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(privateQuestion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PrivateQuestion privateQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) privateQuestion).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = privateQuestion.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = privateQuestion.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
            if (privateQuestion.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(privateQuestion.options, jsonGenerator, Option.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<PrivateQuestion> _ID = new LongColumn<PrivateQuestion>("_id") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.3
        public Long get(PrivateQuestion privateQuestion) {
            return Long.valueOf(((DbObject) privateQuestion)._id);
        }

        public void set(PrivateQuestion privateQuestion, Long l2) {
            ((DbObject) privateQuestion)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<PrivateQuestion> f133ID = new StringColumn<PrivateQuestion>("id_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.4
        public String get(PrivateQuestion privateQuestion) {
            return ((DbObject) privateQuestion).id;
        }

        public void set(PrivateQuestion privateQuestion, String str) {
            ((DbObject) privateQuestion).id = str;
        }
    };
    public static final StringColumn<PrivateQuestion> TITLE = new StringColumn<PrivateQuestion>("title_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.5
        public String get(PrivateQuestion privateQuestion) {
            return privateQuestion.title;
        }

        public void set(PrivateQuestion privateQuestion, String str) {
            privateQuestion.title = str;
        }
    };
    public static final StringColumn<PrivateQuestion> CATEGORY = new StringColumn<PrivateQuestion>("category_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.6
        public String get(PrivateQuestion privateQuestion) {
            return privateQuestion.category;
        }

        public void set(PrivateQuestion privateQuestion, String str) {
            privateQuestion.category = str;
        }
    };
    public static final Column<PrivateQuestion, List<Option>> OPTIONS = new Column<PrivateQuestion, List<Option>>("options_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.7
        public List<Option> get(PrivateQuestion privateQuestion) {
            return privateQuestion.options;
        }

        public void set(PrivateQuestion privateQuestion, List<Option> list) {
            privateQuestion.options = list;
        }
    };
    public static mrf0<PrivateQuestion> DB_ADAPTER = new mrf0<PrivateQuestion>() { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.8
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,title_c TEXT,category_c TEXT,options_c BLOB)";
        }

        public Class getDataClass() {
            return PrivateQuestion.class;
        }

        /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
        public PrivateQuestion m14875init() {
            PrivateQuestion privateQuestion = new PrivateQuestion();
            if (privateQuestion.title == null) {
                privateQuestion.title = "";
            }
            if (privateQuestion.category == null) {
                privateQuestion.category = "";
            }
            if (privateQuestion.options == null) {
                privateQuestion.options = new ArrayList();
            }
            return privateQuestion;
        }

        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public PrivateQuestion m14876read(Cursor cursor, int i) {
            if (i == 0) {
                ((mrf0) this).readIndex = 0;
            }
            PrivateQuestion privateQuestion = new PrivateQuestion();
            try {
                ((DbObject) privateQuestion)._id = cursor.getLong(i);
                int i2 = i + 1;
                List<Option> list = null;
                ((DbObject) privateQuestion).id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                privateQuestion.title = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                privateQuestion.category = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 4;
                if (!cursor.isNull(i5)) {
                    list = (List) Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i5));
                }
                privateQuestion.options = list;
                ((mrf0) this).readIndex = i + 5;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (privateQuestion.title == null) {
                privateQuestion.title = "";
            }
            if (privateQuestion.category == null) {
                privateQuestion.category = "";
            }
            if (privateQuestion.options == null) {
                privateQuestion.options = new ArrayList();
            }
            return privateQuestion;
        }

        public void write(PrivateQuestion privateQuestion, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) privateQuestion).id);
                DbObject.cvPut(contentValues, "title_c", privateQuestion.title);
                DbObject.cvPut(contentValues, "category_c", privateQuestion.category);
                DbObject.cvPut(contentValues, "options_c", privateQuestion.options == null ? null : Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(privateQuestion.options));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static PrivateQuestion new_() {
        PrivateQuestion privateQuestion = new PrivateQuestion();
        privateQuestion.nullCheck();
        return privateQuestion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivateQuestion m14872clone() {
        PrivateQuestion privateQuestion = new PrivateQuestion();
        ((DbObject) privateQuestion)._id = ((DbObject) this)._id;
        ((DbObject) privateQuestion).id = ((DbObject) this).id;
        privateQuestion.title = this.title;
        privateQuestion.category = this.category;
        List<Option> list = this.options;
        if (list != null) {
            privateQuestion.options = ValueObject.util_map(list, new w9j() { // from class: l.ss80
                public final Object call(Object obj) {
                    return ((Option) obj).m14686clone();
                }
            });
        }
        return privateQuestion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateQuestion)) {
            return false;
        }
        PrivateQuestion privateQuestion = (PrivateQuestion) obj;
        return super.equals(obj) && ValueObject.util_equals(this.title, privateQuestion.title) && ValueObject.util_equals(this.category, privateQuestion.category) && ValueObject.util_equals(this.options, privateQuestion.options);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Option> list = this.options;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.title == null) {
            this.title = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.options == null) {
            this.options = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
