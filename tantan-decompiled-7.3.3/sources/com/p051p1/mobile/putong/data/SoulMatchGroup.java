package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class SoulMatchGroup extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "soulmatchgroup";

    @ProtobufIndex(index = 1)
    public boolean inABGroup;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tag;
    public static ProtobufAdapter<SoulMatchGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<SoulMatchGroup>() { // from class: com.p1.mobile.putong.data.SoulMatchGroup.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SoulMatchGroup soulMatchGroup) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, soulMatchGroup.inABGroup);
            String str = soulMatchGroup.tag;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            soulMatchGroup.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SoulMatchGroup parse(nc5 nc5Var) throws IOException {
            SoulMatchGroup soulMatchGroup = new SoulMatchGroup();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (soulMatchGroup.tag != null) {
                        break;
                    }
                    soulMatchGroup.tag = "";
                    break;
                }
                if (iM162497u == 8) {
                    soulMatchGroup.inABGroup = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (soulMatchGroup.tag != null) {
                            break;
                        }
                        soulMatchGroup.tag = "";
                        return soulMatchGroup;
                    }
                    soulMatchGroup.tag = nc5Var.m162495s();
                }
            }
            return soulMatchGroup;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SoulMatchGroup soulMatchGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, soulMatchGroup.inABGroup);
            String str = soulMatchGroup.tag;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<SoulMatchGroup> JSON_ADAPTER = new ObjectJsonAdapter<SoulMatchGroup>() { // from class: com.p1.mobile.putong.data.SoulMatchGroup.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SoulMatchGroup.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SoulMatchGroup newInstance() {
            return new SoulMatchGroup();
        }

        public boolean parseField(SoulMatchGroup soulMatchGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tag")) {
                soulMatchGroup.tag = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("inABGroup")) {
                return false;
            }
            soulMatchGroup.inABGroup = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SoulMatchGroup soulMatchGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tag") || str.equals("inABGroup")) {
                return true;
            }
            return super.parseFieldCheck(soulMatchGroup, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SoulMatchGroup soulMatchGroup, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("inABGroup", soulMatchGroup.inABGroup);
            String str = soulMatchGroup.tag;
            if (str != null) {
                jsonGenerator.writeStringField("tag", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SoulMatchGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SoulMatchGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SoulMatchGroup new_() {
        SoulMatchGroup soulMatchGroup = new SoulMatchGroup();
        soulMatchGroup.nullCheck();
        return soulMatchGroup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SoulMatchGroup mo225055clone() {
        SoulMatchGroup soulMatchGroup = new SoulMatchGroup();
        soulMatchGroup.inABGroup = this.inABGroup;
        soulMatchGroup.tag = this.tag;
        return soulMatchGroup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SoulMatchGroup)) {
            return false;
        }
        SoulMatchGroup soulMatchGroup = (SoulMatchGroup) obj;
        return this.inABGroup == soulMatchGroup.inABGroup && ValueObject.util_equals(this.tag, soulMatchGroup.tag);
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
        int i2 = ((i * 41) + (this.inABGroup ? 1231 : 1237)) * 41;
        String str = this.tag;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tag == null) {
            this.tag = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
