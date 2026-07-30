package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class RequiredVersion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "requiredversion";

    /* JADX INFO: renamed from: android, reason: collision with root package name */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f210116android;

    @NonNull
    @ProtobufIndex(index = 2)
    public String ios;
    public static ProtobufAdapter<RequiredVersion> PROTOBUF_ADAPTER = new MessageNanoAdapter<RequiredVersion>() { // from class: com.p1.mobile.putong.core.data.RequiredVersion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RequiredVersion requiredVersion) {
            String str = requiredVersion.f210116android;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = requiredVersion.ios;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            requiredVersion.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RequiredVersion parse(nb5 nb5Var) throws IOException {
            RequiredVersion requiredVersion = new RequiredVersion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (requiredVersion.f210116android == null) {
                        requiredVersion.f210116android = "";
                    }
                    if (requiredVersion.ios != null) {
                        break;
                    }
                    requiredVersion.ios = "";
                    break;
                }
                if (iM158752u == 10) {
                    requiredVersion.f210116android = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (requiredVersion.f210116android == null) {
                            requiredVersion.f210116android = "";
                        }
                        if (requiredVersion.ios != null) {
                            break;
                        }
                        requiredVersion.ios = "";
                        return requiredVersion;
                    }
                    requiredVersion.ios = nb5Var.m158750s();
                }
            }
            return requiredVersion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RequiredVersion requiredVersion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = requiredVersion.f210116android;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = requiredVersion.ios;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<RequiredVersion> JSON_ADAPTER = new ObjectJsonAdapter<RequiredVersion>() { // from class: com.p1.mobile.putong.core.data.RequiredVersion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RequiredVersion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RequiredVersion newInstance() {
            return new RequiredVersion();
        }

        public boolean parseField(RequiredVersion requiredVersion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("android")) {
                requiredVersion.f210116android = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(DeviceType.ios)) {
                return false;
            }
            requiredVersion.ios = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RequiredVersion requiredVersion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("android") || str.equals(DeviceType.ios)) {
                return true;
            }
            return super.parseFieldCheck(requiredVersion, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RequiredVersion requiredVersion, JsonGenerator jsonGenerator) throws IOException {
            String str = requiredVersion.f210116android;
            if (str != null) {
                jsonGenerator.writeStringField("android", str);
            }
            String str2 = requiredVersion.ios;
            if (str2 != null) {
                jsonGenerator.writeStringField(DeviceType.ios, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RequiredVersion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RequiredVersion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RequiredVersion new_() {
        RequiredVersion requiredVersion = new RequiredVersion();
        requiredVersion.nullCheck();
        return requiredVersion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RequiredVersion mo223809clone() {
        RequiredVersion requiredVersion = new RequiredVersion();
        requiredVersion.f210116android = this.f210116android;
        requiredVersion.ios = this.ios;
        return requiredVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequiredVersion)) {
            return false;
        }
        RequiredVersion requiredVersion = (RequiredVersion) obj;
        return ValueObject.util_equals(this.f210116android, requiredVersion.f210116android) && ValueObject.util_equals(this.ios, requiredVersion.ios);
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
        String str = this.f210116android;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.ios;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f210116android == null) {
            this.f210116android = "";
        }
        if (this.ios == null) {
            this.ios = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
