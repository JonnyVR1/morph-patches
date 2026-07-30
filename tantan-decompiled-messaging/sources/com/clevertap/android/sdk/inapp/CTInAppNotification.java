package com.clevertap.android.sdk.inapp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.b2s;
import p149l.he5;
import p149l.j6f;
import p149l.lw3;
import p149l.wpq;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u009b\u00012\u00020\u0001:\u0001\u0010B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0012\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020\u001aH\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00002\b\u0010&\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b\u0010\u0010'J\u0019\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b)\u0010*R(\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R(\u00100\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R(\u00103\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u0001028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R$\u00107\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R(\u0010>\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R$\u0010@\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u001cR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010G\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bH\u0010:R$\u0010I\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u0010:R(\u0010K\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\bL\u0010/R(\u0010M\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010-\u001a\u0004\bN\u0010/R$\u0010P\u001a\u00020O2\u0006\u0010+\u001a\u00020O8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u00109\u001a\u0004\bQ\u0010RR$\u0010S\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010A\u001a\u0004\bT\u0010\u001cR$\u0010U\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010A\u001a\u0004\bV\u0010\u001cR$\u0010W\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u00108\u001a\u0004\bX\u0010:R$\u0010Y\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u00108\u001a\u0004\bZ\u0010:R$\u0010[\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u00108\u001a\u0004\b\\\u0010:R(\u0010]\u001a\u0004\u0018\u00010%2\b\u0010+\u001a\u0004\u0018\u00010%8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R(\u0010a\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\ba\u0010<\u001a\u0004\bb\u0010cR(\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\bd\u0010/R$\u0010e\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\be\u0010-\u001a\u0004\bf\u0010/R$\u0010g\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bg\u0010A\u001a\u0004\bh\u0010\u001cR(\u0010i\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bi\u0010<\u001a\u0004\bj\u0010cR(\u0010k\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bk\u0010-\u001a\u0004\bl\u0010/R$\u0010m\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bm\u00108\u001a\u0004\bA\u0010:R$\u0010n\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010-\u001a\u0004\bo\u0010/\"\u0004\bp\u0010qR$\u0010r\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\br\u0010A\u001a\u0004\bs\u0010\u001cR$\u0010t\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bt\u0010A\u001a\u0004\bu\u0010\u001cR$\u0010w\u001a\u00020v2\u0006\u0010+\u001a\u00020v8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bw\u0010T\u001a\u0004\bx\u0010yR$\u0010z\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bz\u00108\u001a\u0004\b{\u0010:R(\u0010|\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b|\u0010-\u001a\u0004\b}\u0010/R$\u0010~\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b~\u00108\u001a\u0004\b\u007f\u0010:R'\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0080\u0001\u00108\u001a\u0005\b\u0081\u0001\u0010:R\u001e\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\"0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010FR'\u0010\u0083\u0001\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010-\u001a\u0005\b\u0084\u0001\u0010/R+\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0007\u0010+\u001a\u00030\u0085\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010\u008a\u0001\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008a\u0001\u00108\u001a\u0005\b\u008b\u0001\u0010:R'\u0010\u008c\u0001\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010-\u001a\u0005\b\u0087\u0001\u0010/R'\u0010\u008d\u0001\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008d\u0001\u00108\u001a\u0005\b\u008e\u0001\u0010:R'\u0010\u008f\u0001\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010A\u001a\u0005\b\u0090\u0001\u0010\u001cR'\u0010\u0091\u0001\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010A\u001a\u0005\b\u0092\u0001\u0010\u001cR\u0013\u0010\u0094\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010cR\u001b\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020D0\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\"0\u0095\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u0097\u0001¨\u0006\u009c\u0001"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "jsonObject", "", "videoSupported", "<init>", "(Lorg/json/JSONObject;Z)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "a", "(Lorg/json/JSONObject;)V", "U", "Landroid/os/Bundle;", "b", "", Constants.KEY_KEY, "Lkotlin/reflect/KClass;", "type", "M", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Z", "notif", "X", "(Landroid/os/Bundle;)Z", "", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", Constants.KEY_ORIENTATION, "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "q", "(I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "actionData", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppData", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V", "value", "id", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "campaignId", "g", "Lcom/clevertap/android/sdk/inapp/CTInAppType;", "inAppType", "Lcom/clevertap/android/sdk/inapp/CTInAppType;", "r", "()Lcom/clevertap/android/sdk/inapp/CTInAppType;", "isExcludeFromCaps", "Z", "J", "()Z", "_actionExtras", "Lorg/json/JSONObject;", "_jsonDescription", "landscapeImageUrl", "getLandscapeImageUrl", "maxPerSession", "I", Constants.KEY_T, "Ljava/util/ArrayList;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "_buttons", "Ljava/util/ArrayList;", "isLandscape", BloodType.f38728O, "isPortrait", "Q", "title", "B", "message", "w", "", "timeToLive", "A", "()J", "totalDailyCount", "D", "totalLifetimeCount", "E", "isLocalInApp", "P", "fallBackToNotificationSettings", BLiveStormDanmakuGiftResourceType.f44444l, "isRequestForPushPermission", "R", "customTemplateData", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", RXScreenCaptureService.KEY_INDEX, "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "pipConfigJson", BaseSei.f13931Y, "()Lorg/json/JSONObject;", "F", "backgroundColor", Constants.INAPP_DATA_TAG, "buttonCount", "e", "customExtras", "getCustomExtras$clevertap_core_release", "customInAppUrl", "h", "isDarkenScreen", "error", "k", "W", "(Ljava/lang/String;)V", "height", "m", "heightPercentage", "n", "", Constants.INAPP_ASPECT_RATIO, "c", "()D", "isHideCloseButton", "K", Constants.INAPP_HTML_TAG, "o", "isTablet", j6f.GPS_DIRECTION_TRUE, Constants.INAPP_JS_ENABLED, "L", "_mediaList", "messageColor", BaseSei.f13930X, "", "position", b2s.C_ZONE, BaseSei.f13932Z, "()C", "isShowClose", j6f.LATITUDE_SOUTH, "titleColor", "isVideoSupported", "isVideoSupported$clevertap_core_release", "width", "G", "widthPercentage", "H", BLiveStormDanmakuGiftResourceType.f44446s, "jsonDescription", "", "f", "()Ljava/util/List;", Constants.KEY_BUTTONS, "u", "mediaList", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class CTInAppNotification implements Parcelable {

    @NotNull
    private static final String EMPTY_JSON = "{}";
    public static final double HTML_DEFAULT_ASPECT_RATIO = -1.0d;

    @Nullable
    private JSONObject _actionExtras;

    @NotNull
    private ArrayList<CTInAppNotificationButton> _buttons;

    @NotNull
    private JSONObject _jsonDescription;

    @NotNull
    private ArrayList<CTInAppNotificationMedia> _mediaList;
    private double aspectRatio;

    @NotNull
    private String backgroundColor;
    private int buttonCount;

    @Nullable
    private String campaignId;

    @Nullable
    private JSONObject customExtras;

    @Nullable
    private String customInAppUrl;

    @Nullable
    private CustomTemplateInAppData customTemplateData;

    @Nullable
    private String error;
    private boolean fallBackToNotificationSettings;
    private int height;
    private int heightPercentage;

    @Nullable
    private String html;

    @Nullable
    private String id;

    @Nullable
    private CTInAppType inAppType;
    private boolean isDarkenScreen;
    private boolean isExcludeFromCaps;
    private boolean isHideCloseButton;
    private boolean isJsEnabled;
    private boolean isLandscape;
    private boolean isLocalInApp;
    private boolean isPortrait;
    private boolean isRequestForPushPermission;
    private boolean isShowClose;
    private boolean isTablet;
    private boolean isVideoSupported;

    @Nullable
    private String landscapeImageUrl;
    private int maxPerSession;

    @Nullable
    private String message;

    @NotNull
    private String messageColor;

    @Nullable
    private JSONObject pipConfigJson;
    private char position;
    private long timeToLive;

    @Nullable
    private String title;

    @NotNull
    private String titleColor;
    private int totalDailyCount;
    private int totalLifetimeCount;

    @Nullable
    private String type;
    private int width;
    private int widthPercentage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CTInAppNotification> CREATOR = new C1200a();

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotification$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/clevertap/android/sdk/inapp/CTInAppNotification$a", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Landroid/os/Parcel;", "in", "a", "(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "", "size", "", "b", "(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1200a implements Parcelable.Creator<CTInAppNotification> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CTInAppNotification createFromParcel(Parcel in) {
            in.getClass();
            return new CTInAppNotification(in, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CTInAppNotification[] newArray(int size) {
            return new CTInAppNotification[size];
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotification$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotification$b;", "", "<init>", "()V", "Lorg/json/JSONObject;", "notif", "Landroid/os/Bundle;", "c", "(Lorg/json/JSONObject;)Landroid/os/Bundle;", "", "b", "()J", "", "HTML_DEFAULT_ASPECT_RATIO", "D", "", "EMPTY_JSON", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "CREATOR", "Landroid/os/Parcelable$Creator;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final Bundle m6185c(JSONObject notif) {
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = notif.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                String str = next;
                try {
                    Object obj = notif.get(str);
                    if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Character) {
                        bundle.putChar(str, ((Character) obj).charValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Number) obj).intValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Number) obj).longValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof JSONObject) {
                        bundle.putBundle(str, m6185c((JSONObject) obj));
                    }
                } catch (JSONException unused) {
                    Logger.m5873v("Key had unknown object. Discarding");
                }
            }
            return bundle;
        }

        /* JADX INFO: renamed from: b */
        public final long m6186b() {
            return (System.currentTimeMillis() + 172800000) / 1000;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotification$c */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1202c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5005a;

        static {
            int[] iArr = new int[CTInAppType.values().length];
            try {
                iArr[CTInAppType.CTInAppTypeFooter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeHeader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeCover.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CTInAppType.CTInAppTypePIP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f5005a = iArr;
        }
    }

    private CTInAppNotification(Parcel parcel) {
        JSONObject jSONObject;
        this._buttons = new ArrayList<>();
        this.backgroundColor = "#FFFFFF";
        this.aspectRatio = -1.0d;
        this._mediaList = new ArrayList<>();
        this.messageColor = Constants.BLACK;
        this.titleColor = Constants.BLACK;
        this.id = parcel.readString();
        this.campaignId = parcel.readString();
        Object value = parcel.readValue(CTInAppType.class.getClassLoader());
        JSONObject jSONObject2 = null;
        this.inAppType = value instanceof CTInAppType ? (CTInAppType) value : null;
        this.html = parcel.readString();
        this.isExcludeFromCaps = parcel.readByte() != 0;
        this.isShowClose = parcel.readByte() != 0;
        this.isDarkenScreen = parcel.readByte() != 0;
        this.maxPerSession = parcel.readInt();
        this.totalLifetimeCount = parcel.readInt();
        this.totalDailyCount = parcel.readInt();
        this.position = (char) parcel.readInt();
        this.height = parcel.readInt();
        this.heightPercentage = parcel.readInt();
        this.width = parcel.readInt();
        this.widthPercentage = parcel.readInt();
        String string = parcel.readString();
        this._jsonDescription = new JSONObject(string == null ? "{}" : string);
        this.error = parcel.readString();
        if (parcel.readByte() == 0) {
            jSONObject = null;
        } else {
            String string2 = parcel.readString();
            jSONObject = new JSONObject(string2 == null ? "{}" : string2);
        }
        this.customExtras = jSONObject;
        if (parcel.readByte() != 0) {
            String string3 = parcel.readString();
            jSONObject2 = new JSONObject(string3 != null ? string3 : "{}");
        }
        this._actionExtras = jSONObject2;
        this.type = parcel.readString();
        this.title = parcel.readString();
        String string4 = parcel.readString();
        this.titleColor = he5.m130620a(string4 == null ? this.titleColor : string4, Constants.BLACK);
        String string5 = parcel.readString();
        this.backgroundColor = he5.m130620a(string5 == null ? this.backgroundColor : string5, "#FFFFFF");
        this.message = parcel.readString();
        String string6 = parcel.readString();
        this.messageColor = he5.m130620a(string6 == null ? this.messageColor : string6, Constants.BLACK);
        try {
            ArrayList<CTInAppNotificationButton> arrayListCreateTypedArrayList = parcel.createTypedArrayList(CTInAppNotificationButton.CREATOR);
            this._buttons = arrayListCreateTypedArrayList == null ? new ArrayList<>() : arrayListCreateTypedArrayList;
        } catch (Throwable unused) {
        }
        try {
            ArrayList<CTInAppNotificationMedia> arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(CTInAppNotificationMedia.CREATOR);
            this._mediaList = arrayListCreateTypedArrayList2 == null ? new ArrayList<>() : arrayListCreateTypedArrayList2;
        } catch (Throwable unused2) {
        }
        this.isHideCloseButton = parcel.readByte() != 0;
        this.buttonCount = parcel.readInt();
        this.isTablet = parcel.readByte() != 0;
        this.customInAppUrl = parcel.readString();
        this.isJsEnabled = parcel.readByte() != 0;
        this.isPortrait = parcel.readByte() != 0;
        this.isLandscape = parcel.readByte() != 0;
        this.isLocalInApp = parcel.readByte() != 0;
        this.fallBackToNotificationSettings = parcel.readByte() != 0;
        this.landscapeImageUrl = parcel.readString();
        this.timeToLive = parcel.readLong();
        this.customTemplateData = (CustomTemplateInAppData) parcel.readParcelable(CustomTemplateInAppData.class.getClassLoader());
        this.aspectRatio = parcel.readDouble();
        this.isRequestForPushPermission = parcel.readByte() != 0;
        this.pipConfigJson = this._jsonDescription.optJSONObject("pip");
    }

    /* JADX INFO: renamed from: M */
    private final boolean m6135M(Bundle b, String key, KClass<?> type) {
        return b.containsKey(key) && type.isInstance(b.get(key));
    }

    /* JADX INFO: renamed from: U */
    private final void m6136U(JSONObject jsonObject) {
        Companion companion = INSTANCE;
        if (!m6137X(companion.m6185c(jsonObject))) {
            this.error = "Invalid JSON";
            return;
        }
        try {
            this.id = jsonObject.optString(Constants.INAPP_ID_IN_PAYLOAD, "");
            this.campaignId = jsonObject.optString(Constants.NOTIFICATION_ID_TAG, "");
            boolean z = true;
            if (jsonObject.optInt(Constants.KEY_EFC, -1) != 1 && jsonObject.optInt(Constants.KEY_EXCLUDE_GLOBAL_CAPS, -1) != 1) {
                z = false;
            }
            this.isExcludeFromCaps = z;
            this.totalLifetimeCount = jsonObject.optInt(Constants.KEY_TLC, -1);
            this.totalDailyCount = jsonObject.optInt(Constants.KEY_TDC, -1);
            this.isJsEnabled = jsonObject.optBoolean(Constants.INAPP_JS_ENABLED, false);
            this.timeToLive = jsonObject.optLong("wzrk_ttl", companion.m6186b());
            this.isRequestForPushPermission = jsonObject.optBoolean(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION, false);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(Constants.INAPP_DATA_TAG);
            if (jSONObjectOptJSONObject != null) {
                this.html = jSONObjectOptJSONObject.getString(Constants.INAPP_HTML_TAG);
                this.customInAppUrl = jSONObjectOptJSONObject.optString("url", "");
                this.customExtras = jSONObjectOptJSONObject.optJSONObject(Constants.KEY_KV) != null ? jSONObjectOptJSONObject.getJSONObject(Constants.KEY_KV) : new JSONObject();
                JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject("w");
                if (jSONObjectOptJSONObject2 != null) {
                    this.isDarkenScreen = jSONObjectOptJSONObject2.getBoolean(Constants.INAPP_NOTIF_DARKEN_SCREEN);
                    this.isShowClose = jSONObjectOptJSONObject2.getBoolean(Constants.INAPP_NOTIF_SHOW_CLOSE);
                    this.position = jSONObjectOptJSONObject2.getString(Constants.INAPP_POSITION).charAt(0);
                    this.width = jSONObjectOptJSONObject2.optInt(Constants.INAPP_X_DP, 0);
                    this.widthPercentage = jSONObjectOptJSONObject2.optInt(Constants.INAPP_X_PERCENT, 0);
                    this.height = jSONObjectOptJSONObject2.optInt(Constants.INAPP_Y_DP, 0);
                    this.heightPercentage = jSONObjectOptJSONObject2.optInt(Constants.INAPP_Y_PERCENT, 0);
                    this.maxPerSession = jSONObjectOptJSONObject2.optInt(Constants.INAPP_MAX_DISPLAY_COUNT, -1);
                    double dOptDouble = jSONObjectOptJSONObject2.optDouble(Constants.INAPP_ASPECT_RATIO, -1.0d);
                    this.aspectRatio = dOptDouble;
                    if (dOptDouble <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        this.aspectRatio = -1.0d;
                    }
                }
                if (this.html != null) {
                    char c = this.position;
                    if (c == 't') {
                        if (this.aspectRatio != -1.0d || (this.widthPercentage == 100 && this.heightPercentage <= 30)) {
                            this.inAppType = CTInAppType.CTInAppTypeHeaderHTML;
                            return;
                        }
                        return;
                    }
                    if (c == 'b') {
                        if (this.aspectRatio != -1.0d || (this.widthPercentage == 100 && this.heightPercentage <= 30)) {
                            this.inAppType = CTInAppType.CTInAppTypeFooterHTML;
                            return;
                        }
                        return;
                    }
                    if (c == 'c') {
                        int i = this.widthPercentage;
                        if (i == 90 && this.heightPercentage == 85) {
                            this.inAppType = CTInAppType.CTInAppTypeInterstitialHTML;
                            return;
                        }
                        if (i == 100 && this.heightPercentage == 100) {
                            this.inAppType = CTInAppType.CTInAppTypeCoverHTML;
                        } else if (i == 90 && this.heightPercentage == 50) {
                            this.inAppType = CTInAppType.CTInAppTypeHalfInterstitialHTML;
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            this.error = "Invalid JSON";
        }
    }

    /* JADX INFO: renamed from: X */
    private final boolean m6137X(Bundle notif) {
        try {
            Bundle bundle = notif.getBundle("w");
            Bundle bundle2 = notif.getBundle(Constants.INAPP_DATA_TAG);
            if (bundle == null || bundle2 == null || !(m6135M(bundle, Constants.INAPP_X_DP, Reflection.m87507b(Integer.class)) || m6135M(bundle, Constants.INAPP_X_PERCENT, Reflection.m87507b(Integer.class)))) {
                return false;
            }
            if (!m6135M(bundle, Constants.INAPP_Y_DP, Reflection.m87507b(Integer.class)) && !m6135M(bundle, Constants.INAPP_Y_PERCENT, Reflection.m87507b(Integer.class))) {
                return false;
            }
            Class cls = Boolean.TYPE;
            if (m6135M(bundle, Constants.INAPP_NOTIF_DARKEN_SCREEN, Reflection.m87507b(cls)) && m6135M(bundle, Constants.INAPP_NOTIF_SHOW_CLOSE, Reflection.m87507b(cls)) && m6135M(bundle2, Constants.INAPP_HTML_TAG, Reflection.m87507b(String.class)) && m6135M(bundle, Constants.INAPP_POSITION, Reflection.m87507b(String.class))) {
                String string = bundle.getString(Constants.INAPP_POSITION);
                string.getClass();
                char cCharAt = string.charAt(0);
                return cCharAt == 't' || cCharAt == 'r' || cCharAt == 'b' || cCharAt == 'l' || cCharAt == 'c';
            }
            return false;
        } catch (Throwable th) {
            Logger.m5876v("Failed to parse in-app notification!", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m6138a(JSONObject jsonObject) {
        CTInAppNotificationMedia cTInAppNotificationMediaM6205a;
        CTInAppNotificationMedia cTInAppNotificationMediaM6205a2;
        try {
            this.id = jsonObject.optString(Constants.INAPP_ID_IN_PAYLOAD, "");
            this.campaignId = jsonObject.optString(Constants.NOTIFICATION_ID_TAG, "");
            this.type = jsonObject.getString("type");
            this.isLocalInApp = jsonObject.optBoolean("isLocalInApp", false);
            this.fallBackToNotificationSettings = jsonObject.optBoolean("fallbackToNotificationSettings", false);
            int i = -1;
            this.isExcludeFromCaps = jsonObject.optInt(Constants.KEY_EFC, -1) == 1 || jsonObject.optInt(Constants.KEY_EXCLUDE_GLOBAL_CAPS, -1) == 1;
            this.totalLifetimeCount = jsonObject.optInt(Constants.KEY_TLC, -1);
            this.totalDailyCount = jsonObject.optInt(Constants.KEY_TDC, -1);
            this.maxPerSession = jsonObject.optInt(Constants.INAPP_MAX_DISPLAY_COUNT, -1);
            this.inAppType = CTInAppType.INSTANCE.m6206a(this.type);
            this.isTablet = jsonObject.optBoolean(Constants.KEY_IS_TABLET, false);
            this.backgroundColor = he5.m130620a(jsonObject.optString(Constants.KEY_BG, this.backgroundColor), "#FFFFFF");
            this.isPortrait = !jsonObject.has(Constants.KEY_PORTRAIT) || jsonObject.getBoolean(Constants.KEY_PORTRAIT);
            this.isLandscape = jsonObject.optBoolean(Constants.KEY_LANDSCAPE, false);
            this.timeToLive = jsonObject.optLong("wzrk_ttl", INSTANCE.m6186b());
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("title");
            if (jSONObjectOptJSONObject != null) {
                this.title = jSONObjectOptJSONObject.optString("text", "");
                this.titleColor = he5.m130620a(jSONObjectOptJSONObject.optString("color", this.titleColor), Constants.BLACK);
            }
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject("message");
            if (jSONObjectOptJSONObject2 != null) {
                this.message = jSONObjectOptJSONObject2.optString("text", "");
                this.messageColor = he5.m130620a(jSONObjectOptJSONObject2.optString("color", this.messageColor), Constants.BLACK);
            }
            this.isHideCloseButton = jsonObject.optBoolean("close", false);
            JSONObject jSONObjectOptJSONObject3 = jsonObject.optJSONObject("media");
            if (jSONObjectOptJSONObject3 != null && (cTInAppNotificationMediaM6205a2 = CTInAppNotificationMedia.INSTANCE.m6205a(jSONObjectOptJSONObject3, 1)) != null) {
                this._mediaList.add(cTInAppNotificationMediaM6205a2);
            }
            JSONObject jSONObjectOptJSONObject4 = jsonObject.optJSONObject(Constants.KEY_MEDIA_LANDSCAPE);
            if (jSONObjectOptJSONObject4 != null && (cTInAppNotificationMediaM6205a = CTInAppNotificationMedia.INSTANCE.m6205a(jSONObjectOptJSONObject4, 2)) != null) {
                this._mediaList.add(cTInAppNotificationMediaM6205a);
            }
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(Constants.KEY_BUTTONS);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject5 != null) {
                        this._buttons.add(new CTInAppNotificationButton(jSONObjectOptJSONObject5));
                        this.buttonCount++;
                    }
                }
            }
            this.isRequestForPushPermission = jsonObject.optBoolean(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION, false);
            this.customTemplateData = CustomTemplateInAppData.INSTANCE.m6309a(jsonObject);
            this.pipConfigJson = jsonObject.optJSONObject("pip");
            CTInAppType cTInAppType = this.inAppType;
            if (cTInAppType != null) {
                i = C1202c.f5005a[cTInAppType.ordinal()];
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    Iterator<CTInAppNotificationMedia> it = this._mediaList.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        CTInAppNotificationMedia next = it.next();
                        next.getClass();
                        CTInAppNotificationMedia cTInAppNotificationMedia = next;
                        if (cTInAppNotificationMedia.m6198e() || cTInAppNotificationMedia.m6201h()) {
                            cTInAppNotificationMedia.m6202i("");
                            Logger.m5865d("Unable to download media. Video/audio not supported for this template");
                        }
                    }
                    break;
                case 5:
                case 6:
                case 7:
                    if (this._mediaList.isEmpty()) {
                        this.error = "No media type for template";
                    }
                    break;
                case 8:
                    if (this._mediaList.isEmpty()) {
                        this.error = "PIP type requires media";
                    }
                    break;
            }
        } catch (JSONException e) {
            this.error = "Invalid JSON: " + e.getLocalizedMessage();
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getTimeToLive() {
        return this.timeToLive;
    }

    @Nullable
    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int getTotalDailyCount() {
        return this.totalDailyCount;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getTotalLifetimeCount() {
        return this.totalLifetimeCount;
    }

    @Nullable
    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getWidthPercentage() {
        return this.widthPercentage;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getIsDarkenScreen() {
        return this.isDarkenScreen;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getIsExcludeFromCaps() {
        return this.isExcludeFromCaps;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getIsHideCloseButton() {
        return this.isHideCloseButton;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getIsJsEnabled() {
        return this.isJsEnabled;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getIsLandscape() {
        return this.isLandscape;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final boolean getIsLocalInApp() {
        return this.isLocalInApp;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final boolean getIsPortrait() {
        return this.isPortrait;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final boolean getIsRequestForPushPermission() {
        return this.isRequestForPushPermission;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final boolean getIsShowClose() {
        return this.isShowClose;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getIsTablet() {
        return this.isTablet;
    }

    /* JADX INFO: renamed from: V */
    public final void m6157V(@Nullable CustomTemplateInAppData inAppData) throws JSONException {
        this.customTemplateData = inAppData;
        if (inAppData != null) {
            inAppData.m6308i(this._jsonDescription);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m6158W(@Nullable String str) {
        this.error = str;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final CTInAppNotification m6159b(@Nullable CustomTemplateInAppData actionData) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.INAPP_ID_IN_PAYLOAD, this.id);
            jSONObject.put(Constants.NOTIFICATION_ID_TAG, this.campaignId);
            jSONObject.put("type", InAppActionType.CUSTOM_CODE.toString());
            jSONObject.put(Constants.KEY_EFC, 1);
            jSONObject.put(Constants.KEY_EXCLUDE_GLOBAL_CAPS, 1);
            jSONObject.put("wzrk_ttl", this.timeToLive);
            if (this._jsonDescription.has(Constants.INAPP_WZRK_PIVOT)) {
                jSONObject.put(Constants.INAPP_WZRK_PIVOT, this._jsonDescription.optString(Constants.INAPP_WZRK_PIVOT));
            }
            if (this._jsonDescription.has(Constants.INAPP_WZRK_CGID)) {
                jSONObject.put(Constants.INAPP_WZRK_CGID, this._jsonDescription.optString(Constants.INAPP_WZRK_CGID));
            }
            CTInAppNotification cTInAppNotification = new CTInAppNotification(jSONObject, this.isVideoSupported);
            cTInAppNotification.m6157V(actionData);
            return cTInAppNotification;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getAspectRatio() {
        return this.aspectRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getButtonCount() {
        return this.buttonCount;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<CTInAppNotificationButton> m6163f() {
        return this._buttons;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCustomInAppUrl() {
        return this.customInAppUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final CustomTemplateInAppData getCustomTemplateData() {
        return this.customTemplateData;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getFallBackToNotificationSettings() {
        return this.fallBackToNotificationSettings;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getHeightPercentage() {
        return this.heightPercentage;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final CTInAppNotificationMedia m6173q(int orientation) {
        Iterator<CTInAppNotificationMedia> it = this._mediaList.iterator();
        it.getClass();
        while (it.hasNext()) {
            CTInAppNotificationMedia next = it.next();
            next.getClass();
            CTInAppNotificationMedia cTInAppNotificationMedia = next;
            if (orientation == cTInAppNotificationMedia.getOrientation()) {
                return cTInAppNotificationMedia;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final CTInAppType getInAppType() {
        return this.inAppType;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final JSONObject m6175s() {
        return lw3.m151936f(this._jsonDescription);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getMaxPerSession() {
        return this.maxPerSession;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final List<CTInAppNotificationMedia> m6177u() {
        return this._mediaList;
    }

    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.campaignId);
        dest.writeValue(this.inAppType);
        dest.writeString(this.html);
        dest.writeByte(this.isExcludeFromCaps ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isShowClose ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isDarkenScreen ? (byte) 1 : (byte) 0);
        dest.writeInt(this.maxPerSession);
        dest.writeInt(this.totalLifetimeCount);
        dest.writeInt(this.totalDailyCount);
        dest.writeInt(this.position);
        dest.writeInt(this.height);
        dest.writeInt(this.heightPercentage);
        dest.writeInt(this.width);
        dest.writeInt(this.widthPercentage);
        dest.writeString(this._jsonDescription.toString());
        dest.writeString(this.error);
        if (this.customExtras == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeString(String.valueOf(this.customExtras));
        }
        if (this._actionExtras == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeString(String.valueOf(this._actionExtras));
        }
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.titleColor);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.message);
        dest.writeString(this.messageColor);
        dest.writeTypedList(this._buttons);
        dest.writeTypedList(this._mediaList);
        dest.writeByte(this.isHideCloseButton ? (byte) 1 : (byte) 0);
        dest.writeInt(this.buttonCount);
        dest.writeByte(this.isTablet ? (byte) 1 : (byte) 0);
        dest.writeString(this.customInAppUrl);
        dest.writeByte(this.isJsEnabled ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isPortrait ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isLandscape ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isLocalInApp ? (byte) 1 : (byte) 0);
        dest.writeByte(this.fallBackToNotificationSettings ? (byte) 1 : (byte) 0);
        dest.writeString(this.landscapeImageUrl);
        dest.writeLong(this.timeToLive);
        dest.writeParcelable(this.customTemplateData, flags);
        dest.writeDouble(this.aspectRatio);
        dest.writeByte(this.isRequestForPushPermission ? (byte) 1 : (byte) 0);
    }

    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getMessageColor() {
        return this.messageColor;
    }

    @Nullable
    /* JADX INFO: renamed from: y, reason: from getter */
    public final JSONObject getPipConfigJson() {
        return this.pipConfigJson;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final char getPosition() {
        return this.position;
    }

    public CTInAppNotification(@NotNull JSONObject jSONObject, boolean z) {
        jSONObject.getClass();
        this._buttons = new ArrayList<>();
        this.backgroundColor = "#FFFFFF";
        this.aspectRatio = -1.0d;
        this._mediaList = new ArrayList<>();
        this.messageColor = Constants.BLACK;
        this.titleColor = Constants.BLACK;
        this.isVideoSupported = z;
        this._jsonDescription = jSONObject;
        try {
            String strM204934a = wpq.m204934a(jSONObject, "type");
            this.type = strM204934a;
            if (strM204934a != null && !Intrinsics.m87488d(strM204934a, Constants.KEY_CUSTOM_HTML)) {
                m6138a(jSONObject);
                return;
            }
            m6136U(jSONObject);
        } catch (JSONException e) {
            this.error = "Invalid JSON: " + e.getLocalizedMessage();
        }
    }

    public /* synthetic */ CTInAppNotification(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }
}
