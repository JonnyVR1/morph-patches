package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.dbd0;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveRightInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRightInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRightInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRightInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRightInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRightInfo newInstance() {
            return new BLiveRightInfo();
        }

        public boolean parseField(BLiveRightInfo bLiveRightInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("single")) {
                bLiveRightInfo.single = JsonAdapter.parseArray(jsonParser, BLiveRightItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("multiple")) {
                return false;
            }
            bLiveRightInfo.multiple = JsonAdapter.parseArray(jsonParser, BLiveRightItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRightInfo bLiveRightInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveRightInfo.single != null) {
                jsonGenerator.writeFieldName("single");
                JsonAdapter.serializeArray(bLiveRightInfo.single, jsonGenerator, BLiveRightItem.JSON_ADAPTER);
            }
            if (bLiveRightInfo.multiple != null) {
                jsonGenerator.writeFieldName("multiple");
                JsonAdapter.serializeArray(bLiveRightInfo.multiple, jsonGenerator, BLiveRightItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRightInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverightinfo";
    private String anchorName;

    @Nullable
    public dbd0 displayParam;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveRightItem> multiple;
    private String roomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveRightItem> single;
    private UserRightType userRightType;

    public static BLiveRightInfo new_() {
        BLiveRightInfo bLiveRightInfo = new BLiveRightInfo();
        bLiveRightInfo.nullCheck();
        return bLiveRightInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRightInfo mo225055clone() {
        BLiveRightInfo bLiveRightInfo = new BLiveRightInfo();
        List<BLiveRightItem> list = this.single;
        if (list != null) {
            bLiveRightInfo.single = ValueObject.util_map(list, new qcj() { // from class: l.g52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveRightItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveRightItem> list2 = this.multiple;
        if (list2 != null) {
            bLiveRightInfo.multiple = ValueObject.util_map(list2, new qcj() { // from class: l.h52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveRightItem) obj).mo225055clone();
                }
            });
        }
        return bLiveRightInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRightInfo)) {
            return false;
        }
        BLiveRightInfo bLiveRightInfo = (BLiveRightInfo) obj;
        return ValueObject.util_equals(this.single, bLiveRightInfo.single) && ValueObject.util_equals(this.multiple, bLiveRightInfo.multiple);
    }

    public String getAnchorName() {
        return this.anchorName;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Nullable
    public dbd0 getDisplayParam() {
        return this.displayParam;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public UserRightType getUserRightType() {
        return this.userRightType;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<BLiveRightItem> list = this.single;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveRightItem> list2 = this.multiple;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.single == null) {
            this.single = new ArrayList();
        }
        if (this.multiple == null) {
            this.multiple = new ArrayList();
        }
    }

    public void setAnchorName(String str) {
        this.anchorName = str;
    }

    public void setDisplayParam(@Nullable dbd0 dbd0Var) {
        this.displayParam = dbd0Var;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setUserRightType(UserRightType userRightType) {
        this.userRightType = userRightType;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
