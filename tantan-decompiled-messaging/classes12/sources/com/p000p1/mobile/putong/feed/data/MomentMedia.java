package com.p000p1.mobile.putong.feed.data;

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
public class MomentMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentmedia";

    @ProtobufIndex(index = 1)
    public boolean audio;
    public static ProtobufAdapter<MomentMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentMedia>() { // from class: com.p1.mobile.putong.feed.data.MomentMedia.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentMedia momentMedia) {
            int iB = CodedOutputByteBufferNano.b(1, momentMedia.audio);
            ((MessageNano) momentMedia).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentMedia m19629parse(nb5 nb5Var) throws IOException {
            MomentMedia momentMedia = new MomentMedia();
            while (nb5Var.u() == 8) {
                momentMedia.audio = nb5Var.g();
            }
            return momentMedia;
        }

        public void serialize(MomentMedia momentMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, momentMedia.audio);
        }
    };
    public static JsonAdapter<MomentMedia> JSON_ADAPTER = new ObjectJsonAdapter<MomentMedia>() { // from class: com.p1.mobile.putong.feed.data.MomentMedia.2
        public Class getDataClass() {
            return MomentMedia.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentMedia mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentMedia momentMedia, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("audio", momentMedia.audio);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentMedia new_() {
        MomentMedia momentMedia = new MomentMedia();
        momentMedia.nullCheck();
        return momentMedia;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentMedia m19628clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.audio ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
