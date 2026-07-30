package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Picture;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GroupUpdateData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "groupupdatedata";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<Picture> avatars;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String description;

    @Nullable
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<GroupUpdateData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GroupUpdateData>() { // from class: com.p1.mobile.putong.core.data.GroupUpdateData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GroupUpdateData groupUpdateData) {
            String str = groupUpdateData.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = groupUpdateData.description;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<Picture> list = groupUpdateData.avatars;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) groupUpdateData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GroupUpdateData m13111parse(nb5 nb5Var) throws IOException {
            GroupUpdateData groupUpdateData = new GroupUpdateData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    groupUpdateData.name = nb5Var.s();
                } else if (iU == 18) {
                    groupUpdateData.description = nb5Var.s();
                } else {
                    if (iU != 26) {
                        return groupUpdateData;
                    }
                    groupUpdateData.avatars = (List) nb5Var.l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        public void serialize(GroupUpdateData groupUpdateData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = groupUpdateData.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = groupUpdateData.description;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<Picture> list = groupUpdateData.avatars;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GroupUpdateData> JSON_ADAPTER = new ObjectJsonAdapter<GroupUpdateData>() { // from class: com.p1.mobile.putong.core.data.GroupUpdateData.2
        public Class getDataClass() {
            return GroupUpdateData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GroupUpdateData m13112newInstance() {
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

        public void serializeFields(GroupUpdateData groupUpdateData, JsonGenerator jsonGenerator) throws IOException {
            String str = groupUpdateData.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GroupUpdateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GroupUpdateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GroupUpdateData new_() {
        GroupUpdateData groupUpdateData = new GroupUpdateData();
        groupUpdateData.nullCheck();
        return groupUpdateData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GroupUpdateData m13110clone() {
        GroupUpdateData groupUpdateData = new GroupUpdateData();
        groupUpdateData.name = this.name;
        groupUpdateData.description = this.description;
        List<Picture> list = this.avatars;
        if (list != null) {
            groupUpdateData.avatars = ValueObject.util_map(list, new w9j() { // from class: l.ink
                public final Object call(Object obj) {
                    return ((Picture) obj).clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
