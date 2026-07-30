package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.AiTranslateLanguage;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.x0 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u000f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010<¨\u0006="}, m88121d2 = {"Ll/x0;", "Ll/iam;", "Ll/t0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "e", "(Ll/t0;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/data/AiTranslateLanguage;", "languages", "", "currentLang", "k", "(Ljava/util/List;Ljava/lang/String;)V", "langName", "m", "(Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f45292l, "a", "Lcom/p1/mobile/android/app/Act;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "j", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VLinear;", "c", "Lv/VLinear;", "f", "()Lv/VLinear;", "set_al_translate", "(Lv/VLinear;)V", "_al_translate", "Lv/VText;", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "()Lv/VText;", "set_al_translate_text", "(Lv/VText;)V", "_al_translate_text", "Ll/t0;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C21220x0 implements iam<C20199t0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _al_translate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _al_translate_text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C20199t0 presenter;

    public C21220x0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m208793a(C21220x0 c21220x0, String str, String str2) {
        str.getClass();
        str2.getClass();
        C20199t0 c20199t0 = c21220x0.presenter;
        if (c20199t0 != null) {
            c20199t0.m188697h0(str, str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m208794b(C21220x0 c21220x0, View view) {
        c21220x0.m208802l();
    }

    /* JADX INFO: renamed from: c */
    public static void m208795c(C21220x0 c21220x0, View view) {
        Act act = c21220x0.act();
        act.getClass();
        act.onBackPressed();
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m208796d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM213825b = C21487y0.m213825b(this, inflater, parent);
        viewM213825b.getClass();
        return viewM213825b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull C20199t0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VLinear m208798f() {
        VLinear vLinear = this._al_translate;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_al_translate");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VText m208799i() {
        VText vText = this._al_translate_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_al_translate_text");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM208796d = m208796d(inflater, parent);
        m208800j().setTitle(App.f16088e.getString(R$string.f18853Sg));
        m208800j().setLeftIconOnClick(new View.OnClickListener() { // from class: l.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21220x0.m208795c(this.f176837a, view);
            }
        });
        return viewM208796d;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VNavigationBar m208800j() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m208801k(@Nullable List<? extends AiTranslateLanguage> languages, @NotNull String currentLang) {
        currentLang.getClass();
        bnl0.m105509E0(m208798f(), new View.OnClickListener() { // from class: l.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21220x0.m208794b(this.f181828a, view);
            }
        });
        if (languages != null) {
            for (AiTranslateLanguage aiTranslateLanguage : languages) {
                if (TextUtils.equals(aiTranslateLanguage.key, currentLang)) {
                    String str = aiTranslateLanguage.name;
                    str.getClass();
                    m208803m(str);
                    return;
                }
            }
        }
        m208803m(currentLang);
    }

    /* JADX INFO: renamed from: l */
    public final void m208802l() {
        new DialogC19481q0(this.act, new Function2() { // from class: l.w0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C21220x0.m208793a(this.f186523a, (String) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: renamed from: m */
    public final void m208803m(@NotNull String langName) {
        langName.getClass();
        VText vTextM208799i = m208799i();
        if (vTextM208799i != null) {
            vTextM208799i.setText(langName);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
