package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0603g;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.TribeSubset;
import com.p051p1.mobile.putong.core.data.TribeSubsetContent;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetTribeFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupBanner;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupPurse;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupRight;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeItemView;
import java.util.List;
import p151v.VRecyclerView;
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes11.dex */
public class qjo implements iam<ojo> {

    /* JADX INFO: renamed from: f */
    public static final int f158003f = (bnl0.m105592y0() - qa00.m175859d(40.0f)) / 3;

    /* JADX INFO: renamed from: a */
    public SmartRefreshLayout f158004a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f158005b;

    /* JADX INFO: renamed from: c */
    public final IntlMeetTribeFrag f158006c;

    /* JADX INFO: renamed from: d */
    public ojo f158007d;

    /* JADX INFO: renamed from: e */
    public C19584a f158008e;

    /* JADX INFO: renamed from: l.qjo$a */
    public class C19584a extends jic0<TribeSubset> {

        /* JADX INFO: renamed from: c */
        public final RecyclerView.AbstractC0578n f158009c;

        /* JADX INFO: renamed from: d */
        public List<TribeSubset> f158010d;

        /* JADX INFO: renamed from: l.qjo$a$a */
        public class a extends RecyclerView.AbstractC0578n {
            public a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
            public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
                if (recyclerView.getChildAdapterPosition(view) > 0) {
                    rect.left = qa00.m175859d(10.0f);
                }
            }
        }

        /* JADX INFO: renamed from: l.qjo$a$b */
        public class b extends C0603g.b {

            /* JADX INFO: renamed from: a */
            public final List<TribeSubset> f158013a;

            /* JADX INFO: renamed from: b */
            public final List<TribeSubset> f158014b;

