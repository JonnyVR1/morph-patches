package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveBossGift;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBossGiftRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivebossgiftrecord";

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveBossGift> gifts;

    @NonNull
    @ProtobufIndex(index = 1)
    public String otherUserId;

    @ProtobufIndex(index = 3)
    public int page;

    @ProtobufIndex(index = 5)
    public int popularityValue;

    @ProtobufIndex(index = 2)
    public int total;

    @ProtobufIndex(index = 4)
    public int totalPage;
    public static ProtobufAdapter<BLiveBossGiftRecord> PROTOBUF_ADAPTER = new C11678a();
    public static JsonAdapter<BLiveBossGiftRecord> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBossGiftRecord>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBossGiftRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBossGiftRecord.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBossGiftRecord newInstance() {
            return new BLiveBossGiftRecord();
        }

        public boolean parseField(BLiveBossGiftRecord bLiveBossGiftRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    bLiveBossGiftRecord.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "totalPage":
                    bLiveBossGiftRecord.totalPage = jsonParser.getValueAsInt();
                    return true;
                case "popularityValue":
                    bLiveBossGiftRecord.popularityValue = jsonParser.getValueAsInt();
                    return true;
                case "page":
                    bLiveBossGiftRecord.page = jsonParser.getValueAsInt();
                    return true;
                case "gifts":
                    bLiveBossGiftRecord.gifts = JsonAdapter.parseArray(jsonParser, BLiveBossGift.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "total":
                    bLiveBossGiftRecord.total = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBossGiftRecord bLiveBossGiftRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBossGiftRecord.otherUserId;
            if (str != null) {
                jsonGenerator.writeStringField("otherUserId", str);
            }
            jsonGenerator.writeNumberField("total", bLiveBossGiftRecord.total);
            jsonGenerator.writeNumberField(OMSTemplateModeType.page, bLiveBossGiftRecord.page);
            jsonGenerator.writeNumberField("totalPage", bLiveBossGiftRecord.totalPage);
            jsonGenerator.writeNumberField("popularityValue", bLiveBossGiftRecord.popularityValue);
            if (bLiveBossGiftRecord.gifts != null) {
                jsonGenerator.writeFieldName("gifts");
                JsonAdapter.serializeArray(bLiveBossGiftRecord.gifts, jsonGenerator, BLiveBossGift.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBossGiftRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBossGiftRecord$a */
    public class C11678a extends MessageNanoAdapter<BLiveBossGiftRecord> {
        public C11678a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveBossGiftRecord bLiveBossGiftRecord) {
            String str = bLiveBossGiftRecord.otherUserId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, bLiveBossGiftRecord.total) + CodedOutputByteBufferNano.m17281h(3, bLiveBossGiftRecord.page) + CodedOutputByteBufferNano.m17281h(4, bLiveBossGiftRecord.totalPage) + CodedOutputByteBufferNano.m17281h(5, bLiveBossGiftRecord.popularityValue);
            List<BLiveBossGift> list = bLiveBossGiftRecord.gifts;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, list, BLiveBossGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            bLiveBossGiftRecord.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveBossGiftRecord parse(nc5 nc5Var) throws IOException {
            BLiveBossGiftRecord bLiveBossGiftRecord = new BLiveBossGiftRecord();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveBossGiftRecord.otherUserId == null) {
                        bLiveBossGiftRecord.otherUserId = "";
                    }
                    if (bLiveBossGiftRecord.gifts != null) {
                        break;
                    }
                    bLiveBossGiftRecord.gifts = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    bLiveBossGiftRecord.otherUserId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    bLiveBossGiftRecord.total = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    bLiveBossGiftRecord.page = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    bLiveBossGiftRecord.totalPage = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    bLiveBossGiftRecord.popularityValue = nc5Var.m162486j();
                } else {
                    if (iM162497u != 50) {
                        if (bLiveBossGiftRecord.otherUserId == null) {
                            bLiveBossGiftRecord.otherUserId = "";
                        }
                        if (bLiveBossGiftRecord.gifts != null) {
                            break;
                        }
                        bLiveBossGiftRecord.gifts = new ArrayList();
                        return bLiveBossGiftRecord;
                    }
                    bLiveBossGiftRecord.gifts = (List) nc5Var.m162488l(BLiveBossGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return bLiveBossGiftRecord;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveBossGiftRecord bLiveBossGiftRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveBossGiftRecord.otherUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, bLiveBossGiftRecord.total);
            codedOutputByteBufferNano.m17305G(3, bLiveBossGiftRecord.page);
            codedOutputByteBufferNano.m17305G(4, bLiveBossGiftRecord.totalPage);
            codedOutputByteBufferNano.m17305G(5, bLiveBossGiftRecord.popularityValue);
            List<BLiveBossGift> list = bLiveBossGiftRecord.gifts;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(6, list, BLiveBossGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    }

    public static BLiveBossGiftRecord new_() {
        BLiveBossGiftRecord bLiveBossGiftRecord = new BLiveBossGiftRecord();
        bLiveBossGiftRecord.nullCheck();
        return bLiveBossGiftRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBossGiftRecord mo225055clone() {
        BLiveBossGiftRecord bLiveBossGiftRecord = new BLiveBossGiftRecord();
        bLiveBossGiftRecord.otherUserId = this.otherUserId;
        bLiveBossGiftRecord.total = this.total;
        bLiveBossGiftRecord.page = this.page;
        bLiveBossGiftRecord.totalPage = this.totalPage;
        bLiveBossGiftRecord.popularityValue = this.popularityValue;
        List<BLiveBossGift> list = this.gifts;
        if (list != null) {
            bLiveBossGiftRecord.gifts = ValueObject.util_map(list, new qcj() { // from class: l.xr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBossGift) obj).mo225055clone();
                }
            });
        }
        return bLiveBossGiftRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBossGiftRecord)) {
            return false;
        }
        BLiveBossGiftRecord bLiveBossGiftRecord = (BLiveBossGiftRecord) obj;
        return ValueObject.util_equals(this.otherUserId, bLiveBossGiftRecord.otherUserId) && this.total == bLiveBossGiftRecord.total && this.page == bLiveBossGiftRecord.page && this.totalPage == bLiveBossGiftRecord.totalPage && this.popularityValue == bLiveBossGiftRecord.popularityValue && ValueObject.util_equals(this.gifts, bLiveBossGiftRecord.gifts);
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
        String str = this.otherUserId;
        int iHashCode = (((((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.total) * 41) + this.page) * 41) + this.totalPage) * 41) + this.popularityValue) * 41;
        List<BLiveBossGift> list = this.gifts;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.gifts == null) {
            this.gifts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
