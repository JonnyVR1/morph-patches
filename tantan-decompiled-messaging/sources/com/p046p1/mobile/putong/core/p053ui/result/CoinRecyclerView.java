package com.p046p1.mobile.putong.core.p053ui.result;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import java.util.List;
import p147v.VRecyclerView;
import p149l.gvh0;
import p149l.hmb;
import p149l.q8b0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public class CoinRecyclerView extends VRecyclerView implements q8b0 {

    /* JADX INFO: renamed from: c */
    public final boolean f35579c;

    /* JADX INFO: renamed from: d */
    public final List<Privilege> f35580d;

    /* JADX INFO: renamed from: e */
    public PutongFrag f35581e;

    /* JADX INFO: renamed from: f */
    public gvh0 f35582f;

    public CoinRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean zMo158354c = CoreModule.m29935P().m94658i().mo158354c();
        this.f35579c = zMo158354c;
        this.f35580d = zMo158354c ? vwb.m200339n(vwb.m200324f0(Privilege.boost, Privilege.vip_super_like, Privilege.online_match_tickets_extra, Privilege.see_greet_gp, Privilege.letter), new w9j() { // from class: l.jd5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(swh0.m186275x((Privilege) obj));
            }
        }) : vwb.m200339n(vwb.m200324f0(Privilege.boost, Privilege.vip_super_like, Privilege.see_greet_gp, Privilege.letter), new w9j() { // from class: l.jd5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(swh0.m186275x((Privilege) obj));
            }
        });
        init();
    }

    private void init() {
        setOverScrollMode(2);
        setPadding(0, t100.m186890d(hmb.m131708m1() * 10.0f), 0, 0);
    }

    @Override // p149l.q8b0
    /* JADX INFO: renamed from: w */
    public void mo54713w(PutongFrag putongFrag) {
        this.f35581e = putongFrag;
        setLayoutManager(new GridLayoutManager(getContext(), 2));
        gvh0 gvh0Var = new gvh0(putongFrag, this.f35580d, this.f35579c);
        this.f35582f = gvh0Var;
        setAdapter(gvh0Var);
    }

    public CoinRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoinRecyclerView(Context context) {
        this(context, null);
    }
}
