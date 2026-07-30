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
public class MigrateDlgConfigEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "migratedlgconfigenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MigrateDlgConfig data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<MigrateDlgConfigEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateDlgConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgConfigEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope) {
            Meta meta = migrateDlgConfigEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            MigrateDlgConfig migrateDlgConfig = migrateDlgConfigEnvelope.data;
            if (migrateDlgConfig != null) {
                iL += CodedOutputByteBufferNano.l(2, migrateDlgConfig, MigrateDlgConfig.PROTOBUF_ADAPTER);
            }
            ((MessageNano) migrateDlgConfigEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MigrateDlgConfigEnvelope m14315parse(nb5 nb5Var) throws IOException {
            MigrateDlgConfigEnvelope migrateDlgConfigEnvelope = new MigrateDlgConfigEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (migrateDlgConfigEnvelope.meta == null) {
                        migrateDlgConfigEnvelope.meta = Meta.new_();
                    }
                    if (migrateDlgConfigEnvelope.data != null) {
                        break;
                    }
                    migrateDlgConfigEnvelope.data = MigrateDlgConfig.new_();
                    break;
                }
                if (iU == 10) {
                    migrateDlgConfigEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (migrateDlgConfigEnvelope.meta == null) {
                            migrateDlgConfigEnvelope.meta = Meta.new_();
                        }
                        if (migrateDlgConfigEnvelope.data != null) {
                            break;
                        }
                        migrateDlgConfigEnvelope.data = MigrateDlgConfig.new_();
                        return migrateDlgConfigEnvelope;
                    }
                    migrateDlgConfigEnvelope.data = (MigrateDlgConfig) nb5Var.l(MigrateDlgConfig.PROTOBUF_ADAPTER);
                }
            }
            return migrateDlgConfigEnvelope;
        }

        public void serialize(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = migrateDlgConfigEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            MigrateDlgConfig migrateDlgConfig = migrateDlgConfigEnvelope.data;
            if (migrateDlgConfig != null) {
                codedOutputByteBufferNano.K(2, migrateDlgConfig, MigrateDlgConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MigrateDlgConfigEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<MigrateDlgConfigEnvelope>() { // from class: com.p1.mobile.putong.core.data.MigrateDlgConfigEnvelope.2
        public Class getDataClass() {
            return MigrateDlgConfigEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MigrateDlgConfigEnvelope m14316newInstance() {
            return new MigrateDlgConfigEnvelope();
        }

        public boolean parseField(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                migrateDlgConfigEnvelope.data = (MigrateDlgConfig) MigrateDlgConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            migrateDlgConfigEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MigrateDlgConfigEnvelope migrateDlgConfigEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(migrateDlgConfigEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateDlgConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateDlgConfigEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateDlgConfigEnvelope new_() {
        MigrateDlgConfigEnvelope migrateDlgConfigEnvelope = new MigrateDlgConfigEnvelope();
        migrateDlgConfigEnvelope.nullCheck();
        return migrateDlgConfigEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MigrateDlgConfigEnvelope m14314clone() {
        MigrateDlgConfigEnvelope migrateDlgConfigEnvelope = new MigrateDlgConfigEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            migrateDlgConfigEnvelope.meta = meta.clone();
        }
        MigrateDlgConfig migrateDlgConfig = this.data;
        if (migrateDlgConfig != null) {
            migrateDlgConfigEnvelope.data = migrateDlgConfig.m14310clone();
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
        MigrateDlgConfig migrateDlgConfig = this.data;
        int iHashCode2 = iHashCode + (migrateDlgConfig != null ? migrateDlgConfig.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = MigrateDlgConfig.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
