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
public class NewUserMonetizationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newusermonetizationconfig";

    @ProtobufIndex(index = 4)
    public boolean hasPaid;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20458id;

    @ProtobufIndex(index = 3)
    public int newUserRegisterDay;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<NewUserMonetizationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewUserMonetizationConfig>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewUserMonetizationConfig newUserMonetizationConfig) {
            String str = newUserMonetizationConfig.f20458id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = newUserMonetizationConfig.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, newUserMonetizationConfig.newUserRegisterDay) + CodedOutputByteBufferNano.m17220b(4, newUserMonetizationConfig.hasPaid);
            newUserMonetizationConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewUserMonetizationConfig parse(nb5 nb5Var) throws IOException {
            NewUserMonetizationConfig newUserMonetizationConfig = new NewUserMonetizationConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (newUserMonetizationConfig.f20458id == null) {
                        newUserMonetizationConfig.f20458id = "";
                    }
                    if (newUserMonetizationConfig.type != null) {
                        break;
                    }
                    newUserMonetizationConfig.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    newUserMonetizationConfig.f20458id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    newUserMonetizationConfig.type = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    newUserMonetizationConfig.newUserRegisterDay = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        if (newUserMonetizationConfig.f20458id == null) {
                            newUserMonetizationConfig.f20458id = "";
                        }
                        if (newUserMonetizationConfig.type != null) {
                            break;
                        }
                        newUserMonetizationConfig.type = "";
                        return newUserMonetizationConfig;
                    }
                    newUserMonetizationConfig.hasPaid = nb5Var.m158738g();
                }
            }
            return newUserMonetizationConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewUserMonetizationConfig newUserMonetizationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newUserMonetizationConfig.f20458id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = newUserMonetizationConfig.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, newUserMonetizationConfig.newUserRegisterDay);
            codedOutputByteBufferNano.m17244A(4, newUserMonetizationConfig.hasPaid);
        }
    };
    public static JsonAdapter<NewUserMonetizationConfig> JSON_ADAPTER = new ObjectJsonAdapter<NewUserMonetizationConfig>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewUserMonetizationConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewUserMonetizationConfig newInstance() {
            return new NewUserMonetizationConfig();
        }

        public boolean parseField(NewUserMonetizationConfig newUserMonetizationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "newUserRegisterDay":
                    newUserMonetizationConfig.newUserRegisterDay = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    newUserMonetizationConfig.f20458id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    newUserMonetizationConfig.type = jsonParser.getValueAsString();
                    return true;
                case "hasPaid":
                    newUserMonetizationConfig.hasPaid = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewUserMonetizationConfig newUserMonetizationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "newUserRegisterDay":
                    return true;
                case "id":
                    return false;
                case "type":
                case "hasPaid":
                    return true;
                default:
                    return super.parseFieldCheck(newUserMonetizationConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewUserMonetizationConfig newUserMonetizationConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = newUserMonetizationConfig.f20458id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = newUserMonetizationConfig.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("newUserRegisterDay", newUserMonetizationConfig.newUserRegisterDay);
            jsonGenerator.writeBooleanField("hasPaid", newUserMonetizationConfig.hasPaid);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewUserMonetizationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewUserMonetizationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewUserMonetizationConfig new_() {
        NewUserMonetizationConfig newUserMonetizationConfig = new NewUserMonetizationConfig();
        newUserMonetizationConfig.nullCheck();
        return newUserMonetizationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewUserMonetizationConfig mo223809clone() {
        NewUserMonetizationConfig newUserMonetizationConfig = new NewUserMonetizationConfig();
        newUserMonetizationConfig.f20458id = this.f20458id;
        newUserMonetizationConfig.type = this.type;
        newUserMonetizationConfig.newUserRegisterDay = this.newUserRegisterDay;
        newUserMonetizationConfig.hasPaid = this.hasPaid;
        return newUserMonetizationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewUserMonetizationConfig)) {
            return false;
        }
        NewUserMonetizationConfig newUserMonetizationConfig = (NewUserMonetizationConfig) obj;
        return ValueObject.util_equals(this.f20458id, newUserMonetizationConfig.f20458id) && ValueObject.util_equals(this.type, newUserMonetizationConfig.type) && this.newUserRegisterDay == newUserMonetizationConfig.newUserRegisterDay && this.hasPaid == newUserMonetizationConfig.hasPaid;
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
        String str = this.f20458id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.newUserRegisterDay) * 41) + (this.hasPaid ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20458id == null) {
            this.f20458id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
