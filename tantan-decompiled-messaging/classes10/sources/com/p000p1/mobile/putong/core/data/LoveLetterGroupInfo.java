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
public class LoveLetterGroupInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovelettergroupinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public LoveLetterGroupState state;
    public static ProtobufAdapter<LoveLetterGroupInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveLetterGroupInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterGroupInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LoveLetterGroupInfo loveLetterGroupInfo) {
            LoveLetterGroupState loveLetterGroupState = loveLetterGroupInfo.state;
            int iL = loveLetterGroupState != null ? CodedOutputByteBufferNano.l(1, loveLetterGroupState, LoveLetterGroupState.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) loveLetterGroupInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LoveLetterGroupInfo m14005parse(nb5 nb5Var) throws IOException {
            LoveLetterGroupInfo loveLetterGroupInfo = new LoveLetterGroupInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (loveLetterGroupInfo.state != null) {
                        break;
                    }
                    loveLetterGroupInfo.state = (LoveLetterGroupState) LoveLetterGroupState.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU != 10) {
                    if (loveLetterGroupInfo.state != null) {
                        break;
                    }
                    loveLetterGroupInfo.state = (LoveLetterGroupState) LoveLetterGroupState.JSON_ADAPTER.defaultEnum();
                    return loveLetterGroupInfo;
                }
                loveLetterGroupInfo.state = (LoveLetterGroupState) nb5Var.l(LoveLetterGroupState.PROTOBUF_ADAPTER);
            }
            return loveLetterGroupInfo;
        }

        public void serialize(LoveLetterGroupInfo loveLetterGroupInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LoveLetterGroupState loveLetterGroupState = loveLetterGroupInfo.state;
            if (loveLetterGroupState != null) {
                codedOutputByteBufferNano.K(1, loveLetterGroupState, LoveLetterGroupState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LoveLetterGroupInfo> JSON_ADAPTER = new ObjectJsonAdapter<LoveLetterGroupInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterGroupInfo.2
        public Class getDataClass() {
            return LoveLetterGroupInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LoveLetterGroupInfo m14006newInstance() {
            return new LoveLetterGroupInfo();
        }

        public boolean parseField(LoveLetterGroupInfo loveLetterGroupInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(MessageChannel.state)) {
                return false;
            }
            loveLetterGroupInfo.state = (LoveLetterGroupState) LoveLetterGroupState.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(LoveLetterGroupInfo loveLetterGroupInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(MessageChannel.state)) {
                return true;
            }
            return super.parseFieldCheck(loveLetterGroupInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LoveLetterGroupInfo loveLetterGroupInfo, JsonGenerator jsonGenerator) throws IOException {
            if (loveLetterGroupInfo.state != null) {
                jsonGenerator.writeFieldName(MessageChannel.state);
                LoveLetterGroupState.JSON_ADAPTER.serialize(loveLetterGroupInfo.state, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveLetterGroupInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveLetterGroupInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveLetterGroupInfo new_() {
        LoveLetterGroupInfo loveLetterGroupInfo = new LoveLetterGroupInfo();
        loveLetterGroupInfo.nullCheck();
        return loveLetterGroupInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LoveLetterGroupInfo m14004clone() {
        LoveLetterGroupInfo loveLetterGroupInfo = new LoveLetterGroupInfo();
        loveLetterGroupInfo.state = this.state;
        return loveLetterGroupInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoveLetterGroupInfo) {
            return ValueObject.util_equals(this.state, ((LoveLetterGroupInfo) obj).state);
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
        LoveLetterGroupState loveLetterGroupState = this.state;
        int iHashCode = i2 + (loveLetterGroupState != null ? loveLetterGroupState.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.state == null) {
            this.state = (LoveLetterGroupState) LoveLetterGroupState.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
