package p007l;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.data.SettingGroups;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentVisibleRangeItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.qhy;
import l.t100;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class el00 {

    /* JADX INFO: renamed from: d */
    public static volatile el00 f7409d;

    /* JADX INFO: renamed from: b */
    public C2376a f7411b;

    /* JADX INFO: renamed from: a */
    public int[] f7410a = {R$string.f501d1, R$string.f611t2, R$string.f623v2, R$string.f617u2};

    /* JADX INFO: renamed from: c */
    public boolean f7412c = FeedModule.m1140H().me_().profile.moments.hidePublicMoments;

    /* JADX INFO: renamed from: l.el00$a */
    public class C2376a extends dac0<VListCell.a> {

        /* JADX INFO: renamed from: c */
        public List<VListCell.a> f7413c;

        /* JADX INFO: renamed from: d */
        public Act f7414d;

        /* JADX INFO: renamed from: e */
        public int f7415e;

        /* JADX INFO: renamed from: f */
        public Moment f7416f;

        public C2376a(List<VListCell.a> list, Act act, int i, Moment moment) {
            this.f7413c = list;
            this.f7414d = act;
            this.f7415e = i;
            this.f7416f = moment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m9922K(int i, View view) {
            if (!m9928J(i)) {
                this.f7415e = i;
                notifyDataSetChanged();
            } else if (NullChecker.a(this.f7416f)) {
                lsi0.w(R$string.f572n2);
            } else {
                lsi0.w(R$string.f324A1);
            }
        }

        /* JADX INFO: renamed from: C */
        public int m9924C() {
            return this.f7413c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m9925D(ViewGroup viewGroup, int i) {
            return this.f7414d.inflater().inflate(o6c0.f11341y1, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void m9923A(View view, VListCell.a aVar, int i, final int i2) {
            FeedMomentVisibleRangeItemView feedMomentVisibleRangeItemView = (FeedMomentVisibleRangeItemView) view;
            feedMomentVisibleRangeItemView.m6256q(aVar, i2 == this.f7415e, m9928J(i2));
            feedMomentVisibleRangeItemView.setOnClickListener(new View.OnClickListener() { // from class: l.dl00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f6986a.m9922K(i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public VListCell.a getItem(int i) {
            if (i >= this.f7413c.size()) {
                return null;
            }
            return this.f7413c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final boolean m9928J(int i) {
            if (el00.this.f7412c) {
                return "everyone".equals(el00.this.m9911o(i)) || "stranger".equals(el00.this.m9911o(i));
            }
            return false;
        }

        public int getItemCount() {
            List<VListCell.a> list = this.f7413c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: l.el00$b */
    public interface InterfaceC2377b {
        /* JADX INFO: renamed from: a */
        void mo9929a(VListCell.a aVar, int i);
    }

    public el00() {
        m9918v();
    }

    /* JADX INFO: renamed from: k */
    public static el00 m9903k() {
        if (f7409d == null) {
            synchronized (el00.class) {
                try {
                    if (f7409d == null) {
                        f7409d = new el00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7409d;
    }

    /* JADX INFO: renamed from: g */
    public final List<Pair<String, String>> m9904g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(m9915s(R$string.f501d1), m9915s(R$string.f522g1)));
        arrayList.add(new Pair(m9915s(R$string.f494c1), m9915s(R$string.f529h1)));
        arrayList.add(new Pair(m9915s(R$string.f508e1), m9915s(R$string.f536i1)));
        arrayList.add(new Pair(m9915s(R$string.f543j1), ""));
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public int m9905h() {
        return m9906i(null);
    }

    /* JADX INFO: renamed from: i */
    public int m9906i(Moment moment) {
        return m9910n(m9912p(moment));
    }

    /* JADX INFO: renamed from: j */
    public String m9907j() {
        return m9915s(this.f7410a[m9910n(m9912p(null))]);
    }

    /* JADX INFO: renamed from: l */
    public final List<VListCell.a> m9908l(List<Pair<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : list) {
            arrayList.add(new VListCell.a((CharSequence) pair.first, (CharSequence) pair.second, (CharSequence) null, -1, -1, o6c0.f11341y1));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public String m9909m(int i) {
        return m9915s(this.f7410a[i]);
    }

    /* JADX INFO: renamed from: n */
    public final int m9910n(String str) {
        str.getClass();
        switch (str) {
            case "matches":
                return 1;
            case "selfOnly":
                return 3;
            case "stranger":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public String m9911o(int i) {
        if (i == 1) {
            return "matches";
        }
        if (i != 2) {
            return i != 3 ? "everyone" : "selfOnly";
        }
        return "stranger";
    }

    /* JADX INFO: renamed from: p */
    public String m9912p(Moment moment) {
        if (!this.f7412c) {
            return (NullChecker.a(moment) && NullChecker.a(moment.userSetVisibility) && !TEnum.equals(moment.userSetVisibility, "unknown_")) ? moment.userSetVisibility.toString() : "everyone";
        }
        if (NullChecker.a(moment) && NullChecker.a(moment.userSetVisibility)) {
            return (TEnum.equals(moment.userSetVisibility, "selfOnly") || TEnum.equals(moment.userSetVisibility, "stranger")) ? "selfOnly" : "matches";
        }
        return "matches";
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m9913q(Moment moment, final qhy[] qhyVarArr, Act act, InterfaceC2377b interfaceC2377b, View view) {
        if (!NullChecker.a(moment)) {
            if (NullChecker.a(interfaceC2377b)) {
                interfaceC2377b.mo9929a((VListCell.a) this.f7411b.f7413c.get(this.f7411b.f7415e), this.f7411b.f7415e);
            }
            qhyVarArr[0].b();
        } else if (TEnum.equals(moment.userSetVisibility, m9911o(this.f7411b.f7415e))) {
            qhyVarArr[0].b();
        } else {
            act.duringCreated(FeedModule.f316d.m16775yd(FeedModule.m1139F().userId(), ((DbObject) moment).id, m9911o(this.f7411b.f7415e))).subscribe(mkd0.H(new e30() { // from class: l.bl00
                public final void call(Object obj) {
                    qhyVarArr[0].b();
                }
            }, new e30() { // from class: l.cl00
                public final void call(Object obj) {
                    qhyVarArr[0].b();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m9914r(User user) {
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (NullChecker.a(settingGroup)) {
            this.f7412c = settingGroup.privacy.hidePublicMoments.booleanValue();
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m9915s(int i) {
        return FeedModule.f313a.getString(i);
    }

    /* JADX INFO: renamed from: t */
    public void m9916t(Act act, int i, InterfaceC2377b interfaceC2377b) {
        m9917u(act, null, i, interfaceC2377b);
    }

    /* JADX INFO: renamed from: u */
    public void m9917u(final Act act, final Moment moment, int i, final InterfaceC2377b interfaceC2377b) {
        final qhy[] qhyVarArr = {null};
        this.f7411b = new C2376a(m9908l(m9904g()), act, i, moment);
        qhy.a aVar = new qhy.a(act);
        aVar.e0(R$string.f515f1).X(u2h.m14723h() ? f3c0.f7851m : f3c0.f7843l).W(new View.OnClickListener() { // from class: l.zk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qhyVarArr[0].b();
            }
        }).Z(R$string.f534i).b0(act.getResources().getColor(u2h.m14723h() ? e1c0.f7144i : e1c0.f7154n)).d0(17.0f).c0(t100.d(20.0f)).j0(false).Y(new View.OnClickListener() { // from class: l.al00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5768a.m9913q(moment, qhyVarArr, act, interfaceC2377b, view);
            }
        }).h0(0).i0(0).V(new LinearLayoutManager(act)).O(this.f7411b);
        qhy qhyVarN = aVar.N();
        qhyVarArr[0] = qhyVarN;
        qhyVarN.g();
    }

    /* JADX INFO: renamed from: v */
    public final void m9918v() {
        ijb0.m10891B().subscribe(mkd0.G(new e30() { // from class: l.yk00
            public final void call(Object obj) {
                this.f15461a.m9914r((User) obj);
            }
        }));
    }
}
