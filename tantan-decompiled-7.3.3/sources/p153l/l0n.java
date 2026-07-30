package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class l0n<V extends LiveInternalPushBaseView> extends a0n<V> {

    /* JADX INFO: renamed from: b */
    public kcg0 f129575b;

    /* JADX INFO: renamed from: c */
    public kcg0 f129576c;

    public l0n(zzm zzmVar) {
        super(zzmVar);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m152358o(zzm zzmVar, boolean z) {
        if (NullChecker.m82486a(zzmVar.f206722n)) {
            zzmVar.f206722n.setTouchable(z);
            zzmVar.f206722n.update();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m152360q(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static kcg0 m152362t(final a0n a0nVar, zzm zzmVar) {
        String str = zzmVar.f206718j.tabId;
        if (str != null && !TextUtils.isEmpty(str) && str.contains("bigCard") && !TextUtils.isEmpty(zzmVar.f206718j.type)) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            if (TextUtils.equals(zzmVar.f206718j.type, "popExperimentStyleA")) {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceRoomCard;
            } else if (TextUtils.equals(zzmVar.f206718j.type, "popExperimentStyleB")) {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceNewCard;
            }
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.extensionObject = zzmVar.f206719k;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new pf60(userInfo, 0));
            CoreModule.f18264c.f20405m0.m32165y6(arrayList);
            return TextUtils.equals(zzmVar.f206718j.type, "popExperimentStyleA") ? CoreModule.m30934Q().mo68445co().mo99021d().subscribe(psd0.m173596G(new y20() { // from class: l.g0n
                @Override // p153l.y20
                public final void call(Object obj) {
                    a0nVar.f67729a.m222272J();
                }
            })) : CoreModule.m30934Q().mo68406I6().mo143445d().subscribe(psd0.m173596G(new y20() { // from class: l.h0n
                @Override // p153l.y20
                public final void call(Object obj) {
                    a0nVar.f67729a.m222272J();
                }
            }));
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static void m152363u() {
        if (CoreModule.f18264c.f20405m0.m32143r6() != null && CoreModule.f18264c.f20405m0.m32143r6().f20214id.equals(CoreSuggested.UserInfo.VIRTUAL_CARD)) {
            if (CoreModule.f18264c.f20405m0.m32143r6().virtualCardType.equals(VirtualCardType.LiveVoiceRoomCard) || CoreModule.f18264c.f20405m0.m32143r6().virtualCardType.equals(VirtualCardType.LiveVoiceNewCard)) {
                CoreModule.f18264c.f20405m0.m31989C8("internal_push_big_style_vitual_voice");
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m152364w(zzm zzmVar) {
        String str = zzmVar.f206718j.tabId;
        return (str == null || TextUtils.isEmpty(str) || !str.contains("bigCard") || TextUtils.isEmpty(zzmVar.f206718j.type)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public static void m152365x(zzm zzmVar) {
        String str;
        if (TextUtils.isEmpty(zzmVar.f206719k.link) || zzmVar.f206721m == null) {
            return;
        }
        String str2 = zzmVar.f206719k.link;
        if (str2 != null && !str2.contains("source=")) {
            zzmVar.f206719k.link = zzmVar.f206719k.link + "&source=start-push";
        }
        String str3 = zzmVar.f206719k.link;
        if (str3 != null && !str3.contains("liveMode=virtualAvatar")) {
            zzmVar.f206719k.link = zzmVar.f206719k.link + "&liveMode=virtualAvatar";
        }
        String str4 = zzmVar.f206719k.link;
        if (str4 != null && !str4.contains("from=")) {
            zzmVar.f206719k.link = zzmVar.f206719k.link + "&from=from_in_app_push";
        }
        nae0.m162083m(zzmVar.f206721m, Uri.parse(zzmVar.f206719k.link));
        if (TextUtils.equals(zzmVar.f206718j.extra, "popExperimentStyle2")) {
            PushMessageCustom pushMessageCustom = zzmVar.f206718j;
            str = pushMessageCustom.userId.equals(pushMessageCustom.otherID) ? "anchor" : "audience_voicechat";
        } else {
            str = "NA";
        }
        i4g0.m138523u("e_live_audio_room_enter", "p_live_inner_broadcast", jyb.m147494Y("anchorId", zzmVar.f206718j.userId), jyb.m147494Y("liveId", zzmVar.f206718j.liveId), jyb.m147494Y("audio_broadcast_page_id", zzmVar.m222273K()), jyb.m147494Y("ralationship_type", zzmVar.f206718j.state), jyb.m147494Y("audio_card_type", TextUtils.equals(zzmVar.f206718j.extra, "popExperimentStyle2") ? "audio_broadcast" : "audio_broadcast_room"), jyb.m147494Y("user_type", str), jyb.m147494Y("source", zzmVar.f206718j.source), jyb.m147494Y("test_group_name", zzmVar.f206718j.testGroupName));
    }

    /* JADX INFO: renamed from: A */
    public boolean m152366A(zzm zzmVar) {
        String str = zzmVar.f206719k.messageCustom.tabId;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList = jyb.m147487R(str.split(Constants.SEPARATOR_COMMA), new qcj() { // from class: l.f0n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((String) obj).replace("message", "msg");
                }
            });
        }
        TabName tabNameM144964h = ji30.m144964h();
        return arrayList.contains(tabNameM144964h != null ? tabNameM144964h.toString() : "");
    }

    /* JADX INFO: renamed from: B */
    public kcg0 m152367B(final View view, final zzm zzmVar) {
        return ji30.m144967k().distinctUntilChanged().skip(1).subscribe(psd0.m173597H(new y20() { // from class: l.i0n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112420a.m152369v(view, zzmVar, (TabName) obj);
            }
        }, new y20() { // from class: l.j0n
            @Override // p153l.y20
            public final void call(Object obj) {
                l0n.m152360q((Throwable) obj);
            }
        }));
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: b */
    public int mo95407b() {
        return 30000;
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
        m152365x(this.f67729a);
        CoreModule.m30934Q().mo68408Ir("click", this.f67729a.f206718j.source);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: g */
    public void mo95408g(v0t v0tVar) {
        super.mo95408g(v0tVar);
        psd0.m173633z(this.f129575b);
        psd0.m173633z(this.f129576c);
        m152363u();
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: h */
    public void mo38890h() {
        CoreModule.m30934Q().mo68408Ir("exposure", this.f67729a.f206718j.source);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: i */
    public void mo38891i(v0t v0tVar) {
        if (v0tVar.isShowing()) {
            v0tVar.dismiss();
        }
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: j */
    public void mo38892j(V v2) {
        zzm zzmVar = this.f67729a;
        v2.mo38834b(zzmVar.f206719k, zzmVar.f206717i.getAct());
        bnl0.m105524M(v2, m152366A(this.f67729a));
        this.f129576c = m152362t(this, this.f67729a);
        this.f129575b = m152367B(v2, this.f67729a);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: k */
    public boolean mo38893k() {
        return m152371z(this.f67729a);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: l */
    public void mo38894l() {
        String str;
        m152368s().getClass();
        if (TextUtils.equals(this.f67729a.f206718j.extra, "popExperimentStyle2")) {
            PushMessageCustom pushMessageCustom = this.f67729a.f206718j;
            str = pushMessageCustom.userId.equals(pushMessageCustom.otherID) ? "anchor" : "audience_voicechat";
        } else {
            str = "NA";
        }
        i4g0.m138492A("e_live_audio_room_enter", "p_live_inner_broadcast", jyb.m147494Y("anchorId", this.f67729a.f206718j.userId), jyb.m147494Y("liveId", this.f67729a.f206718j.liveId), jyb.m147494Y("audio_broadcast_page_id", this.f67729a.m222273K()), jyb.m147494Y("ralationship_type", this.f67729a.f206718j.state), jyb.m147494Y("audio_card_type", TextUtils.equals(this.f67729a.f206718j.extra, "popExperimentStyle2") ? "audio_broadcast" : "audio_broadcast_room"), jyb.m147494Y("user_type", str), jyb.m147494Y("source", this.f67729a.f206718j.source), jyb.m147494Y("test_group_name", this.f67729a.f206718j.testGroupName));
    }

    /* JADX INFO: renamed from: s */
    public String m152368s() {
        return this.f67729a.f206719k.messageCustom.alertId;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m152369v(View view, zzm zzmVar, TabName tabName) {
        m152370y(view, zzmVar);
    }

    /* JADX INFO: renamed from: y */
    public final void m152370y(View view, final zzm zzmVar) {
        final boolean zM152366A = m152366A(zzmVar);
        view.setVisibility(zM152366A ? 0 : 4);
        view.post(new Runnable() { // from class: l.k0n
            @Override // java.lang.Runnable
            public final void run() {
                l0n.m152358o(zzmVar, zM152366A);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public boolean m152371z(zzm zzmVar) {
        return m152366A(zzmVar) || m152364w(zzmVar);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: e */
    public void mo38888e() {
    }
}
