package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CityCentreConfig;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityCentreConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "citycentreconfig";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String city_c_card_svga;

    @ProtobufIndex(index = 6)
    public int city_c_original_price;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String city_c_profile_text;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int city_top_poll_interval;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> quick_reply;

    @ProtobufIndex(index = 1)
    public int refresh_interval_seconds;
    public static ProtobufAdapter<CityCentreConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CityCentreConfig>() { // from class: com.p1.mobile.putong.core.data.CityCentreConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CityCentreConfig cityCentreConfig) {
            int iH = CodedOutputByteBufferNano.h(1, cityCentreConfig.refresh_interval_seconds) + CodedOutputByteBufferNano.h(2, cityCentreConfig.city_top_poll_interval);
            String str = cityCentreConfig.city_c_profile_text;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            List<String> list = cityCentreConfig.quick_reply;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cityCentreConfig.city_c_card_svga;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(5, str2);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(6, cityCentreConfig.city_c_original_price);
            ((MessageNano) cityCentreConfig).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CityCentreConfig m12189parse(nb5 nb5Var) throws IOException {
            CityCentreConfig cityCentreConfig = new CityCentreConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cityCentreConfig.city_c_profile_text == null) {
                        cityCentreConfig.city_c_profile_text = "";
                    }
                    if (cityCentreConfig.quick_reply == null) {
                        cityCentreConfig.quick_reply = new ArrayList();
                    }
                    if (cityCentreConfig.city_c_card_svga != null) {
                        break;
                    }
                    cityCentreConfig.city_c_card_svga = "";
                    break;
                }
                if (iU == 8) {
                    cityCentreConfig.refresh_interval_seconds = nb5Var.j();
                } else if (iU == 16) {
                    cityCentreConfig.city_top_poll_interval = nb5Var.j();
                } else if (iU == 26) {
                    cityCentreConfig.city_c_profile_text = nb5Var.s();
                } else if (iU == 34) {
                    cityCentreConfig.quick_reply = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    cityCentreConfig.city_c_card_svga = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (cityCentreConfig.city_c_profile_text == null) {
                            cityCentreConfig.city_c_profile_text = "";
                        }
                        if (cityCentreConfig.quick_reply == null) {
                            cityCentreConfig.quick_reply = new ArrayList();
                        }
                        if (cityCentreConfig.city_c_card_svga != null) {
                            break;
                        }
                        cityCentreConfig.city_c_card_svga = "";
                        return cityCentreConfig;
                    }
                    cityCentreConfig.city_c_original_price = nb5Var.j();
                }
            }
            return cityCentreConfig;
        }

        public void serialize(CityCentreConfig cityCentreConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, cityCentreConfig.refresh_interval_seconds);
            codedOutputByteBufferNano.G(2, cityCentreConfig.city_top_poll_interval);
            String str = cityCentreConfig.city_c_profile_text;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            List<String> list = cityCentreConfig.quick_reply;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cityCentreConfig.city_c_card_svga;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            codedOutputByteBufferNano.G(6, cityCentreConfig.city_c_original_price);
        }
    };
    public static JsonAdapter<CityCentreConfig> JSON_ADAPTER = new ObjectJsonAdapter<CityCentreConfig>() { // from class: com.p1.mobile.putong.core.data.CityCentreConfig.2
        public Class getDataClass() {
            return CityCentreConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CityCentreConfig m12190newInstance() {
            return new CityCentreConfig();
        }

        public boolean parseField(CityCentreConfig cityCentreConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "city_top_poll_interval":
                    cityCentreConfig.city_top_poll_interval = jsonParser.getValueAsInt();
                    return true;
                case "city_c_profile_text":
                    cityCentreConfig.city_c_profile_text = jsonParser.getValueAsString();
                    return true;
                case "city_c_original_price":
                    cityCentreConfig.city_c_original_price = jsonParser.getValueAsInt();
                    return true;
                case "refresh_interval_seconds":
                    cityCentreConfig.refresh_interval_seconds = jsonParser.getValueAsInt();
                    return true;
                case "quick_reply":
                    cityCentreConfig.quick_reply = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "city_c_card_svga":
                    cityCentreConfig.city_c_card_svga = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CityCentreConfig cityCentreConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "city_top_poll_interval":
                case "city_c_profile_text":
                case "city_c_original_price":
                case "refresh_interval_seconds":
                case "quick_reply":
                case "city_c_card_svga":
                    return true;
                default:
                    return super.parseFieldCheck(cityCentreConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CityCentreConfig cityCentreConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("refresh_interval_seconds", cityCentreConfig.refresh_interval_seconds);
            jsonGenerator.writeNumberField("city_top_poll_interval", cityCentreConfig.city_top_poll_interval);
            String str = cityCentreConfig.city_c_profile_text;
            if (str != null) {
                jsonGenerator.writeStringField("city_c_profile_text", str);
            }
            if (cityCentreConfig.quick_reply != null) {
                jsonGenerator.writeFieldName("quick_reply");
                JsonAdapter.serializeArray(cityCentreConfig.quick_reply, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = cityCentreConfig.city_c_card_svga;
            if (str2 != null) {
                jsonGenerator.writeStringField("city_c_card_svga", str2);
            }
            jsonGenerator.writeNumberField("city_c_original_price", cityCentreConfig.city_c_original_price);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityCentreConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityCentreConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m81a(String str) {
        return str;
    }

    public static CityCentreConfig new_() {
        CityCentreConfig cityCentreConfig = new CityCentreConfig();
        cityCentreConfig.nullCheck();
        return cityCentreConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CityCentreConfig m12188clone() {
        CityCentreConfig cityCentreConfig = new CityCentreConfig();
        cityCentreConfig.refresh_interval_seconds = this.refresh_interval_seconds;
        cityCentreConfig.city_top_poll_interval = this.city_top_poll_interval;
        cityCentreConfig.city_c_profile_text = this.city_c_profile_text;
        List<String> list = this.quick_reply;
        if (list != null) {
            cityCentreConfig.quick_reply = ValueObject.util_map(list, new w9j() { // from class: l.h45
                public final Object call(Object obj) {
                    return CityCentreConfig.m81a((String) obj);
                }
            });
        }
        cityCentreConfig.city_c_card_svga = this.city_c_card_svga;
        cityCentreConfig.city_c_original_price = this.city_c_original_price;
        return cityCentreConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CityCentreConfig)) {
            return false;
        }
        CityCentreConfig cityCentreConfig = (CityCentreConfig) obj;
        return this.refresh_interval_seconds == cityCentreConfig.refresh_interval_seconds && this.city_top_poll_interval == cityCentreConfig.city_top_poll_interval && ValueObject.util_equals(this.city_c_profile_text, cityCentreConfig.city_c_profile_text) && ValueObject.util_equals(this.quick_reply, cityCentreConfig.quick_reply) && ValueObject.util_equals(this.city_c_card_svga, cityCentreConfig.city_c_card_svga) && this.city_c_original_price == cityCentreConfig.city_c_original_price;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.refresh_interval_seconds) * 41) + this.city_top_poll_interval) * 41;
        String str = this.city_c_profile_text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.quick_reply;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.city_c_card_svga;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.city_c_original_price;
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.city_c_profile_text == null) {
            this.city_c_profile_text = "";
        }
        if (this.quick_reply == null) {
            this.quick_reply = new ArrayList();
        }
        if (this.city_c_card_svga == null) {
            this.city_c_card_svga = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
