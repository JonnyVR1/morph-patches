package com.p046p1.mobile.putong.core.p053ui.messages.meme;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import java.util.List;
import p149l.e30;
import p149l.eb2;
import p149l.kye;
import p149l.l6c0;
import p149l.o7r;
import p149l.t100;
import p149l.x1c0;
import p149l.y4c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.a */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC8541a extends eb2 implements KeyboardPagerAdapterPage.InterfaceC8540b<kye.C18115a>, View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public static int f31875g = 6;

    /* JADX INFO: renamed from: h */
    public static int f31876h = (6 * 3) - 1;

    /* JADX INFO: renamed from: e */
    public final e30<String> f31877e;

    /* JADX INFO: renamed from: f */
    public ArrayList<kye.C18115a> f31878f;

    public ViewOnClickListenerC8541a(e30<String> e30Var, ArrayList<kye.C18115a> arrayList) {
        this.f31878f = arrayList;
        this.f31877e = e30Var;
        if (CoreModule.m29935P().m94658i().mo158266M()) {
            f31875g = 8;
            f31876h = (8 * 3) - 1;
        }
    }

    /* JADX INFO: renamed from: r */
    private List<kye.C18115a> m49250r(int i) {
        int i2 = f31876h;
        int i3 = i * i2;
        return this.f31878f.subList(i3, Math.min(i2 + i3, this.f31878f.size()));
    }

    @Override // p149l.w660
    public int getCount() {
        return (int) Math.ceil(((double) this.f31878f.size()) / ((double) f31876h));
    }

    @Override // p149l.w660
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        ((ViewPager) viewGroup).removeView((View) obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f31877e.call((String) view.getTag());
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        List<kye.C18115a> listM49250r = m49250r(i);
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m49244b(f31875g, 3, viewGroup.getContext().getResources().getDimensionPixelSize(x1c0.f189056k), listM49250r, this, true);
        ((ViewPager) viewGroup).addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC8540b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo49249i(kye.C18115a c18115a, Context context) {
        ImageView imageView = (ImageView) o7r.m163037a(context).inflate(l6c0.f126507k5, (ViewGroup) null);
        ImageView imageView2 = (ImageView) imageView.findViewById(y4c0.f195944C1);
        imageView2.setImageResource(c18115a.f125289d);
        if (CoreModule.m29935P().m94658i().mo158266M()) {
            int i = t100.f167255d;
            imageView2.setPadding(i, i, i, i);
        } else {
            int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(x1c0.f189057l);
            imageView2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        if (TextUtils.isEmpty(c18115a.f125286a)) {
            imageView2.setTag("[" + CoreModule.f17544b.getString(c18115a.f125287b) + Constants.AES_SUFFIX);
        } else {
            imageView2.setTag("[" + c18115a.f125286a + Constants.AES_SUFFIX);
        }
        imageView2.setOnClickListener(this);
        return imageView;
    }
}
