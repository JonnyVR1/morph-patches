package com.p046p1.mobile.putong.core.p053ui.messages.meme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p149l.e30;
import p149l.eb2;
import p149l.l6c0;
import p149l.o7r;
import p149l.qib0;
import p149l.t100;
import p149l.x1c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.b */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC8542b extends eb2 implements KeyboardPagerAdapterPage.InterfaceC8540b<String>, View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public int f31879e;

    /* JADX INFO: renamed from: f */
    public final StickerPackage f31880f;

    /* JADX INFO: renamed from: g */
    public final e30<Sticker> f31881g;

    public ViewOnClickListenerC8542b(StickerPackage stickerPackage, Activity activity, e30<Sticker> e30Var) {
        this.f31880f = stickerPackage;
        this.f31881g = e30Var;
        this.f31879e = activity.getResources().getDimensionPixelSize(x1c0.f189058m);
        if (Act.savedKeyboardHeight.get().intValue() < ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) {
            this.f31879e /= 2;
        }
    }

    @Override // p149l.w660
    public int getCount() {
        return (int) Math.ceil(((double) this.f31880f.stickers.size()) / 8.0d);
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
        if (view.getTag() instanceof Sticker) {
            this.f31881g.call((Sticker) view.getTag());
        }
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m49244b(4, 2, this.f31879e, m49253r(i), this, false);
        ((ViewPager) viewGroup).addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC8540b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo49249i(String str, Context context) {
        SimpleDraweeView simpleDraweeView = (VDraweeView) o7r.m163037a(context).inflate(l6c0.f126535o5, (ViewGroup) null);
        Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(str);
        if (!NullChecker.m81303a(stickerM34927s3) || stickerM34927s3.pictures.isEmpty()) {
            qib0.f154691G.m184725o(simpleDraweeView);
            return simpleDraweeView;
        }
        simpleDraweeView.setTag(stickerM34927s3);
        xdl0.m208342L(simpleDraweeView, this);
        if (TEnum.equals(stickerM34927s3.source, "shanmeng")) {
            qib0.f154691G.m102331L0(simpleDraweeView, stickerM34927s3.pictures.get(0).url);
            return simpleDraweeView;
        }
        qib0.f154691G.m102312B0(simpleDraweeView, m49254s(stickerM34927s3.pictures.get(0)));
        return simpleDraweeView;
    }

    /* JADX INFO: renamed from: r */
    public final ArrayList<String> m49253r(int i) {
        int i2 = i * 8;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i3 = i2; i3 < i2 + 8 && i3 < this.f31880f.stickers.size(); i3++) {
            arrayList.add(this.f31880f.stickers.get(i3));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public Picture.ImageUri m49254s(Picture picture) {
        return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
    }
}
