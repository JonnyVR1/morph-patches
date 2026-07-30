package com.p051p1.mobile.putong.live.external.page.setting;

import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.page.setting.C12743a;
import com.p051p1.mobile.putong.live.external.page.setting.C12744b;
import p153l.cyr;
import p153l.dhw;
import p153l.fo0;
import p153l.jyb;
import p153l.ner;
import p153l.o1j0;
import p153l.tbs;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.b */
/* JADX INFO: loaded from: classes9.dex */
public class C12744b extends cyr<LiveFollowPushSettingAct> {

    /* JADX INFO: renamed from: a */
    public a f47029a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo71958a(C12743a c12743a, boolean z);
    }

    public C12744b(ner nerVar) {
        super(nerVar);
        this.f47029a = new a() { // from class: l.jfs
            @Override // com.p051p1.mobile.putong.live.external.page.setting.C12744b.a
            /* JADX INFO: renamed from: a */
            public final void mo71958a(C12743a c12743a, boolean z) {
                this.f120618a.m71956H2(c12743a, z);
            }
        };
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m71945s2(BaseLiveBean baseLiveBean) {
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m71946u2(BaseLiveBean baseLiveBean) {
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m71950A2(BaseLiveListBean baseLiveListBean) {
        if (baseLiveListBean == null || jyb.m147479J(baseLiveListBean.list)) {
            ((LiveFollowPushSettingAct) this.viewModel).m71874e2(null);
        } else {
            ((LiveFollowPushSettingAct) this.viewModel).m71874e2(baseLiveListBean.list);
        }
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m71951B2(Throwable th) {
        ((LiveFollowPushSettingAct) this.viewModel).m71875g2();
        o1j0.m165651y(tbs.f172988a.getString(R$string.f44995Z));
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m71952C2(boolean z, Throwable th) {
        ((LiveFollowPushSettingAct) this.viewModel).m71877i2(!z);
        o1j0.m165651y(tbs.f172988a.getString(R$string.f44995Z));
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m71953D2(String str, boolean z, Throwable th) {
        ((LiveFollowPushSettingAct) this.viewModel).m71879l2(str, !z);
        o1j0.m165651y(tbs.f172988a.getString(R$string.f44995Z));
    }

    /* JADX INFO: renamed from: E2 */
    public void m71954E2() {
        ((LiveFollowPushSettingAct) this.viewModel).m71876h2();
        duringCreated(LiveSquareApi.getFollowPushNoticeList()).subscribe(dhw.m115826e(new y20() { // from class: l.kfs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126500a.m71950A2((BaseLiveListBean) obj);
            }
        }, new y20() { // from class: l.lfs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131895a.m71951B2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F2 */
    public void m71955F2() {
        V v2 = this.viewModel;
        if (v2 == 0 || jyb.m147479J(((LiveFollowPushSettingAct) v2).m71873c2())) {
            return;
        }
        final boolean z = !((LiveFollowPushSettingAct) this.viewModel).m71872b2();
        ((LiveFollowPushSettingAct) this.viewModel).m71877i2(z);
        duringCreated(LiveSquareApi.updateAllFollowPushStatus(z)).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.mfs
            @Override // p153l.y20
            public final void call(Object obj) {
                C12744b.m71946u2((BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.nfs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141757a.m71952C2(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public final void m71956H2(C12743a c12743a, final boolean z) {
        final String str = c12743a.m71938H().anchorId;
        ((LiveFollowPushSettingAct) this.viewModel).m71879l2(str, z);
        duringCreated(LiveSquareApi.updateFollowPushStatus(str, z)).subscribe(dhw.m115826e(new y20() { // from class: l.ofs
            @Override // p153l.y20
            public final void call(Object obj) {
                C12744b.m71945s2((BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.pfs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152203a.m71953D2(str, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public a m71957z2() {
        return this.f47029a;
    }
}
