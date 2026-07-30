package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
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

/* JADX INFO: loaded from: classes10.dex */
public class StickerPackage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "package";

    @ProtobufIndex(index = 1)
    public boolean activated;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f21248id;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Picture> pictures;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> stickers;
    public static ProtobufAdapter<StickerPackage> PROTOBUF_ADAPTER = new MessageNanoAdapter<StickerPackage>() { // from class: com.p1.mobile.putong.core.data.StickerPackage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StickerPackage stickerPackage) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, stickerPackage.activated);
            List<Picture> list = stickerPackage.pictures;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = stickerPackage.f21248id;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str);
            }
            List<String> list2 = stickerPackage.stickers;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            stickerPackage.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StickerPackage parse(nc5 nc5Var) throws IOException {
            StickerPackage stickerPackage = new StickerPackage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (stickerPackage.pictures == null) {
                        stickerPackage.pictures = new ArrayList();
                    }
                    if (stickerPackage.f21248id == null) {
                        stickerPackage.f21248id = "";
                    }
                    if (stickerPackage.stickers != null) {
                        break;
                    }
                    stickerPackage.stickers = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    stickerPackage.activated = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    stickerPackage.pictures = (List) nc5Var.m162488l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 26) {
                    stickerPackage.f21248id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (stickerPackage.pictures == null) {
                            stickerPackage.pictures = new ArrayList();
                        }
                        if (stickerPackage.f21248id == null) {
                            stickerPackage.f21248id = "";
                        }
                        if (stickerPackage.stickers != null) {
                            break;
                        }
                        stickerPackage.stickers = new ArrayList();
                        return stickerPackage;
                    }
                    stickerPackage.stickers = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return stickerPackage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StickerPackage stickerPackage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, stickerPackage.activated);
            List<Picture> list = stickerPackage.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = stickerPackage.f21248id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            List<String> list2 = stickerPackage.stickers;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<StickerPackage> JSON_ADAPTER = new ObjectJsonAdapter<StickerPackage>() { // from class: com.p1.mobile.putong.core.data.StickerPackage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StickerPackage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StickerPackage newInstance() {
            return new StickerPackage();
        }

        public boolean parseField(StickerPackage stickerPackage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "objects":
                    stickerPackage.stickers = JsonAdapter.parseArray(jsonParser, Converter.STICKER_ID, str2, arrayList, dataChecker);
                    return true;
                case "pictures":
                    stickerPackage.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    stickerPackage.f21248id = jsonParser.getValueAsString();
                    return false;
                case "activated":
                    stickerPackage.activated = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StickerPackage stickerPackage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "objects":
                case "pictures":
                    return true;
                case "id":
                    return false;
                case "activated":
                    return true;
                default:
                    return super.parseFieldCheck(stickerPackage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StickerPackage stickerPackage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(BLiveRightItem.STATUS_ACTIVATED, stickerPackage.activated);
            if (stickerPackage.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(stickerPackage.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            String str = stickerPackage.f21248id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (stickerPackage.stickers != null) {
                jsonGenerator.writeFieldName("objects");
                JsonAdapter.serializeArray(stickerPackage.stickers, jsonGenerator, Converter.STICKER_ID);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StickerPackage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StickerPackage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36865a(String str) {
        return str;
    }

    public static StickerPackage new_() {
        StickerPackage stickerPackage = new StickerPackage();
        stickerPackage.nullCheck();
        return stickerPackage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StickerPackage mo225055clone() {
        StickerPackage stickerPackage = new StickerPackage();
        stickerPackage.activated = this.activated;
        List<Picture> list = this.pictures;
        if (list != null) {
            stickerPackage.pictures = ValueObject.util_map(list, new qcj() { // from class: l.p5g0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Picture) obj).mo225055clone();
                }
            });
        }
        stickerPackage.f21248id = this.f21248id;
        List<String> list2 = this.stickers;
        if (list2 != null) {
            stickerPackage.stickers = ValueObject.util_map(list2, new qcj() { // from class: l.q5g0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return StickerPackage.m36865a((String) obj);
                }
            });
        }
        return stickerPackage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StickerPackage)) {
            return false;
        }
        StickerPackage stickerPackage = (StickerPackage) obj;
        return this.activated == stickerPackage.activated && ValueObject.util_equals(this.pictures, stickerPackage.pictures) && ValueObject.util_equals(this.f21248id, stickerPackage.f21248id) && ValueObject.util_equals(this.stickers, stickerPackage.stickers);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "package";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.activated ? 1231 : 1237)) * 41;
        List<Picture> list = this.pictures;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.f21248id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list2 = this.stickers;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.f21248id == null) {
            this.f21248id = "";
        }
        if (this.stickers == null) {
            this.stickers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
