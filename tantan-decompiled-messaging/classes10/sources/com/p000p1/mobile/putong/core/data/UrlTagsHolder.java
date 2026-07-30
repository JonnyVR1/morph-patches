package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.UrlTag;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UrlTagsHolder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "urltagsholder";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UrlTag> urlTags;
    public static ProtobufAdapter<UrlTagsHolder> PROTOBUF_ADAPTER = new MessageNanoAdapter<UrlTagsHolder>() { // from class: com.p1.mobile.putong.core.data.UrlTagsHolder.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UrlTagsHolder urlTagsHolder) {
            List<UrlTag> list = urlTagsHolder.urlTags;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) urlTagsHolder).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UrlTagsHolder m16088parse(nb5 nb5Var) throws IOException {
            UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (urlTagsHolder.urlTags != null) {
                        break;
                    }
                    urlTagsHolder.urlTags = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (urlTagsHolder.urlTags != null) {
                        break;
                    }
                    urlTagsHolder.urlTags = new ArrayList();
                    return urlTagsHolder;
                }
                urlTagsHolder.urlTags = (List) nb5Var.l(UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return urlTagsHolder;
        }

        public void serialize(UrlTagsHolder urlTagsHolder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UrlTag> list = urlTagsHolder.urlTags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UrlTagsHolder> JSON_ADAPTER = new ObjectJsonAdapter<UrlTagsHolder>() { // from class: com.p1.mobile.putong.core.data.UrlTagsHolder.2
        public Class getDataClass() {
            return UrlTagsHolder.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UrlTagsHolder m16089newInstance() {
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

        public void serializeFields(UrlTagsHolder urlTagsHolder, JsonGenerator jsonGenerator) throws IOException {
            if (urlTagsHolder.urlTags != null) {
                jsonGenerator.writeFieldName("urlTags");
                JsonAdapter.serializeArray(urlTagsHolder.urlTags, jsonGenerator, UrlTag.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UrlTagsHolder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UrlTagsHolder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UrlTagsHolder new_() {
        UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
        urlTagsHolder.nullCheck();
        return urlTagsHolder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UrlTagsHolder m16087clone() {
        UrlTagsHolder urlTagsHolder = new UrlTagsHolder();
        List<UrlTag> list = this.urlTags;
        if (list != null) {
            urlTagsHolder.urlTags = ValueObject.util_map(list, new w9j() { // from class: l.twj0
                public final Object call(Object obj) {
                    return ((UrlTag) obj).m16083clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<UrlTag> list = this.urlTags;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.urlTags == null) {
            this.urlTags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
