package com.p051p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserCardGiftWallGift extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveusercardgiftwallgift";

    @NonNull
    @ProtobufIndex(index = 4)
    public String bgImage;

    @ProtobufIndex(index = 5)
    public int count;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String iconBottomLabel;

    @NonNull
    @ProtobufIndex(index = 6)
    public String iconTopLabel;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 7)
    public String f45317id;

    @ProtobufIndex(index = 2)
    public boolean isOwned;
    public static ProtobufAdapter<BLiveUserCardGiftWallGift> PROTOBUF_ADAPTER = new C12353a();
    public static JsonAdapter<BLiveUserCardGiftWallGift> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserCardGiftWallGift>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserCardGiftWallGift.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserCardGiftWallGift newInstance() {
            return new BLiveUserCardGiftWallGift();
        }

        public boolean parseField(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgImage":
                    bLiveUserCardGiftWallGift.bgImage = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveUserCardGiftWallGift.f45317id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveUserCardGiftWallGift.icon = jsonParser.getValueAsString();
                    return true;
                case "count":
                    bLiveUserCardGiftWallGift.count = jsonParser.getValueAsInt();
                    return true;
                case "iconTopLabel":
                    bLiveUserCardGiftWallGift.iconTopLabel = jsonParser.getValueAsString();
                    return true;
                case "iconBottomLabel":
                    bLiveUserCardGiftWallGift.iconBottomLabel = jsonParser.getValueAsString();
                    return true;
                case "isOwned":
                    bLiveUserCardGiftWallGift.isOwned = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserCardGiftWallGift.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            jsonGenerator.writeBooleanField("isOwned", bLiveUserCardGiftWallGift.isOwned);
            String str2 = bLiveUserCardGiftWallGift.iconBottomLabel;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconBottomLabel", str2);
            }
            String str3 = bLiveUserCardGiftWallGift.iconTopLabel;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconTopLabel", str3);
            }
            String str4 = bLiveUserCardGiftWallGift.bgImage;
            if (str4 != null) {
                jsonGenerator.writeStringField("bgImage", str4);
            }
            jsonGenerator.writeNumberField("count", bLiveUserCardGiftWallGift.count);
            String str5 = bLiveUserCardGiftWallGift.f45317id;
            if (str5 != null) {
                jsonGenerator.writeStringField("id", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserCardGiftWallGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift$a */
    public class C12353a extends MessageNanoAdapter<BLiveUserCardGiftWallGift> {
        public C12353a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift) {
            String str = bLiveUserCardGiftWallGift.icon;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, bLiveUserCardGiftWallGift.isOwned);
            String str2 = bLiveUserCardGiftWallGift.iconBottomLabel;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = bLiveUserCardGiftWallGift.bgImage;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(5, bLiveUserCardGiftWallGift.count);
            String str4 = bLiveUserCardGiftWallGift.iconTopLabel;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = bLiveUserCardGiftWallGift.f45317id;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            bLiveUserCardGiftWallGift.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveUserCardGiftWallGift parse(nc5 nc5Var) throws IOException {
            BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift = new BLiveUserCardGiftWallGift();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveUserCardGiftWallGift.icon == null) {
                        bLiveUserCardGiftWallGift.icon = "";
                    }
                    if (bLiveUserCardGiftWallGift.iconBottomLabel == null) {
                        bLiveUserCardGiftWallGift.iconBottomLabel = "";
                    }
                    if (bLiveUserCardGiftWallGift.iconTopLabel == null) {
                        bLiveUserCardGiftWallGift.iconTopLabel = "";
                    }
                    if (bLiveUserCardGiftWallGift.bgImage == null) {
                        bLiveUserCardGiftWallGift.bgImage = "";
                    }
                    if (bLiveUserCardGiftWallGift.f45317id != null) {
                        break;
                    }
                    bLiveUserCardGiftWallGift.f45317id = "";
                    break;
                }
                if (iM162497u == 10) {
                    bLiveUserCardGiftWallGift.icon = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    bLiveUserCardGiftWallGift.isOwned = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    bLiveUserCardGiftWallGift.iconBottomLabel = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    bLiveUserCardGiftWallGift.bgImage = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    bLiveUserCardGiftWallGift.count = nc5Var.m162486j();
                } else if (iM162497u == 50) {
                    bLiveUserCardGiftWallGift.iconTopLabel = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
                        if (bLiveUserCardGiftWallGift.icon == null) {
                            bLiveUserCardGiftWallGift.icon = "";
                        }
                        if (bLiveUserCardGiftWallGift.iconBottomLabel == null) {
                            bLiveUserCardGiftWallGift.iconBottomLabel = "";
                        }
                        if (bLiveUserCardGiftWallGift.iconTopLabel == null) {
                            bLiveUserCardGiftWallGift.iconTopLabel = "";
                        }
                        if (bLiveUserCardGiftWallGift.bgImage == null) {
                            bLiveUserCardGiftWallGift.bgImage = "";
                        }
                        if (bLiveUserCardGiftWallGift.f45317id != null) {
                            break;
                        }
                        bLiveUserCardGiftWallGift.f45317id = "";
                        return bLiveUserCardGiftWallGift;
                    }
                    bLiveUserCardGiftWallGift.f45317id = nc5Var.m162495s();
                }
            }
            return bLiveUserCardGiftWallGift;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveUserCardGiftWallGift.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, bLiveUserCardGiftWallGift.isOwned);
            String str2 = bLiveUserCardGiftWallGift.iconBottomLabel;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = bLiveUserCardGiftWallGift.bgImage;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            codedOutputByteBufferNano.m17305G(5, bLiveUserCardGiftWallGift.count);
            String str4 = bLiveUserCardGiftWallGift.iconTopLabel;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = bLiveUserCardGiftWallGift.f45317id;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
        }
    }

    public static BLiveUserCardGiftWallGift new_() {
        BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift = new BLiveUserCardGiftWallGift();
        bLiveUserCardGiftWallGift.nullCheck();
        return bLiveUserCardGiftWallGift;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserCardGiftWallGift mo225055clone() {
        BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift = new BLiveUserCardGiftWallGift();
        bLiveUserCardGiftWallGift.icon = this.icon;
        bLiveUserCardGiftWallGift.isOwned = this.isOwned;
        bLiveUserCardGiftWallGift.iconBottomLabel = this.iconBottomLabel;
        bLiveUserCardGiftWallGift.iconTopLabel = this.iconTopLabel;
        bLiveUserCardGiftWallGift.bgImage = this.bgImage;
        bLiveUserCardGiftWallGift.count = this.count;
        bLiveUserCardGiftWallGift.f45317id = this.f45317id;
        return bLiveUserCardGiftWallGift;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserCardGiftWallGift)) {
            return false;
        }
        BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift = (BLiveUserCardGiftWallGift) obj;
        return ValueObject.util_equals(this.icon, bLiveUserCardGiftWallGift.icon) && this.isOwned == bLiveUserCardGiftWallGift.isOwned && ValueObject.util_equals(this.iconBottomLabel, bLiveUserCardGiftWallGift.iconBottomLabel) && ValueObject.util_equals(this.iconTopLabel, bLiveUserCardGiftWallGift.iconTopLabel) && ValueObject.util_equals(this.bgImage, bLiveUserCardGiftWallGift.bgImage) && this.count == bLiveUserCardGiftWallGift.count && ValueObject.util_equals(this.f45317id, bLiveUserCardGiftWallGift.f45317id);
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
        String str = this.icon;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isOwned ? 1231 : 1237)) * 41;
        String str2 = this.iconBottomLabel;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.iconTopLabel;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bgImage;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.count) * 41;
        String str5 = this.f45317id;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.iconBottomLabel == null) {
            this.iconBottomLabel = "";
        }
        if (this.iconTopLabel == null) {
            this.iconTopLabel = "";
        }
        if (this.bgImage == null) {
            this.bgImage = "";
        }
        if (this.f45317id == null) {
            this.f45317id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
