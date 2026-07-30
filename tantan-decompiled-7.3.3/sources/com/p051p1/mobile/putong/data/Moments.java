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
public class Moments extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "moments";

    @NonNull
    @ProtobufIndex(index = 2)
    public MomentCounter counters;

    @ProtobufIndex(index = 1)
    public boolean hidePublicMoments;
    public static ProtobufAdapter<Moments> PROTOBUF_ADAPTER = new MessageNanoAdapter<Moments>() { // from class: com.p1.mobile.putong.data.Moments.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Moments moments) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, moments.hidePublicMoments);
            MomentCounter momentCounter = moments.counters;
            if (momentCounter != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, momentCounter, MomentCounter.PROTOBUF_ADAPTER);
            }
            moments.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Moments parse(nc5 nc5Var) throws IOException {
            Moments moments = new Moments();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (moments.counters != null) {
                        break;
                    }
                    moments.counters = MomentCounter.new_();
                    break;
                }
                if (iM162497u == 8) {
                    moments.hidePublicMoments = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (moments.counters != null) {
                            break;
                        }
                        moments.counters = MomentCounter.new_();
                        return moments;
                    }
                    moments.counters = (MomentCounter) nc5Var.m162488l(MomentCounter.PROTOBUF_ADAPTER);
                }
            }
            return moments;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Moments moments, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, moments.hidePublicMoments);
            MomentCounter momentCounter = moments.counters;
            if (momentCounter != null) {
                codedOutputByteBufferNano.m17309K(2, momentCounter, MomentCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Moments> JSON_ADAPTER = new ObjectJsonAdapter<Moments>() { // from class: com.p1.mobile.putong.data.Moments.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Moments.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Moments newInstance() {
            return new Moments();
        }

        public boolean parseField(Moments moments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("counters")) {
                moments.counters = MomentCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("hidePublicMoments")) {
                return false;
            }
            moments.hidePublicMoments = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(Moments moments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("counters") || str.equals("hidePublicMoments")) {
                return true;
            }
            return super.parseFieldCheck(moments, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Moments moments, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hidePublicMoments", moments.hidePublicMoments);
            if (moments.counters != null) {
                jsonGenerator.writeFieldName("counters");
                MomentCounter.JSON_ADAPTER.serialize(moments.counters, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Moments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Moments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Moments new_() {
        Moments moments = new Moments();
        moments.nullCheck();
        return moments;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Moments mo225055clone() {
        Moments moments = new Moments();
        moments.hidePublicMoments = this.hidePublicMoments;
        MomentCounter momentCounter = this.counters;
        if (momentCounter != null) {
            moments.counters = momentCounter.mo225055clone();
        }
        return moments;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Moments)) {
            return false;
        }
        Moments moments = (Moments) obj;
        return this.hidePublicMoments == moments.hidePublicMoments && ValueObject.util_equals(this.counters, moments.counters);
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
        int i2 = ((i * 41) + (this.hidePublicMoments ? 1231 : 1237)) * 41;
        MomentCounter momentCounter = this.counters;
        int iHashCode = i2 + (momentCounter != null ? momentCounter.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.counters == null) {
            this.counters = MomentCounter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
