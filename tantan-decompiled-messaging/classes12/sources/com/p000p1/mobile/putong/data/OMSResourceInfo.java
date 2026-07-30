package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSResourceContent;
import com.p000p1.mobile.putong.data.OMSResourceInfo;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
public class OMSResourceInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsresourceinfo";

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> colors;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<OMSResourceContent> content;

    @NonNull
    @ProtobufIndex(index = 7)
    public ResourceDirection direction;

    @NonNull
    @ProtobufIndex(index = 1)
    public String index;

    @NonNull
    @ProtobufIndex(index = 8)
    public OmsMerCuryData mercury;

    @NonNull
    @ProtobufIndex(index = 4)
    public String src;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSResourceType type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<OMSResourceInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSResourceInfo>() { // from class: com.p1.mobile.putong.data.OMSResourceInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSResourceInfo oMSResourceInfo) {
            String str = oMSResourceInfo.index;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            OMSResourceType oMSResourceType = oMSResourceInfo.type;
            if (oMSResourceType != null) {
                iO += CodedOutputByteBufferNano.h(2, oMSResourceType.ordinal());
            }
            String str2 = oMSResourceInfo.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = oMSResourceInfo.src;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            List<OMSResourceContent> list = oMSResourceInfo.content;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(5, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSResourceInfo.colors;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ResourceDirection resourceDirection = oMSResourceInfo.direction;
            if (resourceDirection != null) {
                iO += CodedOutputByteBufferNano.h(7, resourceDirection.ordinal());
            }
            OmsMerCuryData omsMerCuryData = oMSResourceInfo.mercury;
            if (omsMerCuryData != null) {
                iO += CodedOutputByteBufferNano.l(8, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OMSResourceType oMSResourceType2 = oMSResourceInfo.type;
            if (oMSResourceType2 != null) {
                iO += CodedOutputByteBufferNano.l(9, oMSResourceType2, OMSResourceType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection2 = oMSResourceInfo.direction;
            if (resourceDirection2 != null) {
                iO += CodedOutputByteBufferNano.l(10, resourceDirection2, ResourceDirection.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSResourceInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSResourceInfo m18657parse(nb5 nb5Var) throws IOException {
            OMSResourceInfo oMSResourceInfo = new OMSResourceInfo();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (oMSResourceInfo.type == null && numValueOf != null) {
                            oMSResourceInfo.type = (OMSResourceType) OMSResourceType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSResourceInfo.direction == null && numValueOf2 != null) {
                            oMSResourceInfo.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSResourceInfo.index == null) {
                            oMSResourceInfo.index = "";
                        }
                        if (oMSResourceInfo.type == null) {
                            oMSResourceInfo.type = (OMSResourceType) OMSResourceType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSResourceInfo.url == null) {
                            oMSResourceInfo.url = "";
                        }
                        if (oMSResourceInfo.src == null) {
                            oMSResourceInfo.src = "";
                        }
                        if (oMSResourceInfo.content == null) {
                            oMSResourceInfo.content = new ArrayList();
                        }
                        if (oMSResourceInfo.colors == null) {
                            oMSResourceInfo.colors = new ArrayList();
                        }
                        if (oMSResourceInfo.direction == null) {
                            oMSResourceInfo.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSResourceInfo.mercury == null) {
                            oMSResourceInfo.mercury = OmsMerCuryData.new_();
                        }
                        break;
                    case 10:
                        oMSResourceInfo.index = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 26:
                        oMSResourceInfo.url = nb5Var.s();
                        continue;
                    case 34:
                        oMSResourceInfo.src = nb5Var.s();
                        continue;
                    case 42:
                        oMSResourceInfo.content = (List) nb5Var.l(OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        oMSResourceInfo.colors = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 56:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 66:
                        oMSResourceInfo.mercury = (OmsMerCuryData) nb5Var.l(OmsMerCuryData.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        oMSResourceInfo.type = (OMSResourceType) nb5Var.l(OMSResourceType.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        oMSResourceInfo.direction = (ResourceDirection) nb5Var.l(ResourceDirection.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (oMSResourceInfo.type == null && numValueOf != null) {
                            oMSResourceInfo.type = (OMSResourceType) OMSResourceType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSResourceInfo.direction == null && numValueOf2 != null) {
                            oMSResourceInfo.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSResourceInfo.index == null) {
                            oMSResourceInfo.index = "";
                        }
                        if (oMSResourceInfo.type == null) {
                            oMSResourceInfo.type = (OMSResourceType) OMSResourceType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSResourceInfo.url == null) {
                            oMSResourceInfo.url = "";
                        }
                        if (oMSResourceInfo.src == null) {
                            oMSResourceInfo.src = "";
                        }
                        if (oMSResourceInfo.content == null) {
                            oMSResourceInfo.content = new ArrayList();
                        }
                        if (oMSResourceInfo.colors == null) {
                            oMSResourceInfo.colors = new ArrayList();
                        }
                        if (oMSResourceInfo.direction == null) {
                            oMSResourceInfo.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSResourceInfo.mercury == null) {
                            oMSResourceInfo.mercury = OmsMerCuryData.new_();
                            return oMSResourceInfo;
                        }
                        break;
                }
            }
            return oMSResourceInfo;
        }

        public void serialize(OMSResourceInfo oMSResourceInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSResourceInfo.index;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            OMSResourceType oMSResourceType = oMSResourceInfo.type;
            if (oMSResourceType != null) {
                codedOutputByteBufferNano.G(2, oMSResourceType.ordinal());
            }
            String str2 = oMSResourceInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = oMSResourceInfo.src;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            List<OMSResourceContent> list = oMSResourceInfo.content;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, OMSResourceContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSResourceInfo.colors;
            if (list2 != null) {
                codedOutputByteBufferNano.K(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ResourceDirection resourceDirection = oMSResourceInfo.direction;
            if (resourceDirection != null) {
                codedOutputByteBufferNano.G(7, resourceDirection.ordinal());
            }
            OmsMerCuryData omsMerCuryData = oMSResourceInfo.mercury;
            if (omsMerCuryData != null) {
                codedOutputByteBufferNano.K(8, omsMerCuryData, OmsMerCuryData.PROTOBUF_ADAPTER);
            }
            OMSResourceType oMSResourceType2 = oMSResourceInfo.type;
            if (oMSResourceType2 != null) {
                codedOutputByteBufferNano.K(9, oMSResourceType2, OMSResourceType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection2 = oMSResourceInfo.direction;
            if (resourceDirection2 != null) {
                codedOutputByteBufferNano.K(10, resourceDirection2, ResourceDirection.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSResourceInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSResourceInfo>() { // from class: com.p1.mobile.putong.data.OMSResourceInfo.2
        public Class getDataClass() {
            return OMSResourceInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSResourceInfo mo17830newInstance() {
            return new OMSResourceInfo();
        }

        public boolean parseField(OMSResourceInfo oMSResourceInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "colors":
                    oMSResourceInfo.colors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "direction":
                    oMSResourceInfo.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "src":
                    oMSResourceInfo.src = jsonParser.getValueAsString();
                    return true;
                case "url":
                    oMSResourceInfo.url = jsonParser.getValueAsString();
                    return true;
                case "type":
                    oMSResourceInfo.type = (OMSResourceType) OMSResourceType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "index":
                    oMSResourceInfo.index = jsonParser.getValueAsString();
                    return true;
                case "content":
                    oMSResourceInfo.content = JsonAdapter.parseArray(jsonParser, OMSResourceContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mercury":
                    oMSResourceInfo.mercury = (OmsMerCuryData) OmsMerCuryData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSResourceInfo oMSResourceInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "colors":
                case "direction":
                case "src":
                case "url":
                case "type":
                case "index":
                case "content":
                case "mercury":
                    return true;
                default:
                    return super.parseFieldCheck(oMSResourceInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSResourceInfo oMSResourceInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSResourceInfo.index;
            if (str != null) {
                jsonGenerator.writeStringField("index", str);
            }
            if (oMSResourceInfo.type != null) {
                jsonGenerator.writeFieldName("type");
                OMSResourceType.JSON_ADAPTER.serialize(oMSResourceInfo.type, jsonGenerator, true);
            }
            String str2 = oMSResourceInfo.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = oMSResourceInfo.src;
            if (str3 != null) {
                jsonGenerator.writeStringField("src", str3);
            }
            if (oMSResourceInfo.content != null) {
                jsonGenerator.writeFieldName("content");
                JsonAdapter.serializeArray(oMSResourceInfo.content, jsonGenerator, OMSResourceContent.JSON_ADAPTER);
            }
            if (oMSResourceInfo.colors != null) {
                jsonGenerator.writeFieldName("colors");
                JsonAdapter.serializeArray(oMSResourceInfo.colors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSResourceInfo.direction != null) {
                jsonGenerator.writeFieldName("direction");
                ResourceDirection.JSON_ADAPTER.serialize(oMSResourceInfo.direction, jsonGenerator, true);
            }
            if (oMSResourceInfo.mercury != null) {
                jsonGenerator.writeFieldName("mercury");
                OmsMerCuryData.JSON_ADAPTER.serialize(oMSResourceInfo.mercury, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSResourceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSResourceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m846b(String str) {
        return str;
    }

    public static OMSResourceInfo new_() {
        OMSResourceInfo oMSResourceInfo = new OMSResourceInfo();
        oMSResourceInfo.nullCheck();
        return oMSResourceInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSResourceInfo m18656clone() {
        OMSResourceInfo oMSResourceInfo = new OMSResourceInfo();
        oMSResourceInfo.index = this.index;
        oMSResourceInfo.type = this.type;
        oMSResourceInfo.url = this.url;
        oMSResourceInfo.src = this.src;
        List<OMSResourceContent> list = this.content;
        if (list != null) {
            oMSResourceInfo.content = ValueObject.util_map(list, new w9j() { // from class: l.iz40
                public final Object call(Object obj) {
                    return ((OMSResourceContent) obj).m18653clone();
                }
            });
        }
        List<String> list2 = this.colors;
        if (list2 != null) {
            oMSResourceInfo.colors = ValueObject.util_map(list2, new w9j() { // from class: l.jz40
                public final Object call(Object obj) {
                    return OMSResourceInfo.m846b((String) obj);
                }
            });
        }
        oMSResourceInfo.direction = this.direction;
        OmsMerCuryData omsMerCuryData = this.mercury;
        if (omsMerCuryData != null) {
            oMSResourceInfo.mercury = omsMerCuryData.m18722clone();
        }
        return oMSResourceInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSResourceInfo)) {
            return false;
        }
        OMSResourceInfo oMSResourceInfo = (OMSResourceInfo) obj;
        return ValueObject.util_equals(this.index, oMSResourceInfo.index) && ValueObject.util_equals(this.type, oMSResourceInfo.type) && ValueObject.util_equals(this.url, oMSResourceInfo.url) && ValueObject.util_equals(this.src, oMSResourceInfo.src) && ValueObject.util_equals(this.content, oMSResourceInfo.content) && ValueObject.util_equals(this.colors, oMSResourceInfo.colors) && ValueObject.util_equals(this.direction, oMSResourceInfo.direction) && ValueObject.util_equals(this.mercury, oMSResourceInfo.mercury);
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
        String str = this.index;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        OMSResourceType oMSResourceType = this.type;
        int iHashCode2 = (iHashCode + (oMSResourceType != null ? oMSResourceType.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.src;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<OMSResourceContent> list = this.content;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.colors;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        ResourceDirection resourceDirection = this.direction;
        int iHashCode7 = (iHashCode6 + (resourceDirection != null ? resourceDirection.hashCode() : 0)) * 41;
        OmsMerCuryData omsMerCuryData = this.mercury;
        int iHashCode8 = iHashCode7 + (omsMerCuryData != null ? omsMerCuryData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.index == null) {
            this.index = "";
        }
        if (this.type == null) {
            this.type = (OMSResourceType) OMSResourceType.JSON_ADAPTER.defaultEnum();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.src == null) {
            this.src = "";
        }
        if (this.content == null) {
            this.content = new ArrayList();
        }
        if (this.colors == null) {
            this.colors = new ArrayList();
        }
        if (this.direction == null) {
            this.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
        }
        if (this.mercury == null) {
            this.mercury = OmsMerCuryData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
