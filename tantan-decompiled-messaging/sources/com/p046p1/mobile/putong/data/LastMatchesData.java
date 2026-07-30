package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
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

/* JADX INFO: loaded from: classes12.dex */
public class LastMatchesData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lastmatchesdata";

    @ProtobufIndex(index = 2)
    public long time;

    @NonNull
    @ProtobufIndex(index = 1)
    public ProfileZodiac zodiac;
    public static ProtobufAdapter<LastMatchesData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LastMatchesData>() { // from class: com.p1.mobile.putong.data.LastMatchesData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LastMatchesData lastMatchesData) {
            ProfileZodiac profileZodiac = lastMatchesData.zodiac;
            int iM17226h = (profileZodiac != null ? CodedOutputByteBufferNano.m17226h(1, profileZodiac.ordinal()) : 0) + CodedOutputByteBufferNano.m17228j(2, lastMatchesData.time);
            ProfileZodiac profileZodiac2 = lastMatchesData.zodiac;
            if (profileZodiac2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
            lastMatchesData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LastMatchesData parse(nb5 nb5Var) throws IOException {
            LastMatchesData lastMatchesData = new LastMatchesData();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (lastMatchesData.zodiac == null && numValueOf != null) {
                        lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (lastMatchesData.zodiac != null) {
                        break;
                    }
                    lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 16) {
                    lastMatchesData.time = nb5Var.m158742k();
                } else {
                    if (iM158752u != 26) {
                        if (lastMatchesData.zodiac == null && numValueOf != null) {
                            lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (lastMatchesData.zodiac != null) {
                            break;
                        }
                        lastMatchesData.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
                        return lastMatchesData;
                    }
                    lastMatchesData.zodiac = (ProfileZodiac) nb5Var.m158743l(ProfileZodiac.PROTOBUF_ADAPTER);
                }
            }
            return lastMatchesData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LastMatchesData lastMatchesData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProfileZodiac profileZodiac = lastMatchesData.zodiac;
            if (profileZodiac != null) {
                codedOutputByteBufferNano.m17250G(1, profileZodiac.ordinal());
            }
            codedOutputByteBufferNano.m17252I(2, lastMatchesData.time);
            ProfileZodiac profileZodiac2 = lastMatchesData.zodiac;
            if (profileZodiac2 != null) {
                codedOutputByteBufferNano.m17254K(3, profileZodiac2, ProfileZodiac.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LastMatchesData> JSON_ADAPTER = new ObjectJsonAdapter<LastMatchesData>() { // from class: com.p1.mobile.putong.data.LastMatchesData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LastMatchesData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LastMatchesData newInstance() {
            return new LastMatchesData();
        }

        public boolean parseField(LastMatchesData lastMatchesData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(ProfileLikeCategoryType.zodiac)) {
                lastMatchesData.zodiac = ProfileZodiac.JSON_ADAPTER.parse(jsonParser, str2);
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
            if (str.equals(ProfileLikeCategoryType.zodiac) || str.equals("time")) {
                return true;
            }
            return super.parseFieldCheck(lastMatchesData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LastMatchesData lastMatchesData, JsonGenerator jsonGenerator) throws IOException {
            if (lastMatchesData.zodiac != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.zodiac);
                ProfileZodiac.JSON_ADAPTER.serialize(lastMatchesData.zodiac, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("time", lastMatchesData.time);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LastMatchesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LastMatchesData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LastMatchesData new_() {
        LastMatchesData lastMatchesData = new LastMatchesData();
        lastMatchesData.nullCheck();
        return lastMatchesData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LastMatchesData mo223809clone() {
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
        ProfileZodiac profileZodiac = this.zodiac;
        int iHashCode = (i2 + (profileZodiac != null ? profileZodiac.hashCode() : 0)) * 41;
        long j = this.time;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.zodiac == null) {
            this.zodiac = (ProfileZodiac) ProfileZodiac.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
