package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveChatExtInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatExtInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatExtInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatExtInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatExtInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatExtInfo newInstance() {
            return new BLiveChatExtInfo();
        }

        public boolean parseField(BLiveChatExtInfo bLiveChatExtInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "atUserInfos":
                    bLiveChatExtInfo.atUserInfos = JsonAdapter.parseArray(jsonParser, BLiveAtUserInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "groupType":
                    bLiveChatExtInfo.groupType = jsonParser.getValueAsString();
                    return true;
                case "imageUrl":
                    bLiveChatExtInfo.imageUrl = jsonParser.getValueAsString();
                    return true;
                case "userMask":
                    bLiveChatExtInfo.userMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "colorfulMode":
                    bLiveChatExtInfo.colorfulMode = jsonParser.getValueAsBoolean();
                    return true;
                case "senderCityID":
                    bLiveChatExtInfo.senderCityID = jsonParser.getValueAsString();
                    return true;
                case "groupControl":
                    bLiveChatExtInfo.groupControl = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatExtInfo bLiveChatExtInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveChatExtInfo.imageUrl;
            if (str != null) {
                jsonGenerator.writeStringField("imageUrl", str);
            }
            String str2 = bLiveChatExtInfo.senderCityID;
            if (str2 != null) {
                jsonGenerator.writeStringField("senderCityID", str2);
            }
            if (bLiveChatExtInfo.userMask != null) {
                jsonGenerator.writeFieldName("userMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveChatExtInfo.userMask, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("groupControl", bLiveChatExtInfo.groupControl);
            String str3 = bLiveChatExtInfo.groupType;
            if (str3 != null) {
                jsonGenerator.writeStringField("groupType", str3);
            }
            if (bLiveChatExtInfo.atUserInfos != null) {
                jsonGenerator.writeFieldName("atUserInfos");
                JsonAdapter.serializeArray(bLiveChatExtInfo.atUserInfos, jsonGenerator, BLiveAtUserInfo.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("colorfulMode", bLiveChatExtInfo.colorfulMode);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatExtInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatextinfo";

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveAtUserInfo> atUserInfos;

    @ProtobufIndex(index = 7)
    public boolean colorfulMode;

    @ProtobufIndex(index = 4)
    public boolean groupControl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String groupType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String imageUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String senderCityID;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveUserMask userMask;

    public static BLiveChatExtInfo new_() {
        BLiveChatExtInfo bLiveChatExtInfo = new BLiveChatExtInfo();
        bLiveChatExtInfo.nullCheck();
        return bLiveChatExtInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatExtInfo mo225055clone() {
        BLiveChatExtInfo bLiveChatExtInfo = new BLiveChatExtInfo();
        bLiveChatExtInfo.imageUrl = this.imageUrl;
        bLiveChatExtInfo.senderCityID = this.senderCityID;
        BLiveUserMask bLiveUserMask = this.userMask;
        if (bLiveUserMask != null) {
            bLiveChatExtInfo.userMask = bLiveUserMask.mo225055clone();
        }
        bLiveChatExtInfo.groupControl = this.groupControl;
        bLiveChatExtInfo.groupType = this.groupType;
        List<BLiveAtUserInfo> list = this.atUserInfos;
        if (list != null) {
            bLiveChatExtInfo.atUserInfos = ValueObject.util_map(list, new qcj() { // from class: l.ps1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveAtUserInfo) obj).mo225055clone();
                }
            });
        }
        bLiveChatExtInfo.colorfulMode = this.colorfulMode;
        return bLiveChatExtInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatExtInfo)) {
            return false;
        }
        BLiveChatExtInfo bLiveChatExtInfo = (BLiveChatExtInfo) obj;
        return ValueObject.util_equals(this.imageUrl, bLiveChatExtInfo.imageUrl) && ValueObject.util_equals(this.senderCityID, bLiveChatExtInfo.senderCityID) && ValueObject.util_equals(this.userMask, bLiveChatExtInfo.userMask) && this.groupControl == bLiveChatExtInfo.groupControl && ValueObject.util_equals(this.groupType, bLiveChatExtInfo.groupType) && ValueObject.util_equals(this.atUserInfos, bLiveChatExtInfo.atUserInfos) && this.colorfulMode == bLiveChatExtInfo.colorfulMode;
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
        String str = this.imageUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.senderCityID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.userMask;
        int iHashCode3 = (((iHashCode2 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41) + (this.groupControl ? 1231 : 1237)) * 41;
        String str3 = this.groupType;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveAtUserInfo> list = this.atUserInfos;
        int iHashCode5 = ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 41) + (this.colorfulMode ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
        if (this.senderCityID == null) {
            this.senderCityID = "";
        }
        if (this.userMask == null) {
            this.userMask = BLiveUserMask.new_();
        }
        if (this.groupType == null) {
            this.groupType = "";
        }
        if (this.atUserInfos == null) {
            this.atUserInfos = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
