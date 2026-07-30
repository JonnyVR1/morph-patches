package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class Position extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "position";

    @ProtobufIndex(index = 1)
    public int offset;
    public static ProtobufAdapter<Position> PROTOBUF_ADAPTER = new MessageNanoAdapter<Position>() { // from class: com.p1.mobile.putong.data.Position.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Position position) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, position.offset);
            position.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Position parse(nb5 nb5Var) throws IOException {
            Position position = new Position();
            while (nb5Var.m158752u() == 8) {
                position.offset = nb5Var.m158741j();
            }
            return position;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Position position, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, position.offset);
        }
    };
    public static JsonAdapter<Position> JSON_ADAPTER = new ObjectJsonAdapter<Position>() { // from class: com.p1.mobile.putong.data.Position.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Position.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Position newInstance() {
            return new Position();
        }

        public boolean parseField(Position position, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET)) {
                return false;
            }
            position.offset = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Position position, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET)) {
                return true;
            }
            return super.parseFieldCheck(position, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Position position, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, position.offset);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Position) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Position) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Position new_() {
        Position position = new Position();
        position.nullCheck();
        return position;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Position mo223809clone() {
        Position position = new Position();
        position.offset = this.offset;
        return position;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Position) && this.offset == ((Position) obj).offset;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "position";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.offset;
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
