package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.e51;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.b5c0;
import p007l.l80;
import p007l.n0i;
import p007l.o6c0;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2187a extends dac0<n0i> {

    /* JADX INFO: renamed from: c */
    public List<n0i> f4343c;

    /* JADX INFO: renamed from: d */
    public Context f4344d;

    /* JADX INFO: renamed from: e */
    public l80<n0i> f4345e;

    /* JADX INFO: renamed from: f */
    public FeedStatusSquareTabFrag f4346f;

    /* JADX INFO: renamed from: g */
    public final int f4347g = 1;

    /* JADX INFO: renamed from: h */
    public final int f4348h = 2;

    /* JADX INFO: renamed from: i */
    public final int f4349i = 3;

    /* JADX INFO: renamed from: j */
    public final a f4350j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.a$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo6839b();

        /* JADX INFO: renamed from: c */
        void mo6840c();

        /* JADX INFO: renamed from: d */
        void mo6841d(View view, n0i n0iVar);
    }

    public C2187a(FeedStatusSquareTabFrag feedStatusSquareTabFrag, Context context, List<n0i> list, l80<n0i> l80Var, a aVar) {
        this.f4344d = context;
        this.f4345e = l80Var;
        this.f4343c = list;
        this.f4346f = feedStatusSquareTabFrag;
        this.f4350j = aVar;
    }

    /* JADX INFO: renamed from: C */
    public int m6849C() {
        if (NullChecker.a(this.f4343c)) {
            return this.f4343c.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public View m6850D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return m6851I().inflater().inflate(o6c0.f11273o3, viewGroup, false);
        }
        return i == 3 ? m6851I().inflater().inflate(o6c0.f11298s0, viewGroup, false) : m6851I().inflater().inflate(o6c0.f11077K1, viewGroup, false);
    }

    /* JADX INFO: renamed from: I */
    public final FeedStatusPageAct m6851I() {
        return (FeedStatusPageAct) this.f4344d;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m6848A(View view, final n0i n0iVar, int i, int i2) {
        String str;
        int iD;
        float fD;
        int iD2;
        if (i == 1 || i == 2 || i == 3) {
            if (i == 1) {
                str = n0iVar.f10614b.value;
            } else {
                str = i == 2 ? n0iVar.f10615c.emotion.text : "她喜欢了你,打个招呼吧";
            }
            VText vTextFindViewById = view.findViewById(b5c0.f6061j2);
            vTextFindViewById.getPaint().setFakeBoldText(true);
            float fMeasureText = vTextFindViewById.getPaint().measureText(str);
            if (fMeasureText <= t100.d(48.0f)) {
                fD = (t100.d(56.0f) * 2) + fMeasureText;
                iD2 = t100.d(0.0f);
            } else {
                if (fMeasureText > t100.d(112.0f)) {
                    if (fMeasureText <= t100.d(144.0f)) {
                        fD = (t100.d(28.0f) * 2) + fMeasureText;
                        iD2 = t100.d(16.0f);
                    } else {
                        iD = (t100.d(28.0f) * 2) + t100.d(144.0f) + t100.d(16.0f);
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = iD;
                    view.setLayoutParams(layoutParams);
                    this.f4345e.m11594h(view, n0iVar, i2);
                    if (i == 1) {
                        ((FeedStateSquareItem) view).m6739k0(n0iVar);
                    } else if (i == 2) {
                        ((FeedSquareVoiceItem) view).m6733j0(n0iVar);
                    } else {
                        ((FeedFakeSquareItem) view).m6728l0(n0iVar);
                    }
                    xdl0.E0(view, new View.OnClickListener() { // from class: l.x1i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f14738a.m6856N(n0iVar, view2);
                        }
                    });
                    view.setOnTouchListener(new View.OnTouchListener() { // from class: l.y1i
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            return this.f15202a.m6857O(view2, motionEvent);
                        }
                    });
                }
                fD = (t100.d(40.0f) * 2) + fMeasureText;
                iD2 = t100.d(0.0f);
            }
            iD = (int) (fD + iD2);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.width = iD;
            view.setLayoutParams(layoutParams2);
            this.f4345e.m11594h(view, n0iVar, i2);
            if (i == 1) {
                ((FeedStateSquareItem) view).m6739k0(n0iVar);
            } else if (i == 2) {
                ((FeedSquareVoiceItem) view).m6733j0(n0iVar);
            } else {
                ((FeedFakeSquareItem) view).m6728l0(n0iVar);
            }
            xdl0.E0(view, new View.OnClickListener() { // from class: l.x1i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14738a.m6856N(n0iVar, view2);
                }
            });
            view.setOnTouchListener(new View.OnTouchListener() { // from class: l.y1i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f15202a.m6857O(view2, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public List<n0i> m6853K() {
        return this.f4343c;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public n0i getItem(int i) {
        if (vwb.J(this.f4343c)) {
            return null;
        }
        return this.f4343c.get(i);
    }

    /* JADX INFO: renamed from: M */
    public void m6855M() {
        if (vwb.J(this.f4343c)) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f4343c);
        final int size = this.f4343c.size();
        try {
            this.f4343c.addAll(arrayList);
            e51.G(new Runnable() { // from class: l.z1i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15555a.m6858P(size);
                }
            });
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m6856N(n0i n0iVar, View view) {
        this.f4350j.mo6841d(view, n0iVar);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m6857O(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f4350j.mo6840c();
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m6858P(int i) {
        notifyItemRangeChanged(i, this.f4343c.size());
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m6859Q(List list, d30 d30Var) {
        this.f4343c.addAll(list);
        notifyItemRangeChanged(1, this.f4343c.size());
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: R */
    public void m6860R(final List<n0i> list, boolean z, final d30 d30Var) {
        if (vwb.J(list)) {
            return;
        }
        List<n0i> list2 = this.f4343c;
        if (z) {
            list2.clear();
            notifyDataSetChanged();
            e51.H(m6851I(), new Runnable() { // from class: l.a2i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5557a.m6859Q(list, d30Var);
                }
            }, 200L);
        } else {
            int size = list2.size();
            this.f4343c.addAll(list);
            notifyItemRangeChanged(size, this.f4343c.size());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m6861e(int i) {
        if (this.f4343c.size() <= 0 || this.f4343c.size() - i >= 6 || this.f4346f.f4314N0) {
            return;
        }
        this.f4350j.mo6839b();
    }

    public int getItemViewType(int i) {
        if (vwb.J(this.f4343c)) {
            return 1;
        }
        return this.f4343c.get(i).f10613a;
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        d0Var.getLayoutPosition();
        this.f4345e.m11597o();
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f4345e.m11597o();
    }
}
