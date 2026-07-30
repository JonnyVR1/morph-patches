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
public class Moments extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "moments";

    @NonNull
    @ProtobufIndex(index = 2)
    public MomentCounter counters;

    @ProtobufIndex(index = 1)
    public boolean hidePublicMoments;
    public static ProtobufAdapter<Moments> PROTOBUF_ADAPTER = new MessageNanoAdapter<Moments>() { // from class: com.p1.mobile.putong.data.Moments.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Moments moments) {
            int iB = CodedOutputByteBufferNano.b(1, moments.hidePublicMoments);
            MomentCounter momentCounter = moments.counters;
            if (momentCounter != null) {
                iB += CodedOutputByteBufferNano.l(2, momentCounter, MomentCounter.PROTOBUF_ADAPTER);
            }
            ((MessageNano) moments).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Moments m18495parse(nb5 nb5Var) throws IOException {
            Moments moments = new Moments();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (moments.counters != null) {
                        break;
                    }
                    moments.counters = MomentCounter.new_();
                    break;
                }
                if (iU == 8) {
                    moments.hidePublicMoments = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (moments.counters != null) {
                            break;
                        }
                        moments.counters = MomentCounter.new_();
                        return moments;
                    }
                    moments.counters = (MomentCounter) nb5Var.l(MomentCounter.PROTOBUF_ADAPTER);
                }
            }
            return moments;
        }

        public void serialize(Moments moments, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, moments.hidePublicMoments);
            MomentCounter momentCounter = moments.counters;
            if (momentCounter != null) {
                codedOutputByteBufferNano.K(2, momentCounter, MomentCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Moments> JSON_ADAPTER = new ObjectJsonAdapter<Moments>() { // from class: com.p1.mobile.putong.data.Moments.2
        public Class getDataClass() {
            return Moments.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Moments mo17830newInstance() {
            return new Moments();
        }

        public boolean parseField(Moments moments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("counters")) {
                moments.counters = (MomentCounter) MomentCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Moments moments, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("hidePublicMoments", moments.hidePublicMoments);
            if (moments.counters != null) {
                jsonGenerator.writeFieldName("counters");
                MomentCounter.JSON_ADAPTER.serialize(moments.counters, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Moments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Moments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Moments new_() {
        Moments moments = new Moments();
        moments.nullCheck();
        return moments;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Moments m18494clone() {
        Moments moments = new Moments();
        moments.hidePublicMoments = this.hidePublicMoments;
        MomentCounter momentCounter = this.counters;
        if (momentCounter != null) {
            moments.counters = momentCounter.m18479clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.hidePublicMoments ? 1231 : 1237)) * 41;
        MomentCounter momentCounter = this.counters;
        int iHashCode = i2 + (momentCounter != null ? momentCounter.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.counters == null) {
            this.counters = MomentCounter.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
