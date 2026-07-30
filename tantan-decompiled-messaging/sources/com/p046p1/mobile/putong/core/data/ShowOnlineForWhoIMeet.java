package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ShowOnlineForWhoIMeet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "showonlineforwhoimeet";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20500id;

    @ProtobufIndex(index = 2)
    public boolean show;
    public static ProtobufAdapter<ShowOnlineForWhoIMeet> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShowOnlineForWhoIMeet>() { // from class: com.p1.mobile.putong.core.data.ShowOnlineForWhoIMeet.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
            String str = showOnlineForWhoIMeet.f20500id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, showOnlineForWhoIMeet.show);
            showOnlineForWhoIMeet.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ShowOnlineForWhoIMeet parse(nb5 nb5Var) throws IOException {
            ShowOnlineForWhoIMeet showOnlineForWhoIMeet = new ShowOnlineForWhoIMeet();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (showOnlineForWhoIMeet.f20500id != null) {
                        break;
                    }
                    showOnlineForWhoIMeet.f20500id = "";
                    break;
                }
                if (iM158752u == 10) {
                    showOnlineForWhoIMeet.f20500id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (showOnlineForWhoIMeet.f20500id != null) {
                            break;
                        }
                        showOnlineForWhoIMeet.f20500id = "";
                        return showOnlineForWhoIMeet;
                    }
                    showOnlineForWhoIMeet.show = nb5Var.m158738g();
                }
            }
            return showOnlineForWhoIMeet;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = showOnlineForWhoIMeet.f20500id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, showOnlineForWhoIMeet.show);
        }
    };
    public static JsonAdapter<ShowOnlineForWhoIMeet> JSON_ADAPTER = new ObjectJsonAdapter<ShowOnlineForWhoIMeet>() { // from class: com.p1.mobile.putong.core.data.ShowOnlineForWhoIMeet.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ShowOnlineForWhoIMeet.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ShowOnlineForWhoIMeet newInstance() {
            return new ShowOnlineForWhoIMeet();
        }

        public boolean parseField(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                showOnlineForWhoIMeet.f20500id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, JsonGenerator jsonGenerator) throws IOException {
            String str = showOnlineForWhoIMeet.f20500id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("show", showOnlineForWhoIMeet.show);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShowOnlineForWhoIMeet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ShowOnlineForWhoIMeet mo223809clone() {
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = new ShowOnlineForWhoIMeet();
        showOnlineForWhoIMeet.f20500id = this.f20500id;
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
        return ValueObject.util_equals(this.f20500id, showOnlineForWhoIMeet.f20500id) && this.show == showOnlineForWhoIMeet.show;
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
        String str = this.f20500id;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.show ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20500id == null) {
            this.f20500id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
