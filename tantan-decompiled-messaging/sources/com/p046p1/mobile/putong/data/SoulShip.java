package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes12.dex */
public class SoulShip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "soulship";

    @NonNull
    @ProtobufIndex(index = 1)
    public String otherUserId;

    @ProtobufIndex(index = 2)
    public int score;
    public static ProtobufAdapter<SoulShip> PROTOBUF_ADAPTER = new MessageNanoAdapter<SoulShip>() { // from class: com.p1.mobile.putong.data.SoulShip.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SoulShip soulShip) {
            String str = soulShip.otherUserId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, soulShip.score);
            soulShip.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SoulShip parse(nb5 nb5Var) throws IOException {
            SoulShip soulShip = new SoulShip();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (soulShip.otherUserId != null) {
                        break;
                    }
                    soulShip.otherUserId = "";
                    break;
                }
                if (iM158752u == 10) {
                    soulShip.otherUserId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (soulShip.otherUserId != null) {
                            break;
                        }
                        soulShip.otherUserId = "";
                        return soulShip;
                    }
                    soulShip.score = nb5Var.m158741j();
                }
            }
            return soulShip;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SoulShip soulShip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = soulShip.otherUserId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, soulShip.score);
        }
    };
    public static JsonAdapter<SoulShip> JSON_ADAPTER = new ObjectJsonAdapter<SoulShip>() { // from class: com.p1.mobile.putong.data.SoulShip.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SoulShip.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SoulShip newInstance() {
            return new SoulShip();
        }

        public boolean parseField(SoulShip soulShip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("otherUserId")) {
                soulShip.otherUserId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.SCORE)) {
                return false;
            }
            soulShip.score = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SoulShip soulShip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("otherUserId") || str.equals(FirebaseAnalytics.Param.SCORE)) {
                return true;
            }
            return super.parseFieldCheck(soulShip, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SoulShip soulShip, JsonGenerator jsonGenerator) throws IOException {
            String str = soulShip.otherUserId;
            if (str != null) {
                jsonGenerator.writeStringField("otherUserId", str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, soulShip.score);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SoulShip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SoulShip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SoulShip new_() {
        SoulShip soulShip = new SoulShip();
        soulShip.nullCheck();
        return soulShip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SoulShip mo223809clone() {
        SoulShip soulShip = new SoulShip();
        soulShip.otherUserId = this.otherUserId;
        soulShip.score = this.score;
        return soulShip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SoulShip)) {
            return false;
        }
        SoulShip soulShip = (SoulShip) obj;
        return ValueObject.util_equals(this.otherUserId, soulShip.otherUserId) && this.score == soulShip.score;
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
        String str = this.otherUserId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.score;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
