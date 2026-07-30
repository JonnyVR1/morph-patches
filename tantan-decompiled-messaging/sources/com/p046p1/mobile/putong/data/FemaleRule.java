package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.FemaleRule;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FemaleRule femaleRule) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, femaleRule.seeListConditions) + CodedOutputByteBufferNano.m17226h(2, femaleRule.toastConditions);
            List<Integer> list = femaleRule.rewardsCardsNumber;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            femaleRule.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FemaleRule parse(nb5 nb5Var) throws IOException {
            FemaleRule femaleRule = new FemaleRule();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (femaleRule.rewardsCardsNumber != null) {
                        break;
                    }
                    femaleRule.rewardsCardsNumber = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    femaleRule.seeListConditions = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    femaleRule.toastConditions = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (femaleRule.rewardsCardsNumber != null) {
                            break;
                        }
                        femaleRule.rewardsCardsNumber = new ArrayList();
                        return femaleRule;
                    }
                    femaleRule.rewardsCardsNumber = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return femaleRule;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FemaleRule femaleRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, femaleRule.seeListConditions);
            codedOutputByteBufferNano.m17250G(2, femaleRule.toastConditions);
            List<Integer> list = femaleRule.rewardsCardsNumber;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FemaleRule> JSON_ADAPTER = new ObjectJsonAdapter<FemaleRule>() { // from class: com.p1.mobile.putong.data.FemaleRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FemaleRule.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FemaleRule newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FemaleRule femaleRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("seeListConditions", femaleRule.seeListConditions);
            jsonGenerator.writeNumberField("toastConditions", femaleRule.toastConditions);
            if (femaleRule.rewardsCardsNumber != null) {
                jsonGenerator.writeFieldName("rewardsCardsNumber");
                JsonAdapter.serializeArray(femaleRule.rewardsCardsNumber, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FemaleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FemaleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m59773a(Integer num) {
        return num;
    }

    public static FemaleRule new_() {
        FemaleRule femaleRule = new FemaleRule();
        femaleRule.nullCheck();
        return femaleRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FemaleRule mo223809clone() {
        FemaleRule femaleRule = new FemaleRule();
        femaleRule.seeListConditions = this.seeListConditions;
        femaleRule.toastConditions = this.toastConditions;
        List<Integer> list = this.rewardsCardsNumber;
        if (list != null) {
            femaleRule.rewardsCardsNumber = ValueObject.util_map(list, new w9j() { // from class: l.kci
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FemaleRule.m59773a((Integer) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.seeListConditions) * 41) + this.toastConditions) * 41;
        List<Integer> list = this.rewardsCardsNumber;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.rewardsCardsNumber == null) {
            this.rewardsCardsNumber = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
