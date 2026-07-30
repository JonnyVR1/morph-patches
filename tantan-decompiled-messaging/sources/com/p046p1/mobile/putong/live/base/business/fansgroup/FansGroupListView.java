package com.p046p1.mobile.putong.live.base.business.fansgroup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.base.view.LiveFooterTipsView;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p149l.arl;
import p149l.dfg;
import p149l.feg;
import p149l.g3c0;
import p149l.ieg;
import p149l.jxk;
import p149l.q6c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class FansGroupListView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f44292a;

    /* JADX INFO: renamed from: b */
    public VRelative f44293b;

    /* JADX INFO: renamed from: c */
    public VImage f44294c;

    /* JADX INFO: renamed from: d */
    public VText f44295d;

    /* JADX INFO: renamed from: e */
    public VLinear f44296e;

    /* JADX INFO: renamed from: f */
    public VText f44297f;

    /* JADX INFO: renamed from: g */
    public VText f44298g;

    /* JADX INFO: renamed from: h */
    public boolean f44299h;

    /* JADX INFO: renamed from: i */
    public feg f44300i;

    /* JADX INFO: renamed from: j */
    public jxk f44301j;

    /* JADX INFO: renamed from: k */
    public LiveFooterTipsView f44302k;

    /* JADX INFO: renamed from: l */
    public arl f44303l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.business.fansgroup.FansGroupListView$a */
    public class C11440a extends RecyclerView.AbstractC0576n {
        public C11440a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = t100.f167268q;
            }
        }
    }

    public FansGroupListView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: w */
    private void m67622w() {
        dfg.m111462b(this.f44299h, false);
        this.f44302k.setVisibility(8);
        this.f44292a.setVisibility(8);
        this.f44293b.setVisibility(0);
        xdl0.m208329E0(this.f44297f, new View.OnClickListener() { // from class: l.heg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107370a.m67625v(view);
            }
        });
        this.f44294c.setImageResource(this.f44299h ? g3c0.f100406a0 : g3c0.f100424j0);
        this.f44295d.setTextColor(this.f44299h ? Color.parseColor("#4dffffff") : Color.parseColor("#4d323232"));
        this.f44298g.setTextColor(this.f44299h ? Color.parseColor("#4dffffff") : Color.parseColor("#4d323232"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67623s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m67623s(View view) {
        ieg.m135688a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public void m67624u(boolean z, arl arlVar) {
        this.f44299h = z;
        this.f44303l = arlVar;
        this.f44292a.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f44292a.addItemDecoration(new C11440a());
        feg fegVar = new feg(z, arlVar);
        this.f44300i = fegVar;
        this.f44301j = new jxk(fegVar);
        LiveFooterTipsView liveFooterTipsView = (LiveFooterTipsView) View.inflate(getContext(), q6c0.f152867F, null);
        this.f44302k = liveFooterTipsView;
        this.f44301j.m143813F(liveFooterTipsView);
        this.f44302k.m68728Q(z, getContext().getString(R$string.f44107F));
        this.f44292a.setAdapter(this.f44301j);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m67625v(View view) {
        if (this.f44303l != null) {
            dfg.m111461a(this.f44299h, false);
            this.f44303l.mo70506c();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m67626z(boolean z, FanbaseGroupsBean fanbaseGroupsBean) {
        if (fanbaseGroupsBean == null || fanbaseGroupsBean.getFanbaseGroups() == null || fanbaseGroupsBean.getFanbaseGroups().size() == 0) {
            m67622w();
            return;
        }
        this.f44302k.setVisibility(z ? 0 : 8);
        this.f44292a.setVisibility(0);
        this.f44293b.setVisibility(8);
        this.f44300i.m121037E(fanbaseGroupsBean.getFanbaseGroups());
    }

    public FansGroupListView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansGroupListView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
