package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.mrf0;
import l.nb5;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatHeat extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "chatheat";

    @ProtobufIndex(index = 51)
    public double degree;

    @ProtobufIndex(index = 57)
    public double exclusiveChatEndTime;

    @ProtobufIndex(index = Conversation.TAG_LEVEL_TOP)
    public double exclusiveChatInviteExpireTime;

    @ProtobufIndex(index = 54)
    public double exclusiveChatInviteTime;

    @ProtobufIndex(index = 56)
    public double exclusiveChatStartTime;

    @ProtobufIndex(index = 52)
    public boolean levelUp;

    @ProtobufIndex(index = 58)
    public boolean showLevelDown;

    @ProtobufIndex(index = 53)
    public boolean specialRemind;

    @ProtobufIndex(index = 59)
    public double tempDownDegree;
    public static ProtobufAdapter<ChatHeat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatHeat>() { // from class: com.p1.mobile.putong.core.data.ChatHeat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatHeat chatHeat) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) chatHeat)._id);
            String str = ((DbObject) chatHeat).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            int iD = iJ + CodedOutputByteBufferNano.d(51, chatHeat.degree) + CodedOutputByteBufferNano.b(52, chatHeat.levelUp) + CodedOutputByteBufferNano.b(53, chatHeat.specialRemind) + CodedOutputByteBufferNano.d(54, chatHeat.exclusiveChatInviteTime) + CodedOutputByteBufferNano.d(55, chatHeat.exclusiveChatInviteExpireTime) + CodedOutputByteBufferNano.d(56, chatHeat.exclusiveChatStartTime) + CodedOutputByteBufferNano.d(57, chatHeat.exclusiveChatEndTime) + CodedOutputByteBufferNano.b(58, chatHeat.showLevelDown) + CodedOutputByteBufferNano.d(59, chatHeat.tempDownDegree);
            ((MessageNano) chatHeat).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatHeat m12053parse(nb5 nb5Var) throws IOException {
            ChatHeat chatHeat = new ChatHeat();
            while (true) {
                switch (nb5Var.u()) {
                    case 8:
                        ((DbObject) chatHeat)._id = nb5Var.k();
                        break;
                    case 18:
                        ((DbObject) chatHeat).id = nb5Var.s();
                        break;
                    case 409:
                        chatHeat.degree = nb5Var.h();
                        break;
                    case 416:
                        chatHeat.levelUp = nb5Var.g();
                        break;
                    case 424:
                        chatHeat.specialRemind = nb5Var.g();
                        break;
                    case 433:
                        chatHeat.exclusiveChatInviteTime = nb5Var.h();
                        break;
                    case 441:
                        chatHeat.exclusiveChatInviteExpireTime = nb5Var.h();
                        break;
                    case 449:
                        chatHeat.exclusiveChatStartTime = nb5Var.h();
                        break;
                    case 457:
                        chatHeat.exclusiveChatEndTime = nb5Var.h();
                        break;
                    case 464:
                        chatHeat.showLevelDown = nb5Var.g();
                        break;
                    case 473:
                        chatHeat.tempDownDegree = nb5Var.h();
                        break;
                    default:
                        return chatHeat;
                }
            }
        }

        public void serialize(ChatHeat chatHeat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) chatHeat)._id);
            String str = ((DbObject) chatHeat).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.C(51, chatHeat.degree);
            codedOutputByteBufferNano.A(52, chatHeat.levelUp);
            codedOutputByteBufferNano.A(53, chatHeat.specialRemind);
            codedOutputByteBufferNano.C(54, chatHeat.exclusiveChatInviteTime);
            codedOutputByteBufferNano.C(55, chatHeat.exclusiveChatInviteExpireTime);
            codedOutputByteBufferNano.C(56, chatHeat.exclusiveChatStartTime);
            codedOutputByteBufferNano.C(57, chatHeat.exclusiveChatEndTime);
            codedOutputByteBufferNano.A(58, chatHeat.showLevelDown);
            codedOutputByteBufferNano.C(59, chatHeat.tempDownDegree);
        }
    };
    public static JsonAdapter<ChatHeat> JSON_ADAPTER = new ObjectJsonAdapter<ChatHeat>() { // from class: com.p1.mobile.putong.core.data.ChatHeat.2
        public Class getDataClass() {
            return ChatHeat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatHeat m12056newInstance() {
            return new ChatHeat();
        }

        public boolean parseField(ChatHeat chatHeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tempDownDegree":
                    chatHeat.tempDownDegree = jsonParser.getValueAsDouble();
                    return true;
                case "degree":
                    chatHeat.degree = jsonParser.getValueAsDouble();
                    return true;
                case "exclusiveChatInviteExpireTime":
                    chatHeat.exclusiveChatInviteExpireTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "specialRemind":
                    chatHeat.specialRemind = jsonParser.getValueAsBoolean();
                    return true;
                case "exclusiveChatInviteTime":
                    chatHeat.exclusiveChatInviteTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    ((DbObject) chatHeat).id = jsonParser.getValueAsString();
                    return false;
                case "levelUp":
                    chatHeat.levelUp = jsonParser.getValueAsBoolean();
                    return true;
                case "exclusiveChatStartTime":
                    chatHeat.exclusiveChatStartTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "exclusiveChatEndTime":
                    chatHeat.exclusiveChatEndTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "showLevelDown":
                    chatHeat.showLevelDown = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatHeat chatHeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tempDownDegree":
                case "degree":
                case "exclusiveChatInviteExpireTime":
                case "specialRemind":
                case "exclusiveChatInviteTime":
                    return true;
                case "id":
                    return false;
                case "levelUp":
                case "exclusiveChatStartTime":
                case "exclusiveChatEndTime":
                case "showLevelDown":
                    return true;
                default:
                    return super.parseFieldCheck(chatHeat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatHeat chatHeat, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) chatHeat).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("degree", chatHeat.degree);
            jsonGenerator.writeBooleanField("levelUp", chatHeat.levelUp);
            jsonGenerator.writeBooleanField("specialRemind", chatHeat.specialRemind);
            jsonGenerator.writeFieldName("exclusiveChatInviteTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(chatHeat.exclusiveChatInviteTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatInviteExpireTime");
            jsonAdapter.serialize(Double.valueOf(chatHeat.exclusiveChatInviteExpireTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatStartTime");
            jsonAdapter.serialize(Double.valueOf(chatHeat.exclusiveChatStartTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("exclusiveChatEndTime");
            jsonAdapter.serialize(Double.valueOf(chatHeat.exclusiveChatEndTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("showLevelDown", chatHeat.showLevelDown);
            jsonGenerator.writeNumberField("tempDownDegree", chatHeat.tempDownDegree);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatHeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatHeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<ChatHeat> _ID = new LongColumn<ChatHeat>("_id") { // from class: com.p1.mobile.putong.core.data.ChatHeat.3
        public Long get(ChatHeat chatHeat) {
            return Long.valueOf(((DbObject) chatHeat)._id);
        }

        public void set(ChatHeat chatHeat, Long l2) {
            ((DbObject) chatHeat)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<ChatHeat> f29ID = new StringColumn<ChatHeat>("id_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.4
        public String get(ChatHeat chatHeat) {
            return ((DbObject) chatHeat).id;
        }

        public void set(ChatHeat chatHeat, String str) {
            ((DbObject) chatHeat).id = str;
        }
    };
    public static final DoubleColumn<ChatHeat> DEGREE = new DoubleColumn<ChatHeat>("degree_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.5
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.degree);
        }

        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.degree = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatHeat> LEVELUP = new BooleanColumn<ChatHeat>("levelUp_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.6
        public Boolean get(ChatHeat chatHeat) {
            return Boolean.valueOf(chatHeat.levelUp);
        }

        public void set(ChatHeat chatHeat, Boolean bool) {
            chatHeat.levelUp = bool.booleanValue();
        }
    };
    public static final BooleanColumn<ChatHeat> SPECIALREMIND = new BooleanColumn<ChatHeat>("specialRemind_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.7
        public Boolean get(ChatHeat chatHeat) {
            return Boolean.valueOf(chatHeat.specialRemind);
        }

        public void set(ChatHeat chatHeat, Boolean bool) {
            chatHeat.specialRemind = bool.booleanValue();
        }
    };
    public static final DoubleColumn<ChatHeat> EXCLUSIVECHATINVITETIME = new DoubleColumn<ChatHeat>("exclusiveChatInviteTime_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.8
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.exclusiveChatInviteTime);
        }

        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.exclusiveChatInviteTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatHeat> EXCLUSIVECHATINVITEEXPIRETIME = new DoubleColumn<ChatHeat>("exclusiveChatInviteExpireTime_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.9
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.exclusiveChatInviteExpireTime);
        }

        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.exclusiveChatInviteExpireTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatHeat> EXCLUSIVECHATSTARTTIME = new DoubleColumn<ChatHeat>("exclusiveChatStartTime_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.10
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.exclusiveChatStartTime);
        }

        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.exclusiveChatStartTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatHeat> EXCLUSIVECHATENDTIME = new DoubleColumn<ChatHeat>("exclusiveChatEndTime_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.11
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.exclusiveChatEndTime);
        }

        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.exclusiveChatEndTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatHeat> SHOWLEVELDOWN = new BooleanColumn<ChatHeat>("showLevelDown_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.12
        public Boolean get(ChatHeat chatHeat) {
            return Boolean.valueOf(chatHeat.showLevelDown);
        }

        public void set(ChatHeat chatHeat, Boolean bool) {
            chatHeat.showLevelDown = bool.booleanValue();
        }
    };
    public static final DoubleColumn<ChatHeat> TEMPDOWNDEGREE = new DoubleColumn<ChatHeat>("tempDownDegree_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.13
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.tempDownDegree);
        }

        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.tempDownDegree = d.doubleValue();
        }
    };
    public static mrf0<ChatHeat> DB_ADAPTER = new mrf0<ChatHeat>() { // from class: com.p1.mobile.putong.core.data.ChatHeat.14
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,degree_c REAL,levelUp_c INTEGER,specialRemind_c INTEGER,exclusiveChatInviteTime_c REAL,exclusiveChatInviteExpireTime_c REAL,exclusiveChatStartTime_c REAL,exclusiveChatEndTime_c REAL,showLevelDown_c INTEGER,tempDownDegree_c REAL)";
        }

        public Class getDataClass() {
            return ChatHeat.class;
        }

        /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
        public ChatHeat m12054init() {
            return new ChatHeat();
        }

        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public ChatHeat m12055read(Cursor cursor, int i) {
            if (i == 0) {
                ((mrf0) this).readIndex = 0;
            }
            ChatHeat chatHeat = new ChatHeat();
            try {
                ((DbObject) chatHeat)._id = cursor.getLong(i);
                int i2 = i + 1;
                ((DbObject) chatHeat).id = cursor.isNull(i2) ? null : cursor.getString(i2);
                chatHeat.degree = cursor.getDouble(i + 2);
                chatHeat.levelUp = cursor.getInt(i + 3) == 1;
                chatHeat.specialRemind = cursor.getInt(i + 4) == 1;
                chatHeat.exclusiveChatInviteTime = cursor.getDouble(i + 5);
                chatHeat.exclusiveChatInviteExpireTime = cursor.getDouble(i + 6);
                chatHeat.exclusiveChatStartTime = cursor.getDouble(i + 7);
                chatHeat.exclusiveChatEndTime = cursor.getDouble(i + 8);
                chatHeat.showLevelDown = cursor.getInt(i + 9) == 1;
                chatHeat.tempDownDegree = cursor.getDouble(i + 10);
                ((mrf0) this).readIndex = i + 11;
                return chatHeat;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
                return chatHeat;
            }
        }

        public void write(ChatHeat chatHeat, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) chatHeat).id);
                DbObject.cvPut(contentValues, "degree_c", Double.valueOf(chatHeat.degree));
                DbObject.cvPut(contentValues, "levelUp_c", Integer.valueOf(chatHeat.levelUp ? 1 : 0));
                DbObject.cvPut(contentValues, "specialRemind_c", Integer.valueOf(chatHeat.specialRemind ? 1 : 0));
                DbObject.cvPut(contentValues, "exclusiveChatInviteTime_c", Double.valueOf(chatHeat.exclusiveChatInviteTime));
                DbObject.cvPut(contentValues, "exclusiveChatInviteExpireTime_c", Double.valueOf(chatHeat.exclusiveChatInviteExpireTime));
                DbObject.cvPut(contentValues, "exclusiveChatStartTime_c", Double.valueOf(chatHeat.exclusiveChatStartTime));
                DbObject.cvPut(contentValues, "exclusiveChatEndTime_c", Double.valueOf(chatHeat.exclusiveChatEndTime));
                DbObject.cvPut(contentValues, "showLevelDown_c", Integer.valueOf(chatHeat.showLevelDown ? 1 : 0));
                DbObject.cvPut(contentValues, "tempDownDegree_c", Double.valueOf(chatHeat.tempDownDegree));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static ChatHeat new_() {
        ChatHeat chatHeat = new ChatHeat();
        chatHeat.nullCheck();
        return chatHeat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatHeat m12052clone() {
        ChatHeat chatHeat = new ChatHeat();
        ((DbObject) chatHeat)._id = ((DbObject) this)._id;
        ((DbObject) chatHeat).id = ((DbObject) this).id;
        chatHeat.degree = this.degree;
        chatHeat.levelUp = this.levelUp;
        chatHeat.specialRemind = this.specialRemind;
        chatHeat.exclusiveChatInviteTime = this.exclusiveChatInviteTime;
        chatHeat.exclusiveChatInviteExpireTime = this.exclusiveChatInviteExpireTime;
        chatHeat.exclusiveChatStartTime = this.exclusiveChatStartTime;
        chatHeat.exclusiveChatEndTime = this.exclusiveChatEndTime;
        chatHeat.showLevelDown = this.showLevelDown;
        chatHeat.tempDownDegree = this.tempDownDegree;
        return chatHeat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatHeat)) {
            return false;
        }
        ChatHeat chatHeat = (ChatHeat) obj;
        return super.equals(obj) && this.degree == chatHeat.degree && this.levelUp == chatHeat.levelUp && this.specialRemind == chatHeat.specialRemind && this.exclusiveChatInviteTime == chatHeat.exclusiveChatInviteTime && this.exclusiveChatInviteExpireTime == chatHeat.exclusiveChatInviteExpireTime && this.exclusiveChatStartTime == chatHeat.exclusiveChatStartTime && this.exclusiveChatEndTime == chatHeat.exclusiveChatEndTime && this.showLevelDown == chatHeat.showLevelDown && this.tempDownDegree == chatHeat.tempDownDegree;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.degree);
        int i2 = ((((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.levelUp ? 1231 : 1237)) * 41;
        int i3 = this.specialRemind ? 1231 : 1237;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.exclusiveChatInviteTime);
        int i4 = ((i2 + i3) * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.exclusiveChatInviteExpireTime);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.exclusiveChatStartTime);
        int i6 = (i5 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.exclusiveChatEndTime);
        int i7 = ((i6 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 41;
        int i8 = this.showLevelDown ? 1231 : 1237;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.tempDownDegree);
        int i9 = ((i7 + i8) * 41) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        ((ValueObject) this).hashCode = i9;
        return i9;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
