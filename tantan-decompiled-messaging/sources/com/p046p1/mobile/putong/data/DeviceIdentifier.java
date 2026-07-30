package com.p046p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
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
public class DeviceIdentifier extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "deviceidentifier";

    @Nullable
    @ProtobufIndex(index = 1)
    public String name;

    @Nullable
    @ProtobufIndex(index = 2)
    public String token;
    public static ProtobufAdapter<DeviceIdentifier> PROTOBUF_ADAPTER = new MessageNanoAdapter<DeviceIdentifier>() { // from class: com.p1.mobile.putong.data.DeviceIdentifier.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DeviceIdentifier deviceIdentifier) {
            String str = deviceIdentifier.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = deviceIdentifier.token;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            deviceIdentifier.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DeviceIdentifier parse(nb5 nb5Var) throws IOException {
            DeviceIdentifier deviceIdentifier = new DeviceIdentifier();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    deviceIdentifier.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        return deviceIdentifier;
                    }
                    deviceIdentifier.token = nb5Var.m158750s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DeviceIdentifier deviceIdentifier, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = deviceIdentifier.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = deviceIdentifier.token;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<DeviceIdentifier> JSON_ADAPTER = new ObjectJsonAdapter<DeviceIdentifier>() { // from class: com.p1.mobile.putong.data.DeviceIdentifier.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DeviceIdentifier.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DeviceIdentifier newInstance() {
            return new DeviceIdentifier();
        }

        public boolean parseField(DeviceIdentifier deviceIdentifier, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                deviceIdentifier.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("token")) {
                return false;
            }
            deviceIdentifier.token = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(DeviceIdentifier deviceIdentifier, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME) || str.equals("token")) {
                return true;
            }
            return super.parseFieldCheck(deviceIdentifier, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DeviceIdentifier deviceIdentifier, JsonGenerator jsonGenerator) throws IOException {
            String str = deviceIdentifier.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = deviceIdentifier.token;
            if (str2 != null) {
                jsonGenerator.writeStringField("token", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DeviceIdentifier) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DeviceIdentifier) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DeviceIdentifier new_() {
        DeviceIdentifier deviceIdentifier = new DeviceIdentifier();
        deviceIdentifier.nullCheck();
        return deviceIdentifier;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DeviceIdentifier mo223809clone() {
        DeviceIdentifier deviceIdentifier = new DeviceIdentifier();
        deviceIdentifier.name = this.name;
        deviceIdentifier.token = this.token;
        return deviceIdentifier;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceIdentifier)) {
            return false;
        }
        DeviceIdentifier deviceIdentifier = (DeviceIdentifier) obj;
        return ValueObject.util_equals(this.name, deviceIdentifier.name) && ValueObject.util_equals(this.token, deviceIdentifier.token);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.token;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
