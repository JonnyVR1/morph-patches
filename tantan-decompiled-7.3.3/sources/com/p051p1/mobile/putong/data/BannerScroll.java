package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class BannerScroll extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bannerscroll";

    @ProtobufIndex(index = 1)
    public boolean auto;

    @ProtobufIndex(index = 2)
    public float interval;
    public static ProtobufAdapter<BannerScroll> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerScroll>() { // from class: com.p1.mobile.putong.data.BannerScroll.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BannerScroll bannerScroll) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, bannerScroll.auto) + CodedOutputByteBufferNano.m17279f(2, bannerScroll.interval);
            bannerScroll.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BannerScroll parse(nc5 nc5Var) throws IOException {
            BannerScroll bannerScroll = new BannerScroll();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    bannerScroll.auto = nc5Var.m162483g();
                } else {
                    if (iM162497u != 21) {
                        return bannerScroll;
                    }
                    bannerScroll.interval = nc5Var.m162485i();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BannerScroll bannerScroll, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, bannerScroll.auto);
            codedOutputByteBufferNano.m17303E(2, bannerScroll.interval);
        }
    };
    public static JsonAdapter<BannerScroll> JSON_ADAPTER = new ObjectJsonAdapter<BannerScroll>() { // from class: com.p1.mobile.putong.data.BannerScroll.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BannerScroll.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BannerScroll newInstance() {
            return new BannerScroll();
        }

        public boolean parseField(BannerScroll bannerScroll, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("auto")) {
                bannerScroll.auto = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals(BannerFrequencyType.interval)) {
                return false;
            }
            bannerScroll.interval = (float) jsonParser.getValueAsDouble();
            return true;
        }

        public boolean parseFieldCheck(BannerScroll bannerScroll, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("auto") || str.equals(BannerFrequencyType.interval)) {
                return true;
            }
            return super.parseFieldCheck(bannerScroll, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerScroll bannerScroll, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("auto", bannerScroll.auto);
            jsonGenerator.writeNumberField(BannerFrequencyType.interval, bannerScroll.interval);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerScroll) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerScroll) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerScroll new_() {
        BannerScroll bannerScroll = new BannerScroll();
        bannerScroll.nullCheck();
        return bannerScroll;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BannerScroll mo225055clone() {
        BannerScroll bannerScroll = new BannerScroll();
        bannerScroll.auto = this.auto;
        bannerScroll.interval = this.interval;
        return bannerScroll;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerScroll)) {
            return false;
        }
        BannerScroll bannerScroll = (BannerScroll) obj;
        return this.auto == bannerScroll.auto && this.interval == bannerScroll.interval;
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
        int iFloatToIntBits = (((i * 41) + (this.auto ? 1231 : 1237)) * 41) + Float.floatToIntBits(this.interval);
        this.hashCode = iFloatToIntBits;
        return iFloatToIntBits;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
