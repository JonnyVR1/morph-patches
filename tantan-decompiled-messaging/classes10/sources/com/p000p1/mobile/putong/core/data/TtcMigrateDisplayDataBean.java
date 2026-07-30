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
public class TtcMigrateDisplayDataBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigratedisplaydatabean";

    @NonNull
    @ProtobufIndex(index = 1)
    public TtcMigrateDisplayData data;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Meta meta;
    public static ProtobufAdapter<TtcMigrateDisplayDataBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtcMigrateDisplayDataBean>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayDataBean.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean) {
            TtcMigrateDisplayData ttcMigrateDisplayData = ttcMigrateDisplayDataBean.data;
            int iL = ttcMigrateDisplayData != null ? CodedOutputByteBufferNano.l(1, ttcMigrateDisplayData, TtcMigrateDisplayData.PROTOBUF_ADAPTER) : 0;
            Meta meta = ttcMigrateDisplayDataBean.meta;
            if (meta != null) {
                iL += CodedOutputByteBufferNano.l(2, meta, Meta.PROTOBUF_ADAPTER);
            }
            ((MessageNano) ttcMigrateDisplayDataBean).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TtcMigrateDisplayDataBean m16060parse(nb5 nb5Var) throws IOException {
            TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean = new TtcMigrateDisplayDataBean();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (ttcMigrateDisplayDataBean.meta == null) {
                        ttcMigrateDisplayDataBean.meta = Meta.new_();
                    }
                    if (ttcMigrateDisplayDataBean.data != null) {
                        break;
                    }
                    ttcMigrateDisplayDataBean.data = TtcMigrateDisplayData.new_();
                    break;
                }
                if (iU == 10) {
                    ttcMigrateDisplayDataBean.data = (TtcMigrateDisplayData) nb5Var.l(TtcMigrateDisplayData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (ttcMigrateDisplayDataBean.meta == null) {
                            ttcMigrateDisplayDataBean.meta = Meta.new_();
                        }
                        if (ttcMigrateDisplayDataBean.data != null) {
                            break;
                        }
                        ttcMigrateDisplayDataBean.data = TtcMigrateDisplayData.new_();
                        return ttcMigrateDisplayDataBean;
                    }
                    ttcMigrateDisplayDataBean.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                }
            }
            return ttcMigrateDisplayDataBean;
        }

        public void serialize(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            TtcMigrateDisplayData ttcMigrateDisplayData = ttcMigrateDisplayDataBean.data;
            if (ttcMigrateDisplayData != null) {
                codedOutputByteBufferNano.K(1, ttcMigrateDisplayData, TtcMigrateDisplayData.PROTOBUF_ADAPTER);
            }
            Meta meta = ttcMigrateDisplayDataBean.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(2, meta, Meta.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TtcMigrateDisplayDataBean> JSON_ADAPTER = new ObjectJsonAdapter<TtcMigrateDisplayDataBean>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayDataBean.2
        public Class getDataClass() {
            return TtcMigrateDisplayDataBean.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TtcMigrateDisplayDataBean m16061newInstance() {
            return new TtcMigrateDisplayDataBean();
        }

        public boolean parseField(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                ttcMigrateDisplayDataBean.data = (TtcMigrateDisplayData) TtcMigrateDisplayData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            ttcMigrateDisplayDataBean.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(ttcMigrateDisplayDataBean, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean, JsonGenerator jsonGenerator) throws IOException {
            if (ttcMigrateDisplayDataBean.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(ttcMigrateDisplayDataBean.meta, jsonGenerator, true);
            }
            if (ttcMigrateDisplayDataBean.data != null) {
                jsonGenerator.writeFieldName("data");
                TtcMigrateDisplayData.JSON_ADAPTER.serialize(ttcMigrateDisplayDataBean.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtcMigrateDisplayDataBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtcMigrateDisplayDataBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TtcMigrateDisplayDataBean new_() {
        TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean = new TtcMigrateDisplayDataBean();
        ttcMigrateDisplayDataBean.nullCheck();
        return ttcMigrateDisplayDataBean;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TtcMigrateDisplayDataBean m16059clone() {
        TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean = new TtcMigrateDisplayDataBean();
        Meta meta = this.meta;
        if (meta != null) {
            ttcMigrateDisplayDataBean.meta = meta.clone();
        }
        TtcMigrateDisplayData ttcMigrateDisplayData = this.data;
        if (ttcMigrateDisplayData != null) {
            ttcMigrateDisplayDataBean.data = ttcMigrateDisplayData.m16055clone();
        }
        return ttcMigrateDisplayDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtcMigrateDisplayDataBean)) {
            return false;
        }
        TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean = (TtcMigrateDisplayDataBean) obj;
        return ValueObject.util_equals(this.meta, ttcMigrateDisplayDataBean.meta) && ValueObject.util_equals(this.data, ttcMigrateDisplayDataBean.data);
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
        TtcMigrateDisplayData ttcMigrateDisplayData = this.data;
        int iHashCode2 = iHashCode + (ttcMigrateDisplayData != null ? ttcMigrateDisplayData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = TtcMigrateDisplayData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
