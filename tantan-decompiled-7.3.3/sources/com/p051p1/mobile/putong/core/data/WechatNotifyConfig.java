package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class WechatNotifyConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wechatnotifyconfig";

    @ProtobufIndex(index = 2)
    public int banner_daily_count;

    @ProtobufIndex(index = 3)
    public int banner_days_count;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 4)
    public int message_daily_count;

    @ProtobufIndex(index = 5)
    public int message_total_count;

    @ProtobufIndex(index = 6)
    public int popup_interval_hours;

    @ProtobufIndex(index = 7)
    public int popup_total_count;
    public static ProtobufAdapter<WechatNotifyConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WechatNotifyConfig>() { // from class: com.p1.mobile.putong.core.data.WechatNotifyConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WechatNotifyConfig wechatNotifyConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, wechatNotifyConfig.enable) + CodedOutputByteBufferNano.m17281h(2, wechatNotifyConfig.banner_daily_count) + CodedOutputByteBufferNano.m17281h(3, wechatNotifyConfig.banner_days_count) + CodedOutputByteBufferNano.m17281h(4, wechatNotifyConfig.message_daily_count) + CodedOutputByteBufferNano.m17281h(5, wechatNotifyConfig.message_total_count) + CodedOutputByteBufferNano.m17281h(6, wechatNotifyConfig.popup_interval_hours) + CodedOutputByteBufferNano.m17281h(7, wechatNotifyConfig.popup_total_count);
            wechatNotifyConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WechatNotifyConfig parse(nc5 nc5Var) throws IOException {
            WechatNotifyConfig wechatNotifyConfig = new WechatNotifyConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    wechatNotifyConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    wechatNotifyConfig.banner_daily_count = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    wechatNotifyConfig.banner_days_count = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    wechatNotifyConfig.message_daily_count = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    wechatNotifyConfig.message_total_count = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    wechatNotifyConfig.popup_interval_hours = nc5Var.m162486j();
                } else {
                    if (iM162497u != 56) {
                        return wechatNotifyConfig;
                    }
                    wechatNotifyConfig.popup_total_count = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WechatNotifyConfig wechatNotifyConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, wechatNotifyConfig.enable);
            codedOutputByteBufferNano.m17305G(2, wechatNotifyConfig.banner_daily_count);
            codedOutputByteBufferNano.m17305G(3, wechatNotifyConfig.banner_days_count);
            codedOutputByteBufferNano.m17305G(4, wechatNotifyConfig.message_daily_count);
            codedOutputByteBufferNano.m17305G(5, wechatNotifyConfig.message_total_count);
            codedOutputByteBufferNano.m17305G(6, wechatNotifyConfig.popup_interval_hours);
            codedOutputByteBufferNano.m17305G(7, wechatNotifyConfig.popup_total_count);
        }
    };
    public static JsonAdapter<WechatNotifyConfig> JSON_ADAPTER = new ObjectJsonAdapter<WechatNotifyConfig>() { // from class: com.p1.mobile.putong.core.data.WechatNotifyConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WechatNotifyConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WechatNotifyConfig newInstance() {
            return new WechatNotifyConfig();
        }

        public boolean parseField(WechatNotifyConfig wechatNotifyConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "banner_daily_count":
                    wechatNotifyConfig.banner_daily_count = jsonParser.getValueAsInt();
                    return true;
                case "message_daily_count":
                    wechatNotifyConfig.message_daily_count = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    wechatNotifyConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "popup_total_count":
                    wechatNotifyConfig.popup_total_count = jsonParser.getValueAsInt();
                    return true;
                case "banner_days_count":
                    wechatNotifyConfig.banner_days_count = jsonParser.getValueAsInt();
                    return true;
                case "popup_interval_hours":
                    wechatNotifyConfig.popup_interval_hours = jsonParser.getValueAsInt();
                    return true;
                case "message_total_count":
                    wechatNotifyConfig.message_total_count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WechatNotifyConfig wechatNotifyConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "banner_daily_count":
                case "message_daily_count":
                case "enable":
                case "popup_total_count":
                case "banner_days_count":
                case "popup_interval_hours":
                case "message_total_count":
                    return true;
                default:
                    return super.parseFieldCheck(wechatNotifyConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WechatNotifyConfig wechatNotifyConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", wechatNotifyConfig.enable);
            jsonGenerator.writeNumberField("banner_daily_count", wechatNotifyConfig.banner_daily_count);
            jsonGenerator.writeNumberField("banner_days_count", wechatNotifyConfig.banner_days_count);
            jsonGenerator.writeNumberField("message_daily_count", wechatNotifyConfig.message_daily_count);
            jsonGenerator.writeNumberField("message_total_count", wechatNotifyConfig.message_total_count);
            jsonGenerator.writeNumberField("popup_interval_hours", wechatNotifyConfig.popup_interval_hours);
            jsonGenerator.writeNumberField("popup_total_count", wechatNotifyConfig.popup_total_count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WechatNotifyConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WechatNotifyConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WechatNotifyConfig new_() {
        WechatNotifyConfig wechatNotifyConfig = new WechatNotifyConfig();
        wechatNotifyConfig.nullCheck();
        return wechatNotifyConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WechatNotifyConfig mo225055clone() {
        WechatNotifyConfig wechatNotifyConfig = new WechatNotifyConfig();
        wechatNotifyConfig.enable = this.enable;
        wechatNotifyConfig.banner_daily_count = this.banner_daily_count;
        wechatNotifyConfig.banner_days_count = this.banner_days_count;
        wechatNotifyConfig.message_daily_count = this.message_daily_count;
        wechatNotifyConfig.message_total_count = this.message_total_count;
        wechatNotifyConfig.popup_interval_hours = this.popup_interval_hours;
        wechatNotifyConfig.popup_total_count = this.popup_total_count;
        return wechatNotifyConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WechatNotifyConfig)) {
            return false;
        }
        WechatNotifyConfig wechatNotifyConfig = (WechatNotifyConfig) obj;
        return this.enable == wechatNotifyConfig.enable && this.banner_daily_count == wechatNotifyConfig.banner_daily_count && this.banner_days_count == wechatNotifyConfig.banner_days_count && this.message_daily_count == wechatNotifyConfig.message_daily_count && this.message_total_count == wechatNotifyConfig.message_total_count && this.popup_interval_hours == wechatNotifyConfig.popup_interval_hours && this.popup_total_count == wechatNotifyConfig.popup_total_count;
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
        int i2 = (((((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.banner_daily_count) * 41) + this.banner_days_count) * 41) + this.message_daily_count) * 41) + this.message_total_count) * 41) + this.popup_interval_hours) * 41) + this.popup_total_count;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
