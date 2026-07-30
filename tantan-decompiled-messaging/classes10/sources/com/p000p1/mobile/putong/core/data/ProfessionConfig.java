package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Industries;
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
public class ProfessionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "professionconfig";

    /* JADX INFO: renamed from: ch */
    @NonNull
    @ProtobufIndex(index = 1)
    public List<Industries> f135ch;

    /* JADX INFO: renamed from: eh */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Industries> f136eh;
    public static ProtobufAdapter<ProfessionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ProfessionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfessionConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ProfessionConfig professionConfig) {
            List<Industries> list = professionConfig.f135ch;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Industries> list2 = professionConfig.f136eh;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) professionConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ProfessionConfig m14909parse(nb5 nb5Var) throws IOException {
            ProfessionConfig professionConfig = new ProfessionConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (professionConfig.f135ch == null) {
                        professionConfig.f135ch = new ArrayList();
                    }
                    if (professionConfig.f136eh != null) {
                        break;
                    }
                    professionConfig.f136eh = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    professionConfig.f135ch = (List) nb5Var.l(Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (professionConfig.f135ch == null) {
                            professionConfig.f135ch = new ArrayList();
                        }
                        if (professionConfig.f136eh != null) {
                            break;
                        }
                        professionConfig.f136eh = new ArrayList();
                        return professionConfig;
                    }
                    professionConfig.f136eh = (List) nb5Var.l(Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return professionConfig;
        }

        public void serialize(ProfessionConfig professionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Industries> list = professionConfig.f135ch;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Industries> list2 = professionConfig.f136eh;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, Industries.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ProfessionConfig> JSON_ADAPTER = new ObjectJsonAdapter<ProfessionConfig>() { // from class: com.p1.mobile.putong.core.data.ProfessionConfig.2
        public Class getDataClass() {
            return ProfessionConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ProfessionConfig m14910newInstance() {
            return new ProfessionConfig();
        }

        public boolean parseField(ProfessionConfig professionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("ch")) {
                professionConfig.f135ch = JsonAdapter.parseArray(jsonParser, Industries.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("eh")) {
                return false;
            }
            professionConfig.f136eh = JsonAdapter.parseArray(jsonParser, Industries.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ProfessionConfig professionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ch") || str.equals("eh")) {
                return true;
            }
            return super.parseFieldCheck(professionConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ProfessionConfig professionConfig, JsonGenerator jsonGenerator) throws IOException {
            if (professionConfig.f135ch != null) {
                jsonGenerator.writeFieldName("ch");
                JsonAdapter.serializeArray(professionConfig.f135ch, jsonGenerator, Industries.JSON_ADAPTER);
            }
            if (professionConfig.f136eh != null) {
                jsonGenerator.writeFieldName("eh");
                JsonAdapter.serializeArray(professionConfig.f136eh, jsonGenerator, Industries.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ProfessionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ProfessionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ProfessionConfig new_() {
        ProfessionConfig professionConfig = new ProfessionConfig();
        professionConfig.nullCheck();
        return professionConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ProfessionConfig m14908clone() {
        ProfessionConfig professionConfig = new ProfessionConfig();
        List<Industries> list = this.f135ch;
        if (list != null) {
            professionConfig.f135ch = ValueObject.util_map(list, new w9j() { // from class: l.xd90
                public final Object call(Object obj) {
                    return ((Industries) obj).m13456clone();
                }
            });
        }
        List<Industries> list2 = this.f136eh;
        if (list2 != null) {
            professionConfig.f136eh = ValueObject.util_map(list2, new w9j() { // from class: l.yd90
                public final Object call(Object obj) {
                    return ((Industries) obj).m13456clone();
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
        return ValueObject.util_equals(this.f135ch, professionConfig.f135ch) && ValueObject.util_equals(this.f136eh, professionConfig.f136eh);
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
        List<Industries> list = this.f135ch;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Industries> list2 = this.f136eh;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f135ch == null) {
            this.f135ch = new ArrayList();
        }
        if (this.f136eh == null) {
            this.f136eh = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
