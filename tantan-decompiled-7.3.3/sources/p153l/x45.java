package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class x45 extends lb2 {

    /* JADX INFO: renamed from: e */
    public List<User> f192337e;

    /* JADX INFO: renamed from: f */
    public Context f192338f;

    public x45(List<User> list, Context context) {
        this.f192337e = list;
        this.f192338f = context;
    }

    @Override // p153l.cf60
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        super.finishUpdate(viewGroup);
    }

    @Override // p153l.cf60
    public int getCount() {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
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
        if (this.f192337e.size() > 1) {
            i %= this.f192337e.size();
        }
        VDraweeView vDraweeView = (VDraweeView) p9r.m171370a(this.f192338f).inflate(kec0.f125838g, (ViewGroup) null);
        if (CoreModule.f18264c.f20429u0.m31378B5()) {
            if (this.f192337e.size() == 1) {
                uqb0.f180374G.m127120O(vDraweeView, this.f192337e.get(0).m61308fp().profileSmall().formatted(), 2, 8);
            }
            Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
            if (!(NullChecker.m82486a(settings) && TEnum.equals(settings.getLookingFor(), "female")) && NullChecker.m82486a(settings) && TEnum.equals(settings.getLookingFor(), "male")) {
                vDraweeView.getHierarchy().m207041D(dbc0.f86450Op);
                vDraweeView.getHierarchy().m207065z(dbc0.f86450Op);
            } else {
                vDraweeView.getHierarchy().m207041D(dbc0.f86418Np);
                vDraweeView.getHierarchy().m207065z(dbc0.f86418Np);
            }
        } else if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            uqb0.f180374G.m127112K(vDraweeView, dbc0.f86583Su, 2, 8);
        } else {
            uqb0.f180374G.m127112K(vDraweeView, dbc0.f86551Ru, 2, 8);
        }
        if (this.f192337e.size() > 1) {
            uqb0.f180374G.m127120O(vDraweeView, this.f192337e.get(i).m61308fp().profileSmall().formatted(), 2, 8);
        }
        viewGroup.addView(vDraweeView);
        return vDraweeView;
    }
}
