package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class HideAndSeekHoldEnv extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekholdenv";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public HideAndSeekGameRole data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<HideAndSeekHoldEnv> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekHoldEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekHoldEnv.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideAndSeekHoldEnv hideAndSeekHoldEnv) {
            Meta meta = hideAndSeekHoldEnv.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            HideAndSeekGameRole hideAndSeekGameRole = hideAndSeekHoldEnv.data;
            if (hideAndSeekGameRole != null) {
                iL += CodedOutputByteBufferNano.l(2, hideAndSeekGameRole, HideAndSeekGameRole.PROTOBUF_ADAPTER);
            }
            ((MessageNano) hideAndSeekHoldEnv).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideAndSeekHoldEnv m13271parse(nb5 nb5Var) throws IOException {
            HideAndSeekHoldEnv hideAndSeekHoldEnv = new HideAndSeekHoldEnv();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hideAndSeekHoldEnv.meta != null) {
                        break;
                    }
                    hideAndSeekHoldEnv.meta = Meta.new_();
                    break;
                }
                if (iU == 10) {
                    hideAndSeekHoldEnv.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (hideAndSeekHoldEnv.meta != null) {
                            break;
                        }
                        hideAndSeekHoldEnv.meta = Meta.new_();
                        return hideAndSeekHoldEnv;
                    }
                    hideAndSeekHoldEnv.data = (HideAndSeekGameRole) nb5Var.l(HideAndSeekGameRole.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekHoldEnv;
        }

        public void serialize(HideAndSeekHoldEnv hideAndSeekHoldEnv, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = hideAndSeekHoldEnv.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            HideAndSeekGameRole hideAndSeekGameRole = hideAndSeekHoldEnv.data;
            if (hideAndSeekGameRole != null) {
                codedOutputByteBufferNano.K(2, hideAndSeekGameRole, HideAndSeekGameRole.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekHoldEnv> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekHoldEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekHoldEnv.2
        public Class getDataClass() {
            return HideAndSeekHoldEnv.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideAndSeekHoldEnv m13272newInstance() {
            return new HideAndSeekHoldEnv();
        }

        public boolean parseField(HideAndSeekHoldEnv hideAndSeekHoldEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                hideAndSeekHoldEnv.data = (HideAndSeekGameRole) HideAndSeekGameRole.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            hideAndSeekHoldEnv.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekHoldEnv hideAndSeekHoldEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekHoldEnv, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HideAndSeekHoldEnv hideAndSeekHoldEnv, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekHoldEnv.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(hideAndSeekHoldEnv.meta, jsonGenerator, true);
            }
            if (hideAndSeekHoldEnv.data != null) {
                jsonGenerator.writeFieldName("data");
                HideAndSeekGameRole.JSON_ADAPTER.serialize(hideAndSeekHoldEnv.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekHoldEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekHoldEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekHoldEnv new_() {
        HideAndSeekHoldEnv hideAndSeekHoldEnv = new HideAndSeekHoldEnv();
        hideAndSeekHoldEnv.nullCheck();
        return hideAndSeekHoldEnv;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideAndSeekHoldEnv m13270clone() {
        HideAndSeekHoldEnv hideAndSeekHoldEnv = new HideAndSeekHoldEnv();
        Meta meta = this.meta;
        if (meta != null) {
            hideAndSeekHoldEnv.meta = meta.clone();
        }
        HideAndSeekGameRole hideAndSeekGameRole = this.data;
        if (hideAndSeekGameRole != null) {
            hideAndSeekHoldEnv.data = hideAndSeekGameRole.m13266clone();
        }
        return hideAndSeekHoldEnv;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekHoldEnv)) {
            return false;
        }
        HideAndSeekHoldEnv hideAndSeekHoldEnv = (HideAndSeekHoldEnv) obj;
        return ValueObject.util_equals(this.meta, hideAndSeekHoldEnv.meta) && ValueObject.util_equals(this.data, hideAndSeekHoldEnv.data);
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
        HideAndSeekGameRole hideAndSeekGameRole = this.data;
        int iHashCode2 = iHashCode + (hideAndSeekGameRole != null ? hideAndSeekGameRole.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
