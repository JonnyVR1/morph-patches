package p149l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/k6w;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "ctx", "", "str", "", "leftIconRes", "", "h", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "pushData", "f", "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)V", SocialConstants.PARAM_ACT, "Ll/j760;", "pair", "Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;", "loveBuzzNotifyUserPop", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;Ll/j760;Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;)V", "Landroid/view/ViewGroup;", "root", "e", "(Lcom/p1/mobile/android/app/Act;Landroid/view/ViewGroup;Ll/j760;Lcom/p1/mobile/putong/core/ui/lovebuzz/pop/LoveBuzzNotifyUserPop;)V", "c", "", "g", "(Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;)Z", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class k6w {

    @NotNull
    public static final k6w INSTANCE = new k6w();

    /* JADX INFO: renamed from: a */
    public static void m144631a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m144632b(LoveBuzzPushData loveBuzzPushData, roj0 roj0Var) {
        if (!TextUtils.isEmpty(loveBuzzPushData.userId)) {
            CoreModule.f17545c.f19663m0.m30994E8(loveBuzzPushData.userId);
        }
        INSTANCE.m144634c(loveBuzzPushData);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m144633i(k6w k6wVar, Act act, String str, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        k6wVar.m144639h(act, str, num);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public final void m144634c(LoveBuzzPushData pushData) {
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
                        if (Intrinsics.m87488d(str3, "intl.lovebuzz.invite") || Intrinsics.m87488d(str3, "intl.lovebuzz.match")) {
                            m6w.INSTANCE.m153306k();
                            j8w.INSTANCE.m140473a().m140472z0().m132487l(vwb.m200311Y("intl.text.lovebuzz.show.notify", pushData));
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
            if (Intrinsics.m87488d(pushData.buzzIntent, "intl.lovebuzz.react")) {
                if (pushData.needReact) {
                    j8w j8wVarM140473a = j8w.INSTANCE.m140473a();
                    String str4 = pushData.channelToken;
                    str4.getClass();
                    String str5 = pushData.reaction;
                    str5.getClass();
                    j8wVarM140473a.m140439b1(str4, str5);
                }
                j8w.INSTANCE.m140473a().m140419D0().m132487l(vwb.m200311Y("media_buzz_reaction", pushData));
            }
            if ((Intrinsics.m87488d(pushData.buzzIntent, "intl.lovebuzz.invite") || j8w.INSTANCE.m140473a().m140417B0().m131192s(pushData)) && (str = pushData.buzzIntent) != null) {
                switch (str.hashCode()) {
                    case -576608703:
                        if (str.equals("intl.lovebuzz.invite")) {
                            if (Intrinsics.m87488d(pushData.mode, "passive")) {
                                m6w.INSTANCE.m153306k();
                                j8w.INSTANCE.m140473a().m140422G0().m132487l(vwb.m200311Y("intl.media.lovebuzz.show.notify", pushData));
                            }
                            j8w.Companion companion = j8w.INSTANCE;
                            companion.m140473a().m140419D0().m132487l(vwb.m200311Y("intl." + pushData.biz + ".notify", pushData));
                            j8w j8wVarM140473a2 = companion.m140473a();
                            String str6 = pushData.channelToken;
                            str6.getClass();
                            j8wVarM140473a2.m140439b1(str6, "invited");
                            break;
                        }
                        break;
                    case -327431060:
                        if (str.equals("intl.lovebuzz.report")) {
                            j8w.Companion companion2 = j8w.INSTANCE;
                            String callEndUserId = companion2.m140473a().m140417B0().getCallEndUserId();
                            if (callEndUserId != null && TextUtils.equals(callEndUserId, pushData.userId)) {
                                lsi0.m151593w(R$string.f20250r);
                            }
                            companion2.m140473a().m140419D0().m132487l(vwb.m200311Y(pushData.biz + "_peer_report", pushData));
                            break;
                        }
                        break;
                    case -15295603:
                        if (str.equals("intl.lovebuzz.match")) {
                            j8w.INSTANCE.m140473a().m140419D0().m132487l(vwb.m200311Y(pushData.biz + "_like_relation", pushData));
                            break;
                        }
                        break;
                    case 969315535:
                        if (str.equals("intl.lovebuzz.like")) {
                            j8w.INSTANCE.m140473a().m140419D0().m132487l(vwb.m200311Y(pushData.biz + "_peer_like", pushData));
                            break;
                        }
                        break;
                    case 969635774:
                        if (str.equals("intl.lovebuzz.warn")) {
                            j8w.Companion companion3 = j8w.INSTANCE;
                            companion3.m140473a().m140419D0().m132487l(vwb.m200311Y(pushData.biz + "_warn", pushData));
                            companion3.m140473a().m140423H0().m132487l(pushData.biz + "_warn");
                            break;
                        }
                        break;
                    case 1330694769:
                        if (str.equals("intl.lovebuzz.prolong")) {
                            j8w.INSTANCE.m140473a().m140419D0().m132487l(vwb.m200311Y(pushData.biz + "_prolong_time", pushData));
                            break;
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m144635d(@NotNull Act act, @NotNull j760<String, Object> pair, @NotNull LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        act.getClass();
        pair.getClass();
        loveBuzzNotifyUserPop.getClass();
        if (NullChecker.m81303a(loveBuzzNotifyUserPop) && m6w.INSTANCE.m153296a(act)) {
            if (Intrinsics.m87488d("intl.text.lovebuzz.close.notify", pair.f116564a)) {
                loveBuzzNotifyUserPop.m47058v();
                return;
            }
            if ((Intrinsics.m87488d("intl.text.lovebuzz.show.notify", pair.f116564a) || Intrinsics.m87488d("intl.media.lovebuzz.show.notify", pair.f116564a)) && (pair.f116565b instanceof LoveBuzzPushData)) {
                if (Intrinsics.m87488d("intl.text.lovebuzz.show.notify", pair.f116564a)) {
                    j8w.INSTANCE.m140473a().m140422G0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
                } else {
                    j8w.INSTANCE.m140473a().m140472z0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
                }
                Object obj = pair.f116565b;
                obj.getClass();
                loveBuzzNotifyUserPop.m47062z(act, (LoveBuzzPushData) obj);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m144636e(@NotNull Act act, @Nullable ViewGroup root, @NotNull j760<String, Object> pair, @NotNull LoveBuzzNotifyUserPop loveBuzzNotifyUserPop) {
        act.getClass();
        pair.getClass();
        loveBuzzNotifyUserPop.getClass();
        if (NullChecker.m81303a(loveBuzzNotifyUserPop) && m6w.INSTANCE.m153296a(act)) {
            if (Intrinsics.m87488d(pair.f116564a, "intl.text.lovebuzz.show.notify") || Intrinsics.m87488d(pair.f116564a, "intl.media.lovebuzz.show.notify")) {
                if (root == null) {
                    View decorView = act.getWindow().getDecorView();
                    root = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                }
                if (loveBuzzNotifyUserPop.getParent() == null) {
                    if (root != null) {
                        root.addView(loveBuzzNotifyUserPop);
                    }
                    xdl0.m208360X(loveBuzzNotifyUserPop, xdl0.m208331F0() + t100.f167266o);
                }
            }
            m144635d(act, pair, loveBuzzNotifyUserPop);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m144637f(@NotNull final LoveBuzzPushData pushData) {
        pushData.getClass();
        qa2.INSTANCE.m173681a("LoveBuzzHelper", "handlerLoveBuzzPush pushData " + pushData);
        if (m144638g(pushData)) {
            CoreModule.f17545c.f19639e0.m169454W9(pushData.userId).subscribe(mkd0.m154956H(new e30() { // from class: l.i6w
                @Override // p149l.e30
                public final void call(Object obj) {
                    k6w.m144632b(pushData, (roj0) obj);
                }
            }, new e30() { // from class: l.j6w
                @Override // p149l.e30
                public final void call(Object obj) {
                    k6w.m144631a((Throwable) obj);
                }
            }));
        } else {
            m144634c(pushData);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m144638g(LoveBuzzPushData pushData) {
        if (Intrinsics.m87488d("intl.lovebuzz.match", pushData.buzzIntent) && Intrinsics.m87488d("textBuzz", pushData.biz)) {
            return true;
        }
        if (Intrinsics.m87488d("intl.lovebuzz.invite", pushData.buzzIntent)) {
            return !Intrinsics.m87488d(pushData.subType, StickerBundle.TYPE) || TextUtils.isEmpty(pushData.otherUsers);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m144639h(@NotNull Act ctx, @Nullable String str, @DrawableRes @Nullable Integer leftIconRes) {
        ctx.getClass();
        if (!m6w.INSTANCE.m153296a(ctx)) {
            qa2.INSTANCE.m173682b("LoveBuzzHelper", "want notifyAtTop " + str + ", but ctx is error");
            return;
        }
        View viewInflate = o7r.m163037a(ctx).inflate(h6c0.f106043t, (ViewGroup) null);
        viewInflate.getClass();
        VText vText = (VText) viewInflate;
        vText.setText(str);
        if (leftIconRes != null) {
            vText.setCompoundDrawablePadding(t100.f167259h);
            Drawable drawableM161424b = nu0.m161424b(ctx, leftIconRes.intValue());
            if (drawableM161424b != null) {
                vText.setCompoundDrawablesWithIntrinsicBounds(drawableM161424b, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(ctx, vText).m21164B(1).m21176z(CorePopLevel.BUZZ_NOTIFY).m21169s());
    }
}
