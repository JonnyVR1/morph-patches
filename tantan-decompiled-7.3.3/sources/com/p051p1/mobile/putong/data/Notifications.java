package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class Notifications extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "notifications";

    @ProtobufIndex(index = 7)
    public boolean dailyReportPush;

    @ProtobufIndex(index = 3)
    public boolean messagePush;

    @ProtobufIndex(index = 5)
    public boolean momentPush;

    @ProtobufIndex(index = 2)
    public boolean newMatchPush;

    @NonNull
    @ProtobufIndex(index = 10)
    public NotificationNoDisturb noDisturb;

    @ProtobufIndex(index = 9)
    public boolean officialPush;

    @ProtobufIndex(index = 1)
    public boolean previewPushMessage;

    @NonNull
    @ProtobufIndex(index = 6)
    public String sound;

    @ProtobufIndex(index = 4)
    public boolean superLikePush;

    @ProtobufIndex(index = 11)
    public boolean syncMoment;

    @ProtobufIndex(index = 8)
    public boolean weeklyReportPush;
    public static ProtobufAdapter<Notifications> PROTOBUF_ADAPTER = new MessageNanoAdapter<Notifications>() { // from class: com.p1.mobile.putong.data.Notifications.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Notifications notifications) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, notifications.previewPushMessage) + CodedOutputByteBufferNano.m17275b(2, notifications.newMatchPush) + CodedOutputByteBufferNano.m17275b(3, notifications.messagePush) + CodedOutputByteBufferNano.m17275b(4, notifications.superLikePush) + CodedOutputByteBufferNano.m17275b(5, notifications.momentPush);
            String str = notifications.sound;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(6, str);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(7, notifications.dailyReportPush) + CodedOutputByteBufferNano.m17275b(8, notifications.weeklyReportPush) + CodedOutputByteBufferNano.m17275b(9, notifications.officialPush);
            NotificationNoDisturb notificationNoDisturb = notifications.noDisturb;
            if (notificationNoDisturb != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(10, notificationNoDisturb, NotificationNoDisturb.PROTOBUF_ADAPTER);
            }
            int iM17275b3 = iM17275b2 + CodedOutputByteBufferNano.m17275b(11, notifications.syncMoment);
            notifications.cachedSize = iM17275b3;
            return iM17275b3;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Notifications parse(nc5 nc5Var) throws IOException {
            Notifications notifications = new Notifications();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (notifications.sound == null) {
                            notifications.sound = "";
                        }
                        if (notifications.noDisturb == null) {
                            notifications.noDisturb = NotificationNoDisturb.new_();
                        }
                        break;
                    case 8:
                        notifications.previewPushMessage = nc5Var.m162483g();
                        continue;
                    case 16:
                        notifications.newMatchPush = nc5Var.m162483g();
                        continue;
                    case 24:
                        notifications.messagePush = nc5Var.m162483g();
                        continue;
                    case 32:
                        notifications.superLikePush = nc5Var.m162483g();
                        continue;
                    case 40:
                        notifications.momentPush = nc5Var.m162483g();
                        continue;
                    case 50:
                        notifications.sound = nc5Var.m162495s();
                        continue;
                    case 56:
                        notifications.dailyReportPush = nc5Var.m162483g();
                        continue;
                    case 64:
                        notifications.weeklyReportPush = nc5Var.m162483g();
                        continue;
                    case 72:
                        notifications.officialPush = nc5Var.m162483g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        notifications.noDisturb = (NotificationNoDisturb) nc5Var.m162488l(NotificationNoDisturb.PROTOBUF_ADAPTER);
                        continue;
                    case 88:
                        notifications.syncMoment = nc5Var.m162483g();
                        continue;
                    default:
                        if (notifications.sound == null) {
                            notifications.sound = "";
                        }
                        if (notifications.noDisturb == null) {
                            notifications.noDisturb = NotificationNoDisturb.new_();
                            return notifications;
                        }
                        break;
                }
            }
            return notifications;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Notifications notifications, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, notifications.previewPushMessage);
            codedOutputByteBufferNano.m17299A(2, notifications.newMatchPush);
            codedOutputByteBufferNano.m17299A(3, notifications.messagePush);
            codedOutputByteBufferNano.m17299A(4, notifications.superLikePush);
            codedOutputByteBufferNano.m17299A(5, notifications.momentPush);
            String str = notifications.sound;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(6, str);
            }
            codedOutputByteBufferNano.m17299A(7, notifications.dailyReportPush);
            codedOutputByteBufferNano.m17299A(8, notifications.weeklyReportPush);
            codedOutputByteBufferNano.m17299A(9, notifications.officialPush);
            NotificationNoDisturb notificationNoDisturb = notifications.noDisturb;
            if (notificationNoDisturb != null) {
                codedOutputByteBufferNano.m17309K(10, notificationNoDisturb, NotificationNoDisturb.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(11, notifications.syncMoment);
        }
    };
    public static JsonAdapter<Notifications> JSON_ADAPTER = new ObjectJsonAdapter<Notifications>() { // from class: com.p1.mobile.putong.data.Notifications.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Notifications.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Notifications newInstance() {
            return new Notifications();
        }

        public boolean parseField(Notifications notifications, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "noDisturb":
                    notifications.noDisturb = NotificationNoDisturb.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "weeklyReportPush":
                    notifications.weeklyReportPush = jsonParser.getValueAsBoolean();
                    return true;
                case "messagePush":
                    notifications.messagePush = jsonParser.getValueAsBoolean();
                    return true;
                case "sound":
                    notifications.sound = jsonParser.getValueAsString();
                    return true;
                case "dailyReportPush":
                    notifications.dailyReportPush = jsonParser.getValueAsBoolean();
                    return true;
                case "momentPush":
                    notifications.momentPush = jsonParser.getValueAsBoolean();
                    return true;
                case "newMatchPush":
                    notifications.newMatchPush = jsonParser.getValueAsBoolean();
                    return true;
                case "previewPushMessage":
                    notifications.previewPushMessage = jsonParser.getValueAsBoolean();
                    return true;
                case "officialPush":
                    notifications.officialPush = jsonParser.getValueAsBoolean();
                    return true;
                case "syncMoment":
                    notifications.syncMoment = jsonParser.getValueAsBoolean();
                    return true;
                case "superLikePush":
                    notifications.superLikePush = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Notifications notifications, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "noDisturb":
                case "weeklyReportPush":
                case "messagePush":
                case "sound":
                case "dailyReportPush":
                case "momentPush":
                case "newMatchPush":
                case "previewPushMessage":
                case "officialPush":
                case "syncMoment":
                case "superLikePush":
                    return true;
                default:
                    return super.parseFieldCheck(notifications, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Notifications notifications, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("previewPushMessage", notifications.previewPushMessage);
            jsonGenerator.writeBooleanField("newMatchPush", notifications.newMatchPush);
            jsonGenerator.writeBooleanField("messagePush", notifications.messagePush);
            jsonGenerator.writeBooleanField("superLikePush", notifications.superLikePush);
            jsonGenerator.writeBooleanField("momentPush", notifications.momentPush);
            String str = notifications.sound;
            if (str != null) {
                jsonGenerator.writeStringField("sound", str);
            }
            jsonGenerator.writeBooleanField("dailyReportPush", notifications.dailyReportPush);
            jsonGenerator.writeBooleanField("weeklyReportPush", notifications.weeklyReportPush);
            jsonGenerator.writeBooleanField("officialPush", notifications.officialPush);
            if (notifications.noDisturb != null) {
                jsonGenerator.writeFieldName("noDisturb");
                NotificationNoDisturb.JSON_ADAPTER.serialize(notifications.noDisturb, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("syncMoment", notifications.syncMoment);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Notifications) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Notifications) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Notifications new_() {
        Notifications notifications = new Notifications();
        notifications.nullCheck();
        return notifications;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Notifications mo225055clone() {
        Notifications notifications = new Notifications();
        notifications.previewPushMessage = this.previewPushMessage;
        notifications.newMatchPush = this.newMatchPush;
        notifications.messagePush = this.messagePush;
        notifications.superLikePush = this.superLikePush;
        notifications.momentPush = this.momentPush;
        notifications.sound = this.sound;
        notifications.dailyReportPush = this.dailyReportPush;
        notifications.weeklyReportPush = this.weeklyReportPush;
        notifications.officialPush = this.officialPush;
        NotificationNoDisturb notificationNoDisturb = this.noDisturb;
        if (notificationNoDisturb != null) {
            notifications.noDisturb = notificationNoDisturb.mo225055clone();
        }
        notifications.syncMoment = this.syncMoment;
        return notifications;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Notifications)) {
            return false;
        }
        Notifications notifications = (Notifications) obj;
        return this.previewPushMessage == notifications.previewPushMessage && this.newMatchPush == notifications.newMatchPush && this.messagePush == notifications.messagePush && this.superLikePush == notifications.superLikePush && this.momentPush == notifications.momentPush && ValueObject.util_equals(this.sound, notifications.sound) && this.dailyReportPush == notifications.dailyReportPush && this.weeklyReportPush == notifications.weeklyReportPush && this.officialPush == notifications.officialPush && ValueObject.util_equals(this.noDisturb, notifications.noDisturb) && this.syncMoment == notifications.syncMoment;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((((i * 41) + (this.previewPushMessage ? 1231 : 1237)) * 41) + (this.newMatchPush ? 1231 : 1237)) * 41) + (this.messagePush ? 1231 : 1237)) * 41) + (this.superLikePush ? 1231 : 1237)) * 41) + (this.momentPush ? 1231 : 1237)) * 41;
        String str = this.sound;
        int iHashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.dailyReportPush ? 1231 : 1237)) * 41) + (this.weeklyReportPush ? 1231 : 1237)) * 41) + (this.officialPush ? 1231 : 1237)) * 41;
        NotificationNoDisturb notificationNoDisturb = this.noDisturb;
        int iHashCode2 = ((iHashCode + (notificationNoDisturb != null ? notificationNoDisturb.hashCode() : 0)) * 41) + (this.syncMoment ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sound == null) {
            this.sound = "";
        }
        if (this.noDisturb == null) {
            this.noDisturb = NotificationNoDisturb.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
