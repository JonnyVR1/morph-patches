package com.p000p1.mobile.putong.core.newui.loveletter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.loveletter.C0251a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.e51;
import l.f6c0;
import l.vwb;
import l.w9j;
import p009l.hcw;
import v.VRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0251a extends dac0<b> {

    /* JADX INFO: renamed from: c */
    public final hcw f3191c;

    /* JADX INFO: renamed from: e */
    public Act f3193e;

    /* JADX INFO: renamed from: d */
    public final List<b> f3192d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f3194f = false;

    /* JADX INFO: renamed from: g */
    public final ArrayList<b> f3195g = new ArrayList<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a$a */
    public class a extends RecyclerView.t {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m3692b() {
            C0251a c0251a = C0251a.this;
            c0251a.m3688Q(c0251a.f3195g);
            C0251a.this.f3195g.clear();
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            C0251a c0251a = C0251a.this;
            if (i != 0) {
                c0251a.f3194f = true;
                return;
            }
            c0251a.f3194f = false;
            if (vwb.J(C0251a.this.f3195g)) {
                return;
            }
            C0251a.this.f3193e.runOnUiThread(new Runnable() { // from class: l.ocw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17921a.m3692b();
                }
            });
        }
    }

    public C0251a(hcw hcwVar, VRecyclerView vRecyclerView) {
        this.f3193e = hcwVar.act();
        this.f3191c = hcwVar;
        vRecyclerView.addOnScrollListener(new a());
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ b m3674F(Conversation conversation) {
        return new b(((DbObject) conversation).id);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ b m3677I(Conversation conversation) {
        return new b(((DbObject) conversation).id);
    }

    /* JADX INFO: renamed from: C */
    public int m3681C() {
        return this.f3192d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m3682D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f3193e.inflater().inflate(f6c0.A6, viewGroup, false);
        }
        if (i == 2) {
            return this.f3193e.inflater().inflate(f6c0.C6, viewGroup, false);
        }
        Act act = this.f3193e;
        return i == 3 ? act.inflater().inflate(f6c0.y6, viewGroup, false) : act.inflater().inflate(f6c0.D6, viewGroup, false);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m3680A(View view, b bVar, int i, int i2) {
        if (i == 1) {
            ((LoveLetterMainLayout) view).m3662a(this.f3191c, bVar.f3200d);
            return;
        }
        if (i == 2) {
            ((LoveLetterSearchLayout) view).m3665b(this.f3191c);
            return;
        }
        if (i == 3) {
            ((LoveLetterEmptyLayout) view).m3661b(this.f3191c);
            return;
        }
        ((LoveLetterUserItem) view).m3672g(this, this.f3191c, bVar.f3198b, new e30() { // from class: l.jcw
            public final void call(Object obj) {
                this.f15057a.m3687P((String) obj);
            }
        }, i2);
        if (i2 < this.f3192d.size() - 3 || this.f3192d.size() <= 10) {
            return;
        }
        this.f3191c.mo15582r();
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public b getItem(int i) {
        return this.f3192d.get(i);
    }

    /* JADX INFO: renamed from: N */
    public int m3685N(int i) {
        return getItem(i).f3199c;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m3686O(final String str) {
        b bVar = (b) vwb.r(this.f3192d, new w9j() { // from class: l.ncw
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((C0251a.b) obj).f3198b, str));
            }
        });
        if (NullChecker.a(bVar)) {
            if (this.f3194f) {
                this.f3195g.add(bVar);
            } else {
                this.f3192d.remove(bVar);
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m3687P(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.G(new Runnable() { // from class: l.kcw
            @Override // java.lang.Runnable
            public final void run() {
                this.f15607a.m3686O(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m3688Q(List<b> list) {
        this.f3192d.removeAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m3689R(List<Conversation> list) {
        if (list == null) {
            return;
        }
        this.f3192d.clear();
        this.f3192d.addAll(vwb.Q(list, new w9j() { // from class: l.mcw
            public final Object call(Object obj) {
                return C0251a.m3674F((Conversation) obj);
            }
        }));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public void m3690S(List<Conversation> list, LoveLetterEntryInfo loveLetterEntryInfo) {
        if (list == null) {
            return;
        }
        this.f3192d.clear();
        b bVar = new b(1);
        bVar.f3200d = loveLetterEntryInfo;
        this.f3192d.add(bVar);
        this.f3192d.add(new b(2));
        if (list.size() == 0) {
            this.f3192d.add(new b(3));
        }
        this.f3192d.addAll(vwb.Q(list, new w9j() { // from class: l.lcw
            public final Object call(Object obj) {
                return C0251a.m3677I((Conversation) obj);
            }
        }));
        notifyDataSetChanged();
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        return getItem(i).f3197a;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f3197a;

        /* JADX INFO: renamed from: b */
        public String f3198b;

        /* JADX INFO: renamed from: c */
        public int f3199c;

        /* JADX INFO: renamed from: d */
        public LoveLetterEntryInfo f3200d;

        public b(String str) {
            this.f3199c = 1;
            this.f3198b = str;
            this.f3197a = 0;
        }

        public b(int i) {
            this.f3197a = i;
            this.f3199c = 2;
        }
    }
}
