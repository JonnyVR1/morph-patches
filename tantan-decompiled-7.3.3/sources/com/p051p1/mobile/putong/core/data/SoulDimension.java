package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class SoulDimension extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "souldimension";

    @NonNull
    @ProtobufIndex(index = 3)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 2)
    public int score;
    public static ProtobufAdapter<SoulDimension> PROTOBUF_ADAPTER = new MessageNanoAdapter<SoulDimension>() { // from class: com.p1.mobile.putong.core.data.SoulDimension.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SoulDimension soulDimension) {
            String str = soulDimension.name;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, soulDimension.score);
            String str2 = soulDimension.description;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            soulDimension.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SoulDimension parse(nc5 nc5Var) throws IOException {
            SoulDimension soulDimension = new SoulDimension();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (soulDimension.name == null) {
                        soulDimension.name = "";
                    }
                    if (soulDimension.description != null) {
                        break;
                    }
                    soulDimension.description = "";
                    break;
                }
                if (iM162497u == 10) {
                    soulDimension.name = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    soulDimension.score = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (soulDimension.name == null) {
                            soulDimension.name = "";
                        }
                        if (soulDimension.description != null) {
                            break;
                        }
                        soulDimension.description = "";
                        return soulDimension;
                    }
                    soulDimension.description = nc5Var.m162495s();
                }
            }
            return soulDimension;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SoulDimension soulDimension, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = soulDimension.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, soulDimension.score);
            String str2 = soulDimension.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<SoulDimension> JSON_ADAPTER = new ObjectJsonAdapter<SoulDimension>() { // from class: com.p1.mobile.putong.core.data.SoulDimension.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SoulDimension.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SoulDimension newInstance() {
            return new SoulDimension();
        }

        public boolean parseField(SoulDimension soulDimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    soulDimension.description = jsonParser.getValueAsString();
                    return true;
                case "name":
                    soulDimension.name = jsonParser.getValueAsString();
                    return true;
                case "score":
                    soulDimension.score = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SoulDimension soulDimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "name":
                case "score":
                    return true;
                default:
                    return super.parseFieldCheck(soulDimension, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SoulDimension soulDimension, JsonGenerator jsonGenerator) throws IOException {
            String str = soulDimension.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, soulDimension.score);
            String str2 = soulDimension.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SoulDimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SoulDimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SoulDimension new_() {
        SoulDimension soulDimension = new SoulDimension();
        soulDimension.nullCheck();
        return soulDimension;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SoulDimension mo225055clone() {
        SoulDimension soulDimension = new SoulDimension();
        soulDimension.name = this.name;
        soulDimension.score = this.score;
        soulDimension.description = this.description;
        return soulDimension;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SoulDimension)) {
            return false;
        }
        SoulDimension soulDimension = (SoulDimension) obj;
        return ValueObject.util_equals(this.name, soulDimension.name) && this.score == soulDimension.score && ValueObject.util_equals(this.description, soulDimension.description);
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
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.score) * 41;
        String str2 = this.description;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
