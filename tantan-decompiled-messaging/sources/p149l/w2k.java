package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserRealVoiceLive;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveVoiceApi;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/w2k;", "Ll/ytl;", "<init>", "()V", "", "path", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;)Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/w2e0;", SocialConstants.TYPE_REQUEST, "", "e", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/w2e0;)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class w2k extends ytl {
    /* JADX INFO: renamed from: t */
    public static final void m201117t(Act act, String str, String str2, String str3, String str4, BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive) {
        if (TextUtils.isEmpty(bLiveVoiceUserRealVoiceLive.voiceLiveId)) {
            lsi0.m151593w(R$string.f44879Q);
            return;
        }
        ehn0.m116506i(act, bLiveVoiceUserRealVoiceLive.voiceLiveId, "p_audio_explore_recommend", false, bLiveVoiceUserRealVoiceLive.roomId, str, str2, str3);
        if (bLiveVoiceUserRealVoiceLive.isOnCall) {
            return;
        }
        lsi0.m151595y(w8u.m202218u(R$string.f44922q0, str4));
    }

    /* JADX INFO: renamed from: u */
    public static final void m201118u(Throwable th) {
        rjn0 rjn0Var = rjn0.INSTANCE;
        th.getClass();
        rjn0Var.m179657a(th);
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(@Nullable final Act act, @Nullable String path, @Nullable w2e0 request) {
        super.mo94601e(act, path, request);
        if (request != null) {
            String str = request.m201098f().get("userId");
            final String str2 = request.m201098f().get("username");
            final String str3 = request.m201098f().get("streamPushUrl");
            final String str4 = request.m201098f().get("streamCdnProvider");
            final String str5 = request.m201098f().get("streamCdnBusinessType");
            if (act != null) {
                act.duringCreated(IntlLiveVoiceApi.getIntlVoiceRoomSquareRealShipLinkInfo(str)).subscribe(ffw.m121194e(new e30() { // from class: l.u2k
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        w2k.m201117t(act, str3, str4, str5, str2, (BLiveVoiceUserRealVoiceLive) obj);
                    }
                }, new e30() { // from class: l.v2k
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        w2k.m201118u((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(@Nullable String path) {
        return Intrinsics.m87488d(SchemeKey.intlVoiceShipLinkJumpRoom, path);
    }
}
