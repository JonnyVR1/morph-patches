package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class GiftWallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwallinfo";

    @ProtobufIndex(index = 2)
    public int count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20399id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<GiftWallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallInfo>() { // from class: com.p1.mobile.putong.core.data.GiftWallInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftWallInfo giftWallInfo) {
            String str = giftWallInfo.f20399id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, giftWallInfo.count);
            String str2 = giftWallInfo.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = giftWallInfo.name;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            giftWallInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftWallInfo parse(nb5 nb5Var) throws IOException {
            GiftWallInfo giftWallInfo = new GiftWallInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (giftWallInfo.f20399id == null) {
                        giftWallInfo.f20399id = "";
                    }
                    if (giftWallInfo.url == null) {
                        giftWallInfo.url = "";
                    }
                    if (giftWallInfo.name != null) {
                        break;
                    }
                    giftWallInfo.name = "";
                    break;
                }
                if (iM158752u == 10) {
                    giftWallInfo.f20399id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    giftWallInfo.count = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    giftWallInfo.url = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (giftWallInfo.f20399id == null) {
                            giftWallInfo.f20399id = "";
                        }
                        if (giftWallInfo.url == null) {
                            giftWallInfo.url = "";
                        }
                        if (giftWallInfo.name != null) {
                            break;
                        }
                        giftWallInfo.name = "";
                        return giftWallInfo;
                    }
                    giftWallInfo.name = nb5Var.m158750s();
                }
            }
            return giftWallInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftWallInfo giftWallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftWallInfo.f20399id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, giftWallInfo.count);
            String str2 = giftWallInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = giftWallInfo.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<GiftWallInfo> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallInfo>() { // from class: com.p1.mobile.putong.core.data.GiftWallInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftWallInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftWallInfo newInstance() {
            return new GiftWallInfo();
        }

        public boolean parseField(GiftWallInfo giftWallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    giftWallInfo.f20399id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    giftWallInfo.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    giftWallInfo.name = jsonParser.getValueAsString();
                    return true;
                case "count":
                    giftWallInfo.count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftWallInfo giftWallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "url":
                case "name":
                case "count":
                    return true;
                default:
                    return super.parseFieldCheck(giftWallInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftWallInfo giftWallInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = giftWallInfo.f20399id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("count", giftWallInfo.count);
            String str2 = giftWallInfo.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = giftWallInfo.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallInfo new_() {
        GiftWallInfo giftWallInfo = new GiftWallInfo();
        giftWallInfo.nullCheck();
        return giftWallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftWallInfo mo223809clone() {
        GiftWallInfo giftWallInfo = new GiftWallInfo();
        giftWallInfo.f20399id = this.f20399id;
        giftWallInfo.count = this.count;
        giftWallInfo.url = this.url;
        giftWallInfo.name = this.name;
        return giftWallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftWallInfo)) {
            return false;
        }
        GiftWallInfo giftWallInfo = (GiftWallInfo) obj;
        return ValueObject.util_equals(this.f20399id, giftWallInfo.f20399id) && this.count == giftWallInfo.count && ValueObject.util_equals(this.url, giftWallInfo.url) && ValueObject.util_equals(this.name, giftWallInfo.name);
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
        String str = this.f20399id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20399id == null) {
            this.f20399id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
