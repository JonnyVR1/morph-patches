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
public class ProfileGoodcInfoBadge extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcinfobadge";

    @ProtobufIndex(index = 1)
    public int divisor;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProfileGoodcVipRules rules;
    public static ProtobufAdapter<ProfileGoodcInfoBadge> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcInfoBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcInfoBadge.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodcInfoBadge profileGoodcInfoBadge) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, profileGoodcInfoBadge.divisor);
            ProfileGoodcVipRules profileGoodcVipRules = profileGoodcInfoBadge.rules;
            if (profileGoodcVipRules != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, profileGoodcVipRules, ProfileGoodcVipRules.PROTOBUF_ADAPTER);
            }
            profileGoodcInfoBadge.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcInfoBadge parse(nb5 nb5Var) throws IOException {
            ProfileGoodcInfoBadge profileGoodcInfoBadge = new ProfileGoodcInfoBadge();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileGoodcInfoBadge.rules != null) {
                        break;
                    }
                    profileGoodcInfoBadge.rules = ProfileGoodcVipRules.new_();
                    break;
                }
                if (iM158752u == 8) {
                    profileGoodcInfoBadge.divisor = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (profileGoodcInfoBadge.rules != null) {
                            break;
                        }
                        profileGoodcInfoBadge.rules = ProfileGoodcVipRules.new_();
                        return profileGoodcInfoBadge;
                    }
                    profileGoodcInfoBadge.rules = (ProfileGoodcVipRules) nb5Var.m158743l(ProfileGoodcVipRules.PROTOBUF_ADAPTER);
                }
            }
            return profileGoodcInfoBadge;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcInfoBadge profileGoodcInfoBadge, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, profileGoodcInfoBadge.divisor);
            ProfileGoodcVipRules profileGoodcVipRules = profileGoodcInfoBadge.rules;
            if (profileGoodcVipRules != null) {
                codedOutputByteBufferNano.m17254K(2, profileGoodcVipRules, ProfileGoodcVipRules.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileGoodcInfoBadge> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcInfoBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcInfoBadge.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcInfoBadge.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodcInfoBadge newInstance() {
            return new ProfileGoodcInfoBadge();
        }

        public boolean parseField(ProfileGoodcInfoBadge profileGoodcInfoBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("rules")) {
                profileGoodcInfoBadge.rules = ProfileGoodcVipRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileGoodcInfoBadge profileGoodcInfoBadge, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("divisor", profileGoodcInfoBadge.divisor);
            if (profileGoodcInfoBadge.rules != null) {
                jsonGenerator.writeFieldName("rules");
                ProfileGoodcVipRules.JSON_ADAPTER.serialize(profileGoodcInfoBadge.rules, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcInfoBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcInfoBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodcInfoBadge new_() {
        ProfileGoodcInfoBadge profileGoodcInfoBadge = new ProfileGoodcInfoBadge();
        profileGoodcInfoBadge.nullCheck();
        return profileGoodcInfoBadge;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcInfoBadge mo223809clone() {
        ProfileGoodcInfoBadge profileGoodcInfoBadge = new ProfileGoodcInfoBadge();
        profileGoodcInfoBadge.divisor = this.divisor;
        ProfileGoodcVipRules profileGoodcVipRules = this.rules;
        if (profileGoodcVipRules != null) {
            profileGoodcInfoBadge.rules = profileGoodcVipRules.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.divisor) * 41;
        ProfileGoodcVipRules profileGoodcVipRules = this.rules;
        int iHashCode = i2 + (profileGoodcVipRules != null ? profileGoodcVipRules.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.rules == null) {
            this.rules = ProfileGoodcVipRules.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
