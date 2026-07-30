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
public class ProfileGoodcPhotoBadge extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcphotobadge";

    @ProtobufIndex(index = 1)
    public int divisor;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProfileGoodcPhotoRules rules;
    public static ProtobufAdapter<ProfileGoodcPhotoBadge> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcPhotoBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcPhotoBadge.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodcPhotoBadge profileGoodcPhotoBadge) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, profileGoodcPhotoBadge.divisor);
            ProfileGoodcPhotoRules profileGoodcPhotoRules = profileGoodcPhotoBadge.rules;
            if (profileGoodcPhotoRules != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, profileGoodcPhotoRules, ProfileGoodcPhotoRules.PROTOBUF_ADAPTER);
            }
            profileGoodcPhotoBadge.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodcPhotoBadge parse(nb5 nb5Var) throws IOException {
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = new ProfileGoodcPhotoBadge();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (profileGoodcPhotoBadge.rules != null) {
                        break;
                    }
                    profileGoodcPhotoBadge.rules = ProfileGoodcPhotoRules.new_();
                    break;
                }
                if (iM158752u == 8) {
                    profileGoodcPhotoBadge.divisor = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (profileGoodcPhotoBadge.rules != null) {
                            break;
                        }
                        profileGoodcPhotoBadge.rules = ProfileGoodcPhotoRules.new_();
                        return profileGoodcPhotoBadge;
                    }
                    profileGoodcPhotoBadge.rules = (ProfileGoodcPhotoRules) nb5Var.m158743l(ProfileGoodcPhotoRules.PROTOBUF_ADAPTER);
                }
            }
            return profileGoodcPhotoBadge;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodcPhotoBadge profileGoodcPhotoBadge, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, profileGoodcPhotoBadge.divisor);
            ProfileGoodcPhotoRules profileGoodcPhotoRules = profileGoodcPhotoBadge.rules;
            if (profileGoodcPhotoRules != null) {
                codedOutputByteBufferNano.m17254K(2, profileGoodcPhotoRules, ProfileGoodcPhotoRules.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileGoodcPhotoBadge> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcPhotoBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcPhotoBadge.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodcPhotoBadge.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodcPhotoBadge newInstance() {
            return new ProfileGoodcPhotoBadge();
        }

        public boolean parseField(ProfileGoodcPhotoBadge profileGoodcPhotoBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("rules")) {
                profileGoodcPhotoBadge.rules = ProfileGoodcPhotoRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("divisor")) {
                return false;
            }
            profileGoodcPhotoBadge.divisor = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ProfileGoodcPhotoBadge profileGoodcPhotoBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("rules") || str.equals("divisor")) {
                return true;
            }
            return super.parseFieldCheck(profileGoodcPhotoBadge, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfileGoodcPhotoBadge profileGoodcPhotoBadge, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("divisor", profileGoodcPhotoBadge.divisor);
            if (profileGoodcPhotoBadge.rules != null) {
                jsonGenerator.writeFieldName("rules");
                ProfileGoodcPhotoRules.JSON_ADAPTER.serialize(profileGoodcPhotoBadge.rules, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcPhotoBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcPhotoBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodcPhotoBadge new_() {
        ProfileGoodcPhotoBadge profileGoodcPhotoBadge = new ProfileGoodcPhotoBadge();
        profileGoodcPhotoBadge.nullCheck();
        return profileGoodcPhotoBadge;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodcPhotoBadge mo223809clone() {
        ProfileGoodcPhotoBadge profileGoodcPhotoBadge = new ProfileGoodcPhotoBadge();
        profileGoodcPhotoBadge.divisor = this.divisor;
        ProfileGoodcPhotoRules profileGoodcPhotoRules = this.rules;
        if (profileGoodcPhotoRules != null) {
            profileGoodcPhotoBadge.rules = profileGoodcPhotoRules.mo223809clone();
        }
        return profileGoodcPhotoBadge;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodcPhotoBadge)) {
            return false;
        }
        ProfileGoodcPhotoBadge profileGoodcPhotoBadge = (ProfileGoodcPhotoBadge) obj;
        return this.divisor == profileGoodcPhotoBadge.divisor && ValueObject.util_equals(this.rules, profileGoodcPhotoBadge.rules);
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
        ProfileGoodcPhotoRules profileGoodcPhotoRules = this.rules;
        int iHashCode = i2 + (profileGoodcPhotoRules != null ? profileGoodcPhotoRules.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.rules == null) {
            this.rules = ProfileGoodcPhotoRules.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
