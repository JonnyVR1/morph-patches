package com.p000p1.mobile.putong.data;

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
public class LikeExtraData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likeextradata";

    @ProtobufIndex(index = 5)
    public boolean isSelectedUser;
    public DclExtensions liveExtraInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public MatchScData matchScData;
    public String profileLikeId;

    @NonNull
    @ProtobufIndex(index = 4)
    public RelationshipStatus state;

    @NonNull
    @ProtobufIndex(index = 3)
    public MatchFrom status;

    @NonNull
    @ProtobufIndex(index = 1)
    public SwipeExtraScData swipeExtraScData;
    public static ProtobufAdapter<LikeExtraData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeExtraData>() { // from class: com.p1.mobile.putong.data.LikeExtraData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeExtraData likeExtraData) {
            SwipeExtraScData swipeExtraScData = likeExtraData.swipeExtraScData;
            int iL = swipeExtraScData != null ? CodedOutputByteBufferNano.l(1, swipeExtraScData, SwipeExtraScData.PROTOBUF_ADAPTER) : 0;
            MatchScData matchScData = likeExtraData.matchScData;
            if (matchScData != null) {
                iL += CodedOutputByteBufferNano.l(2, matchScData, MatchScData.PROTOBUF_ADAPTER);
            }
            MatchFrom matchFrom = likeExtraData.status;
            if (matchFrom != null) {
                iL += CodedOutputByteBufferNano.l(3, matchFrom, MatchFrom.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus = likeExtraData.state;
            if (relationshipStatus != null) {
                iL += CodedOutputByteBufferNano.l(4, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            int iB = iL + CodedOutputByteBufferNano.b(5, likeExtraData.isSelectedUser);
            ((MessageNano) likeExtraData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeExtraData m18289parse(nb5 nb5Var) throws IOException {
            LikeExtraData likeExtraData = new LikeExtraData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeExtraData.swipeExtraScData == null) {
                        likeExtraData.swipeExtraScData = SwipeExtraScData.new_();
                    }
                    if (likeExtraData.matchScData == null) {
                        likeExtraData.matchScData = MatchScData.new_();
                    }
                    if (likeExtraData.status == null) {
                        likeExtraData.status = (MatchFrom) MatchFrom.JSON_ADAPTER.defaultEnum();
                    }
                    if (likeExtraData.state != null) {
                        break;
                    }
                    likeExtraData.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    likeExtraData.swipeExtraScData = (SwipeExtraScData) nb5Var.l(SwipeExtraScData.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    likeExtraData.matchScData = (MatchScData) nb5Var.l(MatchScData.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    likeExtraData.status = (MatchFrom) nb5Var.l(MatchFrom.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    likeExtraData.state = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 40) {
                        if (likeExtraData.swipeExtraScData == null) {
                            likeExtraData.swipeExtraScData = SwipeExtraScData.new_();
                        }
                        if (likeExtraData.matchScData == null) {
                            likeExtraData.matchScData = MatchScData.new_();
                        }
                        if (likeExtraData.status == null) {
                            likeExtraData.status = (MatchFrom) MatchFrom.JSON_ADAPTER.defaultEnum();
                        }
                        if (likeExtraData.state != null) {
                            break;
                        }
                        likeExtraData.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        return likeExtraData;
                    }
                    likeExtraData.isSelectedUser = nb5Var.g();
                }
            }
            return likeExtraData;
        }

        public void serialize(LikeExtraData likeExtraData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SwipeExtraScData swipeExtraScData = likeExtraData.swipeExtraScData;
            if (swipeExtraScData != null) {
                codedOutputByteBufferNano.K(1, swipeExtraScData, SwipeExtraScData.PROTOBUF_ADAPTER);
            }
            MatchScData matchScData = likeExtraData.matchScData;
            if (matchScData != null) {
                codedOutputByteBufferNano.K(2, matchScData, MatchScData.PROTOBUF_ADAPTER);
            }
            MatchFrom matchFrom = likeExtraData.status;
            if (matchFrom != null) {
                codedOutputByteBufferNano.K(3, matchFrom, MatchFrom.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus = likeExtraData.state;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.K(4, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(5, likeExtraData.isSelectedUser);
        }
    };
    public static JsonAdapter<LikeExtraData> JSON_ADAPTER = new ObjectJsonAdapter<LikeExtraData>() { // from class: com.p1.mobile.putong.data.LikeExtraData.2
        public Class getDataClass() {
            return LikeExtraData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LikeExtraData mo17830newInstance() {
            return new LikeExtraData();
        }

        public boolean parseField(LikeExtraData likeExtraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    likeExtraData.status = (MatchFrom) MatchFrom.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "swipeExtraScData":
                    likeExtraData.swipeExtraScData = (SwipeExtraScData) SwipeExtraScData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "state":
                    likeExtraData.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "matchScData":
                    likeExtraData.matchScData = (MatchScData) MatchScData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isSelectedUser":
                    likeExtraData.isSelectedUser = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikeExtraData likeExtraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "swipeExtraScData":
                case "state":
                case "matchScData":
                case "isSelectedUser":
                    return true;
                default:
                    return super.parseFieldCheck(likeExtraData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeExtraData likeExtraData, JsonGenerator jsonGenerator) throws IOException {
            if (likeExtraData.swipeExtraScData != null) {
                jsonGenerator.writeFieldName("swipeExtraScData");
                SwipeExtraScData.JSON_ADAPTER.serialize(likeExtraData.swipeExtraScData, jsonGenerator, true);
            }
            if (likeExtraData.matchScData != null) {
                jsonGenerator.writeFieldName("matchScData");
                MatchScData.JSON_ADAPTER.serialize(likeExtraData.matchScData, jsonGenerator, true);
            }
            if (likeExtraData.status != null) {
                jsonGenerator.writeFieldName("status");
                MatchFrom.JSON_ADAPTER.serialize(likeExtraData.status, jsonGenerator, true);
            }
            if (likeExtraData.state != null) {
                jsonGenerator.writeFieldName(Channel.state);
                RelationshipStatus.JSON_ADAPTER.serialize(likeExtraData.state, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isSelectedUser", likeExtraData.isSelectedUser);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeExtraData new_() {
        LikeExtraData likeExtraData = new LikeExtraData();
        likeExtraData.nullCheck();
        return likeExtraData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeExtraData m18288clone() {
        LikeExtraData likeExtraData = new LikeExtraData();
        SwipeExtraScData swipeExtraScData = this.swipeExtraScData;
        if (swipeExtraScData != null) {
            likeExtraData.swipeExtraScData = swipeExtraScData.m19069clone();
        }
        MatchScData matchScData = this.matchScData;
        if (matchScData != null) {
            likeExtraData.matchScData = matchScData.m18429clone();
        }
        likeExtraData.status = this.status;
        likeExtraData.state = this.state;
        likeExtraData.isSelectedUser = this.isSelectedUser;
        return likeExtraData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeExtraData)) {
            return false;
        }
        LikeExtraData likeExtraData = (LikeExtraData) obj;
        return ValueObject.util_equals(this.swipeExtraScData, likeExtraData.swipeExtraScData) && ValueObject.util_equals(this.matchScData, likeExtraData.matchScData) && ValueObject.util_equals(this.status, likeExtraData.status) && ValueObject.util_equals(this.state, likeExtraData.state) && this.isSelectedUser == likeExtraData.isSelectedUser;
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
        SwipeExtraScData swipeExtraScData = this.swipeExtraScData;
        int iHashCode = (i2 + (swipeExtraScData != null ? swipeExtraScData.hashCode() : 0)) * 41;
        MatchScData matchScData = this.matchScData;
        int iHashCode2 = (iHashCode + (matchScData != null ? matchScData.hashCode() : 0)) * 41;
        MatchFrom matchFrom = this.status;
        int iHashCode3 = (iHashCode2 + (matchFrom != null ? matchFrom.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.state;
        int iHashCode4 = ((iHashCode3 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41) + (this.isSelectedUser ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.swipeExtraScData == null) {
            this.swipeExtraScData = SwipeExtraScData.new_();
        }
        if (this.matchScData == null) {
            this.matchScData = MatchScData.new_();
        }
        if (this.status == null) {
            this.status = (MatchFrom) MatchFrom.JSON_ADAPTER.defaultEnum();
        }
        if (this.state == null) {
            this.state = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    private LikeExtraData() {
    }
}
