package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class w35 extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<User> f184304e;

    /* JADX INFO: renamed from: f */
    public Context f184305f;

    public w35(List<User> list, Context context) {
        this.f184304e = list;
        this.f184305f = context;
    }

    @Override // p149l.w660
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        super.finishUpdate(viewGroup);
    }

    @Override // p149l.w660
    public int getCount() {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((VDraweeView) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        if (this.f184304e.size() > 1) {
            i %= this.f184304e.size();
        }
        VDraweeView vDraweeView = (VDraweeView) o7r.m163037a(this.f184305f).inflate(f6c0.f95784g, (ViewGroup) null);
        if (CoreModule.f17545c.f19687u0.m30489x5()) {
            if (this.f184304e.size() == 1) {
                qib0.f154691G.m102336O(vDraweeView, this.f184304e.get(0).m60124fp().profileSmall().formatted(), 2, 8);
            }
            Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
            if (!(NullChecker.m81303a(settings) && TEnum.equals(settings.getLookingFor(), "female")) && NullChecker.m81303a(settings) && TEnum.equals(settings.getLookingFor(), "male")) {
                vDraweeView.getHierarchy().m112049D(x2c0.f189991ap);
                vDraweeView.getHierarchy().m112079z(x2c0.f189991ap);
            } else {
                vDraweeView.getHierarchy().m112049D(x2c0.f189959Zo);
                vDraweeView.getHierarchy().m112079z(x2c0.f189959Zo);
            }
        } else if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            qib0.f154691G.m102328K(vDraweeView, x2c0.f190123eu, 2, 8);
        } else {
            qib0.f154691G.m102328K(vDraweeView, x2c0.f190091du, 2, 8);
        }
        if (this.f184304e.size() > 1) {
            qib0.f154691G.m102336O(vDraweeView, this.f184304e.get(i).m60124fp().profileSmall().formatted(), 2, 8);
        }
        viewGroup.addView(vDraweeView);
        return vDraweeView;
    }
}
