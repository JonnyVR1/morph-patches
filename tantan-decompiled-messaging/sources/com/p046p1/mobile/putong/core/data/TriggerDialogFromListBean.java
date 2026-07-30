package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.TriggerDialogFromListBean;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class TriggerDialogFromListBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "triggerdialogfromlistbean";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> svipShowTypeFromList;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> vipSVipShowTypeFromList;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> vipShowTypeFromList;
    public static ProtobufAdapter<TriggerDialogFromListBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<TriggerDialogFromListBean>() { // from class: com.p1.mobile.putong.core.data.TriggerDialogFromListBean.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TriggerDialogFromListBean triggerDialogFromListBean) {
            List<String> list = triggerDialogFromListBean.vipShowTypeFromList;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = triggerDialogFromListBean.svipShowTypeFromList;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = triggerDialogFromListBean.vipSVipShowTypeFromList;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            triggerDialogFromListBean.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TriggerDialogFromListBean parse(nb5 nb5Var) throws IOException {
            TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    triggerDialogFromListBean.vipShowTypeFromList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    triggerDialogFromListBean.svipShowTypeFromList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
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
                    triggerDialogFromListBean.vipSVipShowTypeFromList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return triggerDialogFromListBean;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TriggerDialogFromListBean triggerDialogFromListBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = triggerDialogFromListBean.vipShowTypeFromList;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = triggerDialogFromListBean.svipShowTypeFromList;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = triggerDialogFromListBean.vipSVipShowTypeFromList;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TriggerDialogFromListBean> JSON_ADAPTER = new ObjectJsonAdapter<TriggerDialogFromListBean>() { // from class: com.p1.mobile.putong.core.data.TriggerDialogFromListBean.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TriggerDialogFromListBean.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TriggerDialogFromListBean newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerDialogFromListBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerDialogFromListBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35882a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35883b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m35884c(String str) {
        return str;
    }

    public static TriggerDialogFromListBean new_() {
        TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
        triggerDialogFromListBean.nullCheck();
        return triggerDialogFromListBean;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TriggerDialogFromListBean mo223809clone() {
        TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
        List<String> list = this.vipShowTypeFromList;
        if (list != null) {
            triggerDialogFromListBean.vipShowTypeFromList = ValueObject.util_map(list, new w9j() { // from class: l.oaj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m35883b((String) obj);
                }
            });
        }
        List<String> list2 = this.svipShowTypeFromList;
        if (list2 != null) {
            triggerDialogFromListBean.svipShowTypeFromList = ValueObject.util_map(list2, new w9j() { // from class: l.paj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m35884c((String) obj);
                }
            });
        }
        List<String> list3 = this.vipSVipShowTypeFromList;
        if (list3 != null) {
            triggerDialogFromListBean.vipSVipShowTypeFromList = ValueObject.util_map(list3, new w9j() { // from class: l.qaj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m35882a((String) obj);
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
        List<String> list = this.vipShowTypeFromList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.svipShowTypeFromList;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.vipSVipShowTypeFromList;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
