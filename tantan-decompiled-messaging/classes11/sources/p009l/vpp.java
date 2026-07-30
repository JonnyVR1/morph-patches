package p009l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import java.util.ArrayList;
import java.util.List;
import l.v660;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vpp extends v660 {

    /* JADX INFO: renamed from: i */
    public final List<IntlVoiceBgPagerView> f21740i;

    public vpp(Context context, List<IntlVoiceBgPagerView> list) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f21740i = arrayList;
        arrayList.addAll(list);
    }

    public int getCount() {
        return this.f21740i.size();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f21740i.get(i).getPageName();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m23610o(ViewGroup viewGroup, int i, Object obj) {
        super.o(viewGroup, i, obj);
        viewGroup.removeView((View) obj);
    }

    /* JADX INFO: renamed from: p */
    public Object m23611p(ViewGroup viewGroup, int i) {
        IntlVoiceBgPagerView intlVoiceBgPagerView = this.f21740i.get(i);
        viewGroup.addView(intlVoiceBgPagerView);
        return intlVoiceBgPagerView;
    }
}
