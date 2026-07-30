package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveExpirationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftRule;
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
public class BLiveGiftRule extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftRule> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftRule>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftRule.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftRule.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftRule newInstance() {
            return new BLiveGiftRule();
        }

        public boolean parseField(BLiveGiftRule bLiveGiftRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "intervalMs":
                    bLiveGiftRule.intervalMs = jsonParser.getValueAsInt();
                    return true;
                case "action":
                    bLiveGiftRule.action = jsonParser.getValueAsString();
                    return true;
                case "notice":
                    bLiveGiftRule.notice = jsonParser.getValueAsString();
                    return true;
                case "scheme":
                    bLiveGiftRule.scheme = jsonParser.getValueAsString();
                    return true;
                case "combosHitNums":
                    bLiveGiftRule.combosHitNums = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "combosGears":
                    bLiveGiftRule.combosGears = JsonAdapter.parseArray(jsonParser, BLiveGiftCombosGears.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "expirationInfos":
                    bLiveGiftRule.expirationInfos = JsonAdapter.parseArray(jsonParser, BLiveExpirationItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftRule bLiveGiftRule, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftRule.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
            String str2 = bLiveGiftRule.scheme;
            if (str2 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str2);
            }
            if (bLiveGiftRule.combosHitNums != null) {
                jsonGenerator.writeFieldName("combosHitNums");
                JsonAdapter.serializeArray(bLiveGiftRule.combosHitNums, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            String str3 = bLiveGiftRule.notice;
            if (str3 != null) {
                jsonGenerator.writeStringField("notice", str3);
            }
            if (bLiveGiftRule.expirationInfos != null) {
                jsonGenerator.writeFieldName("expirationInfos");
                JsonAdapter.serializeArray(bLiveGiftRule.expirationInfos, jsonGenerator, BLiveExpirationItem.JSON_ADAPTER);
            }
            if (bLiveGiftRule.combosGears != null) {
                jsonGenerator.writeFieldName("combosGears");
                JsonAdapter.serializeArray(bLiveGiftRule.combosGears, jsonGenerator, BLiveGiftCombosGears.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("intervalMs", bLiveGiftRule.intervalMs);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftrule";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveGiftCombosGears> combosGears;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Integer> combosHitNums;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveExpirationItem> expirationInfos;

    @ProtobufIndex(index = 7)
    public int intervalMs;

    @NonNull
    @ProtobufIndex(index = 4)
    public String notice;

    @NonNull
    @ProtobufIndex(index = 2)
    public String scheme;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m67991b(Integer num) {
        return num;
    }

    public static BLiveGiftRule new_() {
        BLiveGiftRule bLiveGiftRule = new BLiveGiftRule();
        bLiveGiftRule.nullCheck();
        return bLiveGiftRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftRule mo223809clone() {
        BLiveGiftRule bLiveGiftRule = new BLiveGiftRule();
        bLiveGiftRule.action = this.action;
        bLiveGiftRule.scheme = this.scheme;
        List<Integer> list = this.combosHitNums;
        if (list != null) {
            bLiveGiftRule.combosHitNums = ValueObject.util_map(list, new w9j() { // from class: l.r02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveGiftRule.m67991b((Integer) obj);
                }
            });
        }
        bLiveGiftRule.notice = this.notice;
        List<BLiveExpirationItem> list2 = this.expirationInfos;
        if (list2 != null) {
            bLiveGiftRule.expirationInfos = ValueObject.util_map(list2, new w9j() { // from class: l.s02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveExpirationItem) obj).mo223809clone();
                }
            });
        }
        List<BLiveGiftCombosGears> list3 = this.combosGears;
        if (list3 != null) {
            bLiveGiftRule.combosGears = ValueObject.util_map(list3, new w9j() { // from class: l.t02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveGiftCombosGears) obj).mo223809clone();
                }
            });
        }
        bLiveGiftRule.intervalMs = this.intervalMs;
        return bLiveGiftRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftRule)) {
            return false;
        }
        BLiveGiftRule bLiveGiftRule = (BLiveGiftRule) obj;
        return ValueObject.util_equals(this.action, bLiveGiftRule.action) && ValueObject.util_equals(this.scheme, bLiveGiftRule.scheme) && ValueObject.util_equals(this.combosHitNums, bLiveGiftRule.combosHitNums) && ValueObject.util_equals(this.notice, bLiveGiftRule.notice) && ValueObject.util_equals(this.expirationInfos, bLiveGiftRule.expirationInfos) && ValueObject.util_equals(this.combosGears, bLiveGiftRule.combosGears) && this.intervalMs == bLiveGiftRule.intervalMs;
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
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.scheme;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Integer> list = this.combosHitNums;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.notice;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveExpirationItem> list2 = this.expirationInfos;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveGiftCombosGears> list3 = this.combosGears;
        int iHashCode6 = ((iHashCode5 + (list3 != null ? list3.hashCode() : 0)) * 41) + this.intervalMs;
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
        if (this.combosHitNums == null) {
            this.combosHitNums = new ArrayList();
        }
        if (this.notice == null) {
            this.notice = "";
        }
        if (this.expirationInfos == null) {
            this.expirationInfos = new ArrayList();
        }
        if (this.combosGears == null) {
            this.combosGears = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
