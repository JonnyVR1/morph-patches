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
public class ProfileGoodcInfoBadge extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcinfobadge";

    @ProtobufIndex(index = 1)
    public int divisor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ProfileGoodcVipRules rules;
    public static ProtobufAdapter<ProfileGoodcInfoBadge> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcInfoBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcInfoBadge.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileGoodcInfoBadge profileGoodcInfoBadge) {
            int iH = CodedOutputByteBufferNano.h(1, profileGoodcInfoBadge.divisor);
            ProfileGoodcVipRules profileGoodcVipRules = profileGoodcInfoBadge.rules;
            if (profileGoodcVipRules != null) {
                iH += CodedOutputByteBufferNano.l(2, profileGoodcVipRules, ProfileGoodcVipRules.PROTOBUF_ADAPTER);
            }
            ((MessageNano) profileGoodcInfoBadge).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcInfoBadge m14949parse(nb5 nb5Var) throws IOException {
            ProfileGoodcInfoBadge profileGoodcInfoBadge = new ProfileGoodcInfoBadge();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileGoodcInfoBadge.rules != null) {
                        break;
                    }
                    profileGoodcInfoBadge.rules = ProfileGoodcVipRules.new_();
                    break;
                }
                if (iU == 8) {
                    profileGoodcInfoBadge.divisor = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (profileGoodcInfoBadge.rules != null) {
                            break;
                        }
                        profileGoodcInfoBadge.rules = ProfileGoodcVipRules.new_();
                        return profileGoodcInfoBadge;
                    }
                    profileGoodcInfoBadge.rules = (ProfileGoodcVipRules) nb5Var.l(ProfileGoodcVipRules.PROTOBUF_ADAPTER);
                }
            }
            return profileGoodcInfoBadge;
        }

        public void serialize(ProfileGoodcInfoBadge profileGoodcInfoBadge, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, profileGoodcInfoBadge.divisor);
            ProfileGoodcVipRules profileGoodcVipRules = profileGoodcInfoBadge.rules;
            if (profileGoodcVipRules != null) {
                codedOutputByteBufferNano.K(2, profileGoodcVipRules, ProfileGoodcVipRules.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileGoodcInfoBadge> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcInfoBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcInfoBadge.2
        public Class getDataClass() {
            return ProfileGoodcInfoBadge.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcInfoBadge m14950newInstance() {
            return new ProfileGoodcInfoBadge();
        }

        public boolean parseField(ProfileGoodcInfoBadge profileGoodcInfoBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("rules")) {
                profileGoodcInfoBadge.rules = (ProfileGoodcVipRules) ProfileGoodcVipRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("divisor")) {
                return false;
            }
            profileGoodcInfoBadge.divisor = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ProfileGoodcInfoBadge profileGoodcInfoBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("rules") || str.equals("divisor")) {
                return true;
            }
            return super.parseFieldCheck(profileGoodcInfoBadge, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ProfileGoodcInfoBadge profileGoodcInfoBadge, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("divisor", profileGoodcInfoBadge.divisor);
            if (profileGoodcInfoBadge.rules != null) {
                jsonGenerator.writeFieldName("rules");
                ProfileGoodcVipRules.JSON_ADAPTER.serialize(profileGoodcInfoBadge.rules, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcInfoBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcInfoBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodcInfoBadge new_() {
        ProfileGoodcInfoBadge profileGoodcInfoBadge = new ProfileGoodcInfoBadge();
        profileGoodcInfoBadge.nullCheck();
        return profileGoodcInfoBadge;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileGoodcInfoBadge m14948clone() {
        ProfileGoodcInfoBadge profileGoodcInfoBadge = new ProfileGoodcInfoBadge();
        profileGoodcInfoBadge.divisor = this.divisor;
        ProfileGoodcVipRules profileGoodcVipRules = this.rules;
        if (profileGoodcVipRules != null) {
            profileGoodcInfoBadge.rules = profileGoodcVipRules.m14968clone();
        }
        return profileGoodcInfoBadge;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodcInfoBadge)) {
            return false;
        }
        ProfileGoodcInfoBadge profileGoodcInfoBadge = (ProfileGoodcInfoBadge) obj;
        return this.divisor == profileGoodcInfoBadge.divisor && ValueObject.util_equals(this.rules, profileGoodcInfoBadge.rules);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.divisor) * 41;
        ProfileGoodcVipRules profileGoodcVipRules = this.rules;
        int iHashCode = i2 + (profileGoodcVipRules != null ? profileGoodcVipRules.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.rules == null) {
            this.rules = ProfileGoodcVipRules.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
