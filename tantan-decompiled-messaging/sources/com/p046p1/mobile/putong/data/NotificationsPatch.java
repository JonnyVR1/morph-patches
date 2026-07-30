package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class NotificationsPatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "notificationspatch";

    @NonNull
    @ProtobufIndex(index = 1)
    public String createdTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public Notifications notifications;
    public static ProtobufAdapter<NotificationsPatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<NotificationsPatch>() { // from class: com.p1.mobile.putong.data.NotificationsPatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NotificationsPatch notificationsPatch) {
            String str = notificationsPatch.createdTime;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            Notifications notifications = notificationsPatch.notifications;
            if (notifications != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, notifications, Notifications.PROTOBUF_ADAPTER);
            }
            notificationsPatch.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NotificationsPatch parse(nb5 nb5Var) throws IOException {
            NotificationsPatch notificationsPatch = new NotificationsPatch();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (notificationsPatch.createdTime == null) {
                        notificationsPatch.createdTime = "";
                    }
                    if (notificationsPatch.notifications != null) {
                        break;
                    }
                    notificationsPatch.notifications = Notifications.new_();
                    break;
                }
                if (iM158752u == 10) {
                    notificationsPatch.createdTime = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (notificationsPatch.createdTime == null) {
                            notificationsPatch.createdTime = "";
                        }
                        if (notificationsPatch.notifications != null) {
                            break;
                        }
                        notificationsPatch.notifications = Notifications.new_();
                        return notificationsPatch;
                    }
                    notificationsPatch.notifications = (Notifications) nb5Var.m158743l(Notifications.PROTOBUF_ADAPTER);
                }
            }
            return notificationsPatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NotificationsPatch notificationsPatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = notificationsPatch.createdTime;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            Notifications notifications = notificationsPatch.notifications;
            if (notifications != null) {
                codedOutputByteBufferNano.m17254K(2, notifications, Notifications.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NotificationsPatch> JSON_ADAPTER = new ObjectJsonAdapter<NotificationsPatch>() { // from class: com.p1.mobile.putong.data.NotificationsPatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NotificationsPatch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NotificationsPatch newInstance() {
            return new NotificationsPatch();
        }

        public boolean parseField(NotificationsPatch notificationsPatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("createdTime")) {
                notificationsPatch.createdTime = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(Notifications.TYPE)) {
                return false;
            }
            notificationsPatch.notifications = Notifications.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NotificationsPatch notificationsPatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("createdTime") || str.equals(Notifications.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(notificationsPatch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NotificationsPatch notificationsPatch, JsonGenerator jsonGenerator) throws IOException {
            String str = notificationsPatch.createdTime;
            if (str != null) {
                jsonGenerator.writeStringField("createdTime", str);
            }
            if (notificationsPatch.notifications != null) {
                jsonGenerator.writeFieldName(Notifications.TYPE);
                Notifications.JSON_ADAPTER.serialize(notificationsPatch.notifications, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotificationsPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotificationsPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotificationsPatch new_() {
        NotificationsPatch notificationsPatch = new NotificationsPatch();
        notificationsPatch.nullCheck();
        return notificationsPatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NotificationsPatch mo223809clone() {
        NotificationsPatch notificationsPatch = new NotificationsPatch();
        notificationsPatch.createdTime = this.createdTime;
        Notifications notifications = this.notifications;
        if (notifications != null) {
            notificationsPatch.notifications = notifications.mo223809clone();
        }
        return notificationsPatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationsPatch)) {
            return false;
        }
        NotificationsPatch notificationsPatch = (NotificationsPatch) obj;
        return ValueObject.util_equals(this.createdTime, notificationsPatch.createdTime) && ValueObject.util_equals(this.notifications, notificationsPatch.notifications);
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
        int i2 = i * 41;
        String str = this.createdTime;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Notifications notifications = this.notifications;
        int iHashCode2 = iHashCode + (notifications != null ? notifications.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.createdTime == null) {
            this.createdTime = "";
        }
        if (this.notifications == null) {
            this.notifications = Notifications.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
