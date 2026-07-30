package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Promotions;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class Contract extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contract";

    @NonNull
    @ProtobufIndex(index = 3)
    public String contractStatus;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39583id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String itemName;

    @ProtobufIndex(index = 9)
    public double nextDeductTime;

    @NonNull
    @ProtobufIndex(index = 10)
    public String nextDuductMoney;

    @NonNull
    @ProtobufIndex(index = 2)
    public String platform;

    @NonNull
    @ProtobufIndex(index = 7)
    public ContractProductType productType;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<Promotions> promotions;

    @ProtobufIndex(index = 6)
    public double signTime;

    @ProtobufIndex(index = 8)
    public int signVersion;
    public static ProtobufAdapter<Contract> PROTOBUF_ADAPTER = new MessageNanoAdapter<Contract>() { // from class: com.p1.mobile.putong.data.Contract.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Contract contract) {
            String str = contract.f39583id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = contract.platform;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = contract.contractStatus;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = contract.itemId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = contract.itemName;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(6, contract.signTime);
            ContractProductType contractProductType = contract.productType;
            if (contractProductType != null) {
                iM17277d += CodedOutputByteBufferNano.m17281h(7, contractProductType.ordinal());
            }
            int iM17281h = iM17277d + CodedOutputByteBufferNano.m17281h(8, contract.signVersion) + CodedOutputByteBufferNano.m17277d(9, contract.nextDeductTime);
            String str6 = contract.nextDuductMoney;
            if (str6 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(10, str6);
            }
            List<Promotions> list = contract.promotions;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(11, list, Promotions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ContractProductType contractProductType2 = contract.productType;
            if (contractProductType2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(12, contractProductType2, ContractProductType.PROTOBUF_ADAPTER);
            }
            contract.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Contract parse(nc5 nc5Var) throws IOException {
            Contract contract = new Contract();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (contract.productType == null && numValueOf != null) {
                            contract.productType = (ContractProductType) ContractProductType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (contract.f39583id == null) {
                            contract.f39583id = "";
                        }
                        if (contract.platform == null) {
                            contract.platform = "";
                        }
                        if (contract.contractStatus == null) {
                            contract.contractStatus = "";
                        }
                        if (contract.itemId == null) {
                            contract.itemId = "";
                        }
                        if (contract.itemName == null) {
                            contract.itemName = "";
                        }
                        if (contract.productType == null) {
                            contract.productType = (ContractProductType) ContractProductType.JSON_ADAPTER.defaultEnum();
                        }
                        if (contract.nextDuductMoney == null) {
                            contract.nextDuductMoney = "";
                        }
                        if (contract.promotions == null) {
                            contract.promotions = new ArrayList();
                        }
                        break;
                    case 10:
                        contract.f39583id = nc5Var.m162495s();
                        continue;
                    case 18:
                        contract.platform = nc5Var.m162495s();
                        continue;
                    case 26:
                        contract.contractStatus = nc5Var.m162495s();
                        continue;
                    case 34:
                        contract.itemId = nc5Var.m162495s();
                        continue;
                    case 42:
                        contract.itemName = nc5Var.m162495s();
                        continue;
                    case 49:
                        contract.signTime = nc5Var.m162484h();
                        continue;
                    case 56:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 64:
                        contract.signVersion = nc5Var.m162486j();
                        continue;
                    case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                        contract.nextDeductTime = nc5Var.m162484h();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        contract.nextDuductMoney = nc5Var.m162495s();
                        continue;
                    case 90:
                        contract.promotions = (List) nc5Var.m162488l(Promotions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        contract.productType = (ContractProductType) nc5Var.m162488l(ContractProductType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (contract.productType == null && numValueOf != null) {
                            contract.productType = (ContractProductType) ContractProductType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (contract.f39583id == null) {
                            contract.f39583id = "";
                        }
                        if (contract.platform == null) {
                            contract.platform = "";
                        }
                        if (contract.contractStatus == null) {
                            contract.contractStatus = "";
                        }
                        if (contract.itemId == null) {
                            contract.itemId = "";
                        }
                        if (contract.itemName == null) {
                            contract.itemName = "";
                        }
                        if (contract.productType == null) {
                            contract.productType = (ContractProductType) ContractProductType.JSON_ADAPTER.defaultEnum();
                        }
                        if (contract.nextDuductMoney == null) {
                            contract.nextDuductMoney = "";
                        }
                        if (contract.promotions == null) {
                            contract.promotions = new ArrayList();
                            return contract;
                        }
                        break;
                }
            }
            return contract;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Contract contract, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = contract.f39583id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = contract.platform;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = contract.contractStatus;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = contract.itemId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = contract.itemName;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            codedOutputByteBufferNano.m17301C(6, contract.signTime);
            ContractProductType contractProductType = contract.productType;
            if (contractProductType != null) {
                codedOutputByteBufferNano.m17305G(7, contractProductType.ordinal());
            }
            codedOutputByteBufferNano.m17305G(8, contract.signVersion);
            codedOutputByteBufferNano.m17301C(9, contract.nextDeductTime);
            String str6 = contract.nextDuductMoney;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(10, str6);
            }
            List<Promotions> list = contract.promotions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(11, list, Promotions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ContractProductType contractProductType2 = contract.productType;
            if (contractProductType2 != null) {
                codedOutputByteBufferNano.m17309K(12, contractProductType2, ContractProductType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Contract> JSON_ADAPTER = new ObjectJsonAdapter<Contract>() { // from class: com.p1.mobile.putong.data.Contract.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Contract.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Contract newInstance() {
            return new Contract();
        }

        public boolean parseField(Contract contract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "productType":
                    contract.productType = ContractProductType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "itemId":
                    contract.itemId = jsonParser.getValueAsString();
                    return true;
                case "signVersion":
                    contract.signVersion = jsonParser.getValueAsInt();
                    return true;
                case "nextDuductMoney":
                    contract.nextDuductMoney = jsonParser.getValueAsString();
                    return true;
                case "id":
                    contract.f39583id = jsonParser.getValueAsString();
                    return false;
                case "nextDeductTime":
                    contract.nextDeductTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "signTime":
                    contract.signTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "contractStatus":
                    contract.contractStatus = jsonParser.getValueAsString();
                    return true;
                case "promotions":
                    contract.promotions = JsonAdapter.parseArray(jsonParser, Promotions.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "itemName":
                    contract.itemName = jsonParser.getValueAsString();
                    return true;
                case "platform":
                    contract.platform = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Contract contract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "productType":
                case "itemId":
                case "signVersion":
                case "nextDuductMoney":
                    return true;
                case "id":
                    return false;
                case "nextDeductTime":
                case "signTime":
                case "contractStatus":
                case "promotions":
                case "itemName":
                case "platform":
                    return true;
                default:
                    return super.parseFieldCheck(contract, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Contract contract, JsonGenerator jsonGenerator) throws IOException {
            String str = contract.f39583id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = contract.platform;
            if (str2 != null) {
                jsonGenerator.writeStringField("platform", str2);
            }
            String str3 = contract.contractStatus;
            if (str3 != null) {
                jsonGenerator.writeStringField("contractStatus", str3);
            }
            String str4 = contract.itemId;
            if (str4 != null) {
                jsonGenerator.writeStringField("itemId", str4);
            }
            String str5 = contract.itemName;
            if (str5 != null) {
                jsonGenerator.writeStringField("itemName", str5);
            }
            jsonGenerator.writeFieldName("signTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(contract.signTime), jsonGenerator, true);
            if (contract.productType != null) {
                jsonGenerator.writeFieldName("productType");
                ContractProductType.JSON_ADAPTER.serialize(contract.productType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("signVersion", contract.signVersion);
            jsonGenerator.writeFieldName("nextDeductTime");
            jsonAdapter.serialize(Double.valueOf(contract.nextDeductTime), jsonGenerator, true);
            String str6 = contract.nextDuductMoney;
            if (str6 != null) {
                jsonGenerator.writeStringField("nextDuductMoney", str6);
            }
            if (contract.promotions != null) {
                jsonGenerator.writeFieldName(Promotions.TYPE);
                JsonAdapter.serializeArray(contract.promotions, jsonGenerator, Promotions.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Contract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Contract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Contract new_() {
        Contract contract = new Contract();
        contract.nullCheck();
        return contract;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Contract mo225055clone() {
        Contract contract = new Contract();
        contract.f39583id = this.f39583id;
        contract.platform = this.platform;
        contract.contractStatus = this.contractStatus;
        contract.itemId = this.itemId;
        contract.itemName = this.itemName;
        contract.signTime = this.signTime;
        contract.productType = this.productType;
        contract.signVersion = this.signVersion;
        contract.nextDeductTime = this.nextDeductTime;
        contract.nextDuductMoney = this.nextDuductMoney;
        List<Promotions> list = this.promotions;
        if (list != null) {
            contract.promotions = ValueObject.util_map(list, new qcj() { // from class: l.w26
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Promotions) obj).mo225055clone();
                }
            });
        }
        return contract;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Contract)) {
            return false;
        }
        Contract contract = (Contract) obj;
        return ValueObject.util_equals(this.f39583id, contract.f39583id) && ValueObject.util_equals(this.platform, contract.platform) && ValueObject.util_equals(this.contractStatus, contract.contractStatus) && ValueObject.util_equals(this.itemId, contract.itemId) && ValueObject.util_equals(this.itemName, contract.itemName) && this.signTime == contract.signTime && ValueObject.util_equals(this.productType, contract.productType) && this.signVersion == contract.signVersion && this.nextDeductTime == contract.nextDeductTime && ValueObject.util_equals(this.nextDuductMoney, contract.nextDuductMoney) && ValueObject.util_equals(this.promotions, contract.promotions);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "contract";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f39583id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.contractStatus;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.itemId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.itemName;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.signTime);
        int i3 = (((iHashCode4 + iHashCode5) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        ContractProductType contractProductType = this.productType;
        int iHashCode6 = ((i3 + (contractProductType != null ? contractProductType.hashCode() : 0)) * 41) + this.signVersion;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.nextDeductTime);
        int i4 = ((iHashCode6 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str6 = this.nextDuductMoney;
        int iHashCode7 = (i4 + (str6 != null ? str6.hashCode() : 0)) * 41;
        List<Promotions> list = this.promotions;
        int iHashCode8 = iHashCode7 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39583id == null) {
            this.f39583id = "";
        }
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.contractStatus == null) {
            this.contractStatus = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.itemName == null) {
            this.itemName = "";
        }
        if (this.productType == null) {
            this.productType = (ContractProductType) ContractProductType.JSON_ADAPTER.defaultEnum();
        }
        if (this.nextDuductMoney == null) {
            this.nextDuductMoney = "";
        }
        if (this.promotions == null) {
            this.promotions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
