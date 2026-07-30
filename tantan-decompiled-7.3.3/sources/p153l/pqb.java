package p153l;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.PutongCoreAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class pqb extends hfq0 {

    /* JADX INFO: renamed from: b */
    public PutongCoreAct f153655b;

    public pqb(@NonNull @NotNull PutongCoreAct putongCoreAct) {
        super(putongCoreAct);
        this.f153655b = putongCoreAct;
    }

    @Override // p153l.hfq0, p153l.ux0
    /* JADX INFO: renamed from: c */
    public Drawable mo134823c() {
        return this.f153655b.drawable(cbc0.f80748Q);
    }

    @Override // p153l.hfq0, p153l.ux0
    /* JADX INFO: renamed from: e */
    public int mo134825e() {
        return super.mo134825e();
    }

    @Override // p153l.hfq0, p153l.ux0
    /* JADX INFO: renamed from: f */
    public int mo134826f() {
        return super.mo134826f();
    }

    @Override // p153l.hfq0, p153l.ux0
    /* JADX INFO: renamed from: i */
    public void mo134829i(Toolbar toolbar) {
        toolbar.setTitleTextColor(mo134826f());
        toolbar.setSubtitleTextColor(mo134825e());
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        layoutParams.height = this.f153655b.getActionBarHeight();
        toolbar.setLayoutParams(layoutParams);
        try {
            ImageButton imageButton = (ImageButton) Act.TOOLBAR_NAV_BUTTON_VIEW_FIELD.get(toolbar);
            if (NullChecker.m82486a(imageButton)) {
                ViewGroup.LayoutParams layoutParams2 = imageButton.getLayoutParams();
                layoutParams2.width = qa00.m175859d(44.0f);
                layoutParams2.height = qa00.m175859d(44.0f);
                imageButton.setLayoutParams(layoutParams2);
                imageButton.setImageResource(cbc0.f80748Q);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e.getMessage()));
        }
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(toolbar);
            if (NullChecker.m82486a(textView)) {
                textView.setTranslationX(-qa00.m175859d(16.0f));
                textView.setTextSize(21.0f);
            }
        } catch (Exception e2) {
            CrashHelper.m82479c(new Exception("initToolbarTheme reflect mNavButtonView error: " + e2.getMessage()));
        }
    }

    @Override // p153l.hfq0, p153l.ux0
    /* JADX INFO: renamed from: j */
    public void mo134830j(TextView textView) {
        textView.setTextSize(16.0f);
        textView.setTextColor(this.f153655b.getResources().getColor(o9c0.f145548d));
    }

    @Override // p153l.hfq0, p153l.ux0
    /* JADX INFO: renamed from: l */
    public void mo134832l(SearchView searchView) {
        try {
            ImageView imageView = (ImageView) searchView.findViewById(xdc0.f193537D);
            ImageView imageView2 = (ImageView) searchView.findViewById(xdc0.f193538E);
            EditText editText = (EditText) searchView.findViewById(xdc0.f193543J);
            imageView.setImageResource(cbc0.f80737I0);
            imageView2.setImageResource(cbc0.f80735H0);
            qnp0.m177262e1(editText, tbc0.f172858H);
            editText.setTextColor(-14606047);
            editText.setHintTextColor(1713447201);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("reset searchView theme error: " + e.getMessage()));
        }
    }
}
