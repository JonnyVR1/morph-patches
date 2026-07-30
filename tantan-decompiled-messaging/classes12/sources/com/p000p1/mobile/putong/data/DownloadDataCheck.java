package com.p000p1.mobile.putong.data;

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
public class DownloadDataCheck extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "downloaddatacheck";

    @ProtobufIndex(index = 1)
    public long last_apply_time;
    public static ProtobufAdapter<DownloadDataCheck> PROTOBUF_ADAPTER = new MessageNanoAdapter<DownloadDataCheck>() { // from class: com.p1.mobile.putong.data.DownloadDataCheck.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DownloadDataCheck downloadDataCheck) {
            int iJ = CodedOutputByteBufferNano.j(1, downloadDataCheck.last_apply_time);
            ((MessageNano) downloadDataCheck).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DownloadDataCheck m18004parse(nb5 nb5Var) throws IOException {
            DownloadDataCheck downloadDataCheck = new DownloadDataCheck();
            while (nb5Var.u() == 8) {
                downloadDataCheck.last_apply_time = nb5Var.k();
            }
            return downloadDataCheck;
        }

        public void serialize(DownloadDataCheck downloadDataCheck, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, downloadDataCheck.last_apply_time);
        }
    };
    public static JsonAdapter<DownloadDataCheck> JSON_ADAPTER = new ObjectJsonAdapter<DownloadDataCheck>() { // from class: com.p1.mobile.putong.data.DownloadDataCheck.2
        public Class getDataClass() {
            return DownloadDataCheck.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DownloadDataCheck mo17830newInstance() {
            return new DownloadDataCheck();
        }

        public boolean parseField(DownloadDataCheck downloadDataCheck, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("last_apply_time")) {
                return false;
            }
            downloadDataCheck.last_apply_time = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(DownloadDataCheck downloadDataCheck, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("last_apply_time")) {
                return true;
            }
            return super.parseFieldCheck(downloadDataCheck, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DownloadDataCheck downloadDataCheck, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("last_apply_time", downloadDataCheck.last_apply_time);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DownloadDataCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DownloadDataCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DownloadDataCheck new_() {
        DownloadDataCheck downloadDataCheck = new DownloadDataCheck();
        downloadDataCheck.nullCheck();
        return downloadDataCheck;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DownloadDataCheck m18003clone() {
        DownloadDataCheck downloadDataCheck = new DownloadDataCheck();
        downloadDataCheck.last_apply_time = this.last_apply_time;
        return downloadDataCheck;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DownloadDataCheck) && this.last_apply_time == ((DownloadDataCheck) obj).last_apply_time;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.last_apply_time;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
