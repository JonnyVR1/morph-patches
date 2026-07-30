package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class SearchRadius extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "searchradius";

    @NonNull
    @ProtobufIndex(index = 2)
    public Integer allowedMaximum;

    @NonNull
    @ProtobufIndex(index = 3)
    public Integer allowedMinimum;

    @NonNull
    @ProtobufIndex(index = 1)
    public Integer value;
    public static ProtobufAdapter<SearchRadius> PROTOBUF_ADAPTER = new MessageNanoAdapter<SearchRadius>() { // from class: com.p1.mobile.putong.data.SearchRadius.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SearchRadius searchRadius) {
            Integer num = searchRadius.value;
            int iH = num != null ? CodedOutputByteBufferNano.h(1, num.intValue()) : 0;
            Integer num2 = searchRadius.allowedMaximum;
            if (num2 != null) {
                iH += CodedOutputByteBufferNano.h(2, num2.intValue());
            }
            Integer num3 = searchRadius.allowedMinimum;
            if (num3 != null) {
                iH += CodedOutputByteBufferNano.h(3, num3.intValue());
            }
            ((MessageNano) searchRadius).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SearchRadius m18938parse(nb5 nb5Var) throws IOException {
            SearchRadius searchRadius = new SearchRadius();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (searchRadius.value == null) {
                        searchRadius.value = 0;
                    }
                    if (searchRadius.allowedMaximum == null) {
                        searchRadius.allowedMaximum = 0;
                    }
                    if (searchRadius.allowedMinimum != null) {
                        break;
                    }
                    searchRadius.allowedMinimum = 0;
                    break;
                }
                if (iU == 8) {
                    searchRadius.value = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    searchRadius.allowedMaximum = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 24) {
                        if (searchRadius.value == null) {
                            searchRadius.value = 0;
                        }
                        if (searchRadius.allowedMaximum == null) {
                            searchRadius.allowedMaximum = 0;
                        }
                        if (searchRadius.allowedMinimum != null) {
                            break;
                        }
                        searchRadius.allowedMinimum = 0;
                        return searchRadius;
                    }
                    searchRadius.allowedMinimum = Integer.valueOf(nb5Var.j());
                }
            }
            return searchRadius;
        }

        public void serialize(SearchRadius searchRadius, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Integer num = searchRadius.value;
            if (num != null) {
                codedOutputByteBufferNano.G(1, num.intValue());
            }
            Integer num2 = searchRadius.allowedMaximum;
            if (num2 != null) {
                codedOutputByteBufferNano.G(2, num2.intValue());
            }
            Integer num3 = searchRadius.allowedMinimum;
            if (num3 != null) {
                codedOutputByteBufferNano.G(3, num3.intValue());
            }
        }
    };
    public static JsonAdapter<SearchRadius> JSON_ADAPTER = new ObjectJsonAdapter<SearchRadius>() { // from class: com.p1.mobile.putong.data.SearchRadius.2
        public Class getDataClass() {
            return SearchRadius.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SearchRadius mo17830newInstance() {
            return new SearchRadius();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(SearchRadius searchRadius, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case 111972721:
                    if (str.equals("value")) {
                        b = 0;
                    }
                    break;
                case 957783896:
                    if (str.equals("allowedMaximum")) {
                        b = 1;
                    }
                    break;
                case 1177581894:
                    if (str.equals("allowedMinimum")) {
                        b = 2;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    searchRadius.value = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 1:
                    searchRadius.allowedMaximum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 2:
                    searchRadius.allowedMinimum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SearchRadius searchRadius, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "value":
                case "allowedMaximum":
                case "allowedMinimum":
                    return true;
                default:
                    return super.parseFieldCheck(searchRadius, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SearchRadius searchRadius, JsonGenerator jsonGenerator) throws IOException {
            Integer num = searchRadius.value;
            if (num != null) {
                jsonGenerator.writeNumberField("value", num.intValue());
            }
            Integer num2 = searchRadius.allowedMaximum;
            if (num2 != null) {
                jsonGenerator.writeNumberField("allowedMaximum", num2.intValue());
            }
            Integer num3 = searchRadius.allowedMinimum;
            if (num3 != null) {
                jsonGenerator.writeNumberField("allowedMinimum", num3.intValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SearchRadius) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SearchRadius) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SearchRadius new_() {
        SearchRadius searchRadius = new SearchRadius();
        searchRadius.nullCheck();
        return searchRadius;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SearchRadius m18937clone() {
        SearchRadius searchRadius = new SearchRadius();
        searchRadius.value = this.value;
        searchRadius.allowedMaximum = this.allowedMaximum;
        searchRadius.allowedMinimum = this.allowedMinimum;
        return searchRadius;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchRadius)) {
            return false;
        }
        SearchRadius searchRadius = (SearchRadius) obj;
        return ValueObject.util_equals(this.value, searchRadius.value) && ValueObject.util_equals(this.allowedMaximum, searchRadius.allowedMaximum) && ValueObject.util_equals(this.allowedMinimum, searchRadius.allowedMinimum);
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
        Integer num = this.value;
        int iHashCode = (i2 + (num != null ? num.hashCode() : 0)) * 41;
        Integer num2 = this.allowedMaximum;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 41;
        Integer num3 = this.allowedMinimum;
        int iHashCode3 = iHashCode2 + (num3 != null ? num3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = 0;
        }
        if (this.allowedMaximum == null) {
            this.allowedMaximum = 0;
        }
        if (this.allowedMinimum == null) {
            this.allowedMinimum = 0;
        }
    }

    public SearchRadius subtract(SearchRadius searchRadius) {
        SearchRadius searchRadius2 = new SearchRadius();
        if (!ValueObject.util_equals(this.value, searchRadius.value)) {
            searchRadius2.value = this.value;
        }
        if (searchRadius2.equals(new SearchRadius())) {
            return null;
        }
        return searchRadius2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
