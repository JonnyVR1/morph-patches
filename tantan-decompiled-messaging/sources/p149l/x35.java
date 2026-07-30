package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class x35 extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<User> f190862e;

    /* JADX INFO: renamed from: f */
    public Context f190863f;

    public x35(List<User> list, Context context) {
        this.f190862e = list;
        this.f190863f = context;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f190862e.size();
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
        VDraweeView vDraweeView = (VDraweeView) o7r.m163037a(this.f190863f).inflate(f6c0.f95801h, (ViewGroup) null);
        Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
        if (!(NullChecker.m81303a(settings) && TEnum.equals(settings.getLookingFor(), "female")) && NullChecker.m81303a(settings) && TEnum.equals(settings.getLookingFor(), "male")) {
            vDraweeView.getHierarchy().m112049D(x2c0.f189991ap);
        } else {
            vDraweeView.getHierarchy().m112049D(x2c0.f189959Zo);
        }
        qib0.f154691G.m102336O(vDraweeView, this.f190862e.get(i).m60124fp().profileSmall().formatted(), 2, 8);
        viewGroup.addView(vDraweeView);
        return vDraweeView;
    }
}
