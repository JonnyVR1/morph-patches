package com.p000p1.mobile.putong.core.newui.profile.newme;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.profile.newme.NewIdentifyView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.kt20;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewIdentifyView;", "Lv/VLinear;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "set", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", "view", "Q", "(Landroid/view/View;)V", "Lv/VImage;", "c", "Lv/VImage;", "get_tab_identify_icon", "()Lv/VImage;", "set_tab_identify_icon", "(Lv/VImage;)V", "_tab_identify_icon", "Lv/VText;", "d", "Lv/VText;", "get_edit_renzheng", "()Lv/VText;", "set_edit_renzheng", "(Lv/VText;)V", "_edit_renzheng", "Lcom/p1/mobile/android/app/Act;", "e", "Lcom/p1/mobile/android/app/Act;", "act", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewIdentifyView extends VLinear {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _tab_identify_icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _edit_renzheng;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Act act;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewIdentifyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: P */
    public static void m7490P(NewIdentifyView newIdentifyView, View view) {
        zvf0.r("e_avatarVerification_main_entrance_click", "p_navigation_view");
        Context context = newIdentifyView.act;
        Context context2 = null;
        if (context == null) {
            Intrinsics.r("act");
            context = null;
        }
        Context context3 = newIdentifyView.act;
        if (context3 == null) {
            Intrinsics.r("act");
        } else {
            context2 = context3;
        }
        context.startActivity(VerificationCenterAct.X1(context2, false));
    }

    /* JADX INFO: renamed from: Q */
    public final void m7491Q(View view) {
        kt20.a(this, view);
    }

    @NotNull
    public final VText get_edit_renzheng() {
        VText vText = this._edit_renzheng;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_edit_renzheng");
        return null;
    }

    @NotNull
    public final VImage get_tab_identify_icon() {
        VImage vImage = this._tab_identify_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_tab_identify_icon");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7491Q(this);
        Act actE = xdl0.E(this);
        actE.getClass();
        this.act = actE;
        xdl0.E0(this, new View.OnClickListener() { // from class: l.jt20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewIdentifyView.m7490P(this.f15278a, view);
            }
        });
    }

    public final void set_edit_renzheng(@NotNull VText vText) {
        vText.getClass();
        this._edit_renzheng = vText;
    }

    public final void set_tab_identify_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._tab_identify_icon = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewIdentifyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewIdentifyView(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
