package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VPagerCircleIndicator;
import p153l.cf60;
import p153l.g0r;
import p153l.h0r;
import p153l.m0r;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardMediaLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public KeyboardMediaLayout f33214a;

    /* JADX INFO: renamed from: b */
    public ViewPager f33215b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f33216c;

    /* JADX INFO: renamed from: d */
    public List<h0r> f33217d;

    /* JADX INFO: renamed from: e */
    public C8752a f33218e;

    /* JADX INFO: renamed from: f */
    public g0r f33219f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.KeyboardMediaLayout$a */
    public class C8752a extends cf60 {
        public C8752a() {
        }

        @Override // p153l.cf60
        public void destroyItem(@NonNull @NotNull ViewGroup viewGroup, int i, @NonNull @NotNull Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            int size = KeyboardMediaLayout.this.f33217d.size();
            return (size / KeyboardMediaLayout.this.f33219f.m128464b()) + (size % KeyboardMediaLayout.this.f33219f.m128464b() > 0 ? 1 : 0);
        }

        @Override // p153l.cf60
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            KeyboardMediaItemPageLayout keyboardMediaItemPageLayout = new KeyboardMediaItemPageLayout(KeyboardMediaLayout.this.getContext());
            keyboardMediaItemPageLayout.setRowSize(KeyboardMediaLayout.this.f33219f.m128465c());
            viewGroup.addView(keyboardMediaItemPageLayout);
            keyboardMediaItemPageLayout.m51049e(KeyboardMediaLayout.this.f33217d, i);
            return keyboardMediaItemPageLayout;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object obj) {
            return view == obj;
        }
    }

    public KeyboardMediaLayout(@NonNull Context context) {
        super(context);
        m51053d();
    }

    /* JADX INFO: renamed from: c */
    public final void m51052c(View view) {
        m0r.m156522a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m51053d() {
        this.f33217d = new ArrayList();
        this.f33218e = new C8752a();
    }

    /* JADX INFO: renamed from: e */
    public void m51054e(g0r g0rVar) {
        this.f33219f = g0rVar;
        this.f33217d.clear();
        this.f33217d.addAll(g0rVar.m128463a());
        this.f33215b.setAdapter(this.f33218e);
        this.f33218e.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51052c(this);
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            setBackgroundColor(-1);
            int i = qa00.f156322i;
            setPadding(i, qa00.f156319f, i, qa00.f156325l);
        }
    }

    public KeyboardMediaLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m51053d();
    }

    public KeyboardMediaLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m51053d();
    }
}
