package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p149l.b5c0;
import p149l.d30;
import p149l.dac0;
import p149l.e51;
import p149l.l80;
import p149l.n0i;
import p149l.o6c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11343a extends dac0<n0i> {

    /* JADX INFO: renamed from: c */
    public List<n0i> f42882c;

    /* JADX INFO: renamed from: d */
    public Context f42883d;

    /* JADX INFO: renamed from: e */
    public l80<n0i> f42884e;

    /* JADX INFO: renamed from: f */
    public FeedStatusSquareTabFrag f42885f;

    /* JADX INFO: renamed from: g */
    public final int f42886g = 1;

    /* JADX INFO: renamed from: h */
    public final int f42887h = 2;

    /* JADX INFO: renamed from: i */
    public final int f42888i = 3;

    /* JADX INFO: renamed from: j */
    public final a f42889j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.a$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo65700b();

        /* JADX INFO: renamed from: c */
        void mo65701c();

        /* JADX INFO: renamed from: d */
        void mo65702d(View view, n0i n0iVar);
    }

    public C11343a(FeedStatusSquareTabFrag feedStatusSquareTabFrag, Context context, List<n0i> list, l80<n0i> l80Var, a aVar) {
        this.f42883d = context;
        this.f42884e = l80Var;
        this.f42882c = list;
        this.f42885f = feedStatusSquareTabFrag;
        this.f42889j = aVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (NullChecker.m81303a(this.f42882c)) {
            return this.f42882c.size();
        }
        return 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return m65709I().inflater().inflate(o6c0.f142254o3, viewGroup, false);
        }
        return i == 3 ? m65709I().inflater().inflate(o6c0.f142279s0, viewGroup, false) : m65709I().inflater().inflate(o6c0.f142058K1, viewGroup, false);
    }

    /* JADX INFO: renamed from: I */
    public final FeedStatusPageAct m65709I() {
        return (FeedStatusPageAct) this.f42883d;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    @Override // p149l.dac0
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final n0i n0iVar, int i, int i2) {
        String str;
        int iM186890d;
        float fM186890d;
        int iM186890d2;
        if (i == 1 || i == 2 || i == 3) {
            if (i == 1) {
                str = n0iVar.f136558b.value;
            } else {
                str = i == 2 ? n0iVar.f136559c.emotion.text : "她喜欢了你,打个招呼吧";
            }
            VText vText = (VText) view.findViewById(b5c0.f73580j2);
            vText.getPaint().setFakeBoldText(true);
            float fMeasureText = vText.getPaint().measureText(str);
            if (fMeasureText <= t100.m186890d(48.0f)) {
                fM186890d = (t100.m186890d(56.0f) * 2) + fMeasureText;
                iM186890d2 = t100.m186890d(0.0f);
            } else {
                if (fMeasureText > t100.m186890d(112.0f)) {
                    if (fMeasureText <= t100.m186890d(144.0f)) {
                        fM186890d = (t100.m186890d(28.0f) * 2) + fMeasureText;
                        iM186890d2 = t100.m186890d(16.0f);
                    } else {
                        iM186890d = (t100.m186890d(28.0f) * 2) + t100.m186890d(144.0f) + t100.m186890d(16.0f);
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = iM186890d;
                    view.setLayoutParams(layoutParams);
                    this.f42884e.m148839h(view, n0iVar, i2);
                    if (i == 1) {
                        ((FeedStateSquareItem) view).m65602k0(n0iVar);
                    } else if (i == 2) {
                        ((FeedSquareVoiceItem) view).m65596j0(n0iVar);
                    } else {
                        ((FeedFakeSquareItem) view).m65591l0(n0iVar);
                    }
                    xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.x1i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f189074a.m65714N(n0iVar, view2);
                        }
                    });
                    view.setOnTouchListener(new View.OnTouchListener() { // from class: l.y1i
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            return this.f195413a.m65715O(view2, motionEvent);
                        }
                    });
                }
                fM186890d = (t100.m186890d(40.0f) * 2) + fMeasureText;
                iM186890d2 = t100.m186890d(0.0f);
            }
            iM186890d = (int) (fM186890d + iM186890d2);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.width = iM186890d;
            view.setLayoutParams(layoutParams2);
            this.f42884e.m148839h(view, n0iVar, i2);
            if (i == 1) {
                ((FeedStateSquareItem) view).m65602k0(n0iVar);
            } else if (i == 2) {
                ((FeedSquareVoiceItem) view).m65596j0(n0iVar);
            } else {
                ((FeedFakeSquareItem) view).m65591l0(n0iVar);
            }
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.x1i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f189074a.m65714N(n0iVar, view2);
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() { // from class: l.y1i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f195413a.m65715O(view2, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public List<n0i> m65711K() {
        return this.f42882c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public n0i getItem(int i) {
        if (vwb.m200296J(this.f42882c)) {
            return null;
        }
        return this.f42882c.get(i);
    }

    /* JADX INFO: renamed from: M */
    public void m65713M() {
        if (vwb.m200296J(this.f42882c)) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f42882c);
        final int size = this.f42882c.size();
        try {
            this.f42882c.addAll(arrayList);
            e51.m114742G(new Runnable() { // from class: l.z1i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f201075a.m65716P(size);
                }
            });
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m65714N(n0i n0iVar, View view) {
        this.f42889j.mo65702d(view, n0iVar);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m65715O(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f42889j.mo65701c();
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m65716P(int i) {
        notifyItemRangeChanged(i, this.f42882c.size());
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m65717Q(List list, d30 d30Var) {
        this.f42882c.addAll(list);
        notifyItemRangeChanged(1, this.f42882c.size());
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: R */
    public void m65718R(final List<n0i> list, boolean z, final d30 d30Var) {
        if (vwb.m200296J(list)) {
            return;
        }
        List<n0i> list2 = this.f42882c;
        if (z) {
            list2.clear();
            notifyDataSetChanged();
            e51.m114743H(m65709I(), new Runnable() { // from class: l.a2i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67262a.m65717Q(list, d30Var);
                }
            }, 200L);
        } else {
            int size = list2.size();
            this.f42882c.addAll(list);
            notifyItemRangeChanged(size, this.f42882c.size());
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f42882c.size() <= 0 || this.f42882c.size() - i >= 6 || this.f42885f.f42853N0) {
            return;
        }
        this.f42889j.mo65700b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (vwb.m200296J(this.f42882c)) {
            return 1;
        }
        return this.f42882c.get(i).f136557a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        abstractC0566d0.getLayoutPosition();
        this.f42884e.m148842o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f42884e.m148842o();
    }
}
