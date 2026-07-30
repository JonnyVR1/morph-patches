package com.p000p1.mobile.putong.feed.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ShowAudit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "showaudit";

    @ProtobufIndex(index = 2)
    public boolean comment;

    @ProtobufIndex(index = 1)
    public boolean moment;
    public static ProtobufAdapter<ShowAudit> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShowAudit>() { // from class: com.p1.mobile.putong.feed.data.ShowAudit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ShowAudit showAudit) {
            int iB = CodedOutputByteBufferNano.b(1, showAudit.moment) + CodedOutputByteBufferNano.b(2, showAudit.comment);
            ((MessageNano) showAudit).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ShowAudit m19753parse(nb5 nb5Var) throws IOException {
            ShowAudit showAudit = new ShowAudit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    showAudit.moment = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return showAudit;
                    }
                    showAudit.comment = nb5Var.g();
                }
            }
        }

        public void serialize(ShowAudit showAudit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, showAudit.moment);
            codedOutputByteBufferNano.A(2, showAudit.comment);
        }
    };
    public static JsonAdapter<ShowAudit> JSON_ADAPTER = new ObjectJsonAdapter<ShowAudit>() { // from class: com.p1.mobile.putong.feed.data.ShowAudit.2
        public Class getDataClass() {
            return ShowAudit.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ShowAudit mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ShowAudit showAudit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("moment", showAudit.moment);
            jsonGenerator.writeBooleanField("comment", showAudit.comment);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShowAudit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShowAudit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShowAudit new_() {
        ShowAudit showAudit = new ShowAudit();
        showAudit.nullCheck();
        return showAudit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ShowAudit m19752clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.moment ? 1231 : 1237)) * 41) + (this.comment ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
