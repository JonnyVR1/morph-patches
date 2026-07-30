package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.c2i;
import p153l.h80;
import p153l.hdc0;
import p153l.jic0;
import p153l.jyb;
import p153l.l51;
import p153l.qa00;
import p153l.tec0;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11506a extends jic0<c2i> {

    /* JADX INFO: renamed from: c */
    public List<c2i> f43730c;

    /* JADX INFO: renamed from: d */
    public Context f43731d;

    /* JADX INFO: renamed from: e */
    public h80<c2i> f43732e;

    /* JADX INFO: renamed from: f */
    public FeedStatusSquareTabFrag f43733f;

    /* JADX INFO: renamed from: g */
    public final int f43734g = 1;

    /* JADX INFO: renamed from: h */
    public final int f43735h = 2;

    /* JADX INFO: renamed from: i */
    public final int f43736i = 3;

    /* JADX INFO: renamed from: j */
    public final a f43737j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.a$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo66883b();

        /* JADX INFO: renamed from: c */
        void mo66884c();

        /* JADX INFO: renamed from: d */
        void mo66885d(View view, c2i c2iVar);
    }

    public C11506a(FeedStatusSquareTabFrag feedStatusSquareTabFrag, Context context, List<c2i> list, h80<c2i> h80Var, a aVar) {
        this.f43731d = context;
        this.f43732e = h80Var;
        this.f43730c = list;
        this.f43733f = feedStatusSquareTabFrag;
        this.f43737j = aVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (NullChecker.m82486a(this.f43730c)) {
            return this.f43730c.size();
        }
        return 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return m66892I().inflater().inflate(tec0.f173723o3, viewGroup, false);
        }
        return i == 3 ? m66892I().inflater().inflate(tec0.f173748s0, viewGroup, false) : m66892I().inflater().inflate(tec0.f173527K1, viewGroup, false);
    }

    /* JADX INFO: renamed from: I */
    public final FeedStatusPageAct m66892I() {
        return (FeedStatusPageAct) this.f43731d;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    @Override // p153l.jic0
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final c2i c2iVar, int i, int i2) {
        String str;
        int iM175859d;
        float fM175859d;
        int iM175859d2;
        if (i == 1 || i == 2 || i == 3) {
            if (i == 1) {
                str = c2iVar.f79481b.value;
            } else {
                str = i == 2 ? c2iVar.f79482c.emotion.text : "她喜欢了你,打个招呼吧";
            }
            VText vText = (VText) view.findViewById(hdc0.f108933j2);
            vText.getPaint().setFakeBoldText(true);
            float fMeasureText = vText.getPaint().measureText(str);
            if (fMeasureText <= qa00.m175859d(48.0f)) {
                fM175859d = (qa00.m175859d(56.0f) * 2) + fMeasureText;
                iM175859d2 = qa00.m175859d(0.0f);
            } else {
                if (fMeasureText > qa00.m175859d(112.0f)) {
                    if (fMeasureText <= qa00.m175859d(144.0f)) {
                        fM175859d = (qa00.m175859d(28.0f) * 2) + fMeasureText;
                        iM175859d2 = qa00.m175859d(16.0f);
                    } else {
                        iM175859d = (qa00.m175859d(28.0f) * 2) + qa00.m175859d(144.0f) + qa00.m175859d(16.0f);
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = iM175859d;
                    view.setLayoutParams(layoutParams);
                    this.f43732e.m133881h(view, c2iVar, i2);
                    if (i == 1) {
                        ((FeedStateSquareItem) view).m66785k0(c2iVar);
                    } else if (i == 2) {
                        ((FeedSquareVoiceItem) view).m66779j0(c2iVar);
                    } else {
                        ((FeedFakeSquareItem) view).m66774l0(c2iVar);
                    }
                    bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.m3i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f134668a.m66897N(c2iVar, view2);
                        }
                    });
                    view.setOnTouchListener(new View.OnTouchListener() { // from class: l.n3i
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            return this.f140002a.m66898O(view2, motionEvent);
                        }
                    });
                }
                fM175859d = (qa00.m175859d(40.0f) * 2) + fMeasureText;
                iM175859d2 = qa00.m175859d(0.0f);
            }
            iM175859d = (int) (fM175859d + iM175859d2);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.width = iM175859d;
            view.setLayoutParams(layoutParams2);
            this.f43732e.m133881h(view, c2iVar, i2);
            if (i == 1) {
                ((FeedStateSquareItem) view).m66785k0(c2iVar);
            } else if (i == 2) {
                ((FeedSquareVoiceItem) view).m66779j0(c2iVar);
            } else {
                ((FeedFakeSquareItem) view).m66774l0(c2iVar);
            }
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.m3i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f134668a.m66897N(c2iVar, view2);
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() { // from class: l.n3i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f140002a.m66898O(view2, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public List<c2i> m66894K() {
        return this.f43730c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public c2i getItem(int i) {
        if (jyb.m147479J(this.f43730c)) {
            return null;
        }
        return this.f43730c.get(i);
    }

    /* JADX INFO: renamed from: M */
    public void m66896M() {
        if (jyb.m147479J(this.f43730c)) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f43730c);
        final int size = this.f43730c.size();
        try {
            this.f43730c.addAll(arrayList);
            l51.m152887G(new Runnable() { // from class: l.o3i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144835a.m66899P(size);
                }
            });
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m66897N(c2i c2iVar, View view) {
        this.f43737j.mo66885d(view, c2iVar);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m66898O(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f43737j.mo66884c();
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m66899P(int i) {
        notifyItemRangeChanged(i, this.f43730c.size());
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m66900Q(List list, x20 x20Var) {
        this.f43730c.addAll(list);
        notifyItemRangeChanged(1, this.f43730c.size());
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: R */
    public void m66901R(final List<c2i> list, boolean z, final x20 x20Var) {
        if (jyb.m147479J(list)) {
            return;
        }
        List<c2i> list2 = this.f43730c;
        if (z) {
            list2.clear();
            notifyDataSetChanged();
            l51.m152888H(m66892I(), new Runnable() { // from class: l.p3i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150405a.m66900Q(list, x20Var);
                }
            }, 200L);
        } else {
            int size = list2.size();
            this.f43730c.addAll(list);
            notifyItemRangeChanged(size, this.f43730c.size());
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f43730c.size() <= 0 || this.f43730c.size() - i >= 6 || this.f43733f.f43701N0) {
            return;
        }
        this.f43737j.mo66883b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (jyb.m147479J(this.f43730c)) {
            return 1;
        }
        return this.f43730c.get(i).f79480a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        abstractC0569e0.getLayoutPosition();
        this.f43732e.m133884o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f43732e.m133884o();
    }
}
