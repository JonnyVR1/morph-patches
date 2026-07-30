package com.p000p1.mobile.putong.data;

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
public class LiveWindowInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livewindowinfo";

    @Nullable
    @ProtobufIndex(index = 2)
    public String livesPic;

    @ProtobufIndex(index = 4)
    public boolean livesPicBlur;

    @Nullable
    @ProtobufIndex(index = 3)
    public String livesRecommendInfo;

    @Nullable
    @ProtobufIndex(index = 1)
    public String livesStream;
    public static ProtobufAdapter<LiveWindowInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveWindowInfo>() { // from class: com.p1.mobile.putong.data.LiveWindowInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveWindowInfo liveWindowInfo) {
            String str = liveWindowInfo.livesStream;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveWindowInfo.livesPic;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = liveWindowInfo.livesRecommendInfo;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, liveWindowInfo.livesPicBlur);
            ((MessageNano) liveWindowInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveWindowInfo m18412parse(nb5 nb5Var) throws IOException {
            LiveWindowInfo liveWindowInfo = new LiveWindowInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    liveWindowInfo.livesStream = nb5Var.s();
                } else if (iU == 18) {
                    liveWindowInfo.livesPic = nb5Var.s();
                } else if (iU == 26) {
                    liveWindowInfo.livesRecommendInfo = nb5Var.s();
                } else {
                    if (iU != 32) {
                        return liveWindowInfo;
                    }
                    liveWindowInfo.livesPicBlur = nb5Var.g();
                }
            }
        }

        public void serialize(LiveWindowInfo liveWindowInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveWindowInfo.livesStream;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveWindowInfo.livesPic;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = liveWindowInfo.livesRecommendInfo;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, liveWindowInfo.livesPicBlur);
        }
    };
    public static JsonAdapter<LiveWindowInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiveWindowInfo>() { // from class: com.p1.mobile.putong.data.LiveWindowInfo.2
        public Class getDataClass() {
            return LiveWindowInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveWindowInfo mo17830newInstance() {
            return new LiveWindowInfo();
        }

        public boolean parseField(LiveWindowInfo liveWindowInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "livesStream":
                    liveWindowInfo.livesStream = jsonParser.getValueAsString();
                    return true;
                case "livesRecommendInfo":
                    liveWindowInfo.livesRecommendInfo = jsonParser.getValueAsString();
                    return true;
                case "livesPicBlur":
                    liveWindowInfo.livesPicBlur = jsonParser.getValueAsBoolean();
                    return true;
                case "livesPic":
                    liveWindowInfo.livesPic = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveWindowInfo liveWindowInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "livesStream":
                case "livesRecommendInfo":
                case "livesPicBlur":
                case "livesPic":
                    return true;
                default:
                    return super.parseFieldCheck(liveWindowInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveWindowInfo liveWindowInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = liveWindowInfo.livesStream;
            if (str != null) {
                jsonGenerator.writeStringField("livesStream", str);
            }
            String str2 = liveWindowInfo.livesPic;
            if (str2 != null) {
                jsonGenerator.writeStringField("livesPic", str2);
            }
            String str3 = liveWindowInfo.livesRecommendInfo;
            if (str3 != null) {
                jsonGenerator.writeStringField("livesRecommendInfo", str3);
            }
            jsonGenerator.writeBooleanField("livesPicBlur", liveWindowInfo.livesPicBlur);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveWindowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveWindowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveWindowInfo new_() {
        LiveWindowInfo liveWindowInfo = new LiveWindowInfo();
        liveWindowInfo.nullCheck();
        return liveWindowInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveWindowInfo m18411clone() {
        LiveWindowInfo liveWindowInfo = new LiveWindowInfo();
        liveWindowInfo.livesStream = this.livesStream;
        liveWindowInfo.livesPic = this.livesPic;
        liveWindowInfo.livesRecommendInfo = this.livesRecommendInfo;
        liveWindowInfo.livesPicBlur = this.livesPicBlur;
        return liveWindowInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveWindowInfo)) {
            return false;
        }
        LiveWindowInfo liveWindowInfo = (LiveWindowInfo) obj;
        return ValueObject.util_equals(this.livesStream, liveWindowInfo.livesStream) && ValueObject.util_equals(this.livesPic, liveWindowInfo.livesPic) && ValueObject.util_equals(this.livesRecommendInfo, liveWindowInfo.livesRecommendInfo) && this.livesPicBlur == liveWindowInfo.livesPicBlur;
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
        String str = this.livesStream;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.livesPic;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.livesRecommendInfo;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.livesPicBlur ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
