package com.p046p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftDiamondPrice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivegiftdiamondprice";

    @ProtobufIndex(index = 2)
    public long purchasePrice;

    @ProtobufIndex(index = 1)
    public float unitPrice;
    public static ProtobufAdapter<BLiveGiftDiamondPrice> PROTOBUF_ADAPTER = new C11689a();
    public static JsonAdapter<BLiveGiftDiamondPrice> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftDiamondPrice>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftDiamondPrice.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftDiamondPrice.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftDiamondPrice newInstance() {
            return new BLiveGiftDiamondPrice();
        }

        public boolean parseField(BLiveGiftDiamondPrice bLiveGiftDiamondPrice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("purchasePrice")) {
                bLiveGiftDiamondPrice.purchasePrice = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("unitPrice")) {
                return false;
            }
            bLiveGiftDiamondPrice.unitPrice = (float) jsonParser.getValueAsDouble();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftDiamondPrice bLiveGiftDiamondPrice, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unitPrice", bLiveGiftDiamondPrice.unitPrice);
            jsonGenerator.writeNumberField("purchasePrice", bLiveGiftDiamondPrice.purchasePrice);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftDiamondPrice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveGiftDiamondPrice$a */
    public class C11689a extends MessageNanoAdapter<BLiveGiftDiamondPrice> {
        public C11689a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveGiftDiamondPrice bLiveGiftDiamondPrice) {
            int iM17224f = CodedOutputByteBufferNano.m17224f(1, bLiveGiftDiamondPrice.unitPrice) + CodedOutputByteBufferNano.m17228j(2, bLiveGiftDiamondPrice.purchasePrice);
            bLiveGiftDiamondPrice.cachedSize = iM17224f;
            return iM17224f;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveGiftDiamondPrice parse(nb5 nb5Var) throws IOException {
            BLiveGiftDiamondPrice bLiveGiftDiamondPrice = new BLiveGiftDiamondPrice();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 13) {
                    bLiveGiftDiamondPrice.unitPrice = nb5Var.m158740i();
                } else {
                    if (iM158752u != 16) {
                        return bLiveGiftDiamondPrice;
                    }
                    bLiveGiftDiamondPrice.purchasePrice = nb5Var.m158742k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveGiftDiamondPrice bLiveGiftDiamondPrice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17248E(1, bLiveGiftDiamondPrice.unitPrice);
            codedOutputByteBufferNano.m17252I(2, bLiveGiftDiamondPrice.purchasePrice);
        }
    }

    public static BLiveGiftDiamondPrice new_() {
        BLiveGiftDiamondPrice bLiveGiftDiamondPrice = new BLiveGiftDiamondPrice();
        bLiveGiftDiamondPrice.nullCheck();
        return bLiveGiftDiamondPrice;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftDiamondPrice mo223809clone() {
        BLiveGiftDiamondPrice bLiveGiftDiamondPrice = new BLiveGiftDiamondPrice();
        bLiveGiftDiamondPrice.unitPrice = this.unitPrice;
        bLiveGiftDiamondPrice.purchasePrice = this.purchasePrice;
        return bLiveGiftDiamondPrice;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftDiamondPrice)) {
            return false;
        }
        BLiveGiftDiamondPrice bLiveGiftDiamondPrice = (BLiveGiftDiamondPrice) obj;
        return this.unitPrice == bLiveGiftDiamondPrice.unitPrice && this.purchasePrice == bLiveGiftDiamondPrice.purchasePrice;
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
        int iFloatToIntBits = ((i * 41) + Float.floatToIntBits(this.unitPrice)) * 41;
        long j = this.purchasePrice;
        int i2 = iFloatToIntBits + ((int) (j ^ (j >>> 32)));
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
