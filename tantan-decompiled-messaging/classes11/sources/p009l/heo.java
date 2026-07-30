package p009l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersAdmobItem;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersView;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersTitleView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.DbLinks;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.k6c0;
import l.ura;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class heo extends dac0<etl> {

    /* JADX INFO: renamed from: c */
    public final ufo f14020c;

    /* JADX INFO: renamed from: d */
    public zeo f14021d;

    /* JADX INFO: renamed from: e */
    public View f14022e;

    /* JADX INFO: renamed from: f */
    public kco f14023f;

    /* JADX INFO: renamed from: g */
    public final List<etl> f14024g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f14025h = false;

    /* JADX INFO: renamed from: l.heo$a */
    public static class C0934a extends g.b {

        /* JADX INFO: renamed from: a */
        public final List<etl> f14026a;

        /* JADX INFO: renamed from: b */
        public final List<etl> f14027b;

        public C0934a(List<etl> list, List<etl> list2) {
            this.f14026a = list;
            this.f14027b = list2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m15604a(int i, int i2) {
            return m15605b(i, i2);
        }

        /* JADX INFO: renamed from: b */
        public boolean m15605b(int i, int i2) {
            etl etlVar = this.f14026a.get(i);
            etl etlVar2 = this.f14027b.get(i2);
            if (etlVar.getClass() != etlVar2.getClass()) {
                return false;
            }
            if (etlVar instanceof cgo) {
                return TextUtils.equals(((DbObject) ((cgo) etlVar).getUser()).id, ((DbObject) ((cgo) etlVar2).getUser()).id);
            }
            return etlVar instanceof oco ? TextUtils.equals(((DbObject) ((oco) etlVar).getUser()).id, ((DbObject) ((oco) etlVar2).getUser()).id) : etlVar.equals(etlVar2);
        }

        /* JADX INFO: renamed from: d */
        public int m15606d() {
            return this.f14027b.size();
        }

        /* JADX INFO: renamed from: e */
        public int m15607e() {
            return this.f14026a.size();
        }
    }

    public heo(ufo ufoVar) {
        this.f14020c = ufoVar;
    }

    /* JADX INFO: renamed from: C */
    public int m15589C() {
        return this.f14024g.size();
    }

    /* JADX INFO: renamed from: D */
    public View m15590D(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            this.f14021d = new zeo();
            IntlMeetLikersNewLikersView intlMeetLikersNewLikersView = (IntlMeetLikersNewLikersView) o7r.m19649a(viewGroup.getContext()).inflate(k6c0.B, viewGroup, false);
            intlMeetLikersNewLikersView.m3475d(this.f14021d);
            return intlMeetLikersNewLikersView;
        }
        if (i == 2) {
            return o7r.m19649a(viewGroup.getContext()).inflate(k6c0.C, viewGroup, false);
        }
        if (i == 3) {
            return layoutInflaterFrom.inflate(k6c0.u, viewGroup, false);
        }
        if (i != 4) {
            return i != 5 ? o7r.m19649a(viewGroup.getContext()).inflate(k6c0.D, viewGroup, false) : layoutInflaterFrom.inflate(k6c0.z, viewGroup, false);
        }
        return layoutInflaterFrom.inflate(k6c0.t, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m15588A(View view, etl etlVar, int i, int i2) {
        if (view == 0) {
            return;
        }
        if (i == 1) {
            ((IntlMeetLikersNewLikersView) view).m3476e((afo) etlVar);
            return;
        }
        if (i == 2) {
            ((IntlMeetLikersTitleView) view).m3479b((zfo) etlVar);
            return;
        }
        if (i == 3) {
            ((IntlMeetFakeLikersItem) view).m3437n(this.f14020c.act(), etlVar);
            return;
        }
        if (i == 4) {
            final IntlMeetFakeTurboItem intlMeetFakeTurboItem = (IntlMeetFakeTurboItem) view;
            intlMeetFakeTurboItem.m3447k0();
            xdl0.E0(view, new View.OnClickListener() { // from class: l.deo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11799a.m15596N(intlMeetFakeTurboItem, view2);
                }
            });
        } else {
            if (i != 5) {
                m15601S(view, etlVar);
                return;
            }
            View view2 = this.f14022e;
            if (view2 != null) {
                ((IntlMeetLikersAdmobItem) view).m3450e(view2);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m15592J(kco kcoVar, int i, View view) {
        if (i > this.f14024g.size()) {
            return;
        }
        this.f14022e = view;
        this.f14023f = kcoVar;
        this.f14024g.add(i, kcoVar);
        notifyItemInserted(i);
        yfo.m25354f();
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public etl getItem(int i) {
        return this.f14024g.get(i);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m15597O(cgo cgoVar, IntlMeetLikersItemView intlMeetLikersItemView) {
        if (ura.e().d().Oq()) {
            yfo.m25364p(((DbObject) cgoVar.getUser()).id, true, ygo.m25370a(((DbObject) cgoVar.getUser()).id) ? "superlike_tag" : null, ygo.m25372c(cgoVar.getUser()));
        } else {
            yfo.m25364p(((DbObject) cgoVar.getUser()).id, true, null, null);
        }
        yfo.m25355g("see_feed");
        CoreModule.P().a().pl(this.f14020c.act(), ((DbObject) cgoVar.getUser()).id, intlMeetLikersItemView, false);
    }

    /* JADX INFO: renamed from: M */
    public final void m15595M(cgo cgoVar, boolean z) {
        this.f14020c.m22831E(cgoVar.getUser(), z, false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m15596N(IntlMeetFakeTurboItem intlMeetFakeTurboItem, View view) {
        intlMeetFakeTurboItem.m3448l0(this.f14020c.act());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m15598P(cgo cgoVar) {
        m15595M(cgoVar, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m15599Q(cgo cgoVar) {
        m15595M(cgoVar, false);
    }

    /* JADX INFO: renamed from: R */
    public void m15600R() {
        kco kcoVar;
        if (vwb.J(this.f14024g) || (kcoVar = this.f14023f) == null) {
            return;
        }
        int iIndexOf = this.f14024g.indexOf(kcoVar);
        if (iIndexOf == -1) {
            this.f14022e = null;
            this.f14023f = null;
        } else {
            this.f14024g.remove(iIndexOf);
            this.f14022e = null;
            this.f14023f = null;
            notifyItemRemoved(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m15601S(View view, etl etlVar) {
        final IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) view;
        final cgo cgoVar = (cgo) etlVar;
        intlMeetLikersItemView.m3464l(cgoVar, new d30() { // from class: l.eeo
            public final void call() {
                this.f12527a.m15597O(cgoVar, intlMeetLikersItemView);
            }
        }, new d30() { // from class: l.feo
            public final void call() {
                this.f12971a.m15598P(cgoVar);
            }
        }, new d30() { // from class: l.geo
            public final void call() {
                this.f13488a.m15599Q(cgoVar);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public boolean m15602T(List<etl> list, boolean z) {
        this.f14025h = false;
        boolean z2 = this.f14024g.size() != list.size();
        if (z || vwb.J(this.f14024g)) {
            this.f14024g.clear();
            this.f14024g.addAll(list);
            notifyDataSetChanged();
            return z2;
        }
        g.e eVarB = g.b(new C0934a(new ArrayList(this.f14024g), list));
        this.f14024g.clear();
        this.f14024g.addAll(list);
        eVarB.b(this);
        return z2;
    }

    /* JADX INFO: renamed from: e */
    public void m15603e(int i) {
        DbLinks dbLinks;
        super.e(i);
        if (vwb.J(this.f14024g) || this.f14025h || i < this.f14024g.size() - 2 || (dbLinks = this.f14020c.f21111c) == null || TextUtils.isEmpty(dbLinks.links.next)) {
            return;
        }
        this.f14025h = true;
        ufo ufoVar = this.f14020c;
        ufoVar.m22839N0(ufoVar.f21111c.links.next);
    }

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
