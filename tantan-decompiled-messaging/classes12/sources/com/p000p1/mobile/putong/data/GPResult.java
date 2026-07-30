package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class GPResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpresult";

    @NonNull
    @ProtobufIndex(index = 2)
    public GooglePlayOrdersData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<GPResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPResult>() { // from class: com.p1.mobile.putong.data.GPResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPResult gPResult) {
            Meta meta = gPResult.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GooglePlayOrdersData googlePlayOrdersData = gPResult.data;
            if (googlePlayOrdersData != null) {
                iL += CodedOutputByteBufferNano.l(2, googlePlayOrdersData, GooglePlayOrdersData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) gPResult).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPResult m18163parse(nb5 nb5Var) throws IOException {
            GPResult gPResult = new GPResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPResult.meta == null) {
                        gPResult.meta = Meta.new_();
                    }
                    if (gPResult.data != null) {
                        break;
                    }
                    gPResult.data = GooglePlayOrdersData.new_();
                    break;
                }
                if (iU == 10) {
                    gPResult.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (gPResult.meta == null) {
                            gPResult.meta = Meta.new_();
                        }
                        if (gPResult.data != null) {
                            break;
                        }
                        gPResult.data = GooglePlayOrdersData.new_();
                        return gPResult;
                    }
                    gPResult.data = (GooglePlayOrdersData) nb5Var.l(GooglePlayOrdersData.PROTOBUF_ADAPTER);
                }
            }
            return gPResult;
        }

        public void serialize(GPResult gPResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPResult.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GooglePlayOrdersData googlePlayOrdersData = gPResult.data;
            if (googlePlayOrdersData != null) {
                codedOutputByteBufferNano.K(2, googlePlayOrdersData, GooglePlayOrdersData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPResult> JSON_ADAPTER = new ObjectJsonAdapter<GPResult>() { // from class: com.p1.mobile.putong.data.GPResult.2
        public Class getDataClass() {
            return GPResult.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GPResult mo17830newInstance() {
            return new GPResult();
        }

        public boolean parseField(GPResult gPResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                gPResult.data = (GooglePlayOrdersData) GooglePlayOrdersData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            gPResult.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPResult gPResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(gPResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPResult gPResult, JsonGenerator jsonGenerator) throws IOException {
            if (gPResult.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(gPResult.meta, jsonGenerator, true);
            }
            if (gPResult.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                GooglePlayOrdersData.JSON_ADAPTER.serialize(gPResult.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPResult new_() {
        GPResult gPResult = new GPResult();
        gPResult.nullCheck();
        return gPResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPResult m18162clone() {
        GPResult gPResult = new GPResult();
        Meta meta = this.meta;
        if (meta != null) {
            gPResult.meta = meta.m18461clone();
        }
        GooglePlayOrdersData googlePlayOrdersData = this.data;
        if (googlePlayOrdersData != null) {
            gPResult.data = googlePlayOrdersData.m18189clone();
        }
        return gPResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPResult)) {
            return false;
        }
        GPResult gPResult = (GPResult) obj;
        return ValueObject.util_equals(this.meta, gPResult.meta) && ValueObject.util_equals(this.data, gPResult.data);
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
        GooglePlayOrdersData googlePlayOrdersData = this.data;
        int iHashCode2 = iHashCode + (googlePlayOrdersData != null ? googlePlayOrdersData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GooglePlayOrdersData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
