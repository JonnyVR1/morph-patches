package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CardOption;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserAction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useraction";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<CardOption> options;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<UserAction> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserAction>() { // from class: com.p1.mobile.putong.core.data.UserAction.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserAction userAction) {
            String str = userAction.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<CardOption> list = userAction.options;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) userAction).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserAction m16092parse(nb5 nb5Var) throws IOException {
            UserAction userAction = new UserAction();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userAction.userId == null) {
                        userAction.userId = "";
                    }
                    if (userAction.options != null) {
                        break;
                    }
                    userAction.options = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    userAction.userId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (userAction.userId == null) {
                            userAction.userId = "";
                        }
                        if (userAction.options != null) {
                            break;
                        }
                        userAction.options = new ArrayList();
                        return userAction;
                    }
                    userAction.options = (List) nb5Var.l(CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return userAction;
        }

        public void serialize(UserAction userAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userAction.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<CardOption> list = userAction.options;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserAction> JSON_ADAPTER = new ObjectJsonAdapter<UserAction>() { // from class: com.p1.mobile.putong.core.data.UserAction.2
        public Class getDataClass() {
            return UserAction.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserAction m16093newInstance() {
            return new UserAction();
        }

        public boolean parseField(UserAction userAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Options.TYPE)) {
                userAction.options = JsonAdapter.parseArray(jsonParser, CardOption.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("userId")) {
                return false;
            }
            userAction.userId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UserAction userAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Options.TYPE) || str.equals("userId")) {
                return true;
            }
            return super.parseFieldCheck(userAction, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(UserAction userAction, JsonGenerator jsonGenerator) throws IOException {
            String str = userAction.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (userAction.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(userAction.options, jsonGenerator, CardOption.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserAction new_() {
        UserAction userAction = new UserAction();
        userAction.nullCheck();
        return userAction;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserAction m16091clone() {
        UserAction userAction = new UserAction();
        userAction.userId = this.userId;
        List<CardOption> list = this.options;
        if (list != null) {
            userAction.options = ValueObject.util_map(list, new w9j() { // from class: l.kxj0
                public final Object call(Object obj) {
                    return ((CardOption) obj).m11894clone();
                }
            });
        }
        return userAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserAction)) {
            return false;
        }
        UserAction userAction = (UserAction) obj;
        return ValueObject.util_equals(this.userId, userAction.userId) && ValueObject.util_equals(this.options, userAction.options);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<CardOption> list = this.options;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.options == null) {
            this.options = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
