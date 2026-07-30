package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class GroupMemberStatistic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupmemberstatistic";

    @NonNull
    @ProtobufIndex(index = 3)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @ProtobufIndex(index = 1)
    public double percentage;

    @NonNull
    @ProtobufIndex(index = 4)
    public String textColor;
    public static ProtobufAdapter<GroupMemberStatistic> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupMemberStatistic>() { // from class: com.p1.mobile.putong.core.data.GroupMemberStatistic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupMemberStatistic groupMemberStatistic) {
            int iM17222d = CodedOutputByteBufferNano.m17222d(1, groupMemberStatistic.percentage);
            String str = groupMemberStatistic.description;
            if (str != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = groupMemberStatistic.backgroundColor;
            if (str2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = groupMemberStatistic.textColor;
            if (str3 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            groupMemberStatistic.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupMemberStatistic parse(nb5 nb5Var) throws IOException {
            GroupMemberStatistic groupMemberStatistic = new GroupMemberStatistic();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (groupMemberStatistic.description == null) {
                        groupMemberStatistic.description = "";
                    }
                    if (groupMemberStatistic.backgroundColor == null) {
                        groupMemberStatistic.backgroundColor = "";
                    }
                    if (groupMemberStatistic.textColor != null) {
                        break;
                    }
                    groupMemberStatistic.textColor = "";
                    break;
                }
                if (iM158752u == 9) {
                    groupMemberStatistic.percentage = nb5Var.m158739h();
                } else if (iM158752u == 18) {
                    groupMemberStatistic.description = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    groupMemberStatistic.backgroundColor = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (groupMemberStatistic.description == null) {
                            groupMemberStatistic.description = "";
                        }
                        if (groupMemberStatistic.backgroundColor == null) {
                            groupMemberStatistic.backgroundColor = "";
                        }
                        if (groupMemberStatistic.textColor != null) {
                            break;
                        }
                        groupMemberStatistic.textColor = "";
                        return groupMemberStatistic;
                    }
                    groupMemberStatistic.textColor = nb5Var.m158750s();
                }
            }
            return groupMemberStatistic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupMemberStatistic groupMemberStatistic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17246C(1, groupMemberStatistic.percentage);
            String str = groupMemberStatistic.description;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = groupMemberStatistic.backgroundColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = groupMemberStatistic.textColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<GroupMemberStatistic> JSON_ADAPTER = new ObjectJsonAdapter<GroupMemberStatistic>() { // from class: com.p1.mobile.putong.core.data.GroupMemberStatistic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupMemberStatistic.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupMemberStatistic newInstance() {
            return new GroupMemberStatistic();
        }

        public boolean parseField(GroupMemberStatistic groupMemberStatistic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    groupMemberStatistic.description = jsonParser.getValueAsString();
                    return true;
                case "textColor":
                    groupMemberStatistic.textColor = jsonParser.getValueAsString();
                    return true;
                case "percentage":
                    groupMemberStatistic.percentage = jsonParser.getValueAsDouble();
                    return true;
                case "backgroundColor":
                    groupMemberStatistic.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupMemberStatistic groupMemberStatistic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "textColor":
                case "percentage":
                case "backgroundColor":
                    return true;
                default:
                    return super.parseFieldCheck(groupMemberStatistic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupMemberStatistic groupMemberStatistic, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("percentage", groupMemberStatistic.percentage);
            String str = groupMemberStatistic.description;
            if (str != null) {
                jsonGenerator.writeStringField("description", str);
            }
            String str2 = groupMemberStatistic.backgroundColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundColor", str2);
            }
            String str3 = groupMemberStatistic.textColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("textColor", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupMemberStatistic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupMemberStatistic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupMemberStatistic new_() {
        GroupMemberStatistic groupMemberStatistic = new GroupMemberStatistic();
        groupMemberStatistic.nullCheck();
        return groupMemberStatistic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupMemberStatistic mo223809clone() {
        GroupMemberStatistic groupMemberStatistic = new GroupMemberStatistic();
        groupMemberStatistic.percentage = this.percentage;
        groupMemberStatistic.description = this.description;
        groupMemberStatistic.backgroundColor = this.backgroundColor;
        groupMemberStatistic.textColor = this.textColor;
        return groupMemberStatistic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupMemberStatistic)) {
            return false;
        }
        GroupMemberStatistic groupMemberStatistic = (GroupMemberStatistic) obj;
        return this.percentage == groupMemberStatistic.percentage && ValueObject.util_equals(this.description, groupMemberStatistic.description) && ValueObject.util_equals(this.backgroundColor, groupMemberStatistic.backgroundColor) && ValueObject.util_equals(this.textColor, groupMemberStatistic.textColor);
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.percentage);
        int i2 = ((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.description;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.textColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.description == null) {
            this.description = "";
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
