package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class GroupInvitation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupinvitation";

    @NonNull
    @ProtobufIndex(index = 3)
    public Button button;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public Target target;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<GroupInvitation> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupInvitation>() { // from class: com.p1.mobile.putong.core.data.GroupInvitation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupInvitation groupInvitation) {
            String str = groupInvitation.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = groupInvitation.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            Button button = groupInvitation.button;
            if (button != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, button, Button.PROTOBUF_ADAPTER);
            }
            Target target = groupInvitation.target;
            if (target != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, target, Target.PROTOBUF_ADAPTER);
            }
            groupInvitation.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupInvitation parse(nc5 nc5Var) throws IOException {
            GroupInvitation groupInvitation = new GroupInvitation();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (groupInvitation.title == null) {
                        groupInvitation.title = "";
                    }
                    if (groupInvitation.subTitle == null) {
                        groupInvitation.subTitle = "";
                    }
                    if (groupInvitation.button == null) {
                        groupInvitation.button = Button.new_();
                    }
                    if (groupInvitation.target != null) {
                        break;
                    }
                    groupInvitation.target = Target.new_();
                    break;
                }
                if (iM162497u == 10) {
                    groupInvitation.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    groupInvitation.subTitle = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    groupInvitation.button = (Button) nc5Var.m162488l(Button.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (groupInvitation.title == null) {
                            groupInvitation.title = "";
                        }
                        if (groupInvitation.subTitle == null) {
                            groupInvitation.subTitle = "";
                        }
                        if (groupInvitation.button == null) {
                            groupInvitation.button = Button.new_();
                        }
                        if (groupInvitation.target != null) {
                            break;
                        }
                        groupInvitation.target = Target.new_();
                        return groupInvitation;
                    }
                    groupInvitation.target = (Target) nc5Var.m162488l(Target.PROTOBUF_ADAPTER);
                }
            }
            return groupInvitation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupInvitation groupInvitation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupInvitation.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = groupInvitation.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            Button button = groupInvitation.button;
            if (button != null) {
                codedOutputByteBufferNano.m17309K(3, button, Button.PROTOBUF_ADAPTER);
            }
            Target target = groupInvitation.target;
            if (target != null) {
                codedOutputByteBufferNano.m17309K(4, target, Target.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GroupInvitation> JSON_ADAPTER = new ObjectJsonAdapter<GroupInvitation>() { // from class: com.p1.mobile.putong.core.data.GroupInvitation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupInvitation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupInvitation newInstance() {
            return new GroupInvitation();
        }

        public boolean parseField(GroupInvitation groupInvitation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    groupInvitation.subTitle = jsonParser.getValueAsString();
                    return true;
                case "button":
                    groupInvitation.button = Button.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "target":
                    groupInvitation.target = Target.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    groupInvitation.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupInvitation groupInvitation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "button":
                case "target":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(groupInvitation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupInvitation groupInvitation, JsonGenerator jsonGenerator) throws IOException {
            String str = groupInvitation.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = groupInvitation.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            if (groupInvitation.button != null) {
                jsonGenerator.writeFieldName("button");
                Button.JSON_ADAPTER.serialize(groupInvitation.button, jsonGenerator, true);
            }
            if (groupInvitation.target != null) {
                jsonGenerator.writeFieldName(Target.TYPE);
                Target.JSON_ADAPTER.serialize(groupInvitation.target, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupInvitation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupInvitation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupInvitation new_() {
        GroupInvitation groupInvitation = new GroupInvitation();
        groupInvitation.nullCheck();
        return groupInvitation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupInvitation mo225055clone() {
        GroupInvitation groupInvitation = new GroupInvitation();
        groupInvitation.title = this.title;
        groupInvitation.subTitle = this.subTitle;
        Button button = this.button;
        if (button != null) {
            groupInvitation.button = button.mo225055clone();
        }
        Target target = this.target;
        if (target != null) {
            groupInvitation.target = target.mo225055clone();
        }
        return groupInvitation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupInvitation)) {
            return false;
        }
        GroupInvitation groupInvitation = (GroupInvitation) obj;
        return ValueObject.util_equals(this.title, groupInvitation.title) && ValueObject.util_equals(this.subTitle, groupInvitation.subTitle) && ValueObject.util_equals(this.button, groupInvitation.button) && ValueObject.util_equals(this.target, groupInvitation.target);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Button button = this.button;
        int iHashCode3 = (iHashCode2 + (button != null ? button.hashCode() : 0)) * 41;
        Target target = this.target;
        int iHashCode4 = iHashCode3 + (target != null ? target.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.button == null) {
            this.button = Button.new_();
        }
        if (this.target == null) {
            this.target = Target.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
