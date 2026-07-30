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
public class BLiveSquareNearByConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSquareNearByConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSquareNearByConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSquareNearByConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSquareNearByConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSquareNearByConfig newInstance() {
            return new BLiveSquareNearByConfig();
        }

        public boolean parseField(BLiveSquareNearByConfig bLiveSquareNearByConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showMemberCount")) {
                bLiveSquareNearByConfig.showMemberCount = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("showMemberText")) {
                return false;
            }
            bLiveSquareNearByConfig.showMemberText = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSquareNearByConfig bLiveSquareNearByConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showMemberCount", bLiveSquareNearByConfig.showMemberCount);
            String str = bLiveSquareNearByConfig.showMemberText;
            if (str != null) {
                jsonGenerator.writeStringField("showMemberText", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSquareNearByConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesquarenearbyconfig";

    @ProtobufIndex(index = 1)
    public boolean showMemberCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String showMemberText;

    public static BLiveSquareNearByConfig new_() {
        BLiveSquareNearByConfig bLiveSquareNearByConfig = new BLiveSquareNearByConfig();
        bLiveSquareNearByConfig.nullCheck();
        return bLiveSquareNearByConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSquareNearByConfig mo225055clone() {
        BLiveSquareNearByConfig bLiveSquareNearByConfig = new BLiveSquareNearByConfig();
        bLiveSquareNearByConfig.showMemberCount = this.showMemberCount;
        bLiveSquareNearByConfig.showMemberText = this.showMemberText;
        return bLiveSquareNearByConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSquareNearByConfig)) {
            return false;
        }
        BLiveSquareNearByConfig bLiveSquareNearByConfig = (BLiveSquareNearByConfig) obj;
        return this.showMemberCount == bLiveSquareNearByConfig.showMemberCount && ValueObject.util_equals(this.showMemberText, bLiveSquareNearByConfig.showMemberText);
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
        int i2 = ((i * 41) + (this.showMemberCount ? 1231 : 1237)) * 41;
        String str = this.showMemberText;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showMemberText == null) {
            this.showMemberText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
