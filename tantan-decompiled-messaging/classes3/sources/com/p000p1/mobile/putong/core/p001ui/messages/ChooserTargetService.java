package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p000p1.mobile.putong.core.p001ui.messages.ChooserTargetService;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.q860;
import l.qib0;
import l.vwb;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@TargetApi(23)
public class ChooserTargetService extends android.service.chooser.ChooserTargetService {
    private RectF bitmapRect;
    private Paint roundPaint;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m954b(z3g0 z3g0Var, Bitmap bitmap) {
        if (NullChecker.a(bitmap)) {
            z3g0Var.onNext(bitmap);
            z3g0Var.onCompleted();
        } else {
            z3g0Var.onNext(null);
            z3g0Var.onCompleted();
        }
    }

    private Icon createRoundBitmap(Bitmap bitmap) {
        try {
            if (!NullChecker.a(bitmap)) {
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
            CrashHelper.c(new Throwable("ChooserTargetService createRoundBitmap:" + th.getMessage(), th));
            return null;
        }
    }

    @Override // android.service.chooser.ChooserTargetService
    public List<ChooserTarget> onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        if (!CoreModule.H().signedIn_() || !NullChecker.a(CoreModule.c)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ComponentName componentName2 = new ComponentName(getPackageName(), SelectContactAct.class.getCanonicalName());
        try {
            Iterator it = vwb.k0(((q860) CoreModule.c.f0.Ye().toBlocking().m8883b()).a, 3).iterator();
            float f = 1.0f;
            while (it.hasNext()) {
                final User user = (User) CoreModule.c.e0.Ka(((DbObject) ((Conversation) it.next())).id).toBlocking().m8883b();
                if (NullChecker.a(user)) {
                    String str = user.name;
                    user.fp().profileSmall();
                    Bitmap bitmap = (Bitmap) C1099c.create(new C1099c.a() { // from class: l.i35
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            qib0.G.H(user.fp().profileSmall(), new e30() { // from class: l.j35
                                @Override // p003l.e30
                                public final void call(Object obj2) {
                                    ChooserTargetService.m954b(z3g0Var, (Bitmap) obj2);
                                }
                            }, true);
                        }
                    }).toBlocking().m8883b();
                    if (NullChecker.a(bitmap)) {
                        arrayList.add(new ChooserTarget(str, createRoundBitmap(bitmap), f, componentName2, SelectContactAct.m2103Y1(CoreModule.b, ((DbObject) user).id).getExtras()));
                        f -= 0.1f;
                    } else {
                        continue;
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            CrashHelper.c(new Exception("ChooserTargetService onGetChooserTargets:" + e.getMessage(), e));
            return arrayList;
        }
    }
}
