package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001d"}, m87232d2 = {"Ll/p83;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "b", "(Lcom/p1/mobile/android/app/Act;Landroid/view/ViewGroup;)Landroid/view/View;", "", "c", "Ll/e30;", "", SysnotifListener.ACTION_DISMISS, "e", "(Ll/e30;)V", Constants.INAPP_DATA_TAG, "()V", "a", "Lcom/p1/mobile/android/app/Act;", "Lv/VImage;", "Lv/VImage;", "_image_close", "Lv/VText;", "Lv/VText;", "_feature_name_text", "_promotional_text", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class p83 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public VImage _image_close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public VText _feature_name_text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public VText _promotional_text;

    public p83(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m167781a(e30 e30Var, View view) {
        e30Var.call(0);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final View m167782b(@NotNull Act act, @NotNull ViewGroup root) {
        act.getClass();
        root.getClass();
        View viewInflate = LayoutInflater.from(act).inflate(m6c0.f131613l, root, false);
        this._image_close = (VImage) viewInflate.findViewById(z4c0.f201514b0);
        this._feature_name_text = (VText) viewInflate.findViewById(z4c0.f201486O);
        this._promotional_text = (VText) viewInflate.findViewById(z4c0.f201461B0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public final void m167783c(@NotNull Act act) {
        act.getClass();
        m167784d();
    }

    /* JADX INFO: renamed from: d */
    public final void m167784d() {
        VText vText = this._feature_name_text;
        if (vText != null) {
            vText.setText(this.act.getString(IntlCountryCodeController.m28126v() ? R$string.f27117C4 : R$string.f27544o));
        }
        VText vText2 = this._promotional_text;
        if (vText2 != null) {
            vText2.setText(this.act.getString(R$string.f27532n));
        }
        VText vText3 = this._feature_name_text;
        if (vText3 != null) {
            vText3.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m167785e(@NotNull final e30<Integer> dismiss) {
        dismiss.getClass();
        xdl0.m208329E0(this._image_close, new View.OnClickListener() { // from class: l.o83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p83.m167781a(dismiss, view);
            }
        });
    }
}
