package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class LoveLetterGroupInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovelettergroupinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public LoveLetterGroupState state;
    public static ProtobufAdapter<LoveLetterGroupInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveLetterGroupInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterGroupInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveLetterGroupInfo loveLetterGroupInfo) {
            LoveLetterGroupState loveLetterGroupState = loveLetterGroupInfo.state;
            int iM17285l = loveLetterGroupState != null ? CodedOutputByteBufferNano.m17285l(1, loveLetterGroupState, LoveLetterGroupState.PROTOBUF_ADAPTER) : 0;
            loveLetterGroupInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveLetterGroupInfo parse(nc5 nc5Var) throws IOException {
            LoveLetterGroupInfo loveLetterGroupInfo = new LoveLetterGroupInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (loveLetterGroupInfo.state != null) {
                        break;
                    }
                    loveLetterGroupInfo.state = (LoveLetterGroupState) LoveLetterGroupState.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u != 10) {
                    if (loveLetterGroupInfo.state != null) {
                        break;
                    }
                    loveLetterGroupInfo.state = (LoveLetterGroupState) LoveLetterGroupState.JSON_ADAPTER.defaultEnum();
                    return loveLetterGroupInfo;
                }
                loveLetterGroupInfo.state = (LoveLetterGroupState) nc5Var.m162488l(LoveLetterGroupState.PROTOBUF_ADAPTER);
            }
            return loveLetterGroupInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveLetterGroupInfo loveLetterGroupInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LoveLetterGroupState loveLetterGroupState = loveLetterGroupInfo.state;
            if (loveLetterGroupState != null) {
                codedOutputByteBufferNano.m17309K(1, loveLetterGroupState, LoveLetterGroupState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LoveLetterGroupInfo> JSON_ADAPTER = new ObjectJsonAdapter<LoveLetterGroupInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterGroupInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveLetterGroupInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveLetterGroupInfo newInstance() {
            return new LoveLetterGroupInfo();
        }

        public boolean parseField(LoveLetterGroupInfo loveLetterGroupInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("state")) {
                return false;
            }
            loveLetterGroupInfo.state = LoveLetterGroupState.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(LoveLetterGroupInfo loveLetterGroupInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("state")) {
                return true;
            }
            return super.parseFieldCheck(loveLetterGroupInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LoveLetterGroupInfo loveLetterGroupInfo, JsonGenerator jsonGenerator) throws IOException {
            if (loveLetterGroupInfo.state != null) {
                jsonGenerator.writeFieldName("state");
                LoveLetterGroupState.JSON_ADAPTER.serialize(loveLetterGroupInfo.state, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveLetterGroupInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveLetterGroupInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveLetterGroupInfo new_() {
        LoveLetterGroupInfo loveLetterGroupInfo = new LoveLetterGroupInfo();
        loveLetterGroupInfo.nullCheck();
        return loveLetterGroupInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveLetterGroupInfo mo225055clone() {
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
        LoveLetterGroupState loveLetterGroupState = this.state;
        int iHashCode = i2 + (loveLetterGroupState != null ? loveLetterGroupState.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.state == null) {
            this.state = (LoveLetterGroupState) LoveLetterGroupState.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
