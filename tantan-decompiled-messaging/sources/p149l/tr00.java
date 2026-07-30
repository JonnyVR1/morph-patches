package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileTextAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class tr00 extends jq2<xr00> {

    /* JADX INFO: renamed from: a */
    public Boolean f171780a;

    /* JADX INFO: renamed from: b */
    public String f171781b;

    /* JADX INFO: renamed from: c */
    public String f171782c;

    /* JADX INFO: renamed from: d */
    public Moment f171783d;

    public tr00(MomentsInProfileTextAct momentsInProfileTextAct) {
        super(momentsInProfileTextAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ C22306c m190353s0() {
        return ijb0.m136561a(this.f171782c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m190354t0(roj0 roj0Var) {
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m190355u0(Bundle bundle) {
        ((xr00) this.viewModel).m210627r();
        if (m190361o0()) {
            duringCreated(new v9j() { // from class: l.qr00
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f155959a.m190353s0();
                }
            }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.rr00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160707a.m190354t0((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ C22306c m190356x0() {
        return mkd0.m154984r(FeedModule.f38854c.m60707W3(this.f171781b), FeedModule.f38854c.m60718c3(this.f171781b), new x9j() { // from class: l.sr00
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                Moment moment = (Moment) obj;
                return vwb.m200311Y(moment, Integer.valueOf(moment.likes.count + ((q860) obj2).m173344d()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m190357y0(j760 j760Var) {
        Moment moment = (Moment) j760Var.f116564a;
        this.f171783d = moment;
        ((xr00) this.viewModel).m210623f(moment, ((Integer) j760Var.f116565b).intValue());
    }

    /* JADX INFO: renamed from: A0 */
    public List<Object> m190358A0() {
        return vwb.m200324f0("moment id", this.f171781b, ag3.f69254c);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.nr00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140128a.m190355u0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.or00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f145212a.m190356x0();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.pr00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150827a.m190357y0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m190359m0(Menu menu) {
        v1h.m196560F0(act(), menu, this.f171782c, new v9j() { // from class: l.lr00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f129455a.m190363q0();
            }
        }, null, null, new d30() { // from class: l.mr00
            @Override // p149l.d30
            public final void call() {
                this.f135320a.m190364r0();
            }
        }, null, null, null, false, m190361o0() || m190362p0(), m190361o0(), false);
        try {
            ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act().toolbar())).setOverflowIcon(act().getResources().getDrawable(f3c0.f94483b2));
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public Drawable m190360n0() {
        int[] iArr = new int[100];
        for (int i = 0; i < 100; i++) {
            iArr[i] = Color.argb((int) ((Math.pow(100 - i, 2.0d) * 255.0d) / Math.pow(100.0d, 2.0d)), 255, 255, 255);
        }
        return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m190361o0() {
        if (this.f171780a == null) {
            this.f171780a = Boolean.valueOf(ijb0.m136586z(this.f171782c));
        }
        return this.f171780a.booleanValue();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m190362p0() {
        String str = this.f171782c;
        return str != null && str.equals(FeedModule.m60221F().userId());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Moment m190363q0() {
        return this.f171783d;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m190364r0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: z0 */
    public void m190365z0(String str, String str2) {
        this.f171781b = str;
        this.f171782c = str2;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
