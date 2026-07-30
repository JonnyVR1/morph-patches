package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.Priority;
import com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import java.io.File;
import java.util.List;
import l.e30;
import l.ffw;
import l.hjw;
import l.i7m;
import l.j7m;
import l.mkd0;
import l.o4l0;
import l.q4l0;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class f6l0 extends AbstractC0675m4 {

    /* JADX INFO: renamed from: l.f6l0$a */
    public interface InterfaceC0557a {
        /* JADX INFO: renamed from: a */
        void mo10170a(q4l0 q4l0Var);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m12960i(VideoEffectPlayer videoEffectPlayer, dqe dqeVar) {
        videoEffectPlayer.stop();
        xdl0.M(videoEffectPlayer, false);
        if (dqeVar.m11980b() != null) {
            dqeVar.m11980b().call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m12961j(InterfaceC0557a interfaceC0557a, q4l0 q4l0Var) {
        if (interfaceC0557a != null) {
            interfaceC0557a.mo10170a(q4l0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m12962k(VideoEffectPlayer videoEffectPlayer, int i, String str) {
        videoEffectPlayer.stop();
        xdl0.M(videoEffectPlayer, false);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12963l(final dqe dqeVar, BLiveEffect bLiveEffect, final VideoEffectPlayer videoEffectPlayer, q4l0 q4l0Var) {
        if (q4l0Var == null) {
            return;
        }
        if (dqeVar.m11986h() != null) {
            dqeVar.m11986h().call(q4l0Var, bLiveEffect);
        }
        xdl0.M(videoEffectPlayer, true);
        videoEffectPlayer.setVideoEffectConfig(new o4l0.a().c(q4l0Var).d(o4l0.j).e(new hjw()).b((List) null).a());
        videoEffectPlayer.prepare();
        videoEffectPlayer.start();
        videoEffectPlayer.setCompletionListener(new i7m() { // from class: l.d6l0
            public final void onCompletion() {
                f6l0.m12960i(videoEffectPlayer, dqeVar);
            }
        });
        videoEffectPlayer.setOnErrorListener(new j7m() { // from class: l.e6l0
            public final boolean onError(int i, String str) {
                return f6l0.m12962k(videoEffectPlayer, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static void m12964n(final VideoEffectPlayer videoEffectPlayer, final dqe dqeVar) {
        final BLiveEffect bLiveEffectM22602b;
        if (videoEffectPlayer == null || TextUtils.isEmpty(dqeVar.m11985g())) {
            return;
        }
        if ((dqeVar.m11984f() == null || ((Boolean) dqeVar.m11984f().call()).booleanValue()) && (bLiveEffectM22602b = spe.m22602b(dqeVar.m11985g(), new e30() { // from class: l.a6l0
            public final void call(Object obj) {
                f6l0.m12964n(videoEffectPlayer, dqeVar);
            }
        })) != null) {
            videoEffectPlayer.stop();
            ((f6l0) spe.m22604d("video")).m12965m(bLiveEffectM22602b.id, bLiveEffectM22602b.hdType, bLiveEffectM22602b.zip, bLiveEffectM22602b.md5, new InterfaceC0557a() { // from class: l.b6l0
                @Override // p002l.f6l0.InterfaceC0557a
                /* JADX INFO: renamed from: a */
                public final void mo10170a(q4l0 q4l0Var) {
                    f6l0.m12963l(dqeVar, bLiveEffectM22602b, videoEffectPlayer, q4l0Var);
                }
            });
        }
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: b */
    public String mo11105b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f15228a.m27091p(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: d */
    public boolean mo11106d(BLiveEffect bLiveEffect) {
        File fileM27090o = this.f15228a.m27090o(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip);
        if (this.f15228a.m21933v(fileM27090o, bLiveEffect.id)) {
            if (new File(q4l0.a(fileM27090o.getAbsolutePath())).exists()) {
                aqe.m10039i().m10041e(bLiveEffect.id);
                return true;
            }
            wrj.m25427u("effect no config" + bLiveEffect.id);
        }
        return false;
    }

    @Override // p002l.AbstractC0675m4
    /* JADX INFO: renamed from: f */
    public boolean mo11107f(String str, boolean z, h7e h7eVar, bwc0 bwc0Var) {
        BLiveEffect bLiveEffectM17694c = m17694c(str);
        if (bLiveEffectM17694c == null) {
            return false;
        }
        File fileM27090o = this.f15228a.m27090o(bLiveEffectM17694c.id, bLiveEffectM17694c.hdType, bLiveEffectM17694c.zip);
        if (this.f15228a.m21933v(fileM27090o, str)) {
            if (new File(q4l0.a(fileM27090o.getAbsolutePath())).exists()) {
                aqe.m10039i().m10041e(str);
                return true;
            }
            wrj.m25427u("effect no config" + str);
        } else if (z) {
            this.f15228a.m27083f(str, bLiveEffectM17694c.hdType, bLiveEffectM17694c.zip, bLiveEffectM17694c.md5, Priority.get("IMMEDIATE"), h7eVar, bwc0Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m12965m(String str, String str2, String str3, String str4, final InterfaceC0557a interfaceC0557a) {
        c.just(this.f15228a.m27091p(str, str2, str3)).map(new cge()).compose(mkd0.C()).subscribe(ffw.d(new e30() { // from class: l.c6l0
            public final void call(Object obj) {
                f6l0.m12961j(interfaceC0557a, (q4l0) obj);
            }
        }));
    }
}
