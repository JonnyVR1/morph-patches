package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserUpgrade extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserUpgrade> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserUpgrade>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserUpgrade.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserUpgrade.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserUpgrade newInstance() {
            return new BLiveUserUpgrade();
        }

        public boolean parseField(BLiveUserUpgrade bLiveUserUpgrade, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "superGrade":
                    bLiveUserUpgrade.superGrade = jsonParser.getValueAsLong();
                    return true;
                case "avatarUrl":
                    bLiveUserUpgrade.avatarUrl = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveUserUpgrade.userName = jsonParser.getValueAsString();
                    return true;
                case "uid":
                    bLiveUserUpgrade.uid = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveUserUpgrade.grade = jsonParser.getValueAsLong();
                    return true;
                case "liveUserLevel":
                    bLiveUserUpgrade.liveUserLevel = BLiveUserLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserUpgrade bLiveUserUpgrade, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserUpgrade.uid;
            if (str != null) {
                jsonGenerator.writeStringField(Oauth2AccessToken.KEY_UID, str);
            }
            String str2 = bLiveUserUpgrade.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveUserUpgrade.avatarUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatarUrl", str3);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveUserUpgrade.grade);
            if (bLiveUserUpgrade.liveUserLevel != null) {
                jsonGenerator.writeFieldName("liveUserLevel");
                BLiveUserLevel.JSON_ADAPTER.serialize(bLiveUserUpgrade.liveUserLevel, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("superGrade", bLiveUserUpgrade.superGrade);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserUpgrade) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserupgrade";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatarUrl;

    @ProtobufIndex(index = 4)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveUserLevel liveUserLevel;

    @ProtobufIndex(index = 6)
    public long superGrade;

    @NonNull
    @ProtobufIndex(index = 1)
    public String uid;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveUserUpgrade new_() {
        BLiveUserUpgrade bLiveUserUpgrade = new BLiveUserUpgrade();
        bLiveUserUpgrade.nullCheck();
        return bLiveUserUpgrade;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserUpgrade mo225055clone() {
        BLiveUserUpgrade bLiveUserUpgrade = new BLiveUserUpgrade();
        bLiveUserUpgrade.uid = this.uid;
        bLiveUserUpgrade.userName = this.userName;
        bLiveUserUpgrade.avatarUrl = this.avatarUrl;
        bLiveUserUpgrade.grade = this.grade;
        BLiveUserLevel bLiveUserLevel = this.liveUserLevel;
        if (bLiveUserLevel != null) {
            bLiveUserUpgrade.liveUserLevel = bLiveUserLevel.mo225055clone();
        }
        bLiveUserUpgrade.superGrade = this.superGrade;
        return bLiveUserUpgrade;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserUpgrade)) {
            return false;
        }
        BLiveUserUpgrade bLiveUserUpgrade = (BLiveUserUpgrade) obj;
        return ValueObject.util_equals(this.uid, bLiveUserUpgrade.uid) && ValueObject.util_equals(this.userName, bLiveUserUpgrade.userName) && ValueObject.util_equals(this.avatarUrl, bLiveUserUpgrade.avatarUrl) && this.grade == bLiveUserUpgrade.grade && ValueObject.util_equals(this.liveUserLevel, bLiveUserUpgrade.liveUserLevel) && this.superGrade == bLiveUserUpgrade.superGrade;
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
        String str = this.uid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatarUrl;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.grade;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveUserLevel bLiveUserLevel = this.liveUserLevel;
        int iHashCode4 = (i3 + (bLiveUserLevel != null ? bLiveUserLevel.hashCode() : 0)) * 41;
        long j2 = this.superGrade;
        int i4 = iHashCode4 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.uid == null) {
            this.uid = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.avatarUrl == null) {
            this.avatarUrl = "";
        }
        if (this.liveUserLevel == null) {
            this.liveUserLevel = BLiveUserLevel.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
