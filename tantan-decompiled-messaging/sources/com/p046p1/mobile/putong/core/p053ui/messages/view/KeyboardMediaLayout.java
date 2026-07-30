package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VPagerCircleIndicator;
import p149l.gyq;
import p149l.hyq;
import p149l.myq;
import p149l.t100;
import p149l.w660;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardMediaLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public KeyboardMediaLayout f32366a;

    /* JADX INFO: renamed from: b */
    public ViewPager f32367b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f32368c;

    /* JADX INFO: renamed from: d */
    public List<hyq> f32369d;

    /* JADX INFO: renamed from: e */
    public C8589a f32370e;

    /* JADX INFO: renamed from: f */
    public gyq f32371f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.KeyboardMediaLayout$a */
    public class C8589a extends w660 {
        public C8589a() {
        }

        @Override // p149l.w660
        public void destroyItem(@NonNull @NotNull ViewGroup viewGroup, int i, @NonNull @NotNull Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            int size = KeyboardMediaLayout.this.f32369d.size();
            return (size / KeyboardMediaLayout.this.f32371f.m128727b()) + (size % KeyboardMediaLayout.this.f32371f.m128727b() > 0 ? 1 : 0);
        }

        @Override // p149l.w660
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            KeyboardMediaItemPageLayout keyboardMediaItemPageLayout = new KeyboardMediaItemPageLayout(KeyboardMediaLayout.this.getContext());
            keyboardMediaItemPageLayout.setRowSize(KeyboardMediaLayout.this.f32371f.m128728c());
            viewGroup.addView(keyboardMediaItemPageLayout);
            keyboardMediaItemPageLayout.m49866e(KeyboardMediaLayout.this.f32369d, i);
            return keyboardMediaItemPageLayout;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull @NotNull View view, @NonNull @NotNull Object obj) {
            return view == obj;
        }
    }

    public KeyboardMediaLayout(@NonNull Context context) {
        super(context);
        m49870d();
    }

    /* JADX INFO: renamed from: c */
    public final void m49869c(View view) {
        myq.m157090a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m49870d() {
        this.f32369d = new ArrayList();
        this.f32370e = new C8589a();
    }

    /* JADX INFO: renamed from: e */
    public void m49871e(gyq gyqVar) {
        this.f32371f = gyqVar;
        this.f32369d.clear();
        this.f32369d.addAll(gyqVar.m128726a());
        this.f32367b.setAdapter(this.f32370e);
        this.f32370e.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49869c(this);
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            setBackgroundColor(-1);
            int i = t100.f167260i;
            setPadding(i, t100.f167257f, i, t100.f167263l);
        }
    }

    public KeyboardMediaLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m49870d();
    }

    public KeyboardMediaLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49870d();
    }
}
