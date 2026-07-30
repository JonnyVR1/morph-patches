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
public class LimitTimePicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "limittimepicture";

    @ProtobufIndex(index = 1)
    public int duration;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LimitTimePictureStatus status;
    public static ProtobufAdapter<LimitTimePicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<LimitTimePicture>() { // from class: com.p1.mobile.putong.core.data.LimitTimePicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LimitTimePicture limitTimePicture) {
            int iH = CodedOutputByteBufferNano.h(1, limitTimePicture.duration);
            LimitTimePictureStatus limitTimePictureStatus = limitTimePicture.status;
            if (limitTimePictureStatus != null) {
                iH += CodedOutputByteBufferNano.l(2, limitTimePictureStatus, LimitTimePictureStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) limitTimePicture).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LimitTimePicture m13901parse(nb5 nb5Var) throws IOException {
            LimitTimePicture limitTimePicture = new LimitTimePicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (limitTimePicture.status != null) {
                        break;
                    }
                    limitTimePicture.status = (LimitTimePictureStatus) LimitTimePictureStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    limitTimePicture.duration = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (limitTimePicture.status != null) {
                            break;
                        }
                        limitTimePicture.status = (LimitTimePictureStatus) LimitTimePictureStatus.JSON_ADAPTER.defaultEnum();
                        return limitTimePicture;
                    }
                    limitTimePicture.status = (LimitTimePictureStatus) nb5Var.l(LimitTimePictureStatus.PROTOBUF_ADAPTER);
                }
            }
            return limitTimePicture;
        }

        public void serialize(LimitTimePicture limitTimePicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, limitTimePicture.duration);
            LimitTimePictureStatus limitTimePictureStatus = limitTimePicture.status;
            if (limitTimePictureStatus != null) {
                codedOutputByteBufferNano.K(2, limitTimePictureStatus, LimitTimePictureStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LimitTimePicture> JSON_ADAPTER = new ObjectJsonAdapter<LimitTimePicture>() { // from class: com.p1.mobile.putong.core.data.LimitTimePicture.2
        public Class getDataClass() {
            return LimitTimePicture.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LimitTimePicture m13902newInstance() {
            return new LimitTimePicture();
        }

        public boolean parseField(LimitTimePicture limitTimePicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("duration")) {
                limitTimePicture.duration = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("status")) {
                return false;
            }
            limitTimePicture.status = (LimitTimePictureStatus) LimitTimePictureStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(LimitTimePicture limitTimePicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("duration") || str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(limitTimePicture, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LimitTimePicture limitTimePicture, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("duration", limitTimePicture.duration);
            if (limitTimePicture.status != null) {
                jsonGenerator.writeFieldName("status");
                LimitTimePictureStatus.JSON_ADAPTER.serialize(limitTimePicture.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LimitTimePicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LimitTimePicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LimitTimePicture new_() {
        LimitTimePicture limitTimePicture = new LimitTimePicture();
        limitTimePicture.nullCheck();
        return limitTimePicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LimitTimePicture m13900clone() {
        LimitTimePicture limitTimePicture = new LimitTimePicture();
        limitTimePicture.duration = this.duration;
        limitTimePicture.status = this.status;
        return limitTimePicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LimitTimePicture)) {
            return false;
        }
        LimitTimePicture limitTimePicture = (LimitTimePicture) obj;
        return this.duration == limitTimePicture.duration && ValueObject.util_equals(this.status, limitTimePicture.status);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.duration) * 41;
        LimitTimePictureStatus limitTimePictureStatus = this.status;
        int iHashCode = i2 + (limitTimePictureStatus != null ? limitTimePictureStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = (LimitTimePictureStatus) LimitTimePictureStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
