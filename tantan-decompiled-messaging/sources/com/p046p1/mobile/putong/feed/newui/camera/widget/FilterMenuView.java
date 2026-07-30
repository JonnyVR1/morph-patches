package com.p046p1.mobile.putong.feed.newui.camera.widget;

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
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.b5c0;
import p149l.d30;
import p149l.e30;
import p149l.f30;
import p149l.f3c0;
import p149l.nji;
import p149l.o6c0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xck0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FilterMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f39675a;

    /* JADX INFO: renamed from: b */
    public VImage f39676b;

    /* JADX INFO: renamed from: c */
    public FeedTextSeekBar f39677c;

    /* JADX INFO: renamed from: d */
    public VImage f39678d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f39679e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.Adapter<C11173c> f39680f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f39681g;

    /* JADX INFO: renamed from: h */
    public e30<Integer> f39682h;

    /* JADX INFO: renamed from: i */
    public e30<Float> f39683i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f39684j;

    /* JADX INFO: renamed from: k */
    public f30<MMPresetFilter, Integer> f39685k;

    /* JADX INFO: renamed from: l */
    public d30 f39686l;

    /* JADX INFO: renamed from: m */
    public d30 f39687m;

    /* JADX INFO: renamed from: n */
    public e30<Integer> f39688n;

    /* JADX INFO: renamed from: o */
    public int f39689o;

    /* JADX INFO: renamed from: p */
    public MMPresetFilter f39690p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$a */
    public class C11171a implements FeedTextSeekBar.InterfaceC11170a {
        public C11171a() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: a */
        public void mo61558a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (NullChecker.m81303a(FilterMenuView.this.f39683i)) {
                FilterMenuView.this.f39677c.setText(String.valueOf(i));
                float f = (i * 1.0f) / 100.0f;
                FilterMenuView.this.f39683i.call(Float.valueOf(f));
                if (z) {
                    FilterMenuView filterMenuView = FilterMenuView.this;
                    filterMenuView.m61592s(filterMenuView.f39689o, f);
                }
            }
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: b */
        public void mo61559b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: c */
        public void mo61560c(FeedTextSeekBar feedTextSeekBar) {
            if (NullChecker.m81303a(FilterMenuView.this.f39685k)) {
                FilterMenuView.this.f39685k.call(FilterMenuView.this.f39690p, Integer.valueOf(feedTextSeekBar.getProgress()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$b */
    public class C11172b extends RecyclerView.Adapter<C11173c> {
        public C11172b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C11173c c11173c, int i) {
            MMPresetFilter mMPresetFilter = (MMPresetFilter) FilterMenuView.this.f39681g.get(i);
            if (mMPresetFilter == null) {
                return;
            }
            if ("0".equals(mMPresetFilter.mFilterId)) {
                c11173c.f39694b.setVisibility(8);
                c11173c.f39696d.setVisibility(8);
                int i2 = FilterMenuView.this.f39689o;
                VDraweeView vDraweeView = c11173c.f39695c;
                if (i == i2) {
                    vDraweeView.setActualImageResource(f3c0.f94553k0);
                } else {
                    vDraweeView.setActualImageResource(f3c0.f94545j0);
                }
            } else {
                c11173c.f39694b.setVisibility(0);
                int i3 = FilterMenuView.this.f39689o;
                View view = c11173c.f39696d;
                if (i == i3) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                if (mMPresetFilter.isIconLocal) {
                    qib0.f154691G.m102363i0(c11173c.f39695c, "file://" + mMPresetFilter.getIconUrl());
                } else {
                    qib0.f154691G.m102331L0(c11173c.f39695c, mMPresetFilter.getIconUrl());
                }
            }
            if (i == FilterMenuView.this.f39689o) {
                c11173c.f39693a.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                c11173c.f39693a.setTypeface(Typeface.defaultFromStyle(0));
            }
            c11173c.f39693a.setTextColor(Color.parseColor("#ffffff"));
            c11173c.f39695c.setBackgroundResource(f3c0.f94505e0);
            c11173c.f39693a.setText(mMPresetFilter.getName());
            c11173c.f39694b.setText(String.valueOf((int) (mMPresetFilter.getPercent() * 100.0f)));
            c11173c.f39697e.setOnClickListener(new View.OnClickListener() { // from class: l.mji
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f134135a.m61596z(c11173c, view2);
                }
            });
            c11173c.m61597a(i, getItemCount());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C11173c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C11173c(LayoutInflater.from(viewGroup.getContext()).inflate(o6c0.f142104S, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return FilterMenuView.this.f39681g.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m61596z(C11173c c11173c, View view) {
            FilterMenuView.this.f39688n.call(Integer.valueOf(c11173c.getAdapterPosition()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$c */
    public static class C11173c extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public TextView f39693a;

        /* JADX INFO: renamed from: b */
        public TextView f39694b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f39695c;

        /* JADX INFO: renamed from: d */
        public View f39696d;

        /* JADX INFO: renamed from: e */
        public View f39697e;

        public C11173c(View view) {
            super(view);
            this.f39697e = view;
            this.f39693a = (TextView) view.findViewById(b5c0.f73600q);
            this.f39694b = (TextView) view.findViewById(b5c0.f73606s);
            this.f39695c = (VDraweeView) view.findViewById(b5c0.f73597p);
            this.f39696d = view.findViewById(b5c0.f73603r);
        }

        /* JADX INFO: renamed from: a */
        public void m61597a(int i, int i2) {
            xdl0.m208358V(this.f39697e, t100.m186890d(i == 0 ? 8.0f : 0.0f));
            xdl0.m208359W(this.f39697e, t100.m186890d(i == i2 + (-1) ? 8.0f : 0.0f));
        }
    }

    public FilterMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39681g = new ArrayList();
    }

    /* JADX INFO: renamed from: j */
    public final void m61583j(View view) {
        nji.m159742a(this, view);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final void m61584k() {
        this.f39675a.setOnClickListener(new View.OnClickListener() { // from class: l.hji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108085a.m61585l(view);
            }
        });
        this.f39677c.setMax(100);
        this.f39677c.setProgress(50);
        this.f39677c.setText(String.valueOf(50));
        this.f39677c.setOnSeekBarChangeListener(new C11171a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f39679e.setLayoutManager(linearLayoutManager);
        C11172b c11172b = new C11172b();
        this.f39680f = c11172b;
        this.f39679e.setAdapter(c11172b);
        this.f39688n = xck0.m208120a(300, new e30() { // from class: l.iji
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113548a.m61590q(((Integer) obj).intValue());
            }
        });
        this.f39676b.setOnTouchListener(new View.OnTouchListener() { // from class: l.jji
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f118297a.m61586m(view, motionEvent);
            }
        });
        this.f39678d.setOnClickListener(new View.OnClickListener() { // from class: l.kji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123451a.m61587n(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m61585l(View view) {
        if (NullChecker.m81303a(this.f39686l)) {
            this.f39686l.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m61586m(View view, MotionEvent motionEvent) {
        return m61588o(motionEvent);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m61587n(View view) {
        d30 d30Var = this.f39687m;
        if (d30Var != null) {
            d30Var.call();
        }
        this.f39679e.scrollToPosition(0);
        vwb.m200354z(this.f39681g, new e30() { // from class: l.lji
            @Override // p149l.e30
            public final void call(Object obj) {
                ((MMPresetFilter) obj).mPercent = 0.5f;
            }
        });
        this.f39680f.notifyDataSetChanged();
        m61591r(0, false);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m61588o(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f39684j.call(Boolean.TRUE);
            }
        } else if (NullChecker.m81303a(this.f39684j)) {
            this.f39684j.call(Boolean.FALSE);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61583j(this);
        m61584k();
    }

    /* JADX INFO: renamed from: p */
    public void m61589p() {
        this.f39680f.notifyDataSetChanged();
        this.f39679e.scrollToPosition(this.f39689o);
    }

    /* JADX INFO: renamed from: q */
    public void m61590q(int i) {
        m61591r(i, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m61591r(int i, boolean z) {
        xdl0.m208344M(this.f39677c, false);
        xdl0.m208344M(this.f39676b, false);
        if (i < 0 || i >= this.f39681g.size()) {
            return;
        }
        boolean z2 = i != 0 || TextUtils.isEmpty(this.f39681g.get(i).getIconUrl());
        xdl0.m208344M(this.f39677c, z2);
        xdl0.m208344M(this.f39676b, z2);
        int i2 = this.f39689o;
        if (i2 == i) {
            return;
        }
        this.f39689o = i;
        this.f39690p = this.f39681g.get(i);
        this.f39680f.notifyItemChanged(i2);
        this.f39680f.notifyItemChanged(this.f39689o);
        if (NullChecker.m81303a(this.f39682h) && z) {
            this.f39682h.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m61592s(int i, float f) {
        this.f39681g.get(i).mPercent = f;
        this.f39680f.notifyItemChanged(i, 0);
    }

    public void setCompareClickCallback(e30<Boolean> e30Var) {
        this.f39684j = e30Var;
    }

    public void setFilterData(List<MMPresetFilter> list) {
        this.f39681g = list;
        this.f39680f.notifyDataSetChanged();
    }

    public void setIntensityChangedCallback(e30<Float> e30Var) {
        this.f39683i = e30Var;
    }

    public void setIntensityChooseCallback(f30<MMPresetFilter, Integer> f30Var) {
        this.f39685k = f30Var;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f39686l = d30Var;
    }

    public void setOnItemClickCallback(e30<Integer> e30Var) {
        this.f39682h = e30Var;
    }

    public void setOnResetCallback(d30 d30Var) {
        this.f39687m = d30Var;
    }

    public FilterMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterMenuView(Context context) {
        this(context, null);
    }
}
