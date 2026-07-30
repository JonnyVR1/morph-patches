package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSBubbleStyle;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSBubbleStyle oMSBubbleStyle) {
            List<String> list = oMSBubbleStyle.colors;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ResourceDirection resourceDirection = oMSBubbleStyle.direction;
            if (resourceDirection != null) {
                iM17285l += CodedOutputByteBufferNano.m17281h(2, resourceDirection.ordinal());
            }
            ResourceDirection resourceDirection2 = oMSBubbleStyle.direction;
            if (resourceDirection2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, resourceDirection2, ResourceDirection.PROTOBUF_ADAPTER);
            }
            oMSBubbleStyle.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSBubbleStyle parse(nc5 nc5Var) throws IOException {
            OMSBubbleStyle oMSBubbleStyle = new OMSBubbleStyle();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    oMSBubbleStyle.colors = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 26) {
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
                    oMSBubbleStyle.direction = (ResourceDirection) nc5Var.m162488l(ResourceDirection.PROTOBUF_ADAPTER);
                }
            }
            return oMSBubbleStyle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSBubbleStyle oMSBubbleStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oMSBubbleStyle.colors;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ResourceDirection resourceDirection = oMSBubbleStyle.direction;
            if (resourceDirection != null) {
                codedOutputByteBufferNano.m17305G(2, resourceDirection.ordinal());
            }
            ResourceDirection resourceDirection2 = oMSBubbleStyle.direction;
            if (resourceDirection2 != null) {
                codedOutputByteBufferNano.m17309K(3, resourceDirection2, ResourceDirection.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSBubbleStyle> JSON_ADAPTER = new ObjectJsonAdapter<OMSBubbleStyle>() { // from class: com.p1.mobile.putong.data.OMSBubbleStyle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSBubbleStyle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSBubbleStyle newInstance() {
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
            oMSBubbleStyle.direction = ResourceDirection.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(OMSBubbleStyle oMSBubbleStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("colors") || str.equals("direction")) {
                return true;
            }
            return super.parseFieldCheck(oMSBubbleStyle, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSBubbleStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSBubbleStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61070a(String str) {
        return str;
    }

    public static OMSBubbleStyle new_() {
        OMSBubbleStyle oMSBubbleStyle = new OMSBubbleStyle();
        oMSBubbleStyle.nullCheck();
        return oMSBubbleStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSBubbleStyle mo225055clone() {
        OMSBubbleStyle oMSBubbleStyle = new OMSBubbleStyle();
        List<String> list = this.colors;
        if (list != null) {
            oMSBubbleStyle.colors = ValueObject.util_map(list, new qcj() { // from class: l.r650
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSBubbleStyle.m61070a((String) obj);
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
        List<String> list = this.colors;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        ResourceDirection resourceDirection = this.direction;
        int iHashCode2 = iHashCode + (resourceDirection != null ? resourceDirection.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.colors == null) {
            this.colors = new ArrayList();
        }
        if (this.direction == null) {
            this.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
