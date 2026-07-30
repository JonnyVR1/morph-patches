package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.TriggerDialogFromListBean;
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
public class TriggerDialogFromListBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "triggerdialogfromlistbean";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> svipShowTypeFromList;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> vipSVipShowTypeFromList;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> vipShowTypeFromList;
    public static ProtobufAdapter<TriggerDialogFromListBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<TriggerDialogFromListBean>() { // from class: com.p1.mobile.putong.core.data.TriggerDialogFromListBean.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TriggerDialogFromListBean triggerDialogFromListBean) {
            List<String> list = triggerDialogFromListBean.vipShowTypeFromList;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = triggerDialogFromListBean.svipShowTypeFromList;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = triggerDialogFromListBean.vipSVipShowTypeFromList;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) triggerDialogFromListBean).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TriggerDialogFromListBean m16044parse(nb5 nb5Var) throws IOException {
            TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (triggerDialogFromListBean.vipShowTypeFromList == null) {
                        triggerDialogFromListBean.vipShowTypeFromList = new ArrayList();
                    }
                    if (triggerDialogFromListBean.svipShowTypeFromList == null) {
                        triggerDialogFromListBean.svipShowTypeFromList = new ArrayList();
                    }
                    if (triggerDialogFromListBean.vipSVipShowTypeFromList != null) {
                        break;
                    }
                    triggerDialogFromListBean.vipSVipShowTypeFromList = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    triggerDialogFromListBean.vipShowTypeFromList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    triggerDialogFromListBean.svipShowTypeFromList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (triggerDialogFromListBean.vipShowTypeFromList == null) {
                            triggerDialogFromListBean.vipShowTypeFromList = new ArrayList();
                        }
                        if (triggerDialogFromListBean.svipShowTypeFromList == null) {
                            triggerDialogFromListBean.svipShowTypeFromList = new ArrayList();
                        }
                        if (triggerDialogFromListBean.vipSVipShowTypeFromList != null) {
                            break;
                        }
                        triggerDialogFromListBean.vipSVipShowTypeFromList = new ArrayList();
                        return triggerDialogFromListBean;
                    }
                    triggerDialogFromListBean.vipSVipShowTypeFromList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return triggerDialogFromListBean;
        }

        public void serialize(TriggerDialogFromListBean triggerDialogFromListBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = triggerDialogFromListBean.vipShowTypeFromList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = triggerDialogFromListBean.svipShowTypeFromList;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = triggerDialogFromListBean.vipSVipShowTypeFromList;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TriggerDialogFromListBean> JSON_ADAPTER = new ObjectJsonAdapter<TriggerDialogFromListBean>() { // from class: com.p1.mobile.putong.core.data.TriggerDialogFromListBean.2
        public Class getDataClass() {
            return TriggerDialogFromListBean.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TriggerDialogFromListBean m16045newInstance() {
            return new TriggerDialogFromListBean();
        }

        public boolean parseField(TriggerDialogFromListBean triggerDialogFromListBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "vipShowTypeFromList":
                    triggerDialogFromListBean.vipShowTypeFromList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "svipShowTypeFromList":
                    triggerDialogFromListBean.svipShowTypeFromList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "vipSVipShowTypeFromList":
                    triggerDialogFromListBean.vipSVipShowTypeFromList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TriggerDialogFromListBean triggerDialogFromListBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "vipShowTypeFromList":
                case "svipShowTypeFromList":
                case "vipSVipShowTypeFromList":
                    return true;
                default:
                    return super.parseFieldCheck(triggerDialogFromListBean, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TriggerDialogFromListBean triggerDialogFromListBean, JsonGenerator jsonGenerator) throws IOException {
            if (triggerDialogFromListBean.vipShowTypeFromList != null) {
                jsonGenerator.writeFieldName("vipShowTypeFromList");
                JsonAdapter.serializeArray(triggerDialogFromListBean.vipShowTypeFromList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (triggerDialogFromListBean.svipShowTypeFromList != null) {
                jsonGenerator.writeFieldName("svipShowTypeFromList");
                JsonAdapter.serializeArray(triggerDialogFromListBean.svipShowTypeFromList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (triggerDialogFromListBean.vipSVipShowTypeFromList != null) {
                jsonGenerator.writeFieldName("vipSVipShowTypeFromList");
                JsonAdapter.serializeArray(triggerDialogFromListBean.vipSVipShowTypeFromList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerDialogFromListBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerDialogFromListBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m684a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m685b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m686c(String str) {
        return str;
    }

    public static TriggerDialogFromListBean new_() {
        TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
        triggerDialogFromListBean.nullCheck();
        return triggerDialogFromListBean;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TriggerDialogFromListBean m16043clone() {
        TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
        List<String> list = this.vipShowTypeFromList;
        if (list != null) {
            triggerDialogFromListBean.vipShowTypeFromList = ValueObject.util_map(list, new w9j() { // from class: l.oaj0
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m685b((String) obj);
                }
            });
        }
        List<String> list2 = this.svipShowTypeFromList;
        if (list2 != null) {
            triggerDialogFromListBean.svipShowTypeFromList = ValueObject.util_map(list2, new w9j() { // from class: l.paj0
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m686c((String) obj);
                }
            });
        }
        List<String> list3 = this.vipSVipShowTypeFromList;
        if (list3 != null) {
            triggerDialogFromListBean.vipSVipShowTypeFromList = ValueObject.util_map(list3, new w9j() { // from class: l.qaj0
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m684a((String) obj);
                }
            });
        }
        return triggerDialogFromListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggerDialogFromListBean)) {
            return false;
        }
        TriggerDialogFromListBean triggerDialogFromListBean = (TriggerDialogFromListBean) obj;
        return ValueObject.util_equals(this.vipShowTypeFromList, triggerDialogFromListBean.vipShowTypeFromList) && ValueObject.util_equals(this.svipShowTypeFromList, triggerDialogFromListBean.svipShowTypeFromList) && ValueObject.util_equals(this.vipSVipShowTypeFromList, triggerDialogFromListBean.vipSVipShowTypeFromList);
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
        List<String> list = this.vipShowTypeFromList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.svipShowTypeFromList;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.vipSVipShowTypeFromList;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.vipShowTypeFromList == null) {
            this.vipShowTypeFromList = new ArrayList();
        }
        if (this.svipShowTypeFromList == null) {
            this.svipShowTypeFromList = new ArrayList();
        }
        if (this.vipSVipShowTypeFromList == null) {
            this.vipSVipShowTypeFromList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
