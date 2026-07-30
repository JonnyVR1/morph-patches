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
public class VideoBullet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "videobullet";

    @NonNull
    @ProtobufIndex(index = 3)
    public String bulletType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20529id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String value;
    public static ProtobufAdapter<VideoBullet> PROTOBUF_ADAPTER = new MessageNanoAdapter<VideoBullet>() { // from class: com.p1.mobile.putong.core.data.VideoBullet.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VideoBullet videoBullet) {
            String str = videoBullet.f20529id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = videoBullet.userId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = videoBullet.bulletType;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = videoBullet.value;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            videoBullet.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VideoBullet parse(nb5 nb5Var) throws IOException {
            VideoBullet videoBullet = new VideoBullet();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (videoBullet.f20529id == null) {
                        videoBullet.f20529id = "";
                    }
                    if (videoBullet.userId == null) {
                        videoBullet.userId = "";
                    }
                    if (videoBullet.bulletType == null) {
                        videoBullet.bulletType = "";
                    }
                    if (videoBullet.value != null) {
                        break;
                    }
                    videoBullet.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    videoBullet.f20529id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    videoBullet.userId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    videoBullet.bulletType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (videoBullet.f20529id == null) {
                            videoBullet.f20529id = "";
                        }
                        if (videoBullet.userId == null) {
                            videoBullet.userId = "";
                        }
                        if (videoBullet.bulletType == null) {
                            videoBullet.bulletType = "";
                        }
                        if (videoBullet.value != null) {
                            break;
                        }
                        videoBullet.value = "";
                        return videoBullet;
                    }
                    videoBullet.value = nb5Var.m158750s();
                }
            }
            return videoBullet;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VideoBullet videoBullet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = videoBullet.f20529id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = videoBullet.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = videoBullet.bulletType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = videoBullet.value;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<VideoBullet> JSON_ADAPTER = new ObjectJsonAdapter<VideoBullet>() { // from class: com.p1.mobile.putong.core.data.VideoBullet.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VideoBullet.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VideoBullet newInstance() {
            return new VideoBullet();
        }

        public boolean parseField(VideoBullet videoBullet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    videoBullet.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    videoBullet.f20529id = jsonParser.getValueAsString();
                    return false;
                case "value":
                    videoBullet.value = jsonParser.getValueAsString();
                    return true;
                case "bulletType":
                    videoBullet.bulletType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VideoBullet videoBullet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                    return true;
                case "id":
                    return false;
                case "value":
                case "bulletType":
                    return true;
                default:
                    return super.parseFieldCheck(videoBullet, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VideoBullet videoBullet, JsonGenerator jsonGenerator) throws IOException {
            String str = videoBullet.f20529id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = videoBullet.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = videoBullet.bulletType;
            if (str3 != null) {
                jsonGenerator.writeStringField("bulletType", str3);
            }
            String str4 = videoBullet.value;
            if (str4 != null) {
                jsonGenerator.writeStringField("value", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VideoBullet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VideoBullet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VideoBullet new_() {
        VideoBullet videoBullet = new VideoBullet();
        videoBullet.nullCheck();
        return videoBullet;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VideoBullet mo223809clone() {
        VideoBullet videoBullet = new VideoBullet();
        videoBullet.f20529id = this.f20529id;
        videoBullet.userId = this.userId;
        videoBullet.bulletType = this.bulletType;
        videoBullet.value = this.value;
        return videoBullet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoBullet)) {
            return false;
        }
        VideoBullet videoBullet = (VideoBullet) obj;
        return ValueObject.util_equals(this.f20529id, videoBullet.f20529id) && ValueObject.util_equals(this.userId, videoBullet.userId) && ValueObject.util_equals(this.bulletType, videoBullet.bulletType) && ValueObject.util_equals(this.value, videoBullet.value);
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
        String str = this.f20529id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bulletType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.value;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20529id == null) {
            this.f20529id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.bulletType == null) {
            this.bulletType = "";
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
