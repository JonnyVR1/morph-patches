package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFakeUserProfile extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFakeUserProfile> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFakeUserProfile>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFakeUserProfile.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFakeUserProfile.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFakeUserProfile newInstance() {
            return new BLiveFakeUserProfile();
        }

        public boolean parseField(BLiveFakeUserProfile bLiveFakeUserProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                bLiveFakeUserProfile.f44362id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("profileText")) {
                return false;
            }
            bLiveFakeUserProfile.profileText = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFakeUserProfile bLiveFakeUserProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFakeUserProfile.f44362id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveFakeUserProfile.profileText;
            if (str2 != null) {
                jsonGenerator.writeStringField("profileText", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFakeUserProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefakeuserprofile";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44362id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String profileText;

    public static BLiveFakeUserProfile new_() {
        BLiveFakeUserProfile bLiveFakeUserProfile = new BLiveFakeUserProfile();
        bLiveFakeUserProfile.nullCheck();
        return bLiveFakeUserProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFakeUserProfile mo223809clone() {
        BLiveFakeUserProfile bLiveFakeUserProfile = new BLiveFakeUserProfile();
        bLiveFakeUserProfile.f44362id = this.f44362id;
        bLiveFakeUserProfile.profileText = this.profileText;
        return bLiveFakeUserProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFakeUserProfile)) {
            return false;
        }
        BLiveFakeUserProfile bLiveFakeUserProfile = (BLiveFakeUserProfile) obj;
        return ValueObject.util_equals(this.f44362id, bLiveFakeUserProfile.f44362id) && ValueObject.util_equals(this.profileText, bLiveFakeUserProfile.profileText);
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
        String str = this.f44362id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.profileText;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44362id == null) {
            this.f44362id = "";
        }
        if (this.profileText == null) {
            this.profileText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
