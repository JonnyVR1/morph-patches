package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CoreAboutMePublicTags;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreAboutMePublicTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreaboutmepublictags";

    @NonNull
    @ProtobufIndex(index = 1)
    public Map<String, List<String>> popularTag;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> showHometown;
    public static ProtobufAdapter<CoreAboutMePublicTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreAboutMePublicTags>() { // from class: com.p1.mobile.putong.core.data.CoreAboutMePublicTags.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreAboutMePublicTags coreAboutMePublicTags) {
            Map<String, List<String>> map = coreAboutMePublicTags.popularTag;
            int iL = map != null ? CodedOutputByteBufferNano.l(1, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER()) : 0;
            List<String> list = coreAboutMePublicTags.showHometown;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) coreAboutMePublicTags).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreAboutMePublicTags m12441parse(nb5 nb5Var) throws IOException {
            CoreAboutMePublicTags coreAboutMePublicTags = new CoreAboutMePublicTags();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (coreAboutMePublicTags.popularTag == null) {
                        coreAboutMePublicTags.popularTag = Collections.EMPTY_MAP;
                    }
                    if (coreAboutMePublicTags.showHometown != null) {
                        break;
                    }
                    coreAboutMePublicTags.showHometown = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    coreAboutMePublicTags.popularTag = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (coreAboutMePublicTags.popularTag == null) {
                            coreAboutMePublicTags.popularTag = Collections.EMPTY_MAP;
                        }
                        if (coreAboutMePublicTags.showHometown != null) {
                            break;
                        }
                        coreAboutMePublicTags.showHometown = new ArrayList();
                        return coreAboutMePublicTags;
                    }
                    coreAboutMePublicTags.showHometown = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return coreAboutMePublicTags;
        }

        public void serialize(CoreAboutMePublicTags coreAboutMePublicTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, List<String>> map = coreAboutMePublicTags.popularTag;
            if (map != null) {
                codedOutputByteBufferNano.K(1, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            List<String> list = coreAboutMePublicTags.showHometown;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CoreAboutMePublicTags> JSON_ADAPTER = new ObjectJsonAdapter<CoreAboutMePublicTags>() { // from class: com.p1.mobile.putong.core.data.CoreAboutMePublicTags.2
        public Class getDataClass() {
            return CoreAboutMePublicTags.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreAboutMePublicTags m12442newInstance() {
            return new CoreAboutMePublicTags();
        }

        public boolean parseField(CoreAboutMePublicTags coreAboutMePublicTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("popularTag")) {
                coreAboutMePublicTags.popularTag = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER(), str2);
                return true;
            }
            if (!str.equals("showHometown")) {
                return false;
            }
            coreAboutMePublicTags.showHometown = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CoreAboutMePublicTags coreAboutMePublicTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("popularTag") || str.equals("showHometown")) {
                return true;
            }
            return super.parseFieldCheck(coreAboutMePublicTags, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CoreAboutMePublicTags coreAboutMePublicTags, JsonGenerator jsonGenerator) throws IOException {
            if (coreAboutMePublicTags.popularTag != null) {
                jsonGenerator.writeFieldName("popularTag");
                JsonAdapter.serializeMap(coreAboutMePublicTags.popularTag, jsonGenerator, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            if (coreAboutMePublicTags.showHometown != null) {
                jsonGenerator.writeFieldName("showHometown");
                JsonAdapter.serializeArray(coreAboutMePublicTags.showHometown, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreAboutMePublicTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreAboutMePublicTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m107a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m109c(String str) {
        return str;
    }

    public static CoreAboutMePublicTags new_() {
        CoreAboutMePublicTags coreAboutMePublicTags = new CoreAboutMePublicTags();
        coreAboutMePublicTags.nullCheck();
        return coreAboutMePublicTags;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreAboutMePublicTags m12440clone() {
        CoreAboutMePublicTags coreAboutMePublicTags = new CoreAboutMePublicTags();
        Map<String, List<String>> map = this.popularTag;
        if (map != null) {
            coreAboutMePublicTags.popularTag = ValueObject.util_map(map, new w9j() { // from class: l.lu6
                public final Object call(Object obj) {
                    return ValueObject.util_map((List) obj, new w9j() { // from class: l.nu6
                        public final Object call(Object obj2) {
                            return CoreAboutMePublicTags.m107a((String) obj2);
                        }
                    });
                }
            });
        }
        List<String> list = this.showHometown;
        if (list != null) {
            coreAboutMePublicTags.showHometown = ValueObject.util_map(list, new w9j() { // from class: l.mu6
                public final Object call(Object obj) {
                    return CoreAboutMePublicTags.m109c((String) obj);
                }
            });
        }
        return coreAboutMePublicTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreAboutMePublicTags)) {
            return false;
        }
        CoreAboutMePublicTags coreAboutMePublicTags = (CoreAboutMePublicTags) obj;
        return ValueObject.util_equals(this.popularTag, coreAboutMePublicTags.popularTag) && ValueObject.util_equals(this.showHometown, coreAboutMePublicTags.showHometown);
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
        Map<String, List<String>> map = this.popularTag;
        int iHashCode = (i2 + (map != null ? map.hashCode() : 0)) * 41;
        List<String> list = this.showHometown;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.popularTag == null) {
            this.popularTag = Collections.EMPTY_MAP;
        }
        if (this.showHometown == null) {
            this.showHometown = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
