package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentFeedsExtra momentFeedsExtra) {
            String str = momentFeedsExtra.report;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = momentFeedsExtra.optionId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) momentFeedsExtra).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentFeedsExtra m19614parse(nb5 nb5Var) throws IOException {
            MomentFeedsExtra momentFeedsExtra = new MomentFeedsExtra();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentFeedsExtra.optionId != null) {
                        break;
                    }
                    momentFeedsExtra.optionId = "";
                    break;
                }
                if (iU == 10) {
                    momentFeedsExtra.report = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (momentFeedsExtra.optionId != null) {
                            break;
                        }
                        momentFeedsExtra.optionId = "";
                        return momentFeedsExtra;
                    }
                    momentFeedsExtra.optionId = nb5Var.s();
                }
            }
            return momentFeedsExtra;
        }

        public void serialize(MomentFeedsExtra momentFeedsExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentFeedsExtra.report;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = momentFeedsExtra.optionId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<MomentFeedsExtra> JSON_ADAPTER = new ObjectJsonAdapter<MomentFeedsExtra>() { // from class: com.p1.mobile.putong.feed.data.MomentFeedsExtra.2
        public Class getDataClass() {
            return MomentFeedsExtra.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentFeedsExtra mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentFeedsExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentFeedsExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentFeedsExtra new_() {
        MomentFeedsExtra momentFeedsExtra = new MomentFeedsExtra();
        momentFeedsExtra.nullCheck();
        return momentFeedsExtra;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentFeedsExtra m19613clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.report;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.optionId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.optionId == null) {
            this.optionId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
