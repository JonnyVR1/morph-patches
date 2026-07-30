package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PremiumWeeklyGuideData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "premiumweeklyguidedata";

    @ProtobufIndex(index = 1)
    public boolean needGuide;
    public static ProtobufAdapter<PremiumWeeklyGuideData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PremiumWeeklyGuideData>() { // from class: com.p1.mobile.putong.core.data.PremiumWeeklyGuideData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PremiumWeeklyGuideData premiumWeeklyGuideData) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, premiumWeeklyGuideData.needGuide);
            premiumWeeklyGuideData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PremiumWeeklyGuideData parse(nc5 nc5Var) throws IOException {
            PremiumWeeklyGuideData premiumWeeklyGuideData = new PremiumWeeklyGuideData();
            while (nc5Var.m162497u() == 8) {
                premiumWeeklyGuideData.needGuide = nc5Var.m162483g();
            }
            return premiumWeeklyGuideData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PremiumWeeklyGuideData premiumWeeklyGuideData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, premiumWeeklyGuideData.needGuide);
        }
    };
    public static JsonAdapter<PremiumWeeklyGuideData> JSON_ADAPTER = new ObjectJsonAdapter<PremiumWeeklyGuideData>() { // from class: com.p1.mobile.putong.core.data.PremiumWeeklyGuideData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PremiumWeeklyGuideData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PremiumWeeklyGuideData newInstance() {
            return new PremiumWeeklyGuideData();
        }

        public boolean parseField(PremiumWeeklyGuideData premiumWeeklyGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("needGuide")) {
                return false;
            }
            premiumWeeklyGuideData.needGuide = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(PremiumWeeklyGuideData premiumWeeklyGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("needGuide")) {
                return true;
            }
            return super.parseFieldCheck(premiumWeeklyGuideData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PremiumWeeklyGuideData premiumWeeklyGuideData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("needGuide", premiumWeeklyGuideData.needGuide);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PremiumWeeklyGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PremiumWeeklyGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PremiumWeeklyGuideData new_() {
        PremiumWeeklyGuideData premiumWeeklyGuideData = new PremiumWeeklyGuideData();
        premiumWeeklyGuideData.nullCheck();
        return premiumWeeklyGuideData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PremiumWeeklyGuideData mo225055clone() {
        PremiumWeeklyGuideData premiumWeeklyGuideData = new PremiumWeeklyGuideData();
        premiumWeeklyGuideData.needGuide = this.needGuide;
        return premiumWeeklyGuideData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PremiumWeeklyGuideData) && this.needGuide == ((PremiumWeeklyGuideData) obj).needGuide;
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
        int i2 = (i * 41) + (this.needGuide ? 1231 : 1237);
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
