package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.LiteratureConfig;
import com.p046p1.mobile.putong.data.Media;
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

/* JADX INFO: loaded from: classes12.dex */
public class OmsLiteratureCardGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsliteraturecardguide";

    @NonNull
    @ProtobufIndex(index = 4)
    public Action action;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<LiteratureConfig> literatureConfigs;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Media> pictures;

    @NonNull
    @ProtobufIndex(index = 5)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<OmsLiteratureCardGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsLiteratureCardGuide>() { // from class: com.p1.mobile.putong.data.OmsLiteratureCardGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsLiteratureCardGuide omsLiteratureCardGuide) {
            List<Media> list = omsLiteratureCardGuide.pictures;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = omsLiteratureCardGuide.title;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            List<LiteratureConfig> list2 = omsLiteratureCardGuide.literatureConfigs;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list2, LiteratureConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Action action = omsLiteratureCardGuide.action;
            if (action != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, action, Action.PROTOBUF_ADAPTER);
            }
            String str2 = omsLiteratureCardGuide.subTitle;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            omsLiteratureCardGuide.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsLiteratureCardGuide parse(nb5 nb5Var) throws IOException {
            OmsLiteratureCardGuide omsLiteratureCardGuide = new OmsLiteratureCardGuide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (omsLiteratureCardGuide.pictures == null) {
                        omsLiteratureCardGuide.pictures = new ArrayList();
                    }
                    if (omsLiteratureCardGuide.title == null) {
                        omsLiteratureCardGuide.title = "";
                    }
                    if (omsLiteratureCardGuide.subTitle == null) {
                        omsLiteratureCardGuide.subTitle = "";
                    }
                    if (omsLiteratureCardGuide.literatureConfigs == null) {
                        omsLiteratureCardGuide.literatureConfigs = new ArrayList();
                    }
                    if (omsLiteratureCardGuide.action != null) {
                        break;
                    }
                    omsLiteratureCardGuide.action = Action.new_();
                    break;
                }
                if (iM158752u == 10) {
                    omsLiteratureCardGuide.pictures = (List) nb5Var.m158743l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    omsLiteratureCardGuide.title = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    omsLiteratureCardGuide.literatureConfigs = (List) nb5Var.m158743l(LiteratureConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    omsLiteratureCardGuide.action = (Action) nb5Var.m158743l(Action.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (omsLiteratureCardGuide.pictures == null) {
                            omsLiteratureCardGuide.pictures = new ArrayList();
                        }
                        if (omsLiteratureCardGuide.title == null) {
                            omsLiteratureCardGuide.title = "";
                        }
                        if (omsLiteratureCardGuide.subTitle == null) {
                            omsLiteratureCardGuide.subTitle = "";
                        }
                        if (omsLiteratureCardGuide.literatureConfigs == null) {
                            omsLiteratureCardGuide.literatureConfigs = new ArrayList();
                        }
                        if (omsLiteratureCardGuide.action != null) {
                            break;
                        }
                        omsLiteratureCardGuide.action = Action.new_();
                        return omsLiteratureCardGuide;
                    }
                    omsLiteratureCardGuide.subTitle = nb5Var.m158750s();
                }
            }
            return omsLiteratureCardGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsLiteratureCardGuide omsLiteratureCardGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Media> list = omsLiteratureCardGuide.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = omsLiteratureCardGuide.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            List<LiteratureConfig> list2 = omsLiteratureCardGuide.literatureConfigs;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(3, list2, LiteratureConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Action action = omsLiteratureCardGuide.action;
            if (action != null) {
                codedOutputByteBufferNano.m17254K(4, action, Action.PROTOBUF_ADAPTER);
            }
            String str2 = omsLiteratureCardGuide.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
        }
    };
    public static JsonAdapter<OmsLiteratureCardGuide> JSON_ADAPTER = new ObjectJsonAdapter<OmsLiteratureCardGuide>() { // from class: com.p1.mobile.putong.data.OmsLiteratureCardGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsLiteratureCardGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsLiteratureCardGuide newInstance() {
            return new OmsLiteratureCardGuide();
        }

        public boolean parseField(OmsLiteratureCardGuide omsLiteratureCardGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    omsLiteratureCardGuide.subTitle = jsonParser.getValueAsString();
                    return true;
                case "action":
                    omsLiteratureCardGuide.action = Action.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pictures":
                    omsLiteratureCardGuide.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    omsLiteratureCardGuide.title = jsonParser.getValueAsString();
                    return true;
                case "literatureConfigs":
                    omsLiteratureCardGuide.literatureConfigs = JsonAdapter.parseArray(jsonParser, LiteratureConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsLiteratureCardGuide omsLiteratureCardGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "action":
                case "pictures":
                case "title":
                case "literatureConfigs":
                    return true;
                default:
                    return super.parseFieldCheck(omsLiteratureCardGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsLiteratureCardGuide omsLiteratureCardGuide, JsonGenerator jsonGenerator) throws IOException {
            if (omsLiteratureCardGuide.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(omsLiteratureCardGuide.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str = omsLiteratureCardGuide.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = omsLiteratureCardGuide.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            if (omsLiteratureCardGuide.literatureConfigs != null) {
                jsonGenerator.writeFieldName("literatureConfigs");
                JsonAdapter.serializeArray(omsLiteratureCardGuide.literatureConfigs, jsonGenerator, LiteratureConfig.JSON_ADAPTER);
            }
            if (omsLiteratureCardGuide.action != null) {
                jsonGenerator.writeFieldName("action");
                Action.JSON_ADAPTER.serialize(omsLiteratureCardGuide.action, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsLiteratureCardGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsLiteratureCardGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsLiteratureCardGuide new_() {
        OmsLiteratureCardGuide omsLiteratureCardGuide = new OmsLiteratureCardGuide();
        omsLiteratureCardGuide.nullCheck();
        return omsLiteratureCardGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsLiteratureCardGuide mo223809clone() {
        OmsLiteratureCardGuide omsLiteratureCardGuide = new OmsLiteratureCardGuide();
        List<Media> list = this.pictures;
        if (list != null) {
            omsLiteratureCardGuide.pictures = ValueObject.util_map(list, new w9j() { // from class: l.yb50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).mo223809clone();
                }
            });
        }
        omsLiteratureCardGuide.title = this.title;
        omsLiteratureCardGuide.subTitle = this.subTitle;
        List<LiteratureConfig> list2 = this.literatureConfigs;
        if (list2 != null) {
            omsLiteratureCardGuide.literatureConfigs = ValueObject.util_map(list2, new w9j() { // from class: l.zb50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiteratureConfig) obj).mo223809clone();
                }
            });
        }
        Action action = this.action;
        if (action != null) {
            omsLiteratureCardGuide.action = action.mo223809clone();
        }
        return omsLiteratureCardGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsLiteratureCardGuide)) {
            return false;
        }
        OmsLiteratureCardGuide omsLiteratureCardGuide = (OmsLiteratureCardGuide) obj;
        return ValueObject.util_equals(this.pictures, omsLiteratureCardGuide.pictures) && ValueObject.util_equals(this.title, omsLiteratureCardGuide.title) && ValueObject.util_equals(this.subTitle, omsLiteratureCardGuide.subTitle) && ValueObject.util_equals(this.literatureConfigs, omsLiteratureCardGuide.literatureConfigs) && ValueObject.util_equals(this.action, omsLiteratureCardGuide.action);
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
        List<LiteratureConfig> list2 = this.literatureConfigs;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        Action action = this.action;
        int iHashCode5 = iHashCode4 + (action != null ? action.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
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
        if (this.literatureConfigs == null) {
            this.literatureConfigs = new ArrayList();
        }
        if (this.action == null) {
            this.action = Action.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
