package com.p046p1.mobile.putong.miniwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.core.app.SafeJobIntentService;
import com.p046p1.mobile.putong.data.MiniWidgetData;
import com.p046p1.mobile.putong.data.MiniWidgetEnvelope;
import com.p046p1.mobile.putong.miniwidget.MiniWidgetService;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import p133rx.C22306c;
import p149l.e30;
import p149l.e6c0;
import p149l.mkd0;
import p149l.qib0;
import p149l.r8s;
import p149l.s4c0;
import p149l.y8i0;
import p149l.yl5;

/* JADX INFO: loaded from: classes11.dex */
public class MiniWidgetService extends SafeJobIntentService {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m78879a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m78880b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m78882d(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHandleWork$0(MiniWidgetEnvelope miniWidgetEnvelope) {
        updateViews(miniWidgetEnvelope.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHandleWork$1(Throwable th) {
        updateViewsNotLogin(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateViews$2(MiniWidgetData miniWidgetData, Pair pair) {
        if (NullChecker.m81303a(pair.first) && NullChecker.m81303a(pair.second)) {
            updateWidget(miniWidgetData, (Bitmap) pair.first, (Bitmap) pair.second);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateViews$4(MiniWidgetData miniWidgetData, Bitmap bitmap) {
        if (NullChecker.m81303a(bitmap)) {
            updateWidget(miniWidgetData, bitmap, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateViews$6(MiniWidgetData miniWidgetData, Bitmap bitmap) {
        if (NullChecker.m81303a(bitmap)) {
            updateWidget(miniWidgetData, bitmap, bitmap);
        }
    }

    private static Bitmap toRoundBitmap(Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float f4;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f4 = width / 2;
            f3 = width;
            f = 0.0f;
            f2 = f3;
        } else {
            f = (width - height) / 2;
            f2 = height;
            f3 = width - f;
            width = height;
            f4 = height / 2;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect((int) f, 0, (int) f3, (int) f2);
        Rect rect2 = new Rect(0, 0, (int) f2, (int) f2);
        RectF rectF = new RectF(rect2);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f4, f4, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return bitmapCreateBitmap;
    }

    public static void updateViewsNotLogin(Context context) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        ComponentName componentName = new ComponentName(context, (Class<?>) MiniWidgetProvider.class);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), e6c0.f89521C);
        int i = context.getResources().getConfiguration().uiMode & 48;
        PendingIntent activity = PendingIntent.getActivity(context, 100, new Intent(context, (Class<?>) SplashProxyAct.class), AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        remoteViews.setViewVisibility(s4c0.f162309N, 8);
        if (i == 32) {
            remoteViews.setViewVisibility(s4c0.f162288C0, 8);
            remoteViews.setViewVisibility(s4c0.f162286B0, 0);
            remoteViews.setOnClickPendingIntent(s4c0.f162286B0, activity);
        } else {
            remoteViews.setViewVisibility(s4c0.f162288C0, 0);
            remoteViews.setViewVisibility(s4c0.f162286B0, 8);
            remoteViews.setOnClickPendingIntent(s4c0.f162288C0, activity);
        }
        appWidgetManager.updateAppWidget(componentName, remoteViews);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        y8i0.m213379a("MiniWidgetService onHandle work");
        yl5 yl5Var = qib0.f154714c0;
        if (yl5Var != null && yl5Var.signedIn_()) {
            qib0.f154707V.m149957z(qib0.f154714c0.userId()).subscribe(mkd0.m154956H(new e30() { // from class: l.z200
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201115a.lambda$onHandleWork$0((MiniWidgetEnvelope) obj);
                }
            }, new e30() { // from class: l.a300
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67311a.lambda$onHandleWork$1((Throwable) obj);
                }
            }));
        }
        y8i0.m213380b();
    }

    public void updateViews(final MiniWidgetData miniWidgetData) {
        if (NullChecker.m81303a(miniWidgetData) && !TextUtils.isEmpty(miniWidgetData.avatar) && !TextUtils.isEmpty(miniWidgetData.backgroundImage)) {
            C22306c.combineLatest(qib0.f154691G.m102316E(miniWidgetData.avatar), qib0.f154691G.m102316E(miniWidgetData.backgroundImage), new r8s()).subscribe(mkd0.m154956H(new e30() { // from class: l.t200
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167416a.lambda$updateViews$2(miniWidgetData, (Pair) obj);
                }
            }, new e30() { // from class: l.u200
                @Override // p149l.e30
                public final void call(Object obj) {
                    MiniWidgetService.m78880b((Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m81303a(miniWidgetData) && !TextUtils.isEmpty(miniWidgetData.avatar)) {
            qib0.f154691G.m102316E(miniWidgetData.avatar).subscribe(mkd0.m154956H(new e30() { // from class: l.v200
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f179324a.lambda$updateViews$4(miniWidgetData, (Bitmap) obj);
                }
            }, new e30() { // from class: l.w200
                @Override // p149l.e30
                public final void call(Object obj) {
                    MiniWidgetService.m78879a((Throwable) obj);
                }
            }));
        } else {
            if (!NullChecker.m81303a(miniWidgetData) || TextUtils.isEmpty(miniWidgetData.backgroundImage)) {
                return;
            }
            qib0.f154691G.m102316E(miniWidgetData.backgroundImage).subscribe(mkd0.m154956H(new e30() { // from class: l.x200
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f189114a.lambda$updateViews$6(miniWidgetData, (Bitmap) obj);
                }
            }, new e30() { // from class: l.y200
                @Override // p149l.e30
                public final void call(Object obj) {
                    MiniWidgetService.m78882d((Throwable) obj);
                }
            }));
        }
    }

    public void updateWidget(MiniWidgetData miniWidgetData, Bitmap bitmap, Bitmap bitmap2) {
        Uri uri;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        ComponentName componentName = new ComponentName(this, (Class<?>) MiniWidgetProvider.class);
        RemoteViews remoteViews = new RemoteViews(getPackageName(), e6c0.f89521C);
        if (NullChecker.m81303a(bitmap) && !bitmap.isRecycled()) {
            Bitmap roundBitmap = toRoundBitmap(bitmap);
            if (NullChecker.m81303a(roundBitmap) && !roundBitmap.isRecycled()) {
                remoteViews.setImageViewBitmap(s4c0.f162312P, roundBitmap);
            }
        }
        if (NullChecker.m81303a(bitmap2) && !bitmap2.isRecycled()) {
            remoteViews.setImageViewBitmap(s4c0.f162311O, bitmap2);
        }
        if (!TextUtils.isEmpty(miniWidgetData.leftTopText)) {
            remoteViews.setTextViewText(s4c0.f162294F0, miniWidgetData.leftTopText);
        }
        if (!TextUtils.isEmpty(miniWidgetData.line1textNearAvatar)) {
            remoteViews.setTextViewText(s4c0.f162290D0, miniWidgetData.line1textNearAvatar);
        }
        if (!TextUtils.isEmpty(miniWidgetData.line2textNearAvatar)) {
            remoteViews.setTextViewText(s4c0.f162292E0, miniWidgetData.line2textNearAvatar);
        }
        remoteViews.setViewVisibility(s4c0.f162309N, 0);
        try {
            uri = Uri.parse(miniWidgetData.deeplink);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null) {
            remoteViews.setOnClickPendingIntent(s4c0.f162352o0, PendingIntent.getActivity(this, 101, new Intent().setData(uri), AudioRoutingController.DEVICE_OUT_USB_HEADSET));
        }
        remoteViews.setViewVisibility(s4c0.f162288C0, 8);
        remoteViews.setViewVisibility(s4c0.f162286B0, 8);
        appWidgetManager.updateAppWidget(componentName, remoteViews);
    }
}
