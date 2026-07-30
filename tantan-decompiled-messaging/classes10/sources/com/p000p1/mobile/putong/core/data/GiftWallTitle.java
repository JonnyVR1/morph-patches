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
public class GiftWallTitle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwalltitle";

    @NonNull
    @ProtobufIndex(index = 1)
    public String highLight;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;
    public static ProtobufAdapter<GiftWallTitle> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallTitle>() { // from class: com.p1.mobile.putong.core.data.GiftWallTitle.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GiftWallTitle giftWallTitle) {
            String str = giftWallTitle.highLight;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = giftWallTitle.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) giftWallTitle).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GiftWallTitle m12985parse(nb5 nb5Var) throws IOException {
            GiftWallTitle giftWallTitle = new GiftWallTitle();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (giftWallTitle.highLight == null) {
                        giftWallTitle.highLight = "";
                    }
                    if (giftWallTitle.title != null) {
                        break;
                    }
                    giftWallTitle.title = "";
                    break;
                }
                if (iU == 10) {
                    giftWallTitle.highLight = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (giftWallTitle.highLight == null) {
                            giftWallTitle.highLight = "";
                        }
                        if (giftWallTitle.title != null) {
                            break;
                        }
                        giftWallTitle.title = "";
                        return giftWallTitle;
                    }
                    giftWallTitle.title = nb5Var.s();
                }
            }
            return giftWallTitle;
        }

        public void serialize(GiftWallTitle giftWallTitle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftWallTitle.highLight;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = giftWallTitle.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<GiftWallTitle> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallTitle>() { // from class: com.p1.mobile.putong.core.data.GiftWallTitle.2
        public Class getDataClass() {
            return GiftWallTitle.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GiftWallTitle m12986newInstance() {
            return new GiftWallTitle();
        }

        public boolean parseField(GiftWallTitle giftWallTitle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("highLight")) {
                giftWallTitle.highLight = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            giftWallTitle.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GiftWallTitle giftWallTitle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("highLight") || str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(giftWallTitle, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GiftWallTitle giftWallTitle, JsonGenerator jsonGenerator) throws IOException {
            String str = giftWallTitle.highLight;
            if (str != null) {
                jsonGenerator.writeStringField("highLight", str);
            }
            String str2 = giftWallTitle.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallTitle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallTitle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallTitle new_() {
        GiftWallTitle giftWallTitle = new GiftWallTitle();
        giftWallTitle.nullCheck();
        return giftWallTitle;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GiftWallTitle m12984clone() {
        GiftWallTitle giftWallTitle = new GiftWallTitle();
        giftWallTitle.highLight = this.highLight;
        giftWallTitle.title = this.title;
        return giftWallTitle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftWallTitle)) {
            return false;
        }
        GiftWallTitle giftWallTitle = (GiftWallTitle) obj;
        return ValueObject.util_equals(this.highLight, giftWallTitle.highLight) && ValueObject.util_equals(this.title, giftWallTitle.title);
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
        String str = this.highLight;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.highLight == null) {
            this.highLight = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
