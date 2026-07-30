package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BannerSize extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannersize";

    @ProtobufIndex(index = 2)
    public int height;

    @ProtobufIndex(index = 1)
    public int width;
    public static ProtobufAdapter<BannerSize> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerSize>() { // from class: com.p1.mobile.putong.data.BannerSize.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BannerSize bannerSize) {
            int iH = CodedOutputByteBufferNano.h(1, bannerSize.width) + CodedOutputByteBufferNano.h(2, bannerSize.height);
            ((MessageNano) bannerSize).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BannerSize m17766parse(nb5 nb5Var) throws IOException {
            BannerSize bannerSize = new BannerSize();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    bannerSize.width = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return bannerSize;
                    }
                    bannerSize.height = nb5Var.j();
                }
            }
        }

        public void serialize(BannerSize bannerSize, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, bannerSize.width);
            codedOutputByteBufferNano.G(2, bannerSize.height);
        }
    };
    public static JsonAdapter<BannerSize> JSON_ADAPTER = new ObjectJsonAdapter<BannerSize>() { // from class: com.p1.mobile.putong.data.BannerSize.2
        public Class getDataClass() {
            return BannerSize.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BannerSize mo17830newInstance() {
            return new BannerSize();
        }

        public boolean parseField(BannerSize bannerSize, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("height")) {
                bannerSize.height = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("width")) {
                return false;
            }
            bannerSize.width = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BannerSize bannerSize, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("height") || str.equals("width")) {
                return true;
            }
            return super.parseFieldCheck(bannerSize, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerSize bannerSize, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("width", bannerSize.width);
            jsonGenerator.writeNumberField("height", bannerSize.height);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerSize) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerSize) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerSize new_() {
        BannerSize bannerSize = new BannerSize();
        bannerSize.nullCheck();
        return bannerSize;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BannerSize m17765clone() {
        BannerSize bannerSize = new BannerSize();
        bannerSize.width = this.width;
        bannerSize.height = this.height;
        return bannerSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerSize)) {
            return false;
        }
        BannerSize bannerSize = (BannerSize) obj;
        return this.width == bannerSize.width && this.height == bannerSize.height;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.width) * 41) + this.height;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
