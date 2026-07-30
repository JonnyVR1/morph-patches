package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBossGift;
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
import p149l.nb5;
import p149l.w9j;

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
    public static ProtobufAdapter<BLiveBossGiftRecord> PROTOBUF_ADAPTER = new C11515a();
    public static JsonAdapter<BLiveBossGiftRecord> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBossGiftRecord>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBossGiftRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBossGiftRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBossGiftRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBossGiftRecord$a */
    public class C11515a extends MessageNanoAdapter<BLiveBossGiftRecord> {
        public C11515a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveBossGiftRecord bLiveBossGiftRecord) {
            String str = bLiveBossGiftRecord.otherUserId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, bLiveBossGiftRecord.total) + CodedOutputByteBufferNano.m17226h(3, bLiveBossGiftRecord.page) + CodedOutputByteBufferNano.m17226h(4, bLiveBossGiftRecord.totalPage) + CodedOutputByteBufferNano.m17226h(5, bLiveBossGiftRecord.popularityValue);
            List<BLiveBossGift> list = bLiveBossGiftRecord.gifts;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, list, BLiveBossGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            bLiveBossGiftRecord.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveBossGiftRecord parse(nb5 nb5Var) throws IOException {
            BLiveBossGiftRecord bLiveBossGiftRecord = new BLiveBossGiftRecord();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveBossGiftRecord.otherUserId == null) {
                        bLiveBossGiftRecord.otherUserId = "";
                    }
                    if (bLiveBossGiftRecord.gifts != null) {
                        break;
                    }
                    bLiveBossGiftRecord.gifts = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    bLiveBossGiftRecord.otherUserId = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    bLiveBossGiftRecord.total = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    bLiveBossGiftRecord.page = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    bLiveBossGiftRecord.totalPage = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    bLiveBossGiftRecord.popularityValue = nb5Var.m158741j();
                } else {
                    if (iM158752u != 50) {
                        if (bLiveBossGiftRecord.otherUserId == null) {
                            bLiveBossGiftRecord.otherUserId = "";
                        }
                        if (bLiveBossGiftRecord.gifts != null) {
                            break;
                        }
                        bLiveBossGiftRecord.gifts = new ArrayList();
                        return bLiveBossGiftRecord;
                    }
                    bLiveBossGiftRecord.gifts = (List) nb5Var.m158743l(BLiveBossGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return bLiveBossGiftRecord;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveBossGiftRecord bLiveBossGiftRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveBossGiftRecord.otherUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, bLiveBossGiftRecord.total);
            codedOutputByteBufferNano.m17250G(3, bLiveBossGiftRecord.page);
            codedOutputByteBufferNano.m17250G(4, bLiveBossGiftRecord.totalPage);
            codedOutputByteBufferNano.m17250G(5, bLiveBossGiftRecord.popularityValue);
            List<BLiveBossGift> list = bLiveBossGiftRecord.gifts;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, BLiveBossGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
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
    public BLiveBossGiftRecord mo223809clone() {
        BLiveBossGiftRecord bLiveBossGiftRecord = new BLiveBossGiftRecord();
        bLiveBossGiftRecord.otherUserId = this.otherUserId;
        bLiveBossGiftRecord.total = this.total;
        bLiveBossGiftRecord.page = this.page;
        bLiveBossGiftRecord.totalPage = this.totalPage;
        bLiveBossGiftRecord.popularityValue = this.popularityValue;
        List<BLiveBossGift> list = this.gifts;
        if (list != null) {
            bLiveBossGiftRecord.gifts = ValueObject.util_map(list, new w9j() { // from class: l.qr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBossGift) obj).mo223809clone();
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
