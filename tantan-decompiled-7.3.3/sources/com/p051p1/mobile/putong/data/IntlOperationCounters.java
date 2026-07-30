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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlOperationCounters intlOperationCounters) {
            IntlOperationCounterCount intlOperationCounterCount = intlOperationCounters.intlBannerActivities;
            int iM17285l = intlOperationCounterCount != null ? CodedOutputByteBufferNano.m17285l(1, intlOperationCounterCount, IntlOperationCounterCount.PROTOBUF_ADAPTER) : 0;
            IntlOperationCounterCount intlOperationCounterCount2 = intlOperationCounters.intlArticles;
            if (intlOperationCounterCount2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlOperationCounterCount2, IntlOperationCounterCount.PROTOBUF_ADAPTER);
            }
            intlOperationCounters.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlOperationCounters parse(nc5 nc5Var) throws IOException {
            IntlOperationCounters intlOperationCounters = new IntlOperationCounters();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlOperationCounters.intlBannerActivities == null) {
                        intlOperationCounters.intlBannerActivities = IntlOperationCounterCount.new_();
                    }
                    if (intlOperationCounters.intlArticles != null) {
                        break;
                    }
                    intlOperationCounters.intlArticles = IntlOperationCounterCount.new_();
                    break;
                }
                if (iM162497u == 10) {
                    intlOperationCounters.intlBannerActivities = (IntlOperationCounterCount) nc5Var.m162488l(IntlOperationCounterCount.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (intlOperationCounters.intlBannerActivities == null) {
                            intlOperationCounters.intlBannerActivities = IntlOperationCounterCount.new_();
                        }
                        if (intlOperationCounters.intlArticles != null) {
                            break;
                        }
                        intlOperationCounters.intlArticles = IntlOperationCounterCount.new_();
                        return intlOperationCounters;
                    }
                    intlOperationCounters.intlArticles = (IntlOperationCounterCount) nc5Var.m162488l(IntlOperationCounterCount.PROTOBUF_ADAPTER);
                }
            }
            return intlOperationCounters;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlOperationCounters intlOperationCounters, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlOperationCounterCount intlOperationCounterCount = intlOperationCounters.intlBannerActivities;
            if (intlOperationCounterCount != null) {
                codedOutputByteBufferNano.m17309K(1, intlOperationCounterCount, IntlOperationCounterCount.PROTOBUF_ADAPTER);
            }
            IntlOperationCounterCount intlOperationCounterCount2 = intlOperationCounters.intlArticles;
            if (intlOperationCounterCount2 != null) {
                codedOutputByteBufferNano.m17309K(2, intlOperationCounterCount2, IntlOperationCounterCount.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlOperationCounters> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationCounters>() { // from class: com.p1.mobile.putong.data.IntlOperationCounters.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlOperationCounters.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlOperationCounters newInstance() {
            return new IntlOperationCounters();
        }

        public boolean parseField(IntlOperationCounters intlOperationCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("intlArticles")) {
                intlOperationCounters.intlArticles = IntlOperationCounterCount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("intlBannerActivities")) {
                return false;
            }
            intlOperationCounters.intlBannerActivities = IntlOperationCounterCount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlOperationCounters intlOperationCounters, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("intlArticles") || str.equals("intlBannerActivities")) {
                return true;
            }
            return super.parseFieldCheck(intlOperationCounters, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationCounters) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationCounters new_() {
        IntlOperationCounters intlOperationCounters = new IntlOperationCounters();
        intlOperationCounters.nullCheck();
        return intlOperationCounters;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlOperationCounters mo225055clone() {
        IntlOperationCounters intlOperationCounters = new IntlOperationCounters();
        IntlOperationCounterCount intlOperationCounterCount = this.intlBannerActivities;
        if (intlOperationCounterCount != null) {
            intlOperationCounters.intlBannerActivities = intlOperationCounterCount.mo225055clone();
        }
        IntlOperationCounterCount intlOperationCounterCount2 = this.intlArticles;
        if (intlOperationCounterCount2 != null) {
            intlOperationCounters.intlArticles = intlOperationCounterCount2.mo225055clone();
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
        IntlOperationCounterCount intlOperationCounterCount = this.intlBannerActivities;
        int iHashCode = (i2 + (intlOperationCounterCount != null ? intlOperationCounterCount.hashCode() : 0)) * 41;
        IntlOperationCounterCount intlOperationCounterCount2 = this.intlArticles;
        int iHashCode2 = iHashCode + (intlOperationCounterCount2 != null ? intlOperationCounterCount2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.intlBannerActivities == null) {
            this.intlBannerActivities = IntlOperationCounterCount.new_();
        }
        if (this.intlArticles == null) {
            this.intlArticles = IntlOperationCounterCount.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
