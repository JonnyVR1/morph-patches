package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class FoodTagInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "foodtaginfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String foodTag;

    @ProtobufIndex(index = 2)
    public int foodTagIcon;
    public static ProtobufAdapter<FoodTagInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FoodTagInfo>() { // from class: com.p1.mobile.putong.data.FoodTagInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FoodTagInfo foodTagInfo) {
            String str = foodTagInfo.foodTag;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, foodTagInfo.foodTagIcon);
            foodTagInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FoodTagInfo parse(nb5 nb5Var) throws IOException {
            FoodTagInfo foodTagInfo = new FoodTagInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (foodTagInfo.foodTag != null) {
                        break;
                    }
                    foodTagInfo.foodTag = "";
                    break;
                }
                if (iM158752u == 10) {
                    foodTagInfo.foodTag = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (foodTagInfo.foodTag != null) {
                            break;
                        }
                        foodTagInfo.foodTag = "";
                        return foodTagInfo;
                    }
                    foodTagInfo.foodTagIcon = nb5Var.m158741j();
                }
            }
            return foodTagInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FoodTagInfo foodTagInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = foodTagInfo.foodTag;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, foodTagInfo.foodTagIcon);
        }
    };
    public static JsonAdapter<FoodTagInfo> JSON_ADAPTER = new ObjectJsonAdapter<FoodTagInfo>() { // from class: com.p1.mobile.putong.data.FoodTagInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FoodTagInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FoodTagInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FoodTagInfo foodTagInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = foodTagInfo.foodTag;
            if (str != null) {
                jsonGenerator.writeStringField("foodTag", str);
            }
            jsonGenerator.writeNumberField("foodTagIcon", foodTagInfo.foodTagIcon);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FoodTagInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FoodTagInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FoodTagInfo new_() {
        FoodTagInfo foodTagInfo = new FoodTagInfo();
        foodTagInfo.nullCheck();
        return foodTagInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FoodTagInfo mo223809clone() {
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
        String str = this.foodTag;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.foodTagIcon;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.foodTag == null) {
            this.foodTag = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
