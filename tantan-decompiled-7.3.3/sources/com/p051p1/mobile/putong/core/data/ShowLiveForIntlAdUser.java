package com.p051p1.mobile.putong.core.data;

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
public class ShowLiveForIntlAdUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "showliveforintladuser";

    /* JADX INFO: renamed from: android, reason: collision with root package name */
    @ProtobufIndex(index = 1)
    public boolean f211039android;
    public static ProtobufAdapter<ShowLiveForIntlAdUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShowLiveForIntlAdUser>() { // from class: com.p1.mobile.putong.core.data.ShowLiveForIntlAdUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ShowLiveForIntlAdUser showLiveForIntlAdUser) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, showLiveForIntlAdUser.f211039android);
            showLiveForIntlAdUser.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ShowLiveForIntlAdUser parse(nc5 nc5Var) throws IOException {
            ShowLiveForIntlAdUser showLiveForIntlAdUser = new ShowLiveForIntlAdUser();
            while (nc5Var.m162497u() == 8) {
                showLiveForIntlAdUser.f211039android = nc5Var.m162483g();
            }
            return showLiveForIntlAdUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ShowLiveForIntlAdUser showLiveForIntlAdUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, showLiveForIntlAdUser.f211039android);
        }
    };
    public static JsonAdapter<ShowLiveForIntlAdUser> JSON_ADAPTER = new ObjectJsonAdapter<ShowLiveForIntlAdUser>() { // from class: com.p1.mobile.putong.core.data.ShowLiveForIntlAdUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ShowLiveForIntlAdUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ShowLiveForIntlAdUser newInstance() {
            return new ShowLiveForIntlAdUser();
        }

        public boolean parseField(ShowLiveForIntlAdUser showLiveForIntlAdUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("android")) {
                return false;
            }
            showLiveForIntlAdUser.f211039android = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ShowLiveForIntlAdUser showLiveForIntlAdUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("android")) {
                return true;
            }
            return super.parseFieldCheck(showLiveForIntlAdUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ShowLiveForIntlAdUser showLiveForIntlAdUser, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("android", showLiveForIntlAdUser.f211039android);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShowLiveForIntlAdUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShowLiveForIntlAdUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShowLiveForIntlAdUser new_() {
        ShowLiveForIntlAdUser showLiveForIntlAdUser = new ShowLiveForIntlAdUser();
        showLiveForIntlAdUser.nullCheck();
        return showLiveForIntlAdUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ShowLiveForIntlAdUser mo225055clone() {
        ShowLiveForIntlAdUser showLiveForIntlAdUser = new ShowLiveForIntlAdUser();
        showLiveForIntlAdUser.f211039android = this.f211039android;
        return showLiveForIntlAdUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ShowLiveForIntlAdUser) && this.f211039android == ((ShowLiveForIntlAdUser) obj).f211039android;
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
        int i2 = (i * 41) + (this.f211039android ? 1231 : 1237);
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
