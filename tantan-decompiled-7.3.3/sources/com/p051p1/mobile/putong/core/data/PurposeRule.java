package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.PurposeItemData;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class PurposeRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purposerule";

    @ProtobufIndex(index = 1)
    public boolean cardShowPurpose;

    @ProtobufIndex(index = 2)
    public int picNum;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<PurposeItemData> purposeRule;
    public static ProtobufAdapter<PurposeRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurposeRule>() { // from class: com.p1.mobile.putong.core.data.PurposeRule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PurposeRule purposeRule) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, purposeRule.cardShowPurpose) + CodedOutputByteBufferNano.m17281h(2, purposeRule.picNum);
            List<PurposeItemData> list = purposeRule.purposeRule;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, list, PurposeItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            purposeRule.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PurposeRule parse(nc5 nc5Var) throws IOException {
            PurposeRule purposeRule = new PurposeRule();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (purposeRule.purposeRule != null) {
                        break;
                    }
                    purposeRule.purposeRule = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    purposeRule.cardShowPurpose = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    purposeRule.picNum = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (purposeRule.purposeRule != null) {
                            break;
                        }
                        purposeRule.purposeRule = new ArrayList();
                        return purposeRule;
                    }
                    purposeRule.purposeRule = (List) nc5Var.m162488l(PurposeItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return purposeRule;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PurposeRule purposeRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, purposeRule.cardShowPurpose);
            codedOutputByteBufferNano.m17305G(2, purposeRule.picNum);
            List<PurposeItemData> list = purposeRule.purposeRule;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, PurposeItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PurposeRule> JSON_ADAPTER = new ObjectJsonAdapter<PurposeRule>() { // from class: com.p1.mobile.putong.core.data.PurposeRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PurposeRule.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PurposeRule newInstance() {
            return new PurposeRule();
        }

        public boolean parseField(PurposeRule purposeRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picNum":
                    purposeRule.picNum = jsonParser.getValueAsInt();
                    return true;
                case "cardShowPurpose":
                    purposeRule.cardShowPurpose = jsonParser.getValueAsBoolean();
                    return true;
                case "purposeRule":
                    purposeRule.purposeRule = JsonAdapter.parseArray(jsonParser, PurposeItemData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PurposeRule purposeRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picNum":
                case "cardShowPurpose":
                case "purposeRule":
                    return true;
                default:
                    return super.parseFieldCheck(purposeRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PurposeRule purposeRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("cardShowPurpose", purposeRule.cardShowPurpose);
            jsonGenerator.writeNumberField("picNum", purposeRule.picNum);
            if (purposeRule.purposeRule != null) {
                jsonGenerator.writeFieldName("purposeRule");
                JsonAdapter.serializeArray(purposeRule.purposeRule, jsonGenerator, PurposeItemData.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurposeRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurposeRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurposeRule new_() {
        PurposeRule purposeRule = new PurposeRule();
        purposeRule.nullCheck();
        return purposeRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PurposeRule mo225055clone() {
        PurposeRule purposeRule = new PurposeRule();
        purposeRule.cardShowPurpose = this.cardShowPurpose;
        purposeRule.picNum = this.picNum;
        List<PurposeItemData> list = this.purposeRule;
        if (list != null) {
            purposeRule.purposeRule = ValueObject.util_map(list, new qcj() { // from class: l.zkb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PurposeItemData) obj).mo225055clone();
                }
            });
        }
        return purposeRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurposeRule)) {
            return false;
        }
        PurposeRule purposeRule = (PurposeRule) obj;
        return this.cardShowPurpose == purposeRule.cardShowPurpose && this.picNum == purposeRule.picNum && ValueObject.util_equals(this.purposeRule, purposeRule.purposeRule);
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
        int i2 = ((((i * 41) + (this.cardShowPurpose ? 1231 : 1237)) * 41) + this.picNum) * 41;
        List<PurposeItemData> list = this.purposeRule;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.purposeRule == null) {
            this.purposeRule = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
