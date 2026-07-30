package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class y45 extends lb2 {

    /* JADX INFO: renamed from: e */
    public List<User> f197411e;

    /* JADX INFO: renamed from: f */
    public Context f197412f;

    public y45(List<User> list, Context context) {
        this.f197411e = list;
        this.f197412f = context;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f197411e.size();
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((VDraweeView) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        VDraweeView vDraweeView = (VDraweeView) p9r.m171370a(this.f197412f).inflate(kec0.f125855h, (ViewGroup) null);
        Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
        if (!(NullChecker.m82486a(settings) && TEnum.equals(settings.getLookingFor(), "female")) && NullChecker.m82486a(settings) && TEnum.equals(settings.getLookingFor(), "male")) {
            vDraweeView.getHierarchy().m207041D(dbc0.f86450Op);
        } else {
            vDraweeView.getHierarchy().m207041D(dbc0.f86418Np);
        }
        uqb0.f180374G.m127120O(vDraweeView, this.f197411e.get(i).m61308fp().profileSmall().formatted(), 2, 8);
        viewGroup.addView(vDraweeView);
        return vDraweeView;
    }
}
