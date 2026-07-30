package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.core.newui.loveletter.C8087a;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterCompleteLayout;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VIcon;
import p147v.VRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class wcw implements s7m<rbw> {

    /* JADX INFO: renamed from: a */
    public final LoveLetterAct f185720a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f185721b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f185722c;

    /* JADX INFO: renamed from: d */
    public rbw f185723d;

    /* JADX INFO: renamed from: e */
    public C8087a f185724e;

    /* JADX INFO: renamed from: f */
    public LoveLetterCompleteLayout f185725f;

    /* JADX INFO: renamed from: g */
    public VIcon f185726g;

    /* JADX INFO: renamed from: l.wcw$a */
    public class C20850a extends GridLayoutManager.AbstractC0553c {
        public C20850a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return wcw.this.f185724e.m39611N(i);
        }
    }

    /* JADX INFO: renamed from: l.wcw$b */
    public class C20851b extends RecyclerView.AbstractC0582t {
        public C20851b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int iFindFirstVisibleItemPosition = ((GridLayoutManager) wcw.this.f185722c.getLayoutManager()).findFirstVisibleItemPosition();
            wcw wcwVar = wcw.this;
            if (iFindFirstVisibleItemPosition <= 1) {
                xdl0.m208344M(wcwVar.f185726g, false);
            } else {
                xdl0.m208344M(wcwVar.f185726g, true);
            }
        }
    }

    public wcw(LoveLetterAct loveLetterAct) {
        this.f185720a = loveLetterAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m202686j(View view) {
        this.f185720a.m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m202687k(View view) {
        zvf0.m220396r("e_explain", "p_love_letter");
        m202693q();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f185720a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rbw rbwVar) {
        this.f185723d = rbwVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96062w6, viewGroup, false);
        this.f185721b = (VNavigationBar) viewInflate.findViewById(u4c0.f173912L8);
        this.f185722c = (VRecyclerView) viewInflate.findViewById(u4c0.f174400ob);
        this.f185725f = (LoveLetterCompleteLayout) viewInflate.findViewById(u4c0.f174376n4);
        this.f185721b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169480a.m202686j(view);
            }
        });
        this.f185721b.setBackgroundResource(w0c0.f183811U1);
        VIcon vIcon = new VIcon(this.f185720a);
        vIcon.setIconStyle(4);
        vIcon.setBackgroundResource(x2c0.f189327Fd);
        xdl0.m208329E0(vIcon, new View.OnClickListener() { // from class: l.ucw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175868a.m202687k(view);
            }
        });
        VIcon vIcon2 = new VIcon(this.f185720a);
        this.f185726g = vIcon2;
        vIcon2.setIconStyle(4);
        xdl0.m208344M(this.f185726g, false);
        this.f185726g.setBackgroundResource(x2c0.f189359Gd);
        xdl0.m208329E0(this.f185726g, new View.OnClickListener() { // from class: l.vcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180992a.m202689l(view);
            }
        });
        this.f185721b.setRightIconViews(this.f185726g, vIcon);
        xdl0.m208360X(this.f185721b, xdl0.m208331F0());
        m202692p();
        return viewInflate;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m202689l(View view) {
        rbw rbwVar = this.f185723d;
        if (rbwVar != null) {
            rbwVar.mo130520F();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m202690m(String str, User user, LoveLetterMessageState loveLetterMessageState) {
        xdl0.m208344M(this.f185722c, false);
        xdl0.m208344M(this.f185725f, true);
        xdl0.m208344M(this.f185726g, false);
        this.f185725f.m39553b(this.f185723d, str, user, loveLetterMessageState);
    }

    /* JADX INFO: renamed from: n */
    public void m202691n(List<Conversation> list, LoveLetterEntryInfo loveLetterEntryInfo) {
        this.f185724e.m39616S(list, loveLetterEntryInfo);
    }

    /* JADX INFO: renamed from: p */
    public void m202692p() {
        xdl0.m208344M(this.f185725f, false);
        xdl0.m208344M(this.f185722c, true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f185720a, 2);
        gridLayoutManager.m3326v(new C20850a());
        this.f185722c.setLayoutManager(gridLayoutManager);
        C8087a c8087a = new C8087a(this.f185723d, this.f185722c);
        this.f185724e = c8087a;
        this.f185722c.setAdapter(c8087a);
        this.f185722c.addOnScrollListener(new C20851b());
    }

    /* JADX INFO: renamed from: q */
    public void m202693q() {
        new abw(this.f185720a).m95703z(this.f185720a, this.f185723d.f158689d);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
