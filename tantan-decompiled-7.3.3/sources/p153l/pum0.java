package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzSearchFrag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.call.VoiceBuzzCallFrag;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\tJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010/¨\u00063"}, m88121d2 = {"Ll/pum0;", "Ll/iam;", "Ll/mum0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "e", "()V", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "presenter", "b", "(Ll/mum0;)V", "r", "", OMSTemplateModeType.page, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "destroy", "f", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/android/app/Frag;", "frag", "j", "(Lcom/p1/mobile/android/app/Frag;)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_voice_buzz_root", "()Landroid/widget/FrameLayout;", "set_voice_buzz_root", "(Landroid/widget/FrameLayout;)V", "_voice_buzz_root", "Ljava/lang/String;", "pageType", "modeType", "Companion", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pum0 implements iam<mum0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _voice_buzz_root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String pageType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String modeType;

    public pum0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageType = "";
        this.modeType = "";
    }

    /* JADX INFO: renamed from: c */
    private final void m173890c() {
        String str = this.pageType;
        if (Intrinsics.m88377d(str, "search_voice")) {
            m173891e();
        } else if (Intrinsics.m88377d(str, "call_end")) {
            m173896i();
        } else {
            m173895f();
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m173891e() {
        m173897j(BaseBuzzSearchFrag.INSTANCE.m48104a("voiceBuzz", this.modeType));
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m173892a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM178164b = qum0.m178164b(this, inflater, parent);
        viewM178164b.getClass();
        return viewM178164b;
    }

    /* JADX INFO: renamed from: d */
    public final void m173894d(@NotNull String page) {
        page.getClass();
        if (Intrinsics.m88377d(page, this.pageType)) {
            return;
        }
        this.pageType = page;
        m173890c();
    }

    /* JADX INFO: renamed from: f */
    public final void m173895f() {
        m173897j(new VoiceBuzzCallFrag());
    }

    /* JADX INFO: renamed from: i */
    public final void m173896i() {
        this.act.lambda$debugItems$19();
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m173892a(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m173897j(Frag frag) {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.getClass();
        abstractC0428kM2568m.m2812s(bdc0.f76257n, frag);
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: r */
    public final void m173898r() {
        this.pageType = this.act.getIntent().getStringExtra("page_type");
        this.modeType = this.act.getIntent().getStringExtra("MODE_TYPE");
        m173890c();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable mum0 presenter) {
    }
}
