package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPResult gPResult) {
            Meta meta = gPResult.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            GooglePlayOrdersData googlePlayOrdersData = gPResult.data;
            if (googlePlayOrdersData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, googlePlayOrdersData, GooglePlayOrdersData.PROTOBUF_ADAPTER);
            }
            gPResult.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPResult parse(nc5 nc5Var) throws IOException {
            GPResult gPResult = new GPResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPResult.meta == null) {
                        gPResult.meta = Meta.new_();
                    }
                    if (gPResult.data != null) {
                        break;
                    }
                    gPResult.data = GooglePlayOrdersData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    gPResult.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (gPResult.meta == null) {
                            gPResult.meta = Meta.new_();
                        }
                        if (gPResult.data != null) {
                            break;
                        }
                        gPResult.data = GooglePlayOrdersData.new_();
                        return gPResult;
                    }
                    gPResult.data = (GooglePlayOrdersData) nc5Var.m162488l(GooglePlayOrdersData.PROTOBUF_ADAPTER);
                }
            }
            return gPResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPResult gPResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = gPResult.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            GooglePlayOrdersData googlePlayOrdersData = gPResult.data;
            if (googlePlayOrdersData != null) {
                codedOutputByteBufferNano.m17309K(2, googlePlayOrdersData, GooglePlayOrdersData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GPResult> JSON_ADAPTER = new ObjectJsonAdapter<GPResult>() { // from class: com.p1.mobile.putong.data.GPResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPResult newInstance() {
            return new GPResult();
        }

        public boolean parseField(GPResult gPResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                gPResult.data = GooglePlayOrdersData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            gPResult.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPResult gPResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(gPResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPResult gPResult, JsonGenerator jsonGenerator) throws IOException {
            if (gPResult.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(gPResult.meta, jsonGenerator, true);
            }
            if (gPResult.data != null) {
                jsonGenerator.writeFieldName("data");
                GooglePlayOrdersData.JSON_ADAPTER.serialize(gPResult.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPResult new_() {
        GPResult gPResult = new GPResult();
        gPResult.nullCheck();
        return gPResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPResult mo225055clone() {
        GPResult gPResult = new GPResult();
        Meta meta = this.meta;
        if (meta != null) {
            gPResult.meta = meta.mo225055clone();
        }
        GooglePlayOrdersData googlePlayOrdersData = this.data;
        if (googlePlayOrdersData != null) {
            gPResult.data = googlePlayOrdersData.mo225055clone();
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
        GooglePlayOrdersData googlePlayOrdersData = this.data;
        int iHashCode2 = iHashCode + (googlePlayOrdersData != null ? googlePlayOrdersData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = GooglePlayOrdersData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
