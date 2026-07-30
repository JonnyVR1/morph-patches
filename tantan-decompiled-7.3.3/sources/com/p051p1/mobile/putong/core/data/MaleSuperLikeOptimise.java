package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class MaleSuperLikeOptimise extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "malesuperlikeoptimise";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @NonNull
    @ProtobufIndex(index = 4)
    public SwipeThreshold highScale;

    @NonNull
    @ProtobufIndex(index = 5)
    public SwipeThreshold midScale;

    @ProtobufIndex(index = 3)
    public boolean useCommercialRank;

    @ProtobufIndex(index = 2)
    public boolean useSuggestRank;
    public static ProtobufAdapter<MaleSuperLikeOptimise> PROTOBUF_ADAPTER = new MessageNanoAdapter<MaleSuperLikeOptimise>() { // from class: com.p1.mobile.putong.core.data.MaleSuperLikeOptimise.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MaleSuperLikeOptimise maleSuperLikeOptimise) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, maleSuperLikeOptimise.enabled) + CodedOutputByteBufferNano.m17275b(2, maleSuperLikeOptimise.useSuggestRank) + CodedOutputByteBufferNano.m17275b(3, maleSuperLikeOptimise.useCommercialRank);
            SwipeThreshold swipeThreshold = maleSuperLikeOptimise.highScale;
            if (swipeThreshold != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, swipeThreshold, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            SwipeThreshold swipeThreshold2 = maleSuperLikeOptimise.midScale;
            if (swipeThreshold2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, swipeThreshold2, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            maleSuperLikeOptimise.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MaleSuperLikeOptimise parse(nc5 nc5Var) throws IOException {
            MaleSuperLikeOptimise maleSuperLikeOptimise = new MaleSuperLikeOptimise();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (maleSuperLikeOptimise.highScale == null) {
                        maleSuperLikeOptimise.highScale = SwipeThreshold.new_();
                    }
                    if (maleSuperLikeOptimise.midScale != null) {
                        break;
                    }
                    maleSuperLikeOptimise.midScale = SwipeThreshold.new_();
                    break;
                }
                if (iM162497u == 8) {
                    maleSuperLikeOptimise.enabled = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    maleSuperLikeOptimise.useSuggestRank = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    maleSuperLikeOptimise.useCommercialRank = nc5Var.m162483g();
                } else if (iM162497u == 34) {
                    maleSuperLikeOptimise.highScale = (SwipeThreshold) nc5Var.m162488l(SwipeThreshold.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
                        if (maleSuperLikeOptimise.highScale == null) {
                            maleSuperLikeOptimise.highScale = SwipeThreshold.new_();
                        }
                        if (maleSuperLikeOptimise.midScale != null) {
                            break;
                        }
                        maleSuperLikeOptimise.midScale = SwipeThreshold.new_();
                        return maleSuperLikeOptimise;
                    }
                    maleSuperLikeOptimise.midScale = (SwipeThreshold) nc5Var.m162488l(SwipeThreshold.PROTOBUF_ADAPTER);
                }
            }
            return maleSuperLikeOptimise;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MaleSuperLikeOptimise maleSuperLikeOptimise, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, maleSuperLikeOptimise.enabled);
            codedOutputByteBufferNano.m17299A(2, maleSuperLikeOptimise.useSuggestRank);
            codedOutputByteBufferNano.m17299A(3, maleSuperLikeOptimise.useCommercialRank);
            SwipeThreshold swipeThreshold = maleSuperLikeOptimise.highScale;
            if (swipeThreshold != null) {
                codedOutputByteBufferNano.m17309K(4, swipeThreshold, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            SwipeThreshold swipeThreshold2 = maleSuperLikeOptimise.midScale;
            if (swipeThreshold2 != null) {
                codedOutputByteBufferNano.m17309K(5, swipeThreshold2, SwipeThreshold.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MaleSuperLikeOptimise> JSON_ADAPTER = new ObjectJsonAdapter<MaleSuperLikeOptimise>() { // from class: com.p1.mobile.putong.core.data.MaleSuperLikeOptimise.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MaleSuperLikeOptimise.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MaleSuperLikeOptimise newInstance() {
            return new MaleSuperLikeOptimise();
        }

        public boolean parseField(MaleSuperLikeOptimise maleSuperLikeOptimise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "midScale":
                    maleSuperLikeOptimise.midScale = SwipeThreshold.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "enabled":
                    maleSuperLikeOptimise.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "useCommercialRank":
                    maleSuperLikeOptimise.useCommercialRank = jsonParser.getValueAsBoolean();
                    return true;
                case "highScale":
                    maleSuperLikeOptimise.highScale = SwipeThreshold.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MaleSuperLikeOptimise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MaleSuperLikeOptimise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MaleSuperLikeOptimise new_() {
        MaleSuperLikeOptimise maleSuperLikeOptimise = new MaleSuperLikeOptimise();
        maleSuperLikeOptimise.nullCheck();
        return maleSuperLikeOptimise;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MaleSuperLikeOptimise mo225055clone() {
        MaleSuperLikeOptimise maleSuperLikeOptimise = new MaleSuperLikeOptimise();
        maleSuperLikeOptimise.enabled = this.enabled;
        maleSuperLikeOptimise.useSuggestRank = this.useSuggestRank;
        maleSuperLikeOptimise.useCommercialRank = this.useCommercialRank;
        SwipeThreshold swipeThreshold = this.highScale;
        if (swipeThreshold != null) {
            maleSuperLikeOptimise.highScale = swipeThreshold.mo225055clone();
        }
        SwipeThreshold swipeThreshold2 = this.midScale;
        if (swipeThreshold2 != null) {
            maleSuperLikeOptimise.midScale = swipeThreshold2.mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + (this.useSuggestRank ? 1231 : 1237)) * 41) + (this.useCommercialRank ? 1231 : 1237)) * 41;
        SwipeThreshold swipeThreshold = this.highScale;
        int iHashCode = (i2 + (swipeThreshold != null ? swipeThreshold.hashCode() : 0)) * 41;
        SwipeThreshold swipeThreshold2 = this.midScale;
        int iHashCode2 = iHashCode + (swipeThreshold2 != null ? swipeThreshold2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.highScale == null) {
            this.highScale = SwipeThreshold.new_();
        }
        if (this.midScale == null) {
            this.midScale = SwipeThreshold.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
