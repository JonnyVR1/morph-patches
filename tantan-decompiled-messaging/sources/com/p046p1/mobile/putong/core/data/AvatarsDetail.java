package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class AvatarsDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "avatarsdetail";

    @NonNull
    @ProtobufIndex(index = 2)
    public String mediaType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String size;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<AvatarsDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<AvatarsDetail>() { // from class: com.p1.mobile.putong.core.data.AvatarsDetail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AvatarsDetail avatarsDetail) {
            String str = avatarsDetail.url;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = avatarsDetail.mediaType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = avatarsDetail.size;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            avatarsDetail.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AvatarsDetail parse(nb5 nb5Var) throws IOException {
            AvatarsDetail avatarsDetail = new AvatarsDetail();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (avatarsDetail.url == null) {
                        avatarsDetail.url = "";
                    }
                    if (avatarsDetail.mediaType == null) {
                        avatarsDetail.mediaType = "";
                    }
                    if (avatarsDetail.size != null) {
                        break;
                    }
                    avatarsDetail.size = "";
                    break;
                }
                if (iM158752u == 10) {
                    avatarsDetail.url = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    avatarsDetail.mediaType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (avatarsDetail.url == null) {
                            avatarsDetail.url = "";
                        }
                        if (avatarsDetail.mediaType == null) {
                            avatarsDetail.mediaType = "";
                        }
                        if (avatarsDetail.size != null) {
                            break;
                        }
                        avatarsDetail.size = "";
                        return avatarsDetail;
                    }
                    avatarsDetail.size = nb5Var.m158750s();
                }
            }
            return avatarsDetail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AvatarsDetail avatarsDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarsDetail.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = avatarsDetail.mediaType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = avatarsDetail.size;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<AvatarsDetail> JSON_ADAPTER = new ObjectJsonAdapter<AvatarsDetail>() { // from class: com.p1.mobile.putong.core.data.AvatarsDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AvatarsDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AvatarsDetail newInstance() {
            return new AvatarsDetail();
        }

        public boolean parseField(AvatarsDetail avatarsDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "url":
                    avatarsDetail.url = jsonParser.getValueAsString();
                    return true;
                case "size":
                    avatarsDetail.size = jsonParser.getValueAsString();
                    return true;
                case "mediaType":
                    avatarsDetail.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AvatarsDetail avatarsDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "url":
                case "size":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(avatarsDetail, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AvatarsDetail avatarsDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = avatarsDetail.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = avatarsDetail.mediaType;
            if (str2 != null) {
                jsonGenerator.writeStringField("mediaType", str2);
            }
            String str3 = avatarsDetail.size;
            if (str3 != null) {
                jsonGenerator.writeStringField("size", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarsDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarsDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarsDetail new_() {
        AvatarsDetail avatarsDetail = new AvatarsDetail();
        avatarsDetail.nullCheck();
        return avatarsDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AvatarsDetail mo223809clone() {
        AvatarsDetail avatarsDetail = new AvatarsDetail();
        avatarsDetail.url = this.url;
        avatarsDetail.mediaType = this.mediaType;
        avatarsDetail.size = this.size;
        return avatarsDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarsDetail)) {
            return false;
        }
        AvatarsDetail avatarsDetail = (AvatarsDetail) obj;
        return ValueObject.util_equals(this.url, avatarsDetail.url) && ValueObject.util_equals(this.mediaType, avatarsDetail.mediaType) && ValueObject.util_equals(this.size, avatarsDetail.size);
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mediaType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.size;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.mediaType == null) {
            this.mediaType = "";
        }
        if (this.size == null) {
            this.size = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
