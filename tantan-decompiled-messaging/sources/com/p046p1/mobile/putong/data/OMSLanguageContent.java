package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSResourceContent;
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
import java.util.Collections;
import java.util.Map;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class OMSLanguageContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omslanguagecontent";

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, OMSResourceContent> style;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<OMSLanguageContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSLanguageContent>() { // from class: com.p1.mobile.putong.data.OMSLanguageContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSLanguageContent oMSLanguageContent) {
            String str = oMSLanguageContent.value;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            Map<String, OMSResourceContent> map = oMSLanguageContent.style;
            if (map != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, map, OMSResourceContent.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            oMSLanguageContent.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSLanguageContent parse(nb5 nb5Var) throws IOException {
            OMSLanguageContent oMSLanguageContent = new OMSLanguageContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSLanguageContent.value == null) {
                        oMSLanguageContent.value = "";
                    }
                    if (oMSLanguageContent.style != null) {
                        break;
                    }
                    oMSLanguageContent.style = Collections.EMPTY_MAP;
                    break;
                }
                if (iM158752u == 10) {
                    oMSLanguageContent.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (oMSLanguageContent.value == null) {
                            oMSLanguageContent.value = "";
                        }
                        if (oMSLanguageContent.style != null) {
                            break;
                        }
                        oMSLanguageContent.style = Collections.EMPTY_MAP;
                        return oMSLanguageContent;
                    }
                    oMSLanguageContent.style = (Map) nb5Var.m158743l(OMSResourceContent.PROTOBUF_ADAPTER.MAP_ADAPTER());
                }
            }
            return oMSLanguageContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSLanguageContent oMSLanguageContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSLanguageContent.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            Map<String, OMSResourceContent> map = oMSLanguageContent.style;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(2, map, OMSResourceContent.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSLanguageContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSLanguageContent>() { // from class: com.p1.mobile.putong.data.OMSLanguageContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSLanguageContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSLanguageContent newInstance() {
            return new OMSLanguageContent();
        }

        public boolean parseField(OMSLanguageContent oMSLanguageContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("style")) {
                oMSLanguageContent.style = JsonAdapter.parseMap(jsonParser, OMSResourceContent.JSON_ADAPTER, str2);
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            oMSLanguageContent.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OMSLanguageContent oMSLanguageContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("style") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(oMSLanguageContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSLanguageContent oMSLanguageContent, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSLanguageContent.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            if (oMSLanguageContent.style != null) {
                jsonGenerator.writeFieldName("style");
                JsonAdapter.serializeMap(oMSLanguageContent.style, jsonGenerator, OMSResourceContent.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSLanguageContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSLanguageContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSLanguageContent new_() {
        OMSLanguageContent oMSLanguageContent = new OMSLanguageContent();
        oMSLanguageContent.nullCheck();
        return oMSLanguageContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSLanguageContent mo223809clone() {
        OMSLanguageContent oMSLanguageContent = new OMSLanguageContent();
        oMSLanguageContent.value = this.value;
        Map<String, OMSResourceContent> map = this.style;
        if (map != null) {
            oMSLanguageContent.style = ValueObject.util_map(map, new w9j() { // from class: l.bz40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSResourceContent) obj).mo223809clone();
                }
            });
        }
        return oMSLanguageContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSLanguageContent)) {
            return false;
        }
        OMSLanguageContent oMSLanguageContent = (OMSLanguageContent) obj;
        return ValueObject.util_equals(this.value, oMSLanguageContent.value) && ValueObject.util_equals(this.style, oMSLanguageContent.style);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Map<String, OMSResourceContent> map = this.style;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.style == null) {
            this.style = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
