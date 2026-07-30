package com.p051p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceCanJoinGame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoicecanjoingame";

    @ProtobufIndex(index = 1)
    public boolean can;

    @NonNull
    @ProtobufIndex(index = 2)
    public String msg;
    public static ProtobufAdapter<BLiveVoiceCanJoinGame> PROTOBUF_ADAPTER = new C12428a();
    public static JsonAdapter<BLiveVoiceCanJoinGame> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCanJoinGame>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCanJoinGame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCanJoinGame.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCanJoinGame newInstance() {
            return new BLiveVoiceCanJoinGame();
        }

        public boolean parseField(BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("can")) {
                bLiveVoiceCanJoinGame.can = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("msg")) {
                return false;
            }
            bLiveVoiceCanJoinGame.msg = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("can", bLiveVoiceCanJoinGame.can);
            String str = bLiveVoiceCanJoinGame.msg;
            if (str != null) {
                jsonGenerator.writeStringField("msg", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCanJoinGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceCanJoinGame$a */
    public class C12428a extends MessageNanoAdapter<BLiveVoiceCanJoinGame> {
        public C12428a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, bLiveVoiceCanJoinGame.can);
            String str = bLiveVoiceCanJoinGame.msg;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            bLiveVoiceCanJoinGame.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceCanJoinGame parse(nc5 nc5Var) throws IOException {
            BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame = new BLiveVoiceCanJoinGame();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveVoiceCanJoinGame.msg != null) {
                        break;
                    }
                    bLiveVoiceCanJoinGame.msg = "";
                    break;
                }
                if (iM162497u == 8) {
                    bLiveVoiceCanJoinGame.can = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (bLiveVoiceCanJoinGame.msg != null) {
                            break;
                        }
                        bLiveVoiceCanJoinGame.msg = "";
                        return bLiveVoiceCanJoinGame;
                    }
                    bLiveVoiceCanJoinGame.msg = nc5Var.m162495s();
                }
            }
            return bLiveVoiceCanJoinGame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, bLiveVoiceCanJoinGame.can);
            String str = bLiveVoiceCanJoinGame.msg;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    }

    public static BLiveVoiceCanJoinGame new_() {
        BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame = new BLiveVoiceCanJoinGame();
        bLiveVoiceCanJoinGame.nullCheck();
        return bLiveVoiceCanJoinGame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCanJoinGame mo225055clone() {
        BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame = new BLiveVoiceCanJoinGame();
        bLiveVoiceCanJoinGame.can = this.can;
        bLiveVoiceCanJoinGame.msg = this.msg;
        return bLiveVoiceCanJoinGame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCanJoinGame)) {
            return false;
        }
        BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame = (BLiveVoiceCanJoinGame) obj;
        return this.can == bLiveVoiceCanJoinGame.can && ValueObject.util_equals(this.msg, bLiveVoiceCanJoinGame.msg);
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
        int i2 = ((i * 41) + (this.can ? 1231 : 1237)) * 41;
        String str = this.msg;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.msg == null) {
            this.msg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
