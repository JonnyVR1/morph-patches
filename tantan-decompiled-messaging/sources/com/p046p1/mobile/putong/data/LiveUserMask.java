package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveUserMask extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveusermask";

    @NonNull
    @ProtobufIndex(index = 8)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 14)
    public LiveAvatarConfig avatarConfig;

    @NonNull
    @ProtobufIndex(index = 16)
    public String avatarResourceType;

    @NonNull
    @ProtobufIndex(index = 10)
    public String color;

    @NonNull
    @ProtobufIndex(index = 3)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String fakeType;

    @NonNull
    @ProtobufIndex(index = 11)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 12)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38778id;

    @ProtobufIndex(index = 13)
    public boolean isFresh;

    @NonNull
    @ProtobufIndex(index = 7)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String originUserId;

    @NonNull
    @ProtobufIndex(index = 15)
    public LiveProfileConfig profileConfig;

    @NonNull
    @ProtobufIndex(index = 9)
    public String status;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;
    public static ProtobufAdapter<LiveUserMask> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserMask>() { // from class: com.p1.mobile.putong.data.LiveUserMask.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveUserMask liveUserMask) {
            String str = liveUserMask.f38778id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveUserMask.userId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = liveUserMask.fakeId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = liveUserMask.originUserId;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = liveUserMask.type;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = liveUserMask.fakeType;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = liveUserMask.name;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = liveUserMask.avatar;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = liveUserMask.status;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            String str10 = liveUserMask.color;
            if (str10 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(10, str10);
            }
            String str11 = liveUserMask.gender;
            if (str11 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(11, str11);
            }
            String str12 = liveUserMask.icon;
            if (str12 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(12, str12);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(13, liveUserMask.isFresh);
            LiveAvatarConfig liveAvatarConfig = liveUserMask.avatarConfig;
            if (liveAvatarConfig != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(14, liveAvatarConfig, LiveAvatarConfig.PROTOBUF_ADAPTER);
            }
            LiveProfileConfig liveProfileConfig = liveUserMask.profileConfig;
            if (liveProfileConfig != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(15, liveProfileConfig, LiveProfileConfig.PROTOBUF_ADAPTER);
            }
            String str13 = liveUserMask.avatarResourceType;
            if (str13 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(16, str13);
            }
            liveUserMask.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveUserMask parse(nb5 nb5Var) throws IOException {
            LiveUserMask liveUserMask = new LiveUserMask();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (liveUserMask.f38778id == null) {
                            liveUserMask.f38778id = "";
                        }
                        if (liveUserMask.userId == null) {
                            liveUserMask.userId = "";
                        }
                        if (liveUserMask.fakeId == null) {
                            liveUserMask.fakeId = "";
                        }
                        if (liveUserMask.originUserId == null) {
                            liveUserMask.originUserId = "";
                        }
                        if (liveUserMask.type == null) {
                            liveUserMask.type = "";
                        }
                        if (liveUserMask.fakeType == null) {
                            liveUserMask.fakeType = "";
                        }
                        if (liveUserMask.name == null) {
                            liveUserMask.name = "";
                        }
                        if (liveUserMask.avatar == null) {
                            liveUserMask.avatar = "";
                        }
                        if (liveUserMask.status == null) {
                            liveUserMask.status = "";
                        }
                        if (liveUserMask.color == null) {
                            liveUserMask.color = "";
                        }
                        if (liveUserMask.gender == null) {
                            liveUserMask.gender = "";
                        }
                        if (liveUserMask.icon == null) {
                            liveUserMask.icon = "";
                        }
                        if (liveUserMask.avatarConfig == null) {
                            liveUserMask.avatarConfig = LiveAvatarConfig.new_();
                        }
                        if (liveUserMask.profileConfig == null) {
                            liveUserMask.profileConfig = LiveProfileConfig.new_();
                        }
                        if (liveUserMask.avatarResourceType == null) {
                            liveUserMask.avatarResourceType = "";
                        }
                        break;
                    case 10:
                        liveUserMask.f38778id = nb5Var.m158750s();
                        continue;
                    case 18:
                        liveUserMask.userId = nb5Var.m158750s();
                        continue;
                    case 26:
                        liveUserMask.fakeId = nb5Var.m158750s();
                        continue;
                    case 34:
                        liveUserMask.originUserId = nb5Var.m158750s();
                        continue;
                    case 42:
                        liveUserMask.type = nb5Var.m158750s();
                        continue;
                    case 50:
                        liveUserMask.fakeType = nb5Var.m158750s();
                        continue;
                    case 58:
                        liveUserMask.name = nb5Var.m158750s();
                        continue;
                    case 66:
                        liveUserMask.avatar = nb5Var.m158750s();
                        continue;
                    case 74:
                        liveUserMask.status = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        liveUserMask.color = nb5Var.m158750s();
                        continue;
                    case 90:
                        liveUserMask.gender = nb5Var.m158750s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        liveUserMask.icon = nb5Var.m158750s();
                        continue;
                    case 104:
                        liveUserMask.isFresh = nb5Var.m158738g();
                        continue;
                    case 114:
                        liveUserMask.avatarConfig = (LiveAvatarConfig) nb5Var.m158743l(LiveAvatarConfig.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        liveUserMask.profileConfig = (LiveProfileConfig) nb5Var.m158743l(LiveProfileConfig.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        liveUserMask.avatarResourceType = nb5Var.m158750s();
                        continue;
                    default:
                        if (liveUserMask.f38778id == null) {
                            liveUserMask.f38778id = "";
                        }
                        if (liveUserMask.userId == null) {
                            liveUserMask.userId = "";
                        }
                        if (liveUserMask.fakeId == null) {
                            liveUserMask.fakeId = "";
                        }
                        if (liveUserMask.originUserId == null) {
                            liveUserMask.originUserId = "";
                        }
                        if (liveUserMask.type == null) {
                            liveUserMask.type = "";
                        }
                        if (liveUserMask.fakeType == null) {
                            liveUserMask.fakeType = "";
                        }
                        if (liveUserMask.name == null) {
                            liveUserMask.name = "";
                        }
                        if (liveUserMask.avatar == null) {
                            liveUserMask.avatar = "";
                        }
                        if (liveUserMask.status == null) {
                            liveUserMask.status = "";
                        }
                        if (liveUserMask.color == null) {
                            liveUserMask.color = "";
                        }
                        if (liveUserMask.gender == null) {
                            liveUserMask.gender = "";
                        }
                        if (liveUserMask.icon == null) {
                            liveUserMask.icon = "";
                        }
                        if (liveUserMask.avatarConfig == null) {
                            liveUserMask.avatarConfig = LiveAvatarConfig.new_();
                        }
                        if (liveUserMask.profileConfig == null) {
                            liveUserMask.profileConfig = LiveProfileConfig.new_();
                        }
                        if (liveUserMask.avatarResourceType == null) {
                            liveUserMask.avatarResourceType = "";
                            return liveUserMask;
                        }
                        break;
                }
            }
            return liveUserMask;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveUserMask liveUserMask, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveUserMask.f38778id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveUserMask.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = liveUserMask.fakeId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = liveUserMask.originUserId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = liveUserMask.type;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = liveUserMask.fakeType;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = liveUserMask.name;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = liveUserMask.avatar;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = liveUserMask.status;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
            String str10 = liveUserMask.color;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(10, str10);
            }
            String str11 = liveUserMask.gender;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(11, str11);
            }
            String str12 = liveUserMask.icon;
            if (str12 != null) {
                codedOutputByteBufferNano.m17261R(12, str12);
            }
            codedOutputByteBufferNano.m17244A(13, liveUserMask.isFresh);
            LiveAvatarConfig liveAvatarConfig = liveUserMask.avatarConfig;
            if (liveAvatarConfig != null) {
                codedOutputByteBufferNano.m17254K(14, liveAvatarConfig, LiveAvatarConfig.PROTOBUF_ADAPTER);
            }
            LiveProfileConfig liveProfileConfig = liveUserMask.profileConfig;
            if (liveProfileConfig != null) {
                codedOutputByteBufferNano.m17254K(15, liveProfileConfig, LiveProfileConfig.PROTOBUF_ADAPTER);
            }
            String str13 = liveUserMask.avatarResourceType;
            if (str13 != null) {
                codedOutputByteBufferNano.m17261R(16, str13);
            }
        }
    };
    public static JsonAdapter<LiveUserMask> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserMask>() { // from class: com.p1.mobile.putong.data.LiveUserMask.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveUserMask.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveUserMask newInstance() {
            return new LiveUserMask();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(LiveUserMask liveUserMask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1752635295:
                    if (str.equals("avatarResourceType")) {
                        b = 0;
                    }
                    break;
                case -1520085429:
                    if (str.equals("profileConfig")) {
                        b = 1;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 2;
                    }
                    break;
                case -1374877189:
                    if (str.equals("avatarConfig")) {
                        b = 3;
                    }
                    break;
                case -1281925296:
                    if (str.equals("fakeId")) {
                        b = 4;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 9;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 10;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 11;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        b = 12;
                    }
                    break;
                case 725755951:
                    if (str.equals("fakeType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1801409804:
                    if (str.equals("originUserId")) {
                        b = 14;
                    }
                    break;
                case 2059101732:
                    if (str.equals("isFresh")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    liveUserMask.avatarResourceType = jsonParser.getValueAsString();
                    return true;
                case 1:
                    liveUserMask.profileConfig = LiveProfileConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    liveUserMask.avatar = jsonParser.getValueAsString();
                    return true;
                case 3:
                    liveUserMask.avatarConfig = LiveAvatarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    liveUserMask.fakeId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    liveUserMask.gender = jsonParser.getValueAsString();
                    return true;
                case 6:
                    liveUserMask.status = jsonParser.getValueAsString();
                    return true;
                case 7:
                    liveUserMask.userId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    liveUserMask.f38778id = jsonParser.getValueAsString();
                    return false;
                case 9:
                    liveUserMask.icon = jsonParser.getValueAsString();
                    return true;
                case 10:
                    liveUserMask.name = jsonParser.getValueAsString();
                    return true;
                case 11:
                    liveUserMask.type = jsonParser.getValueAsString();
                    return true;
                case 12:
                    liveUserMask.color = jsonParser.getValueAsString();
                    return true;
                case 13:
                    liveUserMask.fakeType = jsonParser.getValueAsString();
                    return true;
                case 14:
                    liveUserMask.originUserId = jsonParser.getValueAsString();
                    return true;
                case 15:
                    liveUserMask.isFresh = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(LiveUserMask liveUserMask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1752635295:
                    if (str.equals("avatarResourceType")) {
                        b = 0;
                    }
                    break;
                case -1520085429:
                    if (str.equals("profileConfig")) {
                        b = 1;
                    }
                    break;
                case -1405959847:
                    if (str.equals("avatar")) {
                        b = 2;
                    }
                    break;
                case -1374877189:
                    if (str.equals("avatarConfig")) {
                        b = 3;
                    }
                    break;
                case -1281925296:
                    if (str.equals("fakeId")) {
                        b = 4;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 9;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 10;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 11;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        b = 12;
                    }
                    break;
                case 725755951:
                    if (str.equals("fakeType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1801409804:
                    if (str.equals("originUserId")) {
                        b = 14;
                    }
                    break;
                case 2059101732:
                    if (str.equals("isFresh")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                case 8:
                    return false;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return super.parseFieldCheck(liveUserMask, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserMask liveUserMask, JsonGenerator jsonGenerator) throws IOException {
            String str = liveUserMask.f38778id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveUserMask.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = liveUserMask.fakeId;
            if (str3 != null) {
                jsonGenerator.writeStringField("fakeId", str3);
            }
            String str4 = liveUserMask.originUserId;
            if (str4 != null) {
                jsonGenerator.writeStringField("originUserId", str4);
            }
            String str5 = liveUserMask.type;
            if (str5 != null) {
                jsonGenerator.writeStringField("type", str5);
            }
            String str6 = liveUserMask.fakeType;
            if (str6 != null) {
                jsonGenerator.writeStringField("fakeType", str6);
            }
            String str7 = liveUserMask.name;
            if (str7 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str7);
            }
            String str8 = liveUserMask.avatar;
            if (str8 != null) {
                jsonGenerator.writeStringField("avatar", str8);
            }
            String str9 = liveUserMask.status;
            if (str9 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str9);
            }
            String str10 = liveUserMask.color;
            if (str10 != null) {
                jsonGenerator.writeStringField("color", str10);
            }
            String str11 = liveUserMask.gender;
            if (str11 != null) {
                jsonGenerator.writeStringField("gender", str11);
            }
            String str12 = liveUserMask.icon;
            if (str12 != null) {
                jsonGenerator.writeStringField("icon", str12);
            }
            jsonGenerator.writeBooleanField("isFresh", liveUserMask.isFresh);
            if (liveUserMask.avatarConfig != null) {
                jsonGenerator.writeFieldName("avatarConfig");
                LiveAvatarConfig.JSON_ADAPTER.serialize(liveUserMask.avatarConfig, jsonGenerator, true);
            }
            if (liveUserMask.profileConfig != null) {
                jsonGenerator.writeFieldName("profileConfig");
                LiveProfileConfig.JSON_ADAPTER.serialize(liveUserMask.profileConfig, jsonGenerator, true);
            }
            String str13 = liveUserMask.avatarResourceType;
            if (str13 != null) {
                jsonGenerator.writeStringField("avatarResourceType", str13);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserMask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveUserMask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveUserMask new_() {
        LiveUserMask liveUserMask = new LiveUserMask();
        liveUserMask.nullCheck();
        return liveUserMask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveUserMask mo223809clone() {
        LiveUserMask liveUserMask = new LiveUserMask();
        liveUserMask.f38778id = this.f38778id;
        liveUserMask.userId = this.userId;
        liveUserMask.fakeId = this.fakeId;
        liveUserMask.originUserId = this.originUserId;
        liveUserMask.type = this.type;
        liveUserMask.fakeType = this.fakeType;
        liveUserMask.name = this.name;
        liveUserMask.avatar = this.avatar;
        liveUserMask.status = this.status;
        liveUserMask.color = this.color;
        liveUserMask.gender = this.gender;
        liveUserMask.icon = this.icon;
        liveUserMask.isFresh = this.isFresh;
        LiveAvatarConfig liveAvatarConfig = this.avatarConfig;
        if (liveAvatarConfig != null) {
            liveUserMask.avatarConfig = liveAvatarConfig.mo223809clone();
        }
        LiveProfileConfig liveProfileConfig = this.profileConfig;
        if (liveProfileConfig != null) {
            liveUserMask.profileConfig = liveProfileConfig.mo223809clone();
        }
        liveUserMask.avatarResourceType = this.avatarResourceType;
        return liveUserMask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveUserMask)) {
            return false;
        }
        LiveUserMask liveUserMask = (LiveUserMask) obj;
        return ValueObject.util_equals(this.f38778id, liveUserMask.f38778id) && ValueObject.util_equals(this.userId, liveUserMask.userId) && ValueObject.util_equals(this.fakeId, liveUserMask.fakeId) && ValueObject.util_equals(this.originUserId, liveUserMask.originUserId) && ValueObject.util_equals(this.type, liveUserMask.type) && ValueObject.util_equals(this.fakeType, liveUserMask.fakeType) && ValueObject.util_equals(this.name, liveUserMask.name) && ValueObject.util_equals(this.avatar, liveUserMask.avatar) && ValueObject.util_equals(this.status, liveUserMask.status) && ValueObject.util_equals(this.color, liveUserMask.color) && ValueObject.util_equals(this.gender, liveUserMask.gender) && ValueObject.util_equals(this.icon, liveUserMask.icon) && this.isFresh == liveUserMask.isFresh && ValueObject.util_equals(this.avatarConfig, liveUserMask.avatarConfig) && ValueObject.util_equals(this.profileConfig, liveUserMask.profileConfig) && ValueObject.util_equals(this.avatarResourceType, liveUserMask.avatarResourceType);
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
        int i2 = i * 41;
        String str = this.f38778id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.fakeId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.originUserId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.type;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.fakeType;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.name;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.avatar;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.status;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.color;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.gender;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.icon;
        int iHashCode12 = (((iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41) + (this.isFresh ? 1231 : 1237)) * 41;
        LiveAvatarConfig liveAvatarConfig = this.avatarConfig;
        int iHashCode13 = (iHashCode12 + (liveAvatarConfig != null ? liveAvatarConfig.hashCode() : 0)) * 41;
        LiveProfileConfig liveProfileConfig = this.profileConfig;
        int iHashCode14 = (iHashCode13 + (liveProfileConfig != null ? liveProfileConfig.hashCode() : 0)) * 41;
        String str13 = this.avatarResourceType;
        int iHashCode15 = iHashCode14 + (str13 != null ? str13.hashCode() : 0);
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    public boolean isFemale() {
        return "female".equals(this.gender);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38778id == null) {
            this.f38778id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
        if (this.originUserId == null) {
            this.originUserId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.fakeType == null) {
            this.fakeType = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.avatarConfig == null) {
            this.avatarConfig = LiveAvatarConfig.new_();
        }
        if (this.profileConfig == null) {
            this.profileConfig = LiveProfileConfig.new_();
        }
        if (this.avatarResourceType == null) {
            this.avatarResourceType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
