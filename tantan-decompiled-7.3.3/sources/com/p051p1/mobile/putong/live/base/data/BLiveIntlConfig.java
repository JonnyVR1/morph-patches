package com.p051p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveIntlConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveintlconfig";

    @ProtobufIndex(index = 1)
    public boolean switchStar;
    public static ProtobufAdapter<BLiveIntlConfig> PROTOBUF_ADAPTER = new C11925a();
    public static JsonAdapter<BLiveIntlConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlConfig newInstance() {
            return new BLiveIntlConfig();
        }

        public boolean parseField(BLiveIntlConfig bLiveIntlConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("switchStar")) {
                return false;
            }
            bLiveIntlConfig.switchStar = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlConfig bLiveIntlConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("switchStar", bLiveIntlConfig.switchStar);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveIntlConfig$a */
    public class C11925a extends MessageNanoAdapter<BLiveIntlConfig> {
        public C11925a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveIntlConfig bLiveIntlConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, bLiveIntlConfig.switchStar);
            bLiveIntlConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveIntlConfig parse(nc5 nc5Var) throws IOException {
            BLiveIntlConfig bLiveIntlConfig = new BLiveIntlConfig();
            while (nc5Var.m162497u() == 8) {
                bLiveIntlConfig.switchStar = nc5Var.m162483g();
            }
            return bLiveIntlConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveIntlConfig bLiveIntlConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, bLiveIntlConfig.switchStar);
        }
    }

    public static BLiveIntlConfig new_() {
        BLiveIntlConfig bLiveIntlConfig = new BLiveIntlConfig();
        bLiveIntlConfig.nullCheck();
        return bLiveIntlConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlConfig mo225055clone() {
        BLiveIntlConfig bLiveIntlConfig = new BLiveIntlConfig();
        bLiveIntlConfig.switchStar = this.switchStar;
        return bLiveIntlConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveIntlConfig) && this.switchStar == ((BLiveIntlConfig) obj).switchStar;
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
        int i2 = (i * 41) + (this.switchStar ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
