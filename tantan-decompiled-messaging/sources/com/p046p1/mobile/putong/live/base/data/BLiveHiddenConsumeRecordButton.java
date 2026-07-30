package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveHiddenConsumeRecordButton extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHiddenConsumeRecordButton> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHiddenConsumeRecordButton>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHiddenConsumeRecordButton.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHiddenConsumeRecordButton newInstance() {
            return new BLiveHiddenConsumeRecordButton();
        }

        public boolean parseField(BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hiddenAnchorHierarchyOn":
                    bLiveHiddenConsumeRecordButton.hiddenAnchorHierarchyOn = jsonParser.getValueAsBoolean();
                    return true;
                case "userHiddenConsumeRecordOn":
                    bLiveHiddenConsumeRecordButton.userHiddenConsumeRecordOn = jsonParser.getValueAsBoolean();
                    return true;
                case "hideGroupConsumptionRankStatus":
                    bLiveHiddenConsumeRecordButton.hideGroupConsumptionRankStatus = jsonParser.getValueAsBoolean();
                    return true;
                case "anchorHiddenConsumeRecordOn":
                    bLiveHiddenConsumeRecordButton.anchorHiddenConsumeRecordOn = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("anchorHiddenConsumeRecordOn", bLiveHiddenConsumeRecordButton.anchorHiddenConsumeRecordOn);
            jsonGenerator.writeBooleanField("userHiddenConsumeRecordOn", bLiveHiddenConsumeRecordButton.userHiddenConsumeRecordOn);
            jsonGenerator.writeBooleanField("hideGroupConsumptionRankStatus", bLiveHiddenConsumeRecordButton.hideGroupConsumptionRankStatus);
            jsonGenerator.writeBooleanField("hiddenAnchorHierarchyOn", bLiveHiddenConsumeRecordButton.hiddenAnchorHierarchyOn);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHiddenConsumeRecordButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivehiddenconsumerecordbutton";

    @ProtobufIndex(index = 1)
    public boolean anchorHiddenConsumeRecordOn;

    @ProtobufIndex(index = 4)
    public boolean hiddenAnchorHierarchyOn;

    @ProtobufIndex(index = 3)
    public boolean hideGroupConsumptionRankStatus;

    @ProtobufIndex(index = 2)
    public boolean userHiddenConsumeRecordOn;

    public static BLiveHiddenConsumeRecordButton new_() {
        BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = new BLiveHiddenConsumeRecordButton();
        bLiveHiddenConsumeRecordButton.nullCheck();
        return bLiveHiddenConsumeRecordButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHiddenConsumeRecordButton mo223809clone() {
        BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = new BLiveHiddenConsumeRecordButton();
        bLiveHiddenConsumeRecordButton.anchorHiddenConsumeRecordOn = this.anchorHiddenConsumeRecordOn;
        bLiveHiddenConsumeRecordButton.userHiddenConsumeRecordOn = this.userHiddenConsumeRecordOn;
        bLiveHiddenConsumeRecordButton.hideGroupConsumptionRankStatus = this.hideGroupConsumptionRankStatus;
        bLiveHiddenConsumeRecordButton.hiddenAnchorHierarchyOn = this.hiddenAnchorHierarchyOn;
        return bLiveHiddenConsumeRecordButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHiddenConsumeRecordButton)) {
            return false;
        }
        BLiveHiddenConsumeRecordButton bLiveHiddenConsumeRecordButton = (BLiveHiddenConsumeRecordButton) obj;
        return this.anchorHiddenConsumeRecordOn == bLiveHiddenConsumeRecordButton.anchorHiddenConsumeRecordOn && this.userHiddenConsumeRecordOn == bLiveHiddenConsumeRecordButton.userHiddenConsumeRecordOn && this.hideGroupConsumptionRankStatus == bLiveHiddenConsumeRecordButton.hideGroupConsumptionRankStatus && this.hiddenAnchorHierarchyOn == bLiveHiddenConsumeRecordButton.hiddenAnchorHierarchyOn;
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
        int i2 = (((((((i * 41) + (this.anchorHiddenConsumeRecordOn ? 1231 : 1237)) * 41) + (this.userHiddenConsumeRecordOn ? 1231 : 1237)) * 41) + (this.hideGroupConsumptionRankStatus ? 1231 : 1237)) * 41) + (this.hiddenAnchorHierarchyOn ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
