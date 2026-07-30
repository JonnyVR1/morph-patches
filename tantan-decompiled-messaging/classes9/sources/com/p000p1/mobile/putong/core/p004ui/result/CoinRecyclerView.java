package com.p000p1.mobile.putong.core.p004ui.result;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import java.util.List;
import l.hmb;
import l.t100;
import l.vwb;
import l.w9j;
import p006l.gvh0;
import p006l.q8b0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoinRecyclerView extends VRecyclerView implements q8b0 {

    /* JADX INFO: renamed from: c */
    public final boolean f5360c;

    /* JADX INFO: renamed from: d */
    public final List<Privilege> f5361d;

    /* JADX INFO: renamed from: e */
    public PutongFrag f5362e;

    /* JADX INFO: renamed from: f */
    public gvh0 f5363f;

    public CoinRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean zM19862c = CoreModule.m1854P().m11713i().m19862c();
        this.f5360c = zM19862c;
        this.f5361d = zM19862c ? vwb.n(vwb.f0(new Privilege[]{Privilege.boost, Privilege.vip_super_like, Privilege.online_match_tickets_extra, Privilege.see_greet_gp, Privilege.letter}), new w9j() { // from class: l.jd5
            public final Object call(Object obj) {
                return Boolean.valueOf(swh0.m24326x((Privilege) obj));
            }
        }) : vwb.n(vwb.f0(new Privilege[]{Privilege.boost, Privilege.vip_super_like, Privilege.see_greet_gp, Privilege.letter}), new w9j() { // from class: l.jd5
            public final Object call(Object obj) {
                return Boolean.valueOf(swh0.m24326x((Privilege) obj));
            }
        });
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
        setPadding(0, t100.d(hmb.m1() * 10.0f), 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l.q8b0
    /* JADX INFO: renamed from: w */
    public void mo8070w(PutongFrag putongFrag) {
        this.f5362e = putongFrag;
        setLayoutManager(new GridLayoutManager(getContext(), 2));
        gvh0 gvh0Var = new gvh0(putongFrag, this.f5361d, this.f5360c);
        this.f5363f = gvh0Var;
        setAdapter(gvh0Var);
    }

    public CoinRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoinRecyclerView(Context context) {
        this(context, null);
    }
}
