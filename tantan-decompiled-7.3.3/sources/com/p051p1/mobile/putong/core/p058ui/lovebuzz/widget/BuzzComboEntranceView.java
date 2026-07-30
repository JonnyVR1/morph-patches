package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.ebc0;
import p153l.k3d0;
import p153l.pr3;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u0000 &2\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH&¢\u0006\u0004\b\u0016\u0010\u0011J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J?\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\b\b\u0003\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "j0", "()V", "Landroid/view/View;", "getIcon", "()Landroid/view/View;", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "getDesc", "getContentRoot", "getArrowIcon", "icon", "titleRes", "drawableId", "", SocialConstants.PARAM_APP_DESC, "", "onlyOne", "h0", "(IIILjava/lang/String;Z)V", "count", "bonus", ShareConstants.RES_PATH, "k0", "(III)V", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class BuzzComboEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzComboEntranceView$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView$a;", "", "<init>", "()V", "", "type", "Landroid/content/Context;", "ctx", "", "size", "", "newUI", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "a", "(Ljava/lang/String;Landroid/content/Context;IZ)Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final BuzzComboEntranceView m48320a(@NotNull String type, @NotNull Context ctx, int size, boolean newUI) {
            int i;
            int i2;
            type.getClass();
            ctx.getClass();
            BuzzComboEntranceView newUIBuzzComboEntranceView = newUI ? new NewUIBuzzComboEntranceView(ctx) : new NormalBuzzComboEntranceView(ctx);
            int iHashCode = type.hashCode();
            if (iHashCode != -1019560155) {
                if (iHashCode != -1004163680) {
                    if (iHashCode != 1332422126 || !type.equals("videoBuzz")) {
                        return null;
                    }
                    i = newUI ? ebc0.f92873c0 : ebc0.f92871b0;
                    i2 = R$string.f20971i0;
                } else {
                    if (!type.equals("textBuzz")) {
                        return null;
                    }
                    i = newUI ? ebc0.f92869a0 : ebc0.f92867Z;
                    i2 = R$string.f20965g0;
                }
            } else {
                if (!type.equals("voiceBuzz")) {
                    return null;
                }
                i = newUI ? ebc0.f92877e0 : ebc0.f92875d0;
                i2 = R$string.f20977k0;
            }
            BuzzComboEntranceView.m48315i0(newUIBuzzComboEntranceView, i, i2, newUI ? ebc0.f92849H : ebc0.f92848G, null, size == 1, 8, null);
            if (newUI) {
                bnl0.m105505C0(newUIBuzzComboEntranceView.getIcon(), size < 3 ? qa00.f156298K : qa00.f156294G);
            }
            return newUIBuzzComboEntranceView;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzComboEntranceView(@NotNull Context context) {
        this(context, null);
        context.getClass();
        m48318j0();
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m48315i0(BuzzComboEntranceView buzzComboEntranceView, int i, int i2, int i3, String str, boolean z, int i4, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: initInfo");
            return;
        }
        if ((i4 & 8) != 0) {
            str = "";
        }
        buzzComboEntranceView.m48317h0(i, i2, i3, str, z);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m48316l0(BuzzComboEntranceView buzzComboEntranceView, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: renderDesc");
            return;
        }
        if ((i4 & 4) != 0) {
            i3 = R$string.f20980l0;
        }
        buzzComboEntranceView.mo48319k0(i, i2, i3);
    }

    @Nullable
    public View getArrowIcon() {
        return null;
    }

    @NotNull
    public abstract View getContentRoot();

    @NotNull
    public abstract TextView getDesc();

    @NotNull
    public abstract View getIcon();

    @NotNull
    public abstract TextView getTitle();

    /* JADX INFO: renamed from: h0 */
    public void m48317h0(@DrawableRes int icon, @StringRes int titleRes, @DrawableRes int drawableId, @NotNull String desc, boolean onlyOne) {
        desc.getClass();
        if (icon != -1) {
            getIcon().setBackgroundResource(icon);
        }
        if (titleRes != -1) {
            getTitle().setText(titleRes);
        }
        if (TextUtils.isEmpty(desc)) {
            bnl0.m105524M(getDesc(), false);
        } else {
            bnl0.m105524M(getDesc(), true);
            getDesc().setText(desc);
        }
        View arrowIcon = getArrowIcon();
        if (arrowIcon != null) {
            bnl0.m105524M(arrowIcon, onlyOne);
        }
        getContentRoot().setBackgroundResource(drawableId);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m48318j0() {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo48319k0(int count, int bonus, @StringRes int res) {
        bnl0.m105524M(getDesc(), count >= 0);
        TextView desc = getDesc();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM148007c = k3d0.m148007c(res);
        strM148007c.getClass();
        desc.setText(String.format(strM148007c, Arrays.copyOf(new Object[]{Integer.valueOf(count)}, 1)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzComboEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
        m48318j0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzComboEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        m48318j0();
    }
}
