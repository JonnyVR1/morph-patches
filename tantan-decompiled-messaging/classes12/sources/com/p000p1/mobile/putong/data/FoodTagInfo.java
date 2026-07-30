package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FoodTagInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "foodtaginfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String foodTag;

    @ProtobufIndex(index = 2)
    public int foodTagIcon;
    public static ProtobufAdapter<FoodTagInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FoodTagInfo>() { // from class: com.p1.mobile.putong.data.FoodTagInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FoodTagInfo foodTagInfo) {
            String str = foodTagInfo.foodTag;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, foodTagInfo.foodTagIcon);
            ((MessageNano) foodTagInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FoodTagInfo m18112parse(nb5 nb5Var) throws IOException {
            FoodTagInfo foodTagInfo = new FoodTagInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (foodTagInfo.foodTag != null) {
                        break;
                    }
                    foodTagInfo.foodTag = "";
                    break;
                }
                if (iU == 10) {
                    foodTagInfo.foodTag = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (foodTagInfo.foodTag != null) {
                            break;
                        }
                        foodTagInfo.foodTag = "";
                        return foodTagInfo;
                    }
                    foodTagInfo.foodTagIcon = nb5Var.j();
                }
            }
            return foodTagInfo;
        }

        public void serialize(FoodTagInfo foodTagInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = foodTagInfo.foodTag;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, foodTagInfo.foodTagIcon);
        }
    };
    public static JsonAdapter<FoodTagInfo> JSON_ADAPTER = new ObjectJsonAdapter<FoodTagInfo>() { // from class: com.p1.mobile.putong.data.FoodTagInfo.2
        public Class getDataClass() {
            return FoodTagInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FoodTagInfo mo17830newInstance() {
            return new FoodTagInfo();
        }

        public boolean parseField(FoodTagInfo foodTagInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("foodTag")) {
                foodTagInfo.foodTag = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("foodTagIcon")) {
                return false;
            }
            foodTagInfo.foodTagIcon = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(FoodTagInfo foodTagInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("foodTag") || str.equals("foodTagIcon")) {
                return true;
            }
            return super.parseFieldCheck(foodTagInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FoodTagInfo foodTagInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = foodTagInfo.foodTag;
            if (str != null) {
                jsonGenerator.writeStringField("foodTag", str);
            }
            jsonGenerator.writeNumberField("foodTagIcon", foodTagInfo.foodTagIcon);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FoodTagInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FoodTagInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FoodTagInfo new_() {
        FoodTagInfo foodTagInfo = new FoodTagInfo();
        foodTagInfo.nullCheck();
        return foodTagInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FoodTagInfo m18111clone() {
        FoodTagInfo foodTagInfo = new FoodTagInfo();
        foodTagInfo.foodTag = this.foodTag;
        foodTagInfo.foodTagIcon = this.foodTagIcon;
        return foodTagInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FoodTagInfo)) {
            return false;
        }
        FoodTagInfo foodTagInfo = (FoodTagInfo) obj;
        return ValueObject.util_equals(this.foodTag, foodTagInfo.foodTag) && this.foodTagIcon == foodTagInfo.foodTagIcon;
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
        String str = this.foodTag;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.foodTagIcon;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.foodTag == null) {
            this.foodTag = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
