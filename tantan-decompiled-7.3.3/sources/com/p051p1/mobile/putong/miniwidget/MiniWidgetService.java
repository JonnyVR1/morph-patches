package com.p051p1.mobile.putong.miniwidget;

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
import com.p051p1.mobile.putong.data.MiniWidgetData;
import com.p051p1.mobile.putong.data.MiniWidgetEnvelope;
import com.p051p1.mobile.putong.miniwidget.MiniWidgetService;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import p137rx.C22421c;
import p153l.bn5;
import p153l.jec0;
import p153l.psd0;
import p153l.sas;
import p153l.uqb0;
import p153l.y20;
import p153l.ycc0;
import p153l.yhi0;

/* JADX INFO: loaded from: classes10.dex */
public class MiniWidgetService extends SafeJobIntentService {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80062a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80063b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80065d(Throwable th) {
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
        if (NullChecker.m82486a(pair.first) && NullChecker.m82486a(pair.second)) {
            updateWidget(miniWidgetData, (Bitmap) pair.first, (Bitmap) pair.second);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateViews$4(MiniWidgetData miniWidgetData, Bitmap bitmap) {
        if (NullChecker.m82486a(bitmap)) {
            updateWidget(miniWidgetData, bitmap, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateViews$6(MiniWidgetData miniWidgetData, Bitmap bitmap) {
        if (NullChecker.m82486a(bitmap)) {
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
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), jec0.f120434C);
        int i = context.getResources().getConfiguration().uiMode & 48;
        PendingIntent activity = PendingIntent.getActivity(context, 100, new Intent(context, (Class<?>) SplashProxyAct.class), AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        remoteViews.setViewVisibility(ycc0.f198430N, 8);
        if (i == 32) {
            remoteViews.setViewVisibility(ycc0.f198409C0, 8);
            remoteViews.setViewVisibility(ycc0.f198407B0, 0);
            remoteViews.setOnClickPendingIntent(ycc0.f198407B0, activity);
        } else {
            remoteViews.setViewVisibility(ycc0.f198409C0, 0);
            remoteViews.setViewVisibility(ycc0.f198407B0, 8);
            remoteViews.setOnClickPendingIntent(ycc0.f198409C0, activity);
        }
        appWidgetManager.updateAppWidget(componentName, remoteViews);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        yhi0.m215967a("MiniWidgetService onHandle work");
        bn5 bn5Var = uqb0.f180397c0;
        if (bn5Var != null && bn5Var.signedIn_()) {
            uqb0.f180390V.m158703z(uqb0.f180397c0.userId()).subscribe(psd0.m173597H(new y20() { // from class: l.wb00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188186a.lambda$onHandleWork$0((MiniWidgetEnvelope) obj);
                }
            }, new y20() { // from class: l.xb00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193098a.lambda$onHandleWork$1((Throwable) obj);
                }
            }));
        }
        yhi0.m215968b();
    }

    public void updateViews(final MiniWidgetData miniWidgetData) {
        if (NullChecker.m82486a(miniWidgetData) && !TextUtils.isEmpty(miniWidgetData.avatar) && !TextUtils.isEmpty(miniWidgetData.backgroundImage)) {
            C22421c.combineLatest(uqb0.f180374G.m127100E(miniWidgetData.avatar), uqb0.f180374G.m127100E(miniWidgetData.backgroundImage), new sas()).subscribe(psd0.m173597H(new y20() { // from class: l.qb00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156446a.lambda$updateViews$2(miniWidgetData, (Pair) obj);
                }
            }, new y20() { // from class: l.rb00
                @Override // p153l.y20
                public final void call(Object obj) {
                    MiniWidgetService.m80063b((Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.m82486a(miniWidgetData) && !TextUtils.isEmpty(miniWidgetData.avatar)) {
            uqb0.f180374G.m127100E(miniWidgetData.avatar).subscribe(psd0.m173597H(new y20() { // from class: l.sb00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167096a.lambda$updateViews$4(miniWidgetData, (Bitmap) obj);
                }
            }, new y20() { // from class: l.tb00
                @Override // p153l.y20
                public final void call(Object obj) {
                    MiniWidgetService.m80062a((Throwable) obj);
                }
            }));
        } else {
            if (!NullChecker.m82486a(miniWidgetData) || TextUtils.isEmpty(miniWidgetData.backgroundImage)) {
                return;
            }
            uqb0.f180374G.m127100E(miniWidgetData.backgroundImage).subscribe(psd0.m173597H(new y20() { // from class: l.ub00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178252a.lambda$updateViews$6(miniWidgetData, (Bitmap) obj);
                }
            }, new y20() { // from class: l.vb00
                @Override // p153l.y20
                public final void call(Object obj) {
                    MiniWidgetService.m80065d((Throwable) obj);
                }
            }));
        }
    }

    public void updateWidget(MiniWidgetData miniWidgetData, Bitmap bitmap, Bitmap bitmap2) {
        Uri uri;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        ComponentName componentName = new ComponentName(this, (Class<?>) MiniWidgetProvider.class);
        RemoteViews remoteViews = new RemoteViews(getPackageName(), jec0.f120434C);
        if (NullChecker.m82486a(bitmap) && !bitmap.isRecycled()) {
            Bitmap roundBitmap = toRoundBitmap(bitmap);
            if (NullChecker.m82486a(roundBitmap) && !roundBitmap.isRecycled()) {
                remoteViews.setImageViewBitmap(ycc0.f198433P, roundBitmap);
            }
        }
        if (NullChecker.m82486a(bitmap2) && !bitmap2.isRecycled()) {
            remoteViews.setImageViewBitmap(ycc0.f198432O, bitmap2);
        }
        if (!TextUtils.isEmpty(miniWidgetData.leftTopText)) {
            remoteViews.setTextViewText(ycc0.f198415F0, miniWidgetData.leftTopText);
        }
        if (!TextUtils.isEmpty(miniWidgetData.line1textNearAvatar)) {
            remoteViews.setTextViewText(ycc0.f198411D0, miniWidgetData.line1textNearAvatar);
        }
        if (!TextUtils.isEmpty(miniWidgetData.line2textNearAvatar)) {
            remoteViews.setTextViewText(ycc0.f198413E0, miniWidgetData.line2textNearAvatar);
        }
        remoteViews.setViewVisibility(ycc0.f198430N, 0);
        try {
            uri = Uri.parse(miniWidgetData.deeplink);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null) {
            remoteViews.setOnClickPendingIntent(ycc0.f198473o0, PendingIntent.getActivity(this, 101, new Intent().setData(uri), AudioRoutingController.DEVICE_OUT_USB_HEADSET));
        }
        remoteViews.setViewVisibility(ycc0.f198409C0, 8);
        remoteViews.setViewVisibility(ycc0.f198407B0, 8);
        appWidgetManager.updateAppWidget(componentName, remoteViews);
    }
}
