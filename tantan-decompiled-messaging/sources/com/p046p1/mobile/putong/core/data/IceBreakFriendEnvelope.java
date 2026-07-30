package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class IceBreakFriendEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakfriendenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public IceBreakFriendData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IceBreakFriendEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakFriendEnvelope>() { // from class: com.p1.mobile.putong.core.data.IceBreakFriendEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakFriendEnvelope iceBreakFriendEnvelope) {
            Meta meta = iceBreakFriendEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IceBreakFriendData iceBreakFriendData = iceBreakFriendEnvelope.data;
            if (iceBreakFriendData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, iceBreakFriendData, IceBreakFriendData.PROTOBUF_ADAPTER);
            }
            iceBreakFriendEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakFriendEnvelope parse(nb5 nb5Var) throws IOException {
            IceBreakFriendEnvelope iceBreakFriendEnvelope = new IceBreakFriendEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (iceBreakFriendEnvelope.meta == null) {
                        iceBreakFriendEnvelope.meta = Meta.new_();
                    }
                    if (iceBreakFriendEnvelope.data != null) {
                        break;
                    }
                    iceBreakFriendEnvelope.data = IceBreakFriendData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    iceBreakFriendEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (iceBreakFriendEnvelope.meta == null) {
                            iceBreakFriendEnvelope.meta = Meta.new_();
                        }
                        if (iceBreakFriendEnvelope.data != null) {
                            break;
                        }
                        iceBreakFriendEnvelope.data = IceBreakFriendData.new_();
                        return iceBreakFriendEnvelope;
                    }
                    iceBreakFriendEnvelope.data = (IceBreakFriendData) nb5Var.m158743l(IceBreakFriendData.PROTOBUF_ADAPTER);
                }
            }
            return iceBreakFriendEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakFriendEnvelope iceBreakFriendEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = iceBreakFriendEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IceBreakFriendData iceBreakFriendData = iceBreakFriendEnvelope.data;
            if (iceBreakFriendData != null) {
                codedOutputByteBufferNano.m17254K(2, iceBreakFriendData, IceBreakFriendData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IceBreakFriendEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakFriendEnvelope>() { // from class: com.p1.mobile.putong.core.data.IceBreakFriendEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakFriendEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakFriendEnvelope newInstance() {
            return new IceBreakFriendEnvelope();
        }

        public boolean parseField(IceBreakFriendEnvelope iceBreakFriendEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                iceBreakFriendEnvelope.data = IceBreakFriendData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            iceBreakFriendEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IceBreakFriendEnvelope iceBreakFriendEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(iceBreakFriendEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakFriendEnvelope iceBreakFriendEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (iceBreakFriendEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(iceBreakFriendEnvelope.meta, jsonGenerator, true);
            }
            if (iceBreakFriendEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IceBreakFriendData.JSON_ADAPTER.serialize(iceBreakFriendEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakFriendEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakFriendEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakFriendEnvelope new_() {
        IceBreakFriendEnvelope iceBreakFriendEnvelope = new IceBreakFriendEnvelope();
        iceBreakFriendEnvelope.nullCheck();
        return iceBreakFriendEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreakFriendEnvelope mo223809clone() {
        IceBreakFriendEnvelope iceBreakFriendEnvelope = new IceBreakFriendEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            iceBreakFriendEnvelope.meta = meta.mo223809clone();
        }
        IceBreakFriendData iceBreakFriendData = this.data;
        if (iceBreakFriendData != null) {
            iceBreakFriendEnvelope.data = iceBreakFriendData.mo223809clone();
        }
        return iceBreakFriendEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IceBreakFriendEnvelope)) {
            return false;
        }
        IceBreakFriendEnvelope iceBreakFriendEnvelope = (IceBreakFriendEnvelope) obj;
        return ValueObject.util_equals(this.meta, iceBreakFriendEnvelope.meta) && ValueObject.util_equals(this.data, iceBreakFriendEnvelope.data);
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
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        IceBreakFriendData iceBreakFriendData = this.data;
        int iHashCode2 = iHashCode + (iceBreakFriendData != null ? iceBreakFriendData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IceBreakFriendData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
