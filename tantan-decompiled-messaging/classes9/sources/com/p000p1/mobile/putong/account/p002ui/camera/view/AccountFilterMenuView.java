package com.p000p1.mobile.putong.account.p002ui.camera.view;

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
import l.d30;
import l.e30;
import l.f30;
import l.t100;
import l.vwb;
import l.xck0;
import l.xdl0;
import p006l.C1273so;
import p006l.c6c0;
import p006l.q4c0;
import p006l.qib0;
import p006l.v2c0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountFilterMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f778a;

    /* JADX INFO: renamed from: b */
    public VImage f779b;

    /* JADX INFO: renamed from: c */
    public AccountTextSeekBar f780c;

    /* JADX INFO: renamed from: d */
    public VImage f781d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f782e;

    /* JADX INFO: renamed from: f */
    public RecyclerView.Adapter<C0085c> f783f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f784g;

    /* JADX INFO: renamed from: h */
    public e30<Integer> f785h;

    /* JADX INFO: renamed from: i */
    public e30<Float> f786i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f787j;

    /* JADX INFO: renamed from: k */
    public f30<MMPresetFilter, Integer> f788k;

    /* JADX INFO: renamed from: l */
    public d30 f789l;

    /* JADX INFO: renamed from: m */
    public d30 f790m;

    /* JADX INFO: renamed from: n */
    public e30<Integer> f791n;

    /* JADX INFO: renamed from: o */
    public int f792o;

    /* JADX INFO: renamed from: p */
    public MMPresetFilter f793p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$a */
    public class C0083a implements AccountTextSeekBar.InterfaceC0091a {
        public C0083a() {
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: a */
        public void mo886a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (NullChecker.a(AccountFilterMenuView.this.f786i)) {
                AccountFilterMenuView.this.f780c.setText(String.valueOf(i));
                float f = (i * 1.0f) / 100.0f;
                AccountFilterMenuView.this.f786i.call(Float.valueOf(f));
                if (z) {
                    AccountFilterMenuView accountFilterMenuView = AccountFilterMenuView.this;
                    accountFilterMenuView.m885s(accountFilterMenuView.f792o, f);
                }
            }
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: b */
        public void mo887b(AccountTextSeekBar accountTextSeekBar) {
            if (NullChecker.a(AccountFilterMenuView.this.f788k)) {
                AccountFilterMenuView.this.f788k.call(AccountFilterMenuView.this.f793p, Integer.valueOf(accountTextSeekBar.getProgress()));
            }
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: c */
        public void mo888c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$b */
    public class C0084b extends RecyclerView.Adapter<C0085c> {
        public C0084b() {
        }

        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C0085c c0085c, int i) {
            MMPresetFilter mMPresetFilter = (MMPresetFilter) AccountFilterMenuView.this.f784g.get(i);
            if (mMPresetFilter == null) {
                return;
            }
            if ("0".equals(mMPresetFilter.mFilterId)) {
                c0085c.f797b.setVisibility(8);
                c0085c.f799d.setVisibility(8);
                int i2 = AccountFilterMenuView.this.f792o;
                VDraweeView vDraweeView = c0085c.f798c;
                if (i == i2) {
                    vDraweeView.setActualImageResource(v2c0.f23974L);
                } else {
                    vDraweeView.setActualImageResource(v2c0.f23971K);
                }
            } else {
                c0085c.f797b.setVisibility(0);
                int i3 = AccountFilterMenuView.this.f792o;
                View view = c0085c.f799d;
                if (i == i3) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                if (mMPresetFilter.isIconLocal) {
                    qib0.f19782G.m12776i0(c0085c.f798c, "file://" + mMPresetFilter.getIconUrl());
                } else {
                    qib0.f19782G.m12744L0(c0085c.f798c, mMPresetFilter.getIconUrl());
                }
            }
            if (i == AccountFilterMenuView.this.f792o) {
                c0085c.f796a.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                c0085c.f796a.setTypeface(Typeface.defaultFromStyle(0));
            }
            c0085c.f796a.setTextColor(Color.parseColor("#ffffff"));
            c0085c.f798c.setBackgroundResource(v2c0.f23956F);
            c0085c.f796a.setText(mMPresetFilter.getName());
            c0085c.f797b.setText(String.valueOf((int) (mMPresetFilter.getPercent() * 100.0f)));
            c0085c.f800e.setOnClickListener(new View.OnClickListener() { // from class: l.ro
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f20653a.m892z(c0085c, view2);
                }
            });
            c0085c.m893a(i, getItemCount());
        }

        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0085c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C0085c(LayoutInflater.from(viewGroup.getContext()).inflate(c6c0.f9423d, viewGroup, false));
        }

        public int getItemCount() {
            return AccountFilterMenuView.this.f784g.size();
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m892z(C0085c c0085c, View view) {
            AccountFilterMenuView.this.f791n.call(Integer.valueOf(c0085c.getAdapterPosition()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountFilterMenuView$c */
    public static class C0085c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public TextView f796a;

        /* JADX INFO: renamed from: b */
        public TextView f797b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f798c;

        /* JADX INFO: renamed from: d */
        public View f799d;

        /* JADX INFO: renamed from: e */
        public View f800e;

        public C0085c(View view) {
            super(view);
            this.f800e = view;
            this.f796a = (TextView) view.findViewById(q4c0.f19597c);
            this.f797b = (TextView) view.findViewById(q4c0.f19601e);
            this.f798c = view.findViewById(q4c0.f19595b);
            this.f799d = view.findViewById(q4c0.f19599d);
        }

        /* JADX INFO: renamed from: a */
        public void m893a(int i, int i2) {
            xdl0.V(this.f800e, t100.d(i == 0 ? 8.0f : 0.0f));
            xdl0.W(this.f800e, t100.d(i == i2 + (-1) ? 8.0f : 0.0f));
        }
    }

    public AccountFilterMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f784g = new ArrayList();
    }

    /* JADX INFO: renamed from: j */
    public final void m876j(View view) {
        C1273so.m23928a(this, view);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public final void m877k() {
        this.f778a.setOnClickListener(new View.OnClickListener() { // from class: l.mo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17129a.m878l(view);
            }
        });
        this.f780c.setMax(100);
        this.f780c.setProgress(50);
        this.f780c.setText(String.valueOf(50));
        this.f780c.setOnSeekBarChangeListener(new C0083a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f782e.setLayoutManager(linearLayoutManager);
        C0084b c0084b = new C0084b();
        this.f783f = c0084b;
        this.f782e.setAdapter(c0084b);
        this.f791n = xck0.a(300, new e30() { // from class: l.no
            public final void call(Object obj) {
                this.f17758a.m883q(((Integer) obj).intValue());
            }
        });
        this.f779b.setOnTouchListener(new View.OnTouchListener() { // from class: l.oo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f18296a.m879m(view, motionEvent);
            }
        });
        this.f781d.setOnClickListener(new View.OnClickListener() { // from class: l.po
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19231a.m880n(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m878l(View view) {
        if (NullChecker.a(this.f789l)) {
            this.f789l.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m879m(View view, MotionEvent motionEvent) {
        return m881o(motionEvent);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m880n(View view) {
        d30 d30Var = this.f790m;
        if (d30Var != null) {
            d30Var.call();
        }
        this.f782e.scrollToPosition(0);
        vwb.z(this.f784g, new e30() { // from class: l.qo
            public final void call(Object obj) {
                ((MMPresetFilter) obj).mPercent = 0.5f;
            }
        });
        this.f783f.notifyDataSetChanged();
        m884r(0, false);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m881o(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f787j.call(Boolean.TRUE);
            }
        } else if (NullChecker.a(this.f787j)) {
            this.f787j.call(Boolean.FALSE);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m876j(this);
        m877k();
    }

    /* JADX INFO: renamed from: p */
    public void m882p() {
        this.f783f.notifyDataSetChanged();
        this.f782e.scrollToPosition(this.f792o);
    }

    /* JADX INFO: renamed from: q */
    public void m883q(int i) {
        m884r(i, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m884r(int i, boolean z) {
        xdl0.M(this.f780c, false);
        xdl0.M(this.f779b, false);
        if (i < 0 || i >= this.f784g.size()) {
            return;
        }
        boolean z2 = i != 0 || TextUtils.isEmpty(this.f784g.get(i).getIconUrl());
        xdl0.M(this.f780c, z2);
        xdl0.M(this.f779b, z2);
        int i2 = this.f792o;
        if (i2 == i) {
            return;
        }
        this.f792o = i;
        this.f793p = this.f784g.get(i);
        this.f783f.notifyItemChanged(i2);
        this.f783f.notifyItemChanged(this.f792o);
        if (NullChecker.a(this.f785h) && z) {
            this.f785h.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m885s(int i, float f) {
        this.f784g.get(i).mPercent = f;
        this.f783f.notifyItemChanged(i, 0);
    }

    public void setCompareClickCallback(e30<Boolean> e30Var) {
        this.f787j = e30Var;
    }

    public void setFilterData(List<MMPresetFilter> list) {
        this.f784g = list;
        this.f783f.notifyDataSetChanged();
    }

    public void setIntensityChangedCallback(e30<Float> e30Var) {
        this.f786i = e30Var;
    }

    public void setIntensityChooseCallback(f30<MMPresetFilter, Integer> f30Var) {
        this.f788k = f30Var;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f789l = d30Var;
    }

    public void setOnItemClickCallback(e30<Integer> e30Var) {
        this.f785h = e30Var;
    }

    public void setOnResetCallback(d30 d30Var) {
        this.f790m = d30Var;
    }

    public AccountFilterMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountFilterMenuView(Context context) {
        this(context, null);
    }
}
