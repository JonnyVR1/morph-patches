package com.p046p1.mobile.putong.feed.data;

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
public class StateWindow extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "statewindow";

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<StateWindow> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateWindow>() { // from class: com.p1.mobile.putong.feed.data.StateWindow.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StateWindow stateWindow) {
            String str = stateWindow.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = stateWindow.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            stateWindow.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StateWindow parse(nb5 nb5Var) throws IOException {
            StateWindow stateWindow = new StateWindow();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (stateWindow.title == null) {
                        stateWindow.title = "";
                    }
                    if (stateWindow.subTitle != null) {
                        break;
                    }
                    stateWindow.subTitle = "";
                    break;
                }
                if (iM158752u == 10) {
                    stateWindow.title = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (stateWindow.title == null) {
                            stateWindow.title = "";
                        }
                        if (stateWindow.subTitle != null) {
                            break;
                        }
                        stateWindow.subTitle = "";
                        return stateWindow;
                    }
                    stateWindow.subTitle = nb5Var.m158750s();
                }
            }
            return stateWindow;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StateWindow stateWindow, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateWindow.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = stateWindow.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<StateWindow> JSON_ADAPTER = new ObjectJsonAdapter<StateWindow>() { // from class: com.p1.mobile.putong.feed.data.StateWindow.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StateWindow.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StateWindow newInstance() {
            return new StateWindow();
        }

        public boolean parseField(StateWindow stateWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subTitle")) {
                stateWindow.subTitle = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            stateWindow.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(StateWindow stateWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("subTitle") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(stateWindow, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StateWindow stateWindow, JsonGenerator jsonGenerator) throws IOException {
            String str = stateWindow.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = stateWindow.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateWindow new_() {
        StateWindow stateWindow = new StateWindow();
        stateWindow.nullCheck();
        return stateWindow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StateWindow mo223809clone() {
        StateWindow stateWindow = new StateWindow();
        stateWindow.title = this.title;
        stateWindow.subTitle = this.subTitle;
        return stateWindow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateWindow)) {
            return false;
        }
        StateWindow stateWindow = (StateWindow) obj;
        return ValueObject.util_equals(this.title, stateWindow.title) && ValueObject.util_equals(this.subTitle, stateWindow.subTitle);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
