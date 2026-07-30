package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSpecialFriendRelation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSpecialFriendRelation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSpecialFriendRelation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSpecialFriendRelation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSpecialFriendRelation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSpecialFriendRelation newInstance() {
            return new BLiveSpecialFriendRelation();
        }

        public boolean parseField(BLiveSpecialFriendRelation bLiveSpecialFriendRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isUnLocked":
                    bLiveSpecialFriendRelation.isUnLocked = jsonParser.getValueAsBoolean();
                    return true;
                case "schema":
                    bLiveSpecialFriendRelation.schema = jsonParser.getValueAsString();
                    return true;
                case "bgColor":
                    bLiveSpecialFriendRelation.bgColor = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveSpecialFriendRelation.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveSpecialFriendRelation.name = jsonParser.getValueAsString();
                    return true;
                case "level":
                    bLiveSpecialFriendRelation.level = jsonParser.getValueAsInt();
                    return true;
                case "otherUserAvatar":
                    bLiveSpecialFriendRelation.otherUserAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSpecialFriendRelation bLiveSpecialFriendRelation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isUnLocked", bLiveSpecialFriendRelation.isUnLocked);
            String str = bLiveSpecialFriendRelation.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveSpecialFriendRelation.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveSpecialFriendRelation.bgColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgColor", str3);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveSpecialFriendRelation.level);
            String str4 = bLiveSpecialFriendRelation.schema;
            if (str4 != null) {
                jsonGenerator.writeStringField("schema", str4);
            }
            String str5 = bLiveSpecialFriendRelation.otherUserAvatar;
            if (str5 != null) {
                jsonGenerator.writeStringField("otherUserAvatar", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSpecialFriendRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivespecialfriendrelation";

    @NonNull
    @ProtobufIndex(index = 7)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @ProtobufIndex(index = 1)
    public boolean isUnLocked;

    @ProtobufIndex(index = 4)
    public int level;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String otherUserAvatar;

    @NonNull
    @ProtobufIndex(index = 5)
    public String schema;

    public static BLiveSpecialFriendRelation new_() {
        BLiveSpecialFriendRelation bLiveSpecialFriendRelation = new BLiveSpecialFriendRelation();
        bLiveSpecialFriendRelation.nullCheck();
        return bLiveSpecialFriendRelation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSpecialFriendRelation mo225055clone() {
        BLiveSpecialFriendRelation bLiveSpecialFriendRelation = new BLiveSpecialFriendRelation();
        bLiveSpecialFriendRelation.isUnLocked = this.isUnLocked;
        bLiveSpecialFriendRelation.name = this.name;
        bLiveSpecialFriendRelation.icon = this.icon;
        bLiveSpecialFriendRelation.bgColor = this.bgColor;
        bLiveSpecialFriendRelation.level = this.level;
        bLiveSpecialFriendRelation.schema = this.schema;
        bLiveSpecialFriendRelation.otherUserAvatar = this.otherUserAvatar;
        return bLiveSpecialFriendRelation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSpecialFriendRelation)) {
            return false;
        }
        BLiveSpecialFriendRelation bLiveSpecialFriendRelation = (BLiveSpecialFriendRelation) obj;
        return this.isUnLocked == bLiveSpecialFriendRelation.isUnLocked && ValueObject.util_equals(this.name, bLiveSpecialFriendRelation.name) && ValueObject.util_equals(this.icon, bLiveSpecialFriendRelation.icon) && ValueObject.util_equals(this.bgColor, bLiveSpecialFriendRelation.bgColor) && this.level == bLiveSpecialFriendRelation.level && ValueObject.util_equals(this.schema, bLiveSpecialFriendRelation.schema) && ValueObject.util_equals(this.otherUserAvatar, bLiveSpecialFriendRelation.otherUserAvatar);
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
        int i2 = ((i * 41) + (this.isUnLocked ? 1231 : 1237)) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bgColor;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.level) * 41;
        String str4 = this.schema;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.otherUserAvatar;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.otherUserAvatar == null) {
            this.otherUserAvatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
