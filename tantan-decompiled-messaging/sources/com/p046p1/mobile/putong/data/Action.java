package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class Action extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "action";

    @NonNull
    @ProtobufIndex(index = 1)
    public String deeplink;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f38719id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<Action> PROTOBUF_ADAPTER = new MessageNanoAdapter<Action>() { // from class: com.p1.mobile.putong.data.Action.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Action action) {
            String str = action.deeplink;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = action.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = action.f38719id;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            action.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Action parse(nb5 nb5Var) throws IOException {
            Action action = new Action();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (action.deeplink == null) {
                        action.deeplink = "";
                    }
                    if (action.value == null) {
                        action.value = "";
                    }
                    if (action.f38719id != null) {
                        break;
                    }
                    action.f38719id = "";
                    break;
                }
                if (iM158752u == 10) {
                    action.deeplink = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    action.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (action.deeplink == null) {
                            action.deeplink = "";
                        }
                        if (action.value == null) {
                            action.value = "";
                        }
                        if (action.f38719id != null) {
                            break;
                        }
                        action.f38719id = "";
                        return action;
                    }
                    action.f38719id = nb5Var.m158750s();
                }
            }
            return action;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Action action, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = action.deeplink;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = action.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = action.f38719id;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<Action> JSON_ADAPTER = new ObjectJsonAdapter<Action>() { // from class: com.p1.mobile.putong.data.Action.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Action.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Action newInstance() {
            return new Action();
        }

        public boolean parseField(Action action, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    action.f38719id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Action action, JsonGenerator jsonGenerator) throws IOException {
            String str = action.deeplink;
            if (str != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str);
            }
            String str2 = action.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            String str3 = action.f38719id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Action) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Action) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Action new_() {
        Action action = new Action();
        action.nullCheck();
        return action;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Action mo223809clone() {
        Action action = new Action();
        action.deeplink = this.deeplink;
        action.value = this.value;
        action.f38719id = this.f38719id;
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
        return ValueObject.util_equals(this.deeplink, action.deeplink) && ValueObject.util_equals(this.value, action.value) && ValueObject.util_equals(this.f38719id, action.f38719id);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "action";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.deeplink;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f38719id;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.f38719id == null) {
            this.f38719id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
