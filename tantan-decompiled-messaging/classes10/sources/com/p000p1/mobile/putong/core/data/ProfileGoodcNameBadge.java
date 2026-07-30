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
public class ProfileGoodcNameBadge extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcnamebadge";

    @ProtobufIndex(index = 1)
    public int divisor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ProfileGoodcNameRules rules;
    public static ProtobufAdapter<ProfileGoodcNameBadge> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcNameBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcNameBadge.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileGoodcNameBadge profileGoodcNameBadge) {
            int iH = CodedOutputByteBufferNano.h(1, profileGoodcNameBadge.divisor);
            ProfileGoodcNameRules profileGoodcNameRules = profileGoodcNameBadge.rules;
            if (profileGoodcNameRules != null) {
                iH += CodedOutputByteBufferNano.l(2, profileGoodcNameRules, ProfileGoodcNameRules.PROTOBUF_ADAPTER);
            }
            ((MessageNano) profileGoodcNameBadge).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcNameBadge m14953parse(nb5 nb5Var) throws IOException {
            ProfileGoodcNameBadge profileGoodcNameBadge = new ProfileGoodcNameBadge();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileGoodcNameBadge.rules != null) {
                        break;
                    }
                    profileGoodcNameBadge.rules = ProfileGoodcNameRules.new_();
                    break;
                }
                if (iU == 8) {
                    profileGoodcNameBadge.divisor = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (profileGoodcNameBadge.rules != null) {
                            break;
                        }
                        profileGoodcNameBadge.rules = ProfileGoodcNameRules.new_();
                        return profileGoodcNameBadge;
                    }
                    profileGoodcNameBadge.rules = (ProfileGoodcNameRules) nb5Var.l(ProfileGoodcNameRules.PROTOBUF_ADAPTER);
                }
            }
            return profileGoodcNameBadge;
        }

        public void serialize(ProfileGoodcNameBadge profileGoodcNameBadge, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, profileGoodcNameBadge.divisor);
            ProfileGoodcNameRules profileGoodcNameRules = profileGoodcNameBadge.rules;
            if (profileGoodcNameRules != null) {
                codedOutputByteBufferNano.K(2, profileGoodcNameRules, ProfileGoodcNameRules.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileGoodcNameBadge> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcNameBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcNameBadge.2
        public Class getDataClass() {
            return ProfileGoodcNameBadge.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcNameBadge m14954newInstance() {
            return new ProfileGoodcNameBadge();
        }

        public boolean parseField(ProfileGoodcNameBadge profileGoodcNameBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("rules")) {
                profileGoodcNameBadge.rules = (ProfileGoodcNameRules) ProfileGoodcNameRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("divisor")) {
                return false;
            }
            profileGoodcNameBadge.divisor = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ProfileGoodcNameBadge profileGoodcNameBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("rules") || str.equals("divisor")) {
                return true;
            }
            return super.parseFieldCheck(profileGoodcNameBadge, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ProfileGoodcNameBadge profileGoodcNameBadge, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("divisor", profileGoodcNameBadge.divisor);
            if (profileGoodcNameBadge.rules != null) {
                jsonGenerator.writeFieldName("rules");
                ProfileGoodcNameRules.JSON_ADAPTER.serialize(profileGoodcNameBadge.rules, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcNameBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcNameBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodcNameBadge new_() {
        ProfileGoodcNameBadge profileGoodcNameBadge = new ProfileGoodcNameBadge();
        profileGoodcNameBadge.nullCheck();
        return profileGoodcNameBadge;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileGoodcNameBadge m14952clone() {
        ProfileGoodcNameBadge profileGoodcNameBadge = new ProfileGoodcNameBadge();
        profileGoodcNameBadge.divisor = this.divisor;
        ProfileGoodcNameRules profileGoodcNameRules = this.rules;
        if (profileGoodcNameRules != null) {
            profileGoodcNameBadge.rules = profileGoodcNameRules.m14956clone();
        }
        return profileGoodcNameBadge;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodcNameBadge)) {
            return false;
        }
        ProfileGoodcNameBadge profileGoodcNameBadge = (ProfileGoodcNameBadge) obj;
        return this.divisor == profileGoodcNameBadge.divisor && ValueObject.util_equals(this.rules, profileGoodcNameBadge.rules);
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
        ProfileGoodcNameRules profileGoodcNameRules = this.rules;
        int iHashCode = i2 + (profileGoodcNameRules != null ? profileGoodcNameRules.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.rules == null) {
            this.rules = ProfileGoodcNameRules.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
