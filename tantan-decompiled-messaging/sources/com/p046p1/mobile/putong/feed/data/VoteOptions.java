package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Counter;
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
public class VoteOptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voteoptions";

    @ProtobufIndex(index = 4)
    public int counter;

    @ProtobufIndex(index = 3)
    public boolean haveliked;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39253id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String values;
    public static ProtobufAdapter<VoteOptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoteOptions>() { // from class: com.p1.mobile.putong.feed.data.VoteOptions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoteOptions voteOptions) {
            String str = voteOptions.f39253id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = voteOptions.values;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, voteOptions.haveliked) + CodedOutputByteBufferNano.m17226h(4, voteOptions.counter);
            voteOptions.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoteOptions parse(nb5 nb5Var) throws IOException {
            VoteOptions voteOptions = new VoteOptions();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voteOptions.f39253id == null) {
                        voteOptions.f39253id = "";
                    }
                    if (voteOptions.values != null) {
                        break;
                    }
                    voteOptions.values = "";
                    break;
                }
                if (iM158752u == 10) {
                    voteOptions.f39253id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    voteOptions.values = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    voteOptions.haveliked = nb5Var.m158738g();
                } else {
                    if (iM158752u != 32) {
                        if (voteOptions.f39253id == null) {
                            voteOptions.f39253id = "";
                        }
                        if (voteOptions.values != null) {
                            break;
                        }
                        voteOptions.values = "";
                        return voteOptions;
                    }
                    voteOptions.counter = nb5Var.m158741j();
                }
            }
            return voteOptions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoteOptions voteOptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voteOptions.f39253id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = voteOptions.values;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, voteOptions.haveliked);
            codedOutputByteBufferNano.m17250G(4, voteOptions.counter);
        }
    };
    public static JsonAdapter<VoteOptions> JSON_ADAPTER = new ObjectJsonAdapter<VoteOptions>() { // from class: com.p1.mobile.putong.feed.data.VoteOptions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoteOptions.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    voteOptions.f39253id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoteOptions voteOptions, JsonGenerator jsonGenerator) throws IOException {
            String str = voteOptions.f39253id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoteOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public VoteOptions mo223809clone() {
        VoteOptions voteOptions = new VoteOptions();
        voteOptions.f39253id = this.f39253id;
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
        return ValueObject.util_equals(this.f39253id, voteOptions.f39253id) && ValueObject.util_equals(this.values, voteOptions.values) && this.haveliked == voteOptions.haveliked && this.counter == voteOptions.counter;
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
        String str = this.f39253id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.values;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.haveliked ? 1231 : 1237)) * 41) + this.counter;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39253id == null) {
            this.f39253id = "";
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
