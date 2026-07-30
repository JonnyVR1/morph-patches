package com.p051p1.mobile.putong.core.data;

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
public class BlackList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blacklist";

    @ProtobufIndex(index = 1)
    public boolean muted;

    @ProtobufIndex(index = 2)
    public boolean mutedBy;
    public static ProtobufAdapter<BlackList> PROTOBUF_ADAPTER = new MessageNanoAdapter<BlackList>() { // from class: com.p1.mobile.putong.core.data.BlackList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BlackList blackList) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, blackList.muted) + CodedOutputByteBufferNano.m17275b(2, blackList.mutedBy);
            blackList.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BlackList parse(nc5 nc5Var) throws IOException {
            BlackList blackList = new BlackList();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    blackList.muted = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return blackList;
                    }
                    blackList.mutedBy = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BlackList blackList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, blackList.muted);
            codedOutputByteBufferNano.m17299A(2, blackList.mutedBy);
        }
    };
    public static JsonAdapter<BlackList> JSON_ADAPTER = new ObjectJsonAdapter<BlackList>() { // from class: com.p1.mobile.putong.core.data.BlackList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BlackList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BlackList newInstance() {
            return new BlackList();
        }

        public boolean parseField(BlackList blackList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("muted")) {
                blackList.muted = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("mutedBy")) {
                return false;
            }
            blackList.mutedBy = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(BlackList blackList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("muted") || str.equals("mutedBy")) {
                return true;
            }
            return super.parseFieldCheck(blackList, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BlackList blackList, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("muted", blackList.muted);
            jsonGenerator.writeBooleanField("mutedBy", blackList.mutedBy);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlackList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlackList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BlackList new_() {
        BlackList blackList = new BlackList();
        blackList.nullCheck();
        return blackList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BlackList mo225055clone() {
        BlackList blackList = new BlackList();
        blackList.muted = this.muted;
        blackList.mutedBy = this.mutedBy;
        return blackList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlackList)) {
            return false;
        }
        BlackList blackList = (BlackList) obj;
        return this.muted == blackList.muted && this.mutedBy == blackList.mutedBy;
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
        int i2 = (((i * 41) + (this.muted ? 1231 : 1237)) * 41) + (this.mutedBy ? 1231 : 1237);
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
