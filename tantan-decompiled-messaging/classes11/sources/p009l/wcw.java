package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.loveletter.C0251a;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterCompleteLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.f6c0;
import l.s7m;
import l.u4c0;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VIcon;
import v.VRecyclerView;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wcw implements s7m<rbw> {

    /* JADX INFO: renamed from: a */
    public final LoveLetterAct f22007a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f22008b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f22009c;

    /* JADX INFO: renamed from: d */
    public rbw f22010d;

    /* JADX INFO: renamed from: e */
    public C0251a f22011e;

    /* JADX INFO: renamed from: f */
    public LoveLetterCompleteLayout f22012f;

    /* JADX INFO: renamed from: g */
    public VIcon f22013g;

    /* JADX INFO: renamed from: l.wcw$a */
    public class C1284a extends GridLayoutManager.c {
        public C1284a() {
        }

        /* JADX INFO: renamed from: f */
        public int m24067f(int i) {
            return wcw.this.f22011e.m3685N(i);
        }
    }

    /* JADX INFO: renamed from: l.wcw$b */
    public class C1285b extends RecyclerView.t {
        public C1285b() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int iFindFirstVisibleItemPosition = wcw.this.f22009c.getLayoutManager().findFirstVisibleItemPosition();
            wcw wcwVar = wcw.this;
            if (iFindFirstVisibleItemPosition <= 1) {
                xdl0.M(wcwVar.f22013g, false);
            } else {
                xdl0.M(wcwVar.f22013g, true);
            }
        }
    }

    public wcw(LoveLetterAct loveLetterAct) {
        this.f22007a = loveLetterAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m24057j(View view) {
        this.f22007a.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m24058k(View view) {
        zvf0.r("e_explain", "p_love_letter");
        m24066q();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24059C0() {
        return null;
    }

    @Nullable
    public Act act() {
        return this.f22007a;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m24061i1(rbw rbwVar) {
        this.f22010d = rbwVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.w6, viewGroup, false);
        this.f22008b = viewInflate.findViewById(u4c0.L8);
        this.f22009c = viewInflate.findViewById(u4c0.ob);
        this.f22012f = (LoveLetterCompleteLayout) viewInflate.findViewById(u4c0.n4);
        this.f22008b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20615a.m24057j(view);
            }
        });
        this.f22008b.setBackgroundResource(w0c0.U1);
        View vIcon = new VIcon(this.f22007a);
        vIcon.setIconStyle(4);
        vIcon.setBackgroundResource(x2c0.Fd);
        xdl0.E0(vIcon, new View.OnClickListener() { // from class: l.ucw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21073a.m24058k(view);
            }
        });
        VIcon vIcon2 = new VIcon(this.f22007a);
        this.f22013g = vIcon2;
        vIcon2.setIconStyle(4);
        xdl0.M(this.f22013g, false);
        this.f22013g.setBackgroundResource(x2c0.Gd);
        xdl0.E0(this.f22013g, new View.OnClickListener() { // from class: l.vcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21537a.m24062l(view);
            }
        });
        this.f22008b.setRightIconViews(new View[]{this.f22013g, vIcon});
        xdl0.X(this.f22008b, xdl0.F0());
        m24065p();
        return viewInflate;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m24062l(View view) {
        rbw rbwVar = this.f22010d;
        if (rbwVar != null) {
            rbwVar.mo15580F();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m24063m(String str, User user, LoveLetterMessageState loveLetterMessageState) {
        xdl0.M(this.f22009c, false);
        xdl0.M(this.f22012f, true);
        xdl0.M(this.f22013g, false);
        this.f22012f.m3624b(this.f22010d, str, user, loveLetterMessageState);
    }

    /* JADX INFO: renamed from: n */
    public void m24064n(List<Conversation> list, LoveLetterEntryInfo loveLetterEntryInfo) {
        this.f22011e.m3690S(list, loveLetterEntryInfo);
    }

    /* JADX INFO: renamed from: p */
    public void m24065p() {
        xdl0.M(this.f22012f, false);
        xdl0.M(this.f22009c, true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f22007a, 2);
        gridLayoutManager.v(new C1284a());
        this.f22009c.setLayoutManager(gridLayoutManager);
        C0251a c0251a = new C0251a(this.f22010d, this.f22009c);
        this.f22011e = c0251a;
        this.f22009c.setAdapter(c0251a);
        this.f22009c.addOnScrollListener(new C1285b());
    }

    /* JADX INFO: renamed from: q */
    public void m24066q() {
        new abw(this.f22007a).m11298z(this.f22007a, this.f22010d.f19725d);
    }

    public void destroy() {
    }
}
