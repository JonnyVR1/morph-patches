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
public class MigrateAwardDialogBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "migrateawarddialogbean";

    @NonNull
    @ProtobufIndex(index = 2)
    public MigrateAwardDialogData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<MigrateAwardDialogBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateAwardDialogBean>() { // from class: com.p1.mobile.putong.core.data.MigrateAwardDialogBean.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MigrateAwardDialogBean migrateAwardDialogBean) {
            Meta meta = migrateAwardDialogBean.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            MigrateAwardDialogData migrateAwardDialogData = migrateAwardDialogBean.data;
            if (migrateAwardDialogData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, migrateAwardDialogData, MigrateAwardDialogData.PROTOBUF_ADAPTER);
            }
            migrateAwardDialogBean.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MigrateAwardDialogBean parse(nc5 nc5Var) throws IOException {
            MigrateAwardDialogBean migrateAwardDialogBean = new MigrateAwardDialogBean();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (migrateAwardDialogBean.meta == null) {
                        migrateAwardDialogBean.meta = Meta.new_();
                    }
                    if (migrateAwardDialogBean.data != null) {
                        break;
                    }
                    migrateAwardDialogBean.data = MigrateAwardDialogData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    migrateAwardDialogBean.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (migrateAwardDialogBean.meta == null) {
                            migrateAwardDialogBean.meta = Meta.new_();
                        }
                        if (migrateAwardDialogBean.data != null) {
                            break;
                        }
                        migrateAwardDialogBean.data = MigrateAwardDialogData.new_();
                        return migrateAwardDialogBean;
                    }
                    migrateAwardDialogBean.data = (MigrateAwardDialogData) nc5Var.m162488l(MigrateAwardDialogData.PROTOBUF_ADAPTER);
                }
            }
            return migrateAwardDialogBean;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MigrateAwardDialogBean migrateAwardDialogBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = migrateAwardDialogBean.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            MigrateAwardDialogData migrateAwardDialogData = migrateAwardDialogBean.data;
            if (migrateAwardDialogData != null) {
                codedOutputByteBufferNano.m17309K(2, migrateAwardDialogData, MigrateAwardDialogData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MigrateAwardDialogBean> JSON_ADAPTER = new ObjectJsonAdapter<MigrateAwardDialogBean>() { // from class: com.p1.mobile.putong.core.data.MigrateAwardDialogBean.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MigrateAwardDialogBean.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MigrateAwardDialogBean newInstance() {
            return new MigrateAwardDialogBean();
        }

        public boolean parseField(MigrateAwardDialogBean migrateAwardDialogBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                migrateAwardDialogBean.data = MigrateAwardDialogData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            migrateAwardDialogBean.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MigrateAwardDialogBean migrateAwardDialogBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(migrateAwardDialogBean, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MigrateAwardDialogBean migrateAwardDialogBean, JsonGenerator jsonGenerator) throws IOException {
            if (migrateAwardDialogBean.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(migrateAwardDialogBean.meta, jsonGenerator, true);
            }
            if (migrateAwardDialogBean.data != null) {
                jsonGenerator.writeFieldName("data");
                MigrateAwardDialogData.JSON_ADAPTER.serialize(migrateAwardDialogBean.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateAwardDialogBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateAwardDialogBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateAwardDialogBean new_() {
        MigrateAwardDialogBean migrateAwardDialogBean = new MigrateAwardDialogBean();
        migrateAwardDialogBean.nullCheck();
        return migrateAwardDialogBean;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MigrateAwardDialogBean mo225055clone() {
        MigrateAwardDialogBean migrateAwardDialogBean = new MigrateAwardDialogBean();
        Meta meta = this.meta;
        if (meta != null) {
            migrateAwardDialogBean.meta = meta.mo225055clone();
        }
        MigrateAwardDialogData migrateAwardDialogData = this.data;
        if (migrateAwardDialogData != null) {
            migrateAwardDialogBean.data = migrateAwardDialogData.mo225055clone();
        }
        return migrateAwardDialogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MigrateAwardDialogBean)) {
            return false;
        }
        MigrateAwardDialogBean migrateAwardDialogBean = (MigrateAwardDialogBean) obj;
        return ValueObject.util_equals(this.meta, migrateAwardDialogBean.meta) && ValueObject.util_equals(this.data, migrateAwardDialogBean.data);
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
        MigrateAwardDialogData migrateAwardDialogData = this.data;
        int iHashCode2 = iHashCode + (migrateAwardDialogData != null ? migrateAwardDialogData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = MigrateAwardDialogData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
