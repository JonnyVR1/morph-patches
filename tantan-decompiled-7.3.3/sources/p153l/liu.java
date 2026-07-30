package p153l;

import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaignNotifyData;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class liu extends ahu<LiveVChatCampaignView> {

    /* JADX INFO: renamed from: f */
    public int f132251f;

    /* JADX INFO: renamed from: g */
    public List<BLiveCampaign> f132252g;

    /* JADX INFO: renamed from: h */
    public String f132253h;

    public liu(knu knuVar, LiveVChatCampaignView liveVChatCampaignView) {
        super(knuVar);
        mo52715C(liveVChatCampaignView);
    }

    /* JADX INFO: renamed from: c3 */
    private void m154393c3(final BLiveCampaign bLiveCampaign, final long j) {
        m97926H2().m212325R(new y20() { // from class: l.biu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76916a.m154406m3(j, bLiveCampaign, (Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    private List<BLiveCampaign> m154394d3(List<BLiveCampaign> list) {
        ArrayList arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.aiu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71577a.m154398k3((BLiveCampaign) obj);
            }
        });
        this.f132252g = arrayListM147522n;
        return arrayListM147522n;
    }

    /* JADX INFO: renamed from: h3 */
    private void m154395h3(final String str) {
        BLiveCampaign bLiveCampaign = (BLiveCampaign) jyb.m147529r(this.f132252g, new qcj() { // from class: l.jiu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCampaign) obj).f45196id, str));
            }
        });
        if (bLiveCampaign != null) {
            m154411r3(bLiveCampaign);
        }
    }

    /* JADX INFO: renamed from: i3 */
    private void m154396i3(BLiveCampaign bLiveCampaign, long j) {
        BLiveCampaignNotifyData bLiveCampaignNotifyDataNew_ = BLiveCampaignNotifyData.new_();
        bLiveCampaignNotifyDataNew_.campaignId = bLiveCampaign.f45196id;
        bLiveCampaignNotifyDataNew_.roomId = m97926H2().m212352v();
        bLiveCampaignNotifyDataNew_.liveId = m97926H2().m212349s();
        bLiveCampaignNotifyDataNew_.duration = j;
        bLiveCampaignNotifyDataNew_.anchorId = m97926H2().m212345o();
        aiv.m98107j0(bLiveCampaignNotifyDataNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j3 */
    public void m154397j3(String str) {
        boolean zEquals = VoiceCallStatus.calling.equals(str);
        bnl0.m105524M((View) this.viewModel, zEquals);
        if (zEquals) {
            m154412s3();
            m154399t3();
            ((LiveVChatCampaignView) this.viewModel).setAutoplay(true);
        } else {
            ((LiveVChatCampaignView) this.viewModel).m70497m();
            this.f132251f = 0;
            this.f132253h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public Boolean m154398k3(BLiveCampaign bLiveCampaign) {
        if (!jyb.m147479J(bLiveCampaign.validPeriod)) {
            if (bLiveCampaign.validPeriod.size() > 1) {
                long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
                long jLongValue = bLiveCampaign.validPeriod.get(0).longValue() * 1000;
                return Boolean.valueOf((jGuessedCurrentServerTime >= jLongValue || jLongValue - jGuessedCurrentServerTime <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) && jGuessedCurrentServerTime <= bLiveCampaign.validPeriod.get(1).longValue() * 1000);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: t3 */
    private void m154399t3() {
        duringCreated(m97926H2().f195472c.m120391l().m98274c()).subscribe(dhw.m115825d(new y20() { // from class: l.iiu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115138a.m154408o3((LongLinkSocketMessage.PopUp) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u3 */
    private void m154400u3() {
        jyb.m147537z(this.f132252g, new y20() { // from class: l.kiu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127033a.m154409p3((BLiveCampaign) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    private void m154401v3() {
        duringCreated(((hiv) zrv.m221194l(htd0.f111521c)).m135155g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.hiu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110068a.m154410q3((md4) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public void m154402x3(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            m154412s3();
        } else if (((LongLinkGiftMessage.LiveCampaignInfo) jyb.m147529r(list, new qcj() { // from class: l.eiu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkGiftMessage.LiveCampaignInfo) obj).getType() == LongLinkGiftMessage.LiveCampaignType.List);
            }
        })) != null) {
            m154412s3();
        } else {
            ((LiveVChatCampaignView) this.viewModel).m70504x(list);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m97925F2(df4.class, new qcj() { // from class: l.zhu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(this.f204461a.m154405g3((df4) obj));
            }
        });
        duringCreated(m97926H2().f195472c.m120391l().m98334w()).subscribe(dhw.m115825d(new y20() { // from class: l.ciu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81990a.m154402x3((List) obj);
            }
        }));
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.diu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88710a.m154397j3((String) obj);
            }
        }));
        m154401v3();
    }

    /* JADX INFO: renamed from: e3 */
    public String m154403e3() {
        return this.f132253h;
    }

    /* JADX INFO: renamed from: f3 */
    public String m154404f3() {
        String strM162058b = na5.m162056c(act()).m162058b();
        if (TextUtils.isEmpty(strM162058b)) {
            return null;
        }
        try {
            if (!Pattern.matches("tantan:.*邀请码：[A-Z|1-9]{4,}", strM162058b)) {
                return null;
            }
            Matcher matcher = Pattern.compile("[A-Z|1-9]{4,}").matcher(strM162058b);
            matcher.find();
            return matcher.group(matcher.groupCount());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g3 */
    public int m154405g3(xsl xslVar) {
        if (this.f132251f > 600) {
            this.f132251f = 600;
        }
        return this.f132251f;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m154406m3(long j, BLiveCampaign bLiveCampaign, Long l2) {
        if (l2.longValue() == j) {
            m154396i3(bLiveCampaign, j);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m154407n3(List list) {
        ((LiveVChatCampaignView) this.viewModel).m70506z(m154394d3(list));
        m154400u3();
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m154408o3(LongLinkSocketMessage.PopUp popUp) {
        m154395h3(popUp.getCampaignId());
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m154409p3(BLiveCampaign bLiveCampaign) {
        long j = bLiveCampaign.popUpRules.liveWatchDuration;
        if (j > 0) {
            m154393c3(bLiveCampaign, j);
        }
        if (m97931N2()) {
            long j2 = bLiveCampaign.popUpRules.anchorLiveDuration;
            if (j2 > 0) {
                m154393c3(bLiveCampaign, j2);
            }
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m154410q3(md4 md4Var) {
        if (md4Var.m157956b()) {
            m154395h3(md4Var.m157955a());
        } else if (md4Var.m157957c()) {
            m97928K2().SchemeHandleEvent.m70385a().mo199273j(new aae0.C15676a(1300).m96628e(md4Var.m157955a()).m96626c());
        }
    }

    /* JADX INFO: renamed from: r3 */
    public void m154411r3(BLiveCampaign bLiveCampaign) {
        if (TextUtils.isEmpty(bLiveCampaign.schema)) {
            m97928K2().LiveVChatOpenH5Event.m70373b().mo199273j(ypu.m217033c(500).m217060p(bLiveCampaign).m217059o());
        } else {
            m97928K2().SchemeHandleEvent.m70385a().mo199273j(new aae0.C15676a(1300).m96628e(bLiveCampaign.schema).m96626c());
        }
    }

    /* JADX INFO: renamed from: s3 */
    public void m154412s3() {
        if (TextUtils.isEmpty(m97926H2().m212345o())) {
            return;
        }
        duringCreated(jwu.m147238M(m154404f3(), m97926H2().m212308A().anchorId, m97926H2().m212308A().userId)).subscribe(dhw.m115826e(new y20() { // from class: l.fiu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99266a.m154407n3((List) obj);
            }
        }, new y20() { // from class: l.giu
            @Override // p153l.y20
            public final void call(Object obj) {
                fhw.m125605a("[live]campaign", "loadLiveCampaigns message = " + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX INFO: renamed from: w3 */
    public void m154413w3(String str) {
        this.f132253h = str;
    }
}
