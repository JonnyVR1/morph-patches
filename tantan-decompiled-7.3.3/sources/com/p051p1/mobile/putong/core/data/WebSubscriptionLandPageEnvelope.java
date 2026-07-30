package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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

/* JADX INFO: loaded from: classes10.dex */
public class WebSubscriptionLandPageEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "websubscriptionlandpageenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public WebSubscriptionLandPageConfig data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<WebSubscriptionLandPageEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<WebSubscriptionLandPageEnvelope>() { // from class: com.p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope) {
            Meta meta = webSubscriptionLandPageEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = webSubscriptionLandPageEnvelope.data;
            if (webSubscriptionLandPageConfig != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, webSubscriptionLandPageConfig, WebSubscriptionLandPageConfig.PROTOBUF_ADAPTER);
            }
            webSubscriptionLandPageEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WebSubscriptionLandPageEnvelope parse(nc5 nc5Var) throws IOException {
            WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope = new WebSubscriptionLandPageEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (webSubscriptionLandPageEnvelope.meta == null) {
                        webSubscriptionLandPageEnvelope.meta = Meta.new_();
                    }
                    if (webSubscriptionLandPageEnvelope.data != null) {
                        break;
                    }
                    webSubscriptionLandPageEnvelope.data = WebSubscriptionLandPageConfig.new_();
                    break;
                }
                if (iM162497u == 10) {
                    webSubscriptionLandPageEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (webSubscriptionLandPageEnvelope.meta == null) {
                            webSubscriptionLandPageEnvelope.meta = Meta.new_();
                        }
                        if (webSubscriptionLandPageEnvelope.data != null) {
                            break;
                        }
                        webSubscriptionLandPageEnvelope.data = WebSubscriptionLandPageConfig.new_();
                        return webSubscriptionLandPageEnvelope;
                    }
                    webSubscriptionLandPageEnvelope.data = (WebSubscriptionLandPageConfig) nc5Var.m162488l(WebSubscriptionLandPageConfig.PROTOBUF_ADAPTER);
                }
            }
            return webSubscriptionLandPageEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = webSubscriptionLandPageEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = webSubscriptionLandPageEnvelope.data;
            if (webSubscriptionLandPageConfig != null) {
                codedOutputByteBufferNano.m17309K(2, webSubscriptionLandPageConfig, WebSubscriptionLandPageConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<WebSubscriptionLandPageEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<WebSubscriptionLandPageEnvelope>() { // from class: com.p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WebSubscriptionLandPageEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WebSubscriptionLandPageEnvelope newInstance() {
            return new WebSubscriptionLandPageEnvelope();
        }

        public boolean parseField(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                webSubscriptionLandPageEnvelope.data = WebSubscriptionLandPageConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            webSubscriptionLandPageEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(webSubscriptionLandPageEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (webSubscriptionLandPageEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(webSubscriptionLandPageEnvelope.meta, jsonGenerator, true);
            }
            if (webSubscriptionLandPageEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                WebSubscriptionLandPageConfig.JSON_ADAPTER.serialize(webSubscriptionLandPageEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WebSubscriptionLandPageEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WebSubscriptionLandPageEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WebSubscriptionLandPageEnvelope new_() {
        WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope = new WebSubscriptionLandPageEnvelope();
        webSubscriptionLandPageEnvelope.nullCheck();
        return webSubscriptionLandPageEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WebSubscriptionLandPageEnvelope mo225055clone() {
        WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope = new WebSubscriptionLandPageEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            webSubscriptionLandPageEnvelope.meta = meta.mo225055clone();
        }
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = this.data;
        if (webSubscriptionLandPageConfig != null) {
            webSubscriptionLandPageEnvelope.data = webSubscriptionLandPageConfig.mo225055clone();
        }
        return webSubscriptionLandPageEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebSubscriptionLandPageEnvelope)) {
            return false;
        }
        WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope = (WebSubscriptionLandPageEnvelope) obj;
        return ValueObject.util_equals(this.meta, webSubscriptionLandPageEnvelope.meta) && ValueObject.util_equals(this.data, webSubscriptionLandPageEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = this.data;
        int iHashCode2 = iHashCode + (webSubscriptionLandPageConfig != null ? webSubscriptionLandPageConfig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = WebSubscriptionLandPageConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
