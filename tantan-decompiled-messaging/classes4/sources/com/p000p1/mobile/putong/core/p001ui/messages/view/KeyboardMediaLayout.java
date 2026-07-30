package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import l.gyq;
import l.hyq;
import l.myq;
import l.t100;
import l.w660;
import org.jetbrains.annotations.NotNull;
import v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class KeyboardMediaLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public KeyboardMediaLayout f188a;

    /* JADX INFO: renamed from: b */
    public ViewPager f189b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f190c;

    /* JADX INFO: renamed from: d */
    public List<hyq> f191d;

    /* JADX INFO: renamed from: e */
    public C0014a f192e;

    /* JADX INFO: renamed from: f */
    public gyq f193f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.KeyboardMediaLayout$a */
    public class C0014a extends w660 {
        public C0014a() {
        }

        public void destroyItem(@NonNull @NotNull ViewGroup viewGroup, int i, @NonNull @NotNull Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            int size = KeyboardMediaLayout.this.f191d.size();
            return (size / KeyboardMediaLayout.this.f193f.b()) + (size % KeyboardMediaLayout.this.f193f.b() > 0 ? 1 : 0);
        }

        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            KeyboardMediaItemPageLayout keyboardMediaItemPageLayout = new KeyboardMediaItemPageLayout(KeyboardMediaLayout.this.getContext());
            keyboardMediaItemPageLayout.setRowSize(KeyboardMediaLayout.this.f193f.c());
            viewGroup.addView(keyboardMediaItemPageLayout);
            keyboardMediaItemPageLayout.m288e(KeyboardMediaLayout.this.f191d, i);
            return keyboardMediaItemPageLayout;
        }

        public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object obj) {
            return view == obj;
        }
    }

    public KeyboardMediaLayout(@NonNull Context context) {
        super(context);
        m292d();
    }

    /* JADX INFO: renamed from: c */
    public final void m291c(View view) {
        myq.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m292d() {
        this.f191d = new ArrayList();
        this.f192e = new C0014a();
    }

    /* JADX INFO: renamed from: e */
    public void m293e(gyq gyqVar) {
        this.f193f = gyqVar;
        this.f191d.clear();
        this.f191d.addAll(gyqVar.a());
        this.f189b.setAdapter(this.f192e);
        this.f192e.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m291c(this);
        if (CoreModule.P().i().G1()) {
            setBackgroundColor(-1);
            int i = t100.i;
            setPadding(i, t100.f, i, t100.l);
        }
    }

    public KeyboardMediaLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m292d();
    }

    public KeyboardMediaLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m292d();
    }
}
