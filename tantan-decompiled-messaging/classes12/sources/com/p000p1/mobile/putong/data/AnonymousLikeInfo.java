package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AnonymousLikeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymouslikeinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Media> pictures;

    @NonNull
    @ProtobufIndex(index = 1)
    public String replaceUrl;
    public static ProtobufAdapter<AnonymousLikeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnonymousLikeInfo>() { // from class: com.p1.mobile.putong.data.AnonymousLikeInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AnonymousLikeInfo anonymousLikeInfo) {
            String str = anonymousLikeInfo.replaceUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = anonymousLikeInfo.itemId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<Media> list = anonymousLikeInfo.pictures;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) anonymousLikeInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AnonymousLikeInfo m17701parse(nb5 nb5Var) throws IOException {
            AnonymousLikeInfo anonymousLikeInfo = new AnonymousLikeInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (anonymousLikeInfo.replaceUrl == null) {
                        anonymousLikeInfo.replaceUrl = "";
                    }
                    if (anonymousLikeInfo.itemId == null) {
                        anonymousLikeInfo.itemId = "";
                    }
                    if (anonymousLikeInfo.pictures != null) {
                        break;
                    }
                    anonymousLikeInfo.pictures = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    anonymousLikeInfo.replaceUrl = nb5Var.s();
                } else if (iU == 18) {
                    anonymousLikeInfo.itemId = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (anonymousLikeInfo.replaceUrl == null) {
                            anonymousLikeInfo.replaceUrl = "";
                        }
                        if (anonymousLikeInfo.itemId == null) {
                            anonymousLikeInfo.itemId = "";
                        }
                        if (anonymousLikeInfo.pictures != null) {
                            break;
                        }
                        anonymousLikeInfo.pictures = new ArrayList();
                        return anonymousLikeInfo;
                    }
                    anonymousLikeInfo.pictures = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return anonymousLikeInfo;
        }

        public void serialize(AnonymousLikeInfo anonymousLikeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = anonymousLikeInfo.replaceUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = anonymousLikeInfo.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<Media> list = anonymousLikeInfo.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AnonymousLikeInfo> JSON_ADAPTER = new ObjectJsonAdapter<AnonymousLikeInfo>() { // from class: com.p1.mobile.putong.data.AnonymousLikeInfo.2
        public Class getDataClass() {
            return AnonymousLikeInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AnonymousLikeInfo mo17830newInstance() {
            return new AnonymousLikeInfo();
        }

        public boolean parseField(AnonymousLikeInfo anonymousLikeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "replaceUrl":
                    anonymousLikeInfo.replaceUrl = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    anonymousLikeInfo.itemId = jsonParser.getValueAsString();
                    return true;
                case "pictures":
                    anonymousLikeInfo.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AnonymousLikeInfo anonymousLikeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "replaceUrl":
                case "itemId":
                case "pictures":
                    return true;
                default:
                    return super.parseFieldCheck(anonymousLikeInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AnonymousLikeInfo anonymousLikeInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = anonymousLikeInfo.replaceUrl;
            if (str != null) {
                jsonGenerator.writeStringField("replaceUrl", str);
            }
            String str2 = anonymousLikeInfo.itemId;
            if (str2 != null) {
                jsonGenerator.writeStringField("itemId", str2);
            }
            if (anonymousLikeInfo.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(anonymousLikeInfo.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnonymousLikeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnonymousLikeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnonymousLikeInfo new_() {
        AnonymousLikeInfo anonymousLikeInfo = new AnonymousLikeInfo();
        anonymousLikeInfo.nullCheck();
        return anonymousLikeInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AnonymousLikeInfo m17700clone() {
        AnonymousLikeInfo anonymousLikeInfo = new AnonymousLikeInfo();
        anonymousLikeInfo.replaceUrl = this.replaceUrl;
        anonymousLikeInfo.itemId = this.itemId;
        List<Media> list = this.pictures;
        if (list != null) {
            anonymousLikeInfo.pictures = ValueObject.util_map(list, new w9j() { // from class: l.xs0
                public final Object call(Object obj) {
                    return ((Media) obj).mo17714clone();
                }
            });
        }
        return anonymousLikeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousLikeInfo)) {
            return false;
        }
        AnonymousLikeInfo anonymousLikeInfo = (AnonymousLikeInfo) obj;
        return ValueObject.util_equals(this.replaceUrl, anonymousLikeInfo.replaceUrl) && ValueObject.util_equals(this.itemId, anonymousLikeInfo.itemId) && ValueObject.util_equals(this.pictures, anonymousLikeInfo.pictures);
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
        String str = this.replaceUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.itemId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Media> list = this.pictures;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.replaceUrl == null) {
            this.replaceUrl = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
