package com.clevertap.android.sdk.inapp;

import android.animation.TimeInterpolator;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPAnimationConfig;
import com.clevertap.android.sdk.inapp.pipsdk.PIPMediaType;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15385c;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.h160;
import p149l.nul;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!¨\u0006\""}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/c;", "", "<init>", "()V", "", "position", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "Lorg/json/JSONObject;", "animJson", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "b", "(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "easing", "bezier", "Landroid/animation/TimeInterpolator;", "c", "(Ljava/lang/String;Ljava/lang/String;)Landroid/animation/TimeInterpolator;", "e", "(Ljava/lang/String;)Landroid/animation/TimeInterpolator;", "hex", "", "f", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", "Ll/h160;", "callbacks", "Ll/nul;", "logger", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "a", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ll/h160;Ll/nul;)Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C1215c {

    @NotNull
    public static final C1215c INSTANCE = new C1215c();

    private C1215c() {
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
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.clevertap.android.sdk.inapp.pipsdk.PIPAnimationConfig m6294b(org.json.JSONObject r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.inapp.C1215c.m6294b(org.json.JSONObject):com.clevertap.android.sdk.inapp.pipsdk.PIPAnimationConfig");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    private final TimeInterpolator m6295c(String easing, String bezier) {
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
                    TimeInterpolator timeInterpolatorM6297e = m6297e(bezier);
                    return timeInterpolatorM6297e == null ? PIPAnimationConfig.INSTANCE.m6531a() : timeInterpolatorM6297e;
                }
                break;
        }
        return PIPAnimationConfig.INSTANCE.m6531a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private final PIPPosition m6296d(String position) {
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
    private final TimeInterpolator m6297e(String bezier) {
        List listSplit$default = StringsKt.split$default(bezier, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Float fM93473n = C15385c.m93473n(StringsKt.m93433Z0((String) it.next()).toString());
            if (fM93473n != null) {
                arrayList.add(fM93473n);
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
    private final Integer m6298f(String hex) {
        if (StringsKt.m93438e0(hex)) {
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
    public final C1265a m6299a(@NotNull CTInAppNotification inAppNotification, @NotNull h160 callbacks, @NotNull nul logger) {
        PIPMediaType pIPMediaType;
        PIPPosition pIPPositionM6296d;
        boolean z;
        boolean zOptBoolean;
        String strOptString;
        Integer numM6298f;
        CTInAppAction cTInAppActionM6131b;
        PIPAnimationConfig pIPAnimationConfigM6294b;
        String strOptString2;
        inAppNotification.getClass();
        callbacks.getClass();
        logger.getClass();
        JSONObject pipConfigJson = inAppNotification.getPipConfigJson();
        if (pipConfigJson == null) {
            logger.debug("PIPConfigFactory", "No pip config JSON found");
            return null;
        }
        CTInAppNotificationMedia cTInAppNotificationMediaM6173q = inAppNotification.m6173q(1);
        if (cTInAppNotificationMediaM6173q == null || StringsKt.m93438e0(cTInAppNotificationMediaM6173q.getMediaUrl())) {
            logger.debug("PIPConfigFactory", "No media found for PIP");
            return null;
        }
        if (cTInAppNotificationMediaM6173q.m6201h()) {
            pIPMediaType = PIPMediaType.VIDEO;
        } else if (cTInAppNotificationMediaM6173q.m6199f()) {
            pIPMediaType = PIPMediaType.GIF;
        } else {
            if (!cTInAppNotificationMediaM6173q.m6200g()) {
                logger.debug("PIPConfigFactory", "Unsupported media type: " + cTInAppNotificationMediaM6173q.getContentType());
                return null;
            }
            pIPMediaType = PIPMediaType.IMAGE;
        }
        PIPMediaType pIPMediaType2 = pIPMediaType;
        String contentDescription = cTInAppNotificationMediaM6173q.getContentDescription();
        if (StringsKt.m93438e0(contentDescription)) {
            contentDescription = null;
        }
        String str = contentDescription == null ? "" : contentDescription;
        JSONObject jSONObjectOptJSONObject = inAppNotification.m6175s().optJSONObject("media");
        String str2 = (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString("fallback_url", "")) == null || StringsKt.m93438e0(strOptString2)) ? null : strOptString2;
        String strOptString3 = pipConfigJson.optString("position", "");
        strOptString3.getClass();
        if (StringsKt.m93438e0(strOptString3)) {
            strOptString3 = null;
        }
        if (strOptString3 == null || (pIPPositionM6296d = INSTANCE.m6296d(strOptString3)) == null) {
            pIPPositionM6296d = PIPPosition.BOTTOM_RIGHT;
        }
        PIPPosition pIPPosition = pIPPositionM6296d;
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
        PIPAnimationConfig pIPAnimationConfig = (jSONObjectOptJSONObject5 == null || (pIPAnimationConfigM6294b = INSTANCE.m6294b(jSONObjectOptJSONObject5)) == null) ? new PIPAnimationConfig(null, 0L, null, null, 15, null) : pIPAnimationConfigM6294b;
        JSONObject jSONObjectOptJSONObject6 = pipConfigJson.optJSONObject("onClick");
        CTInAppAction cTInAppAction = (jSONObjectOptJSONObject6 == null || (cTInAppActionM6131b = CTInAppAction.INSTANCE.m6131b(jSONObjectOptJSONObject6)) == null || cTInAppActionM6131b.getType() == null) ? null : cTInAppActionM6131b;
        int iOptInt4 = pipConfigJson.optInt("cornerRadius", 0);
        JSONObject jSONObjectOptJSONObject7 = pipConfigJson.optJSONObject("border");
        try {
            return new C1265a(cTInAppNotificationMediaM6173q.getMediaUrl(), pIPMediaType2, str2, str, iOptInt3, dDoubleValue, d, pIPPosition, iOptInt2, iOptInt, pIPAnimationConfig, cTInAppAction, inAppNotification.m6175s().optBoolean("close", true), zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, iOptInt4, jSONObjectOptJSONObject7 != null ? jSONObjectOptJSONObject7.optBoolean("enabled", false) : false, (jSONObjectOptJSONObject7 == null || (strOptString = jSONObjectOptJSONObject7.optString("color", "")) == null || (numM6298f = INSTANCE.m6298f(strOptString)) == null) ? RoundedDrawable.DEFAULT_BORDER_COLOR : numM6298f.intValue(), jSONObjectOptJSONObject7 != null ? jSONObjectOptJSONObject7.optInt("width", 0) : 0, callbacks);
        } catch (IllegalArgumentException e) {
            logger.debug("PIPConfigFactory", "Failed to build PIPConfig: " + e.getMessage());
            return null;
        }
    }
}
