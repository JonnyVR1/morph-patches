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
public class RedPacketInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacketinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<RedPacketInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacketInfo>() { // from class: com.p1.mobile.putong.core.data.RedPacketInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RedPacketInfo redPacketInfo) {
            String str = redPacketInfo.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) redPacketInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RedPacketInfo m15339parse(nb5 nb5Var) throws IOException {
            RedPacketInfo redPacketInfo = new RedPacketInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (redPacketInfo.title != null) {
                        break;
                    }
                    redPacketInfo.title = "";
                    break;
                }
                if (iU != 10) {
                    if (redPacketInfo.title != null) {
                        break;
                    }
                    redPacketInfo.title = "";
                    return redPacketInfo;
                }
                redPacketInfo.title = nb5Var.s();
            }
            return redPacketInfo;
        }

        public void serialize(RedPacketInfo redPacketInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacketInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<RedPacketInfo> JSON_ADAPTER = new ObjectJsonAdapter<RedPacketInfo>() { // from class: com.p1.mobile.putong.core.data.RedPacketInfo.2
        public Class getDataClass() {
            return RedPacketInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RedPacketInfo m15340newInstance() {
            return new RedPacketInfo();
        }

        public boolean parseField(RedPacketInfo redPacketInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            redPacketInfo.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(RedPacketInfo redPacketInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(redPacketInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RedPacketInfo redPacketInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacketInfo.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacketInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacketInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacketInfo new_() {
        RedPacketInfo redPacketInfo = new RedPacketInfo();
        redPacketInfo.nullCheck();
        return redPacketInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RedPacketInfo m15338clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
