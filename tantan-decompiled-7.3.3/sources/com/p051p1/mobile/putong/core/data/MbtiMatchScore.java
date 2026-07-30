package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class MbtiMatchScore extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mbtimatchscore";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @ProtobufIndex(index = 2)
    public int matchScore;
    public static ProtobufAdapter<MbtiMatchScore> PROTOBUF_ADAPTER = new MessageNanoAdapter<MbtiMatchScore>() { // from class: com.p1.mobile.putong.core.data.MbtiMatchScore.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MbtiMatchScore mbtiMatchScore) {
            String str = mbtiMatchScore.key;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, mbtiMatchScore.matchScore);
            mbtiMatchScore.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MbtiMatchScore parse(nc5 nc5Var) throws IOException {
            MbtiMatchScore mbtiMatchScore = new MbtiMatchScore();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (mbtiMatchScore.key != null) {
                        break;
                    }
                    mbtiMatchScore.key = "";
                    break;
                }
                if (iM162497u == 10) {
                    mbtiMatchScore.key = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (mbtiMatchScore.key != null) {
                            break;
                        }
                        mbtiMatchScore.key = "";
                        return mbtiMatchScore;
                    }
                    mbtiMatchScore.matchScore = nc5Var.m162486j();
                }
            }
            return mbtiMatchScore;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MbtiMatchScore mbtiMatchScore, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = mbtiMatchScore.key;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, mbtiMatchScore.matchScore);
        }
    };
    public static JsonAdapter<MbtiMatchScore> JSON_ADAPTER = new ObjectJsonAdapter<MbtiMatchScore>() { // from class: com.p1.mobile.putong.core.data.MbtiMatchScore.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MbtiMatchScore.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MbtiMatchScore newInstance() {
            return new MbtiMatchScore();
        }

        public boolean parseField(MbtiMatchScore mbtiMatchScore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Constants.KEY_KEY)) {
                mbtiMatchScore.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("matchScore")) {
                return false;
            }
            mbtiMatchScore.matchScore = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MbtiMatchScore mbtiMatchScore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Constants.KEY_KEY) || str.equals("matchScore")) {
                return true;
            }
            return super.parseFieldCheck(mbtiMatchScore, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MbtiMatchScore mbtiMatchScore, JsonGenerator jsonGenerator) throws IOException {
            String str = mbtiMatchScore.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            jsonGenerator.writeNumberField("matchScore", mbtiMatchScore.matchScore);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MbtiMatchScore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MbtiMatchScore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MbtiMatchScore new_() {
        MbtiMatchScore mbtiMatchScore = new MbtiMatchScore();
        mbtiMatchScore.nullCheck();
        return mbtiMatchScore;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MbtiMatchScore mo225055clone() {
        MbtiMatchScore mbtiMatchScore = new MbtiMatchScore();
        mbtiMatchScore.key = this.key;
        mbtiMatchScore.matchScore = this.matchScore;
        return mbtiMatchScore;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MbtiMatchScore)) {
            return false;
        }
        MbtiMatchScore mbtiMatchScore = (MbtiMatchScore) obj;
        return ValueObject.util_equals(this.key, mbtiMatchScore.key) && this.matchScore == mbtiMatchScore.matchScore;
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
        String str = this.key;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.matchScore;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
