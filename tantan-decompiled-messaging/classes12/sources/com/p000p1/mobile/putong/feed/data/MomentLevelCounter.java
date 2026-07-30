package com.p000p1.mobile.putong.feed.data;

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
public class MomentLevelCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentlevelcounter";

    @ProtobufIndex(index = 6)
    public int dayScore;

    @ProtobufIndex(index = 1)
    public int level;

    @ProtobufIndex(index = 2)
    public int levelScore;

    @ProtobufIndex(index = 5)
    public int like;

    @ProtobufIndex(index = 4)
    public int moment;

    @ProtobufIndex(index = 3)
    public int score;
    public static ProtobufAdapter<MomentLevelCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentLevelCounter>() { // from class: com.p1.mobile.putong.feed.data.MomentLevelCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentLevelCounter momentLevelCounter) {
            int iH = CodedOutputByteBufferNano.h(1, momentLevelCounter.level) + CodedOutputByteBufferNano.h(2, momentLevelCounter.levelScore) + CodedOutputByteBufferNano.h(3, momentLevelCounter.score) + CodedOutputByteBufferNano.h(4, momentLevelCounter.moment) + CodedOutputByteBufferNano.h(5, momentLevelCounter.like) + CodedOutputByteBufferNano.h(6, momentLevelCounter.dayScore);
            ((MessageNano) momentLevelCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentLevelCounter m19623parse(nb5 nb5Var) throws IOException {
            MomentLevelCounter momentLevelCounter = new MomentLevelCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    momentLevelCounter.level = nb5Var.j();
                } else if (iU == 16) {
                    momentLevelCounter.levelScore = nb5Var.j();
                } else if (iU == 24) {
                    momentLevelCounter.score = nb5Var.j();
                } else if (iU == 32) {
                    momentLevelCounter.moment = nb5Var.j();
                } else if (iU == 40) {
                    momentLevelCounter.like = nb5Var.j();
                } else {
                    if (iU != 48) {
                        return momentLevelCounter;
                    }
                    momentLevelCounter.dayScore = nb5Var.j();
                }
            }
        }

        public void serialize(MomentLevelCounter momentLevelCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, momentLevelCounter.level);
            codedOutputByteBufferNano.G(2, momentLevelCounter.levelScore);
            codedOutputByteBufferNano.G(3, momentLevelCounter.score);
            codedOutputByteBufferNano.G(4, momentLevelCounter.moment);
            codedOutputByteBufferNano.G(5, momentLevelCounter.like);
            codedOutputByteBufferNano.G(6, momentLevelCounter.dayScore);
        }
    };
    public static JsonAdapter<MomentLevelCounter> JSON_ADAPTER = new ObjectJsonAdapter<MomentLevelCounter>() { // from class: com.p1.mobile.putong.feed.data.MomentLevelCounter.2
        public Class getDataClass() {
            return MomentLevelCounter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentLevelCounter mo17830newInstance() {
            return new MomentLevelCounter();
        }

        public boolean parseField(MomentLevelCounter momentLevelCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "moment":
                    momentLevelCounter.moment = jsonParser.getValueAsInt();
                    return true;
                case "like":
                    momentLevelCounter.like = jsonParser.getValueAsInt();
                    return true;
                case "level":
                    momentLevelCounter.level = jsonParser.getValueAsInt();
                    return true;
                case "score":
                    momentLevelCounter.score = jsonParser.getValueAsInt();
                    return true;
                case "levelScore":
                    momentLevelCounter.levelScore = jsonParser.getValueAsInt();
                    return true;
                case "dayScore":
                    momentLevelCounter.dayScore = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentLevelCounter momentLevelCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "moment":
                case "like":
                case "level":
                case "score":
                case "levelScore":
                case "dayScore":
                    return true;
                default:
                    return super.parseFieldCheck(momentLevelCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentLevelCounter momentLevelCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("level", momentLevelCounter.level);
            jsonGenerator.writeNumberField("levelScore", momentLevelCounter.levelScore);
            jsonGenerator.writeNumberField("score", momentLevelCounter.score);
            jsonGenerator.writeNumberField("moment", momentLevelCounter.moment);
            jsonGenerator.writeNumberField("like", momentLevelCounter.like);
            jsonGenerator.writeNumberField("dayScore", momentLevelCounter.dayScore);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentLevelCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentLevelCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentLevelCounter new_() {
        MomentLevelCounter momentLevelCounter = new MomentLevelCounter();
        momentLevelCounter.nullCheck();
        return momentLevelCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentLevelCounter m19622clone() {
        MomentLevelCounter momentLevelCounter = new MomentLevelCounter();
        momentLevelCounter.level = this.level;
        momentLevelCounter.levelScore = this.levelScore;
        momentLevelCounter.score = this.score;
        momentLevelCounter.moment = this.moment;
        momentLevelCounter.like = this.like;
        momentLevelCounter.dayScore = this.dayScore;
        return momentLevelCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentLevelCounter)) {
            return false;
        }
        MomentLevelCounter momentLevelCounter = (MomentLevelCounter) obj;
        return this.level == momentLevelCounter.level && this.levelScore == momentLevelCounter.levelScore && this.score == momentLevelCounter.score && this.moment == momentLevelCounter.moment && this.like == momentLevelCounter.like && this.dayScore == momentLevelCounter.dayScore;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + this.level) * 41) + this.levelScore) * 41) + this.score) * 41) + this.moment) * 41) + this.like) * 41) + this.dayScore;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
