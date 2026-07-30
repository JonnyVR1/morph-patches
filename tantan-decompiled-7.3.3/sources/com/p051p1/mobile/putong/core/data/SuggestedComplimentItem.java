package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Media;
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
public class SuggestedComplimentItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "suggestedcomplimentitem";

    @Nullable
    @ProtobufIndex(index = 5)
    public Media media;

    @NonNull
    @ProtobufIndex(index = 1)
    public String receiverId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String senderId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 4)
    public String value;
    public static ProtobufAdapter<SuggestedComplimentItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuggestedComplimentItem>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuggestedComplimentItem suggestedComplimentItem) {
            String str = suggestedComplimentItem.receiverId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = suggestedComplimentItem.senderId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = suggestedComplimentItem.type;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = suggestedComplimentItem.value;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            Media media = suggestedComplimentItem.media;
            if (media != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, media, Media.PROTOBUF_ADAPTER);
            }
            suggestedComplimentItem.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuggestedComplimentItem parse(nc5 nc5Var) throws IOException {
            SuggestedComplimentItem suggestedComplimentItem = new SuggestedComplimentItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (suggestedComplimentItem.receiverId == null) {
                        suggestedComplimentItem.receiverId = "";
                    }
                    if (suggestedComplimentItem.senderId == null) {
                        suggestedComplimentItem.senderId = "";
                    }
                    if (suggestedComplimentItem.type == null) {
                        suggestedComplimentItem.type = "";
                    }
                    if (suggestedComplimentItem.value != null) {
                        break;
                    }
                    suggestedComplimentItem.value = "";
                    break;
                }
                if (iM162497u == 10) {
                    suggestedComplimentItem.receiverId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    suggestedComplimentItem.senderId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    suggestedComplimentItem.type = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    suggestedComplimentItem.value = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (suggestedComplimentItem.receiverId == null) {
                            suggestedComplimentItem.receiverId = "";
                        }
                        if (suggestedComplimentItem.senderId == null) {
                            suggestedComplimentItem.senderId = "";
                        }
                        if (suggestedComplimentItem.type == null) {
                            suggestedComplimentItem.type = "";
                        }
                        if (suggestedComplimentItem.value != null) {
                            break;
                        }
                        suggestedComplimentItem.value = "";
                        return suggestedComplimentItem;
                    }
                    suggestedComplimentItem.media = (Media) nc5Var.m162488l(Media.PROTOBUF_ADAPTER);
                }
            }
            return suggestedComplimentItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuggestedComplimentItem suggestedComplimentItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = suggestedComplimentItem.receiverId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = suggestedComplimentItem.senderId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = suggestedComplimentItem.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = suggestedComplimentItem.value;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            Media media = suggestedComplimentItem.media;
            if (media != null) {
                codedOutputByteBufferNano.m17309K(5, media, Media.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SuggestedComplimentItem> JSON_ADAPTER = new ObjectJsonAdapter<SuggestedComplimentItem>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuggestedComplimentItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuggestedComplimentItem newInstance() {
            return new SuggestedComplimentItem();
        }

        public boolean parseField(SuggestedComplimentItem suggestedComplimentItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "type":
                    suggestedComplimentItem.type = jsonParser.getValueAsString();
                    return true;
                case "media":
                    suggestedComplimentItem.media = Converter.RAW_PICTURE_TO_MEDIA.parse(jsonParser, str2);
                    return true;
                case "value":
                    suggestedComplimentItem.value = jsonParser.getValueAsString();
                    return true;
                case "receiverId":
                    suggestedComplimentItem.receiverId = jsonParser.getValueAsString();
                    return true;
                case "senderId":
                    suggestedComplimentItem.senderId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SuggestedComplimentItem suggestedComplimentItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "type":
                case "media":
                case "value":
                case "receiverId":
                case "senderId":
                    return true;
                default:
                    return super.parseFieldCheck(suggestedComplimentItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuggestedComplimentItem suggestedComplimentItem, JsonGenerator jsonGenerator) throws IOException {
            String str = suggestedComplimentItem.receiverId;
            if (str != null) {
                jsonGenerator.writeStringField("receiverId", str);
            }
            String str2 = suggestedComplimentItem.senderId;
            if (str2 != null) {
                jsonGenerator.writeStringField("senderId", str2);
            }
            String str3 = suggestedComplimentItem.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = suggestedComplimentItem.value;
            if (str4 != null) {
                jsonGenerator.writeStringField("value", str4);
            }
            if (suggestedComplimentItem.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_MEDIA.serialize(suggestedComplimentItem.media, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuggestedComplimentItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuggestedComplimentItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuggestedComplimentItem new_() {
        SuggestedComplimentItem suggestedComplimentItem = new SuggestedComplimentItem();
        suggestedComplimentItem.nullCheck();
        return suggestedComplimentItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuggestedComplimentItem mo225055clone() {
        SuggestedComplimentItem suggestedComplimentItem = new SuggestedComplimentItem();
        suggestedComplimentItem.receiverId = this.receiverId;
        suggestedComplimentItem.senderId = this.senderId;
        suggestedComplimentItem.type = this.type;
        suggestedComplimentItem.value = this.value;
        Media media = this.media;
        if (media != null) {
            suggestedComplimentItem.media = media.mo225055clone();
        }
        return suggestedComplimentItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuggestedComplimentItem)) {
            return false;
        }
        SuggestedComplimentItem suggestedComplimentItem = (SuggestedComplimentItem) obj;
        return ValueObject.util_equals(this.receiverId, suggestedComplimentItem.receiverId) && ValueObject.util_equals(this.senderId, suggestedComplimentItem.senderId) && ValueObject.util_equals(this.type, suggestedComplimentItem.type) && ValueObject.util_equals(this.value, suggestedComplimentItem.value) && ValueObject.util_equals(this.media, suggestedComplimentItem.media);
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
        String str = this.receiverId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.senderId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.value;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        Media media = this.media;
        int iHashCode5 = iHashCode4 + (media != null ? media.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.receiverId == null) {
            this.receiverId = "";
        }
        if (this.senderId == null) {
            this.senderId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
