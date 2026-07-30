package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class NewGiftWall extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newgiftwall";

    @ProtobufIndex(index = 1)
    public int count;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public CoreGiftInfo giftInfo;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String f116id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String totalPrice;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String unitPrice;
    public static ProtobufAdapter<NewGiftWall> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewGiftWall>() { // from class: com.p1.mobile.putong.core.data.NewGiftWall.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewGiftWall newGiftWall) {
            int iH = CodedOutputByteBufferNano.h(1, newGiftWall.count);
            CoreGiftInfo coreGiftInfo = newGiftWall.giftInfo;
            if (coreGiftInfo != null) {
                iH += CodedOutputByteBufferNano.l(2, coreGiftInfo, CoreGiftInfo.PROTOBUF_ADAPTER);
            }
            String str = newGiftWall.f116id;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            String str2 = newGiftWall.totalPrice;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = newGiftWall.unitPrice;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) newGiftWall).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewGiftWall m14507parse(nb5 nb5Var) throws IOException {
            NewGiftWall newGiftWall = new NewGiftWall();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newGiftWall.giftInfo == null) {
                        newGiftWall.giftInfo = CoreGiftInfo.new_();
                    }
                    if (newGiftWall.f116id == null) {
                        newGiftWall.f116id = "";
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
                if (iU == 8) {
                    newGiftWall.count = nb5Var.j();
                } else if (iU == 18) {
                    newGiftWall.giftInfo = (CoreGiftInfo) nb5Var.l(CoreGiftInfo.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    newGiftWall.f116id = nb5Var.s();
                } else if (iU == 34) {
                    newGiftWall.totalPrice = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (newGiftWall.giftInfo == null) {
                            newGiftWall.giftInfo = CoreGiftInfo.new_();
                        }
                        if (newGiftWall.f116id == null) {
                            newGiftWall.f116id = "";
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
                    newGiftWall.unitPrice = nb5Var.s();
                }
            }
            return newGiftWall;
        }

        public void serialize(NewGiftWall newGiftWall, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, newGiftWall.count);
            CoreGiftInfo coreGiftInfo = newGiftWall.giftInfo;
            if (coreGiftInfo != null) {
                codedOutputByteBufferNano.K(2, coreGiftInfo, CoreGiftInfo.PROTOBUF_ADAPTER);
            }
            String str = newGiftWall.f116id;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            String str2 = newGiftWall.totalPrice;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = newGiftWall.unitPrice;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<NewGiftWall> JSON_ADAPTER = new ObjectJsonAdapter<NewGiftWall>() { // from class: com.p1.mobile.putong.core.data.NewGiftWall.2
        public Class getDataClass() {
            return NewGiftWall.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewGiftWall m14508newInstance() {
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
                    newGiftWall.f116id = jsonParser.getValueAsString();
                    return false;
                case "count":
                    newGiftWall.count = jsonParser.getValueAsInt();
                    return true;
                case "giftInfo":
                    newGiftWall.giftInfo = (CoreGiftInfo) CoreGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(NewGiftWall newGiftWall, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", newGiftWall.count);
            if (newGiftWall.giftInfo != null) {
                jsonGenerator.writeFieldName("giftInfo");
                CoreGiftInfo.JSON_ADAPTER.serialize(newGiftWall.giftInfo, jsonGenerator, true);
            }
            String str = newGiftWall.f116id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewGiftWall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewGiftWall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewGiftWall new_() {
        NewGiftWall newGiftWall = new NewGiftWall();
        newGiftWall.nullCheck();
        return newGiftWall;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewGiftWall m14506clone() {
        NewGiftWall newGiftWall = new NewGiftWall();
        newGiftWall.count = this.count;
        CoreGiftInfo coreGiftInfo = this.giftInfo;
        if (coreGiftInfo != null) {
            newGiftWall.giftInfo = coreGiftInfo.m12484clone();
        }
        newGiftWall.f116id = this.f116id;
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
        return this.count == newGiftWall.count && ValueObject.util_equals(this.giftInfo, newGiftWall.giftInfo) && ValueObject.util_equals(this.f116id, newGiftWall.f116id) && ValueObject.util_equals(this.totalPrice, newGiftWall.totalPrice) && ValueObject.util_equals(this.unitPrice, newGiftWall.unitPrice);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.count) * 41;
        CoreGiftInfo coreGiftInfo = this.giftInfo;
        int iHashCode = (i2 + (coreGiftInfo != null ? coreGiftInfo.hashCode() : 0)) * 41;
        String str = this.f116id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.totalPrice;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.unitPrice;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.giftInfo == null) {
            this.giftInfo = CoreGiftInfo.new_();
        }
        if (this.f116id == null) {
            this.f116id = "";
        }
        if (this.totalPrice == null) {
            this.totalPrice = "";
        }
        if (this.unitPrice == null) {
            this.unitPrice = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
