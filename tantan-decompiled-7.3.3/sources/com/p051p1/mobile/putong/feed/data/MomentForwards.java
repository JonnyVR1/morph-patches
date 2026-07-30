package com.p051p1.mobile.putong.feed.data;

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
public class MomentForwards extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentforwards";

    @ProtobufIndex(index = 1)
    public int count;
    public static ProtobufAdapter<MomentForwards> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentForwards>() { // from class: com.p1.mobile.putong.feed.data.MomentForwards.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentForwards momentForwards) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, momentForwards.count);
            momentForwards.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentForwards parse(nc5 nc5Var) throws IOException {
            MomentForwards momentForwards = new MomentForwards();
            while (nc5Var.m162497u() == 8) {
                momentForwards.count = nc5Var.m162486j();
            }
            return momentForwards;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentForwards momentForwards, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, momentForwards.count);
        }
    };
    public static JsonAdapter<MomentForwards> JSON_ADAPTER = new ObjectJsonAdapter<MomentForwards>() { // from class: com.p1.mobile.putong.feed.data.MomentForwards.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentForwards.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentForwards newInstance() {
            return new MomentForwards();
        }

        public boolean parseField(MomentForwards momentForwards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("count")) {
                return false;
            }
            momentForwards.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MomentForwards momentForwards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(momentForwards, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentForwards momentForwards, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", momentForwards.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentForwards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentForwards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentForwards new_() {
        MomentForwards momentForwards = new MomentForwards();
        momentForwards.nullCheck();
        return momentForwards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentForwards mo225055clone() {
        MomentForwards momentForwards = new MomentForwards();
        momentForwards.count = this.count;
        return momentForwards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MomentForwards) && this.count == ((MomentForwards) obj).count;
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
        int i2 = (i * 41) + this.count;
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
