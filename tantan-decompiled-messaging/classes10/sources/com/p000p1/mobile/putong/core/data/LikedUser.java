package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.RelationshipStatus;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LikedUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likeduser";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f94id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public RelationshipStatus otherStatus;

    @NonNull
    @ProtobufIndex(index = 6)
    public RelationshipExt relationshipExt;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RelationshipStatus status;
    public static ProtobufAdapter<LikedUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikedUser>() { // from class: com.p1.mobile.putong.core.data.LikedUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikedUser likedUser) {
            String str = likedUser.f94id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            RelationshipStatus relationshipStatus = likedUser.status;
            if (relationshipStatus != null) {
                iO += CodedOutputByteBufferNano.h(2, relationshipStatus.ordinal());
            }
            RelationshipStatus relationshipStatus2 = likedUser.otherStatus;
            if (relationshipStatus2 != null) {
                iO += CodedOutputByteBufferNano.h(3, relationshipStatus2.ordinal());
            }
            RelationshipStatus relationshipStatus3 = likedUser.status;
            if (relationshipStatus3 != null) {
                iO += CodedOutputByteBufferNano.l(4, relationshipStatus3, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus4 = likedUser.otherStatus;
            if (relationshipStatus4 != null) {
                iO += CodedOutputByteBufferNano.l(5, relationshipStatus4, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipExt relationshipExt = likedUser.relationshipExt;
            if (relationshipExt != null) {
                iO += CodedOutputByteBufferNano.l(6, relationshipExt, RelationshipExt.PROTOBUF_ADAPTER);
            }
            ((MessageNano) likedUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikedUser m13891parse(nb5 nb5Var) throws IOException {
            LikedUser likedUser = new LikedUser();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likedUser.status == null && numValueOf != null) {
                        likedUser.status = RelationshipStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (likedUser.otherStatus == null && numValueOf2 != null) {
                        likedUser.otherStatus = RelationshipStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                    }
                    if (likedUser.f94id == null) {
                        likedUser.f94id = "";
                    }
                    if (likedUser.status == null) {
                        likedUser.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (likedUser.otherStatus == null) {
                        likedUser.otherStatus = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (likedUser.relationshipExt != null) {
                        break;
                    }
                    likedUser.relationshipExt = RelationshipExt.new_();
                    break;
                }
                if (iU == 10) {
                    likedUser.f94id = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 24) {
                    numValueOf2 = Integer.valueOf(nb5Var.j());
                } else if (iU == 34) {
                    likedUser.status = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    likedUser.otherStatus = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (likedUser.status == null && numValueOf != null) {
                            likedUser.status = RelationshipStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (likedUser.otherStatus == null && numValueOf2 != null) {
                            likedUser.otherStatus = RelationshipStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (likedUser.f94id == null) {
                            likedUser.f94id = "";
                        }
                        if (likedUser.status == null) {
                            likedUser.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (likedUser.otherStatus == null) {
                            likedUser.otherStatus = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (likedUser.relationshipExt != null) {
                            break;
                        }
                        likedUser.relationshipExt = RelationshipExt.new_();
                        return likedUser;
                    }
                    likedUser.relationshipExt = (RelationshipExt) nb5Var.l(RelationshipExt.PROTOBUF_ADAPTER);
                }
            }
            return likedUser;
        }

        public void serialize(LikedUser likedUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likedUser.f94id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            RelationshipStatus relationshipStatus = likedUser.status;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.G(2, relationshipStatus.ordinal());
            }
            RelationshipStatus relationshipStatus2 = likedUser.otherStatus;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.G(3, relationshipStatus2.ordinal());
            }
            RelationshipStatus relationshipStatus3 = likedUser.status;
            if (relationshipStatus3 != null) {
                codedOutputByteBufferNano.K(4, relationshipStatus3, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus4 = likedUser.otherStatus;
            if (relationshipStatus4 != null) {
                codedOutputByteBufferNano.K(5, relationshipStatus4, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipExt relationshipExt = likedUser.relationshipExt;
            if (relationshipExt != null) {
                codedOutputByteBufferNano.K(6, relationshipExt, RelationshipExt.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LikedUser> JSON_ADAPTER = new ObjectJsonAdapter<LikedUser>() { // from class: com.p1.mobile.putong.core.data.LikedUser.2
        public Class getDataClass() {
            return LikedUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikedUser m13892newInstance() {
            return new LikedUser();
        }

        public boolean parseField(LikedUser likedUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherStatus":
                    likedUser.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "relationshipExt":
                    likedUser.relationshipExt = (RelationshipExt) RelationshipExt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    likedUser.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    likedUser.f94id = jsonParser.getValueAsString();
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

        public void serializeFields(LikedUser likedUser, JsonGenerator jsonGenerator) throws IOException {
            String str = likedUser.f94id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (likedUser.status != null) {
                jsonGenerator.writeFieldName("status");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikedUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikedUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikedUser new_() {
        LikedUser likedUser = new LikedUser();
        likedUser.nullCheck();
        return likedUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikedUser m13890clone() {
        LikedUser likedUser = new LikedUser();
        likedUser.f94id = this.f94id;
        likedUser.status = this.status;
        likedUser.otherStatus = this.otherStatus;
        RelationshipExt relationshipExt = this.relationshipExt;
        if (relationshipExt != null) {
            likedUser.relationshipExt = relationshipExt.m15378clone();
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
        return ValueObject.util_equals(this.f94id, likedUser.f94id) && ValueObject.util_equals(this.status, likedUser.status) && ValueObject.util_equals(this.otherStatus, likedUser.otherStatus) && ValueObject.util_equals(this.relationshipExt, likedUser.relationshipExt);
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
        String str = this.f94id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.status;
        int iHashCode2 = (iHashCode + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus2 = this.otherStatus;
        int iHashCode3 = (iHashCode2 + (relationshipStatus2 != null ? relationshipStatus2.hashCode() : 0)) * 41;
        RelationshipExt relationshipExt = this.relationshipExt;
        int iHashCode4 = iHashCode3 + (relationshipExt != null ? relationshipExt.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f94id == null) {
            this.f94id = "";
        }
        if (this.status == null) {
            this.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.otherStatus == null) {
            this.otherStatus = RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.relationshipExt == null) {
            this.relationshipExt = RelationshipExt.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
