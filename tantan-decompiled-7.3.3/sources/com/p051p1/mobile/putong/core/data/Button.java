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
public class Button extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "button";

    @NonNull
    @ProtobufIndex(index = 2)
    public Shows shows;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<Button> PROTOBUF_ADAPTER = new MessageNanoAdapter<Button>() { // from class: com.p1.mobile.putong.core.data.Button.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Button button) {
            String str = button.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Shows shows = button.shows;
            if (shows != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, shows, Shows.PROTOBUF_ADAPTER);
            }
            button.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Button parse(nc5 nc5Var) throws IOException {
            Button button = new Button();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (button.title == null) {
                        button.title = "";
                    }
                    if (button.shows != null) {
                        break;
                    }
                    button.shows = (Shows) Shows.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    button.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (button.title == null) {
                            button.title = "";
                        }
                        if (button.shows != null) {
                            break;
                        }
                        button.shows = (Shows) Shows.JSON_ADAPTER.defaultEnum();
                        return button;
                    }
                    button.shows = (Shows) nc5Var.m162488l(Shows.PROTOBUF_ADAPTER);
                }
            }
            return button;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Button button, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = button.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Shows shows = button.shows;
            if (shows != null) {
                codedOutputByteBufferNano.m17309K(2, shows, Shows.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Button> JSON_ADAPTER = new ObjectJsonAdapter<Button>() { // from class: com.p1.mobile.putong.core.data.Button.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Button.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Button newInstance() {
            return new Button();
        }

        public boolean parseField(Button button, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("shows")) {
                button.shows = Shows.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            button.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Button button, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("shows") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(button, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Button button, JsonGenerator jsonGenerator) throws IOException {
            String str = button.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            if (button.shows != null) {
                jsonGenerator.writeFieldName("shows");
                Shows.JSON_ADAPTER.serialize(button.shows, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Button) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Button) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Button new_() {
        Button button = new Button();
        button.nullCheck();
        return button;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Button mo225055clone() {
        Button button = new Button();
        button.title = this.title;
        button.shows = this.shows;
        return button;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return ValueObject.util_equals(this.title, button.title) && ValueObject.util_equals(this.shows, button.shows);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "button";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Shows shows = this.shows;
        int iHashCode2 = iHashCode + (shows != null ? shows.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.shows == null) {
            this.shows = (Shows) Shows.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
