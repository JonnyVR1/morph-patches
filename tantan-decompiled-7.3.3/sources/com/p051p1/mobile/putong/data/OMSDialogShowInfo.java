package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.DialogShowInfo;
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
import java.util.Collections;
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class OMSDialogShowInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdialogshowinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public Map<String, DialogShowInfo> showInfos;
    public static ProtobufAdapter<OMSDialogShowInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDialogShowInfo>() { // from class: com.p1.mobile.putong.data.OMSDialogShowInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDialogShowInfo oMSDialogShowInfo) {
            Map<String, DialogShowInfo> map = oMSDialogShowInfo.showInfos;
            int iM17285l = map != null ? CodedOutputByteBufferNano.m17285l(1, map, DialogShowInfo.PROTOBUF_ADAPTER.MAP_ADAPTER()) : 0;
            oMSDialogShowInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDialogShowInfo parse(nc5 nc5Var) throws IOException {
            OMSDialogShowInfo oMSDialogShowInfo = new OMSDialogShowInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSDialogShowInfo.showInfos != null) {
                        break;
                    }
                    oMSDialogShowInfo.showInfos = Collections.EMPTY_MAP;
                    break;
                }
                if (iM162497u != 10) {
                    if (oMSDialogShowInfo.showInfos != null) {
                        break;
                    }
                    oMSDialogShowInfo.showInfos = Collections.EMPTY_MAP;
                    return oMSDialogShowInfo;
                }
                oMSDialogShowInfo.showInfos = (Map) nc5Var.m162488l(DialogShowInfo.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            return oMSDialogShowInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDialogShowInfo oMSDialogShowInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, DialogShowInfo> map = oMSDialogShowInfo.showInfos;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(1, map, DialogShowInfo.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSDialogShowInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialogShowInfo>() { // from class: com.p1.mobile.putong.data.OMSDialogShowInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDialogShowInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDialogShowInfo newInstance() {
            return new OMSDialogShowInfo();
        }

        public boolean parseField(OMSDialogShowInfo oMSDialogShowInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("showInfos")) {
                return false;
            }
            oMSDialogShowInfo.showInfos = JsonAdapter.parseMap(jsonParser, DialogShowInfo.JSON_ADAPTER, str2);
            return true;
        }

        public boolean parseFieldCheck(OMSDialogShowInfo oMSDialogShowInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showInfos")) {
                return true;
            }
            return super.parseFieldCheck(oMSDialogShowInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDialogShowInfo oMSDialogShowInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSDialogShowInfo.showInfos != null) {
                jsonGenerator.writeFieldName("showInfos");
                JsonAdapter.serializeMap(oMSDialogShowInfo.showInfos, jsonGenerator, DialogShowInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialogShowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialogShowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDialogShowInfo new_() {
        OMSDialogShowInfo oMSDialogShowInfo = new OMSDialogShowInfo();
        oMSDialogShowInfo.nullCheck();
        return oMSDialogShowInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDialogShowInfo mo225055clone() {
        OMSDialogShowInfo oMSDialogShowInfo = new OMSDialogShowInfo();
        Map<String, DialogShowInfo> map = this.showInfos;
        if (map != null) {
            oMSDialogShowInfo.showInfos = ValueObject.util_map(map, new qcj() { // from class: l.k750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DialogShowInfo) obj).mo225055clone();
                }
            });
        }
        return oMSDialogShowInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OMSDialogShowInfo) {
            return ValueObject.util_equals(this.showInfos, ((OMSDialogShowInfo) obj).showInfos);
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
        Map<String, DialogShowInfo> map = this.showInfos;
        int iHashCode = i2 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showInfos == null) {
            this.showInfos = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
