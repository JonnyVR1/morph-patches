package p006l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.eb2;
import l.o7r;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w35 extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<User> f24903e;

    /* JADX INFO: renamed from: f */
    public Context f24904f;

    public w35(List<User> list, Context context) {
        this.f24903e = list;
        this.f24904f = context;
    }

    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        super/*l.w660*/.finishUpdate(viewGroup);
    }

    public int getCount() {
        return Integer.MAX_VALUE;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m26166o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((VDraweeView) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m26167p(ViewGroup viewGroup, int i) {
        if (this.f24903e.size() > 1) {
            i %= this.f24903e.size();
        }
        SimpleDraweeView simpleDraweeView = (VDraweeView) o7r.a(this.f24904f).inflate(f6c0.f12198g, (ViewGroup) null);
        if (CoreModule.f1534c.f3676u0.m2417x5()) {
            if (this.f24903e.size() == 1) {
                qib0.f19782G.m12749O(simpleDraweeView, this.f24903e.get(0).fp().profileSmall().formatted(), 2, 8);
            }
            Settings settings = CoreModule.f1534c.f3628e0.m21490p9().settings;
            if (!(NullChecker.a(settings) && TEnum.equals(settings.getLookingFor(), "female")) && NullChecker.a(settings) && TEnum.equals(settings.getLookingFor(), "male")) {
                simpleDraweeView.getHierarchy().D(x2c0.f26527ap);
                simpleDraweeView.getHierarchy().z(x2c0.f26527ap);
            } else {
                simpleDraweeView.getHierarchy().D(x2c0.f26495Zo);
                simpleDraweeView.getHierarchy().z(x2c0.f26495Zo);
            }
        } else if (CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
            qib0.f19782G.m12741K(simpleDraweeView, x2c0.f26659eu, 2, 8);
        } else {
            qib0.f19782G.m12741K(simpleDraweeView, x2c0.f26627du, 2, 8);
        }
        if (this.f24903e.size() > 1) {
            qib0.f19782G.m12749O(simpleDraweeView, this.f24903e.get(i).fp().profileSmall().formatted(), 2, 8);
        }
        viewGroup.addView(simpleDraweeView);
        return simpleDraweeView;
    }
}
