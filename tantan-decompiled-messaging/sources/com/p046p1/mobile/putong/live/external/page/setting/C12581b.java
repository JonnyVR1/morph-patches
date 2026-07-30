package com.p046p1.mobile.putong.live.external.page.setting;

import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.page.setting.C12580a;
import com.p046p1.mobile.putong.live.external.page.setting.C12581b;
import p149l.bwr;
import p149l.e30;
import p149l.ffw;
import p149l.jo0;
import p149l.lsi0;
import p149l.mcr;
import p149l.s9s;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.b */
/* JADX INFO: loaded from: classes13.dex */
public class C12581b extends bwr<LiveFollowPushSettingAct> {

    /* JADX INFO: renamed from: a */
    public a f46181a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.setting.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo70775a(C12580a c12580a, boolean z);
    }

    public C12581b(mcr mcrVar) {
        super(mcrVar);
        this.f46181a = new a() { // from class: l.ids
            @Override // com.p046p1.mobile.putong.live.external.page.setting.C12581b.a
            /* JADX INFO: renamed from: a */
            public final void mo70775a(C12580a c12580a, boolean z) {
                this.f112680a.m70773H2(c12580a, z);
            }
        };
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m70762s2(BaseLiveBean baseLiveBean) {
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m70763u2(BaseLiveBean baseLiveBean) {
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m70767A2(BaseLiveListBean baseLiveListBean) {
        if (baseLiveListBean == null || vwb.m200296J(baseLiveListBean.list)) {
            ((LiveFollowPushSettingAct) this.viewModel).m70691d2(null);
        } else {
            ((LiveFollowPushSettingAct) this.viewModel).m70691d2(baseLiveListBean.list);
        }
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m70768B2(Throwable th) {
        ((LiveFollowPushSettingAct) this.viewModel).m70692e2();
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44147Z));
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m70769C2(boolean z, Throwable th) {
        ((LiveFollowPushSettingAct) this.viewModel).m70694h2(!z);
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44147Z));
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m70770D2(String str, boolean z, Throwable th) {
        ((LiveFollowPushSettingAct) this.viewModel).m70696k2(str, !z);
        lsi0.m151595y(s9s.f163227a.getString(R$string.f44147Z));
    }

    /* JADX INFO: renamed from: E2 */
    public void m70771E2() {
        ((LiveFollowPushSettingAct) this.viewModel).m70693g2();
        duringCreated(LiveSquareApi.getFollowPushNoticeList()).subscribe(ffw.m121194e(new e30() { // from class: l.jds
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117436a.m70767A2((BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.kds
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122618a.m70768B2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F2 */
    public void m70772F2() {
        V v2 = this.viewModel;
        if (v2 == 0 || vwb.m200296J(((LiveFollowPushSettingAct) v2).m70690b2())) {
            return;
        }
        final boolean z = !((LiveFollowPushSettingAct) this.viewModel).m70689a2();
        ((LiveFollowPushSettingAct) this.viewModel).m70694h2(z);
        duringCreated(LiveSquareApi.updateAllFollowPushStatus(z)).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.lds
            @Override // p149l.e30
            public final void call(Object obj) {
                C12581b.m70763u2((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.mds
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133308a.m70769C2(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public final void m70773H2(C12580a c12580a, final boolean z) {
        final String str = c12580a.m70755H().anchorId;
        ((LiveFollowPushSettingAct) this.viewModel).m70696k2(str, z);
        duringCreated(LiveSquareApi.updateFollowPushStatus(str, z)).subscribe(ffw.m121194e(new e30() { // from class: l.nds
            @Override // p149l.e30
            public final void call(Object obj) {
                C12581b.m70762s2((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.ods
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143238a.m70770D2(str, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public a m70774z2() {
        return this.f46181a;
    }
}
