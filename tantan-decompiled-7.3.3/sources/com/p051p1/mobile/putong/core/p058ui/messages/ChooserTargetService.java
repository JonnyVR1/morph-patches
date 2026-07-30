package com.p051p1.mobile.putong.core.p058ui.messages;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.service.chooser.ChooserTarget;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.ChooserTargetService;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p153l.gcg0;
import p153l.jyb;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(23)
public class ChooserTargetService extends android.service.chooser.ChooserTargetService {
    private RectF bitmapRect;
    private Paint roundPaint;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49064b(gcg0 gcg0Var, Bitmap bitmap) {
        if (NullChecker.m82486a(bitmap)) {
            gcg0Var.m137019l(bitmap);
            gcg0Var.onCompleted();
        } else {
            gcg0Var.m137019l(null);
            gcg0Var.onCompleted();
        }
    }

    private Icon createRoundBitmap(Bitmap bitmap) {
        try {
            if (!NullChecker.m82486a(bitmap)) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            if (this.roundPaint == null) {
                this.roundPaint = new Paint(1);
                this.bitmapRect = new RectF();
            }
            this.roundPaint.setShader(bitmapShader);
            this.bitmapRect.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            canvas.drawRoundRect(this.bitmapRect, bitmap.getWidth(), bitmap.getHeight(), this.roundPaint);
            return Icon.createWithBitmap(bitmapCreateBitmap);
        } catch (Throwable th) {
            CrashHelper.m82479c(new Throwable("ChooserTargetService createRoundBitmap:" + th.getMessage(), th));
            return null;
        }
    }

    @Override // android.service.chooser.ChooserTargetService
    public List<ChooserTarget> onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        if (!CoreModule.m30929H().signedIn_() || !NullChecker.m82486a(CoreModule.f18264c)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ComponentName componentName2 = new ComponentName(getPackageName(), SelectContactAct.class.getCanonicalName());
        try {
            Iterator it = jyb.m147517k0(CoreModule.f18264c.f20384f0.m33871Ye().toBlocking().m165963b().f184001a, 3).iterator();
            float f = 1.0f;
            while (it.hasNext()) {
                final User userM165963b = CoreModule.f18264c.f20381e0.m116483Ka(((Conversation) it.next()).f56859id).toBlocking().m165963b();
                if (NullChecker.m82486a(userM165963b)) {
                    String str = userM165963b.name;
                    userM165963b.m61308fp().profileSmall();
                    Bitmap bitmap = (Bitmap) C22421c.create(new C22421c.a() { // from class: l.j45
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            uqb0.f180374G.m127106H(userM165963b.m61308fp().profileSmall(), new y20() { // from class: l.k45
                                @Override // p153l.y20
                                public final void call(Object obj2) {
                                    ChooserTargetService.m49064b(gcg0Var, (Bitmap) obj2);
                                }
                            }, true);
                        }
                    }).toBlocking().m165963b();
                    if (NullChecker.m82486a(bitmap)) {
                        arrayList.add(new ChooserTarget(str, createRoundBitmap(bitmap), f, componentName2, SelectContactAct.m50188Z1(CoreModule.f18263b, userM165963b.f56859id).getExtras()));
                        f -= 0.1f;
                    } else {
                        continue;
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("ChooserTargetService onGetChooserTargets:" + e.getMessage(), e));
            return arrayList;
        }
    }
}
