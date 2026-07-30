package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class HotLevel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hotlevel";

    @ProtobufIndex(index = 1)
    public int level;
    public static ProtobufAdapter<HotLevel> PROTOBUF_ADAPTER = new MessageNanoAdapter<HotLevel>() { // from class: com.p1.mobile.putong.core.data.HotLevel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HotLevel hotLevel) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, hotLevel.level);
            hotLevel.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HotLevel parse(nb5 nb5Var) throws IOException {
            HotLevel hotLevel = new HotLevel();
            while (nb5Var.m158752u() == 8) {
                hotLevel.level = nb5Var.m158741j();
            }
            return hotLevel;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HotLevel hotLevel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, hotLevel.level);
        }
    };
    public static JsonAdapter<HotLevel> JSON_ADAPTER = new ObjectJsonAdapter<HotLevel>() { // from class: com.p1.mobile.putong.core.data.HotLevel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HotLevel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HotLevel newInstance() {
            return new HotLevel();
        }

        public boolean parseField(HotLevel hotLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(FirebaseAnalytics.Param.LEVEL)) {
                return false;
            }
            hotLevel.level = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(HotLevel hotLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                return true;
            }
            return super.parseFieldCheck(hotLevel, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HotLevel hotLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, hotLevel.level);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HotLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HotLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HotLevel new_() {
        HotLevel hotLevel = new HotLevel();
        hotLevel.nullCheck();
        return hotLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HotLevel mo223809clone() {
        HotLevel hotLevel = new HotLevel();
        hotLevel.level = this.level;
        return hotLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof HotLevel) && this.level == ((HotLevel) obj).level;
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
