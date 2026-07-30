package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.HomeTopItemWebConfig;
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
public class HomeTopItemWebConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hometopitemwebconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 4)
    public int priority;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<String> rightItems;

    @ProtobufIndex(index = 6)
    public boolean showDailyRedDot;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String url;
    public static ProtobufAdapter<HomeTopItemWebConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeTopItemWebConfig>() { // from class: com.p1.mobile.putong.core.data.HomeTopItemWebConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HomeTopItemWebConfig homeTopItemWebConfig) {
            int iB = CodedOutputByteBufferNano.b(1, homeTopItemWebConfig.enable);
            String str = homeTopItemWebConfig.title;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = homeTopItemWebConfig.url;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            int iH = iB + CodedOutputByteBufferNano.h(4, homeTopItemWebConfig.priority);
            List<String> list = homeTopItemWebConfig.rightItems;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iB2 = iH + CodedOutputByteBufferNano.b(6, homeTopItemWebConfig.showDailyRedDot);
            ((MessageNano) homeTopItemWebConfig).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HomeTopItemWebConfig m13337parse(nb5 nb5Var) throws IOException {
            HomeTopItemWebConfig homeTopItemWebConfig = new HomeTopItemWebConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (homeTopItemWebConfig.title == null) {
                        homeTopItemWebConfig.title = "";
                    }
                    if (homeTopItemWebConfig.url == null) {
                        homeTopItemWebConfig.url = "";
                    }
                    if (homeTopItemWebConfig.rightItems != null) {
                        break;
                    }
                    homeTopItemWebConfig.rightItems = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    homeTopItemWebConfig.enable = nb5Var.g();
                } else if (iU == 18) {
                    homeTopItemWebConfig.title = nb5Var.s();
                } else if (iU == 26) {
                    homeTopItemWebConfig.url = nb5Var.s();
                } else if (iU == 32) {
                    homeTopItemWebConfig.priority = nb5Var.j();
                } else if (iU == 42) {
                    homeTopItemWebConfig.rightItems = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 48) {
                        if (homeTopItemWebConfig.title == null) {
                            homeTopItemWebConfig.title = "";
                        }
                        if (homeTopItemWebConfig.url == null) {
                            homeTopItemWebConfig.url = "";
                        }
                        if (homeTopItemWebConfig.rightItems != null) {
                            break;
                        }
                        homeTopItemWebConfig.rightItems = new ArrayList();
                        return homeTopItemWebConfig;
                    }
                    homeTopItemWebConfig.showDailyRedDot = nb5Var.g();
                }
            }
            return homeTopItemWebConfig;
        }

        public void serialize(HomeTopItemWebConfig homeTopItemWebConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, homeTopItemWebConfig.enable);
            String str = homeTopItemWebConfig.title;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = homeTopItemWebConfig.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.G(4, homeTopItemWebConfig.priority);
            List<String> list = homeTopItemWebConfig.rightItems;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(6, homeTopItemWebConfig.showDailyRedDot);
        }
    };
    public static JsonAdapter<HomeTopItemWebConfig> JSON_ADAPTER = new ObjectJsonAdapter<HomeTopItemWebConfig>() { // from class: com.p1.mobile.putong.core.data.HomeTopItemWebConfig.2
        public Class getDataClass() {
            return HomeTopItemWebConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HomeTopItemWebConfig m13338newInstance() {
            return new HomeTopItemWebConfig();
        }

        public boolean parseField(HomeTopItemWebConfig homeTopItemWebConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "rightItems":
                    homeTopItemWebConfig.rightItems = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "enable":
                    homeTopItemWebConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "priority":
                    homeTopItemWebConfig.priority = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    homeTopItemWebConfig.url = jsonParser.getValueAsString();
                    return true;
                case "title":
                    homeTopItemWebConfig.title = jsonParser.getValueAsString();
                    return true;
                case "showDailyRedDot":
                    homeTopItemWebConfig.showDailyRedDot = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HomeTopItemWebConfig homeTopItemWebConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "rightItems":
                case "enable":
                case "priority":
                case "url":
                case "title":
                case "showDailyRedDot":
                    return true;
                default:
                    return super.parseFieldCheck(homeTopItemWebConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(HomeTopItemWebConfig homeTopItemWebConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", homeTopItemWebConfig.enable);
            jsonGenerator.writeBooleanField("showDailyRedDot", homeTopItemWebConfig.showDailyRedDot);
            String str = homeTopItemWebConfig.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = homeTopItemWebConfig.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            jsonGenerator.writeNumberField("priority", homeTopItemWebConfig.priority);
            if (homeTopItemWebConfig.rightItems != null) {
                jsonGenerator.writeFieldName("rightItems");
                JsonAdapter.serializeArray(homeTopItemWebConfig.rightItems, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTopItemWebConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeTopItemWebConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m389a(String str) {
        return str;
    }

    public static HomeTopItemWebConfig new_() {
        HomeTopItemWebConfig homeTopItemWebConfig = new HomeTopItemWebConfig();
        homeTopItemWebConfig.nullCheck();
        return homeTopItemWebConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HomeTopItemWebConfig m13336clone() {
        HomeTopItemWebConfig homeTopItemWebConfig = new HomeTopItemWebConfig();
        homeTopItemWebConfig.enable = this.enable;
        homeTopItemWebConfig.showDailyRedDot = this.showDailyRedDot;
        homeTopItemWebConfig.title = this.title;
        homeTopItemWebConfig.url = this.url;
        homeTopItemWebConfig.priority = this.priority;
        List<String> list = this.rightItems;
        if (list != null) {
            homeTopItemWebConfig.rightItems = ValueObject.util_map(list, new w9j() { // from class: l.mdl
                public final Object call(Object obj) {
                    return HomeTopItemWebConfig.m389a((String) obj);
                }
            });
        }
        return homeTopItemWebConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeTopItemWebConfig)) {
            return false;
        }
        HomeTopItemWebConfig homeTopItemWebConfig = (HomeTopItemWebConfig) obj;
        return this.enable == homeTopItemWebConfig.enable && this.showDailyRedDot == homeTopItemWebConfig.showDailyRedDot && ValueObject.util_equals(this.title, homeTopItemWebConfig.title) && ValueObject.util_equals(this.url, homeTopItemWebConfig.url) && this.priority == homeTopItemWebConfig.priority && ValueObject.util_equals(this.rightItems, homeTopItemWebConfig.rightItems);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.showDailyRedDot ? 1231 : 1237)) * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.priority) * 41;
        List<String> list = this.rightItems;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.rightItems == null) {
            this.rightItems = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
