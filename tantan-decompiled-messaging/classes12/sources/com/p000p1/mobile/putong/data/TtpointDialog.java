package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.TtpointDialog;
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
public class TtpointDialog extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttpointdialog";

    @ProtobufIndex(index = 2)
    public int mod;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> show;
    public static ProtobufAdapter<TtpointDialog> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtpointDialog>() { // from class: com.p1.mobile.putong.data.TtpointDialog.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TtpointDialog ttpointDialog) {
            List<String> list = ttpointDialog.show;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.h(2, ttpointDialog.mod);
            ((MessageNano) ttpointDialog).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TtpointDialog m19124parse(nb5 nb5Var) throws IOException {
            TtpointDialog ttpointDialog = new TtpointDialog();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (ttpointDialog.show != null) {
                        break;
                    }
                    ttpointDialog.show = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    ttpointDialog.show = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 16) {
                        if (ttpointDialog.show != null) {
                            break;
                        }
                        ttpointDialog.show = new ArrayList();
                        return ttpointDialog;
                    }
                    ttpointDialog.mod = nb5Var.j();
                }
            }
            return ttpointDialog;
        }

        public void serialize(TtpointDialog ttpointDialog, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = ttpointDialog.show;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(2, ttpointDialog.mod);
        }
    };
    public static JsonAdapter<TtpointDialog> JSON_ADAPTER = new ObjectJsonAdapter<TtpointDialog>() { // from class: com.p1.mobile.putong.data.TtpointDialog.2
        public Class getDataClass() {
            return TtpointDialog.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TtpointDialog mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TtpointDialog ttpointDialog, JsonGenerator jsonGenerator) throws IOException {
            if (ttpointDialog.show != null) {
                jsonGenerator.writeFieldName("show");
                JsonAdapter.serializeArray(ttpointDialog.show, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("mod", ttpointDialog.mod);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtpointDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtpointDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1025a(String str) {
        return str;
    }

    public static TtpointDialog new_() {
        TtpointDialog ttpointDialog = new TtpointDialog();
        ttpointDialog.nullCheck();
        return ttpointDialog;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TtpointDialog m19123clone() {
        TtpointDialog ttpointDialog = new TtpointDialog();
        List<String> list = this.show;
        if (list != null) {
            ttpointDialog.show = ValueObject.util_map(list, new w9j() { // from class: l.lcj0
                public final Object call(Object obj) {
                    return TtpointDialog.m1025a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.show;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.mod;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.show == null) {
            this.show = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
