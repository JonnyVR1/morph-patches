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
public class RedPacketInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacketinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<RedPacketInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacketInfo>() { // from class: com.p1.mobile.putong.core.data.RedPacketInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RedPacketInfo redPacketInfo) {
            String str = redPacketInfo.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            redPacketInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RedPacketInfo parse(nb5 nb5Var) throws IOException {
            RedPacketInfo redPacketInfo = new RedPacketInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (redPacketInfo.title != null) {
                        break;
                    }
                    redPacketInfo.title = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (redPacketInfo.title != null) {
                        break;
                    }
                    redPacketInfo.title = "";
                    return redPacketInfo;
                }
                redPacketInfo.title = nb5Var.m158750s();
            }
            return redPacketInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RedPacketInfo redPacketInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacketInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<RedPacketInfo> JSON_ADAPTER = new ObjectJsonAdapter<RedPacketInfo>() { // from class: com.p1.mobile.putong.core.data.RedPacketInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RedPacketInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RedPacketInfo newInstance() {
            return new RedPacketInfo();
        }

        public boolean parseField(RedPacketInfo redPacketInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("title")) {
                return false;
            }
            redPacketInfo.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RedPacketInfo redPacketInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(redPacketInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RedPacketInfo redPacketInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacketInfo.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacketInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacketInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacketInfo new_() {
        RedPacketInfo redPacketInfo = new RedPacketInfo();
        redPacketInfo.nullCheck();
        return redPacketInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RedPacketInfo mo223809clone() {
        RedPacketInfo redPacketInfo = new RedPacketInfo();
        redPacketInfo.title = this.title;
        return redPacketInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RedPacketInfo) {
            return ValueObject.util_equals(this.title, ((RedPacketInfo) obj).title);
        }
        return false;
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
        String str = this.title;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
