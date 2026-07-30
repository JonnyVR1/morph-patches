package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.api.api.Network;
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

/* JADX INFO: loaded from: classes12.dex */
public class LangModel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "langmodel";

    @NonNull
    @ProtobufIndex(index = 2)
    public String en_us;

    @NonNull
    @ProtobufIndex(index = 3)
    public String id_id;

    @NonNull
    @ProtobufIndex(index = 7)
    public String ja_jp;

    @NonNull
    @ProtobufIndex(index = 6)
    public String ko_kr;

    @NonNull
    @ProtobufIndex(index = 5)
    public String th_th;

    @NonNull
    @ProtobufIndex(index = 1)
    public String zh_cn;

    @NonNull
    @ProtobufIndex(index = 4)
    public String zh_tw;
    public static ProtobufAdapter<LangModel> PROTOBUF_ADAPTER = new MessageNanoAdapter<LangModel>() { // from class: com.p1.mobile.putong.data.LangModel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LangModel langModel) {
            String str = langModel.zh_cn;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = langModel.en_us;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = langModel.id_id;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = langModel.zh_tw;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = langModel.th_th;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = langModel.ko_kr;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = langModel.ja_jp;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            langModel.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LangModel parse(nb5 nb5Var) throws IOException {
            LangModel langModel = new LangModel();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (langModel.zh_cn == null) {
                        langModel.zh_cn = "";
                    }
                    if (langModel.en_us == null) {
                        langModel.en_us = "";
                    }
                    if (langModel.id_id == null) {
                        langModel.id_id = "";
                    }
                    if (langModel.zh_tw == null) {
                        langModel.zh_tw = "";
                    }
                    if (langModel.th_th == null) {
                        langModel.th_th = "";
                    }
                    if (langModel.ko_kr == null) {
                        langModel.ko_kr = "";
                    }
                    if (langModel.ja_jp != null) {
                        break;
                    }
                    langModel.ja_jp = "";
                    break;
                }
                if (iM158752u == 10) {
                    langModel.zh_cn = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    langModel.en_us = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    langModel.id_id = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    langModel.zh_tw = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    langModel.th_th = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    langModel.ko_kr = nb5Var.m158750s();
                } else {
                    if (iM158752u != 58) {
                        if (langModel.zh_cn == null) {
                            langModel.zh_cn = "";
                        }
                        if (langModel.en_us == null) {
                            langModel.en_us = "";
                        }
                        if (langModel.id_id == null) {
                            langModel.id_id = "";
                        }
                        if (langModel.zh_tw == null) {
                            langModel.zh_tw = "";
                        }
                        if (langModel.th_th == null) {
                            langModel.th_th = "";
                        }
                        if (langModel.ko_kr == null) {
                            langModel.ko_kr = "";
                        }
                        if (langModel.ja_jp != null) {
                            break;
                        }
                        langModel.ja_jp = "";
                        return langModel;
                    }
                    langModel.ja_jp = nb5Var.m158750s();
                }
            }
            return langModel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LangModel langModel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = langModel.zh_cn;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = langModel.en_us;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = langModel.id_id;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = langModel.zh_tw;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = langModel.th_th;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = langModel.ko_kr;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = langModel.ja_jp;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
        }
    };
    public static JsonAdapter<LangModel> JSON_ADAPTER = new ObjectJsonAdapter<LangModel>() { // from class: com.p1.mobile.putong.data.LangModel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LangModel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LangModel newInstance() {
            return new LangModel();
        }

        public boolean parseField(LangModel langModel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "en_us":
                    langModel.en_us = jsonParser.getValueAsString();
                    return true;
                case "id_id":
                    langModel.id_id = jsonParser.getValueAsString();
                    return true;
                case "ja_jp":
                    langModel.ja_jp = jsonParser.getValueAsString();
                    return true;
                case "ko_kr":
                    langModel.ko_kr = jsonParser.getValueAsString();
                    return true;
                case "th_th":
                    langModel.th_th = jsonParser.getValueAsString();
                    return true;
                case "zh_cn":
                    langModel.zh_cn = jsonParser.getValueAsString();
                    return true;
                case "zh_tw":
                    langModel.zh_tw = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LangModel langModel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "en_us":
                case "id_id":
                case "ja_jp":
                case "ko_kr":
                case "th_th":
                case "zh_cn":
                case "zh_tw":
                    return true;
                default:
                    return super.parseFieldCheck(langModel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LangModel langModel, JsonGenerator jsonGenerator) throws IOException {
            String str = langModel.zh_cn;
            if (str != null) {
                jsonGenerator.writeStringField("zh_cn", str);
            }
            String str2 = langModel.en_us;
            if (str2 != null) {
                jsonGenerator.writeStringField("en_us", str2);
            }
            String str3 = langModel.id_id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id_id", str3);
            }
            String str4 = langModel.zh_tw;
            if (str4 != null) {
                jsonGenerator.writeStringField("zh_tw", str4);
            }
            String str5 = langModel.th_th;
            if (str5 != null) {
                jsonGenerator.writeStringField("th_th", str5);
            }
            String str6 = langModel.ko_kr;
            if (str6 != null) {
                jsonGenerator.writeStringField("ko_kr", str6);
            }
            String str7 = langModel.ja_jp;
            if (str7 != null) {
                jsonGenerator.writeStringField("ja_jp", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LangModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LangModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LangModel new_() {
        LangModel langModel = new LangModel();
        langModel.nullCheck();
        return langModel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LangModel mo223809clone() {
        LangModel langModel = new LangModel();
        langModel.zh_cn = this.zh_cn;
        langModel.en_us = this.en_us;
        langModel.id_id = this.id_id;
        langModel.zh_tw = this.zh_tw;
        langModel.th_th = this.th_th;
        langModel.ko_kr = this.ko_kr;
        langModel.ja_jp = this.ja_jp;
        return langModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LangModel)) {
            return false;
        }
        LangModel langModel = (LangModel) obj;
        return ValueObject.util_equals(this.zh_cn, langModel.zh_cn) && ValueObject.util_equals(this.en_us, langModel.en_us) && ValueObject.util_equals(this.id_id, langModel.id_id) && ValueObject.util_equals(this.zh_tw, langModel.zh_tw) && ValueObject.util_equals(this.th_th, langModel.th_th) && ValueObject.util_equals(this.ko_kr, langModel.ko_kr) && ValueObject.util_equals(this.ja_jp, langModel.ja_jp);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getLocalName() {
        String strLanguage = Network.language();
        if (strLanguage.startsWith("zh")) {
            return Network.LANGUAGE_ZH_HANT.equals(strLanguage) ? this.zh_tw : this.zh_cn;
        }
        if (strLanguage.startsWith("id")) {
            return this.id_id;
        }
        if (strLanguage.startsWith("th")) {
            return this.th_th;
        }
        if (strLanguage.startsWith("ko")) {
            return this.ko_kr;
        }
        return strLanguage.startsWith("ja") ? this.ja_jp : this.en_us;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.zh_cn;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.en_us;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.id_id;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.zh_tw;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.th_th;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.ko_kr;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.ja_jp;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.zh_cn == null) {
            this.zh_cn = "";
        }
        if (this.en_us == null) {
            this.en_us = "";
        }
        if (this.id_id == null) {
            this.id_id = "";
        }
        if (this.zh_tw == null) {
            this.zh_tw = "";
        }
        if (this.th_th == null) {
            this.th_th = "";
        }
        if (this.ko_kr == null) {
            this.ko_kr = "";
        }
        if (this.ja_jp == null) {
            this.ja_jp = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
