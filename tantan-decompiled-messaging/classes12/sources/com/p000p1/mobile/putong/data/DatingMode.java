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
public class DatingMode extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingmode";

    @ProtobufIndex(index = 3)
    public boolean datingMode;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f197id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<DatingMode> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingMode>() { // from class: com.p1.mobile.putong.data.DatingMode.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DatingMode datingMode) {
            String str = datingMode.f197id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = datingMode.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, datingMode.datingMode);
            ((MessageNano) datingMode).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DatingMode m17941parse(nb5 nb5Var) throws IOException {
            DatingMode datingMode = new DatingMode();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (datingMode.f197id == null) {
                        datingMode.f197id = "";
                    }
                    if (datingMode.type != null) {
                        break;
                    }
                    datingMode.type = "";
                    break;
                }
                if (iU == 10) {
                    datingMode.f197id = nb5Var.s();
                } else if (iU == 18) {
                    datingMode.type = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (datingMode.f197id == null) {
                            datingMode.f197id = "";
                        }
                        if (datingMode.type != null) {
                            break;
                        }
                        datingMode.type = "";
                        return datingMode;
                    }
                    datingMode.datingMode = nb5Var.g();
                }
            }
            return datingMode;
        }

        public void serialize(DatingMode datingMode, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = datingMode.f197id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = datingMode.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, datingMode.datingMode);
        }
    };
    public static JsonAdapter<DatingMode> JSON_ADAPTER = new ObjectJsonAdapter<DatingMode>() { // from class: com.p1.mobile.putong.data.DatingMode.2
        public Class getDataClass() {
            return DatingMode.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DatingMode mo17830newInstance() {
            return new DatingMode();
        }

        public boolean parseField(DatingMode datingMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    datingMode.f197id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    datingMode.type = jsonParser.getValueAsString();
                    return true;
                case "datingMode":
                    datingMode.datingMode = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DatingMode datingMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "datingMode":
                    return true;
                default:
                    return super.parseFieldCheck(datingMode, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DatingMode datingMode, JsonGenerator jsonGenerator) throws IOException {
            String str = datingMode.f197id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = datingMode.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("datingMode", datingMode.datingMode);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DatingMode new_() {
        DatingMode datingMode = new DatingMode();
        datingMode.nullCheck();
        return datingMode;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DatingMode m17940clone() {
        DatingMode datingMode = new DatingMode();
        datingMode.f197id = this.f197id;
        datingMode.type = this.type;
        datingMode.datingMode = this.datingMode;
        return datingMode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatingMode)) {
            return false;
        }
        DatingMode datingMode = (DatingMode) obj;
        return ValueObject.util_equals(this.f197id, datingMode.f197id) && ValueObject.util_equals(this.type, datingMode.type) && this.datingMode == datingMode.datingMode;
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
        String str = this.f197id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.datingMode ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f197id == null) {
            this.f197id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
