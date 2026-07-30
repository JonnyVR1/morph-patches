package p149l;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class wk4 {
    public static final int MARGIN = t100.f167259h;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ roj0 m203649b(ac20 ac20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ac20Var.m95712e(bitmap.copy(bitmap.getConfig(), false));
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: c */
    public static void m203650c(@NotNull TextView textView, @Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, true);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m203651d(@NotNull TextView textView, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, true);
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m203652e(int i) {
        int i2 = MARGIN * 2;
        return i <= 0 ? xdl0.m208412y0() - i2 : ((xdl0.m208412y0() - ((i + 1) * i2)) / i) + i2;
    }

    /* JADX INFO: renamed from: f */
    public static void m203653f(String str, String str2, bs5 bs5Var, @NotNull final TextView textView, mcr mcrVar) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(textView, false);
            return;
        }
        xdl0.m208344M(textView, true);
        textView.setText(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + str);
        ac20 ac20Var = new ac20(App.f15369e, str2, t100.m186890d(18.0f));
        ac20Var.mo95709a(4);
        spannableStringBuilder.setSpan(ac20Var, 0, str2.length(), 33);
        ac20[] ac20VarArr = (ac20[]) spannableStringBuilder.getSpans(0, str2.length(), ac20.class);
        if (ac20VarArr.length <= 0) {
            return;
        }
        final ac20 ac20Var2 = ac20VarArr[0];
        if (ac20Var2.m95711d() || TextUtils.isEmpty(ac20Var2.m95710c().trim())) {
            return;
        }
        bs5Var.m103655a(mcrVar.duringCreated(hxs.m133392e("context_common", ac20Var2.m95710c().trim()).map(new w9j() { // from class: l.uk4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wk4.m203649b(ac20Var2, (Bitmap) obj);
            }
        }).compose(mkd0.m154951C())).subscribe(ffw.m121193d(new e30() { // from class: l.vk4
            @Override // p149l.e30
            public final void call(Object obj) {
                textView.setText(spannableStringBuilder);
            }
        })));
    }

    /* JADX INFO: renamed from: g */
    public static void m203654g(@NotNull LiveSquareMediaView liveSquareMediaView, @Nullable String str, int i) {
        if (TextUtils.isEmpty(str)) {
            liveSquareMediaView.getSimpleDraweeView().setController(null);
        } else {
            hxs.m133408u("context_square", liveSquareMediaView.getSimpleDraweeView(), str, i, i);
        }
    }
}
