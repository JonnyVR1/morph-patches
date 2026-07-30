package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.core.newui.loveletter.C8238a;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterCompleteLayout;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VIcon;
import p151v.VRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class uew implements iam<pdw> {

    /* JADX INFO: renamed from: a */
    public final LoveLetterAct f178700a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f178701b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f178702c;

    /* JADX INFO: renamed from: d */
    public pdw f178703d;

    /* JADX INFO: renamed from: e */
    public C8238a f178704e;

    /* JADX INFO: renamed from: f */
    public LoveLetterCompleteLayout f178705f;

    /* JADX INFO: renamed from: g */
    public VIcon f178706g;

    /* JADX INFO: renamed from: l.uew$a */
    public class C20554a extends GridLayoutManager.AbstractC0554c {
        public C20554a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return uew.this.f178704e.m40614N(i);
        }
    }

    /* JADX INFO: renamed from: l.uew$b */
    public class C20555b extends RecyclerView.AbstractC0584t {
        public C20555b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int iFindFirstVisibleItemPosition = ((GridLayoutManager) uew.this.f178702c.getLayoutManager()).findFirstVisibleItemPosition();
            uew uewVar = uew.this;
            if (iFindFirstVisibleItemPosition <= 1) {
                bnl0.m105524M(uewVar.f178706g, false);
            } else {
                bnl0.m105524M(uewVar.f178706g, true);
            }
        }
    }

    public uew(LoveLetterAct loveLetterAct) {
        this.f178700a = loveLetterAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m195801j(View view) {
        this.f178700a.m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m195802k(View view) {
        i4g0.m138520r("e_explain", "p_love_letter");
        m195808q();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f178700a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(pdw pdwVar) {
        this.f178703d = pdwVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126133x6, viewGroup, false);
        this.f178701b = (VNavigationBar) viewInflate.findViewById(adc0.f70034N8);
        this.f178702c = (VRecyclerView) viewInflate.findViewById(adc0.f70525qb);
        this.f178705f = (LoveLetterCompleteLayout) viewInflate.findViewById(adc0.f70501p4);
        this.f178701b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162705a.m195801j(view);
            }
        });
        this.f178701b.setBackgroundResource(c9c0.f80383V1);
        VIcon vIcon = new VIcon(this.f178700a);
        vIcon.setIconStyle(4);
        vIcon.setBackgroundResource(dbc0.f86182Gd);
        bnl0.m105509E0(vIcon, new View.OnClickListener() { // from class: l.sew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167659a.m195802k(view);
            }
        });
        VIcon vIcon2 = new VIcon(this.f178700a);
        this.f178706g = vIcon2;
        vIcon2.setIconStyle(4);
        bnl0.m105524M(this.f178706g, false);
        this.f178706g.setBackgroundResource(dbc0.f86214Hd);
        bnl0.m105509E0(this.f178706g, new View.OnClickListener() { // from class: l.tew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173904a.m195804l(view);
            }
        });
        this.f178701b.setRightIconViews(this.f178706g, vIcon);
        bnl0.m105540X(this.f178701b, bnl0.m105511F0());
        m195807p();
        return viewInflate;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m195804l(View view) {
        pdw pdwVar = this.f178703d;
        if (pdwVar != null) {
            pdwVar.mo125335F();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m195805m(String str, User user, LoveLetterMessageState loveLetterMessageState) {
        bnl0.m105524M(this.f178702c, false);
        bnl0.m105524M(this.f178705f, true);
        bnl0.m105524M(this.f178706g, false);
        this.f178705f.m40556b(this.f178703d, str, user, loveLetterMessageState);
    }

    /* JADX INFO: renamed from: n */
    public void m195806n(List<Conversation> list, LoveLetterEntryInfo loveLetterEntryInfo) {
        this.f178704e.m40619S(list, loveLetterEntryInfo);
    }

    /* JADX INFO: renamed from: p */
    public void m195807p() {
        bnl0.m105524M(this.f178705f, false);
        bnl0.m105524M(this.f178702c, true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f178700a, 2);
        gridLayoutManager.m3327v(new C20554a());
        this.f178702c.setLayoutManager(gridLayoutManager);
        C8238a c8238a = new C8238a(this.f178703d, this.f178702c);
        this.f178704e = c8238a;
        this.f178702c.setAdapter(c8238a);
        this.f178702c.addOnScrollListener(new C20555b());
    }

    /* JADX INFO: renamed from: q */
    public void m195808q() {
        new ycw(this.f178700a).m215182z(this.f178700a, this.f178703d.f151843d);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
