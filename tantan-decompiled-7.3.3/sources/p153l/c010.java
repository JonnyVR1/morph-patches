package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileTextAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class c010 extends ar2<g010> {

    /* JADX INFO: renamed from: a */
    public Boolean f79194a;

    /* JADX INFO: renamed from: b */
    public String f79195b;

    /* JADX INFO: renamed from: c */
    public String f79196c;

    /* JADX INFO: renamed from: d */
    public Moment f79197d;

    public c010(MomentsInProfileTextAct momentsInProfileTextAct) {
        super(momentsInProfileTextAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ C22421c m107288s0() {
        return mrb0.m159647a(this.f79196c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m107289t0(uxj0 uxj0Var) {
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m107290u0(Bundle bundle) {
        ((g010) this.viewModel).m128382r();
        if (m107296o0()) {
            duringCreated(new pcj() { // from class: l.zz00
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f206659a.m107288s0();
                }
            }, false).subscribe(psd0.m173596G(new y20() { // from class: l.a010
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f67678a.m107289t0((uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ C22421c m107291x0() {
        return psd0.m173625r(FeedModule.f39702c.m61891W3(this.f79195b), FeedModule.f39702c.m61902c3(this.f79195b), new rcj() { // from class: l.b010
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                Moment moment = (Moment) obj;
                return jyb.m147494Y(moment, Integer.valueOf(moment.likes.count + ((vg60) obj2).m201222d()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m107292y0(pf60 pf60Var) {
        Moment moment = (Moment) pf60Var.f152156a;
        this.f79197d = moment;
        ((g010) this.viewModel).m128378f(moment, ((Integer) pf60Var.f152157b).intValue());
    }

    /* JADX INFO: renamed from: A0 */
    public List<Object> m107293A0() {
        return jyb.m147507f0("moment id", this.f79195b, og3.f147188c);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.wz00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191723a.m107290u0((Bundle) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.xz00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f196807a.m107291x0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.yz00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202166a.m107292y0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m107294m0(Menu menu) {
        k3h.m148037F0(act(), menu, this.f79196c, new pcj() { // from class: l.uz00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f181696a.m107298q0();
            }
        }, null, null, new x20() { // from class: l.vz00
            @Override // p153l.x20
            public final void call() {
                this.f186437a.m107299r0();
            }
        }, null, null, null, false, m107296o0() || m107297p0(), m107296o0(), false);
        try {
            ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act().toolbar())).setOverflowIcon(act().getResources().getDrawable(lbc0.f131001b2));
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public Drawable m107295n0() {
        int[] iArr = new int[100];
        for (int i = 0; i < 100; i++) {
            iArr[i] = Color.argb((int) ((Math.pow(100 - i, 2.0d) * 255.0d) / Math.pow(100.0d, 2.0d)), 255, 255, 255);
        }
        return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m107296o0() {
        if (this.f79194a == null) {
            this.f79194a = Boolean.valueOf(mrb0.m159672z(this.f79196c));
        }
        return this.f79194a.booleanValue();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m107297p0() {
        String str = this.f79196c;
        return str != null && str.equals(FeedModule.m61405F().userId());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Moment m107298q0() {
        return this.f79197d;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m107299r0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: z0 */
    public void m107300z0(String str, String str2) {
        this.f79195b = str;
        this.f79196c = str2;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
