package p003l;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupSetAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.e;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.view.GroupBannedView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.j7z;
import l.jtk;
import l.l6c0;
import l.mbh0;
import l.o7r;
import l.ptk;
import l.t100;
import l.xdl0;
import l.y4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class o7z extends tqz<j7z> {

    /* JADX INFO: renamed from: M1 */
    public GroupBannedView f6054M1;

    /* JADX INFO: renamed from: N1 */
    public View f6055N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f6056O1;

    /* JADX INFO: renamed from: P1 */
    public String f6057P1;

    /* JADX INFO: renamed from: Q1 */
    public boolean f6058Q1;

    public o7z(MessagesAct messagesAct) {
        super(messagesAct);
        this.f6056O1 = true;
        this.f6057P1 = null;
        this.f6058Q1 = false;
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m6580l2(String str) {
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m6581m2(String str) {
    }

    /* JADX INFO: renamed from: y2 */
    private void m6584y2() {
        if (NullChecker.a(m7950q0())) {
            xdl0.M(m7950q0(), this.f6056O1);
            if (this.f6056O1) {
                m6590v2(m7950q0());
            }
        }
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: D0 */
    public void mo3057D0() {
        super.mo3057D0();
        if (this.f7682p1.h4()) {
            m6592z2(false);
        }
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: E1 */
    public boolean mo3059E1(Menu menu) {
        super.mo3059E1(menu);
        if (CoreModule.P().i().E()) {
            final Conversation conversationXe = CoreModule.c.f0.Xe(this.f7682p1.m4250i3());
            if (NullChecker.a(conversationXe) && ml6.m6409a(conversationXe)) {
                MenuItem menuItemAdd = menu.add(4, y4c0.k2, 2, "");
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setActionView(l6c0.c1);
                View viewFindViewById = menuItemAdd.getActionView().findViewById(y4c0.l2);
                this.f6055N1 = viewFindViewById;
                xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.k7z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f4860a.m6587r2(conversationXe, view);
                    }
                });
                m6584y2();
            }
        }
        return true;
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: f0 */
    public u4z mo3111f0() {
        return new h4z();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m6585p2() {
        if (this.f6054M1 == null) {
            this.f6054M1 = o7r.a(act()).inflate(l6c0.f0, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            j7z j7zVar = this.f7682p1;
            if (j7zVar.f3544d == 33 || j7zVar.f3544d == 32) {
                layoutParams.topMargin = t100.E;
            } else {
                layoutParams.topMargin = t100.F;
            }
            this.f7665i.addView((View) this.f6054M1, (ViewGroup.LayoutParams) layoutParams);
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m6586q2() {
        if (this.f6058Q1) {
            return;
        }
        this.f6058Q1 = true;
        this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0().setGroupStyle(this.f7679o1);
        this.f7682p1.m6497e0().mo2063c0().m8912N0(true);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m6587r2(Conversation conversation, View view) {
        act().startActivity(GroupSetAct.m2236Z1(act(), ((DbObject) conversation).id, conversation.otherUser));
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m6588s2(View view) {
        if (m7950q0().getVisibility() != 0) {
            e eVar = CoreModule.c.g0;
            e.E0.put(Boolean.TRUE);
        } else {
            jtk jtkVar = new jtk(act());
            jtkVar.u(act().getString(R.string.R2)).r(true).i(jtk.E | jtk.A).o(-t100.d(6.0f)).e(new int[]{-17664}).a(5000L).d(new jtk.b() { // from class: l.m7z
                /* JADX INFO: renamed from: a */
                public final void m6322a(String str) {
                    o7z.m6580l2(str);
                }
            }).b(new jtk.a() { // from class: l.n7z
                /* JADX INFO: renamed from: a */
                public final void m6527a(String str) {
                    o7z.m6581m2(str);
                }
            });
            this.f6057P1 = ptk.h().r(jtkVar, view, (ViewGroup) act().getWindow().getDecorView());
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m6589u2(String str) {
        m6591w2(true);
        this.f6054M1.setBannedText(str);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m6590v2(final View view) {
        if (TextUtils.isEmpty(this.f6057P1)) {
            e eVar = CoreModule.c.g0;
            if (((Boolean) e.E0.get()).booleanValue()) {
                e51.H(act(), new Runnable() { // from class: l.l7z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5228a.m6588s2(view);
                    }
                }, 400L);
                act().addSwipeBackListener(new C0445a());
                e eVar2 = CoreModule.c.g0;
                e.E0.put(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m6591w2(boolean z) {
        if (z) {
            m6585p2();
        }
        if (NullChecker.a(this.f6054M1)) {
            xdl0.M(this.f6054M1, z);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public void m6592z2(boolean z) {
        this.f6056O1 = z;
        m6584y2();
    }

    /* JADX INFO: renamed from: l.o7z$a */
    public class C0445a implements mbh0 {
        public C0445a() {
        }

        /* JADX INFO: renamed from: Z */
        public void m6596Z() {
            if (TextUtils.isEmpty(o7z.this.f6057P1)) {
                return;
            }
            ptk.h().g(o7z.this.f6057P1);
        }

        /* JADX INFO: renamed from: E0 */
        public void m6594E0() {
        }

        /* JADX INFO: renamed from: O */
        public void m6595O() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m6593D0(boolean z, float f, int i) {
        }
    }
}
