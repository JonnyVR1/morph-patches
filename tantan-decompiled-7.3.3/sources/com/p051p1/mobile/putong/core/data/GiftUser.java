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
public class GiftUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftuser";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21140id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<GiftUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftUser>() { // from class: com.p1.mobile.putong.core.data.GiftUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftUser giftUser) {
            String str = giftUser.f21140id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = giftUser.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            giftUser.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftUser parse(nc5 nc5Var) throws IOException {
            GiftUser giftUser = new GiftUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (giftUser.f21140id == null) {
                        giftUser.f21140id = "";
                    }
                    if (giftUser.type != null) {
                        break;
                    }
                    giftUser.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    giftUser.f21140id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (giftUser.f21140id == null) {
                            giftUser.f21140id = "";
                        }
                        if (giftUser.type != null) {
                            break;
                        }
                        giftUser.type = "";
                        return giftUser;
                    }
                    giftUser.type = nc5Var.m162495s();
                }
            }
            return giftUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftUser giftUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftUser.f21140id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = giftUser.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<GiftUser> JSON_ADAPTER = new ObjectJsonAdapter<GiftUser>() { // from class: com.p1.mobile.putong.core.data.GiftUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftUser newInstance() {
            return new GiftUser();
        }

        public boolean parseField(GiftUser giftUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                giftUser.f21140id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftUser giftUser, JsonGenerator jsonGenerator) throws IOException {
            String str = giftUser.f21140id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = giftUser.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftUser new_() {
        GiftUser giftUser = new GiftUser();
        giftUser.nullCheck();
        return giftUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftUser mo225055clone() {
        GiftUser giftUser = new GiftUser();
        giftUser.f21140id = this.f21140id;
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
        return ValueObject.util_equals(this.f21140id, giftUser.f21140id) && ValueObject.util_equals(this.type, giftUser.type);
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
        String str = this.f21140id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21140id == null) {
            this.f21140id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
