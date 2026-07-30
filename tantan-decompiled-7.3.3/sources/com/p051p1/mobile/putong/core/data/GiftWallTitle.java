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
public class GiftWallTitle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwalltitle";

    @NonNull
    @ProtobufIndex(index = 1)
    public String highLight;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<GiftWallTitle> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallTitle>() { // from class: com.p1.mobile.putong.core.data.GiftWallTitle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftWallTitle giftWallTitle) {
            String str = giftWallTitle.highLight;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = giftWallTitle.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            giftWallTitle.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftWallTitle parse(nc5 nc5Var) throws IOException {
            GiftWallTitle giftWallTitle = new GiftWallTitle();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (giftWallTitle.highLight == null) {
                        giftWallTitle.highLight = "";
                    }
                    if (giftWallTitle.title != null) {
                        break;
                    }
                    giftWallTitle.title = "";
                    break;
                }
                if (iM162497u == 10) {
                    giftWallTitle.highLight = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (giftWallTitle.highLight == null) {
                            giftWallTitle.highLight = "";
                        }
                        if (giftWallTitle.title != null) {
                            break;
                        }
                        giftWallTitle.title = "";
                        return giftWallTitle;
                    }
                    giftWallTitle.title = nc5Var.m162495s();
                }
            }
            return giftWallTitle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftWallTitle giftWallTitle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftWallTitle.highLight;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = giftWallTitle.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<GiftWallTitle> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallTitle>() { // from class: com.p1.mobile.putong.core.data.GiftWallTitle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftWallTitle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftWallTitle newInstance() {
            return new GiftWallTitle();
        }

        public boolean parseField(GiftWallTitle giftWallTitle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("highLight")) {
                giftWallTitle.highLight = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            giftWallTitle.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GiftWallTitle giftWallTitle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("highLight") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(giftWallTitle, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftWallTitle giftWallTitle, JsonGenerator jsonGenerator) throws IOException {
            String str = giftWallTitle.highLight;
            if (str != null) {
                jsonGenerator.writeStringField("highLight", str);
            }
            String str2 = giftWallTitle.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallTitle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallTitle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallTitle new_() {
        GiftWallTitle giftWallTitle = new GiftWallTitle();
        giftWallTitle.nullCheck();
        return giftWallTitle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftWallTitle mo225055clone() {
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
        String str = this.highLight;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.highLight == null) {
            this.highLight = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
