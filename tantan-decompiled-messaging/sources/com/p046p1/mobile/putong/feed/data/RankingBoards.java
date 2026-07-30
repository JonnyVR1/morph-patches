package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.RankingBoard;
import com.p046p1.mobile.putong.feed.data.RankingTopic;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class RankingBoards extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rankingboards";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<RankingBoard> boards;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<RankingTopic> topics;
    public static ProtobufAdapter<RankingBoards> PROTOBUF_ADAPTER = new MessageNanoAdapter<RankingBoards>() { // from class: com.p1.mobile.putong.feed.data.RankingBoards.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RankingBoards rankingBoards) {
            List<RankingBoard> list = rankingBoards.boards;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, RankingBoard.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<RankingTopic> list2 = rankingBoards.topics;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            rankingBoards.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RankingBoards parse(nb5 nb5Var) throws IOException {
            RankingBoards rankingBoards = new RankingBoards();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (rankingBoards.boards == null) {
                        rankingBoards.boards = new ArrayList();
                    }
                    if (rankingBoards.topics != null) {
                        break;
                    }
                    rankingBoards.topics = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    rankingBoards.boards = (List) nb5Var.m158743l(RankingBoard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (rankingBoards.boards == null) {
                            rankingBoards.boards = new ArrayList();
                        }
                        if (rankingBoards.topics != null) {
                            break;
                        }
                        rankingBoards.topics = new ArrayList();
                        return rankingBoards;
                    }
                    rankingBoards.topics = (List) nb5Var.m158743l(RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return rankingBoards;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RankingBoards rankingBoards, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<RankingBoard> list = rankingBoards.boards;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, RankingBoard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<RankingTopic> list2 = rankingBoards.topics;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RankingBoards> JSON_ADAPTER = new ObjectJsonAdapter<RankingBoards>() { // from class: com.p1.mobile.putong.feed.data.RankingBoards.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RankingBoards.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RankingBoards newInstance() {
            return new RankingBoards();
        }

        public boolean parseField(RankingBoards rankingBoards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("boards")) {
                rankingBoards.boards = JsonAdapter.parseArray(jsonParser, RankingBoard.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("topics")) {
                return false;
            }
            rankingBoards.topics = JsonAdapter.parseArray(jsonParser, RankingTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RankingBoards rankingBoards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("boards") || str.equals("topics")) {
                return true;
            }
            return super.parseFieldCheck(rankingBoards, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RankingBoards rankingBoards, JsonGenerator jsonGenerator) throws IOException {
            if (rankingBoards.boards != null) {
                jsonGenerator.writeFieldName("boards");
                JsonAdapter.serializeArray(rankingBoards.boards, jsonGenerator, RankingBoard.JSON_ADAPTER);
            }
            if (rankingBoards.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(rankingBoards.topics, jsonGenerator, RankingTopic.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RankingBoards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RankingBoards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RankingBoards new_() {
        RankingBoards rankingBoards = new RankingBoards();
        rankingBoards.nullCheck();
        return rankingBoards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RankingBoards mo223809clone() {
        RankingBoards rankingBoards = new RankingBoards();
        List<RankingBoard> list = this.boards;
        if (list != null) {
            rankingBoards.boards = ValueObject.util_map(list, new w9j() { // from class: l.lcc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RankingBoard) obj).mo223809clone();
                }
            });
        }
        List<RankingTopic> list2 = this.topics;
        if (list2 != null) {
            rankingBoards.topics = ValueObject.util_map(list2, new w9j() { // from class: l.ncc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RankingTopic) obj).mo223809clone();
                }
            });
        }
        return rankingBoards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RankingBoards)) {
            return false;
        }
        RankingBoards rankingBoards = (RankingBoards) obj;
        return ValueObject.util_equals(this.boards, rankingBoards.boards) && ValueObject.util_equals(this.topics, rankingBoards.topics);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "rankingboards";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<RankingBoard> list = this.boards;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<RankingTopic> list2 = this.topics;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.boards == null) {
            this.boards = new ArrayList();
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
