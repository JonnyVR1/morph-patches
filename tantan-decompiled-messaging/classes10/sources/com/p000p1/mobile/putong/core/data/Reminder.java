package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Reminder extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "reminder";

    @ProtobufIndex(index = Conversation.TAG_LEVEL_TOP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Reminder reminder) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) reminder)._id);
            String str = ((DbObject) reminder).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = reminder.owner;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = reminder.otherUser;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            ReminderReference reminderReference = reminder.reference;
            if (reminderReference != null) {
                iJ += CodedOutputByteBufferNano.l(53, reminderReference, ReminderReference.PROTOBUF_ADAPTER);
            }
            int iB = iJ + CodedOutputByteBufferNano.b(54, reminder.read) + CodedOutputByteBufferNano.d(55, reminder.createdTime) + CodedOutputByteBufferNano.h(56, reminder.mediaAmount);
            String str4 = reminder.moment;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(57, str4);
            }
            ((MessageNano) reminder).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Reminder m15387parse(nb5 nb5Var) throws IOException {
            Reminder reminder = new Reminder();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    ((DbObject) reminder)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) reminder).id = nb5Var.s();
                } else if (iU == 410) {
                    reminder.owner = nb5Var.s();
                } else if (iU == 418) {
                    reminder.otherUser = nb5Var.s();
                } else if (iU == 426) {
                    reminder.reference = (ReminderReference) nb5Var.l(ReminderReference.PROTOBUF_ADAPTER);
                } else if (iU == 432) {
                    reminder.read = nb5Var.g();
                } else if (iU == 441) {
                    reminder.createdTime = nb5Var.h();
                } else if (iU == 448) {
                    reminder.mediaAmount = nb5Var.j();
                } else {
                    if (iU != 458) {
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
                    reminder.moment = nb5Var.s();
                }
            }
            return reminder;
        }

        public void serialize(Reminder reminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) reminder)._id);
            String str = ((DbObject) reminder).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = reminder.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = reminder.otherUser;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            ReminderReference reminderReference = reminder.reference;
            if (reminderReference != null) {
                codedOutputByteBufferNano.K(53, reminderReference, ReminderReference.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(54, reminder.read);
            codedOutputByteBufferNano.C(55, reminder.createdTime);
            codedOutputByteBufferNano.G(56, reminder.mediaAmount);
            String str4 = reminder.moment;
            if (str4 != null) {
                codedOutputByteBufferNano.R(57, str4);
            }
        }
    };
    public static JsonAdapter<Reminder> JSON_ADAPTER = new ObjectJsonAdapter<Reminder>() { // from class: com.p1.mobile.putong.core.data.Reminder.2
        public Class getDataClass() {
            return Reminder.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Reminder m15388newInstance() {
            return new Reminder();
        }

        public boolean parseField(Reminder reminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUser":
                    reminder.otherUser = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "reference":
                    reminder.reference = (ReminderReference) ReminderReference.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mediaAmount":
                    reminder.mediaAmount = jsonParser.getValueAsInt();
                    return true;
                case "createdTime":
                    reminder.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    ((DbObject) reminder).id = jsonParser.getValueAsString();
                    return false;
                case "read":
                    reminder.read = jsonParser.getValueAsBoolean();
                    return true;
                case "owner":
                    reminder.owner = (String) Converter.USER_ID.parse(jsonParser, str2);
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

        public void serializeFields(Reminder reminder, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) reminder).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (reminder.owner != null) {
                jsonGenerator.writeFieldName("owner");
                Converter.USER_ID.serialize(reminder.owner, jsonGenerator, true);
            }
            if (reminder.otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                Converter.USER_ID.serialize(reminder.otherUser, jsonGenerator, true);
            }
            if (reminder.reference != null) {
                jsonGenerator.writeFieldName("reference");
                ReminderReference.JSON_ADAPTER.serialize(reminder.reference, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField(LimitTimePictureStatus.read, reminder.read);
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(reminder.createdTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("mediaAmount", reminder.mediaAmount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Reminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Reminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Reminder new_() {
        Reminder reminder = new Reminder();
        reminder.nullCheck();
        return reminder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Reminder m15386clone() {
        Reminder reminder = new Reminder();
        ((DbObject) reminder)._id = ((DbObject) this)._id;
        ((DbObject) reminder).id = ((DbObject) this).id;
        reminder.owner = this.owner;
        reminder.otherUser = this.otherUser;
        ReminderReference reminderReference = this.reference;
        if (reminderReference != null) {
            reminder.reference = reminderReference.m15392clone();
        }
        reminder.read = this.read;
        reminder.createdTime = this.createdTime;
        reminder.mediaAmount = this.mediaAmount;
        reminder.moment = this.moment;
        return reminder;
    }

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

    public String getClassParseName() {
        return "reminder";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
