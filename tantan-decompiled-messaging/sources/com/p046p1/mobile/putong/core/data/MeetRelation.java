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
public class MeetRelation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "meetrelation";

    @NonNull
    @ProtobufIndex(index = 2)
    public RelationshipStatus otherStatus;

    @NonNull
    @ProtobufIndex(index = 3)
    public RelationshipExt relationshipExt;

    @NonNull
    @ProtobufIndex(index = 1)
    public RelationshipStatus status;
    public static ProtobufAdapter<MeetRelation> PROTOBUF_ADAPTER = new MessageNanoAdapter<MeetRelation>() { // from class: com.p1.mobile.putong.core.data.MeetRelation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MeetRelation meetRelation) {
            RelationshipStatus relationshipStatus = meetRelation.status;
            int iM17230l = relationshipStatus != null ? CodedOutputByteBufferNano.m17230l(1, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER) : 0;
            RelationshipStatus relationshipStatus2 = meetRelation.otherStatus;
            if (relationshipStatus2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipExt relationshipExt = meetRelation.relationshipExt;
            if (relationshipExt != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, relationshipExt, RelationshipExt.PROTOBUF_ADAPTER);
            }
            meetRelation.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MeetRelation parse(nb5 nb5Var) throws IOException {
            MeetRelation meetRelation = new MeetRelation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (meetRelation.status == null) {
                        meetRelation.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (meetRelation.otherStatus == null) {
                        meetRelation.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (meetRelation.relationshipExt != null) {
                        break;
                    }
                    meetRelation.relationshipExt = RelationshipExt.new_();
                    break;
                }
                if (iM158752u == 10) {
                    meetRelation.status = (RelationshipStatus) nb5Var.m158743l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    meetRelation.otherStatus = (RelationshipStatus) nb5Var.m158743l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (meetRelation.status == null) {
                            meetRelation.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (meetRelation.otherStatus == null) {
                            meetRelation.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (meetRelation.relationshipExt != null) {
                            break;
                        }
                        meetRelation.relationshipExt = RelationshipExt.new_();
                        return meetRelation;
                    }
                    meetRelation.relationshipExt = (RelationshipExt) nb5Var.m158743l(RelationshipExt.PROTOBUF_ADAPTER);
                }
            }
            return meetRelation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MeetRelation meetRelation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RelationshipStatus relationshipStatus = meetRelation.status;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17254K(1, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = meetRelation.otherStatus;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.m17254K(2, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipExt relationshipExt = meetRelation.relationshipExt;
            if (relationshipExt != null) {
                codedOutputByteBufferNano.m17254K(3, relationshipExt, RelationshipExt.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MeetRelation> JSON_ADAPTER = new ObjectJsonAdapter<MeetRelation>() { // from class: com.p1.mobile.putong.core.data.MeetRelation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MeetRelation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MeetRelation newInstance() {
            return new MeetRelation();
        }

        public boolean parseField(MeetRelation meetRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherStatus":
                    meetRelation.otherStatus = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "relationshipExt":
                    meetRelation.relationshipExt = RelationshipExt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    meetRelation.status = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MeetRelation meetRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherStatus":
                case "relationshipExt":
                case "status":
                    return true;
                default:
                    return super.parseFieldCheck(meetRelation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MeetRelation meetRelation, JsonGenerator jsonGenerator) throws IOException {
            if (meetRelation.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                RelationshipStatus.JSON_ADAPTER.serialize(meetRelation.status, jsonGenerator, true);
            }
            if (meetRelation.otherStatus != null) {
                jsonGenerator.writeFieldName("otherStatus");
                RelationshipStatus.JSON_ADAPTER.serialize(meetRelation.otherStatus, jsonGenerator, true);
            }
            if (meetRelation.relationshipExt != null) {
                jsonGenerator.writeFieldName("relationshipExt");
                RelationshipExt.JSON_ADAPTER.serialize(meetRelation.relationshipExt, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MeetRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MeetRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MeetRelation new_() {
        MeetRelation meetRelation = new MeetRelation();
        meetRelation.nullCheck();
        return meetRelation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MeetRelation mo223809clone() {
        MeetRelation meetRelation = new MeetRelation();
        meetRelation.status = this.status;
        meetRelation.otherStatus = this.otherStatus;
        RelationshipExt relationshipExt = this.relationshipExt;
        if (relationshipExt != null) {
            meetRelation.relationshipExt = relationshipExt.mo223809clone();
        }
        return meetRelation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeetRelation)) {
            return false;
        }
        MeetRelation meetRelation = (MeetRelation) obj;
        return ValueObject.util_equals(this.status, meetRelation.status) && ValueObject.util_equals(this.otherStatus, meetRelation.otherStatus) && ValueObject.util_equals(this.relationshipExt, meetRelation.relationshipExt);
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
        RelationshipStatus relationshipStatus = this.status;
        int iHashCode = (i2 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus2 = this.otherStatus;
        int iHashCode2 = (iHashCode + (relationshipStatus2 != null ? relationshipStatus2.hashCode() : 0)) * 41;
        RelationshipExt relationshipExt = this.relationshipExt;
        int iHashCode3 = iHashCode2 + (relationshipExt != null ? relationshipExt.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
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
