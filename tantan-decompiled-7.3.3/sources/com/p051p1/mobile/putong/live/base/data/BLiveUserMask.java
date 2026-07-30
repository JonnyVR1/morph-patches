package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserMask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserMask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserMask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserMask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserMask.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserMask newInstance() {
            return new BLiveUserMask();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveUserMask bLiveUserMask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
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
                case -1016963242:
                    if (str.equals("userNameGradientColors")) {
                        b = 6;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 7;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 8;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 9;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 10;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 11;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 12;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 725755951:
                    if (str.equals("fakeType")) {
                        b = 14;
                    }
                    break;
                case 1801409804:
                    if (str.equals("originUserId")) {
                        b = 15;
                    }
                    break;
                case 2059101732:
                    if (str.equals("isFresh")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveUserMask.avatarResourceType = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveUserMask.profileConfig = BLiveMaskProfileConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveUserMask.avatar = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveUserMask.avatarConfig = BLiveMaskAvatarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveUserMask.fakeId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveUserMask.gender = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveUserMask.userNameGradientColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveUserMask.status = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveUserMask.userId = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveUserMask.f45320id = jsonParser.getValueAsString();
                    return false;
                case 10:
                    bLiveUserMask.icon = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveUserMask.name = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveUserMask.type = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveUserMask.color = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveUserMask.fakeType = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveUserMask.originUserId = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveUserMask.isFresh = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserMask bLiveUserMask, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserMask.f45320id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveUserMask.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveUserMask.fakeId;
            if (str3 != null) {
                jsonGenerator.writeStringField("fakeId", str3);
            }
            String str4 = bLiveUserMask.originUserId;
            if (str4 != null) {
                jsonGenerator.writeStringField("originUserId", str4);
            }
            String str5 = bLiveUserMask.type;
            if (str5 != null) {
                jsonGenerator.writeStringField("type", str5);
            }
            String str6 = bLiveUserMask.fakeType;
            if (str6 != null) {
                jsonGenerator.writeStringField("fakeType", str6);
            }
            String str7 = bLiveUserMask.name;
            if (str7 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str7);
            }
            String str8 = bLiveUserMask.avatar;
            if (str8 != null) {
                jsonGenerator.writeStringField("avatar", str8);
            }
            String str9 = bLiveUserMask.status;
            if (str9 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str9);
            }
            String str10 = bLiveUserMask.color;
            if (str10 != null) {
                jsonGenerator.writeStringField("color", str10);
            }
            String str11 = bLiveUserMask.gender;
            if (str11 != null) {
                jsonGenerator.writeStringField("gender", str11);
            }
            String str12 = bLiveUserMask.icon;
            if (str12 != null) {
                jsonGenerator.writeStringField("icon", str12);
            }
            jsonGenerator.writeBooleanField("isFresh", bLiveUserMask.isFresh);
            if (bLiveUserMask.avatarConfig != null) {
                jsonGenerator.writeFieldName("avatarConfig");
                BLiveMaskAvatarConfig.JSON_ADAPTER.serialize(bLiveUserMask.avatarConfig, jsonGenerator, true);
            }
            if (bLiveUserMask.profileConfig != null) {
                jsonGenerator.writeFieldName("profileConfig");
                BLiveMaskProfileConfig.JSON_ADAPTER.serialize(bLiveUserMask.profileConfig, jsonGenerator, true);
            }
            String str13 = bLiveUserMask.avatarResourceType;
            if (str13 != null) {
                jsonGenerator.writeStringField("avatarResourceType", str13);
            }
            if (bLiveUserMask.userNameGradientColors != null) {
                jsonGenerator.writeFieldName("userNameGradientColors");
                JsonAdapter.serializeArray(bLiveUserMask.userNameGradientColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserMask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveusermask";

    @NonNull
    @ProtobufIndex(index = 8)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveMaskAvatarConfig avatarConfig;

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
    public String f45320id;

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
    public BLiveMaskProfileConfig profileConfig;

    @NonNull
    @ProtobufIndex(index = 9)
    public String status;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<String> userNameGradientColors;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69501a(String str) {
        return str;
    }

    public static BLiveUserMask new_() {
        BLiveUserMask bLiveUserMask = new BLiveUserMask();
        bLiveUserMask.nullCheck();
        return bLiveUserMask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserMask mo225055clone() {
        BLiveUserMask bLiveUserMask = new BLiveUserMask();
        bLiveUserMask.f45320id = this.f45320id;
        bLiveUserMask.userId = this.userId;
        bLiveUserMask.fakeId = this.fakeId;
        bLiveUserMask.originUserId = this.originUserId;
        bLiveUserMask.type = this.type;
        bLiveUserMask.fakeType = this.fakeType;
        bLiveUserMask.name = this.name;
        bLiveUserMask.avatar = this.avatar;
        bLiveUserMask.status = this.status;
        bLiveUserMask.color = this.color;
        bLiveUserMask.gender = this.gender;
        bLiveUserMask.icon = this.icon;
        bLiveUserMask.isFresh = this.isFresh;
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = this.avatarConfig;
        if (bLiveMaskAvatarConfig != null) {
            bLiveUserMask.avatarConfig = bLiveMaskAvatarConfig.mo225055clone();
        }
        BLiveMaskProfileConfig bLiveMaskProfileConfig = this.profileConfig;
        if (bLiveMaskProfileConfig != null) {
            bLiveUserMask.profileConfig = bLiveMaskProfileConfig.mo225055clone();
        }
        bLiveUserMask.avatarResourceType = this.avatarResourceType;
        List<String> list = this.userNameGradientColors;
        if (list != null) {
            bLiveUserMask.userNameGradientColors = ValueObject.util_map(list, new qcj() { // from class: l.x72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveUserMask.m69501a((String) obj);
                }
            });
        }
        return bLiveUserMask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserMask)) {
            return false;
        }
        BLiveUserMask bLiveUserMask = (BLiveUserMask) obj;
        return ValueObject.util_equals(this.f45320id, bLiveUserMask.f45320id) && ValueObject.util_equals(this.userId, bLiveUserMask.userId) && ValueObject.util_equals(this.fakeId, bLiveUserMask.fakeId) && ValueObject.util_equals(this.originUserId, bLiveUserMask.originUserId) && ValueObject.util_equals(this.type, bLiveUserMask.type) && ValueObject.util_equals(this.fakeType, bLiveUserMask.fakeType) && ValueObject.util_equals(this.name, bLiveUserMask.name) && ValueObject.util_equals(this.avatar, bLiveUserMask.avatar) && ValueObject.util_equals(this.status, bLiveUserMask.status) && ValueObject.util_equals(this.color, bLiveUserMask.color) && ValueObject.util_equals(this.gender, bLiveUserMask.gender) && ValueObject.util_equals(this.icon, bLiveUserMask.icon) && this.isFresh == bLiveUserMask.isFresh && ValueObject.util_equals(this.avatarConfig, bLiveUserMask.avatarConfig) && ValueObject.util_equals(this.profileConfig, bLiveUserMask.profileConfig) && ValueObject.util_equals(this.avatarResourceType, bLiveUserMask.avatarResourceType) && ValueObject.util_equals(this.userNameGradientColors, bLiveUserMask.userNameGradientColors);
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
        String str = this.f45320id;
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
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = this.avatarConfig;
        int iHashCode13 = (iHashCode12 + (bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.hashCode() : 0)) * 41;
        BLiveMaskProfileConfig bLiveMaskProfileConfig = this.profileConfig;
        int iHashCode14 = (iHashCode13 + (bLiveMaskProfileConfig != null ? bLiveMaskProfileConfig.hashCode() : 0)) * 41;
        String str13 = this.avatarResourceType;
        int iHashCode15 = (iHashCode14 + (str13 != null ? str13.hashCode() : 0)) * 41;
        List<String> list = this.userNameGradientColors;
        int iHashCode16 = iHashCode15 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    public boolean isFemale() {
        return "female".equals(this.gender);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45320id == null) {
            this.f45320id = "";
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
            this.avatarConfig = BLiveMaskAvatarConfig.new_();
        }
        if (this.profileConfig == null) {
            this.profileConfig = BLiveMaskProfileConfig.new_();
        }
        if (this.avatarResourceType == null) {
            this.avatarResourceType = "";
        }
        if (this.userNameGradientColors == null) {
            this.userNameGradientColors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
