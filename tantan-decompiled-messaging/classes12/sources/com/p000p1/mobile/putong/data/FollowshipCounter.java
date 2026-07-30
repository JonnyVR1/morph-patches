package com.p000p1.mobile.putong.data;

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
public class FollowshipCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "followshipcounter";

    @ProtobufIndex(index = 2)
    public int followers;

    @ProtobufIndex(index = 1)
    public int followings;
    public static ProtobufAdapter<FollowshipCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<FollowshipCounter>() { // from class: com.p1.mobile.putong.data.FollowshipCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FollowshipCounter followshipCounter) {
            int iH = CodedOutputByteBufferNano.h(1, followshipCounter.followings) + CodedOutputByteBufferNano.h(2, followshipCounter.followers);
            ((MessageNano) followshipCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FollowshipCounter m18106parse(nb5 nb5Var) throws IOException {
            FollowshipCounter followshipCounter = new FollowshipCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    followshipCounter.followings = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return followshipCounter;
                    }
                    followshipCounter.followers = nb5Var.j();
                }
            }
        }

        public void serialize(FollowshipCounter followshipCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, followshipCounter.followings);
            codedOutputByteBufferNano.G(2, followshipCounter.followers);
        }
    };
    public static JsonAdapter<FollowshipCounter> JSON_ADAPTER = new ObjectJsonAdapter<FollowshipCounter>() { // from class: com.p1.mobile.putong.data.FollowshipCounter.2
        public Class getDataClass() {
            return FollowshipCounter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FollowshipCounter mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FollowshipCounter followshipCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("followings", followshipCounter.followings);
            jsonGenerator.writeNumberField("followers", followshipCounter.followers);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FollowshipCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FollowshipCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FollowshipCounter new_() {
        FollowshipCounter followshipCounter = new FollowshipCounter();
        followshipCounter.nullCheck();
        return followshipCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FollowshipCounter m18105clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.followings) * 41) + this.followers;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
