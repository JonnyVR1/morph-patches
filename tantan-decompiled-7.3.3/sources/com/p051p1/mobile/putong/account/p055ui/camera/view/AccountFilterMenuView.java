package com.p051p1.mobile.putong.account.p055ui.camera.view;

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
import p153l.C18910no;
import p153l.bbc0;
import p153l.bnl0;
import p153l.dmk0;
import p153l.hec0;
import p153l.jyb;
import p153l.qa00;
import p153l.uqb0;
import p153l.wcc0;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountFilterMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f17508a;

    /* JADX INFO: renamed from: b */
    public VImage f17509b;

    /* JADX INFO: renamed from: c */
    public AccountTextSeekBar f17510c;

    /* JADX INFO: renamed from: d */
    public VImage f17511d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f17512e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.Adapter<C4810c> f17513f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f17514g;

    /* JADX INFO: renamed from: h */
    public y20<Integer> f17515h;

    /* JADX INFO: renamed from: i */
    public y20<Float> f17516i;

    /* JADX INFO: renamed from: j */
    public y20<Boolean> f17517j;

    /* JADX INFO: renamed from: k */
    public z20<MMPresetFilter, Integer> f17518k;

    /* JADX INFO: renamed from: l */
    public x20 f17519l;

    /* JADX INFO: renamed from: m */
    public x20 f17520m;

    /* JADX INFO: renamed from: n */
    public y20<Integer> f17521n;

    /* JADX INFO: renamed from: o */
    public int f17522o;

    /* JADX INFO: renamed from: p */
    public MMPresetFilter f17523p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$a */
    public class C4808a implements AccountTextSeekBar.InterfaceC4816a {
        public C4808a() {
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: a */
        public void mo29979a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (NullChecker.m82486a(AccountFilterMenuView.this.f17516i)) {
                AccountFilterMenuView.this.f17510c.setText(String.valueOf(i));
                float f = (i * 1.0f) / 100.0f;
                AccountFilterMenuView.this.f17516i.call(Float.valueOf(f));
                if (z) {
                    AccountFilterMenuView accountFilterMenuView = AccountFilterMenuView.this;
                    accountFilterMenuView.m29978s(accountFilterMenuView.f17522o, f);
                }
            }
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: b */
        public void mo29980b(AccountTextSeekBar accountTextSeekBar) {
            if (NullChecker.m82486a(AccountFilterMenuView.this.f17518k)) {
                AccountFilterMenuView.this.f17518k.call(AccountFilterMenuView.this.f17523p, Integer.valueOf(accountTextSeekBar.getProgress()));
            }
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: c */
        public void mo29981c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$b */
    public class C4809b extends RecyclerView.Adapter<C4810c> {
        public C4809b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C4810c c4810c, int i) {
            MMPresetFilter mMPresetFilter = (MMPresetFilter) AccountFilterMenuView.this.f17514g.get(i);
            if (mMPresetFilter == null) {
                return;
            }
            if ("0".equals(mMPresetFilter.mFilterId)) {
                c4810c.f17527b.setVisibility(8);
                c4810c.f17529d.setVisibility(8);
                int i2 = AccountFilterMenuView.this.f17522o;
                VDraweeView vDraweeView = c4810c.f17528c;
                if (i == i2) {
                    vDraweeView.setActualImageResource(bbc0.f75816L);
                } else {
                    vDraweeView.setActualImageResource(bbc0.f75813K);
                }
            } else {
                c4810c.f17527b.setVisibility(0);
                int i3 = AccountFilterMenuView.this.f17522o;
                View view = c4810c.f17529d;
                if (i == i3) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                if (mMPresetFilter.isIconLocal) {
                    uqb0.f180374G.m127146i0(c4810c.f17528c, "file://" + mMPresetFilter.getIconUrl());
                } else {
                    uqb0.f180374G.m127115L0(c4810c.f17528c, mMPresetFilter.getIconUrl());
                }
            }
            if (i == AccountFilterMenuView.this.f17522o) {
                c4810c.f17526a.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                c4810c.f17526a.setTypeface(Typeface.defaultFromStyle(0));
            }
            c4810c.f17526a.setTextColor(Color.parseColor("#ffffff"));
            c4810c.f17528c.setBackgroundResource(bbc0.f75798F);
            c4810c.f17526a.setText(mMPresetFilter.getName());
            c4810c.f17527b.setText(String.valueOf((int) (mMPresetFilter.getPercent() * 100.0f)));
            c4810c.f17530e.setOnClickListener(new View.OnClickListener() { // from class: l.mo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f137751a.m29985z(c4810c, view2);
                }
            });
            c4810c.m29986a(i, getItemCount());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C4810c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C4810c(LayoutInflater.from(viewGroup.getContext()).inflate(hec0.f109105d, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return AccountFilterMenuView.this.f17514g.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m29985z(C4810c c4810c, View view) {
            AccountFilterMenuView.this.f17521n.call(Integer.valueOf(c4810c.getAdapterPosition()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$c */
    public static class C4810c extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public TextView f17526a;

        /* JADX INFO: renamed from: b */
        public TextView f17527b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f17528c;

        /* JADX INFO: renamed from: d */
        public View f17529d;

        /* JADX INFO: renamed from: e */
        public View f17530e;

        public C4810c(View view) {
            super(view);
            this.f17530e = view;
            this.f17526a = (TextView) view.findViewById(wcc0.f188435c);
            this.f17527b = (TextView) view.findViewById(wcc0.f188439e);
            this.f17528c = (VDraweeView) view.findViewById(wcc0.f188433b);
            this.f17529d = view.findViewById(wcc0.f188437d);
        }

        /* JADX INFO: renamed from: a */
        public void m29986a(int i, int i2) {
            bnl0.m105538V(this.f17530e, qa00.m175859d(i == 0 ? 8.0f : 0.0f));
            bnl0.m105539W(this.f17530e, qa00.m175859d(i == i2 + (-1) ? 8.0f : 0.0f));
        }
    }

    public AccountFilterMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17514g = new ArrayList();
    }

    /* JADX INFO: renamed from: j */
    public final void m29969j(View view) {
        C18910no.m164009a(this, view);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final void m29970k() {
        this.f17508a.setOnClickListener(new View.OnClickListener() { // from class: l.ho
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110852a.m29971l(view);
            }
        });
        this.f17510c.setMax(100);
        this.f17510c.setProgress(50);
        this.f17510c.setText(String.valueOf(50));
        this.f17510c.setOnSeekBarChangeListener(new C4808a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f17512e.setLayoutManager(linearLayoutManager);
        C4809b c4809b = new C4809b();
        this.f17513f = c4809b;
        this.f17512e.setAdapter(c4809b);
        this.f17521n = dmk0.m116962a(300, new y20() { // from class: l.io
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116058a.m29976q(((Integer) obj).intValue());
            }
        });
        this.f17509b.setOnTouchListener(new View.OnTouchListener() { // from class: l.jo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f121915a.m29972m(view, motionEvent);
            }
        });
        this.f17511d.setOnClickListener(new View.OnClickListener() { // from class: l.ko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127656a.m29973n(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m29971l(View view) {
        if (NullChecker.m82486a(this.f17519l)) {
            this.f17519l.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m29972m(View view, MotionEvent motionEvent) {
        return m29974o(motionEvent);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m29973n(View view) {
        x20 x20Var = this.f17520m;
        if (x20Var != null) {
            x20Var.call();
        }
        this.f17512e.scrollToPosition(0);
        jyb.m147537z(this.f17514g, new y20() { // from class: l.lo
            @Override // p153l.y20
            public final void call(Object obj) {
                ((MMPresetFilter) obj).mPercent = 0.5f;
            }
        });
        this.f17513f.notifyDataSetChanged();
        m29977r(0, false);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m29974o(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f17517j.call(Boolean.TRUE);
            }
        } else if (NullChecker.m82486a(this.f17517j)) {
            this.f17517j.call(Boolean.FALSE);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29969j(this);
        m29970k();
    }

    /* JADX INFO: renamed from: p */
    public void m29975p() {
        this.f17513f.notifyDataSetChanged();
        this.f17512e.scrollToPosition(this.f17522o);
    }

    /* JADX INFO: renamed from: q */
    public void m29976q(int i) {
        m29977r(i, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m29977r(int i, boolean z) {
        bnl0.m105524M(this.f17510c, false);
        bnl0.m105524M(this.f17509b, false);
        if (i < 0 || i >= this.f17514g.size()) {
            return;
        }
        boolean z2 = i != 0 || TextUtils.isEmpty(this.f17514g.get(i).getIconUrl());
        bnl0.m105524M(this.f17510c, z2);
        bnl0.m105524M(this.f17509b, z2);
        int i2 = this.f17522o;
        if (i2 == i) {
            return;
        }
        this.f17522o = i;
        this.f17523p = this.f17514g.get(i);
        this.f17513f.notifyItemChanged(i2);
        this.f17513f.notifyItemChanged(this.f17522o);
        if (NullChecker.m82486a(this.f17515h) && z) {
            this.f17515h.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m29978s(int i, float f) {
        this.f17514g.get(i).mPercent = f;
        this.f17513f.notifyItemChanged(i, 0);
    }

    public void setCompareClickCallback(y20<Boolean> y20Var) {
        this.f17517j = y20Var;
    }

    public void setFilterData(List<MMPresetFilter> list) {
        this.f17514g = list;
        this.f17513f.notifyDataSetChanged();
    }

    public void setIntensityChangedCallback(y20<Float> y20Var) {
        this.f17516i = y20Var;
    }

    public void setIntensityChooseCallback(z20<MMPresetFilter, Integer> z20Var) {
        this.f17518k = z20Var;
    }

    public void setMenuDismissListener(x20 x20Var) {
        this.f17519l = x20Var;
    }

    public void setOnItemClickCallback(y20<Integer> y20Var) {
        this.f17515h = y20Var;
    }

    public void setOnResetCallback(x20 x20Var) {
        this.f17520m = x20Var;
    }

    public AccountFilterMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountFilterMenuView(Context context) {
        this(context, null);
    }
}
