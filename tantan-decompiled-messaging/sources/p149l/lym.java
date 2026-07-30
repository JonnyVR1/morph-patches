package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class lym<V extends LiveInternalPushBaseView> extends aym<V> {

    /* JADX INFO: renamed from: b */
    public c4g0 f130584b;

    /* JADX INFO: renamed from: c */
    public c4g0 f130585c;

    public lym(zxm zxmVar) {
        super(zxmVar);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m152280o(zxm zxmVar, boolean z) {
        if (NullChecker.m81303a(zxmVar.f205470n)) {
            zxmVar.f205470n.setTouchable(z);
            zxmVar.f205470n.update();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m152282q(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static c4g0 m152284t(final aym aymVar, zxm zxmVar) {
        String str = zxmVar.f205466j.tabId;
        if (str != null && !TextUtils.isEmpty(str) && str.contains("bigCard") && !TextUtils.isEmpty(zxmVar.f205466j.type)) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            if (TextUtils.equals(zxmVar.f205466j.type, "popExperimentStyleA")) {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceRoomCard;
            } else if (TextUtils.equals(zxmVar.f205466j.type, "popExperimentStyleB")) {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceNewCard;
            }
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.extensionObject = zxmVar.f205467k;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new j760(userInfo, 0));
            CoreModule.f17545c.f19663m0.m31162y6(arrayList);
            return TextUtils.equals(zxmVar.f205466j.type, "popExperimentStyleA") ? CoreModule.m29936Q().mo67262co().mo202776d().subscribe(mkd0.m154955G(new e30() { // from class: l.gym
                @Override // p149l.e30
                public final void call(Object obj) {
                    aymVar.f72298a.m220844J();
                }
            })) : CoreModule.m29936Q().mo67223I6().mo123343d().subscribe(mkd0.m154955G(new e30() { // from class: l.hym
                @Override // p149l.e30
                public final void call(Object obj) {
                    aymVar.f72298a.m220844J();
                }
            }));
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static void m152285u() {
        if (CoreModule.f17545c.f19663m0.m31140r6() != null && CoreModule.f17545c.f19663m0.m31140r6().f19472id.equals(CoreSuggested.UserInfo.VIRTUAL_CARD)) {
            if (CoreModule.f17545c.f19663m0.m31140r6().virtualCardType.equals(VirtualCardType.LiveVoiceRoomCard) || CoreModule.f17545c.f19663m0.m31140r6().virtualCardType.equals(VirtualCardType.LiveVoiceNewCard)) {
                CoreModule.f17545c.f19663m0.m30986C8("internal_push_big_style_vitual_voice");
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m152286w(zxm zxmVar) {
        String str = zxmVar.f205466j.tabId;
        return (str == null || TextUtils.isEmpty(str) || !str.contains("bigCard") || TextUtils.isEmpty(zxmVar.f205466j.type)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public static void m152287x(zxm zxmVar) {
        String str;
        if (TextUtils.isEmpty(zxmVar.f205467k.link) || zxmVar.f205469m == null) {
            return;
        }
        String str2 = zxmVar.f205467k.link;
        if (str2 != null && !str2.contains("source=")) {
            zxmVar.f205467k.link = zxmVar.f205467k.link + "&source=start-push";
        }
        String str3 = zxmVar.f205467k.link;
        if (str3 != null && !str3.contains("liveMode=virtualAvatar")) {
            zxmVar.f205467k.link = zxmVar.f205467k.link + "&liveMode=virtualAvatar";
        }
        String str4 = zxmVar.f205467k.link;
        if (str4 != null && !str4.contains("from=")) {
            zxmVar.f205467k.link = zxmVar.f205467k.link + "&from=from_in_app_push";
        }
        j2e0.m139446m(zxmVar.f205469m, Uri.parse(zxmVar.f205467k.link));
        if (TextUtils.equals(zxmVar.f205466j.extra, "popExperimentStyle2")) {
            PushMessageCustom pushMessageCustom = zxmVar.f205466j;
            str = pushMessageCustom.userId.equals(pushMessageCustom.otherID) ? "anchor" : "audience_voicechat";
        } else {
            str = "NA";
        }
        zvf0.m220399u("e_live_audio_room_enter", "p_live_inner_broadcast", vwb.m200311Y("anchorId", zxmVar.f205466j.userId), vwb.m200311Y("liveId", zxmVar.f205466j.liveId), vwb.m200311Y("audio_broadcast_page_id", zxmVar.m220845K()), vwb.m200311Y("ralationship_type", zxmVar.f205466j.state), vwb.m200311Y("audio_card_type", TextUtils.equals(zxmVar.f205466j.extra, "popExperimentStyle2") ? "audio_broadcast" : "audio_broadcast_room"), vwb.m200311Y("user_type", str), vwb.m200311Y("source", zxmVar.f205466j.source), vwb.m200311Y("test_group_name", zxmVar.f205466j.testGroupName));
    }

    /* JADX INFO: renamed from: A */
    public boolean m152288A(zxm zxmVar) {
        String str = zxmVar.f205467k.messageCustom.tabId;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList = vwb.m200304R(str.split(Constants.SEPARATOR_COMMA), new w9j() { // from class: l.fym
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((String) obj).replace("message", "msg");
                }
            });
        }
        TabName tabNameM197534h = v930.m197534h();
        return arrayList.contains(tabNameM197534h != null ? tabNameM197534h.toString() : "");
    }

    /* JADX INFO: renamed from: B */
    public c4g0 m152289B(final View view, final zxm zxmVar) {
        return v930.m197537k().distinctUntilChanged().skip(1).subscribe(mkd0.m154956H(new e30() { // from class: l.iym
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115464a.m152291v(view, zxmVar, (TabName) obj);
            }
        }, new e30() { // from class: l.jym
            @Override // p149l.e30
            public final void call(Object obj) {
                lym.m152282q((Throwable) obj);
            }
        }));
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: b */
    public int mo99571b() {
        return 30000;
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
        m152287x(this.f72298a);
        CoreModule.m29936Q().mo67225Ir("click", this.f72298a.f205466j.source);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: g */
    public void mo99572g(uys uysVar) {
        super.mo99572g(uysVar);
        mkd0.m154992z(this.f130584b);
        mkd0.m154992z(this.f130585c);
        m152285u();
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: h */
    public void mo37887h() {
        CoreModule.m29936Q().mo67225Ir("exposure", this.f72298a.f205466j.source);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: i */
    public void mo37888i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: j */
    public void mo37889j(V v2) {
        zxm zxmVar = this.f72298a;
        v2.mo37831b(zxmVar.f205467k, zxmVar.f205465i.getAct());
        xdl0.m208344M(v2, m152288A(this.f72298a));
        this.f130585c = m152284t(this, this.f72298a);
        this.f130584b = m152289B(v2, this.f72298a);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo37890k() {
        return m152293z(this.f72298a);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: l */
    public void mo37891l() {
        String str;
        m152290s().getClass();
        if (TextUtils.equals(this.f72298a.f205466j.extra, "popExperimentStyle2")) {
            PushMessageCustom pushMessageCustom = this.f72298a.f205466j;
            str = pushMessageCustom.userId.equals(pushMessageCustom.otherID) ? "anchor" : "audience_voicechat";
        } else {
            str = "NA";
        }
        zvf0.m220368A("e_live_audio_room_enter", "p_live_inner_broadcast", vwb.m200311Y("anchorId", this.f72298a.f205466j.userId), vwb.m200311Y("liveId", this.f72298a.f205466j.liveId), vwb.m200311Y("audio_broadcast_page_id", this.f72298a.m220845K()), vwb.m200311Y("ralationship_type", this.f72298a.f205466j.state), vwb.m200311Y("audio_card_type", TextUtils.equals(this.f72298a.f205466j.extra, "popExperimentStyle2") ? "audio_broadcast" : "audio_broadcast_room"), vwb.m200311Y("user_type", str), vwb.m200311Y("source", this.f72298a.f205466j.source), vwb.m200311Y("test_group_name", this.f72298a.f205466j.testGroupName));
    }

    /* JADX INFO: renamed from: s */
    public String m152290s() {
        return this.f72298a.f205467k.messageCustom.alertId;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m152291v(View view, zxm zxmVar, TabName tabName) {
        m152292y(view, zxmVar);
    }

    /* JADX INFO: renamed from: y */
    public final void m152292y(View view, final zxm zxmVar) {
        final boolean zM152288A = m152288A(zxmVar);
        view.setVisibility(zM152288A ? 0 : 4);
        view.post(new Runnable() { // from class: l.kym
            @Override // java.lang.Runnable
            public final void run() {
                lym.m152280o(zxmVar, zM152288A);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public boolean m152293z(zxm zxmVar) {
        return m152288A(zxmVar) || m152286w(zxmVar);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: e */
    public void mo37885e() {
    }
}
