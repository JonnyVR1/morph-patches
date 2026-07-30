package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class IntlOperationBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intloperationbanner";

    @NonNull
    @ProtobufIndex(index = 2)
    public UrlParentData banner;

    @NonNull
    @ProtobufIndex(index = 3)
    public UrlParentData icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39611id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String jumpUrl;
    public static ProtobufAdapter<IntlOperationBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationBanner>() { // from class: com.p1.mobile.putong.data.IntlOperationBanner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlOperationBanner intlOperationBanner) {
            String str = intlOperationBanner.f39611id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            UrlParentData urlParentData = intlOperationBanner.banner;
            if (urlParentData != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, urlParentData, UrlParentData.PROTOBUF_ADAPTER);
            }
            UrlParentData urlParentData2 = intlOperationBanner.icon;
            if (urlParentData2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, urlParentData2, UrlParentData.PROTOBUF_ADAPTER);
            }
            String str2 = intlOperationBanner.jumpUrl;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            intlOperationBanner.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlOperationBanner parse(nc5 nc5Var) throws IOException {
            IntlOperationBanner intlOperationBanner = new IntlOperationBanner();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlOperationBanner.f39611id == null) {
                        intlOperationBanner.f39611id = "";
                    }
                    if (intlOperationBanner.banner == null) {
                        intlOperationBanner.banner = UrlParentData.new_();
                    }
                    if (intlOperationBanner.icon == null) {
                        intlOperationBanner.icon = UrlParentData.new_();
                    }
                    if (intlOperationBanner.jumpUrl != null) {
                        break;
                    }
                    intlOperationBanner.jumpUrl = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlOperationBanner.f39611id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    intlOperationBanner.banner = (UrlParentData) nc5Var.m162488l(UrlParentData.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    intlOperationBanner.icon = (UrlParentData) nc5Var.m162488l(UrlParentData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (intlOperationBanner.f39611id == null) {
                            intlOperationBanner.f39611id = "";
                        }
                        if (intlOperationBanner.banner == null) {
                            intlOperationBanner.banner = UrlParentData.new_();
                        }
                        if (intlOperationBanner.icon == null) {
                            intlOperationBanner.icon = UrlParentData.new_();
                        }
                        if (intlOperationBanner.jumpUrl != null) {
                            break;
                        }
                        intlOperationBanner.jumpUrl = "";
                        return intlOperationBanner;
                    }
                    intlOperationBanner.jumpUrl = nc5Var.m162495s();
                }
            }
            return intlOperationBanner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlOperationBanner intlOperationBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlOperationBanner.f39611id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            UrlParentData urlParentData = intlOperationBanner.banner;
            if (urlParentData != null) {
                codedOutputByteBufferNano.m17309K(2, urlParentData, UrlParentData.PROTOBUF_ADAPTER);
            }
            UrlParentData urlParentData2 = intlOperationBanner.icon;
            if (urlParentData2 != null) {
                codedOutputByteBufferNano.m17309K(3, urlParentData2, UrlParentData.PROTOBUF_ADAPTER);
            }
            String str2 = intlOperationBanner.jumpUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    };
    public static JsonAdapter<IntlOperationBanner> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationBanner>() { // from class: com.p1.mobile.putong.data.IntlOperationBanner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlOperationBanner.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlOperationBanner newInstance() {
            return new IntlOperationBanner();
        }

        public boolean parseField(IntlOperationBanner intlOperationBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "banner":
                    intlOperationBanner.banner = UrlParentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "jumpUrl":
                    intlOperationBanner.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    intlOperationBanner.f39611id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    intlOperationBanner.icon = UrlParentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlOperationBanner intlOperationBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "banner":
                case "jumpUrl":
                    return true;
                case "id":
                    return false;
                case "icon":
                    return true;
                default:
                    return super.parseFieldCheck(intlOperationBanner, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationBanner intlOperationBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = intlOperationBanner.f39611id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (intlOperationBanner.banner != null) {
                jsonGenerator.writeFieldName("banner");
                UrlParentData.JSON_ADAPTER.serialize(intlOperationBanner.banner, jsonGenerator, true);
            }
            if (intlOperationBanner.icon != null) {
                jsonGenerator.writeFieldName("icon");
                UrlParentData.JSON_ADAPTER.serialize(intlOperationBanner.icon, jsonGenerator, true);
            }
            String str2 = intlOperationBanner.jumpUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("jumpUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationBanner new_() {
        IntlOperationBanner intlOperationBanner = new IntlOperationBanner();
        intlOperationBanner.nullCheck();
        return intlOperationBanner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlOperationBanner mo225055clone() {
        IntlOperationBanner intlOperationBanner = new IntlOperationBanner();
        intlOperationBanner.f39611id = this.f39611id;
        UrlParentData urlParentData = this.banner;
        if (urlParentData != null) {
            intlOperationBanner.banner = urlParentData.mo225055clone();
        }
        UrlParentData urlParentData2 = this.icon;
        if (urlParentData2 != null) {
            intlOperationBanner.icon = urlParentData2.mo225055clone();
        }
        intlOperationBanner.jumpUrl = this.jumpUrl;
        return intlOperationBanner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlOperationBanner)) {
            return false;
        }
        IntlOperationBanner intlOperationBanner = (IntlOperationBanner) obj;
        return ValueObject.util_equals(this.f39611id, intlOperationBanner.f39611id) && ValueObject.util_equals(this.banner, intlOperationBanner.banner) && ValueObject.util_equals(this.icon, intlOperationBanner.icon) && ValueObject.util_equals(this.jumpUrl, intlOperationBanner.jumpUrl);
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
        String str = this.f39611id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        UrlParentData urlParentData = this.banner;
        int iHashCode2 = (iHashCode + (urlParentData != null ? urlParentData.hashCode() : 0)) * 41;
        UrlParentData urlParentData2 = this.icon;
        int iHashCode3 = (iHashCode2 + (urlParentData2 != null ? urlParentData2.hashCode() : 0)) * 41;
        String str2 = this.jumpUrl;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39611id == null) {
            this.f39611id = "";
        }
        if (this.banner == null) {
            this.banner = UrlParentData.new_();
        }
        if (this.icon == null) {
            this.icon = UrlParentData.new_();
        }
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
