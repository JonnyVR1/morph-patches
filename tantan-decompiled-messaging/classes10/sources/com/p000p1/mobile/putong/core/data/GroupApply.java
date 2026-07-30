package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class GroupApply extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupapply";

    @ProtobufIndex(index = 6)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String groupId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f66id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String reason;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public GroupApplyStatus status;

    @ProtobufIndex(index = 7)
    public double updatedTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;
    public static ProtobufAdapter<GroupApply> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupApply>() { // from class: com.p1.mobile.putong.core.data.GroupApply.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupApply groupApply) {
            String str = groupApply.f66id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = groupApply.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = groupApply.groupId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = groupApply.reason;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            GroupApplyStatus groupApplyStatus = groupApply.status;
            if (groupApplyStatus != null) {
                iO += CodedOutputByteBufferNano.h(5, groupApplyStatus.ordinal());
            }
            int iD = iO + CodedOutputByteBufferNano.d(6, groupApply.createdTime) + CodedOutputByteBufferNano.d(7, groupApply.updatedTime);
            GroupApplyStatus groupApplyStatus2 = groupApply.status;
            if (groupApplyStatus2 != null) {
                iD += CodedOutputByteBufferNano.l(8, groupApplyStatus2, GroupApplyStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) groupApply).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupApply m13065parse(nb5 nb5Var) throws IOException {
            GroupApply groupApply = new GroupApply();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (groupApply.status == null && numValueOf != null) {
                        groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (groupApply.f66id == null) {
                        groupApply.f66id = "";
                    }
                    if (groupApply.userId == null) {
                        groupApply.userId = "";
                    }
                    if (groupApply.groupId == null) {
                        groupApply.groupId = "";
                    }
                    if (groupApply.reason == null) {
                        groupApply.reason = "";
                    }
                    if (groupApply.status != null) {
                        break;
                    }
                    groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    groupApply.f66id = nb5Var.s();
                } else if (iU == 18) {
                    groupApply.userId = nb5Var.s();
                } else if (iU == 26) {
                    groupApply.groupId = nb5Var.s();
                } else if (iU == 34) {
                    groupApply.reason = nb5Var.s();
                } else if (iU == 40) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 49) {
                    groupApply.createdTime = nb5Var.h();
                } else if (iU == 57) {
                    groupApply.updatedTime = nb5Var.h();
                } else {
                    if (iU != 66) {
                        if (groupApply.status == null && numValueOf != null) {
                            groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (groupApply.f66id == null) {
                            groupApply.f66id = "";
                        }
                        if (groupApply.userId == null) {
                            groupApply.userId = "";
                        }
                        if (groupApply.groupId == null) {
                            groupApply.groupId = "";
                        }
                        if (groupApply.reason == null) {
                            groupApply.reason = "";
                        }
                        if (groupApply.status != null) {
                            break;
                        }
                        groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.defaultEnum();
                        return groupApply;
                    }
                    groupApply.status = (GroupApplyStatus) nb5Var.l(GroupApplyStatus.PROTOBUF_ADAPTER);
                }
            }
            return groupApply;
        }

        public void serialize(GroupApply groupApply, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupApply.f66id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = groupApply.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = groupApply.groupId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = groupApply.reason;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            GroupApplyStatus groupApplyStatus = groupApply.status;
            if (groupApplyStatus != null) {
                codedOutputByteBufferNano.G(5, groupApplyStatus.ordinal());
            }
            codedOutputByteBufferNano.C(6, groupApply.createdTime);
            codedOutputByteBufferNano.C(7, groupApply.updatedTime);
            GroupApplyStatus groupApplyStatus2 = groupApply.status;
            if (groupApplyStatus2 != null) {
                codedOutputByteBufferNano.K(8, groupApplyStatus2, GroupApplyStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GroupApply> JSON_ADAPTER = new ObjectJsonAdapter<GroupApply>() { // from class: com.p1.mobile.putong.core.data.GroupApply.2
        public Class getDataClass() {
            return GroupApply.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupApply m13066newInstance() {
            return new GroupApply();
        }

        public boolean parseField(GroupApply groupApply, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    groupApply.reason = jsonParser.getValueAsString();
                    return true;
                case "status":
                    groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userId":
                    groupApply.userId = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    groupApply.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "createdTime":
                    groupApply.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    groupApply.f66id = jsonParser.getValueAsString();
                    return false;
                case "groupId":
                    groupApply.groupId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupApply groupApply, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reason":
                case "status":
                case "userId":
                case "updatedTime":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "groupId":
                    return true;
                default:
                    return super.parseFieldCheck(groupApply, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GroupApply groupApply, JsonGenerator jsonGenerator) throws IOException {
            String str = groupApply.f66id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = groupApply.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = groupApply.groupId;
            if (str3 != null) {
                jsonGenerator.writeStringField("groupId", str3);
            }
            String str4 = groupApply.reason;
            if (str4 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str4);
            }
            if (groupApply.status != null) {
                jsonGenerator.writeFieldName("status");
                GroupApplyStatus.JSON_ADAPTER.serialize(groupApply.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(groupApply.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("updatedTime");
            jsonAdapter.serialize(Double.valueOf(groupApply.updatedTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupApply new_() {
        GroupApply groupApply = new GroupApply();
        groupApply.nullCheck();
        return groupApply;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupApply m13064clone() {
        GroupApply groupApply = new GroupApply();
        groupApply.f66id = this.f66id;
        groupApply.userId = this.userId;
        groupApply.groupId = this.groupId;
        groupApply.reason = this.reason;
        groupApply.status = this.status;
        groupApply.createdTime = this.createdTime;
        groupApply.updatedTime = this.updatedTime;
        return groupApply;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupApply)) {
            return false;
        }
        GroupApply groupApply = (GroupApply) obj;
        return ValueObject.util_equals(this.f66id, groupApply.f66id) && ValueObject.util_equals(this.userId, groupApply.userId) && ValueObject.util_equals(this.groupId, groupApply.groupId) && ValueObject.util_equals(this.reason, groupApply.reason) && ValueObject.util_equals(this.status, groupApply.status) && this.createdTime == groupApply.createdTime && this.updatedTime == groupApply.updatedTime;
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
        String str = this.f66id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.groupId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.reason;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        GroupApplyStatus groupApplyStatus = this.status;
        int iHashCode5 = groupApplyStatus != null ? groupApplyStatus.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode4 + iHashCode5) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.updatedTime);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
        if (this.f66id == null) {
            this.f66id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.groupId == null) {
            this.groupId = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
        if (this.status == null) {
            this.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
