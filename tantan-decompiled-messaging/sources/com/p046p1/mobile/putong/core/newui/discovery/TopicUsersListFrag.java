package com.p046p1.mobile.putong.core.newui.discovery;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import com.p046p1.mobile.putong.core.newui.view.CoreEmptyView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p149l.e30;
import p149l.e51;
import p149l.j760;
import p149l.mkd0;
import p149l.n3b0;
import p149l.rgj;
import p149l.stg0;
import p149l.v2j0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class TopicUsersListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public CoreEmptyView f21380A;

    /* JADX INFO: renamed from: B */
    public stg0 f21381B;

    /* JADX INFO: renamed from: C */
    public GPTopicCard f21382C;

    /* JADX INFO: renamed from: z */
    public RecyclerView f21383z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.TopicUsersListFrag$a */
    public class C7842a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f21384a;

        public C7842a(GridLayoutManager gridLayoutManager) {
            this.f21384a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            int itemViewType = TopicUsersListFrag.this.f21381B.getItemViewType(i);
            stg0 stg0Var = TopicUsersListFrag.this.f21381B;
            if (itemViewType == 1 || itemViewType == 2) {
                return this.f21384a.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ LookingFor m36333Y4(User user) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.settings)) {
            return user.settings.lookingFor;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m36335c5(Bundle bundle) {
        CoreModule.f17545c.f19639e0.m169521o7(this.f21382C.name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public /* synthetic */ void m36336h5(List list) {
        CoreModule.f17545c.f19639e0.m169378Ca(this.f21382C.name, list);
        if (vwb.m200296J(list)) {
            m36348n5();
        } else {
            m36340b5();
            this.f21381B.m185948J(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m36337i5(Throwable th) {
        m36348n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m36338j5(Integer num) {
        CoreModule.f17545c.f19639e0.m169521o7(this.f21382C.name);
    }

    /* JADX INFO: renamed from: a5 */
    public View m36339a5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v2j0.m196792b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m36340b5() {
        xdl0.m208344M(this.f21383z, true);
        xdl0.m208344M(this.f21380A, false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f21382C = (GPTopicCard) getArguments().getSerializable("type_topic_name");
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m36341d5(GPTopicCard gPTopicCard) {
        return Boolean.valueOf(TextUtils.equals(gPTopicCard.name, this.f21382C.name));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ j760 m36342e5(List list) {
        GPTopicCard gPTopicCard = (GPTopicCard) vwb.m200346r(list, new w9j() { // from class: l.k2j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120739a.m36341d5((GPTopicCard) obj);
            }
        });
        return j760.m140076a(gPTopicCard, Integer.valueOf(gPTopicCard.headerDesc));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.h2j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105537a.m36335c5((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.f149430n1).map(new w9j() { // from class: l.n2j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136839a.m36344g5((HashMap) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.o2j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141535a.m36336h5((List) obj);
            }
        }, new e30() { // from class: l.p2j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146864a.m36337i5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.m31483n3()).map(new w9j() { // from class: l.q2j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).likersLimit.remaining);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.r2j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157420a.m36338j5((Integer) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.s2j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TopicUsersListFrag.m36333Y4((User) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.t2j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167482a.m36346l5((LookingFor) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.f149422m1).filter(new w9j() { // from class: l.u2j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).map(new w9j() { // from class: l.i2j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f110557a.m36342e5((List) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.m2j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130929a.m36343f5((j760) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m36343f5(j760 j760Var) {
        if (NullChecker.m81303a(j760Var) && NullChecker.m81303a(j760Var.f116564a)) {
            GPTopicCard gPTopicCard = (GPTopicCard) j760Var.f116564a;
            this.f21382C = gPTopicCard;
            this.f21381B.m185949K(gPTopicCard);
            this.f21381B.notifyDataSetChanged();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f21381B = new stg0(act(), this.f21382C, new e30() { // from class: l.j2j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115931a.m36347m5((User) obj);
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        gridLayoutManager.m3326v(new C7842a(gridLayoutManager));
        this.f21383z.setLayoutManager(gridLayoutManager);
        this.f21383z.setAdapter(this.f21381B);
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ List m36344g5(HashMap map) {
        List arrayList = (List) map.get(this.f21382C.name);
        if (vwb.m200296J(arrayList)) {
            arrayList = new ArrayList();
        }
        return n3b0.m157742q() ? vwb.m200334k0(arrayList, 10) : arrayList;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m36339a5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m36345k5() {
        CoreModule.f17545c.f19639e0.m169521o7(this.f21382C.name);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m36346l5(LookingFor lookingFor) {
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.l2j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f125792a.m36345k5();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m36347m5(User user) {
        String str;
        if (!rgj.m179167a(this.f21382C.name)) {
            act().startActivity(ProfileAct.m50738p2(act(), user.f56011id, "from_theme_recommendation", true, false));
            return;
        }
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(this.f21382C.name, SuperlikeReason.popular)) {
            privilege = Privilege.see_theme_unlock_pop;
            str = "unlock_popular";
        } else {
            str = "unlock_online";
        }
        CoreModule.m29935P().m94651a().mo33622wr(act(), str, privilege);
    }

    /* JADX INFO: renamed from: n5 */
    public final void m36348n5() {
        this.f21381B.m185948J(new ArrayList());
        xdl0.m208344M(this.f21380A, true);
    }
}
