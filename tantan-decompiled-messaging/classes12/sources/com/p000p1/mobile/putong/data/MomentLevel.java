package com.p000p1.mobile.putong.data;

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
public class MomentLevel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentlevel";

    @ProtobufIndex(index = 1)
    public int level;
    public static ProtobufAdapter<MomentLevel> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentLevel>() { // from class: com.p1.mobile.putong.data.MomentLevel.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentLevel momentLevel) {
            int iH = CodedOutputByteBufferNano.h(1, momentLevel.level);
            ((MessageNano) momentLevel).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentLevel m18489parse(nb5 nb5Var) throws IOException {
            MomentLevel momentLevel = new MomentLevel();
            while (nb5Var.u() == 8) {
                momentLevel.level = nb5Var.j();
            }
            return momentLevel;
        }

        public void serialize(MomentLevel momentLevel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, momentLevel.level);
        }
    };
    public static JsonAdapter<MomentLevel> JSON_ADAPTER = new ObjectJsonAdapter<MomentLevel>() { // from class: com.p1.mobile.putong.data.MomentLevel.2
        public Class getDataClass() {
            return MomentLevel.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentLevel mo17830newInstance() {
            return new MomentLevel();
        }

        public boolean parseField(MomentLevel momentLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("level")) {
                return false;
            }
            momentLevel.level = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MomentLevel momentLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("level")) {
                return true;
            }
            return super.parseFieldCheck(momentLevel, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentLevel momentLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("level", momentLevel.level);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentLevel new_() {
        MomentLevel momentLevel = new MomentLevel();
        momentLevel.nullCheck();
        return momentLevel;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentLevel m18488clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.level;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
