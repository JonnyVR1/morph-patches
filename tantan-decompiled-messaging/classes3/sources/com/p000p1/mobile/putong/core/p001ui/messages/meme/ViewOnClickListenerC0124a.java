package com.p000p1.mobile.putong.core.p001ui.messages.meme;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import l.l6c0;
import l.o7r;
import l.t100;
import l.x1c0;
import l.y4c0;
import p003l.e30;
import p003l.eb2;
import p003l.kye;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ViewOnClickListenerC0124a extends eb2 implements KeyboardPagerAdapterPage.InterfaceC0123b<kye.C0395a>, View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public static int f1766g = 6;

    /* JADX INFO: renamed from: h */
    public static int f1767h = (6 * 3) - 1;

    /* JADX INFO: renamed from: e */
    public final e30<String> f1768e;

    /* JADX INFO: renamed from: f */
    public ArrayList<kye.C0395a> f1769f;

    public ViewOnClickListenerC0124a(e30<String> e30Var, ArrayList<kye.C0395a> arrayList) {
        this.f1769f = arrayList;
        this.f1768e = e30Var;
        if (CoreModule.P().i().M()) {
            f1766g = 8;
            f1767h = (8 * 3) - 1;
        }
    }

    /* JADX INFO: renamed from: r */
    private List<kye.C0395a> m2377r(int i) {
        int i2 = f1767h;
        int i3 = i * i2;
        return this.f1769f.subList(i3, Math.min(i2 + i3, this.f1769f.size()));
    }

    public int getCount() {
        return (int) Math.ceil(((double) this.f1769f.size()) / ((double) f1767h));
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: o */
    public void mo923o(ViewGroup viewGroup, int i, Object obj) {
        ((ViewPager) viewGroup).removeView((View) obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f1768e.call((String) view.getTag());
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo924p(ViewGroup viewGroup, int i) {
        List<kye.C0395a> listM2377r = m2377r(i);
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m2371b(f1766g, 3, viewGroup.getContext().getResources().getDimensionPixelSize(x1c0.k), listM2377r, this, true);
        ((ViewPager) viewGroup).addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC0123b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo2376i(kye.C0395a c0395a, Context context) {
        ImageView imageView = (ImageView) o7r.a(context).inflate(l6c0.k5, (ViewGroup) null);
        ImageView imageView2 = (ImageView) imageView.findViewById(y4c0.C1);
        imageView2.setImageResource(c0395a.f5137d);
        if (CoreModule.P().i().M()) {
            int i = t100.d;
            imageView2.setPadding(i, i, i, i);
        } else {
            int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(x1c0.l);
            imageView2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        if (TextUtils.isEmpty(c0395a.f5134a)) {
            imageView2.setTag("[" + CoreModule.b.getString(c0395a.f5135b) + "]");
        } else {
            imageView2.setTag("[" + c0395a.f5134a + "]");
        }
        imageView2.setOnClickListener(this);
        return imageView;
    }
}
