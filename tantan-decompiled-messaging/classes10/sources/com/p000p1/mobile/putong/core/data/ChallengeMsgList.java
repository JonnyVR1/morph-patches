package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChallengeMsg;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChallengeMsgList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "challengemsglist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ChallengeMsg> msgData;
    public static ProtobufAdapter<ChallengeMsgList> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChallengeMsgList>() { // from class: com.p1.mobile.putong.core.data.ChallengeMsgList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChallengeMsgList challengeMsgList) {
            List<ChallengeMsg> list = challengeMsgList.msgData;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ChallengeMsg.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) challengeMsgList).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChallengeMsgList m11953parse(nb5 nb5Var) throws IOException {
            ChallengeMsgList challengeMsgList = new ChallengeMsgList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (challengeMsgList.msgData != null) {
                        break;
                    }
                    challengeMsgList.msgData = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (challengeMsgList.msgData != null) {
                        break;
                    }
                    challengeMsgList.msgData = new ArrayList();
                    return challengeMsgList;
                }
                challengeMsgList.msgData = (List) nb5Var.l(ChallengeMsg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return challengeMsgList;
        }

        public void serialize(ChallengeMsgList challengeMsgList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ChallengeMsg> list = challengeMsgList.msgData;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ChallengeMsg.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChallengeMsgList> JSON_ADAPTER = new ObjectJsonAdapter<ChallengeMsgList>() { // from class: com.p1.mobile.putong.core.data.ChallengeMsgList.2
        public Class getDataClass() {
            return ChallengeMsgList.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChallengeMsgList m11954newInstance() {
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

        public void serializeFields(ChallengeMsgList challengeMsgList, JsonGenerator jsonGenerator) throws IOException {
            if (challengeMsgList.msgData != null) {
                jsonGenerator.writeFieldName("msgData");
                JsonAdapter.serializeArray(challengeMsgList.msgData, jsonGenerator, ChallengeMsg.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChallengeMsgList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

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
            return (ChallengeMsgList) JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return new_();
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChallengeMsgList m11952clone() {
        ChallengeMsgList challengeMsgList = new ChallengeMsgList();
        List<ChallengeMsg> list = this.msgData;
        if (list != null) {
            challengeMsgList.msgData = ValueObject.util_map(list, new w9j() { // from class: l.ar4
                public final Object call(Object obj) {
                    return ((ChallengeMsg) obj).m11948clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<ChallengeMsg> list = this.msgData;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.msgData == null) {
            this.msgData = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
