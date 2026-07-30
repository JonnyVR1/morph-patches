package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.RecommendUsers;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RecommendUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recommendusers";

    @ProtobufIndex(index = 1)
    public int followerCounter;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> momentIds;

    @NonNull
    @ProtobufIndex(index = 2)
    public String recommendation;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;
    public static ProtobufAdapter<RecommendUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecommendUsers>() { // from class: com.p1.mobile.putong.feed.data.RecommendUsers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecommendUsers recommendUsers) {
            int iH = CodedOutputByteBufferNano.h(1, recommendUsers.followerCounter);
            String str = recommendUsers.recommendation;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = recommendUsers.userId;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            List<String> list = recommendUsers.momentIds;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) recommendUsers).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecommendUsers m19747parse(nb5 nb5Var) throws IOException {
            RecommendUsers recommendUsers = new RecommendUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recommendUsers.recommendation == null) {
                        recommendUsers.recommendation = "";
                    }
                    if (recommendUsers.userId == null) {
                        recommendUsers.userId = "";
                    }
                    if (recommendUsers.momentIds != null) {
                        break;
                    }
                    recommendUsers.momentIds = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    recommendUsers.followerCounter = nb5Var.j();
                } else if (iU == 18) {
                    recommendUsers.recommendation = nb5Var.s();
                } else if (iU == 26) {
                    recommendUsers.userId = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (recommendUsers.recommendation == null) {
                            recommendUsers.recommendation = "";
                        }
                        if (recommendUsers.userId == null) {
                            recommendUsers.userId = "";
                        }
                        if (recommendUsers.momentIds != null) {
                            break;
                        }
                        recommendUsers.momentIds = new ArrayList();
                        return recommendUsers;
                    }
                    recommendUsers.momentIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return recommendUsers;
        }

        public void serialize(RecommendUsers recommendUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, recommendUsers.followerCounter);
            String str = recommendUsers.recommendation;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = recommendUsers.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            List<String> list = recommendUsers.momentIds;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecommendUsers> JSON_ADAPTER = new ObjectJsonAdapter<RecommendUsers>() { // from class: com.p1.mobile.putong.feed.data.RecommendUsers.2
        public Class getDataClass() {
            return RecommendUsers.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RecommendUsers mo17830newInstance() {
            return new RecommendUsers();
        }

        public boolean parseField(RecommendUsers recommendUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "recommendation":
                    recommendUsers.recommendation = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    recommendUsers.userId = jsonParser.getValueAsString();
                    return true;
                case "followerCounter":
                    recommendUsers.followerCounter = jsonParser.getValueAsInt();
                    return true;
                case "momentIds":
                    recommendUsers.momentIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RecommendUsers recommendUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "recommendation":
                case "userId":
                case "followerCounter":
                case "momentIds":
                    return true;
                default:
                    return super.parseFieldCheck(recommendUsers, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecommendUsers recommendUsers, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("followerCounter", recommendUsers.followerCounter);
            String str = recommendUsers.recommendation;
            if (str != null) {
                jsonGenerator.writeStringField("recommendation", str);
            }
            String str2 = recommendUsers.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            if (recommendUsers.momentIds != null) {
                jsonGenerator.writeFieldName("momentIds");
                JsonAdapter.serializeArray(recommendUsers.momentIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1820a(String str) {
        return str;
    }

    public static RecommendUsers new_() {
        RecommendUsers recommendUsers = new RecommendUsers();
        recommendUsers.nullCheck();
        return recommendUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecommendUsers m19746clone() {
        RecommendUsers recommendUsers = new RecommendUsers();
        recommendUsers.followerCounter = this.followerCounter;
        recommendUsers.recommendation = this.recommendation;
        recommendUsers.userId = this.userId;
        List<String> list = this.momentIds;
        if (list != null) {
            recommendUsers.momentIds = ValueObject.util_map(list, new w9j() { // from class: l.bic0
                public final Object call(Object obj) {
                    return RecommendUsers.m1820a((String) obj);
                }
            });
        }
        return recommendUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecommendUsers)) {
            return false;
        }
        RecommendUsers recommendUsers = (RecommendUsers) obj;
        return this.followerCounter == recommendUsers.followerCounter && ValueObject.util_equals(this.recommendation, recommendUsers.recommendation) && ValueObject.util_equals(this.userId, recommendUsers.userId) && ValueObject.util_equals(this.momentIds, recommendUsers.momentIds);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.followerCounter) * 41;
        String str = this.recommendation;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.momentIds;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.recommendation == null) {
            this.recommendation = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.momentIds == null) {
            this.momentIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
