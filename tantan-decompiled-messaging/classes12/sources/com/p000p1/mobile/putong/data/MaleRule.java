package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.SlideCardsAndReward;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MaleRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "malerule";

    @ProtobufIndex(index = 1)
    public int seeListConditions;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<SlideCardsAndReward> slideCardsAndRewards;

    @ProtobufIndex(index = 2)
    public int toastConditions;
    public static ProtobufAdapter<MaleRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<MaleRule>() { // from class: com.p1.mobile.putong.data.MaleRule.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MaleRule maleRule) {
            int iH = CodedOutputByteBufferNano.h(1, maleRule.seeListConditions) + CodedOutputByteBufferNano.h(2, maleRule.toastConditions);
            List<SlideCardsAndReward> list = maleRule.slideCardsAndRewards;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, SlideCardsAndReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) maleRule).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MaleRule m18424parse(nb5 nb5Var) throws IOException {
            MaleRule maleRule = new MaleRule();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (maleRule.slideCardsAndRewards != null) {
                        break;
                    }
                    maleRule.slideCardsAndRewards = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    maleRule.seeListConditions = nb5Var.j();
                } else if (iU == 16) {
                    maleRule.toastConditions = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (maleRule.slideCardsAndRewards != null) {
                            break;
                        }
                        maleRule.slideCardsAndRewards = new ArrayList();
                        return maleRule;
                    }
                    maleRule.slideCardsAndRewards = (List) nb5Var.l(SlideCardsAndReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return maleRule;
        }

        public void serialize(MaleRule maleRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, maleRule.seeListConditions);
            codedOutputByteBufferNano.G(2, maleRule.toastConditions);
            List<SlideCardsAndReward> list = maleRule.slideCardsAndRewards;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, SlideCardsAndReward.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MaleRule> JSON_ADAPTER = new ObjectJsonAdapter<MaleRule>() { // from class: com.p1.mobile.putong.data.MaleRule.2
        public Class getDataClass() {
            return MaleRule.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MaleRule mo17830newInstance() {
            return new MaleRule();
        }

        public boolean parseField(MaleRule maleRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "seeListConditions":
                    maleRule.seeListConditions = jsonParser.getValueAsInt();
                    return true;
                case "slideCardsAndRewards":
                    maleRule.slideCardsAndRewards = JsonAdapter.parseArray(jsonParser, SlideCardsAndReward.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "toastConditions":
                    maleRule.toastConditions = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MaleRule maleRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "seeListConditions":
                case "slideCardsAndRewards":
                case "toastConditions":
                    return true;
                default:
                    return super.parseFieldCheck(maleRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MaleRule maleRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("seeListConditions", maleRule.seeListConditions);
            jsonGenerator.writeNumberField("toastConditions", maleRule.toastConditions);
            if (maleRule.slideCardsAndRewards != null) {
                jsonGenerator.writeFieldName("slideCardsAndRewards");
                JsonAdapter.serializeArray(maleRule.slideCardsAndRewards, jsonGenerator, SlideCardsAndReward.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MaleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MaleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MaleRule new_() {
        MaleRule maleRule = new MaleRule();
        maleRule.nullCheck();
        return maleRule;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MaleRule m18423clone() {
        MaleRule maleRule = new MaleRule();
        maleRule.seeListConditions = this.seeListConditions;
        maleRule.toastConditions = this.toastConditions;
        List<SlideCardsAndReward> list = this.slideCardsAndRewards;
        if (list != null) {
            maleRule.slideCardsAndRewards = ValueObject.util_map(list, new w9j() { // from class: l.drw
                public final Object call(Object obj) {
                    return ((SlideCardsAndReward) obj).m18982clone();
                }
            });
        }
        return maleRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaleRule)) {
            return false;
        }
        MaleRule maleRule = (MaleRule) obj;
        return this.seeListConditions == maleRule.seeListConditions && this.toastConditions == maleRule.toastConditions && ValueObject.util_equals(this.slideCardsAndRewards, maleRule.slideCardsAndRewards);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.seeListConditions) * 41) + this.toastConditions) * 41;
        List<SlideCardsAndReward> list = this.slideCardsAndRewards;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.slideCardsAndRewards == null) {
            this.slideCardsAndRewards = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
