package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CommonDoubleTitleIconClick;
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
public class CommonDoubleTitleIconClickList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commondoubletitleiconclicklist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<CommonDoubleTitleIconClick> msgData;
    public static ProtobufAdapter<CommonDoubleTitleIconClickList> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonDoubleTitleIconClickList>() { // from class: com.p1.mobile.putong.core.data.CommonDoubleTitleIconClickList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CommonDoubleTitleIconClickList commonDoubleTitleIconClickList) {
            List<CommonDoubleTitleIconClick> list = commonDoubleTitleIconClickList.msgData;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, CommonDoubleTitleIconClick.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            commonDoubleTitleIconClickList.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CommonDoubleTitleIconClickList parse(nc5 nc5Var) throws IOException {
            CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = new CommonDoubleTitleIconClickList();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (commonDoubleTitleIconClickList.msgData != null) {
                        break;
                    }
                    commonDoubleTitleIconClickList.msgData = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (commonDoubleTitleIconClickList.msgData != null) {
                        break;
                    }
                    commonDoubleTitleIconClickList.msgData = new ArrayList();
                    return commonDoubleTitleIconClickList;
                }
                commonDoubleTitleIconClickList.msgData = (List) nc5Var.m162488l(CommonDoubleTitleIconClick.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return commonDoubleTitleIconClickList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CommonDoubleTitleIconClickList commonDoubleTitleIconClickList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<CommonDoubleTitleIconClick> list = commonDoubleTitleIconClickList.msgData;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, CommonDoubleTitleIconClick.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CommonDoubleTitleIconClickList> JSON_ADAPTER = new ObjectJsonAdapter<CommonDoubleTitleIconClickList>() { // from class: com.p1.mobile.putong.core.data.CommonDoubleTitleIconClickList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CommonDoubleTitleIconClickList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CommonDoubleTitleIconClickList newInstance() {
            return new CommonDoubleTitleIconClickList();
        }

        public boolean parseField(CommonDoubleTitleIconClickList commonDoubleTitleIconClickList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("msgData")) {
                return false;
            }
            commonDoubleTitleIconClickList.msgData = JsonAdapter.parseArray(jsonParser, CommonDoubleTitleIconClick.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CommonDoubleTitleIconClickList commonDoubleTitleIconClickList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("msgData")) {
                return true;
            }
            return super.parseFieldCheck(commonDoubleTitleIconClickList, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommonDoubleTitleIconClickList commonDoubleTitleIconClickList, JsonGenerator jsonGenerator) throws IOException {
            if (commonDoubleTitleIconClickList.msgData != null) {
                jsonGenerator.writeFieldName("msgData");
                JsonAdapter.serializeArray(commonDoubleTitleIconClickList.msgData, jsonGenerator, CommonDoubleTitleIconClick.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonDoubleTitleIconClickList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonDoubleTitleIconClickList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonDoubleTitleIconClickList new_() {
        CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = new CommonDoubleTitleIconClickList();
        commonDoubleTitleIconClickList.nullCheck();
        return commonDoubleTitleIconClickList;
    }

    public static CommonDoubleTitleIconClickList parse(String str) {
        try {
            return JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CommonDoubleTitleIconClickList mo225055clone() {
        CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = new CommonDoubleTitleIconClickList();
        List<CommonDoubleTitleIconClick> list = this.msgData;
        if (list != null) {
            commonDoubleTitleIconClickList.msgData = ValueObject.util_map(list, new qcj() { // from class: l.wj5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CommonDoubleTitleIconClick) obj).mo225055clone();
                }
            });
        }
        return commonDoubleTitleIconClickList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonDoubleTitleIconClickList) {
            return ValueObject.util_equals(this.msgData, ((CommonDoubleTitleIconClickList) obj).msgData);
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
        List<CommonDoubleTitleIconClick> list = this.msgData;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.msgData == null) {
            this.msgData = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
