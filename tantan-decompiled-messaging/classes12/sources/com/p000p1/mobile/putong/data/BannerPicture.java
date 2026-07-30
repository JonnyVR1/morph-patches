package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class BannerPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannerpicture";

    @ProtobufIndex(index = 2)
    public int height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String identifier;

    @ProtobufIndex(index = 3)
    public int width;
    public static ProtobufAdapter<BannerPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerPicture>() { // from class: com.p1.mobile.putong.data.BannerPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BannerPicture bannerPicture) {
            String str = bannerPicture.identifier;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, bannerPicture.height) + CodedOutputByteBufferNano.h(3, bannerPicture.width);
            ((MessageNano) bannerPicture).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BannerPicture m17760parse(nb5 nb5Var) throws IOException {
            BannerPicture bannerPicture = new BannerPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bannerPicture.identifier != null) {
                        break;
                    }
                    bannerPicture.identifier = "";
                    break;
                }
                if (iU == 10) {
                    bannerPicture.identifier = nb5Var.s();
                } else if (iU == 16) {
                    bannerPicture.height = nb5Var.j();
                } else {
                    if (iU != 24) {
                        if (bannerPicture.identifier != null) {
                            break;
                        }
                        bannerPicture.identifier = "";
                        return bannerPicture;
                    }
                    bannerPicture.width = nb5Var.j();
                }
            }
            return bannerPicture;
        }

        public void serialize(BannerPicture bannerPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bannerPicture.identifier;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, bannerPicture.height);
            codedOutputByteBufferNano.G(3, bannerPicture.width);
        }
    };
    public static JsonAdapter<BannerPicture> JSON_ADAPTER = new ObjectJsonAdapter<BannerPicture>() { // from class: com.p1.mobile.putong.data.BannerPicture.2
        public Class getDataClass() {
            return BannerPicture.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BannerPicture mo17830newInstance() {
            return new BannerPicture();
        }

        public boolean parseField(BannerPicture bannerPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    bannerPicture.identifier = jsonParser.getValueAsString();
                    return true;
                case "height":
                    bannerPicture.height = jsonParser.getValueAsInt();
                    return true;
                case "width":
                    bannerPicture.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BannerPicture bannerPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "height":
                case "width":
                    return true;
                default:
                    return super.parseFieldCheck(bannerPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerPicture bannerPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = bannerPicture.identifier;
            if (str != null) {
                jsonGenerator.writeStringField("identifier", str);
            }
            jsonGenerator.writeNumberField("height", bannerPicture.height);
            jsonGenerator.writeNumberField("width", bannerPicture.width);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerPicture new_() {
        BannerPicture bannerPicture = new BannerPicture();
        bannerPicture.nullCheck();
        return bannerPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BannerPicture m17759clone() {
        BannerPicture bannerPicture = new BannerPicture();
        bannerPicture.identifier = this.identifier;
        bannerPicture.height = this.height;
        bannerPicture.width = this.width;
        return bannerPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerPicture)) {
            return false;
        }
        BannerPicture bannerPicture = (BannerPicture) obj;
        return ValueObject.util_equals(this.identifier, bannerPicture.identifier) && this.height == bannerPicture.height && this.width == bannerPicture.width;
    }

    public String getClassParseName() {
        return "bannerpicture";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.identifier;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.height) * 41) + this.width;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
