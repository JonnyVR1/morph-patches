package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class OMSThemeTitleInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsthemetitleinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String txt;
    public static ProtobufAdapter<OMSThemeTitleInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSThemeTitleInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeTitleInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSThemeTitleInfo oMSThemeTitleInfo) {
            String str = oMSThemeTitleInfo.txt;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = oMSThemeTitleInfo.color;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            oMSThemeTitleInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSThemeTitleInfo parse(nc5 nc5Var) throws IOException {
            OMSThemeTitleInfo oMSThemeTitleInfo = new OMSThemeTitleInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSThemeTitleInfo.txt == null) {
                        oMSThemeTitleInfo.txt = "";
                    }
                    if (oMSThemeTitleInfo.color != null) {
                        break;
                    }
                    oMSThemeTitleInfo.color = "";
                    break;
                }
                if (iM162497u == 10) {
                    oMSThemeTitleInfo.txt = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (oMSThemeTitleInfo.txt == null) {
                            oMSThemeTitleInfo.txt = "";
                        }
                        if (oMSThemeTitleInfo.color != null) {
                            break;
                        }
                        oMSThemeTitleInfo.color = "";
                        return oMSThemeTitleInfo;
                    }
                    oMSThemeTitleInfo.color = nc5Var.m162495s();
                }
            }
            return oMSThemeTitleInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSThemeTitleInfo oMSThemeTitleInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSThemeTitleInfo.txt;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = oMSThemeTitleInfo.color;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<OMSThemeTitleInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeTitleInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeTitleInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSThemeTitleInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSThemeTitleInfo newInstance() {
            return new OMSThemeTitleInfo();
        }

        public boolean parseField(OMSThemeTitleInfo oMSThemeTitleInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("txt")) {
                oMSThemeTitleInfo.txt = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("color")) {
                return false;
            }
            oMSThemeTitleInfo.color = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OMSThemeTitleInfo oMSThemeTitleInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("txt") || str.equals("color")) {
                return true;
            }
            return super.parseFieldCheck(oMSThemeTitleInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSThemeTitleInfo oMSThemeTitleInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSThemeTitleInfo.txt;
            if (str != null) {
                jsonGenerator.writeStringField("txt", str);
            }
            String str2 = oMSThemeTitleInfo.color;
            if (str2 != null) {
                jsonGenerator.writeStringField("color", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeTitleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeTitleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSThemeTitleInfo new_() {
        OMSThemeTitleInfo oMSThemeTitleInfo = new OMSThemeTitleInfo();
        oMSThemeTitleInfo.nullCheck();
        return oMSThemeTitleInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSThemeTitleInfo mo225055clone() {
        OMSThemeTitleInfo oMSThemeTitleInfo = new OMSThemeTitleInfo();
        oMSThemeTitleInfo.txt = this.txt;
        oMSThemeTitleInfo.color = this.color;
        return oMSThemeTitleInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSThemeTitleInfo)) {
            return false;
        }
        OMSThemeTitleInfo oMSThemeTitleInfo = (OMSThemeTitleInfo) obj;
        return ValueObject.util_equals(this.txt, oMSThemeTitleInfo.txt) && ValueObject.util_equals(this.color, oMSThemeTitleInfo.color);
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
        String str = this.txt;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.color;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.txt == null) {
            this.txt = "";
        }
        if (this.color == null) {
            this.color = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
