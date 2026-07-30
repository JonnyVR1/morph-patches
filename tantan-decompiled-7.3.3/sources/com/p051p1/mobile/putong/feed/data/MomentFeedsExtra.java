package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

/* JADX INFO: loaded from: classes13.dex */
public class MomentFeedsExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentfeedsextra";

    @NonNull
    @ProtobufIndex(index = 2)
    public String optionId;

    @Nullable
    @ProtobufIndex(index = 1)
    public String report;
    public static ProtobufAdapter<MomentFeedsExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentFeedsExtra>() { // from class: com.p1.mobile.putong.feed.data.MomentFeedsExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentFeedsExtra momentFeedsExtra) {
            String str = momentFeedsExtra.report;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = momentFeedsExtra.optionId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            momentFeedsExtra.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentFeedsExtra parse(nc5 nc5Var) throws IOException {
            MomentFeedsExtra momentFeedsExtra = new MomentFeedsExtra();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (momentFeedsExtra.optionId != null) {
                        break;
                    }
                    momentFeedsExtra.optionId = "";
                    break;
                }
                if (iM162497u == 10) {
                    momentFeedsExtra.report = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (momentFeedsExtra.optionId != null) {
                            break;
                        }
                        momentFeedsExtra.optionId = "";
                        return momentFeedsExtra;
                    }
                    momentFeedsExtra.optionId = nc5Var.m162495s();
                }
            }
            return momentFeedsExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentFeedsExtra momentFeedsExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentFeedsExtra.report;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = momentFeedsExtra.optionId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<MomentFeedsExtra> JSON_ADAPTER = new ObjectJsonAdapter<MomentFeedsExtra>() { // from class: com.p1.mobile.putong.feed.data.MomentFeedsExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentFeedsExtra.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentFeedsExtra newInstance() {
            return new MomentFeedsExtra();
        }

        public boolean parseField(MomentFeedsExtra momentFeedsExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("report")) {
                momentFeedsExtra.report = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("optionId")) {
                return false;
            }
            momentFeedsExtra.optionId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MomentFeedsExtra momentFeedsExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("report") || str.equals("optionId")) {
                return true;
            }
            return super.parseFieldCheck(momentFeedsExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentFeedsExtra momentFeedsExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = momentFeedsExtra.report;
            if (str != null) {
                jsonGenerator.writeStringField("report", str);
            }
            String str2 = momentFeedsExtra.optionId;
            if (str2 != null) {
                jsonGenerator.writeStringField("optionId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentFeedsExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentFeedsExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentFeedsExtra new_() {
        MomentFeedsExtra momentFeedsExtra = new MomentFeedsExtra();
        momentFeedsExtra.nullCheck();
        return momentFeedsExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentFeedsExtra mo225055clone() {
        MomentFeedsExtra momentFeedsExtra = new MomentFeedsExtra();
        momentFeedsExtra.report = this.report;
        momentFeedsExtra.optionId = this.optionId;
        return momentFeedsExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentFeedsExtra)) {
            return false;
        }
        MomentFeedsExtra momentFeedsExtra = (MomentFeedsExtra) obj;
        return ValueObject.util_equals(this.report, momentFeedsExtra.report) && ValueObject.util_equals(this.optionId, momentFeedsExtra.optionId);
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
        String str = this.report;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.optionId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.optionId == null) {
            this.optionId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
