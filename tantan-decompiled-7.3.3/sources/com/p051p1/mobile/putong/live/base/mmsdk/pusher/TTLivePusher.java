package com.p051p1.mobile.putong.live.base.mmsdk.pusher;

import android.content.Context;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.filtermanager.TTPresetFilter;
import com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a;
import java.util.List;
import p153l.cgu;
import p153l.mob0;
import p153l.s210;
import p153l.v6m;
import p153l.w6m;
import p153l.wx0;
import p153l.wxh0;
import p153l.zmw;

/* JADX INFO: loaded from: classes13.dex */
public class TTLivePusher implements v6m {

    /* JADX INFO: renamed from: a */
    public v6m f45395a;

    /* JADX INFO: renamed from: b */
    public C12622a.b f45396b;

    /* JADX INFO: renamed from: c */
    public C12622a f45397c = C12622a.m69707b();

    public enum LivePusherType {
        NEW_MOMO
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher$a */
    public static /* synthetic */ class C12623a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45398a;

        static {
            int[] iArr = new int[LivePusherType.values().length];
            f45398a = iArr;
            try {
                iArr[LivePusherType.NEW_MOMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.pusher.TTLivePusher$b */
    public static class C12624b {

        /* JADX INFO: renamed from: a */
        public String f45399a;

        /* JADX INFO: renamed from: b */
        public String f45400b;

        /* JADX INFO: renamed from: c */
        public String f45401c;

        /* JADX INFO: renamed from: d */
        public String f45402d;

        /* JADX INFO: renamed from: d */
        public String m69776d() {
            return this.f45402d;
        }

        /* JADX INFO: renamed from: e */
        public void m69777e(String str) {
            this.f45399a = str;
        }

        /* JADX INFO: renamed from: f */
        public void m69778f(String str) {
            this.f45402d = str;
        }

        /* JADX INFO: renamed from: g */
        public void m69779g(String str) {
            this.f45400b = str;
        }
    }

    public TTLivePusher(Context context, C12624b c12624b, LivePusherType livePusherType) {
        if (C12623a.f45398a[livePusherType.ordinal()] != 1) {
            return;
        }
        this.f45395a = new s210(new MMLiveUserConfig(c12624b.f45399a, c12624b.m69776d(), c12624b.f45400b, c12624b.f45401c, wx0.m208362b(App.f16088e), wx0.m208361a(App.f16088e), false), context);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: A */
    public void mo69711A(float f) {
        this.f45395a.mo69711A(f);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: B */
    public void mo69712B(String str) {
        this.f45395a.mo69712B(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: C */
    public void mo69713C(int i, int i2) {
        this.f45395a.mo69713C(i, i2);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: D */
    public int mo69714D(byte[] bArr) {
        return this.f45395a.mo69714D(bArr);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: E */
    public void mo69715E(String str, boolean z) {
        this.f45395a.mo69715E(str, z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: F */
    public void mo69716F(List<TTPresetFilter> list) {
        this.f45395a.mo69716F(list);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: G */
    public void mo69717G(String str) {
        this.f45395a.mo69717G(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: H */
    public void mo69718H(wxh0 wxh0Var) {
        this.f45395a.mo69718H(wxh0Var);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: I */
    public int mo69719I(MMLiveMediaConfig mMLiveMediaConfig) {
        return this.f45395a.mo69719I(mMLiveMediaConfig);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: J */
    public void mo69720J(boolean z) {
        this.f45395a.mo69720J(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: K */
    public void mo69721K(w6m w6mVar) {
        this.f45395a.mo69721K(w6mVar);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: L */
    public void mo69722L(MMLiveTranscoding mMLiveTranscoding) {
        this.f45395a.mo69722L(mMLiveTranscoding);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: M */
    public void mo69723M(Boolean bool) {
        this.f45395a.mo69723M(bool);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: N */
    public void mo69724N(boolean z) {
        this.f45395a.mo69724N(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: O */
    public void mo69725O(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE) {
        this.f45395a.mo69725O(momoMediaConstants$BEAUTY_TYPE);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: P */
    public void mo69726P(int i, boolean z) {
        this.f45395a.mo69726P(i, z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: Q */
    public void mo69727Q(wxh0 wxh0Var) {
        this.f45395a.mo69727Q(wxh0Var);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: R */
    public int mo69728R(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        if (mMLiveMediaConfig == null || mMLiveRoomParams == null || mMLiveTranscoding == null) {
            return -1;
        }
        return this.f45395a.mo69728R(mMLiveMediaConfig, mMLiveRoomParams, mMLiveTranscoding);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: S */
    public void mo69729S(boolean z) {
        this.f45395a.mo69729S(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: T */
    public void mo69730T() {
        this.f45395a.mo69730T();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: U */
    public void mo69731U(int i) {
        this.f45395a.mo69731U(i);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: V */
    public void mo69732V(String str, wxh0 wxh0Var) {
        this.f45395a.mo69732V(str, wxh0Var);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: W */
    public void mo69733W(String str) {
        this.f45395a.mo69733W(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: X */
    public void mo69734X() {
        this.f45395a.mo69734X();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: Y */
    public void mo69735Y(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        this.f45395a.mo69735Y(mMLiveClientRole);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: Z */
    public int mo69736Z(Boolean bool) {
        return this.f45395a.mo69736Z(bool);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: a */
    public void mo69737a() {
        this.f45395a.mo69737a();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: a0 */
    public void mo69738a0(boolean z) {
        this.f45395a.mo69738a0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: b */
    public void mo69739b(String str) {
        this.f45395a.mo69739b(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: b0 */
    public void mo69740b0(String str, int i, String str2) {
        this.f45395a.mo69740b0(str, i, str2);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: c */
    public long mo69741c() {
        return this.f45395a.mo69741c();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: c0 */
    public void mo69742c0(MMLiveMediaConfig mMLiveMediaConfig) {
        this.f45395a.mo69742c0(mMLiveMediaConfig);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: d */
    public float mo69743d() {
        return this.f45395a.mo69743d();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: d0 */
    public void mo69744d0(boolean z) {
        this.f45395a.mo69744d0(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: e */
    public boolean mo69745e() {
        return this.f45395a.mo69745e();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: e0 */
    public boolean mo69746e0(String str, String str2, float f) {
        return this.f45395a.mo69746e0(str, str2, f);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: f */
    public int mo69747f() {
        return this.f45395a.mo69747f();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: f0 */
    public void mo69748f0(String str) {
        this.f45395a.mo69748f0(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: g */
    public mob0 mo69749g() {
        return this.f45395a.mo69749g();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: g0 */
    public void mo69750g0() {
        this.f45395a.mo69750g0();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: h */
    public int mo69751h(int i) {
        return this.f45395a.mo69751h(i);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: h0 */
    public void mo69752h0(int i, wxh0 wxh0Var) {
        this.f45395a.mo69752h0(i, wxh0Var);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: i */
    public float mo69753i() {
        return this.f45395a.mo69753i();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: i0 */
    public void mo69754i0(int i) {
        this.f45395a.mo69754i0(i);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: j */
    public void mo69755j() {
        this.f45395a.mo69755j();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: j0 */
    public void mo69756j0(cgu cguVar) {
        this.f45395a.mo69756j0(cguVar);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: k */
    public int mo69757k() {
        return this.f45395a.mo69757k();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: l */
    public void mo69758l(List<String> list) {
        this.f45395a.mo69758l(list);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: m */
    public void mo69759m(String str) {
        this.f45395a.mo69759m(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: n */
    public void mo69760n(boolean z) {
        this.f45395a.mo69760n(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: o */
    public void mo69761o(String str) {
        this.f45395a.mo69761o(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: p */
    public void mo69762p(boolean z) {
        this.f45395a.mo69762p(z);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: q */
    public void mo69763q() {
        this.f45395a.mo69763q();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: r */
    public long mo69764r() {
        return this.f45395a.mo69764r();
    }

    @Override // p153l.v6m
    public void release() {
        this.f45395a.release();
        this.f45397c.m69709d(this.f45396b);
    }

    @Override // p153l.v6m
    public boolean removeMakeupStyle(String str, String str2) {
        return this.f45395a.removeMakeupStyle(str, str2);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: s */
    public void mo69765s(String str) {
        this.f45395a.mo69765s(str);
    }

    @Override // p153l.v6m
    public int selectAudioTrack(int i) {
        return this.f45395a.selectAudioTrack(i);
    }

    @Override // p153l.v6m
    public void setMusicVolume(float f) {
        this.f45395a.setMusicVolume(f);
    }

    @Override // p153l.v6m
    public void stopAllEffect() {
        this.f45395a.stopAllEffect();
    }

    @Override // p153l.v6m
    public void stopEffect(int i) {
        this.f45395a.stopEffect(i);
    }

    @Override // p153l.v6m
    public void stopSurroundMusic() {
        this.f45395a.stopSurroundMusic();
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: t */
    public void mo69766t(String str) {
        this.f45395a.mo69766t(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: u */
    public void mo69767u(int i, String str, boolean z, boolean z2) {
        this.f45395a.mo69767u(i, str, z, z2);
    }

    @Override // p153l.v6m
    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        return this.f45395a.updateMakeupStyleValue(str, str2, f);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: v */
    public void mo69768v(String str) {
        this.f45395a.mo69768v(str);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: w */
    public void mo69769w(zmw zmwVar) {
        this.f45395a.mo69769w(zmwVar);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: x */
    public void mo69770x(float f) {
        this.f45395a.mo69770x(f);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: y */
    public void mo69771y(int i, int i2) {
        this.f45395a.mo69771y(i, i2);
    }

    @Override // p153l.v6m
    /* JADX INFO: renamed from: z */
    public void mo69772z(boolean z) {
        this.f45395a.mo69772z(z);
    }
}
