package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CustomMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "custommedia";

    @ProtobufIndex(index = 3)
    public long duration;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mediaType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<CustomMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<CustomMedia>() { // from class: com.p1.mobile.putong.data.CustomMedia.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CustomMedia customMedia) {
            String str = customMedia.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = customMedia.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(3, customMedia.duration);
            String str3 = customMedia.mediaType;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) customMedia).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CustomMedia m17932parse(nb5 nb5Var) throws IOException {
            CustomMedia customMedia = new CustomMedia();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (customMedia.name == null) {
                        customMedia.name = "";
                    }
                    if (customMedia.url == null) {
                        customMedia.url = "";
                    }
                    if (customMedia.mediaType != null) {
                        break;
                    }
                    customMedia.mediaType = "";
                    break;
                }
                if (iU == 10) {
                    customMedia.name = nb5Var.s();
                } else if (iU == 18) {
                    customMedia.url = nb5Var.s();
                } else if (iU == 24) {
                    customMedia.duration = nb5Var.k();
                } else {
                    if (iU != 34) {
                        if (customMedia.name == null) {
                            customMedia.name = "";
                        }
                        if (customMedia.url == null) {
                            customMedia.url = "";
                        }
                        if (customMedia.mediaType != null) {
                            break;
                        }
                        customMedia.mediaType = "";
                        return customMedia;
                    }
                    customMedia.mediaType = nb5Var.s();
                }
            }
            return customMedia;
        }

        public void serialize(CustomMedia customMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = customMedia.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = customMedia.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.I(3, customMedia.duration);
            String str3 = customMedia.mediaType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<CustomMedia> JSON_ADAPTER = new ObjectJsonAdapter<CustomMedia>() { // from class: com.p1.mobile.putong.data.CustomMedia.2
        public Class getDataClass() {
            return CustomMedia.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CustomMedia mo17830newInstance() {
            return new CustomMedia();
        }

        public boolean parseField(CustomMedia customMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    customMedia.duration = jsonParser.getValueAsLong();
                    return true;
                case "url":
                    customMedia.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    customMedia.name = jsonParser.getValueAsString();
                    return true;
                case "mediaType":
                    customMedia.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CustomMedia customMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "url":
                case "name":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(customMedia, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CustomMedia customMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = customMedia.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = customMedia.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            jsonGenerator.writeNumberField("duration", customMedia.duration);
            String str3 = customMedia.mediaType;
            if (str3 != null) {
                jsonGenerator.writeStringField("mediaType", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CustomMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CustomMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CustomMedia new_() {
        CustomMedia customMedia = new CustomMedia();
        customMedia.nullCheck();
        return customMedia;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CustomMedia m17931clone() {
        CustomMedia customMedia = new CustomMedia();
        customMedia.name = this.name;
        customMedia.url = this.url;
        customMedia.duration = this.duration;
        customMedia.mediaType = this.mediaType;
        return customMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomMedia)) {
            return false;
        }
        CustomMedia customMedia = (CustomMedia) obj;
        return ValueObject.util_equals(this.name, customMedia.name) && ValueObject.util_equals(this.url, customMedia.url) && this.duration == customMedia.duration && ValueObject.util_equals(this.mediaType, customMedia.mediaType);
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
        String str2 = this.url;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.duration;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.mediaType;
        int iHashCode3 = i3 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.mediaType == null) {
            this.mediaType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
