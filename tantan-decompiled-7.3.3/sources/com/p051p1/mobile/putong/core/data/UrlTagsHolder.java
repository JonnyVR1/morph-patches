package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.UrlTag;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class UrlTagsHolder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "urltagsholder";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UrlTag> urlTags;
    public static ProtobufAdapter<UrlTagsHolder> PROTOBUF_ADAPTER = new MessageNanoAdapter<UrlTagsHolder>() { // from class: com.p1.mobile.putong.core.data.UrlTagsHolder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UrlTagsHolder urlTagsHolder) {
            List<UrlTag> list = urlTagsHolder.urlTags;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            urlTagsHolder.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UrlTagsHolder parse(nc5 nc5Var) throws IOException {
            UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (urlTagsHolder.urlTags != null) {
                        break;
                    }
                    urlTagsHolder.urlTags = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (urlTagsHolder.urlTags != null) {
                        break;
                    }
                    urlTagsHolder.urlTags = new ArrayList();
                    return urlTagsHolder;
                }
                urlTagsHolder.urlTags = (List) nc5Var.m162488l(UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return urlTagsHolder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UrlTagsHolder urlTagsHolder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UrlTag> list = urlTagsHolder.urlTags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UrlTagsHolder> JSON_ADAPTER = new ObjectJsonAdapter<UrlTagsHolder>() { // from class: com.p1.mobile.putong.core.data.UrlTagsHolder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UrlTagsHolder.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UrlTagsHolder newInstance() {
            return new UrlTagsHolder();
        }

        public boolean parseField(UrlTagsHolder urlTagsHolder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("urlTags")) {
                return false;
            }
            urlTagsHolder.urlTags = JsonAdapter.parseArray(jsonParser, UrlTag.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UrlTagsHolder urlTagsHolder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("urlTags")) {
                return true;
            }
            return super.parseFieldCheck(urlTagsHolder, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UrlTagsHolder urlTagsHolder, JsonGenerator jsonGenerator) throws IOException {
            if (urlTagsHolder.urlTags != null) {
                jsonGenerator.writeFieldName("urlTags");
                JsonAdapter.serializeArray(urlTagsHolder.urlTags, jsonGenerator, UrlTag.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UrlTagsHolder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UrlTagsHolder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UrlTagsHolder new_() {
        UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
        urlTagsHolder.nullCheck();
        return urlTagsHolder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UrlTagsHolder mo225055clone() {
        UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
        List<UrlTag> list = this.urlTags;
        if (list != null) {
            urlTagsHolder.urlTags = ValueObject.util_map(list, new qcj() { // from class: l.x5k0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UrlTag) obj).mo225055clone();
                }
            });
        }
        return urlTagsHolder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UrlTagsHolder) {
            return ValueObject.util_equals(this.urlTags, ((UrlTagsHolder) obj).urlTags);
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
        List<UrlTag> list = this.urlTags;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.urlTags == null) {
            this.urlTags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
