package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.RankingBoard;
import com.p000p1.mobile.putong.core.data.RankingTopic;
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
public class RankingBoard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rankingboard";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f147id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> topicIds;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<RankingTopic> topics;
    public static ProtobufAdapter<RankingBoard> PROTOBUF_ADAPTER = new MessageNanoAdapter<RankingBoard>() { // from class: com.p1.mobile.putong.core.data.RankingBoard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RankingBoard rankingBoard) {
            String str = rankingBoard.f147id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = rankingBoard.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<String> list = rankingBoard.topicIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<RankingTopic> list2 = rankingBoard.topics;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(4, list2, RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) rankingBoard).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RankingBoard m15201parse(nb5 nb5Var) throws IOException {
            RankingBoard rankingBoard = new RankingBoard();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (rankingBoard.f147id == null) {
                        rankingBoard.f147id = "";
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
                if (iU == 10) {
                    rankingBoard.f147id = nb5Var.s();
                } else if (iU == 18) {
                    rankingBoard.name = nb5Var.s();
                } else if (iU == 26) {
                    rankingBoard.topicIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 34) {
                        if (rankingBoard.f147id == null) {
                            rankingBoard.f147id = "";
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
                    rankingBoard.topics = (List) nb5Var.l(RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return rankingBoard;
        }

        public void serialize(RankingBoard rankingBoard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rankingBoard.f147id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = rankingBoard.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<String> list = rankingBoard.topicIds;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<RankingTopic> list2 = rankingBoard.topics;
            if (list2 != null) {
                codedOutputByteBufferNano.K(4, list2, RankingTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RankingBoard> JSON_ADAPTER = new ObjectJsonAdapter<RankingBoard>() { // from class: com.p1.mobile.putong.core.data.RankingBoard.2
        public Class getDataClass() {
            return RankingBoard.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RankingBoard m15202newInstance() {
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
                    rankingBoard.f147id = jsonParser.getValueAsString();
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

        public void serializeFields(RankingBoard rankingBoard, JsonGenerator jsonGenerator) throws IOException {
            String str = rankingBoard.f147id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = rankingBoard.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RankingBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RankingBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m606b(String str) {
        return str;
    }

    public static RankingBoard new_() {
        RankingBoard rankingBoard = new RankingBoard();
        rankingBoard.nullCheck();
        return rankingBoard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RankingBoard m15200clone() {
        RankingBoard rankingBoard = new RankingBoard();
        rankingBoard.f147id = this.f147id;
        rankingBoard.name = this.name;
        List<String> list = this.topicIds;
        if (list != null) {
            rankingBoard.topicIds = ValueObject.util_map(list, new w9j() { // from class: l.jcc0
                public final Object call(Object obj) {
                    return RankingBoard.m606b((String) obj);
                }
            });
        }
        List<RankingTopic> list2 = this.topics;
        if (list2 != null) {
            rankingBoard.topics = ValueObject.util_map(list2, new w9j() { // from class: l.kcc0
                public final Object call(Object obj) {
                    return ((RankingTopic) obj).m15216clone();
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
        return ValueObject.util_equals(this.f147id, rankingBoard.f147id) && ValueObject.util_equals(this.name, rankingBoard.name) && ValueObject.util_equals(this.topicIds, rankingBoard.topicIds) && ValueObject.util_equals(this.topics, rankingBoard.topics);
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
        String str = this.f147id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.topicIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<RankingTopic> list2 = this.topics;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f147id == null) {
            this.f147id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
