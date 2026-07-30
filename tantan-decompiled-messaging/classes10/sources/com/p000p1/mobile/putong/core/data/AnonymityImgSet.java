package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AnonymityAsset;
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
public class AnonymityImgSet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymityimgset";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<AnonymityAsset> items;
    public static ProtobufAdapter<AnonymityImgSet> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnonymityImgSet>() { // from class: com.p1.mobile.putong.core.data.AnonymityImgSet.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AnonymityImgSet anonymityImgSet) {
            List<AnonymityAsset> list = anonymityImgSet.items;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, AnonymityAsset.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) anonymityImgSet).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AnonymityImgSet m11633parse(nb5 nb5Var) throws IOException {
            AnonymityImgSet anonymityImgSet = new AnonymityImgSet();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (anonymityImgSet.items != null) {
                        break;
                    }
                    anonymityImgSet.items = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (anonymityImgSet.items != null) {
                        break;
                    }
                    anonymityImgSet.items = new ArrayList();
                    return anonymityImgSet;
                }
                anonymityImgSet.items = (List) nb5Var.l(AnonymityAsset.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return anonymityImgSet;
        }

        public void serialize(AnonymityImgSet anonymityImgSet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<AnonymityAsset> list = anonymityImgSet.items;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, AnonymityAsset.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AnonymityImgSet> JSON_ADAPTER = new ObjectJsonAdapter<AnonymityImgSet>() { // from class: com.p1.mobile.putong.core.data.AnonymityImgSet.2
        public Class getDataClass() {
            return AnonymityImgSet.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AnonymityImgSet m11634newInstance() {
            return new AnonymityImgSet();
        }

        public boolean parseField(AnonymityImgSet anonymityImgSet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("items")) {
                return false;
            }
            anonymityImgSet.items = JsonAdapter.parseArray(jsonParser, AnonymityAsset.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AnonymityImgSet anonymityImgSet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("items")) {
                return true;
            }
            return super.parseFieldCheck(anonymityImgSet, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AnonymityImgSet anonymityImgSet, JsonGenerator jsonGenerator) throws IOException {
            if (anonymityImgSet.items != null) {
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(anonymityImgSet.items, jsonGenerator, AnonymityAsset.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnonymityImgSet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnonymityImgSet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnonymityImgSet new_() {
        AnonymityImgSet anonymityImgSet = new AnonymityImgSet();
        anonymityImgSet.nullCheck();
        return anonymityImgSet;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AnonymityImgSet m11632clone() {
        AnonymityImgSet anonymityImgSet = new AnonymityImgSet();
        List<AnonymityAsset> list = this.items;
        if (list != null) {
            anonymityImgSet.items = ValueObject.util_map(list, new w9j() { // from class: l.us0
                public final Object call(Object obj) {
                    return ((AnonymityAsset) obj).m11624clone();
                }
            });
        }
        return anonymityImgSet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnonymityImgSet) {
            return ValueObject.util_equals(this.items, ((AnonymityImgSet) obj).items);
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
        List<AnonymityAsset> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
