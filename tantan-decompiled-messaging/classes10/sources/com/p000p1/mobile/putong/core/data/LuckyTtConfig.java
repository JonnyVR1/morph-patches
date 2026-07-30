package com.p000p1.mobile.putong.core.data;

import android.text.TextUtils;
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
public class LuckyTtConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "luckyttconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String bannerUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String jumpUrl;
    public static ProtobufAdapter<LuckyTtConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LuckyTtConfig>() { // from class: com.p1.mobile.putong.core.data.LuckyTtConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LuckyTtConfig luckyTtConfig) {
            String str = luckyTtConfig.iconUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = luckyTtConfig.bannerUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = luckyTtConfig.jumpUrl;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) luckyTtConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LuckyTtConfig m14037parse(nb5 nb5Var) throws IOException {
            LuckyTtConfig luckyTtConfig = new LuckyTtConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (luckyTtConfig.iconUrl == null) {
                        luckyTtConfig.iconUrl = "";
                    }
                    if (luckyTtConfig.bannerUrl == null) {
                        luckyTtConfig.bannerUrl = "";
                    }
                    if (luckyTtConfig.jumpUrl != null) {
                        break;
                    }
                    luckyTtConfig.jumpUrl = "";
                    break;
                }
                if (iU == 10) {
                    luckyTtConfig.iconUrl = nb5Var.s();
                } else if (iU == 18) {
                    luckyTtConfig.bannerUrl = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (luckyTtConfig.iconUrl == null) {
                            luckyTtConfig.iconUrl = "";
                        }
                        if (luckyTtConfig.bannerUrl == null) {
                            luckyTtConfig.bannerUrl = "";
                        }
                        if (luckyTtConfig.jumpUrl != null) {
                            break;
                        }
                        luckyTtConfig.jumpUrl = "";
                        return luckyTtConfig;
                    }
                    luckyTtConfig.jumpUrl = nb5Var.s();
                }
            }
            return luckyTtConfig;
        }

        public void serialize(LuckyTtConfig luckyTtConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = luckyTtConfig.iconUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = luckyTtConfig.bannerUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = luckyTtConfig.jumpUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<LuckyTtConfig> JSON_ADAPTER = new ObjectJsonAdapter<LuckyTtConfig>() { // from class: com.p1.mobile.putong.core.data.LuckyTtConfig.2
        public Class getDataClass() {
            return LuckyTtConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LuckyTtConfig m14038newInstance() {
            return new LuckyTtConfig();
        }

        public boolean parseField(LuckyTtConfig luckyTtConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bannerUrl":
                    luckyTtConfig.bannerUrl = jsonParser.getValueAsString();
                    return true;
                case "jumpUrl":
                    luckyTtConfig.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    luckyTtConfig.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LuckyTtConfig luckyTtConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bannerUrl":
                case "jumpUrl":
                case "iconUrl":
                    return true;
                default:
                    return super.parseFieldCheck(luckyTtConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LuckyTtConfig luckyTtConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = luckyTtConfig.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            String str2 = luckyTtConfig.bannerUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("bannerUrl", str2);
            }
            String str3 = luckyTtConfig.jumpUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("jumpUrl", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LuckyTtConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LuckyTtConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LuckyTtConfig new_() {
        LuckyTtConfig luckyTtConfig = new LuckyTtConfig();
        luckyTtConfig.nullCheck();
        return luckyTtConfig;
    }

    public static LuckyTtConfig parse(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LuckyTtConfig luckyTtConfig = (LuckyTtConfig) JSON_ADAPTER.parse(str);
        luckyTtConfig.nullCheck();
        return luckyTtConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LuckyTtConfig m14036clone() {
        LuckyTtConfig luckyTtConfig = new LuckyTtConfig();
        luckyTtConfig.iconUrl = this.iconUrl;
        luckyTtConfig.bannerUrl = this.bannerUrl;
        luckyTtConfig.jumpUrl = this.jumpUrl;
        return luckyTtConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LuckyTtConfig)) {
            return false;
        }
        LuckyTtConfig luckyTtConfig = (LuckyTtConfig) obj;
        return ValueObject.util_equals(this.iconUrl, luckyTtConfig.iconUrl) && ValueObject.util_equals(this.bannerUrl, luckyTtConfig.bannerUrl) && ValueObject.util_equals(this.jumpUrl, luckyTtConfig.jumpUrl);
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
        String str = this.iconUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bannerUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.jumpUrl;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.bannerUrl == null) {
            this.bannerUrl = "";
        }
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
