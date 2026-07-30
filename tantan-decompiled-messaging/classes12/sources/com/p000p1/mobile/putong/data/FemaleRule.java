package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.FemaleRule;
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
public class FemaleRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "femalerule";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Integer> rewardsCardsNumber;

    @ProtobufIndex(index = 1)
    public int seeListConditions;

    @ProtobufIndex(index = 2)
    public int toastConditions;
    public static ProtobufAdapter<FemaleRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<FemaleRule>() { // from class: com.p1.mobile.putong.data.FemaleRule.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FemaleRule femaleRule) {
            int iH = CodedOutputByteBufferNano.h(1, femaleRule.seeListConditions) + CodedOutputByteBufferNano.h(2, femaleRule.toastConditions);
            List<Integer> list = femaleRule.rewardsCardsNumber;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) femaleRule).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FemaleRule m18097parse(nb5 nb5Var) throws IOException {
            FemaleRule femaleRule = new FemaleRule();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (femaleRule.rewardsCardsNumber != null) {
                        break;
                    }
                    femaleRule.rewardsCardsNumber = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    femaleRule.seeListConditions = nb5Var.j();
                } else if (iU == 16) {
                    femaleRule.toastConditions = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (femaleRule.rewardsCardsNumber != null) {
                            break;
                        }
                        femaleRule.rewardsCardsNumber = new ArrayList();
                        return femaleRule;
                    }
                    femaleRule.rewardsCardsNumber = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return femaleRule;
        }

        public void serialize(FemaleRule femaleRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, femaleRule.seeListConditions);
            codedOutputByteBufferNano.G(2, femaleRule.toastConditions);
            List<Integer> list = femaleRule.rewardsCardsNumber;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FemaleRule> JSON_ADAPTER = new ObjectJsonAdapter<FemaleRule>() { // from class: com.p1.mobile.putong.data.FemaleRule.2
        public Class getDataClass() {
            return FemaleRule.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FemaleRule mo17830newInstance() {
            return new FemaleRule();
        }

        public boolean parseField(FemaleRule femaleRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "seeListConditions":
                    femaleRule.seeListConditions = jsonParser.getValueAsInt();
                    return true;
                case "rewardsCardsNumber":
                    femaleRule.rewardsCardsNumber = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "toastConditions":
                    femaleRule.toastConditions = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FemaleRule femaleRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "seeListConditions":
                case "rewardsCardsNumber":
                case "toastConditions":
                    return true;
                default:
                    return super.parseFieldCheck(femaleRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FemaleRule femaleRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("seeListConditions", femaleRule.seeListConditions);
            jsonGenerator.writeNumberField("toastConditions", femaleRule.toastConditions);
            if (femaleRule.rewardsCardsNumber != null) {
                jsonGenerator.writeFieldName("rewardsCardsNumber");
                JsonAdapter.serializeArray(femaleRule.rewardsCardsNumber, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FemaleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FemaleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m691a(Integer num) {
        return num;
    }

    public static FemaleRule new_() {
        FemaleRule femaleRule = new FemaleRule();
        femaleRule.nullCheck();
        return femaleRule;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FemaleRule m18096clone() {
        FemaleRule femaleRule = new FemaleRule();
        femaleRule.seeListConditions = this.seeListConditions;
        femaleRule.toastConditions = this.toastConditions;
        List<Integer> list = this.rewardsCardsNumber;
        if (list != null) {
            femaleRule.rewardsCardsNumber = ValueObject.util_map(list, new w9j() { // from class: l.kci
                public final Object call(Object obj) {
                    return FemaleRule.m691a((Integer) obj);
                }
            });
        }
        return femaleRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FemaleRule)) {
            return false;
        }
        FemaleRule femaleRule = (FemaleRule) obj;
        return this.seeListConditions == femaleRule.seeListConditions && this.toastConditions == femaleRule.toastConditions && ValueObject.util_equals(this.rewardsCardsNumber, femaleRule.rewardsCardsNumber);
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
        List<Integer> list = this.rewardsCardsNumber;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.rewardsCardsNumber == null) {
            this.rewardsCardsNumber = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
