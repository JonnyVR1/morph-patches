package com.p000p1.mobile.putong.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import l.nb5;
import p007l.mrf0;
import p007l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TableProviderInfo extends DbObject<TableProviderInfo> implements Cloneable, Serializable {
    public static final String TYPE = "tableproviderinfo";

    @NonNull
    @ProtobufIndex(index = 51)
    public String name;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @ProtobufIndex(index = 52)
    public int version;
    public static ProtobufAdapter<TableProviderInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TableProviderInfo>() { // from class: com.p1.mobile.putong.data.TableProviderInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TableProviderInfo tableProviderInfo) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) tableProviderInfo)._id);
            String str = ((DbObject) tableProviderInfo).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = tableProviderInfo.name;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            int iH = iJ + CodedOutputByteBufferNano.h(52, tableProviderInfo.version);
            ((MessageNano) tableProviderInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TableProviderInfo m19076parse(nb5 nb5Var) throws IOException {
            TableProviderInfo tableProviderInfo = new TableProviderInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tableProviderInfo.name != null) {
                        break;
                    }
                    tableProviderInfo.name = "";
                    break;
                }
                if (iU == 8) {
                    ((DbObject) tableProviderInfo)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) tableProviderInfo).id = nb5Var.s();
                } else if (iU == 410) {
                    tableProviderInfo.name = nb5Var.s();
                } else {
                    if (iU != 416) {
                        if (tableProviderInfo.name != null) {
                            break;
                        }
                        tableProviderInfo.name = "";
                        return tableProviderInfo;
                    }
                    tableProviderInfo.version = nb5Var.j();
                }
            }
            return tableProviderInfo;
        }

        public void serialize(TableProviderInfo tableProviderInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) tableProviderInfo)._id);
            String str = ((DbObject) tableProviderInfo).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = tableProviderInfo.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            codedOutputByteBufferNano.G(52, tableProviderInfo.version);
        }
    };
    public static JsonAdapter<TableProviderInfo> JSON_ADAPTER = new ObjectJsonAdapter<TableProviderInfo>() { // from class: com.p1.mobile.putong.data.TableProviderInfo.2
        public Class getDataClass() {
            return TableProviderInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TableProviderInfo mo17830newInstance() {
            return new TableProviderInfo();
        }

        public boolean parseField(TableProviderInfo tableProviderInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    ((DbObject) tableProviderInfo).id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    tableProviderInfo.name = jsonParser.getValueAsString();
                    return true;
                case "version":
                    tableProviderInfo.version = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TableProviderInfo tableProviderInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) tableProviderInfo).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = tableProviderInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            jsonGenerator.writeNumberField("version", tableProviderInfo.version);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TableProviderInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<TableProviderInfo> _ID = new LongColumn<TableProviderInfo>("_id") { // from class: com.p1.mobile.putong.data.TableProviderInfo.3
        public Long get(TableProviderInfo tableProviderInfo) {
            return Long.valueOf(((DbObject) tableProviderInfo)._id);
        }

        public void set(TableProviderInfo tableProviderInfo, Long l2) {
            ((DbObject) tableProviderInfo)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<TableProviderInfo> f284ID = new StringColumn<TableProviderInfo>("id_c") { // from class: com.p1.mobile.putong.data.TableProviderInfo.4
        public String get(TableProviderInfo tableProviderInfo) {
            return ((DbObject) tableProviderInfo).id;
        }

        public void set(TableProviderInfo tableProviderInfo, String str) {
            ((DbObject) tableProviderInfo).id = str;
        }
    };
    public static final StringColumn<TableProviderInfo> NAME = new StringColumn<TableProviderInfo>("name_c") { // from class: com.p1.mobile.putong.data.TableProviderInfo.5
        public String get(TableProviderInfo tableProviderInfo) {
            return tableProviderInfo.name;
        }

        public void set(TableProviderInfo tableProviderInfo, String str) {
            tableProviderInfo.name = str;
        }
    };
    public static final IntegerColumn<TableProviderInfo> VERSION = new IntegerColumn<TableProviderInfo>("version_c") { // from class: com.p1.mobile.putong.data.TableProviderInfo.6
        public Integer get(TableProviderInfo tableProviderInfo) {
            return Integer.valueOf(tableProviderInfo.version);
        }

        public void set(TableProviderInfo tableProviderInfo, Integer num) {
            tableProviderInfo.version = num.intValue();
        }
    };
    public static mrf0<TableProviderInfo> DB_ADAPTER = new mrf0<TableProviderInfo>() { // from class: com.p1.mobile.putong.data.TableProviderInfo.7
        @Override // p007l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f11572d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,version_c INTEGER)";
        }

        @Override // p007l.mrf0
        public Class getDataClass() {
            return TableProviderInfo.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public TableProviderInfo init() {
            TableProviderInfo tableProviderInfo = new TableProviderInfo();
            if (tableProviderInfo.name == null) {
                tableProviderInfo.name = "";
            }
            return tableProviderInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public TableProviderInfo read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            TableProviderInfo tableProviderInfo = new TableProviderInfo();
            try {
                ((DbObject) tableProviderInfo)._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                ((DbObject) tableProviderInfo).id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                if (!cursor.isNull(i3)) {
                    string = cursor.getString(i3);
                }
                tableProviderInfo.name = string;
                tableProviderInfo.version = cursor.getInt(i + 3);
                this.readIndex = i + 4;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (tableProviderInfo.name == null) {
                tableProviderInfo.name = "";
            }
            return tableProviderInfo;
        }

        @Override // p007l.mrf0
        public void write(TableProviderInfo tableProviderInfo, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) tableProviderInfo).id);
                DbObject.cvPut(contentValues, "name_c", tableProviderInfo.name);
                DbObject.cvPut(contentValues, "version_c", Integer.valueOf(tableProviderInfo.version));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static TableProviderInfo new_() {
        TableProviderInfo tableProviderInfo = new TableProviderInfo();
        tableProviderInfo.nullCheck();
        return tableProviderInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TableProviderInfo m19075clone() {
        TableProviderInfo tableProviderInfo = new TableProviderInfo();
        ((DbObject) tableProviderInfo)._id = ((DbObject) this)._id;
        ((DbObject) tableProviderInfo).id = ((DbObject) this).id;
        tableProviderInfo.name = this.name;
        tableProviderInfo.version = this.version;
        return tableProviderInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TableProviderInfo)) {
            return false;
        }
        TableProviderInfo tableProviderInfo = (TableProviderInfo) obj;
        return super.equals(obj) && ValueObject.util_equals(this.name, tableProviderInfo.name) && this.version == tableProviderInfo.version;
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
        String str = this.name;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.version;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(TableProviderInfo tableProviderInfo) {
        if (!shouldMergeData() || equals(tableProviderInfo)) {
            return;
        }
        if (!isFieldParsed("name")) {
            this.name = tableProviderInfo.name;
        }
        if (!isFieldParsed("version")) {
            this.version = tableProviderInfo.version;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.name == null) {
            this.name = "";
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public TableProviderInfo subtract(TableProviderInfo tableProviderInfo) {
        TableProviderInfo tableProviderInfo2 = new TableProviderInfo();
        if (!ValueObject.util_equals(this.name, tableProviderInfo.name)) {
            tableProviderInfo2.name = this.name;
        }
        if (tableProviderInfo2.equals(new TableProviderInfo())) {
            return null;
        }
        return tableProviderInfo2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
