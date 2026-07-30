package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.tenum.TEnum;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Bags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bags";

    @ProtobufIndex(index = 6)
    public long expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f12id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public TreasurePrizeCategory parentType;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int quantity;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public TreasurePrizeType type;
    public static ProtobufAdapter<Bags> PROTOBUF_ADAPTER = new MessageNanoAdapter<Bags>() { // from class: com.p1.mobile.putong.core.data.Bags.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Bags bags) {
            String str = bags.f12id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            TreasurePrizeCategory treasurePrizeCategory = bags.parentType;
            if (treasurePrizeCategory != null) {
                iO += CodedOutputByteBufferNano.l(2, treasurePrizeCategory, TreasurePrizeCategory.PROTOBUF_ADAPTER);
            }
            TreasurePrizeType treasurePrizeType = bags.type;
            if (treasurePrizeType != null) {
                iO += CodedOutputByteBufferNano.l(3, treasurePrizeType, TreasurePrizeType.PROTOBUF_ADAPTER);
            }
            String str2 = bags.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, bags.quantity) + CodedOutputByteBufferNano.j(6, bags.expiredTime);
            ((MessageNano) bags).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Bags m11721parse(nb5 nb5Var) throws IOException {
            Bags bags = new Bags();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bags.f12id == null) {
                        bags.f12id = "";
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
                if (iU == 10) {
                    bags.f12id = nb5Var.s();
                } else if (iU == 18) {
                    bags.parentType = (TreasurePrizeCategory) nb5Var.l(TreasurePrizeCategory.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    bags.type = (TreasurePrizeType) nb5Var.l(TreasurePrizeType.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    bags.name = nb5Var.s();
                } else if (iU == 40) {
                    bags.quantity = nb5Var.j();
                } else {
                    if (iU != 48) {
                        if (bags.f12id == null) {
                            bags.f12id = "";
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
                    bags.expiredTime = nb5Var.k();
                }
            }
            return bags;
        }

        public void serialize(Bags bags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bags.f12id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            TreasurePrizeCategory treasurePrizeCategory = bags.parentType;
            if (treasurePrizeCategory != null) {
                codedOutputByteBufferNano.K(2, treasurePrizeCategory, TreasurePrizeCategory.PROTOBUF_ADAPTER);
            }
            TreasurePrizeType treasurePrizeType = bags.type;
            if (treasurePrizeType != null) {
                codedOutputByteBufferNano.K(3, treasurePrizeType, TreasurePrizeType.PROTOBUF_ADAPTER);
            }
            String str2 = bags.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            codedOutputByteBufferNano.G(5, bags.quantity);
            codedOutputByteBufferNano.I(6, bags.expiredTime);
        }
    };
    public static JsonAdapter<Bags> JSON_ADAPTER = new ObjectJsonAdapter<Bags>() { // from class: com.p1.mobile.putong.core.data.Bags.2
        public Class getDataClass() {
            return Bags.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Bags m11722newInstance() {
            return new Bags();
        }

        public boolean parseField(Bags bags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "quantity":
                    bags.quantity = jsonParser.getValueAsInt();
                    return true;
                case "parentType":
                    bags.parentType = (TreasurePrizeCategory) TreasurePrizeCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "expiredTime":
                    bags.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    bags.f12id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bags.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bags.type = (TreasurePrizeType) TreasurePrizeType.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(Bags bags, JsonGenerator jsonGenerator) throws IOException {
            String str = bags.f12id;
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
                jsonGenerator.writeStringField("name", str2);
            }
            jsonGenerator.writeNumberField("quantity", bags.quantity);
            jsonGenerator.writeNumberField("expiredTime", bags.expiredTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Bags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Bags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Bags new_() {
        Bags bags = new Bags();
        bags.nullCheck();
        return bags;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Bags m11720clone() {
        Bags bags = new Bags();
        bags.f12id = this.f12id;
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
        return ValueObject.util_equals(this.f12id, bags.f12id) && ValueObject.util_equals(this.parentType, bags.parentType) && ValueObject.util_equals(this.type, bags.type) && ValueObject.util_equals(this.name, bags.name) && this.quantity == bags.quantity && this.expiredTime == bags.expiredTime;
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
        String str = this.f12id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        TreasurePrizeCategory treasurePrizeCategory = this.parentType;
        int iHashCode2 = (iHashCode + (treasurePrizeCategory != null ? treasurePrizeCategory.hashCode() : 0)) * 41;
        TreasurePrizeType treasurePrizeType = this.type;
        int iHashCode3 = (iHashCode2 + (treasurePrizeType != null ? treasurePrizeType.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode4 = (((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.quantity) * 41;
        long j = this.expiredTime;
        int i3 = iHashCode4 + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f12id == null) {
            this.f12id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
