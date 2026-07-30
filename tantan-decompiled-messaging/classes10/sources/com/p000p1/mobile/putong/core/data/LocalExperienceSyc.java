package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.LocalExperienceSyc;
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
public class LocalExperienceSyc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "localexperiencesyc";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> groups;
    public static ProtobufAdapter<LocalExperienceSyc> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocalExperienceSyc>() { // from class: com.p1.mobile.putong.core.data.LocalExperienceSyc.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LocalExperienceSyc localExperienceSyc) {
            List<String> list = localExperienceSyc.groups;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) localExperienceSyc).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LocalExperienceSyc m13955parse(nb5 nb5Var) throws IOException {
            LocalExperienceSyc localExperienceSyc = new LocalExperienceSyc();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (localExperienceSyc.groups != null) {
                        break;
                    }
                    localExperienceSyc.groups = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (localExperienceSyc.groups != null) {
                        break;
                    }
                    localExperienceSyc.groups = new ArrayList();
                    return localExperienceSyc;
                }
                localExperienceSyc.groups = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return localExperienceSyc;
        }

        public void serialize(LocalExperienceSyc localExperienceSyc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = localExperienceSyc.groups;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LocalExperienceSyc> JSON_ADAPTER = new ObjectJsonAdapter<LocalExperienceSyc>() { // from class: com.p1.mobile.putong.core.data.LocalExperienceSyc.2
        public Class getDataClass() {
            return LocalExperienceSyc.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LocalExperienceSyc m13956newInstance() {
            return new LocalExperienceSyc();
        }

        public boolean parseField(LocalExperienceSyc localExperienceSyc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("groups")) {
                return false;
            }
            localExperienceSyc.groups = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LocalExperienceSyc localExperienceSyc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("groups")) {
                return true;
            }
            return super.parseFieldCheck(localExperienceSyc, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LocalExperienceSyc localExperienceSyc, JsonGenerator jsonGenerator) throws IOException {
            if (localExperienceSyc.groups != null) {
                jsonGenerator.writeFieldName("groups");
                JsonAdapter.serializeArray(localExperienceSyc.groups, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocalExperienceSyc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocalExperienceSyc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m453a(String str) {
        return str;
    }

    public static LocalExperienceSyc new_() {
        LocalExperienceSyc localExperienceSyc = new LocalExperienceSyc();
        localExperienceSyc.nullCheck();
        return localExperienceSyc;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocalExperienceSyc m13954clone() {
        LocalExperienceSyc localExperienceSyc = new LocalExperienceSyc();
        List<String> list = this.groups;
        if (list != null) {
            localExperienceSyc.groups = ValueObject.util_map(list, new w9j() { // from class: l.fsv
                public final Object call(Object obj) {
                    return LocalExperienceSyc.m453a((String) obj);
                }
            });
        }
        return localExperienceSyc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalExperienceSyc) {
            return ValueObject.util_equals(this.groups, ((LocalExperienceSyc) obj).groups);
        }
        return false;
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
        List<String> list = this.groups;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
