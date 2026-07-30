package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.RemoteDeleteAction;
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
public class RemoteDeleteAction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "remotedeleteaction";

    @Nullable
    @ProtobufIndex(index = 3)
    public List<String> dataDirs;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<String> dataFiles;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<String> externalDirs;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<String> externalFiles;

    @ProtobufIndex(index = 1)
    public int version;
    public static ProtobufAdapter<RemoteDeleteAction> PROTOBUF_ADAPTER = new MessageNanoAdapter<RemoteDeleteAction>() { // from class: com.p1.mobile.putong.data.RemoteDeleteAction.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RemoteDeleteAction remoteDeleteAction) {
            int iH = CodedOutputByteBufferNano.h(1, remoteDeleteAction.version);
            List<String> list = remoteDeleteAction.dataFiles;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = remoteDeleteAction.dataDirs;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = remoteDeleteAction.externalFiles;
            if (list3 != null) {
                iH += CodedOutputByteBufferNano.l(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = remoteDeleteAction.externalDirs;
            if (list4 != null) {
                iH += CodedOutputByteBufferNano.l(5, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) remoteDeleteAction).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RemoteDeleteAction m18905parse(nb5 nb5Var) throws IOException {
            RemoteDeleteAction remoteDeleteAction = new RemoteDeleteAction();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    remoteDeleteAction.version = nb5Var.j();
                } else if (iU == 18) {
                    remoteDeleteAction.dataFiles = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    remoteDeleteAction.dataDirs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    remoteDeleteAction.externalFiles = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 42) {
                        return remoteDeleteAction;
                    }
                    remoteDeleteAction.externalDirs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        public void serialize(RemoteDeleteAction remoteDeleteAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, remoteDeleteAction.version);
            List<String> list = remoteDeleteAction.dataFiles;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = remoteDeleteAction.dataDirs;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = remoteDeleteAction.externalFiles;
            if (list3 != null) {
                codedOutputByteBufferNano.K(4, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = remoteDeleteAction.externalDirs;
            if (list4 != null) {
                codedOutputByteBufferNano.K(5, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RemoteDeleteAction> JSON_ADAPTER = new ObjectJsonAdapter<RemoteDeleteAction>() { // from class: com.p1.mobile.putong.data.RemoteDeleteAction.2
        public Class getDataClass() {
            return RemoteDeleteAction.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RemoteDeleteAction mo17830newInstance() {
            return new RemoteDeleteAction();
        }

        public boolean parseField(RemoteDeleteAction remoteDeleteAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "externalDirs":
                    remoteDeleteAction.externalDirs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "dataFiles":
                    remoteDeleteAction.dataFiles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "externalFiles":
                    remoteDeleteAction.externalFiles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "version":
                    remoteDeleteAction.version = jsonParser.getValueAsInt();
                    return true;
                case "dataDirs":
                    remoteDeleteAction.dataDirs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RemoteDeleteAction remoteDeleteAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "externalDirs":
                case "dataFiles":
                case "externalFiles":
                case "version":
                case "dataDirs":
                    return true;
                default:
                    return super.parseFieldCheck(remoteDeleteAction, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RemoteDeleteAction remoteDeleteAction, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("version", remoteDeleteAction.version);
            if (remoteDeleteAction.dataFiles != null) {
                jsonGenerator.writeFieldName("dataFiles");
                JsonAdapter.serializeArray(remoteDeleteAction.dataFiles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (remoteDeleteAction.dataDirs != null) {
                jsonGenerator.writeFieldName("dataDirs");
                JsonAdapter.serializeArray(remoteDeleteAction.dataDirs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (remoteDeleteAction.externalFiles != null) {
                jsonGenerator.writeFieldName("externalFiles");
                JsonAdapter.serializeArray(remoteDeleteAction.externalFiles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (remoteDeleteAction.externalDirs != null) {
                jsonGenerator.writeFieldName("externalDirs");
                JsonAdapter.serializeArray(remoteDeleteAction.externalDirs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RemoteDeleteAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RemoteDeleteAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m988a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m989b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m990c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m991d(String str) {
        return str;
    }

    public static RemoteDeleteAction new_() {
        RemoteDeleteAction remoteDeleteAction = new RemoteDeleteAction();
        remoteDeleteAction.nullCheck();
        return remoteDeleteAction;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RemoteDeleteAction m18904clone() {
        RemoteDeleteAction remoteDeleteAction = new RemoteDeleteAction();
        remoteDeleteAction.version = this.version;
        List<String> list = this.dataFiles;
        if (list != null) {
            remoteDeleteAction.dataFiles = ValueObject.util_map(list, new w9j() { // from class: l.eqc0
                public final Object call(Object obj) {
                    return RemoteDeleteAction.m989b((String) obj);
                }
            });
        }
        List<String> list2 = this.dataDirs;
        if (list2 != null) {
            remoteDeleteAction.dataDirs = ValueObject.util_map(list2, new w9j() { // from class: l.fqc0
                public final Object call(Object obj) {
                    return RemoteDeleteAction.m990c((String) obj);
                }
            });
        }
        List<String> list3 = this.externalFiles;
        if (list3 != null) {
            remoteDeleteAction.externalFiles = ValueObject.util_map(list3, new w9j() { // from class: l.gqc0
                public final Object call(Object obj) {
                    return RemoteDeleteAction.m988a((String) obj);
                }
            });
        }
        List<String> list4 = this.externalDirs;
        if (list4 != null) {
            remoteDeleteAction.externalDirs = ValueObject.util_map(list4, new w9j() { // from class: l.hqc0
                public final Object call(Object obj) {
                    return RemoteDeleteAction.m991d((String) obj);
                }
            });
        }
        return remoteDeleteAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteDeleteAction)) {
            return false;
        }
        RemoteDeleteAction remoteDeleteAction = (RemoteDeleteAction) obj;
        return this.version == remoteDeleteAction.version && ValueObject.util_equals(this.dataFiles, remoteDeleteAction.dataFiles) && ValueObject.util_equals(this.dataDirs, remoteDeleteAction.dataDirs) && ValueObject.util_equals(this.externalFiles, remoteDeleteAction.externalFiles) && ValueObject.util_equals(this.externalDirs, remoteDeleteAction.externalDirs);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.version) * 41;
        List<String> list = this.dataFiles;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.dataDirs;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.externalFiles;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.externalDirs;
        int iHashCode4 = iHashCode3 + (list4 != null ? list4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
