package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Target;
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
public class BLiveSignInReward extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSignInReward> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSignInReward>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSignInReward.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSignInReward.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSignInReward newInstance() {
            return new BLiveSignInReward();
        }

        public boolean parseField(BLiveSignInReward bLiveSignInReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveSignInReward.description = jsonParser.getValueAsString();
                    return true;
                case "target":
                    bLiveSignInReward.target = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveSignInReward.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveSignInReward.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveSignInReward.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSignInReward bLiveSignInReward, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSignInReward.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveSignInReward.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveSignInReward.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bLiveSignInReward.description;
            if (str4 != null) {
                jsonGenerator.writeStringField("description", str4);
            }
            String str5 = bLiveSignInReward.target;
            if (str5 != null) {
                jsonGenerator.writeStringField(Target.TYPE, str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSignInReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesigninreward";

    @NonNull
    @ProtobufIndex(index = 4)
    public String description;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String target;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveSignInReward new_() {
        BLiveSignInReward bLiveSignInReward = new BLiveSignInReward();
        bLiveSignInReward.nullCheck();
        return bLiveSignInReward;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSignInReward mo225055clone() {
        BLiveSignInReward bLiveSignInReward = new BLiveSignInReward();
        bLiveSignInReward.type = this.type;
        bLiveSignInReward.icon = this.icon;
        bLiveSignInReward.name = this.name;
        bLiveSignInReward.description = this.description;
        bLiveSignInReward.target = this.target;
        return bLiveSignInReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSignInReward)) {
            return false;
        }
        BLiveSignInReward bLiveSignInReward = (BLiveSignInReward) obj;
        return ValueObject.util_equals(this.type, bLiveSignInReward.type) && ValueObject.util_equals(this.icon, bLiveSignInReward.icon) && ValueObject.util_equals(this.name, bLiveSignInReward.name) && ValueObject.util_equals(this.description, bLiveSignInReward.description) && ValueObject.util_equals(this.target, bLiveSignInReward.target);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.target;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.target == null) {
            this.target = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
