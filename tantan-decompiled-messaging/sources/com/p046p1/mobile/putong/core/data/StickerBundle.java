package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Picture;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class StickerBundle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bundle";

    @NonNull
    @ProtobufIndex(index = 7)
    public String currency;

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 5)
    public String f20505id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> packages;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<Picture> pictures;

    @ProtobufIndex(index = 3)
    public int price;

    @NonNull
    @ProtobufIndex(index = 6)
    public BundleStatus status;
    public static ProtobufAdapter<StickerBundle> PROTOBUF_ADAPTER = new MessageNanoAdapter<StickerBundle>() { // from class: com.p1.mobile.putong.core.data.StickerBundle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StickerBundle stickerBundle) {
            String str = stickerBundle.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = stickerBundle.description;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, stickerBundle.price);
            List<Picture> list = stickerBundle.pictures;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(4, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = stickerBundle.f20505id;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            BundleStatus bundleStatus = stickerBundle.status;
            if (bundleStatus != null) {
                iM17226h += CodedOutputByteBufferNano.m17226h(6, bundleStatus.ordinal());
            }
            String str4 = stickerBundle.currency;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str4);
            }
            List<String> list2 = stickerBundle.packages;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            BundleStatus bundleStatus2 = stickerBundle.status;
            if (bundleStatus2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(9, bundleStatus2, BundleStatus.PROTOBUF_ADAPTER);
            }
            stickerBundle.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StickerBundle parse(nb5 nb5Var) throws IOException {
            StickerBundle stickerBundle = new StickerBundle();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (stickerBundle.status == null && numValueOf != null) {
                        stickerBundle.status = (BundleStatus) BundleStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                    if (stickerBundle.f20505id == null) {
                        stickerBundle.f20505id = "";
                    }
                    if (stickerBundle.status == null) {
                        stickerBundle.status = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
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
                if (iM158752u == 10) {
                    stickerBundle.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    stickerBundle.description = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    stickerBundle.price = nb5Var.m158741j();
                } else if (iM158752u == 34) {
                    stickerBundle.pictures = (List) nb5Var.m158743l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    stickerBundle.f20505id = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 58) {
                    stickerBundle.currency = nb5Var.m158750s();
                } else if (iM158752u == 66) {
                    stickerBundle.packages = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 74) {
                        if (stickerBundle.status == null && numValueOf != null) {
                            stickerBundle.status = (BundleStatus) BundleStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                        if (stickerBundle.f20505id == null) {
                            stickerBundle.f20505id = "";
                        }
                        if (stickerBundle.status == null) {
                            stickerBundle.status = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
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
                    stickerBundle.status = (BundleStatus) nb5Var.m158743l(BundleStatus.PROTOBUF_ADAPTER);
                }
            }
            return stickerBundle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StickerBundle stickerBundle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stickerBundle.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = stickerBundle.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, stickerBundle.price);
            List<Picture> list = stickerBundle.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = stickerBundle.f20505id;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            BundleStatus bundleStatus = stickerBundle.status;
            if (bundleStatus != null) {
                codedOutputByteBufferNano.m17250G(6, bundleStatus.ordinal());
            }
            String str4 = stickerBundle.currency;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(7, str4);
            }
            List<String> list2 = stickerBundle.packages;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(8, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            BundleStatus bundleStatus2 = stickerBundle.status;
            if (bundleStatus2 != null) {
                codedOutputByteBufferNano.m17254K(9, bundleStatus2, BundleStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<StickerBundle> JSON_ADAPTER = new ObjectJsonAdapter<StickerBundle>() { // from class: com.p1.mobile.putong.core.data.StickerBundle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StickerBundle.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StickerBundle newInstance() {
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
                    stickerBundle.status = BundleStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "pictures":
                    stickerBundle.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    stickerBundle.f20505id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StickerBundle stickerBundle, JsonGenerator jsonGenerator) throws IOException {
            String str = stickerBundle.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = stickerBundle.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, stickerBundle.price);
            if (stickerBundle.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(stickerBundle.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            String str3 = stickerBundle.f20505id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id", str3);
            }
            if (stickerBundle.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BundleStatus.JSON_ADAPTER.serialize(stickerBundle.status, jsonGenerator, true);
            }
            String str4 = stickerBundle.currency;
            if (str4 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.CURRENCY, str4);
            }
            if (stickerBundle.packages != null) {
                jsonGenerator.writeFieldName("objects");
                JsonAdapter.serializeArray(stickerBundle.packages, jsonGenerator, Converter.PACKAGE_ID);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StickerBundle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StickerBundle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35861b(String str) {
        return str;
    }

    public static StickerBundle new_() {
        StickerBundle stickerBundle = new StickerBundle();
        stickerBundle.nullCheck();
        return stickerBundle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StickerBundle mo223809clone() {
        StickerBundle stickerBundle = new StickerBundle();
        stickerBundle.name = this.name;
        stickerBundle.description = this.description;
        stickerBundle.price = this.price;
        List<Picture> list = this.pictures;
        if (list != null) {
            stickerBundle.pictures = ValueObject.util_map(list, new w9j() { // from class: l.twf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Picture) obj).mo223809clone();
                }
            });
        }
        stickerBundle.f20505id = this.f20505id;
        stickerBundle.status = this.status;
        stickerBundle.currency = this.currency;
        List<String> list2 = this.packages;
        if (list2 != null) {
            stickerBundle.packages = ValueObject.util_map(list2, new w9j() { // from class: l.uwf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return StickerBundle.m35861b((String) obj);
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
        return ValueObject.util_equals(this.name, stickerBundle.name) && ValueObject.util_equals(this.description, stickerBundle.description) && this.price == stickerBundle.price && ValueObject.util_equals(this.pictures, stickerBundle.pictures) && ValueObject.util_equals(this.f20505id, stickerBundle.f20505id) && ValueObject.util_equals(this.status, stickerBundle.status) && ValueObject.util_equals(this.currency, stickerBundle.currency) && ValueObject.util_equals(this.packages, stickerBundle.packages);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.price) * 41;
        List<Picture> list = this.pictures;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.f20505id;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BundleStatus bundleStatus = this.status;
        int iHashCode5 = (iHashCode4 + (bundleStatus != null ? bundleStatus.hashCode() : 0)) * 41;
        String str4 = this.currency;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list2 = this.packages;
        int iHashCode7 = iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
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
        if (this.f20505id == null) {
            this.f20505id = "";
        }
        if (this.status == null) {
            this.status = (BundleStatus) BundleStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.currency == null) {
            this.currency = "";
        }
        if (this.packages == null) {
            this.packages = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
