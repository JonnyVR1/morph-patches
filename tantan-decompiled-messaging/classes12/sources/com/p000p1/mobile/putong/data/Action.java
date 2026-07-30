package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class Action extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "action";

    @NonNull
    @ProtobufIndex(index = 1)
    public String deeplink;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f180id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<Action> PROTOBUF_ADAPTER = new MessageNanoAdapter<Action>() { // from class: com.p1.mobile.putong.data.Action.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Action action) {
            String str = action.deeplink;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = action.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = action.f180id;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) action).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Action m17623parse(nb5 nb5Var) throws IOException {
            Action action = new Action();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (action.deeplink == null) {
                        action.deeplink = "";
                    }
                    if (action.value == null) {
                        action.value = "";
                    }
                    if (action.f180id != null) {
                        break;
                    }
                    action.f180id = "";
                    break;
                }
                if (iU == 10) {
                    action.deeplink = nb5Var.s();
                } else if (iU == 18) {
                    action.value = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (action.deeplink == null) {
                            action.deeplink = "";
                        }
                        if (action.value == null) {
                            action.value = "";
                        }
                        if (action.f180id != null) {
                            break;
                        }
                        action.f180id = "";
                        return action;
                    }
                    action.f180id = nb5Var.s();
                }
            }
            return action;
        }

        public void serialize(Action action, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = action.deeplink;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = action.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = action.f180id;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<Action> JSON_ADAPTER = new ObjectJsonAdapter<Action>() { // from class: com.p1.mobile.putong.data.Action.2
        public Class getDataClass() {
            return Action.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Action mo17830newInstance() {
            return new Action();
        }

        public boolean parseField(Action action, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    action.f180id = jsonParser.getValueAsString();
                    return false;
                case "value":
                    action.value = jsonParser.getValueAsString();
                    return true;
                case "deeplink":
                    action.deeplink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Action action, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "value":
                case "deeplink":
                    return true;
                default:
                    return super.parseFieldCheck(action, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Action action, JsonGenerator jsonGenerator) throws IOException {
            String str = action.deeplink;
            if (str != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str);
            }
            String str2 = action.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            String str3 = action.f180id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Action) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Action) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Action new_() {
        Action action = new Action();
        action.nullCheck();
        return action;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Action m17622clone() {
        Action action = new Action();
        action.deeplink = this.deeplink;
        action.value = this.value;
        action.f180id = this.f180id;
        return action;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return ValueObject.util_equals(this.deeplink, action.deeplink) && ValueObject.util_equals(this.value, action.value) && ValueObject.util_equals(this.f180id, action.f180id);
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
        String str = this.deeplink;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f180id;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.f180id == null) {
            this.f180id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
