package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDailyPayment;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveDailyPayment extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDailyPayment> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDailyPayment>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDailyPayment.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDailyPayment.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDailyPayment newInstance() {
            return new BLiveDailyPayment();
        }

        public boolean parseField(BLiveDailyPayment bLiveDailyPayment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isDailyLimitOn":
                    bLiveDailyPayment.isDailyLimitOn = jsonParser.getValueAsBoolean();
                    return true;
                case "dailyAmount":
                    bLiveDailyPayment.dailyAmount = jsonParser.getValueAsInt();
                    return true;
                case "ruleComment":
                    bLiveDailyPayment.ruleComment = jsonParser.getValueAsString();
                    return true;
                case "defaultAmounts":
                    bLiveDailyPayment.defaultAmounts = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDailyPayment bLiveDailyPayment, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isDailyLimitOn", bLiveDailyPayment.isDailyLimitOn);
            jsonGenerator.writeNumberField("dailyAmount", bLiveDailyPayment.dailyAmount);
            String str = bLiveDailyPayment.ruleComment;
            if (str != null) {
                jsonGenerator.writeStringField("ruleComment", str);
            }
            if (bLiveDailyPayment.defaultAmounts != null) {
                jsonGenerator.writeFieldName("defaultAmounts");
                JsonAdapter.serializeArray(bLiveDailyPayment.defaultAmounts, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDailyPayment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedailypayment";

    @ProtobufIndex(index = 2)
    public int dailyAmount;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Integer> defaultAmounts;

    @ProtobufIndex(index = 1)
    public boolean isDailyLimitOn;

    @NonNull
    @ProtobufIndex(index = 3)
    public String ruleComment;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m68947a(Integer num) {
        return num;
    }

    public static BLiveDailyPayment new_() {
        BLiveDailyPayment bLiveDailyPayment = new BLiveDailyPayment();
        bLiveDailyPayment.nullCheck();
        return bLiveDailyPayment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDailyPayment mo225055clone() {
        BLiveDailyPayment bLiveDailyPayment = new BLiveDailyPayment();
        bLiveDailyPayment.isDailyLimitOn = this.isDailyLimitOn;
        bLiveDailyPayment.dailyAmount = this.dailyAmount;
        bLiveDailyPayment.ruleComment = this.ruleComment;
        List<Integer> list = this.defaultAmounts;
        if (list != null) {
            bLiveDailyPayment.defaultAmounts = ValueObject.util_map(list, new qcj() { // from class: l.bt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveDailyPayment.m68947a((Integer) obj);
                }
            });
        }
        return bLiveDailyPayment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDailyPayment)) {
            return false;
        }
        BLiveDailyPayment bLiveDailyPayment = (BLiveDailyPayment) obj;
        return this.isDailyLimitOn == bLiveDailyPayment.isDailyLimitOn && this.dailyAmount == bLiveDailyPayment.dailyAmount && ValueObject.util_equals(this.ruleComment, bLiveDailyPayment.ruleComment) && ValueObject.util_equals(this.defaultAmounts, bLiveDailyPayment.defaultAmounts);
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
        int i2 = ((((i * 41) + (this.isDailyLimitOn ? 1231 : 1237)) * 41) + this.dailyAmount) * 41;
        String str = this.ruleComment;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Integer> list = this.defaultAmounts;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ruleComment == null) {
            this.ruleComment = "";
        }
        if (this.defaultAmounts == null) {
            this.defaultAmounts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
