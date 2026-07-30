package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTraceServerData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTraceServerData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTraceServerData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTraceServerData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTraceServerData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTraceServerData newInstance() {
            return new BLiveTraceServerData();
        }

        public boolean parseField(BLiveTraceServerData bLiveTraceServerData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "givenSource":
                    bLiveTraceServerData.givenSource = jsonParser.getValueAsString();
                    return true;
                case "giftBarPageId":
                    bLiveTraceServerData.giftBarPageId = jsonParser.getValueAsLong();
                    return true;
                case "giftBarTab":
                    bLiveTraceServerData.giftBarTab = jsonParser.getValueAsString();
                    return true;
                case "biz":
                    bLiveTraceServerData.biz = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveTraceServerData.type = BLiveTraceServerType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "enterSource":
                    bLiveTraceServerData.enterSource = jsonParser.getValueAsString();
                    return true;
                case "index":
                    bLiveTraceServerData.index = jsonParser.getValueAsLong();
                    return true;
                case "location":
                    bLiveTraceServerData.location = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTraceServerData bLiveTraceServerData, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveTraceServerData.type != null) {
                jsonGenerator.writeFieldName("type");
                BLiveTraceServerType.JSON_ADAPTER.serialize(bLiveTraceServerData.type, jsonGenerator, true);
            }
            String str = bLiveTraceServerData.location;
            if (str != null) {
                jsonGenerator.writeStringField("location", str);
            }
            String str2 = bLiveTraceServerData.biz;
            if (str2 != null) {
                jsonGenerator.writeStringField("biz", str2);
            }
            String str3 = bLiveTraceServerData.giftBarTab;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftBarTab", str3);
            }
            jsonGenerator.writeNumberField("giftBarPageId", bLiveTraceServerData.giftBarPageId);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, bLiveTraceServerData.index);
            String str4 = bLiveTraceServerData.enterSource;
            if (str4 != null) {
                jsonGenerator.writeStringField("enterSource", str4);
            }
            String str5 = bLiveTraceServerData.givenSource;
            if (str5 != null) {
                jsonGenerator.writeStringField("givenSource", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTraceServerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetraceserverdata";

    @Nullable
    @ProtobufIndex(index = 3)
    public String biz;

    @NonNull
    @ProtobufIndex(index = 7)
    public String enterSource;

    @ProtobufIndex(index = 5)
    public long giftBarPageId;

    @Nullable
    @ProtobufIndex(index = 4)
    public String giftBarTab;

    @NonNull
    @ProtobufIndex(index = 9)
    public String givenSource;

    @ProtobufIndex(index = 6)
    public long index;

    @NonNull
    @ProtobufIndex(index = 2)
    public String location;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveTraceServerType type;

    public BLiveTraceServerData(@NonNull BLiveTraceServerType bLiveTraceServerType, @Nullable BLiveTraceServerLocation bLiveTraceServerLocation, @Nullable String str) {
        this.type = bLiveTraceServerType;
        this.location = getLocation(bLiveTraceServerLocation);
        this.biz = str;
    }

    public static BLiveTraceServerData getH5TraceServerData(@NonNull String str, @Nullable String str2) {
        return new BLiveTraceServerData(BLiveTraceServerType.get("H5"), str, str2);
    }

    private String getLocation(@Nullable BLiveTraceServerLocation bLiveTraceServerLocation) {
        return NullChecker.m81303a(bLiveTraceServerLocation) ? bLiveTraceServerLocation.name() : BLiveTraceServerLocation.get("common").name();
    }

    public static BLiveTraceServerData getNativeTabBarTraceServerData(String str, int i, int i2) {
        BLiveTraceServerData nativeTraceServerData = getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.giftbar), "");
        nativeTraceServerData.giftBarTab = str;
        nativeTraceServerData.giftBarPageId = i + 1;
        nativeTraceServerData.index = i2 + 1;
        return nativeTraceServerData;
    }

    public static BLiveTraceServerData getNativeTraceServerData(@Nullable BLiveTraceServerLocation bLiveTraceServerLocation, @Nullable BLiveTraceServerBiz bLiveTraceServerBiz) {
        return new BLiveTraceServerData(BLiveTraceServerType.get(BLiveTraceServerType.Native), bLiveTraceServerLocation, NullChecker.m81303a(bLiveTraceServerBiz) ? bLiveTraceServerBiz.name() : "");
    }

    public static BLiveTraceServerData new_() {
        BLiveTraceServerData bLiveTraceServerData = new BLiveTraceServerData();
        bLiveTraceServerData.nullCheck();
        return bLiveTraceServerData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTraceServerData mo223809clone() {
        BLiveTraceServerData bLiveTraceServerData = new BLiveTraceServerData();
        bLiveTraceServerData.type = this.type;
        bLiveTraceServerData.location = this.location;
        bLiveTraceServerData.biz = this.biz;
        bLiveTraceServerData.giftBarTab = this.giftBarTab;
        bLiveTraceServerData.giftBarPageId = this.giftBarPageId;
        bLiveTraceServerData.index = this.index;
        bLiveTraceServerData.enterSource = this.enterSource;
        bLiveTraceServerData.givenSource = this.givenSource;
        return bLiveTraceServerData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTraceServerData)) {
            return false;
        }
        BLiveTraceServerData bLiveTraceServerData = (BLiveTraceServerData) obj;
        return ValueObject.util_equals(this.type, bLiveTraceServerData.type) && ValueObject.util_equals(this.location, bLiveTraceServerData.location) && ValueObject.util_equals(this.biz, bLiveTraceServerData.biz) && ValueObject.util_equals(this.giftBarTab, bLiveTraceServerData.giftBarTab) && this.giftBarPageId == bLiveTraceServerData.giftBarPageId && this.index == bLiveTraceServerData.index && ValueObject.util_equals(this.enterSource, bLiveTraceServerData.enterSource) && ValueObject.util_equals(this.givenSource, bLiveTraceServerData.givenSource);
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
        BLiveTraceServerType bLiveTraceServerType = this.type;
        int iHashCode = (i2 + (bLiveTraceServerType != null ? bLiveTraceServerType.hashCode() : 0)) * 41;
        String str = this.location;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.biz;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftBarTab;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long j = this.giftBarPageId;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.index;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str4 = this.enterSource;
        int iHashCode5 = (i4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.givenSource;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (BLiveTraceServerType) BLiveTraceServerType.JSON_ADAPTER.defaultEnum();
        }
        if (this.location == null) {
            this.location = "";
        }
        if (this.enterSource == null) {
            this.enterSource = "";
        }
        if (this.givenSource == null) {
            this.givenSource = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public BLiveTraceServerData() {
    }

    public BLiveTraceServerData(@NonNull BLiveTraceServerType bLiveTraceServerType, @NonNull String str, @Nullable String str2) {
        this.type = bLiveTraceServerType;
        this.location = str;
        this.biz = str2;
    }

    public static BLiveTraceServerData getNativeTraceServerData(@Nullable BLiveTraceServerLocation bLiveTraceServerLocation, @Nullable String str) {
        return new BLiveTraceServerData(BLiveTraceServerType.get(BLiveTraceServerType.Native), bLiveTraceServerLocation, str);
    }

    public static BLiveTraceServerData getNativeTraceServerData(@Nullable BLiveTraceServerBiz bLiveTraceServerBiz) {
        return getNativeTraceServerData(BLiveTraceServerLocation.get("common"), bLiveTraceServerBiz);
    }
}
