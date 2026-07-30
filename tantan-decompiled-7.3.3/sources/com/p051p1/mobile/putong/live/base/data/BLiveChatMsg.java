package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveChatMsg extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatMsg> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatMsg>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatMsg.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatMsg.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatMsg newInstance() {
            return new BLiveChatMsg();
        }

        public boolean parseField(BLiveChatMsg bLiveChatMsg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userName")) {
                bLiveChatMsg.userName = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("msg")) {
                return false;
            }
            bLiveChatMsg.msg = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatMsg bLiveChatMsg, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveChatMsg.userName;
            if (str != null) {
                jsonGenerator.writeStringField("userName", str);
            }
            String str2 = bLiveChatMsg.msg;
            if (str2 != null) {
                jsonGenerator.writeStringField("msg", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatMsg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatmsg";

    @NonNull
    @ProtobufIndex(index = 2)
    public String msg;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userName;

    public static BLiveChatMsg new_() {
        BLiveChatMsg bLiveChatMsg = new BLiveChatMsg();
        bLiveChatMsg.nullCheck();
        return bLiveChatMsg;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatMsg mo225055clone() {
        BLiveChatMsg bLiveChatMsg = new BLiveChatMsg();
        bLiveChatMsg.userName = this.userName;
        bLiveChatMsg.msg = this.msg;
        return bLiveChatMsg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatMsg)) {
            return false;
        }
        BLiveChatMsg bLiveChatMsg = (BLiveChatMsg) obj;
        return ValueObject.util_equals(this.userName, bLiveChatMsg.userName) && ValueObject.util_equals(this.msg, bLiveChatMsg.msg);
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
        String str = this.userName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.msg;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.msg == null) {
            this.msg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
