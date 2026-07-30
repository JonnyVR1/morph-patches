package com.p046p1.mobile.putong.account.p050ui.camera.view;

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
import p149l.C20001so;
import p149l.c6c0;
import p149l.d30;
import p149l.e30;
import p149l.f30;
import p149l.q4c0;
import p149l.qib0;
import p149l.t100;
import p149l.v2c0;
import p149l.vwb;
import p149l.xck0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountFilterMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f16789a;

    /* JADX INFO: renamed from: b */
    public VImage f16790b;

    /* JADX INFO: renamed from: c */
    public AccountTextSeekBar f16791c;

    /* JADX INFO: renamed from: d */
    public VImage f16792d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f16793e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.Adapter<C4659c> f16794f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f16795g;

    /* JADX INFO: renamed from: h */
    public e30<Integer> f16796h;

    /* JADX INFO: renamed from: i */
    public e30<Float> f16797i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f16798j;

    /* JADX INFO: renamed from: k */
    public f30<MMPresetFilter, Integer> f16799k;

    /* JADX INFO: renamed from: l */
    public d30 f16800l;

    /* JADX INFO: renamed from: m */
    public d30 f16801m;

    /* JADX INFO: renamed from: n */
    public e30<Integer> f16802n;

    /* JADX INFO: renamed from: o */
    public int f16803o;

    /* JADX INFO: renamed from: p */
    public MMPresetFilter f16804p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$a */
    public class C4657a implements AccountTextSeekBar.InterfaceC4665a {
        public C4657a() {
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: a */
        public void mo28980a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (NullChecker.m81303a(AccountFilterMenuView.this.f16797i)) {
                AccountFilterMenuView.this.f16791c.setText(String.valueOf(i));
                float f = (i * 1.0f) / 100.0f;
                AccountFilterMenuView.this.f16797i.call(Float.valueOf(f));
                if (z) {
                    AccountFilterMenuView accountFilterMenuView = AccountFilterMenuView.this;
                    accountFilterMenuView.m28979s(accountFilterMenuView.f16803o, f);
                }
            }
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: b */
        public void mo28981b(AccountTextSeekBar accountTextSeekBar) {
            if (NullChecker.m81303a(AccountFilterMenuView.this.f16799k)) {
                AccountFilterMenuView.this.f16799k.call(AccountFilterMenuView.this.f16804p, Integer.valueOf(accountTextSeekBar.getProgress()));
            }
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: c */
        public void mo28982c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$b */
    public class C4658b extends RecyclerView.Adapter<C4659c> {
        public C4658b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C4659c c4659c, int i) {
            MMPresetFilter mMPresetFilter = (MMPresetFilter) AccountFilterMenuView.this.f16795g.get(i);
            if (mMPresetFilter == null) {
                return;
            }
            if ("0".equals(mMPresetFilter.mFilterId)) {
                c4659c.f16808b.setVisibility(8);
                c4659c.f16810d.setVisibility(8);
                int i2 = AccountFilterMenuView.this.f16803o;
                VDraweeView vDraweeView = c4659c.f16809c;
                if (i == i2) {
                    vDraweeView.setActualImageResource(v2c0.f179410L);
                } else {
                    vDraweeView.setActualImageResource(v2c0.f179407K);
                }
            } else {
                c4659c.f16808b.setVisibility(0);
                int i3 = AccountFilterMenuView.this.f16803o;
                View view = c4659c.f16810d;
                if (i == i3) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                if (mMPresetFilter.isIconLocal) {
                    qib0.f154691G.m102363i0(c4659c.f16809c, "file://" + mMPresetFilter.getIconUrl());
                } else {
                    qib0.f154691G.m102331L0(c4659c.f16809c, mMPresetFilter.getIconUrl());
                }
            }
            if (i == AccountFilterMenuView.this.f16803o) {
                c4659c.f16807a.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                c4659c.f16807a.setTypeface(Typeface.defaultFromStyle(0));
            }
            c4659c.f16807a.setTextColor(Color.parseColor("#ffffff"));
            c4659c.f16809c.setBackgroundResource(v2c0.f179392F);
            c4659c.f16807a.setText(mMPresetFilter.getName());
            c4659c.f16808b.setText(String.valueOf((int) (mMPresetFilter.getPercent() * 100.0f)));
            c4659c.f16811e.setOnClickListener(new View.OnClickListener() { // from class: l.ro
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f160340a.m28986z(c4659c, view2);
                }
            });
            c4659c.m28987a(i, getItemCount());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C4659c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C4659c(LayoutInflater.from(viewGroup.getContext()).inflate(c6c0.f79493d, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return AccountFilterMenuView.this.f16795g.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m28986z(C4659c c4659c, View view) {
            AccountFilterMenuView.this.f16802n.call(Integer.valueOf(c4659c.getAdapterPosition()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$c */
    public static class C4659c extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public TextView f16807a;

        /* JADX INFO: renamed from: b */
        public TextView f16808b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f16809c;

        /* JADX INFO: renamed from: d */
        public View f16810d;

        /* JADX INFO: renamed from: e */
        public View f16811e;

        public C4659c(View view) {
            super(view);
            this.f16811e = view;
            this.f16807a = (TextView) view.findViewById(q4c0.f152587c);
            this.f16808b = (TextView) view.findViewById(q4c0.f152591e);
            this.f16809c = (VDraweeView) view.findViewById(q4c0.f152585b);
            this.f16810d = view.findViewById(q4c0.f152589d);
        }

        /* JADX INFO: renamed from: a */
        public void m28987a(int i, int i2) {
            xdl0.m208358V(this.f16811e, t100.m186890d(i == 0 ? 8.0f : 0.0f));
            xdl0.m208359W(this.f16811e, t100.m186890d(i == i2 + (-1) ? 8.0f : 0.0f));
        }
    }

    public AccountFilterMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16795g = new ArrayList();
    }

    /* JADX INFO: renamed from: j */
    public final void m28970j(View view) {
        C20001so.m185212a(this, view);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final void m28971k() {
        this.f16789a.setOnClickListener(new View.OnClickListener() { // from class: l.mo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134805a.m28972l(view);
            }
        });
        this.f16791c.setMax(100);
        this.f16791c.setProgress(50);
        this.f16791c.setText(String.valueOf(50));
        this.f16791c.setOnSeekBarChangeListener(new C4657a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f16793e.setLayoutManager(linearLayoutManager);
        C4658b c4658b = new C4658b();
        this.f16794f = c4658b;
        this.f16793e.setAdapter(c4658b);
        this.f16802n = xck0.m208120a(300, new e30() { // from class: l.no
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139793a.m28977q(((Integer) obj).intValue());
            }
        });
        this.f16790b.setOnTouchListener(new View.OnTouchListener() { // from class: l.oo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f144832a.m28973m(view, motionEvent);
            }
        });
        this.f16792d.setOnClickListener(new View.OnClickListener() { // from class: l.po
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150432a.m28974n(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m28972l(View view) {
        if (NullChecker.m81303a(this.f16800l)) {
            this.f16800l.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m28973m(View view, MotionEvent motionEvent) {
        return m28975o(motionEvent);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m28974n(View view) {
        d30 d30Var = this.f16801m;
        if (d30Var != null) {
            d30Var.call();
        }
        this.f16793e.scrollToPosition(0);
        vwb.m200354z(this.f16795g, new e30() { // from class: l.qo
            @Override // p149l.e30
            public final void call(Object obj) {
                ((MMPresetFilter) obj).mPercent = 0.5f;
            }
        });
        this.f16794f.notifyDataSetChanged();
        m28978r(0, false);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m28975o(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f16798j.call(Boolean.TRUE);
            }
        } else if (NullChecker.m81303a(this.f16798j)) {
            this.f16798j.call(Boolean.FALSE);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28970j(this);
        m28971k();
    }

    /* JADX INFO: renamed from: p */
    public void m28976p() {
        this.f16794f.notifyDataSetChanged();
        this.f16793e.scrollToPosition(this.f16803o);
    }

    /* JADX INFO: renamed from: q */
    public void m28977q(int i) {
        m28978r(i, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m28978r(int i, boolean z) {
        xdl0.m208344M(this.f16791c, false);
        xdl0.m208344M(this.f16790b, false);
        if (i < 0 || i >= this.f16795g.size()) {
            return;
        }
        boolean z2 = i != 0 || TextUtils.isEmpty(this.f16795g.get(i).getIconUrl());
        xdl0.m208344M(this.f16791c, z2);
        xdl0.m208344M(this.f16790b, z2);
        int i2 = this.f16803o;
        if (i2 == i) {
            return;
        }
        this.f16803o = i;
        this.f16804p = this.f16795g.get(i);
        this.f16794f.notifyItemChanged(i2);
        this.f16794f.notifyItemChanged(this.f16803o);
        if (NullChecker.m81303a(this.f16796h) && z) {
            this.f16796h.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m28979s(int i, float f) {
        this.f16795g.get(i).mPercent = f;
        this.f16794f.notifyItemChanged(i, 0);
    }

    public void setCompareClickCallback(e30<Boolean> e30Var) {
        this.f16798j = e30Var;
    }

    public void setFilterData(List<MMPresetFilter> list) {
        this.f16795g = list;
        this.f16794f.notifyDataSetChanged();
    }

    public void setIntensityChangedCallback(e30<Float> e30Var) {
        this.f16797i = e30Var;
    }

    public void setIntensityChooseCallback(f30<MMPresetFilter, Integer> f30Var) {
        this.f16799k = f30Var;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f16800l = d30Var;
    }

    public void setOnItemClickCallback(e30<Integer> e30Var) {
        this.f16796h = e30Var;
    }

    public void setOnResetCallback(d30 d30Var) {
        this.f16801m = d30Var;
    }

    public AccountFilterMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountFilterMenuView(Context context) {
        this(context, null);
    }
}
