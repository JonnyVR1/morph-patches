package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.RankingBoard;
import com.p051p1.mobile.putong.core.data.RankingTopic;
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
public class RankingBoard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rankingboard";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21227id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> topicIds;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<RankingTopic> topics;
    public static ProtobufAdapter<RankingBoard> PROTOBUF_ADAPTER = new MessageNanoAdapter<RankingBoard>() { // from class: com.p1.mobile.putong.core.data.RankingBoard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RankingBoard rankingBoard) {
            String str = rankingBoard.f21227id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = rankingBoard.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<String> list = rankingBoard.topicIds;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<RankingTopic> list2 = rankingBoard.topics;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list2, RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            rankingBoard.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RankingBoard parse(nc5 nc5Var) throws IOException {
            RankingBoard rankingBoard = new RankingBoard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (rankingBoard.f21227id == null) {
                        rankingBoard.f21227id = "";
                    }
                    if (rankingBoard.name == null) {
                        rankingBoard.name = "";
                    }
                    if (rankingBoard.topicIds == null) {
                        rankingBoard.topicIds = new ArrayList();
                    }
                    if (rankingBoard.topics != null) {
                        break;
                    }
                    rankingBoard.topics = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    rankingBoard.f21227id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    rankingBoard.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    rankingBoard.topicIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 34) {
                        if (rankingBoard.f21227id == null) {
                            rankingBoard.f21227id = "";
                        }
                        if (rankingBoard.name == null) {
                            rankingBoard.name = "";
                        }
                        if (rankingBoard.topicIds == null) {
                            rankingBoard.topicIds = new ArrayList();
                        }
                        if (rankingBoard.topics != null) {
                            break;
                        }
                        rankingBoard.topics = new ArrayList();
                        return rankingBoard;
                    }
                    rankingBoard.topics = (List) nc5Var.m162488l(RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return rankingBoard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RankingBoard rankingBoard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rankingBoard.f21227id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = rankingBoard.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<String> list = rankingBoard.topicIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<RankingTopic> list2 = rankingBoard.topics;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(4, list2, RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RankingBoard> JSON_ADAPTER = new ObjectJsonAdapter<RankingBoard>() { // from class: com.p1.mobile.putong.core.data.RankingBoard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RankingBoard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RankingBoard newInstance() {
            return new RankingBoard();
        }

        public boolean parseField(RankingBoard rankingBoard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "topicIds":
                    rankingBoard.topicIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "topics":
                    rankingBoard.topics = JsonAdapter.parseArray(jsonParser, RankingTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    rankingBoard.f21227id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    rankingBoard.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RankingBoard rankingBoard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "topicIds":
                case "topics":
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(rankingBoard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RankingBoard rankingBoard, JsonGenerator jsonGenerator) throws IOException {
            String str = rankingBoard.f21227id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = rankingBoard.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (rankingBoard.topicIds != null) {
                jsonGenerator.writeFieldName("topicIds");
                JsonAdapter.serializeArray(rankingBoard.topicIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (rankingBoard.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(rankingBoard.topics, jsonGenerator, RankingTopic.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RankingBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RankingBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36807b(String str) {
        return str;
    }

    public static RankingBoard new_() {
        RankingBoard rankingBoard = new RankingBoard();
        rankingBoard.nullCheck();
        return rankingBoard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RankingBoard mo225055clone() {
        RankingBoard rankingBoard = new RankingBoard();
        rankingBoard.f21227id = this.f21227id;
        rankingBoard.name = this.name;
        List<String> list = this.topicIds;
        if (list != null) {
            rankingBoard.topicIds = ValueObject.util_map(list, new qcj() { // from class: l.qkc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return RankingBoard.m36807b((String) obj);
                }
            });
        }
        List<RankingTopic> list2 = this.topics;
        if (list2 != null) {
            rankingBoard.topics = ValueObject.util_map(list2, new qcj() { // from class: l.rkc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((RankingTopic) obj).mo225055clone();
                }
            });
        }
        return rankingBoard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RankingBoard)) {
            return false;
        }
        RankingBoard rankingBoard = (RankingBoard) obj;
        return ValueObject.util_equals(this.f21227id, rankingBoard.f21227id) && ValueObject.util_equals(this.name, rankingBoard.name) && ValueObject.util_equals(this.topicIds, rankingBoard.topicIds) && ValueObject.util_equals(this.topics, rankingBoard.topics);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "rankingboard";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f21227id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.topicIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<RankingTopic> list2 = this.topics;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21227id == null) {
            this.f21227id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.topicIds == null) {
            this.topicIds = new ArrayList();
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
