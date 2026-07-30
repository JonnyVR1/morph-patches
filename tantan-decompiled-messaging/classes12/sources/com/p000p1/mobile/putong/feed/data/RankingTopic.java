package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RankingTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rankingtopic";

    @NonNull
    @ProtobufIndex(index = 6)
    public RankingExtra extra;

    @NonNull
    @ProtobufIndex(index = 4)
    public String hot;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f703id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String rank;
    public static ProtobufAdapter<RankingTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<RankingTopic>() { // from class: com.p1.mobile.putong.feed.data.RankingTopic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RankingTopic rankingTopic) {
            String str = rankingTopic.f703id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = rankingTopic.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = rankingTopic.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = rankingTopic.hot;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = rankingTopic.rank;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            RankingExtra rankingExtra = rankingTopic.extra;
            if (rankingExtra != null) {
                iO += CodedOutputByteBufferNano.l(6, rankingExtra, RankingExtra.PROTOBUF_ADAPTER);
            }
            ((MessageNano) rankingTopic).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RankingTopic m19741parse(nb5 nb5Var) throws IOException {
            RankingTopic rankingTopic = new RankingTopic();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (rankingTopic.f703id == null) {
                        rankingTopic.f703id = "";
                    }
                    if (rankingTopic.name == null) {
                        rankingTopic.name = "";
                    }
                    if (rankingTopic.icon == null) {
                        rankingTopic.icon = "";
                    }
                    if (rankingTopic.hot == null) {
                        rankingTopic.hot = "";
                    }
                    if (rankingTopic.rank == null) {
                        rankingTopic.rank = "";
                    }
                    if (rankingTopic.extra != null) {
                        break;
                    }
                    rankingTopic.extra = RankingExtra.new_();
                    break;
                }
                if (iU == 10) {
                    rankingTopic.f703id = nb5Var.s();
                } else if (iU == 18) {
                    rankingTopic.name = nb5Var.s();
                } else if (iU == 26) {
                    rankingTopic.icon = nb5Var.s();
                } else if (iU == 34) {
                    rankingTopic.hot = nb5Var.s();
                } else if (iU == 42) {
                    rankingTopic.rank = nb5Var.s();
                } else {
                    if (iU != 50) {
                        if (rankingTopic.f703id == null) {
                            rankingTopic.f703id = "";
                        }
                        if (rankingTopic.name == null) {
                            rankingTopic.name = "";
                        }
                        if (rankingTopic.icon == null) {
                            rankingTopic.icon = "";
                        }
                        if (rankingTopic.hot == null) {
                            rankingTopic.hot = "";
                        }
                        if (rankingTopic.rank == null) {
                            rankingTopic.rank = "";
                        }
                        if (rankingTopic.extra != null) {
                            break;
                        }
                        rankingTopic.extra = RankingExtra.new_();
                        return rankingTopic;
                    }
                    rankingTopic.extra = (RankingExtra) nb5Var.l(RankingExtra.PROTOBUF_ADAPTER);
                }
            }
            return rankingTopic;
        }

        public void serialize(RankingTopic rankingTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rankingTopic.f703id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = rankingTopic.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = rankingTopic.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = rankingTopic.hot;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = rankingTopic.rank;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            RankingExtra rankingExtra = rankingTopic.extra;
            if (rankingExtra != null) {
                codedOutputByteBufferNano.K(6, rankingExtra, RankingExtra.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RankingTopic> JSON_ADAPTER = new ObjectJsonAdapter<RankingTopic>() { // from class: com.p1.mobile.putong.feed.data.RankingTopic.2
        public Class getDataClass() {
            return RankingTopic.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RankingTopic mo17830newInstance() {
            return new RankingTopic();
        }

        public boolean parseField(RankingTopic rankingTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    rankingTopic.f703id = jsonParser.getValueAsString();
                    return false;
                case "hot":
                    rankingTopic.hot = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    rankingTopic.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    rankingTopic.name = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    rankingTopic.rank = jsonParser.getValueAsString();
                    return true;
                case "extra":
                    rankingTopic.extra = (RankingExtra) RankingExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RankingTopic rankingTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "hot":
                case "icon":
                case "name":
                case "rank":
                case "extra":
                    return true;
                default:
                    return super.parseFieldCheck(rankingTopic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RankingTopic rankingTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = rankingTopic.f703id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = rankingTopic.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = rankingTopic.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = rankingTopic.hot;
            if (str4 != null) {
                jsonGenerator.writeStringField("hot", str4);
            }
            String str5 = rankingTopic.rank;
            if (str5 != null) {
                jsonGenerator.writeStringField("rank", str5);
            }
            if (rankingTopic.extra != null) {
                jsonGenerator.writeFieldName("extra");
                RankingExtra.JSON_ADAPTER.serialize(rankingTopic.extra, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RankingTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RankingTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RankingTopic new_() {
        RankingTopic rankingTopic = new RankingTopic();
        rankingTopic.nullCheck();
        return rankingTopic;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RankingTopic m19740clone() {
        RankingTopic rankingTopic = new RankingTopic();
        rankingTopic.f703id = this.f703id;
        rankingTopic.name = this.name;
        rankingTopic.icon = this.icon;
        rankingTopic.hot = this.hot;
        rankingTopic.rank = this.rank;
        RankingExtra rankingExtra = this.extra;
        if (rankingExtra != null) {
            rankingTopic.extra = rankingExtra.m19734clone();
        }
        return rankingTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RankingTopic)) {
            return false;
        }
        RankingTopic rankingTopic = (RankingTopic) obj;
        return ValueObject.util_equals(this.f703id, rankingTopic.f703id) && ValueObject.util_equals(this.name, rankingTopic.name) && ValueObject.util_equals(this.icon, rankingTopic.icon) && ValueObject.util_equals(this.hot, rankingTopic.hot) && ValueObject.util_equals(this.rank, rankingTopic.rank) && ValueObject.util_equals(this.extra, rankingTopic.extra);
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
        String str = this.f703id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.hot;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.rank;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        RankingExtra rankingExtra = this.extra;
        int iHashCode6 = iHashCode5 + (rankingExtra != null ? rankingExtra.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.f703id == null) {
            this.f703id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.hot == null) {
            this.hot = "";
        }
        if (this.rank == null) {
            this.rank = "";
        }
        if (this.extra == null) {
            this.extra = RankingExtra.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
