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
public class GroupCreationType extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupcreationtype";

    @NonNull
    @ProtobufIndex(index = 1)
    public String defaultType;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean selectable;
    public static ProtobufAdapter<GroupCreationType> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupCreationType>() { // from class: com.p1.mobile.putong.core.data.GroupCreationType.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupCreationType groupCreationType) {
            String str = groupCreationType.defaultType;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, groupCreationType.selectable);
            ((MessageNano) groupCreationType).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupCreationType m13087parse(nb5 nb5Var) throws IOException {
            GroupCreationType groupCreationType = new GroupCreationType();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (groupCreationType.defaultType != null) {
                        break;
                    }
                    groupCreationType.defaultType = "";
                    break;
                }
                if (iU == 10) {
                    groupCreationType.defaultType = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (groupCreationType.defaultType != null) {
                            break;
                        }
                        groupCreationType.defaultType = "";
                        return groupCreationType;
                    }
                    groupCreationType.selectable = nb5Var.g();
                }
            }
            return groupCreationType;
        }

        public void serialize(GroupCreationType groupCreationType, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupCreationType.defaultType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, groupCreationType.selectable);
        }
    };
    public static JsonAdapter<GroupCreationType> JSON_ADAPTER = new ObjectJsonAdapter<GroupCreationType>() { // from class: com.p1.mobile.putong.core.data.GroupCreationType.2
        public Class getDataClass() {
            return GroupCreationType.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupCreationType m13088newInstance() {
            return new GroupCreationType();
        }

        public boolean parseField(GroupCreationType groupCreationType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selectable")) {
                groupCreationType.selectable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("defaultType")) {
                return false;
            }
            groupCreationType.defaultType = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GroupCreationType groupCreationType, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selectable") || str.equals("defaultType")) {
                return true;
            }
            return super.parseFieldCheck(groupCreationType, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GroupCreationType groupCreationType, JsonGenerator jsonGenerator) throws IOException {
            String str = groupCreationType.defaultType;
            if (str != null) {
                jsonGenerator.writeStringField("defaultType", str);
            }
            jsonGenerator.writeBooleanField("selectable", groupCreationType.selectable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupCreationType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupCreationType) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupCreationType new_() {
        GroupCreationType groupCreationType = new GroupCreationType();
        groupCreationType.nullCheck();
        return groupCreationType;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupCreationType m13086clone() {
        GroupCreationType groupCreationType = new GroupCreationType();
        groupCreationType.defaultType = this.defaultType;
        groupCreationType.selectable = this.selectable;
        return groupCreationType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupCreationType)) {
            return false;
        }
        GroupCreationType groupCreationType = (GroupCreationType) obj;
        return ValueObject.util_equals(this.defaultType, groupCreationType.defaultType) && this.selectable == groupCreationType.selectable;
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
        String str = this.defaultType;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.selectable ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.defaultType == null) {
            this.defaultType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
