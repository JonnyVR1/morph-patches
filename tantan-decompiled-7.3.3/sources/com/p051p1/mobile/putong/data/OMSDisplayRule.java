package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSDisplayRule;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class OMSDisplayRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdisplayrule";

    @ProtobufIndex(index = 3)
    public int count;

    @ProtobufIndex(index = 9)
    public int dayOffset;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> frequency;

    @ProtobufIndex(index = 5)
    public int priority;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceID;

    @ProtobufIndex(index = 4)
    public int sessionCount;

    @ProtobufIndex(index = 6)
    public int timePerDay;

    @ProtobufIndex(index = 7)
    public int timePerWeek;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<Long> timeRange;

    @ProtobufIndex(index = 10)
    public boolean userDimension;
    public static ProtobufAdapter<OMSDisplayRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDisplayRule>() { // from class: com.p1.mobile.putong.data.OMSDisplayRule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDisplayRule oMSDisplayRule) {
            String str = oMSDisplayRule.resourceID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<Integer> list = oMSDisplayRule.frequency;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, oMSDisplayRule.count) + CodedOutputByteBufferNano.m17281h(4, oMSDisplayRule.sessionCount) + CodedOutputByteBufferNano.m17281h(5, oMSDisplayRule.priority) + CodedOutputByteBufferNano.m17281h(6, oMSDisplayRule.timePerDay) + CodedOutputByteBufferNano.m17281h(7, oMSDisplayRule.timePerWeek);
            List<Long> list2 = oMSDisplayRule.timeRange;
            if (list2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(8, list2, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(9, oMSDisplayRule.dayOffset) + CodedOutputByteBufferNano.m17275b(10, oMSDisplayRule.userDimension);
            oMSDisplayRule.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDisplayRule parse(nc5 nc5Var) throws IOException {
            OMSDisplayRule oMSDisplayRule = new OMSDisplayRule();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (oMSDisplayRule.resourceID == null) {
                            oMSDisplayRule.resourceID = "";
                        }
                        if (oMSDisplayRule.frequency == null) {
                            oMSDisplayRule.frequency = new ArrayList();
                        }
                        if (oMSDisplayRule.timeRange == null) {
                            oMSDisplayRule.timeRange = new ArrayList();
                        }
                        break;
                    case 10:
                        oMSDisplayRule.resourceID = nc5Var.m162495s();
                        continue;
                    case 18:
                        oMSDisplayRule.frequency = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 24:
                        oMSDisplayRule.count = nc5Var.m162486j();
                        continue;
                    case 32:
                        oMSDisplayRule.sessionCount = nc5Var.m162486j();
                        continue;
                    case 40:
                        oMSDisplayRule.priority = nc5Var.m162486j();
                        continue;
                    case 48:
                        oMSDisplayRule.timePerDay = nc5Var.m162486j();
                        continue;
                    case 56:
                        oMSDisplayRule.timePerWeek = nc5Var.m162486j();
                        continue;
                    case 66:
                        oMSDisplayRule.timeRange = (List) nc5Var.m162488l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 72:
                        oMSDisplayRule.dayOffset = nc5Var.m162486j();
                        continue;
                    case 80:
                        oMSDisplayRule.userDimension = nc5Var.m162483g();
                        continue;
                    default:
                        if (oMSDisplayRule.resourceID == null) {
                            oMSDisplayRule.resourceID = "";
                        }
                        if (oMSDisplayRule.frequency == null) {
                            oMSDisplayRule.frequency = new ArrayList();
                        }
                        if (oMSDisplayRule.timeRange == null) {
                            oMSDisplayRule.timeRange = new ArrayList();
                            return oMSDisplayRule;
                        }
                        break;
                }
            }
            return oMSDisplayRule;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDisplayRule oMSDisplayRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSDisplayRule.resourceID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<Integer> list = oMSDisplayRule.frequency;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(3, oMSDisplayRule.count);
            codedOutputByteBufferNano.m17305G(4, oMSDisplayRule.sessionCount);
            codedOutputByteBufferNano.m17305G(5, oMSDisplayRule.priority);
            codedOutputByteBufferNano.m17305G(6, oMSDisplayRule.timePerDay);
            codedOutputByteBufferNano.m17305G(7, oMSDisplayRule.timePerWeek);
            List<Long> list2 = oMSDisplayRule.timeRange;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(8, list2, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(9, oMSDisplayRule.dayOffset);
            codedOutputByteBufferNano.m17299A(10, oMSDisplayRule.userDimension);
        }
    };
    public static JsonAdapter<OMSDisplayRule> JSON_ADAPTER = new ObjectJsonAdapter<OMSDisplayRule>() { // from class: com.p1.mobile.putong.data.OMSDisplayRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDisplayRule.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDisplayRule newInstance() {
            return new OMSDisplayRule();
        }

        public boolean parseField(OMSDisplayRule oMSDisplayRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resourceID":
                    oMSDisplayRule.resourceID = jsonParser.getValueAsString();
                    return true;
                case "priority":
                    oMSDisplayRule.priority = jsonParser.getValueAsInt();
                    return true;
                case "dayOffset":
                    oMSDisplayRule.dayOffset = jsonParser.getValueAsInt();
                    return true;
                case "sessionCount":
                    oMSDisplayRule.sessionCount = jsonParser.getValueAsInt();
                    return true;
                case "frequency":
                    oMSDisplayRule.frequency = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "timeRange":
                    oMSDisplayRule.timeRange = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "timePerWeek":
                    oMSDisplayRule.timePerWeek = jsonParser.getValueAsInt();
                    return true;
                case "count":
                    oMSDisplayRule.count = jsonParser.getValueAsInt();
                    return true;
                case "timePerDay":
                    oMSDisplayRule.timePerDay = jsonParser.getValueAsInt();
                    return true;
                case "userDimension":
                    oMSDisplayRule.userDimension = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSDisplayRule oMSDisplayRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "resourceID":
                case "priority":
                case "dayOffset":
                case "sessionCount":
                case "frequency":
                case "timeRange":
                case "timePerWeek":
                case "count":
                case "timePerDay":
                case "userDimension":
                    return true;
                default:
                    return super.parseFieldCheck(oMSDisplayRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDisplayRule oMSDisplayRule, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSDisplayRule.resourceID;
            if (str != null) {
                jsonGenerator.writeStringField("resourceID", str);
            }
            if (oMSDisplayRule.frequency != null) {
                jsonGenerator.writeFieldName("frequency");
                JsonAdapter.serializeArray(oMSDisplayRule.frequency, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("count", oMSDisplayRule.count);
            jsonGenerator.writeNumberField("sessionCount", oMSDisplayRule.sessionCount);
            jsonGenerator.writeNumberField("priority", oMSDisplayRule.priority);
            jsonGenerator.writeNumberField("timePerDay", oMSDisplayRule.timePerDay);
            jsonGenerator.writeNumberField("timePerWeek", oMSDisplayRule.timePerWeek);
            if (oMSDisplayRule.timeRange != null) {
                jsonGenerator.writeFieldName("timeRange");
                JsonAdapter.serializeArray(oMSDisplayRule.timeRange, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("dayOffset", oMSDisplayRule.dayOffset);
            jsonGenerator.writeBooleanField("userDimension", oMSDisplayRule.userDimension);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDisplayRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDisplayRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m61092a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Long m61093b(Long l2) {
        return l2;
    }

    public static OMSDisplayRule new_() {
        OMSDisplayRule oMSDisplayRule = new OMSDisplayRule();
        oMSDisplayRule.nullCheck();
        return oMSDisplayRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDisplayRule mo225055clone() {
        OMSDisplayRule oMSDisplayRule = new OMSDisplayRule();
        oMSDisplayRule.resourceID = this.resourceID;
        List<Integer> list = this.frequency;
        if (list != null) {
            oMSDisplayRule.frequency = ValueObject.util_map(list, new qcj() { // from class: l.l750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSDisplayRule.m61092a((Integer) obj);
                }
            });
        }
        oMSDisplayRule.count = this.count;
        oMSDisplayRule.sessionCount = this.sessionCount;
        oMSDisplayRule.priority = this.priority;
        oMSDisplayRule.timePerDay = this.timePerDay;
        oMSDisplayRule.timePerWeek = this.timePerWeek;
        List<Long> list2 = this.timeRange;
        if (list2 != null) {
            oMSDisplayRule.timeRange = ValueObject.util_map(list2, new qcj() { // from class: l.m750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSDisplayRule.m61093b((Long) obj);
                }
            });
        }
        oMSDisplayRule.dayOffset = this.dayOffset;
        oMSDisplayRule.userDimension = this.userDimension;
        return oMSDisplayRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSDisplayRule)) {
            return false;
        }
        OMSDisplayRule oMSDisplayRule = (OMSDisplayRule) obj;
        return ValueObject.util_equals(this.resourceID, oMSDisplayRule.resourceID) && ValueObject.util_equals(this.frequency, oMSDisplayRule.frequency) && this.count == oMSDisplayRule.count && this.sessionCount == oMSDisplayRule.sessionCount && this.priority == oMSDisplayRule.priority && this.timePerDay == oMSDisplayRule.timePerDay && this.timePerWeek == oMSDisplayRule.timePerWeek && ValueObject.util_equals(this.timeRange, oMSDisplayRule.timeRange) && this.dayOffset == oMSDisplayRule.dayOffset && this.userDimension == oMSDisplayRule.userDimension;
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
        String str = this.resourceID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Integer> list = this.frequency;
        int iHashCode2 = (((((((((((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.count) * 41) + this.sessionCount) * 41) + this.priority) * 41) + this.timePerDay) * 41) + this.timePerWeek) * 41;
        List<Long> list2 = this.timeRange;
        int iHashCode3 = ((((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.dayOffset) * 41) + (this.userDimension ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.resourceID == null) {
            this.resourceID = "";
        }
        if (this.frequency == null) {
            this.frequency = new ArrayList();
        }
        if (this.timeRange == null) {
            this.timeRange = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
