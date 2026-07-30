package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Medal;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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

/* JADX INFO: loaded from: classes12.dex */
public class LiveMedals extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livemedals";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Medal> medals;

    @NonNull
    @ProtobufIndex(index = 1)
    public String version;
    public static ProtobufAdapter<LiveMedals> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveMedals>() { // from class: com.p1.mobile.putong.data.LiveMedals.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveMedals liveMedals) {
            String str = liveMedals.version;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<Medal> list = liveMedals.medals;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, Medal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            liveMedals.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveMedals parse(nb5 nb5Var) throws IOException {
            LiveMedals liveMedals = new LiveMedals();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveMedals.version == null) {
                        liveMedals.version = "";
                    }
                    if (liveMedals.medals != null) {
                        break;
                    }
                    liveMedals.medals = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    liveMedals.version = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (liveMedals.version == null) {
                            liveMedals.version = "";
                        }
                        if (liveMedals.medals != null) {
                            break;
                        }
                        liveMedals.medals = new ArrayList();
                        return liveMedals;
                    }
                    liveMedals.medals = (List) nb5Var.m158743l(Medal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return liveMedals;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveMedals liveMedals, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveMedals.version;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<Medal> list = liveMedals.medals;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, Medal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveMedals> JSON_ADAPTER = new ObjectJsonAdapter<LiveMedals>() { // from class: com.p1.mobile.putong.data.LiveMedals.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveMedals.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveMedals newInstance() {
            return new LiveMedals();
        }

        public boolean parseField(LiveMedals liveMedals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("medals")) {
                liveMedals.medals = JsonAdapter.parseArray(jsonParser, Medal.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return false;
            }
            liveMedals.version = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveMedals liveMedals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("medals") || str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return true;
            }
            return super.parseFieldCheck(liveMedals, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveMedals liveMedals, JsonGenerator jsonGenerator) throws IOException {
            String str = liveMedals.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            if (liveMedals.medals != null) {
                jsonGenerator.writeFieldName("medals");
                JsonAdapter.serializeArray(liveMedals.medals, jsonGenerator, Medal.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveMedals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveMedals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveMedals new_() {
        LiveMedals liveMedals = new LiveMedals();
        liveMedals.nullCheck();
        return liveMedals;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveMedals mo223809clone() {
        LiveMedals liveMedals = new LiveMedals();
        liveMedals.version = this.version;
        List<Medal> list = this.medals;
        if (list != null) {
            liveMedals.medals = ValueObject.util_map(list, new w9j() { // from class: l.x1t
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Medal) obj).mo223809clone();
                }
            });
        }
        return liveMedals;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveMedals)) {
            return false;
        }
        LiveMedals liveMedals = (LiveMedals) obj;
        return ValueObject.util_equals(this.version, liveMedals.version) && ValueObject.util_equals(this.medals, liveMedals.medals);
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Medal> list = this.medals;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.medals == null) {
            this.medals = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
