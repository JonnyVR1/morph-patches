package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class WebSubscriptionLandPageConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "websubscriptionlandpageconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean visible;

    @NonNull
    @ProtobufIndex(index = 1)
    public String webSubscriptionLandPage;
    public static ProtobufAdapter<WebSubscriptionLandPageConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WebSubscriptionLandPageConfig>() { // from class: com.p1.mobile.putong.core.data.WebSubscriptionLandPageConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WebSubscriptionLandPageConfig webSubscriptionLandPageConfig) {
            String str = webSubscriptionLandPageConfig.webSubscriptionLandPage;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, webSubscriptionLandPageConfig.visible);
            ((MessageNano) webSubscriptionLandPageConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WebSubscriptionLandPageConfig m16317parse(nb5 nb5Var) throws IOException {
            WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = new WebSubscriptionLandPageConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (webSubscriptionLandPageConfig.webSubscriptionLandPage != null) {
                        break;
                    }
                    webSubscriptionLandPageConfig.webSubscriptionLandPage = "";
                    break;
                }
                if (iU == 10) {
                    webSubscriptionLandPageConfig.webSubscriptionLandPage = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (webSubscriptionLandPageConfig.webSubscriptionLandPage != null) {
                            break;
                        }
                        webSubscriptionLandPageConfig.webSubscriptionLandPage = "";
                        return webSubscriptionLandPageConfig;
                    }
                    webSubscriptionLandPageConfig.visible = nb5Var.g();
                }
            }
            return webSubscriptionLandPageConfig;
        }

        public void serialize(WebSubscriptionLandPageConfig webSubscriptionLandPageConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = webSubscriptionLandPageConfig.webSubscriptionLandPage;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, webSubscriptionLandPageConfig.visible);
        }
    };
    public static JsonAdapter<WebSubscriptionLandPageConfig> JSON_ADAPTER = new ObjectJsonAdapter<WebSubscriptionLandPageConfig>() { // from class: com.p1.mobile.putong.core.data.WebSubscriptionLandPageConfig.2
        public Class getDataClass() {
            return WebSubscriptionLandPageConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WebSubscriptionLandPageConfig m16318newInstance() {
            return new WebSubscriptionLandPageConfig();
        }

        public boolean parseField(WebSubscriptionLandPageConfig webSubscriptionLandPageConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("webSubscriptionLandPage")) {
                webSubscriptionLandPageConfig.webSubscriptionLandPage = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("visible")) {
                return false;
            }
            webSubscriptionLandPageConfig.visible = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(WebSubscriptionLandPageConfig webSubscriptionLandPageConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("webSubscriptionLandPage") || str.equals("visible")) {
                return true;
            }
            return super.parseFieldCheck(webSubscriptionLandPageConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(WebSubscriptionLandPageConfig webSubscriptionLandPageConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = webSubscriptionLandPageConfig.webSubscriptionLandPage;
            if (str != null) {
                jsonGenerator.writeStringField("webSubscriptionLandPage", str);
            }
            jsonGenerator.writeBooleanField("visible", webSubscriptionLandPageConfig.visible);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WebSubscriptionLandPageConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WebSubscriptionLandPageConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WebSubscriptionLandPageConfig new_() {
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = new WebSubscriptionLandPageConfig();
        webSubscriptionLandPageConfig.nullCheck();
        return webSubscriptionLandPageConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WebSubscriptionLandPageConfig m16316clone() {
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = new WebSubscriptionLandPageConfig();
        webSubscriptionLandPageConfig.webSubscriptionLandPage = this.webSubscriptionLandPage;
        webSubscriptionLandPageConfig.visible = this.visible;
        return webSubscriptionLandPageConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebSubscriptionLandPageConfig)) {
            return false;
        }
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = (WebSubscriptionLandPageConfig) obj;
        return ValueObject.util_equals(this.webSubscriptionLandPage, webSubscriptionLandPageConfig.webSubscriptionLandPage) && this.visible == webSubscriptionLandPageConfig.visible;
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
        String str = this.webSubscriptionLandPage;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.visible ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.webSubscriptionLandPage == null) {
            this.webSubscriptionLandPage = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
