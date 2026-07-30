package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Industries;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ProfessionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "professionconfig";

    /* JADX INFO: renamed from: ch */
    @NonNull
    @ProtobufIndex(index = 1)
    public List<Industries> f21215ch;

    /* JADX INFO: renamed from: eh */
    @NonNull
    @ProtobufIndex(index = 2)
    public List<Industries> f21216eh;
    public static ProtobufAdapter<ProfessionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfessionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfessionConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfessionConfig professionConfig) {
            List<Industries> list = professionConfig.f21215ch;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Industries> list2 = professionConfig.f21216eh;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            professionConfig.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfessionConfig parse(nc5 nc5Var) throws IOException {
            ProfessionConfig professionConfig = new ProfessionConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (professionConfig.f21215ch == null) {
                        professionConfig.f21215ch = new ArrayList();
                    }
                    if (professionConfig.f21216eh != null) {
                        break;
                    }
                    professionConfig.f21216eh = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    professionConfig.f21215ch = (List) nc5Var.m162488l(Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (professionConfig.f21215ch == null) {
                            professionConfig.f21215ch = new ArrayList();
                        }
                        if (professionConfig.f21216eh != null) {
                            break;
                        }
                        professionConfig.f21216eh = new ArrayList();
                        return professionConfig;
                    }
                    professionConfig.f21216eh = (List) nc5Var.m162488l(Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return professionConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfessionConfig professionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Industries> list = professionConfig.f21215ch;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Industries> list2 = professionConfig.f21216eh;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfessionConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfessionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfessionConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfessionConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfessionConfig newInstance() {
            return new ProfessionConfig();
        }

        public boolean parseField(ProfessionConfig professionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("ch")) {
                professionConfig.f21215ch = JsonAdapter.parseArray(jsonParser, Industries.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("eh")) {
                return false;
            }
            professionConfig.f21216eh = JsonAdapter.parseArray(jsonParser, Industries.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfessionConfig professionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ch") || str.equals("eh")) {
                return true;
            }
            return super.parseFieldCheck(professionConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfessionConfig professionConfig, JsonGenerator jsonGenerator) throws IOException {
            if (professionConfig.f21215ch != null) {
                jsonGenerator.writeFieldName("ch");
                JsonAdapter.serializeArray(professionConfig.f21215ch, jsonGenerator, Industries.JSON_ADAPTER);
            }
            if (professionConfig.f21216eh != null) {
                jsonGenerator.writeFieldName("eh");
                JsonAdapter.serializeArray(professionConfig.f21216eh, jsonGenerator, Industries.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfessionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfessionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfessionConfig new_() {
        ProfessionConfig professionConfig = new ProfessionConfig();
        professionConfig.nullCheck();
        return professionConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ProfessionConfig mo225055clone() {
        ProfessionConfig professionConfig = new ProfessionConfig();
        List<Industries> list = this.f21215ch;
        if (list != null) {
            professionConfig.f21215ch = ValueObject.util_map(list, new qcj() { // from class: l.bm90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Industries) obj).mo225055clone();
                }
            });
        }
        List<Industries> list2 = this.f21216eh;
        if (list2 != null) {
            professionConfig.f21216eh = ValueObject.util_map(list2, new qcj() { // from class: l.cm90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Industries) obj).mo225055clone();
                }
            });
        }
        return professionConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfessionConfig)) {
            return false;
        }
        ProfessionConfig professionConfig = (ProfessionConfig) obj;
        return ValueObject.util_equals(this.f21215ch, professionConfig.f21215ch) && ValueObject.util_equals(this.f21216eh, professionConfig.f21216eh);
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
        List<Industries> list = this.f21215ch;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Industries> list2 = this.f21216eh;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21215ch == null) {
            this.f21215ch = new ArrayList();
        }
        if (this.f21216eh == null) {
            this.f21216eh = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
