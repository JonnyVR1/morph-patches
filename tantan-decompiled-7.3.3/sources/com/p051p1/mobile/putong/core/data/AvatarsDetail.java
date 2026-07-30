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
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = avatarsDetail.mediaType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = avatarsDetail.size;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            avatarsDetail.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AvatarsDetail parse(nc5 nc5Var) throws IOException {
            AvatarsDetail avatarsDetail = new AvatarsDetail();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    avatarsDetail.url = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    avatarsDetail.mediaType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
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
                    avatarsDetail.size = nc5Var.m162495s();
                }
            }
            return avatarsDetail;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AvatarsDetail avatarsDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarsDetail.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = avatarsDetail.mediaType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = avatarsDetail.size;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<AvatarsDetail> JSON_ADAPTER = new ObjectJsonAdapter<AvatarsDetail>() { // from class: com.p1.mobile.putong.core.data.AvatarsDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AvatarsDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarsDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public AvatarsDetail mo225055clone() {
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
