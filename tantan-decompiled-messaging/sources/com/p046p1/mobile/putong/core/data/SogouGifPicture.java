package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Dimension;
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

/* JADX INFO: loaded from: classes10.dex */
public class SogouGifPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sogougifpicture";

    @ProtobufIndex(index = 4)
    public long duration;

    @NonNull
    @ProtobufIndex(index = 5)
    public String mediaType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public Dimension size;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<SogouGifPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<SogouGifPicture>() { // from class: com.p1.mobile.putong.core.data.SogouGifPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SogouGifPicture sogouGifPicture) {
            String str = sogouGifPicture.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = sogouGifPicture.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            Dimension dimension = sogouGifPicture.size;
            if (dimension != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(4, sogouGifPicture.duration);
            String str3 = sogouGifPicture.mediaType;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            sogouGifPicture.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SogouGifPicture parse(nb5 nb5Var) throws IOException {
            SogouGifPicture sogouGifPicture = new SogouGifPicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (sogouGifPicture.name == null) {
                        sogouGifPicture.name = "";
                    }
                    if (sogouGifPicture.url == null) {
                        sogouGifPicture.url = "";
                    }
                    if (sogouGifPicture.size == null) {
                        sogouGifPicture.size = Dimension.new_();
                    }
                    if (sogouGifPicture.mediaType != null) {
                        break;
                    }
                    sogouGifPicture.mediaType = "";
                    break;
                }
                if (iM158752u == 10) {
                    sogouGifPicture.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    sogouGifPicture.url = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    sogouGifPicture.size = (Dimension) nb5Var.m158743l(Dimension.PROTOBUF_ADAPTER);
                } else if (iM158752u == 32) {
                    sogouGifPicture.duration = nb5Var.m158742k();
                } else {
                    if (iM158752u != 42) {
                        if (sogouGifPicture.name == null) {
                            sogouGifPicture.name = "";
                        }
                        if (sogouGifPicture.url == null) {
                            sogouGifPicture.url = "";
                        }
                        if (sogouGifPicture.size == null) {
                            sogouGifPicture.size = Dimension.new_();
                        }
                        if (sogouGifPicture.mediaType != null) {
                            break;
                        }
                        sogouGifPicture.mediaType = "";
                        return sogouGifPicture;
                    }
                    sogouGifPicture.mediaType = nb5Var.m158750s();
                }
            }
            return sogouGifPicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SogouGifPicture sogouGifPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = sogouGifPicture.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = sogouGifPicture.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            Dimension dimension = sogouGifPicture.size;
            if (dimension != null) {
                codedOutputByteBufferNano.m17254K(3, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17252I(4, sogouGifPicture.duration);
            String str3 = sogouGifPicture.mediaType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
        }
    };
    public static JsonAdapter<SogouGifPicture> JSON_ADAPTER = new ObjectJsonAdapter<SogouGifPicture>() { // from class: com.p1.mobile.putong.core.data.SogouGifPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SogouGifPicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SogouGifPicture newInstance() {
            return new SogouGifPicture();
        }

        public boolean parseField(SogouGifPicture sogouGifPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    sogouGifPicture.duration = jsonParser.getValueAsLong();
                    return true;
                case "url":
                    sogouGifPicture.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    sogouGifPicture.name = jsonParser.getValueAsString();
                    return true;
                case "size":
                    sogouGifPicture.size = Dimension.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mediaType":
                    sogouGifPicture.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SogouGifPicture sogouGifPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "url":
                case "name":
                case "size":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(sogouGifPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SogouGifPicture sogouGifPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = sogouGifPicture.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = sogouGifPicture.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            if (sogouGifPicture.size != null) {
                jsonGenerator.writeFieldName("size");
                Dimension.JSON_ADAPTER.serialize(sogouGifPicture.size, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, sogouGifPicture.duration);
            String str3 = sogouGifPicture.mediaType;
            if (str3 != null) {
                jsonGenerator.writeStringField("mediaType", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SogouGifPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SogouGifPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SogouGifPicture new_() {
        SogouGifPicture sogouGifPicture = new SogouGifPicture();
        sogouGifPicture.nullCheck();
        return sogouGifPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SogouGifPicture mo223809clone() {
        SogouGifPicture sogouGifPicture = new SogouGifPicture();
        sogouGifPicture.name = this.name;
        sogouGifPicture.url = this.url;
        Dimension dimension = this.size;
        if (dimension != null) {
            sogouGifPicture.size = dimension.mo223809clone();
        }
        sogouGifPicture.duration = this.duration;
        sogouGifPicture.mediaType = this.mediaType;
        return sogouGifPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SogouGifPicture)) {
            return false;
        }
        SogouGifPicture sogouGifPicture = (SogouGifPicture) obj;
        return ValueObject.util_equals(this.name, sogouGifPicture.name) && ValueObject.util_equals(this.url, sogouGifPicture.url) && ValueObject.util_equals(this.size, sogouGifPicture.size) && this.duration == sogouGifPicture.duration && ValueObject.util_equals(this.mediaType, sogouGifPicture.mediaType);
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
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Dimension dimension = this.size;
        int iHashCode3 = dimension != null ? dimension.hashCode() : 0;
        long j = this.duration;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.mediaType;
        int iHashCode4 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.size == null) {
            this.size = Dimension.new_();
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
