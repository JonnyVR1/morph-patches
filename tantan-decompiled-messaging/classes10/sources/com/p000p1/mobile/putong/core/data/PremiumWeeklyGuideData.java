package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class PremiumWeeklyGuideData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "premiumweeklyguidedata";

    @ProtobufIndex(index = 1)
    public boolean needGuide;
    public static ProtobufAdapter<PremiumWeeklyGuideData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PremiumWeeklyGuideData>() { // from class: com.p1.mobile.putong.core.data.PremiumWeeklyGuideData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PremiumWeeklyGuideData premiumWeeklyGuideData) {
            int iB = CodedOutputByteBufferNano.b(1, premiumWeeklyGuideData.needGuide);
            ((MessageNano) premiumWeeklyGuideData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PremiumWeeklyGuideData m14837parse(nb5 nb5Var) throws IOException {
            PremiumWeeklyGuideData premiumWeeklyGuideData = new PremiumWeeklyGuideData();
            while (nb5Var.u() == 8) {
                premiumWeeklyGuideData.needGuide = nb5Var.g();
            }
            return premiumWeeklyGuideData;
        }

        public void serialize(PremiumWeeklyGuideData premiumWeeklyGuideData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, premiumWeeklyGuideData.needGuide);
        }
    };
    public static JsonAdapter<PremiumWeeklyGuideData> JSON_ADAPTER = new ObjectJsonAdapter<PremiumWeeklyGuideData>() { // from class: com.p1.mobile.putong.core.data.PremiumWeeklyGuideData.2
        public Class getDataClass() {
            return PremiumWeeklyGuideData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PremiumWeeklyGuideData m14838newInstance() {
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

        public void serializeFields(PremiumWeeklyGuideData premiumWeeklyGuideData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("needGuide", premiumWeeklyGuideData.needGuide);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PremiumWeeklyGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PremiumWeeklyGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PremiumWeeklyGuideData new_() {
        PremiumWeeklyGuideData premiumWeeklyGuideData = new PremiumWeeklyGuideData();
        premiumWeeklyGuideData.nullCheck();
        return premiumWeeklyGuideData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PremiumWeeklyGuideData m14836clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.needGuide ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
