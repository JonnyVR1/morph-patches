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
public class IntlOperationArticles extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intloperationarticles";

    @NonNull
    @ProtobufIndex(index = 3)
    public UrlParentData cover;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f223id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String jumpUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<IntlOperationArticles> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationArticles>() { // from class: com.p1.mobile.putong.data.IntlOperationArticles.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlOperationArticles intlOperationArticles) {
            String str = intlOperationArticles.f223id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlOperationArticles.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            UrlParentData urlParentData = intlOperationArticles.cover;
            if (urlParentData != null) {
                iO += CodedOutputByteBufferNano.l(3, urlParentData, UrlParentData.PROTOBUF_ADAPTER);
            }
            String str3 = intlOperationArticles.jumpUrl;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) intlOperationArticles).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlOperationArticles m18235parse(nb5 nb5Var) throws IOException {
            IntlOperationArticles intlOperationArticles = new IntlOperationArticles();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlOperationArticles.f223id == null) {
                        intlOperationArticles.f223id = "";
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
                if (iU == 10) {
                    intlOperationArticles.f223id = nb5Var.s();
                } else if (iU == 18) {
                    intlOperationArticles.title = nb5Var.s();
                } else if (iU == 26) {
                    intlOperationArticles.cover = (UrlParentData) nb5Var.l(UrlParentData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (intlOperationArticles.f223id == null) {
                            intlOperationArticles.f223id = "";
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
                    intlOperationArticles.jumpUrl = nb5Var.s();
                }
            }
            return intlOperationArticles;
        }

        public void serialize(IntlOperationArticles intlOperationArticles, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlOperationArticles.f223id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlOperationArticles.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            UrlParentData urlParentData = intlOperationArticles.cover;
            if (urlParentData != null) {
                codedOutputByteBufferNano.K(3, urlParentData, UrlParentData.PROTOBUF_ADAPTER);
            }
            String str3 = intlOperationArticles.jumpUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<IntlOperationArticles> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationArticles>() { // from class: com.p1.mobile.putong.data.IntlOperationArticles.2
        public Class getDataClass() {
            return IntlOperationArticles.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IntlOperationArticles mo17830newInstance() {
            return new IntlOperationArticles();
        }

        public boolean parseField(IntlOperationArticles intlOperationArticles, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "jumpUrl":
                    intlOperationArticles.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    intlOperationArticles.f223id = jsonParser.getValueAsString();
                    return false;
                case "cover":
                    intlOperationArticles.cover = (UrlParentData) UrlParentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationArticles intlOperationArticles, JsonGenerator jsonGenerator) throws IOException {
            String str = intlOperationArticles.f223id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationArticles) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationArticles) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationArticles new_() {
        IntlOperationArticles intlOperationArticles = new IntlOperationArticles();
        intlOperationArticles.nullCheck();
        return intlOperationArticles;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlOperationArticles m18234clone() {
        IntlOperationArticles intlOperationArticles = new IntlOperationArticles();
        intlOperationArticles.f223id = this.f223id;
        intlOperationArticles.title = this.title;
        UrlParentData urlParentData = this.cover;
        if (urlParentData != null) {
            intlOperationArticles.cover = urlParentData.m19147clone();
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
        return ValueObject.util_equals(this.f223id, intlOperationArticles.f223id) && ValueObject.util_equals(this.title, intlOperationArticles.title) && ValueObject.util_equals(this.cover, intlOperationArticles.cover) && ValueObject.util_equals(this.jumpUrl, intlOperationArticles.jumpUrl);
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
        String str = this.f223id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        UrlParentData urlParentData = this.cover;
        int iHashCode3 = (iHashCode2 + (urlParentData != null ? urlParentData.hashCode() : 0)) * 41;
        String str3 = this.jumpUrl;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f223id == null) {
            this.f223id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
