package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeExtraData likeExtraData) {
            SwipeExtraScData swipeExtraScData = likeExtraData.swipeExtraScData;
            int iM17230l = swipeExtraScData != null ? CodedOutputByteBufferNano.m17230l(1, swipeExtraScData, SwipeExtraScData.PROTOBUF_ADAPTER) : 0;
            MatchScData matchScData = likeExtraData.matchScData;
            if (matchScData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, matchScData, MatchScData.PROTOBUF_ADAPTER);
            }
            MatchFrom matchFrom = likeExtraData.status;
            if (matchFrom != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, matchFrom, MatchFrom.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus = likeExtraData.state;
            if (relationshipStatus != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17230l + CodedOutputByteBufferNano.m17220b(5, likeExtraData.isSelectedUser);
            likeExtraData.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeExtraData parse(nb5 nb5Var) throws IOException {
            LikeExtraData likeExtraData = new LikeExtraData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    likeExtraData.swipeExtraScData = (SwipeExtraScData) nb5Var.m158743l(SwipeExtraScData.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    likeExtraData.matchScData = (MatchScData) nb5Var.m158743l(MatchScData.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    likeExtraData.status = (MatchFrom) nb5Var.m158743l(MatchFrom.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    likeExtraData.state = (RelationshipStatus) nb5Var.m158743l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 40) {
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
                    likeExtraData.isSelectedUser = nb5Var.m158738g();
                }
            }
            return likeExtraData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeExtraData likeExtraData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SwipeExtraScData swipeExtraScData = likeExtraData.swipeExtraScData;
            if (swipeExtraScData != null) {
                codedOutputByteBufferNano.m17254K(1, swipeExtraScData, SwipeExtraScData.PROTOBUF_ADAPTER);
            }
            MatchScData matchScData = likeExtraData.matchScData;
            if (matchScData != null) {
                codedOutputByteBufferNano.m17254K(2, matchScData, MatchScData.PROTOBUF_ADAPTER);
            }
            MatchFrom matchFrom = likeExtraData.status;
            if (matchFrom != null) {
                codedOutputByteBufferNano.m17254K(3, matchFrom, MatchFrom.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus = likeExtraData.state;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17254K(4, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(5, likeExtraData.isSelectedUser);
        }
    };
    public static JsonAdapter<LikeExtraData> JSON_ADAPTER = new ObjectJsonAdapter<LikeExtraData>() { // from class: com.p1.mobile.putong.data.LikeExtraData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeExtraData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeExtraData newInstance() {
            return new LikeExtraData();
        }

        public boolean parseField(LikeExtraData likeExtraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    likeExtraData.status = MatchFrom.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "swipeExtraScData":
                    likeExtraData.swipeExtraScData = SwipeExtraScData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "state":
                    likeExtraData.state = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "matchScData":
                    likeExtraData.matchScData = MatchScData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                MatchFrom.JSON_ADAPTER.serialize(likeExtraData.status, jsonGenerator, true);
            }
            if (likeExtraData.state != null) {
                jsonGenerator.writeFieldName("state");
                RelationshipStatus.JSON_ADAPTER.serialize(likeExtraData.state, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isSelectedUser", likeExtraData.isSelectedUser);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeExtraData new_() {
        LikeExtraData likeExtraData = new LikeExtraData();
        likeExtraData.nullCheck();
        return likeExtraData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeExtraData mo223809clone() {
        LikeExtraData likeExtraData = new LikeExtraData();
        SwipeExtraScData swipeExtraScData = this.swipeExtraScData;
        if (swipeExtraScData != null) {
            likeExtraData.swipeExtraScData = swipeExtraScData.mo223809clone();
        }
        MatchScData matchScData = this.matchScData;
        if (matchScData != null) {
            likeExtraData.matchScData = matchScData.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    private LikeExtraData() {
    }
}
