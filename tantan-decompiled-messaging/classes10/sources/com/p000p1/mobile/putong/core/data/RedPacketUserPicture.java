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
public class RedPacketUserPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacketuserpicture";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<RedPacketUserPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacketUserPicture>() { // from class: com.p1.mobile.putong.core.data.RedPacketUserPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RedPacketUserPicture redPacketUserPicture) {
            String str = redPacketUserPicture.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) redPacketUserPicture).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RedPacketUserPicture m15351parse(nb5 nb5Var) throws IOException {
            RedPacketUserPicture redPacketUserPicture = new RedPacketUserPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (redPacketUserPicture.url != null) {
                        break;
                    }
                    redPacketUserPicture.url = "";
                    break;
                }
                if (iU != 10) {
                    if (redPacketUserPicture.url != null) {
                        break;
                    }
                    redPacketUserPicture.url = "";
                    return redPacketUserPicture;
                }
                redPacketUserPicture.url = nb5Var.s();
            }
            return redPacketUserPicture;
        }

        public void serialize(RedPacketUserPicture redPacketUserPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacketUserPicture.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<RedPacketUserPicture> JSON_ADAPTER = new ObjectJsonAdapter<RedPacketUserPicture>() { // from class: com.p1.mobile.putong.core.data.RedPacketUserPicture.2
        public Class getDataClass() {
            return RedPacketUserPicture.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RedPacketUserPicture m15352newInstance() {
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

        public void serializeFields(RedPacketUserPicture redPacketUserPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacketUserPicture.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacketUserPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacketUserPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacketUserPicture new_() {
        RedPacketUserPicture redPacketUserPicture = new RedPacketUserPicture();
        redPacketUserPicture.nullCheck();
        return redPacketUserPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RedPacketUserPicture m15350clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
