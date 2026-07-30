package com.p051p1.mobile.putong.core.p058ui.messages.meme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.eac0;
import p153l.lb2;
import p153l.p9r;
import p153l.qa00;
import p153l.qec0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.b */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnClickListenerC8705b extends lb2 implements KeyboardPagerAdapterPage.InterfaceC8703b<String>, View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public int f32727e;

    /* JADX INFO: renamed from: f */
    public final StickerPackage f32728f;

    /* JADX INFO: renamed from: g */
    public final y20<Sticker> f32729g;

    public ViewOnClickListenerC8705b(StickerPackage stickerPackage, Activity activity, y20<Sticker> y20Var) {
        this.f32728f = stickerPackage;
        this.f32729g = y20Var;
        this.f32727e = activity.getResources().getDimensionPixelSize(eac0.f92765m);
        if (Act.savedKeyboardHeight.get().intValue() < ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) {
            this.f32727e /= 2;
        }
    }

    @Override // p153l.cf60
    public int getCount() {
        return (int) Math.ceil(((double) this.f32728f.stickers.size()) / 8.0d);
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
        if (view.getTag() instanceof Sticker) {
            this.f32729g.call((Sticker) view.getTag());
        }
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m50427b(4, 2, this.f32727e, m50436r(i), this, false);
        ((ViewPager) viewGroup).addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC8703b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo50432i(String str, Context context) {
        SimpleDraweeView simpleDraweeView = (VDraweeView) p9r.m171370a(context).inflate(qec0.f157091o5, (ViewGroup) null);
        Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(str);
        if (!NullChecker.m82486a(stickerM35930s3) || stickerM35930s3.pictures.isEmpty()) {
            uqb0.f180374G.m98798o(simpleDraweeView);
            return simpleDraweeView;
        }
        simpleDraweeView.setTag(stickerM35930s3);
        bnl0.m105522L(simpleDraweeView, this);
        if (TEnum.equals(stickerM35930s3.source, "shanmeng")) {
            uqb0.f180374G.m127115L0(simpleDraweeView, stickerM35930s3.pictures.get(0).url);
            return simpleDraweeView;
        }
        uqb0.f180374G.m127096B0(simpleDraweeView, m50437s(stickerM35930s3.pictures.get(0)));
        return simpleDraweeView;
    }

    /* JADX INFO: renamed from: r */
    public final ArrayList<String> m50436r(int i) {
        int i2 = i * 8;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i3 = i2; i3 < i2 + 8 && i3 < this.f32728f.stickers.size(); i3++) {
            arrayList.add(this.f32728f.stickers.get(i3));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public Picture.ImageUri m50437s(Picture picture) {
        return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
    }
}
