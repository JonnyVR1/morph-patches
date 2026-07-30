package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CityCentreConfig;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class CityCentreConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "citycentreconfig";

    @NonNull
    @ProtobufIndex(index = 5)
    public String city_c_card_svga;

    @ProtobufIndex(index = 6)
    public int city_c_original_price;

    @NonNull
    @ProtobufIndex(index = 3)
    public String city_c_profile_text;

    @ProtobufIndex(index = 2)
    public int city_top_poll_interval;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> quick_reply;

    @ProtobufIndex(index = 1)
    public int refresh_interval_seconds;
    public static ProtobufAdapter<CityCentreConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CityCentreConfig>() { // from class: com.p1.mobile.putong.core.data.CityCentreConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CityCentreConfig cityCentreConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, cityCentreConfig.refresh_interval_seconds) + CodedOutputByteBufferNano.m17281h(2, cityCentreConfig.city_top_poll_interval);
            String str = cityCentreConfig.city_c_profile_text;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            List<String> list = cityCentreConfig.quick_reply;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cityCentreConfig.city_c_card_svga;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(6, cityCentreConfig.city_c_original_price);
            cityCentreConfig.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CityCentreConfig parse(nc5 nc5Var) throws IOException {
            CityCentreConfig cityCentreConfig = new CityCentreConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    cityCentreConfig.refresh_interval_seconds = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    cityCentreConfig.city_top_poll_interval = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    cityCentreConfig.city_c_profile_text = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    cityCentreConfig.quick_reply = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    cityCentreConfig.city_c_card_svga = nc5Var.m162495s();
                } else {
                    if (iM162497u != 48) {
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
                    cityCentreConfig.city_c_original_price = nc5Var.m162486j();
                }
            }
            return cityCentreConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CityCentreConfig cityCentreConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, cityCentreConfig.refresh_interval_seconds);
            codedOutputByteBufferNano.m17305G(2, cityCentreConfig.city_top_poll_interval);
            String str = cityCentreConfig.city_c_profile_text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            List<String> list = cityCentreConfig.quick_reply;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cityCentreConfig.city_c_card_svga;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            codedOutputByteBufferNano.m17305G(6, cityCentreConfig.city_c_original_price);
        }
    };
    public static JsonAdapter<CityCentreConfig> JSON_ADAPTER = new ObjectJsonAdapter<CityCentreConfig>() { // from class: com.p1.mobile.putong.core.data.CityCentreConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CityCentreConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CityCentreConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityCentreConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityCentreConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36282a(String str) {
        return str;
    }

    public static CityCentreConfig new_() {
        CityCentreConfig cityCentreConfig = new CityCentreConfig();
        cityCentreConfig.nullCheck();
        return cityCentreConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CityCentreConfig mo225055clone() {
        CityCentreConfig cityCentreConfig = new CityCentreConfig();
        cityCentreConfig.refresh_interval_seconds = this.refresh_interval_seconds;
        cityCentreConfig.city_top_poll_interval = this.city_top_poll_interval;
        cityCentreConfig.city_c_profile_text = this.city_c_profile_text;
        List<String> list = this.quick_reply;
        if (list != null) {
            cityCentreConfig.quick_reply = ValueObject.util_map(list, new qcj() { // from class: l.i55
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CityCentreConfig.m36282a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
