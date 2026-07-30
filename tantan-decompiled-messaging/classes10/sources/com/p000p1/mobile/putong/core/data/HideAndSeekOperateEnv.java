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
public class HideAndSeekOperateEnv extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekoperateenv";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public HideAndSeekGameInfo data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<HideAndSeekOperateEnv> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekOperateEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekOperateEnv.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideAndSeekOperateEnv hideAndSeekOperateEnv) {
            Meta meta = hideAndSeekOperateEnv.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            HideAndSeekGameInfo hideAndSeekGameInfo = hideAndSeekOperateEnv.data;
            if (hideAndSeekGameInfo != null) {
                iL += CodedOutputByteBufferNano.l(2, hideAndSeekGameInfo, HideAndSeekGameInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) hideAndSeekOperateEnv).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideAndSeekOperateEnv m13283parse(nb5 nb5Var) throws IOException {
            HideAndSeekOperateEnv hideAndSeekOperateEnv = new HideAndSeekOperateEnv();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hideAndSeekOperateEnv.meta != null) {
                        break;
                    }
                    hideAndSeekOperateEnv.meta = Meta.new_();
                    break;
                }
                if (iU == 10) {
                    hideAndSeekOperateEnv.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (hideAndSeekOperateEnv.meta != null) {
                            break;
                        }
                        hideAndSeekOperateEnv.meta = Meta.new_();
                        return hideAndSeekOperateEnv;
                    }
                    hideAndSeekOperateEnv.data = (HideAndSeekGameInfo) nb5Var.l(HideAndSeekGameInfo.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekOperateEnv;
        }

        public void serialize(HideAndSeekOperateEnv hideAndSeekOperateEnv, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = hideAndSeekOperateEnv.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            HideAndSeekGameInfo hideAndSeekGameInfo = hideAndSeekOperateEnv.data;
            if (hideAndSeekGameInfo != null) {
                codedOutputByteBufferNano.K(2, hideAndSeekGameInfo, HideAndSeekGameInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekOperateEnv> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekOperateEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekOperateEnv.2
        public Class getDataClass() {
            return HideAndSeekOperateEnv.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideAndSeekOperateEnv m13284newInstance() {
            return new HideAndSeekOperateEnv();
        }

        public boolean parseField(HideAndSeekOperateEnv hideAndSeekOperateEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                hideAndSeekOperateEnv.data = (HideAndSeekGameInfo) HideAndSeekGameInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            hideAndSeekOperateEnv.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekOperateEnv hideAndSeekOperateEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekOperateEnv, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HideAndSeekOperateEnv hideAndSeekOperateEnv, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekOperateEnv.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(hideAndSeekOperateEnv.meta, jsonGenerator, true);
            }
            if (hideAndSeekOperateEnv.data != null) {
                jsonGenerator.writeFieldName("data");
                HideAndSeekGameInfo.JSON_ADAPTER.serialize(hideAndSeekOperateEnv.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekOperateEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekOperateEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekOperateEnv new_() {
        HideAndSeekOperateEnv hideAndSeekOperateEnv = new HideAndSeekOperateEnv();
        hideAndSeekOperateEnv.nullCheck();
        return hideAndSeekOperateEnv;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideAndSeekOperateEnv m13282clone() {
        HideAndSeekOperateEnv hideAndSeekOperateEnv = new HideAndSeekOperateEnv();
        Meta meta = this.meta;
        if (meta != null) {
            hideAndSeekOperateEnv.meta = meta.clone();
        }
        HideAndSeekGameInfo hideAndSeekGameInfo = this.data;
        if (hideAndSeekGameInfo != null) {
            hideAndSeekOperateEnv.data = hideAndSeekGameInfo.m13262clone();
        }
        return hideAndSeekOperateEnv;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekOperateEnv)) {
            return false;
        }
        HideAndSeekOperateEnv hideAndSeekOperateEnv = (HideAndSeekOperateEnv) obj;
        return ValueObject.util_equals(this.meta, hideAndSeekOperateEnv.meta) && ValueObject.util_equals(this.data, hideAndSeekOperateEnv.data);
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
        HideAndSeekGameInfo hideAndSeekGameInfo = this.data;
        int iHashCode2 = iHashCode + (hideAndSeekGameInfo != null ? hideAndSeekGameInfo.hashCode() : 0);
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
