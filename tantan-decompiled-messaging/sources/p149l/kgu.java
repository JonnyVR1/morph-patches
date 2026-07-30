package p149l;

import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaignNotifyData;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class kgu extends zeu<LiveVChatCampaignView> {

    /* JADX INFO: renamed from: f */
    public int f123076f;

    /* JADX INFO: renamed from: g */
    public List<BLiveCampaign> f123077g;

    /* JADX INFO: renamed from: h */
    public String f123078h;

    public kgu(jlu jluVar, LiveVChatCampaignView liveVChatCampaignView) {
        super(jluVar);
        mo51532C(liveVChatCampaignView);
    }

    /* JADX INFO: renamed from: c3 */
    private void m145910c3(final BLiveCampaign bLiveCampaign, final long j) {
        m218409H2().m203918R(new e30() { // from class: l.agu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69517a.m145923m3(j, bLiveCampaign, (Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    private List<BLiveCampaign> m145911d3(List<BLiveCampaign> list) {
        ArrayList arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.zfu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202980a.m145915k3((BLiveCampaign) obj);
            }
        });
        this.f123077g = arrayListM200339n;
        return arrayListM200339n;
    }

    /* JADX INFO: renamed from: h3 */
    private void m145912h3(final String str) {
        BLiveCampaign bLiveCampaign = (BLiveCampaign) vwb.m200346r(this.f123077g, new w9j() { // from class: l.igu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCampaign) obj).f44348id, str));
            }
        });
        if (bLiveCampaign != null) {
            m145928r3(bLiveCampaign);
        }
    }

    /* JADX INFO: renamed from: i3 */
    private void m145913i3(BLiveCampaign bLiveCampaign, long j) {
        BLiveCampaignNotifyData bLiveCampaignNotifyDataNew_ = BLiveCampaignNotifyData.new_();
        bLiveCampaignNotifyDataNew_.campaignId = bLiveCampaign.f44348id;
        bLiveCampaignNotifyDataNew_.roomId = m218409H2().m203945v();
        bLiveCampaignNotifyDataNew_.liveId = m218409H2().m203942s();
        bLiveCampaignNotifyDataNew_.duration = j;
        bLiveCampaignNotifyDataNew_.anchorId = m218409H2().m203938o();
        zfv.m218573j0(bLiveCampaignNotifyDataNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j3 */
    public void m145914j3(String str) {
        boolean zEquals = VoiceCallStatus.calling.equals(str);
        xdl0.m208344M((View) this.viewModel, zEquals);
        if (zEquals) {
            m145929s3();
            m145916t3();
            ((LiveVChatCampaignView) this.viewModel).setAutoplay(true);
        } else {
            ((LiveVChatCampaignView) this.viewModel).m69314m();
            this.f123076f = 0;
            this.f123078h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public Boolean m145915k3(BLiveCampaign bLiveCampaign) {
        if (!vwb.m200296J(bLiveCampaign.validPeriod)) {
            if (bLiveCampaign.validPeriod.size() > 1) {
                long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
                long jLongValue = bLiveCampaign.validPeriod.get(0).longValue() * 1000;
                return Boolean.valueOf((jGuessedCurrentServerTime >= jLongValue || jLongValue - jGuessedCurrentServerTime <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) && jGuessedCurrentServerTime <= bLiveCampaign.validPeriod.get(1).longValue() * 1000);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: t3 */
    private void m145916t3() {
        duringCreated(m218409H2().f186998c.m216979l().m189092c()).subscribe(ffw.m121193d(new e30() { // from class: l.hgu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107662a.m145925o3((LongLinkSocketMessage.PopUp) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u3 */
    private void m145917u3() {
        vwb.m200354z(this.f123077g, new e30() { // from class: l.jgu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117829a.m145926p3((BLiveCampaign) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    private void m145918v3() {
        duringCreated(((ggv) ypv.m215673l(fld0.f98148c)).m126021g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.ggu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102537a.m145927q3((nc4) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public void m145919x3(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            m145929s3();
        } else if (((LongLinkGiftMessage.LiveCampaignInfo) vwb.m200346r(list, new w9j() { // from class: l.dgu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkGiftMessage.LiveCampaignInfo) obj).getType() == LongLinkGiftMessage.LiveCampaignType.List);
            }
        })) != null) {
            m145929s3();
        } else {
            ((LiveVChatCampaignView) this.viewModel).m69321x(list);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m218408F2(ee4.class, new w9j() { // from class: l.yfu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(this.f198093a.m145922g3((ee4) obj));
            }
        });
        duringCreated(m218409H2().f186998c.m216979l().m189152w()).subscribe(ffw.m121193d(new e30() { // from class: l.bgu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75498a.m145919x3((List) obj);
            }
        }));
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.cgu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80800a.m145914j3((String) obj);
            }
        }));
        m145918v3();
    }

    /* JADX INFO: renamed from: e3 */
    public String m145920e3() {
        return this.f123078h;
    }

    /* JADX INFO: renamed from: f3 */
    public String m145921f3() {
        String strM153592b = m95.m153590c(act()).m153592b();
        if (TextUtils.isEmpty(strM153592b)) {
            return null;
        }
        try {
            if (!Pattern.matches("tantan:.*邀请码：[A-Z|1-9]{4,}", strM153592b)) {
                return null;
            }
            Matcher matcher = Pattern.compile("[A-Z|1-9]{4,}").matcher(strM153592b);
            matcher.find();
            return matcher.group(matcher.groupCount());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g3 */
    public int m145922g3(lql lqlVar) {
        if (this.f123076f > 600) {
            this.f123076f = 600;
        }
        return this.f123076f;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m145923m3(long j, BLiveCampaign bLiveCampaign, Long l2) {
        if (l2.longValue() == j) {
            m145913i3(bLiveCampaign, j);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m145924n3(List list) {
        ((LiveVChatCampaignView) this.viewModel).m69323z(m145911d3(list));
        m145917u3();
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m145925o3(LongLinkSocketMessage.PopUp popUp) {
        m145912h3(popUp.getCampaignId());
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m145926p3(BLiveCampaign bLiveCampaign) {
        long j = bLiveCampaign.popUpRules.liveWatchDuration;
        if (j > 0) {
            m145910c3(bLiveCampaign, j);
        }
        if (m218414N2()) {
            long j2 = bLiveCampaign.popUpRules.anchorLiveDuration;
            if (j2 > 0) {
                m145910c3(bLiveCampaign, j2);
            }
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m145927q3(nc4 nc4Var) {
        if (nc4Var.m158879b()) {
            m145912h3(nc4Var.m158878a());
        } else if (nc4Var.m158880c()) {
            m218411K2().SchemeHandleEvent.m69202a().mo172463j(new w1e0.C20784a(1300).m200924e(nc4Var.m158878a()).m200922c());
        }
    }

    /* JADX INFO: renamed from: r3 */
    public void m145928r3(BLiveCampaign bLiveCampaign) {
        if (TextUtils.isEmpty(bLiveCampaign.schema)) {
            m218411K2().LiveVChatOpenH5Event.m69190b().mo172463j(xnu.m210211c(500).m210238p(bLiveCampaign).m210237o());
        } else {
            m218411K2().SchemeHandleEvent.m69202a().mo172463j(new w1e0.C20784a(1300).m200924e(bLiveCampaign.schema).m200922c());
        }
    }

    /* JADX INFO: renamed from: s3 */
    public void m145929s3() {
        if (TextUtils.isEmpty(m218409H2().m203938o())) {
            return;
        }
        duringCreated(iuu.m138452M(m145921f3(), m218409H2().m203901A().anchorId, m218409H2().m203901A().userId)).subscribe(ffw.m121194e(new e30() { // from class: l.egu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91212a.m145924n3((List) obj);
            }
        }, new e30() { // from class: l.fgu
            @Override // p149l.e30
            public final void call(Object obj) {
                hfw.m130790a("[live]campaign", "loadLiveCampaigns message = " + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX INFO: renamed from: w3 */
    public void m145930w3(String str) {
        this.f123078h = str;
    }
}
