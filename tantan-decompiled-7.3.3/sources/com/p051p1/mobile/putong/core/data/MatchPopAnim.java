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
public class MatchPopAnim extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchpopanim";

    @ProtobufIndex(index = 6)
    public int avatarAlpha;

    @ProtobufIndex(index = 4)
    public int avatarDelay;

    @ProtobufIndex(index = 9)
    public int avatarRepeatTransX;

    @ProtobufIndex(index = 8)
    public int avatarTransX;

    @ProtobufIndex(index = 5)
    public int avatarX;

    @ProtobufIndex(index = 7)
    public int delaySpeed;

    @ProtobufIndex(index = 1)
    public int popEnter;

    @ProtobufIndex(index = 2)
    public int popOut;

    @ProtobufIndex(index = 3)
    public int speed;
    public static ProtobufAdapter<MatchPopAnim> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchPopAnim>() { // from class: com.p1.mobile.putong.core.data.MatchPopAnim.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatchPopAnim matchPopAnim) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, matchPopAnim.popEnter) + CodedOutputByteBufferNano.m17281h(2, matchPopAnim.popOut) + CodedOutputByteBufferNano.m17281h(3, matchPopAnim.speed) + CodedOutputByteBufferNano.m17281h(4, matchPopAnim.avatarDelay) + CodedOutputByteBufferNano.m17281h(5, matchPopAnim.avatarX) + CodedOutputByteBufferNano.m17281h(6, matchPopAnim.avatarAlpha) + CodedOutputByteBufferNano.m17281h(7, matchPopAnim.delaySpeed) + CodedOutputByteBufferNano.m17281h(8, matchPopAnim.avatarTransX) + CodedOutputByteBufferNano.m17281h(9, matchPopAnim.avatarRepeatTransX);
            matchPopAnim.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatchPopAnim parse(nc5 nc5Var) throws IOException {
            MatchPopAnim matchPopAnim = new MatchPopAnim();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    matchPopAnim.popEnter = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    matchPopAnim.popOut = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    matchPopAnim.speed = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    matchPopAnim.avatarDelay = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    matchPopAnim.avatarX = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    matchPopAnim.avatarAlpha = nc5Var.m162486j();
                } else if (iM162497u == 56) {
                    matchPopAnim.delaySpeed = nc5Var.m162486j();
                } else if (iM162497u == 64) {
                    matchPopAnim.avatarTransX = nc5Var.m162486j();
                } else {
                    if (iM162497u != 72) {
                        return matchPopAnim;
                    }
                    matchPopAnim.avatarRepeatTransX = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatchPopAnim matchPopAnim, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, matchPopAnim.popEnter);
            codedOutputByteBufferNano.m17305G(2, matchPopAnim.popOut);
            codedOutputByteBufferNano.m17305G(3, matchPopAnim.speed);
            codedOutputByteBufferNano.m17305G(4, matchPopAnim.avatarDelay);
            codedOutputByteBufferNano.m17305G(5, matchPopAnim.avatarX);
            codedOutputByteBufferNano.m17305G(6, matchPopAnim.avatarAlpha);
            codedOutputByteBufferNano.m17305G(7, matchPopAnim.delaySpeed);
            codedOutputByteBufferNano.m17305G(8, matchPopAnim.avatarTransX);
            codedOutputByteBufferNano.m17305G(9, matchPopAnim.avatarRepeatTransX);
        }
    };
    public static JsonAdapter<MatchPopAnim> JSON_ADAPTER = new ObjectJsonAdapter<MatchPopAnim>() { // from class: com.p1.mobile.putong.core.data.MatchPopAnim.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatchPopAnim.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatchPopAnim newInstance() {
            return new MatchPopAnim();
        }

        public boolean parseField(MatchPopAnim matchPopAnim, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "delaySpeed":
                    matchPopAnim.delaySpeed = jsonParser.getValueAsInt();
                    return true;
                case "popOut":
                    matchPopAnim.popOut = jsonParser.getValueAsInt();
                    return true;
                case "avatarTransX":
                    matchPopAnim.avatarTransX = jsonParser.getValueAsInt();
                    return true;
                case "avatarX":
                    matchPopAnim.avatarX = jsonParser.getValueAsInt();
                    return true;
                case "speed":
                    matchPopAnim.speed = jsonParser.getValueAsInt();
                    return true;
                case "avatarAlpha":
                    matchPopAnim.avatarAlpha = jsonParser.getValueAsInt();
                    return true;
                case "avatarDelay":
                    matchPopAnim.avatarDelay = jsonParser.getValueAsInt();
                    return true;
                case "avatarRepeatTransX":
                    matchPopAnim.avatarRepeatTransX = jsonParser.getValueAsInt();
                    return true;
                case "popEnter":
                    matchPopAnim.popEnter = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MatchPopAnim matchPopAnim, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "delaySpeed":
                case "popOut":
                case "avatarTransX":
                case "avatarX":
                case "speed":
                case "avatarAlpha":
                case "avatarDelay":
                case "avatarRepeatTransX":
                case "popEnter":
                    return true;
                default:
                    return super.parseFieldCheck(matchPopAnim, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatchPopAnim matchPopAnim, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("popEnter", matchPopAnim.popEnter);
            jsonGenerator.writeNumberField("popOut", matchPopAnim.popOut);
            jsonGenerator.writeNumberField("speed", matchPopAnim.speed);
            jsonGenerator.writeNumberField("avatarDelay", matchPopAnim.avatarDelay);
            jsonGenerator.writeNumberField("avatarX", matchPopAnim.avatarX);
            jsonGenerator.writeNumberField("avatarAlpha", matchPopAnim.avatarAlpha);
            jsonGenerator.writeNumberField("delaySpeed", matchPopAnim.delaySpeed);
            jsonGenerator.writeNumberField("avatarTransX", matchPopAnim.avatarTransX);
            jsonGenerator.writeNumberField("avatarRepeatTransX", matchPopAnim.avatarRepeatTransX);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchPopAnim) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchPopAnim) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchPopAnim new_() {
        MatchPopAnim matchPopAnim = new MatchPopAnim();
        matchPopAnim.nullCheck();
        return matchPopAnim;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatchPopAnim mo225055clone() {
        MatchPopAnim matchPopAnim = new MatchPopAnim();
        matchPopAnim.popEnter = this.popEnter;
        matchPopAnim.popOut = this.popOut;
        matchPopAnim.speed = this.speed;
        matchPopAnim.avatarDelay = this.avatarDelay;
        matchPopAnim.avatarX = this.avatarX;
        matchPopAnim.avatarAlpha = this.avatarAlpha;
        matchPopAnim.delaySpeed = this.delaySpeed;
        matchPopAnim.avatarTransX = this.avatarTransX;
        matchPopAnim.avatarRepeatTransX = this.avatarRepeatTransX;
        return matchPopAnim;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchPopAnim)) {
            return false;
        }
        MatchPopAnim matchPopAnim = (MatchPopAnim) obj;
        return this.popEnter == matchPopAnim.popEnter && this.popOut == matchPopAnim.popOut && this.speed == matchPopAnim.speed && this.avatarDelay == matchPopAnim.avatarDelay && this.avatarX == matchPopAnim.avatarX && this.avatarAlpha == matchPopAnim.avatarAlpha && this.delaySpeed == matchPopAnim.delaySpeed && this.avatarTransX == matchPopAnim.avatarTransX && this.avatarRepeatTransX == matchPopAnim.avatarRepeatTransX;
    }

    public int getAvatarAlpha() {
        return this.avatarAlpha * this.speed;
    }

    public int getAvatarDelay() {
        return this.avatarDelay * this.speed;
    }

    public int getAvatarX() {
        return this.avatarX * this.speed;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int getPopEnterDuring() {
        return this.popEnter * this.speed;
    }

    public int getPopOutDuring() {
        return this.popOut * this.speed;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((((((i * 41) + this.popEnter) * 41) + this.popOut) * 41) + this.speed) * 41) + this.avatarDelay) * 41) + this.avatarX) * 41) + this.avatarAlpha) * 41) + this.delaySpeed) * 41) + this.avatarTransX) * 41) + this.avatarRepeatTransX;
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
