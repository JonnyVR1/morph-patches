package com.p000p1.mobile.putong.feed.data;

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
public class AlbumButton extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "albumbutton";

    @NonNull
    @ProtobufIndex(index = 2)
    public String deepLink;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<AlbumButton> PROTOBUF_ADAPTER = new MessageNanoAdapter<AlbumButton>() { // from class: com.p1.mobile.putong.feed.data.AlbumButton.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AlbumButton albumButton) {
            String str = albumButton.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = albumButton.deepLink;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) albumButton).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AlbumButton m19407parse(nb5 nb5Var) throws IOException {
            AlbumButton albumButton = new AlbumButton();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (albumButton.value == null) {
                        albumButton.value = "";
                    }
                    if (albumButton.deepLink != null) {
                        break;
                    }
                    albumButton.deepLink = "";
                    break;
                }
                if (iU == 10) {
                    albumButton.value = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (albumButton.value == null) {
                            albumButton.value = "";
                        }
                        if (albumButton.deepLink != null) {
                            break;
                        }
                        albumButton.deepLink = "";
                        return albumButton;
                    }
                    albumButton.deepLink = nb5Var.s();
                }
            }
            return albumButton;
        }

        public void serialize(AlbumButton albumButton, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = albumButton.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = albumButton.deepLink;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AlbumButton> JSON_ADAPTER = new ObjectJsonAdapter<AlbumButton>() { // from class: com.p1.mobile.putong.feed.data.AlbumButton.2
        public Class getDataClass() {
            return AlbumButton.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AlbumButton mo17830newInstance() {
            return new AlbumButton();
        }

        public boolean parseField(AlbumButton albumButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("value")) {
                albumButton.value = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("deepLink")) {
                return false;
            }
            albumButton.deepLink = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AlbumButton albumButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("value") || str.equals("deepLink")) {
                return true;
            }
            return super.parseFieldCheck(albumButton, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AlbumButton albumButton, JsonGenerator jsonGenerator) throws IOException {
            String str = albumButton.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = albumButton.deepLink;
            if (str2 != null) {
                jsonGenerator.writeStringField("deepLink", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AlbumButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AlbumButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AlbumButton new_() {
        AlbumButton albumButton = new AlbumButton();
        albumButton.nullCheck();
        return albumButton;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AlbumButton m19406clone() {
        AlbumButton albumButton = new AlbumButton();
        albumButton.value = this.value;
        albumButton.deepLink = this.deepLink;
        return albumButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlbumButton)) {
            return false;
        }
        AlbumButton albumButton = (AlbumButton) obj;
        return ValueObject.util_equals(this.value, albumButton.value) && ValueObject.util_equals(this.deepLink, albumButton.deepLink);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deepLink;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.deepLink == null) {
            this.deepLink = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
