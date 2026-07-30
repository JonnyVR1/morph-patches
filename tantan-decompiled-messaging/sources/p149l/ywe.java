package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.EmojiCatgoryName;
import com.p046p1.mobile.putong.data.EmojiItem;
import com.p046p1.mobile.putong.data.EmojiType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class ywe extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

    /* JADX INFO: renamed from: e */
    public Context f200485e;

    /* JADX INFO: renamed from: f */
    public List<EmojiType> f200486f;

    /* JADX INFO: renamed from: g */
    public EmojiType f200487g;

    /* JADX INFO: renamed from: a */
    public int[] f200481a = null;

    /* JADX INFO: renamed from: b */
    public int[] f200482b = null;

    /* JADX INFO: renamed from: c */
    public boolean[] f200483c = null;

    /* JADX INFO: renamed from: d */
    public int f200484d = 0;

    /* JADX INFO: renamed from: h */
    public int f200488h = -1;

    /* JADX INFO: renamed from: l.ywe$a */
    public static class C21563a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public TextView f200489a;

        /* JADX INFO: renamed from: b */
        public View f200490b;

        public C21563a(View view) {
            super(view);
            this.f200490b = view;
            this.f200489a = (TextView) view.findViewById(u4c0.f174268ge);
        }

        /* JADX INFO: renamed from: a */
        public void m216389a(String str) {
            if (str != null) {
                this.f200489a.setText(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.ywe$b */
    public static class C21564b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public View f200491a;

        /* JADX INFO: renamed from: b */
        public View f200492b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f200493c;

        /* JADX INFO: renamed from: d */
        public ImageView f200494d;

        public C21564b(View view) {
            super(view);
            this.f200491a = view;
            this.f200493c = (VDraweeView) view.findViewById(u4c0.f174426q3);
            this.f200492b = view.findViewById(u4c0.f174457s0);
            this.f200494d = (ImageView) view.findViewById(u4c0.f174083Vb);
        }

        /* JADX INFO: renamed from: a */
        public void m216390a(EmojiType emojiType, int i, boolean z) {
            qib0.f154691G.m102331L0(this.f200493c, emojiType.items.get(i).url + ".png");
            View view = this.f200491a;
            if (z) {
                view.setBackgroundResource(x2c0.f190630ur);
                xdl0.m208345M0(this.f200494d, true);
            } else {
                view.setBackgroundColor(-1);
                xdl0.m208345M0(this.f200494d, false);
            }
            if (i / 4 == emojiType.items.size() / 4 || i + 4 >= emojiType.items.size()) {
                this.f200492b.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: l.ywe$c */
    public class C21565c extends RecyclerView.AbstractC0571i {
        public C21565c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            ywe.this.m216388W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int i, int i2) {
            ywe.this.m216388W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeInserted(int i, int i2) {
            ywe.this.m216388W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeMoved(int i, int i2, int i3) {
            ywe.this.m216388W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeRemoved(int i, int i2) {
            ywe.this.m216388W();
        }
    }

    public ywe(Context context) {
        registerAdapterDataObserver(new C21565c());
        this.f200485e = context;
    }

    /* JADX INFO: renamed from: F */
    private LayoutInflater m216365F() {
        return o7r.m163037a(this.f200485e);
    }

    /* JADX INFO: renamed from: A */
    public final void m216368A(int i) {
        this.f200481a = new int[i];
        this.f200482b = new int[i];
        this.f200483c = new boolean[i];
    }

    /* JADX INFO: renamed from: C */
    public final int m216369C() {
        int iM216372G = m216372G();
        int iM216371E = 0;
        for (int i = 0; i < iM216372G; i++) {
            iM216371E += m216371E(i) + 1;
        }
        return iM216371E;
    }

    /* JADX INFO: renamed from: D */
    public List<EmojiType> m216370D(List<EmojiType> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EmojiType emojiType : list) {
                EmojiType emojiType2 = new EmojiType();
                ArrayList arrayList2 = new ArrayList();
                emojiType2.name = emojiType.name;
                for (EmojiItem emojiItem : emojiType.items) {
                    if (emojiItem.available) {
                        arrayList2.add(emojiItem);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    emojiType2.items = arrayList2;
                    arrayList.add(emojiType2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final int m216371E(int i) {
        return this.f200486f.get(i).items.size();
    }

    /* JADX INFO: renamed from: G */
    public final int m216372G() {
        return this.f200486f.size();
    }

    /* JADX INFO: renamed from: H */
    public int m216373H(int i) {
        return -1;
    }

    /* JADX INFO: renamed from: I */
    public int m216374I(int i, int i2) {
        return -2;
    }

    /* JADX INFO: renamed from: J */
    public int m216375J() {
        return this.f200488h;
    }

    /* JADX INFO: renamed from: K */
    public final String m216376K(EmojiCatgoryName emojiCatgoryName) {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        language.getClass();
        switch (language) {
            case "en":
                return emojiCatgoryName.f38739en;
            case "in":
                return emojiCatgoryName.f38740id;
            case "ja":
                return emojiCatgoryName.f38741ja;
            case "ko":
                return emojiCatgoryName.f38742ko;
            case "ru":
                return emojiCatgoryName.f38743ru;
            case "th":
                return emojiCatgoryName.f38744th;
            case "tr":
                return emojiCatgoryName.f38745tr;
            case "vi":
                return emojiCatgoryName.f38746vi;
            case "zh":
                return !"CN".equals(country) ? emojiCatgoryName.zhHant : emojiCatgoryName.zhHans;
            default:
                return emojiCatgoryName.f38739en;
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m216377L(int i) {
        if (this.f200483c == null) {
            m216388W();
        }
        return this.f200483c[i];
    }

    /* JADX INFO: renamed from: M */
    public boolean m216378M(int i) {
        return i == -1;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m216379N(int i, int i2, View view) {
        if (this.f200488h == this.f200486f.get(i).items.get(i2).f38747id) {
            m216387V(-1);
        } else {
            m216387V(this.f200486f.get(i).items.get(i2).f38747id);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m216380O(C21564b c21564b, EmojiType emojiType, final int i, final int i2) {
        if (this.f200488h == this.f200486f.get(i).items.get(i2).f38747id) {
            c21564b.m216390a(emojiType, i2, true);
        } else {
            c21564b.m216390a(emojiType, i2, false);
        }
        c21564b.f200491a.setOnClickListener(new View.OnClickListener() { // from class: l.xwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194727a.m216379N(i, i2, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m216381P(C21563a c21563a, EmojiType emojiType) {
        c21563a.m216389a(m216376K(emojiType.name));
    }

    /* JADX INFO: renamed from: Q */
    public RecyclerView.AbstractC0566d0 m216382Q(ViewGroup viewGroup, int i) {
        return new C21564b(m216365F().inflate(f6c0.f95716c, viewGroup, false));
    }

    /* JADX INFO: renamed from: R */
    public final RecyclerView.AbstractC0566d0 m216383R(ViewGroup viewGroup, int i) {
        return new C21563a(m216365F().inflate(f6c0.f95699b, viewGroup, false));
    }

    /* JADX INFO: renamed from: S */
    public final void m216384S() {
        int iM216372G = m216372G();
        int i = 0;
        for (int i2 = 0; i2 < iM216372G; i2++) {
            m216386U(i, true, i2, 0);
            i++;
            for (int i3 = 0; i3 < m216371E(i2); i3++) {
                m216386U(i, false, i2, i3);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m216385T(List<EmojiType> list) {
        this.f200486f = m216370D(list);
    }

    /* JADX INFO: renamed from: U */
    public final void m216386U(int i, boolean z, int i2, int i3) {
        this.f200483c[i] = z;
        this.f200481a[i] = i2;
        this.f200482b[i] = i3;
    }

    /* JADX INFO: renamed from: V */
    public void m216387V(int i) {
        this.f200488h = i;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: W */
    public final void m216388W() {
        int iM216369C = m216369C();
        this.f200484d = iM216369C;
        m216368A(iM216369C);
        m216384S();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f200484d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f200481a == null) {
            m216388W();
        }
        int i2 = this.f200481a[i];
        return m216377L(i) ? m216373H(i2) : m216374I(i2, this.f200482b[i]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        m216388W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        int i2 = this.f200481a[i];
        int i3 = this.f200482b[i];
        this.f200487g = this.f200486f.get(i2);
        if (m216377L(i)) {
            m216381P((C21563a) abstractC0566d0, this.f200487g);
        } else {
            m216380O((C21564b) abstractC0566d0, this.f200487g, i2, i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m216378M(i) ? m216383R(viewGroup, i) : m216382Q(viewGroup, i);
    }
}
