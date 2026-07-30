package com.p051p1.mobile.putong.core.newui.discovery;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import com.p051p1.mobile.putong.core.newui.view.CoreEmptyView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p153l.a2h0;
import p153l.bnl0;
import p153l.jyb;
import p153l.l51;
import p153l.ljj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rbb0;
import p153l.y20;
import p153l.zbj0;

/* JADX INFO: loaded from: classes11.dex */
public class TopicUsersListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public CoreEmptyView f22122A;

    /* JADX INFO: renamed from: B */
    public a2h0 f22123B;

    /* JADX INFO: renamed from: C */
    public GPTopicCard f22124C;

    /* JADX INFO: renamed from: z */
    public RecyclerView f22125z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.TopicUsersListFrag$a */
    public class C7993a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f22126a;

        public C7993a(GridLayoutManager gridLayoutManager) {
            this.f22126a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            int itemViewType = TopicUsersListFrag.this.f22123B.getItemViewType(i);
            a2h0 a2h0Var = TopicUsersListFrag.this.f22123B;
            if (itemViewType == 1 || itemViewType == 2) {
                return this.f22126a.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ LookingFor m37336Y4(User user) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.settings)) {
            return user.settings.lookingFor;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m37338c5(Bundle bundle) {
        CoreModule.f18264c.f20381e0.m116594o7(this.f22124C.name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public /* synthetic */ void m37339h5(List list) {
        CoreModule.f18264c.f20381e0.m116451Ca(this.f22124C.name, list);
        if (jyb.m147479J(list)) {
            m37351n5();
        } else {
            m37343b5();
            this.f22123B.m95672J(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m37340i5(Throwable th) {
        m37351n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m37341j5(Integer num) {
        CoreModule.f18264c.f20381e0.m116594o7(this.f22124C.name);
    }

    /* JADX INFO: renamed from: a5 */
    public View m37342a5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zbj0.m219196b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m37343b5() {
        bnl0.m105524M(this.f22125z, true);
        bnl0.m105524M(this.f22122A, false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f22124C = (GPTopicCard) getArguments().getSerializable("type_topic_name");
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m37344d5(GPTopicCard gPTopicCard) {
        return Boolean.valueOf(TextUtils.equals(gPTopicCard.name, this.f22124C.name));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ pf60 m37345e5(List list) {
        GPTopicCard gPTopicCard = (GPTopicCard) jyb.m147529r(list, new qcj() { // from class: l.obj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146593a.m37344d5((GPTopicCard) obj);
            }
        });
        return pf60.m172085a(gPTopicCard, Integer.valueOf(gPTopicCard.headerDesc));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.lbj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131209a.m37338c5((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.f89287n1).map(new qcj() { // from class: l.rbj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162027a.m37347g5((HashMap) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.sbj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167149a.m37339h5((List) obj);
            }
        }, new y20() { // from class: l.tbj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172968a.m37340i5((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.m32486n3()).map(new qcj() { // from class: l.ubj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).likersLimit.remaining);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.vbj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183256a.m37341j5((Integer) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.wbj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TopicUsersListFrag.m37336Y4((User) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.xbj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193166a.m37349l5((LookingFor) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.f89279m1).filter(new qcj() { // from class: l.ybj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).map(new qcj() { // from class: l.mbj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f135731a.m37345e5((List) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.qbj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156485a.m37346f5((pf60) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m37346f5(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var) && NullChecker.m82486a(pf60Var.f152156a)) {
            GPTopicCard gPTopicCard = (GPTopicCard) pf60Var.f152156a;
            this.f22124C = gPTopicCard;
            this.f22123B.m95673K(gPTopicCard);
            this.f22123B.notifyDataSetChanged();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f22123B = new a2h0(act(), this.f22124C, new y20() { // from class: l.nbj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141234a.m37350m5((User) obj);
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        gridLayoutManager.m3327v(new C7993a(gridLayoutManager));
        this.f22125z.setLayoutManager(gridLayoutManager);
        this.f22125z.setAdapter(this.f22123B);
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ List m37347g5(HashMap map) {
        List arrayList = (List) map.get(this.f22124C.name);
        if (jyb.m147479J(arrayList)) {
            arrayList = new ArrayList();
        }
        return rbb0.m180744q() ? jyb.m147517k0(arrayList, 10) : arrayList;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m37342a5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m37348k5() {
        CoreModule.f18264c.f20381e0.m116594o7(this.f22124C.name);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m37349l5(LookingFor lookingFor) {
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.pbj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151391a.m37348k5();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m37350m5(User user) {
        String str;
        if (!ljj.m154509a(this.f22124C.name)) {
            act().startActivity(ProfileAct.m51922q2(act(), user.f56859id, "from_theme_recommendation", true, false));
            return;
        }
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(this.f22124C.name, SuperlikeReason.popular)) {
            privilege = Privilege.see_theme_unlock_pop;
            str = "unlock_popular";
        } else {
            str = "unlock_online";
        }
        CoreModule.m30933P().m143405a().mo34625wr(act(), str, privilege);
    }

    /* JADX INFO: renamed from: n5 */
    public final void m37351n5() {
        this.f22123B.m95672J(new ArrayList());
        bnl0.m105524M(this.f22122A, true);
    }
}
