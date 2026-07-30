package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.dmk0;
import p153l.hdc0;
import p153l.jmi;
import p153l.jyb;
import p153l.lbc0;
import p153l.qa00;
import p153l.tec0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes13.dex */
public class FilterMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f40523a;

    /* JADX INFO: renamed from: b */
    public VImage f40524b;

    /* JADX INFO: renamed from: c */
    public FeedTextSeekBar f40525c;

    /* JADX INFO: renamed from: d */
    public VImage f40526d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f40527e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.Adapter<C11336c> f40528f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f40529g;

    /* JADX INFO: renamed from: h */
    public y20<Integer> f40530h;

    /* JADX INFO: renamed from: i */
    public y20<Float> f40531i;

    /* JADX INFO: renamed from: j */
    public y20<Boolean> f40532j;

    /* JADX INFO: renamed from: k */
    public z20<MMPresetFilter, Integer> f40533k;

    /* JADX INFO: renamed from: l */
    public x20 f40534l;

    /* JADX INFO: renamed from: m */
    public x20 f40535m;

    /* JADX INFO: renamed from: n */
    public y20<Integer> f40536n;

    /* JADX INFO: renamed from: o */
    public int f40537o;

    /* JADX INFO: renamed from: p */
    public MMPresetFilter f40538p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$a */
    public class C11334a implements FeedTextSeekBar.InterfaceC11333a {
        public C11334a() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: a */
        public void mo62742a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (NullChecker.m82486a(FilterMenuView.this.f40531i)) {
                FilterMenuView.this.f40525c.setText(String.valueOf(i));
                float f = (i * 1.0f) / 100.0f;
                FilterMenuView.this.f40531i.call(Float.valueOf(f));
                if (z) {
                    FilterMenuView filterMenuView = FilterMenuView.this;
                    filterMenuView.m62776s(filterMenuView.f40537o, f);
                }
            }
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: b */
        public void mo62743b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: c */
        public void mo62744c(FeedTextSeekBar feedTextSeekBar) {
            if (NullChecker.m82486a(FilterMenuView.this.f40533k)) {
                FilterMenuView.this.f40533k.call(FilterMenuView.this.f40538p, Integer.valueOf(feedTextSeekBar.getProgress()));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$b */
    public class C11335b extends RecyclerView.Adapter<C11336c> {
        public C11335b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C11336c c11336c, int i) {
            MMPresetFilter mMPresetFilter = (MMPresetFilter) FilterMenuView.this.f40529g.get(i);
            if (mMPresetFilter == null) {
                return;
            }
            if ("0".equals(mMPresetFilter.mFilterId)) {
                c11336c.f40542b.setVisibility(8);
                c11336c.f40544d.setVisibility(8);
                int i2 = FilterMenuView.this.f40537o;
                VDraweeView vDraweeView = c11336c.f40543c;
                if (i == i2) {
                    vDraweeView.setActualImageResource(lbc0.f131071k0);
                } else {
                    vDraweeView.setActualImageResource(lbc0.f131063j0);
                }
            } else {
                c11336c.f40542b.setVisibility(0);
                int i3 = FilterMenuView.this.f40537o;
                View view = c11336c.f40544d;
                if (i == i3) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                if (mMPresetFilter.isIconLocal) {
                    uqb0.f180374G.m127146i0(c11336c.f40543c, "file://" + mMPresetFilter.getIconUrl());
                } else {
                    uqb0.f180374G.m127115L0(c11336c.f40543c, mMPresetFilter.getIconUrl());
                }
            }
            if (i == FilterMenuView.this.f40537o) {
                c11336c.f40541a.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                c11336c.f40541a.setTypeface(Typeface.defaultFromStyle(0));
            }
            c11336c.f40541a.setTextColor(Color.parseColor("#ffffff"));
            c11336c.f40543c.setBackgroundResource(lbc0.f131023e0);
            c11336c.f40541a.setText(mMPresetFilter.getName());
            c11336c.f40542b.setText(String.valueOf((int) (mMPresetFilter.getPercent() * 100.0f)));
            c11336c.f40545e.setOnClickListener(new View.OnClickListener() { // from class: l.imi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f115778a.m62780z(c11336c, view2);
                }
            });
            c11336c.m62781a(i, getItemCount());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C11336c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C11336c(LayoutInflater.from(viewGroup.getContext()).inflate(tec0.f173573S, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return FilterMenuView.this.f40529g.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m62780z(C11336c c11336c, View view) {
            FilterMenuView.this.f40536n.call(Integer.valueOf(c11336c.getAdapterPosition()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterMenuView$c */
    public static class C11336c extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public TextView f40541a;

        /* JADX INFO: renamed from: b */
        public TextView f40542b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f40543c;

        /* JADX INFO: renamed from: d */
        public View f40544d;

        /* JADX INFO: renamed from: e */
        public View f40545e;

        public C11336c(View view) {
            super(view);
            this.f40545e = view;
            this.f40541a = (TextView) view.findViewById(hdc0.f108953q);
            this.f40542b = (TextView) view.findViewById(hdc0.f108959s);
            this.f40543c = (VDraweeView) view.findViewById(hdc0.f108950p);
            this.f40544d = view.findViewById(hdc0.f108956r);
        }

        /* JADX INFO: renamed from: a */
        public void m62781a(int i, int i2) {
            bnl0.m105538V(this.f40545e, qa00.m175859d(i == 0 ? 8.0f : 0.0f));
            bnl0.m105539W(this.f40545e, qa00.m175859d(i == i2 + (-1) ? 8.0f : 0.0f));
        }
    }

    public FilterMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40529g = new ArrayList();
    }

    /* JADX INFO: renamed from: j */
    public final void m62767j(View view) {
        jmi.m146158a(this, view);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final void m62768k() {
        this.f40523a.setOnClickListener(new View.OnClickListener() { // from class: l.dmi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89630a.m62769l(view);
            }
        });
        this.f40525c.setMax(100);
        this.f40525c.setProgress(50);
        this.f40525c.setText(String.valueOf(50));
        this.f40525c.setOnSeekBarChangeListener(new C11334a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f40527e.setLayoutManager(linearLayoutManager);
        C11335b c11335b = new C11335b();
        this.f40528f = c11335b;
        this.f40527e.setAdapter(c11335b);
        this.f40536n = dmk0.m116962a(300, new y20() { // from class: l.emi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94654a.m62774q(((Integer) obj).intValue());
            }
        });
        this.f40524b.setOnTouchListener(new View.OnTouchListener() { // from class: l.fmi
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f99784a.m62770m(view, motionEvent);
            }
        });
        this.f40526d.setOnClickListener(new View.OnClickListener() { // from class: l.gmi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104985a.m62771n(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m62769l(View view) {
        if (NullChecker.m82486a(this.f40534l)) {
            this.f40534l.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m62770m(View view, MotionEvent motionEvent) {
        return m62772o(motionEvent);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m62771n(View view) {
        x20 x20Var = this.f40535m;
        if (x20Var != null) {
            x20Var.call();
        }
        this.f40527e.scrollToPosition(0);
        jyb.m147537z(this.f40529g, new y20() { // from class: l.hmi
            @Override // p153l.y20
            public final void call(Object obj) {
                ((MMPresetFilter) obj).mPercent = 0.5f;
            }
        });
        this.f40528f.notifyDataSetChanged();
        m62775r(0, false);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m62772o(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f40532j.call(Boolean.TRUE);
            }
        } else if (NullChecker.m82486a(this.f40532j)) {
            this.f40532j.call(Boolean.FALSE);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62767j(this);
        m62768k();
    }

    /* JADX INFO: renamed from: p */
    public void m62773p() {
        this.f40528f.notifyDataSetChanged();
        this.f40527e.scrollToPosition(this.f40537o);
    }

    /* JADX INFO: renamed from: q */
    public void m62774q(int i) {
        m62775r(i, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m62775r(int i, boolean z) {
        bnl0.m105524M(this.f40525c, false);
        bnl0.m105524M(this.f40524b, false);
        if (i < 0 || i >= this.f40529g.size()) {
            return;
        }
        boolean z2 = i != 0 || TextUtils.isEmpty(this.f40529g.get(i).getIconUrl());
        bnl0.m105524M(this.f40525c, z2);
        bnl0.m105524M(this.f40524b, z2);
        int i2 = this.f40537o;
        if (i2 == i) {
            return;
        }
        this.f40537o = i;
        this.f40538p = this.f40529g.get(i);
        this.f40528f.notifyItemChanged(i2);
        this.f40528f.notifyItemChanged(this.f40537o);
        if (NullChecker.m82486a(this.f40530h) && z) {
            this.f40530h.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m62776s(int i, float f) {
        this.f40529g.get(i).mPercent = f;
        this.f40528f.notifyItemChanged(i, 0);
    }

    public void setCompareClickCallback(y20<Boolean> y20Var) {
        this.f40532j = y20Var;
    }

    public void setFilterData(List<MMPresetFilter> list) {
        this.f40529g = list;
        this.f40528f.notifyDataSetChanged();
    }

    public void setIntensityChangedCallback(y20<Float> y20Var) {
        this.f40531i = y20Var;
    }

    public void setIntensityChooseCallback(z20<MMPresetFilter, Integer> z20Var) {
        this.f40533k = z20Var;
    }

    public void setMenuDismissListener(x20 x20Var) {
        this.f40534l = x20Var;
    }

    public void setOnItemClickCallback(y20<Integer> y20Var) {
        this.f40530h = y20Var;
    }

    public void setOnResetCallback(x20 x20Var) {
        this.f40535m = x20Var;
    }

    public FilterMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterMenuView(Context context) {
        this(context, null);
    }
}
