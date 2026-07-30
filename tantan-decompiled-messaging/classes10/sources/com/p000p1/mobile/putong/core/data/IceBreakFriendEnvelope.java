package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class IceBreakFriendEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakfriendenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IceBreakFriendData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IceBreakFriendEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakFriendEnvelope>() { // from class: com.p1.mobile.putong.core.data.IceBreakFriendEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IceBreakFriendEnvelope iceBreakFriendEnvelope) {
            Meta meta = iceBreakFriendEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IceBreakFriendData iceBreakFriendData = iceBreakFriendEnvelope.data;
            if (iceBreakFriendData != null) {
                iL += CodedOutputByteBufferNano.l(2, iceBreakFriendData, IceBreakFriendData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) iceBreakFriendEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IceBreakFriendEnvelope m13377parse(nb5 nb5Var) throws IOException {
            IceBreakFriendEnvelope iceBreakFriendEnvelope = new IceBreakFriendEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (iceBreakFriendEnvelope.meta == null) {
                        iceBreakFriendEnvelope.meta = Meta.new_();
                    }
                    if (iceBreakFriendEnvelope.data != null) {
                        break;
                    }
                    iceBreakFriendEnvelope.data = IceBreakFriendData.new_();
                    break;
                }
                if (iU == 10) {
                    iceBreakFriendEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (iceBreakFriendEnvelope.meta == null) {
                            iceBreakFriendEnvelope.meta = Meta.new_();
                        }
                        if (iceBreakFriendEnvelope.data != null) {
                            break;
                        }
                        iceBreakFriendEnvelope.data = IceBreakFriendData.new_();
                        return iceBreakFriendEnvelope;
                    }
                    iceBreakFriendEnvelope.data = (IceBreakFriendData) nb5Var.l(IceBreakFriendData.PROTOBUF_ADAPTER);
                }
            }
            return iceBreakFriendEnvelope;
        }

        public void serialize(IceBreakFriendEnvelope iceBreakFriendEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = iceBreakFriendEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IceBreakFriendData iceBreakFriendData = iceBreakFriendEnvelope.data;
            if (iceBreakFriendData != null) {
                codedOutputByteBufferNano.K(2, iceBreakFriendData, IceBreakFriendData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IceBreakFriendEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakFriendEnvelope>() { // from class: com.p1.mobile.putong.core.data.IceBreakFriendEnvelope.2
        public Class getDataClass() {
            return IceBreakFriendEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IceBreakFriendEnvelope m13378newInstance() {
            return new IceBreakFriendEnvelope();
        }

        public boolean parseField(IceBreakFriendEnvelope iceBreakFriendEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                iceBreakFriendEnvelope.data = (IceBreakFriendData) IceBreakFriendData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            iceBreakFriendEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IceBreakFriendEnvelope iceBreakFriendEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(iceBreakFriendEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakFriendEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakFriendEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakFriendEnvelope new_() {
        IceBreakFriendEnvelope iceBreakFriendEnvelope = new IceBreakFriendEnvelope();
        iceBreakFriendEnvelope.nullCheck();
        return iceBreakFriendEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IceBreakFriendEnvelope m13376clone() {
        IceBreakFriendEnvelope iceBreakFriendEnvelope = new IceBreakFriendEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            iceBreakFriendEnvelope.meta = meta.clone();
        }
        IceBreakFriendData iceBreakFriendData = this.data;
        if (iceBreakFriendData != null) {
            iceBreakFriendEnvelope.data = iceBreakFriendData.m13372clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        IceBreakFriendData iceBreakFriendData = this.data;
        int iHashCode2 = iHashCode + (iceBreakFriendData != null ? iceBreakFriendData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IceBreakFriendData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
