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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class CoreFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "corefeed";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21118id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<CoreFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreFeed>() { // from class: com.p1.mobile.putong.core.data.CoreFeed.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreFeed coreFeed) {
            String str = coreFeed.f21118id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = coreFeed.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            coreFeed.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreFeed parse(nc5 nc5Var) throws IOException {
            CoreFeed coreFeed = new CoreFeed();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (coreFeed.f21118id == null) {
                        coreFeed.f21118id = "";
                    }
                    if (coreFeed.type != null) {
                        break;
                    }
                    coreFeed.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    coreFeed.f21118id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (coreFeed.f21118id == null) {
                            coreFeed.f21118id = "";
                        }
                        if (coreFeed.type != null) {
                            break;
                        }
                        coreFeed.type = "";
                        return coreFeed;
                    }
                    coreFeed.type = nc5Var.m162495s();
                }
            }
            return coreFeed;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreFeed coreFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = coreFeed.f21118id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = coreFeed.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<CoreFeed> JSON_ADAPTER = new ObjectJsonAdapter<CoreFeed>() { // from class: com.p1.mobile.putong.core.data.CoreFeed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreFeed.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreFeed newInstance() {
            return new CoreFeed();
        }

        public boolean parseField(CoreFeed coreFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                coreFeed.f21118id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            coreFeed.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CoreFeed coreFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(coreFeed, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreFeed coreFeed, JsonGenerator jsonGenerator) throws IOException {
            String str = coreFeed.f21118id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = coreFeed.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreFeed new_() {
        CoreFeed coreFeed = new CoreFeed();
        coreFeed.nullCheck();
        return coreFeed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreFeed mo225055clone() {
        CoreFeed coreFeed = new CoreFeed();
        coreFeed.f21118id = this.f21118id;
        coreFeed.type = this.type;
        return coreFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreFeed)) {
            return false;
        }
        CoreFeed coreFeed = (CoreFeed) obj;
        return ValueObject.util_equals(this.f21118id, coreFeed.f21118id) && ValueObject.util_equals(this.type, coreFeed.type);
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
        String str = this.f21118id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isKankanFeed() {
        return "kankan".equals(this.type);
    }

    public boolean isMomentFeed() {
        return "moment".equals(this.type);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21118id == null) {
            this.f21118id = "";
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
