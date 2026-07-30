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
public class WarmingUpEmoResConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "warmingupemoresconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String poke_sticker_svga_bixin;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String poke_sticker_svga_dk;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String poke_sticker_svga_dx;

    @NonNull
    @ProtobufIndex(index = 4)
    public String poke_sticker_svga_jy;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String poke_sticker_svga_wanan;

    @NonNull
    @ProtobufIndex(index = 6)
    public String poke_sticker_svga_zaima;
    public static ProtobufAdapter<WarmingUpEmoResConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WarmingUpEmoResConfig>() { // from class: com.p1.mobile.putong.core.data.WarmingUpEmoResConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WarmingUpEmoResConfig warmingUpEmoResConfig) {
            String str = warmingUpEmoResConfig.poke_sticker_svga_bixin;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = warmingUpEmoResConfig.poke_sticker_svga_dk;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = warmingUpEmoResConfig.poke_sticker_svga_dx;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = warmingUpEmoResConfig.poke_sticker_svga_jy;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = warmingUpEmoResConfig.poke_sticker_svga_wanan;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = warmingUpEmoResConfig.poke_sticker_svga_zaima;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            ((MessageNano) warmingUpEmoResConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WarmingUpEmoResConfig m16309parse(nb5 nb5Var) throws IOException {
            WarmingUpEmoResConfig warmingUpEmoResConfig = new WarmingUpEmoResConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (warmingUpEmoResConfig.poke_sticker_svga_bixin == null) {
                        warmingUpEmoResConfig.poke_sticker_svga_bixin = "";
                    }
                    if (warmingUpEmoResConfig.poke_sticker_svga_dk == null) {
                        warmingUpEmoResConfig.poke_sticker_svga_dk = "";
                    }
                    if (warmingUpEmoResConfig.poke_sticker_svga_dx == null) {
                        warmingUpEmoResConfig.poke_sticker_svga_dx = "";
                    }
                    if (warmingUpEmoResConfig.poke_sticker_svga_jy == null) {
                        warmingUpEmoResConfig.poke_sticker_svga_jy = "";
                    }
                    if (warmingUpEmoResConfig.poke_sticker_svga_wanan == null) {
                        warmingUpEmoResConfig.poke_sticker_svga_wanan = "";
                    }
                    if (warmingUpEmoResConfig.poke_sticker_svga_zaima != null) {
                        break;
                    }
                    warmingUpEmoResConfig.poke_sticker_svga_zaima = "";
                    break;
                }
                if (iU == 10) {
                    warmingUpEmoResConfig.poke_sticker_svga_bixin = nb5Var.s();
                } else if (iU == 18) {
                    warmingUpEmoResConfig.poke_sticker_svga_dk = nb5Var.s();
                } else if (iU == 26) {
                    warmingUpEmoResConfig.poke_sticker_svga_dx = nb5Var.s();
                } else if (iU == 34) {
                    warmingUpEmoResConfig.poke_sticker_svga_jy = nb5Var.s();
                } else if (iU == 42) {
                    warmingUpEmoResConfig.poke_sticker_svga_wanan = nb5Var.s();
                } else {
                    if (iU != 50) {
                        if (warmingUpEmoResConfig.poke_sticker_svga_bixin == null) {
                            warmingUpEmoResConfig.poke_sticker_svga_bixin = "";
                        }
                        if (warmingUpEmoResConfig.poke_sticker_svga_dk == null) {
                            warmingUpEmoResConfig.poke_sticker_svga_dk = "";
                        }
                        if (warmingUpEmoResConfig.poke_sticker_svga_dx == null) {
                            warmingUpEmoResConfig.poke_sticker_svga_dx = "";
                        }
                        if (warmingUpEmoResConfig.poke_sticker_svga_jy == null) {
                            warmingUpEmoResConfig.poke_sticker_svga_jy = "";
                        }
                        if (warmingUpEmoResConfig.poke_sticker_svga_wanan == null) {
                            warmingUpEmoResConfig.poke_sticker_svga_wanan = "";
                        }
                        if (warmingUpEmoResConfig.poke_sticker_svga_zaima != null) {
                            break;
                        }
                        warmingUpEmoResConfig.poke_sticker_svga_zaima = "";
                        return warmingUpEmoResConfig;
                    }
                    warmingUpEmoResConfig.poke_sticker_svga_zaima = nb5Var.s();
                }
            }
            return warmingUpEmoResConfig;
        }

        public void serialize(WarmingUpEmoResConfig warmingUpEmoResConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = warmingUpEmoResConfig.poke_sticker_svga_bixin;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = warmingUpEmoResConfig.poke_sticker_svga_dk;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = warmingUpEmoResConfig.poke_sticker_svga_dx;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = warmingUpEmoResConfig.poke_sticker_svga_jy;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = warmingUpEmoResConfig.poke_sticker_svga_wanan;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = warmingUpEmoResConfig.poke_sticker_svga_zaima;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
        }
    };
    public static JsonAdapter<WarmingUpEmoResConfig> JSON_ADAPTER = new ObjectJsonAdapter<WarmingUpEmoResConfig>() { // from class: com.p1.mobile.putong.core.data.WarmingUpEmoResConfig.2
        public Class getDataClass() {
            return WarmingUpEmoResConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WarmingUpEmoResConfig m16310newInstance() {
            return new WarmingUpEmoResConfig();
        }

        public boolean parseField(WarmingUpEmoResConfig warmingUpEmoResConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "poke_sticker_svga_bixin":
                    warmingUpEmoResConfig.poke_sticker_svga_bixin = jsonParser.getValueAsString();
                    return true;
                case "poke_sticker_svga_wanan":
                    warmingUpEmoResConfig.poke_sticker_svga_wanan = jsonParser.getValueAsString();
                    return true;
                case "poke_sticker_svga_zaima":
                    warmingUpEmoResConfig.poke_sticker_svga_zaima = jsonParser.getValueAsString();
                    return true;
                case "poke_sticker_svga_dk":
                    warmingUpEmoResConfig.poke_sticker_svga_dk = jsonParser.getValueAsString();
                    return true;
                case "poke_sticker_svga_dx":
                    warmingUpEmoResConfig.poke_sticker_svga_dx = jsonParser.getValueAsString();
                    return true;
                case "poke_sticker_svga_jy":
                    warmingUpEmoResConfig.poke_sticker_svga_jy = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WarmingUpEmoResConfig warmingUpEmoResConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "poke_sticker_svga_bixin":
                case "poke_sticker_svga_wanan":
                case "poke_sticker_svga_zaima":
                case "poke_sticker_svga_dk":
                case "poke_sticker_svga_dx":
                case "poke_sticker_svga_jy":
                    return true;
                default:
                    return super.parseFieldCheck(warmingUpEmoResConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(WarmingUpEmoResConfig warmingUpEmoResConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = warmingUpEmoResConfig.poke_sticker_svga_bixin;
            if (str != null) {
                jsonGenerator.writeStringField("poke_sticker_svga_bixin", str);
            }
            String str2 = warmingUpEmoResConfig.poke_sticker_svga_dk;
            if (str2 != null) {
                jsonGenerator.writeStringField("poke_sticker_svga_dk", str2);
            }
            String str3 = warmingUpEmoResConfig.poke_sticker_svga_dx;
            if (str3 != null) {
                jsonGenerator.writeStringField("poke_sticker_svga_dx", str3);
            }
            String str4 = warmingUpEmoResConfig.poke_sticker_svga_jy;
            if (str4 != null) {
                jsonGenerator.writeStringField("poke_sticker_svga_jy", str4);
            }
            String str5 = warmingUpEmoResConfig.poke_sticker_svga_wanan;
            if (str5 != null) {
                jsonGenerator.writeStringField("poke_sticker_svga_wanan", str5);
            }
            String str6 = warmingUpEmoResConfig.poke_sticker_svga_zaima;
            if (str6 != null) {
                jsonGenerator.writeStringField("poke_sticker_svga_zaima", str6);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WarmingUpEmoResConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WarmingUpEmoResConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WarmingUpEmoResConfig new_() {
        WarmingUpEmoResConfig warmingUpEmoResConfig = new WarmingUpEmoResConfig();
        warmingUpEmoResConfig.nullCheck();
        return warmingUpEmoResConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WarmingUpEmoResConfig m16308clone() {
        WarmingUpEmoResConfig warmingUpEmoResConfig = new WarmingUpEmoResConfig();
        warmingUpEmoResConfig.poke_sticker_svga_bixin = this.poke_sticker_svga_bixin;
        warmingUpEmoResConfig.poke_sticker_svga_dk = this.poke_sticker_svga_dk;
        warmingUpEmoResConfig.poke_sticker_svga_dx = this.poke_sticker_svga_dx;
        warmingUpEmoResConfig.poke_sticker_svga_jy = this.poke_sticker_svga_jy;
        warmingUpEmoResConfig.poke_sticker_svga_wanan = this.poke_sticker_svga_wanan;
        warmingUpEmoResConfig.poke_sticker_svga_zaima = this.poke_sticker_svga_zaima;
        return warmingUpEmoResConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WarmingUpEmoResConfig)) {
            return false;
        }
        WarmingUpEmoResConfig warmingUpEmoResConfig = (WarmingUpEmoResConfig) obj;
        return ValueObject.util_equals(this.poke_sticker_svga_bixin, warmingUpEmoResConfig.poke_sticker_svga_bixin) && ValueObject.util_equals(this.poke_sticker_svga_dk, warmingUpEmoResConfig.poke_sticker_svga_dk) && ValueObject.util_equals(this.poke_sticker_svga_dx, warmingUpEmoResConfig.poke_sticker_svga_dx) && ValueObject.util_equals(this.poke_sticker_svga_jy, warmingUpEmoResConfig.poke_sticker_svga_jy) && ValueObject.util_equals(this.poke_sticker_svga_wanan, warmingUpEmoResConfig.poke_sticker_svga_wanan) && ValueObject.util_equals(this.poke_sticker_svga_zaima, warmingUpEmoResConfig.poke_sticker_svga_zaima);
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
        String str = this.poke_sticker_svga_bixin;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.poke_sticker_svga_dk;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.poke_sticker_svga_dx;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.poke_sticker_svga_jy;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.poke_sticker_svga_wanan;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.poke_sticker_svga_zaima;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.poke_sticker_svga_bixin == null) {
            this.poke_sticker_svga_bixin = "";
        }
        if (this.poke_sticker_svga_dk == null) {
            this.poke_sticker_svga_dk = "";
        }
        if (this.poke_sticker_svga_dx == null) {
            this.poke_sticker_svga_dx = "";
        }
        if (this.poke_sticker_svga_jy == null) {
            this.poke_sticker_svga_jy = "";
        }
        if (this.poke_sticker_svga_wanan == null) {
            this.poke_sticker_svga_wanan = "";
        }
        if (this.poke_sticker_svga_zaima == null) {
            this.poke_sticker_svga_zaima = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
