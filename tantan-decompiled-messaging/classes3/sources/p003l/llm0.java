package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.voice.call.VoiceBuzzCallFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.ui.lovebuzz.common.BaseBuzzSearchFrag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.mlm0;
import l.s7m;
import l.v4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\tJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010/¨\u00063"}, d2 = {"Ll/llm0;", "Ll/s7m;", "Ll/ilm0;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "e", "()V", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "presenter", "b", "(Ll/ilm0;)V", "r", "", "page", "d", "(Ljava/lang/String;)V", "destroy", "f", "i", "Lcom/p1/mobile/android/app/Frag;", "frag", "j", "(Lcom/p1/mobile/android/app/Frag;)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_voice_buzz_root", "()Landroid/widget/FrameLayout;", "set_voice_buzz_root", "(Landroid/widget/FrameLayout;)V", "_voice_buzz_root", "Ljava/lang/String;", "pageType", "modeType", "Companion", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    private final void m6126c() {
        String str = this.pageType;
        if (Intrinsics.d(str, "search_voice")) {
            m6127e();
        } else if (Intrinsics.d(str, "call_end")) {
            m6133i();
        } else {
            m6132f();
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m6127e() {
        m6135j(BaseBuzzSearchFrag.Companion.a("voiceBuzz", this.modeType));
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m6128C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m6129a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = mlm0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d */
    public final void m6131d(@NotNull String page) {
        page.getClass();
        if (Intrinsics.d(page, this.pageType)) {
            return;
        }
        this.pageType = page;
        m6126c();
    }

    /* JADX INFO: renamed from: f */
    public final void m6132f() {
        m6135j(new VoiceBuzzCallFrag());
    }

    /* JADX INFO: renamed from: i */
    public final void m6133i() {
        this.act.finish();
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m6129a(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m6135j(Frag frag) {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        k kVarM = supportFragmentManager.m();
        kVarM.getClass();
        kVarM.s(v4c0.n, frag);
        kVarM.j();
    }

    /* JADX INFO: renamed from: r */
    public final void m6136r() {
        this.pageType = this.act.getIntent().getStringExtra("page_type");
        this.modeType = this.act.getIntent().getStringExtra("MODE_TYPE");
        m6126c();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m6134i1(@Nullable ilm0 presenter) {
    }
}
