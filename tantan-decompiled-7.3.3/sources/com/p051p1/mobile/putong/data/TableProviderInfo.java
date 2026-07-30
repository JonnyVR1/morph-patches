package com.p051p1.mobile.putong.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
import p153l.nc5;
import p153l.vzf0;
import p153l.wzh0;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TableProviderInfo tableProviderInfo) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, tableProviderInfo._id);
            String str = tableProviderInfo.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = tableProviderInfo.name;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(51, str2);
            }
            int iM17281h = iM17283j + CodedOutputByteBufferNano.m17281h(52, tableProviderInfo.version);
            tableProviderInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TableProviderInfo parse(nc5 nc5Var) throws IOException {
            TableProviderInfo tableProviderInfo = new TableProviderInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (tableProviderInfo.name != null) {
                        break;
                    }
                    tableProviderInfo.name = "";
                    break;
                }
                if (iM162497u == 8) {
                    tableProviderInfo._id = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    tableProviderInfo.f56859id = nc5Var.m162495s();
                } else if (iM162497u == 410) {
                    tableProviderInfo.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 416) {
                        if (tableProviderInfo.name != null) {
                            break;
                        }
                        tableProviderInfo.name = "";
                        return tableProviderInfo;
                    }
                    tableProviderInfo.version = nc5Var.m162486j();
                }
            }
            return tableProviderInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TableProviderInfo tableProviderInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, tableProviderInfo._id);
            String str = tableProviderInfo.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = tableProviderInfo.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(51, str2);
            }
            codedOutputByteBufferNano.m17305G(52, tableProviderInfo.version);
        }
    };
    public static JsonAdapter<TableProviderInfo> JSON_ADAPTER = new ObjectJsonAdapter<TableProviderInfo>() { // from class: com.p1.mobile.putong.data.TableProviderInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TableProviderInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TableProviderInfo newInstance() {
            return new TableProviderInfo();
        }

        public boolean parseField(TableProviderInfo tableProviderInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    tableProviderInfo.f56859id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TableProviderInfo tableProviderInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = tableProviderInfo.f56859id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = tableProviderInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, tableProviderInfo.version);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TableProviderInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<TableProviderInfo> _ID = new LongColumn<TableProviderInfo>("_id") { // from class: com.p1.mobile.putong.data.TableProviderInfo.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(TableProviderInfo tableProviderInfo) {
            return Long.valueOf(tableProviderInfo._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(TableProviderInfo tableProviderInfo, Long l2) {
            tableProviderInfo._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<TableProviderInfo> f39671ID = new StringColumn<TableProviderInfo>("id_c") { // from class: com.p1.mobile.putong.data.TableProviderInfo.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(TableProviderInfo tableProviderInfo) {
            return tableProviderInfo.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(TableProviderInfo tableProviderInfo, String str) {
            tableProviderInfo.f56859id = str;
        }
    };
    public static final StringColumn<TableProviderInfo> NAME = new StringColumn<TableProviderInfo>("name_c") { // from class: com.p1.mobile.putong.data.TableProviderInfo.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(TableProviderInfo tableProviderInfo) {
            return tableProviderInfo.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(TableProviderInfo tableProviderInfo, String str) {
            tableProviderInfo.name = str;
        }
    };
    public static final IntegerColumn<TableProviderInfo> VERSION = new IntegerColumn<TableProviderInfo>("version_c") { // from class: com.p1.mobile.putong.data.TableProviderInfo.6
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(TableProviderInfo tableProviderInfo) {
            return Integer.valueOf(tableProviderInfo.version);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(TableProviderInfo tableProviderInfo, Integer num) {
            tableProviderInfo.version = num.intValue();
        }
    };
    public static vzf0<TableProviderInfo> DB_ADAPTER = new vzf0<TableProviderInfo>() { // from class: com.p1.mobile.putong.data.TableProviderInfo.7
        @Override // p153l.vzf0
        public String CREATE_TABLE(wzh0 wzh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + wzh0Var.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,version_c INTEGER)";
        }

        @Override // p153l.vzf0
        public Class getDataClass() {
            return TableProviderInfo.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public TableProviderInfo init() {
            TableProviderInfo tableProviderInfo = new TableProviderInfo();
            if (tableProviderInfo.name == null) {
                tableProviderInfo.name = "";
            }
            return tableProviderInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public TableProviderInfo read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            TableProviderInfo tableProviderInfo = new TableProviderInfo();
            try {
                tableProviderInfo._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                tableProviderInfo.f56859id = cursor.isNull(i2) ? null : cursor.getString(i2);
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

        @Override // p153l.vzf0
        public void write(TableProviderInfo tableProviderInfo, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", tableProviderInfo.f56859id);
                DbObject.cvPut(contentValues, "name_c", tableProviderInfo.name);
                DbObject.cvPut(contentValues, "version_c", Integer.valueOf(tableProviderInfo.version));
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static TableProviderInfo new_() {
        TableProviderInfo tableProviderInfo = new TableProviderInfo();
        tableProviderInfo.nullCheck();
        return tableProviderInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TableProviderInfo mo225055clone() {
        TableProviderInfo tableProviderInfo = new TableProviderInfo();
        tableProviderInfo._id = this._id;
        tableProviderInfo.f56859id = this.f56859id;
        tableProviderInfo.name = this.name;
        tableProviderInfo.version = this.version;
        return tableProviderInfo;
    }

    @Override // com.tantanapp.common.data.DbObject
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
        String str = this.name;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.version;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(TableProviderInfo tableProviderInfo) {
        if (!shouldMergeData() || equals(tableProviderInfo)) {
            return;
        }
        if (!isFieldParsed(AuthenticationTokenClaims.JSON_KEY_NAME)) {
            this.name = tableProviderInfo.name;
        }
        if (!isFieldParsed(WBConstants.AUTH_PARAMS_VERSION)) {
            this.version = tableProviderInfo.version;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
