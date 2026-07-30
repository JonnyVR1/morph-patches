package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GrowthMesUser;
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
public class GrowthMesInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthmesinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String content;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String link;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<GrowthMesUser> mesUsers;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<GrowthMesInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthMesInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthMesInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthMesInfo growthMesInfo) {
            String str = growthMesInfo.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = growthMesInfo.content;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = growthMesInfo.link;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            List<GrowthMesUser> list = growthMesInfo.mesUsers;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, GrowthMesUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) growthMesInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthMesInfo m13135parse(nb5 nb5Var) throws IOException {
            GrowthMesInfo growthMesInfo = new GrowthMesInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (growthMesInfo.title == null) {
                        growthMesInfo.title = "";
                    }
                    if (growthMesInfo.content == null) {
                        growthMesInfo.content = "";
                    }
                    if (growthMesInfo.link == null) {
                        growthMesInfo.link = "";
                    }
                    if (growthMesInfo.mesUsers != null) {
                        break;
                    }
                    growthMesInfo.mesUsers = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    growthMesInfo.title = nb5Var.s();
                } else if (iU == 18) {
                    growthMesInfo.content = nb5Var.s();
                } else if (iU == 26) {
                    growthMesInfo.link = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (growthMesInfo.title == null) {
                            growthMesInfo.title = "";
                        }
                        if (growthMesInfo.content == null) {
                            growthMesInfo.content = "";
                        }
                        if (growthMesInfo.link == null) {
                            growthMesInfo.link = "";
                        }
                        if (growthMesInfo.mesUsers != null) {
                            break;
                        }
                        growthMesInfo.mesUsers = new ArrayList();
                        return growthMesInfo;
                    }
                    growthMesInfo.mesUsers = (List) nb5Var.l(GrowthMesUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return growthMesInfo;
        }

        public void serialize(GrowthMesInfo growthMesInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = growthMesInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = growthMesInfo.content;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = growthMesInfo.link;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            List<GrowthMesUser> list = growthMesInfo.mesUsers;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, GrowthMesUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GrowthMesInfo> JSON_ADAPTER = new ObjectJsonAdapter<GrowthMesInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthMesInfo.2
        public Class getDataClass() {
            return GrowthMesInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthMesInfo m13136newInstance() {
            return new GrowthMesInfo();
        }

        public boolean parseField(GrowthMesInfo growthMesInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "mesUsers":
                    growthMesInfo.mesUsers = JsonAdapter.parseArray(jsonParser, GrowthMesUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "link":
                    growthMesInfo.link = jsonParser.getValueAsString();
                    return true;
                case "title":
                    growthMesInfo.title = jsonParser.getValueAsString();
                    return true;
                case "content":
                    growthMesInfo.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthMesInfo growthMesInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "mesUsers":
                case "link":
                case "title":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(growthMesInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GrowthMesInfo growthMesInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = growthMesInfo.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = growthMesInfo.content;
            if (str2 != null) {
                jsonGenerator.writeStringField(Content.TYPE, str2);
            }
            String str3 = growthMesInfo.link;
            if (str3 != null) {
                jsonGenerator.writeStringField("link", str3);
            }
            if (growthMesInfo.mesUsers != null) {
                jsonGenerator.writeFieldName("mesUsers");
                JsonAdapter.serializeArray(growthMesInfo.mesUsers, jsonGenerator, GrowthMesUser.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthMesInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthMesInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthMesInfo new_() {
        GrowthMesInfo growthMesInfo = new GrowthMesInfo();
        growthMesInfo.nullCheck();
        return growthMesInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthMesInfo m13134clone() {
        GrowthMesInfo growthMesInfo = new GrowthMesInfo();
        growthMesInfo.title = this.title;
        growthMesInfo.content = this.content;
        growthMesInfo.link = this.link;
        List<GrowthMesUser> list = this.mesUsers;
        if (list != null) {
            growthMesInfo.mesUsers = ValueObject.util_map(list, new w9j() { // from class: l.crk
                public final Object call(Object obj) {
                    return ((GrowthMesUser) obj).m13138clone();
                }
            });
        }
        return growthMesInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthMesInfo)) {
            return false;
        }
        GrowthMesInfo growthMesInfo = (GrowthMesInfo) obj;
        return ValueObject.util_equals(this.title, growthMesInfo.title) && ValueObject.util_equals(this.content, growthMesInfo.content) && ValueObject.util_equals(this.link, growthMesInfo.link) && ValueObject.util_equals(this.mesUsers, growthMesInfo.mesUsers);
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
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.link;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<GrowthMesUser> list = this.mesUsers;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.link == null) {
            this.link = "";
        }
        if (this.mesUsers == null) {
            this.mesUsers = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
