package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.RecommendUsers;
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

/* JADX INFO: loaded from: classes13.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecommendUsers recommendUsers) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, recommendUsers.followerCounter);
            String str = recommendUsers.recommendation;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = recommendUsers.userId;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            List<String> list = recommendUsers.momentIds;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            recommendUsers.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecommendUsers parse(nc5 nc5Var) throws IOException {
            RecommendUsers recommendUsers = new RecommendUsers();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    recommendUsers.followerCounter = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    recommendUsers.recommendation = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    recommendUsers.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
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
                    recommendUsers.momentIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return recommendUsers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecommendUsers recommendUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, recommendUsers.followerCounter);
            String str = recommendUsers.recommendation;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = recommendUsers.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            List<String> list = recommendUsers.momentIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecommendUsers> JSON_ADAPTER = new ObjectJsonAdapter<RecommendUsers>() { // from class: com.p1.mobile.putong.feed.data.RecommendUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecommendUsers.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecommendUsers newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecommendUsers recommendUsers, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("followerCounter", recommendUsers.followerCounter);
            String str = recommendUsers.recommendation;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_RECOMMENDATION, str);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62078a(String str) {
        return str;
    }

    public static RecommendUsers new_() {
        RecommendUsers recommendUsers = new RecommendUsers();
        recommendUsers.nullCheck();
        return recommendUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecommendUsers mo225055clone() {
        RecommendUsers recommendUsers = new RecommendUsers();
        recommendUsers.followerCounter = this.followerCounter;
        recommendUsers.recommendation = this.recommendation;
        recommendUsers.userId = this.userId;
        List<String> list = this.momentIds;
        if (list != null) {
            recommendUsers.momentIds = ValueObject.util_map(list, new qcj() { // from class: l.iqc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return RecommendUsers.m62078a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
