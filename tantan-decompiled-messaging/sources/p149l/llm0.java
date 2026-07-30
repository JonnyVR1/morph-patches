package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzSearchFrag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.call.VoiceBuzzCallFrag;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\tJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010/¨\u00063"}, m87232d2 = {"Ll/llm0;", "Ll/s7m;", "Ll/ilm0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "e", "()V", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "presenter", "b", "(Ll/ilm0;)V", "r", "", OMSTemplateModeType.page, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "destroy", "f", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/android/app/Frag;", "frag", "j", "(Lcom/p1/mobile/android/app/Frag;)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_voice_buzz_root", "()Landroid/widget/FrameLayout;", "set_voice_buzz_root", "(Landroid/widget/FrameLayout;)V", "_voice_buzz_root", "Ljava/lang/String;", "pageType", "modeType", "Companion", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class llm0 implements s7m<ilm0> {

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

    public llm0(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.pageType = "";
        this.modeType = "";
    }

    /* JADX INFO: renamed from: c */
    private final void m150528c() {
        String str = this.pageType;
        if (Intrinsics.m87488d(str, "search_voice")) {
            m150529e();
        } else if (Intrinsics.m87488d(str, "call_end")) {
            m150534i();
        } else {
            m150533f();
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m150529e() {
        m150535j(BaseBuzzSearchFrag.INSTANCE.m46921a("voiceBuzz", this.modeType));
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m150530a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM155167b = mlm0.m155167b(this, inflater, parent);
        viewM155167b.getClass();
        return viewM155167b;
    }

    /* JADX INFO: renamed from: d */
    public final void m150532d(@NotNull String page) {
        page.getClass();
        if (Intrinsics.m87488d(page, this.pageType)) {
            return;
        }
        this.pageType = page;
        m150528c();
    }

    /* JADX INFO: renamed from: f */
    public final void m150533f() {
        m150535j(new VoiceBuzzCallFrag());
    }

    /* JADX INFO: renamed from: i */
    public final void m150534i() {
        this.act.lambda$debugItems$19();
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m150530a(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m150535j(Frag frag) {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.getClass();
        abstractC0427kM2567m.m2811s(v4c0.f179907n, frag);
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: r */
    public final void m150536r() {
        this.pageType = this.act.getIntent().getStringExtra("page_type");
        this.modeType = this.act.getIntent().getStringExtra("MODE_TYPE");
        m150528c();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable ilm0 presenter) {
    }
}
