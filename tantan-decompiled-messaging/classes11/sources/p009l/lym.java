package p009l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c4g0;
import l.e30;
import l.j2e0;
import l.j760;
import l.mkd0;
import l.v930;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lym<V extends LiveInternalPushBaseView> extends aym<V> {

    /* JADX INFO: renamed from: b */
    public c4g0 f16445b;

    /* JADX INFO: renamed from: c */
    public c4g0 f16446c;

    public lym(zxm zxmVar) {
        super(zxmVar);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m18078o(zxm zxmVar, boolean z) {
        if (NullChecker.a(zxmVar.f24028n)) {
            zxmVar.f24028n.setTouchable(z);
            zxmVar.f24028n.update();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m18080q(Throwable th) {
    }

    /* JADX INFO: renamed from: t */
    public static c4g0 m18082t(final aym aymVar, zxm zxmVar) {
        String str = zxmVar.f24024j.tabId;
        if (str != null && !TextUtils.isEmpty(str) && str.contains("bigCard") && !TextUtils.isEmpty(zxmVar.f24024j.type)) {
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            if (TextUtils.equals(zxmVar.f24024j.type, "popExperimentStyleA")) {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceRoomCard;
            } else if (TextUtils.equals(zxmVar.f24024j.type, "popExperimentStyleB")) {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceNewCard;
            }
            userInfo.id = "VirtualCard";
            userInfo.extensionObject = zxmVar.f24025k;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new j760(userInfo, 0));
            CoreModule.c.m0.y6(arrayList);
            return TextUtils.equals(zxmVar.f24024j.type, "popExperimentStyleA") ? CoreModule.Q().m9047co().m24098d().subscribe(mkd0.G(new e30() { // from class: l.gym
                public final void call(Object obj) {
                    aymVar.f9776a.m26111J();
                }
            })) : CoreModule.Q().m9013I6().m14595d().subscribe(mkd0.G(new e30() { // from class: l.hym
                public final void call(Object obj) {
                    aymVar.f9776a.m26111J();
                }
            }));
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static void m18083u() {
        if (CoreModule.c.m0.r6() != null && CoreModule.c.m0.r6().id.equals("VirtualCard")) {
            if (CoreModule.c.m0.r6().virtualCardType.equals(VirtualCardType.LiveVoiceRoomCard) || CoreModule.c.m0.r6().virtualCardType.equals(VirtualCardType.LiveVoiceNewCard)) {
                CoreModule.c.m0.C8("internal_push_big_style_vitual_voice");
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m18084w(zxm zxmVar) {
        String str = zxmVar.f24024j.tabId;
        return (str == null || TextUtils.isEmpty(str) || !str.contains("bigCard") || TextUtils.isEmpty(zxmVar.f24024j.type)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public static void m18085x(zxm zxmVar) {
        String str;
        if (TextUtils.isEmpty(zxmVar.f24025k.link) || zxmVar.f24027m == null) {
            return;
        }
        String str2 = zxmVar.f24025k.link;
        if (str2 != null && !str2.contains("source=")) {
            zxmVar.f24025k.link = zxmVar.f24025k.link + "&source=start-push";
        }
        String str3 = zxmVar.f24025k.link;
        if (str3 != null && !str3.contains("liveMode=virtualAvatar")) {
            zxmVar.f24025k.link = zxmVar.f24025k.link + "&liveMode=virtualAvatar";
        }
        String str4 = zxmVar.f24025k.link;
        if (str4 != null && !str4.contains("from=")) {
            zxmVar.f24025k.link = zxmVar.f24025k.link + "&from=from_in_app_push";
        }
        j2e0.m(zxmVar.f24027m, Uri.parse(zxmVar.f24025k.link));
        if (TextUtils.equals(zxmVar.f24024j.extra, "popExperimentStyle2")) {
            PushMessageCustom pushMessageCustom = zxmVar.f24024j;
            str = pushMessageCustom.userId.equals(pushMessageCustom.otherID) ? "anchor" : "audience_voicechat";
        } else {
            str = "NA";
        }
        zvf0.u("e_live_audio_room_enter", "p_live_inner_broadcast", new j760[]{vwb.Y("anchorId", zxmVar.f24024j.userId), vwb.Y("liveId", zxmVar.f24024j.liveId), vwb.Y("audio_broadcast_page_id", zxmVar.m26112K()), vwb.Y("ralationship_type", zxmVar.f24024j.state), vwb.Y("audio_card_type", TextUtils.equals(zxmVar.f24024j.extra, "popExperimentStyle2") ? "audio_broadcast" : "audio_broadcast_room"), vwb.Y("user_type", str), vwb.Y("source", zxmVar.f24024j.source), vwb.Y("test_group_name", zxmVar.f24024j.testGroupName)});
    }

    /* JADX INFO: renamed from: A */
    public boolean m18086A(zxm zxmVar) {
        String str = zxmVar.f24025k.messageCustom.tabId;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList = vwb.R(str.split(","), new w9j() { // from class: l.fym
                public final Object call(Object obj) {
                    return ((String) obj).replace("message", "msg");
                }
            });
        }
        TabName tabNameH = v930.h();
        return arrayList.contains(tabNameH != null ? tabNameH.toString() : "");
    }

    /* JADX INFO: renamed from: B */
    public c4g0 m18087B(final View view, final zxm zxmVar) {
        return v930.k().distinctUntilChanged().skip(1).subscribe(mkd0.H(new e30() { // from class: l.iym
            public final void call(Object obj) {
                this.f14860a.m18089v(view, zxmVar, (TabName) obj);
            }
        }, new e30() { // from class: l.jym
            public final void call(Object obj) {
                lym.m18080q((Throwable) obj);
            }
        }));
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: b */
    public int mo11771b() {
        return 30000;
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
        m18085x(this.f9776a);
        CoreModule.Q().m9015Ir("click", this.f9776a.f24024j.source);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: g */
    public void mo11772g(uys uysVar) {
        super.mo11772g(uysVar);
        mkd0.z(this.f16445b);
        mkd0.z(this.f16446c);
        m18083u();
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: h */
    public void mo1858h() {
        CoreModule.Q().m9015Ir("exposure", this.f9776a.f24024j.source);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: i */
    public void mo1859i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: j */
    public void mo1860j(V v) {
        zxm zxmVar = this.f9776a;
        v.mo1802b(zxmVar.f24025k, zxmVar.f24023i.act());
        xdl0.M(v, m18086A(this.f9776a));
        this.f16446c = m18082t(this, this.f9776a);
        this.f16445b = m18087B(v, this.f9776a);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo1861k() {
        return m18091z(this.f9776a);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: l */
    public void mo1862l() {
        String str;
        m18088s().getClass();
        if (TextUtils.equals(this.f9776a.f24024j.extra, "popExperimentStyle2")) {
            PushMessageCustom pushMessageCustom = this.f9776a.f24024j;
            str = pushMessageCustom.userId.equals(pushMessageCustom.otherID) ? "anchor" : "audience_voicechat";
        } else {
            str = "NA";
        }
        zvf0.A("e_live_audio_room_enter", "p_live_inner_broadcast", new j760[]{vwb.Y("anchorId", this.f9776a.f24024j.userId), vwb.Y("liveId", this.f9776a.f24024j.liveId), vwb.Y("audio_broadcast_page_id", this.f9776a.m26112K()), vwb.Y("ralationship_type", this.f9776a.f24024j.state), vwb.Y("audio_card_type", TextUtils.equals(this.f9776a.f24024j.extra, "popExperimentStyle2") ? "audio_broadcast" : "audio_broadcast_room"), vwb.Y("user_type", str), vwb.Y("source", this.f9776a.f24024j.source), vwb.Y("test_group_name", this.f9776a.f24024j.testGroupName)});
    }

    /* JADX INFO: renamed from: s */
    public String m18088s() {
        return this.f9776a.f24025k.messageCustom.alertId;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m18089v(View view, zxm zxmVar, TabName tabName) {
        m18090y(view, zxmVar);
    }

    /* JADX INFO: renamed from: y */
    public final void m18090y(View view, final zxm zxmVar) {
        final boolean zM18086A = m18086A(zxmVar);
        view.setVisibility(zM18086A ? 0 : 4);
        view.post(new Runnable() { // from class: l.kym
            @Override // java.lang.Runnable
            public final void run() {
                lym.m18078o(zxmVar, zM18086A);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public boolean m18091z(zxm zxmVar) {
        return m18086A(zxmVar) || m18084w(zxmVar);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: e */
    public void mo1856e() {
    }
}
