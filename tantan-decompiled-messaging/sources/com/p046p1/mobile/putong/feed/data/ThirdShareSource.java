package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class ThirdShareSource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdsharesource";

    @NonNull
    @ProtobufIndex(index = 1)
    public String sourceId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sourceType;
    public static ProtobufAdapter<ThirdShareSource> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdShareSource>() { // from class: com.p1.mobile.putong.feed.data.ThirdShareSource.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThirdShareSource thirdShareSource) {
            String str = thirdShareSource.sourceId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = thirdShareSource.sourceType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            thirdShareSource.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThirdShareSource parse(nb5 nb5Var) throws IOException {
            ThirdShareSource thirdShareSource = new ThirdShareSource();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (thirdShareSource.sourceId == null) {
                        thirdShareSource.sourceId = "";
                    }
                    if (thirdShareSource.sourceType != null) {
                        break;
                    }
                    thirdShareSource.sourceType = "";
                    break;
                }
                if (iM158752u == 10) {
                    thirdShareSource.sourceId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (thirdShareSource.sourceId == null) {
                            thirdShareSource.sourceId = "";
                        }
                        if (thirdShareSource.sourceType != null) {
                            break;
                        }
                        thirdShareSource.sourceType = "";
                        return thirdShareSource;
                    }
                    thirdShareSource.sourceType = nb5Var.m158750s();
                }
            }
            return thirdShareSource;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThirdShareSource thirdShareSource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thirdShareSource.sourceId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = thirdShareSource.sourceType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<ThirdShareSource> JSON_ADAPTER = new ObjectJsonAdapter<ThirdShareSource>() { // from class: com.p1.mobile.putong.feed.data.ThirdShareSource.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThirdShareSource.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThirdShareSource newInstance() {
            return new ThirdShareSource();
        }

        public boolean parseField(ThirdShareSource thirdShareSource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("sourceType")) {
                thirdShareSource.sourceType = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("sourceId")) {
                return false;
            }
            thirdShareSource.sourceId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ThirdShareSource thirdShareSource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("sourceType") || str.equals("sourceId")) {
                return true;
            }
            return super.parseFieldCheck(thirdShareSource, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThirdShareSource thirdShareSource, JsonGenerator jsonGenerator) throws IOException {
            String str = thirdShareSource.sourceId;
            if (str != null) {
                jsonGenerator.writeStringField("sourceId", str);
            }
            String str2 = thirdShareSource.sourceType;
            if (str2 != null) {
                jsonGenerator.writeStringField("sourceType", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdShareSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdShareSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdShareSource new_() {
        ThirdShareSource thirdShareSource = new ThirdShareSource();
        thirdShareSource.nullCheck();
        return thirdShareSource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThirdShareSource mo223809clone() {
        ThirdShareSource thirdShareSource = new ThirdShareSource();
        thirdShareSource.sourceId = this.sourceId;
        thirdShareSource.sourceType = this.sourceType;
        return thirdShareSource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdShareSource)) {
            return false;
        }
        ThirdShareSource thirdShareSource = (ThirdShareSource) obj;
        return ValueObject.util_equals(this.sourceId, thirdShareSource.sourceId) && ValueObject.util_equals(this.sourceType, thirdShareSource.sourceType);
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
        String str = this.sourceId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.sourceType;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sourceId == null) {
            this.sourceId = "";
        }
        if (this.sourceType == null) {
            this.sourceType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
