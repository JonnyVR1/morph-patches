package com.p051p1.mobile.putong.core.p058ui.result;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import java.util.List;
import p151v.VRecyclerView;
import p153l.jyb;
import p153l.o3i0;
import p153l.qa00;
import p153l.qcj;
import p153l.ugb0;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class CoinRecyclerView extends VRecyclerView implements ugb0 {

    /* JADX INFO: renamed from: c */
    public final boolean f36427c;

    /* JADX INFO: renamed from: d */
    public final List<Privilege> f36428d;

    /* JADX INFO: renamed from: e */
    public PutongFrag f36429e;

    /* JADX INFO: renamed from: f */
    public o3i0 f36430f;

    public CoinRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean zMo180446c = CoreModule.m30933P().m143412i().mo180446c();
        this.f36427c = zMo180446c;
        this.f36428d = zMo180446c ? jyb.m147522n(jyb.m147507f0(Privilege.boost, Privilege.vip_super_like, Privilege.online_match_tickets_extra, Privilege.see_greet_gp, Privilege.letter), new qcj() { // from class: l.je5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(a5i0.m96180x((Privilege) obj));
            }
        }) : jyb.m147522n(jyb.m147507f0(Privilege.boost, Privilege.vip_super_like, Privilege.see_greet_gp, Privilege.letter), new qcj() { // from class: l.je5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(a5i0.m96180x((Privilege) obj));
            }
        });
        init();
    }

    private void init() {
        setOverScrollMode(2);
        setPadding(0, qa00.m175859d(vnb.m201953m1() * 10.0f), 0, 0);
    }

    @Override // p153l.ugb0
    /* JADX INFO: renamed from: w */
    public void mo55896w(PutongFrag putongFrag) {
        this.f36429e = putongFrag;
        setLayoutManager(new GridLayoutManager(getContext(), 2));
        o3i0 o3i0Var = new o3i0(putongFrag, this.f36428d, this.f36427c);
        this.f36430f = o3i0Var;
        setAdapter(o3i0Var);
    }

    public CoinRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoinRecyclerView(Context context) {
        this(context, null);
    }
}
