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
public class GroupTab extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "grouptab";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f69id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;
    public static ProtobufAdapter<GroupTab> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupTab>() { // from class: com.p1.mobile.putong.core.data.GroupTab.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupTab groupTab) {
            int iH = CodedOutputByteBufferNano.h(1, groupTab.f69id);
            String str = groupTab.name;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) groupTab).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupTab m13107parse(nb5 nb5Var) throws IOException {
            GroupTab groupTab = new GroupTab();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (groupTab.name != null) {
                        break;
                    }
                    groupTab.name = "";
                    break;
                }
                if (iU == 8) {
                    groupTab.f69id = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (groupTab.name != null) {
                            break;
                        }
                        groupTab.name = "";
                        return groupTab;
                    }
                    groupTab.name = nb5Var.s();
                }
            }
            return groupTab;
        }

        public void serialize(GroupTab groupTab, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, groupTab.f69id);
            String str = groupTab.name;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<GroupTab> JSON_ADAPTER = new ObjectJsonAdapter<GroupTab>() { // from class: com.p1.mobile.putong.core.data.GroupTab.2
        public Class getDataClass() {
            return GroupTab.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupTab m13108newInstance() {
            return new GroupTab();
        }

        public boolean parseField(GroupTab groupTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                groupTab.f69id = jsonParser.getValueAsInt();
                return false;
            }
            if (!str.equals("name")) {
                return false;
            }
            groupTab.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GroupTab groupTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(groupTab, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GroupTab groupTab, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", groupTab.f69id);
            String str = groupTab.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupTab new_() {
        GroupTab groupTab = new GroupTab();
        groupTab.nullCheck();
        return groupTab;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupTab m13106clone() {
        GroupTab groupTab = new GroupTab();
        groupTab.f69id = this.f69id;
        groupTab.name = this.name;
        return groupTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupTab)) {
            return false;
        }
        GroupTab groupTab = (GroupTab) obj;
        return this.f69id == groupTab.f69id && ValueObject.util_equals(this.name, groupTab.name);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f69id) * 41;
        String str = this.name;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
