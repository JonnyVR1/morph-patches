package com.p046p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.ChatGuidePopUp;
import com.p046p1.mobile.putong.data.CustomMedia;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class CustomData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "customdata";

    @Nullable
    @ProtobufIndex(index = 2)
    public List<ChatGuidePopUp> chatGuidePopUps;

    @Nullable
    @ProtobufIndex(index = 1)
    public List<CustomMedia> media;
    public static ProtobufAdapter<CustomData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CustomData>() { // from class: com.p1.mobile.putong.data.CustomData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CustomData customData) {
            List<CustomMedia> list = customData.media;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, CustomMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<ChatGuidePopUp> list2 = customData.chatGuidePopUps;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ChatGuidePopUp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            customData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CustomData parse(nb5 nb5Var) throws IOException {
            CustomData customData = new CustomData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    customData.media = (List) nb5Var.m158743l(CustomMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        return customData;
                    }
                    customData.chatGuidePopUps = (List) nb5Var.m158743l(ChatGuidePopUp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CustomData customData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<CustomMedia> list = customData.media;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, CustomMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ChatGuidePopUp> list2 = customData.chatGuidePopUps;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ChatGuidePopUp.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CustomData> JSON_ADAPTER = new ObjectJsonAdapter<CustomData>() { // from class: com.p1.mobile.putong.data.CustomData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CustomData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CustomData newInstance() {
            return new CustomData();
        }

        public boolean parseField(CustomData customData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("media")) {
                customData.media = JsonAdapter.parseArray(jsonParser, CustomMedia.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("chatGuidePopUps")) {
                return false;
            }
            customData.chatGuidePopUps = JsonAdapter.parseArray(jsonParser, ChatGuidePopUp.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CustomData customData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("media") || str.equals("chatGuidePopUps")) {
                return true;
            }
            return super.parseFieldCheck(customData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CustomData customData, JsonGenerator jsonGenerator) throws IOException {
            if (customData.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(customData.media, jsonGenerator, CustomMedia.JSON_ADAPTER);
            }
            if (customData.chatGuidePopUps != null) {
                jsonGenerator.writeFieldName("chatGuidePopUps");
                JsonAdapter.serializeArray(customData.chatGuidePopUps, jsonGenerator, ChatGuidePopUp.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CustomData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CustomData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CustomData new_() {
        CustomData customData = new CustomData();
        customData.nullCheck();
        return customData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CustomData mo223809clone() {
        CustomData customData = new CustomData();
        List<CustomMedia> list = this.media;
        if (list != null) {
            customData.media = ValueObject.util_map(list, new w9j() { // from class: l.nxb
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CustomMedia) obj).mo223809clone();
                }
            });
        }
        List<ChatGuidePopUp> list2 = this.chatGuidePopUps;
        if (list2 != null) {
            customData.chatGuidePopUps = ValueObject.util_map(list2, new w9j() { // from class: l.oxb
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ChatGuidePopUp) obj).mo223809clone();
                }
            });
        }
        return customData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomData)) {
            return false;
        }
        CustomData customData = (CustomData) obj;
        return ValueObject.util_equals(this.media, customData.media) && ValueObject.util_equals(this.chatGuidePopUps, customData.chatGuidePopUps);
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
        List<CustomMedia> list = this.media;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<ChatGuidePopUp> list2 = this.chatGuidePopUps;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
