package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ReSwipeConvLabelItem;
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
public class ReSwipeConvLabels extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reswipeconvlabels";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ReSwipeConvLabelItem> labelList;
    public static ProtobufAdapter<ReSwipeConvLabels> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReSwipeConvLabels>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConvLabels.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReSwipeConvLabels reSwipeConvLabels) {
            List<ReSwipeConvLabelItem> list = reSwipeConvLabels.labelList;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ReSwipeConvLabelItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) reSwipeConvLabels).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReSwipeConvLabels m15237parse(nb5 nb5Var) throws IOException {
            ReSwipeConvLabels reSwipeConvLabels = new ReSwipeConvLabels();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (reSwipeConvLabels.labelList != null) {
                        break;
                    }
                    reSwipeConvLabels.labelList = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (reSwipeConvLabels.labelList != null) {
                        break;
                    }
                    reSwipeConvLabels.labelList = new ArrayList();
                    return reSwipeConvLabels;
                }
                reSwipeConvLabels.labelList = (List) nb5Var.l(ReSwipeConvLabelItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return reSwipeConvLabels;
        }

        public void serialize(ReSwipeConvLabels reSwipeConvLabels, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ReSwipeConvLabelItem> list = reSwipeConvLabels.labelList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ReSwipeConvLabelItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ReSwipeConvLabels> JSON_ADAPTER = new ObjectJsonAdapter<ReSwipeConvLabels>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConvLabels.2
        public Class getDataClass() {
            return ReSwipeConvLabels.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ReSwipeConvLabels m15238newInstance() {
            return new ReSwipeConvLabels();
        }

        public boolean parseField(ReSwipeConvLabels reSwipeConvLabels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("labelList")) {
                return false;
            }
            reSwipeConvLabels.labelList = JsonAdapter.parseArray(jsonParser, ReSwipeConvLabelItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ReSwipeConvLabels reSwipeConvLabels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("labelList")) {
                return true;
            }
            return super.parseFieldCheck(reSwipeConvLabels, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ReSwipeConvLabels reSwipeConvLabels, JsonGenerator jsonGenerator) throws IOException {
            if (reSwipeConvLabels.labelList != null) {
                jsonGenerator.writeFieldName("labelList");
                JsonAdapter.serializeArray(reSwipeConvLabels.labelList, jsonGenerator, ReSwipeConvLabelItem.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReSwipeConvLabels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReSwipeConvLabels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReSwipeConvLabels new_() {
        ReSwipeConvLabels reSwipeConvLabels = new ReSwipeConvLabels();
        reSwipeConvLabels.nullCheck();
        return reSwipeConvLabels;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReSwipeConvLabels m15236clone() {
        ReSwipeConvLabels reSwipeConvLabels = new ReSwipeConvLabels();
        List<ReSwipeConvLabelItem> list = this.labelList;
        if (list != null) {
            reSwipeConvLabels.labelList = ValueObject.util_map(list, new w9j() { // from class: l.tdc0
                public final Object call(Object obj) {
                    return ((ReSwipeConvLabelItem) obj).m15232clone();
                }
            });
        }
        return reSwipeConvLabels;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReSwipeConvLabels) {
            return ValueObject.util_equals(this.labelList, ((ReSwipeConvLabels) obj).labelList);
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
        List<ReSwipeConvLabelItem> list = this.labelList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.labelList == null) {
            this.labelList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
