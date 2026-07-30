package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSLanguageInfo;
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
public class OMSLanguageInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omslanguageinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, Map<String, String>> content;

    @NonNull
    @ProtobufIndex(index = 1)
    public String defaultLang;
    public static ProtobufAdapter<OMSLanguageInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSLanguageInfo>() { // from class: com.p1.mobile.putong.data.OMSLanguageInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSLanguageInfo oMSLanguageInfo) {
            String str = oMSLanguageInfo.defaultLang;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Map<String, Map<String, String>> map = oMSLanguageInfo.content;
            if (map != null) {
                iO += CodedOutputByteBufferNano.l(2, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER().MAP_ADAPTER());
            }
            ((MessageNano) oMSLanguageInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSLanguageInfo m18633parse(nb5 nb5Var) throws IOException {
            OMSLanguageInfo oMSLanguageInfo = new OMSLanguageInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSLanguageInfo.defaultLang == null) {
                        oMSLanguageInfo.defaultLang = "";
                    }
                    if (oMSLanguageInfo.content != null) {
                        break;
                    }
                    oMSLanguageInfo.content = Collections.EMPTY_MAP;
                    break;
                }
                if (iU == 10) {
                    oMSLanguageInfo.defaultLang = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (oMSLanguageInfo.defaultLang == null) {
                            oMSLanguageInfo.defaultLang = "";
                        }
                        if (oMSLanguageInfo.content != null) {
                            break;
                        }
                        oMSLanguageInfo.content = Collections.EMPTY_MAP;
                        return oMSLanguageInfo;
                    }
                    oMSLanguageInfo.content = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER().MAP_ADAPTER());
                }
            }
            return oMSLanguageInfo;
        }

        public void serialize(OMSLanguageInfo oMSLanguageInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSLanguageInfo.defaultLang;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Map<String, Map<String, String>> map = oMSLanguageInfo.content;
            if (map != null) {
                codedOutputByteBufferNano.K(2, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER().MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSLanguageInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSLanguageInfo>() { // from class: com.p1.mobile.putong.data.OMSLanguageInfo.2
        public Class getDataClass() {
            return OMSLanguageInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSLanguageInfo mo17830newInstance() {
            return new OMSLanguageInfo();
        }

        public boolean parseField(OMSLanguageInfo oMSLanguageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("defaultLang")) {
                oMSLanguageInfo.defaultLang = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("content")) {
                return false;
            }
            oMSLanguageInfo.content = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER.MAP_ADAPTER(), str2);
            return true;
        }

        public boolean parseFieldCheck(OMSLanguageInfo oMSLanguageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("defaultLang") || str.equals("content")) {
                return true;
            }
            return super.parseFieldCheck(oMSLanguageInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSLanguageInfo oMSLanguageInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSLanguageInfo.defaultLang;
            if (str != null) {
                jsonGenerator.writeStringField("defaultLang", str);
            }
            if (oMSLanguageInfo.content != null) {
                jsonGenerator.writeFieldName("content");
                JsonAdapter.serializeMap(oMSLanguageInfo.content, jsonGenerator, JsonAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSLanguageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSLanguageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m836b(String str) {
        return str;
    }

    public static OMSLanguageInfo new_() {
        OMSLanguageInfo oMSLanguageInfo = new OMSLanguageInfo();
        oMSLanguageInfo.nullCheck();
        return oMSLanguageInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSLanguageInfo m18632clone() {
        OMSLanguageInfo oMSLanguageInfo = new OMSLanguageInfo();
        oMSLanguageInfo.defaultLang = this.defaultLang;
        Map<String, Map<String, String>> map = this.content;
        if (map != null) {
            oMSLanguageInfo.content = ValueObject.util_map(map, new w9j() { // from class: l.dz40
                public final Object call(Object obj) {
                    return ValueObject.util_map((Map) obj, new w9j() { // from class: l.cz40
                        public final Object call(Object obj2) {
                            return OMSLanguageInfo.m836b((String) obj2);
                        }
                    });
                }
            });
        }
        return oMSLanguageInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSLanguageInfo)) {
            return false;
        }
        OMSLanguageInfo oMSLanguageInfo = (OMSLanguageInfo) obj;
        return ValueObject.util_equals(this.defaultLang, oMSLanguageInfo.defaultLang) && ValueObject.util_equals(this.content, oMSLanguageInfo.content);
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
        String str = this.defaultLang;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Map<String, Map<String, String>> map = this.content;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.defaultLang == null) {
            this.defaultLang = "";
        }
        if (this.content == null) {
            this.content = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
