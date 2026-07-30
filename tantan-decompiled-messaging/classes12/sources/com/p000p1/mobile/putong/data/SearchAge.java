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
public class SearchAge extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "searchage";

    @NonNull
    @ProtobufIndex(index = 2)
    public Integer allowedMaximum;

    @NonNull
    @ProtobufIndex(index = 1)
    public Integer allowedMinimum;

    @NonNull
    @ProtobufIndex(index = 4)
    public Integer maximum;

    @NonNull
    @ProtobufIndex(index = 3)
    public Integer minimum;
    public static ProtobufAdapter<SearchAge> PROTOBUF_ADAPTER = new MessageNanoAdapter<SearchAge>() { // from class: com.p1.mobile.putong.data.SearchAge.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SearchAge searchAge) {
            Integer num = searchAge.allowedMinimum;
            int iH = num != null ? CodedOutputByteBufferNano.h(1, num.intValue()) : 0;
            Integer num2 = searchAge.allowedMaximum;
            if (num2 != null) {
                iH += CodedOutputByteBufferNano.h(2, num2.intValue());
            }
            Integer num3 = searchAge.minimum;
            if (num3 != null) {
                iH += CodedOutputByteBufferNano.h(3, num3.intValue());
            }
            Integer num4 = searchAge.maximum;
            if (num4 != null) {
                iH += CodedOutputByteBufferNano.h(4, num4.intValue());
            }
            ((MessageNano) searchAge).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SearchAge m18935parse(nb5 nb5Var) throws IOException {
            SearchAge searchAge = new SearchAge();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (searchAge.allowedMinimum == null) {
                        searchAge.allowedMinimum = 0;
                    }
                    if (searchAge.allowedMaximum == null) {
                        searchAge.allowedMaximum = 0;
                    }
                    if (searchAge.minimum == null) {
                        searchAge.minimum = 0;
                    }
                    if (searchAge.maximum != null) {
                        break;
                    }
                    searchAge.maximum = 0;
                    break;
                }
                if (iU == 8) {
                    searchAge.allowedMinimum = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    searchAge.allowedMaximum = Integer.valueOf(nb5Var.j());
                } else if (iU == 24) {
                    searchAge.minimum = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 32) {
                        if (searchAge.allowedMinimum == null) {
                            searchAge.allowedMinimum = 0;
                        }
                        if (searchAge.allowedMaximum == null) {
                            searchAge.allowedMaximum = 0;
                        }
                        if (searchAge.minimum == null) {
                            searchAge.minimum = 0;
                        }
                        if (searchAge.maximum != null) {
                            break;
                        }
                        searchAge.maximum = 0;
                        return searchAge;
                    }
                    searchAge.maximum = Integer.valueOf(nb5Var.j());
                }
            }
            return searchAge;
        }

        public void serialize(SearchAge searchAge, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Integer num = searchAge.allowedMinimum;
            if (num != null) {
                codedOutputByteBufferNano.G(1, num.intValue());
            }
            Integer num2 = searchAge.allowedMaximum;
            if (num2 != null) {
                codedOutputByteBufferNano.G(2, num2.intValue());
            }
            Integer num3 = searchAge.minimum;
            if (num3 != null) {
                codedOutputByteBufferNano.G(3, num3.intValue());
            }
            Integer num4 = searchAge.maximum;
            if (num4 != null) {
                codedOutputByteBufferNano.G(4, num4.intValue());
            }
        }
    };
    public static JsonAdapter<SearchAge> JSON_ADAPTER = new ObjectJsonAdapter<SearchAge>() { // from class: com.p1.mobile.putong.data.SearchAge.2
        public Class getDataClass() {
            return SearchAge.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SearchAge mo17830newInstance() {
            return new SearchAge();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(SearchAge searchAge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case 844740128:
                    if (str.equals(DiamondVIPBoostType.maximum)) {
                        b = 0;
                    }
                    break;
                case 957783896:
                    if (str.equals("allowedMaximum")) {
                        b = 1;
                    }
                    break;
                case 1064538126:
                    if (str.equals("minimum")) {
                        b = 2;
                    }
                    break;
                case 1177581894:
                    if (str.equals("allowedMinimum")) {
                        b = 3;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    searchAge.maximum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 1:
                    searchAge.allowedMaximum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 2:
                    searchAge.minimum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 3:
                    searchAge.allowedMinimum = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SearchAge searchAge, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maximum":
                case "allowedMaximum":
                case "minimum":
                case "allowedMinimum":
                    return true;
                default:
                    return super.parseFieldCheck(searchAge, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SearchAge searchAge, JsonGenerator jsonGenerator) throws IOException {
            Integer num = searchAge.allowedMinimum;
            if (num != null) {
                jsonGenerator.writeNumberField("allowedMinimum", num.intValue());
            }
            Integer num2 = searchAge.allowedMaximum;
            if (num2 != null) {
                jsonGenerator.writeNumberField("allowedMaximum", num2.intValue());
            }
            Integer num3 = searchAge.minimum;
            if (num3 != null) {
                jsonGenerator.writeNumberField("minimum", num3.intValue());
            }
            Integer num4 = searchAge.maximum;
            if (num4 != null) {
                jsonGenerator.writeNumberField(DiamondVIPBoostType.maximum, num4.intValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SearchAge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SearchAge) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SearchAge new_() {
        SearchAge searchAge = new SearchAge();
        searchAge.nullCheck();
        return searchAge;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SearchAge m18934clone() {
        SearchAge searchAge = new SearchAge();
        searchAge.allowedMinimum = this.allowedMinimum;
        searchAge.allowedMaximum = this.allowedMaximum;
        searchAge.minimum = this.minimum;
        searchAge.maximum = this.maximum;
        return searchAge;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchAge)) {
            return false;
        }
        SearchAge searchAge = (SearchAge) obj;
        return ValueObject.util_equals(this.allowedMinimum, searchAge.allowedMinimum) && ValueObject.util_equals(this.allowedMaximum, searchAge.allowedMaximum) && ValueObject.util_equals(this.minimum, searchAge.minimum) && ValueObject.util_equals(this.maximum, searchAge.maximum);
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
        Integer num = this.allowedMinimum;
        int iHashCode = (i2 + (num != null ? num.hashCode() : 0)) * 41;
        Integer num2 = this.allowedMaximum;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 41;
        Integer num3 = this.minimum;
        int iHashCode3 = (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 41;
        Integer num4 = this.maximum;
        int iHashCode4 = iHashCode3 + (num4 != null ? num4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.allowedMinimum == null) {
            this.allowedMinimum = 0;
        }
        if (this.allowedMaximum == null) {
            this.allowedMaximum = 0;
        }
        if (this.minimum == null) {
            this.minimum = 0;
        }
        if (this.maximum == null) {
            this.maximum = 0;
        }
    }

    public SearchAge subtract(SearchAge searchAge) {
        SearchAge searchAge2 = new SearchAge();
        if (!ValueObject.util_equals(this.minimum, searchAge.minimum)) {
            searchAge2.minimum = this.minimum;
        }
        if (!ValueObject.util_equals(this.maximum, searchAge.maximum)) {
            searchAge2.maximum = this.maximum;
        }
        if (searchAge2.equals(new SearchAge())) {
            return null;
        }
        return searchAge2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
