package com.p046p1.mobile.putong.live.base.mmsdk.pusher;

import android.content.Context;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a;
import java.util.List;
import p149l.akw;
import p149l.beu;
import p149l.f4m;
import p149l.g4m;
import p149l.igb0;
import p149l.ju00;
import p149l.pph0;
import p149l.px0;

/* JADX INFO: loaded from: classes13.dex */
public class TTLivePusher implements f4m {

    /* JADX INFO: renamed from: a */
    public f4m f44547a;

    /* JADX INFO: renamed from: b */
    public C12459a.b f44548b;

    /* JADX INFO: renamed from: c */
    public C12459a f44549c = C12459a.m68524b();

    public enum LivePusherType {
        NEW_MOMO
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher$a */
    public static /* synthetic */ class C12460a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44550a;

        static {
            int[] iArr = new int[LivePusherType.values().length];
            f44550a = iArr;
            try {
                iArr[LivePusherType.NEW_MOMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher$b */
    public static class C12461b {

        /* JADX INFO: renamed from: a */
        public String f44551a;

        /* JADX INFO: renamed from: b */
        public String f44552b;

        /* JADX INFO: renamed from: c */
        public String f44553c;

        /* JADX INFO: renamed from: d */
        public String f44554d;

        /* JADX INFO: renamed from: d */
        public String m68593d() {
            return this.f44554d;
        }

        /* JADX INFO: renamed from: e */
        public void m68594e(String str) {
            this.f44551a = str;
        }

        /* JADX INFO: renamed from: f */
        public void m68595f(String str) {
            this.f44554d = str;
        }

        /* JADX INFO: renamed from: g */
        public void m68596g(String str) {
            this.f44552b = str;
        }
    }

    public TTLivePusher(Context context, C12461b c12461b, LivePusherType livePusherType) {
        if (C12460a.f44550a[livePusherType.ordinal()] != 1) {
            return;
        }
        this.f44547a = new ju00(new MMLiveUserConfig(c12461b.f44551a, c12461b.m68593d(), c12461b.f44552b, c12461b.f44553c, px0.m171778b(App.f15369e), px0.m171777a(App.f15369e), false), context);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: A */
    public void mo68528A(float f) {
        this.f44547a.mo68528A(f);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: B */
    public void mo68529B(String str) {
        this.f44547a.mo68529B(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: C */
    public void mo68530C(int i, int i2) {
        this.f44547a.mo68530C(i, i2);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: D */
    public int mo68531D(byte[] bArr) {
        return this.f44547a.mo68531D(bArr);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: E */
    public void mo68532E(String str, boolean z) {
        this.f44547a.mo68532E(str, z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: F */
    public void mo68533F(List<TTPresetFilter> list) {
        this.f44547a.mo68533F(list);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: G */
    public void mo68534G(String str) {
        this.f44547a.mo68534G(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: H */
    public void mo68535H(pph0 pph0Var) {
        this.f44547a.mo68535H(pph0Var);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: I */
    public int mo68536I(MMLiveMediaConfig mMLiveMediaConfig) {
        return this.f44547a.mo68536I(mMLiveMediaConfig);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: J */
    public void mo68537J(boolean z) {
        this.f44547a.mo68537J(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: K */
    public void mo68538K(g4m g4mVar) {
        this.f44547a.mo68538K(g4mVar);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: L */
    public void mo68539L(MMLiveTranscoding mMLiveTranscoding) {
        this.f44547a.mo68539L(mMLiveTranscoding);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: M */
    public void mo68540M(Boolean bool) {
        this.f44547a.mo68540M(bool);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: N */
    public void mo68541N(boolean z) {
        this.f44547a.mo68541N(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: O */
    public void mo68542O(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE) {
        this.f44547a.mo68542O(momoMediaConstants$BEAUTY_TYPE);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: P */
    public void mo68543P(int i, boolean z) {
        this.f44547a.mo68543P(i, z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: Q */
    public void mo68544Q(pph0 pph0Var) {
        this.f44547a.mo68544Q(pph0Var);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: R */
    public int mo68545R(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        if (mMLiveMediaConfig == null || mMLiveRoomParams == null || mMLiveTranscoding == null) {
            return -1;
        }
        return this.f44547a.mo68545R(mMLiveMediaConfig, mMLiveRoomParams, mMLiveTranscoding);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: S */
    public void mo68546S(boolean z) {
        this.f44547a.mo68546S(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: T */
    public void mo68547T() {
        this.f44547a.mo68547T();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: U */
    public void mo68548U(int i) {
        this.f44547a.mo68548U(i);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: V */
    public void mo68549V(String str, pph0 pph0Var) {
        this.f44547a.mo68549V(str, pph0Var);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: W */
    public void mo68550W(String str) {
        this.f44547a.mo68550W(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: X */
    public void mo68551X() {
        this.f44547a.mo68551X();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: Y */
    public void mo68552Y(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        this.f44547a.mo68552Y(mMLiveClientRole);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: Z */
    public int mo68553Z(Boolean bool) {
        return this.f44547a.mo68553Z(bool);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: a */
    public void mo68554a() {
        this.f44547a.mo68554a();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: a0 */
    public void mo68555a0(boolean z) {
        this.f44547a.mo68555a0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: b */
    public void mo68556b(String str) {
        this.f44547a.mo68556b(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: b0 */
    public void mo68557b0(String str, int i, String str2) {
        this.f44547a.mo68557b0(str, i, str2);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: c */
    public long mo68558c() {
        return this.f44547a.mo68558c();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: c0 */
    public void mo68559c0(MMLiveMediaConfig mMLiveMediaConfig) {
        this.f44547a.mo68559c0(mMLiveMediaConfig);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: d */
    public float mo68560d() {
        return this.f44547a.mo68560d();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: d0 */
    public void mo68561d0(boolean z) {
        this.f44547a.mo68561d0(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: e */
    public boolean mo68562e() {
        return this.f44547a.mo68562e();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: e0 */
    public boolean mo68563e0(String str, String str2, float f) {
        return this.f44547a.mo68563e0(str, str2, f);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: f */
    public int mo68564f() {
        return this.f44547a.mo68564f();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: f0 */
    public void mo68565f0(String str) {
        this.f44547a.mo68565f0(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: g */
    public igb0 mo68566g() {
        return this.f44547a.mo68566g();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: g0 */
    public void mo68567g0() {
        this.f44547a.mo68567g0();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: h */
    public int mo68568h(int i) {
        return this.f44547a.mo68568h(i);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: h0 */
    public void mo68569h0(int i, pph0 pph0Var) {
        this.f44547a.mo68569h0(i, pph0Var);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: i */
    public float mo68570i() {
        return this.f44547a.mo68570i();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: i0 */
    public void mo68571i0(int i) {
        this.f44547a.mo68571i0(i);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: j */
    public void mo68572j() {
        this.f44547a.mo68572j();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: j0 */
    public void mo68573j0(beu beuVar) {
        this.f44547a.mo68573j0(beuVar);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: k */
    public int mo68574k() {
        return this.f44547a.mo68574k();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: l */
    public void mo68575l(List<String> list) {
        this.f44547a.mo68575l(list);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: m */
    public void mo68576m(String str) {
        this.f44547a.mo68576m(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: n */
    public void mo68577n(boolean z) {
        this.f44547a.mo68577n(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: o */
    public void mo68578o(String str) {
        this.f44547a.mo68578o(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: p */
    public void mo68579p(boolean z) {
        this.f44547a.mo68579p(z);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: q */
    public void mo68580q() {
        this.f44547a.mo68580q();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: r */
    public long mo68581r() {
        return this.f44547a.mo68581r();
    }

    @Override // p149l.f4m
    public void release() {
        this.f44547a.release();
        this.f44549c.m68526d(this.f44548b);
    }

    @Override // p149l.f4m
    public boolean removeMakeupStyle(String str, String str2) {
        return this.f44547a.removeMakeupStyle(str, str2);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: s */
    public void mo68582s(String str) {
        this.f44547a.mo68582s(str);
    }

    @Override // p149l.f4m
    public int selectAudioTrack(int i) {
        return this.f44547a.selectAudioTrack(i);
    }

    @Override // p149l.f4m
    public void setMusicVolume(float f) {
        this.f44547a.setMusicVolume(f);
    }

    @Override // p149l.f4m
    public void stopAllEffect() {
        this.f44547a.stopAllEffect();
    }

    @Override // p149l.f4m
    public void stopEffect(int i) {
        this.f44547a.stopEffect(i);
    }

    @Override // p149l.f4m
    public void stopSurroundMusic() {
        this.f44547a.stopSurroundMusic();
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: t */
    public void mo68583t(String str) {
        this.f44547a.mo68583t(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: u */
    public void mo68584u(int i, String str, boolean z, boolean z2) {
        this.f44547a.mo68584u(i, str, z, z2);
    }

    @Override // p149l.f4m
    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        return this.f44547a.updateMakeupStyleValue(str, str2, f);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: v */
    public void mo68585v(String str) {
        this.f44547a.mo68585v(str);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: w */
    public void mo68586w(akw akwVar) {
        this.f44547a.mo68586w(akwVar);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: x */
    public void mo68587x(float f) {
        this.f44547a.mo68587x(f);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: y */
    public void mo68588y(int i, int i2) {
        this.f44547a.mo68588y(i, i2);
    }

    @Override // p149l.f4m
    /* JADX INFO: renamed from: z */
    public void mo68589z(boolean z) {
        this.f44547a.mo68589z(z);
    }
}
