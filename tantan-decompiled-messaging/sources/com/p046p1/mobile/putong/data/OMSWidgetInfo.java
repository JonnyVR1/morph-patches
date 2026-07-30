package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSResourceContent;
import com.p046p1.mobile.putong.data.OmsMerCuryData;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class OMSWidgetInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omswidgetinfo";

    @NonNull
    @ProtobufIndex(index = 5)
    public OMSWidgeAnimationInfo animation;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<OMSResourceContent> contents;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38799id;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSWidgeArea identifier;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<OmsMerCuryData> mercuries;

    @NonNull
    @ProtobufIndex(index = 6)
    public OMSWidgeIconInfo picture;

    @NonNull
    @ProtobufIndex(index = 7)
    public OMSBubbleStyle style;

    @NonNull
    @ProtobufIndex(index = 4)
    public OMSWidgeType type;

    @NonNull
    @ProtobufIndex(index = 9)
    public String url;

    @ProtobufIndex(index = 3)
    public int version;
    public static ProtobufAdapter<OMSWidgetInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSWidgetInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgetInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSWidgetInfo oMSWidgetInfo) {
            String str = oMSWidgetInfo.f38799id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            OMSWidgeArea oMSWidgeArea = oMSWidgetInfo.identifier;
            if (oMSWidgeArea != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(2, oMSWidgeArea.ordinal());
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, oMSWidgetInfo.version);
            OMSWidgeType oMSWidgeType = oMSWidgetInfo.type;
            if (oMSWidgeType != null) {
                iM17226h += CodedOutputByteBufferNano.m17226h(4, oMSWidgeType.ordinal());
            }
            OMSWidgeAnimationInfo oMSWidgeAnimationInfo = oMSWidgetInfo.animation;
            if (oMSWidgeAnimationInfo != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, oMSWidgeAnimationInfo, OMSWidgeAnimationInfo.PROTOBUF_ADAPTER);
            }
            OMSWidgeIconInfo oMSWidgeIconInfo = oMSWidgetInfo.picture;
            if (oMSWidgeIconInfo != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, oMSWidgeIconInfo, OMSWidgeIconInfo.PROTOBUF_ADAPTER);
            }
            OMSBubbleStyle oMSBubbleStyle = oMSWidgetInfo.style;
            if (oMSBubbleStyle != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(7, oMSBubbleStyle, OMSBubbleStyle.PROTOBUF_ADAPTER);
            }
            List<OMSResourceContent> list = oMSWidgetInfo.contents;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = oMSWidgetInfo.url;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(9, str2);
            }
            List<OmsMerCuryData> list2 = oMSWidgetInfo.mercuries;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(10, list2, OmsMerCuryData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSWidgeArea oMSWidgeArea2 = oMSWidgetInfo.identifier;
            if (oMSWidgeArea2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(11, oMSWidgeArea2, OMSWidgeArea.PROTOBUF_ADAPTER);
            }
            OMSWidgeType oMSWidgeType2 = oMSWidgetInfo.type;
            if (oMSWidgeType2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(12, oMSWidgeType2, OMSWidgeType.PROTOBUF_ADAPTER);
            }
            oMSWidgetInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSWidgetInfo parse(nb5 nb5Var) throws IOException {
            OMSWidgetInfo oMSWidgetInfo = new OMSWidgetInfo();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (oMSWidgetInfo.identifier == null && numValueOf != null) {
                            oMSWidgetInfo.identifier = (OMSWidgeArea) OMSWidgeArea.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSWidgetInfo.type == null && numValueOf2 != null) {
                            oMSWidgetInfo.type = (OMSWidgeType) OMSWidgeType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSWidgetInfo.f38799id == null) {
                            oMSWidgetInfo.f38799id = "";
                        }
                        if (oMSWidgetInfo.identifier == null) {
                            oMSWidgetInfo.identifier = (OMSWidgeArea) OMSWidgeArea.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSWidgetInfo.type == null) {
                            oMSWidgetInfo.type = (OMSWidgeType) OMSWidgeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSWidgetInfo.animation == null) {
                            oMSWidgetInfo.animation = OMSWidgeAnimationInfo.new_();
                        }
                        if (oMSWidgetInfo.picture == null) {
                            oMSWidgetInfo.picture = OMSWidgeIconInfo.new_();
                        }
                        if (oMSWidgetInfo.style == null) {
                            oMSWidgetInfo.style = OMSBubbleStyle.new_();
                        }
                        if (oMSWidgetInfo.contents == null) {
                            oMSWidgetInfo.contents = new ArrayList();
                        }
                        if (oMSWidgetInfo.url == null) {
                            oMSWidgetInfo.url = "";
                        }
                        if (oMSWidgetInfo.mercuries == null) {
                            oMSWidgetInfo.mercuries = new ArrayList();
                        }
                        break;
                    case 10:
                        oMSWidgetInfo.f38799id = nb5Var.m158750s();
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 24:
                        oMSWidgetInfo.version = nb5Var.m158741j();
                        continue;
                    case 32:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 42:
                        oMSWidgetInfo.animation = (OMSWidgeAnimationInfo) nb5Var.m158743l(OMSWidgeAnimationInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        oMSWidgetInfo.picture = (OMSWidgeIconInfo) nb5Var.m158743l(OMSWidgeIconInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        oMSWidgetInfo.style = (OMSBubbleStyle) nb5Var.m158743l(OMSBubbleStyle.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        oMSWidgetInfo.contents = (List) nb5Var.m158743l(OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        oMSWidgetInfo.url = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        oMSWidgetInfo.mercuries = (List) nb5Var.m158743l(OmsMerCuryData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        oMSWidgetInfo.identifier = (OMSWidgeArea) nb5Var.m158743l(OMSWidgeArea.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        oMSWidgetInfo.type = (OMSWidgeType) nb5Var.m158743l(OMSWidgeType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (oMSWidgetInfo.identifier == null && numValueOf != null) {
                            oMSWidgetInfo.identifier = (OMSWidgeArea) OMSWidgeArea.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSWidgetInfo.type == null && numValueOf2 != null) {
                            oMSWidgetInfo.type = (OMSWidgeType) OMSWidgeType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSWidgetInfo.f38799id == null) {
                            oMSWidgetInfo.f38799id = "";
                        }
                        if (oMSWidgetInfo.identifier == null) {
                            oMSWidgetInfo.identifier = (OMSWidgeArea) OMSWidgeArea.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSWidgetInfo.type == null) {
                            oMSWidgetInfo.type = (OMSWidgeType) OMSWidgeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSWidgetInfo.animation == null) {
                            oMSWidgetInfo.animation = OMSWidgeAnimationInfo.new_();
                        }
                        if (oMSWidgetInfo.picture == null) {
                            oMSWidgetInfo.picture = OMSWidgeIconInfo.new_();
                        }
                        if (oMSWidgetInfo.style == null) {
                            oMSWidgetInfo.style = OMSBubbleStyle.new_();
                        }
                        if (oMSWidgetInfo.contents == null) {
                            oMSWidgetInfo.contents = new ArrayList();
                        }
                        if (oMSWidgetInfo.url == null) {
                            oMSWidgetInfo.url = "";
                        }
                        if (oMSWidgetInfo.mercuries == null) {
                            oMSWidgetInfo.mercuries = new ArrayList();
                            return oMSWidgetInfo;
                        }
                        break;
                }
            }
            return oMSWidgetInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSWidgetInfo oMSWidgetInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSWidgetInfo.f38799id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            OMSWidgeArea oMSWidgeArea = oMSWidgetInfo.identifier;
            if (oMSWidgeArea != null) {
                codedOutputByteBufferNano.m17250G(2, oMSWidgeArea.ordinal());
            }
            codedOutputByteBufferNano.m17250G(3, oMSWidgetInfo.version);
            OMSWidgeType oMSWidgeType = oMSWidgetInfo.type;
            if (oMSWidgeType != null) {
                codedOutputByteBufferNano.m17250G(4, oMSWidgeType.ordinal());
            }
            OMSWidgeAnimationInfo oMSWidgeAnimationInfo = oMSWidgetInfo.animation;
            if (oMSWidgeAnimationInfo != null) {
                codedOutputByteBufferNano.m17254K(5, oMSWidgeAnimationInfo, OMSWidgeAnimationInfo.PROTOBUF_ADAPTER);
            }
            OMSWidgeIconInfo oMSWidgeIconInfo = oMSWidgetInfo.picture;
            if (oMSWidgeIconInfo != null) {
                codedOutputByteBufferNano.m17254K(6, oMSWidgeIconInfo, OMSWidgeIconInfo.PROTOBUF_ADAPTER);
            }
            OMSBubbleStyle oMSBubbleStyle = oMSWidgetInfo.style;
            if (oMSBubbleStyle != null) {
                codedOutputByteBufferNano.m17254K(7, oMSBubbleStyle, OMSBubbleStyle.PROTOBUF_ADAPTER);
            }
            List<OMSResourceContent> list = oMSWidgetInfo.contents;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(8, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = oMSWidgetInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(9, str2);
            }
            List<OmsMerCuryData> list2 = oMSWidgetInfo.mercuries;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(10, list2, OmsMerCuryData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSWidgeArea oMSWidgeArea2 = oMSWidgetInfo.identifier;
            if (oMSWidgeArea2 != null) {
                codedOutputByteBufferNano.m17254K(11, oMSWidgeArea2, OMSWidgeArea.PROTOBUF_ADAPTER);
            }
            OMSWidgeType oMSWidgeType2 = oMSWidgetInfo.type;
            if (oMSWidgeType2 != null) {
                codedOutputByteBufferNano.m17254K(12, oMSWidgeType2, OMSWidgeType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSWidgetInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSWidgetInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgetInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSWidgetInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSWidgetInfo newInstance() {
            return new OMSWidgetInfo();
        }

        public boolean parseField(OMSWidgetInfo oMSWidgetInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    oMSWidgetInfo.identifier = OMSWidgeArea.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "picture":
                    oMSWidgetInfo.picture = OMSWidgeIconInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "contents":
                    oMSWidgetInfo.contents = JsonAdapter.parseArray(jsonParser, OMSResourceContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    oMSWidgetInfo.f38799id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    oMSWidgetInfo.url = jsonParser.getValueAsString();
                    return true;
                case "type":
                    oMSWidgetInfo.type = OMSWidgeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "style":
                    oMSWidgetInfo.style = OMSBubbleStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "version":
                    oMSWidgetInfo.version = jsonParser.getValueAsInt();
                    return true;
                case "animation":
                    oMSWidgetInfo.animation = OMSWidgeAnimationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mercuries":
                    oMSWidgetInfo.mercuries = JsonAdapter.parseArray(jsonParser, OmsMerCuryData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSWidgetInfo oMSWidgetInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "picture":
                case "contents":
                    return true;
                case "id":
                    return false;
                case "url":
                case "type":
                case "style":
                case "version":
                case "animation":
                case "mercuries":
                    return true;
                default:
                    return super.parseFieldCheck(oMSWidgetInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSWidgetInfo oMSWidgetInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSWidgetInfo.f38799id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (oMSWidgetInfo.identifier != null) {
                jsonGenerator.writeFieldName("identifier");
                OMSWidgeArea.JSON_ADAPTER.serialize(oMSWidgetInfo.identifier, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, oMSWidgetInfo.version);
            if (oMSWidgetInfo.type != null) {
                jsonGenerator.writeFieldName("type");
                OMSWidgeType.JSON_ADAPTER.serialize(oMSWidgetInfo.type, jsonGenerator, true);
            }
            if (oMSWidgetInfo.animation != null) {
                jsonGenerator.writeFieldName("animation");
                OMSWidgeAnimationInfo.JSON_ADAPTER.serialize(oMSWidgetInfo.animation, jsonGenerator, true);
            }
            if (oMSWidgetInfo.picture != null) {
                jsonGenerator.writeFieldName("picture");
                OMSWidgeIconInfo.JSON_ADAPTER.serialize(oMSWidgetInfo.picture, jsonGenerator, true);
            }
            if (oMSWidgetInfo.style != null) {
                jsonGenerator.writeFieldName("style");
                OMSBubbleStyle.JSON_ADAPTER.serialize(oMSWidgetInfo.style, jsonGenerator, true);
            }
            if (oMSWidgetInfo.contents != null) {
                jsonGenerator.writeFieldName("contents");
                JsonAdapter.serializeArray(oMSWidgetInfo.contents, jsonGenerator, OMSResourceContent.JSON_ADAPTER);
            }
            String str2 = oMSWidgetInfo.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            if (oMSWidgetInfo.mercuries != null) {
                jsonGenerator.writeFieldName("mercuries");
                JsonAdapter.serializeArray(oMSWidgetInfo.mercuries, jsonGenerator, OmsMerCuryData.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSWidgetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSWidgetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSWidgetInfo new_() {
        OMSWidgetInfo oMSWidgetInfo = new OMSWidgetInfo();
        oMSWidgetInfo.nullCheck();
        return oMSWidgetInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSWidgetInfo mo223809clone() {
        OMSWidgetInfo oMSWidgetInfo = new OMSWidgetInfo();
        oMSWidgetInfo.f38799id = this.f38799id;
        oMSWidgetInfo.identifier = this.identifier;
        oMSWidgetInfo.version = this.version;
        oMSWidgetInfo.type = this.type;
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = this.animation;
        if (oMSWidgeAnimationInfo != null) {
            oMSWidgetInfo.animation = oMSWidgeAnimationInfo.mo223809clone();
        }
        OMSWidgeIconInfo oMSWidgeIconInfo = this.picture;
        if (oMSWidgeIconInfo != null) {
            oMSWidgetInfo.picture = oMSWidgeIconInfo.mo223809clone();
        }
        OMSBubbleStyle oMSBubbleStyle = this.style;
        if (oMSBubbleStyle != null) {
            oMSWidgetInfo.style = oMSBubbleStyle.mo223809clone();
        }
        List<OMSResourceContent> list = this.contents;
        if (list != null) {
            oMSWidgetInfo.contents = ValueObject.util_map(list, new w9j() { // from class: l.qz40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSResourceContent) obj).mo223809clone();
                }
            });
        }
        oMSWidgetInfo.url = this.url;
        List<OmsMerCuryData> list2 = this.mercuries;
        if (list2 != null) {
            oMSWidgetInfo.mercuries = ValueObject.util_map(list2, new w9j() { // from class: l.rz40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OmsMerCuryData) obj).mo223809clone();
                }
            });
        }
        return oMSWidgetInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSWidgetInfo)) {
            return false;
        }
        OMSWidgetInfo oMSWidgetInfo = (OMSWidgetInfo) obj;
        return ValueObject.util_equals(this.f38799id, oMSWidgetInfo.f38799id) && ValueObject.util_equals(this.identifier, oMSWidgetInfo.identifier) && this.version == oMSWidgetInfo.version && ValueObject.util_equals(this.type, oMSWidgetInfo.type) && ValueObject.util_equals(this.animation, oMSWidgetInfo.animation) && ValueObject.util_equals(this.picture, oMSWidgetInfo.picture) && ValueObject.util_equals(this.style, oMSWidgetInfo.style) && ValueObject.util_equals(this.contents, oMSWidgetInfo.contents) && ValueObject.util_equals(this.url, oMSWidgetInfo.url) && ValueObject.util_equals(this.mercuries, oMSWidgetInfo.mercuries);
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
        String str = this.f38799id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        OMSWidgeArea oMSWidgeArea = this.identifier;
        int iHashCode2 = (((iHashCode + (oMSWidgeArea != null ? oMSWidgeArea.hashCode() : 0)) * 41) + this.version) * 41;
        OMSWidgeType oMSWidgeType = this.type;
        int iHashCode3 = (iHashCode2 + (oMSWidgeType != null ? oMSWidgeType.hashCode() : 0)) * 41;
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = this.animation;
        int iHashCode4 = (iHashCode3 + (oMSWidgeAnimationInfo != null ? oMSWidgeAnimationInfo.hashCode() : 0)) * 41;
        OMSWidgeIconInfo oMSWidgeIconInfo = this.picture;
        int iHashCode5 = (iHashCode4 + (oMSWidgeIconInfo != null ? oMSWidgeIconInfo.hashCode() : 0)) * 41;
        OMSBubbleStyle oMSBubbleStyle = this.style;
        int iHashCode6 = (iHashCode5 + (oMSBubbleStyle != null ? oMSBubbleStyle.hashCode() : 0)) * 41;
        List<OMSResourceContent> list = this.contents;
        int iHashCode7 = (iHashCode6 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<OmsMerCuryData> list2 = this.mercuries;
        int iHashCode9 = iHashCode8 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38799id == null) {
            this.f38799id = "";
        }
        if (this.identifier == null) {
            this.identifier = (OMSWidgeArea) OMSWidgeArea.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = (OMSWidgeType) OMSWidgeType.JSON_ADAPTER.defaultEnum();
        }
        if (this.animation == null) {
            this.animation = OMSWidgeAnimationInfo.new_();
        }
        if (this.picture == null) {
            this.picture = OMSWidgeIconInfo.new_();
        }
        if (this.style == null) {
            this.style = OMSBubbleStyle.new_();
        }
        if (this.contents == null) {
            this.contents = new ArrayList();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.mercuries == null) {
            this.mercuries = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
