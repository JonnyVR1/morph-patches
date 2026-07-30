package com.p000p1.mobile.putong.feed.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Action;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.Settings;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.tenum.TEnumColumn;
import com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.w9j;
import p007l.mrf0;
import p007l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentActivity extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "momentactivity";

    @ProtobufIndex(index = 60)
    public boolean acceptGift;

    @NonNull
    @ProtobufIndex(index = 54)
    public ActivityActionApi action;

    @NonNull
    @ProtobufIndex(index = 53)
    public String actors;

    @ProtobufIndex(index = 65)
    public int count;

    @ProtobufIndex(index = 57)
    public double createdTime;
    public Media media;

    @NonNull
    @ProtobufIndex(index = 58)
    public String messageid;

    @NonNull
    @ProtobufIndex(index = 52)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 62)
    public String parentMessageid;

    @ProtobufIndex(index = 55)
    public boolean read;

    @NonNull
    @ProtobufIndex(index = 56)
    public MomentIdBoxed reference;

    @NonNull
    @ProtobufIndex(index = 63)
    public String replyMessageId;
    public StickerInfo replyStickerInfo;

    @NonNull
    @ProtobufIndex(index = 59)
    public ActivitySetting settings;
    public StickerInfo stickerInfo;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO)
    public List<String> userIds;

    @NonNull
    @ProtobufIndex(index = 51)
    public String value;
    public static ProtobufAdapter<MomentActivity> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentActivity>() { // from class: com.p1.mobile.putong.feed.data.MomentActivity.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentActivity momentActivity) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) momentActivity)._id);
            String str = ((DbObject) momentActivity).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = momentActivity.value;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = momentActivity.owner;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            String str4 = momentActivity.actors;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(53, str4);
            }
            ActivityActionApi activityActionApi = momentActivity.action;
            if (activityActionApi != null) {
                iJ += CodedOutputByteBufferNano.h(54, activityActionApi.ordinal());
            }
            int iB = iJ + CodedOutputByteBufferNano.b(55, momentActivity.read);
            MomentIdBoxed momentIdBoxed = momentActivity.reference;
            if (momentIdBoxed != null) {
                iB += CodedOutputByteBufferNano.l(56, momentIdBoxed, MomentIdBoxed.PROTOBUF_ADAPTER);
            }
            int iD = iB + CodedOutputByteBufferNano.d(57, momentActivity.createdTime);
            String str5 = momentActivity.messageid;
            if (str5 != null) {
                iD += CodedOutputByteBufferNano.o(58, str5);
            }
            ActivitySetting activitySetting = momentActivity.settings;
            if (activitySetting != null) {
                iD += CodedOutputByteBufferNano.l(59, activitySetting, ActivitySetting.PROTOBUF_ADAPTER);
            }
            int iB2 = iD + CodedOutputByteBufferNano.b(60, momentActivity.acceptGift);
            ActivityActionApi activityActionApi2 = momentActivity.action;
            if (activityActionApi2 != null) {
                iB2 += CodedOutputByteBufferNano.l(61, activityActionApi2, ActivityActionApi.PROTOBUF_ADAPTER);
            }
            String str6 = momentActivity.parentMessageid;
            if (str6 != null) {
                iB2 += CodedOutputByteBufferNano.o(62, str6);
            }
            String str7 = momentActivity.replyMessageId;
            if (str7 != null) {
                iB2 += CodedOutputByteBufferNano.o(63, str7);
            }
            List<String> list = momentActivity.userIds;
            if (list != null) {
                iB2 += CodedOutputByteBufferNano.l(64, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iB2 + CodedOutputByteBufferNano.h(65, momentActivity.count);
            ((MessageNano) momentActivity).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentActivity m19596parse(nb5 nb5Var) throws IOException {
            MomentActivity momentActivity = new MomentActivity();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (momentActivity.action == null && numValueOf != null) {
                            momentActivity.action = (ActivityActionApi) ActivityActionApi.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (momentActivity.value == null) {
                            momentActivity.value = "";
                        }
                        if (momentActivity.owner == null) {
                            momentActivity.owner = "";
                        }
                        if (momentActivity.actors == null) {
                            momentActivity.actors = "";
                        }
                        if (momentActivity.action == null) {
                            momentActivity.action = (ActivityActionApi) ActivityActionApi.JSON_ADAPTER.defaultEnum();
                        }
                        if (momentActivity.reference == null) {
                            momentActivity.reference = MomentIdBoxed.new_();
                        }
                        if (momentActivity.messageid == null) {
                            momentActivity.messageid = "";
                        }
                        if (momentActivity.settings == null) {
                            momentActivity.settings = ActivitySetting.new_();
                        }
                        if (momentActivity.parentMessageid == null) {
                            momentActivity.parentMessageid = "";
                        }
                        if (momentActivity.replyMessageId == null) {
                            momentActivity.replyMessageId = "";
                        }
                        if (momentActivity.userIds == null) {
                            momentActivity.userIds = new ArrayList();
                        }
                        break;
                    case 8:
                        ((DbObject) momentActivity)._id = nb5Var.k();
                        continue;
                    case 18:
                        ((DbObject) momentActivity).id = nb5Var.s();
                        continue;
                    case 410:
                        momentActivity.value = nb5Var.s();
                        continue;
                    case 418:
                        momentActivity.owner = nb5Var.s();
                        continue;
                    case 426:
                        momentActivity.actors = nb5Var.s();
                        continue;
                    case 432:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 440:
                        momentActivity.read = nb5Var.g();
                        continue;
                    case 450:
                        momentActivity.reference = (MomentIdBoxed) nb5Var.l(MomentIdBoxed.PROTOBUF_ADAPTER);
                        continue;
                    case 457:
                        momentActivity.createdTime = nb5Var.h();
                        continue;
                    case 466:
                        momentActivity.messageid = nb5Var.s();
                        continue;
                    case 474:
                        momentActivity.settings = (ActivitySetting) nb5Var.l(ActivitySetting.PROTOBUF_ADAPTER);
                        continue;
                    case 480:
                        momentActivity.acceptGift = nb5Var.g();
                        continue;
                    case 490:
                        momentActivity.action = (ActivityActionApi) nb5Var.l(ActivityActionApi.PROTOBUF_ADAPTER);
                        continue;
                    case 498:
                        momentActivity.parentMessageid = nb5Var.s();
                        continue;
                    case 506:
                        momentActivity.replyMessageId = nb5Var.s();
                        continue;
                    case 514:
                        momentActivity.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 520:
                        momentActivity.count = nb5Var.j();
                        continue;
                    default:
                        if (momentActivity.action == null && numValueOf != null) {
                            momentActivity.action = (ActivityActionApi) ActivityActionApi.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (momentActivity.value == null) {
                            momentActivity.value = "";
                        }
                        if (momentActivity.owner == null) {
                            momentActivity.owner = "";
                        }
                        if (momentActivity.actors == null) {
                            momentActivity.actors = "";
                        }
                        if (momentActivity.action == null) {
                            momentActivity.action = (ActivityActionApi) ActivityActionApi.JSON_ADAPTER.defaultEnum();
                        }
                        if (momentActivity.reference == null) {
                            momentActivity.reference = MomentIdBoxed.new_();
                        }
                        if (momentActivity.messageid == null) {
                            momentActivity.messageid = "";
                        }
                        if (momentActivity.settings == null) {
                            momentActivity.settings = ActivitySetting.new_();
                        }
                        if (momentActivity.parentMessageid == null) {
                            momentActivity.parentMessageid = "";
                        }
                        if (momentActivity.replyMessageId == null) {
                            momentActivity.replyMessageId = "";
                        }
                        if (momentActivity.userIds == null) {
                            momentActivity.userIds = new ArrayList();
                            return momentActivity;
                        }
                        break;
                }
            }
            return momentActivity;
        }

        public void serialize(MomentActivity momentActivity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) momentActivity)._id);
            String str = ((DbObject) momentActivity).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = momentActivity.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = momentActivity.owner;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            String str4 = momentActivity.actors;
            if (str4 != null) {
                codedOutputByteBufferNano.R(53, str4);
            }
            ActivityActionApi activityActionApi = momentActivity.action;
            if (activityActionApi != null) {
                codedOutputByteBufferNano.G(54, activityActionApi.ordinal());
            }
            codedOutputByteBufferNano.A(55, momentActivity.read);
            MomentIdBoxed momentIdBoxed = momentActivity.reference;
            if (momentIdBoxed != null) {
                codedOutputByteBufferNano.K(56, momentIdBoxed, MomentIdBoxed.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(57, momentActivity.createdTime);
            String str5 = momentActivity.messageid;
            if (str5 != null) {
                codedOutputByteBufferNano.R(58, str5);
            }
            ActivitySetting activitySetting = momentActivity.settings;
            if (activitySetting != null) {
                codedOutputByteBufferNano.K(59, activitySetting, ActivitySetting.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(60, momentActivity.acceptGift);
            ActivityActionApi activityActionApi2 = momentActivity.action;
            if (activityActionApi2 != null) {
                codedOutputByteBufferNano.K(61, activityActionApi2, ActivityActionApi.PROTOBUF_ADAPTER);
            }
            String str6 = momentActivity.parentMessageid;
            if (str6 != null) {
                codedOutputByteBufferNano.R(62, str6);
            }
            String str7 = momentActivity.replyMessageId;
            if (str7 != null) {
                codedOutputByteBufferNano.R(63, str7);
            }
            List<String> list = momentActivity.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(64, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(65, momentActivity.count);
        }
    };
    public static JsonAdapter<MomentActivity> JSON_ADAPTER = new ObjectJsonAdapter<MomentActivity>() { // from class: com.p1.mobile.putong.feed.data.MomentActivity.2
        public Class getDataClass() {
            return MomentActivity.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MomentActivity mo17830newInstance() {
            return new MomentActivity();
        }

        public boolean parseField(MomentActivity momentActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "messageid":
                    momentActivity.messageid = jsonParser.getValueAsString();
                    return true;
                case "action":
                    momentActivity.action = (ActivityActionApi) ActivityActionApi.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "actors":
                    momentActivity.actors = (String) Converter.USER_ID_FROM_ARRAY_OF_BOXED.parse(jsonParser, str2);
                    return true;
                case "acceptGift":
                    momentActivity.acceptGift = jsonParser.getValueAsBoolean();
                    return true;
                case "reference":
                    momentActivity.reference = (MomentIdBoxed) MomentIdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "createdTime":
                    momentActivity.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "parentMessageid":
                    momentActivity.parentMessageid = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    momentActivity.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    ((DbObject) momentActivity).id = jsonParser.getValueAsString();
                    return false;
                case "read":
                    momentActivity.read = jsonParser.getValueAsBoolean();
                    return true;
                case "count":
                    momentActivity.count = jsonParser.getValueAsInt();
                    return true;
                case "owner":
                    momentActivity.owner = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "value":
                    momentActivity.value = jsonParser.getValueAsString();
                    return true;
                case "settings":
                    momentActivity.settings = (ActivitySetting) ActivitySetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "replyMessageId":
                    momentActivity.replyMessageId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentActivity momentActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "messageid":
                case "action":
                case "actors":
                case "acceptGift":
                case "reference":
                case "createdTime":
                case "parentMessageid":
                case "userIds":
                    return true;
                case "id":
                    return false;
                case "read":
                case "count":
                case "owner":
                case "value":
                case "settings":
                case "replyMessageId":
                    return true;
                default:
                    return super.parseFieldCheck(momentActivity, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentActivity momentActivity, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) momentActivity).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = momentActivity.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            if (momentActivity.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(momentActivity.owner, jsonGenerator, true);
            }
            if (momentActivity.actors != null) {
                jsonGenerator.writeFieldName("actors");
                Converter.USER_ID_FROM_ARRAY_OF_BOXED.serialize(momentActivity.actors, jsonGenerator, true);
            }
            if (momentActivity.action != null) {
                jsonGenerator.writeFieldName(Action.TYPE);
                ActivityActionApi.JSON_ADAPTER.serialize(momentActivity.action, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("read", momentActivity.read);
            if (momentActivity.reference != null) {
                jsonGenerator.writeFieldName(Reference.TYPE);
                MomentIdBoxed.JSON_ADAPTER.serialize(momentActivity.reference, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(momentActivity.createdTime), jsonGenerator, true);
            String str3 = momentActivity.messageid;
            if (str3 != null) {
                jsonGenerator.writeStringField("messageid", str3);
            }
            if (momentActivity.settings != null) {
                jsonGenerator.writeFieldName(Settings.TYPE);
                ActivitySetting.JSON_ADAPTER.serialize(momentActivity.settings, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("acceptGift", momentActivity.acceptGift);
            String str4 = momentActivity.parentMessageid;
            if (str4 != null) {
                jsonGenerator.writeStringField("parentMessageid", str4);
            }
            String str5 = momentActivity.replyMessageId;
            if (str5 != null) {
                jsonGenerator.writeStringField("replyMessageId", str5);
            }
            if (momentActivity.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(momentActivity.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("count", momentActivity.count);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<MomentActivity> _ID = new LongColumn<MomentActivity>("_id") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.3
        public Long get(MomentActivity momentActivity) {
            return Long.valueOf(((DbObject) momentActivity)._id);
        }

        public void set(MomentActivity momentActivity, Long l2) {
            ((DbObject) momentActivity)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<MomentActivity> f692ID = new StringColumn<MomentActivity>("id_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.4
        public String get(MomentActivity momentActivity) {
            return ((DbObject) momentActivity).id;
        }

        public void set(MomentActivity momentActivity, String str) {
            ((DbObject) momentActivity).id = str;
        }
    };
    public static final StringColumn<MomentActivity> VALUE = new StringColumn<MomentActivity>("value_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.5
        public String get(MomentActivity momentActivity) {
            return momentActivity.value;
        }

        public void set(MomentActivity momentActivity, String str) {
            momentActivity.value = str;
        }
    };
    public static final StringColumn<MomentActivity> OWNER = new StringColumn<MomentActivity>("owner_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.6
        public String get(MomentActivity momentActivity) {
            return momentActivity.owner;
        }

        public void set(MomentActivity momentActivity, String str) {
            momentActivity.owner = str;
        }
    };
    public static final StringColumn<MomentActivity> ACTORS = new StringColumn<MomentActivity>("actors_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.7
        public String get(MomentActivity momentActivity) {
            return momentActivity.actors;
        }

        public void set(MomentActivity momentActivity, String str) {
            momentActivity.actors = str;
        }
    };
    public static final TEnumColumn<MomentActivity, ActivityActionApi> ACTION = new TEnumColumn<MomentActivity, ActivityActionApi>("str_action_c", "action_c", ActivityActionApi.JSON_ADAPTER) { // from class: com.p1.mobile.putong.feed.data.MomentActivity.8
        public ActivityActionApi get(MomentActivity momentActivity) {
            return momentActivity.action;
        }

        @Override // com.p000p1.mobile.putong.data.tenum.TEnumColumn
        public void setTEnum(MomentActivity momentActivity, ActivityActionApi activityActionApi) {
            momentActivity.action = activityActionApi;
        }
    };
    public static final BooleanColumn<MomentActivity> READ = new BooleanColumn<MomentActivity>("read_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.9
        public Boolean get(MomentActivity momentActivity) {
            return Boolean.valueOf(momentActivity.read);
        }

        public void set(MomentActivity momentActivity, Boolean bool) {
            momentActivity.read = bool.booleanValue();
        }
    };
    public static final StringColumn<MomentActivity> REFERENCE_ID = new StringColumn<MomentActivity>("reference_id_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.10
        public String get(MomentActivity momentActivity) {
            return momentActivity.reference.f693id;
        }

        public void set(MomentActivity momentActivity, String str) {
            momentActivity.reference.f693id = str;
        }
    };
    public static final StringColumn<MomentActivity> REFERENCE_TYPE = new StringColumn<MomentActivity>("reference_type_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.11
        public String get(MomentActivity momentActivity) {
            return momentActivity.reference.type;
        }

        public void set(MomentActivity momentActivity, String str) {
            momentActivity.reference.type = str;
        }
    };
    public static final DoubleColumn<MomentActivity> CREATEDTIME = new DoubleColumn<MomentActivity>("createdTime_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.12
        public Double get(MomentActivity momentActivity) {
            return Double.valueOf(momentActivity.createdTime);
        }

        public void set(MomentActivity momentActivity, Double d) {
            momentActivity.createdTime = d.doubleValue();
        }
    };
    public static final StringColumn<MomentActivity> MESSAGEID = new StringColumn<MomentActivity>("messageid_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.13
        public String get(MomentActivity momentActivity) {
            return momentActivity.messageid;
        }

        public void set(MomentActivity momentActivity, String str) {
            momentActivity.messageid = str;
        }
    };
    public static final BooleanColumn<MomentActivity> SETTINGS_ANONYMOUS = new BooleanColumn<MomentActivity>("settings_anonymous_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.14
        public Boolean get(MomentActivity momentActivity) {
            return Boolean.valueOf(momentActivity.settings.anonymous);
        }

        public void set(MomentActivity momentActivity, Boolean bool) {
            momentActivity.settings.anonymous = bool.booleanValue();
        }
    };
    public static final BooleanColumn<MomentActivity> ACCEPTGIFT = new BooleanColumn<MomentActivity>("acceptGift_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.15
        public Boolean get(MomentActivity momentActivity) {
            return Boolean.valueOf(momentActivity.acceptGift);
        }

        public void set(MomentActivity momentActivity, Boolean bool) {
            momentActivity.acceptGift = bool.booleanValue();
        }
    };
    public static final StringColumn<MomentActivity> PARENTMESSAGEID = new StringColumn<MomentActivity>("parentMessageid_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.16
        public String get(MomentActivity momentActivity) {
            return momentActivity.parentMessageid;
        }

        public void set(MomentActivity momentActivity, String str) {
            momentActivity.parentMessageid = str;
        }
    };
    public static final StringColumn<MomentActivity> REPLYMESSAGEID = new StringColumn<MomentActivity>("replyMessageId_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.17
        public String get(MomentActivity momentActivity) {
            return momentActivity.replyMessageId;
        }

        public void set(MomentActivity momentActivity, String str) {
            momentActivity.replyMessageId = str;
        }
    };
    public static final Column<MomentActivity, List<String>> USERIDS = new Column<MomentActivity, List<String>>("userIds_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.18
        public List<String> get(MomentActivity momentActivity) {
            return momentActivity.userIds;
        }

        public void set(MomentActivity momentActivity, List<String> list) {
            momentActivity.userIds = list;
        }
    };
    public static final IntegerColumn<MomentActivity> COUNT = new IntegerColumn<MomentActivity>("count_c") { // from class: com.p1.mobile.putong.feed.data.MomentActivity.19
        public Integer get(MomentActivity momentActivity) {
            return Integer.valueOf(momentActivity.count);
        }

        public void set(MomentActivity momentActivity, Integer num) {
            momentActivity.count = num.intValue();
        }
    };
    public static mrf0<MomentActivity> DB_ADAPTER = new mrf0<MomentActivity>() { // from class: com.p1.mobile.putong.feed.data.MomentActivity.20
        @Override // p007l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f11572d + " (_id INTEGER PRIMARY KEY,id_c TEXT,value_c TEXT,owner_c TEXT,actors_c TEXT,action_c INTEGER,read_c INTEGER,reference_id_c TEXT,reference_type_c TEXT,createdTime_c REAL,messageid_c TEXT,settings_anonymous_c INTEGER,acceptGift_c INTEGER,str_action_c TEXT,parentMessageid_c TEXT,replyMessageId_c TEXT,userIds_c BLOB,count_c INTEGER)";
        }

        @Override // p007l.mrf0
        public Class getDataClass() {
            return MomentActivity.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public MomentActivity init() {
            MomentActivity momentActivity = new MomentActivity();
            if (momentActivity.value == null) {
                momentActivity.value = "";
            }
            if (momentActivity.owner == null) {
                momentActivity.owner = "";
            }
            if (momentActivity.actors == null) {
                momentActivity.actors = "";
            }
            if (momentActivity.action == null) {
                momentActivity.action = (ActivityActionApi) ActivityActionApi.JSON_ADAPTER.defaultEnum();
            }
            if (momentActivity.reference == null) {
                momentActivity.reference = MomentIdBoxed.new_();
            }
            if (momentActivity.messageid == null) {
                momentActivity.messageid = "";
            }
            if (momentActivity.settings == null) {
                momentActivity.settings = ActivitySetting.new_();
            }
            if (momentActivity.parentMessageid == null) {
                momentActivity.parentMessageid = "";
            }
            if (momentActivity.replyMessageId == null) {
                momentActivity.replyMessageId = "";
            }
            if (momentActivity.userIds == null) {
                momentActivity.userIds = new ArrayList();
            }
            return momentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public MomentActivity read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            MomentActivity momentActivity = new MomentActivity();
            String string = "unknown_";
            int i2 = -1;
            try {
                momentActivity.reference = new MomentIdBoxed();
                momentActivity.settings = new ActivitySetting();
                ((DbObject) momentActivity)._id = cursor.getLong(i);
                int i3 = i + 1;
                List<String> list = null;
                ((DbObject) momentActivity).id = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 2;
                momentActivity.value = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 3;
                momentActivity.owner = cursor.isNull(i5) ? null : cursor.getString(i5);
                int i6 = i + 4;
                momentActivity.actors = cursor.isNull(i6) ? null : cursor.getString(i6);
                int i7 = i + 5;
                if (!cursor.isNull(i7)) {
                    i2 = cursor.getInt(i7);
                }
                momentActivity.read = cursor.getInt(i + 6) == 1;
                int i8 = i + 7;
                momentActivity.reference.f693id = cursor.isNull(i8) ? null : cursor.getString(i8);
                int i9 = i + 8;
                momentActivity.reference.type = cursor.isNull(i9) ? null : cursor.getString(i9);
                momentActivity.createdTime = cursor.getDouble(i + 9);
                int i10 = i + 10;
                momentActivity.messageid = cursor.isNull(i10) ? null : cursor.getString(i10);
                momentActivity.settings.anonymous = cursor.getInt(i + 11) == 1;
                momentActivity.acceptGift = cursor.getInt(i + 12) == 1;
                int i11 = i + 13;
                string = cursor.isNull(i11) ? null : cursor.getString(i11);
                int i12 = i + 14;
                momentActivity.parentMessageid = cursor.isNull(i12) ? null : cursor.getString(i12);
                int i13 = i + 15;
                momentActivity.replyMessageId = cursor.isNull(i13) ? null : cursor.getString(i13);
                int i14 = i + 16;
                if (!cursor.isNull(i14)) {
                    list = (List) ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i14));
                }
                momentActivity.userIds = list;
                momentActivity.count = cursor.getInt(i + 17);
                this.readIndex = i + 18;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            TEnumJsonAdapter<ActivityActionApi> tEnumJsonAdapter = ActivityActionApi.JSON_ADAPTER;
            ActivityActionApi activityActionApi = (ActivityActionApi) tEnumJsonAdapter.newTEnum(string, i2);
            momentActivity.action = activityActionApi;
            if (momentActivity.value == null) {
                momentActivity.value = "";
            }
            if (momentActivity.owner == null) {
                momentActivity.owner = "";
            }
            if (momentActivity.actors == null) {
                momentActivity.actors = "";
            }
            if (activityActionApi == null) {
                momentActivity.action = (ActivityActionApi) tEnumJsonAdapter.defaultEnum();
            }
            if (momentActivity.reference == null) {
                momentActivity.reference = MomentIdBoxed.new_();
            }
            if (momentActivity.messageid == null) {
                momentActivity.messageid = "";
            }
            if (momentActivity.settings == null) {
                momentActivity.settings = ActivitySetting.new_();
            }
            if (momentActivity.parentMessageid == null) {
                momentActivity.parentMessageid = "";
            }
            if (momentActivity.replyMessageId == null) {
                momentActivity.replyMessageId = "";
            }
            if (momentActivity.userIds == null) {
                momentActivity.userIds = new ArrayList();
            }
            return momentActivity;
        }

        @Override // p007l.mrf0
        public void write(MomentActivity momentActivity, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) momentActivity).id);
                DbObject.cvPut(contentValues, "value_c", momentActivity.value);
                DbObject.cvPut(contentValues, "owner_c", momentActivity.owner);
                DbObject.cvPut(contentValues, "actors_c", momentActivity.actors);
                ActivityActionApi activityActionApi = momentActivity.action;
                DbObject.cvPut(contentValues, "str_action_c", activityActionApi == null ? null : activityActionApi.toString());
                ActivityActionApi activityActionApi2 = momentActivity.action;
                DbObject.cvPut(contentValues, "action_c", activityActionApi2 == null ? null : Integer.valueOf(activityActionApi2.ordinal()));
                DbObject.cvPut(contentValues, "read_c", Integer.valueOf(momentActivity.read ? 1 : 0));
                DbObject.cvPut(contentValues, "reference_id_c", momentActivity.reference.f693id);
                DbObject.cvPut(contentValues, "reference_type_c", momentActivity.reference.type);
                DbObject.cvPut(contentValues, "createdTime_c", Double.valueOf(momentActivity.createdTime));
                DbObject.cvPut(contentValues, "messageid_c", momentActivity.messageid);
                DbObject.cvPut(contentValues, "settings_anonymous_c", Integer.valueOf(momentActivity.settings.anonymous ? 1 : 0));
                DbObject.cvPut(contentValues, "acceptGift_c", Integer.valueOf(momentActivity.acceptGift ? 1 : 0));
                DbObject.cvPut(contentValues, "parentMessageid_c", momentActivity.parentMessageid);
                DbObject.cvPut(contentValues, "replyMessageId_c", momentActivity.replyMessageId);
                DbObject.cvPut(contentValues, "userIds_c", momentActivity.userIds == null ? null : ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(momentActivity.userIds));
                DbObject.cvPut(contentValues, "count_c", Integer.valueOf(momentActivity.count));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1790a(String str) {
        return str;
    }

    public static MomentActivity new_() {
        MomentActivity momentActivity = new MomentActivity();
        momentActivity.nullCheck();
        return momentActivity;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentActivity m19595clone() {
        MomentActivity momentActivity = new MomentActivity();
        ((DbObject) momentActivity)._id = ((DbObject) this)._id;
        ((DbObject) momentActivity).id = ((DbObject) this).id;
        momentActivity.value = this.value;
        momentActivity.owner = this.owner;
        momentActivity.actors = this.actors;
        momentActivity.action = this.action;
        momentActivity.read = this.read;
        MomentIdBoxed momentIdBoxed = this.reference;
        if (momentIdBoxed != null) {
            momentActivity.reference = momentIdBoxed.m19619clone();
        }
        momentActivity.createdTime = this.createdTime;
        momentActivity.messageid = this.messageid;
        ActivitySetting activitySetting = this.settings;
        if (activitySetting != null) {
            momentActivity.settings = activitySetting.m19403clone();
        }
        momentActivity.acceptGift = this.acceptGift;
        momentActivity.parentMessageid = this.parentMessageid;
        momentActivity.replyMessageId = this.replyMessageId;
        List<String> list = this.userIds;
        if (list != null) {
            momentActivity.userIds = ValueObject.util_map(list, new w9j() { // from class: l.a900
                public final Object call(Object obj) {
                    return MomentActivity.m1790a((String) obj);
                }
            });
        }
        momentActivity.count = this.count;
        return momentActivity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentActivity)) {
            return false;
        }
        MomentActivity momentActivity = (MomentActivity) obj;
        return super.equals(obj) && ValueObject.util_equals(this.value, momentActivity.value) && ValueObject.util_equals(this.owner, momentActivity.owner) && ValueObject.util_equals(this.actors, momentActivity.actors) && ValueObject.util_equals(this.action, momentActivity.action) && this.read == momentActivity.read && ValueObject.util_equals(this.reference, momentActivity.reference) && this.createdTime == momentActivity.createdTime && ValueObject.util_equals(this.messageid, momentActivity.messageid) && ValueObject.util_equals(this.settings, momentActivity.settings) && this.acceptGift == momentActivity.acceptGift && ValueObject.util_equals(this.parentMessageid, momentActivity.parentMessageid) && ValueObject.util_equals(this.replyMessageId, momentActivity.replyMessageId) && ValueObject.util_equals(this.userIds, momentActivity.userIds) && this.count == momentActivity.count;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.owner;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.actors;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        ActivityActionApi activityActionApi = this.action;
        int iHashCode5 = (((iHashCode4 + (activityActionApi != null ? activityActionApi.hashCode() : 0)) * 41) + (this.read ? 1231 : 1237)) * 41;
        MomentIdBoxed momentIdBoxed = this.reference;
        int iHashCode6 = momentIdBoxed != null ? momentIdBoxed.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i2 = (((iHashCode5 + iHashCode6) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str4 = this.messageid;
        int iHashCode7 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 41;
        ActivitySetting activitySetting = this.settings;
        int iHashCode8 = (((iHashCode7 + (activitySetting != null ? activitySetting.hashCode() : 0)) * 41) + (this.acceptGift ? 1231 : 1237)) * 41;
        String str5 = this.parentMessageid;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.replyMessageId;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode11 = ((iHashCode10 + (list != null ? list.hashCode() : 0)) * 41) + this.count;
        ((ValueObject) this).hashCode = iHashCode11;
        return iHashCode11;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.value == null) {
            this.value = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.actors == null) {
            this.actors = "";
        }
        if (this.action == null) {
            this.action = (ActivityActionApi) ActivityActionApi.JSON_ADAPTER.defaultEnum();
        }
        if (this.reference == null) {
            this.reference = MomentIdBoxed.new_();
        }
        if (this.messageid == null) {
            this.messageid = "";
        }
        if (this.settings == null) {
            this.settings = ActivitySetting.new_();
        }
        if (this.parentMessageid == null) {
            this.parentMessageid = "";
        }
        if (this.replyMessageId == null) {
            this.replyMessageId = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
