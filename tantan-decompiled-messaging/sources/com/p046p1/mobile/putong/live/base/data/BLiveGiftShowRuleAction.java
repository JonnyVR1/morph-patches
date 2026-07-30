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
public class BLiveGiftShowRuleAction extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftShowRuleAction> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftShowRuleAction>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftShowRuleAction.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftShowRuleAction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftShowRuleAction newInstance() {
            return new BLiveGiftShowRuleAction();
        }

        public boolean parseField(BLiveGiftShowRuleAction bLiveGiftShowRuleAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("frequency")) {
                bLiveGiftShowRuleAction.frequency = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            bLiveGiftShowRuleAction.type = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftShowRuleAction bLiveGiftShowRuleAction, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftShowRuleAction.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveGiftShowRuleAction.frequency;
            if (str2 != null) {
                jsonGenerator.writeStringField("frequency", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftShowRuleAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftshowruleaction";

    @NonNull
    @ProtobufIndex(index = 2)
    public String frequency;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveGiftShowRuleAction new_() {
        BLiveGiftShowRuleAction bLiveGiftShowRuleAction = new BLiveGiftShowRuleAction();
        bLiveGiftShowRuleAction.nullCheck();
        return bLiveGiftShowRuleAction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftShowRuleAction mo223809clone() {
        BLiveGiftShowRuleAction bLiveGiftShowRuleAction = new BLiveGiftShowRuleAction();
        bLiveGiftShowRuleAction.type = this.type;
        bLiveGiftShowRuleAction.frequency = this.frequency;
        return bLiveGiftShowRuleAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftShowRuleAction)) {
            return false;
        }
        BLiveGiftShowRuleAction bLiveGiftShowRuleAction = (BLiveGiftShowRuleAction) obj;
        return ValueObject.util_equals(this.type, bLiveGiftShowRuleAction.type) && ValueObject.util_equals(this.frequency, bLiveGiftShowRuleAction.frequency);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.frequency;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.frequency == null) {
            this.frequency = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
