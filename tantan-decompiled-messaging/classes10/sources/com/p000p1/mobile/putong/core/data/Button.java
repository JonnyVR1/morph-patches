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
public class Button extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "button";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Shows shows;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<Button> PROTOBUF_ADAPTER = new MessageNanoAdapter<Button>() { // from class: com.p1.mobile.putong.core.data.Button.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Button button) {
            String str = button.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Shows shows = button.shows;
            if (shows != null) {
                iO += CodedOutputByteBufferNano.l(2, shows, Shows.PROTOBUF_ADAPTER);
            }
            ((MessageNano) button).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Button m11827parse(nb5 nb5Var) throws IOException {
            Button button = new Button();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (button.title == null) {
                        button.title = "";
                    }
                    if (button.shows != null) {
                        break;
                    }
                    button.shows = (Shows) Shows.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    button.title = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (button.title == null) {
                            button.title = "";
                        }
                        if (button.shows != null) {
                            break;
                        }
                        button.shows = (Shows) Shows.JSON_ADAPTER.defaultEnum();
                        return button;
                    }
                    button.shows = (Shows) nb5Var.l(Shows.PROTOBUF_ADAPTER);
                }
            }
            return button;
        }

        public void serialize(Button button, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = button.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Shows shows = button.shows;
            if (shows != null) {
                codedOutputByteBufferNano.K(2, shows, Shows.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Button> JSON_ADAPTER = new ObjectJsonAdapter<Button>() { // from class: com.p1.mobile.putong.core.data.Button.2
        public Class getDataClass() {
            return Button.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Button m11828newInstance() {
            return new Button();
        }

        public boolean parseField(Button button, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("shows")) {
                button.shows = (Shows) Shows.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            button.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Button button, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("shows") || str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(button, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Button button, JsonGenerator jsonGenerator) throws IOException {
            String str = button.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            if (button.shows != null) {
                jsonGenerator.writeFieldName("shows");
                Shows.JSON_ADAPTER.serialize(button.shows, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Button) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Button) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Button new_() {
        Button button = new Button();
        button.nullCheck();
        return button;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Button m11826clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Shows shows = this.shows;
        int iHashCode2 = iHashCode + (shows != null ? shows.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.shows == null) {
            this.shows = (Shows) Shows.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
