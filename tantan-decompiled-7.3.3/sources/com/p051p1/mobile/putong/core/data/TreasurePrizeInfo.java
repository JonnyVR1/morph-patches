package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class TreasurePrizeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "treasureprizeinfo";

    @ProtobufIndex(index = 5)
    public int amount;

    @NonNull
    @ProtobufIndex(index = 3)
    public TreasurePrizeCategory category;

    @ProtobufIndex(index = 6)
    public long duration;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21265id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<TreasurePrizeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<TreasurePrizeInfo>() { // from class: com.p1.mobile.putong.core.data.TreasurePrizeInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TreasurePrizeInfo treasurePrizeInfo) {
            String str = treasurePrizeInfo.f21265id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = treasurePrizeInfo.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            TreasurePrizeCategory treasurePrizeCategory = treasurePrizeInfo.category;
            if (treasurePrizeCategory != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, treasurePrizeCategory, TreasurePrizeCategory.PROTOBUF_ADAPTER);
            }
            String str3 = treasurePrizeInfo.name;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(5, treasurePrizeInfo.amount) + CodedOutputByteBufferNano.m17283j(6, treasurePrizeInfo.duration);
            treasurePrizeInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TreasurePrizeInfo parse(nc5 nc5Var) throws IOException {
            TreasurePrizeInfo treasurePrizeInfo = new TreasurePrizeInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (treasurePrizeInfo.f21265id == null) {
                        treasurePrizeInfo.f21265id = "";
                    }
                    if (treasurePrizeInfo.type == null) {
                        treasurePrizeInfo.type = "";
                    }
                    if (treasurePrizeInfo.category == null) {
                        treasurePrizeInfo.category = (TreasurePrizeCategory) TreasurePrizeCategory.JSON_ADAPTER.defaultEnum();
                    }
                    if (treasurePrizeInfo.name != null) {
                        break;
                    }
                    treasurePrizeInfo.name = "";
                    break;
                }
                if (iM162497u == 10) {
                    treasurePrizeInfo.f21265id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    treasurePrizeInfo.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    treasurePrizeInfo.category = (TreasurePrizeCategory) nc5Var.m162488l(TreasurePrizeCategory.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    treasurePrizeInfo.name = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    treasurePrizeInfo.amount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 48) {
                        if (treasurePrizeInfo.f21265id == null) {
                            treasurePrizeInfo.f21265id = "";
                        }
                        if (treasurePrizeInfo.type == null) {
                            treasurePrizeInfo.type = "";
                        }
                        if (treasurePrizeInfo.category == null) {
                            treasurePrizeInfo.category = (TreasurePrizeCategory) TreasurePrizeCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (treasurePrizeInfo.name != null) {
                            break;
                        }
                        treasurePrizeInfo.name = "";
                        return treasurePrizeInfo;
                    }
                    treasurePrizeInfo.duration = nc5Var.m162487k();
                }
            }
            return treasurePrizeInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TreasurePrizeInfo treasurePrizeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = treasurePrizeInfo.f21265id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = treasurePrizeInfo.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            TreasurePrizeCategory treasurePrizeCategory = treasurePrizeInfo.category;
            if (treasurePrizeCategory != null) {
                codedOutputByteBufferNano.m17309K(3, treasurePrizeCategory, TreasurePrizeCategory.PROTOBUF_ADAPTER);
            }
            String str3 = treasurePrizeInfo.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            codedOutputByteBufferNano.m17305G(5, treasurePrizeInfo.amount);
            codedOutputByteBufferNano.m17307I(6, treasurePrizeInfo.duration);
        }
    };
    public static JsonAdapter<TreasurePrizeInfo> JSON_ADAPTER = new ObjectJsonAdapter<TreasurePrizeInfo>() { // from class: com.p1.mobile.putong.core.data.TreasurePrizeInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TreasurePrizeInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TreasurePrizeInfo newInstance() {
            return new TreasurePrizeInfo();
        }

        public boolean parseField(TreasurePrizeInfo treasurePrizeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    treasurePrizeInfo.duration = jsonParser.getValueAsLong();
                    return true;
                case "amount":
                    treasurePrizeInfo.amount = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    treasurePrizeInfo.f21265id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    treasurePrizeInfo.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    treasurePrizeInfo.type = jsonParser.getValueAsString();
                    return true;
                case "parent_type":
                    treasurePrizeInfo.category = TreasurePrizeCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TreasurePrizeInfo treasurePrizeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "amount":
                    return true;
                case "id":
                    return false;
                case "name":
                case "type":
                case "parent_type":
                    return true;
                default:
                    return super.parseFieldCheck(treasurePrizeInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TreasurePrizeInfo treasurePrizeInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = treasurePrizeInfo.f21265id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = treasurePrizeInfo.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (treasurePrizeInfo.category != null) {
                jsonGenerator.writeFieldName("parent_type");
                TreasurePrizeCategory.JSON_ADAPTER.serialize(treasurePrizeInfo.category, jsonGenerator, true);
            }
            String str3 = treasurePrizeInfo.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            jsonGenerator.writeNumberField("amount", treasurePrizeInfo.amount);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, treasurePrizeInfo.duration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TreasurePrizeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TreasurePrizeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TreasurePrizeInfo new_() {
        TreasurePrizeInfo treasurePrizeInfo = new TreasurePrizeInfo();
        treasurePrizeInfo.nullCheck();
        return treasurePrizeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TreasurePrizeInfo mo225055clone() {
        TreasurePrizeInfo treasurePrizeInfo = new TreasurePrizeInfo();
        treasurePrizeInfo.f21265id = this.f21265id;
        treasurePrizeInfo.type = this.type;
        treasurePrizeInfo.category = this.category;
        treasurePrizeInfo.name = this.name;
        treasurePrizeInfo.amount = this.amount;
        treasurePrizeInfo.duration = this.duration;
        return treasurePrizeInfo;
    }

    public boolean consume() {
        return TEnum.equals(this.category, TreasurePrizeCategory.get(TreasurePrizeCategory.consume));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreasurePrizeInfo)) {
            return false;
        }
        TreasurePrizeInfo treasurePrizeInfo = (TreasurePrizeInfo) obj;
        return ValueObject.util_equals(this.f21265id, treasurePrizeInfo.f21265id) && ValueObject.util_equals(this.type, treasurePrizeInfo.type) && ValueObject.util_equals(this.category, treasurePrizeInfo.category) && ValueObject.util_equals(this.name, treasurePrizeInfo.name) && this.amount == treasurePrizeInfo.amount && this.duration == treasurePrizeInfo.duration;
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
        String str = this.f21265id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        TreasurePrizeCategory treasurePrizeCategory = this.category;
        int iHashCode3 = (iHashCode2 + (treasurePrizeCategory != null ? treasurePrizeCategory.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.amount) * 41;
        long j = this.duration;
        int i3 = iHashCode4 + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21265id == null) {
            this.f21265id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.category == null) {
            this.category = (TreasurePrizeCategory) TreasurePrizeCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public boolean timeLimit() {
        return TEnum.equals(this.category, TreasurePrizeCategory.get(TreasurePrizeCategory.timeLimit));
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
