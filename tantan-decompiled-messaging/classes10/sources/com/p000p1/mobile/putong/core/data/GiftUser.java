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
public class GiftUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftuser";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f60id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<GiftUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftUser>() { // from class: com.p1.mobile.putong.core.data.GiftUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GiftUser giftUser) {
            String str = giftUser.f60id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = giftUser.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) giftUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GiftUser m12965parse(nb5 nb5Var) throws IOException {
            GiftUser giftUser = new GiftUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (giftUser.f60id == null) {
                        giftUser.f60id = "";
                    }
                    if (giftUser.type != null) {
                        break;
                    }
                    giftUser.type = "";
                    break;
                }
                if (iU == 10) {
                    giftUser.f60id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (giftUser.f60id == null) {
                            giftUser.f60id = "";
                        }
                        if (giftUser.type != null) {
                            break;
                        }
                        giftUser.type = "";
                        return giftUser;
                    }
                    giftUser.type = nb5Var.s();
                }
            }
            return giftUser;
        }

        public void serialize(GiftUser giftUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftUser.f60id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = giftUser.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<GiftUser> JSON_ADAPTER = new ObjectJsonAdapter<GiftUser>() { // from class: com.p1.mobile.putong.core.data.GiftUser.2
        public Class getDataClass() {
            return GiftUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GiftUser m12966newInstance() {
            return new GiftUser();
        }

        public boolean parseField(GiftUser giftUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                giftUser.f60id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            giftUser.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GiftUser giftUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(giftUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GiftUser giftUser, JsonGenerator jsonGenerator) throws IOException {
            String str = giftUser.f60id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = giftUser.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftUser new_() {
        GiftUser giftUser = new GiftUser();
        giftUser.nullCheck();
        return giftUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GiftUser m12964clone() {
        GiftUser giftUser = new GiftUser();
        giftUser.f60id = this.f60id;
        giftUser.type = this.type;
        return giftUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftUser)) {
            return false;
        }
        GiftUser giftUser = (GiftUser) obj;
        return ValueObject.util_equals(this.f60id, giftUser.f60id) && ValueObject.util_equals(this.type, giftUser.type);
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
        String str = this.f60id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f60id == null) {
            this.f60id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
