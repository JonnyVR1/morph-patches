package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class GroupMemberStatistic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupmemberstatistic";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String description;

    @ProtobufIndex(index = 1)
    public double percentage;

    @NonNull
    @ProtobufIndex(index = 4)
    public String textColor;
    public static ProtobufAdapter<GroupMemberStatistic> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupMemberStatistic>() { // from class: com.p1.mobile.putong.core.data.GroupMemberStatistic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupMemberStatistic groupMemberStatistic) {
            int iD = CodedOutputByteBufferNano.d(1, groupMemberStatistic.percentage);
            String str = groupMemberStatistic.description;
            if (str != null) {
                iD += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = groupMemberStatistic.backgroundColor;
            if (str2 != null) {
                iD += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = groupMemberStatistic.textColor;
            if (str3 != null) {
                iD += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) groupMemberStatistic).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupMemberStatistic m13095parse(nb5 nb5Var) throws IOException {
            GroupMemberStatistic groupMemberStatistic = new GroupMemberStatistic();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 9) {
                    groupMemberStatistic.percentage = nb5Var.h();
                } else if (iU == 18) {
                    groupMemberStatistic.description = nb5Var.s();
                } else if (iU == 26) {
                    groupMemberStatistic.backgroundColor = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    groupMemberStatistic.textColor = nb5Var.s();
                }
            }
            return groupMemberStatistic;
        }

        public void serialize(GroupMemberStatistic groupMemberStatistic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, groupMemberStatistic.percentage);
            String str = groupMemberStatistic.description;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = groupMemberStatistic.backgroundColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = groupMemberStatistic.textColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<GroupMemberStatistic> JSON_ADAPTER = new ObjectJsonAdapter<GroupMemberStatistic>() { // from class: com.p1.mobile.putong.core.data.GroupMemberStatistic.2
        public Class getDataClass() {
            return GroupMemberStatistic.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupMemberStatistic m13096newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupMemberStatistic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupMemberStatistic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupMemberStatistic new_() {
        GroupMemberStatistic groupMemberStatistic = new GroupMemberStatistic();
        groupMemberStatistic.nullCheck();
        return groupMemberStatistic;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupMemberStatistic m13094clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
