package p153l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/i8w;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "str", "", "leftIconRes", "", "h", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "pushData", "f", "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)V", SocialConstants.PARAM_ACT, "Ll/pf60;", "pair", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;", "loveBuzzNotifyUserPop", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;Ll/pf60;Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;)V", "Landroid/view/ViewGroup;", "root", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/ViewGroup;Ll/pf60;Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;)V", "c", "", "g", "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)Z", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class i8w {

    @NotNull
    public static final i8w INSTANCE = new i8w();

    /* JADX INFO: renamed from: a */
    public static void m139028a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m139029b(LoveBuzzPushData loveBuzzPushData, uxj0 uxj0Var) {
        if (!TextUtils.isEmpty(loveBuzzPushData.userId)) {
            CoreModule.f18264c.f20405m0.m31997E8(loveBuzzPushData.userId);
        }
        INSTANCE.m139031c(loveBuzzPushData);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m139030i(i8w i8wVar, Act act, String str, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        i8wVar.m139036h(act, str, num);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public final void m139031c(LoveBuzzPushData pushData) {
        String str;
        String str2 = pushData.biz;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1019560155:
                    if (!str2.equals("voiceBuzz")) {
                        return;
                    }
                    break;
                case -1004163680:
                    if (str2.equals("textBuzz")) {
                        String str3 = pushData.buzzIntent;
                        if (Intrinsics.m88377d(str3, "intl.lovebuzz.invite") || Intrinsics.m88377d(str3, "intl.lovebuzz.match")) {
                            k8w.INSTANCE.m148762k();
                            haw.INSTANCE.m134320a().m134319z0().m137019l(jyb.m147494Y("intl.text.lovebuzz.show.notify", pushData));
                            return;
                        }
                        return;
                    }
                    return;
                case 1332422126:
                    if (!str2.equals("videoBuzz")) {
                        return;
                    }
                    break;
                case 1740758636:
                    if (!str2.equals("memojiBuzz")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            if (Intrinsics.m88377d(pushData.buzzIntent, "intl.lovebuzz.react")) {
                if (pushData.needReact) {
                    haw hawVarM134320a = haw.INSTANCE.m134320a();
                    String str4 = pushData.channelToken;
                    str4.getClass();
                    String str5 = pushData.reaction;
                    str5.getClass();
                    hawVarM134320a.m134286b1(str4, str5);
                }
                haw.INSTANCE.m134320a().m134266D0().m137019l(jyb.m147494Y("media_buzz_reaction", pushData));
            }
            if ((Intrinsics.m88377d(pushData.buzzIntent, "intl.lovebuzz.invite") || haw.INSTANCE.m134320a().m134264B0().m122089s(pushData)) && (str = pushData.buzzIntent) != null) {
                switch (str.hashCode()) {
                    case -576608703:
                        if (str.equals("intl.lovebuzz.invite")) {
                            if (Intrinsics.m88377d(pushData.mode, "passive")) {
                                k8w.INSTANCE.m148762k();
                                haw.INSTANCE.m134320a().m134269G0().m137019l(jyb.m147494Y("intl.media.lovebuzz.show.notify", pushData));
                            }
                            haw.Companion companion = haw.INSTANCE;
                            companion.m134320a().m134266D0().m137019l(jyb.m147494Y("intl." + pushData.biz + ".notify", pushData));
                            haw hawVarM134320a2 = companion.m134320a();
                            String str6 = pushData.channelToken;
                            str6.getClass();
                            hawVarM134320a2.m134286b1(str6, "invited");
                            break;
                        }
                        break;
                    case -327431060:
                        if (str.equals("intl.lovebuzz.report")) {
                            haw.Companion companion2 = haw.INSTANCE;
                            String callEndUserId = companion2.m134320a().m134264B0().getCallEndUserId();
                            if (callEndUserId != null && TextUtils.equals(callEndUserId, pushData.userId)) {
                                o1j0.m165649w(R$string.f20992r);
                            }
                            companion2.m134320a().m134266D0().m137019l(jyb.m147494Y(pushData.biz + "_peer_report", pushData));
                            break;
                        }
                        break;
                    case -15295603:
                        if (str.equals("intl.lovebuzz.match")) {
                            haw.INSTANCE.m134320a().m134266D0().m137019l(jyb.m147494Y(pushData.biz + "_like_relation", pushData));
                            break;
                        }
                        break;
                    case 969315535:
                        if (str.equals("intl.lovebuzz.like")) {
                            haw.INSTANCE.m134320a().m134266D0().m137019l(jyb.m147494Y(pushData.biz + "_peer_like", pushData));
                            break;
                        }
                        break;
                    case 969635774:
                        if (str.equals("intl.lovebuzz.warn")) {
                            haw.Companion companion3 = haw.INSTANCE;
                            companion3.m134320a().m134266D0().m137019l(jyb.m147494Y(pushData.biz + "_warn", pushData));
                            companion3.m134320a().m134270H0().m137019l(pushData.biz + "_warn");
                            break;
                        }
                        break;
                    case 1330694769:
                        if (str.equals("intl.lovebuzz.prolong")) {
                            haw.INSTANCE.m134320a().m134266D0().m137019l(jyb.m147494Y(pushData.biz + "_prolong_time", pushData));
                            break;
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m139032d(@NotNull Act act, @NotNull pf60<String, Object> pair, @NotNull LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        act.getClass();
        pair.getClass();
        loveBuzzNotifyUserPop.getClass();
        if (NullChecker.m82486a(loveBuzzNotifyUserPop) && k8w.INSTANCE.m148752a(act)) {
            if (Intrinsics.m88377d("intl.text.lovebuzz.close.notify", pair.f152156a)) {
                loveBuzzNotifyUserPop.m48241v();
                return;
            }
            if ((Intrinsics.m88377d("intl.text.lovebuzz.show.notify", pair.f152156a) || Intrinsics.m88377d("intl.media.lovebuzz.show.notify", pair.f152156a)) && (pair.f152157b instanceof LoveBuzzPushData)) {
                if (Intrinsics.m88377d("intl.text.lovebuzz.show.notify", pair.f152156a)) {
                    haw.INSTANCE.m134320a().m134269G0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
                } else {
                    haw.INSTANCE.m134320a().m134319z0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
                }
                Object obj = pair.f152157b;
                obj.getClass();
                loveBuzzNotifyUserPop.m48245z(act, (LoveBuzzPushData) obj);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m139033e(@NotNull Act act, @Nullable ViewGroup root, @NotNull pf60<String, Object> pair, @NotNull LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        act.getClass();
        pair.getClass();
        loveBuzzNotifyUserPop.getClass();
        if (NullChecker.m82486a(loveBuzzNotifyUserPop) && k8w.INSTANCE.m148752a(act)) {
            if (Intrinsics.m88377d(pair.f152156a, "intl.text.lovebuzz.show.notify") || Intrinsics.m88377d(pair.f152156a, "intl.media.lovebuzz.show.notify")) {
                if (root == null) {
                    View decorView = act.getWindow().getDecorView();
                    root = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                }
                if (loveBuzzNotifyUserPop.getParent() == null) {
                    if (root != null) {
                        root.addView(loveBuzzNotifyUserPop);
                    }
                    bnl0.m105540X(loveBuzzNotifyUserPop, bnl0.m105511F0() + qa00.f156328o);
                }
            }
            m139032d(act, pair, loveBuzzNotifyUserPop);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m139034f(@NotNull final LoveBuzzPushData pushData) {
        pushData.getClass();
        xa2.INSTANCE.m209830a("LoveBuzzHelper", "handlerLoveBuzzPush pushData " + pushData);
        if (m139035g(pushData)) {
            CoreModule.f18264c.f20381e0.m116527W9(pushData.userId).subscribe(psd0.m173597H(new y20() { // from class: l.g8w
                @Override // p153l.y20
                public final void call(Object obj) {
                    i8w.m139029b(pushData, (uxj0) obj);
                }
            }, new y20() { // from class: l.h8w
                @Override // p153l.y20
                public final void call(Object obj) {
                    i8w.m139028a((Throwable) obj);
                }
            }));
        } else {
            m139031c(pushData);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m139035g(LoveBuzzPushData pushData) {
        if (Intrinsics.m88377d("intl.lovebuzz.match", pushData.buzzIntent) && Intrinsics.m88377d("textBuzz", pushData.biz)) {
            return true;
        }
        if (Intrinsics.m88377d("intl.lovebuzz.invite", pushData.buzzIntent)) {
            return !Intrinsics.m88377d(pushData.subType, StickerBundle.TYPE) || TextUtils.isEmpty(pushData.otherUsers);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m139036h(@NotNull Act ctx, @Nullable String str, @DrawableRes @Nullable Integer leftIconRes) {
        ctx.getClass();
        if (!k8w.INSTANCE.m148752a(ctx)) {
            xa2.INSTANCE.m209831b("LoveBuzzHelper", "want notifyAtTop " + str + ", but ctx is error");
            return;
        }
        View viewInflate = p9r.m171370a(ctx).inflate(mec0.f136485t, (ViewGroup) null);
        viewInflate.getClass();
        VText vText = (VText) viewInflate;
        vText.setText(str);
        if (leftIconRes != null) {
            vText.setCompoundDrawablePadding(qa00.f156321h);
            Drawable drawableM192702b = tu0.m192702b(ctx, leftIconRes.intValue());
            if (drawableM192702b != null) {
                vText.setCompoundDrawablesWithIntrinsicBounds(drawableM192702b, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(ctx, vText).m22163B(1).m22175z(CorePopLevel.BUZZ_NOTIFY).m22168s());
    }
}
