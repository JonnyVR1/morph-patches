package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveMyCardInfo;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTurboCardInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTurboCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTurboCardInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTurboCardInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTurboCardInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTurboCardInfo newInstance() {
            return new BLiveTurboCardInfo();
        }

        public boolean parseField(BLiveTurboCardInfo bLiveTurboCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roomCardInfo":
                    bLiveTurboCardInfo.roomCardInfo = BLiveRoomCardInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "myCardList":
                    bLiveTurboCardInfo.myCardList = JsonAdapter.parseArray(jsonParser, BLiveMyCardInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "hasShow":
                    bLiveTurboCardInfo.hasShow = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTurboCardInfo bLiveTurboCardInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hasShow", bLiveTurboCardInfo.hasShow);
            if (bLiveTurboCardInfo.myCardList != null) {
                jsonGenerator.writeFieldName("myCardList");
                JsonAdapter.serializeArray(bLiveTurboCardInfo.myCardList, jsonGenerator, BLiveMyCardInfo.JSON_ADAPTER);
            }
            if (bLiveTurboCardInfo.roomCardInfo != null) {
                jsonGenerator.writeFieldName("roomCardInfo");
                BLiveRoomCardInfo.JSON_ADAPTER.serialize(bLiveTurboCardInfo.roomCardInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTurboCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveturbocardinfo";

    @ProtobufIndex(index = 1)
    public boolean hasShow;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveMyCardInfo> myCardList;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveRoomCardInfo roomCardInfo;

    public static BLiveTurboCardInfo new_() {
        BLiveTurboCardInfo bLiveTurboCardInfo = new BLiveTurboCardInfo();
        bLiveTurboCardInfo.nullCheck();
        return bLiveTurboCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTurboCardInfo mo223809clone() {
        BLiveTurboCardInfo bLiveTurboCardInfo = new BLiveTurboCardInfo();
        bLiveTurboCardInfo.hasShow = this.hasShow;
        List<BLiveMyCardInfo> list = this.myCardList;
        if (list != null) {
            bLiveTurboCardInfo.myCardList = ValueObject.util_map(list, new w9j() { // from class: l.a72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveMyCardInfo) obj).mo223809clone();
                }
            });
        }
        BLiveRoomCardInfo bLiveRoomCardInfo = this.roomCardInfo;
        if (bLiveRoomCardInfo != null) {
            bLiveTurboCardInfo.roomCardInfo = bLiveRoomCardInfo.mo223809clone();
        }
        return bLiveTurboCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTurboCardInfo)) {
            return false;
        }
        BLiveTurboCardInfo bLiveTurboCardInfo = (BLiveTurboCardInfo) obj;
        return this.hasShow == bLiveTurboCardInfo.hasShow && ValueObject.util_equals(this.myCardList, bLiveTurboCardInfo.myCardList) && ValueObject.util_equals(this.roomCardInfo, bLiveTurboCardInfo.roomCardInfo);
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
        int i2 = ((i * 41) + (this.hasShow ? 1231 : 1237)) * 41;
        List<BLiveMyCardInfo> list = this.myCardList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveRoomCardInfo bLiveRoomCardInfo = this.roomCardInfo;
        int iHashCode2 = iHashCode + (bLiveRoomCardInfo != null ? bLiveRoomCardInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.myCardList == null) {
            this.myCardList = new ArrayList();
        }
        if (this.roomCardInfo == null) {
            this.roomCardInfo = BLiveRoomCardInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
