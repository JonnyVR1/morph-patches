package com.p046p1.mobile.putong.core.p053ui.result;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VRecyclerView;
import p149l.dac0;
import p149l.fy80;
import p149l.hmb;
import p149l.m6c0;
import p149l.q8b0;
import p149l.t100;
import p149l.vwb;
import p149l.yx80;

/* JADX INFO: loaded from: classes9.dex */
public class VipContent extends VRecyclerView implements q8b0 {

    /* JADX INFO: renamed from: e */
    public static final ArrayList<Privilege> f35645e = vwb.m200324f0(Privilege.see_who_likes_me, Privilege.online_match_tickets, Privilege.letter, Privilege.liked_user, Privilege.boost, Privilege.advanced_filter, Privilege.message_read_state, Privilege.privacy_membership, Privilege.recover_unmatches);

    /* JADX INFO: renamed from: c */
    public C8835a f35646c;

    /* JADX INFO: renamed from: d */
    public boolean f35647d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContent$a */
    public static class C8835a extends dac0<Privilege> {

        /* JADX INFO: renamed from: c */
        public ArrayList<Privilege> f35648c;

        /* JADX INFO: renamed from: d */
        public PurchaseType f35649d;

        /* JADX INFO: renamed from: e */
        public PutongFrag f35650e;

        /* JADX INFO: renamed from: f */
        public boolean f35651f;

        public C8835a(PutongFrag putongFrag, PurchaseType purchaseType, boolean z) {
            this.f35650e = putongFrag;
            this.f35649d = purchaseType;
            this.f35651f = z;
            if (!CoreModule.m29935P().m94651a().mo33507h5() || this.f35651f) {
                this.f35648c = yx80.m216434b(purchaseType);
            } else {
                this.f35648c = fy80.m123702A();
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f35648c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f35650e.mo20578H2().inflate(m6c0.f131472D2, viewGroup, false);
            }
            boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
            PutongFrag putongFrag = this.f35650e;
            if (zMo33507h5) {
                SVipContentItemView sVipContentItemView = (SVipContentItemView) putongFrag.mo20578H2().inflate(m6c0.f131564a2, viewGroup, false);
                if (this.f35651f) {
                    sVipContentItemView.m54757s();
                }
                return sVipContentItemView;
            }
            VipContentItemView vipContentItemView = (VipContentItemView) putongFrag.mo20578H2().inflate(m6c0.f131565a3, viewGroup, false);
            if (this.f35651f) {
                vipContentItemView.m54889m();
            }
            return vipContentItemView;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, Privilege privilege, final int i, int i2) {
            if (i == 0 || i == 2) {
                if (view instanceof SVipContentItemView) {
                    ((SVipContentItemView) view).m54753o(this, privilege, new VipContentItemView.InterfaceC8838a() { // from class: l.efl0
                        @Override // com.p046p1.mobile.putong.core.p053ui.result.VipContentItemView.InterfaceC8838a
                        /* JADX INFO: renamed from: a */
                        public final void mo54890a(Privilege privilege2) {
                            this.f90849a.m54801I(i, privilege2);
                        }
                    }, i == 2, this.f35649d);
                } else {
                    ((VipContentItemView) view).m54886j(privilege, new VipContentItemView.InterfaceC8838a() { // from class: l.ffl0
                        @Override // com.p046p1.mobile.putong.core.p053ui.result.VipContentItemView.InterfaceC8838a
                        /* JADX INFO: renamed from: a */
                        public final void mo54890a(Privilege privilege2) {
                            this.f97269a.m54802J(privilege2);
                        }
                    }, this.f35650e.act());
                }
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Privilege getItem(int i) {
            return this.f35648c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m54801I(int i, Privilege privilege) {
            CoreModule.f17554l.m94651a().mo33294Bp(this.f35650e, i);
            C8839a c8839a = new C8839a(this.f35650e);
            c8839a.m54915y(i == 2 ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : PurchaseType.TYPE_GET_VIP);
            c8839a.m54914x(privilege);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m54802J(Privilege privilege) {
            C8839a c8839a = new C8839a(this.f35650e);
            c8839a.m54915y(this.f35649d);
            c8839a.m54914x(privilege);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (this.f35648c.get(i) == Privilege.svip_badge) {
                return 1;
            }
            return VipContent.f35645e.contains(this.f35648c.get(i)) ? 2 : 0;
        }
    }

    public VipContent(Context context) {
        super(context);
        this.f35647d = false;
        init();
    }

    private void init() {
        setOverScrollMode(2);
        setPadding(0, t100.m186890d(hmb.m131708m1() * 10.0f), 0, 0);
    }

    /* JADX INFO: renamed from: H */
    public void m54795H(PutongFrag putongFrag) {
        if (this.f35646c == null) {
            setLayoutManager(new LinearLayoutManager(getContext()));
            C8835a c8835a = new C8835a(putongFrag, PurchaseType.TYPE_GET_VIP, this.f35647d);
            this.f35646c = c8835a;
            setAdapter(c8835a);
            this.f35646c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m54796I() {
        this.f35647d = true;
    }

    @Override // p149l.q8b0
    /* JADX INFO: renamed from: w */
    public void mo54713w(PutongFrag putongFrag) {
        if (NullChecker.m81303a(putongFrag)) {
            m54795H(putongFrag);
        }
    }

    public VipContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35647d = false;
        init();
    }

    public VipContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35647d = false;
        init();
    }
}
