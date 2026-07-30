package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CustomMedia customMedia) {
            String str = customMedia.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = customMedia.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(3, customMedia.duration);
            String str3 = customMedia.mediaType;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            customMedia.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CustomMedia parse(nb5 nb5Var) throws IOException {
            CustomMedia customMedia = new CustomMedia();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    customMedia.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    customMedia.url = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    customMedia.duration = nb5Var.m158742k();
                } else {
                    if (iM158752u != 34) {
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
                    customMedia.mediaType = nb5Var.m158750s();
                }
            }
            return customMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CustomMedia customMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = customMedia.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = customMedia.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17252I(3, customMedia.duration);
            String str3 = customMedia.mediaType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<CustomMedia> JSON_ADAPTER = new ObjectJsonAdapter<CustomMedia>() { // from class: com.p1.mobile.putong.data.CustomMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CustomMedia.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CustomMedia newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CustomMedia customMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = customMedia.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = customMedia.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, customMedia.duration);
            String str3 = customMedia.mediaType;
            if (str3 != null) {
                jsonGenerator.writeStringField("mediaType", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CustomMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CustomMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CustomMedia new_() {
        CustomMedia customMedia = new CustomMedia();
        customMedia.nullCheck();
        return customMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CustomMedia mo223809clone() {
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
        String str2 = this.url;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.duration;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.mediaType;
        int iHashCode3 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
