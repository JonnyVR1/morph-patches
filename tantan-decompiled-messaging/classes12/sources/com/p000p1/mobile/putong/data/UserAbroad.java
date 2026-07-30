package com.p000p1.mobile.putong.data;

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
public class UserAbroad extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userabroad";

    /* JADX INFO: renamed from: BS */
    @ProtobufIndex(index = 2)
    public boolean f289BS;

    @ProtobufIndex(index = 3)
    public boolean CCPA;

    /* JADX INFO: renamed from: EU */
    @ProtobufIndex(index = 1)
    public boolean f290EU;
    public static ProtobufAdapter<UserAbroad> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserAbroad>() { // from class: com.p1.mobile.putong.data.UserAbroad.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserAbroad userAbroad) {
            int iB = CodedOutputByteBufferNano.b(1, userAbroad.f290EU) + CodedOutputByteBufferNano.b(2, userAbroad.f289BS) + CodedOutputByteBufferNano.b(3, userAbroad.CCPA);
            ((MessageNano) userAbroad).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserAbroad m19154parse(nb5 nb5Var) throws IOException {
            UserAbroad userAbroad = new UserAbroad();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    userAbroad.f290EU = nb5Var.g();
                } else if (iU == 16) {
                    userAbroad.f289BS = nb5Var.g();
                } else {
                    if (iU != 24) {
                        return userAbroad;
                    }
                    userAbroad.CCPA = nb5Var.g();
                }
            }
        }

        public void serialize(UserAbroad userAbroad, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, userAbroad.f290EU);
            codedOutputByteBufferNano.A(2, userAbroad.f289BS);
            codedOutputByteBufferNano.A(3, userAbroad.CCPA);
        }
    };
    public static JsonAdapter<UserAbroad> JSON_ADAPTER = new ObjectJsonAdapter<UserAbroad>() { // from class: com.p1.mobile.putong.data.UserAbroad.2
        public Class getDataClass() {
            return UserAbroad.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserAbroad mo17830newInstance() {
            return new UserAbroad();
        }

        public boolean parseField(UserAbroad userAbroad, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "BS":
                    userAbroad.f289BS = jsonParser.getValueAsBoolean();
                    return true;
                case "EU":
                    userAbroad.f290EU = jsonParser.getValueAsBoolean();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserAbroad userAbroad, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("EU", userAbroad.f290EU);
            jsonGenerator.writeBooleanField("BS", userAbroad.f289BS);
            jsonGenerator.writeBooleanField("CCPA", userAbroad.CCPA);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserAbroad) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserAbroad) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserAbroad new_() {
        UserAbroad userAbroad = new UserAbroad();
        userAbroad.nullCheck();
        return userAbroad;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserAbroad m19153clone() {
        UserAbroad userAbroad = new UserAbroad();
        userAbroad.f290EU = this.f290EU;
        userAbroad.f289BS = this.f289BS;
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
        return this.f290EU == userAbroad.f290EU && this.f289BS == userAbroad.f289BS && this.CCPA == userAbroad.CCPA;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.f290EU ? 1231 : 1237)) * 41) + (this.f289BS ? 1231 : 1237)) * 41) + (this.CCPA ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
