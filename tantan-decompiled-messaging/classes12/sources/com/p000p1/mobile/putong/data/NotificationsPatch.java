package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NotificationsPatch notificationsPatch) {
            String str = notificationsPatch.createdTime;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Notifications notifications = notificationsPatch.notifications;
            if (notifications != null) {
                iO += CodedOutputByteBufferNano.l(2, notifications, Notifications.PROTOBUF_ADAPTER);
            }
            ((MessageNano) notificationsPatch).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NotificationsPatch m18555parse(nb5 nb5Var) throws IOException {
            NotificationsPatch notificationsPatch = new NotificationsPatch();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (notificationsPatch.createdTime == null) {
                        notificationsPatch.createdTime = "";
                    }
                    if (notificationsPatch.notifications != null) {
                        break;
                    }
                    notificationsPatch.notifications = Notifications.new_();
                    break;
                }
                if (iU == 10) {
                    notificationsPatch.createdTime = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (notificationsPatch.createdTime == null) {
                            notificationsPatch.createdTime = "";
                        }
                        if (notificationsPatch.notifications != null) {
                            break;
                        }
                        notificationsPatch.notifications = Notifications.new_();
                        return notificationsPatch;
                    }
                    notificationsPatch.notifications = (Notifications) nb5Var.l(Notifications.PROTOBUF_ADAPTER);
                }
            }
            return notificationsPatch;
        }

        public void serialize(NotificationsPatch notificationsPatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = notificationsPatch.createdTime;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Notifications notifications = notificationsPatch.notifications;
            if (notifications != null) {
                codedOutputByteBufferNano.K(2, notifications, Notifications.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NotificationsPatch> JSON_ADAPTER = new ObjectJsonAdapter<NotificationsPatch>() { // from class: com.p1.mobile.putong.data.NotificationsPatch.2
        public Class getDataClass() {
            return NotificationsPatch.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NotificationsPatch mo17830newInstance() {
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
            notificationsPatch.notifications = (Notifications) Notifications.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NotificationsPatch notificationsPatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("createdTime") || str.equals(Notifications.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(notificationsPatch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotificationsPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotificationsPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotificationsPatch new_() {
        NotificationsPatch notificationsPatch = new NotificationsPatch();
        notificationsPatch.nullCheck();
        return notificationsPatch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NotificationsPatch m18554clone() {
        NotificationsPatch notificationsPatch = new NotificationsPatch();
        notificationsPatch.createdTime = this.createdTime;
        Notifications notifications = this.notifications;
        if (notifications != null) {
            notificationsPatch.notifications = notifications.m18551clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.createdTime;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Notifications notifications = this.notifications;
        int iHashCode2 = iHashCode + (notifications != null ? notifications.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.createdTime == null) {
            this.createdTime = "";
        }
        if (this.notifications == null) {
            this.notifications = Notifications.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
