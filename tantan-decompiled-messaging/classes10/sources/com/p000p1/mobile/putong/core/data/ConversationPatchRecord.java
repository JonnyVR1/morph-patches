package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.mrf0;
import l.nb5;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationPatchRecord conversationPatchRecord) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) conversationPatchRecord)._id);
            String str = ((DbObject) conversationPatchRecord).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = conversationPatchRecord.readUtil;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            ConversationPatchState conversationPatchState = conversationPatchRecord.state;
            if (conversationPatchState != null) {
                iJ += CodedOutputByteBufferNano.h(52, conversationPatchState.ordinal());
            }
            int iH = iJ + CodedOutputByteBufferNano.h(53, conversationPatchRecord.retryCount);
            ConversationPatchState conversationPatchState2 = conversationPatchRecord.state;
            if (conversationPatchState2 != null) {
                iH += CodedOutputByteBufferNano.l(54, conversationPatchState2, ConversationPatchState.PROTOBUF_ADAPTER);
            }
            ((MessageNano) conversationPatchRecord).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationPatchRecord m12405parse(nb5 nb5Var) throws IOException {
            ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationPatchRecord.state == null && numValueOf != null) {
                        conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                if (iU == 8) {
                    ((DbObject) conversationPatchRecord)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) conversationPatchRecord).id = nb5Var.s();
                } else if (iU == 410) {
                    conversationPatchRecord.readUtil = nb5Var.s();
                } else if (iU == 416) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 424) {
                    conversationPatchRecord.retryCount = nb5Var.j();
                } else {
                    if (iU != 434) {
                        if (conversationPatchRecord.state == null && numValueOf != null) {
                            conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                    conversationPatchRecord.state = (ConversationPatchState) nb5Var.l(ConversationPatchState.PROTOBUF_ADAPTER);
                }
            }
            return conversationPatchRecord;
        }

        public void serialize(ConversationPatchRecord conversationPatchRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) conversationPatchRecord)._id);
            String str = ((DbObject) conversationPatchRecord).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = conversationPatchRecord.readUtil;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            ConversationPatchState conversationPatchState = conversationPatchRecord.state;
            if (conversationPatchState != null) {
                codedOutputByteBufferNano.G(52, conversationPatchState.ordinal());
            }
            codedOutputByteBufferNano.G(53, conversationPatchRecord.retryCount);
            ConversationPatchState conversationPatchState2 = conversationPatchRecord.state;
            if (conversationPatchState2 != null) {
                codedOutputByteBufferNano.K(54, conversationPatchState2, ConversationPatchState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ConversationPatchRecord> JSON_ADAPTER = new ObjectJsonAdapter<ConversationPatchRecord>() { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.2
        public Class getDataClass() {
            return ConversationPatchRecord.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationPatchRecord m12406newInstance() {
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
                    ((DbObject) conversationPatchRecord).id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(ConversationPatchRecord conversationPatchRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) conversationPatchRecord).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = conversationPatchRecord.readUtil;
            if (str2 != null) {
                jsonGenerator.writeStringField("readUtil", str2);
            }
            if (conversationPatchRecord.state != null) {
                jsonGenerator.writeFieldName(MessageChannel.state);
                ConversationPatchState.JSON_ADAPTER.serialize(conversationPatchRecord.state, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("retryCount", conversationPatchRecord.retryCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationPatchRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationPatchRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<ConversationPatchRecord> _ID = new LongColumn<ConversationPatchRecord>("_id") { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.3
        public Long get(ConversationPatchRecord conversationPatchRecord) {
            return Long.valueOf(((DbObject) conversationPatchRecord)._id);
        }

        public void set(ConversationPatchRecord conversationPatchRecord, Long l2) {
            ((DbObject) conversationPatchRecord)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<ConversationPatchRecord> f37ID = new StringColumn<ConversationPatchRecord>("id_c") { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.4
        public String get(ConversationPatchRecord conversationPatchRecord) {
            return ((DbObject) conversationPatchRecord).id;
        }

        public void set(ConversationPatchRecord conversationPatchRecord, String str) {
            ((DbObject) conversationPatchRecord).id = str;
        }
    };
    public static final StringColumn<ConversationPatchRecord> READUTIL = new StringColumn<ConversationPatchRecord>("readUtil_c") { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.5
        public String get(ConversationPatchRecord conversationPatchRecord) {
            return conversationPatchRecord.readUtil;
        }

        public void set(ConversationPatchRecord conversationPatchRecord, String str) {
            conversationPatchRecord.readUtil = str;
        }
    };
    public static final TEnumColumn<ConversationPatchRecord, ConversationPatchState> STATE = new TEnumColumn<ConversationPatchRecord, ConversationPatchState>("str_state_c", "state_c", ConversationPatchState.JSON_ADAPTER) { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.6
        public ConversationPatchState get(ConversationPatchRecord conversationPatchRecord) {
            return conversationPatchRecord.state;
        }

        public void setTEnum(ConversationPatchRecord conversationPatchRecord, ConversationPatchState conversationPatchState) {
            conversationPatchRecord.state = conversationPatchState;
        }
    };
    public static final IntegerColumn<ConversationPatchRecord> RETRYCOUNT = new IntegerColumn<ConversationPatchRecord>("retryCount_c") { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.7
        public Integer get(ConversationPatchRecord conversationPatchRecord) {
            return Integer.valueOf(conversationPatchRecord.retryCount);
        }

        public void set(ConversationPatchRecord conversationPatchRecord, Integer num) {
            conversationPatchRecord.retryCount = num.intValue();
        }
    };
    public static mrf0<ConversationPatchRecord> DB_ADAPTER = new mrf0<ConversationPatchRecord>() { // from class: com.p1.mobile.putong.core.data.ConversationPatchRecord.8
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,readUtil_c TEXT,state_c INTEGER,retryCount_c INTEGER,str_state_c TEXT)";
        }

        public Class getDataClass() {
            return ConversationPatchRecord.class;
        }

        /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
        public ConversationPatchRecord m12407init() {
            ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
            if (conversationPatchRecord.readUtil == null) {
                conversationPatchRecord.readUtil = "";
            }
            if (conversationPatchRecord.state == null) {
                conversationPatchRecord.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.defaultEnum();
            }
            return conversationPatchRecord;
        }

        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public ConversationPatchRecord m12408read(Cursor cursor, int i) {
            if (i == 0) {
                ((mrf0) this).readIndex = 0;
            }
            ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
            String string = "unknown_";
            int i2 = -1;
            try {
                ((DbObject) conversationPatchRecord)._id = cursor.getLong(i);
                int i3 = i + 1;
                ((DbObject) conversationPatchRecord).id = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 2;
                conversationPatchRecord.readUtil = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 3;
                if (!cursor.isNull(i5)) {
                    i2 = cursor.getInt(i5);
                }
                conversationPatchRecord.retryCount = cursor.getInt(i + 4);
                int i6 = i + 5;
                string = cursor.isNull(i6) ? null : cursor.getString(i6);
                ((mrf0) this).readIndex = i + 6;
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

        public void write(ConversationPatchRecord conversationPatchRecord, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) conversationPatchRecord).id);
                DbObject.cvPut(contentValues, "readUtil_c", conversationPatchRecord.readUtil);
                ConversationPatchState conversationPatchState = conversationPatchRecord.state;
                DbObject.cvPut(contentValues, "str_state_c", conversationPatchState == null ? null : conversationPatchState.toString());
                ConversationPatchState conversationPatchState2 = conversationPatchRecord.state;
                DbObject.cvPut(contentValues, "state_c", conversationPatchState2 == null ? null : Integer.valueOf(conversationPatchState2.ordinal()));
                DbObject.cvPut(contentValues, "retryCount_c", Integer.valueOf(conversationPatchRecord.retryCount));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static ConversationPatchRecord new_() {
        ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
        conversationPatchRecord.nullCheck();
        return conversationPatchRecord;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationPatchRecord m12404clone() {
        ConversationPatchRecord conversationPatchRecord = new ConversationPatchRecord();
        ((DbObject) conversationPatchRecord)._id = ((DbObject) this)._id;
        ((DbObject) conversationPatchRecord).id = ((DbObject) this).id;
        conversationPatchRecord.readUtil = this.readUtil;
        conversationPatchRecord.state = this.state;
        conversationPatchRecord.retryCount = this.retryCount;
        return conversationPatchRecord;
    }

    public Conversation createConversation() {
        Conversation conversation = new Conversation();
        conversation.readUntil = this.readUtil;
        ((DbObject) conversation).id = ((DbObject) this).id;
        return conversation;
    }

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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.readUtil;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        ConversationPatchState conversationPatchState = this.state;
        int iHashCode3 = ((iHashCode2 + (conversationPatchState != null ? conversationPatchState.hashCode() : 0)) * 41) + this.retryCount;
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.readUtil == null) {
            this.readUtil = "";
        }
        if (this.state == null) {
            this.state = (ConversationPatchState) ConversationPatchState.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
