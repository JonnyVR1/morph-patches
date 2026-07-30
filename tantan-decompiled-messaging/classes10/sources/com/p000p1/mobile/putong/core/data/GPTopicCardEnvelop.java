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
public class GPTopicCardEnvelop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gptopiccardenvelop";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public GPTopicCardData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<GPTopicCardEnvelop> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPTopicCardEnvelop>() { // from class: com.p1.mobile.putong.core.data.GPTopicCardEnvelop.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPTopicCardEnvelop gPTopicCardEnvelop) {
            Meta meta = gPTopicCardEnvelop.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GPTopicCardData gPTopicCardData = gPTopicCardEnvelop.data;
            if (gPTopicCardData != null) {
                iL += CodedOutputByteBufferNano.l(2, gPTopicCardData, GPTopicCardData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) gPTopicCardEnvelop).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPTopicCardEnvelop m12903parse(nb5 nb5Var) throws IOException {
            GPTopicCardEnvelop gPTopicCardEnvelop = new GPTopicCardEnvelop();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPTopicCardEnvelop.meta == null) {
                        gPTopicCardEnvelop.meta = Meta.new_();
                    }
                    if (gPTopicCardEnvelop.data != null) {
                        break;
                    }
                    gPTopicCardEnvelop.data = GPTopicCardData.new_();
                    break;
                }
                if (iU == 10) {
                    gPTopicCardEnvelop.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (gPTopicCardEnvelop.meta == null) {
                            gPTopicCardEnvelop.meta = Meta.new_();
                        }
                        if (gPTopicCardEnvelop.data != null) {
                            break;
                        }
                        gPTopicCardEnvelop.data = GPTopicCardData.new_();
                        return gPTopicCardEnvelop;
                    }
                    gPTopicCardEnvelop.data = (GPTopicCardData) nb5Var.l(GPTopicCardData.PROTOBUF_ADAPTER);
                }
            }
            return gPTopicCardEnvelop;
        }

        public void serialize(GPTopicCardEnvelop gPTopicCardEnvelop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPTopicCardEnvelop.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GPTopicCardData gPTopicCardData = gPTopicCardEnvelop.data;
            if (gPTopicCardData != null) {
                codedOutputByteBufferNano.K(2, gPTopicCardData, GPTopicCardData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPTopicCardEnvelop> JSON_ADAPTER = new ObjectJsonAdapter<GPTopicCardEnvelop>() { // from class: com.p1.mobile.putong.core.data.GPTopicCardEnvelop.2
        public Class getDataClass() {
            return GPTopicCardEnvelop.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GPTopicCardEnvelop m12904newInstance() {
            return new GPTopicCardEnvelop();
        }

        public boolean parseField(GPTopicCardEnvelop gPTopicCardEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                gPTopicCardEnvelop.data = (GPTopicCardData) GPTopicCardData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            gPTopicCardEnvelop.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPTopicCardEnvelop gPTopicCardEnvelop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(gPTopicCardEnvelop, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GPTopicCardEnvelop gPTopicCardEnvelop, JsonGenerator jsonGenerator) throws IOException {
            if (gPTopicCardEnvelop.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(gPTopicCardEnvelop.meta, jsonGenerator, true);
            }
            if (gPTopicCardEnvelop.data != null) {
                jsonGenerator.writeFieldName("data");
                GPTopicCardData.JSON_ADAPTER.serialize(gPTopicCardEnvelop.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPTopicCardEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPTopicCardEnvelop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPTopicCardEnvelop new_() {
        GPTopicCardEnvelop gPTopicCardEnvelop = new GPTopicCardEnvelop();
        gPTopicCardEnvelop.nullCheck();
        return gPTopicCardEnvelop;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPTopicCardEnvelop m12902clone() {
        GPTopicCardEnvelop gPTopicCardEnvelop = new GPTopicCardEnvelop();
        Meta meta = this.meta;
        if (meta != null) {
            gPTopicCardEnvelop.meta = meta.clone();
        }
        GPTopicCardData gPTopicCardData = this.data;
        if (gPTopicCardData != null) {
            gPTopicCardEnvelop.data = gPTopicCardData.m12898clone();
        }
        return gPTopicCardEnvelop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPTopicCardEnvelop)) {
            return false;
        }
        GPTopicCardEnvelop gPTopicCardEnvelop = (GPTopicCardEnvelop) obj;
        return ValueObject.util_equals(this.meta, gPTopicCardEnvelop.meta) && ValueObject.util_equals(this.data, gPTopicCardEnvelop.data);
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
        GPTopicCardData gPTopicCardData = this.data;
        int iHashCode2 = iHashCode + (gPTopicCardData != null ? gPTopicCardData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GPTopicCardData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
