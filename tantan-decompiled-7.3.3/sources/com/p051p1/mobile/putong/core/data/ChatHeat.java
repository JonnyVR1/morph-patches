package com.p051p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import org.eclipse.jetty.http.HttpStatus;
import p153l.nc5;
import p153l.vzf0;
import p153l.wzh0;

/* JADX INFO: loaded from: classes10.dex */
public class ChatHeat extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "chatheat";

    @ProtobufIndex(index = 51)
    public double degree;

    @ProtobufIndex(index = 57)
    public double exclusiveChatEndTime;

    @ProtobufIndex(index = 55)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatHeat chatHeat) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, chatHeat._id);
            String str = chatHeat.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17277d = iM17283j + CodedOutputByteBufferNano.m17277d(51, chatHeat.degree) + CodedOutputByteBufferNano.m17275b(52, chatHeat.levelUp) + CodedOutputByteBufferNano.m17275b(53, chatHeat.specialRemind) + CodedOutputByteBufferNano.m17277d(54, chatHeat.exclusiveChatInviteTime) + CodedOutputByteBufferNano.m17277d(55, chatHeat.exclusiveChatInviteExpireTime) + CodedOutputByteBufferNano.m17277d(56, chatHeat.exclusiveChatStartTime) + CodedOutputByteBufferNano.m17277d(57, chatHeat.exclusiveChatEndTime) + CodedOutputByteBufferNano.m17275b(58, chatHeat.showLevelDown) + CodedOutputByteBufferNano.m17277d(59, chatHeat.tempDownDegree);
            chatHeat.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatHeat parse(nc5 nc5Var) throws IOException {
            ChatHeat chatHeat = new ChatHeat();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 8:
                        chatHeat._id = nc5Var.m162487k();
                        break;
                    case 18:
                        chatHeat.f56859id = nc5Var.m162495s();
                        break;
                    case 409:
                        chatHeat.degree = nc5Var.m162484h();
                        break;
                    case HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416 /* 416 */:
                        chatHeat.levelUp = nc5Var.m162483g();
                        break;
                    case HttpStatus.FAILED_DEPENDENCY_424 /* 424 */:
                        chatHeat.specialRemind = nc5Var.m162483g();
                        break;
                    case 433:
                        chatHeat.exclusiveChatInviteTime = nc5Var.m162484h();
                        break;
                    case 441:
                        chatHeat.exclusiveChatInviteExpireTime = nc5Var.m162484h();
                        break;
                    case 449:
                        chatHeat.exclusiveChatStartTime = nc5Var.m162484h();
                        break;
                    case 457:
                        chatHeat.exclusiveChatEndTime = nc5Var.m162484h();
                        break;
                    case 464:
                        chatHeat.showLevelDown = nc5Var.m162483g();
                        break;
                    case 473:
                        chatHeat.tempDownDegree = nc5Var.m162484h();
                        break;
                    default:
                        return chatHeat;
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatHeat chatHeat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, chatHeat._id);
            String str = chatHeat.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17301C(51, chatHeat.degree);
            codedOutputByteBufferNano.m17299A(52, chatHeat.levelUp);
            codedOutputByteBufferNano.m17299A(53, chatHeat.specialRemind);
            codedOutputByteBufferNano.m17301C(54, chatHeat.exclusiveChatInviteTime);
            codedOutputByteBufferNano.m17301C(55, chatHeat.exclusiveChatInviteExpireTime);
            codedOutputByteBufferNano.m17301C(56, chatHeat.exclusiveChatStartTime);
            codedOutputByteBufferNano.m17301C(57, chatHeat.exclusiveChatEndTime);
            codedOutputByteBufferNano.m17299A(58, chatHeat.showLevelDown);
            codedOutputByteBufferNano.m17301C(59, chatHeat.tempDownDegree);
        }
    };
    public static JsonAdapter<ChatHeat> JSON_ADAPTER = new ObjectJsonAdapter<ChatHeat>() { // from class: com.p1.mobile.putong.core.data.ChatHeat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatHeat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatHeat newInstance() {
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
                    chatHeat.exclusiveChatInviteExpireTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "specialRemind":
                    chatHeat.specialRemind = jsonParser.getValueAsBoolean();
                    return true;
                case "exclusiveChatInviteTime":
                    chatHeat.exclusiveChatInviteTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    chatHeat.f56859id = jsonParser.getValueAsString();
                    return false;
                case "levelUp":
                    chatHeat.levelUp = jsonParser.getValueAsBoolean();
                    return true;
                case "exclusiveChatStartTime":
                    chatHeat.exclusiveChatStartTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "exclusiveChatEndTime":
                    chatHeat.exclusiveChatEndTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatHeat chatHeat, JsonGenerator jsonGenerator) throws IOException {
            String str = chatHeat.f56859id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("degree", chatHeat.degree);
            jsonGenerator.writeBooleanField("levelUp", chatHeat.levelUp);
            jsonGenerator.writeBooleanField("specialRemind", chatHeat.specialRemind);
            jsonGenerator.writeFieldName("exclusiveChatInviteTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatHeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatHeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<ChatHeat> _ID = new LongColumn<ChatHeat>("_id") { // from class: com.p1.mobile.putong.core.data.ChatHeat.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(ChatHeat chatHeat) {
            return Long.valueOf(chatHeat._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Long l2) {
            chatHeat._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<ChatHeat> f21109ID = new StringColumn<ChatHeat>("id_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(ChatHeat chatHeat) {
            return chatHeat.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, String str) {
            chatHeat.f56859id = str;
        }
    };
    public static final DoubleColumn<ChatHeat> DEGREE = new DoubleColumn<ChatHeat>("degree_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.5
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.degree);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.degree = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatHeat> LEVELUP = new BooleanColumn<ChatHeat>("levelUp_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.6
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatHeat chatHeat) {
            return Boolean.valueOf(chatHeat.levelUp);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Boolean bool) {
            chatHeat.levelUp = bool.booleanValue();
        }
    };
    public static final BooleanColumn<ChatHeat> SPECIALREMIND = new BooleanColumn<ChatHeat>("specialRemind_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.7
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatHeat chatHeat) {
            return Boolean.valueOf(chatHeat.specialRemind);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Boolean bool) {
            chatHeat.specialRemind = bool.booleanValue();
        }
    };
    public static final DoubleColumn<ChatHeat> EXCLUSIVECHATINVITETIME = new DoubleColumn<ChatHeat>("exclusiveChatInviteTime_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.8
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.exclusiveChatInviteTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.exclusiveChatInviteTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatHeat> EXCLUSIVECHATINVITEEXPIRETIME = new DoubleColumn<ChatHeat>("exclusiveChatInviteExpireTime_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.9
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.exclusiveChatInviteExpireTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.exclusiveChatInviteExpireTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatHeat> EXCLUSIVECHATSTARTTIME = new DoubleColumn<ChatHeat>("exclusiveChatStartTime_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.10
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.exclusiveChatStartTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.exclusiveChatStartTime = d.doubleValue();
        }
    };
    public static final DoubleColumn<ChatHeat> EXCLUSIVECHATENDTIME = new DoubleColumn<ChatHeat>("exclusiveChatEndTime_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.11
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.exclusiveChatEndTime);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.exclusiveChatEndTime = d.doubleValue();
        }
    };
    public static final BooleanColumn<ChatHeat> SHOWLEVELDOWN = new BooleanColumn<ChatHeat>("showLevelDown_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.12
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(ChatHeat chatHeat) {
            return Boolean.valueOf(chatHeat.showLevelDown);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Boolean bool) {
            chatHeat.showLevelDown = bool.booleanValue();
        }
    };
    public static final DoubleColumn<ChatHeat> TEMPDOWNDEGREE = new DoubleColumn<ChatHeat>("tempDownDegree_c") { // from class: com.p1.mobile.putong.core.data.ChatHeat.13
        @Override // com.tantanapp.common.data.orm.Column
        public Double get(ChatHeat chatHeat) {
            return Double.valueOf(chatHeat.tempDownDegree);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(ChatHeat chatHeat, Double d) {
            chatHeat.tempDownDegree = d.doubleValue();
        }
    };
    public static vzf0<ChatHeat> DB_ADAPTER = new vzf0<ChatHeat>() { // from class: com.p1.mobile.putong.core.data.ChatHeat.14
        @Override // p153l.vzf0
        public String CREATE_TABLE(wzh0 wzh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + wzh0Var.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,degree_c REAL,levelUp_c INTEGER,specialRemind_c INTEGER,exclusiveChatInviteTime_c REAL,exclusiveChatInviteExpireTime_c REAL,exclusiveChatStartTime_c REAL,exclusiveChatEndTime_c REAL,showLevelDown_c INTEGER,tempDownDegree_c REAL)";
        }

        @Override // p153l.vzf0
        public Class getDataClass() {
            return ChatHeat.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public ChatHeat init() {
            return new ChatHeat();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public ChatHeat read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            ChatHeat chatHeat = new ChatHeat();
            try {
                chatHeat._id = cursor.getLong(i);
                int i2 = i + 1;
                chatHeat.f56859id = cursor.isNull(i2) ? null : cursor.getString(i2);
                chatHeat.degree = cursor.getDouble(i + 2);
                chatHeat.levelUp = cursor.getInt(i + 3) == 1;
                chatHeat.specialRemind = cursor.getInt(i + 4) == 1;
                chatHeat.exclusiveChatInviteTime = cursor.getDouble(i + 5);
                chatHeat.exclusiveChatInviteExpireTime = cursor.getDouble(i + 6);
                chatHeat.exclusiveChatStartTime = cursor.getDouble(i + 7);
                chatHeat.exclusiveChatEndTime = cursor.getDouble(i + 8);
                chatHeat.showLevelDown = cursor.getInt(i + 9) == 1;
                chatHeat.tempDownDegree = cursor.getDouble(i + 10);
                this.readIndex = i + 11;
                return chatHeat;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
                return chatHeat;
            }
        }

        @Override // p153l.vzf0
        public void write(ChatHeat chatHeat, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", chatHeat.f56859id);
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
                MessageNano.reportError(e, null);
            }
        }
    };

    public static ChatHeat new_() {
        ChatHeat chatHeat = new ChatHeat();
        chatHeat.nullCheck();
        return chatHeat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatHeat mo225055clone() {
        ChatHeat chatHeat = new ChatHeat();
        chatHeat._id = this._id;
        chatHeat.f56859id = this.f56859id;
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

    @Override // com.tantanapp.common.data.DbObject
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
        this.hashCode = i9;
        return i9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
