package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.RelationshipStatus;
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

/* JADX INFO: loaded from: classes10.dex */
public class LikedUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likeduser";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20432id;

    @NonNull
    @ProtobufIndex(index = 3)
    public RelationshipStatus otherStatus;

    @NonNull
    @ProtobufIndex(index = 6)
    public RelationshipExt relationshipExt;

    @NonNull
    @ProtobufIndex(index = 2)
    public RelationshipStatus status;
    public static ProtobufAdapter<LikedUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikedUser>() { // from class: com.p1.mobile.putong.core.data.LikedUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikedUser likedUser) {
            String str = likedUser.f20432id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            RelationshipStatus relationshipStatus = likedUser.status;
            if (relationshipStatus != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(2, relationshipStatus.ordinal());
            }
            RelationshipStatus relationshipStatus2 = likedUser.otherStatus;
            if (relationshipStatus2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, relationshipStatus2.ordinal());
            }
            RelationshipStatus relationshipStatus3 = likedUser.status;
            if (relationshipStatus3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, relationshipStatus3, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus4 = likedUser.otherStatus;
            if (relationshipStatus4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, relationshipStatus4, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipExt relationshipExt = likedUser.relationshipExt;
            if (relationshipExt != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, relationshipExt, RelationshipExt.PROTOBUF_ADAPTER);
            }
            likedUser.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikedUser parse(nb5 nb5Var) throws IOException {
            LikedUser likedUser = new LikedUser();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (likedUser.status == null && numValueOf != null) {
                        likedUser.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (likedUser.otherStatus == null && numValueOf2 != null) {
                        likedUser.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                    }
                    if (likedUser.f20432id == null) {
                        likedUser.f20432id = "";
                    }
                    if (likedUser.status == null) {
                        likedUser.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (likedUser.otherStatus == null) {
                        likedUser.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (likedUser.relationshipExt != null) {
                        break;
                    }
                    likedUser.relationshipExt = RelationshipExt.new_();
                    break;
                }
                if (iM158752u == 10) {
                    likedUser.f20432id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 24) {
                    numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 34) {
                    likedUser.status = (RelationshipStatus) nb5Var.m158743l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    likedUser.otherStatus = (RelationshipStatus) nb5Var.m158743l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
                        if (likedUser.status == null && numValueOf != null) {
                            likedUser.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (likedUser.otherStatus == null && numValueOf2 != null) {
                            likedUser.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (likedUser.f20432id == null) {
                            likedUser.f20432id = "";
                        }
                        if (likedUser.status == null) {
                            likedUser.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (likedUser.otherStatus == null) {
                            likedUser.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (likedUser.relationshipExt != null) {
                            break;
                        }
                        likedUser.relationshipExt = RelationshipExt.new_();
                        return likedUser;
                    }
                    likedUser.relationshipExt = (RelationshipExt) nb5Var.m158743l(RelationshipExt.PROTOBUF_ADAPTER);
                }
            }
            return likedUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikedUser likedUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likedUser.f20432id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            RelationshipStatus relationshipStatus = likedUser.status;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17250G(2, relationshipStatus.ordinal());
            }
            RelationshipStatus relationshipStatus2 = likedUser.otherStatus;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.m17250G(3, relationshipStatus2.ordinal());
            }
            RelationshipStatus relationshipStatus3 = likedUser.status;
            if (relationshipStatus3 != null) {
                codedOutputByteBufferNano.m17254K(4, relationshipStatus3, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus4 = likedUser.otherStatus;
            if (relationshipStatus4 != null) {
                codedOutputByteBufferNano.m17254K(5, relationshipStatus4, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipExt relationshipExt = likedUser.relationshipExt;
            if (relationshipExt != null) {
                codedOutputByteBufferNano.m17254K(6, relationshipExt, RelationshipExt.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LikedUser> JSON_ADAPTER = new ObjectJsonAdapter<LikedUser>() { // from class: com.p1.mobile.putong.core.data.LikedUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikedUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikedUser newInstance() {
            return new LikedUser();
        }

        public boolean parseField(LikedUser likedUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherStatus":
                    likedUser.otherStatus = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "relationshipExt":
                    likedUser.relationshipExt = RelationshipExt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    likedUser.status = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    likedUser.f20432id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikedUser likedUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherStatus":
                case "relationshipExt":
                case "status":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(likedUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikedUser likedUser, JsonGenerator jsonGenerator) throws IOException {
            String str = likedUser.f20432id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (likedUser.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                RelationshipStatus.JSON_ADAPTER.serialize(likedUser.status, jsonGenerator, true);
            }
            if (likedUser.otherStatus != null) {
                jsonGenerator.writeFieldName("otherStatus");
                RelationshipStatus.JSON_ADAPTER.serialize(likedUser.otherStatus, jsonGenerator, true);
            }
            if (likedUser.relationshipExt != null) {
                jsonGenerator.writeFieldName("relationshipExt");
                RelationshipExt.JSON_ADAPTER.serialize(likedUser.relationshipExt, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikedUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikedUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikedUser new_() {
        LikedUser likedUser = new LikedUser();
        likedUser.nullCheck();
        return likedUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikedUser mo223809clone() {
        LikedUser likedUser = new LikedUser();
        likedUser.f20432id = this.f20432id;
        likedUser.status = this.status;
        likedUser.otherStatus = this.otherStatus;
        RelationshipExt relationshipExt = this.relationshipExt;
        if (relationshipExt != null) {
            likedUser.relationshipExt = relationshipExt.mo223809clone();
        }
        return likedUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikedUser)) {
            return false;
        }
        LikedUser likedUser = (LikedUser) obj;
        return ValueObject.util_equals(this.f20432id, likedUser.f20432id) && ValueObject.util_equals(this.status, likedUser.status) && ValueObject.util_equals(this.otherStatus, likedUser.otherStatus) && ValueObject.util_equals(this.relationshipExt, likedUser.relationshipExt);
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
        String str = this.f20432id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.status;
        int iHashCode2 = (iHashCode + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus2 = this.otherStatus;
        int iHashCode3 = (iHashCode2 + (relationshipStatus2 != null ? relationshipStatus2.hashCode() : 0)) * 41;
        RelationshipExt relationshipExt = this.relationshipExt;
        int iHashCode4 = iHashCode3 + (relationshipExt != null ? relationshipExt.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20432id == null) {
            this.f20432id = "";
        }
        if (this.status == null) {
            this.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.otherStatus == null) {
            this.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.relationshipExt == null) {
            this.relationshipExt = RelationshipExt.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
