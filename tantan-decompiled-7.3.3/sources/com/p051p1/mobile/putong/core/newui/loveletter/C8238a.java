package com.p051p1.mobile.putong.core.newui.loveletter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.newui.loveletter.C8238a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;
import p153l.few;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.l51;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8238a extends jic0<b> {

    /* JADX INFO: renamed from: c */
    public final few f25155c;

    /* JADX INFO: renamed from: e */
    public Act f25157e;

    /* JADX INFO: renamed from: d */
    public final List<b> f25156d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f25158f = false;

    /* JADX INFO: renamed from: g */
    public final ArrayList<b> f25159g = new ArrayList<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a$a */
    public class a extends RecyclerView.AbstractC0584t {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m40621b() {
            C8238a c8238a = C8238a.this;
            c8238a.m40617Q(c8238a.f25159g);
            C8238a.this.f25159g.clear();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            C8238a c8238a = C8238a.this;
            if (i != 0) {
                c8238a.f25158f = true;
                return;
            }
            c8238a.f25158f = false;
            if (jyb.m147479J(C8238a.this.f25159g)) {
                return;
            }
            C8238a.this.f25157e.runOnUiThread(new Runnable() { // from class: l.mew
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136576a.m40621b();
                }
            });
        }
    }

    public C8238a(few fewVar, VRecyclerView vRecyclerView) {
        this.f25157e = fewVar.act();
        this.f25155c = fewVar;
        vRecyclerView.addOnScrollListener(new a());
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ b m40606F(Conversation conversation) {
        return new b(conversation.f56859id);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ b m40609I(Conversation conversation) {
        return new b(conversation.f56859id);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f25156d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f25157e.inflater().inflate(kec0.f125339B6, viewGroup, false);
        }
        if (i == 2) {
            return this.f25157e.inflater().inflate(kec0.f125373D6, viewGroup, false);
        }
        Act act = this.f25157e;
        return i == 3 ? act.inflater().inflate(kec0.f126167z6, viewGroup, false) : act.inflater().inflate(kec0.f125390E6, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, b bVar, int i, int i2) {
        if (i == 1) {
            ((LoveLetterMainLayout) view).m40594a(this.f25155c, bVar.f25164d);
            return;
        }
        if (i == 2) {
            ((LoveLetterSearchLayout) view).m40597b(this.f25155c);
            return;
        }
        if (i == 3) {
            ((LoveLetterEmptyLayout) view).m40593b(this.f25155c);
            return;
        }
        ((LoveLetterUserItem) view).m40604g(this, this.f25155c, bVar.f25162b, new y20() { // from class: l.hew
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109190a.m40616P((String) obj);
            }
        }, i2);
        if (i2 < this.f25156d.size() - 3 || this.f25156d.size() <= 10) {
            return;
        }
        this.f25155c.mo125337r();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public b getItem(int i) {
        return this.f25156d.get(i);
    }

    /* JADX INFO: renamed from: N */
    public int m40614N(int i) {
        return getItem(i).f25163c;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m40615O(final String str) {
        b bVar = (b) jyb.m147529r(this.f25156d, new qcj() { // from class: l.lew
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((C8238a.b) obj).f25162b, str));
            }
        });
        if (NullChecker.m82486a(bVar)) {
            if (this.f25158f) {
                this.f25159g.add(bVar);
            } else {
                this.f25156d.remove(bVar);
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m40616P(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.iew
            @Override // java.lang.Runnable
            public final void run() {
                this.f114632a.m40615O(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m40617Q(List<b> list) {
        this.f25156d.removeAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m40618R(List<Conversation> list) {
        if (list == null) {
            return;
        }
        this.f25156d.clear();
        this.f25156d.addAll(jyb.m147486Q(list, new qcj() { // from class: l.kew
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8238a.m40606F((Conversation) obj);
            }
        }));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public void m40619S(List<Conversation> list, LoveLetterEntryInfo loveLetterEntryInfo) {
        if (list == null) {
            return;
        }
        this.f25156d.clear();
        b bVar = new b(1);
        bVar.f25164d = loveLetterEntryInfo;
        this.f25156d.add(bVar);
        this.f25156d.add(new b(2));
        if (list.size() == 0) {
            this.f25156d.add(new b(3));
        }
        this.f25156d.addAll(jyb.m147486Q(list, new qcj() { // from class: l.jew
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8238a.m40609I((Conversation) obj);
            }
        }));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).f25161a;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f25161a;

        /* JADX INFO: renamed from: b */
        public String f25162b;

        /* JADX INFO: renamed from: c */
        public int f25163c;

        /* JADX INFO: renamed from: d */
        public LoveLetterEntryInfo f25164d;

        public b(String str) {
            this.f25163c = 1;
            this.f25162b = str;
            this.f25161a = 0;
        }

        public b(int i) {
            this.f25161a = i;
            this.f25163c = 2;
        }
    }
}
