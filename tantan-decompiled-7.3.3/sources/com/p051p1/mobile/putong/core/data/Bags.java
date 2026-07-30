package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class Bags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bags";

    @ProtobufIndex(index = 6)
    public long expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21092id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public TreasurePrizeCategory parentType;

    @ProtobufIndex(index = 5)
    public int quantity;

    @NonNull
    @ProtobufIndex(index = 3)
    public TreasurePrizeType type;
    public static ProtobufAdapter<Bags> PROTOBUF_ADAPTER = new MessageNanoAdapter<Bags>() { // from class: com.p1.mobile.putong.core.data.Bags.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Bags bags) {
            String str = bags.f21092id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            TreasurePrizeCategory treasurePrizeCategory = bags.parentType;
            if (treasurePrizeCategory != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, treasurePrizeCategory, TreasurePrizeCategory.PROTOBUF_ADAPTER);
            }
            TreasurePrizeType treasurePrizeType = bags.type;
            if (treasurePrizeType != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, treasurePrizeType, TreasurePrizeType.PROTOBUF_ADAPTER);
            }
            String str2 = bags.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(5, bags.quantity) + CodedOutputByteBufferNano.m17283j(6, bags.expiredTime);
            bags.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Bags parse(nc5 nc5Var) throws IOException {
            Bags bags = new Bags();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bags.f21092id == null) {
                        bags.f21092id = "";
                    }
                    if (bags.parentType == null) {
                        bags.parentType = (TreasurePrizeCategory) TreasurePrizeCategory.JSON_ADAPTER.defaultEnum();
                    }
                    if (bags.type == null) {
                        bags.type = (TreasurePrizeType) TreasurePrizeType.JSON_ADAPTER.defaultEnum();
                    }
                    if (bags.name != null) {
                        break;
                    }
                    bags.name = "";
                    break;
                }
                if (iM162497u == 10) {
                    bags.f21092id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    bags.parentType = (TreasurePrizeCategory) nc5Var.m162488l(TreasurePrizeCategory.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    bags.type = (TreasurePrizeType) nc5Var.m162488l(TreasurePrizeType.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    bags.name = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    bags.quantity = nc5Var.m162486j();
                } else {
                    if (iM162497u != 48) {
                        if (bags.f21092id == null) {
                            bags.f21092id = "";
                        }
                        if (bags.parentType == null) {
                            bags.parentType = (TreasurePrizeCategory) TreasurePrizeCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (bags.type == null) {
                            bags.type = (TreasurePrizeType) TreasurePrizeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (bags.name != null) {
                            break;
                        }
                        bags.name = "";
                        return bags;
                    }
                    bags.expiredTime = nc5Var.m162487k();
                }
            }
            return bags;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Bags bags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bags.f21092id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            TreasurePrizeCategory treasurePrizeCategory = bags.parentType;
            if (treasurePrizeCategory != null) {
                codedOutputByteBufferNano.m17309K(2, treasurePrizeCategory, TreasurePrizeCategory.PROTOBUF_ADAPTER);
            }
            TreasurePrizeType treasurePrizeType = bags.type;
            if (treasurePrizeType != null) {
                codedOutputByteBufferNano.m17309K(3, treasurePrizeType, TreasurePrizeType.PROTOBUF_ADAPTER);
            }
            String str2 = bags.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            codedOutputByteBufferNano.m17305G(5, bags.quantity);
            codedOutputByteBufferNano.m17307I(6, bags.expiredTime);
        }
    };
    public static JsonAdapter<Bags> JSON_ADAPTER = new ObjectJsonAdapter<Bags>() { // from class: com.p1.mobile.putong.core.data.Bags.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Bags.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Bags newInstance() {
            return new Bags();
        }

        public boolean parseField(Bags bags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "quantity":
                    bags.quantity = jsonParser.getValueAsInt();
                    return true;
                case "parentType":
                    bags.parentType = TreasurePrizeCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "expiredTime":
                    bags.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    bags.f21092id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bags.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bags.type = TreasurePrizeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Bags bags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "quantity":
                case "parentType":
                case "expiredTime":
                    return true;
                case "id":
                    return false;
                case "name":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(bags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Bags bags, JsonGenerator jsonGenerator) throws IOException {
            String str = bags.f21092id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bags.parentType != null) {
                jsonGenerator.writeFieldName("parentType");
                TreasurePrizeCategory.JSON_ADAPTER.serialize(bags.parentType, jsonGenerator, true);
            }
            if (bags.type != null) {
                jsonGenerator.writeFieldName("type");
                TreasurePrizeType.JSON_ADAPTER.serialize(bags.type, jsonGenerator, true);
            }
            String str2 = bags.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.QUANTITY, bags.quantity);
            jsonGenerator.writeNumberField("expiredTime", bags.expiredTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Bags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Bags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Bags new_() {
        Bags bags = new Bags();
        bags.nullCheck();
        return bags;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Bags mo225055clone() {
        Bags bags = new Bags();
        bags.f21092id = this.f21092id;
        bags.parentType = this.parentType;
        bags.type = this.type;
        bags.name = this.name;
        bags.quantity = this.quantity;
        bags.expiredTime = this.expiredTime;
        return bags;
    }

    public boolean consume() {
        return TEnum.equals(this.parentType, TreasurePrizeCategory.get(TreasurePrizeCategory.consume));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bags)) {
            return false;
        }
        Bags bags = (Bags) obj;
        return ValueObject.util_equals(this.f21092id, bags.f21092id) && ValueObject.util_equals(this.parentType, bags.parentType) && ValueObject.util_equals(this.type, bags.type) && ValueObject.util_equals(this.name, bags.name) && this.quantity == bags.quantity && this.expiredTime == bags.expiredTime;
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
        String str = this.f21092id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        TreasurePrizeCategory treasurePrizeCategory = this.parentType;
        int iHashCode2 = (iHashCode + (treasurePrizeCategory != null ? treasurePrizeCategory.hashCode() : 0)) * 41;
        TreasurePrizeType treasurePrizeType = this.type;
        int iHashCode3 = (iHashCode2 + (treasurePrizeType != null ? treasurePrizeType.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode4 = (((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.quantity) * 41;
        long j = this.expiredTime;
        int i3 = iHashCode4 + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21092id == null) {
            this.f21092id = "";
        }
        if (this.parentType == null) {
            this.parentType = (TreasurePrizeCategory) TreasurePrizeCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = (TreasurePrizeType) TreasurePrizeType.JSON_ADAPTER.defaultEnum();
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public boolean timeLimit() {
        return TEnum.equals(this.parentType, TreasurePrizeCategory.get(TreasurePrizeCategory.timeLimit));
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
