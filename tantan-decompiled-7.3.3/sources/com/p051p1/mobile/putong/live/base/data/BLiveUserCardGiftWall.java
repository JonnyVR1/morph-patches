package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
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
public class BLiveUserCardGiftWall extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveusercardgiftwall";

    @NonNull
    @ProtobufIndex(index = 2)
    public String bgImage;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveUserCardGiftWallGift> gifts;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String titleBgImage;

    @NonNull
    @ProtobufIndex(index = 5)
    public String titleColor;
    public static ProtobufAdapter<BLiveUserCardGiftWall> PROTOBUF_ADAPTER = new C12351a();
    public static JsonAdapter<BLiveUserCardGiftWall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserCardGiftWall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWall.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserCardGiftWall.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserCardGiftWall newInstance() {
            return new BLiveUserCardGiftWall();
        }

        public boolean parseField(BLiveUserCardGiftWall bLiveUserCardGiftWall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "titleColor":
                    bLiveUserCardGiftWall.titleColor = jsonParser.getValueAsString();
                    return true;
                case "bgImage":
                    bLiveUserCardGiftWall.bgImage = jsonParser.getValueAsString();
                    return true;
                case "gifts":
                    bLiveUserCardGiftWall.gifts = JsonAdapter.parseArray(jsonParser, BLiveUserCardGiftWallGift.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveUserCardGiftWall.title = jsonParser.getValueAsString();
                    return true;
                case "titleBgImage":
                    bLiveUserCardGiftWall.titleBgImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserCardGiftWall bLiveUserCardGiftWall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserCardGiftWall.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveUserCardGiftWall.bgImage;
            if (str2 != null) {
                jsonGenerator.writeStringField("bgImage", str2);
            }
            if (bLiveUserCardGiftWall.gifts != null) {
                jsonGenerator.writeFieldName("gifts");
                JsonAdapter.serializeArray(bLiveUserCardGiftWall.gifts, jsonGenerator, BLiveUserCardGiftWallGift.JSON_ADAPTER);
            }
            String str3 = bLiveUserCardGiftWall.titleBgImage;
            if (str3 != null) {
                jsonGenerator.writeStringField("titleBgImage", str3);
            }
            String str4 = bLiveUserCardGiftWall.titleColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("titleColor", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserCardGiftWall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWall$a */
    public class C12351a extends MessageNanoAdapter<BLiveUserCardGiftWall> {
        public C12351a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveUserCardGiftWall bLiveUserCardGiftWall) {
            String str = bLiveUserCardGiftWall.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = bLiveUserCardGiftWall.bgImage;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<BLiveUserCardGiftWallGift> list = bLiveUserCardGiftWall.gifts;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, BLiveUserCardGiftWallGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = bLiveUserCardGiftWall.titleBgImage;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = bLiveUserCardGiftWall.titleColor;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            bLiveUserCardGiftWall.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveUserCardGiftWall parse(nc5 nc5Var) throws IOException {
            BLiveUserCardGiftWall bLiveUserCardGiftWall = new BLiveUserCardGiftWall();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveUserCardGiftWall.title == null) {
                        bLiveUserCardGiftWall.title = "";
                    }
                    if (bLiveUserCardGiftWall.bgImage == null) {
                        bLiveUserCardGiftWall.bgImage = "";
                    }
                    if (bLiveUserCardGiftWall.gifts == null) {
                        bLiveUserCardGiftWall.gifts = new ArrayList();
                    }
                    if (bLiveUserCardGiftWall.titleBgImage == null) {
                        bLiveUserCardGiftWall.titleBgImage = "";
                    }
                    if (bLiveUserCardGiftWall.titleColor != null) {
                        break;
                    }
                    bLiveUserCardGiftWall.titleColor = "";
                    break;
                }
                if (iM162497u == 10) {
                    bLiveUserCardGiftWall.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    bLiveUserCardGiftWall.bgImage = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bLiveUserCardGiftWall.gifts = (List) nc5Var.m162488l(BLiveUserCardGiftWallGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 34) {
                    bLiveUserCardGiftWall.titleBgImage = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (bLiveUserCardGiftWall.title == null) {
                            bLiveUserCardGiftWall.title = "";
                        }
                        if (bLiveUserCardGiftWall.bgImage == null) {
                            bLiveUserCardGiftWall.bgImage = "";
                        }
                        if (bLiveUserCardGiftWall.gifts == null) {
                            bLiveUserCardGiftWall.gifts = new ArrayList();
                        }
                        if (bLiveUserCardGiftWall.titleBgImage == null) {
                            bLiveUserCardGiftWall.titleBgImage = "";
                        }
                        if (bLiveUserCardGiftWall.titleColor != null) {
                            break;
                        }
                        bLiveUserCardGiftWall.titleColor = "";
                        return bLiveUserCardGiftWall;
                    }
                    bLiveUserCardGiftWall.titleColor = nc5Var.m162495s();
                }
            }
            return bLiveUserCardGiftWall;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveUserCardGiftWall bLiveUserCardGiftWall, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveUserCardGiftWall.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = bLiveUserCardGiftWall.bgImage;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<BLiveUserCardGiftWallGift> list = bLiveUserCardGiftWall.gifts;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, BLiveUserCardGiftWallGift.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = bLiveUserCardGiftWall.titleBgImage;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = bLiveUserCardGiftWall.titleColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
        }
    }

    public static BLiveUserCardGiftWall new_() {
        BLiveUserCardGiftWall bLiveUserCardGiftWall = new BLiveUserCardGiftWall();
        bLiveUserCardGiftWall.nullCheck();
        return bLiveUserCardGiftWall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserCardGiftWall mo225055clone() {
        BLiveUserCardGiftWall bLiveUserCardGiftWall = new BLiveUserCardGiftWall();
        bLiveUserCardGiftWall.title = this.title;
        bLiveUserCardGiftWall.bgImage = this.bgImage;
        List<BLiveUserCardGiftWallGift> list = this.gifts;
        if (list != null) {
            bLiveUserCardGiftWall.gifts = ValueObject.util_map(list, new qcj() { // from class: l.v72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserCardGiftWallGift) obj).mo225055clone();
                }
            });
        }
        bLiveUserCardGiftWall.titleBgImage = this.titleBgImage;
        bLiveUserCardGiftWall.titleColor = this.titleColor;
        return bLiveUserCardGiftWall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserCardGiftWall)) {
            return false;
        }
        BLiveUserCardGiftWall bLiveUserCardGiftWall = (BLiveUserCardGiftWall) obj;
        return ValueObject.util_equals(this.title, bLiveUserCardGiftWall.title) && ValueObject.util_equals(this.bgImage, bLiveUserCardGiftWall.bgImage) && ValueObject.util_equals(this.gifts, bLiveUserCardGiftWall.gifts) && ValueObject.util_equals(this.titleBgImage, bLiveUserCardGiftWall.titleBgImage) && ValueObject.util_equals(this.titleColor, bLiveUserCardGiftWall.titleColor);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bgImage;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveUserCardGiftWallGift> list = this.gifts;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.titleBgImage;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.titleColor;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.bgImage == null) {
            this.bgImage = "";
        }
        if (this.gifts == null) {
            this.gifts = new ArrayList();
        }
        if (this.titleBgImage == null) {
            this.titleBgImage = "";
        }
        if (this.titleColor == null) {
            this.titleColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
