package com.p000p1.mobile.putong.account.data;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CaptchaChars extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "captchachars";

    @NonNull
    @ProtobufIndex(index = CameraSticker.STATE_ERROR)
    public String content;

    @ProtobufIndex(index = 1)
    public int height;

    @NonNull
    @ProtobufIndex(index = CameraSticker.STATE_COMPLETE)
    public String type;

    @ProtobufIndex(index = 2)
    public int width;
    public static ProtobufAdapter<CaptchaChars> PROTOBUF_ADAPTER = new MessageNanoAdapter<CaptchaChars>() { // from class: com.p1.mobile.putong.account.data.CaptchaChars.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CaptchaChars captchaChars) {
            int iH = CodedOutputByteBufferNano.h(1, captchaChars.height) + CodedOutputByteBufferNano.h(2, captchaChars.width);
            String str = captchaChars.type;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            String str2 = captchaChars.content;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            ((MessageNano) captchaChars).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CaptchaChars m28911parse(nb5 nb5Var) throws IOException {
            CaptchaChars captchaChars = new CaptchaChars();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (captchaChars.type == null) {
                        captchaChars.type = "";
                    }
                    if (captchaChars.content != null) {
                        break;
                    }
                    captchaChars.content = "";
                    break;
                }
                if (iU == 8) {
                    captchaChars.height = nb5Var.j();
                } else if (iU == 16) {
                    captchaChars.width = nb5Var.j();
                } else if (iU == 26) {
                    captchaChars.type = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (captchaChars.type == null) {
                            captchaChars.type = "";
                        }
                        if (captchaChars.content != null) {
                            break;
                        }
                        captchaChars.content = "";
                        return captchaChars;
                    }
                    captchaChars.content = nb5Var.s();
                }
            }
            return captchaChars;
        }

        public void serialize(CaptchaChars captchaChars, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, captchaChars.height);
            codedOutputByteBufferNano.G(2, captchaChars.width);
            String str = captchaChars.type;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            String str2 = captchaChars.content;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
        }
    };
    public static JsonAdapter<CaptchaChars> JSON_ADAPTER = new ObjectJsonAdapter<CaptchaChars>() { // from class: com.p1.mobile.putong.account.data.CaptchaChars.2
        public Class getDataClass() {
            return CaptchaChars.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CaptchaChars m28912newInstance() {
            return new CaptchaChars();
        }

        public boolean parseField(CaptchaChars captchaChars, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "height":
                    captchaChars.height = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    captchaChars.type = jsonParser.getValueAsString();
                    return true;
                case "width":
                    captchaChars.width = jsonParser.getValueAsInt();
                    return true;
                case "content":
                    captchaChars.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CaptchaChars captchaChars, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "height":
                case "type":
                case "width":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(captchaChars, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CaptchaChars captchaChars, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("height", captchaChars.height);
            jsonGenerator.writeNumberField("width", captchaChars.width);
            String str = captchaChars.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = captchaChars.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CaptchaChars) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CaptchaChars) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CaptchaChars new_() {
        CaptchaChars captchaChars = new CaptchaChars();
        captchaChars.nullCheck();
        return captchaChars;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CaptchaChars m28910clone() {
        CaptchaChars captchaChars = new CaptchaChars();
        captchaChars.height = this.height;
        captchaChars.width = this.width;
        captchaChars.type = this.type;
        captchaChars.content = this.content;
        return captchaChars;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptchaChars)) {
            return false;
        }
        CaptchaChars captchaChars = (CaptchaChars) obj;
        return this.height == captchaChars.height && this.width == captchaChars.width && ValueObject.util_equals(this.type, captchaChars.type) && ValueObject.util_equals(this.content, captchaChars.content);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.height) * 41) + this.width) * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.content == null) {
            this.content = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
