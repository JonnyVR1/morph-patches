package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class GiftWallSocial extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwallsocial";

    @Nullable
    @ProtobufIndex(index = 1)
    public GiftWallSocialItem dailySocial;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public GiftWallSocialItem totalSocial;
    public static ProtobufAdapter<GiftWallSocial> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallSocial>() { // from class: com.p1.mobile.putong.core.data.GiftWallSocial.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GiftWallSocial giftWallSocial) {
            GiftWallSocialItem giftWallSocialItem = giftWallSocial.dailySocial;
            int iL = giftWallSocialItem != null ? CodedOutputByteBufferNano.l(1, giftWallSocialItem, GiftWallSocialItem.PROTOBUF_ADAPTER) : 0;
            GiftWallSocialItem giftWallSocialItem2 = giftWallSocial.totalSocial;
            if (giftWallSocialItem2 != null) {
                iL += CodedOutputByteBufferNano.l(2, giftWallSocialItem2, GiftWallSocialItem.PROTOBUF_ADAPTER);
            }
            ((MessageNano) giftWallSocial).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GiftWallSocial m12977parse(nb5 nb5Var) throws IOException {
            GiftWallSocial giftWallSocial = new GiftWallSocial();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    giftWallSocial.dailySocial = (GiftWallSocialItem) nb5Var.l(GiftWallSocialItem.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        return giftWallSocial;
                    }
                    giftWallSocial.totalSocial = (GiftWallSocialItem) nb5Var.l(GiftWallSocialItem.PROTOBUF_ADAPTER);
                }
            }
        }

        public void serialize(GiftWallSocial giftWallSocial, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GiftWallSocialItem giftWallSocialItem = giftWallSocial.dailySocial;
            if (giftWallSocialItem != null) {
                codedOutputByteBufferNano.K(1, giftWallSocialItem, GiftWallSocialItem.PROTOBUF_ADAPTER);
            }
            GiftWallSocialItem giftWallSocialItem2 = giftWallSocial.totalSocial;
            if (giftWallSocialItem2 != null) {
                codedOutputByteBufferNano.K(2, giftWallSocialItem2, GiftWallSocialItem.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GiftWallSocial> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallSocial>() { // from class: com.p1.mobile.putong.core.data.GiftWallSocial.2
        public Class getDataClass() {
            return GiftWallSocial.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GiftWallSocial m12978newInstance() {
            return new GiftWallSocial();
        }

        public boolean parseField(GiftWallSocial giftWallSocial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("totalSocial")) {
                giftWallSocial.totalSocial = (GiftWallSocialItem) GiftWallSocialItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("dailySocial")) {
                return false;
            }
            giftWallSocial.dailySocial = (GiftWallSocialItem) GiftWallSocialItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GiftWallSocial giftWallSocial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("totalSocial") || str.equals("dailySocial")) {
                return true;
            }
            return super.parseFieldCheck(giftWallSocial, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallSocial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallSocial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallSocial new_() {
        GiftWallSocial giftWallSocial = new GiftWallSocial();
        giftWallSocial.nullCheck();
        return giftWallSocial;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GiftWallSocial m12976clone() {
        GiftWallSocial giftWallSocial = new GiftWallSocial();
        GiftWallSocialItem giftWallSocialItem = this.dailySocial;
        if (giftWallSocialItem != null) {
            giftWallSocial.dailySocial = giftWallSocialItem.m12980clone();
        }
        GiftWallSocialItem giftWallSocialItem2 = this.totalSocial;
        if (giftWallSocialItem2 != null) {
            giftWallSocial.totalSocial = giftWallSocialItem2.m12980clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        GiftWallSocialItem giftWallSocialItem = this.dailySocial;
        int iHashCode = (i2 + (giftWallSocialItem != null ? giftWallSocialItem.hashCode() : 0)) * 41;
        GiftWallSocialItem giftWallSocialItem2 = this.totalSocial;
        int iHashCode2 = iHashCode + (giftWallSocialItem2 != null ? giftWallSocialItem2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
