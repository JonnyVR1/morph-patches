package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class IapAffiliatePromotionExtraConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "iapaffiliatepromotionextraconfig";

    @ProtobufIndex(index = 1)
    public long countdown;
    public static ProtobufAdapter<IapAffiliatePromotionExtraConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IapAffiliatePromotionExtraConfig>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotionExtraConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, iapAffiliatePromotionExtraConfig.countdown);
            iapAffiliatePromotionExtraConfig.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IapAffiliatePromotionExtraConfig parse(nc5 nc5Var) throws IOException {
            IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = new IapAffiliatePromotionExtraConfig();
            while (nc5Var.m162497u() == 8) {
                iapAffiliatePromotionExtraConfig.countdown = nc5Var.m162487k();
            }
            return iapAffiliatePromotionExtraConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, iapAffiliatePromotionExtraConfig.countdown);
        }
    };
    public static JsonAdapter<IapAffiliatePromotionExtraConfig> JSON_ADAPTER = new ObjectJsonAdapter<IapAffiliatePromotionExtraConfig>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotionExtraConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IapAffiliatePromotionExtraConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IapAffiliatePromotionExtraConfig newInstance() {
            return new IapAffiliatePromotionExtraConfig();
        }

        public boolean parseField(IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("countdown")) {
                return false;
            }
            iapAffiliatePromotionExtraConfig.countdown = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("countdown")) {
                return true;
            }
            return super.parseFieldCheck(iapAffiliatePromotionExtraConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("countdown", iapAffiliatePromotionExtraConfig.countdown);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IapAffiliatePromotionExtraConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IapAffiliatePromotionExtraConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IapAffiliatePromotionExtraConfig new_() {
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = new IapAffiliatePromotionExtraConfig();
        iapAffiliatePromotionExtraConfig.nullCheck();
        return iapAffiliatePromotionExtraConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IapAffiliatePromotionExtraConfig mo225055clone() {
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = new IapAffiliatePromotionExtraConfig();
        iapAffiliatePromotionExtraConfig.countdown = this.countdown;
        return iapAffiliatePromotionExtraConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof IapAffiliatePromotionExtraConfig) && this.countdown == ((IapAffiliatePromotionExtraConfig) obj).countdown;
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
        long j = this.countdown;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
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
