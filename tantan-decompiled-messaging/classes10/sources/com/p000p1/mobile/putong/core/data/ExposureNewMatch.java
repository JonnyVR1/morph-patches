package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ExposureNewMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "exposurenewmatch";

    @ProtobufIndex(index = 1)
    public double labelExposureTime;
    public static ProtobufAdapter<ExposureNewMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExposureNewMatch>() { // from class: com.p1.mobile.putong.core.data.ExposureNewMatch.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ExposureNewMatch exposureNewMatch) {
            int iD = CodedOutputByteBufferNano.d(1, exposureNewMatch.labelExposureTime);
            ((MessageNano) exposureNewMatch).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ExposureNewMatch m12681parse(nb5 nb5Var) throws IOException {
            ExposureNewMatch exposureNewMatch = new ExposureNewMatch();
            while (nb5Var.u() == 9) {
                exposureNewMatch.labelExposureTime = nb5Var.h();
            }
            return exposureNewMatch;
        }

        public void serialize(ExposureNewMatch exposureNewMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, exposureNewMatch.labelExposureTime);
        }
    };
    public static JsonAdapter<ExposureNewMatch> JSON_ADAPTER = new ObjectJsonAdapter<ExposureNewMatch>() { // from class: com.p1.mobile.putong.core.data.ExposureNewMatch.2
        public Class getDataClass() {
            return ExposureNewMatch.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ExposureNewMatch m12682newInstance() {
            return new ExposureNewMatch();
        }

        public boolean parseField(ExposureNewMatch exposureNewMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("labelExposureTime")) {
                return false;
            }
            exposureNewMatch.labelExposureTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
            return true;
        }

        public boolean parseFieldCheck(ExposureNewMatch exposureNewMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("labelExposureTime")) {
                return true;
            }
            return super.parseFieldCheck(exposureNewMatch, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ExposureNewMatch exposureNewMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("labelExposureTime");
            Converter.API_TIME.serialize(Double.valueOf(exposureNewMatch.labelExposureTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExposureNewMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExposureNewMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExposureNewMatch new_() {
        ExposureNewMatch exposureNewMatch = new ExposureNewMatch();
        exposureNewMatch.nullCheck();
        return exposureNewMatch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ExposureNewMatch m12680clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.labelExposureTime);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
