package p149l;

import android.os.Bundle;
import android.view.SurfaceView;
import android.view.TextureView;
import com.cosmos.mdlog.MDLog;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.momomediaext.utils.MMLiveAcrossRoomState;
import com.immomo.momomediaext.utils.MMLiveErrorInfo;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.momo.piplineext.bean.MMLiveSubtitleErrorCode;
import com.momo.piplineext.bean.MMLiveSubtitleState;

/* JADX INFO: loaded from: classes7.dex */
public class fkw {
    /* JADX INFO: renamed from: C */
    public void mo121896C(int i) {
        MDLog.m7389d("MMLiveEnginePusherListener", "onMusicPlayCompleted: " + i);
    }

    /* JADX INFO: renamed from: D */
    public void mo121897D(int i) {
        MDLog.m7389d("MMLiveEnginePusherListener", "onMusicPlayError: " + i);
    }

    /* JADX INFO: renamed from: M */
    public void mo121906M(String str) {
        MDLog.m7389d("MMLiveEnginePusherListener", "onPushChangeStreamUrl: " + str);
    }

    /* JADX INFO: renamed from: N */
    public void mo121907N(int i, int i2) {
        MDLog.m7389d("MMLiveEnginePusherListener", "onPushLevelChange: " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
    }

    /* JADX INFO: renamed from: m */
    public void mo121937m(int i, int i2) {
        MDLog.m7389d("MMLiveEnginePusherListener", "onEffectPlayCompleted: " + i2);
    }

    /* JADX INFO: renamed from: n */
    public void mo121938n(int i) {
        MDLog.m7389d("MMLiveEnginePusherListener", "onEffectPlayError: " + i);
    }

    /* JADX INFO: renamed from: w */
    public boolean m121940w(int i, int i2) {
        return false;
    }

    /* JADX INFO: renamed from: L */
    public void m121905L() {
    }

    /* JADX INFO: renamed from: g0 */
    public void m121927g0() {
    }

    /* JADX INFO: renamed from: j */
    public void m121932j() {
    }

    /* JADX INFO: renamed from: x */
    public void m121941x() {
    }

    /* JADX INFO: renamed from: B */
    public void m121895B(jjw jjwVar) {
    }

    /* JADX INFO: renamed from: F */
    public void m121899F(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: G */
    public void mo121900G(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: H */
    public void m121901H(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: I */
    public void mo121902I(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: J */
    public void mo121903J(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: P */
    public void m121909P(int i) {
    }

    /* JADX INFO: renamed from: a */
    public void m121917a(MMLiveAcrossRoomState mMLiveAcrossRoomState) {
    }

    /* JADX INFO: renamed from: b0 */
    public void m121919b0(vmw vmwVar) {
    }

    /* JADX INFO: renamed from: c */
    public mpd0 m121920c(mpd0 mpd0Var) {
        return mpd0Var;
    }

    /* JADX INFO: renamed from: d */
    public void mo46997d(int i) {
    }

    /* JADX INFO: renamed from: e */
    public void m121923e(MMLiveErrorInfo mMLiveErrorInfo) {
    }

    /* JADX INFO: renamed from: f */
    public void m121924f(int i) {
    }

    /* JADX INFO: renamed from: f0 */
    public void mo121925f0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: h */
    public void m121928h(byte[][] bArr) {
    }

    /* JADX INFO: renamed from: h0 */
    public void m121929h0(jkw jkwVar) {
    }

    /* JADX INFO: renamed from: j0 */
    public void mo121933j0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: k */
    public void m121934k(int i) {
    }

    /* JADX INFO: renamed from: p */
    public void mo47000p(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: q */
    public void mo47001q(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: s */
    public void mo121939s(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: t */
    public void mo47003t(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: u */
    public void mo47004u(MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: v */
    public void mo47005v(int i) {
    }

    /* JADX INFO: renamed from: U */
    public void mo46994U(int i, byte[] bArr) {
    }

    /* JADX INFO: renamed from: X */
    public void m121915X(int i, Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    public void m121918b(int i, int i2) {
    }

    /* JADX INFO: renamed from: e0 */
    public void mo46998e0(AudioVolumeWeight[] audioVolumeWeightArr, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: i */
    public void m121930i(int i, int i2) {
    }

    /* JADX INFO: renamed from: l */
    public void m121936l(int i, int i2) {
    }

    /* JADX INFO: renamed from: o */
    public void mo46999o(MMLiveRoomParams.MMLivePushType mMLivePushType, MMLiveErrorInfo mMLiveErrorInfo) {
    }

    /* JADX INFO: renamed from: r */
    public void mo47002r(MMLiveRoomParams.MMLivePushType mMLivePushType, int i) {
    }

    /* JADX INFO: renamed from: y */
    public void m121942y(int i, int i2) {
    }

    /* JADX INFO: renamed from: A */
    public void mo46992A(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: E */
    public void m121898E(int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: K */
    public void m121904K(byte[] bArr, int i, int i2) {
    }

    /* JADX INFO: renamed from: O */
    public void mo121908O(String str, String str2, String str3) {
    }

    /* JADX INFO: renamed from: Q */
    public void mo121910Q(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: R */
    public void m121911R(long j, cbl0.InterfaceC16102b interfaceC16102b, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: S */
    public void mo46993S(String str, SurfaceView surfaceView, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: T */
    public void m121912T(String str, TextureView textureView, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: V */
    public void m121913V(byte[] bArr, int i, int i2) {
    }

    /* JADX INFO: renamed from: W */
    public void m121914W(byte[] bArr, int i, int i2) {
    }

    /* JADX INFO: renamed from: Y */
    public void mo121916Y(String str, boolean z, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: Z */
    public void mo46995Z(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo46996a0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: c0 */
    public void mo121921c0(String str, boolean z, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: g */
    public void mo121926g(byte[] bArr, int i, int i2) {
    }

    /* JADX INFO: renamed from: i0 */
    public void m121931i0(MMLiveSubtitleState mMLiveSubtitleState, MMLiveSubtitleErrorCode mMLiveSubtitleErrorCode, String str) {
    }

    /* JADX INFO: renamed from: z */
    public void mo47006z(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
    }

    /* JADX INFO: renamed from: d0 */
    public void m121922d0(int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: renamed from: k0 */
    public void m121935k0(int i, int i2, int i3, int i4) {
    }
}
