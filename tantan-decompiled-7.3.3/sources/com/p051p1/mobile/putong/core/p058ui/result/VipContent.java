package com.p051p1.mobile.putong.core.p058ui.result;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VRecyclerView;
import p153l.c690;
import p153l.j690;
import p153l.jic0;
import p153l.jyb;
import p153l.qa00;
import p153l.rec0;
import p153l.ugb0;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class VipContent extends VRecyclerView implements ugb0 {

    /* JADX INFO: renamed from: e */
    public static final ArrayList<Privilege> f36493e = jyb.m147507f0(Privilege.see_who_likes_me, Privilege.online_match_tickets, Privilege.letter, Privilege.liked_user, Privilege.boost, Privilege.advanced_filter, Privilege.message_read_state, Privilege.privacy_membership, Privilege.recover_unmatches);

    /* JADX INFO: renamed from: c */
    public C8998a f36494c;

    /* JADX INFO: renamed from: d */
    public boolean f36495d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContent$a */
    public static class C8998a extends jic0<Privilege> {

        /* JADX INFO: renamed from: c */
        public ArrayList<Privilege> f36496c;

        /* JADX INFO: renamed from: d */
        public PurchaseType f36497d;

        /* JADX INFO: renamed from: e */
        public PutongFrag f36498e;

        /* JADX INFO: renamed from: f */
        public boolean f36499f;

        public C8998a(PutongFrag putongFrag, PurchaseType purchaseType, boolean z) {
            this.f36498e = putongFrag;
            this.f36497d = purchaseType;
            this.f36499f = z;
            if (!CoreModule.m30933P().m143405a().mo34510h5() || this.f36499f) {
                this.f36496c = c690.m108123b(purchaseType);
            } else {
                this.f36496c = j690.m143606A();
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f36496c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f36498e.mo21577H2().inflate(rec0.f162432D2, viewGroup, false);
            }
            boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
            PutongFrag putongFrag = this.f36498e;
            if (zMo34510h5) {
                SVipContentItemView sVipContentItemView = (SVipContentItemView) putongFrag.mo21577H2().inflate(rec0.f162524a2, viewGroup, false);
                if (this.f36499f) {
                    sVipContentItemView.m55940s();
                }
                return sVipContentItemView;
            }
            VipContentItemView vipContentItemView = (VipContentItemView) putongFrag.mo21577H2().inflate(rec0.f162525a3, viewGroup, false);
            if (this.f36499f) {
                vipContentItemView.m56072m();
            }
            return vipContentItemView;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, Privilege privilege, final int i, int i2) {
            if (i == 0 || i == 2) {
                if (view instanceof SVipContentItemView) {
                    ((SVipContentItemView) view).m55936o(this, privilege, new VipContentItemView.InterfaceC9001a() { // from class: l.iol0
                        @Override // com.p051p1.mobile.putong.core.p058ui.result.VipContentItemView.InterfaceC9001a
                        /* JADX INFO: renamed from: a */
                        public final void mo56073a(Privilege privilege2) {
                            this.f116181a.m55984I(i, privilege2);
                        }
                    }, i == 2, this.f36497d);
                } else {
                    ((VipContentItemView) view).m56069j(privilege, new VipContentItemView.InterfaceC9001a() { // from class: l.jol0
                        @Override // com.p051p1.mobile.putong.core.p058ui.result.VipContentItemView.InterfaceC9001a
                        /* JADX INFO: renamed from: a */
                        public final void mo56073a(Privilege privilege2) {
                            this.f122037a.m55985J(privilege2);
                        }
                    }, this.f36498e.act());
                }
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Privilege getItem(int i) {
            return this.f36496c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m55984I(int i, Privilege privilege) {
            CoreModule.f18273l.m143405a().mo34297Bp(this.f36498e, i);
            C9002a c9002a = new C9002a(this.f36498e);
            c9002a.m56098y(i == 2 ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : PurchaseType.TYPE_GET_VIP);
            c9002a.m56097x(privilege);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m55985J(Privilege privilege) {
            C9002a c9002a = new C9002a(this.f36498e);
            c9002a.m56098y(this.f36497d);
            c9002a.m56097x(privilege);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (this.f36496c.get(i) == Privilege.svip_badge) {
                return 1;
            }
            return VipContent.f36493e.contains(this.f36496c.get(i)) ? 2 : 0;
        }
    }

    public VipContent(Context context) {
        super(context);
        this.f36495d = false;
        init();
    }

    private void init() {
        setOverScrollMode(2);
        setPadding(0, qa00.m175859d(vnb.m201953m1() * 10.0f), 0, 0);
    }

    /* JADX INFO: renamed from: H */
    public void m55978H(PutongFrag putongFrag) {
        if (this.f36494c == null) {
            setLayoutManager(new LinearLayoutManager(getContext()));
            C8998a c8998a = new C8998a(putongFrag, PurchaseType.TYPE_GET_VIP, this.f36495d);
            this.f36494c = c8998a;
            setAdapter(c8998a);
            this.f36494c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m55979I() {
        this.f36495d = true;
    }

    @Override // p153l.ugb0
    /* JADX INFO: renamed from: w */
    public void mo55896w(PutongFrag putongFrag) {
        if (NullChecker.m82486a(putongFrag)) {
            m55978H(putongFrag);
        }
    }

    public VipContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36495d = false;
        init();
    }

    public VipContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36495d = false;
        init();
    }
}
