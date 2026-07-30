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
public class HideAndSeekInfoEnv extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekinfoenv";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public HideAndSeekInfoData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<HideAndSeekInfoEnv> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekInfoEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekInfoEnv.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideAndSeekInfoEnv hideAndSeekInfoEnv) {
            Meta meta = hideAndSeekInfoEnv.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            HideAndSeekInfoData hideAndSeekInfoData = hideAndSeekInfoEnv.data;
            if (hideAndSeekInfoData != null) {
                iL += CodedOutputByteBufferNano.l(2, hideAndSeekInfoData, HideAndSeekInfoData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) hideAndSeekInfoEnv).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideAndSeekInfoEnv m13279parse(nb5 nb5Var) throws IOException {
            HideAndSeekInfoEnv hideAndSeekInfoEnv = new HideAndSeekInfoEnv();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hideAndSeekInfoEnv.meta != null) {
                        break;
                    }
                    hideAndSeekInfoEnv.meta = Meta.new_();
                    break;
                }
                if (iU == 10) {
                    hideAndSeekInfoEnv.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (hideAndSeekInfoEnv.meta != null) {
                            break;
                        }
                        hideAndSeekInfoEnv.meta = Meta.new_();
                        return hideAndSeekInfoEnv;
                    }
                    hideAndSeekInfoEnv.data = (HideAndSeekInfoData) nb5Var.l(HideAndSeekInfoData.PROTOBUF_ADAPTER);
                }
            }
            return hideAndSeekInfoEnv;
        }

        public void serialize(HideAndSeekInfoEnv hideAndSeekInfoEnv, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = hideAndSeekInfoEnv.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            HideAndSeekInfoData hideAndSeekInfoData = hideAndSeekInfoEnv.data;
            if (hideAndSeekInfoData != null) {
                codedOutputByteBufferNano.K(2, hideAndSeekInfoData, HideAndSeekInfoData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekInfoEnv> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekInfoEnv>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekInfoEnv.2
        public Class getDataClass() {
            return HideAndSeekInfoEnv.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideAndSeekInfoEnv m13280newInstance() {
            return new HideAndSeekInfoEnv();
        }

        public boolean parseField(HideAndSeekInfoEnv hideAndSeekInfoEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                hideAndSeekInfoEnv.data = (HideAndSeekInfoData) HideAndSeekInfoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            hideAndSeekInfoEnv.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekInfoEnv hideAndSeekInfoEnv, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekInfoEnv, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HideAndSeekInfoEnv hideAndSeekInfoEnv, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekInfoEnv.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(hideAndSeekInfoEnv.meta, jsonGenerator, true);
            }
            if (hideAndSeekInfoEnv.data != null) {
                jsonGenerator.writeFieldName("data");
                HideAndSeekInfoData.JSON_ADAPTER.serialize(hideAndSeekInfoEnv.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekInfoEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekInfoEnv) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekInfoEnv new_() {
        HideAndSeekInfoEnv hideAndSeekInfoEnv = new HideAndSeekInfoEnv();
        hideAndSeekInfoEnv.nullCheck();
        return hideAndSeekInfoEnv;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideAndSeekInfoEnv m13278clone() {
        HideAndSeekInfoEnv hideAndSeekInfoEnv = new HideAndSeekInfoEnv();
        Meta meta = this.meta;
        if (meta != null) {
            hideAndSeekInfoEnv.meta = meta.clone();
        }
        HideAndSeekInfoData hideAndSeekInfoData = this.data;
        if (hideAndSeekInfoData != null) {
            hideAndSeekInfoEnv.data = hideAndSeekInfoData.m13274clone();
        }
        return hideAndSeekInfoEnv;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekInfoEnv)) {
            return false;
        }
        HideAndSeekInfoEnv hideAndSeekInfoEnv = (HideAndSeekInfoEnv) obj;
        return ValueObject.util_equals(this.meta, hideAndSeekInfoEnv.meta) && ValueObject.util_equals(this.data, hideAndSeekInfoEnv.data);
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
        HideAndSeekInfoData hideAndSeekInfoData = this.data;
        int iHashCode2 = iHashCode + (hideAndSeekInfoData != null ? hideAndSeekInfoData.hashCode() : 0);
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
