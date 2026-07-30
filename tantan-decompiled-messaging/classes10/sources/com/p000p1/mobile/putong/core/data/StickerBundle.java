package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.StickerBundle;
import com.p1.mobile.putong.data.BundleStatus;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Picture;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class StickerBundle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bundle";

    @NonNull
    @ProtobufIndex(index = 7)
    public String currency;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String description;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String f167id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> packages;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Picture> pictures;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int price;

    @NonNull
    @ProtobufIndex(index = 6)
    public BundleStatus status;
    public static ProtobufAdapter<StickerBundle> PROTOBUF_ADAPTER = new MessageNanoAdapter<StickerBundle>() { // from class: com.p1.mobile.putong.core.data.StickerBundle.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StickerBundle stickerBundle) {
            String str = stickerBundle.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = stickerBundle.description;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, stickerBundle.price);
            List<Picture> list = stickerBundle.pictures;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(4, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = stickerBundle.f167id;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            BundleStatus bundleStatus = stickerBundle.status;
            if (bundleStatus != null) {
                iH += CodedOutputByteBufferNano.h(6, bundleStatus.ordinal());
            }
            String str4 = stickerBundle.currency;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(7, str4);
            }
            List<String> list2 = stickerBundle.packages;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(8, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            BundleStatus bundleStatus2 = stickerBundle.status;
            if (bundleStatus2 != null) {
                iH += CodedOutputByteBufferNano.l(9, bundleStatus2, BundleStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) stickerBundle).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StickerBundle m15774parse(nb5 nb5Var) throws IOException {
            StickerBundle stickerBundle = new StickerBundle();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stickerBundle.status == null && numValueOf != null) {
                        stickerBundle.status = BundleStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (stickerBundle.name == null) {
                        stickerBundle.name = "";
                    }
                    if (stickerBundle.description == null) {
                        stickerBundle.description = "";
                    }
                    if (stickerBundle.pictures == null) {
                        stickerBundle.pictures = new ArrayList();
                    }
                    if (stickerBundle.f167id == null) {
                        stickerBundle.f167id = "";
                    }
                    if (stickerBundle.status == null) {
                        stickerBundle.status = BundleStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (stickerBundle.currency == null) {
                        stickerBundle.currency = "";
                    }
                    if (stickerBundle.packages != null) {
                        break;
                    }
                    stickerBundle.packages = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    stickerBundle.name = nb5Var.s();
                } else if (iU == 18) {
                    stickerBundle.description = nb5Var.s();
                } else if (iU == 24) {
                    stickerBundle.price = nb5Var.j();
                } else if (iU == 34) {
                    stickerBundle.pictures = (List) nb5Var.l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    stickerBundle.f167id = nb5Var.s();
                } else if (iU == 48) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 58) {
                    stickerBundle.currency = nb5Var.s();
                } else if (iU == 66) {
                    stickerBundle.packages = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 74) {
                        if (stickerBundle.status == null && numValueOf != null) {
                            stickerBundle.status = BundleStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (stickerBundle.name == null) {
                            stickerBundle.name = "";
                        }
                        if (stickerBundle.description == null) {
                            stickerBundle.description = "";
                        }
                        if (stickerBundle.pictures == null) {
                            stickerBundle.pictures = new ArrayList();
                        }
                        if (stickerBundle.f167id == null) {
                            stickerBundle.f167id = "";
                        }
                        if (stickerBundle.status == null) {
                            stickerBundle.status = BundleStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (stickerBundle.currency == null) {
                            stickerBundle.currency = "";
                        }
                        if (stickerBundle.packages != null) {
                            break;
                        }
                        stickerBundle.packages = new ArrayList();
                        return stickerBundle;
                    }
                    stickerBundle.status = (BundleStatus) nb5Var.l(BundleStatus.PROTOBUF_ADAPTER);
                }
            }
            return stickerBundle;
        }

        public void serialize(StickerBundle stickerBundle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stickerBundle.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = stickerBundle.description;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, stickerBundle.price);
            List<Picture> list = stickerBundle.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = stickerBundle.f167id;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            BundleStatus bundleStatus = stickerBundle.status;
            if (bundleStatus != null) {
                codedOutputByteBufferNano.G(6, bundleStatus.ordinal());
            }
            String str4 = stickerBundle.currency;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
            List<String> list2 = stickerBundle.packages;
            if (list2 != null) {
                codedOutputByteBufferNano.K(8, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            BundleStatus bundleStatus2 = stickerBundle.status;
            if (bundleStatus2 != null) {
                codedOutputByteBufferNano.K(9, bundleStatus2, BundleStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<StickerBundle> JSON_ADAPTER = new ObjectJsonAdapter<StickerBundle>() { // from class: com.p1.mobile.putong.core.data.StickerBundle.2
        public Class getDataClass() {
            return StickerBundle.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public StickerBundle m15775newInstance() {
            return new StickerBundle();
        }

        public boolean parseField(StickerBundle stickerBundle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    stickerBundle.description = jsonParser.getValueAsString();
                    return true;
                case "objects":
                    stickerBundle.packages = JsonAdapter.parseArray(jsonParser, Converter.PACKAGE_ID, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    stickerBundle.status = (BundleStatus) BundleStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "pictures":
                    stickerBundle.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    stickerBundle.f167id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    stickerBundle.name = jsonParser.getValueAsString();
                    return true;
                case "price":
                    stickerBundle.price = jsonParser.getValueAsInt();
                    return true;
                case "currency":
                    stickerBundle.currency = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StickerBundle stickerBundle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "objects":
                case "status":
                case "pictures":
                    return true;
                case "id":
                    return false;
                case "name":
                case "price":
                case "currency":
                    return true;
                default:
                    return super.parseFieldCheck(stickerBundle, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(StickerBundle stickerBundle, JsonGenerator jsonGenerator) throws IOException {
            String str = stickerBundle.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = stickerBundle.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            jsonGenerator.writeNumberField("price", stickerBundle.price);
            if (stickerBundle.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(stickerBundle.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            String str3 = stickerBundle.f167id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id", str3);
            }
            if (stickerBundle.status != null) {
                jsonGenerator.writeFieldName("status");
                BundleStatus.JSON_ADAPTER.serialize(stickerBundle.status, jsonGenerator, true);
            }
            String str4 = stickerBundle.currency;
            if (str4 != null) {
                jsonGenerator.writeStringField("currency", str4);
            }
            if (stickerBundle.packages != null) {
                jsonGenerator.writeFieldName("objects");
                JsonAdapter.serializeArray(stickerBundle.packages, jsonGenerator, Converter.PACKAGE_ID);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StickerBundle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StickerBundle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m663b(String str) {
        return str;
    }

    public static StickerBundle new_() {
        StickerBundle stickerBundle = new StickerBundle();
        stickerBundle.nullCheck();
        return stickerBundle;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StickerBundle m15773clone() {
        StickerBundle stickerBundle = new StickerBundle();
        stickerBundle.name = this.name;
        stickerBundle.description = this.description;
        stickerBundle.price = this.price;
        List<Picture> list = this.pictures;
        if (list != null) {
            stickerBundle.pictures = ValueObject.util_map(list, new w9j() { // from class: l.twf0
                public final Object call(Object obj) {
                    return ((Picture) obj).clone();
                }
            });
        }
        stickerBundle.f167id = this.f167id;
        stickerBundle.status = this.status;
        stickerBundle.currency = this.currency;
        List<String> list2 = this.packages;
        if (list2 != null) {
            stickerBundle.packages = ValueObject.util_map(list2, new w9j() { // from class: l.uwf0
                public final Object call(Object obj) {
                    return StickerBundle.m663b((String) obj);
                }
            });
        }
        return stickerBundle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StickerBundle)) {
            return false;
        }
        StickerBundle stickerBundle = (StickerBundle) obj;
        return ValueObject.util_equals(this.name, stickerBundle.name) && ValueObject.util_equals(this.description, stickerBundle.description) && this.price == stickerBundle.price && ValueObject.util_equals(this.pictures, stickerBundle.pictures) && ValueObject.util_equals(this.f167id, stickerBundle.f167id) && ValueObject.util_equals(this.status, stickerBundle.status) && ValueObject.util_equals(this.currency, stickerBundle.currency) && ValueObject.util_equals(this.packages, stickerBundle.packages);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.price) * 41;
        List<Picture> list = this.pictures;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.f167id;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BundleStatus bundleStatus = this.status;
        int iHashCode5 = (iHashCode4 + (bundleStatus != null ? bundleStatus.hashCode() : 0)) * 41;
        String str4 = this.currency;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list2 = this.packages;
        int iHashCode7 = iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.f167id == null) {
            this.f167id = "";
        }
        if (this.status == null) {
            this.status = BundleStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.currency == null) {
            this.currency = "";
        }
        if (this.packages == null) {
            this.packages = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
