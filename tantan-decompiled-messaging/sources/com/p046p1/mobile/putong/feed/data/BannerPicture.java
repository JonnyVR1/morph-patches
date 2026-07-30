package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class BannerPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannerpicture";

    @ProtobufIndex(index = 2)
    public int height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String identifier;

    @ProtobufIndex(index = 3)
    public int width;
    public static ProtobufAdapter<BannerPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerPicture>() { // from class: com.p1.mobile.putong.feed.data.BannerPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BannerPicture bannerPicture) {
            String str = bannerPicture.identifier;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, bannerPicture.height) + CodedOutputByteBufferNano.m17226h(3, bannerPicture.width);
            bannerPicture.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BannerPicture parse(nb5 nb5Var) throws IOException {
            BannerPicture bannerPicture = new BannerPicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bannerPicture.identifier != null) {
                        break;
                    }
                    bannerPicture.identifier = "";
                    break;
                }
                if (iM158752u == 10) {
                    bannerPicture.identifier = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    bannerPicture.height = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        if (bannerPicture.identifier != null) {
                            break;
                        }
                        bannerPicture.identifier = "";
                        return bannerPicture;
                    }
                    bannerPicture.width = nb5Var.m158741j();
                }
            }
            return bannerPicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BannerPicture bannerPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bannerPicture.identifier;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, bannerPicture.height);
            codedOutputByteBufferNano.m17250G(3, bannerPicture.width);
        }
    };
    public static JsonAdapter<BannerPicture> JSON_ADAPTER = new ObjectJsonAdapter<BannerPicture>() { // from class: com.p1.mobile.putong.feed.data.BannerPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BannerPicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BannerPicture newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerPicture bannerPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = bannerPicture.identifier;
            if (str != null) {
                jsonGenerator.writeStringField("identifier", str);
            }
            jsonGenerator.writeNumberField("height", bannerPicture.height);
            jsonGenerator.writeNumberField("width", bannerPicture.width);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerPicture new_() {
        BannerPicture bannerPicture = new BannerPicture();
        bannerPicture.nullCheck();
        return bannerPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BannerPicture mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "bannerpicture";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.identifier;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.height) * 41) + this.width;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
