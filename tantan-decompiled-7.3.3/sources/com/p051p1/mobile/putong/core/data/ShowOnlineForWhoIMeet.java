package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class ShowOnlineForWhoIMeet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "showonlineforwhoimeet";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21242id;

    @ProtobufIndex(index = 2)
    public boolean show;
    public static ProtobufAdapter<ShowOnlineForWhoIMeet> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShowOnlineForWhoIMeet>() { // from class: com.p1.mobile.putong.core.data.ShowOnlineForWhoIMeet.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
            String str = showOnlineForWhoIMeet.f21242id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, showOnlineForWhoIMeet.show);
            showOnlineForWhoIMeet.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ShowOnlineForWhoIMeet parse(nc5 nc5Var) throws IOException {
            ShowOnlineForWhoIMeet showOnlineForWhoIMeet = new ShowOnlineForWhoIMeet();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (showOnlineForWhoIMeet.f21242id != null) {
                        break;
                    }
                    showOnlineForWhoIMeet.f21242id = "";
                    break;
                }
                if (iM162497u == 10) {
                    showOnlineForWhoIMeet.f21242id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (showOnlineForWhoIMeet.f21242id != null) {
                            break;
                        }
                        showOnlineForWhoIMeet.f21242id = "";
                        return showOnlineForWhoIMeet;
                    }
                    showOnlineForWhoIMeet.show = nc5Var.m162483g();
                }
            }
            return showOnlineForWhoIMeet;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = showOnlineForWhoIMeet.f21242id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, showOnlineForWhoIMeet.show);
        }
    };
    public static JsonAdapter<ShowOnlineForWhoIMeet> JSON_ADAPTER = new ObjectJsonAdapter<ShowOnlineForWhoIMeet>() { // from class: com.p1.mobile.putong.core.data.ShowOnlineForWhoIMeet.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ShowOnlineForWhoIMeet.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ShowOnlineForWhoIMeet newInstance() {
            return new ShowOnlineForWhoIMeet();
        }

        public boolean parseField(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                showOnlineForWhoIMeet.f21242id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("show")) {
                return false;
            }
            showOnlineForWhoIMeet.show = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("show")) {
                return true;
            }
            return super.parseFieldCheck(showOnlineForWhoIMeet, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, JsonGenerator jsonGenerator) throws IOException {
            String str = showOnlineForWhoIMeet.f21242id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("show", showOnlineForWhoIMeet.show);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShowOnlineForWhoIMeet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShowOnlineForWhoIMeet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShowOnlineForWhoIMeet new_() {
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = new ShowOnlineForWhoIMeet();
        showOnlineForWhoIMeet.nullCheck();
        return showOnlineForWhoIMeet;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ShowOnlineForWhoIMeet mo225055clone() {
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = new ShowOnlineForWhoIMeet();
        showOnlineForWhoIMeet.f21242id = this.f21242id;
        showOnlineForWhoIMeet.show = this.show;
        return showOnlineForWhoIMeet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowOnlineForWhoIMeet)) {
            return false;
        }
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = (ShowOnlineForWhoIMeet) obj;
        return ValueObject.util_equals(this.f21242id, showOnlineForWhoIMeet.f21242id) && this.show == showOnlineForWhoIMeet.show;
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
        String str = this.f21242id;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.show ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21242id == null) {
            this.f21242id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
