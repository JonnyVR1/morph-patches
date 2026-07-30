package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePosition;
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
public class BLiveGiftExtraDrawInfo extends ValueObject implements Cloneable, Serializable {
    public static final float DISMISS_DURATION = 400.0f;
    public static JsonAdapter<BLiveGiftExtraDrawInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraDrawInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraDrawInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraDrawInfo newInstance() {
            return new BLiveGiftExtraDrawInfo();
        }

        public boolean parseField(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "length":
                    bLiveGiftExtraDrawInfo.length = (float) jsonParser.getValueAsDouble();
                    return true;
                case "width":
                    bLiveGiftExtraDrawInfo.width = (float) jsonParser.getValueAsDouble();
                    return true;
                case "coordinates":
                    bLiveGiftExtraDrawInfo.coordinates = JsonAdapter.parseArray(jsonParser, BLivePosition.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGiftExtraDrawInfo.coordinates != null) {
                jsonGenerator.writeFieldName("coordinates");
                JsonAdapter.serializeArray(bLiveGiftExtraDrawInfo.coordinates, jsonGenerator, BLivePosition.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("length", bLiveGiftExtraDrawInfo.length);
            jsonGenerator.writeNumberField("width", bLiveGiftExtraDrawInfo.width);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraDrawInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final float SINGLE_GIFT_DURATION = 200.0f;
    public static final float STAY_DURATION = 500.0f;
    public static final String TYPE = "blivegiftextradrawinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLivePosition> coordinates;
    public String imgUrl;

    @ProtobufIndex(index = 2)
    public float length;

    @ProtobufIndex(index = 3)
    public float width;

    public static BLiveGiftExtraDrawInfo getFirstTemple() {
        try {
            return JSON_ADAPTER.parse("{\n    \"coordinates\":[\n        {\n            \"x\":561,\n            \"y\":352\n        },\n        {\n            \"x\":459,\n            \"y\":299\n        },\n        {\n            \"x\":356,\n            \"y\":356\n        },\n        {\n            \"x\":278,\n            \"y\":455\n        },\n        {\n            \"x\":352,\n            \"y\":539\n        },\n        {\n            \"x\":444,\n            \"y\":620\n        },\n        {\n            \"x\":550,\n            \"y\":697\n        },\n        {\n            \"x\":658,\n            \"y\":620\n        },\n        {\n            \"x\":755,\n            \"y\":544\n        },\n        {\n            \"x\":820,\n            \"y\":458\n        },\n        {\n            \"x\":757,\n            \"y\":359\n        },\n        {\n            \"x\":661,\n            \"y\":299\n        }\n    ],\n    \"length\":984,\n    \"width\":1104\n}");
        } catch (IOException unused) {
            return new_();
        }
    }

    public static BLiveGiftExtraDrawInfo getForthTemple() {
        try {
            return JSON_ADAPTER.parse("{\n    \"coordinates\":[\n        {\n            \"x\":717,\n            \"y\":375\n        },\n        {\n            \"x\":648,\n            \"y\":293\n        },\n        {\n            \"x\":553,\n            \"y\":293\n        },\n        {\n            \"x\":459,\n            \"y\":293\n        },\n        {\n            \"x\":363,\n            \"y\":293\n        },\n        {\n            \"x\":288,\n            \"y\":375\n        },\n        {\n            \"x\":268,\n            \"y\":452\n        },\n        {\n            \"x\":320,\n            \"y\":537\n        },\n        {\n            \"x\":412,\n            \"y\":622\n        },\n        {\n            \"x\":508,\n            \"y\":705\n        },\n        {\n            \"x\":693,\n            \"y\":544\n        },\n        {\n            \"x\":599,\n            \"y\":626\n        },\n        {\n            \"x\":737,\n            \"y\":450\n        },\n        {\n            \"x\":645,\n            \"y\":450\n        },\n        {\n            \"x\":549,\n            \"y\":450\n        },\n        {\n            \"x\":462,\n            \"y\":450\n        },\n        {\n            \"x\":365,\n            \"y\":450\n        }\n    ],\n    \"length\":984,\n    \"width\":1008\n}");
        } catch (IOException unused) {
            return new_();
        }
    }

    public static BLiveGiftExtraDrawInfo getSecondTemple() {
        try {
            return JSON_ADAPTER.parse("{\n    \"coordinates\":[\n        {\n            \"x\":506,\n            \"y\":294\n        },\n        {\n            \"x\":428,\n            \"y\":363\n        },\n        {\n            \"x\":364,\n            \"y\":436\n        },\n        {\n            \"x\":261,\n            \"y\":378\n        },\n        {\n            \"x\":268,\n            \"y\":478\n        },\n        {\n            \"x\":286,\n            \"y\":572\n        },\n        {\n            \"x\":300,\n            \"y\":674\n        },\n        {\n            \"x\":396,\n            \"y\":674\n        },\n        {\n            \"x\":494,\n            \"y\":674\n        },\n        {\n            \"x\":592,\n            \"y\":674\n        },\n        {\n            \"x\":689,\n            \"y\":674\n        },\n        {\n            \"x\":715,\n            \"y\":574\n        },\n        {\n            \"x\":722,\n            \"y\":478\n        },\n        {\n            \"x\":733,\n            \"y\":380\n        },\n        {\n            \"x\":638,\n            \"y\":436\n        },\n        {\n            \"x\":580,\n            \"y\":363\n        }\n    ],\n    \"length\":984,\n    \"width\":1008\n}\n");
        } catch (IOException unused) {
            return new_();
        }
    }

    public static BLiveGiftExtraDrawInfo getThirdTemple() {
        try {
            return JSON_ADAPTER.parse("{\n    \"coordinates\":[\n        {\n            \"x\":279,\n            \"y\":447\n        },\n        {\n            \"x\":279,\n            \"y\":535\n        },\n        {\n            \"x\":279,\n            \"y\":625\n        },\n        {\n            \"x\":279,\n            \"y\":717\n        },\n        {\n            \"x\":380,\n            \"y\":717\n        },\n        {\n            \"x\":479,\n            \"y\":717\n        },\n        {\n            \"x\":577,\n            \"y\":717\n        },\n        {\n            \"x\":676,\n            \"y\":717\n        },\n        {\n            \"x\":703,\n            \"y\":629\n        },\n        {\n            \"x\":719,\n            \"y\":529\n        },\n        {\n            \"x\":731,\n            \"y\":434\n        },\n        {\n            \"x\":635,\n            \"y\":432\n        },\n        {\n            \"x\":543,\n            \"y\":375\n        },\n        {\n            \"x\":574,\n            \"y\":284\n        },\n        {\n            \"x\":469,\n            \"y\":276\n        },\n        {\n            \"x\":414,\n            \"y\":357\n        },\n        {\n            \"x\":380,\n            \"y\":447\n        },\n        {\n            \"x\":380,\n            \"y\":535\n        },\n        {\n            \"x\":380,\n            \"y\":625\n        }\n    ],\n    \"length\":984,\n    \"width\":1008\n}");
        } catch (IOException unused) {
            return new_();
        }
    }

    public static BLiveGiftExtraDrawInfo new_() {
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = new BLiveGiftExtraDrawInfo();
        bLiveGiftExtraDrawInfo.nullCheck();
        return bLiveGiftExtraDrawInfo;
    }

    public void clear() {
        this.coordinates.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraDrawInfo mo223809clone() {
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = new BLiveGiftExtraDrawInfo();
        List<BLivePosition> list = this.coordinates;
        if (list != null) {
            bLiveGiftExtraDrawInfo.coordinates = ValueObject.util_map(list, new w9j() { // from class: l.g02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLivePosition) obj).mo223809clone();
                }
            });
        }
        bLiveGiftExtraDrawInfo.length = this.length;
        bLiveGiftExtraDrawInfo.width = this.width;
        return bLiveGiftExtraDrawInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftExtraDrawInfo)) {
            return false;
        }
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = (BLiveGiftExtraDrawInfo) obj;
        return ValueObject.util_equals(this.coordinates, bLiveGiftExtraDrawInfo.coordinates) && this.length == bLiveGiftExtraDrawInfo.length && this.width == bLiveGiftExtraDrawInfo.width;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int getGiftNum() {
        return this.coordinates.size();
    }

    public BLivePosition getItem(int i) {
        return this.coordinates.get(i);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<BLivePosition> list = this.coordinates;
        int iHashCode = ((((i2 + (list != null ? list.hashCode() : 0)) * 41) + Float.floatToIntBits(this.length)) * 41) + Float.floatToIntBits(this.width);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.coordinates == null) {
            this.coordinates = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
