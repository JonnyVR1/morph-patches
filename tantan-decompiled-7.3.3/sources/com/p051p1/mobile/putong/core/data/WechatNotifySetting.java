package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class WechatNotifySetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wechatnotifysetting";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int msgCnt;

    @Nullable
    @ProtobufIndex(index = 3)
    public WechatMicroProgramLaunchInfo wechatLaunch;
    public static ProtobufAdapter<WechatNotifySetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<WechatNotifySetting>() { // from class: com.p1.mobile.putong.core.data.WechatNotifySetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WechatNotifySetting wechatNotifySetting) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, wechatNotifySetting.enable) + CodedOutputByteBufferNano.m17281h(2, wechatNotifySetting.msgCnt);
            WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = wechatNotifySetting.wechatLaunch;
            if (wechatMicroProgramLaunchInfo != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, wechatMicroProgramLaunchInfo, WechatMicroProgramLaunchInfo.PROTOBUF_ADAPTER);
            }
            wechatNotifySetting.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WechatNotifySetting parse(nc5 nc5Var) throws IOException {
            WechatNotifySetting wechatNotifySetting = new WechatNotifySetting();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    wechatNotifySetting.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    wechatNotifySetting.msgCnt = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        return wechatNotifySetting;
                    }
                    wechatNotifySetting.wechatLaunch = (WechatMicroProgramLaunchInfo) nc5Var.m162488l(WechatMicroProgramLaunchInfo.PROTOBUF_ADAPTER);
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WechatNotifySetting wechatNotifySetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, wechatNotifySetting.enable);
            codedOutputByteBufferNano.m17305G(2, wechatNotifySetting.msgCnt);
            WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = wechatNotifySetting.wechatLaunch;
            if (wechatMicroProgramLaunchInfo != null) {
                codedOutputByteBufferNano.m17309K(3, wechatMicroProgramLaunchInfo, WechatMicroProgramLaunchInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<WechatNotifySetting> JSON_ADAPTER = new ObjectJsonAdapter<WechatNotifySetting>() { // from class: com.p1.mobile.putong.core.data.WechatNotifySetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WechatNotifySetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WechatNotifySetting newInstance() {
            return new WechatNotifySetting();
        }

        public boolean parseField(WechatNotifySetting wechatNotifySetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    wechatNotifySetting.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "msgCnt":
                    wechatNotifySetting.msgCnt = jsonParser.getValueAsInt();
                    return true;
                case "wechatLaunch":
                    wechatNotifySetting.wechatLaunch = WechatMicroProgramLaunchInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WechatNotifySetting wechatNotifySetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "msgCnt":
                case "wechatLaunch":
                    return true;
                default:
                    return super.parseFieldCheck(wechatNotifySetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WechatNotifySetting wechatNotifySetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", wechatNotifySetting.enable);
            jsonGenerator.writeNumberField("msgCnt", wechatNotifySetting.msgCnt);
            if (wechatNotifySetting.wechatLaunch != null) {
                jsonGenerator.writeFieldName("wechatLaunch");
                WechatMicroProgramLaunchInfo.JSON_ADAPTER.serialize(wechatNotifySetting.wechatLaunch, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WechatNotifySetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WechatNotifySetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WechatNotifySetting new_() {
        WechatNotifySetting wechatNotifySetting = new WechatNotifySetting();
        wechatNotifySetting.nullCheck();
        return wechatNotifySetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WechatNotifySetting mo225055clone() {
        WechatNotifySetting wechatNotifySetting = new WechatNotifySetting();
        wechatNotifySetting.enable = this.enable;
        wechatNotifySetting.msgCnt = this.msgCnt;
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = this.wechatLaunch;
        if (wechatMicroProgramLaunchInfo != null) {
            wechatNotifySetting.wechatLaunch = wechatMicroProgramLaunchInfo.mo225055clone();
        }
        return wechatNotifySetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WechatNotifySetting)) {
            return false;
        }
        WechatNotifySetting wechatNotifySetting = (WechatNotifySetting) obj;
        return this.enable == wechatNotifySetting.enable && this.msgCnt == wechatNotifySetting.msgCnt && ValueObject.util_equals(this.wechatLaunch, wechatNotifySetting.wechatLaunch);
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
        int i2 = ((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.msgCnt) * 41;
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = this.wechatLaunch;
        int iHashCode = i2 + (wechatMicroProgramLaunchInfo != null ? wechatMicroProgramLaunchInfo.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
