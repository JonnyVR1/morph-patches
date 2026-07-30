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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NotificationNoDisturb notificationNoDisturb) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, notificationNoDisturb.enable);
            String str = notificationNoDisturb.start;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = notificationNoDisturb.end;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            notificationNoDisturb.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NotificationNoDisturb parse(nc5 nc5Var) throws IOException {
            NotificationNoDisturb notificationNoDisturb = new NotificationNoDisturb();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (notificationNoDisturb.start == null) {
                        notificationNoDisturb.start = "";
                    }
                    if (notificationNoDisturb.end != null) {
                        break;
                    }
                    notificationNoDisturb.end = "";
                    break;
                }
                if (iM162497u == 8) {
                    notificationNoDisturb.enable = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    notificationNoDisturb.start = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (notificationNoDisturb.start == null) {
                            notificationNoDisturb.start = "";
                        }
                        if (notificationNoDisturb.end != null) {
                            break;
                        }
                        notificationNoDisturb.end = "";
                        return notificationNoDisturb;
                    }
                    notificationNoDisturb.end = nc5Var.m162495s();
                }
            }
            return notificationNoDisturb;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NotificationNoDisturb notificationNoDisturb, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, notificationNoDisturb.enable);
            String str = notificationNoDisturb.start;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = notificationNoDisturb.end;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<NotificationNoDisturb> JSON_ADAPTER = new ObjectJsonAdapter<NotificationNoDisturb>() { // from class: com.p1.mobile.putong.data.NotificationNoDisturb.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NotificationNoDisturb.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NotificationNoDisturb newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NotificationNoDisturb notificationNoDisturb, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", notificationNoDisturb.enable);
            String str = notificationNoDisturb.start;
            if (str != null) {
                jsonGenerator.writeStringField("start", str);
            }
            String str2 = notificationNoDisturb.end;
            if (str2 != null) {
                jsonGenerator.writeStringField("end", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotificationNoDisturb) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotificationNoDisturb) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotificationNoDisturb new_() {
        NotificationNoDisturb notificationNoDisturb = new NotificationNoDisturb();
        notificationNoDisturb.nullCheck();
        return notificationNoDisturb;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NotificationNoDisturb mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.start;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.end;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.start == null) {
            this.start = "";
        }
        if (this.end == null) {
            this.end = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
