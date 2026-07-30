package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class GroupTab extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "grouptab";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f21149id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<GroupTab> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupTab>() { // from class: com.p1.mobile.putong.core.data.GroupTab.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupTab groupTab) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, groupTab.f21149id);
            String str = groupTab.name;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            groupTab.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupTab parse(nc5 nc5Var) throws IOException {
            GroupTab groupTab = new GroupTab();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (groupTab.name != null) {
                        break;
                    }
                    groupTab.name = "";
                    break;
                }
                if (iM162497u == 8) {
                    groupTab.f21149id = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (groupTab.name != null) {
                            break;
                        }
                        groupTab.name = "";
                        return groupTab;
                    }
                    groupTab.name = nc5Var.m162495s();
                }
            }
            return groupTab;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupTab groupTab, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, groupTab.f21149id);
            String str = groupTab.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<GroupTab> JSON_ADAPTER = new ObjectJsonAdapter<GroupTab>() { // from class: com.p1.mobile.putong.core.data.GroupTab.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupTab.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupTab newInstance() {
            return new GroupTab();
        }

        public boolean parseField(GroupTab groupTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                groupTab.f21149id = jsonParser.getValueAsInt();
                return false;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
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
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(groupTab, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupTab groupTab, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", groupTab.f21149id);
            String str = groupTab.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupTab new_() {
        GroupTab groupTab = new GroupTab();
        groupTab.nullCheck();
        return groupTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupTab mo225055clone() {
        GroupTab groupTab = new GroupTab();
        groupTab.f21149id = this.f21149id;
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
        return this.f21149id == groupTab.f21149id && ValueObject.util_equals(this.name, groupTab.name);
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
        int i2 = ((i * 41) + this.f21149id) * 41;
        String str = this.name;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
