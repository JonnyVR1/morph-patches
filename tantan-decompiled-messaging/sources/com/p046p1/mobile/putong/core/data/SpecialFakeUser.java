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
public class SpecialFakeUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "specialfakeuser";

    @ProtobufIndex(index = 2)
    public boolean isSpecialFake;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SpecialFakeUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpecialFakeUser>() { // from class: com.p1.mobile.putong.core.data.SpecialFakeUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpecialFakeUser specialFakeUser) {
            String str = specialFakeUser.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, specialFakeUser.isSpecialFake);
            specialFakeUser.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpecialFakeUser parse(nb5 nb5Var) throws IOException {
            SpecialFakeUser specialFakeUser = new SpecialFakeUser();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (specialFakeUser.userId != null) {
                        break;
                    }
                    specialFakeUser.userId = "";
                    break;
                }
                if (iM158752u == 10) {
                    specialFakeUser.userId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (specialFakeUser.userId != null) {
                            break;
                        }
                        specialFakeUser.userId = "";
                        return specialFakeUser;
                    }
                    specialFakeUser.isSpecialFake = nb5Var.m158738g();
                }
            }
            return specialFakeUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpecialFakeUser specialFakeUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = specialFakeUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, specialFakeUser.isSpecialFake);
        }
    };
    public static JsonAdapter<SpecialFakeUser> JSON_ADAPTER = new ObjectJsonAdapter<SpecialFakeUser>() { // from class: com.p1.mobile.putong.core.data.SpecialFakeUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpecialFakeUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpecialFakeUser newInstance() {
            return new SpecialFakeUser();
        }

        public boolean parseField(SpecialFakeUser specialFakeUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                specialFakeUser.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("isSpecialFake")) {
                return false;
            }
            specialFakeUser.isSpecialFake = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SpecialFakeUser specialFakeUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("isSpecialFake")) {
                return true;
            }
            return super.parseFieldCheck(specialFakeUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpecialFakeUser specialFakeUser, JsonGenerator jsonGenerator) throws IOException {
            String str = specialFakeUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("isSpecialFake", specialFakeUser.isSpecialFake);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpecialFakeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpecialFakeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpecialFakeUser new_() {
        SpecialFakeUser specialFakeUser = new SpecialFakeUser();
        specialFakeUser.nullCheck();
        return specialFakeUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpecialFakeUser mo223809clone() {
        SpecialFakeUser specialFakeUser = new SpecialFakeUser();
        specialFakeUser.userId = this.userId;
        specialFakeUser.isSpecialFake = this.isSpecialFake;
        return specialFakeUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpecialFakeUser)) {
            return false;
        }
        SpecialFakeUser specialFakeUser = (SpecialFakeUser) obj;
        return ValueObject.util_equals(this.userId, specialFakeUser.userId) && this.isSpecialFake == specialFakeUser.isSpecialFake;
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
        String str = this.userId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isSpecialFake ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
