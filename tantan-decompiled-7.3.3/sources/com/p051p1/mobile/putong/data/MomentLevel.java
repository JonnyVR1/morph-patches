package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class MomentLevel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentlevel";

    @ProtobufIndex(index = 1)
    public int level;
    public static ProtobufAdapter<MomentLevel> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentLevel>() { // from class: com.p1.mobile.putong.data.MomentLevel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentLevel momentLevel) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, momentLevel.level);
            momentLevel.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentLevel parse(nc5 nc5Var) throws IOException {
            MomentLevel momentLevel = new MomentLevel();
            while (nc5Var.m162497u() == 8) {
                momentLevel.level = nc5Var.m162486j();
            }
            return momentLevel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentLevel momentLevel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, momentLevel.level);
        }
    };
    public static JsonAdapter<MomentLevel> JSON_ADAPTER = new ObjectJsonAdapter<MomentLevel>() { // from class: com.p1.mobile.putong.data.MomentLevel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentLevel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentLevel newInstance() {
            return new MomentLevel();
        }

        public boolean parseField(MomentLevel momentLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(FirebaseAnalytics.Param.LEVEL)) {
                return false;
            }
            momentLevel.level = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MomentLevel momentLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                return true;
            }
            return super.parseFieldCheck(momentLevel, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentLevel momentLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, momentLevel.level);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentLevel new_() {
        MomentLevel momentLevel = new MomentLevel();
        momentLevel.nullCheck();
        return momentLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentLevel mo225055clone() {
        MomentLevel momentLevel = new MomentLevel();
        momentLevel.level = this.level;
        return momentLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MomentLevel) && this.level == ((MomentLevel) obj).level;
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
        int i2 = (i * 41) + this.level;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
