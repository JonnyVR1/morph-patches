package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class WebPageOfflineConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "webpageofflineconfig";

    @NonNull
    @ProtobufIndex(index = 5)
    public String from;

    @NonNull
    @ProtobufIndex(index = 3)
    public String index;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pageId;

    @ProtobufIndex(index = 1)
    public boolean preRender;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<WebPageOfflineConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WebPageOfflineConfig>() { // from class: com.p1.mobile.putong.data.WebPageOfflineConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WebPageOfflineConfig webPageOfflineConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, webPageOfflineConfig.preRender);
            String str = webPageOfflineConfig.url;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = webPageOfflineConfig.index;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = webPageOfflineConfig.pageId;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = webPageOfflineConfig.from;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            webPageOfflineConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WebPageOfflineConfig parse(nc5 nc5Var) throws IOException {
            WebPageOfflineConfig webPageOfflineConfig = new WebPageOfflineConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (webPageOfflineConfig.url == null) {
                        webPageOfflineConfig.url = "";
                    }
                    if (webPageOfflineConfig.index == null) {
                        webPageOfflineConfig.index = "";
                    }
                    if (webPageOfflineConfig.pageId == null) {
                        webPageOfflineConfig.pageId = "";
                    }
                    if (webPageOfflineConfig.from != null) {
                        break;
                    }
                    webPageOfflineConfig.from = "";
                    break;
                }
                if (iM162497u == 8) {
                    webPageOfflineConfig.preRender = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    webPageOfflineConfig.url = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    webPageOfflineConfig.index = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    webPageOfflineConfig.pageId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (webPageOfflineConfig.url == null) {
                            webPageOfflineConfig.url = "";
                        }
                        if (webPageOfflineConfig.index == null) {
                            webPageOfflineConfig.index = "";
                        }
                        if (webPageOfflineConfig.pageId == null) {
                            webPageOfflineConfig.pageId = "";
                        }
                        if (webPageOfflineConfig.from != null) {
                            break;
                        }
                        webPageOfflineConfig.from = "";
                        return webPageOfflineConfig;
                    }
                    webPageOfflineConfig.from = nc5Var.m162495s();
                }
            }
            return webPageOfflineConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WebPageOfflineConfig webPageOfflineConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, webPageOfflineConfig.preRender);
            String str = webPageOfflineConfig.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = webPageOfflineConfig.index;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = webPageOfflineConfig.pageId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = webPageOfflineConfig.from;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
        }
    };
    public static JsonAdapter<WebPageOfflineConfig> JSON_ADAPTER = new ObjectJsonAdapter<WebPageOfflineConfig>() { // from class: com.p1.mobile.putong.data.WebPageOfflineConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WebPageOfflineConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WebPageOfflineConfig newInstance() {
            return new WebPageOfflineConfig();
        }

        public boolean parseField(WebPageOfflineConfig webPageOfflineConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "preRender":
                    webPageOfflineConfig.preRender = jsonParser.getValueAsBoolean();
                    return true;
                case "pageId":
                    webPageOfflineConfig.pageId = jsonParser.getValueAsString();
                    return true;
                case "url":
                    webPageOfflineConfig.url = jsonParser.getValueAsString();
                    return true;
                case "from":
                    webPageOfflineConfig.from = jsonParser.getValueAsString();
                    return true;
                case "index":
                    webPageOfflineConfig.index = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WebPageOfflineConfig webPageOfflineConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "preRender":
                case "pageId":
                case "url":
                case "from":
                case "index":
                    return true;
                default:
                    return super.parseFieldCheck(webPageOfflineConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WebPageOfflineConfig webPageOfflineConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("preRender", webPageOfflineConfig.preRender);
            String str = webPageOfflineConfig.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = webPageOfflineConfig.index;
            if (str2 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.INDEX, str2);
            }
            String str3 = webPageOfflineConfig.pageId;
            if (str3 != null) {
                jsonGenerator.writeStringField("pageId", str3);
            }
            String str4 = webPageOfflineConfig.from;
            if (str4 != null) {
                jsonGenerator.writeStringField("from", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WebPageOfflineConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WebPageOfflineConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WebPageOfflineConfig new_() {
        WebPageOfflineConfig webPageOfflineConfig = new WebPageOfflineConfig();
        webPageOfflineConfig.nullCheck();
        return webPageOfflineConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WebPageOfflineConfig mo225055clone() {
        WebPageOfflineConfig webPageOfflineConfig = new WebPageOfflineConfig();
        webPageOfflineConfig.preRender = this.preRender;
        webPageOfflineConfig.url = this.url;
        webPageOfflineConfig.index = this.index;
        webPageOfflineConfig.pageId = this.pageId;
        webPageOfflineConfig.from = this.from;
        return webPageOfflineConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebPageOfflineConfig)) {
            return false;
        }
        WebPageOfflineConfig webPageOfflineConfig = (WebPageOfflineConfig) obj;
        return this.preRender == webPageOfflineConfig.preRender && ValueObject.util_equals(this.url, webPageOfflineConfig.url) && ValueObject.util_equals(this.index, webPageOfflineConfig.index) && ValueObject.util_equals(this.pageId, webPageOfflineConfig.pageId) && ValueObject.util_equals(this.from, webPageOfflineConfig.from);
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
        int i2 = ((i * 41) + (this.preRender ? 1231 : 1237)) * 41;
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.index;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pageId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.from;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.index == null) {
            this.index = "";
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
        if (this.from == null) {
            this.from = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
