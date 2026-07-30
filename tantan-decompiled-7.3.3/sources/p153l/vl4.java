package p153l;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class vl4 {
    public static final int MARGIN = qa00.f156321h;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ uxj0 m201590b(jk20 jk20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            jk20Var.m145151e(bitmap.copy(bitmap.getConfig(), false));
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: c */
    public static void m201591c(@NotNull TextView textView, @Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, true);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m201592d(@NotNull TextView textView, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, true);
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m201593e(int i) {
        int i2 = MARGIN * 2;
        return i <= 0 ? bnl0.m105592y0() - i2 : ((bnl0.m105592y0() - ((i + 1) * i2)) / i) + i2;
    }

    /* JADX INFO: renamed from: f */
    public static void m201594f(String str, String str2, ft5 ft5Var, @NotNull final TextView textView, ner nerVar) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(textView, false);
            return;
        }
        bnl0.m105524M(textView, true);
        textView.setText(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + str);
        jk20 jk20Var = new jk20(App.f16088e, str2, qa00.m175859d(18.0f));
        jk20Var.mo145148a(4);
        spannableStringBuilder.setSpan(jk20Var, 0, str2.length(), 33);
        jk20[] jk20VarArr = (jk20[]) spannableStringBuilder.getSpans(0, str2.length(), jk20.class);
        if (jk20VarArr.length <= 0) {
            return;
        }
        final jk20 jk20Var2 = jk20VarArr[0];
        if (jk20Var2.m145150d() || TextUtils.isEmpty(jk20Var2.m145149c().trim())) {
            return;
        }
        ft5Var.m127297a(nerVar.duringCreated(izs.m142854e("context_common", jk20Var2.m145149c().trim()).map(new qcj() { // from class: l.tl4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vl4.m201590b(jk20Var2, (Bitmap) obj);
            }
        }).compose(psd0.m173592C())).subscribe(dhw.m115825d(new y20() { // from class: l.ul4
            @Override // p153l.y20
            public final void call(Object obj) {
                textView.setText(spannableStringBuilder);
            }
        })));
    }

    /* JADX INFO: renamed from: g */
    public static void m201595g(@NotNull LiveSquareMediaView liveSquareMediaView, @Nullable String str, int i) {
        if (TextUtils.isEmpty(str)) {
            liveSquareMediaView.getSimpleDraweeView().setController(null);
        } else {
            izs.m142870u("context_square", liveSquareMediaView.getSimpleDraweeView(), str, i, i);
        }
    }
}
