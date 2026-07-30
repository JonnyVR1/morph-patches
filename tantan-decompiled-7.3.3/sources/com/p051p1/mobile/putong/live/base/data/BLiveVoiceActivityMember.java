package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveVoiceActivityMember extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceActivityMember> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceActivityMember>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceActivityMember.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceActivityMember.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceActivityMember newInstance() {
            return new BLiveVoiceActivityMember();
        }

        public boolean parseField(BLiveVoiceActivityMember bLiveVoiceActivityMember, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveVoiceActivityMember.avatar = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceActivityMember.userId = jsonParser.getValueAsString();
                    return true;
                case "mainTitle":
                    bLiveVoiceActivityMember.mainTitle = jsonParser.getValueAsString();
                    return true;
                case "secondTitle":
                    bLiveVoiceActivityMember.secondTitle = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceActivityMember bLiveVoiceActivityMember, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceActivityMember.avatar;
            if (str != null) {
                jsonGenerator.writeStringField("avatar", str);
            }
            String str2 = bLiveVoiceActivityMember.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveVoiceActivityMember.mainTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("mainTitle", str3);
            }
            String str4 = bLiveVoiceActivityMember.secondTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("secondTitle", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceActivityMember) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceactivitymember";

    @NonNull
    @ProtobufIndex(index = 1)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public String mainTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String secondTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveVoiceActivityMember new_() {
        BLiveVoiceActivityMember bLiveVoiceActivityMember = new BLiveVoiceActivityMember();
        bLiveVoiceActivityMember.nullCheck();
        return bLiveVoiceActivityMember;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceActivityMember mo225055clone() {
        BLiveVoiceActivityMember bLiveVoiceActivityMember = new BLiveVoiceActivityMember();
        bLiveVoiceActivityMember.avatar = this.avatar;
        bLiveVoiceActivityMember.userId = this.userId;
        bLiveVoiceActivityMember.mainTitle = this.mainTitle;
        bLiveVoiceActivityMember.secondTitle = this.secondTitle;
        return bLiveVoiceActivityMember;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceActivityMember)) {
            return false;
        }
        BLiveVoiceActivityMember bLiveVoiceActivityMember = (BLiveVoiceActivityMember) obj;
        return ValueObject.util_equals(this.avatar, bLiveVoiceActivityMember.avatar) && ValueObject.util_equals(this.userId, bLiveVoiceActivityMember.userId) && ValueObject.util_equals(this.mainTitle, bLiveVoiceActivityMember.mainTitle) && ValueObject.util_equals(this.secondTitle, bLiveVoiceActivityMember.secondTitle);
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
        String str = this.avatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.mainTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.secondTitle;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.mainTitle == null) {
            this.mainTitle = "";
        }
        if (this.secondTitle == null) {
            this.secondTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
