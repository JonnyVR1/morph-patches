package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Industries;
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
public class ProfessionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "professionconfig";

    /* JADX INFO: renamed from: ch */
    @NonNull
    @ProtobufIndex(index = 1)
    public List<Industries> f20473ch;

    /* JADX INFO: renamed from: eh */
    @NonNull
    @ProtobufIndex(index = 2)
    public List<Industries> f20474eh;
    public static ProtobufAdapter<ProfessionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfessionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfessionConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ProfessionConfig professionConfig) {
            List<Industries> list = professionConfig.f20473ch;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Industries> list2 = professionConfig.f20474eh;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            professionConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ProfessionConfig parse(nb5 nb5Var) throws IOException {
            ProfessionConfig professionConfig = new ProfessionConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (professionConfig.f20473ch == null) {
                        professionConfig.f20473ch = new ArrayList();
                    }
                    if (professionConfig.f20474eh != null) {
                        break;
                    }
                    professionConfig.f20474eh = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    professionConfig.f20473ch = (List) nb5Var.m158743l(Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (professionConfig.f20473ch == null) {
                            professionConfig.f20473ch = new ArrayList();
                        }
                        if (professionConfig.f20474eh != null) {
                            break;
                        }
                        professionConfig.f20474eh = new ArrayList();
                        return professionConfig;
                    }
                    professionConfig.f20474eh = (List) nb5Var.m158743l(Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return professionConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ProfessionConfig professionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Industries> list = professionConfig.f20473ch;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Industries> list2 = professionConfig.f20474eh;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfessionConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfessionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfessionConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ProfessionConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ProfessionConfig newInstance() {
            return new ProfessionConfig();
        }

        public boolean parseField(ProfessionConfig professionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("ch")) {
                professionConfig.f20473ch = JsonAdapter.parseArray(jsonParser, Industries.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("eh")) {
                return false;
            }
            professionConfig.f20474eh = JsonAdapter.parseArray(jsonParser, Industries.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfessionConfig professionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ch") || str.equals("eh")) {
                return true;
            }
            return super.parseFieldCheck(professionConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ProfessionConfig professionConfig, JsonGenerator jsonGenerator) throws IOException {
            if (professionConfig.f20473ch != null) {
                jsonGenerator.writeFieldName("ch");
                JsonAdapter.serializeArray(professionConfig.f20473ch, jsonGenerator, Industries.JSON_ADAPTER);
            }
            if (professionConfig.f20474eh != null) {
                jsonGenerator.writeFieldName("eh");
                JsonAdapter.serializeArray(professionConfig.f20474eh, jsonGenerator, Industries.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfessionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ProfessionConfig mo223809clone() {
        ProfessionConfig professionConfig = new ProfessionConfig();
        List<Industries> list = this.f20473ch;
        if (list != null) {
            professionConfig.f20473ch = ValueObject.util_map(list, new w9j() { // from class: l.xd90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Industries) obj).mo223809clone();
                }
            });
        }
        List<Industries> list2 = this.f20474eh;
        if (list2 != null) {
            professionConfig.f20474eh = ValueObject.util_map(list2, new w9j() { // from class: l.yd90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Industries) obj).mo223809clone();
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
        return ValueObject.util_equals(this.f20473ch, professionConfig.f20473ch) && ValueObject.util_equals(this.f20474eh, professionConfig.f20474eh);
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
        List<Industries> list = this.f20473ch;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Industries> list2 = this.f20474eh;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20473ch == null) {
            this.f20473ch = new ArrayList();
        }
        if (this.f20474eh == null) {
            this.f20474eh = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
