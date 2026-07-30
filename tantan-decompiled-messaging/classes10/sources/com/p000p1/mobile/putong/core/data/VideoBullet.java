package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VideoBullet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "videobullet";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String bulletType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f191id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String value;
    public static ProtobufAdapter<VideoBullet> PROTOBUF_ADAPTER = new MessageNanoAdapter<VideoBullet>() { // from class: com.p1.mobile.putong.core.data.VideoBullet.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VideoBullet videoBullet) {
            String str = videoBullet.f191id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = videoBullet.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = videoBullet.bulletType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = videoBullet.value;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) videoBullet).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VideoBullet m16224parse(nb5 nb5Var) throws IOException {
            VideoBullet videoBullet = new VideoBullet();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (videoBullet.f191id == null) {
                        videoBullet.f191id = "";
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
                if (iU == 10) {
                    videoBullet.f191id = nb5Var.s();
                } else if (iU == 18) {
                    videoBullet.userId = nb5Var.s();
                } else if (iU == 26) {
                    videoBullet.bulletType = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (videoBullet.f191id == null) {
                            videoBullet.f191id = "";
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
                    videoBullet.value = nb5Var.s();
                }
            }
            return videoBullet;
        }

        public void serialize(VideoBullet videoBullet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = videoBullet.f191id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = videoBullet.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = videoBullet.bulletType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = videoBullet.value;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<VideoBullet> JSON_ADAPTER = new ObjectJsonAdapter<VideoBullet>() { // from class: com.p1.mobile.putong.core.data.VideoBullet.2
        public Class getDataClass() {
            return VideoBullet.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VideoBullet m16225newInstance() {
            return new VideoBullet();
        }

        public boolean parseField(VideoBullet videoBullet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    videoBullet.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    videoBullet.f191id = jsonParser.getValueAsString();
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

        public void serializeFields(VideoBullet videoBullet, JsonGenerator jsonGenerator) throws IOException {
            String str = videoBullet.f191id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VideoBullet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VideoBullet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VideoBullet new_() {
        VideoBullet videoBullet = new VideoBullet();
        videoBullet.nullCheck();
        return videoBullet;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VideoBullet m16223clone() {
        VideoBullet videoBullet = new VideoBullet();
        videoBullet.f191id = this.f191id;
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
        return ValueObject.util_equals(this.f191id, videoBullet.f191id) && ValueObject.util_equals(this.userId, videoBullet.userId) && ValueObject.util_equals(this.bulletType, videoBullet.bulletType) && ValueObject.util_equals(this.value, videoBullet.value);
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
        String str = this.f191id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bulletType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.value;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f191id == null) {
            this.f191id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
