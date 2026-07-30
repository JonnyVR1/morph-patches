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
public class AppealFaceidToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealfaceidtoken";

    @NonNull
    @ProtobufIndex(index = 4)
    public String expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20345id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;
    public static ProtobufAdapter<AppealFaceidToken> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppealFaceidToken>() { // from class: com.p1.mobile.putong.core.data.AppealFaceidToken.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AppealFaceidToken appealFaceidToken) {
            String str = appealFaceidToken.f20345id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = appealFaceidToken.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = appealFaceidToken.value;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = appealFaceidToken.expireTime;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            appealFaceidToken.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AppealFaceidToken parse(nb5 nb5Var) throws IOException {
            AppealFaceidToken appealFaceidToken = new AppealFaceidToken();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (appealFaceidToken.f20345id == null) {
                        appealFaceidToken.f20345id = "";
                    }
                    if (appealFaceidToken.type == null) {
                        appealFaceidToken.type = "";
                    }
                    if (appealFaceidToken.value == null) {
                        appealFaceidToken.value = "";
                    }
                    if (appealFaceidToken.expireTime != null) {
                        break;
                    }
                    appealFaceidToken.expireTime = "";
                    break;
                }
                if (iM158752u == 10) {
                    appealFaceidToken.f20345id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    appealFaceidToken.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    appealFaceidToken.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (appealFaceidToken.f20345id == null) {
                            appealFaceidToken.f20345id = "";
                        }
                        if (appealFaceidToken.type == null) {
                            appealFaceidToken.type = "";
                        }
                        if (appealFaceidToken.value == null) {
                            appealFaceidToken.value = "";
                        }
                        if (appealFaceidToken.expireTime != null) {
                            break;
                        }
                        appealFaceidToken.expireTime = "";
                        return appealFaceidToken;
                    }
                    appealFaceidToken.expireTime = nb5Var.m158750s();
                }
            }
            return appealFaceidToken;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AppealFaceidToken appealFaceidToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealFaceidToken.f20345id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = appealFaceidToken.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = appealFaceidToken.value;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = appealFaceidToken.expireTime;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<AppealFaceidToken> JSON_ADAPTER = new ObjectJsonAdapter<AppealFaceidToken>() { // from class: com.p1.mobile.putong.core.data.AppealFaceidToken.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AppealFaceidToken.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AppealFaceidToken newInstance() {
            return new AppealFaceidToken();
        }

        public boolean parseField(AppealFaceidToken appealFaceidToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    appealFaceidToken.expireTime = jsonParser.getValueAsString();
                    return true;
                case "id":
                    appealFaceidToken.f20345id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    appealFaceidToken.type = jsonParser.getValueAsString();
                    return true;
                case "value":
                    appealFaceidToken.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AppealFaceidToken appealFaceidToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireTime":
                    return true;
                case "id":
                    return false;
                case "type":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(appealFaceidToken, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AppealFaceidToken appealFaceidToken, JsonGenerator jsonGenerator) throws IOException {
            String str = appealFaceidToken.f20345id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = appealFaceidToken.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = appealFaceidToken.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            String str4 = appealFaceidToken.expireTime;
            if (str4 != null) {
                jsonGenerator.writeStringField("expireTime", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealFaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealFaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppealFaceidToken new_() {
        AppealFaceidToken appealFaceidToken = new AppealFaceidToken();
        appealFaceidToken.nullCheck();
        return appealFaceidToken;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AppealFaceidToken mo223809clone() {
        AppealFaceidToken appealFaceidToken = new AppealFaceidToken();
        appealFaceidToken.f20345id = this.f20345id;
        appealFaceidToken.type = this.type;
        appealFaceidToken.value = this.value;
        appealFaceidToken.expireTime = this.expireTime;
        return appealFaceidToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppealFaceidToken)) {
            return false;
        }
        AppealFaceidToken appealFaceidToken = (AppealFaceidToken) obj;
        return ValueObject.util_equals(this.f20345id, appealFaceidToken.f20345id) && ValueObject.util_equals(this.type, appealFaceidToken.type) && ValueObject.util_equals(this.value, appealFaceidToken.value) && ValueObject.util_equals(this.expireTime, appealFaceidToken.expireTime);
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
        String str = this.f20345id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.expireTime;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20345id == null) {
            this.f20345id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.expireTime == null) {
            this.expireTime = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
