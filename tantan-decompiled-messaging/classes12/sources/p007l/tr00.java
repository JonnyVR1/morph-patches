package p007l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileTextAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.ag3;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.q860;
import l.roj0;
import l.v9j;
import l.vwb;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tr00 extends jq2<xr00> {

    /* JADX INFO: renamed from: a */
    public Boolean f13384a;

    /* JADX INFO: renamed from: b */
    public String f13385b;

    /* JADX INFO: renamed from: c */
    public String f13386c;

    /* JADX INFO: renamed from: d */
    public Moment f13387d;

    public tr00(MomentsInProfileTextAct momentsInProfileTextAct) {
        super(momentsInProfileTextAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ c m14604s0() {
        return ijb0.m10914a(this.f13386c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m14605t0(roj0 roj0Var) {
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m14606u0(Bundle bundle) {
        ((xr00) ((jq2) this).viewModel).m16814r();
        if (m14613o0()) {
            duringCreated(new v9j() { // from class: l.qr00
                public final Object call() {
                    return this.f12352a.m14604s0();
                }
            }, false).subscribe(mkd0.G(new e30() { // from class: l.rr00
                public final void call(Object obj) {
                    this.f12718a.m14605t0((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ c m14607x0() {
        return mkd0.r(FeedModule.f315c.m1633W3(this.f13385b), FeedModule.f315c.m1644c3(this.f13385b), new x9j() { // from class: l.sr00
            public final Object call(Object obj, Object obj2) {
                Moment moment = (Moment) obj;
                return vwb.Y(moment, Integer.valueOf(moment.likes.count + ((q860) obj2).d()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m14608y0(j760 j760Var) {
        Moment moment = (Moment) j760Var.a;
        this.f13387d = moment;
        ((xr00) ((jq2) this).viewModel).m16809f(moment, ((Integer) j760Var.b).intValue());
    }

    /* JADX INFO: renamed from: A0 */
    public List<Object> m14609A0() {
        return vwb.f0(new Object[]{"moment id", this.f13385b, ag3.c});
    }

    /* JADX INFO: renamed from: a0 */
    public void m14610a0() {
        creates(new e30() { // from class: l.nr00
            public final void call(Object obj) {
                this.f10853a.m14606u0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.or00
            public final Object call() {
                return this.f11557a.m14607x0();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.pr00
            public final void call(Object obj) {
                this.f11948a.m14608y0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m14611m0(Menu menu) {
        v1h.m15199F0(act(), menu, this.f13386c, new v9j() { // from class: l.lr00
            public final Object call() {
                return this.f10107a.m14615q0();
            }
        }, null, null, new d30() { // from class: l.mr00
            public final void call() {
                this.f10544a.m14616r0();
            }
        }, null, null, null, false, m14613o0() || m14614p0(), m14613o0(), false);
        try {
            ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act().toolbar())).setOverflowIcon(act().getResources().getDrawable(f3c0.f7766b2));
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public Drawable m14612n0() {
        int[] iArr = new int[100];
        for (int i = 0; i < 100; i++) {
            iArr[i] = Color.argb((int) ((Math.pow(100 - i, 2.0d) * 255.0d) / Math.pow(100.0d, 2.0d)), 255, 255, 255);
        }
        return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m14613o0() {
        if (this.f13384a == null) {
            this.f13384a = Boolean.valueOf(ijb0.m10939z(this.f13386c));
        }
        return this.f13384a.booleanValue();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m14614p0() {
        String str = this.f13386c;
        return str != null && str.equals(FeedModule.m1139F().userId());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Moment m14615q0() {
        return this.f13387d;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m14616r0() {
        act().finish();
    }

    /* JADX INFO: renamed from: z0 */
    public void m14617z0(String str, String str2) {
        this.f13385b = str;
        this.f13386c = str2;
    }

    public void destroy() {
    }
}
