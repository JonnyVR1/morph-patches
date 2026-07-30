package com.p051p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;
import p153l.vzf0;
import p153l.wzh0;

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
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, privateQuestion._id);
            String str = privateQuestion.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = privateQuestion.title;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(51, str2);
            }
            String str3 = privateQuestion.category;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(52, str3);
            }
            List<Option> list = privateQuestion.options;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(53, list, Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            privateQuestion.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivateQuestion parse(nc5 nc5Var) throws IOException {
            PrivateQuestion privateQuestion = new PrivateQuestion();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    privateQuestion._id = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    privateQuestion.f56859id = nc5Var.m162495s();
                } else if (iM162497u == 410) {
                    privateQuestion.title = nc5Var.m162495s();
                } else if (iM162497u == 418) {
                    privateQuestion.category = nc5Var.m162495s();
                } else {
                    if (iM162497u != 426) {
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
                    privateQuestion.options = (List) nc5Var.m162488l(Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return privateQuestion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivateQuestion privateQuestion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, privateQuestion._id);
            String str = privateQuestion.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = privateQuestion.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(51, str2);
            }
            String str3 = privateQuestion.category;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(52, str3);
            }
            List<Option> list = privateQuestion.options;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(53, list, Option.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PrivateQuestion> JSON_ADAPTER = new ObjectJsonAdapter<PrivateQuestion>() { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivateQuestion.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    privateQuestion.f56859id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateQuestion privateQuestion, JsonGenerator jsonGenerator) throws IOException {
            String str = privateQuestion.f56859id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateQuestion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public static final StringColumn<PrivateQuestion> f21213ID = new StringColumn<PrivateQuestion>("id_c") { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(PrivateQuestion privateQuestion) {
            return privateQuestion.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(PrivateQuestion privateQuestion, String str) {
            privateQuestion.f56859id = str;
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
    public static vzf0<PrivateQuestion> DB_ADAPTER = new vzf0<PrivateQuestion>() { // from class: com.p1.mobile.putong.core.data.PrivateQuestion.8
        @Override // p153l.vzf0
        public String CREATE_TABLE(wzh0 wzh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + wzh0Var.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,title_c TEXT,category_c TEXT,options_c BLOB)";
        }

        @Override // p153l.vzf0
        public Class getDataClass() {
            return PrivateQuestion.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
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
        @Override // p153l.vzf0
        public PrivateQuestion read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            PrivateQuestion privateQuestion = new PrivateQuestion();
            try {
                privateQuestion._id = cursor.getLong(i);
                int i2 = i + 1;
                List<Option> list = null;
                privateQuestion.f56859id = cursor.isNull(i2) ? null : cursor.getString(i2);
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

        @Override // p153l.vzf0
        public void write(PrivateQuestion privateQuestion, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", privateQuestion.f56859id);
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
    public PrivateQuestion mo225055clone() {
        PrivateQuestion privateQuestion = new PrivateQuestion();
        privateQuestion._id = this._id;
        privateQuestion.f56859id = this.f56859id;
        privateQuestion.title = this.title;
        privateQuestion.category = this.category;
        List<Option> list = this.options;
        if (list != null) {
            privateQuestion.options = ValueObject.util_map(list, new qcj() { // from class: l.w090
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Option) obj).mo225055clone();
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
