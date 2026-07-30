package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class WechatNotifySetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wechatnotifysetting";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int msgCnt;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public WechatMicroProgramLaunchInfo wechatLaunch;
    public static ProtobufAdapter<WechatNotifySetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<WechatNotifySetting>() { // from class: com.p1.mobile.putong.core.data.WechatNotifySetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WechatNotifySetting wechatNotifySetting) {
            int iB = CodedOutputByteBufferNano.b(1, wechatNotifySetting.enable) + CodedOutputByteBufferNano.h(2, wechatNotifySetting.msgCnt);
            WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = wechatNotifySetting.wechatLaunch;
            if (wechatMicroProgramLaunchInfo != null) {
                iB += CodedOutputByteBufferNano.l(3, wechatMicroProgramLaunchInfo, WechatMicroProgramLaunchInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) wechatNotifySetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WechatNotifySetting m16333parse(nb5 nb5Var) throws IOException {
            WechatNotifySetting wechatNotifySetting = new WechatNotifySetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    wechatNotifySetting.enable = nb5Var.g();
                } else if (iU == 16) {
                    wechatNotifySetting.msgCnt = nb5Var.j();
                } else {
                    if (iU != 26) {
                        return wechatNotifySetting;
                    }
                    wechatNotifySetting.wechatLaunch = (WechatMicroProgramLaunchInfo) nb5Var.l(WechatMicroProgramLaunchInfo.PROTOBUF_ADAPTER);
                }
            }
        }

        public void serialize(WechatNotifySetting wechatNotifySetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, wechatNotifySetting.enable);
            codedOutputByteBufferNano.G(2, wechatNotifySetting.msgCnt);
            WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = wechatNotifySetting.wechatLaunch;
            if (wechatMicroProgramLaunchInfo != null) {
                codedOutputByteBufferNano.K(3, wechatMicroProgramLaunchInfo, WechatMicroProgramLaunchInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<WechatNotifySetting> JSON_ADAPTER = new ObjectJsonAdapter<WechatNotifySetting>() { // from class: com.p1.mobile.putong.core.data.WechatNotifySetting.2
        public Class getDataClass() {
            return WechatNotifySetting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WechatNotifySetting m16334newInstance() {
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
                    wechatNotifySetting.wechatLaunch = (WechatMicroProgramLaunchInfo) WechatMicroProgramLaunchInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(WechatNotifySetting wechatNotifySetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", wechatNotifySetting.enable);
            jsonGenerator.writeNumberField("msgCnt", wechatNotifySetting.msgCnt);
            if (wechatNotifySetting.wechatLaunch != null) {
                jsonGenerator.writeFieldName("wechatLaunch");
                WechatMicroProgramLaunchInfo.JSON_ADAPTER.serialize(wechatNotifySetting.wechatLaunch, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WechatNotifySetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WechatNotifySetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WechatNotifySetting new_() {
        WechatNotifySetting wechatNotifySetting = new WechatNotifySetting();
        wechatNotifySetting.nullCheck();
        return wechatNotifySetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WechatNotifySetting m16332clone() {
        WechatNotifySetting wechatNotifySetting = new WechatNotifySetting();
        wechatNotifySetting.enable = this.enable;
        wechatNotifySetting.msgCnt = this.msgCnt;
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = this.wechatLaunch;
        if (wechatMicroProgramLaunchInfo != null) {
            wechatNotifySetting.wechatLaunch = wechatMicroProgramLaunchInfo.m16324clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.msgCnt) * 41;
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = this.wechatLaunch;
        int iHashCode = i2 + (wechatMicroProgramLaunchInfo != null ? wechatMicroProgramLaunchInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
