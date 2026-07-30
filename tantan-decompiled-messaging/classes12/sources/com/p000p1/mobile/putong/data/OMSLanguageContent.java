package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSResourceContent;
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
import java.util.Collections;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSLanguageContent oMSLanguageContent) {
            String str = oMSLanguageContent.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Map<String, OMSResourceContent> map = oMSLanguageContent.style;
            if (map != null) {
                iO += CodedOutputByteBufferNano.l(2, map, OMSResourceContent.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            ((MessageNano) oMSLanguageContent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSLanguageContent m18630parse(nb5 nb5Var) throws IOException {
            OMSLanguageContent oMSLanguageContent = new OMSLanguageContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSLanguageContent.value == null) {
                        oMSLanguageContent.value = "";
                    }
                    if (oMSLanguageContent.style != null) {
                        break;
                    }
                    oMSLanguageContent.style = Collections.EMPTY_MAP;
                    break;
                }
                if (iU == 10) {
                    oMSLanguageContent.value = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (oMSLanguageContent.value == null) {
                            oMSLanguageContent.value = "";
                        }
                        if (oMSLanguageContent.style != null) {
                            break;
                        }
                        oMSLanguageContent.style = Collections.EMPTY_MAP;
                        return oMSLanguageContent;
                    }
                    oMSLanguageContent.style = (Map) nb5Var.l(OMSResourceContent.PROTOBUF_ADAPTER.MAP_ADAPTER());
                }
            }
            return oMSLanguageContent;
        }

        public void serialize(OMSLanguageContent oMSLanguageContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSLanguageContent.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Map<String, OMSResourceContent> map = oMSLanguageContent.style;
            if (map != null) {
                codedOutputByteBufferNano.K(2, map, OMSResourceContent.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSLanguageContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSLanguageContent>() { // from class: com.p1.mobile.putong.data.OMSLanguageContent.2
        public Class getDataClass() {
            return OMSLanguageContent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSLanguageContent mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSLanguageContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSLanguageContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSLanguageContent new_() {
        OMSLanguageContent oMSLanguageContent = new OMSLanguageContent();
        oMSLanguageContent.nullCheck();
        return oMSLanguageContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSLanguageContent m18629clone() {
        OMSLanguageContent oMSLanguageContent = new OMSLanguageContent();
        oMSLanguageContent.value = this.value;
        Map<String, OMSResourceContent> map = this.style;
        if (map != null) {
            oMSLanguageContent.style = ValueObject.util_map(map, new w9j() { // from class: l.bz40
                public final Object call(Object obj) {
                    return ((OMSResourceContent) obj).m18653clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Map<String, OMSResourceContent> map = this.style;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.style == null) {
            this.style = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
