package com.p000p1.mobile.putong.core.data;

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
public class MatchInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchinfo";

    @ProtobufIndex(index = 1)
    public int todayMatchCount;
    public static ProtobufAdapter<MatchInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchInfo>() { // from class: com.p1.mobile.putong.core.data.MatchInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MatchInfo matchInfo) {
            int iH = CodedOutputByteBufferNano.h(1, matchInfo.todayMatchCount);
            ((MessageNano) matchInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MatchInfo m14065parse(nb5 nb5Var) throws IOException {
            MatchInfo matchInfo = new MatchInfo();
            while (nb5Var.u() == 8) {
                matchInfo.todayMatchCount = nb5Var.j();
            }
            return matchInfo;
        }

        public void serialize(MatchInfo matchInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, matchInfo.todayMatchCount);
        }
    };
    public static JsonAdapter<MatchInfo> JSON_ADAPTER = new ObjectJsonAdapter<MatchInfo>() { // from class: com.p1.mobile.putong.core.data.MatchInfo.2
        public Class getDataClass() {
            return MatchInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MatchInfo m14066newInstance() {
            return new MatchInfo();
        }

        public boolean parseField(MatchInfo matchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("todayMatchCount")) {
                return false;
            }
            matchInfo.todayMatchCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MatchInfo matchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("todayMatchCount")) {
                return true;
            }
            return super.parseFieldCheck(matchInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MatchInfo matchInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("todayMatchCount", matchInfo.todayMatchCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchInfo new_() {
        MatchInfo matchInfo = new MatchInfo();
        matchInfo.nullCheck();
        return matchInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MatchInfo m14064clone() {
        MatchInfo matchInfo = new MatchInfo();
        matchInfo.todayMatchCount = this.todayMatchCount;
        return matchInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MatchInfo) && this.todayMatchCount == ((MatchInfo) obj).todayMatchCount;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.todayMatchCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
