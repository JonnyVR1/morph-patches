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
public class NotificationNoDisturb extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "notificationnodisturb";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 3)
    public String end;

    @NonNull
    @ProtobufIndex(index = 2)
    public String start;
    public static ProtobufAdapter<NotificationNoDisturb> PROTOBUF_ADAPTER = new MessageNanoAdapter<NotificationNoDisturb>() { // from class: com.p1.mobile.putong.data.NotificationNoDisturb.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NotificationNoDisturb notificationNoDisturb) {
            int iB = CodedOutputByteBufferNano.b(1, notificationNoDisturb.enable);
            String str = notificationNoDisturb.start;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = notificationNoDisturb.end;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) notificationNoDisturb).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NotificationNoDisturb m18546parse(nb5 nb5Var) throws IOException {
            NotificationNoDisturb notificationNoDisturb = new NotificationNoDisturb();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (notificationNoDisturb.start == null) {
                        notificationNoDisturb.start = "";
                    }
                    if (notificationNoDisturb.end != null) {
                        break;
                    }
                    notificationNoDisturb.end = "";
                    break;
                }
                if (iU == 8) {
                    notificationNoDisturb.enable = nb5Var.g();
                } else if (iU == 18) {
                    notificationNoDisturb.start = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (notificationNoDisturb.start == null) {
                            notificationNoDisturb.start = "";
                        }
                        if (notificationNoDisturb.end != null) {
                            break;
                        }
                        notificationNoDisturb.end = "";
                        return notificationNoDisturb;
                    }
                    notificationNoDisturb.end = nb5Var.s();
                }
            }
            return notificationNoDisturb;
        }

        public void serialize(NotificationNoDisturb notificationNoDisturb, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, notificationNoDisturb.enable);
            String str = notificationNoDisturb.start;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = notificationNoDisturb.end;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<NotificationNoDisturb> JSON_ADAPTER = new ObjectJsonAdapter<NotificationNoDisturb>() { // from class: com.p1.mobile.putong.data.NotificationNoDisturb.2
        public Class getDataClass() {
            return NotificationNoDisturb.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NotificationNoDisturb mo17830newInstance() {
            return new NotificationNoDisturb();
        }

        public boolean parseField(NotificationNoDisturb notificationNoDisturb, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    notificationNoDisturb.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "end":
                    notificationNoDisturb.end = jsonParser.getValueAsString();
                    return true;
                case "start":
                    notificationNoDisturb.start = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NotificationNoDisturb notificationNoDisturb, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "end":
                case "start":
                    return true;
                default:
                    return super.parseFieldCheck(notificationNoDisturb, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NotificationNoDisturb notificationNoDisturb, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", notificationNoDisturb.enable);
            String str = notificationNoDisturb.start;
            if (str != null) {
                jsonGenerator.writeStringField(KanKanStatus.start, str);
            }
            String str2 = notificationNoDisturb.end;
            if (str2 != null) {
                jsonGenerator.writeStringField("end", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotificationNoDisturb) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotificationNoDisturb) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotificationNoDisturb new_() {
        NotificationNoDisturb notificationNoDisturb = new NotificationNoDisturb();
        notificationNoDisturb.nullCheck();
        return notificationNoDisturb;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NotificationNoDisturb m18545clone() {
        NotificationNoDisturb notificationNoDisturb = new NotificationNoDisturb();
        notificationNoDisturb.enable = this.enable;
        notificationNoDisturb.start = this.start;
        notificationNoDisturb.end = this.end;
        return notificationNoDisturb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationNoDisturb)) {
            return false;
        }
        NotificationNoDisturb notificationNoDisturb = (NotificationNoDisturb) obj;
        return this.enable == notificationNoDisturb.enable && ValueObject.util_equals(this.start, notificationNoDisturb.start) && ValueObject.util_equals(this.end, notificationNoDisturb.end);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.start;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.end;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.start == null) {
            this.start = "";
        }
        if (this.end == null) {
            this.end = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
