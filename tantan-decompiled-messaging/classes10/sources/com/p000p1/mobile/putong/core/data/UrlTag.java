package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.UserTagData;
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
public class UrlTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "urltag";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<UserTagData> tags;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<UrlTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<UrlTag>() { // from class: com.p1.mobile.putong.core.data.UrlTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UrlTag urlTag) {
            String str = urlTag.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<UserTagData> list = urlTag.tags;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) urlTag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UrlTag m16084parse(nb5 nb5Var) throws IOException {
            UrlTag urlTag = new UrlTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (urlTag.url == null) {
                        urlTag.url = "";
                    }
                    if (urlTag.tags != null) {
                        break;
                    }
                    urlTag.tags = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    urlTag.url = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (urlTag.url == null) {
                            urlTag.url = "";
                        }
                        if (urlTag.tags != null) {
                            break;
                        }
                        urlTag.tags = new ArrayList();
                        return urlTag;
                    }
                    urlTag.tags = (List) nb5Var.l(UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return urlTag;
        }

        public void serialize(UrlTag urlTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = urlTag.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<UserTagData> list = urlTag.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UrlTag> JSON_ADAPTER = new ObjectJsonAdapter<UrlTag>() { // from class: com.p1.mobile.putong.core.data.UrlTag.2
        public Class getDataClass() {
            return UrlTag.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UrlTag m16085newInstance() {
            return new UrlTag();
        }

        public boolean parseField(UrlTag urlTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("url")) {
                urlTag.url = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("tags")) {
                return false;
            }
            urlTag.tags = JsonAdapter.parseArray(jsonParser, UserTagData.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UrlTag urlTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("url") || str.equals("tags")) {
                return true;
            }
            return super.parseFieldCheck(urlTag, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(UrlTag urlTag, JsonGenerator jsonGenerator) throws IOException {
            String str = urlTag.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            if (urlTag.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(urlTag.tags, jsonGenerator, UserTagData.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UrlTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UrlTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UrlTag new_() {
        UrlTag urlTag = new UrlTag();
        urlTag.nullCheck();
        return urlTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UrlTag m16083clone() {
        UrlTag urlTag = new UrlTag();
        urlTag.url = this.url;
        List<UserTagData> list = this.tags;
        if (list != null) {
            urlTag.tags = ValueObject.util_map(list, new w9j() { // from class: l.swj0
                public final Object call(Object obj) {
                    return ((UserTagData) obj).m16187clone();
                }
            });
        }
        return urlTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UrlTag)) {
            return false;
        }
        UrlTag urlTag = (UrlTag) obj;
        return ValueObject.util_equals(this.url, urlTag.url) && ValueObject.util_equals(this.tags, urlTag.tags);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<UserTagData> list = this.tags;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
