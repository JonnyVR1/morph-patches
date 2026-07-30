package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSBubbleStyle;
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
public class OMSBubbleStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsbubblestyle";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> colors;

    @NonNull
    @ProtobufIndex(index = 2)
    public ResourceDirection direction;
    public static ProtobufAdapter<OMSBubbleStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSBubbleStyle>() { // from class: com.p1.mobile.putong.data.OMSBubbleStyle.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSBubbleStyle oMSBubbleStyle) {
            List<String> list = oMSBubbleStyle.colors;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ResourceDirection resourceDirection = oMSBubbleStyle.direction;
            if (resourceDirection != null) {
                iL += CodedOutputByteBufferNano.h(2, resourceDirection.ordinal());
            }
            ResourceDirection resourceDirection2 = oMSBubbleStyle.direction;
            if (resourceDirection2 != null) {
                iL += CodedOutputByteBufferNano.l(3, resourceDirection2, ResourceDirection.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSBubbleStyle).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSBubbleStyle m18579parse(nb5 nb5Var) throws IOException {
            OMSBubbleStyle oMSBubbleStyle = new OMSBubbleStyle();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSBubbleStyle.direction == null && numValueOf != null) {
                        oMSBubbleStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSBubbleStyle.colors == null) {
                        oMSBubbleStyle.colors = new ArrayList();
                    }
                    if (oMSBubbleStyle.direction != null) {
                        break;
                    }
                    oMSBubbleStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    oMSBubbleStyle.colors = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 26) {
                        if (oMSBubbleStyle.direction == null && numValueOf != null) {
                            oMSBubbleStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSBubbleStyle.colors == null) {
                            oMSBubbleStyle.colors = new ArrayList();
                        }
                        if (oMSBubbleStyle.direction != null) {
                            break;
                        }
                        oMSBubbleStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
                        return oMSBubbleStyle;
                    }
                    oMSBubbleStyle.direction = (ResourceDirection) nb5Var.l(ResourceDirection.PROTOBUF_ADAPTER);
                }
            }
            return oMSBubbleStyle;
        }

        public void serialize(OMSBubbleStyle oMSBubbleStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oMSBubbleStyle.colors;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ResourceDirection resourceDirection = oMSBubbleStyle.direction;
            if (resourceDirection != null) {
                codedOutputByteBufferNano.G(2, resourceDirection.ordinal());
            }
            ResourceDirection resourceDirection2 = oMSBubbleStyle.direction;
            if (resourceDirection2 != null) {
                codedOutputByteBufferNano.K(3, resourceDirection2, ResourceDirection.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSBubbleStyle> JSON_ADAPTER = new ObjectJsonAdapter<OMSBubbleStyle>() { // from class: com.p1.mobile.putong.data.OMSBubbleStyle.2
        public Class getDataClass() {
            return OMSBubbleStyle.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSBubbleStyle mo17830newInstance() {
            return new OMSBubbleStyle();
        }

        public boolean parseField(OMSBubbleStyle oMSBubbleStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("colors")) {
                oMSBubbleStyle.colors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("direction")) {
                return false;
            }
            oMSBubbleStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(OMSBubbleStyle oMSBubbleStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("colors") || str.equals("direction")) {
                return true;
            }
            return super.parseFieldCheck(oMSBubbleStyle, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSBubbleStyle oMSBubbleStyle, JsonGenerator jsonGenerator) throws IOException {
            if (oMSBubbleStyle.colors != null) {
                jsonGenerator.writeFieldName("colors");
                JsonAdapter.serializeArray(oMSBubbleStyle.colors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSBubbleStyle.direction != null) {
                jsonGenerator.writeFieldName("direction");
                ResourceDirection.JSON_ADAPTER.serialize(oMSBubbleStyle.direction, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSBubbleStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSBubbleStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m804a(String str) {
        return str;
    }

    public static OMSBubbleStyle new_() {
        OMSBubbleStyle oMSBubbleStyle = new OMSBubbleStyle();
        oMSBubbleStyle.nullCheck();
        return oMSBubbleStyle;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSBubbleStyle m18578clone() {
        OMSBubbleStyle oMSBubbleStyle = new OMSBubbleStyle();
        List<String> list = this.colors;
        if (list != null) {
            oMSBubbleStyle.colors = ValueObject.util_map(list, new w9j() { // from class: l.cy40
                public final Object call(Object obj) {
                    return OMSBubbleStyle.m804a((String) obj);
                }
            });
        }
        oMSBubbleStyle.direction = this.direction;
        return oMSBubbleStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSBubbleStyle)) {
            return false;
        }
        OMSBubbleStyle oMSBubbleStyle = (OMSBubbleStyle) obj;
        return ValueObject.util_equals(this.colors, oMSBubbleStyle.colors) && ValueObject.util_equals(this.direction, oMSBubbleStyle.direction);
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
        List<String> list = this.colors;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        ResourceDirection resourceDirection = this.direction;
        int iHashCode2 = iHashCode + (resourceDirection != null ? resourceDirection.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.colors == null) {
            this.colors = new ArrayList();
        }
        if (this.direction == null) {
            this.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
