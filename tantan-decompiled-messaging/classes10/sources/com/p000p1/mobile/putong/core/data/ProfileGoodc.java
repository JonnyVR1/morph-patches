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
public class ProfileGoodc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodc";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ProfileGoodcInfoBadge info_badge;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ProfileGoodcNameBadge name_badge;

    @NonNull
    @ProtobufIndex(index = 4)
    public ProfileGoodcPhotoBadge photo_badge;
    public static ProtobufAdapter<ProfileGoodc> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodc>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodc.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfileGoodc profileGoodc) {
            int iB = CodedOutputByteBufferNano.b(1, profileGoodc.enabled);
            ProfileGoodcNameBadge profileGoodcNameBadge = profileGoodc.name_badge;
            if (profileGoodcNameBadge != null) {
                iB += CodedOutputByteBufferNano.l(2, profileGoodcNameBadge, ProfileGoodcNameBadge.PROTOBUF_ADAPTER);
            }
            ProfileGoodcInfoBadge profileGoodcInfoBadge = profileGoodc.info_badge;
            if (profileGoodcInfoBadge != null) {
                iB += CodedOutputByteBufferNano.l(3, profileGoodcInfoBadge, ProfileGoodcInfoBadge.PROTOBUF_ADAPTER);
            }
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = profileGoodc.photo_badge;
            if (profileGoodcPhotoBadge != null) {
                iB += CodedOutputByteBufferNano.l(4, profileGoodcPhotoBadge, ProfileGoodcPhotoBadge.PROTOBUF_ADAPTER);
            }
            ((MessageNano) profileGoodc).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfileGoodc m14937parse(nb5 nb5Var) throws IOException {
            ProfileGoodc profileGoodc = new ProfileGoodc();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (profileGoodc.name_badge == null) {
                        profileGoodc.name_badge = ProfileGoodcNameBadge.new_();
                    }
                    if (profileGoodc.info_badge == null) {
                        profileGoodc.info_badge = ProfileGoodcInfoBadge.new_();
                    }
                    if (profileGoodc.photo_badge != null) {
                        break;
                    }
                    profileGoodc.photo_badge = ProfileGoodcPhotoBadge.new_();
                    break;
                }
                if (iU == 8) {
                    profileGoodc.enabled = nb5Var.g();
                } else if (iU == 18) {
                    profileGoodc.name_badge = (ProfileGoodcNameBadge) nb5Var.l(ProfileGoodcNameBadge.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    profileGoodc.info_badge = (ProfileGoodcInfoBadge) nb5Var.l(ProfileGoodcInfoBadge.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (profileGoodc.name_badge == null) {
                            profileGoodc.name_badge = ProfileGoodcNameBadge.new_();
                        }
                        if (profileGoodc.info_badge == null) {
                            profileGoodc.info_badge = ProfileGoodcInfoBadge.new_();
                        }
                        if (profileGoodc.photo_badge != null) {
                            break;
                        }
                        profileGoodc.photo_badge = ProfileGoodcPhotoBadge.new_();
                        return profileGoodc;
                    }
                    profileGoodc.photo_badge = (ProfileGoodcPhotoBadge) nb5Var.l(ProfileGoodcPhotoBadge.PROTOBUF_ADAPTER);
                }
            }
            return profileGoodc;
        }

        public void serialize(ProfileGoodc profileGoodc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, profileGoodc.enabled);
            ProfileGoodcNameBadge profileGoodcNameBadge = profileGoodc.name_badge;
            if (profileGoodcNameBadge != null) {
                codedOutputByteBufferNano.K(2, profileGoodcNameBadge, ProfileGoodcNameBadge.PROTOBUF_ADAPTER);
            }
            ProfileGoodcInfoBadge profileGoodcInfoBadge = profileGoodc.info_badge;
            if (profileGoodcInfoBadge != null) {
                codedOutputByteBufferNano.K(3, profileGoodcInfoBadge, ProfileGoodcInfoBadge.PROTOBUF_ADAPTER);
            }
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = profileGoodc.photo_badge;
            if (profileGoodcPhotoBadge != null) {
                codedOutputByteBufferNano.K(4, profileGoodcPhotoBadge, ProfileGoodcPhotoBadge.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileGoodc> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodc>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodc.2
        public Class getDataClass() {
            return ProfileGoodc.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfileGoodc m14938newInstance() {
            return new ProfileGoodc();
        }

        public boolean parseField(ProfileGoodc profileGoodc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enabled":
                    profileGoodc.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "info_badge":
                    profileGoodc.info_badge = (ProfileGoodcInfoBadge) ProfileGoodcInfoBadge.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name_badge":
                    profileGoodc.name_badge = (ProfileGoodcNameBadge) ProfileGoodcNameBadge.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "photo_badge":
                    profileGoodc.photo_badge = (ProfileGoodcPhotoBadge) ProfileGoodcPhotoBadge.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ProfileGoodc profileGoodc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enabled":
                case "info_badge":
                case "name_badge":
                case "photo_badge":
                    return true;
                default:
                    return super.parseFieldCheck(profileGoodc, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ProfileGoodc profileGoodc, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", profileGoodc.enabled);
            if (profileGoodc.name_badge != null) {
                jsonGenerator.writeFieldName("name_badge");
                ProfileGoodcNameBadge.JSON_ADAPTER.serialize(profileGoodc.name_badge, jsonGenerator, true);
            }
            if (profileGoodc.info_badge != null) {
                jsonGenerator.writeFieldName("info_badge");
                ProfileGoodcInfoBadge.JSON_ADAPTER.serialize(profileGoodc.info_badge, jsonGenerator, true);
            }
            if (profileGoodc.photo_badge != null) {
                jsonGenerator.writeFieldName("photo_badge");
                ProfileGoodcPhotoBadge.JSON_ADAPTER.serialize(profileGoodc.photo_badge, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodc new_() {
        ProfileGoodc profileGoodc = new ProfileGoodc();
        profileGoodc.nullCheck();
        return profileGoodc;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfileGoodc m14936clone() {
        ProfileGoodc profileGoodc = new ProfileGoodc();
        profileGoodc.enabled = this.enabled;
        ProfileGoodcNameBadge profileGoodcNameBadge = this.name_badge;
        if (profileGoodcNameBadge != null) {
            profileGoodc.name_badge = profileGoodcNameBadge.m14952clone();
        }
        ProfileGoodcInfoBadge profileGoodcInfoBadge = this.info_badge;
        if (profileGoodcInfoBadge != null) {
            profileGoodc.info_badge = profileGoodcInfoBadge.m14948clone();
        }
        ProfileGoodcPhotoBadge profileGoodcPhotoBadge = this.photo_badge;
        if (profileGoodcPhotoBadge != null) {
            profileGoodc.photo_badge = profileGoodcPhotoBadge.m14960clone();
        }
        return profileGoodc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileGoodc)) {
            return false;
        }
        ProfileGoodc profileGoodc = (ProfileGoodc) obj;
        return this.enabled == profileGoodc.enabled && ValueObject.util_equals(this.name_badge, profileGoodc.name_badge) && ValueObject.util_equals(this.info_badge, profileGoodc.info_badge) && ValueObject.util_equals(this.photo_badge, profileGoodc.photo_badge);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enabled ? 1231 : 1237)) * 41;
        ProfileGoodcNameBadge profileGoodcNameBadge = this.name_badge;
        int iHashCode = (i2 + (profileGoodcNameBadge != null ? profileGoodcNameBadge.hashCode() : 0)) * 41;
        ProfileGoodcInfoBadge profileGoodcInfoBadge = this.info_badge;
        int iHashCode2 = (iHashCode + (profileGoodcInfoBadge != null ? profileGoodcInfoBadge.hashCode() : 0)) * 41;
        ProfileGoodcPhotoBadge profileGoodcPhotoBadge = this.photo_badge;
        int iHashCode3 = iHashCode2 + (profileGoodcPhotoBadge != null ? profileGoodcPhotoBadge.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.name_badge == null) {
            this.name_badge = ProfileGoodcNameBadge.new_();
        }
        if (this.info_badge == null) {
            this.info_badge = ProfileGoodcInfoBadge.new_();
        }
        if (this.photo_badge == null) {
            this.photo_badge = ProfileGoodcPhotoBadge.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
