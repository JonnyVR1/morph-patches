package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserRealVoiceLive;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveVoiceApi;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/o5k;", "Ll/mwl;", "<init>", "()V", "", "path", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;)Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/abe0;", SocialConstants.TYPE_REQUEST, "", "e", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/abe0;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class o5k extends mwl {
    /* JADX INFO: renamed from: t */
    public static final void m166157t(Act act, String str, String str2, String str3, String str4, BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive) {
        if (TextUtils.isEmpty(bLiveVoiceUserRealVoiceLive.voiceLiveId)) {
            o1j0.m165649w(R$string.f45727Q);
            return;
        }
        iqn0.m141681i(act, bLiveVoiceUserRealVoiceLive.voiceLiveId, "p_audio_explore_recommend", false, bLiveVoiceUserRealVoiceLive.roomId, str, str2, str3);
        if (bLiveVoiceUserRealVoiceLive.isOnCall) {
            return;
        }
        o1j0.m165651y(xau.m209911u(R$string.f45770q0, str4));
    }

    /* JADX INFO: renamed from: u */
    public static final void m166158u(Throwable th) {
        vsn0 vsn0Var = vsn0.INSTANCE;
        th.getClass();
        vsn0Var.m202641a(th);
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(@Nullable final Act act, @Nullable String path, @Nullable abe0 request) {
        super.mo96234e(act, path, request);
        if (request != null) {
            String str = request.m96743f().get("userId");
            final String str2 = request.m96743f().get("username");
            final String str3 = request.m96743f().get("streamPushUrl");
            final String str4 = request.m96743f().get("streamCdnProvider");
            final String str5 = request.m96743f().get("streamCdnBusinessType");
            if (act != null) {
                act.duringCreated(IntlLiveVoiceApi.getIntlVoiceRoomSquareRealShipLinkInfo(str)).subscribe(dhw.m115826e(new y20() { // from class: l.m5k
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        o5k.m166157t(act, str3, str4, str5, str2, (BLiveVoiceUserRealVoiceLive) obj);
                    }
                }, new y20() { // from class: l.n5k
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        o5k.m166158u((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(@Nullable String path) {
        return Intrinsics.m88377d(SchemeKey.intlVoiceShipLinkJumpRoom, path);
    }
}
