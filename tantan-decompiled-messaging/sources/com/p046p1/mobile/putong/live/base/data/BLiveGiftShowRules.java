package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveGiftShowRules extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftShowRules> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftShowRules>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftShowRules.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftShowRules.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftShowRules newInstance() {
            return new BLiveGiftShowRules();
        }

        public boolean parseField(BLiveGiftShowRules bLiveGiftShowRules, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("banner")) {
                bLiveGiftShowRules.banner = BLiveGiftShowTipsConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("showAction")) {
                return false;
            }
            bLiveGiftShowRules.showAction = BLiveGiftShowRuleAction.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftShowRules bLiveGiftShowRules, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveGiftShowRules.showAction != null) {
                jsonGenerator.writeFieldName("showAction");
                BLiveGiftShowRuleAction.JSON_ADAPTER.serialize(bLiveGiftShowRules.showAction, jsonGenerator, true);
            }
            if (bLiveGiftShowRules.banner != null) {
                jsonGenerator.writeFieldName("banner");
                BLiveGiftShowTipsConfig.JSON_ADAPTER.serialize(bLiveGiftShowRules.banner, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftShowRules) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftshowrules";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGiftShowTipsConfig banner;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveGiftShowRuleAction showAction;

    public static BLiveGiftShowRules new_() {
        BLiveGiftShowRules bLiveGiftShowRules = new BLiveGiftShowRules();
        bLiveGiftShowRules.nullCheck();
        return bLiveGiftShowRules;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftShowRules mo223809clone() {
        BLiveGiftShowRules bLiveGiftShowRules = new BLiveGiftShowRules();
        BLiveGiftShowRuleAction bLiveGiftShowRuleAction = this.showAction;
        if (bLiveGiftShowRuleAction != null) {
            bLiveGiftShowRules.showAction = bLiveGiftShowRuleAction.mo223809clone();
        }
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = this.banner;
        if (bLiveGiftShowTipsConfig != null) {
            bLiveGiftShowRules.banner = bLiveGiftShowTipsConfig.mo223809clone();
        }
        return bLiveGiftShowRules;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftShowRules)) {
            return false;
        }
        BLiveGiftShowRules bLiveGiftShowRules = (BLiveGiftShowRules) obj;
        return ValueObject.util_equals(this.showAction, bLiveGiftShowRules.showAction) && ValueObject.util_equals(this.banner, bLiveGiftShowRules.banner);
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
        BLiveGiftShowRuleAction bLiveGiftShowRuleAction = this.showAction;
        int iHashCode = (i2 + (bLiveGiftShowRuleAction != null ? bLiveGiftShowRuleAction.hashCode() : 0)) * 41;
        BLiveGiftShowTipsConfig bLiveGiftShowTipsConfig = this.banner;
        int iHashCode2 = iHashCode + (bLiveGiftShowTipsConfig != null ? bLiveGiftShowTipsConfig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showAction == null) {
            this.showAction = BLiveGiftShowRuleAction.new_();
        }
        if (this.banner == null) {
            this.banner = BLiveGiftShowTipsConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
