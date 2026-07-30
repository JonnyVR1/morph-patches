package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.BuildInfoAdditional;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BuildInfoAdditional extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buildinfoadditional";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> installed_apps;
    public static ProtobufAdapter<BuildInfoAdditional> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuildInfoAdditional>() { // from class: com.p1.mobile.putong.data.BuildInfoAdditional.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BuildInfoAdditional buildInfoAdditional) {
            List<String> list = buildInfoAdditional.installed_apps;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) buildInfoAdditional).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BuildInfoAdditional m17787parse(nb5 nb5Var) throws IOException {
            BuildInfoAdditional buildInfoAdditional = new BuildInfoAdditional();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (buildInfoAdditional.installed_apps != null) {
                        break;
                    }
                    buildInfoAdditional.installed_apps = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (buildInfoAdditional.installed_apps != null) {
                        break;
                    }
                    buildInfoAdditional.installed_apps = new ArrayList();
                    return buildInfoAdditional;
                }
                buildInfoAdditional.installed_apps = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return buildInfoAdditional;
        }

        public void serialize(BuildInfoAdditional buildInfoAdditional, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = buildInfoAdditional.installed_apps;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BuildInfoAdditional> JSON_ADAPTER = new ObjectJsonAdapter<BuildInfoAdditional>() { // from class: com.p1.mobile.putong.data.BuildInfoAdditional.2
        public Class getDataClass() {
            return BuildInfoAdditional.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BuildInfoAdditional mo17830newInstance() {
            return new BuildInfoAdditional();
        }

        public boolean parseField(BuildInfoAdditional buildInfoAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("installed_apps")) {
                return false;
            }
            buildInfoAdditional.installed_apps = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BuildInfoAdditional buildInfoAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("installed_apps")) {
                return true;
            }
            return super.parseFieldCheck(buildInfoAdditional, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BuildInfoAdditional buildInfoAdditional, JsonGenerator jsonGenerator) throws IOException {
            if (buildInfoAdditional.installed_apps != null) {
                jsonGenerator.writeFieldName("installed_apps");
                JsonAdapter.serializeArray(buildInfoAdditional.installed_apps, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuildInfoAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuildInfoAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m589a(String str) {
        return str;
    }

    public static BuildInfoAdditional new_() {
        BuildInfoAdditional buildInfoAdditional = new BuildInfoAdditional();
        buildInfoAdditional.nullCheck();
        return buildInfoAdditional;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuildInfoAdditional m17786clone() {
        BuildInfoAdditional buildInfoAdditional = new BuildInfoAdditional();
        List<String> list = this.installed_apps;
        if (list != null) {
            buildInfoAdditional.installed_apps = ValueObject.util_map(list, new w9j() { // from class: l.ch3
                public final Object call(Object obj) {
                    return BuildInfoAdditional.m589a((String) obj);
                }
            });
        }
        return buildInfoAdditional;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BuildInfoAdditional) {
            return ValueObject.util_equals(this.installed_apps, ((BuildInfoAdditional) obj).installed_apps);
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
        List<String> list = this.installed_apps;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.installed_apps == null) {
            this.installed_apps = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
