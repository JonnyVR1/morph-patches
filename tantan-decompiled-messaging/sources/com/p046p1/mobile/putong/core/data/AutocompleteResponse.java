package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Prediction;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class AutocompleteResponse extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "autocompleteresponse";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Prediction> predictions;
    public static ProtobufAdapter<AutocompleteResponse> PROTOBUF_ADAPTER = new MessageNanoAdapter<AutocompleteResponse>() { // from class: com.p1.mobile.putong.core.data.AutocompleteResponse.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AutocompleteResponse autocompleteResponse) {
            List<Prediction> list = autocompleteResponse.predictions;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Prediction.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            autocompleteResponse.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AutocompleteResponse parse(nb5 nb5Var) throws IOException {
            AutocompleteResponse autocompleteResponse = new AutocompleteResponse();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (autocompleteResponse.predictions != null) {
                        break;
                    }
                    autocompleteResponse.predictions = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (autocompleteResponse.predictions != null) {
                        break;
                    }
                    autocompleteResponse.predictions = new ArrayList();
                    return autocompleteResponse;
                }
                autocompleteResponse.predictions = (List) nb5Var.m158743l(Prediction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return autocompleteResponse;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AutocompleteResponse autocompleteResponse, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Prediction> list = autocompleteResponse.predictions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Prediction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AutocompleteResponse> JSON_ADAPTER = new ObjectJsonAdapter<AutocompleteResponse>() { // from class: com.p1.mobile.putong.core.data.AutocompleteResponse.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AutocompleteResponse.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AutocompleteResponse newInstance() {
            return new AutocompleteResponse();
        }

        public boolean parseField(AutocompleteResponse autocompleteResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("predictions")) {
                return false;
            }
            autocompleteResponse.predictions = JsonAdapter.parseArray(jsonParser, Prediction.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AutocompleteResponse autocompleteResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("predictions")) {
                return true;
            }
            return super.parseFieldCheck(autocompleteResponse, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AutocompleteResponse autocompleteResponse, JsonGenerator jsonGenerator) throws IOException {
            if (autocompleteResponse.predictions != null) {
                jsonGenerator.writeFieldName("predictions");
                JsonAdapter.serializeArray(autocompleteResponse.predictions, jsonGenerator, Prediction.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AutocompleteResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AutocompleteResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AutocompleteResponse new_() {
        AutocompleteResponse autocompleteResponse = new AutocompleteResponse();
        autocompleteResponse.nullCheck();
        return autocompleteResponse;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AutocompleteResponse mo223809clone() {
        AutocompleteResponse autocompleteResponse = new AutocompleteResponse();
        List<Prediction> list = this.predictions;
        if (list != null) {
            autocompleteResponse.predictions = ValueObject.util_map(list, new w9j() { // from class: l.mj1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Prediction) obj).mo223809clone();
                }
            });
        }
        return autocompleteResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompleteResponse) {
            return ValueObject.util_equals(this.predictions, ((AutocompleteResponse) obj).predictions);
        }
        return false;
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
        List<Prediction> list = this.predictions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.predictions == null) {
            this.predictions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
