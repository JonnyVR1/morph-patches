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
public class OMSMetasData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsmetasdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public NewOmsLoadStrategy loadStrategy;

    @NonNull
    @ProtobufIndex(index = 1)
    public String version;
    public static ProtobufAdapter<OMSMetasData> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSMetasData>() { // from class: com.p1.mobile.putong.data.OMSMetasData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSMetasData oMSMetasData) {
            String str = oMSMetasData.version;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            NewOmsLoadStrategy newOmsLoadStrategy = oMSMetasData.loadStrategy;
            if (newOmsLoadStrategy != null) {
                iO += CodedOutputByteBufferNano.l(2, newOmsLoadStrategy, NewOmsLoadStrategy.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSMetasData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSMetasData m18642parse(nb5 nb5Var) throws IOException {
            OMSMetasData oMSMetasData = new OMSMetasData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSMetasData.version == null) {
                        oMSMetasData.version = "";
                    }
                    if (oMSMetasData.loadStrategy != null) {
                        break;
                    }
                    oMSMetasData.loadStrategy = NewOmsLoadStrategy.new_();
                    break;
                }
                if (iU == 10) {
                    oMSMetasData.version = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (oMSMetasData.version == null) {
                            oMSMetasData.version = "";
                        }
                        if (oMSMetasData.loadStrategy != null) {
                            break;
                        }
                        oMSMetasData.loadStrategy = NewOmsLoadStrategy.new_();
                        return oMSMetasData;
                    }
                    oMSMetasData.loadStrategy = (NewOmsLoadStrategy) nb5Var.l(NewOmsLoadStrategy.PROTOBUF_ADAPTER);
                }
            }
            return oMSMetasData;
        }

        public void serialize(OMSMetasData oMSMetasData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSMetasData.version;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            NewOmsLoadStrategy newOmsLoadStrategy = oMSMetasData.loadStrategy;
            if (newOmsLoadStrategy != null) {
                codedOutputByteBufferNano.K(2, newOmsLoadStrategy, NewOmsLoadStrategy.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSMetasData> JSON_ADAPTER = new ObjectJsonAdapter<OMSMetasData>() { // from class: com.p1.mobile.putong.data.OMSMetasData.2
        public Class getDataClass() {
            return OMSMetasData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSMetasData mo17830newInstance() {
            return new OMSMetasData();
        }

        public boolean parseField(OMSMetasData oMSMetasData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("loadStrategy")) {
                oMSMetasData.loadStrategy = (NewOmsLoadStrategy) NewOmsLoadStrategy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("version")) {
                return false;
            }
            oMSMetasData.version = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OMSMetasData oMSMetasData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("loadStrategy") || str.equals("version")) {
                return true;
            }
            return super.parseFieldCheck(oMSMetasData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSMetasData oMSMetasData, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSMetasData.version;
            if (str != null) {
                jsonGenerator.writeStringField("version", str);
            }
            if (oMSMetasData.loadStrategy != null) {
                jsonGenerator.writeFieldName("loadStrategy");
                NewOmsLoadStrategy.JSON_ADAPTER.serialize(oMSMetasData.loadStrategy, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSMetasData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSMetasData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSMetasData new_() {
        OMSMetasData oMSMetasData = new OMSMetasData();
        oMSMetasData.nullCheck();
        return oMSMetasData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSMetasData m18641clone() {
        OMSMetasData oMSMetasData = new OMSMetasData();
        oMSMetasData.version = this.version;
        NewOmsLoadStrategy newOmsLoadStrategy = this.loadStrategy;
        if (newOmsLoadStrategy != null) {
            oMSMetasData.loadStrategy = newOmsLoadStrategy.m18539clone();
        }
        return oMSMetasData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSMetasData)) {
            return false;
        }
        OMSMetasData oMSMetasData = (OMSMetasData) obj;
        return ValueObject.util_equals(this.version, oMSMetasData.version) && ValueObject.util_equals(this.loadStrategy, oMSMetasData.loadStrategy);
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        NewOmsLoadStrategy newOmsLoadStrategy = this.loadStrategy;
        int iHashCode2 = iHashCode + (newOmsLoadStrategy != null ? newOmsLoadStrategy.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.loadStrategy == null) {
            this.loadStrategy = NewOmsLoadStrategy.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
