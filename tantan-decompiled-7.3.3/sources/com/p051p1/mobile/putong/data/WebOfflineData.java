package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.WebOfflineData;
import com.p051p1.mobile.putong.data.WebPageOfflineConfig;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class WebOfflineData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "webofflinedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<WebPageOfflineConfig> pages;

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, String> zips;
    public static ProtobufAdapter<WebOfflineData> PROTOBUF_ADAPTER = new MessageNanoAdapter<WebOfflineData>() { // from class: com.p1.mobile.putong.data.WebOfflineData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WebOfflineData webOfflineData) {
            List<WebPageOfflineConfig> list = webOfflineData.pages;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, WebPageOfflineConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            Map<String, String> map = webOfflineData.zips;
            if (map != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            webOfflineData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WebOfflineData parse(nc5 nc5Var) throws IOException {
            WebOfflineData webOfflineData = new WebOfflineData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (webOfflineData.pages == null) {
                        webOfflineData.pages = new ArrayList();
                    }
                    if (webOfflineData.zips != null) {
                        break;
                    }
                    webOfflineData.zips = Collections.EMPTY_MAP;
                    break;
                }
                if (iM162497u == 10) {
                    webOfflineData.pages = (List) nc5Var.m162488l(WebPageOfflineConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (webOfflineData.pages == null) {
                            webOfflineData.pages = new ArrayList();
                        }
                        if (webOfflineData.zips != null) {
                            break;
                        }
                        webOfflineData.zips = Collections.EMPTY_MAP;
                        return webOfflineData;
                    }
                    webOfflineData.zips = (Map) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                }
            }
            return webOfflineData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WebOfflineData webOfflineData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<WebPageOfflineConfig> list = webOfflineData.pages;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, WebPageOfflineConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Map<String, String> map = webOfflineData.zips;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(2, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<WebOfflineData> JSON_ADAPTER = new ObjectJsonAdapter<WebOfflineData>() { // from class: com.p1.mobile.putong.data.WebOfflineData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WebOfflineData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WebOfflineData newInstance() {
            return new WebOfflineData();
        }

        public boolean parseField(WebOfflineData webOfflineData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("zips")) {
                webOfflineData.zips = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                return true;
            }
            if (!str.equals("pages")) {
                return false;
            }
            webOfflineData.pages = JsonAdapter.parseArray(jsonParser, WebPageOfflineConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(WebOfflineData webOfflineData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("zips") || str.equals("pages")) {
                return true;
            }
            return super.parseFieldCheck(webOfflineData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WebOfflineData webOfflineData, JsonGenerator jsonGenerator) throws IOException {
            if (webOfflineData.pages != null) {
                jsonGenerator.writeFieldName("pages");
                JsonAdapter.serializeArray(webOfflineData.pages, jsonGenerator, WebPageOfflineConfig.JSON_ADAPTER);
            }
            if (webOfflineData.zips != null) {
                jsonGenerator.writeFieldName("zips");
                JsonAdapter.serializeMap(webOfflineData.zips, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WebOfflineData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WebOfflineData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61356a(String str) {
        return str;
    }

    public static WebOfflineData new_() {
        WebOfflineData webOfflineData = new WebOfflineData();
        webOfflineData.nullCheck();
        return webOfflineData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WebOfflineData mo225055clone() {
        WebOfflineData webOfflineData = new WebOfflineData();
        List<WebPageOfflineConfig> list = this.pages;
        if (list != null) {
            webOfflineData.pages = ValueObject.util_map(list, new qcj() { // from class: l.hrp0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((WebPageOfflineConfig) obj).mo225055clone();
                }
            });
        }
        Map<String, String> map = this.zips;
        if (map != null) {
            webOfflineData.zips = ValueObject.util_map(map, new qcj() { // from class: l.irp0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return WebOfflineData.m61356a((String) obj);
                }
            });
        }
        return webOfflineData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebOfflineData)) {
            return false;
        }
        WebOfflineData webOfflineData = (WebOfflineData) obj;
        return ValueObject.util_equals(this.pages, webOfflineData.pages) && ValueObject.util_equals(this.zips, webOfflineData.zips);
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
        List<WebPageOfflineConfig> list = this.pages;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Map<String, String> map = this.zips;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pages == null) {
            this.pages = new ArrayList();
        }
        if (this.zips == null) {
            this.zips = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
