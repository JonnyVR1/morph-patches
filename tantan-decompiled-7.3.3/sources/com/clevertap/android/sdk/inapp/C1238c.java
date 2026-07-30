package com.clevertap.android.sdk.inapp;

import android.animation.TimeInterpolator;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimation;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimationConfig;
import com.clevertap.android.sdk.inapp.pipsdk.PIPMediaType;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.text.C15492c;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.axl;
import p153l.m960;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/c;", "", "<init>", "()V", "", "position", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "Lorg/json/JSONObject;", "animJson", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "b", "(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "easing", "bezier", "Landroid/animation/TimeInterpolator;", "c", "(Ljava/lang/String;Ljava/lang/String;)Landroid/animation/TimeInterpolator;", "e", "(Ljava/lang/String;)Landroid/animation/TimeInterpolator;", "hex", "", "f", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Ll/m960;", "callbacks", "Ll/axl;", "logger", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "a", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/m960;Ll/axl;)Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1238c {

    @NotNull
    public static final C1238c INSTANCE = new C1238c();

    private C1238c() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r1.equals("move_in") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.equals("move-in") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r1.equals("movein") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        r1 = com.clevertap.android.sdk.inapp.pipsdk.PIPAnimation.MOVE_IN;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PIPAnimationConfig m6348b(JSONObject animJson) {
        PIPAnimation pIPAnimation;
        String lowerCase;
        String strOptString = animJson.optString("type", "");
        strOptString.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase2 = strOptString.toLowerCase(locale);
        lowerCase2.getClass();
        PIPAnimationConfig.MoveInDirection moveInDirection = null;
        switch (lowerCase2.hashCode()) {
            case -1068263242:
                break;
            case 287951985:
                if (lowerCase2.equals("dissolve")) {
                    pIPAnimation = PIPAnimation.DISSOLVE;
                    PIPAnimation pIPAnimation2 = pIPAnimation;
                    long jM88493i = C15274a.m88493i(animJson.optLong(BLiveOperationTitleShowType.duration, 300L), 0L, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    String strOptString2 = animJson.optString("easing", "");
                    strOptString2.getClass();
                    String strOptString3 = animJson.optString("bezier", "");
                    strOptString3.getClass();
                    TimeInterpolator timeInterpolatorM6349c = m6349c(strOptString2, strOptString3);
                    String strOptString4 = animJson.optString("moveInDirection", "");
                    strOptString4.getClass();
                    lowerCase = strOptString4.toLowerCase(locale);
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case -1383228885:
                            if (lowerCase.equals("bottom")) {
                                moveInDirection = PIPAnimationConfig.MoveInDirection.BOTTOM;
                            }
                            break;
                        case 115029:
                            if (lowerCase.equals(StickStatus.top)) {
                                moveInDirection = PIPAnimationConfig.MoveInDirection.TOP;
                            }
                            break;
                        case 3317767:
                            if (lowerCase.equals(BLiveGiftBubblePopupTitlePosition.left)) {
                                moveInDirection = PIPAnimationConfig.MoveInDirection.LEFT;
                            }
                            break;
                        case 108511772:
                            if (lowerCase.equals("right")) {
                                moveInDirection = PIPAnimationConfig.MoveInDirection.RIGHT;
                            }
                            break;
                    }
                    return new PIPAnimationConfig(pIPAnimation2, jM88493i, timeInterpolatorM6349c, moveInDirection);
                }
                return null;
            case 1243520161:
                break;
            case 1243568211:
                break;
            case 1957570017:
                if (lowerCase2.equals("instant")) {
                    pIPAnimation = PIPAnimation.INSTANT;
                    PIPAnimation pIPAnimation3 = pIPAnimation;
                    long jM88493i2 = C15274a.m88493i(animJson.optLong(BLiveOperationTitleShowType.duration, 300L), 0L, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    String strOptString5 = animJson.optString("easing", "");
                    strOptString5.getClass();
                    String strOptString6 = animJson.optString("bezier", "");
                    strOptString6.getClass();
                    TimeInterpolator timeInterpolatorM6349c2 = m6349c(strOptString5, strOptString6);
                    String strOptString7 = animJson.optString("moveInDirection", "");
                    strOptString7.getClass();
                    lowerCase = strOptString7.toLowerCase(locale);
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case -1383228885:
                            if (lowerCase.equals("bottom")) {
                                moveInDirection = PIPAnimationConfig.MoveInDirection.BOTTOM;
                            }
                            break;
                        case 115029:
                            if (lowerCase.equals(StickStatus.top)) {
                                moveInDirection = PIPAnimationConfig.MoveInDirection.TOP;
                            }
                            break;
                        case 3317767:
                            if (lowerCase.equals(BLiveGiftBubblePopupTitlePosition.left)) {
                                moveInDirection = PIPAnimationConfig.MoveInDirection.LEFT;
                            }
                            break;
                        case 108511772:
                            if (lowerCase.equals("right")) {
                                moveInDirection = PIPAnimationConfig.MoveInDirection.RIGHT;
                            }
                            break;
                    }
                    return new PIPAnimationConfig(pIPAnimation3, jM88493i2, timeInterpolatorM6349c2, moveInDirection);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    private final TimeInterpolator m6349c(String easing, String bezier) {
        String lowerCase = easing.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -1965120668:
                if (lowerCase.equals("ease-in")) {
                    return new AccelerateInterpolator();
                }
                break;
            case -1102672091:
                if (lowerCase.equals("linear")) {
                    return new LinearInterpolator();
                }
                break;
            case -789192465:
                if (lowerCase.equals("ease-out")) {
                    return new DecelerateInterpolator();
                }
                break;
            case -361990811:
                if (lowerCase.equals("ease-in-out")) {
                    return new AccelerateDecelerateInterpolator();
                }
                break;
            case 2146926274:
                if (lowerCase.equals("cubic-bezier")) {
                    TimeInterpolator timeInterpolatorM6351e = m6351e(bezier);
                    return timeInterpolatorM6351e == null ? PIPAnimationConfig.INSTANCE.m6585a() : timeInterpolatorM6351e;
                }
                break;
        }
        return PIPAnimationConfig.INSTANCE.m6585a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private final PIPPosition m6350d(String position) {
        String lowerCase = position.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals("center")) {
                    return PIPPosition.CENTER;
                }
                return null;
            case -1314880604:
                if (lowerCase.equals("top-right")) {
                    return PIPPosition.TOP_RIGHT;
                }
                return null;
            case -1138930012:
                if (lowerCase.equals("center-right")) {
                    return PIPPosition.RIGHT_CENTER;
                }
                return null;
            case -1012429441:
                if (lowerCase.equals("top-left")) {
                    return PIPPosition.TOP_LEFT;
                }
                return null;
            case -655373719:
                if (lowerCase.equals("bottom-left")) {
                    return PIPPosition.BOTTOM_LEFT;
                }
                return null;
            case 1163912186:
                if (lowerCase.equals("bottom-right")) {
                    return PIPPosition.BOTTOM_RIGHT;
                }
                return null;
            case 1288627767:
                if (lowerCase.equals("bottom-center")) {
                    return PIPPosition.BOTTOM_CENTER;
                }
                return null;
            case 1625645695:
                if (lowerCase.equals("center-left")) {
                    return PIPPosition.LEFT_CENTER;
                }
                return null;
            case 1755462605:
                if (lowerCase.equals("top-center")) {
                    return PIPPosition.TOP_CENTER;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final TimeInterpolator m6351e(String bezier) {
        List listSplit$default = StringsKt.split$default(bezier, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Float fM94364n = C15492c.m94364n(StringsKt.m94324Z0((String) it.next()).toString());
            if (fM94364n != null) {
                arrayList.add(fM94364n);
            }
        }
        if (arrayList.size() != 4) {
            return null;
        }
        try {
            return new PathInterpolator(((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue(), ((Number) arrayList.get(2)).floatValue(), ((Number) arrayList.get(3)).floatValue());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private final Integer m6352f(String hex) {
        if (StringsKt.m94329e0(hex)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(hex));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C1288a m6353a(@NotNull CTInAppNotification inAppNotification, @NotNull m960 callbacks, @NotNull axl logger) {
        PIPMediaType pIPMediaType;
        PIPPosition pIPPositionM6350d;
        boolean z;
        boolean zOptBoolean;
        String strOptString;
        Integer numM6352f;
        CTInAppAction cTInAppActionM6185b;
        PIPAnimationConfig pIPAnimationConfigM6348b;
        String strOptString2;
        inAppNotification.getClass();
        callbacks.getClass();
        logger.getClass();
        JSONObject pipConfigJson = inAppNotification.getPipConfigJson();
        if (pipConfigJson == null) {
            logger.debug("PIPConfigFactory", "No pip config JSON found");
            return null;
        }
        CTInAppNotificationMedia cTInAppNotificationMediaM6227q = inAppNotification.m6227q(1);
        if (cTInAppNotificationMediaM6227q == null || StringsKt.m94329e0(cTInAppNotificationMediaM6227q.getMediaUrl())) {
            logger.debug("PIPConfigFactory", "No media found for PIP");
            return null;
        }
        if (cTInAppNotificationMediaM6227q.m6255h()) {
            pIPMediaType = PIPMediaType.VIDEO;
        } else if (cTInAppNotificationMediaM6227q.m6253f()) {
            pIPMediaType = PIPMediaType.GIF;
        } else {
            if (!cTInAppNotificationMediaM6227q.m6254g()) {
                logger.debug("PIPConfigFactory", "Unsupported media type: " + cTInAppNotificationMediaM6227q.getContentType());
                return null;
            }
            pIPMediaType = PIPMediaType.IMAGE;
        }
        PIPMediaType pIPMediaType2 = pIPMediaType;
        String contentDescription = cTInAppNotificationMediaM6227q.getContentDescription();
        if (StringsKt.m94329e0(contentDescription)) {
            contentDescription = null;
        }
        String str = contentDescription == null ? "" : contentDescription;
        JSONObject jSONObjectOptJSONObject = inAppNotification.m6229s().optJSONObject("media");
        String str2 = (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString("fallback_url", "")) == null || StringsKt.m94329e0(strOptString2)) ? null : strOptString2;
        String strOptString3 = pipConfigJson.optString("position", "");
        strOptString3.getClass();
        if (StringsKt.m94329e0(strOptString3)) {
            strOptString3 = null;
        }
        if (strOptString3 == null || (pIPPositionM6350d = INSTANCE.m6350d(strOptString3)) == null) {
            pIPPositionM6350d = PIPPosition.BOTTOM_RIGHT;
        }
        PIPPosition pIPPosition = pIPPositionM6350d;
        JSONObject jSONObjectOptJSONObject2 = pipConfigJson.optJSONObject("margins");
        int iOptInt = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optInt("vertical", 3) : 3;
        int iOptInt2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optInt("horizontal", 3) : 3;
        int iOptInt3 = pipConfigJson.optInt("width", 35);
        JSONObject jSONObjectOptJSONObject3 = pipConfigJson.optJSONObject(Constants.INAPP_ASPECT_RATIO);
        double dDoubleValue = 16.0d;
        if (jSONObjectOptJSONObject3 != null) {
            Double dValueOf = Double.valueOf(jSONObjectOptJSONObject3.optDouble("numerator", 16.0d));
            if (dValueOf.doubleValue() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dValueOf = null;
            }
            if (dValueOf != null) {
                dDoubleValue = dValueOf.doubleValue();
            }
        }
        double dDoubleValue2 = 9.0d;
        if (jSONObjectOptJSONObject3 != null) {
            Double dValueOf2 = Double.valueOf(jSONObjectOptJSONObject3.optDouble("denominator", 9.0d));
            if (dValueOf2.doubleValue() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                dValueOf2 = null;
            }
            if (dValueOf2 != null) {
                dDoubleValue2 = dValueOf2.doubleValue();
            }
        }
        double d = dDoubleValue2;
        JSONObject jSONObjectOptJSONObject4 = pipConfigJson.optJSONObject("controls");
        if (jSONObjectOptJSONObject4 != null) {
            z = true;
            zOptBoolean = jSONObjectOptJSONObject4.optBoolean("drag", true);
        } else {
            z = true;
            zOptBoolean = true;
        }
        boolean zOptBoolean2 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optBoolean("playPause", z) : z;
        boolean zOptBoolean3 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optBoolean(BLiveButtonType.mute, z) : z;
        boolean zOptBoolean4 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optBoolean("expandCollapse", z) : true;
        JSONObject jSONObjectOptJSONObject5 = pipConfigJson.optJSONObject("animation");
        PIPAnimationConfig pIPAnimationConfig = (jSONObjectOptJSONObject5 == null || (pIPAnimationConfigM6348b = INSTANCE.m6348b(jSONObjectOptJSONObject5)) == null) ? new PIPAnimationConfig(null, 0L, null, null, 15, null) : pIPAnimationConfigM6348b;
        JSONObject jSONObjectOptJSONObject6 = pipConfigJson.optJSONObject("onClick");
        CTInAppAction cTInAppAction = (jSONObjectOptJSONObject6 == null || (cTInAppActionM6185b = CTInAppAction.INSTANCE.m6185b(jSONObjectOptJSONObject6)) == null || cTInAppActionM6185b.getType() == null) ? null : cTInAppActionM6185b;
        int iOptInt4 = pipConfigJson.optInt("cornerRadius", 0);
        JSONObject jSONObjectOptJSONObject7 = pipConfigJson.optJSONObject("border");
        try {
            return new C1288a(cTInAppNotificationMediaM6227q.getMediaUrl(), pIPMediaType2, str2, str, iOptInt3, dDoubleValue, d, pIPPosition, iOptInt2, iOptInt, pIPAnimationConfig, cTInAppAction, inAppNotification.m6229s().optBoolean("close", true), zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, iOptInt4, jSONObjectOptJSONObject7 != null ? jSONObjectOptJSONObject7.optBoolean("enabled", false) : false, (jSONObjectOptJSONObject7 == null || (strOptString = jSONObjectOptJSONObject7.optString("color", "")) == null || (numM6352f = INSTANCE.m6352f(strOptString)) == null) ? RoundedDrawable.DEFAULT_BORDER_COLOR : numM6352f.intValue(), jSONObjectOptJSONObject7 != null ? jSONObjectOptJSONObject7.optInt("width", 0) : 0, callbacks);
        } catch (IllegalArgumentException e) {
            logger.debug("PIPConfigFactory", "Failed to build PIPConfig: " + e.getMessage());
            return null;
        }
    }
}
