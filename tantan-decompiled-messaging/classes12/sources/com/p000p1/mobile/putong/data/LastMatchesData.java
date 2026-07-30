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
public class LastMatchesData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lastmatchesdata";

    @ProtobufIndex(index = 2)
    public long time;

    @NonNull
    @ProtobufIndex(index = 1)
    public ProfileZodiac zodiac;
    public static ProtobufAdapter<LastMatchesData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LastMatchesData>() { // from class: com.p1.mobile.putong.data.LastMatchesData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LastMatchesData lastMatchesData) {
            ProfileZodiac profileZodiac = lastMatchesData.zodiac;
            int iH = (profileZodiac != null ? CodedOutputByteBufferNano.h(1, profileZodiac.ordinal()) : 0) + CodedOutputByteBufferNano.j(2, lastMatchesData.time);
            ProfileZodiac profileZodiac2 = lastMatchesData.zodiac;
            if (profileZodiac2 != null) {
                iH += CodedOutputByteBufferNano.l(3, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
            ((MessageNano) lastMatchesData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LastMatchesData m18280parse(nb5 nb5Var) throws IOException {
            LastMatchesData lastMatchesData = new LastMatchesData();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (lastMatchesData.zodiac == null && numValueOf != null) {
                        lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (lastMatchesData.zodiac != null) {
                        break;
                    }
                    lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    lastMatchesData.time = nb5Var.k();
                } else {
                    if (iU != 26) {
                        if (lastMatchesData.zodiac == null && numValueOf != null) {
                            lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (lastMatchesData.zodiac != null) {
                            break;
                        }
                        lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
                        return lastMatchesData;
                    }
                    lastMatchesData.zodiac = (ProfileZodiac) nb5Var.l(ProfileZodiac.PROTOBUF_ADAPTER);
                }
            }
            return lastMatchesData;
        }

        public void serialize(LastMatchesData lastMatchesData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProfileZodiac profileZodiac = lastMatchesData.zodiac;
            if (profileZodiac != null) {
                codedOutputByteBufferNano.G(1, profileZodiac.ordinal());
            }
            codedOutputByteBufferNano.I(2, lastMatchesData.time);
            ProfileZodiac profileZodiac2 = lastMatchesData.zodiac;
            if (profileZodiac2 != null) {
                codedOutputByteBufferNano.K(3, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LastMatchesData> JSON_ADAPTER = new ObjectJsonAdapter<LastMatchesData>() { // from class: com.p1.mobile.putong.data.LastMatchesData.2
        public Class getDataClass() {
            return LastMatchesData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LastMatchesData mo17830newInstance() {
            return new LastMatchesData();
        }

        public boolean parseField(LastMatchesData lastMatchesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("zodiac")) {
                lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("time")) {
                return false;
            }
            lastMatchesData.time = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(LastMatchesData lastMatchesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("zodiac") || str.equals("time")) {
                return true;
            }
            return super.parseFieldCheck(lastMatchesData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LastMatchesData lastMatchesData, JsonGenerator jsonGenerator) throws IOException {
            if (lastMatchesData.zodiac != null) {
                jsonGenerator.writeFieldName("zodiac");
                ProfileZodiac.JSON_ADAPTER.serialize(lastMatchesData.zodiac, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("time", lastMatchesData.time);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LastMatchesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LastMatchesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LastMatchesData new_() {
        LastMatchesData lastMatchesData = new LastMatchesData();
        lastMatchesData.nullCheck();
        return lastMatchesData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LastMatchesData m18279clone() {
        LastMatchesData lastMatchesData = new LastMatchesData();
        lastMatchesData.zodiac = this.zodiac;
        lastMatchesData.time = this.time;
        return lastMatchesData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LastMatchesData)) {
            return false;
        }
        LastMatchesData lastMatchesData = (LastMatchesData) obj;
        return ValueObject.util_equals(this.zodiac, lastMatchesData.zodiac) && this.time == lastMatchesData.time;
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
        ProfileZodiac profileZodiac = this.zodiac;
        int iHashCode = (i2 + (profileZodiac != null ? profileZodiac.hashCode() : 0)) * 41;
        long j = this.time;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.zodiac == null) {
            this.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
