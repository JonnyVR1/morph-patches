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
public class MeetRelation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "meetrelation";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RelationshipStatus otherStatus;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public RelationshipExt relationshipExt;

    @NonNull
    @ProtobufIndex(index = 1)
    public RelationshipStatus status;
    public static ProtobufAdapter<MeetRelation> PROTOBUF_ADAPTER = new MessageNanoAdapter<MeetRelation>() { // from class: com.p1.mobile.putong.core.data.MeetRelation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MeetRelation meetRelation) {
            RelationshipStatus relationshipStatus = meetRelation.status;
            int iL = relationshipStatus != null ? CodedOutputByteBufferNano.l(1, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER) : 0;
            RelationshipStatus relationshipStatus2 = meetRelation.otherStatus;
            if (relationshipStatus2 != null) {
                iL += CodedOutputByteBufferNano.l(2, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipExt relationshipExt = meetRelation.relationshipExt;
            if (relationshipExt != null) {
                iL += CodedOutputByteBufferNano.l(3, relationshipExt, RelationshipExt.PROTOBUF_ADAPTER);
            }
            ((MessageNano) meetRelation).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MeetRelation m14113parse(nb5 nb5Var) throws IOException {
            MeetRelation meetRelation = new MeetRelation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (meetRelation.status == null) {
                        meetRelation.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (meetRelation.otherStatus == null) {
                        meetRelation.otherStatus = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (meetRelation.relationshipExt != null) {
                        break;
                    }
                    meetRelation.relationshipExt = RelationshipExt.new_();
                    break;
                }
                if (iU == 10) {
                    meetRelation.status = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    meetRelation.otherStatus = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (meetRelation.status == null) {
                            meetRelation.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (meetRelation.otherStatus == null) {
                            meetRelation.otherStatus = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (meetRelation.relationshipExt != null) {
                            break;
                        }
                        meetRelation.relationshipExt = RelationshipExt.new_();
                        return meetRelation;
                    }
                    meetRelation.relationshipExt = (RelationshipExt) nb5Var.l(RelationshipExt.PROTOBUF_ADAPTER);
                }
            }
            return meetRelation;
        }

        public void serialize(MeetRelation meetRelation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RelationshipStatus relationshipStatus = meetRelation.status;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.K(1, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus2 = meetRelation.otherStatus;
            if (relationshipStatus2 != null) {
                codedOutputByteBufferNano.K(2, relationshipStatus2, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            RelationshipExt relationshipExt = meetRelation.relationshipExt;
            if (relationshipExt != null) {
                codedOutputByteBufferNano.K(3, relationshipExt, RelationshipExt.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MeetRelation> JSON_ADAPTER = new ObjectJsonAdapter<MeetRelation>() { // from class: com.p1.mobile.putong.core.data.MeetRelation.2
        public Class getDataClass() {
            return MeetRelation.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MeetRelation m14114newInstance() {
            return new MeetRelation();
        }

        public boolean parseField(MeetRelation meetRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherStatus":
                    meetRelation.otherStatus = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "relationshipExt":
                    meetRelation.relationshipExt = (RelationshipExt) RelationshipExt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    meetRelation.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(MeetRelation meetRelation, JsonGenerator jsonGenerator) throws IOException {
            if (meetRelation.status != null) {
                jsonGenerator.writeFieldName("status");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MeetRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MeetRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MeetRelation new_() {
        MeetRelation meetRelation = new MeetRelation();
        meetRelation.nullCheck();
        return meetRelation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MeetRelation m14112clone() {
        MeetRelation meetRelation = new MeetRelation();
        meetRelation.status = this.status;
        meetRelation.otherStatus = this.otherStatus;
        RelationshipExt relationshipExt = this.relationshipExt;
        if (relationshipExt != null) {
            meetRelation.relationshipExt = relationshipExt.m15378clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
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
