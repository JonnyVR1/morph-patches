package p153l;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentVisibleRangeItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VListCell;

/* JADX INFO: loaded from: classes13.dex */
public class nt00 {

    /* JADX INFO: renamed from: d */
    public static volatile nt00 f143565d;

    /* JADX INFO: renamed from: b */
    public C18945a f143567b;

    /* JADX INFO: renamed from: a */
    public int[] f143566a = {R$string.f39888d1, R$string.f39998t2, R$string.f40010v2, R$string.f40004u2};

    /* JADX INFO: renamed from: c */
    public boolean f143568c = FeedModule.m61406H().me_().profile.moments.hidePublicMoments;

    /* JADX INFO: renamed from: l.nt00$a */
    public class C18945a extends jic0<VListCell.C22660a> {

        /* JADX INFO: renamed from: c */
        public List<VListCell.C22660a> f143569c;

        /* JADX INFO: renamed from: d */
        public Act f143570d;

        /* JADX INFO: renamed from: e */
        public int f143571e;

        /* JADX INFO: renamed from: f */
        public Moment f143572f;

        public C18945a(List<VListCell.C22660a> list, Act act, int i, Moment moment) {
            this.f143569c = list;
            this.f143570d = act;
            this.f143571e = i;
            this.f143572f = moment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m164683K(int i, View view) {
            if (!m164686J(i)) {
                this.f143571e = i;
                notifyDataSetChanged();
            } else if (NullChecker.m82486a(this.f143572f)) {
                o1j0.m165649w(R$string.f39959n2);
            } else {
                o1j0.m165649w(R$string.f39711A1);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f143569c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return this.f143570d.inflater().inflate(tec0.f173791y1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, VListCell.C22660a c22660a, int i, final int i2) {
            FeedMomentVisibleRangeItemView feedMomentVisibleRangeItemView = (FeedMomentVisibleRangeItemView) view;
            feedMomentVisibleRangeItemView.m66338q(c22660a, i2 == this.f143571e, m164686J(i2));
            feedMomentVisibleRangeItemView.setOnClickListener(new View.OnClickListener() { // from class: l.mt00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f138533a.m164683K(i2, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public VListCell.C22660a getItem(int i) {
            if (i >= this.f143569c.size()) {
                return null;
            }
            return this.f143569c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final boolean m164686J(int i) {
            if (nt00.this.f143568c) {
                return "everyone".equals(nt00.this.m164672o(i)) || "stranger".equals(nt00.this.m164672o(i));
            }
            return false;
        }

        @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<VListCell.C22660a> list = this.f143569c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: l.nt00$b */
    public interface InterfaceC18946b {
        /* JADX INFO: renamed from: a */
        void mo164687a(VListCell.C22660a c22660a, int i);
    }

    public nt00() {
        m164679v();
    }

    /* JADX INFO: renamed from: k */
    public static nt00 m164664k() {
        if (f143565d == null) {
            synchronized (nt00.class) {
                try {
                    if (f143565d == null) {
                        f143565d = new nt00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f143565d;
    }

    /* JADX INFO: renamed from: g */
    public final List<Pair<String, String>> m164665g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(m164676s(R$string.f39888d1), m164676s(R$string.f39909g1)));
        arrayList.add(new Pair(m164676s(R$string.f39881c1), m164676s(R$string.f39916h1)));
        arrayList.add(new Pair(m164676s(R$string.f39895e1), m164676s(R$string.f39923i1)));
        arrayList.add(new Pair(m164676s(R$string.f39930j1), ""));
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public int m164666h() {
        return m164667i(null);
    }

    /* JADX INFO: renamed from: i */
    public int m164667i(Moment moment) {
        return m164671n(m164673p(moment));
    }

    /* JADX INFO: renamed from: j */
    public String m164668j() {
        return m164676s(this.f143566a[m164671n(m164673p(null))]);
    }

    /* JADX INFO: renamed from: l */
    public final List<VListCell.C22660a> m164669l(List<Pair<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : list) {
            arrayList.add(new VListCell.C22660a((CharSequence) pair.first, (CharSequence) pair.second, null, -1, -1, tec0.f173791y1));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public String m164670m(int i) {
        return m164676s(this.f143566a[i]);
    }

    /* JADX INFO: renamed from: n */
    public final int m164671n(String str) {
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
    public String m164672o(int i) {
        if (i == 1) {
            return "matches";
        }
        if (i != 2) {
            return i != 3 ? "everyone" : "selfOnly";
        }
        return "stranger";
    }

    /* JADX INFO: renamed from: p */
    public String m164673p(Moment moment) {
        if (!this.f143568c) {
            return (NullChecker.m82486a(moment) && NullChecker.m82486a(moment.userSetVisibility) && !TEnum.equals(moment.userSetVisibility, "unknown_")) ? moment.userSetVisibility.toString() : "everyone";
        }
        if (NullChecker.m82486a(moment) && NullChecker.m82486a(moment.userSetVisibility)) {
            return (TEnum.equals(moment.userSetVisibility, "selfOnly") || TEnum.equals(moment.userSetVisibility, "stranger")) ? "selfOnly" : "matches";
        }
        return "matches";
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m164674q(Moment moment, final nqy[] nqyVarArr, Act act, InterfaceC18946b interfaceC18946b, View view) {
        if (!NullChecker.m82486a(moment)) {
            if (NullChecker.m82486a(interfaceC18946b)) {
                interfaceC18946b.mo164687a((VListCell.C22660a) this.f143567b.f143569c.get(this.f143567b.f143571e), this.f143567b.f143571e);
            }
            nqyVarArr[0].m164362b();
        } else if (TEnum.equals(moment.userSetVisibility, m164672o(this.f143567b.f143571e))) {
            nqyVarArr[0].m164362b();
        } else {
            act.duringCreated(FeedModule.f39703d.m145835yd(FeedModule.m61405F().userId(), moment.f56859id, m164672o(this.f143567b.f143571e))).subscribe(psd0.m173597H(new y20() { // from class: l.kt00
                @Override // p153l.y20
                public final void call(Object obj) {
                    nqyVarArr[0].m164362b();
                }
            }, new y20() { // from class: l.lt00
                @Override // p153l.y20
                public final void call(Object obj) {
                    nqyVarArr[0].m164362b();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m164675r(User user) {
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (NullChecker.m82486a(settingGroup)) {
            this.f143568c = settingGroup.privacy.hidePublicMoments.booleanValue();
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m164676s(int i) {
        return FeedModule.f39700a.getString(i);
    }

    /* JADX INFO: renamed from: t */
    public void m164677t(Act act, int i, InterfaceC18946b interfaceC18946b) {
        m164678u(act, null, i, interfaceC18946b);
    }

    /* JADX INFO: renamed from: u */
    public void m164678u(final Act act, final Moment moment, int i, final InterfaceC18946b interfaceC18946b) {
        final nqy[] nqyVarArr = {null};
        this.f143567b = new C18945a(m164669l(m164665g()), act, i, moment);
        nqy.C18929a c18929a = new nqy.C18929a(act);
        c18929a.m164424e0(R$string.f39902f1).m164417X(j4h.m143424h() ? lbc0.f131086m : lbc0.f131078l).m164416W(new View.OnClickListener() { // from class: l.it00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nqyVarArr[0].m164362b();
            }
        }).m164419Z(R$string.f39921i).m164421b0(act.getResources().getColor(j4h.m143424h() ? k9c0.f124511i : k9c0.f124521n)).m164423d0(17.0f).m164422c0(qa00.m175859d(20.0f)).m164429j0(false).m164418Y(new View.OnClickListener() { // from class: l.jt00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122544a.m164674q(moment, nqyVarArr, act, interfaceC18946b, view);
            }
        }).m164427h0(0).m164428i0(0).m164415V(new LinearLayoutManager(act)).m164408O(this.f143567b);
        nqy nqyVarM164407N = c18929a.m164407N();
        nqyVarArr[0] = nqyVarM164407N;
        nqyVarM164407N.m164367g();
    }

    /* JADX INFO: renamed from: v */
    public final void m164679v() {
        mrb0.m159624B().subscribe(psd0.m173596G(new y20() { // from class: l.ht00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111499a.m164675r((User) obj);
            }
        }));
    }
}
