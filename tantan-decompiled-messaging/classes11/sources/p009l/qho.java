package p009l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetTribeFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupBanner;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupPurse;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeGroupRight;
import com.p000p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.TribeSubset;
import com.p1.mobile.putong.core.data.TribeSubsetContent;
import java.util.List;
import l.dac0;
import l.df50;
import l.hnc0;
import l.k250;
import l.k6c0;
import l.s7m;
import l.t100;
import l.tho;
import l.vwb;
import l.xdl0;
import v.VRecyclerView;
import v.smart_refresh.SmartRefreshLayout;
import v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qho implements s7m<oho> {

    /* JADX INFO: renamed from: f */
    public static final int f19262f = (xdl0.y0() - t100.d(40.0f)) / 3;

    /* JADX INFO: renamed from: a */
    public SmartRefreshLayout f19263a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f19264b;

    /* JADX INFO: renamed from: c */
    public final IntlMeetTribeFrag f19265c;

    /* JADX INFO: renamed from: d */
    public oho f19266d;

    /* JADX INFO: renamed from: e */
    public C1145a f19267e;

    /* JADX INFO: renamed from: l.qho$a */
    public class C1145a extends dac0<TribeSubset> {

        /* JADX INFO: renamed from: c */
        public final RecyclerView.n f19268c;

        /* JADX INFO: renamed from: d */
        public List<TribeSubset> f19269d;

        /* JADX INFO: renamed from: l.qho$a$a */
        public class a extends RecyclerView.n {
            public a() {
            }

            public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
                if (recyclerView.getChildAdapterPosition(view) > 0) {
                    rect.left = t100.d(10.0f);
                }
            }
        }

        /* JADX INFO: renamed from: l.qho$a$b */
        public class b extends g.b {

            /* JADX INFO: renamed from: a */
            public final List<TribeSubset> f19272a;

            /* JADX INFO: renamed from: b */
            public final List<TribeSubset> f19273b;

            public b(List<TribeSubset> list, List<TribeSubset> list2) {
                this.f19272a = list;
                this.f19273b = list2;
            }

            /* JADX INFO: renamed from: a */
            public boolean m20995a(int i, int i2) {
                return this.f19272a.get(i).equals(this.f19273b.get(i2));
            }

            /* JADX INFO: renamed from: b */
            public boolean m20996b(int i, int i2) {
                return this.f19272a.get(i).groupCategory.equals(this.f19273b.get(i2).groupCategory);
            }

            /* JADX INFO: renamed from: d */
            public int m20997d() {
                return this.f19273b.size();
            }

            /* JADX INFO: renamed from: e */
            public int m20998e() {
                return this.f19272a.size();
            }
        }

        public C1145a() {
            this.f19268c = new a();
        }

        /* JADX INFO: renamed from: C */
        public int m20990C() {
            List<TribeSubset> list = this.f19269d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX INFO: renamed from: D */
        public View m20991D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(qho.this.act()).inflate(k6c0.V, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m20989A(View view, TribeSubset tribeSubset, int i, int i2) {
            IntlTribeItemView intlTribeItemView = (IntlTribeItemView) view;
            intlTribeItemView.m3507Q(tribeSubset, qho.this.f19266d);
            VRecyclerView vRecyclerView = intlTribeItemView.f3066e;
            C1146b adapter = vRecyclerView.getAdapter();
            if (adapter == null) {
                adapter = new C1146b();
                vRecyclerView.setAdapter(adapter);
                vRecyclerView.addItemDecoration(this.f19268c);
            }
            vRecyclerView.scrollToPosition(0);
            adapter.m21006I(tribeSubset.subsetContent, tribeSubset.groupCategory);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public TribeSubset getItem(int i) {
            List<TribeSubset> list = this.f19269d;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: G */
        public void m20994G(List<TribeSubset> list) {
            List<TribeSubset> list2 = this.f19269d;
            if (list2 == null) {
                this.f19269d = list;
                notifyDataSetChanged();
            } else {
                g.e eVarB = g.b(new b(list2, list));
                this.f19269d = list;
                eVarB.b(this);
            }
        }
    }

    /* JADX INFO: renamed from: l.qho$b */
    public class C1146b extends dac0<TribeSubsetContent> {

        /* JADX INFO: renamed from: c */
        public List<TribeSubsetContent> f19275c;

        /* JADX INFO: renamed from: d */
        public String f19276d;

        /* JADX INFO: renamed from: e */
        public int f19277e;

        /* JADX INFO: renamed from: f */
        public int f19278f;

        /* JADX INFO: renamed from: l.qho$b$a */
        public class a extends g.b {

            /* JADX INFO: renamed from: a */
            public final List<TribeSubsetContent> f19280a;

            /* JADX INFO: renamed from: b */
            public final List<TribeSubsetContent> f19281b;

            public a(List<TribeSubsetContent> list, List<TribeSubsetContent> list2) {
                this.f19280a = list;
                this.f19281b = list2;
            }

            /* JADX INFO: renamed from: a */
            public boolean m21007a(int i, int i2) {
                return this.f19280a.get(i).equals(this.f19281b.get(i2));
            }

            /* JADX INFO: renamed from: b */
            public boolean m21008b(int i, int i2) {
                return this.f19280a.get(i).subType.equals(this.f19281b.get(i2).subType);
            }

            /* JADX INFO: renamed from: d */
            public int m21009d() {
                return this.f19281b.size();
            }

            /* JADX INFO: renamed from: e */
            public int m21010e() {
                return this.f19280a.size();
            }
        }

        public C1146b() {
            this.f19277e = -1;
            this.f19278f = -1;
        }

        /* JADX INFO: renamed from: C */
        public int m21001C() {
            List<TribeSubsetContent> list = this.f19275c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX INFO: renamed from: D */
        public View m21002D(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(qho.this.act());
            if (i == 0) {
                return layoutInflaterFrom.inflate(k6c0.S, viewGroup, false);
            }
            if (i == 1) {
                return layoutInflaterFrom.inflate(k6c0.T, viewGroup, false);
            }
            if (i == 2) {
                return layoutInflaterFrom.inflate(k6c0.U, viewGroup, false);
            }
            k250.a("Unknown viewType: ", i);
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m21000A(View view, final TribeSubsetContent tribeSubsetContent, int i, int i2) {
            if (i != 0) {
                if (i == 1) {
                    ((IntlTribeGroupPurse) view).m3503s(tribeSubsetContent, qho.this.f19266d);
                } else if (i == 2) {
                    IntlTribeGroupRight intlTribeGroupRight = (IntlTribeGroupRight) view;
                    List<TribeSubsetContent> list = this.f19275c;
                    int size = list != null ? list.size() : 1;
                    if (this.f19278f != size) {
                        int iY0 = ((xdl0.y0() - t100.d(20.0f)) - ((size - 1) * t100.d(8.0f))) / size;
                        this.f19277e = iY0;
                        if (iY0 <= 0) {
                            this.f19277e = qho.f19262f;
                        }
                        this.f19278f = size;
                    }
                    intlTribeGroupRight.m3505s(tribeSubsetContent, qho.this.f19266d, this.f19277e, qho.f19262f);
                }
            } else {
                ((IntlTribeGroupBanner) view).m3501s(tribeSubsetContent, qho.this.f19266d);
            }
            xdl0.E0(view, new View.OnClickListener() { // from class: l.rho
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f19839a.m21005H(tribeSubsetContent, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public TribeSubsetContent getItem(int i) {
            List<TribeSubsetContent> list = this.f19275c;
            if (list != null) {
                return list.get(i);
            }
            return null;
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m21005H(TribeSubsetContent tribeSubsetContent, View view) {
            qho.this.f19266d.m19787L0(this.f19276d, tribeSubsetContent);
        }

        /* JADX INFO: renamed from: I */
        public void m21006I(List<TribeSubsetContent> list, String str) {
            List<TribeSubsetContent> list2 = this.f19275c;
            if (list2 == null || vwb.J(list2)) {
                this.f19275c = list;
                this.f19276d = str;
                this.f19277e = -1;
                this.f19278f = -1;
                notifyDataSetChanged();
                return;
            }
            g.e eVarB = g.b(new a(this.f19275c, list));
            this.f19275c = list;
            this.f19276d = str;
            this.f19277e = -1;
            this.f19278f = -1;
            eVarB.b(this);
        }

        public int getItemViewType(int i) {
            String str;
            String str2 = this.f19276d;
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
        this.f19265c = intlMeetTribeFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20982C0() {
        return this.f19265c.getContext();
    }

    @Nullable
    public Act act() {
        return this.f19265c.act();
    }

    /* JADX INFO: renamed from: d */
    public View m20983d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tho.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m20987i1(oho ohoVar) {
        this.f19266d = ohoVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m20985f(hnc0 hnc0Var) {
        this.f19266d.m19783G0();
    }

    /* JADX INFO: renamed from: i */
    public void m20986i(List<TribeSubset> list) {
        this.f19267e.m20994G(list);
        this.f19263a.t();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m20983d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m20988r() {
        C1145a c1145a = new C1145a();
        this.f19267e = c1145a;
        this.f19264b.setAdapter(c1145a);
        this.f19263a.O(new df50() { // from class: l.pho
            /* JADX INFO: renamed from: w2 */
            public final void m20296w2(hnc0 hnc0Var) {
                this.f18594a.m20985f(hnc0Var);
            }
        });
        this.f19263a.a(true);
        this.f19263a.S(new TTRefreshHeader(m20982C0()));
    }

    public void destroy() {
    }
}
