package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class vrp extends bf60 {

    /* JADX INFO: renamed from: i */
    public final List<IntlVoiceBgPagerView> f185506i;

    public vrp(Context context, List<IntlVoiceBgPagerView> list) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f185506i = arrayList;
        arrayList.addAll(list);
    }

    @Override // p153l.bf60, p153l.cf60
    public int getCount() {
        return this.f185506i.size();
    }

    @Override // p153l.bf60, p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f185506i.get(i).getPageName();
    }

    @Override // p153l.bf60, p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.bf60, p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        super.mo40045o(viewGroup, i, obj);
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.bf60, p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        IntlVoiceBgPagerView intlVoiceBgPagerView = this.f185506i.get(i);
        viewGroup.addView(intlVoiceBgPagerView);
        return intlVoiceBgPagerView;
    }
}
