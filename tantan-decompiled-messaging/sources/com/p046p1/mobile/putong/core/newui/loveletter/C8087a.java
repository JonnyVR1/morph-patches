package com.p046p1.mobile.putong.core.newui.loveletter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.newui.loveletter.C8087a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;
import p149l.dac0;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.hcw;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8087a extends dac0<b> {

    /* JADX INFO: renamed from: c */
    public final hcw f24413c;

    /* JADX INFO: renamed from: e */
    public Act f24415e;

    /* JADX INFO: renamed from: d */
    public final List<b> f24414d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f24416f = false;

    /* JADX INFO: renamed from: g */
    public final ArrayList<b> f24417g = new ArrayList<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a$a */
    public class a extends RecyclerView.AbstractC0582t {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m39618b() {
            C8087a c8087a = C8087a.this;
            c8087a.m39614Q(c8087a.f24417g);
            C8087a.this.f24417g.clear();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            C8087a c8087a = C8087a.this;
            if (i != 0) {
                c8087a.f24416f = true;
                return;
            }
            c8087a.f24416f = false;
            if (vwb.m200296J(C8087a.this.f24417g)) {
                return;
            }
            C8087a.this.f24415e.runOnUiThread(new Runnable() { // from class: l.ocw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143130a.m39618b();
                }
            });
        }
    }

    public C8087a(hcw hcwVar, VRecyclerView vRecyclerView) {
        this.f24415e = hcwVar.act();
        this.f24413c = hcwVar;
        vRecyclerView.addOnScrollListener(new a());
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ b m39603F(Conversation conversation) {
        return new b(conversation.f56011id);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ b m39606I(Conversation conversation) {
        return new b(conversation.f56011id);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f24414d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f24415e.inflater().inflate(f6c0.f95273A6, viewGroup, false);
        }
        if (i == 2) {
            return this.f24415e.inflater().inflate(f6c0.f95305C6, viewGroup, false);
        }
        Act act = this.f24415e;
        return i == 3 ? act.inflater().inflate(f6c0.f96096y6, viewGroup, false) : act.inflater().inflate(f6c0.f95321D6, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, b bVar, int i, int i2) {
        if (i == 1) {
            ((LoveLetterMainLayout) view).m39591a(this.f24413c, bVar.f24422d);
            return;
        }
        if (i == 2) {
            ((LoveLetterSearchLayout) view).m39594b(this.f24413c);
            return;
        }
        if (i == 3) {
            ((LoveLetterEmptyLayout) view).m39590b(this.f24413c);
            return;
        }
        ((LoveLetterUserItem) view).m39601g(this, this.f24413c, bVar.f24420b, new e30() { // from class: l.jcw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117348a.m39613P((String) obj);
            }
        }, i2);
        if (i2 < this.f24414d.size() - 3 || this.f24414d.size() <= 10) {
            return;
        }
        this.f24413c.mo130522r();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public b getItem(int i) {
        return this.f24414d.get(i);
    }

    /* JADX INFO: renamed from: N */
    public int m39611N(int i) {
        return getItem(i).f24421c;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m39612O(final String str) {
        b bVar = (b) vwb.m200346r(this.f24414d, new w9j() { // from class: l.ncw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((C8087a.b) obj).f24420b, str));
            }
        });
        if (NullChecker.m81303a(bVar)) {
            if (this.f24416f) {
                this.f24417g.add(bVar);
            } else {
                this.f24414d.remove(bVar);
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m39613P(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.kcw
            @Override // java.lang.Runnable
            public final void run() {
                this.f122514a.m39612O(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m39614Q(List<b> list) {
        this.f24414d.removeAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m39615R(List<Conversation> list) {
        if (list == null) {
            return;
        }
        this.f24414d.clear();
        this.f24414d.addAll(vwb.m200303Q(list, new w9j() { // from class: l.mcw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8087a.m39603F((Conversation) obj);
            }
        }));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: S */
    public void m39616S(List<Conversation> list, LoveLetterEntryInfo loveLetterEntryInfo) {
        if (list == null) {
            return;
        }
        this.f24414d.clear();
        b bVar = new b(1);
        bVar.f24422d = loveLetterEntryInfo;
        this.f24414d.add(bVar);
        this.f24414d.add(new b(2));
        if (list.size() == 0) {
            this.f24414d.add(new b(3));
        }
        this.f24414d.addAll(vwb.m200303Q(list, new w9j() { // from class: l.lcw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8087a.m39606I((Conversation) obj);
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
        return getItem(i).f24419a;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f24419a;

        /* JADX INFO: renamed from: b */
        public String f24420b;

        /* JADX INFO: renamed from: c */
        public int f24421c;

        /* JADX INFO: renamed from: d */
        public LoveLetterEntryInfo f24422d;

        public b(String str) {
            this.f24421c = 1;
            this.f24420b = str;
            this.f24419a = 0;
        }

        public b(int i) {
            this.f24419a = i;
            this.f24421c = 2;
        }
    }
}
