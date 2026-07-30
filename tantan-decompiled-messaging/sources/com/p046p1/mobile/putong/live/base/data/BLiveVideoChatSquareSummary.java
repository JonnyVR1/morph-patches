package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class BLiveVideoChatSquareSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatSquareSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatSquareSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatSquareSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatSquareSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatSquareSummary newInstance() {
            return new BLiveVideoChatSquareSummary();
        }

        public boolean parseField(BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("popupConfig")) {
                bLiveVideoChatSquareSummary.popupConfig = BLivePopupConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("dialogUrl")) {
                return false;
            }
            bLiveVideoChatSquareSummary.dialogUrl = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVideoChatSquareSummary.dialogUrl;
            if (str != null) {
                jsonGenerator.writeStringField("dialogUrl", str);
            }
            if (bLiveVideoChatSquareSummary.popupConfig != null) {
                jsonGenerator.writeFieldName("popupConfig");
                BLivePopupConfig.JSON_ADAPTER.serialize(bLiveVideoChatSquareSummary.popupConfig, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatSquareSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatsquaresummary";

    @NonNull
    @ProtobufIndex(index = 1)
    public String dialogUrl;

    @Nullable
    @ProtobufIndex(index = 2)
    public BLivePopupConfig popupConfig;

    public static BLiveVideoChatSquareSummary new_() {
        BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary = new BLiveVideoChatSquareSummary();
        bLiveVideoChatSquareSummary.nullCheck();
        return bLiveVideoChatSquareSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatSquareSummary mo223809clone() {
        BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary = new BLiveVideoChatSquareSummary();
        bLiveVideoChatSquareSummary.dialogUrl = this.dialogUrl;
        BLivePopupConfig bLivePopupConfig = this.popupConfig;
        if (bLivePopupConfig != null) {
            bLiveVideoChatSquareSummary.popupConfig = bLivePopupConfig.mo223809clone();
        }
        return bLiveVideoChatSquareSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatSquareSummary)) {
            return false;
        }
        BLiveVideoChatSquareSummary bLiveVideoChatSquareSummary = (BLiveVideoChatSquareSummary) obj;
        return ValueObject.util_equals(this.dialogUrl, bLiveVideoChatSquareSummary.dialogUrl) && ValueObject.util_equals(this.popupConfig, bLiveVideoChatSquareSummary.popupConfig);
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
        String str = this.dialogUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLivePopupConfig bLivePopupConfig = this.popupConfig;
        int iHashCode2 = iHashCode + (bLivePopupConfig != null ? bLivePopupConfig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.dialogUrl == null) {
            this.dialogUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
