package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class NewMatchBackSp extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newmatchbacksp";

    @ProtobufIndex(index = 3)
    public long lastUpdateTime;

    @ProtobufIndex(index = 1)
    public int num;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;
    public static ProtobufAdapter<NewMatchBackSp> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewMatchBackSp>() { // from class: com.p1.mobile.putong.core.data.NewMatchBackSp.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewMatchBackSp newMatchBackSp) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, newMatchBackSp.num);
            String str = newMatchBackSp.userId;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17283j = iM17281h + CodedOutputByteBufferNano.m17283j(3, newMatchBackSp.lastUpdateTime);
            newMatchBackSp.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewMatchBackSp parse(nc5 nc5Var) throws IOException {
            NewMatchBackSp newMatchBackSp = new NewMatchBackSp();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newMatchBackSp.userId != null) {
                        break;
                    }
                    newMatchBackSp.userId = "";
                    break;
                }
                if (iM162497u == 8) {
                    newMatchBackSp.num = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    newMatchBackSp.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 24) {
                        if (newMatchBackSp.userId != null) {
                            break;
                        }
                        newMatchBackSp.userId = "";
                        return newMatchBackSp;
                    }
                    newMatchBackSp.lastUpdateTime = nc5Var.m162487k();
                }
            }
            return newMatchBackSp;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewMatchBackSp newMatchBackSp, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, newMatchBackSp.num);
            String str = newMatchBackSp.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17307I(3, newMatchBackSp.lastUpdateTime);
        }
    };
    public static JsonAdapter<NewMatchBackSp> JSON_ADAPTER = new ObjectJsonAdapter<NewMatchBackSp>() { // from class: com.p1.mobile.putong.core.data.NewMatchBackSp.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewMatchBackSp.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewMatchBackSp newInstance() {
            return new NewMatchBackSp();
        }

        public boolean parseField(NewMatchBackSp newMatchBackSp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    newMatchBackSp.userId = jsonParser.getValueAsString();
                    return true;
                case "lastUpdateTime":
                    newMatchBackSp.lastUpdateTime = jsonParser.getValueAsLong();
                    return true;
                case "num":
                    newMatchBackSp.num = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewMatchBackSp newMatchBackSp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "lastUpdateTime":
                case "num":
                    return true;
                default:
                    return super.parseFieldCheck(newMatchBackSp, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewMatchBackSp newMatchBackSp, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("num", newMatchBackSp.num);
            String str = newMatchBackSp.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("lastUpdateTime", newMatchBackSp.lastUpdateTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewMatchBackSp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewMatchBackSp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewMatchBackSp new_() {
        NewMatchBackSp newMatchBackSp = new NewMatchBackSp();
        newMatchBackSp.nullCheck();
        return newMatchBackSp;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewMatchBackSp mo225055clone() {
        NewMatchBackSp newMatchBackSp = new NewMatchBackSp();
        newMatchBackSp.num = this.num;
        newMatchBackSp.userId = this.userId;
        newMatchBackSp.lastUpdateTime = this.lastUpdateTime;
        return newMatchBackSp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewMatchBackSp)) {
            return false;
        }
        NewMatchBackSp newMatchBackSp = (NewMatchBackSp) obj;
        return this.num == newMatchBackSp.num && ValueObject.util_equals(this.userId, newMatchBackSp.userId) && this.lastUpdateTime == newMatchBackSp.lastUpdateTime;
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
        int i2 = ((i * 41) + this.num) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.lastUpdateTime;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
