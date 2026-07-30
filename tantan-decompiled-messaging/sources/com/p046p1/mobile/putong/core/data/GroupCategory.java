package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class GroupCategory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupcategory";

    @NonNull
    @ProtobufIndex(index = 3)
    public String backgroundColor;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20405id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String textColor;
    public static ProtobufAdapter<GroupCategory> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupCategory>() { // from class: com.p1.mobile.putong.core.data.GroupCategory.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupCategory groupCategory) {
            String str = groupCategory.f20405id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = groupCategory.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = groupCategory.backgroundColor;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = groupCategory.textColor;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            groupCategory.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupCategory parse(nb5 nb5Var) throws IOException {
            GroupCategory groupCategory = new GroupCategory();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (groupCategory.f20405id == null) {
                        groupCategory.f20405id = "";
                    }
                    if (groupCategory.name == null) {
                        groupCategory.name = "";
                    }
                    if (groupCategory.backgroundColor == null) {
                        groupCategory.backgroundColor = "";
                    }
                    if (groupCategory.textColor != null) {
                        break;
                    }
                    groupCategory.textColor = "";
                    break;
                }
                if (iM158752u == 10) {
                    groupCategory.f20405id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    groupCategory.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    groupCategory.backgroundColor = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (groupCategory.f20405id == null) {
                            groupCategory.f20405id = "";
                        }
                        if (groupCategory.name == null) {
                            groupCategory.name = "";
                        }
                        if (groupCategory.backgroundColor == null) {
                            groupCategory.backgroundColor = "";
                        }
                        if (groupCategory.textColor != null) {
                            break;
                        }
                        groupCategory.textColor = "";
                        return groupCategory;
                    }
                    groupCategory.textColor = nb5Var.m158750s();
                }
            }
            return groupCategory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupCategory groupCategory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupCategory.f20405id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = groupCategory.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = groupCategory.backgroundColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = groupCategory.textColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<GroupCategory> JSON_ADAPTER = new ObjectJsonAdapter<GroupCategory>() { // from class: com.p1.mobile.putong.core.data.GroupCategory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupCategory.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupCategory newInstance() {
            return new GroupCategory();
        }

        public boolean parseField(GroupCategory groupCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textColor":
                    groupCategory.textColor = jsonParser.getValueAsString();
                    return true;
                case "id":
                    groupCategory.f20405id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    groupCategory.name = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    groupCategory.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupCategory groupCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "textColor":
                    return true;
                case "id":
                    return false;
                case "name":
                case "backgroundColor":
                    return true;
                default:
                    return super.parseFieldCheck(groupCategory, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupCategory groupCategory, JsonGenerator jsonGenerator) throws IOException {
            String str = groupCategory.f20405id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = groupCategory.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = groupCategory.backgroundColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("backgroundColor", str3);
            }
            String str4 = groupCategory.textColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("textColor", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupCategory new_() {
        GroupCategory groupCategory = new GroupCategory();
        groupCategory.nullCheck();
        return groupCategory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupCategory mo223809clone() {
        GroupCategory groupCategory = new GroupCategory();
        groupCategory.f20405id = this.f20405id;
        groupCategory.name = this.name;
        groupCategory.backgroundColor = this.backgroundColor;
        groupCategory.textColor = this.textColor;
        return groupCategory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupCategory)) {
            return false;
        }
        GroupCategory groupCategory = (GroupCategory) obj;
        return ValueObject.util_equals(this.f20405id, groupCategory.f20405id) && ValueObject.util_equals(this.name, groupCategory.name) && ValueObject.util_equals(this.backgroundColor, groupCategory.backgroundColor) && ValueObject.util_equals(this.textColor, groupCategory.textColor);
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
        String str = this.f20405id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.textColor;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20405id == null) {
            this.f20405id = "";
        }
        if (this.name == null) {
            this.name = "";
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
