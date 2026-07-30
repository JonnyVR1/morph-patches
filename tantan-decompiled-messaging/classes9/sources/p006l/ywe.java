package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.data.EmojiCatgoryName;
import com.p1.mobile.putong.data.EmojiItem;
import com.p1.mobile.putong.data.EmojiType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.o7r;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ywe extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: e */
    public Context f28441e;

    /* JADX INFO: renamed from: f */
    public List<EmojiType> f28442f;

    /* JADX INFO: renamed from: g */
    public EmojiType f28443g;

    /* JADX INFO: renamed from: a */
    public int[] f28437a = null;

    /* JADX INFO: renamed from: b */
    public int[] f28438b = null;

    /* JADX INFO: renamed from: c */
    public boolean[] f28439c = null;

    /* JADX INFO: renamed from: d */
    public int f28440d = 0;

    /* JADX INFO: renamed from: h */
    public int f28444h = -1;

    /* JADX INFO: renamed from: l.ywe$a */
    public static class C1498a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public TextView f28445a;

        /* JADX INFO: renamed from: b */
        public View f28446b;

        public C1498a(View view) {
            super(view);
            this.f28446b = view;
            this.f28445a = (TextView) view.findViewById(u4c0.f23016ge);
        }

        /* JADX INFO: renamed from: a */
        public void m28445a(String str) {
            if (str != null) {
                this.f28445a.setText(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.ywe$b */
    public static class C1499b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public View f28447a;

        /* JADX INFO: renamed from: b */
        public View f28448b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f28449c;

        /* JADX INFO: renamed from: d */
        public ImageView f28450d;

        public C1499b(View view) {
            super(view);
            this.f28447a = view;
            this.f28449c = view.findViewById(u4c0.f23174q3);
            this.f28448b = view.findViewById(u4c0.f23205s0);
            this.f28450d = (ImageView) view.findViewById(u4c0.f22831Vb);
        }

        /* JADX INFO: renamed from: a */
        public void m28446a(EmojiType emojiType, int i, boolean z) {
            qib0.f19782G.m12744L0(this.f28449c, ((EmojiItem) emojiType.items.get(i)).url + ".png");
            View view = this.f28447a;
            if (z) {
                view.setBackgroundResource(x2c0.f27166ur);
                xdl0.M0(this.f28450d, true);
            } else {
                view.setBackgroundColor(-1);
                xdl0.M0(this.f28450d, false);
            }
            if (i / 4 == emojiType.items.size() / 4 || i + 4 >= emojiType.items.size()) {
                this.f28448b.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: l.ywe$c */
    public class C1500c extends RecyclerView.i {
        public C1500c() {
        }

        public void onChanged() {
            ywe.this.m28444W();
        }

        public void onItemRangeChanged(int i, int i2) {
            ywe.this.m28444W();
        }

        public void onItemRangeInserted(int i, int i2) {
            ywe.this.m28444W();
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            ywe.this.m28444W();
        }

        public void onItemRangeRemoved(int i, int i2) {
            ywe.this.m28444W();
        }
    }

    public ywe(Context context) {
        registerAdapterDataObserver(new C1500c());
        this.f28441e = context;
    }

    /* JADX INFO: renamed from: F */
    private LayoutInflater m28421F() {
        return o7r.a(this.f28441e);
    }

    /* JADX INFO: renamed from: A */
    public final void m28424A(int i) {
        this.f28437a = new int[i];
        this.f28438b = new int[i];
        this.f28439c = new boolean[i];
    }

    /* JADX INFO: renamed from: C */
    public final int m28425C() {
        int iM28428G = m28428G();
        int iM28427E = 0;
        for (int i = 0; i < iM28428G; i++) {
            iM28427E += m28427E(i) + 1;
        }
        return iM28427E;
    }

    /* JADX INFO: renamed from: D */
    public List<EmojiType> m28426D(List<EmojiType> list) {
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
    public final int m28427E(int i) {
        return this.f28442f.get(i).items.size();
    }

    /* JADX INFO: renamed from: G */
    public final int m28428G() {
        return this.f28442f.size();
    }

    /* JADX INFO: renamed from: H */
    public int m28429H(int i) {
        return -1;
    }

    /* JADX INFO: renamed from: I */
    public int m28430I(int i, int i2) {
        return -2;
    }

    /* JADX INFO: renamed from: J */
    public int m28431J() {
        return this.f28444h;
    }

    /* JADX INFO: renamed from: K */
    public final String m28432K(EmojiCatgoryName emojiCatgoryName) {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        language.getClass();
        switch (language) {
            case "en":
                return emojiCatgoryName.en;
            case "in":
                return emojiCatgoryName.id;
            case "ja":
                return emojiCatgoryName.ja;
            case "ko":
                return emojiCatgoryName.ko;
            case "ru":
                return emojiCatgoryName.ru;
            case "th":
                return emojiCatgoryName.th;
            case "tr":
                return emojiCatgoryName.tr;
            case "vi":
                return emojiCatgoryName.vi;
            case "zh":
                return !"CN".equals(country) ? emojiCatgoryName.zhHant : emojiCatgoryName.zhHans;
            default:
                return emojiCatgoryName.en;
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m28433L(int i) {
        if (this.f28439c == null) {
            m28444W();
        }
        return this.f28439c[i];
    }

    /* JADX INFO: renamed from: M */
    public boolean m28434M(int i) {
        return i == -1;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m28435N(int i, int i2, View view) {
        if (this.f28444h == ((EmojiItem) this.f28442f.get(i).items.get(i2)).id) {
            m28443V(-1);
        } else {
            m28443V(((EmojiItem) this.f28442f.get(i).items.get(i2)).id);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m28436O(C1499b c1499b, EmojiType emojiType, final int i, final int i2) {
        if (this.f28444h == ((EmojiItem) this.f28442f.get(i).items.get(i2)).id) {
            c1499b.m28446a(emojiType, i2, true);
        } else {
            c1499b.m28446a(emojiType, i2, false);
        }
        c1499b.f28447a.setOnClickListener(new View.OnClickListener() { // from class: l.xwe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27759a.m28435N(i, i2, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m28437P(C1498a c1498a, EmojiType emojiType) {
        c1498a.m28445a(m28432K(emojiType.name));
    }

    /* JADX INFO: renamed from: Q */
    public RecyclerView.d0 m28438Q(ViewGroup viewGroup, int i) {
        return new C1499b(m28421F().inflate(f6c0.f12130c, viewGroup, false));
    }

    /* JADX INFO: renamed from: R */
    public final RecyclerView.d0 m28439R(ViewGroup viewGroup, int i) {
        return new C1498a(m28421F().inflate(f6c0.f12113b, viewGroup, false));
    }

    /* JADX INFO: renamed from: S */
    public final void m28440S() {
        int iM28428G = m28428G();
        int i = 0;
        for (int i2 = 0; i2 < iM28428G; i2++) {
            m28442U(i, true, i2, 0);
            i++;
            for (int i3 = 0; i3 < m28427E(i2); i3++) {
                m28442U(i, false, i2, i3);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void m28441T(List<EmojiType> list) {
        this.f28442f = m28426D(list);
    }

    /* JADX INFO: renamed from: U */
    public final void m28442U(int i, boolean z, int i2, int i3) {
        this.f28439c[i] = z;
        this.f28437a[i] = i2;
        this.f28438b[i] = i3;
    }

    /* JADX INFO: renamed from: V */
    public void m28443V(int i) {
        this.f28444h = i;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: W */
    public final void m28444W() {
        int iM28425C = m28425C();
        this.f28440d = iM28425C;
        m28424A(iM28425C);
        m28440S();
    }

    public int getItemCount() {
        return this.f28440d;
    }

    public int getItemViewType(int i) {
        if (this.f28437a == null) {
            m28444W();
        }
        int i2 = this.f28437a[i];
        return m28433L(i) ? m28429H(i2) : m28430I(i2, this.f28438b[i]);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        m28444W();
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        int i2 = this.f28437a[i];
        int i3 = this.f28438b[i];
        this.f28443g = this.f28442f.get(i2);
        if (m28433L(i)) {
            m28437P((C1498a) d0Var, this.f28443g);
        } else {
            m28436O((C1499b) d0Var, this.f28443g, i2, i3);
        }
    }

    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m28434M(i) ? m28439R(viewGroup, i) : m28438Q(viewGroup, i);
    }
}
