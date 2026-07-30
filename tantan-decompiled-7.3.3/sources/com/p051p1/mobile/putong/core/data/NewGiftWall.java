package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class NewGiftWall extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newgiftwall";

    @ProtobufIndex(index = 1)
    public int count;

    @NonNull
    @ProtobufIndex(index = 2)
    public CoreGiftInfo giftInfo;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f21196id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String totalPrice;

    @NonNull
    @ProtobufIndex(index = 5)
    public String unitPrice;
    public static ProtobufAdapter<NewGiftWall> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewGiftWall>() { // from class: com.p1.mobile.putong.core.data.NewGiftWall.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewGiftWall newGiftWall) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, newGiftWall.count);
            CoreGiftInfo coreGiftInfo = newGiftWall.giftInfo;
            if (coreGiftInfo != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, coreGiftInfo, CoreGiftInfo.PROTOBUF_ADAPTER);
            }
            String str = newGiftWall.f21196id;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = newGiftWall.totalPrice;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = newGiftWall.unitPrice;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            newGiftWall.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewGiftWall parse(nc5 nc5Var) throws IOException {
            NewGiftWall newGiftWall = new NewGiftWall();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newGiftWall.giftInfo == null) {
                        newGiftWall.giftInfo = CoreGiftInfo.new_();
                    }
                    if (newGiftWall.f21196id == null) {
                        newGiftWall.f21196id = "";
                    }
                    if (newGiftWall.totalPrice == null) {
                        newGiftWall.totalPrice = "";
                    }
                    if (newGiftWall.unitPrice != null) {
                        break;
                    }
                    newGiftWall.unitPrice = "";
                    break;
                }
                if (iM162497u == 8) {
                    newGiftWall.count = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    newGiftWall.giftInfo = (CoreGiftInfo) nc5Var.m162488l(CoreGiftInfo.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    newGiftWall.f21196id = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    newGiftWall.totalPrice = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (newGiftWall.giftInfo == null) {
                            newGiftWall.giftInfo = CoreGiftInfo.new_();
                        }
                        if (newGiftWall.f21196id == null) {
                            newGiftWall.f21196id = "";
                        }
                        if (newGiftWall.totalPrice == null) {
                            newGiftWall.totalPrice = "";
                        }
                        if (newGiftWall.unitPrice != null) {
                            break;
                        }
                        newGiftWall.unitPrice = "";
                        return newGiftWall;
                    }
                    newGiftWall.unitPrice = nc5Var.m162495s();
                }
            }
            return newGiftWall;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewGiftWall newGiftWall, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, newGiftWall.count);
            CoreGiftInfo coreGiftInfo = newGiftWall.giftInfo;
            if (coreGiftInfo != null) {
                codedOutputByteBufferNano.m17309K(2, coreGiftInfo, CoreGiftInfo.PROTOBUF_ADAPTER);
            }
            String str = newGiftWall.f21196id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = newGiftWall.totalPrice;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = newGiftWall.unitPrice;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
        }
    };
    public static JsonAdapter<NewGiftWall> JSON_ADAPTER = new ObjectJsonAdapter<NewGiftWall>() { // from class: com.p1.mobile.putong.core.data.NewGiftWall.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewGiftWall.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewGiftWall newInstance() {
            return new NewGiftWall();
        }

        public boolean parseField(NewGiftWall newGiftWall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "totalPrice":
                    newGiftWall.totalPrice = jsonParser.getValueAsString();
                    return true;
                case "unitPrice":
                    newGiftWall.unitPrice = jsonParser.getValueAsString();
                    return true;
                case "id":
                    newGiftWall.f21196id = jsonParser.getValueAsString();
                    return false;
                case "count":
                    newGiftWall.count = jsonParser.getValueAsInt();
                    return true;
                case "giftInfo":
                    newGiftWall.giftInfo = CoreGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewGiftWall newGiftWall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "totalPrice":
                case "unitPrice":
                    return true;
                case "id":
                    return false;
                case "count":
                case "giftInfo":
                    return true;
                default:
                    return super.parseFieldCheck(newGiftWall, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewGiftWall newGiftWall, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", newGiftWall.count);
            if (newGiftWall.giftInfo != null) {
                jsonGenerator.writeFieldName("giftInfo");
                CoreGiftInfo.JSON_ADAPTER.serialize(newGiftWall.giftInfo, jsonGenerator, true);
            }
            String str = newGiftWall.f21196id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = newGiftWall.totalPrice;
            if (str2 != null) {
                jsonGenerator.writeStringField("totalPrice", str2);
            }
            String str3 = newGiftWall.unitPrice;
            if (str3 != null) {
                jsonGenerator.writeStringField("unitPrice", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewGiftWall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewGiftWall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewGiftWall new_() {
        NewGiftWall newGiftWall = new NewGiftWall();
        newGiftWall.nullCheck();
        return newGiftWall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewGiftWall mo225055clone() {
        NewGiftWall newGiftWall = new NewGiftWall();
        newGiftWall.count = this.count;
        CoreGiftInfo coreGiftInfo = this.giftInfo;
        if (coreGiftInfo != null) {
            newGiftWall.giftInfo = coreGiftInfo.mo225055clone();
        }
        newGiftWall.f21196id = this.f21196id;
        newGiftWall.totalPrice = this.totalPrice;
        newGiftWall.unitPrice = this.unitPrice;
        return newGiftWall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewGiftWall)) {
            return false;
        }
        NewGiftWall newGiftWall = (NewGiftWall) obj;
        return this.count == newGiftWall.count && ValueObject.util_equals(this.giftInfo, newGiftWall.giftInfo) && ValueObject.util_equals(this.f21196id, newGiftWall.f21196id) && ValueObject.util_equals(this.totalPrice, newGiftWall.totalPrice) && ValueObject.util_equals(this.unitPrice, newGiftWall.unitPrice);
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
        int i2 = ((i * 41) + this.count) * 41;
        CoreGiftInfo coreGiftInfo = this.giftInfo;
        int iHashCode = (i2 + (coreGiftInfo != null ? coreGiftInfo.hashCode() : 0)) * 41;
        String str = this.f21196id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.totalPrice;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.unitPrice;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftInfo == null) {
            this.giftInfo = CoreGiftInfo.new_();
        }
        if (this.f21196id == null) {
            this.f21196id = "";
        }
        if (this.totalPrice == null) {
            this.totalPrice = "";
        }
        if (this.unitPrice == null) {
            this.unitPrice = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
