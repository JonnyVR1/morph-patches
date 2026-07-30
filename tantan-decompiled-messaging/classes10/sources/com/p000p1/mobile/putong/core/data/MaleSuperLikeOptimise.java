package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class MaleSuperLikeOptimise extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "malesuperlikeoptimise";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @NonNull
    @ProtobufIndex(index = 4)
    public SwipeThreshold highScale;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public SwipeThreshold midScale;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean useCommercialRank;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean useSuggestRank;
    public static ProtobufAdapter<MaleSuperLikeOptimise> PROTOBUF_ADAPTER = new MessageNanoAdapter<MaleSuperLikeOptimise>() { // from class: com.p1.mobile.putong.core.data.MaleSuperLikeOptimise.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MaleSuperLikeOptimise maleSuperLikeOptimise) {
            int iB = CodedOutputByteBufferNano.b(1, maleSuperLikeOptimise.enabled) + CodedOutputByteBufferNano.b(2, maleSuperLikeOptimise.useSuggestRank) + CodedOutputByteBufferNano.b(3, maleSuperLikeOptimise.useCommercialRank);
            SwipeThreshold swipeThreshold = maleSuperLikeOptimise.highScale;
            if (swipeThreshold != null) {
                iB += CodedOutputByteBufferNano.l(4, swipeThreshold, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            SwipeThreshold swipeThreshold2 = maleSuperLikeOptimise.midScale;
            if (swipeThreshold2 != null) {
                iB += CodedOutputByteBufferNano.l(5, swipeThreshold2, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            ((MessageNano) maleSuperLikeOptimise).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MaleSuperLikeOptimise m14045parse(nb5 nb5Var) throws IOException {
            MaleSuperLikeOptimise maleSuperLikeOptimise = new MaleSuperLikeOptimise();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (maleSuperLikeOptimise.highScale == null) {
                        maleSuperLikeOptimise.highScale = SwipeThreshold.new_();
                    }
                    if (maleSuperLikeOptimise.midScale != null) {
                        break;
                    }
                    maleSuperLikeOptimise.midScale = SwipeThreshold.new_();
                    break;
                }
                if (iU == 8) {
                    maleSuperLikeOptimise.enabled = nb5Var.g();
                } else if (iU == 16) {
                    maleSuperLikeOptimise.useSuggestRank = nb5Var.g();
                } else if (iU == 24) {
                    maleSuperLikeOptimise.useCommercialRank = nb5Var.g();
                } else if (iU == 34) {
                    maleSuperLikeOptimise.highScale = (SwipeThreshold) nb5Var.l(SwipeThreshold.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (maleSuperLikeOptimise.highScale == null) {
                            maleSuperLikeOptimise.highScale = SwipeThreshold.new_();
                        }
                        if (maleSuperLikeOptimise.midScale != null) {
                            break;
                        }
                        maleSuperLikeOptimise.midScale = SwipeThreshold.new_();
                        return maleSuperLikeOptimise;
                    }
                    maleSuperLikeOptimise.midScale = (SwipeThreshold) nb5Var.l(SwipeThreshold.PROTOBUF_ADAPTER);
                }
            }
            return maleSuperLikeOptimise;
        }

        public void serialize(MaleSuperLikeOptimise maleSuperLikeOptimise, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, maleSuperLikeOptimise.enabled);
            codedOutputByteBufferNano.A(2, maleSuperLikeOptimise.useSuggestRank);
            codedOutputByteBufferNano.A(3, maleSuperLikeOptimise.useCommercialRank);
            SwipeThreshold swipeThreshold = maleSuperLikeOptimise.highScale;
            if (swipeThreshold != null) {
                codedOutputByteBufferNano.K(4, swipeThreshold, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            SwipeThreshold swipeThreshold2 = maleSuperLikeOptimise.midScale;
            if (swipeThreshold2 != null) {
                codedOutputByteBufferNano.K(5, swipeThreshold2, SwipeThreshold.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MaleSuperLikeOptimise> JSON_ADAPTER = new ObjectJsonAdapter<MaleSuperLikeOptimise>() { // from class: com.p1.mobile.putong.core.data.MaleSuperLikeOptimise.2
        public Class getDataClass() {
            return MaleSuperLikeOptimise.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MaleSuperLikeOptimise m14046newInstance() {
            return new MaleSuperLikeOptimise();
        }

        public boolean parseField(MaleSuperLikeOptimise maleSuperLikeOptimise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "midScale":
                    maleSuperLikeOptimise.midScale = (SwipeThreshold) SwipeThreshold.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "enabled":
                    maleSuperLikeOptimise.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "useCommercialRank":
                    maleSuperLikeOptimise.useCommercialRank = jsonParser.getValueAsBoolean();
                    return true;
                case "highScale":
                    maleSuperLikeOptimise.highScale = (SwipeThreshold) SwipeThreshold.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "useSuggestRank":
                    maleSuperLikeOptimise.useSuggestRank = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MaleSuperLikeOptimise maleSuperLikeOptimise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "midScale":
                case "enabled":
                case "useCommercialRank":
                case "highScale":
                case "useSuggestRank":
                    return true;
                default:
                    return super.parseFieldCheck(maleSuperLikeOptimise, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MaleSuperLikeOptimise maleSuperLikeOptimise, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", maleSuperLikeOptimise.enabled);
            jsonGenerator.writeBooleanField("useSuggestRank", maleSuperLikeOptimise.useSuggestRank);
            jsonGenerator.writeBooleanField("useCommercialRank", maleSuperLikeOptimise.useCommercialRank);
            if (maleSuperLikeOptimise.highScale != null) {
                jsonGenerator.writeFieldName("highScale");
                SwipeThreshold.JSON_ADAPTER.serialize(maleSuperLikeOptimise.highScale, jsonGenerator, true);
            }
            if (maleSuperLikeOptimise.midScale != null) {
                jsonGenerator.writeFieldName("midScale");
                SwipeThreshold.JSON_ADAPTER.serialize(maleSuperLikeOptimise.midScale, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MaleSuperLikeOptimise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MaleSuperLikeOptimise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MaleSuperLikeOptimise new_() {
        MaleSuperLikeOptimise maleSuperLikeOptimise = new MaleSuperLikeOptimise();
        maleSuperLikeOptimise.nullCheck();
        return maleSuperLikeOptimise;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MaleSuperLikeOptimise m14044clone() {
        MaleSuperLikeOptimise maleSuperLikeOptimise = new MaleSuperLikeOptimise();
        maleSuperLikeOptimise.enabled = this.enabled;
        maleSuperLikeOptimise.useSuggestRank = this.useSuggestRank;
        maleSuperLikeOptimise.useCommercialRank = this.useCommercialRank;
        SwipeThreshold swipeThreshold = this.highScale;
        if (swipeThreshold != null) {
            maleSuperLikeOptimise.highScale = swipeThreshold.m15861clone();
        }
        SwipeThreshold swipeThreshold2 = this.midScale;
        if (swipeThreshold2 != null) {
            maleSuperLikeOptimise.midScale = swipeThreshold2.m15861clone();
        }
        return maleSuperLikeOptimise;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaleSuperLikeOptimise)) {
            return false;
        }
        MaleSuperLikeOptimise maleSuperLikeOptimise = (MaleSuperLikeOptimise) obj;
        return this.enabled == maleSuperLikeOptimise.enabled && this.useSuggestRank == maleSuperLikeOptimise.useSuggestRank && this.useCommercialRank == maleSuperLikeOptimise.useCommercialRank && ValueObject.util_equals(this.highScale, maleSuperLikeOptimise.highScale) && ValueObject.util_equals(this.midScale, maleSuperLikeOptimise.midScale);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + (this.useSuggestRank ? 1231 : 1237)) * 41) + (this.useCommercialRank ? 1231 : 1237)) * 41;
        SwipeThreshold swipeThreshold = this.highScale;
        int iHashCode = (i2 + (swipeThreshold != null ? swipeThreshold.hashCode() : 0)) * 41;
        SwipeThreshold swipeThreshold2 = this.midScale;
        int iHashCode2 = iHashCode + (swipeThreshold2 != null ? swipeThreshold2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.highScale == null) {
            this.highScale = SwipeThreshold.new_();
        }
        if (this.midScale == null) {
            this.midScale = SwipeThreshold.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
