package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.core.data.Option;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivateQuestion privateQuestion) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, privateQuestion._id);
            String str = privateQuestion.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = privateQuestion.title;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(51, str2);
            }
            String str3 = privateQuestion.category;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(52, str3);
            }
            List<Option> list = privateQuestion.options;
            if (list != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(53, list, Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            privateQuestion.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivateQuestion parse(nb5 nb5Var) throws IOException {
            PrivateQuestion privateQuestion = new PrivateQuestion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 8) {
                    privateQuestion._id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    privateQuestion.f56011id = nb5Var.m158750s();
                } else if (iM158752u == 410) {
                    privateQuestion.title = nb5Var.m158750s();
                } else if (iM158752u == 418) {
                    privateQuestion.category = nb5Var.m158750s();
                } else {
                    if (iM158752u != 426) {
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
                    privateQuestion.options = (List) nb5Var.m158743l(Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return privateQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivateQuestion privateQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, privateQuestion._id);
            String str = privateQuestion.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = privateQuestion.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(51, str2);
            }
            String str3 = privateQuestion.category;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(52, str3);
            }
            List<Option> list = privateQuestion.options;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(53, list, Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PrivateQuestion> JSON_ADAPTER = new ObjectJsonAdapter<PrivateQuestion>() { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivateQuestion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivateQuestion newInstance() {
            return new PrivateQuestion();
        }

        public boolean parseField(PrivateQuestion privateQuestion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "options":
                    privateQuestion.options = JsonAdapter.parseArray(jsonParser, Option.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    privateQuestion.f56011id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateQuestion privateQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = privateQuestion.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = privateQuestion.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<PrivateQuestion> _ID = new LongColumn<PrivateQuestion>("_id") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(PrivateQuestion privateQuestion) {
            return Long.valueOf(privateQuestion._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(PrivateQuestion privateQuestion, Long l2) {
            privateQuestion._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<PrivateQuestion> f20471ID = new StringColumn<PrivateQuestion>("id_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(PrivateQuestion privateQuestion) {
            return privateQuestion.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(PrivateQuestion privateQuestion, String str) {
            privateQuestion.f56011id = str;
        }
    };
    public static final StringColumn<PrivateQuestion> TITLE = new StringColumn<PrivateQuestion>("title_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(PrivateQuestion privateQuestion) {
            return privateQuestion.title;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(PrivateQuestion privateQuestion, String str) {
            privateQuestion.title = str;
        }
    };
    public static final StringColumn<PrivateQuestion> CATEGORY = new StringColumn<PrivateQuestion>("category_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.6
        @Override // com.tantanapp.common.data.orm.Column
        public String get(PrivateQuestion privateQuestion) {
            return privateQuestion.category;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(PrivateQuestion privateQuestion, String str) {
            privateQuestion.category = str;
        }
    };
    public static final Column<PrivateQuestion, List<Option>> OPTIONS = new Column<PrivateQuestion, List<Option>>("options_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.7
        @Override // com.tantanapp.common.data.orm.Column
        public List<Option> get(PrivateQuestion privateQuestion) {
            return privateQuestion.options;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(PrivateQuestion privateQuestion, List<Option> list) {
            privateQuestion.options = list;
        }
    };
    public static mrf0<PrivateQuestion> DB_ADAPTER = new mrf0<PrivateQuestion>() { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.8
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,title_c TEXT,category_c TEXT,options_c BLOB)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return PrivateQuestion.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public PrivateQuestion init() {
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public PrivateQuestion read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            PrivateQuestion privateQuestion = new PrivateQuestion();
            try {
                privateQuestion._id = cursor.getLong(i);
                int i2 = i + 1;
                List<Option> list = null;
                privateQuestion.f56011id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                privateQuestion.title = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                privateQuestion.category = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 4;
                if (!cursor.isNull(i5)) {
                    list = Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i5));
                }
                privateQuestion.options = list;
                this.readIndex = i + 5;
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

        @Override // p149l.mrf0
        public void write(PrivateQuestion privateQuestion, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", privateQuestion.f56011id);
                DbObject.cvPut(contentValues, "title_c", privateQuestion.title);
                DbObject.cvPut(contentValues, "category_c", privateQuestion.category);
                DbObject.cvPut(contentValues, "options_c", privateQuestion.options == null ? null : Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(privateQuestion.options));
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static PrivateQuestion new_() {
        PrivateQuestion privateQuestion = new PrivateQuestion();
        privateQuestion.nullCheck();
        return privateQuestion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivateQuestion mo223809clone() {
        PrivateQuestion privateQuestion = new PrivateQuestion();
        privateQuestion._id = this._id;
        privateQuestion.f56011id = this.f56011id;
        privateQuestion.title = this.title;
        privateQuestion.category = this.category;
        List<Option> list = this.options;
        if (list != null) {
            privateQuestion.options = ValueObject.util_map(list, new w9j() { // from class: l.ss80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Option) obj).mo223809clone();
                }
            });
        }
        return privateQuestion;
    }

    @Override // com.tantanapp.common.data.DbObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
