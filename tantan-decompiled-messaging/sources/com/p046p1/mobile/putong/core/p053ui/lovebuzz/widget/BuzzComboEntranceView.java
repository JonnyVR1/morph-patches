package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hvc0;
import p149l.qq3;
import p149l.t100;
import p149l.xdl0;
import p149l.y2c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u0000 &2\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH&¢\u0006\u0004\b\u0016\u0010\u0011J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J?\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\b\b\u0003\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "j0", "()V", "Landroid/view/View;", "getIcon", "()Landroid/view/View;", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "getDesc", "getContentRoot", "getArrowIcon", "icon", "titleRes", "drawableId", "", SocialConstants.PARAM_APP_DESC, "", "onlyOne", "h0", "(IIILjava/lang/String;Z)V", "count", "bonus", ShareConstants.RES_PATH, "k0", "(III)V", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class BuzzComboEntranceView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzComboEntranceView$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView$a;", "", "<init>", "()V", "", "type", "Landroid/content/Context;", "ctx", "", "size", "", "newUI", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "a", "(Ljava/lang/String;Landroid/content/Context;IZ)Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final BuzzComboEntranceView m47137a(@NotNull String type, @NotNull Context ctx, int size, boolean newUI) {
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
                    i = newUI ? y2c0.f195551c0 : y2c0.f195549b0;
                    i2 = R$string.f20229i0;
                } else {
                    if (!type.equals("textBuzz")) {
                        return null;
                    }
                    i = newUI ? y2c0.f195547a0 : y2c0.f195545Z;
                    i2 = R$string.f20223g0;
                }
            } else {
                if (!type.equals("voiceBuzz")) {
                    return null;
                }
                i = newUI ? y2c0.f195555e0 : y2c0.f195553d0;
                i2 = R$string.f20235k0;
            }
            BuzzComboEntranceView.m47132i0(newUIBuzzComboEntranceView, i, i2, newUI ? y2c0.f195527H : y2c0.f195526G, null, size == 1, 8, null);
            if (newUI) {
                xdl0.m208325C0(newUIBuzzComboEntranceView.getIcon(), size < 3 ? t100.f167236K : t100.f167232G);
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
        m47135j0();
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m47132i0(BuzzComboEntranceView buzzComboEntranceView, int i, int i2, int i3, String str, boolean z, int i4, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: initInfo");
            return;
        }
        if ((i4 & 8) != 0) {
            str = "";
        }
        buzzComboEntranceView.m47134h0(i, i2, i3, str, z);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m47133l0(BuzzComboEntranceView buzzComboEntranceView, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: renderDesc");
            return;
        }
        if ((i4 & 4) != 0) {
            i3 = R$string.f20238l0;
        }
        buzzComboEntranceView.mo47136k0(i, i2, i3);
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
    public void m47134h0(@DrawableRes int icon, @StringRes int titleRes, @DrawableRes int drawableId, @NotNull String desc, boolean onlyOne) {
        desc.getClass();
        if (icon != -1) {
            getIcon().setBackgroundResource(icon);
        }
        if (titleRes != -1) {
            getTitle().setText(titleRes);
        }
        if (TextUtils.isEmpty(desc)) {
            xdl0.m208344M(getDesc(), false);
        } else {
            xdl0.m208344M(getDesc(), true);
            getDesc().setText(desc);
        }
        View arrowIcon = getArrowIcon();
        if (arrowIcon != null) {
            xdl0.m208344M(arrowIcon, onlyOne);
        }
        getContentRoot().setBackgroundResource(drawableId);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m47135j0() {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo47136k0(int count, int bonus, @StringRes int res) {
        xdl0.m208344M(getDesc(), count >= 0);
        TextView desc = getDesc();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM133156c = hvc0.m133156c(res);
        strM133156c.getClass();
        desc.setText(String.format(strM133156c, Arrays.copyOf(new Object[]{Integer.valueOf(count)}, 1)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzComboEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
        m47135j0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzComboEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        m47135j0();
    }
}
