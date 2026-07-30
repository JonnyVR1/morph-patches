package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.Priority;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import java.io.File;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class jfl0 extends AbstractC18340l4 {

    /* JADX INFO: renamed from: l.jfl0$a */
    public interface InterfaceC17940a {
        /* JADX INFO: renamed from: a */
        void mo95516a(udl0 udl0Var);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m144681i(VideoEffectPlayer videoEffectPlayer, hre hreVar) {
        videoEffectPlayer.stop();
        bnl0.m105524M(videoEffectPlayer, false);
        if (hreVar.m136819b() != null) {
            hreVar.m136819b().call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m144682j(InterfaceC17940a interfaceC17940a, udl0 udl0Var) {
        if (interfaceC17940a != null) {
            interfaceC17940a.mo95516a(udl0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m144683k(VideoEffectPlayer videoEffectPlayer, int i, String str) {
        videoEffectPlayer.stop();
        bnl0.m105524M(videoEffectPlayer, false);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m144684l(final hre hreVar, BLiveEffect bLiveEffect, final VideoEffectPlayer videoEffectPlayer, udl0 udl0Var) {
        if (udl0Var == null) {
            return;
        }
        if (hreVar.m136825h() != null) {
            hreVar.m136825h().call(udl0Var, bLiveEffect);
        }
        bnl0.m105524M(videoEffectPlayer, true);
        videoEffectPlayer.setVideoEffectConfig(new sdl0.C20024a().m185480c(udl0Var).m185481d(sdl0.f167422j).m185482e(new gmw()).m185479b(null).m185478a());
        videoEffectPlayer.prepare();
        videoEffectPlayer.start();
        videoEffectPlayer.setCompletionListener(new y9m() { // from class: l.hfl0
            @Override // p153l.y9m
            public final void onCompletion() {
                jfl0.m144681i(videoEffectPlayer, hreVar);
            }
        });
        videoEffectPlayer.setOnErrorListener(new z9m() { // from class: l.ifl0
            @Override // p153l.z9m
            public final boolean onError(int i, String str) {
                return jfl0.m144683k(videoEffectPlayer, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static void m144685n(final VideoEffectPlayer videoEffectPlayer, final hre hreVar) {
        final BLiveEffect bLiveEffectM207507b;
        if (videoEffectPlayer == null || TextUtils.isEmpty(hreVar.m136824g())) {
            return;
        }
        if ((hreVar.m136823f() == null || hreVar.m136823f().call().booleanValue()) && (bLiveEffectM207507b = wqe.m207507b(hreVar.m136824g(), new y20() { // from class: l.efl0
            @Override // p153l.y20
            public final void call(Object obj) {
                jfl0.m144685n(videoEffectPlayer, hreVar);
            }
        })) != null) {
            videoEffectPlayer.stop();
            ((jfl0) wqe.m207509d("video")).m144689m(bLiveEffectM207507b.f45207id, bLiveEffectM207507b.hdType, bLiveEffectM207507b.zip, bLiveEffectM207507b.md5, new InterfaceC17940a() { // from class: l.ffl0
                @Override // p153l.jfl0.InterfaceC17940a
                /* JADX INFO: renamed from: a */
                public final void mo95516a(udl0 udl0Var) {
                    jfl0.m144684l(hreVar, bLiveEffectM207507b, videoEffectPlayer, udl0Var);
                }
            });
        }
    }

    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: b */
    public String mo144686b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f129922a.m204921p(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: d */
    public boolean mo144687d(BLiveEffect bLiveEffect) {
        File fileM204920o = this.f129922a.m204920o(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip);
        if (this.f129922a.m207494v(fileM204920o, bLiveEffect.f45207id)) {
            if (new File(udl0.m195497a(fileM204920o.getAbsolutePath())).exists()) {
                ere.m122146i().m122148e(bLiveEffect.f45207id);
                return true;
            }
            muj.m160219u("effect no config" + bLiveEffect.f45207id);
        }
        return false;
    }

    @Override // p153l.AbstractC18340l4
    /* JADX INFO: renamed from: f */
    public boolean mo144688f(String str, boolean z, w8e w8eVar, e4d0 e4d0Var) {
        BLiveEffect bLiveEffectM152743c = m152743c(str);
        if (bLiveEffectM152743c == null) {
            return false;
        }
        File fileM204920o = this.f129922a.m204920o(bLiveEffectM152743c.f45207id, bLiveEffectM152743c.hdType, bLiveEffectM152743c.zip);
        if (this.f129922a.m207494v(fileM204920o, str)) {
            if (new File(udl0.m195497a(fileM204920o.getAbsolutePath())).exists()) {
                ere.m122146i().m122148e(str);
                return true;
            }
            muj.m160219u("effect no config" + str);
        } else if (z) {
            this.f129922a.m204911f(str, bLiveEffectM152743c.hdType, bLiveEffectM152743c.zip, bLiveEffectM152743c.md5, Priority.get("IMMEDIATE"), w8eVar, e4d0Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m144689m(String str, String str2, String str3, String str4, final InterfaceC17940a interfaceC17940a) {
        C22421c.just(this.f129922a.m204921p(str, str2, str3)).map(new ghe()).compose(psd0.m173592C()).subscribe(dhw.m115825d(new y20() { // from class: l.gfl0
            @Override // p153l.y20
            public final void call(Object obj) {
                jfl0.m144682j(interfaceC17940a, (udl0) obj);
            }
        }));
    }
}
