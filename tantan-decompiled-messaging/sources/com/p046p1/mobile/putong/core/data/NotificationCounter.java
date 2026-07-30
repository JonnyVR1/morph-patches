package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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

/* JADX INFO: loaded from: classes10.dex */
public class NotificationCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "notificationcounter";

    @ProtobufIndex(index = 2)
    public double latestNotificationTime;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<NotificationCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<NotificationCounter>() { // from class: com.p1.mobile.putong.core.data.NotificationCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NotificationCounter notificationCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, notificationCounter.unread) + CodedOutputByteBufferNano.m17222d(2, notificationCounter.latestNotificationTime);
            notificationCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NotificationCounter parse(nb5 nb5Var) throws IOException {
            NotificationCounter notificationCounter = new NotificationCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    notificationCounter.unread = nb5Var.m158741j();
                } else {
                    if (iM158752u != 17) {
                        return notificationCounter;
                    }
                    notificationCounter.latestNotificationTime = nb5Var.m158739h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NotificationCounter notificationCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, notificationCounter.unread);
            codedOutputByteBufferNano.m17246C(2, notificationCounter.latestNotificationTime);
        }
    };
    public static JsonAdapter<NotificationCounter> JSON_ADAPTER = new ObjectJsonAdapter<NotificationCounter>() { // from class: com.p1.mobile.putong.core.data.NotificationCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NotificationCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NotificationCounter newInstance() {
            return new NotificationCounter();
        }

        public boolean parseField(NotificationCounter notificationCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("latestNotificationTime")) {
                notificationCounter.latestNotificationTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                return true;
            }
            if (!str.equals(LimitTimePictureStatus.unread)) {
                return false;
            }
            notificationCounter.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(NotificationCounter notificationCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("latestNotificationTime") || str.equals(LimitTimePictureStatus.unread)) {
                return true;
            }
            return super.parseFieldCheck(notificationCounter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NotificationCounter notificationCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, notificationCounter.unread);
            jsonGenerator.writeFieldName("latestNotificationTime");
            Converter.API_TIME.serialize(Double.valueOf(notificationCounter.latestNotificationTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotificationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotificationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotificationCounter new_() {
        NotificationCounter notificationCounter = new NotificationCounter();
        notificationCounter.nullCheck();
        return notificationCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NotificationCounter mo223809clone() {
        NotificationCounter notificationCounter = new NotificationCounter();
        notificationCounter.unread = this.unread;
        notificationCounter.latestNotificationTime = this.latestNotificationTime;
        return notificationCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationCounter)) {
            return false;
        }
        NotificationCounter notificationCounter = (NotificationCounter) obj;
        return this.unread == notificationCounter.unread && this.latestNotificationTime == notificationCounter.latestNotificationTime;
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
        int i2 = (i * 41) + this.unread;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestNotificationTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
