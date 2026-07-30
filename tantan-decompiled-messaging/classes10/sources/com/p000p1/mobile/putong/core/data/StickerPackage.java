package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.StickerPackage;
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
public class StickerPackage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "package";

    @ProtobufIndex(index = 1)
    public boolean activated;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String f168id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Picture> pictures;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> stickers;
    public static ProtobufAdapter<StickerPackage> PROTOBUF_ADAPTER = new MessageNanoAdapter<StickerPackage>() { // from class: com.p1.mobile.putong.core.data.StickerPackage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StickerPackage stickerPackage) {
            int iB = CodedOutputByteBufferNano.b(1, stickerPackage.activated);
            List<Picture> list = stickerPackage.pictures;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(2, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = stickerPackage.f168id;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            List<String> list2 = stickerPackage.stickers;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) stickerPackage).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StickerPackage m15778parse(nb5 nb5Var) throws IOException {
            StickerPackage stickerPackage = new StickerPackage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stickerPackage.pictures == null) {
                        stickerPackage.pictures = new ArrayList();
                    }
                    if (stickerPackage.f168id == null) {
                        stickerPackage.f168id = "";
                    }
                    if (stickerPackage.stickers != null) {
                        break;
                    }
                    stickerPackage.stickers = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    stickerPackage.activated = nb5Var.g();
                } else if (iU == 18) {
                    stickerPackage.pictures = (List) nb5Var.l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    stickerPackage.f168id = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (stickerPackage.pictures == null) {
                            stickerPackage.pictures = new ArrayList();
                        }
                        if (stickerPackage.f168id == null) {
                            stickerPackage.f168id = "";
                        }
                        if (stickerPackage.stickers != null) {
                            break;
                        }
                        stickerPackage.stickers = new ArrayList();
                        return stickerPackage;
                    }
                    stickerPackage.stickers = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return stickerPackage;
        }

        public void serialize(StickerPackage stickerPackage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, stickerPackage.activated);
            List<Picture> list = stickerPackage.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = stickerPackage.f168id;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            List<String> list2 = stickerPackage.stickers;
            if (list2 != null) {
                codedOutputByteBufferNano.K(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<StickerPackage> JSON_ADAPTER = new ObjectJsonAdapter<StickerPackage>() { // from class: com.p1.mobile.putong.core.data.StickerPackage.2
        public Class getDataClass() {
            return StickerPackage.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public StickerPackage m15779newInstance() {
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
                    stickerPackage.f168id = jsonParser.getValueAsString();
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

        public void serializeFields(StickerPackage stickerPackage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("activated", stickerPackage.activated);
            if (stickerPackage.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(stickerPackage.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
            String str = stickerPackage.f168id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (stickerPackage.stickers != null) {
                jsonGenerator.writeFieldName("objects");
                JsonAdapter.serializeArray(stickerPackage.stickers, jsonGenerator, Converter.STICKER_ID);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StickerPackage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StickerPackage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m664a(String str) {
        return str;
    }

    public static StickerPackage new_() {
        StickerPackage stickerPackage = new StickerPackage();
        stickerPackage.nullCheck();
        return stickerPackage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StickerPackage m15777clone() {
        StickerPackage stickerPackage = new StickerPackage();
        stickerPackage.activated = this.activated;
        List<Picture> list = this.pictures;
        if (list != null) {
            stickerPackage.pictures = ValueObject.util_map(list, new w9j() { // from class: l.fxf0
                public final Object call(Object obj) {
                    return ((Picture) obj).clone();
                }
            });
        }
        stickerPackage.f168id = this.f168id;
        List<String> list2 = this.stickers;
        if (list2 != null) {
            stickerPackage.stickers = ValueObject.util_map(list2, new w9j() { // from class: l.gxf0
                public final Object call(Object obj) {
                    return StickerPackage.m664a((String) obj);
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
        return this.activated == stickerPackage.activated && ValueObject.util_equals(this.pictures, stickerPackage.pictures) && ValueObject.util_equals(this.f168id, stickerPackage.f168id) && ValueObject.util_equals(this.stickers, stickerPackage.stickers);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.activated ? 1231 : 1237)) * 41;
        List<Picture> list = this.pictures;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.f168id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list2 = this.stickers;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.f168id == null) {
            this.f168id = "";
        }
        if (this.stickers == null) {
            this.stickers = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
