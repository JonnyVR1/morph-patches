package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.BannersItem;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class BannerContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannercontent";

    @NonNull
    @ProtobufIndex(index = 1)
    public String banner;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BannersItem> banners;

    @ProtobufIndex(index = 5)
    public boolean display;

    @NonNull
    @ProtobufIndex(index = 4)
    public BannerSize size;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<BannerContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerContent>() { // from class: com.p1.mobile.putong.data.BannerContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BannerContent bannerContent) {
            String str = bannerContent.banner;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bannerContent.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<BannersItem> list = bannerContent.banners;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, BannersItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            BannerSize bannerSize = bannerContent.size;
            if (bannerSize != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, bannerSize, BannerSize.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, bannerContent.display);
            bannerContent.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BannerContent parse(nb5 nb5Var) throws IOException {
            BannerContent bannerContent = new BannerContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bannerContent.banner == null) {
                        bannerContent.banner = "";
                    }
                    if (bannerContent.url == null) {
                        bannerContent.url = "";
                    }
                    if (bannerContent.banners == null) {
                        bannerContent.banners = new ArrayList();
                    }
                    if (bannerContent.size != null) {
                        break;
                    }
                    bannerContent.size = BannerSize.new_();
                    break;
                }
                if (iM158752u == 10) {
                    bannerContent.banner = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bannerContent.url = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bannerContent.banners = (List) nb5Var.m158743l(BannersItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    bannerContent.size = (BannerSize) nb5Var.m158743l(BannerSize.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 40) {
                        if (bannerContent.banner == null) {
                            bannerContent.banner = "";
                        }
                        if (bannerContent.url == null) {
                            bannerContent.url = "";
                        }
                        if (bannerContent.banners == null) {
                            bannerContent.banners = new ArrayList();
                        }
                        if (bannerContent.size != null) {
                            break;
                        }
                        bannerContent.size = BannerSize.new_();
                        return bannerContent;
                    }
                    bannerContent.display = nb5Var.m158738g();
                }
            }
            return bannerContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BannerContent bannerContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bannerContent.banner;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bannerContent.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<BannersItem> list = bannerContent.banners;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, BannersItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            BannerSize bannerSize = bannerContent.size;
            if (bannerSize != null) {
                codedOutputByteBufferNano.m17254K(4, bannerSize, BannerSize.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(5, bannerContent.display);
        }
    };
    public static JsonAdapter<BannerContent> JSON_ADAPTER = new ObjectJsonAdapter<BannerContent>() { // from class: com.p1.mobile.putong.data.BannerContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BannerContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BannerContent newInstance() {
            return new BannerContent();
        }

        public boolean parseField(BannerContent bannerContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "banner":
                    bannerContent.banner = jsonParser.getValueAsString();
                    return true;
                case "banners":
                    bannerContent.banners = JsonAdapter.parseArray(jsonParser, BannersItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    bannerContent.url = jsonParser.getValueAsString();
                    return true;
                case "size":
                    bannerContent.size = BannerSize.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "display":
                    bannerContent.display = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BannerContent bannerContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "banner":
                case "banners":
                case "url":
                case "size":
                case "display":
                    return true;
                default:
                    return super.parseFieldCheck(bannerContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerContent bannerContent, JsonGenerator jsonGenerator) throws IOException {
            String str = bannerContent.banner;
            if (str != null) {
                jsonGenerator.writeStringField("banner", str);
            }
            String str2 = bannerContent.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            if (bannerContent.banners != null) {
                jsonGenerator.writeFieldName(Banners.TYPE);
                JsonAdapter.serializeArray(bannerContent.banners, jsonGenerator, BannersItem.JSON_ADAPTER);
            }
            if (bannerContent.size != null) {
                jsonGenerator.writeFieldName("size");
                BannerSize.JSON_ADAPTER.serialize(bannerContent.size, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, bannerContent.display);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerContent new_() {
        BannerContent bannerContent = new BannerContent();
        bannerContent.nullCheck();
        return bannerContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BannerContent mo223809clone() {
        BannerContent bannerContent = new BannerContent();
        bannerContent.banner = this.banner;
        bannerContent.url = this.url;
        List<BannersItem> list = this.banners;
        if (list != null) {
            bannerContent.banners = ValueObject.util_map(list, new w9j() { // from class: l.id2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BannersItem) obj).mo223809clone();
                }
            });
        }
        BannerSize bannerSize = this.size;
        if (bannerSize != null) {
            bannerContent.size = bannerSize.mo223809clone();
        }
        bannerContent.display = this.display;
        return bannerContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerContent)) {
            return false;
        }
        BannerContent bannerContent = (BannerContent) obj;
        return ValueObject.util_equals(this.banner, bannerContent.banner) && ValueObject.util_equals(this.url, bannerContent.url) && ValueObject.util_equals(this.banners, bannerContent.banners) && ValueObject.util_equals(this.size, bannerContent.size) && this.display == bannerContent.display;
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
        String str = this.banner;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BannersItem> list = this.banners;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        BannerSize bannerSize = this.size;
        int iHashCode4 = ((iHashCode3 + (bannerSize != null ? bannerSize.hashCode() : 0)) * 41) + (this.display ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.banner == null) {
            this.banner = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.banners == null) {
            this.banners = new ArrayList();
        }
        if (this.size == null) {
            this.size = BannerSize.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
