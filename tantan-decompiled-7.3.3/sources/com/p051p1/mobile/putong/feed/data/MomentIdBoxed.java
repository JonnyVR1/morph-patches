package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class MomentIdBoxed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentidboxed";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40080id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<MomentIdBoxed> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentIdBoxed>() { // from class: com.p1.mobile.putong.feed.data.MomentIdBoxed.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentIdBoxed momentIdBoxed) {
            String str = momentIdBoxed.f40080id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = momentIdBoxed.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            momentIdBoxed.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentIdBoxed parse(nc5 nc5Var) throws IOException {
            MomentIdBoxed momentIdBoxed = new MomentIdBoxed();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (momentIdBoxed.f40080id == null) {
                        momentIdBoxed.f40080id = "";
                    }
                    if (momentIdBoxed.type != null) {
                        break;
                    }
                    momentIdBoxed.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    momentIdBoxed.f40080id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (momentIdBoxed.f40080id == null) {
                            momentIdBoxed.f40080id = "";
                        }
                        if (momentIdBoxed.type != null) {
                            break;
                        }
                        momentIdBoxed.type = "";
                        return momentIdBoxed;
                    }
                    momentIdBoxed.type = nc5Var.m162495s();
                }
            }
            return momentIdBoxed;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentIdBoxed momentIdBoxed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentIdBoxed.f40080id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = momentIdBoxed.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<MomentIdBoxed> JSON_ADAPTER = new ObjectJsonAdapter<MomentIdBoxed>() { // from class: com.p1.mobile.putong.feed.data.MomentIdBoxed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentIdBoxed.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentIdBoxed newInstance() {
            return new MomentIdBoxed();
        }

        public boolean parseField(MomentIdBoxed momentIdBoxed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                momentIdBoxed.f40080id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            momentIdBoxed.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MomentIdBoxed momentIdBoxed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(momentIdBoxed, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentIdBoxed momentIdBoxed, JsonGenerator jsonGenerator) throws IOException {
            String str = momentIdBoxed.f40080id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = momentIdBoxed.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentIdBoxed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentIdBoxed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentIdBoxed new_() {
        MomentIdBoxed momentIdBoxed = new MomentIdBoxed();
        momentIdBoxed.nullCheck();
        return momentIdBoxed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentIdBoxed mo225055clone() {
        MomentIdBoxed momentIdBoxed = new MomentIdBoxed();
        momentIdBoxed.f40080id = this.f40080id;
        momentIdBoxed.type = this.type;
        return momentIdBoxed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentIdBoxed)) {
            return false;
        }
        MomentIdBoxed momentIdBoxed = (MomentIdBoxed) obj;
        return ValueObject.util_equals(this.f40080id, momentIdBoxed.f40080id) && ValueObject.util_equals(this.type, momentIdBoxed.type);
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
        String str = this.f40080id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40080id == null) {
            this.f40080id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
