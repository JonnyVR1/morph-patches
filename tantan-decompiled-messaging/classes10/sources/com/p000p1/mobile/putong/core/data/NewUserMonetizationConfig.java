package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewUserMonetizationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newusermonetizationconfig";

    @ProtobufIndex(index = 4)
    public boolean hasPaid;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f120id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int newUserRegisterDay;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<NewUserMonetizationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewUserMonetizationConfig>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewUserMonetizationConfig newUserMonetizationConfig) {
            String str = newUserMonetizationConfig.f120id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = newUserMonetizationConfig.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, newUserMonetizationConfig.newUserRegisterDay) + CodedOutputByteBufferNano.b(4, newUserMonetizationConfig.hasPaid);
            ((MessageNano) newUserMonetizationConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewUserMonetizationConfig m14543parse(nb5 nb5Var) throws IOException {
            NewUserMonetizationConfig newUserMonetizationConfig = new NewUserMonetizationConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newUserMonetizationConfig.f120id == null) {
                        newUserMonetizationConfig.f120id = "";
                    }
                    if (newUserMonetizationConfig.type != null) {
                        break;
                    }
                    newUserMonetizationConfig.type = "";
                    break;
                }
                if (iU == 10) {
                    newUserMonetizationConfig.f120id = nb5Var.s();
                } else if (iU == 18) {
                    newUserMonetizationConfig.type = nb5Var.s();
                } else if (iU == 24) {
                    newUserMonetizationConfig.newUserRegisterDay = nb5Var.j();
                } else {
                    if (iU != 32) {
                        if (newUserMonetizationConfig.f120id == null) {
                            newUserMonetizationConfig.f120id = "";
                        }
                        if (newUserMonetizationConfig.type != null) {
                            break;
                        }
                        newUserMonetizationConfig.type = "";
                        return newUserMonetizationConfig;
                    }
                    newUserMonetizationConfig.hasPaid = nb5Var.g();
                }
            }
            return newUserMonetizationConfig;
        }

        public void serialize(NewUserMonetizationConfig newUserMonetizationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newUserMonetizationConfig.f120id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = newUserMonetizationConfig.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, newUserMonetizationConfig.newUserRegisterDay);
            codedOutputByteBufferNano.A(4, newUserMonetizationConfig.hasPaid);
        }
    };
    public static JsonAdapter<NewUserMonetizationConfig> JSON_ADAPTER = new ObjectJsonAdapter<NewUserMonetizationConfig>() { // from class: com.p1.mobile.putong.core.data.NewUserMonetizationConfig.2
        public Class getDataClass() {
            return NewUserMonetizationConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewUserMonetizationConfig m14544newInstance() {
            return new NewUserMonetizationConfig();
        }

        public boolean parseField(NewUserMonetizationConfig newUserMonetizationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "newUserRegisterDay":
                    newUserMonetizationConfig.newUserRegisterDay = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    newUserMonetizationConfig.f120id = jsonParser.getValueAsString();
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

        public void serializeFields(NewUserMonetizationConfig newUserMonetizationConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = newUserMonetizationConfig.f120id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewUserMonetizationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewUserMonetizationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewUserMonetizationConfig new_() {
        NewUserMonetizationConfig newUserMonetizationConfig = new NewUserMonetizationConfig();
        newUserMonetizationConfig.nullCheck();
        return newUserMonetizationConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewUserMonetizationConfig m14542clone() {
        NewUserMonetizationConfig newUserMonetizationConfig = new NewUserMonetizationConfig();
        newUserMonetizationConfig.f120id = this.f120id;
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
        return ValueObject.util_equals(this.f120id, newUserMonetizationConfig.f120id) && ValueObject.util_equals(this.type, newUserMonetizationConfig.type) && this.newUserRegisterDay == newUserMonetizationConfig.newUserRegisterDay && this.hasPaid == newUserMonetizationConfig.hasPaid;
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
        String str = this.f120id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.newUserRegisterDay) * 41) + (this.hasPaid ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f120id == null) {
            this.f120id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
