package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OmsTagUserCounts;
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
public class OmsTagCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omstagcard";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Media> pictures;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<OmsTagUserCounts> tagUserCounts;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<OmsTagCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsTagCard>() { // from class: com.p1.mobile.putong.data.OmsTagCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsTagCard omsTagCard) {
            List<Media> list = omsTagCard.pictures;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = omsTagCard.title;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = omsTagCard.subTitle;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            List<OmsTagUserCounts> list2 = omsTagCard.tagUserCounts;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, list2, OmsTagUserCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            omsTagCard.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsTagCard parse(nc5 nc5Var) throws IOException {
            OmsTagCard omsTagCard = new OmsTagCard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (omsTagCard.pictures == null) {
                        omsTagCard.pictures = new ArrayList();
                    }
                    if (omsTagCard.title == null) {
                        omsTagCard.title = "";
                    }
                    if (omsTagCard.subTitle == null) {
                        omsTagCard.subTitle = "";
                    }
                    if (omsTagCard.tagUserCounts != null) {
                        break;
                    }
                    omsTagCard.tagUserCounts = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    omsTagCard.pictures = (List) nc5Var.m162488l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    omsTagCard.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    omsTagCard.subTitle = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (omsTagCard.pictures == null) {
                            omsTagCard.pictures = new ArrayList();
                        }
                        if (omsTagCard.title == null) {
                            omsTagCard.title = "";
                        }
                        if (omsTagCard.subTitle == null) {
                            omsTagCard.subTitle = "";
                        }
                        if (omsTagCard.tagUserCounts != null) {
                            break;
                        }
                        omsTagCard.tagUserCounts = new ArrayList();
                        return omsTagCard;
                    }
                    omsTagCard.tagUserCounts = (List) nc5Var.m162488l(OmsTagUserCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return omsTagCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsTagCard omsTagCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Media> list = omsTagCard.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = omsTagCard.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = omsTagCard.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            List<OmsTagUserCounts> list2 = omsTagCard.tagUserCounts;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(4, list2, OmsTagUserCounts.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OmsTagCard> JSON_ADAPTER = new ObjectJsonAdapter<OmsTagCard>() { // from class: com.p1.mobile.putong.data.OmsTagCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsTagCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsTagCard newInstance() {
            return new OmsTagCard();
        }

        public boolean parseField(OmsTagCard omsTagCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    omsTagCard.subTitle = jsonParser.getValueAsString();
                    return true;
                case "tagUserCounts":
                    omsTagCard.tagUserCounts = JsonAdapter.parseArray(jsonParser, OmsTagUserCounts.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pictures":
                    omsTagCard.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    omsTagCard.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsTagCard omsTagCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "tagUserCounts":
                case "pictures":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(omsTagCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsTagCard omsTagCard, JsonGenerator jsonGenerator) throws IOException {
            if (omsTagCard.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(omsTagCard.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str = omsTagCard.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = omsTagCard.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            if (omsTagCard.tagUserCounts != null) {
                jsonGenerator.writeFieldName("tagUserCounts");
                JsonAdapter.serializeArray(omsTagCard.tagUserCounts, jsonGenerator, OmsTagUserCounts.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsTagCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsTagCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsTagCard new_() {
        OmsTagCard omsTagCard = new OmsTagCard();
        omsTagCard.nullCheck();
        return omsTagCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsTagCard mo225055clone() {
        OmsTagCard omsTagCard = new OmsTagCard();
        List<Media> list = this.pictures;
        if (list != null) {
            omsTagCard.pictures = ValueObject.util_map(list, new qcj() { // from class: l.wk50
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).mo225055clone();
                }
            });
        }
        omsTagCard.title = this.title;
        omsTagCard.subTitle = this.subTitle;
        List<OmsTagUserCounts> list2 = this.tagUserCounts;
        if (list2 != null) {
            omsTagCard.tagUserCounts = ValueObject.util_map(list2, new qcj() { // from class: l.xk50
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OmsTagUserCounts) obj).mo225055clone();
                }
            });
        }
        return omsTagCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsTagCard)) {
            return false;
        }
        OmsTagCard omsTagCard = (OmsTagCard) obj;
        return ValueObject.util_equals(this.pictures, omsTagCard.pictures) && ValueObject.util_equals(this.title, omsTagCard.title) && ValueObject.util_equals(this.subTitle, omsTagCard.subTitle) && ValueObject.util_equals(this.tagUserCounts, omsTagCard.tagUserCounts);
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
        List<Media> list = this.pictures;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<OmsTagUserCounts> list2 = this.tagUserCounts;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.tagUserCounts == null) {
            this.tagUserCounts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
