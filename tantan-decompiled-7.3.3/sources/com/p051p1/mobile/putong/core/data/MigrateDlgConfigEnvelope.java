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
public class MigrateDlgConfigEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "migratedlgconfigenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public MigrateDlgConfig data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<MigrateDlgConfigEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateDlgConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgConfigEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope) {
            Meta meta = migrateDlgConfigEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            MigrateDlgConfig migrateDlgConfig = migrateDlgConfigEnvelope.data;
            if (migrateDlgConfig != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, migrateDlgConfig, MigrateDlgConfig.PROTOBUF_ADAPTER);
            }
            migrateDlgConfigEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MigrateDlgConfigEnvelope parse(nc5 nc5Var) throws IOException {
            MigrateDlgConfigEnvelope migrateDlgConfigEnvelope = new MigrateDlgConfigEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (migrateDlgConfigEnvelope.meta == null) {
                        migrateDlgConfigEnvelope.meta = Meta.new_();
                    }
                    if (migrateDlgConfigEnvelope.data != null) {
                        break;
                    }
                    migrateDlgConfigEnvelope.data = MigrateDlgConfig.new_();
                    break;
                }
                if (iM162497u == 10) {
                    migrateDlgConfigEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (migrateDlgConfigEnvelope.meta == null) {
                            migrateDlgConfigEnvelope.meta = Meta.new_();
                        }
                        if (migrateDlgConfigEnvelope.data != null) {
                            break;
                        }
                        migrateDlgConfigEnvelope.data = MigrateDlgConfig.new_();
                        return migrateDlgConfigEnvelope;
                    }
                    migrateDlgConfigEnvelope.data = (MigrateDlgConfig) nc5Var.m162488l(MigrateDlgConfig.PROTOBUF_ADAPTER);
                }
            }
            return migrateDlgConfigEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = migrateDlgConfigEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            MigrateDlgConfig migrateDlgConfig = migrateDlgConfigEnvelope.data;
            if (migrateDlgConfig != null) {
                codedOutputByteBufferNano.m17309K(2, migrateDlgConfig, MigrateDlgConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MigrateDlgConfigEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<MigrateDlgConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgConfigEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MigrateDlgConfigEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MigrateDlgConfigEnvelope newInstance() {
            return new MigrateDlgConfigEnvelope();
        }

        public boolean parseField(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                migrateDlgConfigEnvelope.data = MigrateDlgConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            migrateDlgConfigEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(migrateDlgConfigEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (migrateDlgConfigEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(migrateDlgConfigEnvelope.meta, jsonGenerator, true);
            }
            if (migrateDlgConfigEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                MigrateDlgConfig.JSON_ADAPTER.serialize(migrateDlgConfigEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateDlgConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateDlgConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateDlgConfigEnvelope new_() {
        MigrateDlgConfigEnvelope migrateDlgConfigEnvelope = new MigrateDlgConfigEnvelope();
        migrateDlgConfigEnvelope.nullCheck();
        return migrateDlgConfigEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MigrateDlgConfigEnvelope mo225055clone() {
        MigrateDlgConfigEnvelope migrateDlgConfigEnvelope = new MigrateDlgConfigEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            migrateDlgConfigEnvelope.meta = meta.mo225055clone();
        }
        MigrateDlgConfig migrateDlgConfig = this.data;
        if (migrateDlgConfig != null) {
            migrateDlgConfigEnvelope.data = migrateDlgConfig.mo225055clone();
        }
        return migrateDlgConfigEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MigrateDlgConfigEnvelope)) {
            return false;
        }
        MigrateDlgConfigEnvelope migrateDlgConfigEnvelope = (MigrateDlgConfigEnvelope) obj;
        return ValueObject.util_equals(this.meta, migrateDlgConfigEnvelope.meta) && ValueObject.util_equals(this.data, migrateDlgConfigEnvelope.data);
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
        MigrateDlgConfig migrateDlgConfig = this.data;
        int iHashCode2 = iHashCode + (migrateDlgConfig != null ? migrateDlgConfig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = MigrateDlgConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
