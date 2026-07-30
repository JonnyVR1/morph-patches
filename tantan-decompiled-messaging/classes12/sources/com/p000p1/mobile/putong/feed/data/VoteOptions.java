package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Counter;
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
public class VoteOptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voteoptions";

    @ProtobufIndex(index = 4)
    public int counter;

    @ProtobufIndex(index = 3)
    public boolean haveliked;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f714id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String values;
    public static ProtobufAdapter<VoteOptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoteOptions>() { // from class: com.p1.mobile.putong.feed.data.VoteOptions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoteOptions voteOptions) {
            String str = voteOptions.f714id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = voteOptions.values;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, voteOptions.haveliked) + CodedOutputByteBufferNano.h(4, voteOptions.counter);
            ((MessageNano) voteOptions).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoteOptions m19831parse(nb5 nb5Var) throws IOException {
            VoteOptions voteOptions = new VoteOptions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voteOptions.f714id == null) {
                        voteOptions.f714id = "";
                    }
                    if (voteOptions.values != null) {
                        break;
                    }
                    voteOptions.values = "";
                    break;
                }
                if (iU == 10) {
                    voteOptions.f714id = nb5Var.s();
                } else if (iU == 18) {
                    voteOptions.values = nb5Var.s();
                } else if (iU == 24) {
                    voteOptions.haveliked = nb5Var.g();
                } else {
                    if (iU != 32) {
                        if (voteOptions.f714id == null) {
                            voteOptions.f714id = "";
                        }
                        if (voteOptions.values != null) {
                            break;
                        }
                        voteOptions.values = "";
                        return voteOptions;
                    }
                    voteOptions.counter = nb5Var.j();
                }
            }
            return voteOptions;
        }

        public void serialize(VoteOptions voteOptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voteOptions.f714id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = voteOptions.values;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, voteOptions.haveliked);
            codedOutputByteBufferNano.G(4, voteOptions.counter);
        }
    };
    public static JsonAdapter<VoteOptions> JSON_ADAPTER = new ObjectJsonAdapter<VoteOptions>() { // from class: com.p1.mobile.putong.feed.data.VoteOptions.2
        public Class getDataClass() {
            return VoteOptions.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoteOptions mo17830newInstance() {
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
                    voteOptions.f714id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoteOptions voteOptions, JsonGenerator jsonGenerator) throws IOException {
            String str = voteOptions.f714id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoteOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoteOptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoteOptions new_() {
        VoteOptions voteOptions = new VoteOptions();
        voteOptions.nullCheck();
        return voteOptions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoteOptions m19830clone() {
        VoteOptions voteOptions = new VoteOptions();
        voteOptions.f714id = this.f714id;
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
        return ValueObject.util_equals(this.f714id, voteOptions.f714id) && ValueObject.util_equals(this.values, voteOptions.values) && this.haveliked == voteOptions.haveliked && this.counter == voteOptions.counter;
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
        String str = this.f714id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.values;
        int iHashCode2 = ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.haveliked ? 1231 : 1237)) * 41) + this.counter;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f714id == null) {
            this.f714id = "";
        }
        if (this.values == null) {
            this.values = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
