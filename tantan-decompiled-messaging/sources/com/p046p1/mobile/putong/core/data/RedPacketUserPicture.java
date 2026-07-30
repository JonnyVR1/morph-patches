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
public class RedPacketUserPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacketuserpicture";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<RedPacketUserPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacketUserPicture>() { // from class: com.p1.mobile.putong.core.data.RedPacketUserPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RedPacketUserPicture redPacketUserPicture) {
            String str = redPacketUserPicture.url;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            redPacketUserPicture.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RedPacketUserPicture parse(nb5 nb5Var) throws IOException {
            RedPacketUserPicture redPacketUserPicture = new RedPacketUserPicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (redPacketUserPicture.url != null) {
                        break;
                    }
                    redPacketUserPicture.url = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (redPacketUserPicture.url != null) {
                        break;
                    }
                    redPacketUserPicture.url = "";
                    return redPacketUserPicture;
                }
                redPacketUserPicture.url = nb5Var.m158750s();
            }
            return redPacketUserPicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RedPacketUserPicture redPacketUserPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacketUserPicture.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<RedPacketUserPicture> JSON_ADAPTER = new ObjectJsonAdapter<RedPacketUserPicture>() { // from class: com.p1.mobile.putong.core.data.RedPacketUserPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RedPacketUserPicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RedPacketUserPicture newInstance() {
            return new RedPacketUserPicture();
        }

        public boolean parseField(RedPacketUserPicture redPacketUserPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("url")) {
                return false;
            }
            redPacketUserPicture.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RedPacketUserPicture redPacketUserPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(redPacketUserPicture, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RedPacketUserPicture redPacketUserPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacketUserPicture.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacketUserPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacketUserPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacketUserPicture new_() {
        RedPacketUserPicture redPacketUserPicture = new RedPacketUserPicture();
        redPacketUserPicture.nullCheck();
        return redPacketUserPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RedPacketUserPicture mo223809clone() {
        RedPacketUserPicture redPacketUserPicture = new RedPacketUserPicture();
        redPacketUserPicture.url = this.url;
        return redPacketUserPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RedPacketUserPicture) {
            return ValueObject.util_equals(this.url, ((RedPacketUserPicture) obj).url);
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
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
