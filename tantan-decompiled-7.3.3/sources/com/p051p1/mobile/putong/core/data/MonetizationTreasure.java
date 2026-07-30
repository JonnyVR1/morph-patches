package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Bags;
import com.p051p1.mobile.putong.core.data.TreasurePrizeAd;
import com.p051p1.mobile.putong.core.data.TreasurePrizeInfo;
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

/* JADX INFO: loaded from: classes10.dex */
public class MonetizationTreasure extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationtreasure";

    @NonNull
    @ProtobufIndex(index = 10)
    public List<Bags> bags;

    @ProtobufIndex(index = 7)
    public int coinAmount;

    @ProtobufIndex(index = 4)
    public int coinConsumeAmount;

    @ProtobufIndex(index = 6)
    public int coinRemaining;

    @ProtobufIndex(index = 5)
    public int expiringCount;

    @ProtobufIndex(index = 1)
    public int freeTimes;

    @ProtobufIndex(index = 3)
    public int gemConsumeAmount;

    @ProtobufIndex(index = 2)
    public int gemRemaining;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<TreasurePrizeAd> treasurePrizeAds;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<TreasurePrizeInfo> treasurePrizeInfos;
    public static ProtobufAdapter<MonetizationTreasure> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationTreasure>() { // from class: com.p1.mobile.putong.core.data.MonetizationTreasure.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MonetizationTreasure monetizationTreasure) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, monetizationTreasure.freeTimes) + CodedOutputByteBufferNano.m17281h(2, monetizationTreasure.gemRemaining) + CodedOutputByteBufferNano.m17281h(3, monetizationTreasure.gemConsumeAmount) + CodedOutputByteBufferNano.m17281h(4, monetizationTreasure.coinConsumeAmount) + CodedOutputByteBufferNano.m17281h(5, monetizationTreasure.expiringCount) + CodedOutputByteBufferNano.m17281h(6, monetizationTreasure.coinRemaining) + CodedOutputByteBufferNano.m17281h(7, monetizationTreasure.coinAmount);
            List<TreasurePrizeInfo> list = monetizationTreasure.treasurePrizeInfos;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(8, list, TreasurePrizeInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TreasurePrizeAd> list2 = monetizationTreasure.treasurePrizeAds;
            if (list2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(9, list2, TreasurePrizeAd.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Bags> list3 = monetizationTreasure.bags;
            if (list3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(10, list3, Bags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            monetizationTreasure.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationTreasure parse(nc5 nc5Var) throws IOException {
            MonetizationTreasure monetizationTreasure = new MonetizationTreasure();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (monetizationTreasure.treasurePrizeInfos == null) {
                            monetizationTreasure.treasurePrizeInfos = new ArrayList();
                        }
                        if (monetizationTreasure.treasurePrizeAds == null) {
                            monetizationTreasure.treasurePrizeAds = new ArrayList();
                        }
                        if (monetizationTreasure.bags == null) {
                            monetizationTreasure.bags = new ArrayList();
                        }
                        break;
                    case 8:
                        monetizationTreasure.freeTimes = nc5Var.m162486j();
                        continue;
                    case 16:
                        monetizationTreasure.gemRemaining = nc5Var.m162486j();
                        continue;
                    case 24:
                        monetizationTreasure.gemConsumeAmount = nc5Var.m162486j();
                        continue;
                    case 32:
                        monetizationTreasure.coinConsumeAmount = nc5Var.m162486j();
                        continue;
                    case 40:
                        monetizationTreasure.expiringCount = nc5Var.m162486j();
                        continue;
                    case 48:
                        monetizationTreasure.coinRemaining = nc5Var.m162486j();
                        continue;
                    case 56:
                        monetizationTreasure.coinAmount = nc5Var.m162486j();
                        continue;
                    case 66:
                        monetizationTreasure.treasurePrizeInfos = (List) nc5Var.m162488l(TreasurePrizeInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        monetizationTreasure.treasurePrizeAds = (List) nc5Var.m162488l(TreasurePrizeAd.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        monetizationTreasure.bags = (List) nc5Var.m162488l(Bags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (monetizationTreasure.treasurePrizeInfos == null) {
                            monetizationTreasure.treasurePrizeInfos = new ArrayList();
                        }
                        if (monetizationTreasure.treasurePrizeAds == null) {
                            monetizationTreasure.treasurePrizeAds = new ArrayList();
                        }
                        if (monetizationTreasure.bags == null) {
                            monetizationTreasure.bags = new ArrayList();
                            return monetizationTreasure;
                        }
                        break;
                }
            }
            return monetizationTreasure;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationTreasure monetizationTreasure, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, monetizationTreasure.freeTimes);
            codedOutputByteBufferNano.m17305G(2, monetizationTreasure.gemRemaining);
            codedOutputByteBufferNano.m17305G(3, monetizationTreasure.gemConsumeAmount);
            codedOutputByteBufferNano.m17305G(4, monetizationTreasure.coinConsumeAmount);
            codedOutputByteBufferNano.m17305G(5, monetizationTreasure.expiringCount);
            codedOutputByteBufferNano.m17305G(6, monetizationTreasure.coinRemaining);
            codedOutputByteBufferNano.m17305G(7, monetizationTreasure.coinAmount);
            List<TreasurePrizeInfo> list = monetizationTreasure.treasurePrizeInfos;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(8, list, TreasurePrizeInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TreasurePrizeAd> list2 = monetizationTreasure.treasurePrizeAds;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(9, list2, TreasurePrizeAd.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Bags> list3 = monetizationTreasure.bags;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(10, list3, Bags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MonetizationTreasure> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationTreasure>() { // from class: com.p1.mobile.putong.core.data.MonetizationTreasure.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationTreasure.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MonetizationTreasure newInstance() {
            return new MonetizationTreasure();
        }

        public boolean parseField(MonetizationTreasure monetizationTreasure, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gemRemaining":
                    monetizationTreasure.gemRemaining = jsonParser.getValueAsInt();
                    return true;
                case "coinAmount":
                    monetizationTreasure.coinAmount = jsonParser.getValueAsInt();
                    return true;
                case "coinConsumeAmount":
                    monetizationTreasure.coinConsumeAmount = jsonParser.getValueAsInt();
                    return true;
                case "openAds":
                    monetizationTreasure.treasurePrizeAds = JsonAdapter.parseArray(jsonParser, TreasurePrizeAd.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "freeTimes":
                    monetizationTreasure.freeTimes = jsonParser.getValueAsInt();
                    return true;
                case "bags":
                    monetizationTreasure.bags = JsonAdapter.parseArray(jsonParser, Bags.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "expiringCount":
                    monetizationTreasure.expiringCount = jsonParser.getValueAsInt();
                    return true;
                case "gemConsumeAmount":
                    monetizationTreasure.gemConsumeAmount = jsonParser.getValueAsInt();
                    return true;
                case "coinRemaining":
                    monetizationTreasure.coinRemaining = jsonParser.getValueAsInt();
                    return true;
                case "prizeInfos":
                    monetizationTreasure.treasurePrizeInfos = JsonAdapter.parseArray(jsonParser, TreasurePrizeInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MonetizationTreasure monetizationTreasure, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gemRemaining":
                case "coinAmount":
                case "coinConsumeAmount":
                case "openAds":
                case "freeTimes":
                case "bags":
                case "expiringCount":
                case "gemConsumeAmount":
                case "coinRemaining":
                case "prizeInfos":
                    return true;
                default:
                    return super.parseFieldCheck(monetizationTreasure, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationTreasure monetizationTreasure, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("freeTimes", monetizationTreasure.freeTimes);
            jsonGenerator.writeNumberField("gemRemaining", monetizationTreasure.gemRemaining);
            jsonGenerator.writeNumberField("gemConsumeAmount", monetizationTreasure.gemConsumeAmount);
            jsonGenerator.writeNumberField("coinConsumeAmount", monetizationTreasure.coinConsumeAmount);
            jsonGenerator.writeNumberField("expiringCount", monetizationTreasure.expiringCount);
            jsonGenerator.writeNumberField("coinRemaining", monetizationTreasure.coinRemaining);
            jsonGenerator.writeNumberField("coinAmount", monetizationTreasure.coinAmount);
            if (monetizationTreasure.treasurePrizeInfos != null) {
                jsonGenerator.writeFieldName("prizeInfos");
                JsonAdapter.serializeArray(monetizationTreasure.treasurePrizeInfos, jsonGenerator, TreasurePrizeInfo.JSON_ADAPTER);
            }
            if (monetizationTreasure.treasurePrizeAds != null) {
                jsonGenerator.writeFieldName("openAds");
                JsonAdapter.serializeArray(monetizationTreasure.treasurePrizeAds, jsonGenerator, TreasurePrizeAd.JSON_ADAPTER);
            }
            if (monetizationTreasure.bags != null) {
                jsonGenerator.writeFieldName(Bags.TYPE);
                JsonAdapter.serializeArray(monetizationTreasure.bags, jsonGenerator, Bags.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationTreasure) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationTreasure) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationTreasure new_() {
        MonetizationTreasure monetizationTreasure = new MonetizationTreasure();
        monetizationTreasure.nullCheck();
        return monetizationTreasure;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MonetizationTreasure mo225055clone() {
        MonetizationTreasure monetizationTreasure = new MonetizationTreasure();
        monetizationTreasure.freeTimes = this.freeTimes;
        monetizationTreasure.gemRemaining = this.gemRemaining;
        monetizationTreasure.gemConsumeAmount = this.gemConsumeAmount;
        monetizationTreasure.coinConsumeAmount = this.coinConsumeAmount;
        monetizationTreasure.expiringCount = this.expiringCount;
        monetizationTreasure.coinRemaining = this.coinRemaining;
        monetizationTreasure.coinAmount = this.coinAmount;
        List<TreasurePrizeInfo> list = this.treasurePrizeInfos;
        if (list != null) {
            monetizationTreasure.treasurePrizeInfos = ValueObject.util_map(list, new qcj() { // from class: l.z510
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TreasurePrizeInfo) obj).mo225055clone();
                }
            });
        }
        List<TreasurePrizeAd> list2 = this.treasurePrizeAds;
        if (list2 != null) {
            monetizationTreasure.treasurePrizeAds = ValueObject.util_map(list2, new qcj() { // from class: l.a610
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((TreasurePrizeAd) obj).mo225055clone();
                }
            });
        }
        List<Bags> list3 = this.bags;
        if (list3 != null) {
            monetizationTreasure.bags = ValueObject.util_map(list3, new qcj() { // from class: l.b610
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Bags) obj).mo225055clone();
                }
            });
        }
        return monetizationTreasure;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonetizationTreasure)) {
            return false;
        }
        MonetizationTreasure monetizationTreasure = (MonetizationTreasure) obj;
        return this.freeTimes == monetizationTreasure.freeTimes && this.gemRemaining == monetizationTreasure.gemRemaining && this.gemConsumeAmount == monetizationTreasure.gemConsumeAmount && this.coinConsumeAmount == monetizationTreasure.coinConsumeAmount && this.expiringCount == monetizationTreasure.expiringCount && this.coinRemaining == monetizationTreasure.coinRemaining && this.coinAmount == monetizationTreasure.coinAmount && ValueObject.util_equals(this.treasurePrizeInfos, monetizationTreasure.treasurePrizeInfos) && ValueObject.util_equals(this.treasurePrizeAds, monetizationTreasure.treasurePrizeAds) && ValueObject.util_equals(this.bags, monetizationTreasure.bags);
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
        int i2 = ((((((((((((((i * 41) + this.freeTimes) * 41) + this.gemRemaining) * 41) + this.gemConsumeAmount) * 41) + this.coinConsumeAmount) * 41) + this.expiringCount) * 41) + this.coinRemaining) * 41) + this.coinAmount) * 41;
        List<TreasurePrizeInfo> list = this.treasurePrizeInfos;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<TreasurePrizeAd> list2 = this.treasurePrizeAds;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Bags> list3 = this.bags;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.treasurePrizeInfos == null) {
            this.treasurePrizeInfos = new ArrayList();
        }
        if (this.treasurePrizeAds == null) {
            this.treasurePrizeAds = new ArrayList();
        }
        if (this.bags == null) {
            this.bags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
