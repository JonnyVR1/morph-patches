package com.p051p1.mobile.putong.core.p058ui.messages.meme;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import p153l.eac0;
import p153l.edc0;
import p153l.lb2;
import p153l.oze;
import p153l.p9r;
import p153l.qa00;
import p153l.qec0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.a */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC8704a extends lb2 implements KeyboardPagerAdapterPage.InterfaceC8703b<oze.C19253a>, View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public static int f32723g = 6;

    /* JADX INFO: renamed from: h */
    public static int f32724h = (6 * 3) - 1;

    /* JADX INFO: renamed from: e */
    public final y20<String> f32725e;

    /* JADX INFO: renamed from: f */
    public ArrayList<oze.C19253a> f32726f;

    public ViewOnClickListenerC8704a(y20<String> y20Var, ArrayList<oze.C19253a> arrayList) {
        this.f32726f = arrayList;
        this.f32725e = y20Var;
        if (CoreModule.m30933P().m143412i().mo180358M()) {
            f32723g = 8;
            f32724h = (8 * 3) - 1;
        }
    }

    /* JADX INFO: renamed from: r */
    private List<oze.C19253a> m50433r(int i) {
        int i2 = f32724h;
        int i3 = i * i2;
        return this.f32726f.subList(i3, Math.min(i2 + i3, this.f32726f.size()));
    }

    @Override // p153l.cf60
    public int getCount() {
        return (int) Math.ceil(((double) this.f32726f.size()) / ((double) f32724h));
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        ((ViewPager) viewGroup).removeView((View) obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f32725e.call((String) view.getTag());
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        List<oze.C19253a> listM50433r = m50433r(i);
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m50427b(f32723g, 3, viewGroup.getContext().getResources().getDimensionPixelSize(eac0.f92763k), listM50433r, this, true);
        ((ViewPager) viewGroup).addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC8703b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo50432i(oze.C19253a c19253a, Context context) {
        ImageView imageView = (ImageView) p9r.m171370a(context).inflate(qec0.f157063k5, (ViewGroup) null);
        ImageView imageView2 = (ImageView) imageView.findViewById(edc0.f93179C1);
        imageView2.setImageResource(c19253a.f149876d);
        if (CoreModule.m30933P().m143412i().mo180358M()) {
            int i = qa00.f156317d;
            imageView2.setPadding(i, i, i, i);
        } else {
            int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(eac0.f92764l);
            imageView2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        if (TextUtils.isEmpty(c19253a.f149873a)) {
            imageView2.setTag("[" + CoreModule.f18263b.getString(c19253a.f149874b) + Constants.AES_SUFFIX);
        } else {
            imageView2.setTag("[" + c19253a.f149873a + Constants.AES_SUFFIX);
        }
        imageView2.setOnClickListener(this);
        return imageView;
    }
}
