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
public class ProfileGoodcNameBadge extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcnamebadge";

    @ProtobufIndex(index = 1)
    public int divisor;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProfileGoodcNameRules rules;
    public static ProtobufAdapter<ProfileGoodcNameBadge> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcNameBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcNameBadge.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodcNameBadge profileGoodcNameBadge) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, profileGoodcNameBadge.divisor);
            ProfileGoodcNameRules profileGoodcNameRules = profileGoodcNameBadge.rules;
            if (profileGoodcNameRules != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, profileGoodcNameRules, ProfileGoodcNameRules.PROTOBUF_ADAPTER);
            }
            profileGoodcNameBadge.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcNameBadge parse(nb5 nb5Var) throws IOException {
            ProfileGoodcNameBadge profileGoodcNameBadge = new ProfileGoodcNameBadge();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileGoodcNameBadge.rules != null) {
                        break;
                    }
                    profileGoodcNameBadge.rules = ProfileGoodcNameRules.new_();
                    break;
                }
                if (iM158752u == 8) {
                    profileGoodcNameBadge.divisor = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (profileGoodcNameBadge.rules != null) {
                            break;
                        }
                        profileGoodcNameBadge.rules = ProfileGoodcNameRules.new_();
                        return profileGoodcNameBadge;
                    }
                    profileGoodcNameBadge.rules = (ProfileGoodcNameRules) nb5Var.m158743l(ProfileGoodcNameRules.PROTOBUF_ADAPTER);
                }
            }
            return profileGoodcNameBadge;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcNameBadge profileGoodcNameBadge, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, profileGoodcNameBadge.divisor);
            ProfileGoodcNameRules profileGoodcNameRules = profileGoodcNameBadge.rules;
            if (profileGoodcNameRules != null) {
                codedOutputByteBufferNano.m17254K(2, profileGoodcNameRules, ProfileGoodcNameRules.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileGoodcNameBadge> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcNameBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcNameBadge.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcNameBadge.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodcNameBadge newInstance() {
            return new ProfileGoodcNameBadge();
        }

        public boolean parseField(ProfileGoodcNameBadge profileGoodcNameBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("rules")) {
                profileGoodcNameBadge.rules = ProfileGoodcNameRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileGoodcNameBadge profileGoodcNameBadge, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("divisor", profileGoodcNameBadge.divisor);
            if (profileGoodcNameBadge.rules != null) {
                jsonGenerator.writeFieldName("rules");
                ProfileGoodcNameRules.JSON_ADAPTER.serialize(profileGoodcNameBadge.rules, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcNameBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcNameBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodcNameBadge new_() {
        ProfileGoodcNameBadge profileGoodcNameBadge = new ProfileGoodcNameBadge();
        profileGoodcNameBadge.nullCheck();
        return profileGoodcNameBadge;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcNameBadge mo223809clone() {
        ProfileGoodcNameBadge profileGoodcNameBadge = new ProfileGoodcNameBadge();
        profileGoodcNameBadge.divisor = this.divisor;
        ProfileGoodcNameRules profileGoodcNameRules = this.rules;
        if (profileGoodcNameRules != null) {
            profileGoodcNameBadge.rules = profileGoodcNameRules.mo223809clone();
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
        ProfileGoodcNameRules profileGoodcNameRules = this.rules;
        int iHashCode = i2 + (profileGoodcNameRules != null ? profileGoodcNameRules.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.rules == null) {
            this.rules = ProfileGoodcNameRules.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
