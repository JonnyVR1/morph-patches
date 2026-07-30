package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ChallengeMsgList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "challengemsglist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ChallengeMsg> msgData;
    public static ProtobufAdapter<ChallengeMsgList> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChallengeMsgList>() { // from class: com.p1.mobile.putong.core.data.ChallengeMsgList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChallengeMsgList challengeMsgList) {
            List<ChallengeMsg> list = challengeMsgList.msgData;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ChallengeMsg.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            challengeMsgList.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChallengeMsgList parse(nc5 nc5Var) throws IOException {
            ChallengeMsgList challengeMsgList = new ChallengeMsgList();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (challengeMsgList.msgData != null) {
                        break;
                    }
                    challengeMsgList.msgData = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (challengeMsgList.msgData != null) {
                        break;
                    }
                    challengeMsgList.msgData = new ArrayList();
                    return challengeMsgList;
                }
                challengeMsgList.msgData = (List) nc5Var.m162488l(ChallengeMsg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return challengeMsgList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChallengeMsgList challengeMsgList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ChallengeMsg> list = challengeMsgList.msgData;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ChallengeMsg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChallengeMsgList> JSON_ADAPTER = new ObjectJsonAdapter<ChallengeMsgList>() { // from class: com.p1.mobile.putong.core.data.ChallengeMsgList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChallengeMsgList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChallengeMsgList newInstance() {
            return new ChallengeMsgList();
        }

        public boolean parseField(ChallengeMsgList challengeMsgList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("msgData")) {
                return false;
            }
            challengeMsgList.msgData = JsonAdapter.parseArray(jsonParser, ChallengeMsg.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChallengeMsgList challengeMsgList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("msgData")) {
                return true;
            }
            return super.parseFieldCheck(challengeMsgList, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChallengeMsgList challengeMsgList, JsonGenerator jsonGenerator) throws IOException {
            if (challengeMsgList.msgData != null) {
                jsonGenerator.writeFieldName("msgData");
                JsonAdapter.serializeArray(challengeMsgList.msgData, jsonGenerator, ChallengeMsg.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChallengeMsgList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChallengeMsgList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChallengeMsgList new_() {
        ChallengeMsgList challengeMsgList = new ChallengeMsgList();
        challengeMsgList.nullCheck();
        return challengeMsgList;
    }

    public static ChallengeMsgList parse(String str) {
        try {
            return JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChallengeMsgList mo225055clone() {
        ChallengeMsgList challengeMsgList = new ChallengeMsgList();
        List<ChallengeMsg> list = this.msgData;
        if (list != null) {
            challengeMsgList.msgData = ValueObject.util_map(list, new qcj() { // from class: l.zr4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ChallengeMsg) obj).mo225055clone();
                }
            });
        }
        return challengeMsgList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChallengeMsgList) {
            return ValueObject.util_equals(this.msgData, ((ChallengeMsgList) obj).msgData);
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
        List<ChallengeMsg> list = this.msgData;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.msgData == null) {
            this.msgData = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
