package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.RegionRuleTag;
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
public class UserAbroad extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userabroad";

    /* JADX INFO: renamed from: BS */
    @ProtobufIndex(index = 2)
    public boolean f38828BS;

    @ProtobufIndex(index = 3)
    public boolean CCPA;

    /* JADX INFO: renamed from: EU */
    @ProtobufIndex(index = 1)
    public boolean f38829EU;
    public static ProtobufAdapter<UserAbroad> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserAbroad>() { // from class: com.p1.mobile.putong.data.UserAbroad.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserAbroad userAbroad) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, userAbroad.f38829EU) + CodedOutputByteBufferNano.m17220b(2, userAbroad.f38828BS) + CodedOutputByteBufferNano.m17220b(3, userAbroad.CCPA);
            userAbroad.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserAbroad parse(nb5 nb5Var) throws IOException {
            UserAbroad userAbroad = new UserAbroad();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    userAbroad.f38829EU = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    userAbroad.f38828BS = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        return userAbroad;
                    }
                    userAbroad.CCPA = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserAbroad userAbroad, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, userAbroad.f38829EU);
            codedOutputByteBufferNano.m17244A(2, userAbroad.f38828BS);
            codedOutputByteBufferNano.m17244A(3, userAbroad.CCPA);
        }
    };
    public static JsonAdapter<UserAbroad> JSON_ADAPTER = new ObjectJsonAdapter<UserAbroad>() { // from class: com.p1.mobile.putong.data.UserAbroad.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserAbroad.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserAbroad newInstance() {
            return new UserAbroad();
        }

        public boolean parseField(UserAbroad userAbroad, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "BS":
                    userAbroad.f38828BS = jsonParser.getValueAsBoolean();
                    return true;
                case "EU":
                    userAbroad.f38829EU = jsonParser.getValueAsBoolean();
                    return true;
                case "CCPA":
                    userAbroad.CCPA = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserAbroad userAbroad, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "BS":
                case "EU":
                case "CCPA":
                    return true;
                default:
                    return super.parseFieldCheck(userAbroad, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserAbroad userAbroad, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("EU", userAbroad.f38829EU);
            jsonGenerator.writeBooleanField(RegionRuleTag.f20493BS, userAbroad.f38828BS);
            jsonGenerator.writeBooleanField(RegionRuleTag.CCPA, userAbroad.CCPA);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserAbroad) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserAbroad) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserAbroad new_() {
        UserAbroad userAbroad = new UserAbroad();
        userAbroad.nullCheck();
        return userAbroad;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserAbroad mo223809clone() {
        UserAbroad userAbroad = new UserAbroad();
        userAbroad.f38829EU = this.f38829EU;
        userAbroad.f38828BS = this.f38828BS;
        userAbroad.CCPA = this.CCPA;
        return userAbroad;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserAbroad)) {
            return false;
        }
        UserAbroad userAbroad = (UserAbroad) obj;
        return this.f38829EU == userAbroad.f38829EU && this.f38828BS == userAbroad.f38828BS && this.CCPA == userAbroad.CCPA;
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
        int i2 = (((((i * 41) + (this.f38829EU ? 1231 : 1237)) * 41) + (this.f38828BS ? 1231 : 1237)) * 41) + (this.CCPA ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
