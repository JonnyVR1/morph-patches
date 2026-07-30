package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.PurposeItemData;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PurposeRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purposerule";

    @ProtobufIndex(index = 1)
    public boolean cardShowPurpose;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int picNum;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<PurposeItemData> purposeRule;
    public static ProtobufAdapter<PurposeRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurposeRule>() { // from class: com.p1.mobile.putong.core.data.PurposeRule.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PurposeRule purposeRule) {
            int iB = CodedOutputByteBufferNano.b(1, purposeRule.cardShowPurpose) + CodedOutputByteBufferNano.h(2, purposeRule.picNum);
            List<PurposeItemData> list = purposeRule.purposeRule;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(3, list, PurposeItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) purposeRule).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PurposeRule m15097parse(nb5 nb5Var) throws IOException {
            PurposeRule purposeRule = new PurposeRule();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (purposeRule.purposeRule != null) {
                        break;
                    }
                    purposeRule.purposeRule = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    purposeRule.cardShowPurpose = nb5Var.g();
                } else if (iU == 16) {
                    purposeRule.picNum = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (purposeRule.purposeRule != null) {
                            break;
                        }
                        purposeRule.purposeRule = new ArrayList();
                        return purposeRule;
                    }
                    purposeRule.purposeRule = (List) nb5Var.l(PurposeItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return purposeRule;
        }

        public void serialize(PurposeRule purposeRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, purposeRule.cardShowPurpose);
            codedOutputByteBufferNano.G(2, purposeRule.picNum);
            List<PurposeItemData> list = purposeRule.purposeRule;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, PurposeItemData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PurposeRule> JSON_ADAPTER = new ObjectJsonAdapter<PurposeRule>() { // from class: com.p1.mobile.putong.core.data.PurposeRule.2
        public Class getDataClass() {
            return PurposeRule.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PurposeRule m15098newInstance() {
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

        public void serializeFields(PurposeRule purposeRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("cardShowPurpose", purposeRule.cardShowPurpose);
            jsonGenerator.writeNumberField("picNum", purposeRule.picNum);
            if (purposeRule.purposeRule != null) {
                jsonGenerator.writeFieldName("purposeRule");
                JsonAdapter.serializeArray(purposeRule.purposeRule, jsonGenerator, PurposeItemData.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurposeRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurposeRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurposeRule new_() {
        PurposeRule purposeRule = new PurposeRule();
        purposeRule.nullCheck();
        return purposeRule;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PurposeRule m15096clone() {
        PurposeRule purposeRule = new PurposeRule();
        purposeRule.cardShowPurpose = this.cardShowPurpose;
        purposeRule.picNum = this.picNum;
        List<PurposeItemData> list = this.purposeRule;
        if (list != null) {
            purposeRule.purposeRule = ValueObject.util_map(list, new w9j() { // from class: l.vcb0
                public final Object call(Object obj) {
                    return ((PurposeItemData) obj).m15092clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.cardShowPurpose ? 1231 : 1237)) * 41) + this.picNum) * 41;
        List<PurposeItemData> list = this.purposeRule;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.purposeRule == null) {
            this.purposeRule = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
