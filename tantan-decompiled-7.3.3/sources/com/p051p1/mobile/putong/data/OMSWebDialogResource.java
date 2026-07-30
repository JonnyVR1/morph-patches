package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class OMSWebDialogResource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omswebdialogresource";

    @NonNull
    @ProtobufIndex(index = 3)
    public OMSWebDialogPerimeter height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSWebDialogPerimeter width;
    public static ProtobufAdapter<OMSWebDialogResource> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSWebDialogResource>() { // from class: com.p1.mobile.putong.data.OMSWebDialogResource.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSWebDialogResource oMSWebDialogResource) {
            String str = oMSWebDialogResource.url;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            OMSWebDialogPerimeter oMSWebDialogPerimeter = oMSWebDialogResource.width;
            if (oMSWebDialogPerimeter != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, oMSWebDialogPerimeter, OMSWebDialogPerimeter.PROTOBUF_ADAPTER);
            }
            OMSWebDialogPerimeter oMSWebDialogPerimeter2 = oMSWebDialogResource.height;
            if (oMSWebDialogPerimeter2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, oMSWebDialogPerimeter2, OMSWebDialogPerimeter.PROTOBUF_ADAPTER);
            }
            oMSWebDialogResource.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSWebDialogResource parse(nc5 nc5Var) throws IOException {
            OMSWebDialogResource oMSWebDialogResource = new OMSWebDialogResource();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSWebDialogResource.url == null) {
                        oMSWebDialogResource.url = "";
                    }
                    if (oMSWebDialogResource.width == null) {
                        oMSWebDialogResource.width = OMSWebDialogPerimeter.new_();
                    }
                    if (oMSWebDialogResource.height != null) {
                        break;
                    }
                    oMSWebDialogResource.height = OMSWebDialogPerimeter.new_();
                    break;
                }
                if (iM162497u == 10) {
                    oMSWebDialogResource.url = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    oMSWebDialogResource.width = (OMSWebDialogPerimeter) nc5Var.m162488l(OMSWebDialogPerimeter.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
                        if (oMSWebDialogResource.url == null) {
                            oMSWebDialogResource.url = "";
                        }
                        if (oMSWebDialogResource.width == null) {
                            oMSWebDialogResource.width = OMSWebDialogPerimeter.new_();
                        }
                        if (oMSWebDialogResource.height != null) {
                            break;
                        }
                        oMSWebDialogResource.height = OMSWebDialogPerimeter.new_();
                        return oMSWebDialogResource;
                    }
                    oMSWebDialogResource.height = (OMSWebDialogPerimeter) nc5Var.m162488l(OMSWebDialogPerimeter.PROTOBUF_ADAPTER);
                }
            }
            return oMSWebDialogResource;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSWebDialogResource oMSWebDialogResource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSWebDialogResource.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            OMSWebDialogPerimeter oMSWebDialogPerimeter = oMSWebDialogResource.width;
            if (oMSWebDialogPerimeter != null) {
                codedOutputByteBufferNano.m17309K(2, oMSWebDialogPerimeter, OMSWebDialogPerimeter.PROTOBUF_ADAPTER);
            }
            OMSWebDialogPerimeter oMSWebDialogPerimeter2 = oMSWebDialogResource.height;
            if (oMSWebDialogPerimeter2 != null) {
                codedOutputByteBufferNano.m17309K(3, oMSWebDialogPerimeter2, OMSWebDialogPerimeter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSWebDialogResource> JSON_ADAPTER = new ObjectJsonAdapter<OMSWebDialogResource>() { // from class: com.p1.mobile.putong.data.OMSWebDialogResource.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSWebDialogResource.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSWebDialogResource newInstance() {
            return new OMSWebDialogResource();
        }

        public boolean parseField(OMSWebDialogResource oMSWebDialogResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "height":
                    oMSWebDialogResource.height = OMSWebDialogPerimeter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    oMSWebDialogResource.url = jsonParser.getValueAsString();
                    return true;
                case "width":
                    oMSWebDialogResource.width = OMSWebDialogPerimeter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSWebDialogResource oMSWebDialogResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "height":
                case "url":
                case "width":
                    return true;
                default:
                    return super.parseFieldCheck(oMSWebDialogResource, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSWebDialogResource oMSWebDialogResource, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSWebDialogResource.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            if (oMSWebDialogResource.width != null) {
                jsonGenerator.writeFieldName("width");
                OMSWebDialogPerimeter.JSON_ADAPTER.serialize(oMSWebDialogResource.width, jsonGenerator, true);
            }
            if (oMSWebDialogResource.height != null) {
                jsonGenerator.writeFieldName("height");
                OMSWebDialogPerimeter.JSON_ADAPTER.serialize(oMSWebDialogResource.height, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSWebDialogResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSWebDialogResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSWebDialogResource new_() {
        OMSWebDialogResource oMSWebDialogResource = new OMSWebDialogResource();
        oMSWebDialogResource.nullCheck();
        return oMSWebDialogResource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSWebDialogResource mo225055clone() {
        OMSWebDialogResource oMSWebDialogResource = new OMSWebDialogResource();
        oMSWebDialogResource.url = this.url;
        OMSWebDialogPerimeter oMSWebDialogPerimeter = this.width;
        if (oMSWebDialogPerimeter != null) {
            oMSWebDialogResource.width = oMSWebDialogPerimeter.mo225055clone();
        }
        OMSWebDialogPerimeter oMSWebDialogPerimeter2 = this.height;
        if (oMSWebDialogPerimeter2 != null) {
            oMSWebDialogResource.height = oMSWebDialogPerimeter2.mo225055clone();
        }
        return oMSWebDialogResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSWebDialogResource)) {
            return false;
        }
        OMSWebDialogResource oMSWebDialogResource = (OMSWebDialogResource) obj;
        return ValueObject.util_equals(this.url, oMSWebDialogResource.url) && ValueObject.util_equals(this.width, oMSWebDialogResource.width) && ValueObject.util_equals(this.height, oMSWebDialogResource.height);
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        OMSWebDialogPerimeter oMSWebDialogPerimeter = this.width;
        int iHashCode2 = (iHashCode + (oMSWebDialogPerimeter != null ? oMSWebDialogPerimeter.hashCode() : 0)) * 41;
        OMSWebDialogPerimeter oMSWebDialogPerimeter2 = this.height;
        int iHashCode3 = iHashCode2 + (oMSWebDialogPerimeter2 != null ? oMSWebDialogPerimeter2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.width == null) {
            this.width = OMSWebDialogPerimeter.new_();
        }
        if (this.height == null) {
            this.height = OMSWebDialogPerimeter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
