package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.LoveLetterGroupState;
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
public class BLiveUpgradeGiftRule extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftRule> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftRule>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftRule.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftRule.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftRule newInstance() {
            return new BLiveUpgradeGiftRule();
        }

        public boolean parseField(BLiveUpgradeGiftRule bLiveUpgradeGiftRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(LoveLetterGroupState.entrance)) {
                return false;
            }
            bLiveUpgradeGiftRule.entrance = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftRule bLiveUpgradeGiftRule, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUpgradeGiftRule.entrance;
            if (str != null) {
                jsonGenerator.writeStringField(LoveLetterGroupState.entrance, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftrule";

    @NonNull
    @ProtobufIndex(index = 1)
    public String entrance;

    public static BLiveUpgradeGiftRule new_() {
        BLiveUpgradeGiftRule bLiveUpgradeGiftRule = new BLiveUpgradeGiftRule();
        bLiveUpgradeGiftRule.nullCheck();
        return bLiveUpgradeGiftRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftRule mo223809clone() {
        BLiveUpgradeGiftRule bLiveUpgradeGiftRule = new BLiveUpgradeGiftRule();
        bLiveUpgradeGiftRule.entrance = this.entrance;
        return bLiveUpgradeGiftRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveUpgradeGiftRule) {
            return ValueObject.util_equals(this.entrance, ((BLiveUpgradeGiftRule) obj).entrance);
        }
        return false;
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
        String str = this.entrance;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.entrance == null) {
            this.entrance = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