            public b(List<TribeSubset> list, List<TribeSubset> list2) {
                this.f158013a = list;
                this.f158014b = list2;
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: a */
            public boolean mo3646a(int i, int i2) {
                return this.f158013a.get(i).equals(this.f158014b.get(i2));
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: b */
            public boolean mo3647b(int i, int i2) {
                return this.f158013a.get(i).groupCategory.equals(this.f158014b.get(i2).groupCategory);
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: d */
            public int mo3649d() {
                return this.f158014b.size();
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: e */
            public int mo3650e() {
                return this.f158013a.size();
            }
        }

        public C19584a() {
            this.f158009c = new a();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            List<TribeSubset> list = this.f158010d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(qjo.this.act()).inflate(pec0.f151950V, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, TribeSubset tribeSubset, int i, int i2) {
            IntlTribeItemView intlTribeItemView = (IntlTribeItemView) view;
            intlTribeItemView.m40456Q(tribeSubset, qjo.this.f158007d);
            VRecyclerView vRecyclerView = intlTribeItemView.f25030e;
            C19585b c19585b = (C19585b) vRecyclerView.getAdapter();
            if (c19585b == null) {
                c19585b = new C19585b();
                vRecyclerView.setAdapter(c19585b);
                vRecyclerView.addItemDecoration(this.f158009c);
            }
            vRecyclerView.scrollToPosition(0);
            c19585b.m176859I(tribeSubset.subsetContent, tribeSubset.groupCategory);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public TribeSubset getItem(int i) {
            List<TribeSubset> list = this.f158010d;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: G */
        public void m176854G(List<TribeSubset> list) {
            List<TribeSubset> list2 = this.f158010d;
            if (list2 == null) {
                this.f158010d = list;
                notifyDataSetChanged();
            } else {
                C0603g.e eVarM3681b = C0603g.m3681b(new b(list2, list));
                this.f158010d = list;
                eVarM3681b.m3693b(this);
            }
        }
    }

    /* JADX INFO: renamed from: l.qjo$b */
    public class C19585b extends jic0<TribeSubsetContent> {

        /* JADX INFO: renamed from: c */
        public List<TribeSubsetContent> f158016c;

        /* JADX INFO: renamed from: d */
        public String f158017d;

        /* JADX INFO: renamed from: e */
        public int f158018e;

        /* JADX INFO: renamed from: f */
        public int f158019f;

        /* JADX INFO: renamed from: l.qjo$b$a */
        public class a extends C0603g.b {

            /* JADX INFO: renamed from: a */
            public final List<TribeSubsetContent> f158021a;

            /* JADX INFO: renamed from: b */
            public final List<TribeSubsetContent> f158022b;

            public a(List<TribeSubsetContent> list, List<TribeSubsetContent> list2) {
                this.f158021a = list;
                this.f158022b = list2;
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: a */
            public boolean mo3646a(int i, int i2) {
                return this.f158021a.get(i).equals(this.f158022b.get(i2));
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: b */
            public boolean mo3647b(int i, int i2) {
                return this.f158021a.get(i).subType.equals(this.f158022b.get(i2).subType);
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: d */
            public int mo3649d() {
                return this.f158022b.size();
            }

            @Override // androidx.recyclerview.widget.C0603g.b
            /* JADX INFO: renamed from: e */
            public int mo3650e() {
                return this.f158021a.size();
            }
        }

        public C19585b() {
            this.f158018e = -1;
            this.f158019f = -1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            List<TribeSubsetContent> list = this.f158016c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(qjo.this.act());
            if (i == 0) {
                return layoutInflaterFrom.inflate(pec0.f151941S, viewGroup, false);
            }
            if (i == 1) {
                return layoutInflaterFrom.inflate(pec0.f151944T, viewGroup, false);
            }
            if (i == 2) {
                return layoutInflaterFrom.inflate(pec0.f151947U, viewGroup, false);
            }
            za50.m219101a("Unknown viewType: ", i);
            return null;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final TribeSubsetContent tribeSubsetContent, int i, int i2) {
            if (i != 0) {
                if (i == 1) {
                    ((IntlTribeGroupPurse) view).m40452s(tribeSubsetContent, qjo.this.f158007d);
                } else if (i == 2) {
                    IntlTribeGroupRight intlTribeGroupRight = (IntlTribeGroupRight) view;
                    List<TribeSubsetContent> list = this.f158016c;
                    int size = list != null ? list.size() : 1;
                    if (this.f158019f != size) {
                        int iM105592y0 = ((bnl0.m105592y0() - qa00.m175859d(20.0f)) - ((size - 1) * qa00.m175859d(8.0f))) / size;
                        this.f158018e = iM105592y0;
                        if (iM105592y0 <= 0) {
                            this.f158018e = qjo.f158003f;
                        }
                        this.f158019f = size;
                    }
                    intlTribeGroupRight.m40454s(tribeSubsetContent, qjo.this.f158007d, this.f158018e, qjo.f158003f);
                }
            } else {
                ((IntlTribeGroupBanner) view).m40450s(tribeSubsetContent, qjo.this.f158007d);
            }
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.rjo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f163493a.m176858H(tribeSubsetContent, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public TribeSubsetContent getItem(int i) {
            List<TribeSubsetContent> list = this.f158016c;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m176858H(TribeSubsetContent tribeSubsetContent, View view) {
            qjo.this.f158007d.m167892L0(this.f158017d, tribeSubsetContent);
        }

        /* JADX INFO: renamed from: I */
        public void m176859I(List<TribeSubsetContent> list, String str) {
            List<TribeSubsetContent> list2 = this.f158016c;
            if (list2 == null || jyb.m147479J(list2)) {
                this.f158016c = list;
                this.f158017d = str;
                this.f158018e = -1;
                this.f158019f = -1;
                notifyDataSetChanged();
                return;
            }
            C0603g.e eVarM3681b = C0603g.m3681b(new a(this.f158016c, list));
            this.f158016c = list;
            this.f158017d = str;
            this.f158018e = -1;
            this.f158019f = -1;
            eVarM3681b.m3693b(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            String str;
            String str2 = this.f158017d;
            switch (str2.hashCode()) {
                case -1396342996:
                    return str2.equals("banner") ? 0 : 1;
                case -976940010:
                    str = "pursue";
                    break;
                case 99450322:
                    str = "hobby";
                    break;
                case 108511772:
                    return str2.equals("right") ? 2 : 1;
                default:
                    return 1;
            }
            str2.equals(str);
            return 1;
        }
    }

    public qjo(IntlMeetTribeFrag intlMeetTribeFrag) {
        this.f158006c = intlMeetTribeFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f158006c.getContext();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f158006c.act();
    }

    /* JADX INFO: renamed from: d */
    public View m176847d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tjo.m191449b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ojo ojoVar) {
        this.f158007d = ojoVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m176849f(mvc0 mvc0Var) {
        this.f158007d.m167888G0();
    }

    /* JADX INFO: renamed from: i */
    public void m176850i(List<TribeSubset> list) {
        this.f158008e.m176854G(list);
        this.f158004a.m225021t();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m176847d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m176851r() {
        C19584a c19584a = new C19584a();
        this.f158008e = c19584a;
        this.f158005b.setAdapter(c19584a);
        this.f158004a.mo224405O(new jn50() { // from class: l.pjo
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f152726a.m176849f(mvc0Var);
            }
        });
        this.f158004a.mo160260a(true);
        this.f158004a.mo224409S(new TTRefreshHeader(getContext()));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
