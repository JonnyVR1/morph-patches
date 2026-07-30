package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0603g;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersAdmobItem;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersView;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersTitleView;
import com.p051p1.mobile.putong.data.DbLinks;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class hgo extends jic0<svl> {

    /* JADX INFO: renamed from: c */
    public final uho f109420c;

    /* JADX INFO: renamed from: d */
    public zgo f109421d;

    /* JADX INFO: renamed from: e */
    public View f109422e;

    /* JADX INFO: renamed from: f */
    public keo f109423f;

    /* JADX INFO: renamed from: g */
    public final List<svl> f109424g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f109425h = false;

    /* JADX INFO: renamed from: l.hgo$a */
    public static class C17453a extends C0603g.b {

        /* JADX INFO: renamed from: a */
        public final List<svl> f109426a;

        /* JADX INFO: renamed from: b */
        public final List<svl> f109427b;

        public C17453a(List<svl> list, List<svl> list2) {
            this.f109426a = list;
            this.f109427b = list2;
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: a */
        public boolean mo3646a(int i, int i2) {
            return mo3647b(i, i2);
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: b */
        public boolean mo3647b(int i, int i2) {
            svl svlVar = this.f109426a.get(i);
            svl svlVar2 = this.f109427b.get(i2);
            if (svlVar.getClass() != svlVar2.getClass()) {
                return false;
            }
            if (svlVar instanceof cio) {
                return TextUtils.equals(((cio) svlVar).getUser().f56859id, ((cio) svlVar2).getUser().f56859id);
            }
            return svlVar instanceof oeo ? TextUtils.equals(((oeo) svlVar).getUser().f56859id, ((oeo) svlVar2).getUser().f56859id) : svlVar.equals(svlVar2);
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: d */
        public int mo3649d() {
            return this.f109427b.size();
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: e */
        public int mo3650e() {
            return this.f109426a.size();
        }
    }

    public hgo(uho uhoVar) {
        this.f109420c = uhoVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f109424g.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            this.f109421d = new zgo();
            IntlMeetLikersNewLikersView intlMeetLikersNewLikersView = (IntlMeetLikersNewLikersView) p9r.m171370a(viewGroup.getContext()).inflate(pec0.f151890B, viewGroup, false);
            intlMeetLikersNewLikersView.m40431d(this.f109421d);
            return intlMeetLikersNewLikersView;
        }
        if (i == 2) {
            return p9r.m171370a(viewGroup.getContext()).inflate(pec0.f151893C, viewGroup, false);
        }
        if (i == 3) {
            return layoutInflaterFrom.inflate(pec0.f152043u, viewGroup, false);
        }
        if (i != 4) {
            return i != 5 ? p9r.m171370a(viewGroup.getContext()).inflate(pec0.f151896D, viewGroup, false) : layoutInflaterFrom.inflate(pec0.f152058z, viewGroup, false);
        }
        return layoutInflaterFrom.inflate(pec0.f152040t, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, svl svlVar, int i, int i2) {
        if (view == null) {
            return;
        }
        if (i == 1) {
            ((IntlMeetLikersNewLikersView) view).m40432e((aho) svlVar);
            return;
        }
        if (i == 2) {
            ((IntlMeetLikersTitleView) view).m40435b((zho) svlVar);
            return;
        }
        if (i == 3) {
            ((IntlMeetFakeLikersItem) view).m40393n(this.f109420c.act(), svlVar);
            return;
        }
        if (i == 4) {
            final IntlMeetFakeTurboItem intlMeetFakeTurboItem = (IntlMeetFakeTurboItem) view;
            intlMeetFakeTurboItem.m40403k0();
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.dgo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f88320a.m134962N(intlMeetFakeTurboItem, view2);
                }
            });
        } else {
            if (i != 5) {
                m134967S(view, svlVar);
                return;
            }
            View view2 = this.f109422e;
            if (view2 != null) {
                ((IntlMeetLikersAdmobItem) view).m40406e(view2);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m134958J(keo keoVar, int i, View view) {
        if (i > this.f109424g.size()) {
            return;
        }
        this.f109422e = view;
        this.f109423f = keoVar;
        this.f109424g.add(i, keoVar);
        notifyItemInserted(i);
        yho.m215979f();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public svl getItem(int i) {
        return this.f109424g.get(i);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m134963O(cio cioVar, IntlMeetLikersItemView intlMeetLikersItemView) {
        if (gta.m132210e().m132214d().mo34738Oq()) {
            yho.m215989p(cioVar.getUser().f56859id, true, yio.m216341a(cioVar.getUser().f56859id) ? "superlike_tag" : null, yio.m216343c(cioVar.getUser()));
        } else {
            yho.m215989p(cioVar.getUser().f56859id, true, null, null);
        }
        yho.m215980g("see_feed");
        CoreModule.m30933P().m143405a().mo34566pl(this.f109420c.act(), cioVar.getUser().f56859id, intlMeetLikersItemView, false);
    }

    /* JADX INFO: renamed from: M */
    public final void m134961M(cio cioVar, boolean z) {
        this.f109420c.m196094E(cioVar.getUser(), z, false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m134962N(IntlMeetFakeTurboItem intlMeetFakeTurboItem, View view) {
        intlMeetFakeTurboItem.m40404l0(this.f109420c.act());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m134964P(cio cioVar) {
        m134961M(cioVar, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m134965Q(cio cioVar) {
        m134961M(cioVar, false);
    }

    /* JADX INFO: renamed from: R */
    public void m134966R() {
        keo keoVar;
        if (jyb.m147479J(this.f109424g) || (keoVar = this.f109423f) == null) {
            return;
        }
        int iIndexOf = this.f109424g.indexOf(keoVar);
        if (iIndexOf == -1) {
            this.f109422e = null;
            this.f109423f = null;
        } else {
            this.f109424g.remove(iIndexOf);
            this.f109422e = null;
            this.f109423f = null;
            notifyItemRemoved(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m134967S(View view, svl svlVar) {
        final IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) view;
        final cio cioVar = (cio) svlVar;
        intlMeetLikersItemView.m40420l(cioVar, new x20() { // from class: l.ego
            @Override // p153l.x20
            public final void call() {
                this.f93954a.m134963O(cioVar, intlMeetLikersItemView);
            }
        }, new x20() { // from class: l.fgo
            @Override // p153l.x20
            public final void call() {
                this.f98959a.m134964P(cioVar);
            }
        }, new x20() { // from class: l.ggo
            @Override // p153l.x20
            public final void call() {
                this.f104032a.m134965Q(cioVar);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public boolean m134968T(List<svl> list, boolean z) {
        this.f109425h = false;
        boolean z2 = this.f109424g.size() != list.size();
        if (z || jyb.m147479J(this.f109424g)) {
            this.f109424g.clear();
            this.f109424g.addAll(list);
            notifyDataSetChanged();
            return z2;
        }
        C0603g.e eVarM3681b = C0603g.m3681b(new C17453a(new ArrayList(this.f109424g), list));
        this.f109424g.clear();
        this.f109424g.addAll(list);
        eVarM3681b.m3693b(this);
        return z2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        DbLinks dbLinks;
        super.mo48510e(i);
        if (jyb.m147479J(this.f109424g) || this.f109425h || i < this.f109424g.size() - 2 || (dbLinks = this.f109420c.f179043c) == null || TextUtils.isEmpty(dbLinks.links.next)) {
            return;
        }
        this.f109425h = true;
        uho uhoVar = this.f109420c;
        uhoVar.m196103O0(uhoVar.f179043c.links.next);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        svl item = getItem(i);
        if (item instanceof zho) {
            return 2;
        }
        if (item instanceof aho) {
            return 1;
        }
        if (item instanceof leo) {
            return 4;
        }
        if (item instanceof keo) {
            return 5;
        }
        return item instanceof oeo ? 3 : 0;
    }
}
