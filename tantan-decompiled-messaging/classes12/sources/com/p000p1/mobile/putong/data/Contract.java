package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Promotions;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
public class Contract extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contract";

    @NonNull
    @ProtobufIndex(index = 3)
    public String contractStatus;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f196id;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Contract contract) {
            String str = contract.f196id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = contract.platform;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = contract.contractStatus;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = contract.itemId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = contract.itemName;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iD = iO + CodedOutputByteBufferNano.d(6, contract.signTime);
            ContractProductType contractProductType = contract.productType;
            if (contractProductType != null) {
                iD += CodedOutputByteBufferNano.h(7, contractProductType.ordinal());
            }
            int iH = iD + CodedOutputByteBufferNano.h(8, contract.signVersion) + CodedOutputByteBufferNano.d(9, contract.nextDeductTime);
            String str6 = contract.nextDuductMoney;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(10, str6);
            }
            List<Promotions> list = contract.promotions;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(11, list, Promotions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ContractProductType contractProductType2 = contract.productType;
            if (contractProductType2 != null) {
                iH += CodedOutputByteBufferNano.l(12, contractProductType2, ContractProductType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) contract).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Contract m17854parse(nb5 nb5Var) throws IOException {
            Contract contract = new Contract();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (contract.productType == null && numValueOf != null) {
                            contract.productType = (ContractProductType) ContractProductType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (contract.f196id == null) {
                            contract.f196id = "";
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
                        contract.f196id = nb5Var.s();
                        continue;
                    case 18:
                        contract.platform = nb5Var.s();
                        continue;
                    case 26:
                        contract.contractStatus = nb5Var.s();
                        continue;
                    case 34:
                        contract.itemId = nb5Var.s();
                        continue;
                    case 42:
                        contract.itemName = nb5Var.s();
                        continue;
                    case 49:
                        contract.signTime = nb5Var.h();
                        continue;
                    case 56:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        contract.signVersion = nb5Var.j();
                        continue;
                    case 73:
                        contract.nextDeductTime = nb5Var.h();
                        continue;
                    case 82:
                        contract.nextDuductMoney = nb5Var.s();
                        continue;
                    case 90:
                        contract.promotions = (List) nb5Var.l(Promotions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        contract.productType = (ContractProductType) nb5Var.l(ContractProductType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (contract.productType == null && numValueOf != null) {
                            contract.productType = (ContractProductType) ContractProductType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (contract.f196id == null) {
                            contract.f196id = "";
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

        public void serialize(Contract contract, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = contract.f196id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = contract.platform;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = contract.contractStatus;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = contract.itemId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = contract.itemName;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.C(6, contract.signTime);
            ContractProductType contractProductType = contract.productType;
            if (contractProductType != null) {
                codedOutputByteBufferNano.G(7, contractProductType.ordinal());
            }
            codedOutputByteBufferNano.G(8, contract.signVersion);
            codedOutputByteBufferNano.C(9, contract.nextDeductTime);
            String str6 = contract.nextDuductMoney;
            if (str6 != null) {
                codedOutputByteBufferNano.R(10, str6);
            }
            List<Promotions> list = contract.promotions;
            if (list != null) {
                codedOutputByteBufferNano.K(11, list, Promotions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ContractProductType contractProductType2 = contract.productType;
            if (contractProductType2 != null) {
                codedOutputByteBufferNano.K(12, contractProductType2, ContractProductType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Contract> JSON_ADAPTER = new ObjectJsonAdapter<Contract>() { // from class: com.p1.mobile.putong.data.Contract.2
        public Class getDataClass() {
            return Contract.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Contract mo17830newInstance() {
            return new Contract();
        }

        public boolean parseField(Contract contract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "productType":
                    contract.productType = (ContractProductType) ContractProductType.JSON_ADAPTER.parse(jsonParser, str2);
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
                    contract.f196id = jsonParser.getValueAsString();
                    return false;
                case "nextDeductTime":
                    contract.nextDeductTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "signTime":
                    contract.signTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Contract contract, JsonGenerator jsonGenerator) throws IOException {
            String str = contract.f196id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Contract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Contract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Contract new_() {
        Contract contract = new Contract();
        contract.nullCheck();
        return contract;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Contract m17853clone() {
        Contract contract = new Contract();
        contract.f196id = this.f196id;
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
            contract.promotions = ValueObject.util_map(list, new w9j() { // from class: l.r16
                public final Object call(Object obj) {
                    return ((Promotions) obj).m18855clone();
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
        return ValueObject.util_equals(this.f196id, contract.f196id) && ValueObject.util_equals(this.platform, contract.platform) && ValueObject.util_equals(this.contractStatus, contract.contractStatus) && ValueObject.util_equals(this.itemId, contract.itemId) && ValueObject.util_equals(this.itemName, contract.itemName) && this.signTime == contract.signTime && ValueObject.util_equals(this.productType, contract.productType) && this.signVersion == contract.signVersion && this.nextDeductTime == contract.nextDeductTime && ValueObject.util_equals(this.nextDuductMoney, contract.nextDuductMoney) && ValueObject.util_equals(this.promotions, contract.promotions);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f196id;
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
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.f196id == null) {
            this.f196id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
