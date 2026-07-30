package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.viewpager2.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0748b implements ViewPager2.InterfaceC0744k {

    /* JADX INFO: renamed from: a */
    public final List<ViewPager2.InterfaceC0744k> f3368a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC0744k
    /* JADX INFO: renamed from: a */
    public void mo4287a(@NonNull View view, float f) {
        Iterator<ViewPager2.InterfaceC0744k> it = this.f3368a.iterator();
        while (it.hasNext()) {
            it.next().mo4287a(view, f);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4291b(@NonNull ViewPager2.InterfaceC0744k interfaceC0744k) {
        this.f3368a.add(interfaceC0744k);
    }
}
