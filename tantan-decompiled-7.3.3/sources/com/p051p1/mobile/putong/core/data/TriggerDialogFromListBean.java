package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.TriggerDialogFromListBean;
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
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = triggerDialogFromListBean.svipShowTypeFromList;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = triggerDialogFromListBean.vipSVipShowTypeFromList;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            triggerDialogFromListBean.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TriggerDialogFromListBean parse(nc5 nc5Var) throws IOException {
            TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    triggerDialogFromListBean.vipShowTypeFromList = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    triggerDialogFromListBean.svipShowTypeFromList = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
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
                    triggerDialogFromListBean.vipSVipShowTypeFromList = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return triggerDialogFromListBean;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TriggerDialogFromListBean triggerDialogFromListBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = triggerDialogFromListBean.vipShowTypeFromList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = triggerDialogFromListBean.svipShowTypeFromList;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = triggerDialogFromListBean.vipSVipShowTypeFromList;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TriggerDialogFromListBean> JSON_ADAPTER = new ObjectJsonAdapter<TriggerDialogFromListBean>() { // from class: com.p1.mobile.putong.core.data.TriggerDialogFromListBean.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TriggerDialogFromListBean.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TriggerDialogFromListBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TriggerDialogFromListBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36885a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36886b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m36887c(String str) {
        return str;
    }

    public static TriggerDialogFromListBean new_() {
        TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
        triggerDialogFromListBean.nullCheck();
        return triggerDialogFromListBean;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TriggerDialogFromListBean mo225055clone() {
        TriggerDialogFromListBean triggerDialogFromListBean = new TriggerDialogFromListBean();
        List<String> list = this.vipShowTypeFromList;
        if (list != null) {
            triggerDialogFromListBean.vipShowTypeFromList = ValueObject.util_map(list, new qcj() { // from class: l.sjj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m36886b((String) obj);
                }
            });
        }
        List<String> list2 = this.svipShowTypeFromList;
        if (list2 != null) {
            triggerDialogFromListBean.svipShowTypeFromList = ValueObject.util_map(list2, new qcj() { // from class: l.tjj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m36887c((String) obj);
                }
            });
        }
        List<String> list3 = this.vipSVipShowTypeFromList;
        if (list3 != null) {
            triggerDialogFromListBean.vipSVipShowTypeFromList = ValueObject.util_map(list3, new qcj() { // from class: l.ujj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TriggerDialogFromListBean.m36885a((String) obj);
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
