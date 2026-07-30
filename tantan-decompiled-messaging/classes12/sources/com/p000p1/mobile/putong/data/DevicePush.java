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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DevicePush devicePush) {
            String str = devicePush.service;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = devicePush.token;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) devicePush).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DevicePush m17977parse(nb5 nb5Var) throws IOException {
            DevicePush devicePush = new DevicePush();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (devicePush.service == null) {
                        devicePush.service = "";
                    }
                    if (devicePush.token != null) {
                        break;
                    }
                    devicePush.token = "";
                    break;
                }
                if (iU == 10) {
                    devicePush.service = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (devicePush.service == null) {
                            devicePush.service = "";
                        }
                        if (devicePush.token != null) {
                            break;
                        }
                        devicePush.token = "";
                        return devicePush;
                    }
                    devicePush.token = nb5Var.s();
                }
            }
            return devicePush;
        }

        public void serialize(DevicePush devicePush, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = devicePush.service;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = devicePush.token;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<DevicePush> JSON_ADAPTER = new ObjectJsonAdapter<DevicePush>() { // from class: com.p1.mobile.putong.data.DevicePush.2
        public Class getDataClass() {
            return DevicePush.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DevicePush mo17830newInstance() {
            return new DevicePush();
        }

        public boolean parseField(DevicePush devicePush, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Token.TYPE)) {
                devicePush.token = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("service")) {
                return false;
            }
            devicePush.service = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(DevicePush devicePush, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Token.TYPE) || str.equals("service")) {
                return true;
            }
            return super.parseFieldCheck(devicePush, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DevicePush devicePush, JsonGenerator jsonGenerator) throws IOException {
            String str = devicePush.service;
            if (str != null) {
                jsonGenerator.writeStringField("service", str);
            }
            String str2 = devicePush.token;
            if (str2 != null) {
                jsonGenerator.writeStringField(Token.TYPE, str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DevicePush) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DevicePush) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DevicePush new_() {
        DevicePush devicePush = new DevicePush();
        devicePush.nullCheck();
        return devicePush;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DevicePush m17976clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.service;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.token;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.service == null) {
            this.service = "";
        }
        if (this.token == null) {
            this.token = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
