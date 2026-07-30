package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.Priority;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import java.io.File;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class f6l0 extends AbstractC18387m4 {

    /* JADX INFO: renamed from: l.f6l0$a */
    public interface InterfaceC16768a {
        /* JADX INFO: renamed from: a */
        void mo100430a(q4l0 q4l0Var);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m119623i(VideoEffectPlayer videoEffectPlayer, dqe dqeVar) {
        videoEffectPlayer.stop();
        xdl0.m208344M(videoEffectPlayer, false);
        if (dqeVar.m113008b() != null) {
            dqeVar.m113008b().call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m119624j(InterfaceC16768a interfaceC16768a, q4l0 q4l0Var) {
        if (interfaceC16768a != null) {
            interfaceC16768a.mo100430a(q4l0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m119625k(VideoEffectPlayer videoEffectPlayer, int i, String str) {
        videoEffectPlayer.stop();
        xdl0.m208344M(videoEffectPlayer, false);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m119626l(final dqe dqeVar, BLiveEffect bLiveEffect, final VideoEffectPlayer videoEffectPlayer, q4l0 q4l0Var) {
        if (q4l0Var == null) {
            return;
        }
        if (dqeVar.m113014h() != null) {
            dqeVar.m113014h().call(q4l0Var, bLiveEffect);
        }
        xdl0.m208344M(videoEffectPlayer, true);
        videoEffectPlayer.setVideoEffectConfig(new o4l0.C18841a().m162604c(q4l0Var).m162605d(o4l0.f141782j).m162606e(new hjw()).m162603b(null).m162602a());
        videoEffectPlayer.prepare();
        videoEffectPlayer.start();
        videoEffectPlayer.setCompletionListener(new i7m() { // from class: l.d6l0
            @Override // p149l.i7m
            public final void onCompletion() {
                f6l0.m119623i(videoEffectPlayer, dqeVar);
            }
        });
        videoEffectPlayer.setOnErrorListener(new j7m() { // from class: l.e6l0
            @Override // p149l.j7m
            public final boolean onError(int i, String str) {
                return f6l0.m119625k(videoEffectPlayer, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static void m119627n(final VideoEffectPlayer videoEffectPlayer, final dqe dqeVar) {
        final BLiveEffect bLiveEffectM185363b;
        if (videoEffectPlayer == null || TextUtils.isEmpty(dqeVar.m113013g())) {
            return;
        }
        if ((dqeVar.m113012f() == null || dqeVar.m113012f().call().booleanValue()) && (bLiveEffectM185363b = spe.m185363b(dqeVar.m113013g(), new e30() { // from class: l.a6l0
            @Override // p149l.e30
            public final void call(Object obj) {
                f6l0.m119627n(videoEffectPlayer, dqeVar);
            }
        })) != null) {
            videoEffectPlayer.stop();
            ((f6l0) spe.m185365d("video")).m119628m(bLiveEffectM185363b.f44359id, bLiveEffectM185363b.hdType, bLiveEffectM185363b.zip, bLiveEffectM185363b.md5, new InterfaceC16768a() { // from class: l.b6l0
                @Override // p149l.f6l0.InterfaceC16768a
                /* JADX INFO: renamed from: a */
                public final void mo100430a(q4l0 q4l0Var) {
                    f6l0.m119626l(dqeVar, bLiveEffectM185363b, videoEffectPlayer, q4l0Var);
                }
            });
        }
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: b */
    public String mo107443b(BLiveEffect bLiveEffect) {
        return bLiveEffect == null ? "" : this.f131211a.m217259p(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip);
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: d */
    public boolean mo107444d(BLiveEffect bLiveEffect) {
        File fileM217258o = this.f131211a.m217258o(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip);
        if (this.f131211a.m179253v(fileM217258o, bLiveEffect.f44359id)) {
            if (new File(q4l0.m172943a(fileM217258o.getAbsolutePath())).exists()) {
                aqe.m98261i().m98263e(bLiveEffect.f44359id);
                return true;
            }
            wrj.m205255u("effect no config" + bLiveEffect.f44359id);
        }
        return false;
    }

    @Override // p149l.AbstractC18387m4
    /* JADX INFO: renamed from: f */
    public boolean mo107445f(String str, boolean z, h7e h7eVar, bwc0 bwc0Var) {
        BLiveEffect bLiveEffectM152981c = m152981c(str);
        if (bLiveEffectM152981c == null) {
            return false;
        }
        File fileM217258o = this.f131211a.m217258o(bLiveEffectM152981c.f44359id, bLiveEffectM152981c.hdType, bLiveEffectM152981c.zip);
        if (this.f131211a.m179253v(fileM217258o, str)) {
            if (new File(q4l0.m172943a(fileM217258o.getAbsolutePath())).exists()) {
                aqe.m98261i().m98263e(str);
                return true;
            }
            wrj.m205255u("effect no config" + str);
        } else if (z) {
            this.f131211a.m217251f(str, bLiveEffectM152981c.hdType, bLiveEffectM152981c.zip, bLiveEffectM152981c.md5, Priority.get("IMMEDIATE"), h7eVar, bwc0Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m119628m(String str, String str2, String str3, String str4, final InterfaceC16768a interfaceC16768a) {
        C22306c.just(this.f131211a.m217259p(str, str2, str3)).map(new cge()).compose(mkd0.m154951C()).subscribe(ffw.m121193d(new e30() { // from class: l.c6l0
            @Override // p149l.e30
            public final void call(Object obj) {
                f6l0.m119624j(interfaceC16768a, (q4l0) obj);
            }
        }));
    }
}
