package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.TribeSubsetContent;
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
public class TribeSubset extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tribesubset";

    @NonNull
    @ProtobufIndex(index = 1)
    public String groupCategory;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String mainHead;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String subHead;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<TribeSubsetContent> subsetContent;
    public static ProtobufAdapter<TribeSubset> PROTOBUF_ADAPTER = new MessageNanoAdapter<TribeSubset>() { // from class: com.p1.mobile.putong.core.data.TribeSubset.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TribeSubset tribeSubset) {
            String str = tribeSubset.groupCategory;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = tribeSubset.mainHead;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = tribeSubset.subHead;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            List<TribeSubsetContent> list = tribeSubset.subsetContent;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, TribeSubsetContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) tribeSubset).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TribeSubset m16032parse(nb5 nb5Var) throws IOException {
            TribeSubset tribeSubset = new TribeSubset();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tribeSubset.groupCategory == null) {
                        tribeSubset.groupCategory = "";
                    }
                    if (tribeSubset.mainHead == null) {
                        tribeSubset.mainHead = "";
                    }
                    if (tribeSubset.subHead == null) {
                        tribeSubset.subHead = "";
                    }
                    if (tribeSubset.subsetContent != null) {
                        break;
                    }
                    tribeSubset.subsetContent = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    tribeSubset.groupCategory = nb5Var.s();
                } else if (iU == 18) {
                    tribeSubset.mainHead = nb5Var.s();
                } else if (iU == 26) {
                    tribeSubset.subHead = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (tribeSubset.groupCategory == null) {
                            tribeSubset.groupCategory = "";
                        }
                        if (tribeSubset.mainHead == null) {
                            tribeSubset.mainHead = "";
                        }
                        if (tribeSubset.subHead == null) {
                            tribeSubset.subHead = "";
                        }
                        if (tribeSubset.subsetContent != null) {
                            break;
                        }
                        tribeSubset.subsetContent = new ArrayList();
                        return tribeSubset;
                    }
                    tribeSubset.subsetContent = (List) nb5Var.l(TribeSubsetContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return tribeSubset;
        }

        public void serialize(TribeSubset tribeSubset, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tribeSubset.groupCategory;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = tribeSubset.mainHead;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = tribeSubset.subHead;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            List<TribeSubsetContent> list = tribeSubset.subsetContent;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, TribeSubsetContent.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TribeSubset> JSON_ADAPTER = new ObjectJsonAdapter<TribeSubset>() { // from class: com.p1.mobile.putong.core.data.TribeSubset.2
        public Class getDataClass() {
            return TribeSubset.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TribeSubset m16033newInstance() {
            return new TribeSubset();
        }

        public boolean parseField(TribeSubset tribeSubset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subHead":
                    tribeSubset.subHead = jsonParser.getValueAsString();
                    return true;
                case "subsetContent":
                    tribeSubset.subsetContent = JsonAdapter.parseArray(jsonParser, TribeSubsetContent.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mainHead":
                    tribeSubset.mainHead = jsonParser.getValueAsString();
                    return true;
                case "groupCategory":
                    tribeSubset.groupCategory = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TribeSubset tribeSubset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subHead":
                case "subsetContent":
                case "mainHead":
                case "groupCategory":
                    return true;
                default:
                    return super.parseFieldCheck(tribeSubset, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TribeSubset tribeSubset, JsonGenerator jsonGenerator) throws IOException {
            String str = tribeSubset.groupCategory;
            if (str != null) {
                jsonGenerator.writeStringField("groupCategory", str);
            }
            String str2 = tribeSubset.mainHead;
            if (str2 != null) {
                jsonGenerator.writeStringField("mainHead", str2);
            }
            String str3 = tribeSubset.subHead;
            if (str3 != null) {
                jsonGenerator.writeStringField("subHead", str3);
            }
            if (tribeSubset.subsetContent != null) {
                jsonGenerator.writeFieldName("subsetContent");
                JsonAdapter.serializeArray(tribeSubset.subsetContent, jsonGenerator, TribeSubsetContent.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TribeSubset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TribeSubset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TribeSubset new_() {
        TribeSubset tribeSubset = new TribeSubset();
        tribeSubset.nullCheck();
        return tribeSubset;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TribeSubset m16031clone() {
        TribeSubset tribeSubset = new TribeSubset();
        tribeSubset.groupCategory = this.groupCategory;
        tribeSubset.mainHead = this.mainHead;
        tribeSubset.subHead = this.subHead;
        List<TribeSubsetContent> list = this.subsetContent;
        if (list != null) {
            tribeSubset.subsetContent = ValueObject.util_map(list, new w9j() { // from class: l.jaj0
                public final Object call(Object obj) {
                    return ((TribeSubsetContent) obj).m16035clone();
                }
            });
        }
        return tribeSubset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TribeSubset)) {
            return false;
        }
        TribeSubset tribeSubset = (TribeSubset) obj;
        return ValueObject.util_equals(this.groupCategory, tribeSubset.groupCategory) && ValueObject.util_equals(this.mainHead, tribeSubset.mainHead) && ValueObject.util_equals(this.subHead, tribeSubset.subHead) && ValueObject.util_equals(this.subsetContent, tribeSubset.subsetContent);
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
        String str = this.groupCategory;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mainHead;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subHead;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<TribeSubsetContent> list = this.subsetContent;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.groupCategory == null) {
            this.groupCategory = "";
        }
        if (this.mainHead == null) {
            this.mainHead = "";
        }
        if (this.subHead == null) {
            this.subHead = "";
        }
        if (this.subsetContent == null) {
            this.subsetContent = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
