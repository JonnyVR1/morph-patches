package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Counter;
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
public class VoteOptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voteoptions";

    @ProtobufIndex(index = 4)
    public int counter;

    @ProtobufIndex(index = 3)
    public boolean haveliked;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40101id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String values;
    public static ProtobufAdapter<VoteOptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoteOptions>() { // from class: com.p1.mobile.putong.feed.data.VoteOptions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoteOptions voteOptions) {
            String str = voteOptions.f40101id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = voteOptions.values;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, voteOptions.haveliked) + CodedOutputByteBufferNano.m17281h(4, voteOptions.counter);
            voteOptions.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoteOptions parse(nc5 nc5Var) throws IOException {
            VoteOptions voteOptions = new VoteOptions();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voteOptions.f40101id == null) {
                        voteOptions.f40101id = "";
                    }
                    if (voteOptions.values != null) {
                        break;
                    }
                    voteOptions.values = "";
                    break;
                }
                if (iM162497u == 10) {
                    voteOptions.f40101id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    voteOptions.values = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    voteOptions.haveliked = nc5Var.m162483g();
                } else {
                    if (iM162497u != 32) {
                        if (voteOptions.f40101id == null) {
                            voteOptions.f40101id = "";
                        }
                        if (voteOptions.values != null) {
                            break;
                        }
                        voteOptions.values = "";
                        return voteOptions;
                    }
                    voteOptions.counter = nc5Var.m162486j();
                }
            }
            return voteOptions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoteOptions voteOptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voteOptions.f40101id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = voteOptions.values;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, voteOptions.haveliked);
            codedOutputByteBufferNano.m17305G(4, voteOptions.counter);
        }
    };
    public static JsonAdapter<VoteOptions> JSON_ADAPTER = new ObjectJsonAdapter<VoteOptions>() { // from class: com.p1.mobile.putong.feed.data.VoteOptions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoteOptions.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoteOptions newInstance() {
            return new VoteOptions();
        }

        public boolean parseField(VoteOptions voteOptions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "haveliked":
                    voteOptions.haveliked = jsonParser.getValueAsBoolean();
                    return true;
                case "values":
                    voteOptions.values = jsonParser.getValueAsString();
                    return true;
                case "id":
                    voteOptions.f40101id = jsonParser.getValueAsString();
                    return false;
                case "counter":
                    voteOptions.counter = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoteOptions voteOptions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "haveliked":
                case "values":
                    return true;
                case "id":
                    return false;
                case "counter":
                    return true;
                default:
                    return super.parseFieldCheck(voteOptions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoteOptions voteOptions, JsonGenerator jsonGenerator) throws IOException {
            String str = voteOptions.f40101id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voteOptions.values;
            if (str2 != null) {
                jsonGenerator.writeStringField("values", str2);
            }
            jsonGenerator.writeBooleanField("haveliked", voteOptions.haveliked);
            jsonGenerator.writeNumberField(Counter.TYPE, voteOptions.counter);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoteOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoteOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoteOptions new_() {
        VoteOptions voteOptions = new VoteOptions();
        voteOptions.nullCheck();
        return voteOptions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoteOptions mo225055clone() {
        VoteOptions voteOptions = new VoteOptions();
        voteOptions.f40101id = this.f40101id;
        voteOptions.values = this.values;
        voteOptions.haveliked = this.haveliked;
        voteOptions.counter = this.counter;
        return voteOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoteOptions)) {
            return false;
        }
        VoteOptions voteOptions = (VoteOptions) obj;
        return ValueObject.util_equals(this.f40101id, voteOptions.f40101id) && ValueObject.util_equals(this.values, voteOptions.values) && this.haveliked == voteOptions.haveliked && this.counter == voteOptions.counter;
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
        String str = this.f40101id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.values;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.haveliked ? 1231 : 1237)) * 41) + this.counter;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40101id == null) {
            this.f40101id = "";
        }
        if (this.values == null) {
            this.values = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
