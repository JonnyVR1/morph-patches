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
public class SvipWeeklyReportItem extends ValueObject implements Cloneable, Serializable {
    public static String ITEM_TYPE_CARE = "care";
    public static String ITEM_TYPE_CHATWITH = "chatWith";
    public static String ITEM_TYPE_LIKERS = "beLiked";
    public static String ITEM_TYPE_NEW_MATCH = "match";
    public static String ITEM_TYPE_VISITOR = "visitor";
    public static final String TYPE = "svipweeklyreportitem";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String count;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String otherUserID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String userImgUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userName;
    public static ProtobufAdapter<SvipWeeklyReportItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipWeeklyReportItem>() { // from class: com.p1.mobile.putong.core.data.SvipWeeklyReportItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SvipWeeklyReportItem svipWeeklyReportItem) {
            String str = svipWeeklyReportItem.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = svipWeeklyReportItem.count;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = svipWeeklyReportItem.otherUserID;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = svipWeeklyReportItem.userName;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = svipWeeklyReportItem.userImgUrl;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) svipWeeklyReportItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SvipWeeklyReportItem m15854parse(nb5 nb5Var) throws IOException {
            SvipWeeklyReportItem svipWeeklyReportItem = new SvipWeeklyReportItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (svipWeeklyReportItem.type == null) {
                        svipWeeklyReportItem.type = "";
                    }
                    if (svipWeeklyReportItem.count == null) {
                        svipWeeklyReportItem.count = "";
                    }
                    if (svipWeeklyReportItem.otherUserID == null) {
                        svipWeeklyReportItem.otherUserID = "";
                    }
                    if (svipWeeklyReportItem.userName == null) {
                        svipWeeklyReportItem.userName = "";
                    }
                    if (svipWeeklyReportItem.userImgUrl != null) {
                        break;
                    }
                    svipWeeklyReportItem.userImgUrl = "";
                    break;
                }
                if (iU == 10) {
                    svipWeeklyReportItem.type = nb5Var.s();
                } else if (iU == 18) {
                    svipWeeklyReportItem.count = nb5Var.s();
                } else if (iU == 26) {
                    svipWeeklyReportItem.otherUserID = nb5Var.s();
                } else if (iU == 34) {
                    svipWeeklyReportItem.userName = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (svipWeeklyReportItem.type == null) {
                            svipWeeklyReportItem.type = "";
                        }
                        if (svipWeeklyReportItem.count == null) {
                            svipWeeklyReportItem.count = "";
                        }
                        if (svipWeeklyReportItem.otherUserID == null) {
                            svipWeeklyReportItem.otherUserID = "";
                        }
                        if (svipWeeklyReportItem.userName == null) {
                            svipWeeklyReportItem.userName = "";
                        }
                        if (svipWeeklyReportItem.userImgUrl != null) {
                            break;
                        }
                        svipWeeklyReportItem.userImgUrl = "";
                        return svipWeeklyReportItem;
                    }
                    svipWeeklyReportItem.userImgUrl = nb5Var.s();
                }
            }
            return svipWeeklyReportItem;
        }

        public void serialize(SvipWeeklyReportItem svipWeeklyReportItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = svipWeeklyReportItem.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = svipWeeklyReportItem.count;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = svipWeeklyReportItem.otherUserID;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = svipWeeklyReportItem.userName;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = svipWeeklyReportItem.userImgUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<SvipWeeklyReportItem> JSON_ADAPTER = new ObjectJsonAdapter<SvipWeeklyReportItem>() { // from class: com.p1.mobile.putong.core.data.SvipWeeklyReportItem.2
        public Class getDataClass() {
            return SvipWeeklyReportItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SvipWeeklyReportItem m15855newInstance() {
            return new SvipWeeklyReportItem();
        }

        public boolean parseField(SvipWeeklyReportItem svipWeeklyReportItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserID":
                    svipWeeklyReportItem.otherUserID = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    svipWeeklyReportItem.userName = jsonParser.getValueAsString();
                    return true;
                case "type":
                    svipWeeklyReportItem.type = jsonParser.getValueAsString();
                    return true;
                case "count":
                    svipWeeklyReportItem.count = jsonParser.getValueAsString();
                    return true;
                case "userImgUrl":
                    svipWeeklyReportItem.userImgUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SvipWeeklyReportItem svipWeeklyReportItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserID":
                case "userName":
                case "type":
                case "count":
                case "userImgUrl":
                    return true;
                default:
                    return super.parseFieldCheck(svipWeeklyReportItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SvipWeeklyReportItem svipWeeklyReportItem, JsonGenerator jsonGenerator) throws IOException {
            String str = svipWeeklyReportItem.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = svipWeeklyReportItem.count;
            if (str2 != null) {
                jsonGenerator.writeStringField("count", str2);
            }
            String str3 = svipWeeklyReportItem.otherUserID;
            if (str3 != null) {
                jsonGenerator.writeStringField("otherUserID", str3);
            }
            String str4 = svipWeeklyReportItem.userName;
            if (str4 != null) {
                jsonGenerator.writeStringField("userName", str4);
            }
            String str5 = svipWeeklyReportItem.userImgUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("userImgUrl", str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipWeeklyReportItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipWeeklyReportItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipWeeklyReportItem new_() {
        SvipWeeklyReportItem svipWeeklyReportItem = new SvipWeeklyReportItem();
        svipWeeklyReportItem.nullCheck();
        return svipWeeklyReportItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SvipWeeklyReportItem m15853clone() {
        SvipWeeklyReportItem svipWeeklyReportItem = new SvipWeeklyReportItem();
        svipWeeklyReportItem.type = this.type;
        svipWeeklyReportItem.count = this.count;
        svipWeeklyReportItem.otherUserID = this.otherUserID;
        svipWeeklyReportItem.userName = this.userName;
        svipWeeklyReportItem.userImgUrl = this.userImgUrl;
        return svipWeeklyReportItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SvipWeeklyReportItem)) {
            return false;
        }
        SvipWeeklyReportItem svipWeeklyReportItem = (SvipWeeklyReportItem) obj;
        return ValueObject.util_equals(this.type, svipWeeklyReportItem.type) && ValueObject.util_equals(this.count, svipWeeklyReportItem.count) && ValueObject.util_equals(this.otherUserID, svipWeeklyReportItem.otherUserID) && ValueObject.util_equals(this.userName, svipWeeklyReportItem.userName) && ValueObject.util_equals(this.userImgUrl, svipWeeklyReportItem.userImgUrl);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.count;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherUserID;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userImgUrl;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.count == null) {
            this.count = "";
        }
        if (this.otherUserID == null) {
            this.otherUserID = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userImgUrl == null) {
            this.userImgUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
