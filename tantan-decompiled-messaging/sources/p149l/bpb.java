package p149l;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.PutongCoreAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class bpb extends c6q0 {

    /* JADX INFO: renamed from: b */
    public PutongCoreAct f76616b;

    public bpb(@NonNull @NotNull PutongCoreAct putongCoreAct) {
        super(putongCoreAct);
        this.f76616b = putongCoreAct;
    }

    @Override // p149l.c6q0, p149l.nx0
    /* JADX INFO: renamed from: c */
    public Drawable mo103044c() {
        return this.f76616b.drawable(w2c0.f184152Q);
    }

    @Override // p149l.c6q0, p149l.nx0
    /* JADX INFO: renamed from: e */
    public int mo103045e() {
        return super.mo103045e();
    }

    @Override // p149l.c6q0, p149l.nx0
    /* JADX INFO: renamed from: f */
    public int mo103046f() {
        return super.mo103046f();
    }

    @Override // p149l.c6q0, p149l.nx0
    /* JADX INFO: renamed from: i */
    public void mo103047i(Toolbar toolbar) {
        toolbar.setTitleTextColor(mo103046f());
        toolbar.setSubtitleTextColor(mo103045e());
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        layoutParams.height = this.f76616b.getActionBarHeight();
        toolbar.setLayoutParams(layoutParams);
        try {
            ImageButton imageButton = (ImageButton) Act.TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar);
            if (NullChecker.m81303a(imageButton)) {
                ViewGroup.LayoutParams layoutParams2 = imageButton.getLayoutParams();
                layoutParams2.width = t100.m186890d(44.0f);
                layoutParams2.height = t100.m186890d(44.0f);
                imageButton.setLayoutParams(layoutParams2);
                imageButton.setImageResource(w2c0.f184152Q);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
            if (NullChecker.m81303a(textView)) {
                textView.setTranslationX(-t100.m186890d(16.0f));
                textView.setTextSize(21.0f);
            }
        } catch (Exception e2) {
            CrashHelper.m81296c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e2.getMessage()));
        }
    }

    @Override // p149l.c6q0, p149l.nx0
    /* JADX INFO: renamed from: j */
    public void mo103048j(TextView textView) {
        textView.setTextSize(16.0f);
        textView.setTextColor(this.f76616b.getResources().getColor(i1c0.f110441d));
    }

    @Override // p149l.c6q0, p149l.nx0
    /* JADX INFO: renamed from: l */
    public void mo103049l(SearchView searchView) {
        try {
            ImageView imageView = (ImageView) searchView.findViewById(s5c0.f162498D);
            ImageView imageView2 = (ImageView) searchView.findViewById(s5c0.f162499E);
            EditText editText = (EditText) searchView.findViewById(s5c0.f162504J);
            imageView.setImageResource(w2c0.f184141I0);
            imageView2.setImageResource(w2c0.f184139H0);
            mep0.m154303e1(editText, n3c0.f136943H);
            editText.setTextColor(-14606047);
            editText.setHintTextColor(1713447201);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("reset searchView theme error: " + e.getMessage()));
        }
    }
}
