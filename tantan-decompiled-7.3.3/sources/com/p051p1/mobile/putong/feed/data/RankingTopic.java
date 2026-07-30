package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
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

/* JADX INFO: loaded from: classes13.dex */
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
    public String f40090id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String rank;
    public static ProtobufAdapter<RankingTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<RankingTopic>() { // from class: com.p1.mobile.putong.feed.data.RankingTopic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RankingTopic rankingTopic) {
            String str = rankingTopic.f40090id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = rankingTopic.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = rankingTopic.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = rankingTopic.hot;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = rankingTopic.rank;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            RankingExtra rankingExtra = rankingTopic.extra;
            if (rankingExtra != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, rankingExtra, RankingExtra.PROTOBUF_ADAPTER);
            }
            rankingTopic.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RankingTopic parse(nc5 nc5Var) throws IOException {
            RankingTopic rankingTopic = new RankingTopic();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (rankingTopic.f40090id == null) {
                        rankingTopic.f40090id = "";
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
                if (iM162497u == 10) {
                    rankingTopic.f40090id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    rankingTopic.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    rankingTopic.icon = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    rankingTopic.hot = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    rankingTopic.rank = nc5Var.m162495s();
                } else {
                    if (iM162497u != 50) {
                        if (rankingTopic.f40090id == null) {
                            rankingTopic.f40090id = "";
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
                    rankingTopic.extra = (RankingExtra) nc5Var.m162488l(RankingExtra.PROTOBUF_ADAPTER);
                }
            }
            return rankingTopic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RankingTopic rankingTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rankingTopic.f40090id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = rankingTopic.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = rankingTopic.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = rankingTopic.hot;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = rankingTopic.rank;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            RankingExtra rankingExtra = rankingTopic.extra;
            if (rankingExtra != null) {
                codedOutputByteBufferNano.m17309K(6, rankingExtra, RankingExtra.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RankingTopic> JSON_ADAPTER = new ObjectJsonAdapter<RankingTopic>() { // from class: com.p1.mobile.putong.feed.data.RankingTopic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RankingTopic.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RankingTopic newInstance() {
            return new RankingTopic();
        }

        public boolean parseField(RankingTopic rankingTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    rankingTopic.f40090id = jsonParser.getValueAsString();
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
                    rankingTopic.extra = RankingExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RankingTopic rankingTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = rankingTopic.f40090id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = rankingTopic.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
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
                jsonGenerator.writeStringField(BLivePkCategory.rank, str5);
            }
            if (rankingTopic.extra != null) {
                jsonGenerator.writeFieldName("extra");
                RankingExtra.JSON_ADAPTER.serialize(rankingTopic.extra, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RankingTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RankingTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RankingTopic new_() {
        RankingTopic rankingTopic = new RankingTopic();
        rankingTopic.nullCheck();
        return rankingTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RankingTopic mo225055clone() {
        RankingTopic rankingTopic = new RankingTopic();
        rankingTopic.f40090id = this.f40090id;
        rankingTopic.name = this.name;
        rankingTopic.icon = this.icon;
        rankingTopic.hot = this.hot;
        rankingTopic.rank = this.rank;
        RankingExtra rankingExtra = this.extra;
        if (rankingExtra != null) {
            rankingTopic.extra = rankingExtra.mo225055clone();
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
        return ValueObject.util_equals(this.f40090id, rankingTopic.f40090id) && ValueObject.util_equals(this.name, rankingTopic.name) && ValueObject.util_equals(this.icon, rankingTopic.icon) && ValueObject.util_equals(this.hot, rankingTopic.hot) && ValueObject.util_equals(this.rank, rankingTopic.rank) && ValueObject.util_equals(this.extra, rankingTopic.extra);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "rankingtopic";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f40090id;
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
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40090id == null) {
            this.f40090id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
