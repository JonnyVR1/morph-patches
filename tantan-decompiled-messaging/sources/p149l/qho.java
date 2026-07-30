package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0601g;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.TribeSubset;
import com.p046p1.mobile.putong.core.data.TribeSubsetContent;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetTribeFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupBanner;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupPurse;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupRight;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeItemView;
import java.util.List;
import p147v.VRecyclerView;
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes11.dex */
public class qho implements s7m<oho> {

    /* JADX INFO: renamed from: f */
    public static final int f154480f = (xdl0.m208412y0() - t100.m186890d(40.0f)) / 3;

    /* JADX INFO: renamed from: a */
    public SmartRefreshLayout f154481a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f154482b;

    /* JADX INFO: renamed from: c */
    public final IntlMeetTribeFrag f154483c;

    /* JADX INFO: renamed from: d */
    public oho f154484d;

    /* JADX INFO: renamed from: e */
    public C19500a f154485e;

    /* JADX INFO: renamed from: l.qho$a */
    public class C19500a extends dac0<TribeSubset> {

        /* JADX INFO: renamed from: c */
        public final RecyclerView.AbstractC0576n f154486c;

        /* JADX INFO: renamed from: d */
        public List<TribeSubset> f154487d;

        /* JADX INFO: renamed from: l.qho$a$a */
        public class a extends RecyclerView.AbstractC0576n {
            public a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
            public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
                if (recyclerView.getChildAdapterPosition(view) > 0) {
                    rect.left = t100.m186890d(10.0f);
                }
            }
        }

        /* JADX INFO: renamed from: l.qho$a$b */
        public class b extends C0601g.b {

            /* JADX INFO: renamed from: a */
            public final List<TribeSubset> f154490a;

            /* JADX INFO: renamed from: b */
            public final List<TribeSubset> f154491b;

