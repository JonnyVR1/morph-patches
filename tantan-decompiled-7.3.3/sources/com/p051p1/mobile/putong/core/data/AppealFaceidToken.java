package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class AppealFaceidToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealfaceidtoken";

    @NonNull
    @ProtobufIndex(index = 4)
    public String expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21087id;

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
            String str = appealFaceidToken.f21087id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = appealFaceidToken.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = appealFaceidToken.value;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = appealFaceidToken.expireTime;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            appealFaceidToken.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AppealFaceidToken parse(nc5 nc5Var) throws IOException {
            AppealFaceidToken appealFaceidToken = new AppealFaceidToken();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (appealFaceidToken.f21087id == null) {
                        appealFaceidToken.f21087id = "";
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
                if (iM162497u == 10) {
                    appealFaceidToken.f21087id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    appealFaceidToken.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    appealFaceidToken.value = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (appealFaceidToken.f21087id == null) {
                            appealFaceidToken.f21087id = "";
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
                    appealFaceidToken.expireTime = nc5Var.m162495s();
                }
            }
            return appealFaceidToken;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AppealFaceidToken appealFaceidToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealFaceidToken.f21087id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = appealFaceidToken.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = appealFaceidToken.value;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = appealFaceidToken.expireTime;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<AppealFaceidToken> JSON_ADAPTER = new ObjectJsonAdapter<AppealFaceidToken>() { // from class: com.p1.mobile.putong.core.data.AppealFaceidToken.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AppealFaceidToken.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    appealFaceidToken.f21087id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AppealFaceidToken appealFaceidToken, JsonGenerator jsonGenerator) throws IOException {
            String str = appealFaceidToken.f21087id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealFaceidToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public AppealFaceidToken mo225055clone() {
        AppealFaceidToken appealFaceidToken = new AppealFaceidToken();
        appealFaceidToken.f21087id = this.f21087id;
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
        return ValueObject.util_equals(this.f21087id, appealFaceidToken.f21087id) && ValueObject.util_equals(this.type, appealFaceidToken.type) && ValueObject.util_equals(this.value, appealFaceidToken.value) && ValueObject.util_equals(this.expireTime, appealFaceidToken.expireTime);
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
        String str = this.f21087id;
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
        if (this.f21087id == null) {
            this.f21087id = "";
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
