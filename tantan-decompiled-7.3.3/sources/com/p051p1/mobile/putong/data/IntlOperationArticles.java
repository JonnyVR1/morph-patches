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
public class IntlOperationArticles extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intloperationarticles";

    @NonNull
    @ProtobufIndex(index = 3)
    public UrlParentData cover;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39610id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String jumpUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<IntlOperationArticles> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationArticles>() { // from class: com.p1.mobile.putong.data.IntlOperationArticles.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlOperationArticles intlOperationArticles) {
            String str = intlOperationArticles.f39610id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = intlOperationArticles.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            UrlParentData urlParentData = intlOperationArticles.cover;
            if (urlParentData != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, urlParentData, UrlParentData.PROTOBUF_ADAPTER);
            }
            String str3 = intlOperationArticles.jumpUrl;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            intlOperationArticles.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlOperationArticles parse(nc5 nc5Var) throws IOException {
            IntlOperationArticles intlOperationArticles = new IntlOperationArticles();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlOperationArticles.f39610id == null) {
                        intlOperationArticles.f39610id = "";
                    }
                    if (intlOperationArticles.title == null) {
                        intlOperationArticles.title = "";
                    }
                    if (intlOperationArticles.cover == null) {
                        intlOperationArticles.cover = UrlParentData.new_();
                    }
                    if (intlOperationArticles.jumpUrl != null) {
                        break;
                    }
                    intlOperationArticles.jumpUrl = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlOperationArticles.f39610id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    intlOperationArticles.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    intlOperationArticles.cover = (UrlParentData) nc5Var.m162488l(UrlParentData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (intlOperationArticles.f39610id == null) {
                            intlOperationArticles.f39610id = "";
                        }
                        if (intlOperationArticles.title == null) {
                            intlOperationArticles.title = "";
                        }
                        if (intlOperationArticles.cover == null) {
                            intlOperationArticles.cover = UrlParentData.new_();
                        }
                        if (intlOperationArticles.jumpUrl != null) {
                            break;
                        }
                        intlOperationArticles.jumpUrl = "";
                        return intlOperationArticles;
                    }
                    intlOperationArticles.jumpUrl = nc5Var.m162495s();
                }
            }
            return intlOperationArticles;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlOperationArticles intlOperationArticles, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlOperationArticles.f39610id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = intlOperationArticles.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            UrlParentData urlParentData = intlOperationArticles.cover;
            if (urlParentData != null) {
                codedOutputByteBufferNano.m17309K(3, urlParentData, UrlParentData.PROTOBUF_ADAPTER);
            }
            String str3 = intlOperationArticles.jumpUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<IntlOperationArticles> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationArticles>() { // from class: com.p1.mobile.putong.data.IntlOperationArticles.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlOperationArticles.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlOperationArticles newInstance() {
            return new IntlOperationArticles();
        }

        public boolean parseField(IntlOperationArticles intlOperationArticles, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "jumpUrl":
                    intlOperationArticles.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    intlOperationArticles.f39610id = jsonParser.getValueAsString();
                    return false;
                case "cover":
                    intlOperationArticles.cover = UrlParentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    intlOperationArticles.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlOperationArticles intlOperationArticles, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "jumpUrl":
                    return true;
                case "id":
                    return false;
                case "cover":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(intlOperationArticles, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationArticles intlOperationArticles, JsonGenerator jsonGenerator) throws IOException {
            String str = intlOperationArticles.f39610id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = intlOperationArticles.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            if (intlOperationArticles.cover != null) {
                jsonGenerator.writeFieldName("cover");
                UrlParentData.JSON_ADAPTER.serialize(intlOperationArticles.cover, jsonGenerator, true);
            }
            String str3 = intlOperationArticles.jumpUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("jumpUrl", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationArticles) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationArticles) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationArticles new_() {
        IntlOperationArticles intlOperationArticles = new IntlOperationArticles();
        intlOperationArticles.nullCheck();
        return intlOperationArticles;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlOperationArticles mo225055clone() {
        IntlOperationArticles intlOperationArticles = new IntlOperationArticles();
        intlOperationArticles.f39610id = this.f39610id;
        intlOperationArticles.title = this.title;
        UrlParentData urlParentData = this.cover;
        if (urlParentData != null) {
            intlOperationArticles.cover = urlParentData.mo225055clone();
        }
        intlOperationArticles.jumpUrl = this.jumpUrl;
        return intlOperationArticles;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlOperationArticles)) {
            return false;
        }
        IntlOperationArticles intlOperationArticles = (IntlOperationArticles) obj;
        return ValueObject.util_equals(this.f39610id, intlOperationArticles.f39610id) && ValueObject.util_equals(this.title, intlOperationArticles.title) && ValueObject.util_equals(this.cover, intlOperationArticles.cover) && ValueObject.util_equals(this.jumpUrl, intlOperationArticles.jumpUrl);
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
        String str = this.f39610id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        UrlParentData urlParentData = this.cover;
        int iHashCode3 = (iHashCode2 + (urlParentData != null ? urlParentData.hashCode() : 0)) * 41;
        String str3 = this.jumpUrl;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39610id == null) {
            this.f39610id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.cover == null) {
            this.cover = UrlParentData.new_();
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
