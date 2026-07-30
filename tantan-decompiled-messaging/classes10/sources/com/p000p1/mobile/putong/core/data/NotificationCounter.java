package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NotificationCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "notificationcounter";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double latestNotificationTime;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<NotificationCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<NotificationCounter>() { // from class: com.p1.mobile.putong.core.data.NotificationCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NotificationCounter notificationCounter) {
            int iH = CodedOutputByteBufferNano.h(1, notificationCounter.unread) + CodedOutputByteBufferNano.d(2, notificationCounter.latestNotificationTime);
            ((MessageNano) notificationCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NotificationCounter m14575parse(nb5 nb5Var) throws IOException {
            NotificationCounter notificationCounter = new NotificationCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    notificationCounter.unread = nb5Var.j();
                } else {
                    if (iU != 17) {
                        return notificationCounter;
                    }
                    notificationCounter.latestNotificationTime = nb5Var.h();
                }
            }
        }

        public void serialize(NotificationCounter notificationCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, notificationCounter.unread);
            codedOutputByteBufferNano.C(2, notificationCounter.latestNotificationTime);
        }
    };
    public static JsonAdapter<NotificationCounter> JSON_ADAPTER = new ObjectJsonAdapter<NotificationCounter>() { // from class: com.p1.mobile.putong.core.data.NotificationCounter.2
        public Class getDataClass() {
            return NotificationCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NotificationCounter m14576newInstance() {
            return new NotificationCounter();
        }

        public boolean parseField(NotificationCounter notificationCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("latestNotificationTime")) {
                notificationCounter.latestNotificationTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public void serializeFields(NotificationCounter notificationCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, notificationCounter.unread);
            jsonGenerator.writeFieldName("latestNotificationTime");
            Converter.API_TIME.serialize(Double.valueOf(notificationCounter.latestNotificationTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotificationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotificationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotificationCounter new_() {
        NotificationCounter notificationCounter = new NotificationCounter();
        notificationCounter.nullCheck();
        return notificationCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NotificationCounter m14574clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestNotificationTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
