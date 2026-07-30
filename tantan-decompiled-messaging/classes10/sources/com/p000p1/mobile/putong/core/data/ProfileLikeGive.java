package com.p000p1.mobile.putong.core.data;

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
public class ProfileLikeGive extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilelikegive";

    @ProtobufIndex(index = 1)
    public boolean isGive;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int quantity;
    public static ProtobufAdapter<ProfileLikeGive> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileLikeGive>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeGive.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileLikeGive profileLikeGive) {
            int iB = CodedOutputByteBufferNano.b(1, profileLikeGive.isGive) + CodedOutputByteBufferNano.h(2, profileLikeGive.quantity);
            ((MessageNano) profileLikeGive).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileLikeGive m14993parse(nb5 nb5Var) throws IOException {
            ProfileLikeGive profileLikeGive = new ProfileLikeGive();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    profileLikeGive.isGive = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return profileLikeGive;
                    }
                    profileLikeGive.quantity = nb5Var.j();
                }
            }
        }

        public void serialize(ProfileLikeGive profileLikeGive, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, profileLikeGive.isGive);
            codedOutputByteBufferNano.G(2, profileLikeGive.quantity);
        }
    };
    public static JsonAdapter<ProfileLikeGive> JSON_ADAPTER = new ObjectJsonAdapter<ProfileLikeGive>() { // from class: com.p1.mobile.putong.core.data.ProfileLikeGive.2
        public Class getDataClass() {
            return ProfileLikeGive.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileLikeGive m14994newInstance() {
            return new ProfileLikeGive();
        }

        public boolean parseField(ProfileLikeGive profileLikeGive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("quantity")) {
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
            if (str.equals("quantity") || str.equals("isGive")) {
                return true;
            }
            return super.parseFieldCheck(profileLikeGive, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ProfileLikeGive profileLikeGive, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isGive", profileLikeGive.isGive);
            jsonGenerator.writeNumberField("quantity", profileLikeGive.quantity);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileLikeGive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileLikeGive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileLikeGive new_() {
        ProfileLikeGive profileLikeGive = new ProfileLikeGive();
        profileLikeGive.nullCheck();
        return profileLikeGive;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileLikeGive m14992clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.isGive ? 1231 : 1237)) * 41) + this.quantity;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
