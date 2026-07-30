package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ExposureNewMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "exposurenewmatch";

    @ProtobufIndex(index = 1)
    public double labelExposureTime;
    public static ProtobufAdapter<ExposureNewMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExposureNewMatch>() { // from class: com.p1.mobile.putong.core.data.ExposureNewMatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExposureNewMatch exposureNewMatch) {
            int iM17222d = CodedOutputByteBufferNano.m17222d(1, exposureNewMatch.labelExposureTime);
            exposureNewMatch.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExposureNewMatch parse(nb5 nb5Var) throws IOException {
            ExposureNewMatch exposureNewMatch = new ExposureNewMatch();
            while (nb5Var.m158752u() == 9) {
                exposureNewMatch.labelExposureTime = nb5Var.m158739h();
            }
            return exposureNewMatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExposureNewMatch exposureNewMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17246C(1, exposureNewMatch.labelExposureTime);
        }
    };
    public static JsonAdapter<ExposureNewMatch> JSON_ADAPTER = new ObjectJsonAdapter<ExposureNewMatch>() { // from class: com.p1.mobile.putong.core.data.ExposureNewMatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExposureNewMatch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExposureNewMatch newInstance() {
            return new ExposureNewMatch();
        }

        public boolean parseField(ExposureNewMatch exposureNewMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("labelExposureTime")) {
                return false;
            }
            exposureNewMatch.labelExposureTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
            return true;
        }

        public boolean parseFieldCheck(ExposureNewMatch exposureNewMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("labelExposureTime")) {
                return true;
            }
            return super.parseFieldCheck(exposureNewMatch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExposureNewMatch exposureNewMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("labelExposureTime");
            Converter.API_TIME.serialize(Double.valueOf(exposureNewMatch.labelExposureTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExposureNewMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExposureNewMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExposureNewMatch new_() {
        ExposureNewMatch exposureNewMatch = new ExposureNewMatch();
        exposureNewMatch.nullCheck();
        return exposureNewMatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExposureNewMatch mo223809clone() {
        ExposureNewMatch exposureNewMatch = new ExposureNewMatch();
        exposureNewMatch.labelExposureTime = this.labelExposureTime;
        return exposureNewMatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ExposureNewMatch) && this.labelExposureTime == ((ExposureNewMatch) obj).labelExposureTime;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.labelExposureTime);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
