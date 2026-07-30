package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ShowLiveForIntlAdUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "showliveforintladuser";

    @ProtobufIndex(index = 1)
    public boolean android;
    public static ProtobufAdapter<ShowLiveForIntlAdUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShowLiveForIntlAdUser>() { // from class: com.p1.mobile.putong.core.data.ShowLiveForIntlAdUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ShowLiveForIntlAdUser showLiveForIntlAdUser) {
            int iB = CodedOutputByteBufferNano.b(1, showLiveForIntlAdUser.android);
            ((MessageNano) showLiveForIntlAdUser).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ShowLiveForIntlAdUser m15605parse(nb5 nb5Var) throws IOException {
            ShowLiveForIntlAdUser showLiveForIntlAdUser = new ShowLiveForIntlAdUser();
            while (nb5Var.u() == 8) {
                showLiveForIntlAdUser.android = nb5Var.g();
            }
            return showLiveForIntlAdUser;
        }

        public void serialize(ShowLiveForIntlAdUser showLiveForIntlAdUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, showLiveForIntlAdUser.android);
        }
    };
    public static JsonAdapter<ShowLiveForIntlAdUser> JSON_ADAPTER = new ObjectJsonAdapter<ShowLiveForIntlAdUser>() { // from class: com.p1.mobile.putong.core.data.ShowLiveForIntlAdUser.2
        public Class getDataClass() {
            return ShowLiveForIntlAdUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ShowLiveForIntlAdUser m15606newInstance() {
            return new ShowLiveForIntlAdUser();
        }

        public boolean parseField(ShowLiveForIntlAdUser showLiveForIntlAdUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(DeviceType.android)) {
                return false;
            }
            showLiveForIntlAdUser.android = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ShowLiveForIntlAdUser showLiveForIntlAdUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(DeviceType.android)) {
                return true;
            }
            return super.parseFieldCheck(showLiveForIntlAdUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ShowLiveForIntlAdUser showLiveForIntlAdUser, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(DeviceType.android, showLiveForIntlAdUser.android);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShowLiveForIntlAdUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShowLiveForIntlAdUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShowLiveForIntlAdUser new_() {
        ShowLiveForIntlAdUser showLiveForIntlAdUser = new ShowLiveForIntlAdUser();
        showLiveForIntlAdUser.nullCheck();
        return showLiveForIntlAdUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ShowLiveForIntlAdUser m15604clone() {
        ShowLiveForIntlAdUser showLiveForIntlAdUser = new ShowLiveForIntlAdUser();
        showLiveForIntlAdUser.android = this.android;
        return showLiveForIntlAdUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ShowLiveForIntlAdUser) && this.android == ((ShowLiveForIntlAdUser) obj).android;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.android ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
