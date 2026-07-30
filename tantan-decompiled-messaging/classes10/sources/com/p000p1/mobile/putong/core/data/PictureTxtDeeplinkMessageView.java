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
public class PictureTxtDeeplinkMessageView extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picturetxtdeeplinkmessageview";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String button;

    @NonNull
    @ProtobufIndex(index = 1)
    public String image;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String imageSize;

    @ProtobufIndex(index = 6)
    public boolean isFullScreen;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;
    public static ProtobufAdapter<PictureTxtDeeplinkMessageView> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureTxtDeeplinkMessageView>() { // from class: com.p1.mobile.putong.core.data.PictureTxtDeeplinkMessageView.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView) {
            String str = pictureTxtDeeplinkMessageView.image;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = pictureTxtDeeplinkMessageView.imageSize;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = pictureTxtDeeplinkMessageView.button;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = pictureTxtDeeplinkMessageView.title;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = pictureTxtDeeplinkMessageView.subTitle;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iB = iO + CodedOutputByteBufferNano.b(6, pictureTxtDeeplinkMessageView.isFullScreen);
            ((MessageNano) pictureTxtDeeplinkMessageView).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PictureTxtDeeplinkMessageView m14797parse(nb5 nb5Var) throws IOException {
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = new PictureTxtDeeplinkMessageView();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (pictureTxtDeeplinkMessageView.image == null) {
                        pictureTxtDeeplinkMessageView.image = "";
                    }
                    if (pictureTxtDeeplinkMessageView.imageSize == null) {
                        pictureTxtDeeplinkMessageView.imageSize = "";
                    }
                    if (pictureTxtDeeplinkMessageView.button == null) {
                        pictureTxtDeeplinkMessageView.button = "";
                    }
                    if (pictureTxtDeeplinkMessageView.title == null) {
                        pictureTxtDeeplinkMessageView.title = "";
                    }
                    if (pictureTxtDeeplinkMessageView.subTitle != null) {
                        break;
                    }
                    pictureTxtDeeplinkMessageView.subTitle = "";
                    break;
                }
                if (iU == 10) {
                    pictureTxtDeeplinkMessageView.image = nb5Var.s();
                } else if (iU == 18) {
                    pictureTxtDeeplinkMessageView.imageSize = nb5Var.s();
                } else if (iU == 26) {
                    pictureTxtDeeplinkMessageView.button = nb5Var.s();
                } else if (iU == 34) {
                    pictureTxtDeeplinkMessageView.title = nb5Var.s();
                } else if (iU == 42) {
                    pictureTxtDeeplinkMessageView.subTitle = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (pictureTxtDeeplinkMessageView.image == null) {
                            pictureTxtDeeplinkMessageView.image = "";
                        }
                        if (pictureTxtDeeplinkMessageView.imageSize == null) {
                            pictureTxtDeeplinkMessageView.imageSize = "";
                        }
                        if (pictureTxtDeeplinkMessageView.button == null) {
                            pictureTxtDeeplinkMessageView.button = "";
                        }
                        if (pictureTxtDeeplinkMessageView.title == null) {
                            pictureTxtDeeplinkMessageView.title = "";
                        }
                        if (pictureTxtDeeplinkMessageView.subTitle != null) {
                            break;
                        }
                        pictureTxtDeeplinkMessageView.subTitle = "";
                        return pictureTxtDeeplinkMessageView;
                    }
                    pictureTxtDeeplinkMessageView.isFullScreen = nb5Var.g();
                }
            }
            return pictureTxtDeeplinkMessageView;
        }

        public void serialize(PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pictureTxtDeeplinkMessageView.image;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = pictureTxtDeeplinkMessageView.imageSize;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = pictureTxtDeeplinkMessageView.button;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = pictureTxtDeeplinkMessageView.title;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = pictureTxtDeeplinkMessageView.subTitle;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.A(6, pictureTxtDeeplinkMessageView.isFullScreen);
        }
    };
    public static JsonAdapter<PictureTxtDeeplinkMessageView> JSON_ADAPTER = new ObjectJsonAdapter<PictureTxtDeeplinkMessageView>() { // from class: com.p1.mobile.putong.core.data.PictureTxtDeeplinkMessageView.2
        public Class getDataClass() {
            return PictureTxtDeeplinkMessageView.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PictureTxtDeeplinkMessageView m14798newInstance() {
            return new PictureTxtDeeplinkMessageView();
        }

        public boolean parseField(PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    pictureTxtDeeplinkMessageView.subTitle = jsonParser.getValueAsString();
                    return true;
                case "button":
                    pictureTxtDeeplinkMessageView.button = jsonParser.getValueAsString();
                    return true;
                case "imageSize":
                    pictureTxtDeeplinkMessageView.imageSize = jsonParser.getValueAsString();
                    return true;
                case "image":
                    pictureTxtDeeplinkMessageView.image = jsonParser.getValueAsString();
                    return true;
                case "title":
                    pictureTxtDeeplinkMessageView.title = jsonParser.getValueAsString();
                    return true;
                case "isFullScreen":
                    pictureTxtDeeplinkMessageView.isFullScreen = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "button":
                case "imageSize":
                case "image":
                case "title":
                case "isFullScreen":
                    return true;
                default:
                    return super.parseFieldCheck(pictureTxtDeeplinkMessageView, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView, JsonGenerator jsonGenerator) throws IOException {
            String str = pictureTxtDeeplinkMessageView.image;
            if (str != null) {
                jsonGenerator.writeStringField("image", str);
            }
            String str2 = pictureTxtDeeplinkMessageView.imageSize;
            if (str2 != null) {
                jsonGenerator.writeStringField("imageSize", str2);
            }
            String str3 = pictureTxtDeeplinkMessageView.button;
            if (str3 != null) {
                jsonGenerator.writeStringField(Button.TYPE, str3);
            }
            String str4 = pictureTxtDeeplinkMessageView.title;
            if (str4 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str4);
            }
            String str5 = pictureTxtDeeplinkMessageView.subTitle;
            if (str5 != null) {
                jsonGenerator.writeStringField("subTitle", str5);
            }
            jsonGenerator.writeBooleanField("isFullScreen", pictureTxtDeeplinkMessageView.isFullScreen);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureTxtDeeplinkMessageView) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureTxtDeeplinkMessageView) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PictureTxtDeeplinkMessageView new_() {
        PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = new PictureTxtDeeplinkMessageView();
        pictureTxtDeeplinkMessageView.nullCheck();
        return pictureTxtDeeplinkMessageView;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PictureTxtDeeplinkMessageView m14796clone() {
        PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = new PictureTxtDeeplinkMessageView();
        pictureTxtDeeplinkMessageView.image = this.image;
        pictureTxtDeeplinkMessageView.imageSize = this.imageSize;
        pictureTxtDeeplinkMessageView.button = this.button;
        pictureTxtDeeplinkMessageView.title = this.title;
        pictureTxtDeeplinkMessageView.subTitle = this.subTitle;
        pictureTxtDeeplinkMessageView.isFullScreen = this.isFullScreen;
        return pictureTxtDeeplinkMessageView;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PictureTxtDeeplinkMessageView)) {
            return false;
        }
        PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = (PictureTxtDeeplinkMessageView) obj;
        return ValueObject.util_equals(this.image, pictureTxtDeeplinkMessageView.image) && ValueObject.util_equals(this.imageSize, pictureTxtDeeplinkMessageView.imageSize) && ValueObject.util_equals(this.button, pictureTxtDeeplinkMessageView.button) && ValueObject.util_equals(this.title, pictureTxtDeeplinkMessageView.title) && ValueObject.util_equals(this.subTitle, pictureTxtDeeplinkMessageView.subTitle) && this.isFullScreen == pictureTxtDeeplinkMessageView.isFullScreen;
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
        String str = this.image;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.imageSize;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.button;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subTitle;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.isFullScreen ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.image == null) {
            this.image = "";
        }
        if (this.imageSize == null) {
            this.imageSize = "";
        }
        if (this.button == null) {
            this.button = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
