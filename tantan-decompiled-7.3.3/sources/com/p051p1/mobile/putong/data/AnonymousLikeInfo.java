package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Media;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AnonymousLikeInfo anonymousLikeInfo) {
            String str = anonymousLikeInfo.replaceUrl;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = anonymousLikeInfo.itemId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<Media> list = anonymousLikeInfo.pictures;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            anonymousLikeInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AnonymousLikeInfo parse(nc5 nc5Var) throws IOException {
            AnonymousLikeInfo anonymousLikeInfo = new AnonymousLikeInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    anonymousLikeInfo.replaceUrl = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    anonymousLikeInfo.itemId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
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
                    anonymousLikeInfo.pictures = (List) nc5Var.m162488l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return anonymousLikeInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AnonymousLikeInfo anonymousLikeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = anonymousLikeInfo.replaceUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = anonymousLikeInfo.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<Media> list = anonymousLikeInfo.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AnonymousLikeInfo> JSON_ADAPTER = new ObjectJsonAdapter<AnonymousLikeInfo>() { // from class: com.p1.mobile.putong.data.AnonymousLikeInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AnonymousLikeInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AnonymousLikeInfo newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnonymousLikeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnonymousLikeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnonymousLikeInfo new_() {
        AnonymousLikeInfo anonymousLikeInfo = new AnonymousLikeInfo();
        anonymousLikeInfo.nullCheck();
        return anonymousLikeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AnonymousLikeInfo mo225055clone() {
        AnonymousLikeInfo anonymousLikeInfo = new AnonymousLikeInfo();
        anonymousLikeInfo.replaceUrl = this.replaceUrl;
        anonymousLikeInfo.itemId = this.itemId;
        List<Media> list = this.pictures;
        if (list != null) {
            anonymousLikeInfo.pictures = ValueObject.util_map(list, new qcj() { // from class: l.ct0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).mo225055clone();
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
        String str = this.replaceUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.itemId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Media> list = this.pictures;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
