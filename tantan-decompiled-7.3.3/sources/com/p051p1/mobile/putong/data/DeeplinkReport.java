package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.DeeplinkReport;
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

/* JADX INFO: loaded from: classes12.dex */
public class DeeplinkReport extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "deeplinkreport";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> appInstall;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> appNoInstall;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> failed;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> success;
    public static ProtobufAdapter<DeeplinkReport> PROTOBUF_ADAPTER = new MessageNanoAdapter<DeeplinkReport>() { // from class: com.p1.mobile.putong.data.DeeplinkReport.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DeeplinkReport deeplinkReport) {
            List<String> list = deeplinkReport.appInstall;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = deeplinkReport.appNoInstall;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = deeplinkReport.success;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = deeplinkReport.failed;
            if (list4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            deeplinkReport.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DeeplinkReport parse(nc5 nc5Var) throws IOException {
            DeeplinkReport deeplinkReport = new DeeplinkReport();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (deeplinkReport.appInstall == null) {
                        deeplinkReport.appInstall = new ArrayList();
                    }
                    if (deeplinkReport.appNoInstall == null) {
                        deeplinkReport.appNoInstall = new ArrayList();
                    }
                    if (deeplinkReport.success == null) {
                        deeplinkReport.success = new ArrayList();
                    }
                    if (deeplinkReport.failed != null) {
                        break;
                    }
                    deeplinkReport.failed = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    deeplinkReport.appInstall = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    deeplinkReport.appNoInstall = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 26) {
                    deeplinkReport.success = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 34) {
                        if (deeplinkReport.appInstall == null) {
                            deeplinkReport.appInstall = new ArrayList();
                        }
                        if (deeplinkReport.appNoInstall == null) {
                            deeplinkReport.appNoInstall = new ArrayList();
                        }
                        if (deeplinkReport.success == null) {
                            deeplinkReport.success = new ArrayList();
                        }
                        if (deeplinkReport.failed != null) {
                            break;
                        }
                        deeplinkReport.failed = new ArrayList();
                        return deeplinkReport;
                    }
                    deeplinkReport.failed = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return deeplinkReport;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DeeplinkReport deeplinkReport, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = deeplinkReport.appInstall;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = deeplinkReport.appNoInstall;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = deeplinkReport.success;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = deeplinkReport.failed;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DeeplinkReport> JSON_ADAPTER = new ObjectJsonAdapter<DeeplinkReport>() { // from class: com.p1.mobile.putong.data.DeeplinkReport.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DeeplinkReport.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DeeplinkReport newInstance() {
            return new DeeplinkReport();
        }

        public boolean parseField(DeeplinkReport deeplinkReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "success":
                    deeplinkReport.success = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "failed":
                    deeplinkReport.failed = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "appInstall":
                    deeplinkReport.appInstall = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "appNoInstall":
                    deeplinkReport.appNoInstall = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DeeplinkReport deeplinkReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "success":
                case "failed":
                case "appInstall":
                case "appNoInstall":
                    return true;
                default:
                    return super.parseFieldCheck(deeplinkReport, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DeeplinkReport deeplinkReport, JsonGenerator jsonGenerator) throws IOException {
            if (deeplinkReport.appInstall != null) {
                jsonGenerator.writeFieldName("appInstall");
                JsonAdapter.serializeArray(deeplinkReport.appInstall, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (deeplinkReport.appNoInstall != null) {
                jsonGenerator.writeFieldName("appNoInstall");
                JsonAdapter.serializeArray(deeplinkReport.appNoInstall, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (deeplinkReport.success != null) {
                jsonGenerator.writeFieldName("success");
                JsonAdapter.serializeArray(deeplinkReport.success, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (deeplinkReport.failed != null) {
                jsonGenerator.writeFieldName("failed");
                JsonAdapter.serializeArray(deeplinkReport.failed, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DeeplinkReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DeeplinkReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60919a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60920b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m60921c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m60922d(String str) {
        return str;
    }

    public static DeeplinkReport new_() {
        DeeplinkReport deeplinkReport = new DeeplinkReport();
        deeplinkReport.nullCheck();
        return deeplinkReport;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DeeplinkReport mo225055clone() {
        DeeplinkReport deeplinkReport = new DeeplinkReport();
        List<String> list = this.appInstall;
        if (list != null) {
            deeplinkReport.appInstall = ValueObject.util_map(list, new qcj() { // from class: l.djd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return DeeplinkReport.m60921c((String) obj);
                }
            });
        }
        List<String> list2 = this.appNoInstall;
        if (list2 != null) {
            deeplinkReport.appNoInstall = ValueObject.util_map(list2, new qcj() { // from class: l.ejd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return DeeplinkReport.m60919a((String) obj);
                }
            });
        }
        List<String> list3 = this.success;
        if (list3 != null) {
            deeplinkReport.success = ValueObject.util_map(list3, new qcj() { // from class: l.fjd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return DeeplinkReport.m60922d((String) obj);
                }
            });
        }
        List<String> list4 = this.failed;
        if (list4 != null) {
            deeplinkReport.failed = ValueObject.util_map(list4, new qcj() { // from class: l.gjd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return DeeplinkReport.m60920b((String) obj);
                }
            });
        }
        return deeplinkReport;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeeplinkReport)) {
            return false;
        }
        DeeplinkReport deeplinkReport = (DeeplinkReport) obj;
        return ValueObject.util_equals(this.appInstall, deeplinkReport.appInstall) && ValueObject.util_equals(this.appNoInstall, deeplinkReport.appNoInstall) && ValueObject.util_equals(this.success, deeplinkReport.success) && ValueObject.util_equals(this.failed, deeplinkReport.failed);
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
        List<String> list = this.appInstall;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.appNoInstall;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.success;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.failed;
        int iHashCode4 = iHashCode3 + (list4 != null ? list4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.appInstall == null) {
            this.appInstall = new ArrayList();
        }
        if (this.appNoInstall == null) {
            this.appNoInstall = new ArrayList();
        }
        if (this.success == null) {
            this.success = new ArrayList();
        }
        if (this.failed == null) {
            this.failed = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
