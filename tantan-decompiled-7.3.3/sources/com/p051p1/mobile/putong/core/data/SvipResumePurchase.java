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
public class SvipResumePurchase extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipresumepurchase";

    @ProtobufIndex(index = 2)
    public int no_match_days_limit;

    @ProtobufIndex(index = 1)
    public int no_match_swipe_limit;
    public static ProtobufAdapter<SvipResumePurchase> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipResumePurchase>() { // from class: com.p1.mobile.putong.core.data.SvipResumePurchase.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SvipResumePurchase svipResumePurchase) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, svipResumePurchase.no_match_swipe_limit) + CodedOutputByteBufferNano.m17281h(2, svipResumePurchase.no_match_days_limit);
            svipResumePurchase.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SvipResumePurchase parse(nc5 nc5Var) throws IOException {
            SvipResumePurchase svipResumePurchase = new SvipResumePurchase();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    svipResumePurchase.no_match_swipe_limit = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return svipResumePurchase;
                    }
                    svipResumePurchase.no_match_days_limit = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SvipResumePurchase svipResumePurchase, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, svipResumePurchase.no_match_swipe_limit);
            codedOutputByteBufferNano.m17305G(2, svipResumePurchase.no_match_days_limit);
        }
    };
    public static JsonAdapter<SvipResumePurchase> JSON_ADAPTER = new ObjectJsonAdapter<SvipResumePurchase>() { // from class: com.p1.mobile.putong.core.data.SvipResumePurchase.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SvipResumePurchase.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SvipResumePurchase newInstance() {
            return new SvipResumePurchase();
        }

        public boolean parseField(SvipResumePurchase svipResumePurchase, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("no_match_swipe_limit")) {
                svipResumePurchase.no_match_swipe_limit = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("no_match_days_limit")) {
                return false;
            }
            svipResumePurchase.no_match_days_limit = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SvipResumePurchase svipResumePurchase, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("no_match_swipe_limit") || str.equals("no_match_days_limit")) {
                return true;
            }
            return super.parseFieldCheck(svipResumePurchase, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SvipResumePurchase svipResumePurchase, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("no_match_swipe_limit", svipResumePurchase.no_match_swipe_limit);
            jsonGenerator.writeNumberField("no_match_days_limit", svipResumePurchase.no_match_days_limit);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipResumePurchase) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipResumePurchase) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipResumePurchase new_() {
        SvipResumePurchase svipResumePurchase = new SvipResumePurchase();
        svipResumePurchase.nullCheck();
        return svipResumePurchase;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SvipResumePurchase mo225055clone() {
        SvipResumePurchase svipResumePurchase = new SvipResumePurchase();
        svipResumePurchase.no_match_swipe_limit = this.no_match_swipe_limit;
        svipResumePurchase.no_match_days_limit = this.no_match_days_limit;
        return svipResumePurchase;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SvipResumePurchase)) {
            return false;
        }
        SvipResumePurchase svipResumePurchase = (SvipResumePurchase) obj;
        return this.no_match_swipe_limit == svipResumePurchase.no_match_swipe_limit && this.no_match_days_limit == svipResumePurchase.no_match_days_limit;
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
        int i2 = (((i * 41) + this.no_match_swipe_limit) * 41) + this.no_match_days_limit;
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
