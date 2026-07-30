package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Prediction;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AutocompleteResponse extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "autocompleteresponse";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Prediction> predictions;
    public static ProtobufAdapter<AutocompleteResponse> PROTOBUF_ADAPTER = new MessageNanoAdapter<AutocompleteResponse>() { // from class: com.p1.mobile.putong.core.data.AutocompleteResponse.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AutocompleteResponse autocompleteResponse) {
            List<Prediction> list = autocompleteResponse.predictions;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Prediction.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) autocompleteResponse).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AutocompleteResponse m11679parse(nb5 nb5Var) throws IOException {
            AutocompleteResponse autocompleteResponse = new AutocompleteResponse();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (autocompleteResponse.predictions != null) {
                        break;
                    }
                    autocompleteResponse.predictions = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (autocompleteResponse.predictions != null) {
                        break;
                    }
                    autocompleteResponse.predictions = new ArrayList();
                    return autocompleteResponse;
                }
                autocompleteResponse.predictions = (List) nb5Var.l(Prediction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return autocompleteResponse;
        }

        public void serialize(AutocompleteResponse autocompleteResponse, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Prediction> list = autocompleteResponse.predictions;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Prediction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AutocompleteResponse> JSON_ADAPTER = new ObjectJsonAdapter<AutocompleteResponse>() { // from class: com.p1.mobile.putong.core.data.AutocompleteResponse.2
        public Class getDataClass() {
            return AutocompleteResponse.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AutocompleteResponse m11680newInstance() {
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

        public void serializeFields(AutocompleteResponse autocompleteResponse, JsonGenerator jsonGenerator) throws IOException {
            if (autocompleteResponse.predictions != null) {
                jsonGenerator.writeFieldName("predictions");
                JsonAdapter.serializeArray(autocompleteResponse.predictions, jsonGenerator, Prediction.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AutocompleteResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AutocompleteResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AutocompleteResponse new_() {
        AutocompleteResponse autocompleteResponse = new AutocompleteResponse();
        autocompleteResponse.nullCheck();
        return autocompleteResponse;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AutocompleteResponse m11678clone() {
        AutocompleteResponse autocompleteResponse = new AutocompleteResponse();
        List<Prediction> list = this.predictions;
        if (list != null) {
            autocompleteResponse.predictions = ValueObject.util_map(list, new w9j() { // from class: l.mj1
                public final Object call(Object obj) {
                    return ((Prediction) obj).m14832clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Prediction> list = this.predictions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.predictions == null) {
            this.predictions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
