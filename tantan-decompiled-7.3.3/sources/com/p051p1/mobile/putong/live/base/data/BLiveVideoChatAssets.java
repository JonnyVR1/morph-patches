package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
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
public class BLiveVideoChatAssets extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatAssets> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatAssets>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatAssets.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatAssets.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatAssets newInstance() {
            return new BLiveVideoChatAssets();
        }

        public boolean parseField(BLiveVideoChatAssets bLiveVideoChatAssets, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    bLiveVideoChatAssets.startTime = jsonParser.getValueAsLong();
                    return true;
                case "enterFailTip":
                    bLiveVideoChatAssets.enterFailTip = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    bLiveVideoChatAssets.endTime = jsonParser.getValueAsLong();
                    return true;
                case "canEnterTab":
                    bLiveVideoChatAssets.canEnterTab = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatAssets bLiveVideoChatAssets, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("canEnterTab", bLiveVideoChatAssets.canEnterTab);
            String str = bLiveVideoChatAssets.enterFailTip;
            if (str != null) {
                jsonGenerator.writeStringField("enterFailTip", str);
            }
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, bLiveVideoChatAssets.startTime);
            jsonGenerator.writeNumberField("endTime", bLiveVideoChatAssets.endTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatAssets) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatassets";

    @ProtobufIndex(index = 1)
    public boolean canEnterTab;

    @ProtobufIndex(index = 3)
    public long endTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String enterFailTip;

    @ProtobufIndex(index = 2)
    public long startTime;

    public static BLiveVideoChatAssets new_() {
        BLiveVideoChatAssets bLiveVideoChatAssets = new BLiveVideoChatAssets();
        bLiveVideoChatAssets.nullCheck();
        return bLiveVideoChatAssets;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatAssets mo225055clone() {
        BLiveVideoChatAssets bLiveVideoChatAssets = new BLiveVideoChatAssets();
        bLiveVideoChatAssets.canEnterTab = this.canEnterTab;
        bLiveVideoChatAssets.enterFailTip = this.enterFailTip;
        bLiveVideoChatAssets.startTime = this.startTime;
        bLiveVideoChatAssets.endTime = this.endTime;
        return bLiveVideoChatAssets;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatAssets)) {
            return false;
        }
        BLiveVideoChatAssets bLiveVideoChatAssets = (BLiveVideoChatAssets) obj;
        return this.canEnterTab == bLiveVideoChatAssets.canEnterTab && ValueObject.util_equals(this.enterFailTip, bLiveVideoChatAssets.enterFailTip) && this.startTime == bLiveVideoChatAssets.startTime && this.endTime == bLiveVideoChatAssets.endTime;
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
        int i2 = ((i * 41) + (this.canEnterTab ? 1231 : 1237)) * 41;
        String str = this.enterFailTip;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.startTime;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTime;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.enterFailTip == null) {
            this.enterFailTip = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
