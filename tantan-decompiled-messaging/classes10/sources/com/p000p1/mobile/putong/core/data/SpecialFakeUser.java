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
public class SpecialFakeUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "specialfakeuser";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isSpecialFake;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SpecialFakeUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpecialFakeUser>() { // from class: com.p1.mobile.putong.core.data.SpecialFakeUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpecialFakeUser specialFakeUser) {
            String str = specialFakeUser.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, specialFakeUser.isSpecialFake);
            ((MessageNano) specialFakeUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpecialFakeUser m15698parse(nb5 nb5Var) throws IOException {
            SpecialFakeUser specialFakeUser = new SpecialFakeUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (specialFakeUser.userId != null) {
                        break;
                    }
                    specialFakeUser.userId = "";
                    break;
                }
                if (iU == 10) {
                    specialFakeUser.userId = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (specialFakeUser.userId != null) {
                            break;
                        }
                        specialFakeUser.userId = "";
                        return specialFakeUser;
                    }
                    specialFakeUser.isSpecialFake = nb5Var.g();
                }
            }
            return specialFakeUser;
        }

        public void serialize(SpecialFakeUser specialFakeUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = specialFakeUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, specialFakeUser.isSpecialFake);
        }
    };
    public static JsonAdapter<SpecialFakeUser> JSON_ADAPTER = new ObjectJsonAdapter<SpecialFakeUser>() { // from class: com.p1.mobile.putong.core.data.SpecialFakeUser.2
        public Class getDataClass() {
            return SpecialFakeUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SpecialFakeUser m15699newInstance() {
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

        public void serializeFields(SpecialFakeUser specialFakeUser, JsonGenerator jsonGenerator) throws IOException {
            String str = specialFakeUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("isSpecialFake", specialFakeUser.isSpecialFake);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpecialFakeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpecialFakeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpecialFakeUser new_() {
        SpecialFakeUser specialFakeUser = new SpecialFakeUser();
        specialFakeUser.nullCheck();
        return specialFakeUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpecialFakeUser m15697clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isSpecialFake ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
