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
public class BLiveAuctionQueueInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionQueueInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionQueueInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionQueueInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionQueueInfo newInstance() {
            return new BLiveAuctionQueueInfo();
        }

        public boolean parseField(BLiveAuctionQueueInfo bLiveAuctionQueueInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userInfo":
                    bLiveAuctionQueueInfo.userInfo = BLiveAuctionUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveAuctionQueueInfo.f45181id = jsonParser.getValueAsString();
                    return false;
                case "order":
                    bLiveAuctionQueueInfo.order = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveAuctionQueueInfo.state = BLiveVoiceAuctionInviteState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionQueueInfo bLiveAuctionQueueInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAuctionQueueInfo.f45181id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveAuctionQueueInfo.order;
            if (str2 != null) {
                jsonGenerator.writeStringField("order", str2);
            }
            if (bLiveAuctionQueueInfo.state != null) {
                jsonGenerator.writeFieldName("state");
                BLiveVoiceAuctionInviteState.JSON_ADAPTER.serialize(bLiveAuctionQueueInfo.state, jsonGenerator, true);
            }
            if (bLiveAuctionQueueInfo.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                BLiveAuctionUserInfo.JSON_ADAPTER.serialize(bLiveAuctionQueueInfo.userInfo, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionQueueInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionqueueinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45181id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String order;
    public String role = "";

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveVoiceAuctionInviteState state;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveAuctionUserInfo userInfo;

    public static BLiveAuctionQueueInfo new_() {
        BLiveAuctionQueueInfo bLiveAuctionQueueInfo = new BLiveAuctionQueueInfo();
        bLiveAuctionQueueInfo.nullCheck();
        return bLiveAuctionQueueInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionQueueInfo mo225055clone() {
        BLiveAuctionQueueInfo bLiveAuctionQueueInfo = new BLiveAuctionQueueInfo();
        bLiveAuctionQueueInfo.f45181id = this.f45181id;
        bLiveAuctionQueueInfo.order = this.order;
        bLiveAuctionQueueInfo.state = this.state;
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.userInfo;
        if (bLiveAuctionUserInfo != null) {
            bLiveAuctionQueueInfo.userInfo = bLiveAuctionUserInfo.mo225055clone();
        }
        return bLiveAuctionQueueInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionQueueInfo)) {
            return false;
        }
        BLiveAuctionQueueInfo bLiveAuctionQueueInfo = (BLiveAuctionQueueInfo) obj;
        return ValueObject.util_equals(this.f45181id, bLiveAuctionQueueInfo.f45181id) && ValueObject.util_equals(this.order, bLiveAuctionQueueInfo.order) && ValueObject.util_equals(this.state, bLiveAuctionQueueInfo.state) && ValueObject.util_equals(this.userInfo, bLiveAuctionQueueInfo.userInfo);
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
        String str = this.f45181id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.order;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveVoiceAuctionInviteState bLiveVoiceAuctionInviteState = this.state;
        int iHashCode3 = (iHashCode2 + (bLiveVoiceAuctionInviteState != null ? bLiveVoiceAuctionInviteState.hashCode() : 0)) * 41;
        BLiveAuctionUserInfo bLiveAuctionUserInfo = this.userInfo;
        int iHashCode4 = iHashCode3 + (bLiveAuctionUserInfo != null ? bLiveAuctionUserInfo.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45181id == null) {
            this.f45181id = "";
        }
        if (this.order == null) {
            this.order = "";
        }
        if (this.state == null) {
            this.state = (BLiveVoiceAuctionInviteState) BLiveVoiceAuctionInviteState.JSON_ADAPTER.defaultEnum();
        }
        if (this.userInfo == null) {
            this.userInfo = BLiveAuctionUserInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
