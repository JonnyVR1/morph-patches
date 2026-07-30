package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.ChooserTargetService;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p149l.vwb;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(23)
public class ChooserTargetService extends android.service.chooser.ChooserTargetService {
    private RectF bitmapRect;
    private Paint roundPaint;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m47881b(z3g0 z3g0Var, Bitmap bitmap) {
        if (NullChecker.m81303a(bitmap)) {
            z3g0Var.m132487l(bitmap);
            z3g0Var.onCompleted();
        } else {
            z3g0Var.m132487l(null);
            z3g0Var.onCompleted();
        }
    }

    private Icon createRoundBitmap(Bitmap bitmap) {
        try {
            if (!NullChecker.m81303a(bitmap)) {
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
            CrashHelper.m81296c(new Throwable("ChooserTargetService createRoundBitmap:" + th.getMessage(), th));
            return null;
        }
    }

    @Override // android.service.chooser.ChooserTargetService
    public List<ChooserTarget> onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        if (!CoreModule.m29931H().signedIn_() || !NullChecker.m81303a(CoreModule.f17545c)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ComponentName componentName2 = new ComponentName(getPackageName(), SelectContactAct.class.getCanonicalName());
        try {
            Iterator it = vwb.m200334k0(CoreModule.f17545c.f19642f0.m32868Ye().toBlocking().m212770b().f153135a, 3).iterator();
            float f = 1.0f;
            while (it.hasNext()) {
                final User userM212770b = CoreModule.f17545c.f19639e0.m169410Ka(((Conversation) it.next()).f56011id).toBlocking().m212770b();
                if (NullChecker.m81303a(userM212770b)) {
                    String str = userM212770b.name;
                    userM212770b.m60124fp().profileSmall();
                    Bitmap bitmap = (Bitmap) C22306c.create(new C22306c.a() { // from class: l.i35
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            qib0.f154691G.m102322H(userM212770b.m60124fp().profileSmall(), new e30() { // from class: l.j35
                                @Override // p149l.e30
                                public final void call(Object obj2) {
                                    ChooserTargetService.m47881b(z3g0Var, (Bitmap) obj2);
                                }
                            }, true);
                        }
                    }).toBlocking().m212770b();
                    if (NullChecker.m81303a(bitmap)) {
                        arrayList.add(new ChooserTarget(str, createRoundBitmap(bitmap), f, componentName2, SelectContactAct.m49005Y1(CoreModule.f17544b, userM212770b.f56011id).getExtras()));
                        f -= 0.1f;
                    } else {
                        continue;
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("ChooserTargetService onGetChooserTargets:" + e.getMessage(), e));
            return arrayList;
        }
    }
}
