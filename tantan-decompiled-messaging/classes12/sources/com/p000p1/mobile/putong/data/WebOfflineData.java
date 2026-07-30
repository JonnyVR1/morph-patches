package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.WebOfflineData;
import com.p000p1.mobile.putong.data.WebPageOfflineConfig;
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
import java.util.List;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WebOfflineData webOfflineData) {
            List<WebPageOfflineConfig> list = webOfflineData.pages;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, WebPageOfflineConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            Map<String, String> map = webOfflineData.zips;
            if (map != null) {
                iL += CodedOutputByteBufferNano.l(2, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            ((MessageNano) webOfflineData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WebOfflineData m19371parse(nb5 nb5Var) throws IOException {
            WebOfflineData webOfflineData = new WebOfflineData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (webOfflineData.pages == null) {
                        webOfflineData.pages = new ArrayList();
                    }
                    if (webOfflineData.zips != null) {
                        break;
                    }
                    webOfflineData.zips = Collections.EMPTY_MAP;
                    break;
                }
                if (iU == 10) {
                    webOfflineData.pages = (List) nb5Var.l(WebPageOfflineConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (webOfflineData.pages == null) {
                            webOfflineData.pages = new ArrayList();
                        }
                        if (webOfflineData.zips != null) {
                            break;
                        }
                        webOfflineData.zips = Collections.EMPTY_MAP;
                        return webOfflineData;
                    }
                    webOfflineData.zips = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                }
            }
            return webOfflineData;
        }

        public void serialize(WebOfflineData webOfflineData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<WebPageOfflineConfig> list = webOfflineData.pages;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, WebPageOfflineConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Map<String, String> map = webOfflineData.zips;
            if (map != null) {
                codedOutputByteBufferNano.K(2, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<WebOfflineData> JSON_ADAPTER = new ObjectJsonAdapter<WebOfflineData>() { // from class: com.p1.mobile.putong.data.WebOfflineData.2
        public Class getDataClass() {
            return WebOfflineData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public WebOfflineData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WebOfflineData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WebOfflineData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1090a(String str) {
        return str;
    }

    public static WebOfflineData new_() {
        WebOfflineData webOfflineData = new WebOfflineData();
        webOfflineData.nullCheck();
        return webOfflineData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WebOfflineData m19370clone() {
        WebOfflineData webOfflineData = new WebOfflineData();
        List<WebPageOfflineConfig> list = this.pages;
        if (list != null) {
            webOfflineData.pages = ValueObject.util_map(list, new w9j() { // from class: l.dip0
                public final Object call(Object obj) {
                    return ((WebPageOfflineConfig) obj).m19373clone();
                }
            });
        }
        Map<String, String> map = this.zips;
        if (map != null) {
            webOfflineData.zips = ValueObject.util_map(map, new w9j() { // from class: l.eip0
                public final Object call(Object obj) {
                    return WebOfflineData.m1090a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<WebPageOfflineConfig> list = this.pages;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Map<String, String> map = this.zips;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.pages == null) {
            this.pages = new ArrayList();
        }
        if (this.zips == null) {
            this.zips = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
