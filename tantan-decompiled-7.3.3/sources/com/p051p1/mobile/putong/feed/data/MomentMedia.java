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
public class MomentMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentmedia";

    @ProtobufIndex(index = 1)
    public boolean audio;
    public static ProtobufAdapter<MomentMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentMedia>() { // from class: com.p1.mobile.putong.feed.data.MomentMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentMedia momentMedia) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, momentMedia.audio);
            momentMedia.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentMedia parse(nc5 nc5Var) throws IOException {
            MomentMedia momentMedia = new MomentMedia();
            while (nc5Var.m162497u() == 8) {
                momentMedia.audio = nc5Var.m162483g();
            }
            return momentMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentMedia momentMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, momentMedia.audio);
        }
    };
    public static JsonAdapter<MomentMedia> JSON_ADAPTER = new ObjectJsonAdapter<MomentMedia>() { // from class: com.p1.mobile.putong.feed.data.MomentMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentMedia.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentMedia newInstance() {
            return new MomentMedia();
        }

        public boolean parseField(MomentMedia momentMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("audio")) {
                return false;
            }
            momentMedia.audio = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(MomentMedia momentMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("audio")) {
                return true;
            }
            return super.parseFieldCheck(momentMedia, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentMedia momentMedia, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("audio", momentMedia.audio);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentMedia new_() {
        MomentMedia momentMedia = new MomentMedia();
        momentMedia.nullCheck();
        return momentMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentMedia mo225055clone() {
        MomentMedia momentMedia = new MomentMedia();
        momentMedia.audio = this.audio;
        return momentMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MomentMedia) && this.audio == ((MomentMedia) obj).audio;
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
        int i2 = (i * 41) + (this.audio ? 1231 : 1237);
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
