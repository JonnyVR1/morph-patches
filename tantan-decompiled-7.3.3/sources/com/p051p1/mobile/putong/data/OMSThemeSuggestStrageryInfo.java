package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSThemeSuggestStrageryInfo;
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

/* JADX INFO: loaded from: classes12.dex */
public class OMSThemeSuggestStrageryInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsthemesuggeststrageryinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String groupID;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> tags;
    public static ProtobufAdapter<OMSThemeSuggestStrageryInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSThemeSuggestStrageryInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeSuggestStrageryInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo) {
            List<String> list = oMSThemeSuggestStrageryInfo.tags;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = oMSThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            oMSThemeSuggestStrageryInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSThemeSuggestStrageryInfo parse(nc5 nc5Var) throws IOException {
            OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = new OMSThemeSuggestStrageryInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSThemeSuggestStrageryInfo.tags == null) {
                        oMSThemeSuggestStrageryInfo.tags = new ArrayList();
                    }
                    if (oMSThemeSuggestStrageryInfo.groupID != null) {
                        break;
                    }
                    oMSThemeSuggestStrageryInfo.groupID = "";
                    break;
                }
                if (iM162497u == 10) {
                    oMSThemeSuggestStrageryInfo.tags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (oMSThemeSuggestStrageryInfo.tags == null) {
                            oMSThemeSuggestStrageryInfo.tags = new ArrayList();
                        }
                        if (oMSThemeSuggestStrageryInfo.groupID != null) {
                            break;
                        }
                        oMSThemeSuggestStrageryInfo.groupID = "";
                        return oMSThemeSuggestStrageryInfo;
                    }
                    oMSThemeSuggestStrageryInfo.groupID = nc5Var.m162495s();
                }
            }
            return oMSThemeSuggestStrageryInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oMSThemeSuggestStrageryInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = oMSThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<OMSThemeSuggestStrageryInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeSuggestStrageryInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeSuggestStrageryInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSThemeSuggestStrageryInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSThemeSuggestStrageryInfo newInstance() {
            return new OMSThemeSuggestStrageryInfo();
        }

        public boolean parseField(OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tags")) {
                oMSThemeSuggestStrageryInfo.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("groupID")) {
                return false;
            }
            oMSThemeSuggestStrageryInfo.groupID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tags") || str.equals("groupID")) {
                return true;
            }
            return super.parseFieldCheck(oMSThemeSuggestStrageryInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSThemeSuggestStrageryInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(oMSThemeSuggestStrageryInfo.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = oMSThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                jsonGenerator.writeStringField("groupID", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeSuggestStrageryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeSuggestStrageryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61125a(String str) {
        return str;
    }

    public static OMSThemeSuggestStrageryInfo new_() {
        OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = new OMSThemeSuggestStrageryInfo();
        oMSThemeSuggestStrageryInfo.nullCheck();
        return oMSThemeSuggestStrageryInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSThemeSuggestStrageryInfo mo225055clone() {
        OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = new OMSThemeSuggestStrageryInfo();
        List<String> list = this.tags;
        if (list != null) {
            oMSThemeSuggestStrageryInfo.tags = ValueObject.util_map(list, new qcj() { // from class: l.d850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSThemeSuggestStrageryInfo.m61125a((String) obj);
                }
            });
        }
        oMSThemeSuggestStrageryInfo.groupID = this.groupID;
        return oMSThemeSuggestStrageryInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSThemeSuggestStrageryInfo)) {
            return false;
        }
        OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = (OMSThemeSuggestStrageryInfo) obj;
        return ValueObject.util_equals(this.tags, oMSThemeSuggestStrageryInfo.tags) && ValueObject.util_equals(this.groupID, oMSThemeSuggestStrageryInfo.groupID);
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
        List<String> list = this.tags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.groupID;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.groupID == null) {
            this.groupID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
