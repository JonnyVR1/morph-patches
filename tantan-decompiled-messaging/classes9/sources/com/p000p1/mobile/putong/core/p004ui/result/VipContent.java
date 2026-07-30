package com.p000p1.mobile.putong.core.p004ui.result;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.dac0;
import l.fy80;
import l.hmb;
import l.m6c0;
import l.t100;
import l.vwb;
import l.yx80;
import p006l.q8b0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipContent extends VRecyclerView implements q8b0 {

    /* JADX INFO: renamed from: e */
    public static final ArrayList<Privilege> f5426e = vwb.f0(new Privilege[]{Privilege.see_who_likes_me, Privilege.online_match_tickets, Privilege.letter, Privilege.liked_user, Privilege.boost, Privilege.advanced_filter, Privilege.message_read_state, Privilege.privacy_membership, Privilege.recover_unmatches});

    /* JADX INFO: renamed from: c */
    public C0271a f5427c;

    /* JADX INFO: renamed from: d */
    public boolean f5428d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContent$a */
    public static class C0271a extends dac0<Privilege> {

        /* JADX INFO: renamed from: c */
        public ArrayList<Privilege> f5429c;

        /* JADX INFO: renamed from: d */
        public PurchaseType f5430d;

        /* JADX INFO: renamed from: e */
        public PutongFrag f5431e;

        /* JADX INFO: renamed from: f */
        public boolean f5432f;

        public C0271a(PutongFrag putongFrag, PurchaseType purchaseType, boolean z) {
            this.f5431e = putongFrag;
            this.f5430d = purchaseType;
            this.f5432f = z;
            if (!CoreModule.m1854P().m11706a().m5444h5() || this.f5432f) {
                this.f5429c = yx80.b(purchaseType);
            } else {
                this.f5429c = fy80.A();
            }
        }

        /* JADX INFO: renamed from: C */
        public int m8158C() {
            return this.f5429c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m8159D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f5431e.m1542H2().inflate(m6c0.D2, viewGroup, false);
            }
            boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
            PutongFrag putongFrag = this.f5431e;
            if (zM5444h5) {
                SVipContentItemView sVipContentItemView = (SVipContentItemView) putongFrag.m1542H2().inflate(m6c0.a2, viewGroup, false);
                if (this.f5432f) {
                    sVipContentItemView.m8115s();
                }
                return sVipContentItemView;
            }
            VipContentItemView vipContentItemView = (VipContentItemView) putongFrag.m1542H2().inflate(m6c0.a3, viewGroup, false);
            if (this.f5432f) {
                vipContentItemView.m8250m();
            }
            return vipContentItemView;
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m8157A(View view, Privilege privilege, final int i, int i2) {
            if (i == 0 || i == 2) {
                if (view instanceof SVipContentItemView) {
                    ((SVipContentItemView) view).m8111o(this, privilege, new VipContentItemView.InterfaceC0274a() { // from class: l.efl0
                        @Override // com.p000p1.mobile.putong.core.p004ui.result.VipContentItemView.InterfaceC0274a
                        /* JADX INFO: renamed from: a */
                        public final void mo8251a(Privilege privilege2) {
                            this.f11129a.m8162I(i, privilege2);
                        }
                    }, i == 2, this.f5430d);
                } else {
                    ((VipContentItemView) view).m8247j(privilege, new VipContentItemView.InterfaceC0274a() { // from class: l.ffl0
                        @Override // com.p000p1.mobile.putong.core.p004ui.result.VipContentItemView.InterfaceC0274a
                        /* JADX INFO: renamed from: a */
                        public final void mo8251a(Privilege privilege2) {
                            this.f12707a.m8163J(privilege2);
                        }
                    }, this.f5431e.act());
                }
            }
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Privilege getItem(int i) {
            return this.f5429c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m8162I(int i, Privilege privilege) {
            CoreModule.f1543l.m11706a().m5231Bp(this.f5431e, i);
            C0275a c0275a = new C0275a(this.f5431e);
            c0275a.m8276y(i == 2 ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : PurchaseType.TYPE_GET_VIP);
            c0275a.m8275x(privilege);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m8163J(Privilege privilege) {
            C0275a c0275a = new C0275a(this.f5431e);
            c0275a.m8276y(this.f5430d);
            c0275a.m8275x(privilege);
        }

        public long getItemId(int i) {
            return i;
        }

        public int getItemViewType(int i) {
            if (this.f5429c.get(i) == Privilege.svip_badge) {
                return 1;
            }
            return VipContent.f5426e.contains(this.f5429c.get(i)) ? 2 : 0;
        }
    }

    public VipContent(Context context) {
        super(context);
        this.f5428d = false;
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
        setPadding(0, t100.d(hmb.m1() * 10.0f), 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public void m8153H(PutongFrag putongFrag) {
        if (this.f5427c == null) {
            setLayoutManager(new LinearLayoutManager(getContext()));
            C0271a c0271a = new C0271a(putongFrag, PurchaseType.TYPE_GET_VIP, this.f5428d);
            this.f5427c = c0271a;
            setAdapter(c0271a);
            this.f5427c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m8154I() {
        this.f5428d = true;
    }

    @Override // p006l.q8b0
    /* JADX INFO: renamed from: w */
    public void mo8070w(PutongFrag putongFrag) {
        if (NullChecker.a(putongFrag)) {
            m8153H(putongFrag);
        }
    }

    public VipContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5428d = false;
        init();
    }

    public VipContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5428d = false;
        init();
    }
}
