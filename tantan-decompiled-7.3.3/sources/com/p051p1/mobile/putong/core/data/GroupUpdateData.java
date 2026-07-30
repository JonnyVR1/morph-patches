package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Picture;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class GroupUpdateData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupupdatedata";

    @Nullable
    @ProtobufIndex(index = 3)
    public List<Picture> avatars;

    @Nullable
    @ProtobufIndex(index = 2)
    public String description;

    @Nullable
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<GroupUpdateData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupUpdateData>() { // from class: com.p1.mobile.putong.core.data.GroupUpdateData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GroupUpdateData groupUpdateData) {
            String str = groupUpdateData.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = groupUpdateData.description;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<Picture> list = groupUpdateData.avatars;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            groupUpdateData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GroupUpdateData parse(nc5 nc5Var) throws IOException {
            GroupUpdateData groupUpdateData = new GroupUpdateData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    groupUpdateData.name = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    groupUpdateData.description = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        return groupUpdateData;
                    }
                    groupUpdateData.avatars = (List) nc5Var.m162488l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GroupUpdateData groupUpdateData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupUpdateData.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = groupUpdateData.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<Picture> list = groupUpdateData.avatars;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GroupUpdateData> JSON_ADAPTER = new ObjectJsonAdapter<GroupUpdateData>() { // from class: com.p1.mobile.putong.core.data.GroupUpdateData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GroupUpdateData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GroupUpdateData newInstance() {
            return new GroupUpdateData();
        }

        public boolean parseField(GroupUpdateData groupUpdateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    groupUpdateData.description = jsonParser.getValueAsString();
                    return true;
                case "avatars":
                    groupUpdateData.avatars = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_PICTURE, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    groupUpdateData.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GroupUpdateData groupUpdateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "avatars":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(groupUpdateData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GroupUpdateData groupUpdateData, JsonGenerator jsonGenerator) throws IOException {
            String str = groupUpdateData.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = groupUpdateData.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            if (groupUpdateData.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(groupUpdateData.avatars, jsonGenerator, Converter.RAW_PICTURE_TO_PICTURE);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupUpdateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupUpdateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupUpdateData new_() {
        GroupUpdateData groupUpdateData = new GroupUpdateData();
        groupUpdateData.nullCheck();
        return groupUpdateData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GroupUpdateData mo225055clone() {
        GroupUpdateData groupUpdateData = new GroupUpdateData();
        groupUpdateData.name = this.name;
        groupUpdateData.description = this.description;
        List<Picture> list = this.avatars;
        if (list != null) {
            groupUpdateData.avatars = ValueObject.util_map(list, new qcj() { // from class: l.ypk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Picture) obj).mo225055clone();
                }
            });
        }
        return groupUpdateData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupUpdateData)) {
            return false;
        }
        GroupUpdateData groupUpdateData = (GroupUpdateData) obj;
        return ValueObject.util_equals(this.name, groupUpdateData.name) && ValueObject.util_equals(this.description, groupUpdateData.description) && ValueObject.util_equals(this.avatars, groupUpdateData.avatars);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Picture> list = this.avatars;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
