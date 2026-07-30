package com.p051p1.mobile.putong.core.data;

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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlCampingData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tag_url;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<IntlCampingData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlCampingData intlCampingData) {
            String str = intlCampingData.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = intlCampingData.desc;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = intlCampingData.tag_url;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            intlCampingData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlCampingData parse(nc5 nc5Var) throws IOException {
            IntlCampingData intlCampingData = new IntlCampingData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlCampingData.type == null) {
                        intlCampingData.type = "";
                    }
                    if (intlCampingData.desc == null) {
                        intlCampingData.desc = "";
                    }
                    if (intlCampingData.tag_url != null) {
                        break;
                    }
                    intlCampingData.tag_url = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlCampingData.type = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    intlCampingData.desc = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (intlCampingData.type == null) {
                            intlCampingData.type = "";
                        }
                        if (intlCampingData.desc == null) {
                            intlCampingData.desc = "";
                        }
                        if (intlCampingData.tag_url != null) {
                            break;
                        }
                        intlCampingData.tag_url = "";
                        return intlCampingData;
                    }
                    intlCampingData.tag_url = nc5Var.m162495s();
                }
            }
            return intlCampingData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlCampingData intlCampingData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlCampingData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = intlCampingData.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = intlCampingData.tag_url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<IntlCampingData> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlCampingData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlCampingData newInstance() {
            return new IntlCampingData();
        }

        public boolean parseField(IntlCampingData intlCampingData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tag_url":
                    intlCampingData.tag_url = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    intlCampingData.desc = jsonParser.getValueAsString();
                    return true;
                case "type":
                    intlCampingData.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlCampingData intlCampingData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tag_url":
                case "desc":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(intlCampingData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlCampingData intlCampingData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlCampingData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = intlCampingData.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            String str3 = intlCampingData.tag_url;
            if (str3 != null) {
                jsonGenerator.writeStringField("tag_url", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingData new_() {
        IntlCampingData intlCampingData = new IntlCampingData();
        intlCampingData.nullCheck();
        return intlCampingData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlCampingData mo225055clone() {
        IntlCampingData intlCampingData = new IntlCampingData();
        intlCampingData.type = this.type;
        intlCampingData.desc = this.desc;
        intlCampingData.tag_url = this.tag_url;
        return intlCampingData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingData)) {
            return false;
        }
        IntlCampingData intlCampingData = (IntlCampingData) obj;
        return ValueObject.util_equals(this.type, intlCampingData.type) && ValueObject.util_equals(this.desc, intlCampingData.desc) && ValueObject.util_equals(this.tag_url, intlCampingData.tag_url);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tag_url;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.tag_url == null) {
            this.tag_url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
