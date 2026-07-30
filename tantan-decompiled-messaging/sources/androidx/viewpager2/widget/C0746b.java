package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.viewpager2.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0746b implements ViewPager2.InterfaceC0742k {

    /* JADX INFO: renamed from: a */
    public final List<ViewPager2.InterfaceC0742k> f3368a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC0742k
    /* JADX INFO: renamed from: a */
    public void mo4285a(@NonNull View view, float f) {
        Iterator<ViewPager2.InterfaceC0742k> it = this.f3368a.iterator();
        while (it.hasNext()) {
            it.next().mo4285a(view, f);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4289b(@NonNull ViewPager2.InterfaceC0742k interfaceC0742k) {
        this.f3368a.add(interfaceC0742k);
    }
}
