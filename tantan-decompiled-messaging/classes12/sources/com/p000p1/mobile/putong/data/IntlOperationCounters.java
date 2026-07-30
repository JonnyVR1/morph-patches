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
public class IntlOperationCounters extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intloperationcounters";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlOperationCounterCount intlArticles;

    @NonNull
    @ProtobufIndex(index = 1)
    public IntlOperationCounterCount intlBannerActivities;
    public static ProtobufAdapter<IntlOperationCounters> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationCounters>() { // from class: com.p1.mobile.putong.data.IntlOperationCounters.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlOperationCounters intlOperationCounters) {
            IntlOperationCounterCount intlOperationCounterCount = intlOperationCounters.intlBannerActivities;
            int iL = intlOperationCounterCount != null ? CodedOutputByteBufferNano.l(1, intlOperationCounterCount, IntlOperationCounterCount.PROTOBUF_ADAPTER) : 0;
            IntlOperationCounterCount intlOperationCounterCount2 = intlOperationCounters.intlArticles;
            if (intlOperationCounterCount2 != null) {
                iL += CodedOutputByteBufferNano.l(2, intlOperationCounterCount2, IntlOperationCounterCount.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlOperationCounters).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlOperationCounters m18244parse(nb5 nb5Var) throws IOException {
            IntlOperationCounters intlOperationCounters = new IntlOperationCounters();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlOperationCounters.intlBannerActivities == null) {
                        intlOperationCounters.intlBannerActivities = IntlOperationCounterCount.new_();
                    }
                    if (intlOperationCounters.intlArticles != null) {
                        break;
                    }
                    intlOperationCounters.intlArticles = IntlOperationCounterCount.new_();
                    break;
                }
                if (iU == 10) {
                    intlOperationCounters.intlBannerActivities = (IntlOperationCounterCount) nb5Var.l(IntlOperationCounterCount.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlOperationCounters.intlBannerActivities == null) {
                            intlOperationCounters.intlBannerActivities = IntlOperationCounterCount.new_();
                        }
                        if (intlOperationCounters.intlArticles != null) {
                            break;
                        }
                        intlOperationCounters.intlArticles = IntlOperationCounterCount.new_();
                        return intlOperationCounters;
                    }
                    intlOperationCounters.intlArticles = (IntlOperationCounterCount) nb5Var.l(IntlOperationCounterCount.PROTOBUF_ADAPTER);
                }
            }
            return intlOperationCounters;
        }

        public void serialize(IntlOperationCounters intlOperationCounters, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlOperationCounterCount intlOperationCounterCount = intlOperationCounters.intlBannerActivities;
            if (intlOperationCounterCount != null) {
                codedOutputByteBufferNano.K(1, intlOperationCounterCount, IntlOperationCounterCount.PROTOBUF_ADAPTER);
            }
            IntlOperationCounterCount intlOperationCounterCount2 = intlOperationCounters.intlArticles;
            if (intlOperationCounterCount2 != null) {
                codedOutputByteBufferNano.K(2, intlOperationCounterCount2, IntlOperationCounterCount.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlOperationCounters> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationCounters>() { // from class: com.p1.mobile.putong.data.IntlOperationCounters.2
        public Class getDataClass() {
            return IntlOperationCounters.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IntlOperationCounters mo17830newInstance() {
            return new IntlOperationCounters();
        }

        public boolean parseField(IntlOperationCounters intlOperationCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("intlArticles")) {
                intlOperationCounters.intlArticles = (IntlOperationCounterCount) IntlOperationCounterCount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("intlBannerActivities")) {
                return false;
            }
            intlOperationCounters.intlBannerActivities = (IntlOperationCounterCount) IntlOperationCounterCount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlOperationCounters intlOperationCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("intlArticles") || str.equals("intlBannerActivities")) {
                return true;
            }
            return super.parseFieldCheck(intlOperationCounters, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationCounters intlOperationCounters, JsonGenerator jsonGenerator) throws IOException {
            if (intlOperationCounters.intlBannerActivities != null) {
                jsonGenerator.writeFieldName("intlBannerActivities");
                IntlOperationCounterCount.JSON_ADAPTER.serialize(intlOperationCounters.intlBannerActivities, jsonGenerator, true);
            }
            if (intlOperationCounters.intlArticles != null) {
                jsonGenerator.writeFieldName("intlArticles");
                IntlOperationCounterCount.JSON_ADAPTER.serialize(intlOperationCounters.intlArticles, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationCounters new_() {
        IntlOperationCounters intlOperationCounters = new IntlOperationCounters();
        intlOperationCounters.nullCheck();
        return intlOperationCounters;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlOperationCounters m18243clone() {
        IntlOperationCounters intlOperationCounters = new IntlOperationCounters();
        IntlOperationCounterCount intlOperationCounterCount = this.intlBannerActivities;
        if (intlOperationCounterCount != null) {
            intlOperationCounters.intlBannerActivities = intlOperationCounterCount.m18240clone();
        }
        IntlOperationCounterCount intlOperationCounterCount2 = this.intlArticles;
        if (intlOperationCounterCount2 != null) {
            intlOperationCounters.intlArticles = intlOperationCounterCount2.m18240clone();
        }
        return intlOperationCounters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlOperationCounters)) {
            return false;
        }
        IntlOperationCounters intlOperationCounters = (IntlOperationCounters) obj;
        return ValueObject.util_equals(this.intlBannerActivities, intlOperationCounters.intlBannerActivities) && ValueObject.util_equals(this.intlArticles, intlOperationCounters.intlArticles);
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
        IntlOperationCounterCount intlOperationCounterCount = this.intlBannerActivities;
        int iHashCode = (i2 + (intlOperationCounterCount != null ? intlOperationCounterCount.hashCode() : 0)) * 41;
        IntlOperationCounterCount intlOperationCounterCount2 = this.intlArticles;
        int iHashCode2 = iHashCode + (intlOperationCounterCount2 != null ? intlOperationCounterCount2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.intlBannerActivities == null) {
            this.intlBannerActivities = IntlOperationCounterCount.new_();
        }
        if (this.intlArticles == null) {
            this.intlArticles = IntlOperationCounterCount.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
