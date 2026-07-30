package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class WebSubscriptionLandPageEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "websubscriptionlandpageenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public WebSubscriptionLandPageConfig data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<WebSubscriptionLandPageEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<WebSubscriptionLandPageEnvelope>() { // from class: com.p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope) {
            Meta meta = webSubscriptionLandPageEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = webSubscriptionLandPageEnvelope.data;
            if (webSubscriptionLandPageConfig != null) {
                iL += CodedOutputByteBufferNano.l(2, webSubscriptionLandPageConfig, WebSubscriptionLandPageConfig.PROTOBUF_ADAPTER);
            }
            ((MessageNano) webSubscriptionLandPageEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WebSubscriptionLandPageEnvelope m16321parse(nb5 nb5Var) throws IOException {
            WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope = new WebSubscriptionLandPageEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (webSubscriptionLandPageEnvelope.meta == null) {
                        webSubscriptionLandPageEnvelope.meta = Meta.new_();
                    }
                    if (webSubscriptionLandPageEnvelope.data != null) {
                        break;
                    }
                    webSubscriptionLandPageEnvelope.data = WebSubscriptionLandPageConfig.new_();
                    break;
                }
                if (iU == 10) {
                    webSubscriptionLandPageEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (webSubscriptionLandPageEnvelope.meta == null) {
                            webSubscriptionLandPageEnvelope.meta = Meta.new_();
                        }
                        if (webSubscriptionLandPageEnvelope.data != null) {
                            break;
                        }
                        webSubscriptionLandPageEnvelope.data = WebSubscriptionLandPageConfig.new_();
                        return webSubscriptionLandPageEnvelope;
                    }
                    webSubscriptionLandPageEnvelope.data = (WebSubscriptionLandPageConfig) nb5Var.l(WebSubscriptionLandPageConfig.PROTOBUF_ADAPTER);
                }
            }
            return webSubscriptionLandPageEnvelope;
        }

        public void serialize(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = webSubscriptionLandPageEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = webSubscriptionLandPageEnvelope.data;
            if (webSubscriptionLandPageConfig != null) {
                codedOutputByteBufferNano.K(2, webSubscriptionLandPageConfig, WebSubscriptionLandPageConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<WebSubscriptionLandPageEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<WebSubscriptionLandPageEnvelope>() { // from class: com.p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope.2
        public Class getDataClass() {
            return WebSubscriptionLandPageEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WebSubscriptionLandPageEnvelope m16322newInstance() {
            return new WebSubscriptionLandPageEnvelope();
        }

        public boolean parseField(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                webSubscriptionLandPageEnvelope.data = (WebSubscriptionLandPageConfig) WebSubscriptionLandPageConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            webSubscriptionLandPageEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(webSubscriptionLandPageEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WebSubscriptionLandPageEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WebSubscriptionLandPageEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WebSubscriptionLandPageEnvelope new_() {
        WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope = new WebSubscriptionLandPageEnvelope();
        webSubscriptionLandPageEnvelope.nullCheck();
        return webSubscriptionLandPageEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WebSubscriptionLandPageEnvelope m16320clone() {
        WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope = new WebSubscriptionLandPageEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            webSubscriptionLandPageEnvelope.meta = meta.clone();
        }
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = this.data;
        if (webSubscriptionLandPageConfig != null) {
            webSubscriptionLandPageEnvelope.data = webSubscriptionLandPageConfig.m16316clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = this.data;
        int iHashCode2 = iHashCode + (webSubscriptionLandPageConfig != null ? webSubscriptionLandPageConfig.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = WebSubscriptionLandPageConfig.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
