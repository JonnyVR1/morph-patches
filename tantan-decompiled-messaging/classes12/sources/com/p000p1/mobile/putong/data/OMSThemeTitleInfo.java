package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSThemeTitleInfo oMSThemeTitleInfo) {
            String str = oMSThemeTitleInfo.txt;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = oMSThemeTitleInfo.color;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) oMSThemeTitleInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSThemeTitleInfo m18681parse(nb5 nb5Var) throws IOException {
            OMSThemeTitleInfo oMSThemeTitleInfo = new OMSThemeTitleInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSThemeTitleInfo.txt == null) {
                        oMSThemeTitleInfo.txt = "";
                    }
                    if (oMSThemeTitleInfo.color != null) {
                        break;
                    }
                    oMSThemeTitleInfo.color = "";
                    break;
                }
                if (iU == 10) {
                    oMSThemeTitleInfo.txt = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (oMSThemeTitleInfo.txt == null) {
                            oMSThemeTitleInfo.txt = "";
                        }
                        if (oMSThemeTitleInfo.color != null) {
                            break;
                        }
                        oMSThemeTitleInfo.color = "";
                        return oMSThemeTitleInfo;
                    }
                    oMSThemeTitleInfo.color = nb5Var.s();
                }
            }
            return oMSThemeTitleInfo;
        }

        public void serialize(OMSThemeTitleInfo oMSThemeTitleInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSThemeTitleInfo.txt;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = oMSThemeTitleInfo.color;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<OMSThemeTitleInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSThemeTitleInfo>() { // from class: com.p1.mobile.putong.data.OMSThemeTitleInfo.2
        public Class getDataClass() {
            return OMSThemeTitleInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSThemeTitleInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSThemeTitleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSThemeTitleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSThemeTitleInfo new_() {
        OMSThemeTitleInfo oMSThemeTitleInfo = new OMSThemeTitleInfo();
        oMSThemeTitleInfo.nullCheck();
        return oMSThemeTitleInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSThemeTitleInfo m18680clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.txt;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.color;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.txt == null) {
            this.txt = "";
        }
        if (this.color == null) {
            this.color = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
