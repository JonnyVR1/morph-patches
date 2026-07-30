package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSResourceContent;
import com.p051p1.mobile.putong.data.OmsMerCuryData;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

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
    public String f39647id;

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
            String str = oMSWidgetInfo.f39647id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            OMSWidgeArea oMSWidgeArea = oMSWidgetInfo.identifier;
            if (oMSWidgeArea != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, oMSWidgeArea.ordinal());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, oMSWidgetInfo.version);
            OMSWidgeType oMSWidgeType = oMSWidgetInfo.type;
            if (oMSWidgeType != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(4, oMSWidgeType.ordinal());
            }
            OMSWidgeAnimationInfo oMSWidgeAnimationInfo = oMSWidgetInfo.animation;
            if (oMSWidgeAnimationInfo != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(5, oMSWidgeAnimationInfo, OMSWidgeAnimationInfo.PROTOBUF_ADAPTER);
            }
            OMSWidgeIconInfo oMSWidgeIconInfo = oMSWidgetInfo.picture;
            if (oMSWidgeIconInfo != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(6, oMSWidgeIconInfo, OMSWidgeIconInfo.PROTOBUF_ADAPTER);
            }
            OMSBubbleStyle oMSBubbleStyle = oMSWidgetInfo.style;
            if (oMSBubbleStyle != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(7, oMSBubbleStyle, OMSBubbleStyle.PROTOBUF_ADAPTER);
            }
            List<OMSResourceContent> list = oMSWidgetInfo.contents;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(8, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = oMSWidgetInfo.url;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(9, str2);
            }
            List<OmsMerCuryData> list2 = oMSWidgetInfo.mercuries;
            if (list2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(10, list2, OmsMerCuryData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSWidgeArea oMSWidgeArea2 = oMSWidgetInfo.identifier;
            if (oMSWidgeArea2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(11, oMSWidgeArea2, OMSWidgeArea.PROTOBUF_ADAPTER);
            }
            OMSWidgeType oMSWidgeType2 = oMSWidgetInfo.type;
            if (oMSWidgeType2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(12, oMSWidgeType2, OMSWidgeType.PROTOBUF_ADAPTER);
            }
            oMSWidgetInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSWidgetInfo parse(nc5 nc5Var) throws IOException {
            OMSWidgetInfo oMSWidgetInfo = new OMSWidgetInfo();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (oMSWidgetInfo.identifier == null && numValueOf != null) {
                            oMSWidgetInfo.identifier = (OMSWidgeArea) OMSWidgeArea.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSWidgetInfo.type == null && numValueOf2 != null) {
                            oMSWidgetInfo.type = (OMSWidgeType) OMSWidgeType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSWidgetInfo.f39647id == null) {
                            oMSWidgetInfo.f39647id = "";
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
                        oMSWidgetInfo.f39647id = nc5Var.m162495s();
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 24:
                        oMSWidgetInfo.version = nc5Var.m162486j();
                        continue;
                    case 32:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 42:
                        oMSWidgetInfo.animation = (OMSWidgeAnimationInfo) nc5Var.m162488l(OMSWidgeAnimationInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        oMSWidgetInfo.picture = (OMSWidgeIconInfo) nc5Var.m162488l(OMSWidgeIconInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        oMSWidgetInfo.style = (OMSBubbleStyle) nc5Var.m162488l(OMSBubbleStyle.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        oMSWidgetInfo.contents = (List) nc5Var.m162488l(OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        oMSWidgetInfo.url = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        oMSWidgetInfo.mercuries = (List) nc5Var.m162488l(OmsMerCuryData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        oMSWidgetInfo.identifier = (OMSWidgeArea) nc5Var.m162488l(OMSWidgeArea.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        oMSWidgetInfo.type = (OMSWidgeType) nc5Var.m162488l(OMSWidgeType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (oMSWidgetInfo.identifier == null && numValueOf != null) {
                            oMSWidgetInfo.identifier = (OMSWidgeArea) OMSWidgeArea.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSWidgetInfo.type == null && numValueOf2 != null) {
                            oMSWidgetInfo.type = (OMSWidgeType) OMSWidgeType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSWidgetInfo.f39647id == null) {
                            oMSWidgetInfo.f39647id = "";
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
            String str = oMSWidgetInfo.f39647id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            OMSWidgeArea oMSWidgeArea = oMSWidgetInfo.identifier;
            if (oMSWidgeArea != null) {
                codedOutputByteBufferNano.m17305G(2, oMSWidgeArea.ordinal());
            }
            codedOutputByteBufferNano.m17305G(3, oMSWidgetInfo.version);
            OMSWidgeType oMSWidgeType = oMSWidgetInfo.type;
            if (oMSWidgeType != null) {
                codedOutputByteBufferNano.m17305G(4, oMSWidgeType.ordinal());
            }
            OMSWidgeAnimationInfo oMSWidgeAnimationInfo = oMSWidgetInfo.animation;
            if (oMSWidgeAnimationInfo != null) {
                codedOutputByteBufferNano.m17309K(5, oMSWidgeAnimationInfo, OMSWidgeAnimationInfo.PROTOBUF_ADAPTER);
            }
            OMSWidgeIconInfo oMSWidgeIconInfo = oMSWidgetInfo.picture;
            if (oMSWidgeIconInfo != null) {
                codedOutputByteBufferNano.m17309K(6, oMSWidgeIconInfo, OMSWidgeIconInfo.PROTOBUF_ADAPTER);
            }
            OMSBubbleStyle oMSBubbleStyle = oMSWidgetInfo.style;
            if (oMSBubbleStyle != null) {
                codedOutputByteBufferNano.m17309K(7, oMSBubbleStyle, OMSBubbleStyle.PROTOBUF_ADAPTER);
            }
            List<OMSResourceContent> list = oMSWidgetInfo.contents;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(8, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = oMSWidgetInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(9, str2);
            }
            List<OmsMerCuryData> list2 = oMSWidgetInfo.mercuries;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(10, list2, OmsMerCuryData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSWidgeArea oMSWidgeArea2 = oMSWidgetInfo.identifier;
            if (oMSWidgeArea2 != null) {
                codedOutputByteBufferNano.m17309K(11, oMSWidgeArea2, OMSWidgeArea.PROTOBUF_ADAPTER);
            }
            OMSWidgeType oMSWidgeType2 = oMSWidgetInfo.type;
            if (oMSWidgeType2 != null) {
                codedOutputByteBufferNano.m17309K(12, oMSWidgeType2, OMSWidgeType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSWidgetInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSWidgetInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgetInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSWidgetInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    oMSWidgetInfo.f39647id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSWidgetInfo oMSWidgetInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSWidgetInfo.f39647id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSWidgetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public OMSWidgetInfo mo225055clone() {
        OMSWidgetInfo oMSWidgetInfo = new OMSWidgetInfo();
        oMSWidgetInfo.f39647id = this.f39647id;
        oMSWidgetInfo.identifier = this.identifier;
        oMSWidgetInfo.version = this.version;
        oMSWidgetInfo.type = this.type;
        OMSWidgeAnimationInfo oMSWidgeAnimationInfo = this.animation;
        if (oMSWidgeAnimationInfo != null) {
            oMSWidgetInfo.animation = oMSWidgeAnimationInfo.mo225055clone();
        }
        OMSWidgeIconInfo oMSWidgeIconInfo = this.picture;
        if (oMSWidgeIconInfo != null) {
            oMSWidgetInfo.picture = oMSWidgeIconInfo.mo225055clone();
        }
        OMSBubbleStyle oMSBubbleStyle = this.style;
        if (oMSBubbleStyle != null) {
            oMSWidgetInfo.style = oMSBubbleStyle.mo225055clone();
        }
        List<OMSResourceContent> list = this.contents;
        if (list != null) {
            oMSWidgetInfo.contents = ValueObject.util_map(list, new qcj() { // from class: l.f850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OMSResourceContent) obj).mo225055clone();
                }
            });
        }
        oMSWidgetInfo.url = this.url;
        List<OmsMerCuryData> list2 = this.mercuries;
        if (list2 != null) {
            oMSWidgetInfo.mercuries = ValueObject.util_map(list2, new qcj() { // from class: l.g850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OmsMerCuryData) obj).mo225055clone();
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
        return ValueObject.util_equals(this.f39647id, oMSWidgetInfo.f39647id) && ValueObject.util_equals(this.identifier, oMSWidgetInfo.identifier) && this.version == oMSWidgetInfo.version && ValueObject.util_equals(this.type, oMSWidgetInfo.type) && ValueObject.util_equals(this.animation, oMSWidgetInfo.animation) && ValueObject.util_equals(this.picture, oMSWidgetInfo.picture) && ValueObject.util_equals(this.style, oMSWidgetInfo.style) && ValueObject.util_equals(this.contents, oMSWidgetInfo.contents) && ValueObject.util_equals(this.url, oMSWidgetInfo.url) && ValueObject.util_equals(this.mercuries, oMSWidgetInfo.mercuries);
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
        String str = this.f39647id;
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
        if (this.f39647id == null) {
            this.f39647id = "";
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
