package p006l;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.p000p1.mobile.putong.core.PutongCoreAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.i1c0;
import l.mep0;
import l.n3c0;
import l.s5c0;
import l.t100;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bpb extends c6q0 {

    /* JADX INFO: renamed from: b */
    public PutongCoreAct f9027b;

    public bpb(@NonNull @NotNull PutongCoreAct putongCoreAct) {
        super(putongCoreAct);
        this.f9027b = putongCoreAct;
    }

    @Override // p006l.c6q0
    /* JADX INFO: renamed from: c */
    public Drawable mo12834c() {
        return this.f9027b.drawable(w2c0.f24816Q);
    }

    @Override // p006l.c6q0
    /* JADX INFO: renamed from: e */
    public int mo12835e() {
        return super.mo12835e();
    }

    @Override // p006l.c6q0
    /* JADX INFO: renamed from: f */
    public int mo12836f() {
        return super.mo12836f();
    }

    @Override // p006l.c6q0
    /* JADX INFO: renamed from: i */
    public void mo12837i(Toolbar toolbar) {
        toolbar.setTitleTextColor(mo12836f());
        toolbar.setSubtitleTextColor(mo12835e());
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        layoutParams.height = this.f9027b.getActionBarHeight();
        toolbar.setLayoutParams(layoutParams);
        try {
            ImageButton imageButton = (ImageButton) Act.TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar);
            if (NullChecker.a(imageButton)) {
                ViewGroup.LayoutParams layoutParams2 = imageButton.getLayoutParams();
                layoutParams2.width = t100.d(44.0f);
                layoutParams2.height = t100.d(44.0f);
                imageButton.setLayoutParams(layoutParams2);
                imageButton.setImageResource(w2c0.f24816Q);
            }
        } catch (Exception e) {
            CrashHelper.c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
            if (NullChecker.a(textView)) {
                textView.setTranslationX(-t100.d(16.0f));
                textView.setTextSize(21.0f);
            }
        } catch (Exception e2) {
            CrashHelper.c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e2.getMessage()));
        }
    }

    @Override // p006l.c6q0
    /* JADX INFO: renamed from: j */
    public void mo12838j(TextView textView) {
        textView.setTextSize(16.0f);
        textView.setTextColor(this.f9027b.getResources().getColor(i1c0.d));
    }

    @Override // p006l.c6q0
    /* JADX INFO: renamed from: l */
    public void mo12839l(SearchView searchView) {
        try {
            ImageView imageView = (ImageView) searchView.findViewById(s5c0.D);
            ImageView imageView2 = (ImageView) searchView.findViewById(s5c0.E);
            EditText editText = (EditText) searchView.findViewById(s5c0.J);
            imageView.setImageResource(w2c0.f24805I0);
            imageView2.setImageResource(w2c0.f24803H0);
            mep0.e1(editText, n3c0.H);
            editText.setTextColor(-14606047);
            editText.setHintTextColor(1713447201);
        } catch (Exception e) {
            CrashHelper.c(new Exception("reset searchView theme error: " + e.getMessage()));
        }
    }
}
