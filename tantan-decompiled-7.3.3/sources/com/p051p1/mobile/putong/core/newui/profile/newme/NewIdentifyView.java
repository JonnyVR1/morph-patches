package com.p051p1.mobile.putong.core.newui.profile.newme;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.profile.newme.NewIdentifyView;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.u130;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewIdentifyView;", "Lv/VLinear;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "set", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "Q", "(Landroid/view/View;)V", "Lv/VImage;", "c", "Lv/VImage;", "get_tab_identify_icon", "()Lv/VImage;", "set_tab_identify_icon", "(Lv/VImage;)V", "_tab_identify_icon", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_edit_renzheng", "()Lv/VText;", "set_edit_renzheng", "(Lv/VText;)V", "_edit_renzheng", "Lcom/p1/mobile/android/app/Act;", "e", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static void m44280P(NewIdentifyView newIdentifyView, View view) {
        i4g0.m138520r("e_avatarVerification_main_entrance_click", OMSDialogPositon.p_navigation_view);
        Act act = newIdentifyView.act;
        Act act2 = null;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        Act act3 = newIdentifyView.act;
        if (act3 == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
        } else {
            act2 = act3;
        }
        act.startActivity(VerificationCenterAct.m57174Y1(act2, false));
    }

    /* JADX INFO: renamed from: Q */
    public final void m44281Q(View view) {
        u130.m193895a(this, view);
    }

    @NotNull
    public final VText get_edit_renzheng() {
        VText vText = this._edit_renzheng;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_edit_renzheng");
        return null;
    }

    @NotNull
    public final VImage get_tab_identify_icon() {
        VImage vImage = this._tab_identify_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_tab_identify_icon");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44281Q(this);
        Activity activityM105508E = bnl0.m105508E(this);
        activityM105508E.getClass();
        this.act = (Act) activityM105508E;
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.t130
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewIdentifyView.m44280P(this.f171595a, view);
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
