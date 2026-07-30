package com.p000p1.mobile.putong.data;

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
public class MomentCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentcounter";

    @ProtobufIndex(index = 2)
    public int receiveMomentLikes;

    @ProtobufIndex(index = 1)
    public int totalMoments;

    @ProtobufIndex(index = 3)
    public int totalNormalMoments;
    public static ProtobufAdapter<MomentCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentCounter>() { // from class: com.p1.mobile.putong.data.MomentCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentCounter momentCounter) {
            int iH = CodedOutputByteBufferNano.h(1, momentCounter.totalMoments) + CodedOutputByteBufferNano.h(2, momentCounter.receiveMomentLikes) + CodedOutputByteBufferNano.h(3, momentCounter.totalNormalMoments);
            ((MessageNano) momentCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentCounter m18480parse(nb5 nb5Var) throws IOException {
            MomentCounter momentCounter = new MomentCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    momentCounter.totalMoments = nb5Var.j();
                } else if (iU == 16) {
                    momentCounter.receiveMomentLikes = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return momentCounter;
                    }
                    momentCounter.totalNormalMoments = nb5Var.j();
                }
            }
        }

        public void serialize(MomentCounter momentCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, momentCounter.totalMoments);
            codedOutputByteBufferNano.G(2, momentCounter.receiveMomentLikes);
            codedOutputByteBufferNano.G(3, momentCounter.totalNormalMoments);
        }
    };
    public static JsonAdapter<MomentCounter> JSON_ADAPTER = new ObjectJsonAdapter<MomentCounter>() { // from class: com.p1.mobile.putong.data.MomentCounter.2
        public Class getDataClass() {
            return MomentCounter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentCounter mo17830newInstance() {
            return new MomentCounter();
        }

        public boolean parseField(MomentCounter momentCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "totalNormalMoments":
                    momentCounter.totalNormalMoments = jsonParser.getValueAsInt();
                    return true;
                case "receiveMomentLikes":
                    momentCounter.receiveMomentLikes = jsonParser.getValueAsInt();
                    return true;
                case "totalMoments":
                    momentCounter.totalMoments = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentCounter momentCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "totalNormalMoments":
                case "receiveMomentLikes":
                case "totalMoments":
                    return true;
                default:
                    return super.parseFieldCheck(momentCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentCounter momentCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("totalMoments", momentCounter.totalMoments);
            jsonGenerator.writeNumberField("receiveMomentLikes", momentCounter.receiveMomentLikes);
            jsonGenerator.writeNumberField("totalNormalMoments", momentCounter.totalNormalMoments);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentCounter new_() {
        MomentCounter momentCounter = new MomentCounter();
        momentCounter.nullCheck();
        return momentCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentCounter m18479clone() {
        MomentCounter momentCounter = new MomentCounter();
        momentCounter.totalMoments = this.totalMoments;
        momentCounter.receiveMomentLikes = this.receiveMomentLikes;
        momentCounter.totalNormalMoments = this.totalNormalMoments;
        return momentCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentCounter)) {
            return false;
        }
        MomentCounter momentCounter = (MomentCounter) obj;
        return this.totalMoments == momentCounter.totalMoments && this.receiveMomentLikes == momentCounter.receiveMomentLikes && this.totalNormalMoments == momentCounter.totalNormalMoments;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.totalMoments) * 41) + this.receiveMomentLikes) * 41) + this.totalNormalMoments;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
