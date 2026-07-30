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
    public String f224id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String jumpUrl;
    public static ProtobufAdapter<IntlOperationBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationBanner>() { // from class: com.p1.mobile.putong.data.IntlOperationBanner.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlOperationBanner intlOperationBanner) {
            String str = intlOperationBanner.f224id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            UrlParentData urlParentData = intlOperationBanner.banner;
            if (urlParentData != null) {
                iO += CodedOutputByteBufferNano.l(2, urlParentData, UrlParentData.PROTOBUF_ADAPTER);
            }
            UrlParentData urlParentData2 = intlOperationBanner.icon;
            if (urlParentData2 != null) {
                iO += CodedOutputByteBufferNano.l(3, urlParentData2, UrlParentData.PROTOBUF_ADAPTER);
            }
            String str2 = intlOperationBanner.jumpUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            ((MessageNano) intlOperationBanner).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlOperationBanner m18238parse(nb5 nb5Var) throws IOException {
            IntlOperationBanner intlOperationBanner = new IntlOperationBanner();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlOperationBanner.f224id == null) {
                        intlOperationBanner.f224id = "";
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
                if (iU == 10) {
                    intlOperationBanner.f224id = nb5Var.s();
                } else if (iU == 18) {
                    intlOperationBanner.banner = (UrlParentData) nb5Var.l(UrlParentData.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    intlOperationBanner.icon = (UrlParentData) nb5Var.l(UrlParentData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (intlOperationBanner.f224id == null) {
                            intlOperationBanner.f224id = "";
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
                    intlOperationBanner.jumpUrl = nb5Var.s();
                }
            }
            return intlOperationBanner;
        }

        public void serialize(IntlOperationBanner intlOperationBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlOperationBanner.f224id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            UrlParentData urlParentData = intlOperationBanner.banner;
            if (urlParentData != null) {
                codedOutputByteBufferNano.K(2, urlParentData, UrlParentData.PROTOBUF_ADAPTER);
            }
            UrlParentData urlParentData2 = intlOperationBanner.icon;
            if (urlParentData2 != null) {
                codedOutputByteBufferNano.K(3, urlParentData2, UrlParentData.PROTOBUF_ADAPTER);
            }
            String str2 = intlOperationBanner.jumpUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
        }
    };
    public static JsonAdapter<IntlOperationBanner> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationBanner>() { // from class: com.p1.mobile.putong.data.IntlOperationBanner.2
        public Class getDataClass() {
            return IntlOperationBanner.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IntlOperationBanner mo17830newInstance() {
            return new IntlOperationBanner();
        }

        public boolean parseField(IntlOperationBanner intlOperationBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "banner":
                    intlOperationBanner.banner = (UrlParentData) UrlParentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "jumpUrl":
                    intlOperationBanner.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    intlOperationBanner.f224id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    intlOperationBanner.icon = (UrlParentData) UrlParentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationBanner intlOperationBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = intlOperationBanner.f224id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationBanner new_() {
        IntlOperationBanner intlOperationBanner = new IntlOperationBanner();
        intlOperationBanner.nullCheck();
        return intlOperationBanner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlOperationBanner m18237clone() {
        IntlOperationBanner intlOperationBanner = new IntlOperationBanner();
        intlOperationBanner.f224id = this.f224id;
        UrlParentData urlParentData = this.banner;
        if (urlParentData != null) {
            intlOperationBanner.banner = urlParentData.m19147clone();
        }
        UrlParentData urlParentData2 = this.icon;
        if (urlParentData2 != null) {
            intlOperationBanner.icon = urlParentData2.m19147clone();
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
        return ValueObject.util_equals(this.f224id, intlOperationBanner.f224id) && ValueObject.util_equals(this.banner, intlOperationBanner.banner) && ValueObject.util_equals(this.icon, intlOperationBanner.icon) && ValueObject.util_equals(this.jumpUrl, intlOperationBanner.jumpUrl);
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
        String str = this.f224id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        UrlParentData urlParentData = this.banner;
        int iHashCode2 = (iHashCode + (urlParentData != null ? urlParentData.hashCode() : 0)) * 41;
        UrlParentData urlParentData2 = this.icon;
        int iHashCode3 = (iHashCode2 + (urlParentData2 != null ? urlParentData2.hashCode() : 0)) * 41;
        String str2 = this.jumpUrl;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f224id == null) {
            this.f224id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
