package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.RegionRuleTag;
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

/* JADX INFO: loaded from: classes12.dex */
public class UserAbroad extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userabroad";

    /* JADX INFO: renamed from: BS */
    @ProtobufIndex(index = 2)
    public boolean f39676BS;

    @ProtobufIndex(index = 3)
    public boolean CCPA;

    /* JADX INFO: renamed from: EU */
    @ProtobufIndex(index = 1)
    public boolean f39677EU;
    public static ProtobufAdapter<UserAbroad> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserAbroad>() { // from class: com.p1.mobile.putong.data.UserAbroad.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserAbroad userAbroad) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, userAbroad.f39677EU) + CodedOutputByteBufferNano.m17275b(2, userAbroad.f39676BS) + CodedOutputByteBufferNano.m17275b(3, userAbroad.CCPA);
            userAbroad.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserAbroad parse(nc5 nc5Var) throws IOException {
            UserAbroad userAbroad = new UserAbroad();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    userAbroad.f39677EU = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    userAbroad.f39676BS = nc5Var.m162483g();
                } else {
                    if (iM162497u != 24) {
                        return userAbroad;
                    }
                    userAbroad.CCPA = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserAbroad userAbroad, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, userAbroad.f39677EU);
            codedOutputByteBufferNano.m17299A(2, userAbroad.f39676BS);
            codedOutputByteBufferNano.m17299A(3, userAbroad.CCPA);
        }
    };
    public static JsonAdapter<UserAbroad> JSON_ADAPTER = new ObjectJsonAdapter<UserAbroad>() { // from class: com.p1.mobile.putong.data.UserAbroad.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserAbroad.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserAbroad newInstance() {
            return new UserAbroad();
        }

        public boolean parseField(UserAbroad userAbroad, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "BS":
                    userAbroad.f39676BS = jsonParser.getValueAsBoolean();
                    return true;
                case "EU":
                    userAbroad.f39677EU = jsonParser.getValueAsBoolean();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserAbroad userAbroad, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("EU", userAbroad.f39677EU);
            jsonGenerator.writeBooleanField(RegionRuleTag.f21235BS, userAbroad.f39676BS);
            jsonGenerator.writeBooleanField(RegionRuleTag.CCPA, userAbroad.CCPA);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserAbroad) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public UserAbroad mo225055clone() {
        UserAbroad userAbroad = new UserAbroad();
        userAbroad.f39677EU = this.f39677EU;
        userAbroad.f39676BS = this.f39676BS;
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
        return this.f39677EU == userAbroad.f39677EU && this.f39676BS == userAbroad.f39676BS && this.CCPA == userAbroad.CCPA;
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
        int i2 = (((((i * 41) + (this.f39677EU ? 1231 : 1237)) * 41) + (this.f39676BS ? 1231 : 1237)) * 41) + (this.CCPA ? 1231 : 1237);
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
