package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.DetectText;
import com.p1.mobile.putong.data.User;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ProfileEditInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profileeditinfo";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<DetectText> details;

    @ProtobufIndex(index = 1)
    public boolean isHit;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public User user;
    public static ProtobufAdapter<ProfileEditInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileEditInfo>() { // from class: com.p1.mobile.putong.core.data.ProfileEditInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileEditInfo profileEditInfo) {
            int iB = CodedOutputByteBufferNano.b(1, profileEditInfo.isHit);
            User user = profileEditInfo.user;
            if (user != null) {
                iB += CodedOutputByteBufferNano.l(2, user, User.PROTOBUF_ADAPTER);
            }
            List<DetectText> list = profileEditInfo.details;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(3, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) profileEditInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileEditInfo m14933parse(nb5 nb5Var) throws IOException {
            ProfileEditInfo profileEditInfo = new ProfileEditInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileEditInfo.user != null) {
                        break;
                    }
                    profileEditInfo.user = User.new_();
                    break;
                }
                if (iU == 8) {
                    profileEditInfo.isHit = nb5Var.g();
                } else if (iU == 18) {
                    profileEditInfo.user = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (profileEditInfo.user != null) {
                            break;
                        }
                        profileEditInfo.user = User.new_();
                        return profileEditInfo;
                    }
                    profileEditInfo.details = (List) nb5Var.l(DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return profileEditInfo;
        }

        public void serialize(ProfileEditInfo profileEditInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, profileEditInfo.isHit);
            User user = profileEditInfo.user;
            if (user != null) {
                codedOutputByteBufferNano.K(2, user, User.PROTOBUF_ADAPTER);
            }
            List<DetectText> list = profileEditInfo.details;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfileEditInfo> JSON_ADAPTER = new ObjectJsonAdapter<ProfileEditInfo>() { // from class: com.p1.mobile.putong.core.data.ProfileEditInfo.2
        public Class getDataClass() {
            return ProfileEditInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileEditInfo m14934newInstance() {
            return new ProfileEditInfo();
        }

        public boolean parseField(ProfileEditInfo profileEditInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "user":
                    profileEditInfo.user = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isHit":
                    profileEditInfo.isHit = jsonParser.getValueAsBoolean();
                    return true;
                case "details":
                    profileEditInfo.details = JsonAdapter.parseArray(jsonParser, DetectText.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileEditInfo profileEditInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "user":
                case "isHit":
                case "details":
                    return true;
                default:
                    return super.parseFieldCheck(profileEditInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ProfileEditInfo profileEditInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isHit", profileEditInfo.isHit);
            if (profileEditInfo.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(profileEditInfo.user, jsonGenerator, true);
            }
            if (profileEditInfo.details != null) {
                jsonGenerator.writeFieldName("details");
                JsonAdapter.serializeArray(profileEditInfo.details, jsonGenerator, DetectText.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileEditInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileEditInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileEditInfo new_() {
        ProfileEditInfo profileEditInfo = new ProfileEditInfo();
        profileEditInfo.nullCheck();
        return profileEditInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileEditInfo m14932clone() {
        ProfileEditInfo profileEditInfo = new ProfileEditInfo();
        profileEditInfo.isHit = this.isHit;
        User user = this.user;
        if (user != null) {
            profileEditInfo.user = user.clone();
        }
        List<DetectText> list = this.details;
        if (list != null) {
            profileEditInfo.details = ValueObject.util_map(list, new w9j() { // from class: l.qj90
                public final Object call(Object obj) {
                    return ((DetectText) obj).clone();
                }
            });
        }
        return profileEditInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileEditInfo)) {
            return false;
        }
        ProfileEditInfo profileEditInfo = (ProfileEditInfo) obj;
        return this.isHit == profileEditInfo.isHit && ValueObject.util_equals(this.user, profileEditInfo.user) && ValueObject.util_equals(this.details, profileEditInfo.details);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.isHit ? 1231 : 1237)) * 41;
        User user = this.user;
        int iHashCode = (i2 + (user != null ? user.hashCode() : 0)) * 41;
        List<DetectText> list = this.details;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.user == null) {
            this.user = User.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
