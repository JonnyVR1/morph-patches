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
public class NewUserMonetizationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newusermonetizationconfig";

    @ProtobufIndex(index = 4)
    public boolean hasPaid;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21200id;

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
            String str = newUserMonetizationConfig.f21200id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = newUserMonetizationConfig.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, newUserMonetizationConfig.newUserRegisterDay) + CodedOutputByteBufferNano.m17275b(4, newUserMonetizationConfig.hasPaid);
            newUserMonetizationConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewUserMonetizationConfig parse(nc5 nc5Var) throws IOException {
            NewUserMonetizationConfig newUserMonetizationConfig = new NewUserMonetizationConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newUserMonetizationConfig.f21200id == null) {
                        newUserMonetizationConfig.f21200id = "";
                    }
                    if (newUserMonetizationConfig.type != null) {
                        break;
                    }
                    newUserMonetizationConfig.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    newUserMonetizationConfig.f21200id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    newUserMonetizationConfig.type = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    newUserMonetizationConfig.newUserRegisterDay = nc5Var.m162486j();
                } else {
                    if (iM162497u != 32) {
                        if (newUserMonetizationConfig.f21200id == null) {
                            newUserMonetizationConfig.f21200id = "";
                        }
                        if (newUserMonetizationConfig.type != null) {
                            break;
                        }
                        newUserMonetizationConfig.type = "";
                        return newUserMonetizationConfig;
                    }
                    newUserMonetizationConfig.hasPaid = nc5Var.m162483g();
                }
            }
            return newUserMonetizationConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewUserMonetizationConfig newUserMonetizationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newUserMonetizationConfig.f21200id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = newUserMonetizationConfig.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, newUserMonetizationConfig.newUserRegisterDay);
            codedOutputByteBufferNano.m17299A(4, newUserMonetizationConfig.hasPaid);
        }
    };
    public static JsonAdapter<NewUserMonetizationConfig> JSON_ADAPTER = new ObjectJsonAdapter<NewUserMonetizationConfig>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewUserMonetizationConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    newUserMonetizationConfig.f21200id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewUserMonetizationConfig newUserMonetizationConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = newUserMonetizationConfig.f21200id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewUserMonetizationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public NewUserMonetizationConfig mo225055clone() {
        NewUserMonetizationConfig newUserMonetizationConfig = new NewUserMonetizationConfig();
        newUserMonetizationConfig.f21200id = this.f21200id;
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
        return ValueObject.util_equals(this.f21200id, newUserMonetizationConfig.f21200id) && ValueObject.util_equals(this.type, newUserMonetizationConfig.type) && this.newUserRegisterDay == newUserMonetizationConfig.newUserRegisterDay && this.hasPaid == newUserMonetizationConfig.hasPaid;
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
        String str = this.f21200id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.newUserRegisterDay) * 41) + (this.hasPaid ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21200id == null) {
            this.f21200id = "";
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
