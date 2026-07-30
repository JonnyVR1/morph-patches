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
public class VisitorStatistics extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitorstatistics";

    @NonNull
    @ProtobufIndex(index = 1)
    public String count;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<VisitorStatistics> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorStatistics>() { // from class: com.p1.mobile.putong.data.VisitorStatistics.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitorStatistics visitorStatistics) {
            String str = visitorStatistics.count;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = visitorStatistics.text;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = visitorStatistics.type;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            visitorStatistics.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitorStatistics parse(nc5 nc5Var) throws IOException {
            VisitorStatistics visitorStatistics = new VisitorStatistics();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (visitorStatistics.count == null) {
                        visitorStatistics.count = "";
                    }
                    if (visitorStatistics.text == null) {
                        visitorStatistics.text = "";
                    }
                    if (visitorStatistics.type != null) {
                        break;
                    }
                    visitorStatistics.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    visitorStatistics.count = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    visitorStatistics.text = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (visitorStatistics.count == null) {
                            visitorStatistics.count = "";
                        }
                        if (visitorStatistics.text == null) {
                            visitorStatistics.text = "";
                        }
                        if (visitorStatistics.type != null) {
                            break;
                        }
                        visitorStatistics.type = "";
                        return visitorStatistics;
                    }
                    visitorStatistics.type = nc5Var.m162495s();
                }
            }
            return visitorStatistics;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitorStatistics visitorStatistics, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = visitorStatistics.count;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = visitorStatistics.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = visitorStatistics.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<VisitorStatistics> JSON_ADAPTER = new ObjectJsonAdapter<VisitorStatistics>() { // from class: com.p1.mobile.putong.data.VisitorStatistics.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitorStatistics.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitorStatistics newInstance() {
            return new VisitorStatistics();
        }

        public boolean parseField(VisitorStatistics visitorStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "text":
                    visitorStatistics.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    visitorStatistics.type = jsonParser.getValueAsString();
                    return true;
                case "count":
                    visitorStatistics.count = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitorStatistics visitorStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "text":
                case "type":
                case "count":
                    return true;
                default:
                    return super.parseFieldCheck(visitorStatistics, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitorStatistics visitorStatistics, JsonGenerator jsonGenerator) throws IOException {
            String str = visitorStatistics.count;
            if (str != null) {
                jsonGenerator.writeStringField("count", str);
            }
            String str2 = visitorStatistics.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = visitorStatistics.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorStatistics new_() {
        VisitorStatistics visitorStatistics = new VisitorStatistics();
        visitorStatistics.nullCheck();
        return visitorStatistics;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitorStatistics mo225055clone() {
        VisitorStatistics visitorStatistics = new VisitorStatistics();
        visitorStatistics.count = this.count;
        visitorStatistics.text = this.text;
        visitorStatistics.type = this.type;
        return visitorStatistics;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorStatistics)) {
            return false;
        }
        VisitorStatistics visitorStatistics = (VisitorStatistics) obj;
        return ValueObject.util_equals(this.count, visitorStatistics.count) && ValueObject.util_equals(this.text, visitorStatistics.text) && ValueObject.util_equals(this.type, visitorStatistics.type);
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
        String str = this.count;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.count == null) {
            this.count = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
