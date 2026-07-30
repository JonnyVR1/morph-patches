package com.p000p1.mobile.putong.core.newui.discovery;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import com.p000p1.mobile.putong.core.newui.view.CoreEmptyView;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.GPTopicCard;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.n3b0;
import l.v2j0;
import l.vwb;
import l.w9j;
import l.xdl0;
import p009l.rgj;
import p009l.stg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TopicUsersListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public CoreEmptyView f158A;

    /* JADX INFO: renamed from: B */
    public stg0 f159B;

    /* JADX INFO: renamed from: C */
    public GPTopicCard f160C;

    /* JADX INFO: renamed from: z */
    public RecyclerView f161z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.TopicUsersListFrag$a */
    public class C0006a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f162a;

        public C0006a(GridLayoutManager gridLayoutManager) {
            this.f162a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m273f(int i) {
            int itemViewType = TopicUsersListFrag.this.f159B.getItemViewType(i);
            stg0 stg0Var = TopicUsersListFrag.this.f159B;
            if (itemViewType == 1 || itemViewType == 2) {
                return this.f162a.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ LookingFor m254Y4(User user) {
        if (NullChecker.a(user) && NullChecker.a(user.settings)) {
            return user.settings.lookingFor;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m256c5(Bundle bundle) {
        CoreModule.c.e0.o7(this.f160C.name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public /* synthetic */ void m257h5(List list) {
        CoreModule.c.e0.Ca(this.f160C.name, list);
        if (vwb.J(list)) {
            m272n5();
        } else {
            m261b5();
            this.f159B.m22392J(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m258i5(Throwable th) {
        m272n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m259j5(Integer num) {
        CoreModule.c.e0.o7(this.f160C.name);
    }

    /* JADX INFO: renamed from: a5 */
    public View m260a5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v2j0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m261b5() {
        xdl0.M(this.f161z, true);
        xdl0.M(this.f158A, false);
    }

    /* JADX INFO: renamed from: d4 */
    public void m262d4() {
        super.d4();
        this.f160C = getArguments().getSerializable("type_topic_name");
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m263d5(GPTopicCard gPTopicCard) {
        return Boolean.valueOf(TextUtils.equals(gPTopicCard.name, this.f160C.name));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ j760 m264e5(List list) {
        GPTopicCard gPTopicCard = (GPTopicCard) vwb.r(list, new w9j() { // from class: l.k2j0
            public final Object call(Object obj) {
                return this.f15393a.m263d5((GPTopicCard) obj);
            }
        });
        return j760.a(gPTopicCard, Integer.valueOf(gPTopicCard.headerDesc));
    }

    /* JADX INFO: renamed from: f4 */
    public void m265f4() {
        super.f4();
        creates(new e30() { // from class: l.h2j0
            public final void call(Object obj) {
                this.f13847a.m256c5((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.n1).map(new w9j() { // from class: l.n2j0
            public final Object call(Object obj) {
                return this.f17200a.m268g5((HashMap) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.o2j0
            public final void call(Object obj) {
                this.f17807a.m257h5((List) obj);
            }
        }, new e30() { // from class: l.p2j0
            public final void call(Object obj) {
                this.f18364a.m258i5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.n3()).map(new w9j() { // from class: l.q2j0
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).likersLimit.remaining);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.r2j0
            public final void call(Object obj) {
                this.f19615a.m259j5((Integer) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.o9()).map(new w9j() { // from class: l.s2j0
            public final Object call(Object obj) {
                return TopicUsersListFrag.m254Y4((User) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.G(new e30() { // from class: l.t2j0
            public final void call(Object obj) {
                this.f20527a.m270l5((LookingFor) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.m1).filter(new w9j() { // from class: l.u2j0
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).map(new w9j() { // from class: l.i2j0
            public final Object call(Object obj) {
                return this.f14384a.m264e5((List) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.G(new e30() { // from class: l.m2j0
            public final void call(Object obj) {
                this.f16490a.m266f5((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m266f5(j760 j760Var) {
        if (NullChecker.a(j760Var) && NullChecker.a(j760Var.a)) {
            GPTopicCard gPTopicCard = (GPTopicCard) j760Var.a;
            this.f160C = gPTopicCard;
            this.f159B.m22393K(gPTopicCard);
            this.f159B.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m267g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f159B = new stg0(act(), this.f160C, new e30() { // from class: l.j2j0
            public final void call(Object obj) {
                this.f14920a.m271m5((User) obj);
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        gridLayoutManager.v(new C0006a(gridLayoutManager));
        this.f161z.setLayoutManager(gridLayoutManager);
        this.f161z.setAdapter(this.f159B);
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ List m268g5(HashMap map) {
        List arrayList = (List) map.get(this.f160C.name);
        if (vwb.J(arrayList)) {
            arrayList = new ArrayList();
        }
        return n3b0.q() ? vwb.k0(arrayList, 10) : arrayList;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m260a5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m269k5() {
        CoreModule.c.e0.o7(this.f160C.name);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m270l5(LookingFor lookingFor) {
        e51.H(CoreModule.b, new Runnable() { // from class: l.l2j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15917a.m269k5();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m271m5(User user) {
        String str;
        if (!rgj.m21658a(this.f160C.name)) {
            act().startActivity(ProfileAct.p2(act(), ((DbObject) user).id, "from_theme_recommendation", true, false));
            return;
        }
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(this.f160C.name, "popular")) {
            privilege = Privilege.see_theme_unlock_pop;
            str = "unlock_popular";
        } else {
            str = "unlock_online";
        }
        CoreModule.P().a().wr(act(), str, privilege);
    }

    /* JADX INFO: renamed from: n5 */
    public final void m272n5() {
        this.f159B.m22392J(new ArrayList());
        xdl0.M(this.f158A, true);
    }
}
