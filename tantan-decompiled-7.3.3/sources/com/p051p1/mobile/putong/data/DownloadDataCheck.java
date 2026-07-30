package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class DownloadDataCheck extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "downloaddatacheck";

    @ProtobufIndex(index = 1)
    public long last_apply_time;
    public static ProtobufAdapter<DownloadDataCheck> PROTOBUF_ADAPTER = new MessageNanoAdapter<DownloadDataCheck>() { // from class: com.p1.mobile.putong.data.DownloadDataCheck.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DownloadDataCheck downloadDataCheck) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, downloadDataCheck.last_apply_time);
            downloadDataCheck.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DownloadDataCheck parse(nc5 nc5Var) throws IOException {
            DownloadDataCheck downloadDataCheck = new DownloadDataCheck();
            while (nc5Var.m162497u() == 8) {
                downloadDataCheck.last_apply_time = nc5Var.m162487k();
            }
            return downloadDataCheck;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DownloadDataCheck downloadDataCheck, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, downloadDataCheck.last_apply_time);
        }
    };
    public static JsonAdapter<DownloadDataCheck> JSON_ADAPTER = new ObjectJsonAdapter<DownloadDataCheck>() { // from class: com.p1.mobile.putong.data.DownloadDataCheck.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DownloadDataCheck.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DownloadDataCheck newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DownloadDataCheck downloadDataCheck, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("last_apply_time", downloadDataCheck.last_apply_time);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DownloadDataCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DownloadDataCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DownloadDataCheck new_() {
        DownloadDataCheck downloadDataCheck = new DownloadDataCheck();
        downloadDataCheck.nullCheck();
        return downloadDataCheck;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DownloadDataCheck mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.last_apply_time;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
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
