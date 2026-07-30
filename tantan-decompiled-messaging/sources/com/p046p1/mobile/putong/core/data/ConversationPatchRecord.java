package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;

/* JADX INFO: loaded from: classes10.dex */
public class ConversationPatchRecord extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationpatchrecord";

    @NonNull
    @ProtobufIndex(index = 51)
    public String readUtil;

    @ProtobufIndex(index = 53)
    public int retryCount;

    @NonNull
    @ProtobufIndex(index = 52)
    public ConversationPatchState state;
    public static ProtobufAdapter<ConversationPatchRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationPatchRecord>() { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationPatchRecord conversationPatchRecord) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, conversationPatchRecord._id);
            String str = conversationPatchRecord.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = conversationPatchRecord.readUtil;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(51, str2);
            }
            ConversationPatchState conversationPatchState = conversationPatchRecord.state;
            if (conversationPatchState != null) {
                iM17228j += CodedOutputByteBufferNano.m17226h(52, conversationPatchState.ordinal());
            }
            int iM17226h = iM17228j + CodedOutputByteBufferNano.m17226h(53, conversationPatchRecord.retryCount);
            ConversationPatchState conversationPatchState2 = conversationPatchRecord.state;
            if (conversationPatchState2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(54, conversationPatchState2, ConversationPatchState.PROTOBUF_ADAPTER);
            }
            conversationPatchRecord.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationPatchRecord parse(nb5 nb5Var) throws IOException {
            ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationPatchRecord.state == null && numValueOf != null) {
                        conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (conversationPatchRecord.readUtil == null) {
                        conversationPatchRecord.readUtil = "";
                    }
                    if (conversationPatchRecord.state != null) {
                        break;
                    }
                    conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    conversationPatchRecord._id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    conversationPatchRecord.f56011id = nb5Var.m158750s();
                } else if (iM158752u == 410) {
                    conversationPatchRecord.readUtil = nb5Var.m158750s();
                } else if (iM158752u == 416) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 424) {
                    conversationPatchRecord.retryCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 434) {
                        if (conversationPatchRecord.state == null && numValueOf != null) {
                            conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (conversationPatchRecord.readUtil == null) {
                            conversationPatchRecord.readUtil = "";
                        }
                        if (conversationPatchRecord.state != null) {
                            break;
                        }
                        conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.defaultEnum();
                        return conversationPatchRecord;
                    }
                    conversationPatchRecord.state = (ConversationPatchState) nb5Var.m158743l(ConversationPatchState.PROTOBUF_ADAPTER);
                }
            }
            return conversationPatchRecord;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationPatchRecord conversationPatchRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, conversationPatchRecord._id);
            String str = conversationPatchRecord.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = conversationPatchRecord.readUtil;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(51, str2);
            }
            ConversationPatchState conversationPatchState = conversationPatchRecord.state;
            if (conversationPatchState != null) {
                codedOutputByteBufferNano.m17250G(52, conversationPatchState.ordinal());
            }
            codedOutputByteBufferNano.m17250G(53, conversationPatchRecord.retryCount);
            ConversationPatchState conversationPatchState2 = conversationPatchRecord.state;
            if (conversationPatchState2 != null) {
                codedOutputByteBufferNano.m17254K(54, conversationPatchState2, ConversationPatchState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ConversationPatchRecord> JSON_ADAPTER = new ObjectJsonAdapter<ConversationPatchRecord>() { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationPatchRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationPatchRecord newInstance() {
            return new ConversationPatchRecord();
        }

        public boolean parseField(ConversationPatchRecord conversationPatchRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "retryCount":
                    conversationPatchRecord.retryCount = jsonParser.getValueAsInt();
                    return true;
                case "readUtil":
                    conversationPatchRecord.readUtil = jsonParser.getValueAsString();
                    return true;
                case "id":
                    conversationPatchRecord.f56011id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    conversationPatchRecord.state = ConversationPatchState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationPatchRecord conversationPatchRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "retryCount":
                case "readUtil":
                    return true;
                case "id":
                    return false;
                case "state":
                    return true;
                default:
                    return super.parseFieldCheck(conversationPatchRecord, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationPatchRecord conversationPatchRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationPatchRecord.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = conversationPatchRecord.readUtil;
            if (str2 != null) {
                jsonGenerator.writeStringField("readUtil", str2);
            }
            if (conversationPatchRecord.state != null) {
                jsonGenerator.writeFieldName("state");
                ConversationPatchState.JSON_ADAPTER.serialize(conversationPatchRecord.state, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("retryCount", conversationPatchRecord.retryCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationPatchRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationPatchRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<ConversationPatchRecord> _ID = new LongColumn<ConversationPatchRecord>("_id") { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ConversationPatchRecord conversationPatchRecord) {
            return Long.valueOf(conversationPatchRecord._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ConversationPatchRecord conversationPatchRecord, Long l2) {
            conversationPatchRecord._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<ConversationPatchRecord> f20375ID = new StringColumn<ConversationPatchRecord>("id_c") { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ConversationPatchRecord conversationPatchRecord) {
            return conversationPatchRecord.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ConversationPatchRecord conversationPatchRecord, String str) {
            conversationPatchRecord.f56011id = str;
        }
    };
    public static final StringColumn<ConversationPatchRecord> READUTIL = new StringColumn<ConversationPatchRecord>("readUtil_c") { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ConversationPatchRecord conversationPatchRecord) {
            return conversationPatchRecord.readUtil;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ConversationPatchRecord conversationPatchRecord, String str) {
            conversationPatchRecord.readUtil = str;
        }
    };
    public static final TEnumColumn<ConversationPatchRecord, ConversationPatchState> STATE = new TEnumColumn<ConversationPatchRecord, ConversationPatchState>("str_state_c", "state_c", ConversationPatchState.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.6
        @Override // com.tantanapp.common.data.orm.Column
        public ConversationPatchState get(ConversationPatchRecord conversationPatchRecord) {
            return conversationPatchRecord.state;
        }

        @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(ConversationPatchRecord conversationPatchRecord, ConversationPatchState conversationPatchState) {
            conversationPatchRecord.state = conversationPatchState;
        }
    };
    public static final IntegerColumn<ConversationPatchRecord> RETRYCOUNT = new IntegerColumn<ConversationPatchRecord>("retryCount_c") { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.7
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(ConversationPatchRecord conversationPatchRecord) {
            return Integer.valueOf(conversationPatchRecord.retryCount);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ConversationPatchRecord conversationPatchRecord, Integer num) {
            conversationPatchRecord.retryCount = num.intValue();
        }
    };
    public static mrf0<ConversationPatchRecord> DB_ADAPTER = new mrf0<ConversationPatchRecord>() { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.8
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,readUtil_c TEXT,state_c INTEGER,retryCount_c INTEGER,str_state_c TEXT)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return ConversationPatchRecord.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public ConversationPatchRecord init() {
            ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
            if (conversationPatchRecord.readUtil == null) {
                conversationPatchRecord.readUtil = "";
            }
            if (conversationPatchRecord.state == null) {
                conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.defaultEnum();
            }
            return conversationPatchRecord;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public ConversationPatchRecord read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
            String string = "unknown_";
            int i2 = -1;
            try {
                conversationPatchRecord._id = cursor.getLong(i);
                int i3 = i + 1;
                conversationPatchRecord.f56011id = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 2;
                conversationPatchRecord.readUtil = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 3;
                if (!cursor.isNull(i5)) {
                    i2 = cursor.getInt(i5);
                }
                conversationPatchRecord.retryCount = cursor.getInt(i + 4);
                int i6 = i + 5;
                string = cursor.isNull(i6) ? null : cursor.getString(i6);
                this.readIndex = i + 6;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            TEnumJsonAdapter<ConversationPatchState> tEnumJsonAdapter = ConversationPatchState.JSON_ADAPTER;
            ConversationPatchState conversationPatchState = (ConversationPatchState) tEnumJsonAdapter.newTEnum(string, i2);
            conversationPatchRecord.state = conversationPatchState;
            if (conversationPatchRecord.readUtil == null) {
                conversationPatchRecord.readUtil = "";
            }
            if (conversationPatchState == null) {
                conversationPatchRecord.state = (ConversationPatchState) tEnumJsonAdapter.defaultEnum();
            }
            return conversationPatchRecord;
        }

        @Override // p149l.mrf0
        public void write(ConversationPatchRecord conversationPatchRecord, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", conversationPatchRecord.f56011id);
                DbObject.cvPut(contentValues, "readUtil_c", conversationPatchRecord.readUtil);
                ConversationPatchState conversationPatchState = conversationPatchRecord.state;
                DbObject.cvPut(contentValues, "str_state_c", conversationPatchState == null ? null : conversationPatchState.toString());
                ConversationPatchState conversationPatchState2 = conversationPatchRecord.state;
                DbObject.cvPut(contentValues, "state_c", conversationPatchState2 == null ? null : Integer.valueOf(conversationPatchState2.ordinal()));
                DbObject.cvPut(contentValues, "retryCount_c", Integer.valueOf(conversationPatchRecord.retryCount));
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static ConversationPatchRecord new_() {
        ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
        conversationPatchRecord.nullCheck();
        return conversationPatchRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationPatchRecord mo223809clone() {
        ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
        conversationPatchRecord._id = this._id;
        conversationPatchRecord.f56011id = this.f56011id;
        conversationPatchRecord.readUtil = this.readUtil;
        conversationPatchRecord.state = this.state;
        conversationPatchRecord.retryCount = this.retryCount;
        return conversationPatchRecord;
    }

    public Conversation createConversation() {
        Conversation conversation = new Conversation();
        conversation.readUntil = this.readUtil;
        conversation.f56011id = this.f56011id;
        return conversation;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationPatchRecord)) {
            return false;
        }
        ConversationPatchRecord conversationPatchRecord = (ConversationPatchRecord) obj;
        return super.equals(obj) && ValueObject.util_equals(this.readUtil, conversationPatchRecord.readUtil) && ValueObject.util_equals(this.state, conversationPatchRecord.state) && this.retryCount == conversationPatchRecord.retryCount;
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
        String str = this.readUtil;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        ConversationPatchState conversationPatchState = this.state;
        int iHashCode3 = ((iHashCode2 + (conversationPatchState != null ? conversationPatchState.hashCode() : 0)) * 41) + this.retryCount;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.readUtil == null) {
            this.readUtil = "";
        }
        if (this.state == null) {
            this.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
