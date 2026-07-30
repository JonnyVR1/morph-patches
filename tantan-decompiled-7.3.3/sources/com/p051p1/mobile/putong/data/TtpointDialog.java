package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.TtpointDialog;
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
public class TtpointDialog extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttpointdialog";

    @ProtobufIndex(index = 2)
    public int mod;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> show;
    public static ProtobufAdapter<TtpointDialog> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtpointDialog>() { // from class: com.p1.mobile.putong.data.TtpointDialog.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TtpointDialog ttpointDialog) {
            List<String> list = ttpointDialog.show;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17281h(2, ttpointDialog.mod);
            ttpointDialog.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TtpointDialog parse(nc5 nc5Var) throws IOException {
            TtpointDialog ttpointDialog = new TtpointDialog();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (ttpointDialog.show != null) {
                        break;
                    }
                    ttpointDialog.show = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    ttpointDialog.show = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 16) {
                        if (ttpointDialog.show != null) {
                            break;
                        }
                        ttpointDialog.show = new ArrayList();
                        return ttpointDialog;
                    }
                    ttpointDialog.mod = nc5Var.m162486j();
                }
            }
            return ttpointDialog;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TtpointDialog ttpointDialog, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = ttpointDialog.show;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(2, ttpointDialog.mod);
        }
    };
    public static JsonAdapter<TtpointDialog> JSON_ADAPTER = new ObjectJsonAdapter<TtpointDialog>() { // from class: com.p1.mobile.putong.data.TtpointDialog.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TtpointDialog.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TtpointDialog newInstance() {
            return new TtpointDialog();
        }

        public boolean parseField(TtpointDialog ttpointDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("mod")) {
                ttpointDialog.mod = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("show")) {
                return false;
            }
            ttpointDialog.show = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TtpointDialog ttpointDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("mod") || str.equals("show")) {
                return true;
            }
            return super.parseFieldCheck(ttpointDialog, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TtpointDialog ttpointDialog, JsonGenerator jsonGenerator) throws IOException {
            if (ttpointDialog.show != null) {
                jsonGenerator.writeFieldName("show");
                JsonAdapter.serializeArray(ttpointDialog.show, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("mod", ttpointDialog.mod);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtpointDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtpointDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61291a(String str) {
        return str;
    }

    public static TtpointDialog new_() {
        TtpointDialog ttpointDialog = new TtpointDialog();
        ttpointDialog.nullCheck();
        return ttpointDialog;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TtpointDialog mo225055clone() {
        TtpointDialog ttpointDialog = new TtpointDialog();
        List<String> list = this.show;
        if (list != null) {
            ttpointDialog.show = ValueObject.util_map(list, new qcj() { // from class: l.plj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return TtpointDialog.m61291a((String) obj);
                }
            });
        }
        ttpointDialog.mod = this.mod;
        return ttpointDialog;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtpointDialog)) {
            return false;
        }
        TtpointDialog ttpointDialog = (TtpointDialog) obj;
        return ValueObject.util_equals(this.show, ttpointDialog.show) && this.mod == ttpointDialog.mod;
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
        List<String> list = this.show;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.mod;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.show == null) {
            this.show = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
