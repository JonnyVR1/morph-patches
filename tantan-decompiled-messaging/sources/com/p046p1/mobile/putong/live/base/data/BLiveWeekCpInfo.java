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
public class BLiveWeekCpInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveWeekCpInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveWeekCpInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveWeekCpInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveWeekCpInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveWeekCpInfo newInstance() {
            return new BLiveWeekCpInfo();
        }

        public boolean parseField(BLiveWeekCpInfo bLiveWeekCpInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveWeekCpInfo.avatar = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveWeekCpInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "userImage":
                    bLiveWeekCpInfo.userImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveWeekCpInfo bLiveWeekCpInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveWeekCpInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveWeekCpInfo.userImage;
            if (str2 != null) {
                jsonGenerator.writeStringField("userImage", str2);
            }
            String str3 = bLiveWeekCpInfo.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveWeekCpInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveweekcpinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userImage;

    public static BLiveWeekCpInfo new_() {
        BLiveWeekCpInfo bLiveWeekCpInfo = new BLiveWeekCpInfo();
        bLiveWeekCpInfo.nullCheck();
        return bLiveWeekCpInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveWeekCpInfo mo223809clone() {
        BLiveWeekCpInfo bLiveWeekCpInfo = new BLiveWeekCpInfo();
        bLiveWeekCpInfo.userId = this.userId;
        bLiveWeekCpInfo.userImage = this.userImage;
        bLiveWeekCpInfo.avatar = this.avatar;
        return bLiveWeekCpInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveWeekCpInfo)) {
            return false;
        }
        BLiveWeekCpInfo bLiveWeekCpInfo = (BLiveWeekCpInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveWeekCpInfo.userId) && ValueObject.util_equals(this.userImage, bLiveWeekCpInfo.userImage) && ValueObject.util_equals(this.avatar, bLiveWeekCpInfo.avatar);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userImage;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
