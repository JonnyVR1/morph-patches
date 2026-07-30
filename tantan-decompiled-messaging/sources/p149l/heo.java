package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0601g;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersAdmobItem;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersView;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersTitleView;
import com.p046p1.mobile.putong.data.DbLinks;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class heo extends dac0<etl> {

    /* JADX INFO: renamed from: c */
    public final ufo f107378c;

    /* JADX INFO: renamed from: d */
    public zeo f107379d;

    /* JADX INFO: renamed from: e */
    public View f107380e;

    /* JADX INFO: renamed from: f */
    public kco f107381f;

    /* JADX INFO: renamed from: g */
    public final List<etl> f107382g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f107383h = false;

    /* JADX INFO: renamed from: l.heo$a */
    public static class C17292a extends C0601g.b {

        /* JADX INFO: renamed from: a */
        public final List<etl> f107384a;

        /* JADX INFO: renamed from: b */
        public final List<etl> f107385b;

        public C17292a(List<etl> list, List<etl> list2) {
            this.f107384a = list;
            this.f107385b = list2;
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: a */
        public boolean mo3645a(int i, int i2) {
            return mo3646b(i, i2);
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: b */
        public boolean mo3646b(int i, int i2) {
            etl etlVar = this.f107384a.get(i);
            etl etlVar2 = this.f107385b.get(i2);
            if (etlVar.getClass() != etlVar2.getClass()) {
                return false;
            }
            if (etlVar instanceof cgo) {
                return TextUtils.equals(((cgo) etlVar).getUser().f56011id, ((cgo) etlVar2).getUser().f56011id);
            }
            return etlVar instanceof oco ? TextUtils.equals(((oco) etlVar).getUser().f56011id, ((oco) etlVar2).getUser().f56011id) : etlVar.equals(etlVar2);
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: d */
        public int mo3648d() {
            return this.f107385b.size();
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: e */
        public int mo3649e() {
            return this.f107384a.size();
        }
    }

    public heo(ufo ufoVar) {
        this.f107378c = ufoVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f107382g.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            this.f107379d = new zeo();
            IntlMeetLikersNewLikersView intlMeetLikersNewLikersView = (IntlMeetLikersNewLikersView) o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121282B, viewGroup, false);
            intlMeetLikersNewLikersView.m39428d(this.f107379d);
            return intlMeetLikersNewLikersView;
        }
        if (i == 2) {
            return o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121285C, viewGroup, false);
        }
        if (i == 3) {
            return layoutInflaterFrom.inflate(k6c0.f121435u, viewGroup, false);
        }
        if (i != 4) {
            return i != 5 ? o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121288D, viewGroup, false) : layoutInflaterFrom.inflate(k6c0.f121450z, viewGroup, false);
        }
        return layoutInflaterFrom.inflate(k6c0.f121432t, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, etl etlVar, int i, int i2) {
        if (view == null) {
            return;
        }
        if (i == 1) {
            ((IntlMeetLikersNewLikersView) view).m39429e((afo) etlVar);
            return;
        }
        if (i == 2) {
            ((IntlMeetLikersTitleView) view).m39432b((zfo) etlVar);
            return;
        }
        if (i == 3) {
            ((IntlMeetFakeLikersItem) view).m39390n(this.f107378c.act(), etlVar);
            return;
        }
        if (i == 4) {
            final IntlMeetFakeTurboItem intlMeetFakeTurboItem = (IntlMeetFakeTurboItem) view;
            intlMeetFakeTurboItem.m39400k0();
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.deo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f85822a.m130672N(intlMeetFakeTurboItem, view2);
                }
            });
        } else {
            if (i != 5) {
                m130677S(view, etlVar);
                return;
            }
            View view2 = this.f107380e;
            if (view2 != null) {
                ((IntlMeetLikersAdmobItem) view).m39403e(view2);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m130668J(kco kcoVar, int i, View view) {
        if (i > this.f107382g.size()) {
            return;
        }
        this.f107380e = view;
        this.f107381f = kcoVar;
        this.f107382g.add(i, kcoVar);
        notifyItemInserted(i);
        yfo.m214567f();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public etl getItem(int i) {
        return this.f107382g.get(i);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m130673O(cgo cgoVar, IntlMeetLikersItemView intlMeetLikersItemView) {
        if (ura.m195053e().m195057d().mo33735Oq()) {
            yfo.m214577p(cgoVar.getUser().f56011id, true, ygo.m214738a(cgoVar.getUser().f56011id) ? "superlike_tag" : null, ygo.m214740c(cgoVar.getUser()));
        } else {
            yfo.m214577p(cgoVar.getUser().f56011id, true, null, null);
        }
        yfo.m214568g("see_feed");
        CoreModule.m29935P().m94651a().mo33563pl(this.f107378c.act(), cgoVar.getUser().f56011id, intlMeetLikersItemView, false);
    }

    /* JADX INFO: renamed from: M */
    public final void m130671M(cgo cgoVar, boolean z) {
        this.f107378c.m193426E(cgoVar.getUser(), z, false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m130672N(IntlMeetFakeTurboItem intlMeetFakeTurboItem, View view) {
        intlMeetFakeTurboItem.m39401l0(this.f107378c.act());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m130674P(cgo cgoVar) {
        m130671M(cgoVar, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m130675Q(cgo cgoVar) {
        m130671M(cgoVar, false);
    }

    /* JADX INFO: renamed from: R */
    public void m130676R() {
        kco kcoVar;
        if (vwb.m200296J(this.f107382g) || (kcoVar = this.f107381f) == null) {
            return;
        }
        int iIndexOf = this.f107382g.indexOf(kcoVar);
        if (iIndexOf == -1) {
            this.f107380e = null;
            this.f107381f = null;
        } else {
            this.f107382g.remove(iIndexOf);
            this.f107380e = null;
            this.f107381f = null;
            notifyItemRemoved(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m130677S(View view, etl etlVar) {
        final IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) view;
        final cgo cgoVar = (cgo) etlVar;
        intlMeetLikersItemView.m39417l(cgoVar, new d30() { // from class: l.eeo
            @Override // p149l.d30
            public final void call() {
                this.f90758a.m130673O(cgoVar, intlMeetLikersItemView);
            }
        }, new d30() { // from class: l.feo
            @Override // p149l.d30
            public final void call() {
                this.f97144a.m130674P(cgoVar);
            }
        }, new d30() { // from class: l.geo
            @Override // p149l.d30
            public final void call() {
                this.f102278a.m130675Q(cgoVar);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public boolean m130678T(List<etl> list, boolean z) {
        this.f107383h = false;
        boolean z2 = this.f107382g.size() != list.size();
        if (z || vwb.m200296J(this.f107382g)) {
            this.f107382g.clear();
            this.f107382g.addAll(list);
            notifyDataSetChanged();
            return z2;
        }
        C0601g.e eVarM3680b = C0601g.m3680b(new C17292a(new ArrayList(this.f107382g), list));
        this.f107382g.clear();
        this.f107382g.addAll(list);
        eVarM3680b.m3692b(this);
        return z2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        DbLinks dbLinks;
        super.mo47327e(i);
        if (vwb.m200296J(this.f107382g) || this.f107383h || i < this.f107382g.size() - 2 || (dbLinks = this.f107378c.f176294c) == null || TextUtils.isEmpty(dbLinks.links.next)) {
            return;
        }
        this.f107383h = true;
        ufo ufoVar = this.f107378c;
        ufoVar.m193434N0(ufoVar.f176294c.links.next);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        etl item = getItem(i);
        if (item instanceof zfo) {
            return 2;
        }
        if (item instanceof afo) {
            return 1;
        }
        if (item instanceof lco) {
            return 4;
        }
        if (item instanceof kco) {
            return 5;
        }
        return item instanceof oco ? 3 : 0;
    }
}
