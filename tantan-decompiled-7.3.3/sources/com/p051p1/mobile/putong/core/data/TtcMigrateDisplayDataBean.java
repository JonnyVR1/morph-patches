package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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

/* JADX INFO: loaded from: classes10.dex */
public class TtcMigrateDisplayDataBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigratedisplaydatabean";

    @NonNull
    @ProtobufIndex(index = 1)
    public TtcMigrateDisplayData data;

    @NonNull
    @ProtobufIndex(index = 2)
    public Meta meta;
    public static ProtobufAdapter<TtcMigrateDisplayDataBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtcMigrateDisplayDataBean>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayDataBean.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean) {
            TtcMigrateDisplayData ttcMigrateDisplayData = ttcMigrateDisplayDataBean.data;
            int iM17285l = ttcMigrateDisplayData != null ? CodedOutputByteBufferNano.m17285l(1, ttcMigrateDisplayData, TtcMigrateDisplayData.PROTOBUF_ADAPTER) : 0;
            Meta meta = ttcMigrateDisplayDataBean.meta;
            if (meta != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, meta, Meta.PROTOBUF_ADAPTER);
            }
            ttcMigrateDisplayDataBean.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TtcMigrateDisplayDataBean parse(nc5 nc5Var) throws IOException {
            TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean = new TtcMigrateDisplayDataBean();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (ttcMigrateDisplayDataBean.meta == null) {
                        ttcMigrateDisplayDataBean.meta = Meta.new_();
                    }
                    if (ttcMigrateDisplayDataBean.data != null) {
                        break;
                    }
                    ttcMigrateDisplayDataBean.data = TtcMigrateDisplayData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    ttcMigrateDisplayDataBean.data = (TtcMigrateDisplayData) nc5Var.m162488l(TtcMigrateDisplayData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (ttcMigrateDisplayDataBean.meta == null) {
                            ttcMigrateDisplayDataBean.meta = Meta.new_();
                        }
                        if (ttcMigrateDisplayDataBean.data != null) {
                            break;
                        }
                        ttcMigrateDisplayDataBean.data = TtcMigrateDisplayData.new_();
                        return ttcMigrateDisplayDataBean;
                    }
                    ttcMigrateDisplayDataBean.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                }
            }
            return ttcMigrateDisplayDataBean;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            TtcMigrateDisplayData ttcMigrateDisplayData = ttcMigrateDisplayDataBean.data;
            if (ttcMigrateDisplayData != null) {
                codedOutputByteBufferNano.m17309K(1, ttcMigrateDisplayData, TtcMigrateDisplayData.PROTOBUF_ADAPTER);
            }
            Meta meta = ttcMigrateDisplayDataBean.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(2, meta, Meta.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TtcMigrateDisplayDataBean> JSON_ADAPTER = new ObjectJsonAdapter<TtcMigrateDisplayDataBean>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayDataBean.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TtcMigrateDisplayDataBean.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TtcMigrateDisplayDataBean newInstance() {
            return new TtcMigrateDisplayDataBean();
        }

        public boolean parseField(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                ttcMigrateDisplayDataBean.data = TtcMigrateDisplayData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            ttcMigrateDisplayDataBean.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(ttcMigrateDisplayDataBean, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtcMigrateDisplayDataBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtcMigrateDisplayDataBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TtcMigrateDisplayDataBean new_() {
        TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean = new TtcMigrateDisplayDataBean();
        ttcMigrateDisplayDataBean.nullCheck();
        return ttcMigrateDisplayDataBean;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TtcMigrateDisplayDataBean mo225055clone() {
        TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean = new TtcMigrateDisplayDataBean();
        Meta meta = this.meta;
        if (meta != null) {
            ttcMigrateDisplayDataBean.meta = meta.mo225055clone();
        }
        TtcMigrateDisplayData ttcMigrateDisplayData = this.data;
        if (ttcMigrateDisplayData != null) {
            ttcMigrateDisplayDataBean.data = ttcMigrateDisplayData.mo225055clone();
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
        TtcMigrateDisplayData ttcMigrateDisplayData = this.data;
        int iHashCode2 = iHashCode + (ttcMigrateDisplayData != null ? ttcMigrateDisplayData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = TtcMigrateDisplayData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
