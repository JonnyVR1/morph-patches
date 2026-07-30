package com.p000p1.mobile.putong.miniwidget;

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
import com.p000p1.mobile.putong.miniwidget.MiniWidgetService;
import com.p000p1.mobile.putong.p004ui.splash.SplashProxyAct;
import com.p1.mobile.putong.data.MiniWidgetData;
import com.p1.mobile.putong.data.MiniWidgetEnvelope;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e6c0;
import l.mkd0;
import l.qib0;
import l.r8s;
import l.s4c0;
import l.yl5;
import p009l.y8i0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MiniWidgetService extends SafeJobIntentService {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9174a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9175b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9177d(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHandleWork$0(MiniWidgetEnvelope miniWidgetEnvelope) {
        updateViews(miniWidgetEnvelope.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$onHandleWork$1(Throwable th) {
        updateViewsNotLogin(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateViews$2(MiniWidgetData miniWidgetData, Pair pair) {
        if (NullChecker.a(pair.first) && NullChecker.a(pair.second)) {
            updateWidget(miniWidgetData, (Bitmap) pair.first, (Bitmap) pair.second);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateViews$4(MiniWidgetData miniWidgetData, Bitmap bitmap) {
        if (NullChecker.a(bitmap)) {
            updateWidget(miniWidgetData, bitmap, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateViews$6(MiniWidgetData miniWidgetData, Bitmap bitmap) {
        if (NullChecker.a(bitmap)) {
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
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), e6c0.C);
        int i = context.getResources().getConfiguration().uiMode & 48;
        PendingIntent activity = PendingIntent.getActivity(context, 100, new Intent(context, (Class<?>) SplashProxyAct.class), 67108864);
        remoteViews.setViewVisibility(s4c0.N, 8);
        if (i == 32) {
            remoteViews.setViewVisibility(s4c0.C0, 8);
            remoteViews.setViewVisibility(s4c0.B0, 0);
            remoteViews.setOnClickPendingIntent(s4c0.B0, activity);
        } else {
            remoteViews.setViewVisibility(s4c0.C0, 0);
            remoteViews.setViewVisibility(s4c0.B0, 8);
            remoteViews.setOnClickPendingIntent(s4c0.C0, activity);
        }
        appWidgetManager.updateAppWidget(componentName, remoteViews);
    }

    public void onHandleWork(@NonNull Intent intent) {
        y8i0.m25203a("MiniWidgetService onHandle work");
        yl5 yl5Var = qib0.c0;
        if (yl5Var != null && yl5Var.signedIn_()) {
            qib0.V.z(qib0.c0.userId()).subscribe(mkd0.H(new e30() { // from class: l.z200
                public final void call(Object obj) {
                    this.f23322a.lambda$onHandleWork$0((MiniWidgetEnvelope) obj);
                }
            }, new e30() { // from class: l.a300
                public final void call(Object obj) {
                    this.f9195a.lambda$onHandleWork$1((Throwable) obj);
                }
            }));
        }
        y8i0.m25204b();
    }

    public void updateViews(final MiniWidgetData miniWidgetData) {
        if (NullChecker.a(miniWidgetData) && !TextUtils.isEmpty(miniWidgetData.avatar) && !TextUtils.isEmpty(miniWidgetData.backgroundImage)) {
            c.combineLatest(qib0.G.E(miniWidgetData.avatar), qib0.G.E(miniWidgetData.backgroundImage), new r8s()).subscribe(mkd0.H(new e30() { // from class: l.t200
                public final void call(Object obj) {
                    this.f20524a.lambda$updateViews$2(miniWidgetData, (Pair) obj);
                }
            }, new e30() { // from class: l.u200
                public final void call(Object obj) {
                    MiniWidgetService.m9175b((Throwable) obj);
                }
            }));
            return;
        }
        if (NullChecker.a(miniWidgetData) && !TextUtils.isEmpty(miniWidgetData.avatar)) {
            qib0.G.E(miniWidgetData.avatar).subscribe(mkd0.H(new e30() { // from class: l.v200
                public final void call(Object obj) {
                    this.f21431a.lambda$updateViews$4(miniWidgetData, (Bitmap) obj);
                }
            }, new e30() { // from class: l.w200
                public final void call(Object obj) {
                    MiniWidgetService.m9174a((Throwable) obj);
                }
            }));
        } else {
            if (!NullChecker.a(miniWidgetData) || TextUtils.isEmpty(miniWidgetData.backgroundImage)) {
                return;
            }
            qib0.G.E(miniWidgetData.backgroundImage).subscribe(mkd0.H(new e30() { // from class: l.x200
                public final void call(Object obj) {
                    this.f22406a.lambda$updateViews$6(miniWidgetData, (Bitmap) obj);
                }
            }, new e30() { // from class: l.y200
                public final void call(Object obj) {
                    MiniWidgetService.m9177d((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateWidget(MiniWidgetData miniWidgetData, Bitmap bitmap, Bitmap bitmap2) {
        Uri uri;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        ComponentName componentName = new ComponentName((Context) this, (Class<?>) MiniWidgetProvider.class);
        RemoteViews remoteViews = new RemoteViews(getPackageName(), e6c0.C);
        if (NullChecker.a(bitmap) && !bitmap.isRecycled()) {
            Bitmap roundBitmap = toRoundBitmap(bitmap);
            if (NullChecker.a(roundBitmap) && !roundBitmap.isRecycled()) {
                remoteViews.setImageViewBitmap(s4c0.P, roundBitmap);
            }
        }
        if (NullChecker.a(bitmap2) && !bitmap2.isRecycled()) {
            remoteViews.setImageViewBitmap(s4c0.O, bitmap2);
        }
        if (!TextUtils.isEmpty(miniWidgetData.leftTopText)) {
            remoteViews.setTextViewText(s4c0.F0, miniWidgetData.leftTopText);
        }
        if (!TextUtils.isEmpty(miniWidgetData.line1textNearAvatar)) {
            remoteViews.setTextViewText(s4c0.D0, miniWidgetData.line1textNearAvatar);
        }
        if (!TextUtils.isEmpty(miniWidgetData.line2textNearAvatar)) {
            remoteViews.setTextViewText(s4c0.E0, miniWidgetData.line2textNearAvatar);
        }
        remoteViews.setViewVisibility(s4c0.N, 0);
        try {
            uri = Uri.parse(miniWidgetData.deeplink);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null) {
            remoteViews.setOnClickPendingIntent(s4c0.o0, PendingIntent.getActivity(this, 101, new Intent().setData(uri), 67108864));
        }
        remoteViews.setViewVisibility(s4c0.C0, 8);
        remoteViews.setViewVisibility(s4c0.B0, 8);
        appWidgetManager.updateAppWidget(componentName, remoteViews);
    }
}
