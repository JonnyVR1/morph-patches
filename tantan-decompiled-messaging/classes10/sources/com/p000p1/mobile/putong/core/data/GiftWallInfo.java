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
public class GiftWallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwallinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f61id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String url;
    public static ProtobufAdapter<GiftWallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallInfo>() { // from class: com.p1.mobile.putong.core.data.GiftWallInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GiftWallInfo giftWallInfo) {
            String str = giftWallInfo.f61id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, giftWallInfo.count);
            String str2 = giftWallInfo.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = giftWallInfo.name;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) giftWallInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GiftWallInfo m12969parse(nb5 nb5Var) throws IOException {
            GiftWallInfo giftWallInfo = new GiftWallInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (giftWallInfo.f61id == null) {
                        giftWallInfo.f61id = "";
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
                if (iU == 10) {
                    giftWallInfo.f61id = nb5Var.s();
                } else if (iU == 16) {
                    giftWallInfo.count = nb5Var.j();
                } else if (iU == 26) {
                    giftWallInfo.url = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (giftWallInfo.f61id == null) {
                            giftWallInfo.f61id = "";
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
                    giftWallInfo.name = nb5Var.s();
                }
            }
            return giftWallInfo;
        }

        public void serialize(GiftWallInfo giftWallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftWallInfo.f61id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, giftWallInfo.count);
            String str2 = giftWallInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = giftWallInfo.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<GiftWallInfo> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallInfo>() { // from class: com.p1.mobile.putong.core.data.GiftWallInfo.2
        public Class getDataClass() {
            return GiftWallInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GiftWallInfo m12970newInstance() {
            return new GiftWallInfo();
        }

        public boolean parseField(GiftWallInfo giftWallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    giftWallInfo.f61id = jsonParser.getValueAsString();
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

        public void serializeFields(GiftWallInfo giftWallInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = giftWallInfo.f61id;
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
                jsonGenerator.writeStringField("name", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallInfo new_() {
        GiftWallInfo giftWallInfo = new GiftWallInfo();
        giftWallInfo.nullCheck();
        return giftWallInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GiftWallInfo m12968clone() {
        GiftWallInfo giftWallInfo = new GiftWallInfo();
        giftWallInfo.f61id = this.f61id;
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
        return ValueObject.util_equals(this.f61id, giftWallInfo.f61id) && this.count == giftWallInfo.count && ValueObject.util_equals(this.url, giftWallInfo.url) && ValueObject.util_equals(this.name, giftWallInfo.name);
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
        String str = this.f61id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f61id == null) {
            this.f61id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
