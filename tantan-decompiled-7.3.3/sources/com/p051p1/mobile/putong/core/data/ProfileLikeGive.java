package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class ProfileLikeGive extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikegive";

    @ProtobufIndex(index = 1)
    public boolean isGive;

    @ProtobufIndex(index = 2)
    public int quantity;
    public static ProtobufAdapter<ProfileLikeGive> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikeGive>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeGive.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileLikeGive profileLikeGive) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, profileLikeGive.isGive) + CodedOutputByteBufferNano.m17281h(2, profileLikeGive.quantity);
            profileLikeGive.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileLikeGive parse(nc5 nc5Var) throws IOException {
            ProfileLikeGive profileLikeGive = new ProfileLikeGive();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    profileLikeGive.isGive = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return profileLikeGive;
                    }
                    profileLikeGive.quantity = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileLikeGive profileLikeGive, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, profileLikeGive.isGive);
            codedOutputByteBufferNano.m17305G(2, profileLikeGive.quantity);
        }
    };
    public static JsonAdapter<ProfileLikeGive> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikeGive>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeGive.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileLikeGive.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileLikeGive newInstance() {
            return new ProfileLikeGive();
        }

        public boolean parseField(ProfileLikeGive profileLikeGive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.QUANTITY)) {
                profileLikeGive.quantity = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("isGive")) {
                return false;
            }
            profileLikeGive.isGive = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ProfileLikeGive profileLikeGive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.QUANTITY) || str.equals("isGive")) {
                return true;
            }
            return super.parseFieldCheck(profileLikeGive, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileLikeGive profileLikeGive, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isGive", profileLikeGive.isGive);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.QUANTITY, profileLikeGive.quantity);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikeGive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikeGive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikeGive new_() {
        ProfileLikeGive profileLikeGive = new ProfileLikeGive();
        profileLikeGive.nullCheck();
        return profileLikeGive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileLikeGive mo225055clone() {
        ProfileLikeGive profileLikeGive = new ProfileLikeGive();
        profileLikeGive.isGive = this.isGive;
        profileLikeGive.quantity = this.quantity;
        return profileLikeGive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileLikeGive)) {
            return false;
        }
        ProfileLikeGive profileLikeGive = (ProfileLikeGive) obj;
        return this.isGive == profileLikeGive.isGive && this.quantity == profileLikeGive.quantity;
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
        int i2 = (((i * 41) + (this.isGive ? 1231 : 1237)) * 41) + this.quantity;
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
