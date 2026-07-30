package com.p051p1.mobile.putong.feed.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class ShowAudit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "showaudit";

    @ProtobufIndex(index = 2)
    public boolean comment;

    @ProtobufIndex(index = 1)
    public boolean moment;
    public static ProtobufAdapter<ShowAudit> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShowAudit>() { // from class: com.p1.mobile.putong.feed.data.ShowAudit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ShowAudit showAudit) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, showAudit.moment) + CodedOutputByteBufferNano.m17275b(2, showAudit.comment);
            showAudit.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ShowAudit parse(nc5 nc5Var) throws IOException {
            ShowAudit showAudit = new ShowAudit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    showAudit.moment = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return showAudit;
                    }
                    showAudit.comment = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ShowAudit showAudit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, showAudit.moment);
            codedOutputByteBufferNano.m17299A(2, showAudit.comment);
        }
    };
    public static JsonAdapter<ShowAudit> JSON_ADAPTER = new ObjectJsonAdapter<ShowAudit>() { // from class: com.p1.mobile.putong.feed.data.ShowAudit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ShowAudit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ShowAudit newInstance() {
            return new ShowAudit();
        }

        public boolean parseField(ShowAudit showAudit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("moment")) {
                showAudit.moment = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("comment")) {
                return false;
            }
            showAudit.comment = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ShowAudit showAudit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("moment") || str.equals("comment")) {
                return true;
            }
            return super.parseFieldCheck(showAudit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ShowAudit showAudit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("moment", showAudit.moment);
            jsonGenerator.writeBooleanField("comment", showAudit.comment);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShowAudit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShowAudit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShowAudit new_() {
        ShowAudit showAudit = new ShowAudit();
        showAudit.nullCheck();
        return showAudit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ShowAudit mo225055clone() {
        ShowAudit showAudit = new ShowAudit();
        showAudit.moment = this.moment;
        showAudit.comment = this.comment;
        return showAudit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowAudit)) {
            return false;
        }
        ShowAudit showAudit = (ShowAudit) obj;
        return this.moment == showAudit.moment && this.comment == showAudit.comment;
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
        int i2 = (((i * 41) + (this.moment ? 1231 : 1237)) * 41) + (this.comment ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
