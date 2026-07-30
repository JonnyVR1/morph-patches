package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
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

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int avatarX;

    @ProtobufIndex(index = 7)
    public int delaySpeed;

    @ProtobufIndex(index = 1)
    public int popEnter;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int popOut;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int speed;
    public static ProtobufAdapter<MatchPopAnim> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchPopAnim>() { // from class: com.p1.mobile.putong.core.data.MatchPopAnim.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MatchPopAnim matchPopAnim) {
            int iH = CodedOutputByteBufferNano.h(1, matchPopAnim.popEnter) + CodedOutputByteBufferNano.h(2, matchPopAnim.popOut) + CodedOutputByteBufferNano.h(3, matchPopAnim.speed) + CodedOutputByteBufferNano.h(4, matchPopAnim.avatarDelay) + CodedOutputByteBufferNano.h(5, matchPopAnim.avatarX) + CodedOutputByteBufferNano.h(6, matchPopAnim.avatarAlpha) + CodedOutputByteBufferNano.h(7, matchPopAnim.delaySpeed) + CodedOutputByteBufferNano.h(8, matchPopAnim.avatarTransX) + CodedOutputByteBufferNano.h(9, matchPopAnim.avatarRepeatTransX);
            ((MessageNano) matchPopAnim).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MatchPopAnim m14069parse(nb5 nb5Var) throws IOException {
            MatchPopAnim matchPopAnim = new MatchPopAnim();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    matchPopAnim.popEnter = nb5Var.j();
                } else if (iU == 16) {
                    matchPopAnim.popOut = nb5Var.j();
                } else if (iU == 24) {
                    matchPopAnim.speed = nb5Var.j();
                } else if (iU == 32) {
                    matchPopAnim.avatarDelay = nb5Var.j();
                } else if (iU == 40) {
                    matchPopAnim.avatarX = nb5Var.j();
                } else if (iU == 48) {
                    matchPopAnim.avatarAlpha = nb5Var.j();
                } else if (iU == 56) {
                    matchPopAnim.delaySpeed = nb5Var.j();
                } else if (iU == 64) {
                    matchPopAnim.avatarTransX = nb5Var.j();
                } else {
                    if (iU != 72) {
                        return matchPopAnim;
                    }
                    matchPopAnim.avatarRepeatTransX = nb5Var.j();
                }
            }
        }

        public void serialize(MatchPopAnim matchPopAnim, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, matchPopAnim.popEnter);
            codedOutputByteBufferNano.G(2, matchPopAnim.popOut);
            codedOutputByteBufferNano.G(3, matchPopAnim.speed);
            codedOutputByteBufferNano.G(4, matchPopAnim.avatarDelay);
            codedOutputByteBufferNano.G(5, matchPopAnim.avatarX);
            codedOutputByteBufferNano.G(6, matchPopAnim.avatarAlpha);
            codedOutputByteBufferNano.G(7, matchPopAnim.delaySpeed);
            codedOutputByteBufferNano.G(8, matchPopAnim.avatarTransX);
            codedOutputByteBufferNano.G(9, matchPopAnim.avatarRepeatTransX);
        }
    };
    public static JsonAdapter<MatchPopAnim> JSON_ADAPTER = new ObjectJsonAdapter<MatchPopAnim>() { // from class: com.p1.mobile.putong.core.data.MatchPopAnim.2
        public Class getDataClass() {
            return MatchPopAnim.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MatchPopAnim m14070newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchPopAnim) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchPopAnim) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchPopAnim new_() {
        MatchPopAnim matchPopAnim = new MatchPopAnim();
        matchPopAnim.nullCheck();
        return matchPopAnim;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MatchPopAnim m14068clone() {
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
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((((((i * 41) + this.popEnter) * 41) + this.popOut) * 41) + this.speed) * 41) + this.avatarDelay) * 41) + this.avatarX) * 41) + this.avatarAlpha) * 41) + this.delaySpeed) * 41) + this.avatarTransX) * 41) + this.avatarRepeatTransX;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
