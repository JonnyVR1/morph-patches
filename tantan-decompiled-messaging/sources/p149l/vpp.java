package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vpp extends v660 {

    /* JADX INFO: renamed from: i */
    public final List<IntlVoiceBgPagerView> f182516i;

    public vpp(Context context, List<IntlVoiceBgPagerView> list) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f182516i = arrayList;
        arrayList.addAll(list);
    }

    @Override // p149l.v660, p149l.w660
    public int getCount() {
        return this.f182516i.size();
    }

    @Override // p149l.v660, p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f182516i.get(i).getPageName();
    }

    @Override // p149l.v660, p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.v660, p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        super.mo39042o(viewGroup, i, obj);
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.v660, p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        IntlVoiceBgPagerView intlVoiceBgPagerView = this.f182516i.get(i);
        viewGroup.addView(intlVoiceBgPagerView);
        return intlVoiceBgPagerView;
    }
}