            public b(List<TribeSubset> list, List<TribeSubset> list2) {
                this.f154490a = list;
                this.f154491b = list2;
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: a */
            public boolean mo3645a(int i, int i2) {
                return this.f154490a.get(i).equals(this.f154491b.get(i2));
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: b */
            public boolean mo3646b(int i, int i2) {
                return this.f154490a.get(i).groupCategory.equals(this.f154491b.get(i2).groupCategory);
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: d */
            public int mo3648d() {
                return this.f154491b.size();
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: e */
            public int mo3649e() {
                return this.f154490a.size();
            }
        }

        public C19500a() {
            this.f154486c = new a();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            List<TribeSubset> list = this.f154487d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(qho.this.act()).inflate(k6c0.f121342V, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, TribeSubset tribeSubset, int i, int i2) {
            IntlTribeItemView intlTribeItemView = (IntlTribeItemView) view;
            intlTribeItemView.m39453Q(tribeSubset, qho.this.f154484d);
            VRecyclerView vRecyclerView = intlTribeItemView.f24288e;
            C19501b c19501b = (C19501b) vRecyclerView.getAdapter();
            if (c19501b == null) {
                c19501b = new C19501b();
                vRecyclerView.setAdapter(c19501b);
                vRecyclerView.addItemDecoration(this.f154486c);
            }
            vRecyclerView.scrollToPosition(0);
            c19501b.m174576I(tribeSubset.subsetContent, tribeSubset.groupCategory);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public TribeSubset getItem(int i) {
            List<TribeSubset> list = this.f154487d;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: G */
        public void m174571G(List<TribeSubset> list) {
            List<TribeSubset> list2 = this.f154487d;
            if (list2 == null) {
                this.f154487d = list;
                notifyDataSetChanged();
            } else {
                C0601g.e eVarM3680b = C0601g.m3680b(new b(list2, list));
                this.f154487d = list;
                eVarM3680b.m3692b(this);
            }
        }
    }

    /* JADX INFO: renamed from: l.qho$b */
    public class C19501b extends dac0<TribeSubsetContent> {

        /* JADX INFO: renamed from: c */
        public List<TribeSubsetContent> f154493c;

        /* JADX INFO: renamed from: d */
        public String f154494d;

        /* JADX INFO: renamed from: e */
        public int f154495e;

        /* JADX INFO: renamed from: f */
        public int f154496f;

        /* JADX INFO: renamed from: l.qho$b$a */
        public class a extends C0601g.b {

            /* JADX INFO: renamed from: a */
            public final List<TribeSubsetContent> f154498a;

            /* JADX INFO: renamed from: b */
            public final List<TribeSubsetContent> f154499b;

            public a(List<TribeSubsetContent> list, List<TribeSubsetContent> list2) {
                this.f154498a = list;
                this.f154499b = list2;
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: a */
            public boolean mo3645a(int i, int i2) {
                return this.f154498a.get(i).equals(this.f154499b.get(i2));
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: b */
            public boolean mo3646b(int i, int i2) {
                return this.f154498a.get(i).subType.equals(this.f154499b.get(i2).subType);
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: d */
            public int mo3648d() {
                return this.f154499b.size();
            }

            @Override // androidx.recyclerview.widget.C0601g.b
            /* JADX INFO: renamed from: e */
            public int mo3649e() {
                return this.f154498a.size();
            }
        }

        public C19501b() {
            this.f154495e = -1;
            this.f154496f = -1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            List<TribeSubsetContent> list = this.f154493c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(qho.this.act());
            if (i == 0) {
                return layoutInflaterFrom.inflate(k6c0.f121333S, viewGroup, false);
            }
            if (i == 1) {
                return layoutInflaterFrom.inflate(k6c0.f121336T, viewGroup, false);
            }
            if (i == 2) {
                return layoutInflaterFrom.inflate(k6c0.f121339U, viewGroup, false);
            }
            k250.m144273a("Unknown viewType: ", i);
            return null;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final TribeSubsetContent tribeSubsetContent, int i, int i2) {
            if (i != 0) {
                if (i == 1) {
                    ((IntlTribeGroupPurse) view).m39449s(tribeSubsetContent, qho.this.f154484d);
                } else if (i == 2) {
                    IntlTribeGroupRight intlTribeGroupRight = (IntlTribeGroupRight) view;
                    List<TribeSubsetContent> list = this.f154493c;
                    int size = list != null ? list.size() : 1;
                    if (this.f154496f != size) {
                        int iM208412y0 = ((xdl0.m208412y0() - t100.m186890d(20.0f)) - ((size - 1) * t100.m186890d(8.0f))) / size;
                        this.f154495e = iM208412y0;
                        if (iM208412y0 <= 0) {
                            this.f154495e = qho.f154480f;
                        }
                        this.f154496f = size;
                    }
                    intlTribeGroupRight.m39451s(tribeSubsetContent, qho.this.f154484d, this.f154495e, qho.f154480f);
                }
            } else {
                ((IntlTribeGroupBanner) view).m39447s(tribeSubsetContent, qho.this.f154484d);
            }
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.rho
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f159465a.m174575H(tribeSubsetContent, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public TribeSubsetContent getItem(int i) {
            List<TribeSubsetContent> list = this.f154493c;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m174575H(TribeSubsetContent tribeSubsetContent, View view) {
            qho.this.f154484d.m164452L0(this.f154494d, tribeSubsetContent);
        }

        /* JADX INFO: renamed from: I */
        public void m174576I(List<TribeSubsetContent> list, String str) {
            List<TribeSubsetContent> list2 = this.f154493c;
            if (list2 == null || vwb.m200296J(list2)) {
                this.f154493c = list;
                this.f154494d = str;
                this.f154495e = -1;
                this.f154496f = -1;
                notifyDataSetChanged();
                return;
            }
            C0601g.e eVarM3680b = C0601g.m3680b(new a(this.f154493c, list));
            this.f154493c = list;
            this.f154494d = str;
            this.f154495e = -1;
            this.f154496f = -1;
            eVarM3680b.m3692b(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            String str;
            String str2 = this.f154494d;
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

    public qho(IntlMeetTribeFrag intlMeetTribeFrag) {
        this.f154483c = intlMeetTribeFrag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f154483c.getContext();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f154483c.act();
    }

    /* JADX INFO: renamed from: d */
    public View m174564d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tho.m188926b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(oho ohoVar) {
        this.f154484d = ohoVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m174566f(hnc0 hnc0Var) {
        this.f154484d.m164448G0();
    }

    /* JADX INFO: renamed from: i */
    public void m174567i(List<TribeSubset> list) {
        this.f154485e.m174571G(list);
        this.f154481a.m223775t();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m174564d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m174568r() {
        C19500a c19500a = new C19500a();
        this.f154485e = c19500a;
        this.f154482b.setAdapter(c19500a);
        this.f154481a.mo223159O(new df50() { // from class: l.pho
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f149028a.m174566f(hnc0Var);
            }
        });
        this.f154481a.mo131887a(true);
        this.f154481a.mo223163S(new TTRefreshHeader(getContext()));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
