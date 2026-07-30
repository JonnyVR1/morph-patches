package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.LocationInvisibleField;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: classes10.dex */
public class GroupApply extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupapply";

    @ProtobufIndex(index = 6)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String groupId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21146id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String reason;

    @NonNull
    @ProtobufIndex(index = 5)
    public GroupApplyStatus status;

    @ProtobufIndex(index = 7)
    public double updatedTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;
    public static ProtobufAdapter<GroupApply> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupApply>() { // from class: com.p1.mobile.putong.core.data.GroupApply.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupApply groupApply) {
            String str = groupApply.f21146id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = groupApply.userId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = groupApply.groupId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = groupApply.reason;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            GroupApplyStatus groupApplyStatus = groupApply.status;
            if (groupApplyStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(5, groupApplyStatus.ordinal());
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(6, groupApply.createdTime) + CodedOutputByteBufferNano.m17277d(7, groupApply.updatedTime);
            GroupApplyStatus groupApplyStatus2 = groupApply.status;
            if (groupApplyStatus2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(8, groupApplyStatus2, GroupApplyStatus.PROTOBUF_ADAPTER);
            }
            groupApply.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupApply parse(nc5 nc5Var) throws IOException {
            GroupApply groupApply = new GroupApply();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (groupApply.status == null && numValueOf != null) {
                        groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (groupApply.f21146id == null) {
                        groupApply.f21146id = "";
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
                if (iM162497u == 10) {
                    groupApply.f21146id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    groupApply.userId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    groupApply.groupId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    groupApply.reason = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 49) {
                    groupApply.createdTime = nc5Var.m162484h();
                } else if (iM162497u == 57) {
                    groupApply.updatedTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 66) {
                        if (groupApply.status == null && numValueOf != null) {
                            groupApply.status = (GroupApplyStatus) GroupApplyStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (groupApply.f21146id == null) {
                            groupApply.f21146id = "";
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
                    groupApply.status = (GroupApplyStatus) nc5Var.m162488l(GroupApplyStatus.PROTOBUF_ADAPTER);
                }
            }
            return groupApply;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupApply groupApply, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupApply.f21146id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = groupApply.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = groupApply.groupId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = groupApply.reason;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            GroupApplyStatus groupApplyStatus = groupApply.status;
            if (groupApplyStatus != null) {
                codedOutputByteBufferNano.m17305G(5, groupApplyStatus.ordinal());
            }
            codedOutputByteBufferNano.m17301C(6, groupApply.createdTime);
            codedOutputByteBufferNano.m17301C(7, groupApply.updatedTime);
            GroupApplyStatus groupApplyStatus2 = groupApply.status;
            if (groupApplyStatus2 != null) {
                codedOutputByteBufferNano.m17309K(8, groupApplyStatus2, GroupApplyStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GroupApply> JSON_ADAPTER = new ObjectJsonAdapter<GroupApply>() { // from class: com.p1.mobile.putong.core.data.GroupApply.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupApply.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupApply newInstance() {
            return new GroupApply();
        }

        public boolean parseField(GroupApply groupApply, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    groupApply.reason = jsonParser.getValueAsString();
                    return true;
                case "status":
                    groupApply.status = GroupApplyStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userId":
                    groupApply.userId = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    groupApply.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "createdTime":
                    groupApply.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    groupApply.f21146id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupApply groupApply, JsonGenerator jsonGenerator) throws IOException {
            String str = groupApply.f21146id;
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
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                GroupApplyStatus.JSON_ADAPTER.serialize(groupApply.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(groupApply.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            jsonAdapter.serialize(Double.valueOf(groupApply.updatedTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupApply new_() {
        GroupApply groupApply = new GroupApply();
        groupApply.nullCheck();
        return groupApply;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupApply mo225055clone() {
        GroupApply groupApply = new GroupApply();
        groupApply.f21146id = this.f21146id;
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
        return ValueObject.util_equals(this.f21146id, groupApply.f21146id) && ValueObject.util_equals(this.userId, groupApply.userId) && ValueObject.util_equals(this.groupId, groupApply.groupId) && ValueObject.util_equals(this.reason, groupApply.reason) && ValueObject.util_equals(this.status, groupApply.status) && this.createdTime == groupApply.createdTime && this.updatedTime == groupApply.updatedTime;
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
        String str = this.f21146id;
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
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21146id == null) {
            this.f21146id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
