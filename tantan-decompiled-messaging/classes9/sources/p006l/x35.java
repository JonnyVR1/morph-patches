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
public class x35 extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<User> f27333e;

    /* JADX INFO: renamed from: f */
    public Context f27334f;

    public x35(List<User> list, Context context) {
        this.f27333e = list;
        this.f27334f = context;
    }

    public int getCount() {
        return this.f27333e.size();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m27155o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((VDraweeView) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m27156p(ViewGroup viewGroup, int i) {
        SimpleDraweeView simpleDraweeView = (VDraweeView) o7r.a(this.f27334f).inflate(f6c0.f12215h, (ViewGroup) null);
        Settings settings = CoreModule.f1534c.f3628e0.m21490p9().settings;
        if (!(NullChecker.a(settings) && TEnum.equals(settings.getLookingFor(), "female")) && NullChecker.a(settings) && TEnum.equals(settings.getLookingFor(), "male")) {
            simpleDraweeView.getHierarchy().D(x2c0.f26527ap);
        } else {
            simpleDraweeView.getHierarchy().D(x2c0.f26495Zo);
        }
        qib0.f19782G.m12749O(simpleDraweeView, this.f27333e.get(i).fp().profileSmall().formatted(), 2, 8);
        viewGroup.addView(simpleDraweeView);
        return simpleDraweeView;
    }
}
