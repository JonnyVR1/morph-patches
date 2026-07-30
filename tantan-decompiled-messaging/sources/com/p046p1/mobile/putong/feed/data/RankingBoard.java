package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.RankingBoard;
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
public class RankingBoard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rankingboard";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39241id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> topicIds;
    public static ProtobufAdapter<RankingBoard> PROTOBUF_ADAPTER = new MessageNanoAdapter<RankingBoard>() { // from class: com.p1.mobile.putong.feed.data.RankingBoard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RankingBoard rankingBoard) {
            String str = rankingBoard.f39241id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = rankingBoard.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<String> list = rankingBoard.topicIds;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            rankingBoard.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RankingBoard parse(nb5 nb5Var) throws IOException {
            RankingBoard rankingBoard = new RankingBoard();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (rankingBoard.f39241id == null) {
                        rankingBoard.f39241id = "";
                    }
                    if (rankingBoard.name == null) {
                        rankingBoard.name = "";
                    }
                    if (rankingBoard.topicIds != null) {
                        break;
                    }
                    rankingBoard.topicIds = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    rankingBoard.f39241id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    rankingBoard.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (rankingBoard.f39241id == null) {
                            rankingBoard.f39241id = "";
                        }
                        if (rankingBoard.name == null) {
                            rankingBoard.name = "";
                        }
                        if (rankingBoard.topicIds != null) {
                            break;
                        }
                        rankingBoard.topicIds = new ArrayList();
                        return rankingBoard;
                    }
                    rankingBoard.topicIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return rankingBoard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RankingBoard rankingBoard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rankingBoard.f39241id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = rankingBoard.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<String> list = rankingBoard.topicIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RankingBoard> JSON_ADAPTER = new ObjectJsonAdapter<RankingBoard>() { // from class: com.p1.mobile.putong.feed.data.RankingBoard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RankingBoard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RankingBoard newInstance() {
            return new RankingBoard();
        }

        public boolean parseField(RankingBoard rankingBoard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "topicIds":
                    rankingBoard.topicIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    rankingBoard.f39241id = jsonParser.getValueAsString();
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
                    return true;
                case "id":
                    return false;
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(rankingBoard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RankingBoard rankingBoard, JsonGenerator jsonGenerator) throws IOException {
            String str = rankingBoard.f39241id;
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
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RankingBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RankingBoard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60887a(String str) {
        return str;
    }

    public static RankingBoard new_() {
        RankingBoard rankingBoard = new RankingBoard();
        rankingBoard.nullCheck();
        return rankingBoard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RankingBoard mo223809clone() {
        RankingBoard rankingBoard = new RankingBoard();
        rankingBoard.f39241id = this.f39241id;
        rankingBoard.name = this.name;
        List<String> list = this.topicIds;
        if (list != null) {
            rankingBoard.topicIds = ValueObject.util_map(list, new w9j() { // from class: l.icc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return RankingBoard.m60887a((String) obj);
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
        return ValueObject.util_equals(this.f39241id, rankingBoard.f39241id) && ValueObject.util_equals(this.name, rankingBoard.name) && ValueObject.util_equals(this.topicIds, rankingBoard.topicIds);
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
        String str = this.f39241id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.topicIds;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39241id == null) {
            this.f39241id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.topicIds == null) {
            this.topicIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
