package com.p046p1.mobile.putong.data;

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
public class UrlParentData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "urlparentdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<UrlParentData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UrlParentData>() { // from class: com.p1.mobile.putong.data.UrlParentData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UrlParentData urlParentData) {
            String str = urlParentData.url;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            urlParentData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UrlParentData parse(nb5 nb5Var) throws IOException {
            UrlParentData urlParentData = new UrlParentData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (urlParentData.url != null) {
                        break;
                    }
                    urlParentData.url = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (urlParentData.url != null) {
                        break;
                    }
                    urlParentData.url = "";
                    return urlParentData;
                }
                urlParentData.url = nb5Var.m158750s();
            }
            return urlParentData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UrlParentData urlParentData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = urlParentData.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<UrlParentData> JSON_ADAPTER = new ObjectJsonAdapter<UrlParentData>() { // from class: com.p1.mobile.putong.data.UrlParentData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UrlParentData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UrlParentData newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UrlParentData urlParentData, JsonGenerator jsonGenerator) throws IOException {
            String str = urlParentData.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UrlParentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UrlParentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UrlParentData new_() {
        UrlParentData urlParentData = new UrlParentData();
        urlParentData.nullCheck();
        return urlParentData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UrlParentData mo223809clone() {
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
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
