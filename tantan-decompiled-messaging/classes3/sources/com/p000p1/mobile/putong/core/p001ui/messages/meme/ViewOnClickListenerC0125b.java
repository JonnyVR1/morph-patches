package com.p000p1.mobile.putong.core.p001ui.messages.meme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.StickerPackage;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.l6c0;
import l.o7r;
import l.qib0;
import l.t100;
import l.x1c0;
import l.xdl0;
import p003l.e30;
import p003l.eb2;
import p028v.VDraweeView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ViewOnClickListenerC0125b extends eb2 implements KeyboardPagerAdapterPage.InterfaceC0123b<String>, View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public int f1770e;

    /* JADX INFO: renamed from: f */
    public final StickerPackage f1771f;

    /* JADX INFO: renamed from: g */
    public final e30<Sticker> f1772g;

    public ViewOnClickListenerC0125b(StickerPackage stickerPackage, Activity activity, e30<Sticker> e30Var) {
        this.f1771f = stickerPackage;
        this.f1772g = e30Var;
        this.f1770e = activity.getResources().getDimensionPixelSize(x1c0.m);
        if (((Integer) Act.savedKeyboardHeight.get()).intValue() < ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) {
            this.f1770e /= 2;
        }
    }

    public int getCount() {
        return (int) Math.ceil(((double) this.f1771f.stickers.size()) / 8.0d);
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
        if (view.getTag() instanceof Sticker) {
            this.f1772g.call((Sticker) view.getTag());
        }
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo924p(ViewGroup viewGroup, int i) {
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m2371b(4, 2, this.f1770e, m2380r(i), this, false);
        ((ViewPager) viewGroup).addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC0123b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo2376i(String str, Context context) {
        SimpleDraweeView simpleDraweeView = (VDraweeView) o7r.a(context).inflate(l6c0.o5, (ViewGroup) null);
        Sticker stickerS3 = CoreModule.c.Z.s3(str);
        if (!NullChecker.a(stickerS3) || stickerS3.pictures.isEmpty()) {
            qib0.G.o(simpleDraweeView);
            return simpleDraweeView;
        }
        simpleDraweeView.setTag(stickerS3);
        xdl0.L(simpleDraweeView, this);
        if (TEnum.equals(stickerS3.source, "shanmeng")) {
            qib0.G.L0(simpleDraweeView, ((Media) ((Picture) stickerS3.pictures.get(0))).url);
            return simpleDraweeView;
        }
        qib0.G.B0(simpleDraweeView, m2381s((Picture) stickerS3.pictures.get(0)));
        return simpleDraweeView;
    }

    /* JADX INFO: renamed from: r */
    public final ArrayList<String> m2380r(int i) {
        int i2 = i * 8;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i3 = i2; i3 < i2 + 8 && i3 < this.f1771f.stickers.size(); i3++) {
            arrayList.add((String) this.f1771f.stickers.get(i3));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public Picture.ImageUri m2381s(Picture picture) {
        return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
    }
}
