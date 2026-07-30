package com.p051p1.mobile.putong.data;

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
public class FollowshipCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "followshipcounter";

    @ProtobufIndex(index = 2)
    public int followers;

    @ProtobufIndex(index = 1)
    public int followings;
    public static ProtobufAdapter<FollowshipCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<FollowshipCounter>() { // from class: com.p1.mobile.putong.data.FollowshipCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FollowshipCounter followshipCounter) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, followshipCounter.followings) + CodedOutputByteBufferNano.m17281h(2, followshipCounter.followers);
            followshipCounter.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FollowshipCounter parse(nc5 nc5Var) throws IOException {
            FollowshipCounter followshipCounter = new FollowshipCounter();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    followshipCounter.followings = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return followshipCounter;
                    }
                    followshipCounter.followers = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FollowshipCounter followshipCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, followshipCounter.followings);
            codedOutputByteBufferNano.m17305G(2, followshipCounter.followers);
        }
    };
    public static JsonAdapter<FollowshipCounter> JSON_ADAPTER = new ObjectJsonAdapter<FollowshipCounter>() { // from class: com.p1.mobile.putong.data.FollowshipCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FollowshipCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FollowshipCounter newInstance() {
            return new FollowshipCounter();
        }

        public boolean parseField(FollowshipCounter followshipCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("followings")) {
                followshipCounter.followings = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("followers")) {
                return false;
            }
            followshipCounter.followers = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(FollowshipCounter followshipCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("followings") || str.equals("followers")) {
                return true;
            }
            return super.parseFieldCheck(followshipCounter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FollowshipCounter followshipCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("followings", followshipCounter.followings);
            jsonGenerator.writeNumberField("followers", followshipCounter.followers);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FollowshipCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FollowshipCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FollowshipCounter new_() {
        FollowshipCounter followshipCounter = new FollowshipCounter();
        followshipCounter.nullCheck();
        return followshipCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FollowshipCounter mo225055clone() {
        FollowshipCounter followshipCounter = new FollowshipCounter();
        followshipCounter.followings = this.followings;
        followshipCounter.followers = this.followers;
        return followshipCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FollowshipCounter)) {
            return false;
        }
        FollowshipCounter followshipCounter = (FollowshipCounter) obj;
        return this.followings == followshipCounter.followings && this.followers == followshipCounter.followers;
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
        int i2 = (((i * 41) + this.followings) * 41) + this.followers;
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
