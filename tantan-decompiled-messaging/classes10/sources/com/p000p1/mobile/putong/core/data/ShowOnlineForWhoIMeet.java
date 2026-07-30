package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ShowOnlineForWhoIMeet extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "showonlineforwhoimeet";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f162id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean show;
    public static ProtobufAdapter<ShowOnlineForWhoIMeet> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShowOnlineForWhoIMeet>() { // from class: com.p1.mobile.putong.core.data.ShowOnlineForWhoIMeet.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ShowOnlineForWhoIMeet showOnlineForWhoIMeet) {
            String str = showOnlineForWhoIMeet.f162id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, showOnlineForWhoIMeet.show);
            ((MessageNano) showOnlineForWhoIMeet).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ShowOnlineForWhoIMeet m15609parse(nb5 nb5Var) throws IOException {
            ShowOnlineForWhoIMeet showOnlineForWhoIMeet = new ShowOnlineForWhoIMeet();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (showOnlineForWhoIMeet.f162id != null) {
                        break;
                    }
                    showOnlineForWhoIMeet.f162id = "";
                    break;
                }
                if (iU == 10) {
                    showOnlineForWhoIMeet.f162id = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (showOnlineForWhoIMeet.f162id != null) {
                            break;
                        }
                        showOnlineForWhoIMeet.f162id = "";
                        return showOnlineForWhoIMeet;
                    }
                    showOnlineForWhoIMeet.show = nb5Var.g();
                }
            }
            return showOnlineForWhoIMeet;
        }

        public void serialize(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = showOnlineForWhoIMeet.f162id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, showOnlineForWhoIMeet.show);
        }
    };
    public static JsonAdapter<ShowOnlineForWhoIMeet> JSON_ADAPTER = new ObjectJsonAdapter<ShowOnlineForWhoIMeet>() { // from class: com.p1.mobile.putong.core.data.ShowOnlineForWhoIMeet.2
        public Class getDataClass() {
            return ShowOnlineForWhoIMeet.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ShowOnlineForWhoIMeet m15610newInstance() {
            return new ShowOnlineForWhoIMeet();
        }

        public boolean parseField(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                showOnlineForWhoIMeet.f162id = jsonParser.getValueAsString();
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

        public void serializeFields(ShowOnlineForWhoIMeet showOnlineForWhoIMeet, JsonGenerator jsonGenerator) throws IOException {
            String str = showOnlineForWhoIMeet.f162id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeBooleanField("show", showOnlineForWhoIMeet.show);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShowOnlineForWhoIMeet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShowOnlineForWhoIMeet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShowOnlineForWhoIMeet new_() {
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = new ShowOnlineForWhoIMeet();
        showOnlineForWhoIMeet.nullCheck();
        return showOnlineForWhoIMeet;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ShowOnlineForWhoIMeet m15608clone() {
        ShowOnlineForWhoIMeet showOnlineForWhoIMeet = new ShowOnlineForWhoIMeet();
        showOnlineForWhoIMeet.f162id = this.f162id;
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
        return ValueObject.util_equals(this.f162id, showOnlineForWhoIMeet.f162id) && this.show == showOnlineForWhoIMeet.show;
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
        String str = this.f162id;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.show ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f162id == null) {
            this.f162id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
