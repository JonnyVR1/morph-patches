package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveStickerTemplatesGiftItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivestickertemplatesgiftitem";

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String giftName;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;
    public boolean isSelected = false;

    @ProtobufIndex(index = 4)
    public int price;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<BLiveStickerTemplatesGiftItem> PROTOBUF_ADAPTER = new C12102a();
    public static JsonAdapter<BLiveStickerTemplatesGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStickerTemplatesGiftItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStickerTemplatesGiftItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStickerTemplatesGiftItem newInstance() {
            return new BLiveStickerTemplatesGiftItem();
        }

        public boolean parseField(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftId":
                    bLiveStickerTemplatesGiftItem.giftId = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveStickerTemplatesGiftItem.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveStickerTemplatesGiftItem.type = jsonParser.getValueAsString();
                    return true;
                case "price":
                    bLiveStickerTemplatesGiftItem.price = jsonParser.getValueAsInt();
                    return true;
                case "giftName":
                    bLiveStickerTemplatesGiftItem.giftName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStickerTemplatesGiftItem.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveStickerTemplatesGiftItem.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveStickerTemplatesGiftItem.giftId;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftId", str3);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, bLiveStickerTemplatesGiftItem.price);
            String str4 = bLiveStickerTemplatesGiftItem.giftName;
            if (str4 != null) {
                jsonGenerator.writeStringField("giftName", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStickerTemplatesGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem$a */
    public class C12102a extends MessageNanoAdapter<BLiveStickerTemplatesGiftItem> {
        public C12102a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
            String str = bLiveStickerTemplatesGiftItem.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveStickerTemplatesGiftItem.icon;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bLiveStickerTemplatesGiftItem.giftId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(4, bLiveStickerTemplatesGiftItem.price);
            String str4 = bLiveStickerTemplatesGiftItem.giftName;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            bLiveStickerTemplatesGiftItem.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveStickerTemplatesGiftItem parse(nb5 nb5Var) throws IOException {
            BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem = new BLiveStickerTemplatesGiftItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveStickerTemplatesGiftItem.type == null) {
                        bLiveStickerTemplatesGiftItem.type = "";
                    }
                    if (bLiveStickerTemplatesGiftItem.icon == null) {
                        bLiveStickerTemplatesGiftItem.icon = "";
                    }
                    if (bLiveStickerTemplatesGiftItem.giftId == null) {
                        bLiveStickerTemplatesGiftItem.giftId = "";
                    }
                    if (bLiveStickerTemplatesGiftItem.giftName != null) {
                        break;
                    }
                    bLiveStickerTemplatesGiftItem.giftName = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveStickerTemplatesGiftItem.type = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bLiveStickerTemplatesGiftItem.icon = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bLiveStickerTemplatesGiftItem.giftId = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    bLiveStickerTemplatesGiftItem.price = nb5Var.m158741j();
                } else {
                    if (iM158752u != 42) {
                        if (bLiveStickerTemplatesGiftItem.type == null) {
                            bLiveStickerTemplatesGiftItem.type = "";
                        }
                        if (bLiveStickerTemplatesGiftItem.icon == null) {
                            bLiveStickerTemplatesGiftItem.icon = "";
                        }
                        if (bLiveStickerTemplatesGiftItem.giftId == null) {
                            bLiveStickerTemplatesGiftItem.giftId = "";
                        }
                        if (bLiveStickerTemplatesGiftItem.giftName != null) {
                            break;
                        }
                        bLiveStickerTemplatesGiftItem.giftName = "";
                        return bLiveStickerTemplatesGiftItem;
                    }
                    bLiveStickerTemplatesGiftItem.giftName = nb5Var.m158750s();
                }
            }
            return bLiveStickerTemplatesGiftItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveStickerTemplatesGiftItem.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveStickerTemplatesGiftItem.icon;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bLiveStickerTemplatesGiftItem.giftId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17250G(4, bLiveStickerTemplatesGiftItem.price);
            String str4 = bLiveStickerTemplatesGiftItem.giftName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
        }
    }

    public static BLiveStickerTemplatesGiftItem new_() {
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem = new BLiveStickerTemplatesGiftItem();
        bLiveStickerTemplatesGiftItem.nullCheck();
        return bLiveStickerTemplatesGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStickerTemplatesGiftItem mo223809clone() {
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem = new BLiveStickerTemplatesGiftItem();
        bLiveStickerTemplatesGiftItem.type = this.type;
        bLiveStickerTemplatesGiftItem.icon = this.icon;
        bLiveStickerTemplatesGiftItem.giftId = this.giftId;
        bLiveStickerTemplatesGiftItem.price = this.price;
        bLiveStickerTemplatesGiftItem.giftName = this.giftName;
        return bLiveStickerTemplatesGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStickerTemplatesGiftItem)) {
            return false;
        }
        BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem = (BLiveStickerTemplatesGiftItem) obj;
        return ValueObject.util_equals(this.type, bLiveStickerTemplatesGiftItem.type) && ValueObject.util_equals(this.icon, bLiveStickerTemplatesGiftItem.icon) && ValueObject.util_equals(this.giftId, bLiveStickerTemplatesGiftItem.giftId) && this.price == bLiveStickerTemplatesGiftItem.price && ValueObject.util_equals(this.giftName, bLiveStickerTemplatesGiftItem.giftName);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftId;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.price) * 41;
        String str4 = this.giftName;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.giftName == null) {
            this.giftName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
