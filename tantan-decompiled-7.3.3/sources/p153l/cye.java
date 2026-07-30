package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.EmojiCatgoryName;
import com.p051p1.mobile.putong.data.EmojiItem;
import com.p051p1.mobile.putong.data.EmojiType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class cye extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

    /* JADX INFO: renamed from: e */
    public Context f84357e;

    /* JADX INFO: renamed from: f */
    public List<EmojiType> f84358f;

    /* JADX INFO: renamed from: g */
    public EmojiType f84359g;

    /* JADX INFO: renamed from: a */
    public int[] f84353a = null;

    /* JADX INFO: renamed from: b */
    public int[] f84354b = null;

    /* JADX INFO: renamed from: c */
    public boolean[] f84355c = null;

    /* JADX INFO: renamed from: d */
    public int f84356d = 0;

    /* JADX INFO: renamed from: h */
    public int f84360h = -1;

    /* JADX INFO: renamed from: l.cye$a */
    public static class C16394a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public TextView f84361a;

        /* JADX INFO: renamed from: b */
        public View f84362b;

        public C16394a(View view) {
            super(view);
            this.f84362b = view;
            this.f84361a = (TextView) view.findViewById(adc0.f70409je);
        }

        /* JADX INFO: renamed from: a */
        public void m113162a(String str) {
            if (str != null) {
                this.f84361a.setText(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.cye$b */
    public static class C16395b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public View f84363a;

        /* JADX INFO: renamed from: b */
        public View f84364b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f84365c;

        /* JADX INFO: renamed from: d */
        public ImageView f84366d;

        public C16395b(View view) {
            super(view);
            this.f84363a = view;
            this.f84365c = (VDraweeView) view.findViewById(adc0.f70551s3);
            this.f84364b = view.findViewById(adc0.f70548s0);
            this.f84366d = (ImageView) view.findViewById(adc0.f70206Xb);
        }

        /* JADX INFO: renamed from: a */
        public void m113163a(EmojiType emojiType, int i, boolean z) {
            uqb0.f180374G.m127115L0(this.f84365c, emojiType.items.get(i).url + ".png");
            View view = this.f84363a;
            if (z) {
                view.setBackgroundResource(dbc0.f87099is);
                bnl0.m105525M0(this.f84366d, true);
            } else {
                view.setBackgroundColor(-1);
                bnl0.m105525M0(this.f84366d, false);
            }
            if (i / 4 == emojiType.items.size() / 4 || i + 4 >= emojiType.items.size()) {
                this.f84364b.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: l.cye$c */
    public class C16396c extends RecyclerView.AbstractC0573i {
        public C16396c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            cye.this.m113161W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int i, int i2) {
            cye.this.m113161W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeInserted(int i, int i2) {
            cye.this.m113161W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeMoved(int i, int i2, int i3) {
            cye.this.m113161W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeRemoved(int i, int i2) {
            cye.this.m113161W();
        }
    }

    public cye(Context context) {
        registerAdapterDataObserver(new C16396c());
        this.f84357e = context;
    }

    /* JADX INFO: renamed from: F */
    private LayoutInflater m113138F() {
        return p9r.m171370a(this.f84357e);
    }

    /* JADX INFO: renamed from: A */
    public final void m113141A(int i) {
        this.f84353a = new int[i];
        this.f84354b = new int[i];
        this.f84355c = new boolean[i];
    }

    /* JADX INFO: renamed from: C */
    public final int m113142C() {
        int iM113145G = m113145G();
        int iM113144E = 0;
        for (int i = 0; i < iM113145G; i++) {
            iM113144E += m113144E(i) + 1;
        }
        return iM113144E;
    }

    /* JADX INFO: renamed from: D */
    public List<EmojiType> m113143D(List<EmojiType> list) {
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
    public final int m113144E(int i) {
        return this.f84358f.get(i).items.size();
    }

    /* JADX INFO: renamed from: G */
    public final int m113145G() {
        return this.f84358f.size();
    }

    /* JADX INFO: renamed from: H */
    public int m113146H(int i) {
        return -1;
    }

    /* JADX INFO: renamed from: I */
    public int m113147I(int i, int i2) {
        return -2;
    }

    /* JADX INFO: renamed from: J */
    public int m113148J() {
        return this.f84360h;
    }

    /* JADX INFO: renamed from: K */
    public final String m113149K(EmojiCatgoryName emojiCatgoryName) {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        language.getClass();
        switch (language) {
            case "en":
                return emojiCatgoryName.f39587en;
            case "in":
                return emojiCatgoryName.f39588id;
            case "ja":
                return emojiCatgoryName.f39589ja;
            case "ko":
                return emojiCatgoryName.f39590ko;
            case "ru":
                return emojiCatgoryName.f39591ru;
            case "th":
                return emojiCatgoryName.f39592th;
            case "tr":
                return emojiCatgoryName.f39593tr;
            case "vi":
                return emojiCatgoryName.f39594vi;
            case "zh":
                return !"CN".equals(country) ? emojiCatgoryName.zhHant : emojiCatgoryName.zhHans;
            default:
                return emojiCatgoryName.f39587en;
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m113150L(int i) {
        if (this.f84355c == null) {
            m113161W();
        }
        return this.f84355c[i];
    }

    /* JADX INFO: renamed from: M */
    public boolean m113151M(int i) {
        return i == -1;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m113152N(int i, int i2, View view) {
        if (this.f84360h == this.f84358f.get(i).items.get(i2).f39595id) {
            m113160V(-1);
        } else {
            m113160V(this.f84358f.get(i).items.get(i2).f39595id);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m113153O(C16395b c16395b, EmojiType emojiType, final int i, final int i2) {
        if (this.f84360h == this.f84358f.get(i).items.get(i2).f39595id) {
            c16395b.m113163a(emojiType, i2, true);
        } else {
            c16395b.m113163a(emojiType, i2, false);
        }
        c16395b.f84363a.setOnClickListener(new View.OnClickListener() { // from class: l.bye
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79009a.m113152N(i, i2, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m113154P(C16394a c16394a, EmojiType emojiType) {
        c16394a.m113162a(m113149K(emojiType.name));
    }

    /* JADX INFO: renamed from: Q */
    public RecyclerView.AbstractC0569e0 m113155Q(ViewGroup viewGroup, int i) {
        return new C16395b(m113138F().inflate(kec0.f125770c, viewGroup, false));
    }

    /* JADX INFO: renamed from: R */
    public final RecyclerView.AbstractC0569e0 m113156R(ViewGroup viewGroup, int i) {
        return new C16394a(m113138F().inflate(kec0.f125753b, viewGroup, false));
    }

    /* JADX INFO: renamed from: S */
    public final void m113157S() {
        int iM113145G = m113145G();
        int i = 0;
        for (int i2 = 0; i2 < iM113145G; i2++) {
            m113159U(i, true, i2, 0);
            i++;
            for (int i3 = 0; i3 < m113144E(i2); i3++) {
                m113159U(i, false, i2, i3);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m113158T(List<EmojiType> list) {
        this.f84358f = m113143D(list);
    }

    /* JADX INFO: renamed from: U */
    public final void m113159U(int i, boolean z, int i2, int i3) {
        this.f84355c[i] = z;
        this.f84353a[i] = i2;
        this.f84354b[i] = i3;
    }

    /* JADX INFO: renamed from: V */
    public void m113160V(int i) {
        this.f84360h = i;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: W */
    public final void m113161W() {
        int iM113142C = m113142C();
        this.f84356d = iM113142C;
        m113141A(iM113142C);
        m113157S();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84356d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f84353a == null) {
            m113161W();
        }
        int i2 = this.f84353a[i];
        return m113150L(i) ? m113146H(i2) : m113147I(i2, this.f84354b[i]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        m113161W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        int i2 = this.f84353a[i];
        int i3 = this.f84354b[i];
        this.f84359g = this.f84358f.get(i2);
        if (m113150L(i)) {
            m113154P((C16394a) abstractC0569e0, this.f84359g);
        } else {
            m113153O((C16395b) abstractC0569e0, this.f84359g, i2, i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m113151M(i) ? m113156R(viewGroup, i) : m113155Q(viewGroup, i);
    }
}
