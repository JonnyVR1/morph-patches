package com.p051p1.mobile.putong.live.base.business.fansgroup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.base.view.LiveFooterTipsView;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.mbc0;
import p153l.ntl;
import p153l.qa00;
import p153l.rgg;
import p153l.tfg;
import p153l.vec0;
import p153l.wfg;
import p153l.zzk;

/* JADX INFO: loaded from: classes13.dex */
public class FansGroupListView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f45140a;

    /* JADX INFO: renamed from: b */
    public VRelative f45141b;

    /* JADX INFO: renamed from: c */
    public VImage f45142c;

    /* JADX INFO: renamed from: d */
    public VText f45143d;

    /* JADX INFO: renamed from: e */
    public VLinear f45144e;

    /* JADX INFO: renamed from: f */
    public VText f45145f;

    /* JADX INFO: renamed from: g */
    public VText f45146g;

    /* JADX INFO: renamed from: h */
    public boolean f45147h;

    /* JADX INFO: renamed from: i */
    public tfg f45148i;

    /* JADX INFO: renamed from: j */
    public zzk f45149j;

    /* JADX INFO: renamed from: k */
    public LiveFooterTipsView f45150k;

    /* JADX INFO: renamed from: l */
    public ntl f45151l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.business.fansgroup.FansGroupListView$a */
    public class C11603a extends RecyclerView.AbstractC0578n {
        public C11603a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = qa00.f156330q;
            }
        }
    }

    public FansGroupListView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: w */
    private void m68805w() {
        rgg.m181443b(this.f45147h, false);
        this.f45150k.setVisibility(8);
        this.f45140a.setVisibility(8);
        this.f45141b.setVisibility(0);
        bnl0.m105509E0(this.f45145f, new View.OnClickListener() { // from class: l.vfg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183899a.m68808v(view);
            }
        });
        this.f45142c.setImageResource(this.f45147h ? mbc0.f135668a0 : mbc0.f135686j0);
        this.f45143d.setTextColor(this.f45147h ? Color.parseColor("#4dffffff") : Color.parseColor("#4d323232"));
        this.f45146g.setTextColor(this.f45147h ? Color.parseColor("#4dffffff") : Color.parseColor("#4d323232"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68806s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m68806s(View view) {
        wfg.m206118a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m68807u(boolean z, ntl ntlVar) {
        this.f45147h = z;
        this.f45151l = ntlVar;
        this.f45140a.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f45140a.addItemDecoration(new C11603a());
        tfg tfgVar = new tfg(z, ntlVar);
        this.f45148i = tfgVar;
        this.f45149j = new zzk(tfgVar);
        LiveFooterTipsView liveFooterTipsView = (LiveFooterTipsView) View.inflate(getContext(), vec0.f183724F, null);
        this.f45150k = liveFooterTipsView;
        this.f45149j.m222263F(liveFooterTipsView);
        this.f45150k.m69911Q(z, getContext().getString(R$string.f44955F));
        this.f45140a.setAdapter(this.f45149j);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m68808v(View view) {
        if (this.f45151l != null) {
            rgg.m181442a(this.f45147h, false);
            this.f45151l.mo71689c();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m68809z(boolean z, FanbaseGroupsBean fanbaseGroupsBean) {
        if (fanbaseGroupsBean == null || fanbaseGroupsBean.getFanbaseGroups() == null || fanbaseGroupsBean.getFanbaseGroups().size() == 0) {
            m68805w();
            return;
        }
        this.f45150k.setVisibility(z ? 0 : 8);
        this.f45140a.setVisibility(0);
        this.f45141b.setVisibility(8);
        this.f45148i.m190937E(fanbaseGroupsBean.getFanbaseGroups());
    }

    public FansGroupListView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansGroupListView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
