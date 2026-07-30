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
public class WechatMicroProgramLaunchInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wechatmicroprogramlaunchinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String path;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userName;
    public static ProtobufAdapter<WechatMicroProgramLaunchInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<WechatMicroProgramLaunchInfo>() { // from class: com.p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo) {
            String str = wechatMicroProgramLaunchInfo.userName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = wechatMicroProgramLaunchInfo.path;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) wechatMicroProgramLaunchInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WechatMicroProgramLaunchInfo m16325parse(nb5 nb5Var) throws IOException {
            WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = new WechatMicroProgramLaunchInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (wechatMicroProgramLaunchInfo.userName == null) {
                        wechatMicroProgramLaunchInfo.userName = "";
                    }
                    if (wechatMicroProgramLaunchInfo.path != null) {
                        break;
                    }
                    wechatMicroProgramLaunchInfo.path = "";
                    break;
                }
                if (iU == 10) {
                    wechatMicroProgramLaunchInfo.userName = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (wechatMicroProgramLaunchInfo.userName == null) {
                            wechatMicroProgramLaunchInfo.userName = "";
                        }
                        if (wechatMicroProgramLaunchInfo.path != null) {
                            break;
                        }
                        wechatMicroProgramLaunchInfo.path = "";
                        return wechatMicroProgramLaunchInfo;
                    }
                    wechatMicroProgramLaunchInfo.path = nb5Var.s();
                }
            }
            return wechatMicroProgramLaunchInfo;
        }

        public void serialize(WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = wechatMicroProgramLaunchInfo.userName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = wechatMicroProgramLaunchInfo.path;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<WechatMicroProgramLaunchInfo> JSON_ADAPTER = new ObjectJsonAdapter<WechatMicroProgramLaunchInfo>() { // from class: com.p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo.2
        public Class getDataClass() {
            return WechatMicroProgramLaunchInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WechatMicroProgramLaunchInfo m16326newInstance() {
            return new WechatMicroProgramLaunchInfo();
        }

        public boolean parseField(WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userName")) {
                wechatMicroProgramLaunchInfo.userName = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("path")) {
                return false;
            }
            wechatMicroProgramLaunchInfo.path = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userName") || str.equals("path")) {
                return true;
            }
            return super.parseFieldCheck(wechatMicroProgramLaunchInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = wechatMicroProgramLaunchInfo.userName;
            if (str != null) {
                jsonGenerator.writeStringField("userName", str);
            }
            String str2 = wechatMicroProgramLaunchInfo.path;
            if (str2 != null) {
                jsonGenerator.writeStringField("path", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WechatMicroProgramLaunchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WechatMicroProgramLaunchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WechatMicroProgramLaunchInfo new_() {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = new WechatMicroProgramLaunchInfo();
        wechatMicroProgramLaunchInfo.nullCheck();
        return wechatMicroProgramLaunchInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WechatMicroProgramLaunchInfo m16324clone() {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = new WechatMicroProgramLaunchInfo();
        wechatMicroProgramLaunchInfo.userName = this.userName;
        wechatMicroProgramLaunchInfo.path = this.path;
        return wechatMicroProgramLaunchInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WechatMicroProgramLaunchInfo)) {
            return false;
        }
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = (WechatMicroProgramLaunchInfo) obj;
        return ValueObject.util_equals(this.userName, wechatMicroProgramLaunchInfo.userName) && ValueObject.util_equals(this.path, wechatMicroProgramLaunchInfo.path);
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
        String str = this.userName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.path;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.path == null) {
            this.path = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
