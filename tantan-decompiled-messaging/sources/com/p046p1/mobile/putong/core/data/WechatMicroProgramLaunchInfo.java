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
public class WechatMicroProgramLaunchInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wechatmicroprogramlaunchinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String path;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userName;
    public static ProtobufAdapter<WechatMicroProgramLaunchInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<WechatMicroProgramLaunchInfo>() { // from class: com.p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo) {
            String str = wechatMicroProgramLaunchInfo.userName;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = wechatMicroProgramLaunchInfo.path;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            wechatMicroProgramLaunchInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WechatMicroProgramLaunchInfo parse(nb5 nb5Var) throws IOException {
            WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = new WechatMicroProgramLaunchInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (wechatMicroProgramLaunchInfo.userName == null) {
                        wechatMicroProgramLaunchInfo.userName = "";
                    }
                    if (wechatMicroProgramLaunchInfo.path != null) {
                        break;
                    }
                    wechatMicroProgramLaunchInfo.path = "";
                    break;
                }
                if (iM158752u == 10) {
                    wechatMicroProgramLaunchInfo.userName = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (wechatMicroProgramLaunchInfo.userName == null) {
                            wechatMicroProgramLaunchInfo.userName = "";
                        }
                        if (wechatMicroProgramLaunchInfo.path != null) {
                            break;
                        }
                        wechatMicroProgramLaunchInfo.path = "";
                        return wechatMicroProgramLaunchInfo;
                    }
                    wechatMicroProgramLaunchInfo.path = nb5Var.m158750s();
                }
            }
            return wechatMicroProgramLaunchInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = wechatMicroProgramLaunchInfo.userName;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = wechatMicroProgramLaunchInfo.path;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<WechatMicroProgramLaunchInfo> JSON_ADAPTER = new ObjectJsonAdapter<WechatMicroProgramLaunchInfo>() { // from class: com.p1.mobile.putong.core.data.WechatMicroProgramLaunchInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WechatMicroProgramLaunchInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WechatMicroProgramLaunchInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WechatMicroProgramLaunchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WechatMicroProgramLaunchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WechatMicroProgramLaunchInfo new_() {
        WechatMicroProgramLaunchInfo wechatMicroProgramLaunchInfo = new WechatMicroProgramLaunchInfo();
        wechatMicroProgramLaunchInfo.nullCheck();
        return wechatMicroProgramLaunchInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WechatMicroProgramLaunchInfo mo223809clone() {
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
        String str = this.userName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.path;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.path == null) {
            this.path = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
