package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

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
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, maleSuperLikeOptimise.enabled) + CodedOutputByteBufferNano.m17220b(2, maleSuperLikeOptimise.useSuggestRank) + CodedOutputByteBufferNano.m17220b(3, maleSuperLikeOptimise.useCommercialRank);
            SwipeThreshold swipeThreshold = maleSuperLikeOptimise.highScale;
            if (swipeThreshold != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, swipeThreshold, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            SwipeThreshold swipeThreshold2 = maleSuperLikeOptimise.midScale;
            if (swipeThreshold2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(5, swipeThreshold2, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            maleSuperLikeOptimise.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MaleSuperLikeOptimise parse(nb5 nb5Var) throws IOException {
            MaleSuperLikeOptimise maleSuperLikeOptimise = new MaleSuperLikeOptimise();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (maleSuperLikeOptimise.highScale == null) {
                        maleSuperLikeOptimise.highScale = SwipeThreshold.new_();
                    }
                    if (maleSuperLikeOptimise.midScale != null) {
                        break;
                    }
                    maleSuperLikeOptimise.midScale = SwipeThreshold.new_();
                    break;
                }
                if (iM158752u == 8) {
                    maleSuperLikeOptimise.enabled = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    maleSuperLikeOptimise.useSuggestRank = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    maleSuperLikeOptimise.useCommercialRank = nb5Var.m158738g();
                } else if (iM158752u == 34) {
                    maleSuperLikeOptimise.highScale = (SwipeThreshold) nb5Var.m158743l(SwipeThreshold.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (maleSuperLikeOptimise.highScale == null) {
                            maleSuperLikeOptimise.highScale = SwipeThreshold.new_();
                        }
                        if (maleSuperLikeOptimise.midScale != null) {
                            break;
                        }
                        maleSuperLikeOptimise.midScale = SwipeThreshold.new_();
                        return maleSuperLikeOptimise;
                    }
                    maleSuperLikeOptimise.midScale = (SwipeThreshold) nb5Var.m158743l(SwipeThreshold.PROTOBUF_ADAPTER);
                }
            }
            return maleSuperLikeOptimise;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MaleSuperLikeOptimise maleSuperLikeOptimise, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, maleSuperLikeOptimise.enabled);
            codedOutputByteBufferNano.m17244A(2, maleSuperLikeOptimise.useSuggestRank);
            codedOutputByteBufferNano.m17244A(3, maleSuperLikeOptimise.useCommercialRank);
            SwipeThreshold swipeThreshold = maleSuperLikeOptimise.highScale;
            if (swipeThreshold != null) {
                codedOutputByteBufferNano.m17254K(4, swipeThreshold, SwipeThreshold.PROTOBUF_ADAPTER);
            }
            SwipeThreshold swipeThreshold2 = maleSuperLikeOptimise.midScale;
            if (swipeThreshold2 != null) {
                codedOutputByteBufferNano.m17254K(5, swipeThreshold2, SwipeThreshold.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MaleSuperLikeOptimise> JSON_ADAPTER = new ObjectJsonAdapter<MaleSuperLikeOptimise>() { // from class: com.p1.mobile.putong.core.data.MaleSuperLikeOptimise.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MaleSuperLikeOptimise.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MaleSuperLikeOptimise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public MaleSuperLikeOptimise mo223809clone() {
        MaleSuperLikeOptimise maleSuperLikeOptimise = new MaleSuperLikeOptimise();
        maleSuperLikeOptimise.enabled = this.enabled;
        maleSuperLikeOptimise.useSuggestRank = this.useSuggestRank;
        maleSuperLikeOptimise.useCommercialRank = this.useCommercialRank;
        SwipeThreshold swipeThreshold = this.highScale;
        if (swipeThreshold != null) {
            maleSuperLikeOptimise.highScale = swipeThreshold.mo223809clone();
        }
        SwipeThreshold swipeThreshold2 = this.midScale;
        if (swipeThreshold2 != null) {
            maleSuperLikeOptimise.midScale = swipeThreshold2.mo223809clone();
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
