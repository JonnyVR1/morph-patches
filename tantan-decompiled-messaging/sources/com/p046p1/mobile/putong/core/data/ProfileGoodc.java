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
public class ProfileGoodc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "profilegoodc";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @NonNull
    @ProtobufIndex(index = 3)
    public ProfileGoodcInfoBadge info_badge;

    @NonNull
    @ProtobufIndex(index = 2)
    public ProfileGoodcNameBadge name_badge;

    @NonNull
    @ProtobufIndex(index = 4)
    public ProfileGoodcPhotoBadge photo_badge;
    public static ProtobufAdapter<ProfileGoodc> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfileGoodc>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodc.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfileGoodc profileGoodc) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, profileGoodc.enabled);
            ProfileGoodcNameBadge profileGoodcNameBadge = profileGoodc.name_badge;
            if (profileGoodcNameBadge != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, profileGoodcNameBadge, ProfileGoodcNameBadge.PROTOBUF_ADAPTER);
            }
            ProfileGoodcInfoBadge profileGoodcInfoBadge = profileGoodc.info_badge;
            if (profileGoodcInfoBadge != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(3, profileGoodcInfoBadge, ProfileGoodcInfoBadge.PROTOBUF_ADAPTER);
            }
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = profileGoodc.photo_badge;
            if (profileGoodcPhotoBadge != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, profileGoodcPhotoBadge, ProfileGoodcPhotoBadge.PROTOBUF_ADAPTER);
            }
            profileGoodc.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfileGoodc parse(nb5 nb5Var) throws IOException {
            ProfileGoodc profileGoodc = new ProfileGoodc();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 8) {
                    profileGoodc.enabled = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    profileGoodc.name_badge = (ProfileGoodcNameBadge) nb5Var.m158743l(ProfileGoodcNameBadge.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    profileGoodc.info_badge = (ProfileGoodcInfoBadge) nb5Var.m158743l(ProfileGoodcInfoBadge.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 34) {
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
                    profileGoodc.photo_badge = (ProfileGoodcPhotoBadge) nb5Var.m158743l(ProfileGoodcPhotoBadge.PROTOBUF_ADAPTER);
                }
            }
            return profileGoodc;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfileGoodc profileGoodc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, profileGoodc.enabled);
            ProfileGoodcNameBadge profileGoodcNameBadge = profileGoodc.name_badge;
            if (profileGoodcNameBadge != null) {
                codedOutputByteBufferNano.m17254K(2, profileGoodcNameBadge, ProfileGoodcNameBadge.PROTOBUF_ADAPTER);
            }
            ProfileGoodcInfoBadge profileGoodcInfoBadge = profileGoodc.info_badge;
            if (profileGoodcInfoBadge != null) {
                codedOutputByteBufferNano.m17254K(3, profileGoodcInfoBadge, ProfileGoodcInfoBadge.PROTOBUF_ADAPTER);
            }
            ProfileGoodcPhotoBadge profileGoodcPhotoBadge = profileGoodc.photo_badge;
            if (profileGoodcPhotoBadge != null) {
                codedOutputByteBufferNano.m17254K(4, profileGoodcPhotoBadge, ProfileGoodcPhotoBadge.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ProfileGoodc> JSON_ADAPTER = new ObjectJsonAdapter<ProfileGoodc>() { // from class: com.p1.mobile.putong.core.data.ProfileGoodc.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfileGoodc.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfileGoodc newInstance() {
            return new ProfileGoodc();
        }

        public boolean parseField(ProfileGoodc profileGoodc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enabled":
                    profileGoodc.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "info_badge":
                    profileGoodc.info_badge = ProfileGoodcInfoBadge.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name_badge":
                    profileGoodc.name_badge = ProfileGoodcNameBadge.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "photo_badge":
                    profileGoodc.photo_badge = ProfileGoodcPhotoBadge.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfileGoodc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfileGoodc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfileGoodc new_() {
        ProfileGoodc profileGoodc = new ProfileGoodc();
        profileGoodc.nullCheck();
        return profileGoodc;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfileGoodc mo223809clone() {
        ProfileGoodc profileGoodc = new ProfileGoodc();
        profileGoodc.enabled = this.enabled;
        ProfileGoodcNameBadge profileGoodcNameBadge = this.name_badge;
        if (profileGoodcNameBadge != null) {
            profileGoodc.name_badge = profileGoodcNameBadge.mo223809clone();
        }
        ProfileGoodcInfoBadge profileGoodcInfoBadge = this.info_badge;
        if (profileGoodcInfoBadge != null) {
            profileGoodc.info_badge = profileGoodcInfoBadge.mo223809clone();
        }
        ProfileGoodcPhotoBadge profileGoodcPhotoBadge = this.photo_badge;
        if (profileGoodcPhotoBadge != null) {
            profileGoodc.photo_badge = profileGoodcPhotoBadge.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
