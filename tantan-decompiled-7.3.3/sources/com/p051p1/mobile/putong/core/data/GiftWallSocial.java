package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class GiftWallSocial extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwallsocial";

    @Nullable
    @ProtobufIndex(index = 1)
    public GiftWallSocialItem dailySocial;

    @Nullable
    @ProtobufIndex(index = 2)
    public GiftWallSocialItem totalSocial;
    public static ProtobufAdapter<GiftWallSocial> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallSocial>() { // from class: com.p1.mobile.putong.core.data.GiftWallSocial.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftWallSocial giftWallSocial) {
            GiftWallSocialItem giftWallSocialItem = giftWallSocial.dailySocial;
            int iM17285l = giftWallSocialItem != null ? CodedOutputByteBufferNano.m17285l(1, giftWallSocialItem, GiftWallSocialItem.PROTOBUF_ADAPTER) : 0;
            GiftWallSocialItem giftWallSocialItem2 = giftWallSocial.totalSocial;
            if (giftWallSocialItem2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, giftWallSocialItem2, GiftWallSocialItem.PROTOBUF_ADAPTER);
            }
            giftWallSocial.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftWallSocial parse(nc5 nc5Var) throws IOException {
            GiftWallSocial giftWallSocial = new GiftWallSocial();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    giftWallSocial.dailySocial = (GiftWallSocialItem) nc5Var.m162488l(GiftWallSocialItem.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        return giftWallSocial;
                    }
                    giftWallSocial.totalSocial = (GiftWallSocialItem) nc5Var.m162488l(GiftWallSocialItem.PROTOBUF_ADAPTER);
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftWallSocial giftWallSocial, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GiftWallSocialItem giftWallSocialItem = giftWallSocial.dailySocial;
            if (giftWallSocialItem != null) {
                codedOutputByteBufferNano.m17309K(1, giftWallSocialItem, GiftWallSocialItem.PROTOBUF_ADAPTER);
            }
            GiftWallSocialItem giftWallSocialItem2 = giftWallSocial.totalSocial;
            if (giftWallSocialItem2 != null) {
                codedOutputByteBufferNano.m17309K(2, giftWallSocialItem2, GiftWallSocialItem.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GiftWallSocial> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallSocial>() { // from class: com.p1.mobile.putong.core.data.GiftWallSocial.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftWallSocial.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftWallSocial newInstance() {
            return new GiftWallSocial();
        }

        public boolean parseField(GiftWallSocial giftWallSocial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("totalSocial")) {
                giftWallSocial.totalSocial = GiftWallSocialItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("dailySocial")) {
                return false;
            }
            giftWallSocial.dailySocial = GiftWallSocialItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GiftWallSocial giftWallSocial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("totalSocial") || str.equals("dailySocial")) {
                return true;
            }
            return super.parseFieldCheck(giftWallSocial, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftWallSocial giftWallSocial, JsonGenerator jsonGenerator) throws IOException {
            if (giftWallSocial.dailySocial != null) {
                jsonGenerator.writeFieldName("dailySocial");
                GiftWallSocialItem.JSON_ADAPTER.serialize(giftWallSocial.dailySocial, jsonGenerator, true);
            }
            if (giftWallSocial.totalSocial != null) {
                jsonGenerator.writeFieldName("totalSocial");
                GiftWallSocialItem.JSON_ADAPTER.serialize(giftWallSocial.totalSocial, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallSocial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallSocial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallSocial new_() {
        GiftWallSocial giftWallSocial = new GiftWallSocial();
        giftWallSocial.nullCheck();
        return giftWallSocial;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftWallSocial mo225055clone() {
        GiftWallSocial giftWallSocial = new GiftWallSocial();
        GiftWallSocialItem giftWallSocialItem = this.dailySocial;
        if (giftWallSocialItem != null) {
            giftWallSocial.dailySocial = giftWallSocialItem.mo225055clone();
        }
        GiftWallSocialItem giftWallSocialItem2 = this.totalSocial;
        if (giftWallSocialItem2 != null) {
            giftWallSocial.totalSocial = giftWallSocialItem2.mo225055clone();
        }
        return giftWallSocial;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftWallSocial)) {
            return false;
        }
        GiftWallSocial giftWallSocial = (GiftWallSocial) obj;
        return ValueObject.util_equals(this.dailySocial, giftWallSocial.dailySocial) && ValueObject.util_equals(this.totalSocial, giftWallSocial.totalSocial);
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
        GiftWallSocialItem giftWallSocialItem = this.dailySocial;
        int iHashCode = (i2 + (giftWallSocialItem != null ? giftWallSocialItem.hashCode() : 0)) * 41;
        GiftWallSocialItem giftWallSocialItem2 = this.totalSocial;
        int iHashCode2 = iHashCode + (giftWallSocialItem2 != null ? giftWallSocialItem2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
