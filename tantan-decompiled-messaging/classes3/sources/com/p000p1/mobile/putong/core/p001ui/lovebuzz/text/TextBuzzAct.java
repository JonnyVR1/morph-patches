package com.p000p1.mobile.putong.core.p001ui.lovebuzz.text;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.ui.lovebuzz.common.BaseBuzzSearchFrag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.dii0;
import l.v4c0;
import l.x0c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/text/TextBuzzAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "r", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "V1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "inflateView", "onBackPressed", "", "shouldSwitchToTransparentStatus", "()Z", "isAnonymousMode", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "get_text_buzz_root", "()Landroid/widget/FrameLayout;", "set_text_buzz_root", "(Landroid/widget/FrameLayout;)V", "_text_buzz_root", "Companion", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TextBuzzAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _text_buzz_root;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.text.TextBuzzAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/text/TextBuzzAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Landroid/content/Intent;", "a", "(Lcom/p1/mobile/android/app/Act;)Landroid/content/Intent;", "", "TAG", "Ljava/lang/String;", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m77a(@NotNull Act act) {
            act.getClass();
            return new Intent((Context) act, (Class<?>) TextBuzzAct.class);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m75r() {
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        k kVarM = supportFragmentManager.m();
        kVarM.getClass();
        kVarM.s(v4c0.j, BaseBuzzSearchFrag.a.b(BaseBuzzSearchFrag.Companion, "textBuzz", (String) null, 2, (Object) null));
        kVarM.j();
    }

    @NotNull
    /* JADX INFO: renamed from: V1 */
    public final View m76V1(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = dii0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM76V1 = m76V1(inflater, parent);
        m75r();
        return viewM76V1;
    }

    public boolean isAnonymousMode() {
        return false;
    }

    public void onBackPressed() {
        BaseBuzzSearchFrag baseBuzzSearchFragH0 = getSupportFragmentManager().h0(v4c0.j);
        if (baseBuzzSearchFragH0 instanceof BaseBuzzSearchFrag) {
            baseBuzzSearchFragH0.o();
        } else {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        }
    }

    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        setStatusBarColorResId(x0c0.n);
        Act act = ((Act) this).act;
        if (act != null) {
            act.setSwipeBackEnable(false);
        }
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
