package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.f30;
import l.qib0;
import l.t100;
import l.vwb;
import l.xck0;
import l.xdl0;
import p007l.b5c0;
import p007l.f3c0;
import p007l.nji;
import p007l.o6c0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FilterMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f1136a;

    /* JADX INFO: renamed from: b */
    public VImage f1137b;

    /* JADX INFO: renamed from: c */
    public FeedTextSeekBar f1138c;

    /* JADX INFO: renamed from: d */
    public VImage f1139d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f1140e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.Adapter<C2017c> f1141f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f1142g;

    /* JADX INFO: renamed from: h */
    public e30<Integer> f1143h;

    /* JADX INFO: renamed from: i */
    public e30<Float> f1144i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f1145j;

    /* JADX INFO: renamed from: k */
    public f30<MMPresetFilter, Integer> f1146k;

    /* JADX INFO: renamed from: l */
    public d30 f1147l;

    /* JADX INFO: renamed from: m */
    public d30 f1148m;

    /* JADX INFO: renamed from: n */
    public e30<Integer> f1149n;

    /* JADX INFO: renamed from: o */
    public int f1150o;

    /* JADX INFO: renamed from: p */
    public MMPresetFilter f1151p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$a */
    public class C2015a implements FeedTextSeekBar.InterfaceC2014a {
        public C2015a() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: a */
        public void mo2510a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (NullChecker.a(FilterMenuView.this.f1144i)) {
                FilterMenuView.this.f1138c.setText(String.valueOf(i));
                float f = (i * 1.0f) / 100.0f;
                FilterMenuView.this.f1144i.call(Float.valueOf(f));
                if (z) {
                    FilterMenuView filterMenuView = FilterMenuView.this;
                    filterMenuView.m2544s(filterMenuView.f1150o, f);
                }
            }
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: b */
        public void mo2511b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: c */
        public void mo2512c(FeedTextSeekBar feedTextSeekBar) {
            if (NullChecker.a(FilterMenuView.this.f1146k)) {
                FilterMenuView.this.f1146k.call(FilterMenuView.this.f1151p, Integer.valueOf(feedTextSeekBar.getProgress()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$b */
    public class C2016b extends RecyclerView.Adapter<C2017c> {
        public C2016b() {
        }

        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C2017c c2017c, int i) {
            MMPresetFilter mMPresetFilter = (MMPresetFilter) FilterMenuView.this.f1142g.get(i);
            if (mMPresetFilter == null) {
                return;
            }
            if ("0".equals(mMPresetFilter.mFilterId)) {
                c2017c.f1155b.setVisibility(8);
                c2017c.f1157d.setVisibility(8);
                int i2 = FilterMenuView.this.f1150o;
                VDraweeView vDraweeView = c2017c.f1156c;
                if (i == i2) {
                    vDraweeView.setActualImageResource(f3c0.f7836k0);
                } else {
                    vDraweeView.setActualImageResource(f3c0.f7828j0);
                }
            } else {
                c2017c.f1155b.setVisibility(0);
                int i3 = FilterMenuView.this.f1150o;
                View view = c2017c.f1157d;
                if (i == i3) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                if (mMPresetFilter.isIconLocal) {
                    qib0.G.i0(c2017c.f1156c, "file://" + mMPresetFilter.getIconUrl());
                } else {
                    qib0.G.L0(c2017c.f1156c, mMPresetFilter.getIconUrl());
                }
            }
            if (i == FilterMenuView.this.f1150o) {
                c2017c.f1154a.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                c2017c.f1154a.setTypeface(Typeface.defaultFromStyle(0));
            }
            c2017c.f1154a.setTextColor(Color.parseColor("#ffffff"));
            c2017c.f1156c.setBackgroundResource(f3c0.f7788e0);
            c2017c.f1154a.setText(mMPresetFilter.getName());
            c2017c.f1155b.setText(String.valueOf((int) (mMPresetFilter.getPercent() * 100.0f)));
            c2017c.f1158e.setOnClickListener(new View.OnClickListener() { // from class: l.mji
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10480a.m2548z(c2017c, view2);
                }
            });
            c2017c.m2549a(i, getItemCount());
        }

        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C2017c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C2017c(LayoutInflater.from(viewGroup.getContext()).inflate(o6c0.f11123S, viewGroup, false));
        }

        public int getItemCount() {
            return FilterMenuView.this.f1142g.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m2548z(C2017c c2017c, View view) {
            FilterMenuView.this.f1149n.call(Integer.valueOf(c2017c.getAdapterPosition()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$c */
    public static class C2017c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public TextView f1154a;

        /* JADX INFO: renamed from: b */
        public TextView f1155b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f1156c;

        /* JADX INFO: renamed from: d */
        public View f1157d;

        /* JADX INFO: renamed from: e */
        public View f1158e;

        public C2017c(View view) {
            super(view);
            this.f1158e = view;
            this.f1154a = (TextView) view.findViewById(b5c0.f6081q);
            this.f1155b = (TextView) view.findViewById(b5c0.f6087s);
            this.f1156c = view.findViewById(b5c0.f6078p);
            this.f1157d = view.findViewById(b5c0.f6084r);
        }

        /* JADX INFO: renamed from: a */
        public void m2549a(int i, int i2) {
            xdl0.V(this.f1158e, t100.d(i == 0 ? 8.0f : 0.0f));
            xdl0.W(this.f1158e, t100.d(i == i2 + (-1) ? 8.0f : 0.0f));
        }
    }

    public FilterMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1142g = new ArrayList();
    }

    /* JADX INFO: renamed from: j */
    public final void m2535j(View view) {
        nji.m12198a(this, view);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final void m2536k() {
        this.f1136a.setOnClickListener(new View.OnClickListener() { // from class: l.hji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8748a.m2537l(view);
            }
        });
        this.f1138c.setMax(100);
        this.f1138c.setProgress(50);
        this.f1138c.setText(String.valueOf(50));
        this.f1138c.setOnSeekBarChangeListener(new C2015a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f1140e.setLayoutManager(linearLayoutManager);
        C2016b c2016b = new C2016b();
        this.f1141f = c2016b;
        this.f1140e.setAdapter(c2016b);
        this.f1149n = xck0.a(GivenGiftBrief.LUXURY_GIFT_LEVEL, new e30() { // from class: l.iji
            public final void call(Object obj) {
                this.f9041a.m2542q(((Integer) obj).intValue());
            }
        });
        this.f1137b.setOnTouchListener(new View.OnTouchListener() { // from class: l.jji
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f9376a.m2538m(view, motionEvent);
            }
        });
        this.f1139d.setOnClickListener(new View.OnClickListener() { // from class: l.kji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9729a.m2539n(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2537l(View view) {
        if (NullChecker.a(this.f1147l)) {
            this.f1147l.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m2538m(View view, MotionEvent motionEvent) {
        return m2540o(motionEvent);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2539n(View view) {
        d30 d30Var = this.f1148m;
        if (d30Var != null) {
            d30Var.call();
        }
        this.f1140e.scrollToPosition(0);
        vwb.z(this.f1142g, new e30() { // from class: l.lji
            public final void call(Object obj) {
                ((MMPresetFilter) obj).mPercent = 0.5f;
            }
        });
        this.f1141f.notifyDataSetChanged();
        m2543r(0, false);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2540o(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f1145j.call(Boolean.TRUE);
            }
        } else if (NullChecker.a(this.f1145j)) {
            this.f1145j.call(Boolean.FALSE);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2535j(this);
        m2536k();
    }

    /* JADX INFO: renamed from: p */
    public void m2541p() {
        this.f1141f.notifyDataSetChanged();
        this.f1140e.scrollToPosition(this.f1150o);
    }

    /* JADX INFO: renamed from: q */
    public void m2542q(int i) {
        m2543r(i, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m2543r(int i, boolean z) {
        xdl0.M(this.f1138c, false);
        xdl0.M(this.f1137b, false);
        if (i < 0 || i >= this.f1142g.size()) {
            return;
        }
        boolean z2 = i != 0 || TextUtils.isEmpty(this.f1142g.get(i).getIconUrl());
        xdl0.M(this.f1138c, z2);
        xdl0.M(this.f1137b, z2);
        int i2 = this.f1150o;
        if (i2 == i) {
            return;
        }
        this.f1150o = i;
        this.f1151p = this.f1142g.get(i);
        this.f1141f.notifyItemChanged(i2);
        this.f1141f.notifyItemChanged(this.f1150o);
        if (NullChecker.a(this.f1143h) && z) {
            this.f1143h.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m2544s(int i, float f) {
        this.f1142g.get(i).mPercent = f;
        this.f1141f.notifyItemChanged(i, 0);
    }

    public void setCompareClickCallback(e30<Boolean> e30Var) {
        this.f1145j = e30Var;
    }

    public void setFilterData(List<MMPresetFilter> list) {
        this.f1142g = list;
        this.f1141f.notifyDataSetChanged();
    }

    public void setIntensityChangedCallback(e30<Float> e30Var) {
        this.f1144i = e30Var;
    }

    public void setIntensityChooseCallback(f30<MMPresetFilter, Integer> f30Var) {
        this.f1146k = f30Var;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f1147l = d30Var;
    }

    public void setOnItemClickCallback(e30<Integer> e30Var) {
        this.f1143h = e30Var;
    }

    public void setOnResetCallback(d30 d30Var) {
        this.f1148m = d30Var;
    }

    public FilterMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterMenuView(Context context) {
        this(context, null);
    }
}
