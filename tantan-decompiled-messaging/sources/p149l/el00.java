package p149l;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentVisibleRangeItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VListCell;

/* JADX INFO: loaded from: classes12.dex */
public class el00 {

    /* JADX INFO: renamed from: d */
    public static volatile el00 f92042d;

    /* JADX INFO: renamed from: b */
    public C16640a f92044b;

    /* JADX INFO: renamed from: a */
    public int[] f92043a = {R$string.f39040d1, R$string.f39150t2, R$string.f39162v2, R$string.f39156u2};

    /* JADX INFO: renamed from: c */
    public boolean f92045c = FeedModule.m60222H().me_().profile.moments.hidePublicMoments;

    /* JADX INFO: renamed from: l.el00$a */
    public class C16640a extends dac0<VListCell.C22545a> {

        /* JADX INFO: renamed from: c */
        public List<VListCell.C22545a> f92046c;

        /* JADX INFO: renamed from: d */
        public Act f92047d;

        /* JADX INFO: renamed from: e */
        public int f92048e;

        /* JADX INFO: renamed from: f */
        public Moment f92049f;

        public C16640a(List<VListCell.C22545a> list, Act act, int i, Moment moment) {
            this.f92046c = list;
            this.f92047d = act;
            this.f92048e = i;
            this.f92049f = moment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m117041K(int i, View view) {
            if (!m117044J(i)) {
                this.f92048e = i;
                notifyDataSetChanged();
            } else if (NullChecker.m81303a(this.f92049f)) {
                lsi0.m151593w(R$string.f39111n2);
            } else {
                lsi0.m151593w(R$string.f38863A1);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f92046c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return this.f92047d.inflater().inflate(o6c0.f142322y1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, VListCell.C22545a c22545a, int i, final int i2) {
            FeedMomentVisibleRangeItemView feedMomentVisibleRangeItemView = (FeedMomentVisibleRangeItemView) view;
            feedMomentVisibleRangeItemView.m65155q(c22545a, i2 == this.f92048e, m117044J(i2));
            feedMomentVisibleRangeItemView.setOnClickListener(new View.OnClickListener() { // from class: l.dl00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f86771a.m117041K(i2, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public VListCell.C22545a getItem(int i) {
            if (i >= this.f92046c.size()) {
                return null;
            }
            return this.f92046c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final boolean m117044J(int i) {
            if (el00.this.f92045c) {
                return "everyone".equals(el00.this.m117030o(i)) || "stranger".equals(el00.this.m117030o(i));
            }
            return false;
        }

        @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<VListCell.C22545a> list = this.f92046c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: l.el00$b */
    public interface InterfaceC16641b {
        /* JADX INFO: renamed from: a */
        void mo117045a(VListCell.C22545a c22545a, int i);
    }

    public el00() {
        m117037v();
    }

    /* JADX INFO: renamed from: k */
    public static el00 m117022k() {
        if (f92042d == null) {
            synchronized (el00.class) {
                try {
                    if (f92042d == null) {
                        f92042d = new el00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f92042d;
    }

    /* JADX INFO: renamed from: g */
    public final List<Pair<String, String>> m117023g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(m117034s(R$string.f39040d1), m117034s(R$string.f39061g1)));
        arrayList.add(new Pair(m117034s(R$string.f39033c1), m117034s(R$string.f39068h1)));
        arrayList.add(new Pair(m117034s(R$string.f39047e1), m117034s(R$string.f39075i1)));
        arrayList.add(new Pair(m117034s(R$string.f39082j1), ""));
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public int m117024h() {
        return m117025i(null);
    }

    /* JADX INFO: renamed from: i */
    public int m117025i(Moment moment) {
        return m117029n(m117031p(moment));
    }

    /* JADX INFO: renamed from: j */
    public String m117026j() {
        return m117034s(this.f92043a[m117029n(m117031p(null))]);
    }

    /* JADX INFO: renamed from: l */
    public final List<VListCell.C22545a> m117027l(List<Pair<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : list) {
            arrayList.add(new VListCell.C22545a((CharSequence) pair.first, (CharSequence) pair.second, null, -1, -1, o6c0.f142322y1));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public String m117028m(int i) {
        return m117034s(this.f92043a[i]);
    }

    /* JADX INFO: renamed from: n */
    public final int m117029n(String str) {
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
    public String m117030o(int i) {
        if (i == 1) {
            return "matches";
        }
        if (i != 2) {
            return i != 3 ? "everyone" : "selfOnly";
        }
        return "stranger";
    }

    /* JADX INFO: renamed from: p */
    public String m117031p(Moment moment) {
        if (!this.f92045c) {
            return (NullChecker.m81303a(moment) && NullChecker.m81303a(moment.userSetVisibility) && !TEnum.equals(moment.userSetVisibility, "unknown_")) ? moment.userSetVisibility.toString() : "everyone";
        }
        if (NullChecker.m81303a(moment) && NullChecker.m81303a(moment.userSetVisibility)) {
            return (TEnum.equals(moment.userSetVisibility, "selfOnly") || TEnum.equals(moment.userSetVisibility, "stranger")) ? "selfOnly" : "matches";
        }
        return "matches";
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m117032q(Moment moment, final qhy[] qhyVarArr, Act act, InterfaceC16641b interfaceC16641b, View view) {
        if (!NullChecker.m81303a(moment)) {
            if (NullChecker.m81303a(interfaceC16641b)) {
                interfaceC16641b.mo117045a((VListCell.C22545a) this.f92044b.f92046c.get(this.f92044b.f92048e), this.f92044b.f92048e);
            }
            qhyVarArr[0].m174609b();
        } else if (TEnum.equals(moment.userSetVisibility, m117030o(this.f92044b.f92048e))) {
            qhyVarArr[0].m174609b();
        } else {
            act.duringCreated(FeedModule.f38855d.m209594yd(FeedModule.m60221F().userId(), moment.f56011id, m117030o(this.f92044b.f92048e))).subscribe(mkd0.m154956H(new e30() { // from class: l.bl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    qhyVarArr[0].m174609b();
                }
            }, new e30() { // from class: l.cl00
                @Override // p149l.e30
                public final void call(Object obj) {
                    qhyVarArr[0].m174609b();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m117033r(User user) {
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (NullChecker.m81303a(settingGroup)) {
            this.f92045c = settingGroup.privacy.hidePublicMoments.booleanValue();
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m117034s(int i) {
        return FeedModule.f38852a.getString(i);
    }

    /* JADX INFO: renamed from: t */
    public void m117035t(Act act, int i, InterfaceC16641b interfaceC16641b) {
        m117036u(act, null, i, interfaceC16641b);
    }

    /* JADX INFO: renamed from: u */
    public void m117036u(final Act act, final Moment moment, int i, final InterfaceC16641b interfaceC16641b) {
        final qhy[] qhyVarArr = {null};
        this.f92044b = new C16640a(m117027l(m117023g()), act, i, moment);
        qhy.C19502a c19502a = new qhy.C19502a(act);
        c19502a.m174671e0(R$string.f39054f1).m174664X(u2h.m191499h() ? f3c0.f94568m : f3c0.f94560l).m174663W(new View.OnClickListener() { // from class: l.zk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qhyVarArr[0].m174609b();
            }
        }).m174666Z(R$string.f39073i).m174668b0(act.getResources().getColor(u2h.m191499h() ? e1c0.f88788i : e1c0.f88798n)).m174670d0(17.0f).m174669c0(t100.m186890d(20.0f)).m174676j0(false).m174665Y(new View.OnClickListener() { // from class: l.al00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70355a.m117032q(moment, qhyVarArr, act, interfaceC16641b, view);
            }
        }).m174674h0(0).m174675i0(0).m174662V(new LinearLayoutManager(act)).m174655O(this.f92044b);
        qhy qhyVarM174654N = c19502a.m174654N();
        qhyVarArr[0] = qhyVarM174654N;
        qhyVarM174654N.m174614g();
    }

    /* JADX INFO: renamed from: v */
    public final void m117037v() {
        ijb0.m136538B().subscribe(mkd0.m154955G(new e30() { // from class: l.yk00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198701a.m117033r((User) obj);
            }
        }));
    }
}
