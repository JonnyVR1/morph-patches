package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class WarmingUpEmoResConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "warmingupemoresconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String poke_sticker_svga_bixin;

    @NonNull
    @ProtobufIndex(index = 2)
    public String poke_sticker_svga_dk;

    @NonNull
    @ProtobufIndex(index = 3)
    public String poke_sticker_svga_dx;

    @NonNull
    @ProtobufIndex(index = 4)
    public String poke_sticker_svga_jy;

    @NonNull
    @ProtobufIndex(index = 5)
    public String poke_sticker_svga_wanan;

    @NonNull
    @ProtobufIndex(index = 6)
    public String poke_sticker_svga_zaima;
    public static ProtobufAdapter<WarmingUpEmoResConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WarmingUpEmoResConfig>() { // from class: com.p1.mobile.putong.core.data.WarmingUpEmoResConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WarmingUpEmoResConfig warmingUpEmoResConfig) {
            String str = warmingUpEmoResConfig.poke_sticker_svga_bixin;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = warmingUpEmoResConfig.poke_sticker_svga_dk;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = warmingUpEmoResConfig.poke_sticker_svga_dx;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = warmingUpEmoResConfig.poke_sticker_svga_jy;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = warmingUpEmoResConfig.poke_sticker_svga_wanan;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = warmingUpEmoResConfig.poke_sticker_svga_zaima;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            warmingUpEmoResConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WarmingUpEmoResConfig parse(nb5 nb5Var) throws IOException {
            WarmingUpEmoResConfig warmingUpEmoResConfig = new WarmingUpEmoResConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    warmingUpEmoResConfig.poke_sticker_svga_bixin = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    warmingUpEmoResConfig.poke_sticker_svga_dk = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    warmingUpEmoResConfig.poke_sticker_svga_dx = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    warmingUpEmoResConfig.poke_sticker_svga_jy = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    warmingUpEmoResConfig.poke_sticker_svga_wanan = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
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
                    warmingUpEmoResConfig.poke_sticker_svga_zaima = nb5Var.m158750s();
                }
            }
            return warmingUpEmoResConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WarmingUpEmoResConfig warmingUpEmoResConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = warmingUpEmoResConfig.poke_sticker_svga_bixin;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = warmingUpEmoResConfig.poke_sticker_svga_dk;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = warmingUpEmoResConfig.poke_sticker_svga_dx;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = warmingUpEmoResConfig.poke_sticker_svga_jy;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = warmingUpEmoResConfig.poke_sticker_svga_wanan;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = warmingUpEmoResConfig.poke_sticker_svga_zaima;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
        }
    };
    public static JsonAdapter<WarmingUpEmoResConfig> JSON_ADAPTER = new ObjectJsonAdapter<WarmingUpEmoResConfig>() { // from class: com.p1.mobile.putong.core.data.WarmingUpEmoResConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WarmingUpEmoResConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WarmingUpEmoResConfig newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WarmingUpEmoResConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WarmingUpEmoResConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WarmingUpEmoResConfig new_() {
        WarmingUpEmoResConfig warmingUpEmoResConfig = new WarmingUpEmoResConfig();
        warmingUpEmoResConfig.nullCheck();
        return warmingUpEmoResConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WarmingUpEmoResConfig mo223809clone() {
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
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
