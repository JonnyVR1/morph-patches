package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSThemeSuggestStrageryInfo;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo) {
            List<String> list = oMSThemeSuggestStrageryInfo.tags;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = oMSThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) oMSThemeSuggestStrageryInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSThemeSuggestStrageryInfo m18678parse(nb5 nb5Var) throws IOException {
            OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = new OMSThemeSuggestStrageryInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSThemeSuggestStrageryInfo.tags == null) {
                        oMSThemeSuggestStrageryInfo.tags = new ArrayList();
                    }
                    if (oMSThemeSuggestStrageryInfo.groupID != null) {
                        break;
                    }
                    oMSThemeSuggestStrageryInfo.groupID = "";
                    break;
                }
                if (iU == 10) {
                    oMSThemeSuggestStrageryInfo.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (oMSThemeSuggestStrageryInfo.tags == null) {
                            oMSThemeSuggestStrageryInfo.tags = new ArrayList();
                        }
                        if (oMSThemeSuggestStrageryInfo.groupID != null) {
                            break;
                        }
                        oMSThemeSuggestStrageryInfo.groupID = "";
                        return oMSThemeSuggestStrageryInfo;
                    }
                    oMSThemeSuggestStrageryInfo.groupID = nb5Var.s();
                }
            }
            return oMSThemeSuggestStrageryInfo;
        }

        public void serialize(OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oMSThemeSuggestStrageryInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = oMSThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<OMSThemeSuggestStrageryInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeSuggestStrageryInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeSuggestStrageryInfo.2
        public Class getDataClass() {
            return OMSThemeSuggestStrageryInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSThemeSuggestStrageryInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeSuggestStrageryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeSuggestStrageryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m859a(String str) {
        return str;
    }

    public static OMSThemeSuggestStrageryInfo new_() {
        OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = new OMSThemeSuggestStrageryInfo();
        oMSThemeSuggestStrageryInfo.nullCheck();
        return oMSThemeSuggestStrageryInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSThemeSuggestStrageryInfo m18677clone() {
        OMSThemeSuggestStrageryInfo oMSThemeSuggestStrageryInfo = new OMSThemeSuggestStrageryInfo();
        List<String> list = this.tags;
        if (list != null) {
            oMSThemeSuggestStrageryInfo.tags = ValueObject.util_map(list, new w9j() { // from class: l.oz40
                public final Object call(Object obj) {
                    return OMSThemeSuggestStrageryInfo.m859a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.tags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.groupID;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.groupID == null) {
            this.groupID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
