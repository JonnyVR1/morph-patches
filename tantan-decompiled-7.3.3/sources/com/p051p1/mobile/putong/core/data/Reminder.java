package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.Reference;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class Reminder extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "reminder";

    @ProtobufIndex(index = 55)
    public double createdTime;

    @ProtobufIndex(index = 56)
    public int mediaAmount;

    @Nullable
    @ProtobufIndex(index = 57)
    public String moment;

    @NonNull
    @ProtobufIndex(index = 52)
    public String otherUser;

    @NonNull
    @ProtobufIndex(index = 51)
    public String owner;

    @ProtobufIndex(index = 54)
    public boolean read;

    @NonNull
    @ProtobufIndex(index = 53)
    public ReminderReference reference;
    public static ProtobufAdapter<Reminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<Reminder>() { // from class: com.p1.mobile.putong.core.data.Reminder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Reminder reminder) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, reminder._id);
            String str = reminder.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = reminder.owner;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(51, str2);
            }
            String str3 = reminder.otherUser;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(52, str3);
            }
            ReminderReference reminderReference = reminder.reference;
            if (reminderReference != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(53, reminderReference, ReminderReference.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17283j + CodedOutputByteBufferNano.m17275b(54, reminder.read) + CodedOutputByteBufferNano.m17277d(55, reminder.createdTime) + CodedOutputByteBufferNano.m17281h(56, reminder.mediaAmount);
            String str4 = reminder.moment;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(57, str4);
            }
            reminder.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Reminder parse(nc5 nc5Var) throws IOException {
            Reminder reminder = new Reminder();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (reminder.owner == null) {
                        reminder.owner = "";
                    }
                    if (reminder.otherUser == null) {
                        reminder.otherUser = "";
                    }
                    if (reminder.reference != null) {
                        break;
                    }
                    reminder.reference = ReminderReference.new_();
                    break;
                }
                if (iM162497u == 8) {
                    reminder._id = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    reminder.f56859id = nc5Var.m162495s();
                } else if (iM162497u == 410) {
                    reminder.owner = nc5Var.m162495s();
                } else if (iM162497u == 418) {
                    reminder.otherUser = nc5Var.m162495s();
                } else if (iM162497u == 426) {
                    reminder.reference = (ReminderReference) nc5Var.m162488l(ReminderReference.PROTOBUF_ADAPTER);
                } else if (iM162497u == 432) {
                    reminder.read = nc5Var.m162483g();
                } else if (iM162497u == 441) {
                    reminder.createdTime = nc5Var.m162484h();
                } else if (iM162497u == 448) {
                    reminder.mediaAmount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 458) {
                        if (reminder.owner == null) {
                            reminder.owner = "";
                        }
                        if (reminder.otherUser == null) {
                            reminder.otherUser = "";
                        }
                        if (reminder.reference != null) {
                            break;
                        }
                        reminder.reference = ReminderReference.new_();
                        return reminder;
                    }
                    reminder.moment = nc5Var.m162495s();
                }
            }
            return reminder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Reminder reminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, reminder._id);
            String str = reminder.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = reminder.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(51, str2);
            }
            String str3 = reminder.otherUser;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(52, str3);
            }
            ReminderReference reminderReference = reminder.reference;
            if (reminderReference != null) {
                codedOutputByteBufferNano.m17309K(53, reminderReference, ReminderReference.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(54, reminder.read);
            codedOutputByteBufferNano.m17301C(55, reminder.createdTime);
            codedOutputByteBufferNano.m17305G(56, reminder.mediaAmount);
            String str4 = reminder.moment;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(57, str4);
            }
        }
    };
    public static JsonAdapter<Reminder> JSON_ADAPTER = new ObjectJsonAdapter<Reminder>() { // from class: com.p1.mobile.putong.core.data.Reminder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Reminder.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Reminder newInstance() {
            return new Reminder();
        }

        public boolean parseField(Reminder reminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUser":
                    reminder.otherUser = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "reference":
                    reminder.reference = ReminderReference.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mediaAmount":
                    reminder.mediaAmount = jsonParser.getValueAsInt();
                    return true;
                case "createdTime":
                    reminder.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    reminder.f56859id = jsonParser.getValueAsString();
                    return false;
                case "read":
                    reminder.read = jsonParser.getValueAsBoolean();
                    return true;
                case "owner":
                    reminder.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Reminder reminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUser":
                case "reference":
                case "mediaAmount":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "read":
                case "owner":
                    return true;
                default:
                    return super.parseFieldCheck(reminder, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Reminder reminder, JsonGenerator jsonGenerator) throws IOException {
            String str = reminder.f56859id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (reminder.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(reminder.owner, jsonGenerator, true);
            }
            if (reminder.otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                Converter.USER_ID.serialize(reminder.otherUser, jsonGenerator, true);
            }
            if (reminder.reference != null) {
                jsonGenerator.writeFieldName(Reference.TYPE);
                ReminderReference.JSON_ADAPTER.serialize(reminder.reference, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("read", reminder.read);
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(reminder.createdTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("mediaAmount", reminder.mediaAmount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Reminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Reminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Reminder new_() {
        Reminder reminder = new Reminder();
        reminder.nullCheck();
        return reminder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Reminder mo225055clone() {
        Reminder reminder = new Reminder();
        reminder._id = this._id;
        reminder.f56859id = this.f56859id;
        reminder.owner = this.owner;
        reminder.otherUser = this.otherUser;
        ReminderReference reminderReference = this.reference;
        if (reminderReference != null) {
            reminder.reference = reminderReference.mo225055clone();
        }
        reminder.read = this.read;
        reminder.createdTime = this.createdTime;
        reminder.mediaAmount = this.mediaAmount;
        reminder.moment = this.moment;
        return reminder;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reminder)) {
            return false;
        }
        Reminder reminder = (Reminder) obj;
        return super.equals(obj) && ValueObject.util_equals(this.owner, reminder.owner) && ValueObject.util_equals(this.otherUser, reminder.otherUser) && ValueObject.util_equals(this.reference, reminder.reference) && this.read == reminder.read && this.createdTime == reminder.createdTime && this.mediaAmount == reminder.mediaAmount && ValueObject.util_equals(this.moment, reminder.moment);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "reminder";
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.owner;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherUser;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        ReminderReference reminderReference = this.reference;
        int iHashCode4 = (iHashCode3 + (reminderReference != null ? reminderReference.hashCode() : 0)) * 41;
        int i2 = this.read ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((((iHashCode4 + i2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.mediaAmount) * 41;
        String str3 = this.moment;
        int iHashCode5 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.otherUser == null) {
            this.otherUser = "";
        }
        if (this.reference == null) {
            this.reference = ReminderReference.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
