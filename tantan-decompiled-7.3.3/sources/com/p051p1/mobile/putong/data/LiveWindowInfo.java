package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveWindowInfo liveWindowInfo) {
            String str = liveWindowInfo.livesStream;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = liveWindowInfo.livesPic;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = liveWindowInfo.livesRecommendInfo;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, liveWindowInfo.livesPicBlur);
            liveWindowInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveWindowInfo parse(nc5 nc5Var) throws IOException {
            LiveWindowInfo liveWindowInfo = new LiveWindowInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    liveWindowInfo.livesStream = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    liveWindowInfo.livesPic = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    liveWindowInfo.livesRecommendInfo = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
                        return liveWindowInfo;
                    }
                    liveWindowInfo.livesPicBlur = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveWindowInfo liveWindowInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveWindowInfo.livesStream;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = liveWindowInfo.livesPic;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = liveWindowInfo.livesRecommendInfo;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17299A(4, liveWindowInfo.livesPicBlur);
        }
    };
    public static JsonAdapter<LiveWindowInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiveWindowInfo>() { // from class: com.p1.mobile.putong.data.LiveWindowInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveWindowInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveWindowInfo newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveWindowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveWindowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveWindowInfo new_() {
        LiveWindowInfo liveWindowInfo = new LiveWindowInfo();
        liveWindowInfo.nullCheck();
        return liveWindowInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveWindowInfo mo225055clone() {
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
        String str = this.livesStream;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.livesPic;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.livesRecommendInfo;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.livesPicBlur ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
