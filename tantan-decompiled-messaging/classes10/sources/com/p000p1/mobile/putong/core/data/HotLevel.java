package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HotLevel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hotlevel";

    @ProtobufIndex(index = 1)
    public int level;
    public static ProtobufAdapter<HotLevel> PROTOBUF_ADAPTER = new MessageNanoAdapter<HotLevel>() { // from class: com.p1.mobile.putong.core.data.HotLevel.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HotLevel hotLevel) {
            int iH = CodedOutputByteBufferNano.h(1, hotLevel.level);
            ((MessageNano) hotLevel).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HotLevel m13349parse(nb5 nb5Var) throws IOException {
            HotLevel hotLevel = new HotLevel();
            while (nb5Var.u() == 8) {
                hotLevel.level = nb5Var.j();
            }
            return hotLevel;
        }

        public void serialize(HotLevel hotLevel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, hotLevel.level);
        }
    };
    public static JsonAdapter<HotLevel> JSON_ADAPTER = new ObjectJsonAdapter<HotLevel>() { // from class: com.p1.mobile.putong.core.data.HotLevel.2
        public Class getDataClass() {
            return HotLevel.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HotLevel m13350newInstance() {
            return new HotLevel();
        }

        public boolean parseField(HotLevel hotLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("level")) {
                return false;
            }
            hotLevel.level = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(HotLevel hotLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("level")) {
                return true;
            }
            return super.parseFieldCheck(hotLevel, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HotLevel hotLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("level", hotLevel.level);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HotLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HotLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HotLevel new_() {
        HotLevel hotLevel = new HotLevel();
        hotLevel.nullCheck();
        return hotLevel;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HotLevel m13348clone() {
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
