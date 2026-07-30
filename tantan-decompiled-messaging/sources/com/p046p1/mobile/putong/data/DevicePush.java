package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class DevicePush extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "devicepush";

    @NonNull
    @ProtobufIndex(index = 1)
    public String service;

    @NonNull
    @ProtobufIndex(index = 2)
    public String token;
    public static ProtobufAdapter<DevicePush> PROTOBUF_ADAPTER = new MessageNanoAdapter<DevicePush>() { // from class: com.p1.mobile.putong.data.DevicePush.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DevicePush devicePush) {
            String str = devicePush.service;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = devicePush.token;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            devicePush.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DevicePush parse(nb5 nb5Var) throws IOException {
            DevicePush devicePush = new DevicePush();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (devicePush.service == null) {
                        devicePush.service = "";
                    }
                    if (devicePush.token != null) {
                        break;
                    }
                    devicePush.token = "";
                    break;
                }
                if (iM158752u == 10) {
                    devicePush.service = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (devicePush.service == null) {
                            devicePush.service = "";
                        }
                        if (devicePush.token != null) {
                            break;
                        }
                        devicePush.token = "";
                        return devicePush;
                    }
                    devicePush.token = nb5Var.m158750s();
                }
            }
            return devicePush;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DevicePush devicePush, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = devicePush.service;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = devicePush.token;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<DevicePush> JSON_ADAPTER = new ObjectJsonAdapter<DevicePush>() { // from class: com.p1.mobile.putong.data.DevicePush.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DevicePush.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DevicePush newInstance() {
            return new DevicePush();
        }

        public boolean parseField(DevicePush devicePush, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("token")) {
                devicePush.token = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(NotificationCompat.CATEGORY_SERVICE)) {
                return false;
            }
            devicePush.service = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(DevicePush devicePush, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("token") || str.equals(NotificationCompat.CATEGORY_SERVICE)) {
                return true;
            }
            return super.parseFieldCheck(devicePush, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DevicePush devicePush, JsonGenerator jsonGenerator) throws IOException {
            String str = devicePush.service;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_SERVICE, str);
            }
            String str2 = devicePush.token;
            if (str2 != null) {
                jsonGenerator.writeStringField("token", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DevicePush) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DevicePush) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DevicePush new_() {
        DevicePush devicePush = new DevicePush();
        devicePush.nullCheck();
        return devicePush;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DevicePush mo223809clone() {
        DevicePush devicePush = new DevicePush();
        devicePush.service = this.service;
        devicePush.token = this.token;
        return devicePush;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DevicePush)) {
            return false;
        }
        DevicePush devicePush = (DevicePush) obj;
        return ValueObject.util_equals(this.service, devicePush.service) && ValueObject.util_equals(this.token, devicePush.token);
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
        String str = this.service;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.token;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.service == null) {
            this.service = "";
        }
        if (this.token == null) {
            this.token = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
