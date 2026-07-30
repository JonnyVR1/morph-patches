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
public class ProfileGoodcPhotoBadge extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodcphotobadge";

    @ProtobufIndex(index = 1)
    public int divisor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ProfileGoodcPhotoRules rules;
    public static ProtobufAdapter<ProfileGoodcPhotoBadge> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodcPhotoBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcPhotoBadge.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileGoodcPhotoBadge profileGoodcPhotoBadge) {
            int iH = CodedOutputByteBufferNano.h(1, profileGoodcPhotoBadge.divisor);
            ProfileGoodcPhotoRules profileGoodcPhotoRules = profileGoodcPhotoBadge.rules;
            if (profileGoodcPhotoRules != null) {
                iH += CodedOutputByteBufferNano.l(2, profileGoodcPhotoRules, ProfileGoodcPhotoRules.PROTOBUF_ADAPTER);
            }
            ((MessageNano) profileGoodcPhotoBadge).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcPhotoBadge m14961parse(nb5 nb5Var) throws IOException {
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = new ProfileGoodcPhotoBadge();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileGoodcPhotoBadge.rules != null) {
                        break;
                    }
                    profileGoodcPhotoBadge.rules = ProfileGoodcPhotoRules.new_();
                    break;
                }
                if (iU == 8) {
                    profileGoodcPhotoBadge.divisor = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (profileGoodcPhotoBadge.rules != null) {
                            break;
                        }
                        profileGoodcPhotoBadge.rules = ProfileGoodcPhotoRules.new_();
                        return profileGoodcPhotoBadge;
                    }
                    profileGoodcPhotoBadge.rules = (ProfileGoodcPhotoRules) nb5Var.l(ProfileGoodcPhotoRules.PROTOBUF_ADAPTER);
                }
            }
            return profileGoodcPhotoBadge;
        }

        public void serialize(ProfileGoodcPhotoBadge profileGoodcPhotoBadge, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, profileGoodcPhotoBadge.divisor);
            ProfileGoodcPhotoRules profileGoodcPhotoRules = profileGoodcPhotoBadge.rules;
            if (profileGoodcPhotoRules != null) {
                codedOutputByteBufferNano.K(2, profileGoodcPhotoRules, ProfileGoodcPhotoRules.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileGoodcPhotoBadge> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodcPhotoBadge>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodcPhotoBadge.2
        public Class getDataClass() {
            return ProfileGoodcPhotoBadge.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileGoodcPhotoBadge m14962newInstance() {
            return new ProfileGoodcPhotoBadge();
        }

        public boolean parseField(ProfileGoodcPhotoBadge profileGoodcPhotoBadge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("rules")) {
                profileGoodcPhotoBadge.rules = (ProfileGoodcPhotoRules) ProfileGoodcPhotoRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(ProfileGoodcPhotoBadge profileGoodcPhotoBadge, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("divisor", profileGoodcPhotoBadge.divisor);
            if (profileGoodcPhotoBadge.rules != null) {
                jsonGenerator.writeFieldName("rules");
                ProfileGoodcPhotoRules.JSON_ADAPTER.serialize(profileGoodcPhotoBadge.rules, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodcPhotoBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodcPhotoBadge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodcPhotoBadge new_() {
        ProfileGoodcPhotoBadge profileGoodcPhotoBadge = new ProfileGoodcPhotoBadge();
        profileGoodcPhotoBadge.nullCheck();
        return profileGoodcPhotoBadge;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileGoodcPhotoBadge m14960clone() {
        ProfileGoodcPhotoBadge profileGoodcPhotoBadge = new ProfileGoodcPhotoBadge();
        profileGoodcPhotoBadge.divisor = this.divisor;
        ProfileGoodcPhotoRules profileGoodcPhotoRules = this.rules;
        if (profileGoodcPhotoRules != null) {
            profileGoodcPhotoBadge.rules = profileGoodcPhotoRules.m14964clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.divisor) * 41;
        ProfileGoodcPhotoRules profileGoodcPhotoRules = this.rules;
        int iHashCode = i2 + (profileGoodcPhotoRules != null ? profileGoodcPhotoRules.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.rules == null) {
            this.rules = ProfileGoodcPhotoRules.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
