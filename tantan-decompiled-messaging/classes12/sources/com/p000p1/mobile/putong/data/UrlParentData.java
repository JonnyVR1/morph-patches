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
public class UrlParentData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "urlparentdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<UrlParentData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UrlParentData>() { // from class: com.p1.mobile.putong.data.UrlParentData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UrlParentData urlParentData) {
            String str = urlParentData.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) urlParentData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UrlParentData m19148parse(nb5 nb5Var) throws IOException {
            UrlParentData urlParentData = new UrlParentData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (urlParentData.url != null) {
                        break;
                    }
                    urlParentData.url = "";
                    break;
                }
                if (iU != 10) {
                    if (urlParentData.url != null) {
                        break;
                    }
                    urlParentData.url = "";
                    return urlParentData;
                }
                urlParentData.url = nb5Var.s();
            }
            return urlParentData;
        }

        public void serialize(UrlParentData urlParentData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = urlParentData.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<UrlParentData> JSON_ADAPTER = new ObjectJsonAdapter<UrlParentData>() { // from class: com.p1.mobile.putong.data.UrlParentData.2
        public Class getDataClass() {
            return UrlParentData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UrlParentData mo17830newInstance() {
            return new UrlParentData();
        }

        public boolean parseField(UrlParentData urlParentData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("url")) {
                return false;
            }
            urlParentData.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UrlParentData urlParentData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(urlParentData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UrlParentData urlParentData, JsonGenerator jsonGenerator) throws IOException {
            String str = urlParentData.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UrlParentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UrlParentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UrlParentData new_() {
        UrlParentData urlParentData = new UrlParentData();
        urlParentData.nullCheck();
        return urlParentData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UrlParentData m19147clone() {
        UrlParentData urlParentData = new UrlParentData();
        urlParentData.url = this.url;
        return urlParentData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UrlParentData) {
            return ValueObject.util_equals(this.url, ((UrlParentData) obj).url);
        }
        return false;
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
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
